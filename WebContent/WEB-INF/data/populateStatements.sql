INSERT INTO endereco(logradouro, numero, complemento, cep, cidade, estado) VALUES ('Rua da Casinha', 42, 201, '22051070', 'Rio de Janeiro', 'RJ');
INSERT INTO endereco(logradouro, numero, complemento, cep, cidade, estado) VALUES ('Rua do Apartamento', 42, 1010, '22333-456', 'Rio de Janeiro', 'RJ');
INSERT INTO endereco(logradouro, numero, complemento, cep, cidade, estado) VALUES ('Rua do Apartamento', 42, 1011, '22333-456', 'Rio de Janeiro', 'RJ');
INSERT INTO endereco(logradouro, numero, complemento, cep, cidade, estado) VALUES ('Rua do Apartamento', 42, 1012, '22333-456', 'Rio de Janeiro', 'RJ');

INSERT INTO operador_do_sistema(cpf, login, senha, nome) VALUES ('111.222.333-44', 'operador', '123', 'João das Couves');

INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('BOR123','Borracha', 'unidade', 1.00);
INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('CAN123','Caneta Esferográfica Azul', 'unidade', 1.50);
INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('CAR123','Cartucho Preto HP 74', 'unidade', 65.00);
INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('PAP123','Papel A4', 'resma', 20.00);
INSERT INTO material(codigo, descricao, unidade_de_medida, preco_de_mercado) VALUES ('TIN123','Tinta Refil para catucho HP 74', 'litro', 25.00);

INSERT INTO setor(almoxarifado_id, capacidade, nome) VALUES(1, 1000, 'Escritorio');
INSERT INTO setor(almoxarifado_id, capacidade, nome) VALUES(1, 1000, 'Limpeza');
INSERT INTO setor(almoxarifado_id, capacidade, nome) VALUES(1, 1000, 'Eletronicos');


INSERT INTO almoxarifado(codigo, endereco_id) VALUES(1, 'ALM12345', 1);

INSERT INTO fornecedor(cnpj, nome, telefone, codigo, endereco_id) VALUES ('11.222.333/0001-99', 'PIMACO', '(11) 2222-3344', 'PIM', 8);
INSERT INTO fornecedor(cnpj, nome, telefone, codigo, endereco_id) VALUES ('22.333.444/0001-99', '3M', '(11) 2222-3344', '3M', 9);
INSERT INTO fornecedor(cnpj, nome, telefone, codigo, endereco_id) VALUES ('33.444.555/0001-99', 'HP do Brasil', '(11) 2333-4444', 'HPB', 10);
INSERT INTO fornecedor(cnpj, nome, telefone, codigo, endereco_id) VALUES ('44.555.666/0001-99', 'CHAMEX', '(11) 3333-4455', 'CHM', 10);