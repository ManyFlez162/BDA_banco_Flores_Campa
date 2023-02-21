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

insert into Clientes (nombres,apellido_paterno,apellido_materno,fecha_nacimiento,calle,colonia,numero) 
values ('Manuel Francisco','Flores','Velazquez','2003-02-16','Aguamarina','Valle Verde','1927');

insert into Clientes (nombres,apellido_paterno,apellido_materno,fecha_nacimiento,calle,colonia,numero) 
values ('Aracely','Campa','Quintana','2003-07-10','Posi','Haciendas','777');

select * from clientes;

insert into Cuentas (saldo,id_cliente) values (5000,1);
insert into Cuentas (saldo,id_cliente) values (3000,2);

select * from Cuentas;

DELIMITER //
create trigger transferir
after insert on transferencias
for each row
begin
	update Cuentas 
    set saldo = saldo - (select cantidad from transferencias where id_transferencia=new.id_transferencia) 
    where id_cuenta = new.id_cuenta_origen;
    update Cuentas 
    set saldo = saldo + (select cantidad from transferencias where id_transferencia=new.id_transferencia) 
    where id_cuenta = new.id_cuenta_destino;
end// DELIMITER ;


insert into transferencias (cantidad, id_cuenta_origen, id_cuenta_destino) values (400, 1, 2);

select * from transferencias;
