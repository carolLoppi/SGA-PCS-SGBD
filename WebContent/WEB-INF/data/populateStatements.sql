INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (5,'Rua Anita Garibaldi', 42, 201, '22051070', 'Rio de Janeiro', 'RJ');
INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (6, 'Rua Borges de Medeiros', 422, 1010, '22333356', 'Rio de Janeiro', 'RJ');
INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (7, 'Rua Barão de Mesquita', 37, 1011, '20302984', 'Rio de Janeiro', 'RJ');
INSERT INTO endereco(endereco_id, logradouro, numero, complemento, cep, cidade, estado) VALUES (8, 'Avenida das Américas', 2342, 1, '34921456', 'Rio de Janeiro', 'RJ');

INSERT INTO operador_do_sistema(cpf, login, senha, nome) VALUES ('111.222.333-44', 'operador', '123', 'Marcelo do Amaral');

INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('LAP123', 'Lápis', 'unidade', 1.30);
INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('CAN123','Caneta Esferográfica Azul', 'unidade', 1.50);
INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('CAR123','Cartucho Preto HP 74', 'unidade', 65.00);
INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('PAP123','Papel A4', 'resma', 20.00);
INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('TIN123','Tinta Refil para catucho HP 74', 'litro', 25.00);

INSERT INTO almoxarifado(codigo, endereco_id) VALUES('ALM12345', 5);

INSERT INTO setor(setor_id, almoxarifado_id, capacidade, nome) VALUES(1, 2, 1000, 'Escritorio');
INSERT INTO setor(setor_id, almoxarifado_id, capacidade, nome) VALUES(2, 2, 1000, 'Limpeza');
INSERT INTO setor(setor_id, almoxarifado_id, capacidade, nome) VALUES(3, 2, 1000, 'Eletronicos');

INSERT INTO fornecedor(cnpj, nome, telefone, codigo, endereco_id) VALUES ('11.222.333/0001-99', 'PIMACO', '(11) 2222-3344', 'PIM', 8);
INSERT INTO fornecedor(cnpj, nome, telefone, codigo, endereco_id) VALUES ('22.333.444/0001-99', '3M', '(11) 2222-3344', '3M', 5);
INSERT INTO fornecedor(cnpj, nome, telefone, codigo, endereco_id) VALUES ('33.444.555/0001-99', 'HP do Brasil', '(11) 2333-4444', 'HPB', 6);
INSERT INTO fornecedor(cnpj, nome, telefone, codigo, endereco_id) VALUES ('44.555.666/0001-99', 'CHAMEX', '(11) 3333-4455', 'CHM', 7);