

create table lojas (loj_id serial,
					  loj_name varchar(40) not null,
					  loj_loc_id int, 
					  primary key (loj_id));
		           
create table locais (loc_id serial,
					  loc_name varchar(40) not null,
					  loc_local point not null, 
					  primary key (loc_id));


				   
-- Foreign Keys

alter table lojas add constraint lojas_fk_locais
            foreign key (loj_loc_id) references locais(loc_id) 
			ON DELETE NO ACTION ON UPDATE NO ACTION;
			
			
   
-- Inserts

insert into locais (loc_name, loc_local) values('Campus IADE',Point(38.707376, -9.152433));
insert into locais (loc_name, loc_local) values('Campus LISPOLIS ',Point(38.76510967886296, -9.183523888005144));
insert into locais (loc_name, loc_local) values('Campus QBN',Point(38.76032217024187, -9.193538077714317));





