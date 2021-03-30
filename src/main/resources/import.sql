INSERT INTO tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, TYPE, STATE) VALUES ('Avenida João Pinheiro, 450', 'Belo Horizonte', 'escola@afonsopena.com', 'Escola Estadual Afonso Pena', '3135901590', '2', 'MG');
INSERT INTO tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, TYPE, STATE) VALUES ('Rua Severino Meireles, 250', 'Juiz de Fora', 'degraus@colegio.com', 'Sistema Degraus de Ensino', '3256897410', '0', 'MG');
INSERT INTO tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, TYPE, STATE) VALUES ('Praça dos Espedicionários, 1', 'São João Del Rey', 'maria-teresa-escola@hotmail.com', 'Escola Municipal maria Teresa', '33321548741', '1', 'MG');
INSERT INTO tb_school (ADDRESS, CITY, EMAIL, NAME, PHONE, TYPE, STATE) VALUES ('Rua da Luz Interior, 360', 'Juiz de Fora', 'admin-mg@ifes.com', 'Instituto Federal do Sudeste Mineiro - MG', '32326574141', '3', 'MG');

INSERT INTO tb_parent (ADDRESS, CITY, EMAIL, NAME, PHONE, CPF, STATE) VALUES ('Avenida sete de setembro, 650', 'Juiz de Fora', 'joao-moreira@hotmail.com', 'João Moreira', '3291038886', '06575416311', 'MG');
INSERT INTO tb_parent (ADDRESS, CITY, EMAIL, NAME, PHONE, CPF, STATE) VALUES ('avenida getulio vargas, 900', 'belo horizonte', 'carla-morattori@gmail.com', 'carla morattori', '319989879', '54112633879', 'MG');
INSERT INTO tb_parent (ADDRESS, CITY, EMAIL, NAME, PHONE, CPF, STATE) VALUES ('rua monsieur gustavo freire, 250', 'são joão del rey', 'm-ribeiroa@hotmail.com', 'Marcos Vinicius Ribeiro', '3391423566', '03224588956', 'MG');
INSERT INTO tb_parent (ADDRESS, CITY, EMAIL, NAME, PHONE, CPF, STATE) VALUES ('rua presidente costa e silva, 1000', 'juiz de fora', 'mrv@hotmail.com', 'Maria Rita Valdetta', '3191423566', '13542699874', 'MG');

INSERT INTO tb_student (NAME, IDADE, PARENT_ID, SCHOOL_ID) VALUES ('Raissa Garcia', 11, '1','1');
INSERT INTO tb_student (NAME, IDADE, PARENT_ID, SCHOOL_ID) VALUES ('Diego Oliveira', 10, '2','2');
INSERT INTO tb_student (NAME, IDADE, PARENT_ID, SCHOOL_ID) VALUES ('Márcia Santos', 8, '3','3');
INSERT INTO tb_student (NAME, IDADE, PARENT_ID, SCHOOL_ID) VALUES ('Letícia Tavares', 16, '4','4');
INSERT INTO tb_student (NAME, IDADE, PARENT_ID, SCHOOL_ID) VALUES ('Douglas Salgado', 12, '4','4');

INSERT INTO tb_donator (CITY, EMAIL, NAME, PHONE, CPF, STATE) VALUES ('Juiz de Fora', 'let-guajajara@hotmail.com', 'Letícia Guajajara', '3298457513', '35541266874', 'MG');

INSERT INTO tb_item (CATEGORY, DESCRIPTION, MANUFACTURER, PRICE, PRODUCT) VALUES ('3', 'Autor: Fiodr Dostoievsky', '', '20.00', 'O Idiota');

INSERT INTO tb_order (student_id) VALUES ('4');
INSERT INTO tb_order (school_id) VALUES ('1');

INSERT INTO tb_item_order (QUANTITY, ITEM_ID, ORDER_ID) VALUES ('1', '1', '1');