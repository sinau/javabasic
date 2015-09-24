create database belajarjdbc;

use belajarjdbc;

create table mahasiswa (
	nim varchar(20) not null primary key,
    nama varchar(50) not null,
    alamat varchar(100),
    telp varchar(20)
);

insert into mahasiswa values('12309001','Budi','Cibitung','0812145789');
insert into mahasiswa values('12309002','Joni','Tangerang','0813148689');
insert into mahasiswa values('12309003','Johan','Bekasi','081213467');
insert into mahasiswa values('12309004','David','Ciledug','0812148373');
insert into mahasiswa values('12309005','Darto','Cirebon','0814578789');
insert into mahasiswa values('12309006','Dani','Serang','0813456789');
insert into mahasiswa values('12309007','Dodi','Cibinong','0876455789');
insert into mahasiswa values('12309008','Eni','Cicalengka','081875789');

select * from mahasiswa where alamat like 'ci%';

update mahasiswa set nama='Dandi' where nim='12309006';

delete from mahasiswa where nim = '12309009';
