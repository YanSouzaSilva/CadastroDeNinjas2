-- V2: Migrations para adicionar a coluna de RANK na tabela cadastro
ALTER TABLE TB_CADASTRO
ADD COLUMN rank VARCHAR(255);