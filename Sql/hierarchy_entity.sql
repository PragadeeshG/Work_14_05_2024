create table if not exists hierarchy_entity(
hierarchy_key Integer not null,
normalized_indicator Integer null,
effective_date varchar(255) null,
name_of_normalization varchar(255) null,
atomic_id varchar(255) null,
global_id varchar(255) null,
risk_type varchar(255) null,
risk_elements varchar(255) null,
entity_state varchar(255) null,
modified_date varchar(255) null,
remarks varchar(255) null,
constraint hierarchy_entity_pk primary key(hierarchy_key));