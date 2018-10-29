# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table booking (
  code_number                   varchar(255) not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  status                        varchar(255),
  booking_date                  datetime(6),
  benefits                      varchar(255),
  constraint pk_booking primary key (code_number)
);

create table company (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_company primary key (id)
);

create table computer (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  introduced                    datetime(6),
  discontinued                  datetime(6),
  company_id                    bigint,
  constraint pk_computer primary key (id)
);

create table employee (
  employee_id                   integer auto_increment not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  position                      varchar(255),
  sex                           varchar(255),
  birthday                      datetime(6),
  phone_number                  integer not null,
  saraly                        integer not null,
  department                    varchar(255),
  address                       varchar(255),
  working_day                   datetime(6),
  constraint pk_employee primary key (employee_id)
);

create table medical_records (
  hn_code                       varchar(255) not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  id_card                       integer not null,
  address                       varchar(255),
  treatment_history             varchar(255),
  birthday                      datetime(6),
  phone_number                  integer not null,
  sex                           varchar(255),
  blood_type                    varchar(255),
  status                        varchar(255),
  career                        varchar(255),
  race                          varchar(255),
  religion                      varchar(255),
  constraint pk_medical_records primary key (hn_code)
);

create table room (
  room_number                   varchar(255) not null,
  room_status                   varchar(255),
  type_room                     varchar(255),
  room_equipment                varchar(255),
  price                         integer not null,
  constraint pk_room primary key (room_number)
);

alter table computer add constraint fk_computer_company_id foreign key (company_id) references company (id) on delete restrict on update restrict;
create index ix_computer_company_id on computer (company_id);


# --- !Downs

alter table computer drop foreign key fk_computer_company_id;
drop index ix_computer_company_id on computer;

drop table if exists booking;

drop table if exists company;

drop table if exists computer;

drop table if exists employee;

drop table if exists medical_records;

drop table if exists room;

