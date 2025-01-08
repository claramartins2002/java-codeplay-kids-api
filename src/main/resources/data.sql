INSERT INTO tb_professor (nome, email, senha) VALUES
('Carlos Eduardo', 'carlos.eduardo@example.com', 'senha123'),
('Mariana Silva', 'mariana.silva@example.com', 'senha456'),
('Roberto Souza', 'roberto.souza@example.com', 'senha789');

INSERT INTO tb_turma (nome, descricao, professor_id) VALUES
('1º ano A', 'Turma de primeiro ano, classe A', 1),
('2º ano B', 'Turma de segundo ano, classe B', 1),
('3º ano C', 'Turma de terceiro ano, classe C', 1),
('1º ano B', 'Turma de primeiro ano, classe B', 2),
('2º ano A', 'Turma de segundo ano, classe A', 2);

INSERT INTO tb_aluno (nome, data_nascimento, foto_url, usuario, senha, turma_id) VALUES
('João Lucas', '2014-05-12', 'https://cdn-icons-png.freepik.com/128/8288/8288915.png', 'joao.lucas', 'senha123', 1),
('Lucas Silva', '2014-07-19', 'https://cdn-icons-png.freepik.com/128/10293/10293865.png', 'lucas.silva', 'senha123', 1),
('Beatriz Santos', '2014-09-22', 'https://cdn-icons-png.freepik.com/128/10293/10293869.png', 'beatriz.santos', 'senha123', 1),
('Pedro Almeida', '2014-02-03', 'https://cdn-icons-png.freepik.com/128/4711/4711037.png', 'pedro.almeida', 'senha123', 1),
('Mariana Souza', '2014-11-14', 'https://cdn-icons-png.freepik.com/128/3152/3152906.png', 'mariana.souza', 'senha123', 1),
('João Pedro', '2014-06-01', 'https://cdn-icons-png.freepik.com/128/6859/6859802.png', 'joao.pedro', 'senha123', 1),
('Fernanda Costa', '2014-03-28', 'https://cdn-icons-png.freepik.com/128/3152/3152906.png', 'fernanda.costa', 'senha123', 1),
('Gustavo Lima', '2014-08-07', 'https://cdn-icons-png.freepik.com/128/6859/6859802.png', 'gustavo.lima', 'senha123', 1),
('Carlos Henrique', '2013-04-16', 'https://cdn-icons-png.freepik.com/128/8288/8288936.png', 'carlos.henrique', 'senha123', 2),
('Julia Martins', '2013-09-25', 'https://cdn-icons-png.freepik.com/128/1338/1338118.png', 'julia.martins', 'senha123', 2),
('Rafael Pereira', '2013-01-17', 'https://cdn-icons-png.freepik.com/128/4711/4711037.png', 'rafael.pereira', 'senha123', 2),
('Sofia Alves', '2013-12-02', 'https://cdn-icons-png.freepik.com/128/1338/1338118.png', 'sofia.alves', 'senha123', 2),
('Enzo Ribeiro', '2013-03-11', 'https://cdn-icons-png.freepik.com/128/8288/8288936.png', 'enzo.ribeiro', 'senha123', 2),
('Lorena Melo', '2013-05-23', 'https://cdn-icons-png.freepik.com/128/3152/3152906.png', 'lorena.melo', 'senha123', 2),
('Thiago Carvalho', '2013-07-06', 'https://cdn-icons-png.freepik.com/128/4711/4711037.png', 'thiago.carvalho', 'senha123', 2),
('Isabela Duarte', '2013-08-30', 'https://cdn-icons-png.freepik.com/128/3152/3152906.png', 'isabela.duarte', 'senha123', 2),
('Gabriel Ferreira', '2012-02-19', 'https://cdn-icons-png.freepik.com/128/4711/4711037.png', 'gabriel.ferreira', 'senha123', 3),
('Lara Figueiredo', '2012-06-13', 'https://cdn-icons-png.freepik.com/128/1338/1338118.png', 'lara.figueiredo', 'senha123', 3),
('Matheus Rocha', '2012-11-05', 'https://cdn-icons-png.freepik.com/128/10293/10293865.png', 'matheus.rocha', 'senha123', 3),
('Laura Azevedo', '2012-04-28', 'https://cdn-icons-png.freepik.com/128/10293/10293869.png', 'laura.azevedo', 'senha123', 3),
('Felipe Costa', '2012-08-21', 'https://cdn-icons-png.freepik.com/128/8288/8288936.png', 'felipe.costa', 'senha123', 3),
('Camila Oliveira', '2012-03-09', 'https://cdn-icons-png.freepik.com/128/1338/1338118.png', 'camila.oliveira', 'senha123', 3),
('Daniel Pinto', '2012-05-31', 'https://cdn-icons-png.freepik.com/128/10293/10293865.png', 'daniel.pinto', 'senha123', 3),
('Bianca Reis', '2012-09-14', 'https://cdn-icons-png.freepik.com/128/10293/10293869.png', 'bianca.reis', 'senha123', 3),
('Hugo Neves', '2014-01-22', 'https://cdn-icons-png.freepik.com/128/8288/8288936.png', 'hugo.neves', 'senha123', 4),
('Eduarda Monteiro', '2014-06-15', 'https://cdn-icons-png.freepik.com/128/10293/10293869.png', 'eduarda.monteiro', 'senha123', 4),
('Rodrigo Santos', '2014-10-10', 'https://cdn-icons-png.freepik.com/128/10293/10293865.png', 'rodrigo.santos', 'senha123', 4),
('Alice Moura', '2014-09-30', 'https://cdn-icons-png.freepik.com/128/1338/1338118.png', 'alice.moura', 'senha123', 4),
('Samuel Correia', '2014-11-26', 'https://cdn-icons-png.freepik.com/128/8288/8288936.png', 'samuel.correia', 'senha123', 4),
('Clarice Nunes', '2014-02-07', 'https://cdn-icons-png.freepik.com/128/3152/3152906.png', 'clarice.nunes', 'senha123', 4),
('Otávio Leal', '2014-04-04', 'https://cdn-icons-png.freepik.com/128/4711/4711037.png', 'otavio.leal', 'senha123', 4),
('Júlia Braga', '2014-07-08', 'https://cdn-icons-png.freepik.com/128/3152/3152906.png', 'julia.braga', 'senha123', 4),
('Marcelo Araújo', '2013-03-18', 'https://cdn-icons-png.freepik.com/128/10293/10293865.png', 'marcelo.araujo', 'senha123', 5),
('Luiza Rocha', '2013-06-22', 'https://cdn-icons-png.freepik.com/128/3152/3152906.png', 'luiza.rocha', 'senha123', 5),
('Bruno Dias', '2013-10-14', 'https://cdn-icons-png.freepik.com/128/8288/8288936.png', 'bruno.dias', 'senha123', 5),
('Victoria Cunha', '2013-12-25', 'https://cdn-icons-png.freepik.com/128/10293/10293869.png', 'victoria.cunha', 'senha123', 5),
('Leonardo Ferreira', '2013-08-08', 'https://cdn-icons-png.freepik.com/128/10293/10293865.png', 'leonardo.ferreira', 'senha123', 5),
('Aline Barbosa', '2013-01-30', 'https://cdn-icons-png.freepik.com/128/10293/10293869.png', 'aline.barbosa', 'senha123', 5),
('Gabriela Castro', '2013-05-17', 'https://cdn-icons-png.freepik.com/128/3152/3152906.png', 'gabriela.castro', 'senha123', 5),
('Henrique Borges', '2013-09-04', 'https://cdn-icons-png.freepik.com/128/10293/10293865.png', 'henrique.borges', 'senha123', 5);

