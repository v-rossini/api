insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua adhemar jesus', '36985214', 'belo horizonte', '05874122856', 'pampulha','email@hotmiau.com', 'marcos vinicius ribeiro', '196', 'a1a2a3qwe', '32155754', 'mg');
insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua das esmeraldas', '36962251', 'são joão del rey', '15023394727', 'centro','email@gmail.com', 'lais botelho', '420', 'senhamosegura', '32311410', 'mg');
insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua das cachoeiras', '47147121', 'big field', '22036744851', 'centro','3m41l@bol.com', 'leticia tavares', '420', 'soumtodoida', '984576985', 'rj');
insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua das eras', '25416898', 'conselheiro lafaiete', '54987455632', 'hortencias','eitaquesaco@gmail.com', 'marco aurelio vilhena', '870', 'manokkk', '32416854', 'mg');
insert into tb_user ( address , cep , city , cpf , district , email , name , number , password , phone , state ) values ('rua da luz interior', '5984845', 'rio de janeiro', '59856320145', 'bairro aleatorio','alguemmesalve@gmail.com', 'vinicius de paula', '8550', 'naguentomais', '35427845', 'rj');


insert into tb_donator (user_id) values (1);
insert into tb_donator (user_id) values (2);
insert into tb_donator (user_id) values (3);
insert into tb_donator (user_id) values (4);
insert into tb_donator (user_id) values (5); 


insert into tb_parent (user_id) values (4);
insert into tb_parent (user_id) values (5);


insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('av. presidente costa e silva', 'belo horizonte', 'escola@hotmail.com', 'escola municipal afonso pena', '3245785684', 'mg', '0');
insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('rua francisco nascimento', 'sao paulo', 'escola@hotmail.com', 'escola municipal rubens de souza', '324599684', 'sp', '0');
insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('av. jose martins oliveira', 'cotia', 'escola@gmail.com', 'escola estadual patricia gomes', '3214585784', 'sp', '1');
insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('av. rio branco', 'sao joao del rey', 'escola@gmail.com', 'escola estadual juscelino kubitchek', '32145784', 'mg', '1');
insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('rua das garças', 'rio de janeiro', '35c014a@hotmail.com', 'colegio militar federal', '32541268', 'rj', '2');
insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('av. vital brasil', 'sao paulo', 'efe14@gmail.com', 'Escola Municipal Almeida Santos', '985667484', 'sp', '0');
insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('av. itamar franco', 'sao paulo', '3mhgh5c014@gmail.com', 'Escola Estadual Marta Souza', '45325687484', 'sp', '1');
insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('rua Galeao Silvio', 'sao paulo', '3mhhfhfg014@gmail.com', 'Escola Estadual Dep. Moreira Coelho', '9555687484', 'sp', '1');
insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('Avenida das Araras', 'sao paulo', 'hfhfg014@gmail.com', 'Escola Estadual Dep. Rose Gonzalez', '86855687484', 'sp', '1');
insert into tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, STATE, TYPE) values ('Rua Rosa e Silva', 'Itu', 'h275hfg014@gmail.com', 'Escola Municipal Prof. Lima e Filho', '6855687484', 'sp', '0');



insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (12, 'Leticia Tavares', 1, 1);  
insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (10, 'Marcelo Felício', 1, 1);
insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (10, 'Raissa Garcia', 2, 3);
insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (7, 'Bruno Fernandes', 2, 2);
insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (9, 'Rogerio Silva', 2, 2);
insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (13, 'Lucas Fernandes', 1, 4);
insert into tb_student (IDADE, NAME, PARENT_ID, SCHOOL_ID) values (11, 'Fernanda Lima', 1, 2);


insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', '', 2.0, 'Lapis');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', '', 8.0, 'Caderno');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (1, '', '', 22.0, 'Livro de Fisica');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (2, 'Autor: Dostoievsky', '', 15.0, 'O idiota');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (3, '', '', 40.0, 'Bola de treino');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', '', 8.0, 'Estojo');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', '', 4.9, 'Cola bastão');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', '', 40.0, 'Bola de treino');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', 'Faber Castell', 19.90, 'Lápis de cor');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', 'Faber Castell', 22.70, 'Canetinha colorida');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', 'BIC', 19.90, 'Cardeno de desenho');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', 'BIC', 19.90, 'Lapiseira');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', 'Allmax', 8.25, 'Papel almaço');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', 'Tramontina', 7.89, 'Tesoura sem ponta');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (1, '', '', 22.00, 'Livro de inglês');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (1, '', '', 28.00, 'Livro de português');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (1, '', '', 28.90, 'Livro de geografia');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', '', 15.90, 'Compasso');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', 'BIC', 1.99, 'Caneta Azul');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', 'BIC', 1.99, 'Caneta Preta');
insert into tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) values (0, '', 'Faber Castell', 6.49, 'Giz de cera');



insert into tb_order (student_id) values (1);
insert into tb_order (student_id) values (2);
insert into tb_order (student_id) values (3);


insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values (false, '5', '0', '5', '1');
insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values (false, '1', '0', '3', '2');
insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values (false, '1', '0', '4', '2');
insert into tb_item_order (IS_COMPLETED, QUANTITY, RECEIVED, ITEM_ID, ORDER_ID) values (false, '2', '0', '2', '3');


insert into tb_donation (QUANTITY, DONATOR_ID, ITEM_ORDER_ID) values (30, 1, 1);
insert into tb_donation (QUANTITY, DONATOR_ID, ITEM_ORDER_ID) values (3, 2, 2);