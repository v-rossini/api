insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua mto louca', '36985214', 'belo horizonte', '05874122856', 'pampulha','email@hotmiau.com', 'marcos vinicius ribeiro', '196', 'a1a2a3qwe', '32155754', 'mg');

insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua das esmeraldas', '36962251', 'são joão del rey', '15023394727', 'centro','email@gmail.com', 'lais botelho', '420', 'senhamosegura', '32311410', 'mg');


insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua das cachoeiras', '47147121', 'big field', '22036744851', 'centro','3m41l@bol.com', 'leticia tavares', '420', 'soumtodoida', '984576985', 'rj');


insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua das eras', '25416898', 'conselheiro lafaiete', '54987455632', 'hortencias','eitaquesaco@gmail.com', 'marco aurelio vilhena', '870', 'manokkk', '32416854', 'mg');

insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua da luz interior', '28745628', 'rio de janeiro', '59856320145', 'bairro aleatorio','alguemmesalve@gmail.com', 'vinicius de paula', '8550', 'naguentomais', '35427845', 'rj');


insert into tb_donator (user_id) values (1);
insert into tb_donator (user_id) values (2);
insert into tb_donator (user_id) values (3);
insert into tb_donator (user_id) values (4);
insert into tb_donator (user_id) values (5); 


insert into tb_parent (user_id) values (4);
insert into tb_parent (user_id) values (5);


insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('av. presidente costa e silva', 'belo horizonte', 'escola@hotmail.com', 'escola municipal afonso pena', '3245785684', 'mg', '0');

insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('av. rio branco', 'sao joao del rey', 'escola@gmail.com', 'escola estadual juscelino kubitchek', '32145784', 'mg', '1');

insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('rua das garças', 'rio de janeiro', '35c014a@hotmail.com', 'colegio militar federal', '32541268', 'rj', '2');

insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('av. itamar franco', 'juiz de fora', '35c014@gmail.com', 'instituição degraus d eensino', '325687484', 'mg', '3');



insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (12, 'leticia tavares', 1, 1);  

insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (10, 'marcelo felício', 1, 1);

insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (10, 'raissa garcia', 2, 3);

insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (7, 'bruno fernandes', 2, 2);


insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', '', 2.0, 'Lapis');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', '', 8.0, 'Caderno');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (1, '', '', 22.0, 'Livro de Fisica');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (2, 'Autor: Dostoievsky', '', 15.0, 'O idiota');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (3, '', '', 40.0, 'Bola de treino');

insert into tb_order (school_id) values (1);
insert into tb_order (school_id) values (2);
insert into tb_order (student_id) values (1);
insert into tb_order (student_id) values (2);
insert into tb_order (student_id) values (3);

insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values (true, 30, 30, 1, 1);

insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values  (false, '10', '3', '2', '2');

insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values (false, '5', '0', '5', '2');

insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values (false, '1', '0', '3', '3');

insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values (false, '1', '0', '4', '4');

insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values (false, '2', '0', '2', '5');


insert into tb_donation (QUANTITY, DONATOR_ID, ITEM_ORDER_ID) values (30, 1, 1);
insert into tb_donation (QUANTITY, DONATOR_ID, ITEM_ORDER_ID) values (3, 2, 2);