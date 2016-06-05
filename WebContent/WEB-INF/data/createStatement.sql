
CREATE TABLE public.Endereco (
                Endereco_id VARCHAR NOT NULL,
                logradouro VARCHAR NOT NULL,
                numero INTEGER NOT NULL,
                complemento VARCHAR NOT NULL,
                cep VARCHAR NOT NULL,
                cidade VARCHAR NOT NULL,
                estado VARCHAR NOT NULL,
                CONSTRAINT endereco_pk PRIMARY KEY (Endereco_id)
);


CREATE TABLE public.Operador_do_Sistema (
                Operador_id INTEGER NOT NULL,
                CPF VARCHAR NOT NULL,
                login VARCHAR NOT NULL,
                senha VARCHAR NOT NULL,
                nome VARCHAR NOT NULL,
                CONSTRAINT operador_do_sistema_pk PRIMARY KEY (Operador_id)
);


CREATE TABLE public.Fornecedor (
                Fornecedor_id INTEGER NOT NULL,
                CNPJ VARCHAR NOT NULL,
                nome VARCHAR NOT NULL,
                telefone VARCHAR NOT NULL,
                codigo VARCHAR NOT NULL,
                Endereco_id VARCHAR NOT NULL,
                CONSTRAINT fornecedor_pk PRIMARY KEY (Fornecedor_id)
);


CREATE TABLE public.Material (
                Material_id INTEGER NOT NULL,
                codigo VARCHAR NOT NULL,
                descricao VARCHAR NOT NULL,
                unidade_de_medida VARCHAR NOT NULL,
                preco_de_mercado DOUBLE PRECISION NOT NULL,
                CONSTRAINT material_pk PRIMARY KEY (Material_id)
);


CREATE TABLE public.Almoxarifado (
                Almoxarifado_id INTEGER NOT NULL,
                codigo VARCHAR NOT NULL,
                Endereco_id VARCHAR NOT NULL,
                CONSTRAINT almoxarifado_pk PRIMARY KEY (Almoxarifado_id)
);


CREATE TABLE public.Setor (
                Setor_id INTEGER NOT NULL,
                Almoxarifado_id INTEGER NOT NULL,
                capacidade BIGINT NOT NULL,
                nome VARCHAR NOT NULL,
                CONSTRAINT setor_pk PRIMARY KEY (Setor_id)
);


CREATE TABLE public.Alocacao (
                Alocacao_id INTEGER NOT NULL,
                Fornecedor_id INTEGER NOT NULL,
                Material_id INTEGER NOT NULL,
                Setor_id INTEGER NOT NULL,
                quantidade BIGINT NOT NULL,
                CONSTRAINT alocacao_pk PRIMARY KEY (Alocacao_id)
);


CREATE TABLE public.Entrada (
                Entrada_id INTEGER NOT NULL,
                Alocacao_id INTEGER NOT NULL,
                data_da_operacao TIMESTAMP NOT NULL,
                Operador_id INTEGER NOT NULL,
                CONSTRAINT entrada_pk PRIMARY KEY (Entrada_id)
);


CREATE TABLE public.Saida (
                Saida_id INTEGER NOT NULL,
                Operador_id INTEGER NOT NULL,
                Alocacao_id INTEGER NOT NULL,
                nome_departamento VARCHAR NOT NULL,
                data_da_operacao TIMESTAMP NOT NULL,
                CONSTRAINT saida_pk PRIMARY KEY (Saida_id)
);


ALTER TABLE public.Fornecedor ADD CONSTRAINT endereco_fornecedor_fk
FOREIGN KEY (Endereco_id)
REFERENCES public.Endereco (Endereco_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Almoxarifado ADD CONSTRAINT endereco_almoxarifado_fk
FOREIGN KEY (Endereco_id)
REFERENCES public.Endereco (Endereco_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Saida ADD CONSTRAINT operador_do_sistema_saida_fk
FOREIGN KEY (Operador_id)
REFERENCES public.Operador_do_Sistema (Operador_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Entrada ADD CONSTRAINT operador_do_sistema_entrada_fk
FOREIGN KEY (Operador_id)
REFERENCES public.Operador_do_Sistema (Operador_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Alocacao ADD CONSTRAINT fornecedor_alocacao_fk
FOREIGN KEY (Fornecedor_id)
REFERENCES public.Fornecedor (Fornecedor_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Alocacao ADD CONSTRAINT material_alocacao_fk
FOREIGN KEY (Material_id)
REFERENCES public.Material (Material_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Setor ADD CONSTRAINT almoxarifado_setor_fk
FOREIGN KEY (Almoxarifado_id)
REFERENCES public.Almoxarifado (Almoxarifado_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Alocacao ADD CONSTRAINT setor_alocacao_fk
FOREIGN KEY (Setor_id)
REFERENCES public.Setor (Setor_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Saida ADD CONSTRAINT alocacao_saida_fk
FOREIGN KEY (Alocacao_id)
REFERENCES public.Alocacao (Alocacao_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE public.Entrada ADD CONSTRAINT alocacao_entrada_fk
FOREIGN KEY (Alocacao_id)
REFERENCES public.Alocacao (Alocacao_id)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;