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
('Ana Clara', '2014-05-12', 'https://cdn-icons-png.freepik.com/128/8288/8288915.png', 'ana.clara', 'senha123', 1),
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
('Jogo das Sombras', 'https://cdn-icons-png.freepik.com/128/3418/3418674.png'),
('Jogo da Matemática', 'https://cdn-icons-png.freepik.com/256/466/466666.png'),
('Palavras Cruzadas', 'https://cdn-icons-png.freepik.com/128/5806/5806552.png'),
('Caça palavras', 'https://cdn-icons-png.freepik.com/128/1341/1341066.png'),
('Formas e Cores', 'https://cdn-icons-png.freepik.com/128/603/603563.png'),
('Que animal é esse?', 'https://cdn-icons-png.freepik.com/128/1145/1145521.png'),
('Desenho Livre', 'https://cdn-icons-png.freepik.com/128/4556/4556114.png'),
('Jogo da Contagem', 'https://cdn-icons-png.freepik.com/128/9593/9593042.png');

INSERT INTO tb_atividade (nome, descricao, data_criacao, data_encerramento, turma_id, jogo_id) VALUES
('Atividade de Português 1', 'Jogo das vogais', '2024-11-20', '2024-11-21', 1, 1),
('Atividade de Lógica 1', 'Quebra Cabeça', '2024-11-20', '2024-11-22', 1, 3),
('Atividade de Matemática 1', 'Jogo da soma', '2024-11-15', '2024-11-16', 2, 5),
('Atividade de Português 2', 'Jogo das Sílabas', '2024-11-10', '2024-11-12', 3, 6);


