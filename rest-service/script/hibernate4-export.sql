    drop table CONTACTO cascade constraints;

    drop table PROVEEDOR cascade constraints;

    drop table PROVEEDOR_CONTACTO cascade constraints;

    drop table PROYECTO cascade constraints;

    drop sequence SEC_CONTACTO;

    drop sequence SEC_PROVEEDOR;

    drop sequence SEC_PROVEEDOR_CONTACTO;

    drop sequence SEC_PROYECTO;

    create table CONTACTO (
        ID_CONTACTO number(10,0) not null,
        CARGO varchar2(255 char),
        NOMBRE varchar2(255 char),
        TELEFONO varchar2(255 char),
        primary key (ID_CONTACTO)
    );

    create table PROVEEDOR (
        ID_PROVEEDOR number(10,0) not null,
        NOMBRE varchar2(255 char),
        TELEFONO varchar2(255 char),
        primary key (ID_PROVEEDOR)
    );

    create table PROVEEDOR_CONTACTO (
        ID_PROVEEDOR_CONTACTO number(10,0) not null,
        ALIAS varchar2(255 char),
        id number(10,0),
        primary key (ID_PROVEEDOR_CONTACTO)
    );

    create table PROYECTO (
        ID_PROYECTO number(10,0) not null,
        DESCRIPCION varchar2(255 char),
        NOMBRE varchar2(255 char),
        TIPO varchar2(255 char),
        id number(10,0),
        primary key (ID_PROYECTO)
    );

    alter table PROVEEDOR_CONTACTO 
        add constraint FK8952DCB01C7AA3D2 
        foreign key (id) 
        references CONTACTO;

    alter table PROVEEDOR_CONTACTO 
        add constraint FK8952DCB06A7E6E91 
        foreign key (id) 
        references PROVEEDOR;

    alter table PROVEEDOR_CONTACTO 
        add constraint FK8952DCB0AC8A6CEB 
        foreign key (ID_PROVEEDOR_CONTACTO) 
        references CONTACTO;

    alter table PROYECTO 
        add constraint FKF3F269056A7E6E91 
        foreign key (id) 
        references PROVEEDOR;

    create sequence SEC_CONTACTO;

    create sequence SEC_PROVEEDOR;

    create sequence SEC_PROVEEDOR_CONTACTO;

    create sequence SEC_PROYECTO;