CREATE DATABASE banco;
USE banco;

CREATE TABLE Clientes (
	id_cliente int primary key auto_increment,
	nombres varchar(50) not null,
	apellido_paterno varchar(50) not null,
	apellido_materno varchar(50) null,
	fecha_nacimiento date,
	edad int not null default (TIMESTAMPDIFF(YEAR, fecha_nacimiento, CURDATE())),
    calle varchar(50),
    colonia varchar(50),
    numero varchar(50)
); 

CREATE TABLE Cuentas (
	id_cuenta int primary key auto_increment,
	fecha_apertura date default (date(now())), 
	saldo decimal(10,2) not null,
	id_cliente int not null,
	FOREIGN KEY(id_cliente) references clientes(id_cliente)
 );

CREATE TABLE Transferencias (
	id_transferencia int primary key auto_increment,
	fecha_hora_transferencia datetime default current_timestamp,
	cantidad decimal(10,2) not null,
	id_cuenta_origen int not null,
	id_cuenta_destino int not null,
    FOREIGN KEY(id_cuenta_origen) references cuentas(id_cuenta),
    FOREIGN KEY(id_cuenta_destino) references cuentas(id_cuenta)
);

CREATE TABLE Retiros (
	id_retiro int primary key auto_increment,
	fecha_hora_transaccion datetime default current_timestamp,
	cantidad decimal(10,2) not null,
    id_cuenta int not null,
    folio varchar(8),
    contrasenia int(8),
	FOREIGN KEY(id_cuenta) references cuentas(id_cuenta)
);

select * from clientes;

insert into Clientes (nombres,apellido_paterno,apellido_materno,fecha_nacimiento,calle,colonia,numero) 
values ('Manuel Francisco','Flores','Velazquez','2003-02-16','Aguamarina','Valle Verde','1927');

insert into Clientes (nombres,apellido_paterno,apellido_materno,fecha_nacimiento,calle,colonia,numero) 
values ('Aracely','Campa','Quintana','2003-07-10','Posi','Haciendas','777');

select * from clientes;

insert into Cuentas (saldo,id_cliente) values (5000,1);
insert into Cuentas (saldo,id_cliente) values (3000,2);

select * from Cuentas;

-- Trigger para transferencias
DELIMITER //
start transaction;
	create trigger transferir
	after insert on transferencias
	for each row
	begin
		update Cuentas 
		set 
			saldo = saldo - (select cantidad from transferencias where id_transferencia=new.id_transferencia) 
		where id_cuenta = new.id_cuenta_origen;
        
		update Cuentas 
		set 
			saldo = saldo + (select cantidad from transferencias where id_transferencia=new.id_transferencia) 
		where id_cuenta = new.id_cuenta_destino;
	end;
commit;
rollback; //
DELIMITER ;


-- Stored procedure para insertar cliente
DELIMITER //
create procedure inserta_cliente(
	IN nombresPar varchar(50),
    IN apellido_paternoPar varchar(50),
    IN apellido_maternoPar varchar(50),
    IN fecha_nacimientoPar date,
    IN callePar varchar(50),
    IN coloniaPar varchar(50),
    IN numeroPar varchar(50)
)
begin
    insert into clientes(nombres, apellido_paterno, apellido_materno, fecha_nacimiento, calle, colonia, numero) 
    values (nombresPar, apellido_paternoPar, apellido_maternoPar, fecha_nacimientoPar, callePar, coloniaPar, numeroPar);
end // 
DELIMITER ;

-- Trigger para retiros sin cuenta
DELIMITER //
start transaction;
	create trigger retirar
	after insert on retiros
	for each row
	begin
		update Cuentas 
		set 
			saldo = saldo - (select cantidad from retiros where id_retiro=new.id_retiro) 
		where id_cuenta = new.id_cuenta;
	end;
commit;
rollback; //
DELIMITER ;

-- Stored procedure para actualizar datos del cliente
DELIMITER //
create procedure actualiza_cliente(
	IN id_clientePar int,
	IN nombresPar varchar(50),
    IN apellido_paternoPar varchar(50),
    IN apellido_maternoPar varchar(50),
    IN fecha_nacimientoPar date,
    IN edadPar int,
    IN callePar varchar(50),
    IN coloniaPar varchar(50),
    IN numeroPar varchar(50)
)
begin
    update Clientes
    set 
		nombres = nombresPar, 
		apellido_paterno = apellido_paternoPar, 
        apellido_materno = apellido_maternoPar,
        fecha_nacimiento = fecha_nacimientoPar,
        edad = edadPar,
        calle = callePar,
        colonia = coloniaPar,
        numero = numeroPar
    where id_cliente = id_clientePar;
end // 
DELIMITER ;

call inserta_cliente('Perry','Orni','Torrinco','2010-10-10','calle','colonia','numero');
call actualiza_cliente (4, 'Nane', 'Flo', 'Vel', '2010-01-01',13,'calle1','col1','num1');

insert into transferencias (cantidad, id_cuenta_origen, id_cuenta_destino) values (400, 1, 2);

select * from transferencias;

