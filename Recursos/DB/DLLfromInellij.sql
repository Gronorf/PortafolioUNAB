create table medico
(
    idMedico              int auto_increment
        primary key,
    rutMedico             int         not null,
    nombreMedico          varchar(50) null,
    apellidoPaternoMedico varchar(50) null,
    apellidoMaternoMedico varchar(50) null,
    constraint idMedico_UNIQUE
        unique (idMedico),
    constraint rutMedico_UNIQUE
        unique (rutMedico)
);

create table paciente
(
    idPaciente              int auto_increment
        primary key,
    rutPaciente             int                                not null,
    fichaClinica            int                                not null,
    nombrePaciente          varchar(50)                        not null,
    apellidoPaternoPaciente varchar(50)                        null,
    apellidoMaternoPaciente varchar(50)                        null,
    ingresoPaciente         datetime default CURRENT_TIMESTAMP null,
    constraint fechaClinica_UNIQUE
        unique (fichaClinica),
    constraint idPaciente_UNIQUE
        unique (idPaciente),
    constraint rutPaciente_UNIQUE
        unique (rutPaciente)
);

create table control
(
    idControl             int          not null
        primary key,
    fechaControl          date         not null,
    obsControl            varchar(250) not null,
    fechaSiguienteControl date         null,
    medico_idMedico       int          not null,
    paciente_idPaciente   int          not null,
    constraint idControl_UNIQUE
        unique (idControl),
    constraint fk_control_medico
        foreign key (medico_idMedico) references medico (idMedico),
    constraint fk_control_paciente1
        foreign key (paciente_idPaciente) references paciente (idPaciente)
);

create index fk_control_medico_idx
    on control (medico_idMedico);

create index fk_control_paciente1_idx
    on control (paciente_idPaciente);

create table rol
(
    idRol      int auto_increment
        primary key,
    nombreRol  varchar(250) not null,
    id_rol     int          not null,
    nombre_rol varchar(255) null,
    constraint idRol_UNIQUE
        unique (idRol)
);

create table usuario
(
    idusuario     int auto_increment
        primary key,
    nombreUsuario varchar(50)  not null,
    emailUsuario  varchar(250) not null,
    claveUsuario  varchar(50)  not null,
    rolUsuario    varchar(50)  not null,
    constraint idusuario_UNIQUE
        unique (idusuario)
);

create table usuario_rol
(
    usuario_idusuario int not null,
    rol_idRol         int not null,
    constraint fk_usuario_rol_rol1
        foreign key (rol_idRol) references rol (idRol),
    constraint fk_usuario_rol_usuario1
        foreign key (usuario_idusuario) references usuario (idusuario)
);

create index fk_usuario_rol_rol1_idx
    on usuario_rol (rol_idRol);

create index fk_usuario_rol_usuario1_idx
    on usuario_rol (usuario_idusuario);

