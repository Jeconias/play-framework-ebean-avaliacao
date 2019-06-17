# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ala_hospital (
  codigo                        bigint auto_increment not null,
  constraint pk_ala_hospital primary key (codigo)
);

create table atende (
  codigo                        bigint auto_increment not null,
  data_hora                     timestamp,
  medico_codigo                 bigint,
  paciente_codigo               bigint,
  constraint pk_atende primary key (codigo)
);

create table enfermeira (
  codigo                        bigint auto_increment not null,
  nome                          varchar(50),
  cre                           varchar(50),
  ala_hospital_codigo           bigint,
  enfermeira_chefe_codigo       bigint,
  constraint uq_enfermeira_ala_hospital_codigo unique (ala_hospital_codigo),
  constraint pk_enfermeira primary key (codigo)
);

create table hospital (
  codigo                        bigint auto_increment not null,
  nome                          varchar(50),
  constraint pk_hospital primary key (codigo)
);

create table medico (
  codigo                        bigint auto_increment not null,
  nome                          varchar(50),
  especialidade                 varchar(35),
  crm                           varchar(15),
  constraint pk_medico primary key (codigo)
);

create table paciente (
  codigo                        bigint auto_increment not null,
  nome                          varchar(50),
  cpf                           varchar(50),
  planosaude_codigo             bigint,
  constraint uq_paciente_planosaude_codigo unique (planosaude_codigo),
  constraint pk_paciente primary key (codigo)
);

create table plano_saude (
  codigo                        bigint auto_increment not null,
  nome                          varchar(50),
  fone                          varchar(15),
  hospital_codigo               bigint,
  constraint pk_plano_saude primary key (codigo)
);

create index ix_atende_medico_codigo on atende (medico_codigo);
alter table atende add constraint fk_atende_medico_codigo foreign key (medico_codigo) references medico (codigo) on delete restrict on update restrict;

create index ix_atende_paciente_codigo on atende (paciente_codigo);
alter table atende add constraint fk_atende_paciente_codigo foreign key (paciente_codigo) references paciente (codigo) on delete restrict on update restrict;

alter table enfermeira add constraint fk_enfermeira_ala_hospital_codigo foreign key (ala_hospital_codigo) references ala_hospital (codigo) on delete restrict on update restrict;

create index ix_enfermeira_enfermeira_chefe_codigo on enfermeira (enfermeira_chefe_codigo);
alter table enfermeira add constraint fk_enfermeira_enfermeira_chefe_codigo foreign key (enfermeira_chefe_codigo) references enfermeira (codigo) on delete restrict on update restrict;

alter table paciente add constraint fk_paciente_planosaude_codigo foreign key (planosaude_codigo) references plano_saude (codigo) on delete restrict on update restrict;

create index ix_plano_saude_hospital_codigo on plano_saude (hospital_codigo);
alter table plano_saude add constraint fk_plano_saude_hospital_codigo foreign key (hospital_codigo) references hospital (codigo) on delete restrict on update restrict;


# --- !Downs

alter table atende drop constraint if exists fk_atende_medico_codigo;
drop index if exists ix_atende_medico_codigo;

alter table atende drop constraint if exists fk_atende_paciente_codigo;
drop index if exists ix_atende_paciente_codigo;

alter table enfermeira drop constraint if exists fk_enfermeira_ala_hospital_codigo;

alter table enfermeira drop constraint if exists fk_enfermeira_enfermeira_chefe_codigo;
drop index if exists ix_enfermeira_enfermeira_chefe_codigo;

alter table paciente drop constraint if exists fk_paciente_planosaude_codigo;

alter table plano_saude drop constraint if exists fk_plano_saude_hospital_codigo;
drop index if exists ix_plano_saude_hospital_codigo;

drop table if exists ala_hospital;

drop table if exists atende;

drop table if exists enfermeira;

drop table if exists hospital;

drop table if exists medico;

drop table if exists paciente;

drop table if exists plano_saude;