INSERT INTO tb_jogo (nome, icone) VALUES
('Quebra-Cabeça', 'https://cdn-icons-png.freepik.com/128/6854/6854549.png'),
('Jogo da Memória', 'https://cdn-icons-png.freepik.com/128/9267/9267863.png'),
('Arraste e Solte', 'https://cdn-icons-png.freepik.com/128/3418/3418674.png'),
('Adição de Números', 'https://cdn-icons-png.freepik.com/256/466/466666.png'),
('Palavras Cruzadas', 'https://cdn-icons-png.freepik.com/128/5806/5806552.png'),
('Caça Palavras', 'https://cdn-icons-png.freepik.com/128/1341/1341066.png'),
('Que animal é esse ?', 'https://cdn-icons-png.freepik.com/128/3969/3969722.png'),
('Subtração de Números', 'https://cdn-icons-png.freepik.com/256/466/466666.png'),
('Multiplicação de Números', 'https://cdn-icons-png.freepik.com/256/466/466666.png'),
('Formas e Cores', 'https://cdn-icons-png.freepik.com/128/603/603563.png'),
('Divisão de Números', 'https://cdn-icons-png.freepik.com/256/466/466666.png'),
('Que horas são ?', 'https://cdn-icons-png.freepik.com/256/9099/9099610.png'),
('Jogo da Contagem', 'https://cdn-icons-png.freepik.com/128/9593/9593042.png');

INSERT INTO TB_ATIVIDADE (nome, descricao, data_criacao, data_encerramento, turma_id, jogo_id) VALUES
('Atividade de Quebra-Cabeça', 'Quebra-Cabeça', CURRENT_DATE, '2025-01-10', 1, 1),
('Atividade de Jogo da Memória', 'Jogo da Memória', CURRENT_DATE, '2025-01-10', 1, 2),
('Atividade de Arraste e Solte', 'Arraste e Solte', CURRENT_DATE, '2025-01-10', 1, 3),
('Atividade de Adição de Números', 'Adição de Números', CURRENT_DATE, '2025-01-10', 1, 4),
('Atividade de Palavras Cruzadas', 'Palavras Cruzadas', CURRENT_DATE, '2025-01-10', 1, 5),
('Atividade de Caça Palavras', 'Caça Palavras', CURRENT_DATE, '2025-01-10', 1, 6),
('Atividade de Jogo das Imagens', 'Jogo das Imagens', CURRENT_DATE, '2025-01-10', 1, 7),
('Atividade de Subtração de Números', 'Subtração de Números', CURRENT_DATE, '2025-01-10', 1, 8),
('Atividade de Multiplicação de Números', 'Multiplicação de Números', CURRENT_DATE, '2025-01-10', 1, 9),
('Atividade de Formas Geométricas e Cores', 'Formas Geométricas e Cores', CURRENT_DATE, '2025-01-10', 1, 10),
('Atividade de Divisão de Números', 'Divisão de Números', CURRENT_DATE, '2025-01-10', 1, 11),
('Atividade de Que horas são ?', 'Que horas são ?', CURRENT_DATE, '2025-01-10', 1, 12),
('Atividade de Jogo da Contagem', 'Jogo da Contagem', CURRENT_DATE, '2025-01-10', 1, 13);

INSERT INTO TB_RELATORIO_ATIVIDADE (TENTATIVAS, ACERTOS, ERROS, TEMPO_GASTO, PONTUACAO, TIPO_ATIVIDADE, FEEDBACK, ALUNO_ID, ATIVIDADE_ID) VALUES
(15, 6, 9, 26, 6.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 1, 4),
(15, 7, 8, 22, 8.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 1, 8),
(15, 2, 3, 28, 3.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 1, 9),
(15, 10, 5, 30, 10.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 1, 11),
(15, 5, 2, 60, 2.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 2, 4),
(15, 4, 11, 28, 4.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 2, 8),
(15, 8, 7, 45, 8.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 3, 9),
(15, 5, 8, 28, 5.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 3, 11),
(15, 7, 5, 25, 7.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 2, 4),
(15, 15, 12, 37, 8.0, 'Operações Matemáticas', 'Não desanime! Praticar as operações matemáticas ajudará a melhorar.', 3, 8),
(NULL, NULL, NULL, 42, NULL, 'Caça Palavras', NULL, 1, 6),
(NULL, NULL, NULL, 70, NULL, 'Caça Palavras', NULL, 2, 6),
(NULL, NULL, NULL, 90, NULL, 'Quebra Cabeça', NULL, 3, 1),
(NULL, NULL, NULL, 90, NULL, 'Quebra Cabeça', NULL, 3, 1),
(NULL, NULL, NULL, 73, NULL, 'Quebra Cabeça', NULL, 2, 1),
(0, 0, 10, 34, 0.0, 'Relógio', 'Atividade não reconhecida para feedback.', 1, 12);



