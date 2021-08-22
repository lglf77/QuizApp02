package com.lglf77.quizapp02.DbHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.lglf77.quizapp02.Model.QuestionCompFunda;
import com.lglf77.quizapp02.Model.QuestionHardWare;
import com.lglf77.quizapp02.Model.QuestionOS;
import com.lglf77.quizapp02.Model.QuestionRandom;

import java.util.ArrayList;
import java.util.List;

public class DbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Quiz.db";
    private static final String TABLE_QUEST = "questOS";
    private static final String KEY_ID = "id";
    private static final String KEY_QUES = "question";
    private static final String KEY_ANSWER = "answer"; //correct option
    private static final String KEY_OPTA = "opta"; //option a
    private static final String KEY_OPTB = "optb"; //option b
    private static final String KEY_OPTC = "optc"; //option c
    private static final String KEY_OPTD = "optd"; //option d
    private static final String KEY_CAT = "category"; //category
    private static final String TABLE_QUEST1 = "questCompFunda";
    private static final String TABLE_QUEST2 = "questHardware";
    private static final String TABLE_QUEST3 = "questFinal";

    public static final String TABLE_SCORE = "score";
    public static final String SCORE_KEY_ID = "id";
    public static final String SCORE_KEY_SECTION =" section";
    public static final String SCORE_KEY_CAT = "category";
    public static final String SCORE_KEY_SCORE =" score";

    private SQLiteDatabase dbase;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;

        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT, " + KEY_OPTD + " TEXT, " + KEY_CAT + " TEXT)";
        db.execSQL(sql);
        addQuestionsOS();

        String sql1 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST1 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA + " TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC + " TEXT, "+KEY_OPTD + " TEXT, " + KEY_CAT + " TEXT)";
        db.execSQL(sql1);
        addQuestionsCompFunda();

        String sql2 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST2 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+ KEY_OPTA + " TEXT, "
                +KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT, " + KEY_OPTD + " TEXT, " + KEY_CAT +" TEXT)";
        db.execSQL(sql2);
        addQuestionsHardware();

        String sql3 = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST3 + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA + " TEXT, "
                +KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT, "+KEY_OPTD + " TEXT)";
        db.execSQL(sql3);
        addQuestionsRandom();

        String sql4 = "CREATE TABLE IF NOT EXISTS "+ TABLE_SCORE+" ( "
                + SCORE_KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + SCORE_KEY_SECTION
                + " TEXT, " + SCORE_KEY_CAT+ " TEXT, "+ SCORE_KEY_SCORE+" INTEGER)";
        db.execSQL(sql4);
    }

    private void addQuestionsCompFunda() {
        QuestionCompFunda q101 = new QuestionCompFunda(
                "Qual é o equivalente decimal do número binário 10111",
                "21","23","39","42",
                "23",
                "B");
        this.addQuestionCompFunda(q101);

        QuestionCompFunda q102 = new QuestionCompFunda(
                "Para escrever em um disquete com o seu PC IBM, você deve primeiro",
                "digitalize-o","formate-o","compilar","hardware isso",
                "formate-o",
                "B");
        this.addQuestionCompFunda(q102);

        QuestionCompFunda q103 = new QuestionCompFunda(
                "Qual é o termo para uma área de armazenamento temporário que compensa " +
                        "as diferenças na taxa de dados e no fluxo de dados entre os dispositivos?",
                "Buffer","Bus","Channel","Modem",
                "Buffer",
                "B");
        this.addQuestionCompFunda(q103);

        QuestionCompFunda q104 = new QuestionCompFunda(
                "Quantos pontos coloridos formam um pixel colorido em uma tela?",
                "256","16","3","1",
                "3",
                "B");
        this.addQuestionCompFunda(q104);

        QuestionCompFunda q105 = new QuestionCompFunda(
                "Uma das coisas que separa um TERMINAL de um PC é que o terminal não " +
                        "tem o quê?",
                "Keyboard","Monitor","Power Cord","CPU",
                "CPU",
                "B");
        this.addQuestionCompFunda(q105);

        QuestionCompFunda q106 = new QuestionCompFunda(
                "Os dados são armazenados em disquete de que forma?",
                "Ink","Laser Bubble","Magnetism","Circuits",
                "Magnetism",
                "B");
        this.addQuestionCompFunda(q106);

        QuestionCompFunda q107 = new QuestionCompFunda (
                "O menor elemento visual em um monitor de vídeo é chamado de quê?",
                "Caractere", "Pixel", "Byte", "Kwerk",
                "Pixel",
                "B");
        this.addQuestionCompFunda (q107);

        QuestionCompFunda q108 = new QuestionCompFunda (
                "O tipo de armazenamento de dados considerado volátil é?",
                "R-O-M", "R-A-M", "TAPE", "DISK",
                "R-A-M",
                "B");
        this.addQuestionCompFunda(q108);

        QuestionCompFunda q109 = new QuestionCompFunda (
                "Qual elemento natural é o ingrediente principal em chips de computador?",
                "Silício", "Carbono", "Ferro", "Urânio",
                "Silício",
                "B");
        this.addQuestionCompFunda(q109);

        QuestionCompFunda q110 = new QuestionCompFunda (
                "Onde você encontra um entalhe de proteção contra gravação?",
                "Em um chip de computador", "Em um cartão perfurado",
                "Em uma memória somente leitura", "Em um disquete",
                "Em um disquete",
                "B");
        this.addQuestionCompFunda(q110);

        QuestionCompFunda q111 = new QuestionCompFunda (
                "Qual das seguintes linguagens é mais adequada para um programa estruturado?",
                "PL / 1", "FORTRAN", "BASIC", "PASCAL",
                "PASCAL",
                "B");
        this.addQuestionCompFunda(q111);

        QuestionCompFunda q112 = new QuestionCompFunda (
                "Um método assistido por computador para o registro e análise de " +
                        "sistemas existentes ou hipotéticos é", "Transmissão de dados",
                "Fluxo de dados", "Captura de dados", "Processamento de dados",
                "Fluxo de dados",
                "B");
        this.addQuestionCompFunda(q112);

        QuestionCompFunda q113 = new QuestionCompFunda (
                "O cérebro de qualquer sistema de computador é", "ALU",
                "CPU", "Memória", "Unidade de controle",
                "CPU",
                "B");
        this.addQuestionCompFunda(q113);

        QuestionCompFunda q114 = new QuestionCompFunda (
                "Que diferença o computador de 5ª geração tem dos computadores de outra geração?",
                "Avanço tecnológico", "Código científico",
                "Programação orientada a objetos", "Todos os anteriores",
                "Avanço tecnológico",
                "B");
        this.addQuestionCompFunda (q114);

        QuestionCompFunda q115 = new QuestionCompFunda (
                "Qual das seguintes linguagens de computador é usada para inteligência " +
                        "artificial?", "FORTRAN", "PROLOG", "C", "COBOL",
                "PROLOG",
                "B");
        this.addQuestionCompFunda (q115);

        QuestionCompFunda q116 = new QuestionCompFunda (
                "As faixas em um disco que podem ser acessadas sem reposicionar os cabeçotes R/W são",
                "Surface", "Cylinder", "Cluster", "All of the above",
                "Cylinder",
                " B ");
        this.addQuestionCompFunda (q116);

        QuestionCompFunda q117 = new QuestionCompFunda (
                "Qual dos seguintes é o complemento de 1 de 10?", "01",
                "110", "11", "10",
                "01",
                "B");
        this.addQuestionCompFunda (q117);

        QuestionCompFunda q118 = new QuestionCompFunda (
                "Uma seção do código para a qual o controle é transferido quando" +
                        " um processador é interrompido é conhecida como",
                "M", "SVC", "IP", "MDR",
                "M",
                "B") ;
        this.addQuestionCompFunda (q118);

        QuestionCompFunda q119 = new QuestionCompFunda (
                "Qual parte interpreta as instruções do programa e inicia as " +
                        "operações de controle.", "Entrada", "Unidade de armazenamento",
                "Unidade lógica", "Unidade de controle",
                "Unidade de controle",
                "B");
        this.addQuestionCompFunda (q119);

        QuestionCompFunda q120 = new QuestionCompFunda (
                "O sistema binário usa potências de",
                "2", "10", "8", "16", "2", "B");
        this.addQuestionCompFunda (q120);

        QuestionCompFunda q121 = new QuestionCompFunda (
                "Um programa de computador que converte linguagem assembly " +
                        "em linguagem de máquina é", "Compiler", "Interpreter",
                "Assembler", "Comparator",
                "Assembler", "B");
        this.addQuestionCompFunda (q121);

        QuestionCompFunda q122 = new QuestionCompFunda (
                "O tempo necessário para a busca e execução de uma instrução de " +
                        "máquina simples é", "Tempo de atraso", "Ciclo da CPU",
                "Tempo real", "Tempo de busca",
                "Ciclo da CPU", "B ");
        this.addQuestionCompFunda (q122);

        QuestionCompFunda q123 = new QuestionCompFunda (
                "O tempo de funcionamento de um equipamento é denominado",
                "Tempo de busca", "Tempo efetivo", "Tempo de acesso", "Tempo real",
                "Tempo efetivo", "B");
        this.addQuestionCompFunda (q123);

        QuestionCompFunda q124 = new QuestionCompFunda (
                "Os números binários precisam de mais casas para contar porque",
                "Eles são sempre números grandes",
                "Qualquer número de 0s pode ser adicionado na frente deles",
                "A base binária é pequena", "0s e l deve ser espaçado adequadamente ",
                " A base binária é pequena "," B ");
        this.addQuestionCompFunda (q124);

        QuestionCompFunda q125 = new QuestionCompFunda (
                "Qual método de acesso é usado para obter um registro de uma " +
                        "fita cassete?", "Direto", "Sequencial", "Aleatório",
                "Todas as opções acima",
                "Sequencial", "B") ;
        this.addQuestionCompFunda (q125);

        QuestionCompFunda q126 = new QuestionCompFunda (
                "Qualquer tipo de armazenamento usado para armazenar informações " +
                        "entre as etapas de seu processamento é", "CPU",
                "Armazenamento primário", "Armazenamento intermediário",
                "Armazenamento interno",
                "Armazenamento intermediário", " B ");
        this.addQuestionCompFunda (q126);
        QuestionCompFunda q127 = new QuestionCompFunda (
                "Um nome aplicado pela Intel corp. À tecnologia MOS de " +
                        "alta velocidade é chamado", "HDLC", "LAP", "HMOS",
                "SDLC",
                "HMOS",
                "B");
        this.addQuestionCompFunda (q127);

        QuestionCompFunda q128 = new QuestionCompFunda (
                "Um componente do programa que permite a estruturação de um" +
                        " programa de forma incomum é conhecido como",
                "Correlação", "Corotina", "Diagonalização", "Quene",
                "Corotina",
                "B");
        this.addQuestionCompFunda (q128);

        QuestionCompFunda q129 = new QuestionCompFunda(
                "O radiano de um sistema numérico",
                "É variável",
                "Não tem nada a ver com o valor da posição do dígito",
                "É igual ao número de seus dígitos de contagem distintos",
                "É sempre um número par",
                "É igual ao número de seus dígitos de contagem distintos",
                "B");
        this.addQuestionCompFunda(q129);

        QuestionCompFunda q130 = new QuestionCompFunda (
                "A seção da CPU que seleciona, interpreta e vê a execução " +
                        "das instruções do programa",
                "Memória", "Unidade de registro", "Unidade de controle",
                "ALU",
                "Unidade de controle",
                " B ");
        this.addQuestionCompFunda (q130);

        QuestionCompFunda q131 = new QuestionCompFunda (
                "Que tipo de sistema coloca o usuário em conversa direta " +
                        "com o computador através de um teclado?",
                "Processamento em tempo real", "Computador interativo",
                "Processamento em lote", "Compartilhamento de tempo",
                "Computador interativo ",
                " B ");
        this.addQuestionCompFunda (q131);

        QuestionCompFunda q132 = new QuestionCompFunda (
                "O termo referente à evacuação do conteúdo de alguma parte " +
                        "da máquina é conhecido como",
                "Dump", "Enhancement", "Down", "Compiler",
                "Dump",
                "B");
        this.addQuestionCompFunda (q132);

        QuestionCompFunda q133 = new QuestionCompFunda (
                "Um único pacote em um link de dados é conhecido como",
                "Caminho", "Quadro", "Bloco", "Grupo",
                "Quadro",
                "B");
        this.addQuestionCompFunda (q133);

        QuestionCompFunda q134 = new QuestionCompFunda (
                "O processo de comunicação com um arquivo de um terminal é",
                "Interativo", "Interrogação", "Heurística",
                "Todas as anteriores",
                "Interrogação",
                "B");
        this.addQuestionCompFunda (q134);

        QuestionCompFunda q135 = new QuestionCompFunda (
                "Um limite comum entre dois sistemas é denominado",
                "Interdição", "Interface", "Superfície",
                "Nenhuma das alternativas anteriores",
                "Interface",
                "B");
        this.addQuestionCompFunda (q135);

        QuestionCompFunda q136 = new QuestionCompFunda (
                "O exame e alteração de bits únicos ou pequenos grupos dentro de " +
                        "uma palavra é chamado de",
                "Bit", "Byte", "Manipulação de bits",
                "Fatia de bits",
                "Manipulação de bits",
                " B ");
        this.addQuestionCompFunda (q136);

        QuestionCompFunda q137 = new QuestionCompFunda (
                "Qual computador foi projetado para ser o mais compacto possível?",
                "Mini", "Super computador", "Micro computador",
                "Mainframe",
                "Micro computador",
                "B");
        this.addQuestionCompFunda (q137);

        QuestionCompFunda q138 = new QuestionCompFunda (
                "Qual método é usado para conectar um computador remoto?",
                "Dispositivo", "Discagem", "Diagnóstico",
                "Circuito lógico",
                "Discagem",
                "B");
        this.addQuestionCompFunda (q138);

        QuestionCompFunda q139 = new QuestionCompFunda (
                "Quantos códigos de bits são usados ​​pelo código Murray para " +
                        "máquinas TELEPRINTER.",
                "4", "5", "9", "25",
                "5",
                "B");
        this.addQuestionCompFunda (q139);

        QuestionCompFunda q140 = new QuestionCompFunda (
                "Os símbolos usados ​​em uma linguagem assembly são",
                "Codes", "Mnemônicos", "Assembler", "Todos os anteriores",
                "Mnemônicos",
                "B");
        this.addQuestionCompFunda (q140);

        QuestionCompFunda q141 = new QuestionCompFunda (
                "O complemento de 2 de um número binário é obtido adicionando " +
                        "..... ao seu complemento de 1.", "0", "1", "10",
                "12",
                "1" ,
                "B");
        this.addQuestionCompFunda (q141);

        QuestionCompFunda q142 = new QuestionCompFunda (
                "Uma linguagem de programação de sistemas para microcomputadores" +
                        " na família Intel é",
                "PL / C", "PL / CT", "PL / M", "PLA",
                "PL / M",
                "B ");
        this.addQuestionCompFunda (q142);

        QuestionCompFunda q143 = new QuestionCompFunda (
                "Um dado que indica algum estado importante no conteúdo da entrada" +
                        " ou saída é",
                "Sequência", "Sentinela", "SIO", "Irmão",
                "Sentinela",
                "B");
        this.addQuestionCompFunda (q143);

        QuestionCompFunda q144 = new QuestionCompFunda (
                "Qual é uma versão não padrão de uma linguagem de computação?",
                "PROLOG", "APL", "Exército", "PL / 1",
                "Exército",
                "B");
        this.addQuestionCompFunda (q144);

        QuestionCompFunda q145 = new QuestionCompFunda (
                "Qual dos seguintes ainda é útil para adicionar números?",
                "EDSAC", "ENIAC", "Abacus", "UNIVAC",
                "Abacus",
                "B");
        this.addQuestionCompFunda (q145);

        QuestionCompFunda q146 = new QuestionCompFunda (
                "O tempo médio necessário para o setor correto de um disco " +
                        "chegar à cabeça de leitura e gravação é _____",
                "Tempo de inatividade", "Tempo de busca",
                "Atraso de rotação", "Tempo de acesso",
                " Atraso rotacional ",
                " B ");
        this.addQuestionCompFunda (q146);

        QuestionCompFunda q147 = new QuestionCompFunda (
                "Um número que é usado para controlar a forma de outro " +
                        "número é conhecido como", "Mapa",
                "Máscara", "Mamtossa", "Marcador",
                "Máscara",
                "B");
        this.addQuestionCompFunda (q147);

        QuestionCompFunda q148 = new QuestionCompFunda (
                "Um microcomputador de usuário único de uso geral projetado" +
                        "para ser operado por uma pessoa por vez é",
                "Computador de uso especial", "KIPS", "M", "PC",
                "PC",
                "B");
        this.addQuestionCompFunda (q148);

        QuestionCompFunda q149 = new QuestionCompFunda (
                "ASCII significa", "Código padrão americano para " +
                "intercâmbio de informações",
                "Código científico multifacetado para intercâmbio de informações",
                "Código de segurança americano para intercâmbio de informações",
                "Código científico americano para intercâmbio de informações",
                " Código padrão americano para intercâmbio de informações ",
                " B ");
        this.addQuestionCompFunda (q149);

        QuestionCompFunda q150 = new QuestionCompFunda (
                "Qual dispositivo de operação do computador dispensa o uso do teclado?",
                "Joystick", "Caneta de luz", "Mouse", "Touch",
                "Mouse",
                "B");
        this.addQuestionCompFunda (q150);

        QuestionCompFunda q151 = new QuestionCompFunda (
                "O microcomputador, Intel MCS-80 é baseado no amplamente usado Intel",
                "microprocessador 8080", "microprocessador 8085",
                "microprocessador 8086", "microprocessador 8082",
                "microprocessador 8080",
                "I ");
        this.addQuestionCompFunda (q151);

        QuestionCompFunda q152 = new QuestionCompFunda (
                "Que é uma linguagem de alto nível orientada à máquina para as " +
                        "máquinas da série GEC 4080.",
                "LOGO", "SNOBOL", "Babbage", "ALGOL",
                "Babbage",
                "I") ;
        this.addQuestionCompFunda (q152);

        QuestionCompFunda q153 = new QuestionCompFunda (
                "Um programa que é empregado no desenvolvimento, reparo" +
                        " ou aprimoramento de outros programas é conhecido como",
                "Software de sistema", "Ferramenta de software",
                "Programa de aplicativos", "Programa utilitário",
                "Ferramenta de software ",
                "EU");
        this.addQuestionCompFunda (q153);

        QuestionCompFunda q154 = new QuestionCompFunda (
                "Qualquer dispositivo de armazenamento adicionado a um " +
                        "computador além do armazenamento principal" +
                        " imediatamente utilizável é conhecido como",
                "Disquete", "Disco rígido",
                "Armazenamento de backup", "Cartão perfurado",
                "Armazenamento de backup",
                "EU");
        this.addQuestionCompFunda (q154);

        QuestionCompFunda q155 = new QuestionCompFunda (
                "Qual dispositivo de saída é usado para traduzir " +
                        "informações de um computador para a forma pictórica no papel.",
                "Mouse", "Plotter",
                "Painel de toque", "Perfurador de cartão",
                "Plotter",
                "I ");
        this.addQuestionCompFunda (q155);

        QuestionCompFunda q156 = new QuestionCompFunda (
                "A lista de instruções codificadas é chamada",
                "Programa de computador", "Algoritmo",
                "Fluxograma", "Programas utilitários",
                "Programa de computador",
                "I");
        this.addQuestionCompFunda (q156);

        QuestionCompFunda q157 = new QuestionCompFunda (
                "Uma técnica usada por códigos para converter um sinal" +
                        " analógico em um fluxo de bits digital é conhecida como",
                "Modulação de código de pulso", "Esticador de pulso",
                "Processamento de consulta", "Gerenciamento de fila",
                "Pulso modulação de código ",
                " I ");
        this.addQuestionCompFunda (q157);

        QuestionCompFunda q158 = new QuestionCompFunda (
                "Um dispositivo de entrada óptica que interpreta marcas" +
                        " de lápis em mídia de papel é",
                "O.M.R", "Leitor de cartão perfurado",
                "Scanners ópticos", "Fita magnética",
                "O.M.R",
                "I");
        this.addQuestionCompFunda (q158);

        QuestionCompFunda q159 = new QuestionCompFunda (
                "A vantagem mais importante de um" +
                        " IC é sua", "Fácil substituição em caso de falha do circuito",
                "Confiabilidade extremamente alta",
                "Custo reduzido",
                "Baixo consumo de energia",
                "Confiabilidade extremamente alta",
                "EU");
        this.addQuestionCompFunda (q159);

        QuestionCompFunda q160 = new  QuestionCompFunda (
                "Divisão de dados é a terceira divisão de um programa _____.",
                "COBOL", "BASIC", "PASCAL", "FORTH",
                "COBOL",
                "I");
        this.addQuestionCompFunda (q160);

        QuestionCompFunda q161 =new  QuestionCompFunda (
                "Qual linguagem foi desenvolvida pelo Dr. Seymour Aubrey Papert?",
                "APL", "COBOL", "LOGO", "FORTRAN",
                "LOGO",
                "I");
        this.addQuestionCompFunda (q161);

        QuestionCompFunda q162 = new QuestionCompFunda (
                "Um programa que converte dados de computador em algum sistema" +
                        " de código diferente do normal é conhecido como",
                "Encoder", "Simulation", "Emulator", "Coding",
                "Encoder",
                "I" );
        this.addQuestionCompFunda (q162);

        QuestionCompFunda q163 = new QuestionCompFunda (
                "Um dispositivo projetado para ler informações codificadas em um pequeno " +
                        "cartão de plástico é", "Fita magnética", "Leitor de crachá",
                "Perfurador de fita", "Perfurador de cartão",
                "Leitor de crachá",
                "I" );
        this.addQuestionCompFunda (q163);

        QuestionCompFunda q164 = new QuestionCompFunda (
                "Um computador híbrido usa um _____ para converter sinais digitais de " +
                        "um computador em sinais analógicos.", "Modulador",
                "Demodulador", "Modem", "Decodificador",
                "Modem",
                "I") ;
        this.addQuestionCompFunda (q164);

        QuestionCompFunda q165 = new QuestionCompFunda (
                "Um grupo de fitas magnéticas, vídeos ou terminais geralmente sob o " +
                        "controle de um mestre é",
                "Cylinder", "Cluster", "Surface", "Track",
                "Cluster",
                "I") ;
        this.addQuestionCompFunda (q165);

        QuestionCompFunda q166 = new  QuestionCompFunda (
                "Qualquer dispositivo que realiza conversão de sinal é",
                "Modulador", "Modem", "Teclado", "Plotter",
                "Modulador",
                "I");
        this.addQuestionCompFunda (q166);

        QuestionCompFunda q167 = new QuestionCompFunda (
                "Códigos que consistem em marcas claras e escuras que podem ser lidas " +
                        "opticamente são conhecidos como",
                "Mnemônicos", "Código de barras",
                "Decodificador", "Todos os anteriores",
                "Código de barras",
                " EU");
        this.addQuestionCompFunda (q167);

        QuestionCompFunda q168 = new QuestionCompFunda (
                "Um tipo de canal usado para conectar um processador central" +
                        " e periféricos que usa multiplicação é conhecido como",
                "Modem", "Rede", "Multiplexador", "Todos os anteriores",
                "Multiplexador",
                "EU");
        this.addQuestionCompFunda (q168);

        QuestionCompFunda q169 = new  QuestionCompFunda (
                "A primeira geração de computadores disponíveis era baseada " +
                        "nos microprocessadores de bits.",
                "4", "8", "16", "64",
                "8",
                "I");
        this.addQuestionCompFunda (q169);

        QuestionCompFunda q170 = new  QuestionCompFunda (
                "O quadro completo dos dados armazenados no banco de dados é conhecido como",
                "Registro", "Esquema", "Fluxograma do sistema", "SGBD",
                "Esquema",
                "I");
        this.addQuestionCompFunda (q170);

        QuestionCompFunda q171 = new QuestionCompFunda (
                "Qual dos seguintes deve ser usado em todos os aplicativos " +
                        "executados em computadores mainframe.",
                "LOGO", "APL", "PL / 1", "OCCAM",
                "PL / 1",
                "EU");
        this.addQuestionCompFunda (q171);

        QuestionCompFunda q172 = new QuestionCompFunda (
                "Uma linguagem semelhante à usada no computador é",
                "Linguagem de alto nível", "Linguagem de montagem",
                "Linguagem de baixo nível", "Todas as anteriores",
                "Baixo- linguagem de nível ",
                " I ");
        this.addQuestionCompFunda (q172);

        QuestionCompFunda q173 = new QuestionCompFunda (
                "Que é uma unidade que representa os bits não discretos.",
                "Baud", "Byte", "Bit", "Todos os anteriores",
                "Baud",
                "I");
        this.addQuestionCompFunda (q173);

        QuestionCompFunda q174 = new QuestionCompFunda (
                "O dispositivo que pode alimentar e aceitar dados de um computador é",
                "ALU", "CPU", "Dispositivo de entrada-saída",
                "Todos os anteriores",
                "Entrada-saída dispositivo ",
                " I ");
        this.addQuestionCompFunda (q174);

        QuestionCompFunda q175 = new  QuestionCompFunda (
                "O pessoal que lida com o computador e sua gestão juntos são chamados",
                "Software", "Humanware", "Firmware", "Hardware",
                "Humanware",
                "I");
        this.addQuestionCompFunda (q175);

        QuestionCompFunda q176 = new QuestionCompFunda (
                "Um computador digital moderno tem",
                "Velocidade extremamente alta", "Grande memória",
                "Matriz quase ilimitada", "Todas as anteriores",
                "Todas as anteriores",
                "I");
        this.addQuestionCompFunda (q176);

        QuestionCompFunda q177 = new QuestionCompFunda (
                "Qual dos seguintes pode armazenar informações na forma de cavidades" +
                        " microscópicas em discos de metal.",
                "Discos de laser", "Cassetes de fita",
                "Cartucho de RAM", "Cartões perfurados",
                "Discos de laser" ,
                "EU");
        this.addQuestionCompFunda (q177);

        QuestionCompFunda q178 = new QuestionCompFunda (
                "Um dispositivo para converter impressões manuscritas em " +
                        "caracteres codificados e coordenadas posicionais para entrada em um " +
                        "computador é",
                "Touch panel", "Mouse", "Wand", "Writing tablet",
                "Writing tablet",
                "EU");
        this.addQuestionCompFunda (q178);

        QuestionCompFunda q179 = new QuestionCompFunda (
                "Um sistema de armazenamento para pequenas quantidades de dados é",
                "Cartão magnético",
                "Fita magnética",
                "Cartão perfurado",
                "Leitor de marca óptica",
                "Cartão magnético",
                "I");
        this.addQuestionCompFunda (q179);

        QuestionCompFunda q180 = new  QuestionCompFunda (
                "Qual é outro nome para linguagem funcional?",
                "Máquina", "Linguagem de aplicativo",
                "Linguagem de baixo nível", "Linguagem de alto nível",
                "Linguagem de aplicativo",
                "I");
        this.addQuestionCompFunda (q180);

        QuestionCompFunda q181 = new  QuestionCompFunda (
                "Compiladores e intérpretes são eles próprios",
                "Linguagem de alto nível",
                "Códigos", "Programas", "Mnemônicos",
                "Programas",
                "I");
        this.addQuestionCompFunda (q181);

        QuestionCompFunda q182 = new QuestionCompFunda (
                "Um compilador significa",
                "Uma pessoa que compila programas fonte",
                "A mesma coisa que um programador",
                "Operador Keypunch", "Um programa que traduz o programa " +
                "fonte em programa objeto",
                "Um programa que traduz o programa fonte em programa objeto ",
                " I ");
        this.addQuestionCompFunda (q182);

        QuestionCompFunda q183 = new QuestionCompFunda (
                "Um dispositivo em forma de caneta que pode detectar a luz " +
                        "e é usado para apontar pontos em uma tela de vídeo.",
                "Mouse", "Caneta de luz", "Joystick", "Plotter",
                "Caneta de luz ",
                "EU");
        this.addQuestionCompFunda (q183);

        QuestionCompFunda q184 = new QuestionCompFunda (
                "Uma notação usada para expressar claramente no algoritmo é conhecida como",
                "Linguagem de algoritmo", "Linguagem de montagem",
                "Linguagem de máquina", "Linguagem de alto nível",
                "Linguagem de algoritmo",
                "I") ;
        this.addQuestionCompFunda (q184);

        QuestionCompFunda q185 = new  QuestionCompFunda(
                "Compressão de dados digitais para armazenamento eficiente é",
                        "Buffer", "CPU", "Embalagem", "Campo",
                        "Embalagem",
                        "I");
        this.addQuestionCompFunda (q185);

        QuestionCompFunda q186 = new QuestionCompFunda(
                "Um sistema operacional destinado ao uso em sistemas baseados " +
                        "em microprocessador que oferecem suporte a um único usuário é",
                "PC-DOS","MS-DOS","UNIX","CP/M",
                "CP/M",
                "I");
        this.addQuestionCompFunda(q186);

        QuestionCompFunda q187 = new  QuestionCompFunda (
                "Qual linguagem de programação é baseada no Algol 60.",
                "PILOT", "SNOBOL", "ADA", "SIMULA",
                "SIMULA",
                "I");
        this.addQuestionCompFunda (q187);

        QuestionCompFunda q188 = new  QuestionCompFunda (
                "A memória do computador consiste em",
                "RAM", "ROM", "PROM", "Todas as anteriores",
                "Todas as anteriores",
                "I");
        this.addQuestionCompFunda (q188);

        QuestionCompFunda q189 = new QuestionCompFunda (
                "Um caminho pelo qual a comunicação é alcançada entre " +
                        "um processador central e outros dispositivos é chamado",
                "Trilha de auditoria", "Rede", "Barramento", "Canal",
                "Barramento",
                "I") ;
        this.addQuestionCompFunda (q189);

        QuestionCompFunda q190 = new QuestionCompFunda (
                "Um sistema autônomo que produz uma página de saída impressa por vez é",
                "Impressora de página", "Impressora de linha",
                "Impressora a laser", "Impressora matricial",
                "Impressora de página" ,
                "EU");
        this.addQuestionCompFunda (q190);

        QuestionCompFunda q191 = new QuestionCompFunda (
                "Uma memória que não muda seu conteúdo sem causas externas é conhecida como",
                "Memória dinâmica", "Memória estática", "RAM", "EEPROM",
                "Memória estática",
                "I") ;
        this.addQuestionCompFunda (q191);

        QuestionCompFunda q192 = new  QuestionCompFunda (
                "O boletim e a lista de mérito formam o",
                "Dados de saída", "Processamento de dados",
                "Processamento central", "Dados de entrada",
                "Dados de saída",
                "I");
        this.addQuestionCompFunda (q192);

        QuestionCompFunda q193 = new QuestionCompFunda (
                "Um número que é armazenado e processado, mas não na forma exponencial padrão é chamado",
                "Número de ponto flutuante", "Número de ponto fixo",
                "Número octal", "Número decimal",
                "Ponto fixo número ",
                " I ");
        this.addQuestionCompFunda (q193);

        QuestionCompFunda q194 = new  QuestionCompFunda (
                "Uma memória que contém micro programas é",
                "Memória de núcleo", "ROM", "RAM", "Memória de controle",
                "ROM",
                "I");
        this.addQuestionCompFunda (q194);

        QuestionCompFunda q195 = new QuestionCompFunda (
                "Um dispositivo inventado pelo Dr. Bobeck em 1966, para " +
                        "armazenamento em massa de dados é",
                "Fita de papel perfurada", "Armazenamento de bolha magnética",
                "Fita magnética", "Disco magnético",
                "Bolha magnética armazenamento ",
                " I ");
        this.addQuestionCompFunda (q195);

        QuestionCompFunda q196 = new  QuestionCompFunda (
                "A organização e interconexão dos vários componentes de um sistema " +
                        "de computador é",
                "Arquitetura", "Redes",
                "Gráficos", "Projetando",
                "Arquitetura",
                "I");
        this.addQuestionCompFunda (q196);

        QuestionCompFunda q197 = new QuestionCompFunda (
                "Qual das opções a seguir é a codificação de dados para que não " +
                        "seja facilmente compreendido se interceptado.",
                "Código de barras", "Decodificador",
                "Criptografia", "Mnemônicos",
                "Criptografia", "EU");
        this.addQuestionCompFunda (q197);

        QuestionCompFunda q198 = new QuestionCompFunda (
                "RAM é usada como memória curta porque é", "Volátil",
                "Tem pequena capacidade", "É muito caro", "É programável",
                "Volátil",
                "I");
        this.addQuestionCompFunda (q198);

        QuestionCompFunda q199 = new QuestionCompFunda (
                "Um computador eletrônico moderno é uma máquina destinada a",
                "Fazer cálculos matemáticos rápidos",
                "Armazenamento de entrada, manipulação de saída de dados",
                "Processamento eletrônico de dados",
                "Executar tarefas repetitivas com precisão" ,
                "Armazenamento de entrada, manipulação de saída de dados",
                "I");
        this.addQuestionCompFunda (q199);

        QuestionCompFunda q200 = new QuestionCompFunda (
                "Qual é um dispositivo que transforma informações em formato digital?",
                "Modem", "Digitalizador", "Mouse", "Caneta de luz",
                "Digitalizador",
                "I");
        this.addQuestionCompFunda (q200);

        QuestionCompFunda q201 = new QuestionCompFunda (
                "Qual das quatro palavras a seguir é estranha?",
                "Aplicativo", "Periférico", "Programa", "Software",
                "Periférico",
                "E");
        this.addQuestionCompFunda (q201);

        QuestionCompFunda q202 = new QuestionCompFunda (
                "Uma CPU contém",
                "um leitor de cartão", "um motor analítico",
                "unidade de controle e ALU", "apenas ALU",
                "unidade de controle e ALU",
                "E");
        this.addQuestionCompFunda (q202);

        QuestionCompFunda q203 = new QuestionCompFunda
                ("Qual dos seguintes controla o processo de interação entre " +
                        "o usuário e o sistema operacional?",
                        "Interface do usuário", "tradutor de idioma",
                        "plataforma", "protetor de tela",
                        "interface do usuário",
                        "E");
        this.addQuestionCompFunda (q203);

        QuestionCompFunda q204 = new  QuestionCompFunda (
                "Os primeiros computadores foram programados usando",
                "linguagem de montagem", "linguagem de máquina",
                "código-fonte", "código de objeto",
                "linguagem de máquina",
                "E");
        this.addQuestionCompFunda (q204);

        QuestionCompFunda q205 = new QuestionCompFunda (
                "É uma combinação de hardware e software que facilita " +
                        "o compartilhamento de informações entre dispositivos computacionais",
                "rede", "periférico", "placa de expansão",
                "dispositivo digital",
                "rede",
                "E" );
        this.addQuestionCompFunda (q205);

        QuestionCompFunda q206 = new QuestionCompFunda (
                "As configurações automáticas e padrão são chamadas de",
                "padrão", "ícone", "CPU", "personalizado",
                "padrão",
                "E");
        this.addQuestionCompFunda (q206);

        QuestionCompFunda q207 = new QuestionCompFunda (
                "As entradas codificadas que são usadas para obter acesso a" +
                        " um sistema de computador são chamadas de",
                "códigos de entrada",
                "senhas", "comandos de segurança", "palavras-código",
                "senhas",
                "E") ;
        this.addQuestionCompFunda (q207);

        QuestionCompFunda q208 = new  QuestionCompFunda (
                "Você pode organizar arquivos armazenando-os em",
                "arquivos", "pastas", "índices", "listas",
                "pastas",
                "E");
        this.addQuestionCompFunda (q208);

        QuestionCompFunda q209 = new QuestionCompFunda (
                "Quantos documentos diferentes você pode abrir ao mesmo tempo?",
                "Não mais de 3", "apenas um",
                "o máximo que a memória do seu computador comportar",
                "máximo de cinco",
                "tantos quantos a memória do seu computador aguentar",
                "E");
        this.addQuestionCompFunda (q209);

        QuestionCompFunda q210 = new  QuestionCompFunda (
                "Diretório no diretório é chamado",
                "mini diretório", "diretório júnior",
                "diretório parcial", "subdiretório",
                "subdiretório",
                "E");
        this.addQuestionCompFunda (q210);

        QuestionCompFunda q211 = new QuestionCompFunda (
                "Salvar é um processo", "Para copiar o documento da memória para a mídia de armazenamento",
                "Para alterar o status atual do documento",
                "Para alterar a face ou a forma inteira",
                "Para desenvolver o documento gravando o texto com o uso do teclado ",
                " Para copiar o documento da memória para o meio de armazenamento ",
                " E ");
        this.addQuestionCompFunda (q211);

        QuestionCompFunda q212 = new  QuestionCompFunda (
                "Lixo eletrônico também é chamado -", "spam", "spoof",
                "script sniffer", "spool",
                "spam",
                "E");
        this.addQuestionCompFunda (q212);

        QuestionCompFunda q213 = new QuestionCompFunda (
                "Que tipo de computadores são computadores clientes?",
                "Mainframe", "Mini-computador", "Micro-computador",
                "PDA",
                "Micro-computador",
                "E");
        this.addQuestionCompFunda (q213);

        QuestionCompFunda q214= new QuestionCompFunda(
                "Hackers-",
                "todos têm o mesmo motivo","invadir computadores de outras pessoas",
                "cientista da computação","são boas pessoas",
                "invadir computadores de outras pessoas",
                "E");
        this.addQuestionCompFunda(q214);

        QuestionCompFunda q215 = new  QuestionCompFunda (
                "Um computador não pode inicializar se não tiver",
                "compilador", "carregador", "sistema operacional",
                "montador",
                "sistema operacional",
                "E");
        this.addQuestionCompFunda (q215);

        QuestionCompFunda q216 = new  QuestionCompFunda (
                "Exemplo de dados não numéricos",
                "endereço", "pontuação no exame",
                "saldo bancário", "todos estes",
                "endereço",
                "E");
        this.addQuestionCompFunda (q216);

        QuestionCompFunda q217 = new  QuestionCompFunda (
                "Primeira página do site -",
                "página inicial", "índice", "javascript", "favorito",
                "página inicial",
                "E");
        this.addQuestionCompFunda (q217);

        QuestionCompFunda q218 = new QuestionCompFunda (
                "A aparência dos caracteres digitados é -",
                "tamanho", "formato", "ponto", "cor",
                "formato",
                "E");
        this.addQuestionCompFunda (q218);

        QuestionCompFunda q219 = new QuestionCompFunda (
                "Office LANS, que estão espalhados geograficamente em " +
                        "grande escala, podem ser conectados pelo uso de corporativo -",
                "CAN", "MAN", "LAN", "WAN",
                "WAN",
                " E ");
        this.addQuestionCompFunda (q219);

        QuestionCompFunda q220 = new QuestionCompFunda (
                "Onde os dados e o programa são armazenados quando o processador os usa?",
                "Memória principal", "memória secundária",
                "disco", "memória do programa",
                "memória principal",
                "E");
        this.addQuestionCompFunda (q220);

        QuestionCompFunda q221 = new QuestionCompFunda (
                "Se o arquivo salvo anteriormente for editado, então -",
                "É essencial salvar o arquivo novamente para armazenar a alteração",
                "A alteração será salva automaticamente no arquivo",
                "Se o comprimento for mais do que uma página, o arquivo precisará ser salvo ",
                " Será necessário alterar o nome ",
                " É essencial salvar o arquivo novamente para armazenar a alteração ",
                " E ");
        this.addQuestionCompFunda (q221);

        QuestionCompFunda q222 = new QuestionCompFunda (
                "CAD significa",
                "Design auxiliado por computador",
                "Algoritmo de computador para design",
                "Aplicativo de computador em design",
                "Todos os anteriores",
                "Design auxiliado por computador",
                "E");
        this.addQuestionCompFunda (q222);

        QuestionCompFunda q223 = new QuestionCompFunda (
                "A palavra FTP significa",
                "File Transit Protocol", "File Translate Protocol",
                "File Transfer Protocol", "File Typing Protocol",
                "File Transfer Protocol",
                "E");
        this.addQuestionCompFunda (q223);

        QuestionCompFunda q224 = new QuestionCompFunda (
                "Memória que esquece tudo quando você desliga a energia é conhecida como",
                "Corrompida", "Volátil", "Não Volátil", "Não Corrompida",
                "Volátil",
                "E");
        this.addQuestionCompFunda (q224);

        QuestionCompFunda q225 = new QuestionCompFunda (
                "A ligação de computadores com um sistema de comunicação é chamada",
                "rede", "emparelhamento", "bloqueio", "montagem",
                "rede",
                "E");
        this.addQuestionCompFunda (q225);

        QuestionCompFunda q226 = new QuestionCompFunda (
                "O microprocessador de 16 bits significa que tem",
                "16 linhas de endereço", "16 barramentos",
                "16 linhas de dados", "16 rotas",
                "16 linhas de dados",
                "E");
        this.addQuestionCompFunda (q226);

        QuestionCompFunda q227 = new QuestionCompFunda (
                "Os dados que vão para os computadores são chamados de",
                "saída", "algoritmo", "entrada", "fluxograma",
                "entrada",
                "E");
        this.addQuestionCompFunda (q227);

        QuestionCompFunda q228 = new QuestionCompFunda (
                "Os dados provenientes dos computadores são chamados de",
                "saída", "algoritmo", "entrada", "fluxograma",
                "saída",
                "E");
        this.addQuestionCompFunda (q228);

        QuestionCompFunda q229 = new QuestionCompFunda (
                "Qual dos seguintes se refere a uma pequena rede de local único?",
                "LAN", "DSL", "RAM", "USB",
                "LAN",
                "E");
        this.addQuestionCompFunda (q229);

        QuestionCompFunda q230 = new QuestionCompFunda (
                "Quantas opções oferece uma escolha binária?",
                "Zero", "Um", "Dois", "Três",
                "Dois",
                "E");
        this.addQuestionCompFunda (q230);

        QuestionCompFunda q231 = new QuestionCompFunda (
                "Uma coleção de programas que controla como o sistema do seu " +
                        "computador funciona e processa as informações é chamada de",
                "sistema operacional", "computador",
                "escritório", "compilador",
                "sistema operacional",
                "E" );
        this.addQuestionCompFunda (q231);

        QuestionCompFunda q232 = new QuestionCompFunda (
                "Computador conectado a uma LAN (Rede Local) pode",
                "rodar rápido", "estar online",
                "compartilhar periféricos", "e-mail",
                "compartilhar periféricos",
                "E");
        this.addQuestionCompFunda (q232);

        QuestionCompFunda q233 = new QuestionCompFunda (
                "A informação viaja entre os componentes na placa-mãe através de",
                "Memória Flash", "CMOS", "Barramentos", "Periféricos",
                "Barramentos",
                "E");
        this.addQuestionCompFunda (q233);

        QuestionCompFunda q234 = new QuestionCompFunda (
                "Como os dados são organizados em uma planilha?",
                "Linhas e espaços", "Camadas",
                "Altura e largura", "Linhas e colunas",
                "Linhas e colunas",
                "E");
        this.addQuestionCompFunda (q234);

        QuestionCompFunda q235 = new QuestionCompFunda (
                "O símbolo piscando na tela do computador é chamado de",
                "mouse", "mão", "cursor", "palma",
                "cursor",
                "E");
        this.addQuestionCompFunda (q235);

        QuestionCompFunda q236 = new QuestionCompFunda (
                "Uma falha em um programa de computador que o impede " +
                        "de funcionar corretamente é conhecida como",
                "Boot", "Bug", "Bit", "Binário",
                "Bug",
                "E");
        this.addQuestionCompFunda (q236);

        QuestionCompFunda q237 = new QuestionCompFunda (
                "Quantas opções um sistema octal oferece?",
                "Oito", "Quatro", "Dois", "Três",
                "Oito",
                "E");
        this.addQuestionCompFunda (q237);

        QuestionCompFunda q238 = new QuestionCompFunda (
                "Quantas opções um sistema hexadecimal oferece?",
                "Oito", "Seis", "Dezesseis", "Três",
                "Dezesseis",
                "E");
        this.addQuestionCompFunda (q238);

        QuestionCompFunda q239 = new QuestionCompFunda
                ("Pai da linguagem de programação C",
                        "Dennis Ritchie", "John Kennedy", "Bill Gates",
                        "James Gosling",
                        "Dennis Ritchie",
                        "E");
        this.addQuestionCompFunda (q239);

        QuestionCompFunda q240 = new QuestionCompFunda (
                "Pai da linguagem de programação Java",
                "Dennis Ritchie", "John Kennedy",
                "Bill Gates", "James Gosling",
                "James Gosling",
                "E");
        this.addQuestionCompFunda (q240);

        QuestionCompFunda q241 = new QuestionCompFunda (
                "BIOS significa",
                "Sistema de entrada e saída básico",
                "Sistema de saída de entrada binária",
                "Sistema de entrada básico desligado",
                "Todas as opções acima",
                "Sistema de entrada e saída básico",
                "E" );
        this.addQuestionCompFunda (q241);

        QuestionCompFunda q242 = new QuestionCompFunda (
                "VDU também é chamado de",
                "Tela", "Monitor", "Ambos 1 e 2", "Impressora",
                "Ambos 1 e 2",
                "E");
        this.addQuestionCompFunda (q242);

        QuestionCompFunda q243 = new QuestionCompFunda (
                "O dispositivo usado para transportar dados digitais em " +
                        "linhas analógicas é chamado de",
                "Modem", "Multiplexer", "DeMultiplexer", "Modulador",
                "Modem",
                "E");
        this.addQuestionCompFunda (q243);

        QuestionCompFunda q244 = new QuestionCompFunda (
                "SMPS significa",
                "Fonte de alimentação comutada",
                "Fonte de alimentação em modo inicial",
                "Fonte de alimentação em modo armazenamento",
                "Fonte de alimentação em modo único",
                "Fonte de alimentação em modo comutado",
                "E" );
        this.addQuestionCompFunda (q244);

        QuestionCompFunda q245 = new QuestionCompFunda (
                "1 Byte =?", "8 bits", "4 bits", "2 bits", "1 bit",
                "8 bits",
                "E");
        this.addQuestionCompFunda (q245);

        QuestionCompFunda q246 = new QuestionCompFunda (
                "Qual dos seguintes é um princípio OOP", "Programação estruturada",
                "Programação procedural", "Herança", "Vinculação",
                "Herança",
                "E");
        this.addQuestionCompFunda (q246);

        QuestionCompFunda q247 = new QuestionCompFunda (
                "Que comando divide a superfície do disco em branco em setores " +
                        "e atribui um endereço único a cada um",
                "Ver", "Formato", "Gordura", "Verificar Disco",
                "Formato",
                " E ");
        this.addQuestionCompFunda (q247);

        QuestionCompFunda q248= new QuestionCompFunda(
                "Every computer connected to an intranet or extranet must have a distinct",
                "firewall","Proxy Server","Domain Name","IP address",
                "IP address",
                "E");
        this.addQuestionCompFunda(q248);

        QuestionCompFunda q249 = new QuestionCompFunda (
                "Firewalls são usados ​​para proteger contra",
                "Ataques não autorizados", "Vírus",
                "Ataques de incêndio", "Ataques acionados por dados",
                "Ataques não autorizados",
                "E");
        this.addQuestionCompFunda (q249);

        QuestionCompFunda q250 = new QuestionCompFunda (
                "O primeiro Computador Digital introduzido, foi denominado como",
                "UNIVAC", "EDSAC", "ENIAC", "MARK-1",
                "MARK-1",
                "E");
        this.addQuestionCompFunda (q250);
    }

    public void addQuestionCompFunda(QuestionCompFunda quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION1());
        values.put(KEY_ANSWER, quest.getANSWER1());
        values.put(KEY_OPTA, quest.getOPTA1());
        values.put(KEY_OPTB, quest.getOPTB1());
        values.put(KEY_OPTC, quest.getOPTC1());
        values.put(KEY_OPTD, quest.getOPTD1());
        values.put(KEY_CAT,quest.getCATEGORY1());
        // Inserting Row
        dbase.insert(TABLE_QUEST1, null, values);
    }

    private void addQuestionsOS() {
        QuestionOS q1 = new QuestionOS (
                "Qual método de backup é mais rápido e requer a menor quantidad" +
                        "e de espaço de armazenamento de backup?",
                "Diário", "Normal", "Diferencial", "Incremental",
                "Incremental",
                "B");
        this.addQuestionOS (q1);

        QuestionOS q2 = new QuestionOS (
                "Verificações e correções de disco de verificação ____.",
                "Unidades de fita", "Unidades de disco rígido",
                "Unidades de CD-ROM", "Unidades de DVD-ROM",
                "Unidades de disco rígido",
                "B");
        this.addQuestionOS (q2);

        QuestionOS q3 = new QuestionOS(
                "Onde está localizado o comando DIR?",
                "C:|WINDOWS","COMMAND.COM","C:|WINDOWS|SYSTEM",
                "C:|WINDOWS|COMMAND", "COMMAND.COM",
                "B");
        this.addQuestionOS(q3);

        QuestionOS q4 = new QuestionOS (
                "Qual comando permite visualizar ou editar arquivos de configuração?",
                "SYSEDIT", "REGEDIT", "CFGEDIT", "AUTOEDIT",
                "SYSEDIT",
                "B");
        this.addQuestionOS (q4);

        QuestionOS q5 = new QuestionOS (
                "Qual utilitário é o melhor para editar o registro do Windows 95?",
                "Editar", "Regedit", "Reged32", "Gerenciador de Dispositivos",
                "Regedit",
                "B");
        this.addQuestionOS (q5);

        QuestionOS q6 = new QuestionOS (
                "Quais arquivos determinam a configuração de inicialização múltipla do Windows 9x?",
                "IO.SYS", "SYSTEM.INI", "MSDOS.SYS", "CONFIG.SYS",
                "MSDOS.SYS", " B ");
        this.addQuestionOS (q6);

        QuestionOS q7 = new QuestionOS (
                "Quais pressionamentos de tecla alternam um usuário entre " +
                        "aplicativos executados simultaneamente no Windows?",
                "FN + TAB", "ALT + TAB", "CTRL + TAB", "SHIFT + TAB",
                "ALT + TAB ",
                " B ");
        this.addQuestionOS (q7);

        QuestionOS q8 = new QuestionOS (
                "Qual tipo de arquivo é o registro do Windows 9x?",
                "Arquivo de texto simples", "Banco de dados relacional",
                "Banco de dados hierárquico", "Modelo de planilha",
                "Banco de dados hierárquico", "B") ;
        this.addQuestionOS (q8);

        QuestionOS q9 = new QuestionOS (
                "Quais dessas declarações seriam encontradas no arquivo autoexec.bat?",
                "FILES = 40", "PATH = C: \\;", "DOS = HIGH, UMB",
                "DEVICE = HIMEM.SYS ",
                " PATH = C: \\; ",
                " B ");
        this.addQuestionOS (q9);

        QuestionOS q10 = new QuestionOS(
                "Qual é o comando apropriado para instalar o Console de " +
                        "recuperação do Windows 2000 como uma opção de inicialização se " +
                        "o CD Rom for a unidade E?",
                "E:|i386\\SETUP.EXE\\CONSOLE","E:|i386\\CONSOLE.EXE\\INSTALL",
                "E:|i386\\WINNT32.EXE\\CMDCONS","E:|i386\\WIN2000.EXE\\RECOVERY",
                "E:|i386\\WINNT32.EXE\\CMDCONS",
                "B");
        this.addQuestionOS(q10);

        QuestionOS q11 = new QuestionOS (
                "A parte da instrução de nível de máquina, que informa ao " +
                        "processador central o que deve ser feito, é",
                "Código de operação", "Endereço", "Localizador", "Flip-Flop",
                "Código de operação ",
                " B ");
        this.addQuestionOS (q11);

        QuestionOS q12 = new QuestionOS (
                "Qual dos seguintes se refere à memória associativa?",
                "O endereço dos dados é gerado pela CPU",
                "o endereço dos dados é fornecido pelos usuários",
                "não há necessidade para um endereço, ou seja, os dados são usados ​​como um endereço ",
                " os dados são acessados ​​sequencialmente ",
                " não há necessidade de um endereço, ou seja, os dados são " +
                        "usados ​​como um endereço ",
                " B ");
        this.addQuestionOS (q12);

        QuestionOS q13 = new QuestionOS (
                "Para evitar a condição de corrida, o número de processos " +
                        "que podem estar simultaneamente dentro de sua seção crítica é",
                "8", "16", "1", "0",
                "1",
                "B ");
        this.addQuestionOS (q13);
        QuestionOS q14 = new QuestionOS (
                "Um programa de sistema que combina os módulos compilados" +
                        " separadamente de um programa em uma forma adequada para execução",
                "assembler", "assembler", "cross compiler", "load and go",
                "linking loader" ,
                "B");
        this.addQuestionOS (q14);

        QuestionOS q15 = new QuestionOS (
                "Processo é",
                "programa em linguagem de alto nível mantido no disco",
                "conteúdo da memória principal", "um programa em execução",
                "um trabalho na memória secundária",
                "um programa em execução" ,
                "B");
        this.addQuestionOS (q15);

        QuestionOS q16 = new QuestionOS (
                "Estrutura de endereçamento",
                "define o método fundamental para determinar endereços de" +
                        " operandos efetivos",
                "são variações no uso de estruturas de endereçamento fundamentais," +
                        " ou algumas ações associadas que estão relacionadas ao endereçamento",
                "executa as operações indicadas em dois registros rápidos da máquina e " +
                        "deixam o resultado em um dos registros ",
                " todas as anteriores ",
                " define o método fundamental de determinação dos " +
                        "endereços efetivos dos operandos ",
                " B ");
        this.addQuestionOS (q16);

        QuestionOS q17 = new QuestionOS(
                "tudo acima",
                "é um dispositivo de memória de hardware que denota a localização " +
                        "da instrução atual sendo executada",
                "é um grupo de circuitos elétricos (hardware), que realiza a intenção de " +
                        "instruções buscadas na memória",
                "contém o endereço do local da memória que deve ser lido ou armazenado em",
                "contém uma cópia do local de memória designado especificado pelo MAR " +
                        "após uma \"leitura\" ou o novo conteúdo da memória antes de uma \"escrita\"",
                "contém uma cópia do local de memória designado especificado pelo" +
                        " MAR após uma \"leitura\" ou o novo conteúdo da memória antes" +
                        " de uma \"escrita\"",
                "B");
        this.addQuestionOS(q17);

        // PAREI AQUI NA TRADUÇÃO

        QuestionOS q18 = new QuestionOS (
                "A estratégia de permitir que processos logicamente " +
                        "executáveis ​​sejam temporariamente suspensos é chamada de",
                "agendamento preemptivo", "agendamento não preemptivo",
                "trabalho mais curto primeiro", "trabalho mais curto primeiro",
                "agendamento preemptivo ",
                " B ");
        this.addQuestionOS (q18);

        QuestionOS q19 = new QuestionOS (
                "O algoritmo LRU",
                "sai das páginas que foram usadas recentemente",
                "sai das páginas que não foram usadas recentemente",
                "sai das páginas que foram menos usadas recentemente",
                "sai das páginas a primeira página em uma determinada área ",
                " páginas que foram menos usadas recentemente ",
                " B ");
        this.addQuestionOS (q19);

        QuestionOS q20 = new QuestionOS (
                "Qual dos seguintes softwares de sistema faz o trabalho de" +
                        " mesclar os registros de dois arquivos em um?",
                "Software de segurança",
                "Programa utilitário",
                "Software de rede",
                "Sistema de documentação",
                "Utilitário programa ",
                " B ");
        this.addQuestionOS (q20);

        QuestionOS q21 = new QuestionOS (
                "Fork é",
                "o despacho de uma tarefa",
                "a criação de um novo trabalho",
                "a criação de um novo processo",
                "aumentando a prioridade de uma tarefa",
                "a criação de um novo processo ",
                " B ");
        this.addQuestionOS (q21);

        QuestionOS q22 = new QuestionOS (
                "Thrashing",
                "é uma consequência natural dos sistemas de memória virtual",
                "sempre pode ser evitado trocando",
                "sempre ocorre em computadores grandes",
                "pode ​​ser causado por algoritmos de paginação deficientes",
                "pode ser causado por algoritmos de paginação deficientes ",
                " B ");
        this.addQuestionOS (q22);

        QuestionOS q23 = new QuestionOS (
                "Estado do supervisor é",
                "nunca usado",
                "inserido pelos programas quando entram no processador",
                "necessário para realizar qualquer I / O",
                "permitido apenas para o sistema operacional",
                "apenas permitido para o sistema operacional ",
                " B ");
        this.addQuestionOS (q23);

        QuestionOS q24 = new QuestionOS (
                "Qual das seguintes etapas de instrução, seria escrito dentro " +
                        "da caixa em forma de diamante, de um fluxograma?",
                "S = B - C", "IS A <10", "PRINT A", "DATA X, 4Z",
                "IS A <10",
                "B");
        this.addQuestionOS (q24);

        QuestionOS q25 = new QuestionOS (
                "Qual das seguintes afirmações é falsa?",
                "A técnica de compactação de armazenamento envolve mover" +
                        " todas as áreas ocupadas de armazenamento para uma " +
                        "extremidade ou outra do armazenamento principal",
                "a compactação não envolve realocação de programas",
                "compactação também é conhecida como coleta de lixo",
                "o sistema deve parar tudo enquanto realiza a compactação",
                "compactação não envolve realocação de programas",
                "B");
        this.addQuestionOS (q25);

        QuestionOS q26 = new QuestionOS (
                "Comunicação entre processos", "é necessária para " +
                "todos os processos",
                "geralmente é feita através de drives de disco",
                "nunca é necessário",
                "permite que os processos sincronizem a atividade",
                "permite que os processos sincronizem a atividade",
                "B");
        this.addQuestionOS (q26);

        QuestionOS q27 = new QuestionOS (
                "Qual das seguintes funções é (são) realizadas pelo carregador",
                "alocar espaço na memória para os programas e resolver " +
                        "referências simbólicas entre conjuntos de objetos",
                "ajustar todos os locais dependentes de endereço, como constantes" +
                        " de endereço , para corresponder ao espaço alocado ",
                " coloque fisicamente as instruções da máquina e os dados na memória ",
                " Todas as anteriores ",
                " Todas as anteriores ",
                " B ");
        this.addQuestionOS (q27);

        QuestionOS q28 = new QuestionOS (
                "Sistemas de fácil utilização são:",
                "necessário para programação orientada a objetos",
                "fácil de desenvolver",
                "comum entre sistemas operacionais de mainframe tradicionais",
                "tornando-se mais comum",
                "tornando-se mais comum" ,
                "B");
        this.addQuestionOS (q28);

        QuestionOS q29 = new QuestionOS (
                "Qual dos seguintes modos de endereçamento facilita " +
                        "o acesso a um operando cuja localização é definida em " +
                        "relação ao início da estrutura de dados em que aparece?",
                "Ascendente", "ordenação", "índice", "indireto",
                "índice",
                "B");
        this.addQuestionOS (q29);

        QuestionOS q30 = new QuestionOS (
                "Ao executar o DOS em um PC, qual comando seria usado para " +
                        "duplicar o disquete inteiro?",
                "COPY", "DISKCOPY", "CHKDSK", "TYPE",
                "DISKCOPY",
                "B" );
        this.addQuestionOS (q30);

        QuestionOS q31 = new QuestionOS (
                "Memória",
                "é um dispositivo que realiza uma sequência de operações especificadas" +
                        " por instruções na memória.",
                "É o dispositivo onde a informação é armazenada",
                "é uma sequência de instruções",
                "é tipicamente caracterizada por processamento interativo e " +
                        "divisão de tempo da CPU para permitir uma resposta rápida a cada usuário. ",
                " é o dispositivo onde as informações são armazenadas ",
                " B ");
        this.addQuestionOS (q31);

        QuestionOS q32 = new QuestionOS (
                "Qual das seguintes regras exclui o uso de GO TO?",
                "Fluxograma",
                "HIPO-DIAGRAMS", "Diagrama de Nassi-Shneiderman",
                "Todos os anteriores",
                "Diagrama de Nassi-Shneiderman ",
                " B ");
        this.addQuestionOS (q32);

        QuestionOS q33 = new QuestionOS (
                "Um programa de sistema que configura um programa executável na memória " +
                        "principal pronto para execução é",
                "assembler", "linker", "loader", "compiler",
                "loader",
                "B");
        this.addQuestionOS (q33);

        QuestionOS q34 = new QuestionOS (
                "Um programa de sistema que configura um programa executável " +
                        "na memória principal pronto para execução é",
                "assembler", "linker", "loader", "compiler",
                "loader",
                "B");
        this.addQuestionOS (q34);

        QuestionOS q35 = new QuestionOS (
                "Quais dos seguintes são carregados na memória principal quando o " +
                        "computador é inicializado?",
                "Instruções de comando interno",
                "instruções de comando externo",
                "programas utilitários",
                "instruções de processamento de texto",
                "comando interno instruções ",
                " B ");
        this.addQuestionOS (q35);

        QuestionOS q36 = new QuestionOS (
                "O algoritmo FIFO",
                "executa primeiro o trabalho que entrou na fila por último",
                "executa primeiro o trabalho que entrou na fila",
                "executa primeiro o trabalho que está há mais tempo na fila" ,
                "executa primeiro o trabalho com o mínimo de necessidades do processador",
                "executa primeiro o trabalho que entrou primeiro na fila",
                "B");
        this.addQuestionOS (q36);

        QuestionOS q37 = new QuestionOS (
                "Qual é o nome dado à coleção organizada de software que controla o " +
                        "funcionamento geral de um computador?",
                "Sistema de trabalho",
                "Sistema periférico",
                "Sistema operacional",
                "Sistema de controle",
                " Sistema operacional ",
                " B ");
        this.addQuestionOS (q37);

        QuestionOS q38 = new QuestionOS (
                "O princípio da localidade de referência justifica o uso de",
                "reenterável",
                "não reutilizável",
                "memória virtual",
                "memória cache",
                "memória cache",
                "B");
        this.addQuestionOS (q38);

        QuestionOS q39 = new QuestionOS (
                "O registro ou local da memória principal que contém o endereço" +
                        " efetivo do operando é conhecido como",
                "ponteiro",
                "registro indexado",
                "localização especial",
                "bloco de rascunho",
                "ponteiro",
                " B ");
        this.addQuestionOS (q39);

        QuestionOS q40 = new QuestionOS (
                "A base de dados de código de montagem está associada a",
                "versão em linguagem de montagem do programa que é criada pela fase de " +
                        "geração de código e é inserida na fase de montagem.",
                "Uma tabela permanente de regras de decisão no forma de padrões " +
                        "para combinar com a tabela de símbolos uniforme para " +
                        "descobrir a estrutura sintática. ",
                " consiste em uma lista completa ou parcial ou os tokens conforme " +
                        "aparecem no programa. Criado por análise lexical e usado " +
                        "para análise e interpretação de sintaxe. ",
                " uma tabela permanente que lista todas as palavras-chave e " +
                        "símbolos especiais da linguagem em forma simbólica. ",
                " versão em linguagem de montagem do programa que é criada pela " +
                        "fase de geração de código e é inserida na fase de montagem. ",
                " B ");
        this.addQuestionOS (q40);

        QuestionOS q41 = new QuestionOS (
                "Thrashing pode ser evitado se",
                "as páginas, pertencentes ao conjunto de trabalho dos " +
                        "programas, estiverem na memória principal",
                "a velocidade da CPU é aumentada",
                "a velocidade do processador I / O é acrescido ",
                " todas as anteriores ",
                " as páginas, pertencentes ao conjunto de trabalho dos programas," +
                        " estão na memória principal ",
                " B ");
        this.addQuestionOS (q41);

        QuestionOS q42 = new QuestionOS(
                "Ao analisar a compilação do programa PL / I, o " +
                        "termo \"Análise lexical\" está associado com",
                "reconhecimento de construções sintáticas básicas por meio de reduções.",
                "reconhecimento de elementos básicos e criação de símbolos uniformes",
                "criação de mais matriz opcional.",
                "uso de processador de macro para produzir código de montagem mais otimizado",
                "reconhecimento de elementos básicos e criação de símbolos uniformes",
                "B");
        this.addQuestionOS(q42);

        QuestionOS q43 = new QuestionOS (
                "A resolução de símbolos definidos externamente é realizada por",
                "Linker", "Loader", "Compiler", "Assembler",
                "Linker",
                "B");
        this.addQuestionOS (q43);

        QuestionOS q44 = new QuestionOS (
                "Geração de sistema:",
                "é sempre bastante simples",
                "é sempre muito difícil",
                "varia em dificuldade entre sistemas",
                "requer ferramentas extensas para ser compreensível",
                "varia em dificuldade entre sistemas",
                "B");
        this.addQuestionOS (q44);

        QuestionOS q45 = new QuestionOS(
                "O Registro de Endereço de Memória",
                "é um dispositivo de memória de hardware que denota a localização " +
                        "da instrução atual sendo executada.",
                "é um grupo de circuitos elétricos (hardware), que realiza a intenção " +
                        "de instruções buscadas na memória.",
                "contém o endereço do local da memória que deve ser lido ou armazenado.",
                "contém uma cópia do local de memória designado especificado " +
                        "pelo MAR após uma \"leitura\" ou o novo conteúdo da memória " +
                        "antes de uma\"escrita\".",
                "contém o endereço do local da memória que deve ser lido ou armazenado.",
                "B");
        this.addQuestionOS(q45);

        QuestionOS q46 = new QuestionOS (
                "Em sistemas de memória virtual, tradução dinâmica de endereços",
                "é o hardware necessário para implementar paginação",
                "armazena páginas em um local específico no disco",
                "é inútil quando a troca é usada",
                "faz parte do algoritmo de paginação do sistema operacional ",
                " é o hardware necessário para implementar a paginação ",
                " B ");
        this.addQuestionOS (q46);

        QuestionOS q47 = new QuestionOS (
                "Fragmentação do sistema de arquivos",
                "ocorre apenas se o sistema de arquivos for usado incorretamente",
                "sempre pode ser evitado",
                "pode ​​ser removido temporariamente por compactação",
                "é uma característica de todos os sistemas de arquivos ",
                " pode ser removido temporariamente por compactação ",
                " B ");
        this.addQuestionOS (q47);

        QuestionOS q48 = new QuestionOS (
                "Um programa não realocável é aquele que",
                "não pode ser executado em qualquer área de armazenamento que não" +
                        " a designada para ele no momento de sua codificação ou tradução.",
                "Consiste em um programa e informações relevantes para a sua realocação. ",
                " pode ele mesmo realizar a realocação de suas partes sensíveis ao endereço. ",
                " todas as opções acima ",
                " não podem ser executadas em qualquer área de armazenamento diferente" +
                        " da designada para ele no momento de sua codificação ou tradução. ",
                " B ");
        this.addQuestionOS (q48);

        QuestionOS q49 = new QuestionOS (
                "Quais dos seguintes são (são) Processadores de linguagem",
                "monta", "compiladores", "intérpretes", "Todos os anteriores",
                "Todos os anteriores",
                "B ");
        this.addQuestionOS (q49);

        QuestionOS q50 = new QuestionOS (
                "Em qual modo de endereçamento o endereço efetivo do operando é " +
                        "o conteúdo de um registro especificado na instrução e após o " +
                        "acesso ao operando, o conteúdo deste registro é incrementado " +
                        "para apontar para o próximo item da lista? ",
                " endereçamento de índice ",
                " endereçamento indireto ",
                " incremento automático ",
                " decremento automático ",
                " incremento automático ",
                " B ");
        this.addQuestionOS (q50);

        QuestionOS q51 = new QuestionOS(
                "O esquema de alocação de memória está sujeito a \"externa\" fragmentação é",
                "segmentação",
                "trocando",
                "paginação de demanda pura",
                "múltiplas partições fixas contíguas",
                "segmentação",
                "I");
        this.addQuestionOS(q51);

        QuestionOS q52 = new QuestionOS (
                "Enquanto estiver trabalhando com MS-DOS, qual comando você usará " +
                        "para transferir um arquivo específico de um disco para outro?",
                "DISKCOPY", "COPY", "RENAME", "FORMAT",
                "COPY ",
                "EU");
        this.addQuestionOS (q52);

        QuestionOS q53 = new QuestionOS (
                "Qual é o nome do sistema operacional do laptop chamado MacLite?",
                "Windows", "DOS", "MS-DOS", "OZ",
                "OZ",
                "I") ;
        this.addQuestionOS (q53);

        QuestionOS q54 = new QuestionOS (
                "Em qual modo de endereçamento o conteúdo de um registro " +
                        "especificado na instrução é primeiro diminuído e, em seguida, " +
                        "esse conteúdo é usado como o endereço efetivo dos operandos?",
                "Endereçamento de índice",
                "endereçamento indireto",
                "auto incremento",
                "auto decremento",
                "auto decremento",
                "I");
        this.addQuestionOS (q54);

        QuestionOS q55 = new QuestionOS (
                "Qual é o nome dado aos valores que são fornecidos automaticamente" +
                        " pelo software para reduzir o pressionamento de teclas e melhorar a " +
                        "produtividade do usuário do computador?",
                "Valores definidos",
                "Valores fixos",
                "Valores padrão",
                "Especial valores ",
                " Valores padrão ",
                " I ");
        this.addQuestionOS (q55);

        QuestionOS q56 = new QuestionOS (
                "Roubo de página",
                "é um sinal de um sistema eficiente",
                "está pegando frames de página de outros conjuntos de trabalho",
                "deve ser o objetivo do ajuste",
                "está ocupando espaço em disco maior para páginas paginadas ",
                " está pegando quadros de página de outros conjuntos de trabalho ",
                " I ");
        this.addQuestionOS (q56);

        QuestionOS q57 = new QuestionOS (
                "No MS-DOS 5.0, qual é o número que atua como um código para " +
                        "identificar exclusivamente o produto de software?",
                "MS", "DOS", "MS DOS", "5.0",
                "5.0 ",
                "EU");
        this.addQuestionOS (q57);

        QuestionOS q58 = new QuestionOS (
                "Bug significa",
                "Um erro lógico em um programa",
                "Um erro de sintaxe difícil em um programa",
                "Documentando programas usando uma ferramenta de documentação eficiente",
                "Todas as opções acima",
                "Uma lógica erro em um programa ",
                " I ");
        this.addQuestionOS (q58);

        QuestionOS q59 = new QuestionOS (
                "Gerenciamento de memória é:",
                "não usado no sistema operacional moderno",
                "substituído por memória virtual nos sistemas atuais",
                "não usado em sistemas de multiprogramação",
                "crítico até mesmo para os sistemas operacionais mais simples",
                "crítico até mesmo para os sistemas operacionais mais simples",
                "I");
        this.addQuestionOS (q59);

        QuestionOS q60 = new QuestionOS (
                "O valor inicial do semáforo que permite que apenas um dos " +
                        "muitos processos entre em suas seções críticas, é",
                "8", "1", "16", "0",
                "1",
                "EU");
        this.addQuestionOS (q60);

        QuestionOS q61 = new QuestionOS (
                "As instruções Register-to-Register (RR)",
                "têm seus operandos na loja principal.",
                "Que executam uma operação em um operando de registro e em um operando " +
                        "localizado na loja principal. , geralmente deixando o resultado " +
                        "no registro, exceto no caso de operação de armazenamento quando " +
                        "também é escrito no local de armazenamento especificado. ",
                " que executa as operações indicadas em dois registros rápidos da máquina " +
                        "e deixa o resultado em um dos registros . ",
                " todas as anteriores ",
                " que realizam as operações indicadas em dois registros rápidos da máquina" +
                        " e deixam o resultado em um dos registros. ",
                " I ");
        this.addQuestionOS (q61);

        QuestionOS q62 = new QuestionOS (
                "Um erro de página",
                "é um erro é uma página específica",
                "ocorre quando um programa acessa uma página da memória",
                "é um acesso a uma página que não está na memória",
                "é um referência a uma página pertencente a outro programa ",
                " é um acesso a uma página que não está atualmente na memória ",
                " I ");
        this.addQuestionOS (q62);

        QuestionOS q63 = new QuestionOS (
                "Um algoritmo é melhor descrito como",
                "Uma linguagem de computador",
                "Um procedimento passo a passo para resolver um problema",
                "Um ramo da matemática", "Todas as anteriores",
                "Um passo procedimento passo a passo para resolver um problema ",
                " I ");
        this.addQuestionOS (q63);

        QuestionOS q64 = new QuestionOS (
                "O processo de transferência de dados destinados a um dispositivo " +
                        "periférico para um disco (ou armazenamento intermediário) " +
                        "para que possam ser transferidos para um periférico em um " +
                        "momento mais conveniente ou em massa, é conhecido como",
                "multiprogramação" , "spool", "cache", "programação virtual",
                "spool",
                "I");
        this.addQuestionOS (q64);

        QuestionOS q65 = new QuestionOS (
                "Caches de bloco ou caches de buffer são usados",
                "para melhorar o desempenho do disco",
                "para lidar com interrupções",
                "para aumentar a capacidade da memória principal",
                "para acelerar a operação de leitura da memória principal",
                "para melhorar o desempenho do disco",
                "I");
        this.addQuestionOS (q65);

        QuestionOS q66 = new QuestionOS (
                "Qual das seguintes afirmações é falsa?",
                "Um tamanho de página pequeno causa tabelas de páginas grandes",
                "a fragmentação interna é aumentada com páginas pequenas",
                "um tamanho de página grande causa instruções e dados que não ser" +
                        " referenciado colocado no armazenamento primário ",
                " As transferências de E / S são mais eficientes com páginas grandes ",
                " a fragmentação interna é aumentada com páginas pequenas ",
                " I ");
        this.addQuestionOS (q66);

        QuestionOS q67 = new QuestionOS (
                "A ação de analisar o programa de origem nas classes sintáticas" +
                        " adequadas é conhecida como",
                "análise de sintaxe",
                "análise lexical",
                "análise de interpretação",
                "análise de sintaxe geral",
                "análise lexical",
                "EU");
        this.addQuestionOS (q67);

        QuestionOS q68 = new QuestionOS (
                "Qual dos seguintes não é verdadeiro sobre a descrição de uma tabela de decisão?",
                "Uma tabela de decisão é fácil de modificar",
                "Uma tabela de decisão é diretamente entendida pelo computador",
                "Uma decisão a tabela é fácil de entender ",
                " Todas as anteriores ",
                " Uma tabela de decisão é compreendida diretamente pelo computador ",
                " I ");
        this.addQuestionOS (q68);

        QuestionOS q69 = new QuestionOS (
                "programas Cavalo de Tróia",
                "são programas legítimos que permitem acesso não autorizado",
                "geralmente não funcionam",
                "são programas ocultos que não aparecem no sistema",
                "geralmente são descobertos imediatamente" ,
                "são programas legítimos que permitem acesso não autorizado",
                "I");
        this.addQuestionOS (q69);

        QuestionOS q70 = new QuestionOS (
                "Quando a IBM lançou a primeira versão do sistema operacional de disco DOS versão 1.0?",
                "1981", "1982", "1983", "1984",
                "1981",
                "I");
        this.addQuestionOS (q70);

        QuestionOS q71 = new QuestionOS (
                "Qual das afirmações a seguir é falsa sobre o disco quando comparado à memória principal?",
                "Não volátil",
                "maior capacidade de armazenamento",
                "menor preço por bit", "mais rápido",
                "mais rápido",
                "EU");
        this.addQuestionOS (q71);

        QuestionOS q72 = new QuestionOS (
                "Problema do consumidor do produtor pode ser resolvido usando",
                "semáforos",
                "contadores de eventos",
                "monitores", "todos os anteriores",
                "todos os anteriores",
                "I");
        this.addQuestionOS (q72);

        QuestionOS q73 = new QuestionOS (
                "A maioria dos sistemas operacionais de microcomputadores como Apple DOS," +
                        " MS DOS e PC DOS etc. são chamados de sistemas operacionais de disco porque",
                "eles residem na memória",
                "são inicialmente armazenados no disco",
                "eles estão disponíveis em fitas magnéticas ",
                " estão parcialmente na memória primária e parcialmente no disco ",
                " são inicialmente armazenados no disco ",
                " I ");
        this.addQuestionOS (q73);

        QuestionOS q74 = new QuestionOS (
                "A CPU, após receber uma interrupção de um dispositivo de I / O",
                "pára por um tempo predeterminado",
                "entrega o controle do barramento de endereço e barramento de " +
                        "dados para o dispositivo de interrupção",
                "ramifica para a rotina de interrupção de serviço imediatamente ",
                " ramifica-se para a rotina de interrupção de serviço após a " +
                        "conclusão da instrução atual ",
                " ramifica-se para a rotina de interrupção de serviço após a" +
                        " conclusão da instrução atual ",
                " I ");
        this.addQuestionOS (q74);

        QuestionOS q75 = new QuestionOS (
                "Seeks analysis",
                "é usado para analisar problemas de paging",
                "é usado para analisar problemas de unidade de controle ocupada",
                "é mostrado apenas em telas em tempo real",
                "é usado para analisar dispositivo ocupado problemas ",
                " é usado para analisar problemas de ocupação do dispositivo ",
                " I ");
        this.addQuestionOS (q75);

        QuestionOS q76 = new QuestionOS (
                "Qual é um banco de dados permanente no modelo geral de compilador?",
                "Tabela Literal",
                "Tabela Identificador",
                "Tabela Terminal",
                "Código-fonte",
                "Tabela Terminal",
                "I") ;
        this.addQuestionOS (q76);

        QuestionOS q77 = new QuestionOS (
                "Qual é o nome da técnica em que o sistema operacional " +
                        "de um computador executa vários programas simultaneamente " +
                        "alternando entre eles?",
                "Particionamento", "Multitarefa", "Janelas", "Paginação ",
                " Multitarefa ",
                " I ");
        this.addQuestionOS (q77);

        QuestionOS q78 = new QuestionOS (
                "Sistema operacional",
                "vincula um programa às sub-rotinas às quais faz referência",
                "fornece uma interface amigável em camadas",
                "permite ao programador desenhar um fluxograma",
                "todas as opções anteriores",
                "fornece uma interface amigável em camadas",
                "I");
        this.addQuestionOS (q78);

        QuestionOS q79 = new QuestionOS (
                "Software que mede, monitora, analisa e controla eventos " +
                        "do mundo real é chamado de:",
                "software de sistema",
                "software em tempo real",
                "software científico",
                "software de negócios",
                "real -time software ",
                " I ");
        this.addQuestionOS (q79);

        QuestionOS q80 = new QuestionOS (
                "Os detalhes de todos os símbolos externos e formação " +
                        "de realocação (lista de realocação ou mapa) são fornecidos " +
                        "ao vinculador por",
                "Processador de macro",
                "Tradutor", "Carregador",
                "Editor",
                "Tradutor",
                "EU");
        this.addQuestionOS (q80);

        QuestionOS q81 = new QuestionOS (
                "O processador de macro deve executar",
                "reconhecer definições de macro e chamadas de macro",
                "salvar as definições de macro",
                "expandir chamadas de macros e substituir argumentos",
                "todos os anteriores",
                "todos os acima de ",
                " I ");
        this.addQuestionOS (q81);

        QuestionOS q82 = new QuestionOS (
                "Uma estratégia de desenvolvimento em que os módulos " +
                        "de controle executivo de um sistema são codificados e " +
                        "testados primeiro, é conhecida como",
                "Desenvolvimento de baixo para cima",
                "Desenvolvimento de cima para baixo",
                "Desenvolvimento de esquerda para direita",
                "Todas as opções anteriores",
                "Desenvolvimento de cima para baixo",
                "I");
        this.addQuestionOS (q82);

        QuestionOS q83 = new QuestionOS (
                "Qual das alternativas a seguir é útil para avaliar o " +
                        "software de aplicativos que melhor atende às suas necessidades?",
                "Recomendações de outros usuários",
                "revistas de informática",
                "análises objetivas de software",
                "todas as opções anteriores" ,
                "todas as anteriores",
                "I");
        this.addQuestionOS (q83);

        QuestionOS q84 = new QuestionOS (
                "Qual problema é resolvido pelo algoritmo do banqueiro de Dijkstra?",
                "Exclusão mútua",
                "recuperação de deadlock",
                "prevenção de deadlock",
                "coerência de cache",
                "prevenção de deadlock",
                "I");
        this.addQuestionOS (q84);

        QuestionOS q85 = new QuestionOS (
                "O despachante",
                "realmente agenda as tarefas no processador",
                "coloca tarefas em espera de E / S",
                "é sempre pequeno e simples",
                "nunca muda as prioridades das tarefas",
                "realmente agenda o tarefas no processador ",
                " I ");
        this.addQuestionOS (q85);

        QuestionOS q86 = new QuestionOS (
                "Programas de sistema, como Compiladores, são projetados de forma que sejam",
                "reentráveis",
                "não reutilizáveis",
                "utilizáveis ​​em série",
                "recursivos",
                "reenteráveis", "I");
        this.addQuestionOS (q86);

        QuestionOS q87 = new QuestionOS (
                "A IBM lançou seu primeiro PC em 1981. Você pode citar o " +
                        "sistema operacional que era mais popular naquela época?",
                "MS-DOS", "PC-DOS", "OS / 360", " CP / M ",
                " CP / M ",
                " I ");
        this.addQuestionOS (q87);

        QuestionOS q88 = new QuestionOS (
                "Se o número de bits em um endereço virtual de um programa " +
                        "é 16 e o ​​tamanho da página é 0,5 K bytes, o número de páginas" +
                        " no espaço de endereço virtual é",
                "16", "32", "64", "128",
                "128",
                "I");
        this.addQuestionOS (q88);

        QuestionOS q89 = new QuestionOS (
                "Qual tabela é um banco de dados permanente que possui " +
                        "uma entrada para cada símbolo de terminal.",
                "Tabela de terminais",
                "Reduções",
                "Tabela de identificadores",
                "Tabela literal",
                "Tabela de terminais", "I ");
        this.addQuestionOS (q89);

        QuestionOS q90 = new QuestionOS (
                "A(s) função(ões) da fase de sintaxe é (são)",
                "para reconhecer as principais construções da linguagem e para " +
                        "chamar as rotinas de ação apropriadas que irão gerar a " +
                        "forma intermediária ou matriz para essas construções. ",
                " para construir uma tabela literal e uma tabela de identificadores ",
                " para construir uma tabela de símbolos uniforme ",
                " para analisar o programa de origem nos elementos básicos ou tokens da linguagem. ",
                " para reconhecer as principais construções da linguagem e chamar as" +
                        " rotinas de ação apropriadas que irão gerar a forma ou matriz " +
                        "intermediária para essas construções. ",
                " I ");
        this.addQuestionOS (q90);

        QuestionOS q91 = new QuestionOS (
                "Troca",
                "funciona melhor com muitas partições pequenas",
                "permite que muitos programas usem memória simultaneamente",
                "permite que cada programa por sua vez use a memória",
                "não funciona com sobreposição33",
                " permite que cada programa, por sua vez, use a memória ",
                " I ");
        this.addQuestionOS (q91);

        QuestionOS q92 = new QuestionOS (
                "Um algoritmo de escalonamento de disco em um sistema " +
                        "operacional faz com que o braço do disco se mova para frente " +
                        "e para trás pela superfície do disco para atender a todas as " +
                        "solicitações em seu caminho. Este é um",
                "Primeiro a chegar, primeiro servido",
                "Shortest Seek Time First (SSTE)",
                "Scan", "FIFO",
                "Scan",
                "I");
        this.addQuestionOS (q92);

        QuestionOS q93 = new QuestionOS (
                "Um tradutor é melhor descrito como",
                "um software de aplicativo",
                "um software de sistema",
                "um componente de hardware",
                "todos os anteriores",
                "um software de sistema",
                "I") ;
        this.addQuestionOS (q93);

        QuestionOS q94 = new QuestionOS (
                "Criptografia de dados",
                "é usado principalmente por redes públicas",
                "é usado principalmente por redes financeiras",
                "não pode ser usado por instalações privadas",
                "não é necessário, uma vez que os dados não podem ser interceptados",
                "é usado principalmente por redes financeiras",
                "I");
        this.addQuestionOS (q94);

        QuestionOS q95 = new QuestionOS (
                "Qual é o nome dado ao processo de inicialização de " +
                        "um microcomputador com seu sistema operacional?",
                "Inicialização a frio",
                "Inicialização",
                "Inicialização a quente",
                "Gravação de inicialização",
                "Inicialização",
                " EU");
        this.addQuestionOS (q95);

        QuestionOS q96 = new QuestionOS (
                "A (s) função (ões) da Atribuição de Armazenamento é (são)",
                "para atribuir armazenamento a todas as variáveis ​​referenciadas " +
                        "no programa de origem.",
                "Para atribuir armazenamento a todos os locais temporários que" +
                        " são necessários para intermediários resultados ",
                " para atribuir armazenamento a literais e para garantir que o " +
                        "armazenamento seja alocado e os locais apropriados sejam inicializados. ",
                " todos os anteriores ",
                " todos os anteriores ",
                " I ");
        this.addQuestionOS (q96);

        QuestionOS q97 = new QuestionOS (
                "Um Processador",
                "é um dispositivo que executa uma sequência de operações especificadas " +
                        "por instruções na memória.",
                "É o dispositivo onde as informações são armazenadas",
                "é uma sequência de instruções",
                "é tipicamente caracterizado por processamento interativo e tempo de " +
                        "tempo da CPU para permitir resposta rápida a cada usuário ",
                " é um dispositivo que realiza uma seqüência de operações " +
                        "especificadas por instruções em memória ",
                " I ");
        this.addQuestionOS (q97);

        QuestionOS q98 = new QuestionOS (
                "Com o MS-DOS, qual comando dividirá a superfície do " +
                        "disquete vazio em setores e atribuirá um endereço único a cada um?",
                "Comando FORMAT",
                "Comando FAT",
                "Comando VER",
                "Comando CHKDSK",
                "comando FORMAT",
                "I");
        this.addQuestionOS (q98);

        QuestionOS q99 = new QuestionOS (
                "Multiprogramação",
                "é um método de alocação de memória pelo qual o programa " +
                        "é subdividido em partes iguais, ou as páginas e o núcleo" +
                        " são subdivididos em partes iguais ou blocos.",
                "Consiste nos endereços que podem ser gerados por um " +
                        "processador durante a execução de um cálculo ",
                " é um método de alocação de tempo do processador. ",
                " permite que vários programas residam em áreas " +
                        "separadas do núcleo no momento ",
                " permite que vários programas residam em áreas separadas do núcleo no tempo ",
                " I ");
        this.addQuestionOS (q99);

        QuestionOS q100 = new QuestionOS (
                "Um tradutor que lê um programa inteiro escrito em uma " +
                        "linguagem de alto nível e o converte em código de linguagem " +
                        "de máquina é:",
                "assembler", "tradutor", "compilador", "software do sistema",
                "compilador ",
                "EU");
        this.addQuestionOS (q100);

        QuestionOS q101 = new QuestionOS (
                "Se a data e hora do sistema exibida estiverem incorretos, você " +
                        "pode redefini-los usando",
                "Escrever", "Calendário", "Painel de controle", "Centro de ação",
                "Painel de controle",
                "E" );
        this.addQuestionOS (q101);

        QuestionOS q102 = new QuestionOS (
                "Você deve salvar seu computador de",
                "vírus", "worms", "malwares", "todos os anteriores",
                "todos os anteriores",
                "E");
        this.addQuestionOS (q102);

        QuestionOS q103 = new QuestionOS (
                "World Wide Web está sendo padronizado por",
                "Worldwide INC", "W3C", "World Wide Consortium", "World Wide Web Standard",
                "W3C",
                "E");
        this.addQuestionOS (q103);

        QuestionOS q104 = new QuestionOS (
                "Qual dos seguintes é um grupo de programa?",
                "Acessórios", "MS WORD", "Paint", "SharePoint",
                "Acessórios",
                "E");
        this.addQuestionOS (q104);

        QuestionOS q105 = new QuestionOS (
                "Qual sistema operacional não suporta mais de um programa por vez?",
                "DOS", "Linux", "Windows", "Unix",
                "DOS",
                "E");
        this.addQuestionOS (q105);

        QuestionOS q106 = new QuestionOS (
                "Linus é",
                "Código aberto", "Windows", "caro", "MAC",
                "Código aberto",
                "E");
        this.addQuestionOS (q106);

        QuestionOS q107 = new QuestionOS (
                "Qual deles não é um SO",
                "P11", "OS / 2", "Windows", "Unix",
                "P11",
                "E");
        this.addQuestionOS (q107);

        QuestionOS q108 = new QuestionOS (
                "Qual deles não é um sistema operacional multitarefa",
                "Windows", "Linux", "Win NT", "DOS",
                "DOS",
                "E");
        this.addQuestionOS (q108);

        QuestionOS q109 = new QuestionOS (
                "Uma interface de usuário fácil de usar é",
                "fácil de usar", "amigável", "simples de usar", "nenhum desses",
                "amigável",
                "E");
        this.addQuestionOS (q109);

        QuestionOS q110 = new QuestionOS (
                "Qual é a função do botão de rádio?",
                "Para selecionar várias opções",
                "Para selecionar uma opção",
                "Para selecionar todas as opções",
                "Todas as opções acima",
                "Para selecionar uma única opção" ,
                "E");
        this.addQuestionOS (q110);

        QuestionOS q111 = new QuestionOS (
                "Qual comando é usado para exibir o conteúdo do arquivo de texto no DOS?",
                "Copiar con", "copiar", "tipo", "dir",
                "tipo",
                "E");
        this.addQuestionOS (q111);

        QuestionOS q112 = new QuestionOS (
                "Arquivo essencial do disco de inicialização do MSDOS é:",
                "COMMAND.COM", "START.COM", "TREE.COM", "VER.COM",
                "COMMAND.COM",
                "E" );
        this.addQuestionOS (q112);

        QuestionOS q113 = new QuestionOS (
                "Qual comando é usado para ver a versão do SO?",
                "Vol", "versão", "ver", "volume",
                "ver",
                "E");
        this.addQuestionOS (q113);

        QuestionOS q114 = new QuestionOS (
                "Quais dos seguintes são carregados no modo de segurança?",
                "Driver do teclado", "Driver do mouse", "Driver VGA", "Todos",
                "Todos",
                "E");
        this.addQuestionOS (q114);

        QuestionOS q115 = new QuestionOS (
                "O aloritmo dos banqueiros é usado para",
                "retificar deadlock",
                "detectar deadlock",
                "prevenir deadlock",
                "retardar deadlock",
                "prevenir deadlock",
                "E");
        this.addQuestionOS (q115);

        QuestionOS q116 = new QuestionOS (
                "Qual das seguintes opções é uma lista suspensa?",
                "Lista", "Caixa de combinação", "Área de texto", "Nenhum",
                "Caixa de combinação",
                "E");
        this.addQuestionOS (q116);

        QuestionOS q117 = new QuestionOS (
                "Uma falha de página ocorre quando",
                "o impasse acontece",
                "a segmentação começa",
                "a página é encontrada na memória",
                "a página não é encontrada na memória",
                "a página não é encontrado na memória ",
                " E ");
        this.addQuestionOS (q117);

        QuestionOS q118 = new QuestionOS (
                "Barra de tarefas é usada para",
                "Navegação",
                "Alternar programas",
                "Iniciar um programa",
                "Todos os anteriores",
                "Todos os anteriores",
                "E");
        this.addQuestionOS (q118);

        QuestionOS q119 = new QuestionOS (
                "O que é Dr.Watson?",
                "Especialista em TI",
                "Ferramenta de diagnóstico",
                "Cirurgião",
                "Nenhum",
                "Especialista em TI",
                "E");
        this.addQuestionOS (q119);

        QuestionOS q120 = new QuestionOS (
                "O comando usado para criar unidade lógica para localização específica do disco",
                "FDisk", "Formato", "Subst", "Todos os anteriores",
                "Subst",
                "E");
        this.addQuestionOS (q120);

        QuestionOS q121 = new QuestionOS (
                "Executar vários programas ao mesmo tempo é chamado",
                "Multitarefa",
                "Tarefas em segundo plano",
                "Tarefas em primeiro plano",
                "Nenhuma das anteriores",
                "Multitarefa",
                "E");
        this.addQuestionOS (q121);

        QuestionOS q122 = new QuestionOS (
                "Roubo de página",
                "é um sinal de um sistema eficiente",
                "Está tirando quadro de página de outros conjuntos de trabalho",
                "Deve ser a meta de giro",
                "Está ocupando espaço em disco de camada para página na página out ",
                " está tirando quadro de página de outros conjuntos de trabalho ",
                " E ");
        this.addQuestionOS (q122);

        QuestionOS q123 = new QuestionOS (
                "O que você quer dizer com caixa de diálogo?",
                "Caixa de mensagem interativa",
                "Grupo de opções",
                "Conjunto de controles",
                "Todas as opções acima",
                "Todas as opções acima",
                " E ");
        this.addQuestionOS (q123);

        QuestionOS q124 = new QuestionOS (
                "Conexão discada permite",
                "Conectar ISP", "Internet", "Servidor", "Todos os itens acima",
                "Conectar ISP",
                "E");
        this.addQuestionOS (q124);

        QuestionOS q125 = new QuestionOS (
                "O que não é uma ferramenta de sistema?",
                "Pasta", "Backup", "Scandisk", "Formato",
                "Pasta",
                "E");
        this.addQuestionOS (q125);

        QuestionOS q126 = new QuestionOS (
                "Scandisk", "Verifica o disco",
                "Fornece informações sobre o disco",
                "Executar no modo DOS",
                "Todas as opções anteriores",
                "Todas as opções anteriores",
                "E");
        this.addQuestionOS (q126);

        QuestionOS q127 = new QuestionOS (
                "Arquivo em lote é usado para",
                "Executar programa",
                "Mostrar o conteúdo",
                "executar comandos automaticamente",
                "Todos os itens acima",
                "Todos os itens acima",
                "E");
        this.addQuestionOS (q127);

        QuestionOS q128 = new QuestionOS (
                "Qual dos seguintes não é estados de processo?",
                "Novo", "Pronto", "Executando", "Concluído",
                "Concluído",
                "E");
        this.addQuestionOS (q128);

        QuestionOS q129 = new QuestionOS (
                "Podemos iniciar o aplicativo?",
                "Logoff", "Local de rede", "Lixeira", "Executar",
                "Executar",
                "E");
        this.addQuestionOS (q129);

        QuestionOS q130 = new QuestionOS (
                "O que você digita no prompt de comando do DOS para retornar ao Windows?",
                "Comando", "Sair", "Sair", "Retornar",
                "Sair",
                "E");
        this.addQuestionOS (q130);

        QuestionOS q131 = new QuestionOS (
                "Qual das alternativas a seguir faz parte do sistema operacional?",
                "Célula", "FAT", "Kernel", "Disco",
                "Kernel",
                "E");
        this.addQuestionOS (q131);

        QuestionOS q132 = new QuestionOS (
                "Dormir é um bom modo de usar porque",
                "Ele economiza energia, o que por sua vez está economizando dinheiro",
                "Ele renova o computador depois de acordar",
                "Consome bateria fraca ao reiniciá-lo ",
                " Todas as opções anteriores ",
                " Economiza energia que por sua vez está economizando dinheiro ",
                " E ");
        this.addQuestionOS (q132);

        QuestionOS q133 = new QuestionOS (
                "O recurso operacional que integra o arquivo criado em diferentes " +
                        "aplicativos em páginas da Web",
                "Integração da Web",
                "Integração da Internet",
                "Integração da intranet",
                "Integração de hipertexto",
                "Integração da Web",
                "E" );
        this.addQuestionOS (q133);

        QuestionOS q134 = new QuestionOS (
                "Qual buraco será alocado no algoritmo Worst-Fit de gerenciamento de memória?",
                "Aloca o buraco menor do que o buraco de memória necessário",
                "Aloca o menor buraco dos buracos de memória disponíveis",
                "Aloca o maior buraco dos buracos de memória disponíveis ",
                " Aloca exatamente o mesmo tamanho do buraco de memória ",
                " Aloca o maior buraco dos buracos de memória disponíveis ",
                " E ");
        this.addQuestionOS (q134);

        QuestionOS q135 = new QuestionOS (
                "BIOS é usado por",
                "Sistema operacional",
                "Compilador",
                "Intérprete",
                "Software aplicativo",
                "Sistema operacional",
                "E");
        this.addQuestionOS (q135);

        QuestionOS q136 = new QuestionOS (
                "Normalmente a rede de rede é chamada",
                "MS Word", "MS Excel", "Internet", "MS Access",
                "Internet",
                "E");
        this.addQuestionOS (q136);

        QuestionOS q137 = new QuestionOS (
                "Localizar pode ser usado para",
                "Localizar um programa",
                "Localizar um documento",
                "Localizar um computador em rede",
                "Todos os anteriores",
                "Todos os anteriores",
                "E");
        this.addQuestionOS (q137);

        QuestionOS q138 = new QuestionOS (
                "Qual dos seguintes é o método de alocação de um espaço em disco?",
                "Alocação contígua",
                "Alocação vinculada",
                "Alocação indexada",
                "Todas as opções acima",
                "Todas as acima" , "E");
        this.addQuestionOS (q138);

        QuestionOS q139 = new QuestionOS (
                "Quando você corta ou copia o texto ou imagem, ele é armazenado temporariamente em",
                "Arquivo", "Área de Transferência", "Ícone", "Todos os acima",
                "Área de Transferência",
                "E") ;
        this.addQuestionOS (q139);

        QuestionOS q140 = new QuestionOS (
                "Um minúsculo ponto de luz no monitor é chamado",
                "Chip de silício", "Ilusão de ótica", "Ícone", "Pixel",
                "Pixel",
                "E");
        this.addQuestionOS (q140);

        QuestionOS q141 = new QuestionOS (
                "Quem é chamado de supervisor da atividade do computador?",
                "Memória",
                "Sistema operacional",
                "Dispositivos de E / S",
                "Unidade de controle",
                "Sistema operacional",
                "E");
        this.addQuestionOS (q141);

        QuestionOS q142 = new QuestionOS (
                "Sistema operacional gerencia",
                "Memória",
                "Processador",
                "Dispositivos de E / S",
                "Todos os anteriores",
                "Todos os anteriores",
                "E");
        this.addQuestionOS (q142);

        QuestionOS q143 = new QuestionOS (
                "Qual dos seguintes conceitos é o melhor para evitar falhas de página?",
                "Paging",
                "The working set",
                "Hit ratios",
                "Address location resolution",
                "Paging",
                "E") ;
        this.addQuestionOS (q143);

        QuestionOS q144 = new QuestionOS (
                "Qual propriedade não é válida para configuração de atributos?",
                "C", "S", "H", "R",
                "C",
                "E");
        this.addQuestionOS (q144);

        QuestionOS q145 = new QuestionOS (
                "Memória virtual normalmente localizada em",
                "RAM", "CPU", "Flash Card", "Disco rígido",
                "Disco rígido",
                "E");
        this.addQuestionOS (q145);

        QuestionOS q146 = new QuestionOS (
                "Estrutura em árvore exibe",
                "Somente arquivo",
                "Somente diretório",
                "Nome do arquivo e diretório",
                "Nenhum dos anteriores",
                "Nome do arquivo e diretório",
                "E");
        this.addQuestionOS (q146);

        QuestionOS q147 = new QuestionOS (
                "Pressione a tecla ____ durante a inicialização para exibir o" +
                        " menu de inicialização avançada",
                "F8", "F5", "Del", "F2",
                "F8",
                "E");
        this.addQuestionOS (q147);

        QuestionOS q148 = new QuestionOS (
                "Qual sistema operacional usa nomes de arquivo curtos?",
                "Windows", "Unix", "DOS", "MAC",
                "DOS",
                "E");
        this.addQuestionOS (q148);

        QuestionOS q149 = new QuestionOS (
                "O que você quer dizer com compactação de memória?",
                "Combine vários buracos de memória iguais em um grande buraco",
                "Combine vários pequenos buracos de memória em um grande buraco",
                "Divida grande buraco de memória em pequenos buracos" ,
                "Divida o buraco da memória por 2",
                "Combine vários pequenos buracos da memória em um grande buraco",
                "E");
        this.addQuestionOS (q149);

        QuestionOS q150 = new QuestionOS (
                "Copiar um processo da memória para o disco para permitir " +
                        "espaço para outros processos é chamado",
                "Swapping", "Deadlock", "Demand Paging", "Page Fault",
                "Swapping",
                "E") ;
        this.addQuestionOS (q150);

    }

    public void addQuestionOS(QuestionOS quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        values.put(KEY_OPTD, quest.getOPTD());
        values.put(KEY_CAT,quest.getCATEGORY());
        // Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }

    private void addQuestionsHardware() {

        QuestionHardWare q1 = new QuestionHardWare (
                "De que local as primeiras instruções do computador estão" +
                        " disponíveis na inicialização?",
                "ROM BIOS", "CPU", "boot.ini", "CONFIG.SYS",
                "ROM BIOS",
                "B ");
        this.addQuestionHardware (q1);

        QuestionHardWare q2 = new QuestionHardWare (
                "O que poderia causar um erro de disco corrigido.",
                "Sem CD instalado",
                "RAM defeituosa",
                "processador lento",
                "Configurações incorretas de CMOS",
                "Configurações incorretas de CMOS",
                "B") ;
        this.addQuestionHardware (q2);

        QuestionHardWare q3 = new QuestionHardWare (
                "A falta de tampas de slot em um computador pode causar?",
                "Superaquecimento",
                "picos de energia",
                "EMI",
                "caminho incompleto para ESD",
                "superaquecimento",
                "B");
        this.addQuestionHardware (q3);

        QuestionHardWare q4 = new QuestionHardWare (
                "Ao instalar PCI NICS você pode verificar a disponibilidade de IRQ olhando em",
                "dip switches",
                "CONFIG.SYS",
                "jumper settings",
                "motherboard BIOS",
                "motherboard BIOS",
                "B ");
        this.addQuestionHardware (q4);

        QuestionHardWare q5 = new QuestionHardWare (
                "Com relação a uma placa de interface de rede, o termo 10/100 se refere a",
                "velocidade de protocolo",
                "velocidade de fibra",
                "megabits por segundo",
                "velocidade mínima e máxima do servidor",
                " megabits por segundos ",
                " B ");
        this.addQuestionHardware (q5);

        QuestionHardWare q6 = new QuestionHardWare (
                "Qual formato da placa-mãe usa um conector de 20 pinos",
                "ATX", "Todas as opções anteriores", "BABY AT", "AT",
                "ATX",
                "B");
        this.addQuestionHardware (q6);

        QuestionHardWare q7 = new QuestionHardWare (
                "Um disco rígido é dividido em trilhas que são subdivididas em:",
                "clusters", "setores", "vetores", "cabeças",
                "setores",
                "B");
        this.addQuestionHardware (q7);

        QuestionHardWare q8 = new QuestionHardWare (
                "Uma pulseira de aterramento contém qual dos seguintes:",
                "Protetor de sobretensão", "Capacitor", "Voltímetro", "Resistor",
                "Resistor",
                "B");
        this.addQuestionHardware (q8);

        QuestionHardWare q9 = new QuestionHardWare (
                "Qual padrão rege as comunicações paralelas?",
                "RS232", "RS-232a", "CAT 5", "IEEE 1284",
                "IEEE 1284",
                "B");
        this.addQuestionHardware (q9);

        QuestionHardWare q10 = new QuestionHardWare (
                "Na tecnologia de impressora a laser, o que acontece durante " +
                        "o estágio de condicionamento?",
                "O fio corona coloca uma carga positiva uniforme no papel",
                "Uma carga negativa uniforme é colocada no tambor fotossensível",
                "A carga negativa uniforme é colocada no toner ",
                " Todas as anteriores ",
                " Uma carga negativa uniforme é colocada no tambor fotossensível ",
                " B ");
        this.addQuestionHardware (q10);

        QuestionHardWare q11 = new QuestionHardWare (
                "Qual produto é usado para limpar teclas manchadas em um teclado?",
                "Solvente TMC",
                "Spray de silicone",
                "Álcool desnaturado",
                "Limpador multiuso",
                "Limpador multiuso",
                "B");
        this.addQuestionHardware (q11);

        QuestionHardWare q12 = new QuestionHardWare (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimentação",
                "Placa de expansão",
                "Monitor", "Teclado",
                "Placa de expansão",
                "B");
        this.addQuestionHardware (q12);

        QuestionHardWare q13 = new QuestionHardWare (
                "Para visualizar qualquer programa Terminate Stay Resident" +
                        " (TSR) em execução, você pode digitar:",
                "Memory", "MEM", "Memmaker", "SYS / M",
                "MEM",
                "B" );
        this.addQuestionHardware (q13);

        QuestionHardWare q14 = new QuestionHardWare (
                "Que tipo de placa de sistema é o candidato MAIS provável" +
                        " para atualização de processador se você deseja desempenho " +
                        "máximo e compatibilidade futura?",
                "ML", "PCI", "EISA", "ISA",
                "PCI"
                , "B");
        this.addQuestionHardware (q14);

        QuestionHardWare q15 = new QuestionHardWare (
                "Qual porta periférica fornece a taxa de transferência MAIS RÁPIDA " +
                        "para impressoras a laser?",
                "RS-232", "SCSI", "Paralela", "Serial",
                "Paralela",
                "B");
        this.addQuestionHardware (q15);

        QuestionHardWare q16 = new QuestionHardWare (
                "O ponteiro do mouse se move erraticamente, qual é a possível causa? O mouse",
                "a bola está suja",
                "não está conectada",
                "o driver não está instalado corretamente",
                "tem uma configuração de IRQ incorreta" ,
                "bola é sujeira",
                "B");
        this.addQuestionHardware (q16);

        QuestionHardWare q17 = new QuestionHardWare (
                "A tensão é medida:",
                "em paralelo",
                "em série",
                "após interromper o circuito",
                "após verificar a resistência",
                "em paralelo",
                "B");
        this.addQuestionHardware (q17);

        QuestionHardWare q18 = new QuestionHardWare (
                "Seu cliente informa que a qualidade de impressão de sua impressora " +
                        "matricial é clara e depois escura. Qual das alternativas a seguir pode " +
                        "causar o problema.",
                "Deslizamento do papel",
                "Avanço impróprio da fita",
                "Espessura do papel" ,
                "Posição da cabeça",
                "Avanço impróprio da fita",
                "B");
        this.addQuestionHardware (q18);

        QuestionHardWare q19 = new QuestionHardWare (
                "A conexão de 34 pinos em uma placa de E / S é para?",
                "Unidade de disquete",
                "Unidade SCSI",
                "Unidade IDE",
                "Unidade Zip",
                "Unidade de disquete",
                "B ");
        this.addQuestionHardware (q19);

        QuestionHardWare q20 = new QuestionHardWare(
                "Os termos \"red book\", \"yellow book\", and \"orange book\" referir-se:",
                "SCSI",
                "ide",
                "floppy drive technology",
                "CD-ROM standards",
                "CD-ROM standards",
                "B");
        this.addQuestionHardware(q20);

        QuestionHardWare q21 = new QuestionHardWare (
                "No barramento ISA de 16 bits, IRQ2 é elevado a qual nível " +
                        "superior de interrupção?",
                "9", "11", "13", "15",
                "9",
                "B") ;
        this.addQuestionHardware (q21);

        QuestionHardWare q22 = new QuestionHardWare (
                "Para visualizar qualquer programa Terminate Stay Resident (TSR) " +
                        "em execução, você pode digitar:",
                "Memory", "MEM", "SYS / M", "Memmaker",
                "MEM",
                "B" );
        this.addQuestionHardware (q22);

        QuestionHardWare q23 = new QuestionHardWare (
                "Qual parte da impressora a laser NÃO deve ser exposta à luz solar?",
                "Conjunto de corona de transferência",
                "Tambor de PC",
                "Fio de corona primário",
                "Fio de corona primário de tambor de PC",
                "Tambor de PC" ,
                "B");
        this.addQuestionHardware (q23);

        QuestionHardWare q24 = new QuestionHardWare (
                "Depois de fazer uma formatação de baixo nível, qual seria a " +
                        "próxima etapa na configuração do disco rígido em um sistema?",
                "Formatar partição DOS",
                "Instalar sistema operacional",
                "Configurar canal DMA e voltar -up interrupção ",
                " Partição com disco ",
                " Formatar partição DOS ",
                " B ");
        this.addQuestionHardware (q24);

        QuestionHardWare q25 = new QuestionHardWare (
                "A resistência é medida em?",
                "Volts", "Amps", "Watts", "Ohms",
                "Ohms",
                "B");
        this.addQuestionHardware (q25);

        QuestionHardWare q26 = new QuestionHardWare (
                "Que comando é usado para redefinir um MODEM ao usar o Conjunto de comandos AT?",
                "ATR", "ATZ", "DTR", "DCE",
                "ATZ",
                "B");
        this.addQuestionHardware (q26);

        QuestionHardWare q27 = new QuestionHardWare (
                "Ao instalar uma unidade de CD-ROM SCSI, você deve definir o " +
                        "adaptador de CD-ROM SCSI para:",
                "B0007",
                "Um endereço SCSI não utilizado",
                "O mesmo endereço do dispositivo SCSI antes do CD-ROM ",
                " SCSI ID = 1 ",
                " Um endereço SCSI não utilizado ",
                " B ");
        this.addQuestionHardware (q27);

        QuestionHardWare q28 = new QuestionHardWare (
                "Escolha a escolha correta para o 80386SXCPU.",
                "Tamanho da palavra de 16 bits, caminho de dados de 16 bits",
                "Tamanho da palavra de 32 bits, caminho de dados de 16 bits",
                "Tamanho da palavra de 8 bits, dados de 32 bits caminho ",
                " tamanho da palavra de 32 bits, caminho de dados de 8 bits ",
                " tamanho da palavra de 32 bits, caminho de dados de 16 bits ",
                " B ");
        this.addQuestionHardware (q28);

        QuestionHardWare q29 = new QuestionHardWare (
                "Na tecnologia de jato de tinta, as gotas de tinta são desviadas por?",
                "Bicos multidirecionais",
                "placas eletronicamente carregadas",
                "placas de alta pressão",
                "absorção eletrostática",
                "bicos multidirecionais",
                " B ");
        this.addQuestionHardware (q29);

        QuestionHardWare q30 = new QuestionHardWare (
                "Qual ferramenta é usada para testar portas seriais e paralelas?",
                "Sonda de alta voltagem",
                "scanner de cabo",
                "loop backs (plugues envolventes)",
                "sniffer",
                "loop backs (plugues envolventes )) ",
                " B ");
        this.addQuestionHardware (q30);

        QuestionHardWare q31 = new QuestionHardWare (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimentação",
                "Placa de expansão",
                "Monitor",
                "Teclado",
                "Placa de expansão",
                "B");
        this.addQuestionHardware (q31);

        QuestionHardWare q32 = new QuestionHardWare (
                "Qual é o maior número binário que pode ser referido em um bloco de" +
                        " jumpers de três posições?",
                "4", "6", "F", "1",
                "1",
                "B" );
        this.addQuestionHardware (q32);

        QuestionHardWare q33 = new QuestionHardWare (
                "Que voltagem usa um sistema Pentium?",
                "+ 12 volts", "+ 5 volts", "+ 5 volts", "+ 3,3 volts",
                "+ 3,3 volts",
                "B" );
        this.addQuestionHardware (q33);

        QuestionHardWare q34 = new QuestionHardWare (
                "Uma verificação de código de erro numérico: A 17xx indica um problema com:",
                "CMOS",
                "ROM BIOS",
                "controlador DMA",
                "disco rígido ou controlador",
                "disco rígido ou controlador",
                "B");
        this.addQuestionHardware (q34);

        QuestionHardWare q35 = new QuestionHardWare (
                "Qual fornece o acesso mais rápido a grandes arquivos de vídeo?",
                "Unidades ópticas",
                "Discos rígidos IDE",
                "Discos rígidos SCSI",
                "Discos rígidos EIDE",
                "Discos rígidos SCSI",
                "B ");
        this.addQuestionHardware (q35);

        QuestionHardWare q36 = new QuestionHardWare (
                "Um conector fêmea de 25 pinos na parte traseira do seu " +
                        "computador normalmente será:",
                "Porta serial 1", "Uma porta paralela", "Docking", "porta COM2",
                "Uma porta paralela ",
                " B ");
        this.addQuestionHardware (q36);

        QuestionHardWare q37 = new QuestionHardWare (
                "Você estava instalando um aplicativo no Windows 95 e" +
                        " o computador trava, o que você faz?",
                "Pressione alt + Ctrl + delete, duas vezes",
                "pressione alt + Ctrl + delete e finalize a tarefa ",
                " pressione o botão reset no computador ",
                " desligue o computador e inicialize por um disquete ",
                " desligue o computador e inicialize por um disquete ",
                " B ");
        this.addQuestionHardware (q37);

        QuestionHardWare q38 = new QuestionHardWare (
                "RS-232 é um padrão que se aplica a:",
                "portas seriais",
                "portas paralelas",
                "portas de jogos",
                "redes",
                "portas seriais",
                "B");
        this.addQuestionHardware (q38);

        QuestionHardWare q39 = new QuestionHardWare (
                "Você acabou de instalar um novo disco rígido IDE," +
                        " mas o BIOS do sistema não reconhece a nova unidade, " +
                        "o que você deve verificar primeiro.",
                "Sequência de cabos",
                "jumpers no disco rígido",
                "drivers que precisam ser carregados ",
                " informações do site do fabricante do disco rígido ",
                " drivers que precisam ser carregados ",
                " B ");
        this.addQuestionHardware (q39);

        QuestionHardWare q40 = new QuestionHardWare (
                "Durante a inicialização, o teste de memória:",
                "É uma etapa supérflua que deve ser ignorada",
                "Verifica e verifica se a memória contígua está instalada",
                "É um erro operacional",
                "Exibe o que a memória está instalada, mas nada mais ",
                " Verifica e verifica se a memória contígua está instalada ",
                " B ");
        this.addQuestionHardware (q40);

        QuestionHardWare q41 = new QuestionHardWare (
                "Qual é o melhor aterramento para uma bancada de trabalho condutiva?",
                "Tomada CA",
                "Terra para dobrar",
                "Para outro dispositivo",
                "Aterramento do chassi",
                "Tomada CA",
                "B" );
        this.addQuestionHardware (q41);

        QuestionHardWare q42 = new QuestionHardWare (
                "Topicamente, quantas placas PC tipo III você pode inserir em um laptop",
                "1", "2", "3", "4",
                "1",
                "B");
        this.addQuestionHardware (q42);

        QuestionHardWare q43 = new QuestionHardWare (
                "Qual é a primeira coisa que você pode fazer para verificar " +
                        "se há danos em uma impressora após recebê-la?",
                "Executar diagnósticos MSD",
                "Conectar a um PC e imprimir algo",
                "Verificar os cabos" ,
                "Retire da caixa e examine-o quanto a danos físicos",
                "Retire da caixa e examine-o quanto a danos físicos",
                "B");
        this.addQuestionHardware (q43);

        QuestionHardWare q44 = new QuestionHardWare (
                "Você tem um sistema que trava periodicamente. " +
                        "Você descartou software e agora suspeita que seja hardware. " +
                        "O que você deve fazer primeiro para ajudá-lo a restringir " +
                        "o componente com falha?",
                "girar a RAM",
                "substituir a RAM",
                "substituir o cache SIMM nível 2",
                "desativar o cache da CPU no CMOS",
                "desativar o cache da CPU no CMOS",
                "B");
        this.addQuestionHardware (q44);

        QuestionHardWare q45 = new QuestionHardWare (
                "Qual é a melhor maneira de proteger os dados do seu disco rígido?",
                "Backups regulares",
                "desfragmentá-los periodicamente",
                "executar chkdsk pelo menos uma vez por semana",
                "executar scandisk pelo menos uma vez por semana" ,
                "backups regulares",
                "B");
        this.addQuestionHardware (q45);

        QuestionHardWare q46 = new QuestionHardWare (
                "Em uma impressora matricial, você nunca deve lubrificar qual parte?",
                "Trilhos do carro",
                "pinos do cabeçote de impressão",
                "rolamentos de avanço do papel",
                "rolamentos do carro",
                "pinos do cabeçote de impressão",
                "B ");
        this.addQuestionHardware (q46);

        QuestionHardWare q47 = new QuestionHardWare (
                "Quantos dispositivos podem ser usados ​​em um único " +
                        "barramento SCSI? Lembre-se de que o adaptador " +
                        "host SCSI conta como um dispositivo.",
                "1",
                "8",
                "20",
                "10",
                "8",
                "B");
        this.addQuestionHardware (q47);

        QuestionHardWare q48 = new QuestionHardWare (
                "Corresponder o driver de dispositivo HIMEM.SYS à sua operação.",
                "Suporta emulação de terminal (ANSI)",
                "Gerencia o uso de memória estendida",
                "Usa memória expandida em um processador 80386",
                "Suporta troca de página de código ",
                " Gerencia o uso de memória estendida ",
                " B ");
        this.addQuestionHardware (q48);

        QuestionHardWare q49 = new QuestionHardWare (
                "_____ ajuda a prevenir picos de energia.",
                "Supressor de picos",
                "Protetor de picos",
                "Sistema UPS",
                "Multímetro de alta qualidade",
                "Supressor de picos",
                "B");
        this.addQuestionHardware (q49);

        QuestionHardWare q50 = new QuestionHardWare (
                "O multímetro digital está configurado para DC, Ohm e 20k." +
                        " Você lerá _____ enquanto mede um bom fusível de 2 A.",
                "0,00", "0,02", "0,20", "2,00",
                " 0,00 ",
                " B ");
        this.addQuestionHardware (q50);

        QuestionHardWare q51 = new QuestionHardWare (
                "Uma pulseira antiestática usa um pequeno _____ " +
                        "para garantir que você não se torne o menor caminho de resistência para o solo?",
                "Capacitor", "diodo", "transistor", "resistor",
                " resistor ",
                " E ");
        this.addQuestionHardware (q51);

        QuestionHardWare q52 = new QuestionHardWare (
                "Se os slots de memória tiverem 30 pinos, o chip é um?",
                "DIMM", "SIMM", "SDRAM", "Todos os anteriores",
                "SIMM",
                "E");
        this.addQuestionHardware (q52);

        QuestionHardWare q53 = new QuestionHardWare (
                "As velocidades da impressora Laser Jet são medidas em " +
                        "páginas por minuto (ppm) o que usamos para medir impressoras matriciais?",
                "Linhas por polegada",
                "linhas por folha",
                "caracteres por polegada" ,
                "caracteres por segundo",
                "caracteres por segundo",
                "E");
        this.addQuestionHardware (q53);

        QuestionHardWare q54 = new QuestionHardWare (
                "Quais valores são mantidos no CMOS para o disco rígido",
                "tamanho (cabeças, cilindros, setores)",
                "IRQ", "Espaço livre", "Alerta de vírus",
                "tamanho (cabeças, cilindros , setores) ",
                " E ");
        this.addQuestionHardware (q54);

        QuestionHardWare q55 = new QuestionHardWare (
                "Qual das alternativas a seguir seria uma primeira " +
                        "etapa lógica na solução de problemas de um PC?",
                "Verifique o CMOS do computador",
                "Defina as circunstâncias do problema",
                "Ligue para o fornecedor",
                "Defina quais aplicativos estão sendo usados ​​",
                " Definir as circunstâncias do problema ",
                " E ");
        this.addQuestionHardware (q55);

        QuestionHardWare q56 = new QuestionHardWare (
                "Qual driver DOS é usado para emular memória expandida?",
                "Himem.sys",
                "EMM386.exe",
                "Mem386.sys",
                "Ramdrive.sys",
                "EMM386.exe",
                " E ");
        this.addQuestionHardware (q56);

        QuestionHardWare q57 = new QuestionHardWare (
                "Para um Macintosh imprimir com sucesso, a pasta do sistema deve conter:",
                "Software de compartilhamento de arquivos",
                "Um ativador de impressora",
                "O conjunto de fontes apple Garamond",
                "Um driver de impressora",
                "A driver da impressora ",
                " E ");
        this.addQuestionHardware (q57);

        QuestionHardWare q58 = new QuestionHardWare (
                "Qual componente deve ser aspirado ou substituído " +
                        "durante a manutenção preventiva em uma impressora a laser?",
                "Espelho de digitalização",
                "Cartucho de toner",
                "Filtro de ozônio",
                "Todos os anteriores",
                "Filtro de ozônio" ,
                "E");
        this.addQuestionHardware (q58);

        QuestionHardWare q59 = new QuestionHardWare (
                "Qual dispositivo usa um canal DMA?",
                "Modem",
                "Placa de rede",
                "Placa de som",
                "Todos os anteriores",
                "Placa de som",
                "E");
        this.addQuestionHardware (q59);

        QuestionHardWare q60 = new QuestionHardWare (
                "Quando é o maior risco de descarga eletrostática?",
                "Horário diurno",
                "Umidade alta",
                "Umidade baixa",
                "Horário noturno",
                "Umidade baixa",
                "E");
        this.addQuestionHardware (q60);

        QuestionHardWare q61 = new QuestionHardWare (
                "Um modem pode ser conectado a qual porta?",
                "Porta paralela",
                "Porta ASYNC",
                "Conector de teclado",
                "Porta de vídeo",
                "Porta paralela",
                "E");
        this.addQuestionHardware (q61);

        QuestionHardWare q62 = new QuestionHardWare(
                "Qual dispositivo evita interrupções de energia, " +
                        "resultando em dados corrompidos?",
                "Unidade de backup de bateria",
                "Protetor de surto",
                "Multiple SIMMs strips (Tiras)",
                "Sistema de guarda de dados",
                "Unidade de backup de bateria",
                "E");
        this.addQuestionHardware(q62);

        QuestionHardWare q63 = new QuestionHardWare (
                "SCSI deve ser terminado com?",
                "Chave DIP",
                "Resistor",
                "BNC",
                "Todos os anteriores",
                "Resistor",
                "E");
        this.addQuestionHardware (q63);

        QuestionHardWare q64 = new QuestionHardWare (
                "Em um computador com um adaptador eide, onde você deve conectar " +
                        "uma unidade de CD-ROM ATA?",
                "No barramento de disquete",
                "no IDE primário",
                "no IDE secundário",
                " no barramento SCSI ",
                " no IDE secundário ",
                " E ");
        this.addQuestionHardware (q64);

        QuestionHardWare q65 = new QuestionHardWare (
                "Qual é o maior número binário que pode ser referido em um bloco " +
                        "de jumpers de três posições?",
                "4", "6", "5", "1",
                "1",
                "E" );
        this.addQuestionHardware (q65);

        QuestionHardWare q66 = new QuestionHardWare (
                "Durante a inicialização, o teste de memória:",
                "É uma etapa supérflua que deve ser ignorada",
                "Verifica e verifica se a memória contígua está instalada",
                "É um erro operacional",
                "Exibe o que a memória está instalada, mas nada mais ",
                " Verifica e verifica se a memória contígua está instalada ",
                " E ");
        this.addQuestionHardware (q66);

        QuestionHardWare q67 = new QuestionHardWare (
                "IRQ6 é normalmente reservado para:",
                "O disquete",
                "O controlador do teclado",
                "LPT2",
                "O modem",
                "O disquete",
                "E");
        this.addQuestionHardware (q67);

        QuestionHardWare q68 = new QuestionHardWare (
                "O que você faria primeiro ao solucionar problemas em um monitor com defeito?",
                "Verifique suas conexões com o computador e a fonte de alimentação",
                "Use um medidor para verificar a continuidade do CRT e dos circuitos internos",
                "Desligue o monitor e, em seguida, ligue-o novamente para ver se isso corrige o problema ",
                " Desligue o computador e ligue-o novamente para ver se isso corrige o problema ",
                " Verifique suas conexões com o computador e a fonte de alimentação ",
                " E ");
        this.addQuestionHardware (q68);

        QuestionHardWare q69 = new QuestionHardWare (
                "Para instalar uma segunda unidade IDE em um computador, você deve:",
                "Definir o jumper mestre-escravo para escravo na segunda unidade",
                "Use o software de configuração IDE para definir a nova unidade como escravo ",
                " Verifique se você define a nova unidade como D: na configuração do CMOS ",
                " Verifique se você conecta a unidade ao conector na extremidade do cabo de fita ",
                " Defina o jumper mestre-escravo como escravo no segundo drive ",
                " E ");
        this.addQuestionHardware (q69);

        QuestionHardWare q70 = new QuestionHardWare (
                "Por que uma unidade de rede mapeada com sucesso desaparece " +
                        "toda vez que você inicializa o computador?",
                "O computador ao qual você está conectado mudou",
                "Você não clicou em reconectar ao fazer logon",
                "O mapa a instrução não está no arquivo autoexec.bat ",
                " A última unidade não foi configurada corretamente ",
                " A instrução do mapa não está no arquivo autoexec.bat ",
                " E ");
        this.addQuestionHardware (q70);

        QuestionHardWare q71 = new QuestionHardWare (
                "O que você precisa para verificar a porta serial e paralela?",
                "Adaptador de porta",
                "Sonda lógica",
                "Plug de loopback",
                "Todos os anteriores",
                "Plug de loopback",
                "E" );
        this.addQuestionHardware (q71);

        QuestionHardWare q72 = new QuestionHardWare (
                "Você tem um PC sem vídeo * Qual das alternativas a " +
                        "seguir tem MENOS probabilidade de estar causando o problema?",
                "RAM com defeito (banco zero)",
                "microprocessador com defeito",
                "disco rígido travado",
                "placa de vídeo solta",
                "disco rígido travado",
                "E");
        this.addQuestionHardware (q72);

        QuestionHardWare q73 = new QuestionHardWare (
                "Para testar a ondulação CA em uma fonte de alimentação " +
                        "de PC, você deve definir o volt / ohmímetro para:",
                "escala de tensão CC",
                "tensão CA",
                "escala OHM",
                "escala Farad" ,
                "Tensão CA",
                "E");
        this.addQuestionHardware (q73);

        QuestionHardWare q74 = new QuestionHardWare (
                "Você recebe um erro de checksum CMOS durante a inicialização. Qual é a causa mais provável?",
                "Fonte de alimentação está ruim",
                "BIOS precisa ser atualizada",
                "Bateria CMOS está chegando ao fim",
                "difícil os tipos de unidade estão definidos incorretamente ",
                " A bateria CMOS está quase no fim de sua vida útil ",
                " E ");
        this.addQuestionHardware (q74);

        QuestionHardWare q75 = new QuestionHardWare (
                "No barramento ISA de 16 bits, IRQ2 é elevado a " +
                        "qual interrupção de nível superior?",
                "9", "11", "13", "15",
                "9",
                "E") ;
        this.addQuestionHardware (q75);

        QuestionHardWare q76 = new QuestionHardWare (
                "Depois de tentar descarregar um TSR, você recebe uma mensagem " +
                        "de erro dizendo que outros TSRs foram carregados depois daquele " +
                        "que você tentou remover. Qual dos seguintes comandos você poderia " +
                        "usar para ver a ordem de carregamento atual?",
                "MEM / P", "MEMMAKER", "MEM / C", "SYS:",
                "SYS:",
                "E");
        this.addQuestionHardware (q76);

        QuestionHardWare q77 = new QuestionHardWare (
                "Qual é a linguagem comum que os computadores usam para se comunicar em uma rede",
                "cliente", "adaptador", "protocolo", "sistemas operacionais",
                "protocolo",
                "E") ;
        this.addQuestionHardware (q77);

        QuestionHardWare q78 = new QuestionHardWare (
                "Qual driver DOS é usado para emular memória expandida?",
                "Himem.sys", "EMM386.exe", "Mem386.sys", "Ramdrive.sys",
                "EMM386.exe",
                " E ");
        this.addQuestionHardware (q78);

        QuestionHardWare q79 = new QuestionHardWare (
                "Qual você deve usar para limpar telas de LCD protegidas com Mylar?",
                "Limpador de janelas com amônia",
                "Limpador não abrasivo",
                "Toalhetes antiestáticos",
                "Toalhetes impregnados com álcool",
                "Não - limpador abrasivo ",
                " E ");
        this.addQuestionHardware (q79);

        QuestionHardWare q80 = new QuestionHardWare (
                "O que poderia causar um erro de disco fixo?",
                "Sem CD instalado",
                "RAM inválida",
                "Processador lento",
                "Configurações de CMOS incorretas",
                "Configurações de CMOS incorretas",
                "E") ;
        this.addQuestionHardware (q80);

        QuestionHardWare q81 = new QuestionHardWare (
                "O potencial ESD diminui com o uso de:",
                "Ventiladores desionizantes",
                "Uma pulseira",
                "Luvas de borracha com tampa correspondente",
                "Um medidor estático",
                "Uma pulseira",
                "E");
        this.addQuestionHardware (q81);

        QuestionHardWare q82 = new QuestionHardWare (
                "Qual das seguintes FRUs seria considerada um dispositivo de entrada / saída?",
                "Placa de vídeo",
                "Adaptador host SCSI",
                "CPU da placa do sistema",
                "Todos os anteriores",
                "SCSI adaptador host ",
                " E ");
        this.addQuestionHardware (q82);

        QuestionHardWare q83 = new QuestionHardWare (
                "Uma porta COM é uma porta _____.",
                "Paralela", "serial", "estática", "multi",
                "serial",
                "E");
        this.addQuestionHardware (q83);

        QuestionHardWare q84 = new QuestionHardWare (
                "Qual dispositivo está no IRQ 6?",
                "Teclado", "IDE", "Unidade de disquete", "Placa de vídeo",
                "Unidade de disquete",
                "E");
        this.addQuestionHardware (q84);

        QuestionHardWare q85 = new QuestionHardWare (
                "Um sistema tem dois discos rígidos IDE que são divididos em " +
                        "partições primárias e estendidas, qual letra de unidade é atribuída" +
                        " à partição primária da segunda unidade?",
                "C", "D", "E "," F ",
                " D ",
                " E ");
        this.addQuestionHardware (q85);

        QuestionHardWare q86 = new QuestionHardWare (
                "Qual é a diferença mais significativa entre os padrões USB e IEEE1394?",
                "IEEE 1394 é mais rápido",
                "USB não oferece suporte a USB",
                "USB é plug and play",
                "IEEE 1394 é quente trocável ",
                " IEEE 1394 é mais rápido ",
                " E ");
        this.addQuestionHardware (q86);

        QuestionHardWare q87 = new QuestionHardWare (
                "Ao conectar dois discos rígidos SCSI internos a um computador," +
                        " onde você conecta o segundo disco rígido?",
                "Qualquer porta SCSI aberta no computador",
                "Uma porta serial no primeiro adaptador host",
                "Uma porta paralela aberta no computador",
                "Uma porta SCSI aberta no primeiro disco rígido",
                "Qualquer porta SCSI aberta no computador",
                "E");
        this.addQuestionHardware (q87);

        QuestionHardWare q88 = new QuestionHardWare (
                "Ao conectar um cabo de fita a um conector, " +
                        "como você sabe em que direção conectá-lo?",
                "A linha vermelha no cabo vai para o número de pino mais alto",
                "A linha colorida no o cabo vai para o pino # 1 ",
                " Não importa ",
                " A linha azul ou vermelha no cabo vai para o conector de alimentação ",
                " A linha colorida no cabo vai para o pino # 1 ",
                " E ") ;
        this.addQuestionHardware (q88);

        QuestionHardWare q89 = new QuestionHardWare (
                "Qual é a primeira etapa para diagnosticar um computador " +
                        "completamente morto no site do cliente que estava funcionando no" +
                        " dia anterior.",
                "Teste a fonte de alimentação",
                "substitua a bateria CMOS",
                "verifique a tomada CA ",
                " recoloque o cabo do controlador do disco rígido ",
                " verifique a tomada CA ",
                " E ");
        this.addQuestionHardware (q89);

        QuestionHardWare q90 = new QuestionHardWare (
                "Que especificação abrange placas de disco rígido de PC?",
                "SCSI", "ISA", "PCMCIA", "MFM",
                "PCMCIA",
                "E");
        this.addQuestionHardware (q90);
        QuestionHardWare q91 = new QuestionHardWare (
                "Qual especificação de barramento comum fornece a taxa de" +
                        " transferência de dados mais rápida?",
                "Barramento VL", "ISA", "PCI", "Todos os anteriores",
                "PCI",
                "E");
        this.addQuestionHardware (q91);

        QuestionHardWare q92 = new QuestionHardWare (
                "Modems usam transmissão.",
                "Síncrono", "assíncrono", "intervalo cronometrado", "ata",
                "assíncrono",
                "E");
        this.addQuestionHardware (q92);

        QuestionHardWare q93 = new QuestionHardWare (
                "A 6xx indica um problema com:",
                "unidade de disquete", "disco rígido", "teclado", "CD ROM",
                "unidade de disquete",
                "E");
        this.addQuestionHardware (q93);

        QuestionHardWare q94 = new QuestionHardWare (
                "Uma placa de som normalmente usa qual IRQ?",
                "6", "5", "15", "1",
                "5",
                "E");
        this.addQuestionHardware (q94);

        QuestionHardWare q95 = new QuestionHardWare (
                "Durante a manutenção preventiva em uma impressora matricial, NÃO lubrifique:",
                "Conjunto do cilindro",
                "Polia da cabeça de impressão",
                "Pinos da cabeça de impressão",
                "Buchas da engrenagem de avanço do papel",
                "Pinos da cabeça de impressão ",
                " E ");
        this.addQuestionHardware (q95);

        QuestionHardWare q96 = new QuestionHardWare(
                "Você vê a mensagem \"invalid media device (dispositivo de mídia inválido)\" " +
                        "depois de instalar um novo disco rígido. O que você faz em seguida?",
                "Format",
                "Fdisk",
                "Partition",
                "Add the OS",
                "Format",
                "E");
        this.addQuestionHardware(q96);

        QuestionHardWare q97 = new QuestionHardWare (
                "O que é o comando para desligar o modem?",
                "ATHU", "ATH", "ATZ", "ATX",
                "ATH",
                "E");
        this.addQuestionHardware (q97);

        QuestionHardWare q98 = new QuestionHardWare (
        "Quais tipos de expansão a maioria das placas-mãe pll / plll suportam?",
                "MCA, PCI", "ISA, EISA", "ISA, PCI, AGP", "ISA, VESA, PCI",
                "ISA , PCI, AGP ",
                " E ");
        this.addQuestionHardware (q98);

        QuestionHardWare q99 = new QuestionHardWare (
                "Ao instalar um modem interno, todos os IRQs a seguir podem ser usados, exceto?",
                "5", "10", "14", "Todos os anteriores",
                "14",
                "E ");
        this.addQuestionHardware (q99);

        QuestionHardWare q100 = new QuestionHardWare (
                "Um IRQ permite placas de interface para:",
                "Interromper a CPU para solicitar serviço",
                "Passar dados para a CPU a serem processados",
                "Passar dados de uma placa para outra",
                "Passar dados para a memória do computador ",
                " Interromper a CPU para solicitar serviço ",
                " E ");
        this.addQuestionHardware (q100);

        QuestionHardWare q101 = new QuestionHardWare (
                "Qual é o IRQ padrão para LPT1?",
                "2", "5", "7", "13",
                "7",
                "I");
        this.addQuestionHardware (q101);

        QuestionHardWare q102 = new QuestionHardWare (
                "Qual é a causa mais provável de uma placa de som e uma " +
                        "impressora funcionando de forma intermitente?",
                "IRQs conflitantes.",
                "Configuração incorreta de APM.",
                "Um cabo de impressora alterado.",
                "Um cabo incorreto de impressora. cartão sentado. ",
                " IRQs conflitantes. ",
                " I ");
        this.addQuestionHardware (q102);

        QuestionHardWare q103 = new QuestionHardWare (
                "USB pode fornecer energia para todos os seguintes, exceto",
                "hub de 4 portas", "Teclado", "Mouse", "Disco rígido externo",
                "hub de 4 portas",
                "I");
        this.addQuestionHardware (q103);

        QuestionHardWare q104 = new QuestionHardWare (
                "Qual é o IRQ padrão para COM1?",
                "2", "3", "4", "5",
                "4",
                "I");
        this.addQuestionHardware (q104);

        QuestionHardWare q105= new QuestionHardWare(
                "Ao configurar placas de interface de rede ISA sem jumpers ou plug and" +
                        " play. O que é usado para definir IRQs?",
                "DMA.","COMS.","O sistema operacional","Software de configuração",
                "Configuration software",
                "I");
        this.addQuestionHardware(q105);

        QuestionHardWare q106 = new QuestionHardWare (
                "Qual é o IRQ padrão para o controlador da unidade de disquete?",
                "2", "3", "6", "9",
                "6",
                "I");
        this.addQuestionHardware (q106);

        QuestionHardWare q107 = new QuestionHardWare (
                "Qual interrupção é reservada para o temporizador do sistema?",
                "0", "1", "8", "13",
                "0",
                "I");
        this.addQuestionHardware (q107);

        QuestionHardWare q108 = new QuestionHardWare (
                "Ao conectar-se a um ponto de acesso sem fio 802.11, qual modo deve ser usado?",
                "WEP", "Infraestrutura", "Ad-hoc", "Remoto",
                "WEP",
                "I") ;
        this.addQuestionHardware (q108);

        QuestionHardWare q109 = new QuestionHardWare (
                "O que você precisa fazer ao substituir a placa-mãe em um computador portátil?",
                "Verifique se a placa é AT ou ATX.",
                "Corresponda exatamente o número do fabricante e do modelo.",
                "Qualquer um a placa-mãe funcionará enquanto for especificada para um laptop. ",
                " Verifique se a placa é desse fabricante e se as placas são intercambiáveis. ",
                " Verifique se a placa é desse fabricante e se as placas são intercambiáveis. " ,
                "EU");
        this.addQuestionHardware (q109);

        QuestionHardWare q110 = new QuestionHardWare (
                "Você instalou um novo modem com jumpers definidos para COM2 e IRQ3, " +
                        "mas o Windows não consegue detectar o modem. Qual é o problema?",
                "Sem tom de discagem",
                "Conflito de IRQ",
                "DMA overrun" ,
                "Velocidade da porta COM não definida para 256Kbps",
                "Conflito de IRQ",
                "I");
        this.addQuestionHardware (q110);

        QuestionHardWare q111 = new QuestionHardWare (
                "Qual interrupção o relógio de tempo real usa?",
                "0", "1", "8", "13",
                "8",
                "I");
        this.addQuestionHardware (q111);

        QuestionHardWare q112 = new QuestionHardWare (
                "Qual é o menor espaço para armazenar dados em um disco rígido?",
                "Track", "Sector", "Cluster", "Cylinder",
                "Sector",
                "I");
        this.addQuestionHardware (q112);

        QuestionHardWare q113 = new QuestionHardWare (
                "Qual é o comprimento máximo do cabo, em metros, usando cabo " +
                        "blindado de par trançado de calibre 20 entre dois dispositivos" +
                        "USB de velocidade total?",
                "5", "6", "7", "8" ,
                "5",
                "I");
        this.addQuestionHardware (q113);

        QuestionHardWare q114 = new QuestionHardWare (
                "Qual configuração um dispositivo deve ter para interromper a CPU?",
                "IRQ",
                "Endereço de E / S",
                "Canal DMA",
                "Endereço de memória",
                "IRQ",
                "I" );
        this.addQuestionHardware (q114);

        QuestionHardWare q115 = new QuestionHardWare (
                "Qual é o comprimento máximo para uma conexão de cabo de um " +
                        "dispositivo USB de velocidade total a um PC. Qual será sua resposta?",
                "3 M", "4 M", "5 M", " 6 M ",
                " 5 M ",
                " I ");
        this.addQuestionHardware (q115);

        QuestionHardWare q116 = new QuestionHardWare (
                "O conector elétrico entre a docking station e um computador portátil é",
                "Usado como supressor de surto",
                "Específico do fabricante apenas",
                "Específico do fabricante e do modelo",
                "Não é propriedade, mas é um padrão da indústria ",
                " Específico do fabricante apenas ",
                " I ");
        this.addQuestionHardware (q116);

        QuestionHardWare q117 = new QuestionHardWare (
                "Um técnico conecta um joystick a uma placa de som. Qual IRQ o joystick usaria?",
                "IRQ 2", "IRQ 5", "IRQ 10", "Joystick não usa IRQ",
                "IRQ 5",
                "I");
        this.addQuestionHardware (q117);

        QuestionHardWare q118 = new QuestionHardWare (
                "conectores RJ-45 são usados ​​em quais das seguintes topologias?",
                "10Base2", "10Base5", "10BaseT", "10BaseFL",
                "10Base2",
                "I");
        this.addQuestionHardware (q118);

        QuestionHardWare q119 = new QuestionHardWare (
                "De que local as primeiras instruções do computador estão " +
                        "disponíveis na inicialização?",
                "ROM BIOS", "CPU", "boot.ini", "config.sys",
                "ROM BIOS",
                "I ");
        this.addQuestionHardware (q119);

        QuestionHardWare q120 = new QuestionHardWare (
                "O que poderia causar um erro de disco fixo.",
                "Nenhum CD instalado",
                "RAM danificada",
                "Processador lento",
                "Configurações de cmos incorretas",
                "Configurações de cmos incorretas",
                "I");
        this.addQuestionHardware (q120);

        QuestionHardWare q121 = new QuestionHardWare (
                "A falta de tampas de slot em um computador pode causar?",
                "Superaquecimento", "oscilação de energia", "EMI", "alta tensão",
                "superaquecimento",
                "I");
        this.addQuestionHardware (q121);

        QuestionHardWare q122 = new QuestionHardWare (
                "Com relação a uma placa de interface de rede, o termo 10/100 se refere a",
                "velocidade de protocolo",
                "velocidade de fibra",
                "megabits por segundo" +
                "s", "velocidade máxima do servidor",
                "megabits por segundos ",
                " I ");
        this.addQuestionHardware (q122);

        QuestionHardWare q123 = new QuestionHardWare (
                "Qual formato da placa-mãe usa um conector de 20 pinos",
                "ATX", "AT", "BABY AT", "BIG AT",
                "ATX",
                "I");
        this.addQuestionHardware (q123);

        QuestionHardWare q124 = new QuestionHardWare (
                "Um disco rígido é dividido em trilhas que são subdivididas em",
                "clusters", "setores", "cilindro", "bits",
                "setores",
                "I");
        this.addQuestionHardware (q124);

        QuestionHardWare q125 = new QuestionHardWare (
                "De que local as primeiras instruções do computador estão " +
                        "disponíveis na inicialização?",
                "ROM BIOS", "CPU", "boot.ini", "CONFIG.SYS",
                "ROM BIOS",
                "I ");
        this.addQuestionHardware (q125);

        QuestionHardWare q126 = new QuestionHardWare (
                "O que poderia causar um erro de disco corrigido.",
                "Sem CD instalado",
                "RAM defeituosa",
                "processador lento",
                "Configurações incorretas de CMOS",
                "Configurações incorretas de CMOS",
                "I") ;
        this.addQuestionHardware (q126);

        QuestionHardWare q127 = new QuestionHardWare (
                "A falta de tampas de slot em um computador pode causar?",
                "Superaquecimento",
                "surtos de energia",
                "EMI",
                "caminho incompleto para ESD",
                "superaquecimento",
                "I");
        this.addQuestionHardware (q127);

        QuestionHardWare q128 = new QuestionHardWare (
                "Ao instalar PCI NICS você pode verificar a disponibilidade de IRQ olhando em",
                "dip switches",
                "CONFIG.SYS",
                "jumper settings",
                "motherboard BIOS",
                "motherboard BIOS",
                "I ");
        this.addQuestionHardware (q128);

        QuestionHardWare q129 = new QuestionHardWare (
                "Com relação a uma placa de interface de rede, o termo 10/100 se refere a",
                "velocidade do protocolo",
                "velocidade da fibra",
                "megabits por segundo",
                "velocidade mínima e máxima do servidor",
                " megabits por segundos ",
                " I ");
        this.addQuestionHardware (q129);

        QuestionHardWare q130 = new QuestionHardWare (
                "O potencial ESD diminui com o uso de:",
                "Ventiladores desionizantes",
                "Uma pulseira",
                "Luvas de borracha com tampa correspondente",
                "Um medidor estático",
                "Uma pulseira",
                "EU");
        this.addQuestionHardware (q130);

        QuestionHardWare q131 = new QuestionHardWare (
                "Qual das seguintes FRUs seria considerada um dispositivo de entrada / saída?",
                "Placa de vídeo",
                "Adaptador host SCSI",
                "CPU da placa do sistema",
                "Todos os anteriores",
                "SCSI adaptador host ",
                " I ");
        this.addQuestionHardware (q131);

        QuestionHardWare q132 = new QuestionHardWare (
                "Uma porta COM é uma porta _____.",
                "Paralela", "serial", "estática", "multi",
                "serial",
                "I");
        this.addQuestionHardware (q132);
        QuestionHardWare q133 = new QuestionHardWare (
                "Qual dispositivo está no IRQ 6?",
                "Teclado", "IDE", "Unidade de disquete", "Placa de vídeo",
                "Unidade de disquete",
                "I");
        this.addQuestionHardware (q133);

        QuestionHardWare q134 = new QuestionHardWare (
                "Um sistema tem dois discos rígidos IDE que são divididos " +
                        "em partições primárias e estendidas, que letra de unidade " +
                        "é atribuída à partição primária da segunda unidade?",
                "C", "D", "E "," F ",
                " D ",
                " I ");
        this.addQuestionHardware (q134);

        QuestionHardWare q135 = new QuestionHardWare (
                "Uma pulseira de aterramento contém qual dos seguintes:",
                "protetor de sobretensão", "capacitor", "voltímetro", "resistor",
                "resistor",
                "I");
        this.addQuestionHardware (q135);

        QuestionHardWare q136 = new QuestionHardWare (
                "Qual padrão rege as comunicações paralelas?",
                "RS232", "RS232-a", "CAT 5", "IEEE 1284",
                "IEEE 1284",
                "I");
        this.addQuestionHardware (q136);

        QuestionHardWare q137 = new QuestionHardWare (
                "Qual produto é usado para limpar teclas manchadas em um teclado?",
                "Solvente TMC",
                "Spray de silicone",
                "Álcool desnaturado",
                "Limpador multiuso",
                "Limpador multiuso",
                "EU");
        this.addQuestionHardware (q137);

        QuestionHardWare q138 = new QuestionHardWare (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimentação",
                "Placa de expansão",
                "Monitor",
                "Teclado",
                "Placa de expansão",
                "I");
        this.addQuestionHardware (q138);

        QuestionHardWare q139 = new QuestionHardWare (
                "Qual porta periférica fornece o rendimento mais RÁPIDO " +
                        "para impressoras a laser?",
                "RS-232", "SCSI", "Paralelo", "Serial",
                "Paralelo",
                "I");
        this.addQuestionHardware (q139);

        QuestionHardWare q140 = new QuestionHardWare (
                "O ponteiro do mouse se move erraticamente, qual é a possível causa? O mouse",
                "a bola está suja",
                "não está conectada",
                "o driver não está instalado corretamente",
                "tem uma configuração de IRQ incorreta" ,
                "bola está suja",
                "I");
        this.addQuestionHardware (q140);

        QuestionHardWare q141 = new QuestionHardWare (
                "Voltage4s medido:",
                "em paralelo",
                "em série",
                "após interromper o circuito",
                "após verificar a resistência",
                "em paralelo",
                "I");
        this.addQuestionHardware (q141);

        QuestionHardWare q142 = new QuestionHardWare (
                "Qual é o maior número binário que pode ser referido em um" +
                        " bloco de jumpers de três posições?",
                "4", "6", "F", "1",
                "1",
                "I" );
        this.addQuestionHardware (q142);

        QuestionHardWare q143 = new QuestionHardWare (
                "Durante a inicialização, o teste de memória:",
                "É uma etapa supérflua que deve ser ignorada",
                "Verifica e verifica se a memória contígua está instalada",
                "É um erro operacional",
                "Exibe o que a memória está instalada, mas nada mais ",
                " Verifica e verifica se a memória contígua está instalada ",
                " I ");
        this.addQuestionHardware (q143);

        QuestionHardWare q144 = new QuestionHardWare (
                "O que você precisa para verificar a porta serial e paralela?",
                "Adaptador de porta",
                "Sonda lógica",
                "Plug de loopback",
                "Todas as opções acima",
                "Plug de loopback",
                "I" );
        this.addQuestionHardware (q144);

        QuestionHardWare q145 = new QuestionHardWare (
                "Para testar a ondulação CA em uma fonte de alimentação de PC, " +
                        "você deve definir o volt / ohmímetro para:",
                "DC", "AC", "Ohm", "Farad",
                "AC",
                "EU");
        this.addQuestionHardware (q145);

        QuestionHardWare q146 = new QuestionHardWare (
                "No barramento ISA de 16 bits, IRQ2 é elevado a qual interrupção " +
                        "de nível superior?",
                "9", "11", "13", "15",
                "9",
                "I") ;
        this.addQuestionHardware (q146);

        QuestionHardWare q147 =new QuestionHardWare (
                "Qual é a linguagem comum que os computadores usam para se" +
                        " comunicar em uma rede",
                "cliente", "adaptador", "protocolo", "OS",
                "protocolo",
                "I");
        this.addQuestionHardware (q147);

        QuestionHardWare q148 = new QuestionHardWare (
                "Uma porta COM é uma porta _____.",
                "Paralela", "serial", "estática", "multi",
                "serial",
                "I");
        this.addQuestionHardware (q148);

        QuestionHardWare q149 = new QuestionHardWare (
                "Modems usam transmissão.",
                "Síncrono", "assíncrono", "intervalo cronometrado", "ata",
                "assíncrono",
                "I");
        this.addQuestionHardware (q149);

        QuestionHardWare q150 = new QuestionHardWare (
                "A tensão DC na maioria das placas de circuito é:",
                "- 12 V", "0 V", "+ 5 V", "+ 12 V",
                "+ 5 V",
                "I" );
        this.addQuestionHardware (q150);
    }

    public void addQuestionHardware(QuestionHardWare quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION2());
        values.put(KEY_ANSWER, quest.getANSWER2());
        values.put(KEY_OPTA, quest.getOPTA2());
        values.put(KEY_OPTB, quest.getOPTB2());
        values.put(KEY_OPTC, quest.getOPTC2());
        values.put(KEY_OPTD, quest.getOPTD2());
        values.put(KEY_CAT,quest.getCATEGORY2());
        // Inserting Row
        dbase.insert(TABLE_QUEST2, null, values);
    }

    private void addQuestionsRandom() {
        QuestionRandom q1 = new QuestionRandom (
                "De que local as primeiras instruções do computador estão " +
                        "disponíveis na inicialização?",
                "ROM BIOS", "CPU", "boot.ini", "CONFIG.SYS",
                "ROM BIOS");
        this.addQuestionRandom (q1);

        QuestionRandom q2 = new QuestionRandom (
                "O que poderia causar um erro de disco fixo.",
                "Nenhum CD instalado", "RAM defeituosa",
                "processador lento", "Configurações de CMOS incorretas",
                "Configurações de CMOS incorretas");
        this.addQuestionRandom (q2);

        QuestionRandom q3 = new QuestionRandom (
                "A falta de tampas de slot em um computador pode causar?",
                "Superaquecimento", "picos de energia",
                "EMI", "caminho incompleto para ESD",
                "superaquecimento");
        this.addQuestionRandom (q3);

        QuestionRandom q4 = new QuestionRandom (
                "Ao instalar PCI NICS, você pode verificar a disponibilidade de IRQ em",
                "interruptores dip", "CONFIG.SYS",
                "configurações de jumper", "BIOS da placa-mãe",
                "BIOS da placa-mãe");
        this.addQuestionRandom (q4);

        QuestionRandom q5 = new QuestionRandom (
                "Com relação a uma placa de interface de rede, o termo 10/100 se refere a",
                "velocidade de protocolo", "velocidade de fibra",
                "megabits por segundo", "velocidade mínima e máxima do servidor",
                " megabits por segundos ");
        this.addQuestionRandom (q5);

        QuestionRandom q6 = new QuestionRandom (
                "Qual formato da placa-mãe usa um conector de 20 pinos",
                "ATX", "Todas as opções anteriores", "BABY AT", "AT",
                "ATX");
        this.addQuestionRandom (q6);

        QuestionRandom q7 = new QuestionRandom (
                "Um disco rígido é dividido em trilhas que são subdivididas em:",
                "clusters", "setores", "vetores", "cabeças",
                "setores");
        this.addQuestionRandom (q7);

        QuestionRandom q8 = new QuestionRandom (
                "Uma pulseira de aterramento contém qual dos seguintes:",
                "Protetor de sobretensão", "Capacitor",
                "Voltímetro", "Resistor",
                "Resistor");
        this.addQuestionRandom (q8);

        QuestionRandom q9 = new QuestionRandom (
                "Qual padrão governa as comunicações paralelas?",
                "RS232", "RS-232a", "CAT 5", "IEEE 1284",
                "IEEE 1284");
        this.addQuestionRandom (q9);

        QuestionRandom q10 = new QuestionRandom (
                "Na tecnologia de impressora a laser, o que acontece " +
                        "durante o estágio de condicionamento?",
                "O fio corona coloca uma carga positiva uniforme no papel",
                "Uma carga negativa uniforme é colocada no tambor fotossensível",
                "A carga negativa uniforme é colocada no toner ",
                " Todas as anteriores ",
                " Uma carga negativa uniforme é colocada no tambor fotossensível ");
        this.addQuestionRandom (q10);

        QuestionRandom q11 = new QuestionRandom (
                "Qual produto é usado para limpar teclas manchadas em um teclado?",
                "Solvente TMC", "Spray de silicone", "Álcool desnaturado",
                "Limpador multiuso",
                "Limpador multiuso") ;
        this.addQuestionRandom (q11);

        QuestionRandom q12 = new QuestionRandom (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimentação", "Placa de expansão",
                "Monitor", "Teclado",
                "Placa de expansão");
        this.addQuestionRandom (q12);

        QuestionRandom q13 = new QuestionRandom (
                "Para visualizar qualquer programa Terminate Stay Resident" +
                        " (TSR) em execução, você pode digitar:",
                "Memory", "MEM", "Memmaker", "SYS / M",
                "MEM");
        this.addQuestionRandom (q13);

        QuestionRandom q14 = new QuestionRandom (
                "Que tipo de placa de sistema é o candidato MAIS provável" +
                        " para atualização de processador se você deseja desempenho " +
                        "máximo e compatibilidade futura?",
                "ML", "PCI", "EISA", "ISA",
                "PCI" );
        this.addQuestionRandom (q14);

        QuestionRandom q15 = new QuestionRandom (
                "Qual porta periférica fornece o rendimento mais RÁPIDO " +
                        "para impressoras a laser?",
                "RS-232", "SCSI", "Paralelo", "Serial",
                "Paralelo");
        this.addQuestionRandom (q15);

        QuestionRandom q16 = new QuestionRandom (
                "O ponteiro do mouse se move erraticamente, " +
                        "qual é a possível causa? O mouse",
                "a bola está suja",
                "não está conectado",
                "o driver não está instalado corretamente",
                "tem uma configuração de IRQ incorreta" ,
                "bola é sujeira");
        this.addQuestionRandom (q16);

        QuestionRandom q17 = new QuestionRandom (
                "A tensão é medida:",
                "em paralelo", "em série", "após interromper o circuito",
                "após verificar a resistência",
                "em paralelo");
        this.addQuestionRandom (q17);

        QuestionRandom q18 = new QuestionRandom (
                "Seu cliente diz que a qualidade de impressão de sua" +
                        " impressora matricial é clara e depois escura. Qual das " +
                        "alternativas a seguir pode causar o problema.",
                "Deslizamento do papel", "Avanço impróprio da fita",
                "Espessura do papel" , "Posição da cabeça",
                "Avanço impróprio da fita");
        this.addQuestionRandom (q18);

        QuestionRandom q19 = new QuestionRandom (
                "A conexão de 34 pinos em uma placa de E / S é para?",
                "Unidade de disquete", "Unidade SCSI",
                "Unidade IDE", "Unidade Zip",
                "Unidade de disquete");
        this.addQuestionRandom (q19);

        QuestionRandom q20 = new QuestionRandom(
                "Os termos \"red book\", \"yellow book\", e \"orange book\" referi-se:",
                "SCSI","ide","floppy drive technology",
                "CD-ROM standards",
                "CD-ROM standards");
        this.addQuestionRandom(q20);

        QuestionRandom q21 = new QuestionRandom (
                "No barramento ISA de 16 bits, IRQ2 é elevado para qual" +
                        " nível superior de interrupção?",
                "9", "11", "13", "15",
                "9");
        this.addQuestionRandom (q21);

        QuestionRandom q22 = new QuestionRandom (
                "Para visualizar qualquer programa Terminate Stay" +
                        " Resident (TSR) em execução, você pode digitar:",
                "Memory", "MEM", "SYS / M", "Memmaker",
                "MEM");
        this.addQuestionRandom (q22);

        QuestionRandom q23 = new QuestionRandom (
                "Qual parte da impressora a laser NÃO deve ser exposta" +
                        " à luz solar?",
                "Conjunto de corona de transferência",
                "Tambor de PC",
                "Fio de corona primário",
                "Fio de corona primário de tambor de PC",
                "Tambor de PC" );
        this.addQuestionRandom (q23);

        QuestionRandom q24 = new QuestionRandom (
                "Depois de fazer uma formatação de baixo nível, qual seria a " +
                        "próxima etapa na configuração do disco rígido em um sistema?",
                "Formatar partição DOS",
                "Instalar sistema operacional",
                "Configurar canal DMA e voltar -up interrupção ",
                " Partição com disco ",
                " Formatar partição DOS ");
        this.addQuestionRandom (q24);

        QuestionRandom q25 = new QuestionRandom (
                "A resistência é medida em?",
                "Volts", "Amps", "Watts", "Ohms",
                "Ohms");
        this.addQuestionRandom (q25);

        QuestionRandom q26 = new QuestionRandom (
                "Que comando é usado para redefinir um MODEM ao usar " +
                        "o Conjunto de comandos AT?",
                "ATR", "ATZ", "DTR", "DCE",
                "ATZ");
        this.addQuestionRandom (q26);

        QuestionRandom q27 = new QuestionRandom (
                "Ao instalar uma unidade de CD-ROM SCSI, você deve definir o" +
                        " adaptador SCSI de CD-ROM para:",
                "B0007", "Um endereço SCSI não utilizado",
                "O mesmo endereço do dispositivo SCSI antes de CD-ROM ",
                " SCSI ID = 1 ",
                " Um endereço SCSI não utilizado ");
        this.addQuestionRandom (q27);

        QuestionRandom q28 = new QuestionRandom (
                "Escolha a escolha correta para o 80386SXCPU.",
                "Tamanho da palavra de 16 bits, caminho de dados de 16 bits",
                "tamanho da palavra de 32 bits, caminho de dados de 16 bits",
                "tamanho da palavra de 8 bits, dados de 32 bits caminho ",
                " tamanho da palavra de 32 bits, caminho de dados de 8 bits ",
                " tamanho da palavra de 32 bits, caminho de dados de 16 bits ");
        this.addQuestionRandom (q28);

        QuestionRandom q29 = new QuestionRandom (
                "Na tecnologia Inkjet as gotas de tinta são desviadas por?",
                "Bicos multidirecionais", "placas eletronicamente carregadas",
                "placas de alta pressão", "absorção eletrostática",
                "bicos multidirecionais") ;
        this.addQuestionRandom (q29);

        QuestionRandom q30 = new QuestionRandom (
                "Qual ferramenta é usada para testar portas seriais e paralelas?",
                "Sonda de alta voltagem", "scanner de cabo",
                "loop backs (plugues envolventes)", "sniffer",
                "loop backs (plugues envolventes ) ");
        this.addQuestionRandom (q30);

        QuestionRandom q31 = new QuestionRandom (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimentação", "Placa de expansão", "Monitor", "Teclado",
                "Placa de expansão");
        this.addQuestionRandom (q31);

        QuestionRandom q32 = new QuestionRandom (
                "Qual é o maior número binário que pode ser referido em um " +
                        "bloco de jumpers de três posições?",
                "4", "6", "F", "1",
                "1");
        this.addQuestionRandom (q32);

        QuestionRandom q33 = new QuestionRandom (
                "Que tensão um sistema Pentium usa?",
                "+ 12 volts", "+ 5 volts", "+ 5 volts", "+ 3,3 volts",
                "+ 3,3 volts");
        this.addQuestionRandom (q33);

        QuestionRandom q34 = new QuestionRandom (
                "Uma verificação de código de erro numérico: A 17xx indica um problema com:",
                "CMOS", "ROM BIOS",
                "controlador DMA", "disco rígido ou controlador",
                "disco rígido ou controlador") ;
        this.addQuestionRandom (q34);

        QuestionRandom q35 = new QuestionRandom (
                "Qual fornece o acesso mais rápido a grandes arquivos de vídeo?",
                "Unidades ópticas", "Discos rígidos IDE", "Discos rígidos SCSI",
                "Discos rígidos EIDE",
                "Discos rígidos SCSI");
        this.addQuestionRandom (q35);

        QuestionRandom q36 = new QuestionRandom (
                "Um conector fêmea de 25 pinos na parte de trás do seu computador normalmente será:",
                "Porta serial 1", "Uma porta paralela",
                "Docking", "Porta COM2",
                "Uma porta paralela ");
        this.addQuestionRandom (q36);

        QuestionRandom q37 = new QuestionRandom (
                "Você estava instalando um aplicativo no Windows 95 e o " +
                        "computador trava, o que você faz?",
                "Pressione alt + Ctrl + delete, duas vezes",
                "pressione alt + Ctrl + delete e finalize a tarefa ",
                " pressione o botão reset no computador ",
                " desligue o computador e inicialize de um disquete ",
                " desligue o computador e inicialize de um disquete ");
        this.addQuestionRandom (q37);

        QuestionRandom q38 = new QuestionRandom (
                "RS-232 é um padrão que se aplica a:",
                "portas seriais", "portas paralelas",
                "portas de jogos", "redes",
                "portas seriais");
        this.addQuestionRandom (q38);

        QuestionRandom q39 = new QuestionRandom (
                "Você acabou de instalar um novo disco rígido IDE, mas o BIOS" +
                        " do sistema não reconhece a nova unidade, o que você deve verificar primeiro.",
                "Sequência de cabos",
                "jumpers no disco rígido",
                "drivers que precisam ser carregados ",
                " informações do site do fabricante do disco rígido ",
                " drivers que precisam ser carregados ");
        this.addQuestionRandom (q39);

        QuestionRandom q40 = new QuestionRandom (
                "Durante a inicialização, o teste de memória:",
                "É uma etapa supérflua que deve ser ignorada",
                "Verifica e verifica se a memória contígua está instalada",
                "É um erro operacional",
                "Exibe o que a memória está instalada, mas nada mais ",
                " Verifica e verifica se a memória contígua está instalada ");
        this.addQuestionRandom (q40);

        QuestionRandom q41 = new QuestionRandom (
                "Qual é o melhor aterramento para uma bancada de trabalho condutiva?",
                "Tomada CA", "Terra para dobrar",
                "Para outro dispositivo", "Aterramento do chassi",
                "Tomada CA");
        this.addQuestionRandom (q41);

        QuestionRandom q42 = new QuestionRandom (
                "Topicamente, quantas placas PC tipo III você pode inserir em um laptop",
                "1", "2", "3", "4",
                "1");
        this.addQuestionRandom (q42);

        QuestionRandom q43 = new QuestionRandom (
                "Qual é a primeira coisa que você pode fazer para verificar " +
                        "se há danos em uma impressora após recebê-la?",
                "Executar diagnósticos MSD",
                "Conectar a um PC e imprimir algo",
                "Verificar os cabos" ,
                "Retire da caixa e examine-o quanto a danos físicos",
                "Retire da caixa e examine quanto a danos físicos");
        this.addQuestionRandom (q43);

        QuestionRandom q44 = new QuestionRandom (
                "Você tem um sistema que trava periodicamente. Você " +
                        "descartou o software e agora suspeita que seja hardware. " +
                        "O que você deve fazer primeiro para ajudá-lo a restringir " +
                        "o componente com falha?",
                "girar a RAM",
                "substituir a RA" +
                "M", "substituir o cache SIMM nível 2",
                "desativar o cache da CPU no CMOS",
                "desativar o cache da CPU no CMOS");
        this.addQuestionRandom (q44);

        QuestionRandom q45 = new QuestionRandom (
                "Qual é a melhor maneira de proteger os dados do seu disco rígido?",
                "Backups regulares", "desfragmentá-lo periodicamente",
                "execute chkdsk pelo menos uma vez por semana",
                "execute o scandisk pelo menos uma vez por semana" ,
                "backups regulares");
        this.addQuestionRandom (q45);

        QuestionRandom q46 = new QuestionRandom (
                "Em uma impressora matricial, você nunca deve lubrificar qual parte?",
                "Trilhos do carro",
                "pinos do cabeçote de impressão",
                "rolamentos de avanço do papel",
                "rolamentos do carro",
                "pinos do cabeçote de impressão");
        this.addQuestionRandom (q46);

        QuestionRandom q47 = new QuestionRandom (
                "Quantos dispositivos podem ser usados ​​em um único barramento " +
                        "SCSI? Lembre-se de que o adaptador host SCSI conta como um dispositivo.",
                "1", "8", "20", "10", "8");
        this.addQuestionRandom (q47);

        QuestionRandom q48 = new QuestionRandom (
                "Combine o driver de dispositivo HIMEM.SYS com sua operação.",
                "Suporta emulação de terminal (ANSI)",
                "Gerencia o uso de memória estendida",
                "Usa memória expandida em um processador 80386",
                "Suporta troca de página de código ",
                " Gerencia o uso de memória estendida ");
        this.addQuestionRandom (q48);

        QuestionRandom q49 = new QuestionRandom (
                "_____ ajuda a prevenir surtos de energia.",
                "Supressor de surto", "Protetor de pico",
                "Sistema UPS", "Multímetro de alta qualidade",
                "Supressor de surto");
        this.addQuestionRandom (q49);

        QuestionRandom q50 = new QuestionRandom (
                "O multímetro digital está configurado para DC, Ohm e 20k." +
                        " Você lerá _____ enquanto mede um bom fusível de 2 A.",
                "0,00", "0,02", "0,20", "2,00",
                " 0,00 ");
        this.addQuestionRandom (q50);

        QuestionRandom q51 = new QuestionRandom (
                "Uma tira antiestática usa um pequeno _____ para garantir " +
                        "que você não se torne o menor caminho de resistência para o solo?",
                "Capacitor",
                "diodo",
                "transistor",
                "resistor",
                " resistor ");
        this.addQuestionRandom (q51);

        QuestionRandom q52 = new QuestionRandom (
                "Se os slots de memória tiverem 30 pinos, o chip é um?",
                "DIMM", "SIMM", "SDRAM", "Todos os anteriores",
                "SIMM");
        this.addQuestionRandom (q52);

        QuestionRandom q53 = new QuestionRandom (
                "As velocidades da impressora Laser Jet são medidas em páginas " +
                        "por minuto (ppm) o que usamos para medir impressoras matriciais?",
                "Linhas por polegada",
                "linhas por folha",
                "caracteres por polegada" ,
                "caracteres por segundo",
                "caracteres por segundo");
        this.addQuestionRandom (q53);

        QuestionRandom q54 = new QuestionRandom (
                "Quais valores são mantidos no CMOS para o disco rígido",
                "tamanho (cabeças, cilindros, setores)",
                "IRQ",
                "Espaço livre",
                "Alerta de vírus",
                "tamanho (cabeças, cilindros , setores) ");
        this.addQuestionRandom (q54);

        QuestionRandom q55 = new QuestionRandom (
                "Qual das alternativas a seguir seria uma primeira " +
                        "etapa lógica na solução de problemas de um PC?",
                "Verifique o CMOS do computador",
                "Defina as circunstâncias do problema",
                "Ligue para o fornecedor",
                "Defina quais aplicativos estão sendo usados ​​",
                " Definir as circunstâncias do problema ");
        this.addQuestionRandom (q55);

        QuestionRandom q56 = new QuestionRandom (
                "Qual driver DOS é usado para emular a memória expandida?",
                "Himem.sys",
                "EMM386.exe",
                "Mem386.sys",
                "Ramdrive.sys",
                "EMM386.exe");
        this.addQuestionRandom (q56);

        QuestionRandom q57 = new QuestionRandom (
                "Para um Macintosh imprimir com sucesso, a pasta do sistema deve conter:",
                "Software de compartilhamento de arquivos",
                "Um ativador de impressora",
                "O conjunto de fontes apple Garamond",
                "Um driver de impressora",
                "A Driver de impressora");
        this.addQuestionRandom (q57);

        QuestionRandom q58 = new QuestionRandom (
                "Qual componente deve ser aspirado ou substituído durante " +
                        "a manutenção preventiva em uma impressora a laser?",
                "Espelho de varredura",
                "Cartucho de toner",
                "Filtro de ozônio",
                "Todos os itens acima",
                "Filtro de ozônio" );
        this.addQuestionRandom (q58);

        QuestionRandom q59 = new QuestionRandom (
                "Qual dispositivo usa um canal DMA?",
                "Modem",
                "Placa de rede",
                "Placa de som",
                "Todas as opções anteriores",
                "Placa de som");
        this.addQuestionRandom (q59);

        QuestionRandom q60 = new QuestionRandom (
                "Quando é o maior risco de descarga eletrostática?",
                "Horário diurno",
                "Umidade alta",
                "Umidade baixa",
                "Horário noturno",
                "Umidade baixa");
        this.addQuestionRandom (q60);

        QuestionRandom q61 = new QuestionRandom (
                "Um modem pode ser conectado a qual porta?",
                "Porta paralela", "Porta ASYNC",
                "Conector de teclado", "Porta de vídeo",
                "Porta paralela");
        this.addQuestionRandom (q61);

        QuestionRandom q62 = new QuestionRandom (
                "Qual dispositivo evita interrupções de energia, resultando" +
                        " em dados corrompidos?",
                "Unidade de backup de bateria", "Protetor de sobretensão",
                "Tiras de vários SIMMs", "Sistema de proteção de dados",
                "Backup de bateria unidade");
        this.addQuestionRandom (q62);

        QuestionRandom q63 = new QuestionRandom (
                "SCSI deve ser terminado com?",
                "Chave DIP", "Resistor", "BNC", "Todos os anteriores",
                "Resistor");
        this.addQuestionRandom (q63);

        QuestionRandom q64 = new QuestionRandom (
                "Em um computador com um adaptador eide, onde você deve conectar" +
                        " uma unidade de CD-ROM ATA?",
                "No barramento de disquete", "no IDE primário",
                "no IDE secundário", " no barramento SCSI ",
                " no IDE secundário ");
        this.addQuestionRandom (q64);

        QuestionRandom q65 = new QuestionRandom (
                "Qual é o maior número binário que pode ser referido em um bloco " +
                        "de jumpers de três posições?", "4", "6", "5", "1",
                "1");
        this.addQuestionRandom (q65);

        QuestionRandom q66 = new QuestionRandom (
                "Durante a inicialização, o teste de memória:",
                "É uma etapa supérflua que deve ser ignorada",
                "Verifica e verifica se a memória contígua está instalada",
                "É um erro operacional",
                "Exibe o que a memória está instalada, mas nada mais ",
                " Verifica e verifica se a memória contígua está instalada ");
        this.addQuestionRandom (q66);

        QuestionRandom q67 = new QuestionRandom (
                "IRQ6 é normalmente reservado para:",
                "O disquete", "O controlador do teclado",
                "LPT2", "O modem",
                "O disquete");
        this.addQuestionRandom (q67);

        QuestionRandom q68 = new QuestionRandom (
                "O que você faria primeiro ao solucionar problemas" +
                        " em um monitor com defeito?",
                "Verifique suas conexões com o computador e a fonte de alimentação",
                "Use um medidor para verificar a continuidade do CRT e dos circuitos internos",
                "Desligue o monitor e, em seguida, ligue-o novamente para ver se isso corrige o problema ",
                " Desligue o computador e ligue-o novamente para ver se isso corrige o problema ",
                " Verifique suas conexões com o computador e a fonte de alimentação ");
        this.addQuestionRandom (q68);

        QuestionRandom q69 = new QuestionRandom (
                "Para instalar uma segunda unidade IDE em um computador, você deve:",
                "Definir o jumper mestre-escravo para escravo na segunda unidade",
                "Use o software de configuração IDE para definir a nova unidade como escravo ",
                " Verifique se você define a nova unidade como D: na configuração do CMOS ",
                " Verifique se você conecta a unidade ao conector na extremidade do cabo de fita ",
                " Defina o jumper mestre-escravo como escravo no segundo dirigir");
        this.addQuestionRandom (q69);

        QuestionRandom q70 = new QuestionRandom (
                "Por que uma unidade de rede mapeada com sucesso desaparece" +
                        " toda vez que você inicializa o computador?",
                "O computador ao qual você está conectado mudou",
                "Você não clicou em reconectar ao fazer logon",
                "O mapa a instrução não está no arquivo autoexec.bat ",
                " A última unidade não foi configurada corretamente ",
                " A instrução do mapa não está no arquivo autoexec.bat ");
        this.addQuestionRandom (q70);

        QuestionRandom q71 = new QuestionRandom (
                "O que você precisa para verificar a porta serial e paralela?",
                "Adaptador de porta", "Sonda lógica",
                "Plugue de loopback", "Todos os anteriores",
                "Plugue de loopback");
        this.addQuestionRandom (q71);

        QuestionRandom q72 = new QuestionRandom (
                "Você tem um PC sem vídeo * Qual das alternativas a seguir " +
                        "tem MENOS probabilidade de estar causando o problema?",
                "RAM com defeito (banco zero)", "microprocessador com defeito",
                "disco rígido travado", "placa de vídeo solta",
                "disco rígido travado");
        this.addQuestionRandom (q72);

        QuestionRandom q73 = new QuestionRandom (
                "Para testar a ondulação CA em uma fonte de alimentação de PC," +
                        " você deve definir o volt / ohmímetro para:",
                "escala de tensão CC", "tensão CA",
                "escala OHM", "escala Farad" ,
                "Tensão CA");
        this.addQuestionRandom (q73);

        QuestionRandom q74 = new QuestionRandom (
                "Você obtém um erro de checksum CMOS durante a inicialização." +
                        " Qual é a causa mais provável?",
                "Fonte de alimentação está ruim",
                "BIOS precisa ser atualizada",
                "Bateria CMOS está quase no fim",
                "difícil os tipos de unidade estão definidos incorretamente ",
                " A bateria CMOS está quase no fim de sua vida útil ");
        this.addQuestionRandom (q74);

        QuestionRandom q75 = new QuestionRandom (
                "No barramento ISA de 16 bits, IRQ2 é elevado a qual " +
                        "interrupção de nível superior?",
                "9", "11", "13", "15",
                "9");
        this.addQuestionRandom (q75);

        QuestionRandom q76 = new QuestionRandom (
                "Depois de tentar descarregar um TSR, você receberá uma mensagem " +
                        "de erro informando que outros TSRs foram carregados depois daquele " +
                        "que você tentou remover. Qual dos seguintes comandos você poderia " +
                        "usar para ver a ordem de carregamento atual?",
                "MEM / P", "MEMMAKER", "MEM / C", "SYS:",
                "SYS:");
        this.addQuestionRandom (q76);

        QuestionRandom q77 = new QuestionRandom (
                "Qual é a linguagem comum que os computadores usam para falar" +
                        " uns com os outros em uma rede",
                "cliente", "adaptador",
                "protocolo", "sistemas operacionais",
                "protocolo");
        this.addQuestionRandom (q77);

        QuestionRandom q78 = new QuestionRandom (
                "Qual driver DOS é usado para emular a memória expandida?",
                "Himem.sys", "EMM386.exe", "Mem386.sys", "Ramdrive.sys",
                "EMM386.exe");
        this.addQuestionRandom (q78);

        QuestionRandom q79 = new QuestionRandom (
                "Qual você deve usar para limpar telas LCD protegidas com Mylar?",
                "Limpador de janelas com amônia", "Limpador não abrasivo",
                "Toalhetes antiestáticos", "Toalhetes impregnados com álcool",
                "Não - limpador abrasivo ");
        this.addQuestionRandom (q79);

        QuestionRandom q80 = new QuestionRandom (
                "O que poderia causar um erro de disco fixo?",
                "Sem CD instalado", "RAM inválida",
                "Processador lento", "Configurações de CMOS incorretas",
                "Configurações de CMOS incorretas");
        this.addQuestionRandom (q80);

        QuestionRandom q81 = new QuestionRandom (
                "O potencial ESD diminui com o uso de:",
                "Ventiladores desionizantes", "Uma pulseira",
                "Luvas de borracha com tampa correspondente", "Um medidor estático",
                "Uma pulseira") ;
        this.addQuestionRandom (q81);

        QuestionRandom q82 = new QuestionRandom (
                "Qual das seguintes FRUs seria considerada um dispositivo " +
                        "de entrada / saída?",
                "Placa de vídeo", "Adaptador host SCSI",
                "CPU da placa do sistema", "Todos os anteriores",
                "SCSI adaptador host ");
        this.addQuestionRandom (q82);

        QuestionRandom q83 = new QuestionRandom (
                "Uma porta COM é uma porta _____.",
                "Paralela", "serial",
                "estática", "multi",
                "serial");
        this.addQuestionRandom (q83);

        QuestionRandom q84 = new QuestionRandom (
                "Qual dispositivo está no IRQ 6?",
                "Teclado", "IDE", "Unidade de disquete",
                "Placa de vídeo",
                "Unidade de disquete");
        this.addQuestionRandom (q84);

        QuestionRandom q85 = new QuestionRandom (
                "Um sistema tem dois discos rígidos IDE, cada um dividido em partições " +
                        "primária e estendida, qual letra de unidade é atribuída à" +
                        " partição primária da segunda unidade?",
                "C", "D", "E "," F ",
                " D ");
        this.addQuestionRandom (q85);

        QuestionRandom q86 = new QuestionRandom (
                "Qual é a diferença mais significativa entre os padrões USB e IEEE1394?",
                "IEEE 1394 é mais rápido",
                "USB não oferece suporte a USB",
                "USB é plug and play",
                "IEEE 1394 é quente trocável ",
                " IEEE 1394 é mais rápido ");
        this.addQuestionRandom (q86);

        QuestionRandom q87 = new QuestionRandom (
                "Ao conectar dois discos rígidos SCSI internos a um computador, " +
                        "onde você conecta o segundo disco rígido?",
                "Qualquer porta SCSI aberta no computador",
                "Uma porta serial no primeiro adaptador host",
                "Uma porta paralela aberta no computador",
                "Uma porta SCSI aberta no primeiro disco rígido",
                "Qualquer porta SCSI aberta no computador");
        this.addQuestionRandom (q87);

        QuestionRandom q88 = new QuestionRandom (
                "Ao conectar um cabo de fita a um conector, como você sabe em " +
                        "que direção conectá-lo?",
                "A linha vermelha no cabo vai para o número de pino mais alto",
                "A linha colorida no o cabo vai para o pino # 1 ",
                " Não importa ",
                " A linha azul ou vermelha no cabo vai para o conector de alimentação ",
                " A linha colorida no cabo vai para o pino # 1 ");
        this.addQuestionRandom (q88);

        QuestionRandom q89 = new QuestionRandom (
                "Qual é a primeira etapa para diagnosticar um computador " +
                        "completamente morto no site do cliente que estava funcionando no dia " +
                        "anterior.",
                "Teste a fonte de alimentação",
                "substitua a bateria CMOS",
                "verifique a tomada CA ",
                " recoloque o cabo do controlador do disco rígido ",
                " verifique a tomada CA ");
        this.addQuestionRandom (q89);

        QuestionRandom q90 = new QuestionRandom (
                "Que especificação abrange placas de disco rígido de PC?",
                "SCSI", "ISA", "PCMCIA", "MFM",
                "PCMCIA");
        this.addQuestionRandom (q90);

        QuestionRandom q91 = new QuestionRandom (
                "Qual especificação de barramento comum fornece a taxa de transferência de dados mais rápida?",
                "Barramento VL", "ISA", "PCI", "Todos os anteriores",
                "PCI");
        this.addQuestionRandom (q91);

        QuestionRandom q92 = new QuestionRandom (
                "Modems usam transmissão.",
                "Síncrono", "assíncrono", "intervalo de tempo", "ata",
                "assíncrono");
        this.addQuestionRandom (q92);

        QuestionRandom q93 = new QuestionRandom (
                "A 6xx indica um problema com:",
                "unidade de disquete", "disco rígido", "teclado", "CD ROM",
                "unidade de disquete");
        this.addQuestionRandom (q93);

        QuestionRandom q94 = new QuestionRandom (
                "Uma placa de som normalmente usa qual IRQ?",
                "6", "5", "15", "1",
                "5");
        this.addQuestionRandom (q94);

        QuestionRandom q95 = new QuestionRandom (
                "Durante a manutenção preventiva em uma impressora matricial, NÃO lubrifique:",
                "Conjunto do cilindro",
                "Polia da cabeça de impressão",
                "Pinos da cabeça de impressão",
                "Buchas da engrenagem de avanço do papel",
                "Pinos da cabeça de impressão ");
        this.addQuestionRandom (q95);

        QuestionRandom q96 = new QuestionRandom(
                "Você vê a mensagem \"invalid media device\" depois de " +
                        "instalar um novo disco rígido. O que você faz em seguida?",
                "Format","Fdisk",
                "Partition","Add the OS" +
                "","Format");
        this.addQuestionRandom(q96);

        QuestionRandom q97 = new QuestionRandom (
                "O que é o comando para desligar o modem?",
                "ATHU", "ATH", "ATZ", "ATX",
                "ATH");
        this.addQuestionRandom (q97);

        QuestionRandom q98 = new QuestionRandom (
                "Quais são os tipos de expansão compatíveis com a maioria das " +
                        "placas-mãe pll / plll?",
                "MCA, PCI", "ISA, EISA", "ISA, PCI, AGP", "ISA, VESA, PCI",
                "ISA , PCI, AGP ");
        this.addQuestionRandom (q98);

        QuestionRandom q99 = new QuestionRandom (
                "Ao instalar um modem interno, todos os IRQs a seguir podem ser usados, exceto?",
                "5", "10", "14", "Todos os anteriores",
                "14");
        this.addQuestionRandom (q99);

        QuestionRandom q100 = new QuestionRandom (
                "Um IRQ permite placas de interface para:",
                "Interromper a CPU para solicitar serviço",
                "Passar dados para a CPU para serem processados",
                "Passar dados de um cartão para outro",
                "Passar dados para a memória do computador ",
                " Interromper a CPU para solicitar serviço ");
        this.addQuestionRandom (q100);

        QuestionRandom q101 = new QuestionRandom(
                "Qual é o equivalente decimal do número binário 10111",
                "21","23","39","42",
                "23");
        this.addQuestionRandom(q101);

        QuestionRandom q102 = new QuestionRandom(
                "Para escrever em um disquete com o seu PC IBM, você deve primeiro",
                "digitalize-o","formate-o","compilar","hardware isso",
                "formate-o");
        this.addQuestionRandom(q102);

        QuestionRandom q103 = new QuestionRandom(
                "Qual é o termo para uma área de armazenamento temporário que compensa " +
                        "as diferenças na taxa de dados e no fluxo de dados entre os dispositivos?",
                "Buffer","Bus","Channel","Modem",
                "Buffer");
        this.addQuestionRandom(q103);

        QuestionRandom q104 = new QuestionRandom(
                "Quantos pontos coloridos formam um pixel colorido em uma tela?",
                "256","16","3","1",
                "3");
        this.addQuestionRandom(q104);

        QuestionRandom q105 = new QuestionRandom(
                "Uma das coisas que separa um TERMINAL de um PC é que o terminal não " +
                        "tem o quê?",
                "Keyboard","Monitor","Power Cord","CPU",
                "CPU");
        this.addQuestionRandom(q105);

        QuestionRandom q106 = new QuestionRandom(
                "Os dados são armazenados em disquete de que forma?",
                "Ink","Laser Bubble","Magnetism","Circuits",
                "Magnetism");
        this.addQuestionRandom(q106);

        QuestionRandom q107 = new QuestionRandom (
                "O menor elemento visual em um monitor de vídeo é chamado de quê?",
                "Caractere", "Pixel", "Byte", "Kwerk",
                "Pixel");
        this.addQuestionRandom (q107);

        QuestionRandom q108 = new QuestionRandom (
                "O tipo de armazenamento de dados considerado volátil é?",
                "R-O-M", "R-A-M", "TAPE", "DISK",
                "R-A-M");
        this.addQuestionRandom (q108);

        QuestionRandom q109 = new QuestionRandom (
                "Qual elemento natural é o ingrediente principal em chips de computador?",
                "Silício", "Carbono", "Ferro", "Urânio",
                "Silício");
        this.addQuestionRandom (q109);

        QuestionRandom q110 = new QuestionRandom (
                "Onde você encontra um entalhe de proteção contra gravação?",
                "Em um chip de computador", "Em um cartão perfurado",
                "Em uma memória somente leitura", "Em um disquete",
                "Em um disquete");
        this.addQuestionRandom (q110);

        QuestionRandom q111 = new QuestionRandom (
                "Qual das seguintes linguagens é mais adequada para um programa estruturado?",
                "PL / 1", "FORTRAN", "BASIC", "PASCAL",
                "PASCAL");
        this.addQuestionRandom (q111);

        QuestionRandom q112 = new QuestionRandom (
                "Um método assistido por computador para registrar e analisar sistemas" +
                        " existentes ou hipotéticos é",
                "Transmissão de dados", "Fluxo de dados",
                "Captura de dados", "Processamento de dados",
                "Fluxo de dados");
        this.addQuestionRandom (q112);

        QuestionRandom q113 = new QuestionRandom (
                "O cérebro de qualquer sistema de computador é",
                "ALU", "CPU", "Memória", "Unidade de controle",
                "CPU");
        this.addQuestionRandom (q113);

        QuestionRandom q114 = new QuestionRandom (
                "Que diferença o computador de 5ª geração tem dos computadores " +
                        "de outra geração?",
                "Avanço tecnológico", "Código científico",
                "Programação orientada a objetos", "Todas as anteriores",
                "Avanço tecnológico") ;
        this.addQuestionRandom (q114);

        QuestionRandom q115 = new QuestionRandom (
                "Qual das seguintes linguagens de computador é usada para " +
                        "inteligência artificial?",
                "FORTRAN", "PROLOG", "C", "COBOL",
                "PROLOG");
        this.addQuestionRandom (q115);

        QuestionRandom q116 = new QuestionRandom (
                "As faixas em um disco que podem ser acessadas sem " +
                        "reposicionar os cabeçotes R / W são",
                "Surface", "Cylinder", "Cluster", "All of the above"
                , "Cylinder");
        this.addQuestionRandom (q116);
        QuestionRandom q117 = new QuestionRandom (
                "Qual dos seguintes é o complemento de 1 de 10?", "01", "110",
                "11", "10",
                "01");
        this.addQuestionRandom (q117);

        QuestionRandom q118 = new QuestionRandom (
                "Uma seção do código para a qual o controle é transferido quando um " +
                        "processador é interrompido é conhecida como",
                "M", "SVC", "IP", "MDR",
                "M");
        this.addQuestionRandom (q118);

        QuestionRandom q119 = new QuestionRandom (
                "Qual parte interpreta as instruções do programa e inicia " +
                        "as operações de controle.",
                "Entrada", "Unidade de armazenamento",
                "Unidade lógica", "Unidade de controle",
                "Unidade de controle");
        this.addQuestionRandom (q119);

        QuestionRandom q120 = new QuestionRandom (
                "O sistema binário usa potências de",
                "2", "10", "8", "16",
                "2");
        this.addQuestionRandom (q120);

        QuestionRandom q121 = new QuestionRandom (
                "Um programa de computador que converte linguagem assembly " +
                        "em linguagem de máquina é",
                "Compiler", "Interpreter", "Assembler", "Comparator",
                "Assembler");
        this.addQuestionRandom (q121);

        QuestionRandom q122 = new QuestionRandom (
                "O tempo necessário para buscar e executar uma instrução de" +
                        " máquina simples é",
                "Tempo de atraso", "Ciclo da CPU",
                "Tempo real", "Tempo de busca",
                "Ciclo da CPU");
        this.addQuestionRandom (q122);

        QuestionRandom q123 = new QuestionRandom (
                "O tempo durante o qual uma peça do equipamento opera é chamado",
                "Tempo de busca", "Tempo efetivo",
                "Tempo de acesso", "Tempo real",
                "Tempo efetivo");
        this.addQuestionRandom (q123);

        QuestionRandom q124 = new QuestionRandom (
                "Os números binários precisam de mais casas para contar porque",
                "Eles são sempre números grandes",
                "Qualquer número de 0s pode ser adicionado na frente deles",
                "A base binária é pequena",
                "0s e 1s devem estar devidamente espaçados ",
                " A base binária é pequena ");
        this.addQuestionRandom (q124);

        QuestionRandom q125 = new QuestionRandom (
                "Qual método de acesso é usado para obter um registro " +
                        "de uma fita cassete?",
                "Direto", "Sequencial",
                "Aleatório", "Todas as opções anteriores",
                "Sequencial");
        this.addQuestionRandom (q125);

        QuestionRandom q126 = new QuestionRandom (
                "Qualquer tipo de armazenamento usado para armazenar informações" +
                        " entre as etapas de seu processamento é",
                "CPU", "Armazenamento primário",
                "Armazenamento intermediário", "Armazenamento interno",
                "Armazenamento intermediário");
        this.addQuestionRandom (q126);

        QuestionRandom q127 = new QuestionRandom (
                "Um nome aplicado pela Intel Corp. à tecnologia MOS de" +
                        " alta velocidade é chamado",
                "HDLC", "LAP", "HMOS", "SDLC",
                "HMOS");
        this.addQuestionRandom (q127);

        QuestionRandom q128 = new QuestionRandom (
                "Um componente do programa que permite estruturar um programa" +
                        " de forma incomum é conhecido como",
                "Correlação", "Coroutine", "Diagonalization", "Quene",
                "Coroutine");
        this.addQuestionRandom (q128);

        QuestionRandom q129 = new QuestionRandom (
                "O radiano de um sistema numérico",
                "É variável",
                "Não tem nada a ver com o valor da posição do dígito",
                "É igual ao número de seus dígitos de contagem distintos",
                "É sempre um número par",
                "É igual ao número de seus dígitos de contagem distintos");
        this.addQuestionRandom (q129);

        QuestionRandom q130 = new QuestionRandom (
                "A seção da CPU que seleciona, interpreta e vê a execução das" +
                        " instruções do programa",
                "Memória", "Unidade de registro",
                "Unidade de controle", "ALU",
                "Unidade de controle");
        this.addQuestionRandom (q130);

        QuestionRandom q131 = new QuestionRandom (
                "Qual tipo de sistema coloca o usuário em conversa direta com o " +
                        "computador por meio de um teclado?",
                "Processamento em tempo real",
                "Computador interativo",
                "Processamento em lote"
                , "Compartilhamento de tempo",
                "Computador interativo ");
        this.addQuestionRandom (q131);

        QuestionRandom q132 = new QuestionRandom (
                "O termo que se refere à evacuação do conteúdo de algumas partes " +
                        "da máquina é conhecido como",
                "Dump", "Enhancement", "Down", "Compiler",
                "Dump");
        this.addQuestionRandom (q132);

        QuestionRandom q133 = new QuestionRandom (
                "Um único pacote em um link de dados é conhecido como",
                "Caminho", "Quadro", "Bloco", "Grupo",
                "Quadro");
        this.addQuestionRandom (q133);

        QuestionRandom q134 = new QuestionRandom (
                "O processo de comunicação com um arquivo de um terminal é",
                "Interactive", "Interrogation",
                "Heuristic", "All of the above",
                "Interrogation");
        this.addQuestionRandom (q134);

        QuestionRandom q135 = new QuestionRandom (
                "Um limite comum entre dois sistemas é chamado",
                "Interdição", "Interface",
                "Superfície", "Nenhuma das opções acima",
                "Interface");
        this.addQuestionRandom (q135);

        QuestionRandom q136 = new QuestionRandom (
                "O exame e alteração de bits únicos ou pequenos grupos dentro de" +
                        " uma palavra é chamado",
                "Bit", "Byte", "Manipulação de bit", "Fatia de bit",
                "Manipulação de bit");
        this.addQuestionRandom (q136);

        QuestionRandom q137 = new QuestionRandom (
                "Qual computador foi projetado para ser o mais compacto possível?",
                "Mini", "Super computador", "Micro computador", "Mainframe",
                "Micro computador");
        this.addQuestionRandom (q137);

        QuestionRandom q138 = new QuestionRandom (
                "Qual método é usado para conectar um computador remoto?",
                "Dispositivo", "Dialup", "Diagnostic", "Logic circuit",
                "Dialup");
        this.addQuestionRandom (q138);

        QuestionRandom q139 = new QuestionRandom (
                "Quantos códigos de bits são usados ​​pelo código Murray para " +
                        "máquinas TELEPRINTER.",
                "4", "5", "9", "25",
                "5");
        this.addQuestionRandom (q139);

        QuestionRandom q140 = new QuestionRandom (
                "Os símbolos usados ​​em uma linguagem assembly são",
                "Códigos", "Mnemônicos", "Assembler", "Todos os anteriores",
                "Mnemônicos");
        this.addQuestionRandom (q140);

        QuestionRandom q141 = new QuestionRandom (
                "O complemento de 2 de um número binário é obtido adicionando " +
                        "...... ao seu complemento de 1.",
                "0", "1", "10", "12"
                , "1 ");
        this.addQuestionRandom (q141);

        QuestionRandom q142 = new QuestionRandom (
                "Uma linguagem de programação de sistemas para microcomputadores " +
                        "na família Intel é",
                "PL / C", "PL / CT", "PL / M", "PLA",
                "PL / M");
        this.addQuestionRandom (q142);

        QuestionRandom q143 = new QuestionRandom (
                "O dado que indica algum estado importante no conteúdo de entrada " +
                        "ou saída é",
                "Sequence", "Sentinel", "SIO", "Sibling",
                "Sentinel");
        this.addQuestionRandom (q143);

        QuestionRandom q144 = new QuestionRandom (
                "Qual é uma versão não padrão de uma linguagem de computação?",
                "PROLOG", "APL", "Exército", "PL / 1",
                "Exército");
        this.addQuestionRandom (q144);

        QuestionRandom q145 = new QuestionRandom (
                "Qual das alternativas a seguir ainda é útil para adicionar números?",
                "EDSAC", "ENIAC", "Abacus", "UNIVAC",
                "Abacus");
        this.addQuestionRandom (q145);

        QuestionRandom q146 = new QuestionRandom (
                "O tempo médio necessário para o setor correto de um disco " +
                        "chegar ao cabeçote de leitura e gravação é _____",
                "Tempo de inatividade", "Tempo de busca",
                "Atraso de rotação", "Tempo de acesso",
                " Atraso rotacional ");
        this.addQuestionRandom (q146);

        QuestionRandom q147 = new QuestionRandom (
                "Um número que é usado para controlar a forma de outro número" +
                        " é conhecido como",
                "Mapa", "Máscara", "Mamtossa", "Marcador",
                "Máscara");
        this.addQuestionRandom (q147);

        QuestionRandom q148 = new QuestionRandom (
                "Um microcomputador de uso único de uso geral projetado " +
                        "para ser operado por uma pessoa por vez é",
                "Computador de uso especial", "KIPS",
                "M", "PC",
                "PC") ;
        this.addQuestionRandom (q148);

        QuestionRandom q149 = new QuestionRandom (
                "ASCII significa",
                "Código da American Scientific para intercâmbio de informações",
                "Código científico multifacetado para intercâmbio de informações",
                "Código da American Scientific para intercâmbio de informações",
                "Código da American Scientific para intercâmbio de informações",
                " Código padrão americano para intercâmbio de informações ");
        this.addQuestionRandom (q149);

        QuestionRandom q150 = new QuestionRandom (
                "Qual dispositivo de operação do computador dispensa o uso do teclado?",
                "Joystick", "Caneta de luz", "Mouse", "Touch",
                "Mouse");
        this.addQuestionRandom (q150);

        QuestionRandom q151 = new QuestionRandom (
                "O microcomputador, Intel MCS-80 é baseado no amplamente utilizado Intel",
                "microprocessador 8080", "microprocessador 8085",
                "microprocessador 8086", "microprocessador 8082",
                "microprocessador 8080");
        this.addQuestionRandom (q151);

        QuestionRandom q152 = new QuestionRandom (
                "Que é uma linguagem de alto nível orientada à máquina para " +
                        "as máquinas da série GEC 4080.",
                "LOGO", "SNOBOL", "Babbage", "ALGOL",
                "Babbage");
        this.addQuestionRandom (q152);

        QuestionRandom q153 = new QuestionRandom (
                "Um programa que é empregado no desenvolvimento, reparo " +
                        "ou aprimoramento de outros programas é conhecido como",
                "Software de sistema", "Ferramenta de softwa" +
                "re", "Programa de aplicativos", "Programa utilitário",
                "Ferramenta de software ");
        this.addQuestionRandom (q153);

        QuestionRandom q154 = new QuestionRandom (
                "Qualquer dispositivo de armazenamento adicionado a um computador " +
                        "além do armazenamento principal imediatamente utilizável é conhecido como",
                "Disquete", "Disco rígido",
                "Armazenamento de backup", "Cartão perfurado",
                "Armazenamento de backup") ;
        this.addQuestionRandom (q154);

        QuestionRandom q155 = new QuestionRandom (
                "Qual dispositivo de saída é usado para traduzir informações " +
                        "de um computador para a forma pictórica no papel.",
                "Mouse", "Plotter", "Painel de toque", "Perfurador de cartão",
                "Plotter");
        this.addQuestionRandom (q155);

        QuestionRandom q156 = new QuestionRandom (
                "A lista de instruções codificadas é chamada",
                "Programa de computador", "Algoritmo",
                "Fluxograma", "Programas utilitários",
                "Programa de computador");
        this.addQuestionRandom (q156);

        QuestionRandom q157 = new QuestionRandom (
                "A técnica usada pelos códigos para converter um sinal " +
                        "analógico em um fluxo de bits digital é conhecida como",
                "Modulação de código de pulso", "Esticador de pulso",
                "Processamento de consulta", "Gerenciamento de fila",
                "Pulso modulação de código ");
        this.addQuestionRandom (q157);

        QuestionRandom q158 = new QuestionRandom (
                "Um dispositivo de entrada óptica que interpreta " +
                        "marcas de lápis em mídia de papel é",
                "O.M.R", "Leitor de cartão perfurado",
                "Scanners ópticos", "Fita magnética",
                "O.M.R");
        this.addQuestionRandom (q158);

        QuestionRandom q159 = new QuestionRandom (
                "A vantagem mais importante de um IC é sua",
                "Fácil substituição em caso de falha de circuito",
                "Confiabilidade extremamente alta",
                "Custo reduzido",
                "Baixo consumo de energia",
                "Confiabilidade extremamente alta") ;
        this.addQuestionRandom (q159);

        QuestionRandom q160 = new QuestionRandom (
                "Divisão de data é a terceira divisão de um programa _____.",
                "COBOL", "BASIC", "PASCAL", "FORTH",
                "COBOL");
        this.addQuestionRandom (q160);

        QuestionRandom q161 = new QuestionRandom (
                "Qual idioma foi desenvolvido pelo Dr. Seymour Aubrey Papert?",
                "APL", "COBOL", "LOGO", "FORTRAN",
                "LOGO");
        this.addQuestionRandom (q161);

        QuestionRandom q162 = new QuestionRandom (
                "Um programa que converte dados de computador em algum " +
                        "sistema de código diferente do normal é conhecido como",
                "Encoder", "Simulation", "Emulator", "Coding",
                "Encoder");
        this.addQuestionRandom (q162);

        QuestionRandom q163 = new QuestionRandom (
                "Um dispositivo projetado para ler informações codificadas em um " +
                        "pequeno cartão de plástico é",
                "Fita magnética",
                "Leitor de crachá",
                "Perfurador de fita",
                "Perfurador de cartão",
                "Leitor de crachá");
        this.addQuestionRandom (q163);

        QuestionRandom q164 = new QuestionRandom (
                "Um computador híbrido usa um _____ para converter sinais digitais" +
                        " de um computador em sinais analógicos.",
                "Modulador", "Demodulador", "Modem", "Decodificador",
                "Modem");
        this.addQuestionRandom (q164);

        QuestionRandom q165 = new QuestionRandom (
                "Um grupo de fitas magnéticas, vídeos ou terminais " +
                        "geralmente sob o controle de um mestre é",
                "Cylinder", "Cluster", "Surface", "Track",
                "Cluster");
        this.addQuestionRandom (q165);

        QuestionRandom q166 = new QuestionRandom (
                "Qualquer dispositivo que realiza conversão de sinal é",
                "Modulador", "Modem", "Teclado", "Plotter",
                "Modulador");
        this.addQuestionRandom (q166);

        QuestionRandom q167 = new QuestionRandom (
                "Códigos que consistem em marcas claras e escuras que podem " +
                        "ser lidas opticamente são conhecidos como",
                "Mnemônicos", "Código de barras",
                "Decodificador", "Todos os anteriores",
                "Código de barras");
        this.addQuestionRandom (q167);

        QuestionRandom q168 = new QuestionRandom (
                "Um tipo de canal usado para conectar um processador central " +
                        "e periféricos que usa multiplexação é conhecido como",
                "Modem", "Rede",
                "Multiplexador", "Todos os anteriores",
                "Multiplexador") ;
        this.addQuestionRandom (q168);

        QuestionRandom q169 = new QuestionRandom (
                "A primeira geração de computadores disponíveis foi " +
                        "baseada nos microprocessadores de bits.",
                "4", "8", "16", "64",
                "8");
        this.addQuestionRandom (q169);

        QuestionRandom q170 = new QuestionRandom (
                "O quadro completo dos dados armazenados no banco de " +
                        "dados é conhecido como",
                "Registro", "Esquema",
                "Fluxograma do sistema", "DBMS",
                "Esquema");
        this.addQuestionRandom (q170);

        QuestionRandom q171 = new QuestionRandom (
                "Qual dos seguintes deve ser usado em todos os aplicativos " +
                        "executados em computadores mainframe.",
                "LOGO", "APL", "PL / 1", "OCCAM",
                "PL / 1") ;
        this.addQuestionRandom (q171);

        QuestionRandom q172 = new QuestionRandom (
                "Um idioma que está perto de ser usado no computador é",
                "Linguagem de alto nível", "Linguagem de montagem",
                "Linguagem de baixo nível", "Todas as anteriores",
                "Baixo- linguagem de nível ");
        this.addQuestionRandom (q172);

        QuestionRandom q173 = new QuestionRandom (
                "Que é uma unidade que representa os bits não discretos.",
                "Baud", "Byte", "Bit", "Todos os anteriores",
                "Baud");
        this.addQuestionRandom (q173);

        QuestionRandom q174 = new QuestionRandom (
                "O dispositivo que pode alimentar e aceitar dados de um computador é",
                "ALU", "CPU",
                "Dispositivo de entrada-saída", "Todos os anteriores",
                "Entrada-saída dispositivo");
        this.addQuestionRandom (q174);

        QuestionRandom q175 = new QuestionRandom (
                "O pessoal que lida com o computador e seu gerenciamento " +
                        "juntos são chamados de",
                "Software", "Humanware",
                "Firmware", "Hardware",
                "Humanware");
        this.addQuestionRandom (q175);

        QuestionRandom q176 = new QuestionRandom (
                "Um computador digital moderno tem",
                "Velocidade extremamente alta", "Grande memória",
                "Matriz quase ilimitada", "Todas as anteriores",
                "Todas as anteriores");
        this.addQuestionRandom (q176);

        QuestionRandom q177 = new QuestionRandom (
                "Qual dos seguintes pode armazenar informações na forma " +
                        "de cavidades microscópicas em discos de metal.",
                "Discos de laser", "Cassetes de fita",
                "Cartucho de RAM", "Cartões perfurados",
                "Discos de laser" );
        this.addQuestionRandom (q177);

        QuestionRandom q178 = new QuestionRandom (
                "Um dispositivo para converter impressões manuscritas em " +
                        "caracteres codificados e coordenadas posicionais para entrada em " +
                        "um computador é",
                "Touch panel", "Mouse", "Wand", "Writing tablet",
                "Writing tablet") ;
        this.addQuestionRandom (q178);

        QuestionRandom q179 = new QuestionRandom (
                "Um sistema de armazenamento para pequenas quantidades de dados é",
                "Cartão magnético", "Fita magnética",
                "Cartão perfurado", "Leitor de marca óptica",
                "Cartão magnético");
        this.addQuestionRandom (q179);

        QuestionRandom q180 = new QuestionRandom (
                "Qual é outro nome para linguagem funcional?",
                "Máquina", "Linguagem de aplicativo",
                "Linguagem de baixo nível", "Linguagem de alto nível",
                "Linguagem de aplicativo");
        this.addQuestionRandom (q180);

        QuestionRandom q181 = new QuestionRandom (
                "Compiladores e intérpretes são eles próprios",
                "Linguagem de alto nível", "Códigos",
                "Programas", "Mnemônicos",
                "Programas");
        this.addQuestionRandom (q181);

        QuestionRandom q182 = new QuestionRandom (
                "Um compilador significa",
                "Uma pessoa que compila programas fonte",
                "A mesma coisa que um programador",
                "Operador Keypunch",
                "Um programa que traduz programa fonte em programa objeto",
                "Um programa que traduz o programa fonte em programa objeto ");
        this.addQuestionRandom (q182);

        QuestionRandom q183 = new QuestionRandom (
                "Um dispositivo em forma de caneta que pode detectar a luz " +
                        "e é usado para apontar pontos na tela de vídeo.",
                "Mouse", "Caneta de luz", "Joystick", "Plotter",
                "Caneta de luz ");
        this.addQuestionRandom (q183);

        QuestionRandom q184 = new QuestionRandom (
                "Uma notação usada para expressar claramente no algoritmo é conhecida como",
                "Linguagem de algoritmo", "Linguagem de montagem",
                "Linguagem de máquina", "Linguagem de alto nível",
                "Linguagem de algoritmo");
        this.addQuestionRandom (q184);

        QuestionRandom q185 = new QuestionRandom (
                "Compactação de dados digitais é um armazenamento eficiente",
                "Buffer", "CPU", "Packing", "Field",
                "Packing");
        this.addQuestionRandom (q185);

        QuestionRandom q186 = new QuestionRandom (
                "Um sistema operacional destinado ao uso em sistemas " +
                        "baseados em microprocessadores que suportam um único usuário é",
                "PC-DOS", "MS-DOS", "UNIX", "CP / M",
                "CP / M ");
        this.addQuestionRandom (q186);

        QuestionRandom q187 = new QuestionRandom (
                "Qual linguagem de programação é baseada no Algol 60.",
                "PILOT", "SNOBOL", "ADA", "simula",
                "simula");
        this.addQuestionRandom (q187);

        QuestionRandom q188 = new QuestionRandom (
                "A memória do computador consiste em",
                "RAM", "ROM", "PROM", "Todas as anteriores",
                "Todas as anteriores");
        this.addQuestionRandom (q188);

        QuestionRandom q189 = new QuestionRandom (
                "O caminho pelo qual a comunicação é alcançada entre o " +
                        "processador central e outros dispositivos é chamado",
                "Trilha de auditoria", "Rede", "Barramento", "Canal",
                "Barramento");
        this.addQuestionRandom (q189);

        QuestionRandom q190 = new QuestionRandom (
                "Um sistema autônomo que produz uma página de saída impressa por vez é",
                "Impressora de página", "Impressora de linha",
                "Impressora a laser", "Impressora matricial",
                "Impressora de página" );
        this.addQuestionRandom (q190);

        QuestionRandom q191 = new QuestionRandom (
                "Uma memória que não muda seu conteúdo sem causas externas é conhecida como",
                "Memória dinâmica", "Memória estática",
                "RAM", "EEPROM",
                "Memória estática");
        this.addQuestionRandom (q191);

        QuestionRandom q192 = new QuestionRandom (
                "O boletim e a lista de mérito formam os",
                "Dados de saída", "Processamento de dados",
                "Processamento central", "Dados de entrada",
                "Dados de saída");
        this.addQuestionRandom (q192);

        QuestionRandom q193 = new QuestionRandom (
                "Um número que é armazenado e processado, mas não na forma" +
                        " padrão exponencial é chamado",
                "Número de ponto flutuante", "Número de ponto fixo",
                "Número octal", "Número decimal",
                "Ponto fixo número");
        this.addQuestionRandom (q193);

        QuestionRandom q194 = new QuestionRandom (
                "Uma memória que contém micro programas é",
                "Memória central", "ROM", "RAM", "Memória de controle",
                "ROM");
        this.addQuestionRandom (q194);

        QuestionRandom q195 = new QuestionRandom (
                "Um dispositivo inventado pelo Dr. Bobeck em 1966, para" +
                        " armazenamento em massa de dados é",
                "Fita de papel perfurada", "Armazenamento de bolha magnética",
                "Fita magnética", "Disco magnético",
                "Bolha magnética armazenar");
        this.addQuestionRandom (q195);

        QuestionRandom q196 = new QuestionRandom (
                "A organização e a interconexão dos vários componentes de um" +
                        " sistema de computador é",
                "Arquitetura", "Redes", "Gráficos", "Projetando",
                "Arquitetura");
        this.addQuestionRandom (q196);

        QuestionRandom q197 = new QuestionRandom (
                "Qual das alternativas a seguir é a codificação de dados para que " +
                        "não possam ser facilmente compreendidos se interceptados.",
                "Barcode", "Decoder", "Encryption", "Mnemonics",
                "Encryption") ;
        this.addQuestionRandom (q197);

        QuestionRandom q198 = new QuestionRandom (
                "RAM é usada como memória curta porque é",
                "Volátil", "Tem pequena capacidade",
                "É muito caro", "É programável",
                "Volátil");
        this.addQuestionRandom (q198);

        QuestionRandom q199 = new QuestionRandom(
                "Um computador eletrônico moderno é uma máquina que se destina a",
                "Fazendo cálculos matemáticos rápidos",
                "Armazenamento de entrada, manipulação de saída de dados"
                ,"Processamento eletrônico de dados",
                "Executar tarefas repetitivas com precisão",
                "Armazenamento de entrada, manipulação de saída de dados");
        this.addQuestionRandom(q199);

        QuestionRandom q200 = new QuestionRandom (
                "Qual é um dispositivo que transforma informações em formato digital?",
                "Modem", "Digitalizador", "Mouse", "Caneta de luz",
                "Digitalizador");
        this.addQuestionRandom (q200);

        QuestionRandom q201 = new QuestionRandom (
                "Qual método de backup é o mais rápido e requer a menor quantidade de " +
                        "espaço de armazenamento de backup?",
                "Diário", "Normal", "Diferencial", "Incremental",
                "Incremental");
        this.addQuestionRandom (q201);

        QuestionRandom q202 = new QuestionRandom (
                "Verificar o disco verifica e corrige ____.",
                "Unidades de fita", "Unidades de disco rígido",
                "Unidades de CD-ROM", "Unidades de DVD-ROM",
                "Unidades de disco rígido");
        this.addQuestionRandom (q202);

        QuestionRandom q203 = new QuestionRandom (
                "Onde está localizado o comando DIR?",
                "C: | WINDOWS", "COMMAND.COM",
                "C: | WINDOWS | SYSTEM", "C: | WINDOWS | COMMAND",
                "COMMAND. COM");
        this.addQuestionRandom (q203);

        QuestionRandom q204 = new QuestionRandom (
                "Qual comando permite visualizar ou editar arquivos de configuração?",
                "SYSEDIT", "REGEDIT",
                "CFGEDIT", "AUTOEDIT", "SYSEDIT");
        this.addQuestionRandom (q204);

        QuestionRandom q205 = new QuestionRandom (
                "Qual utilitário é o melhor para editar o registro do Windows 95?",
                "Editar", "Regedit",
                "Reged32", "Gerenciador de Dispositivos",
                "Regedit");
        this.addQuestionRandom (q205);

        QuestionRandom q206 = new QuestionRandom (
                "Quais arquivos irão determinar a configuração de inicialização" +
                        " múltipla do Windows 9x?",
                "IO.SYS", "SYSTEM.INI", "MSDOS.SYS", "CONFIG.SYS",
                "MSDOS.SYS") ;
        this.addQuestionRandom (q206);

        QuestionRandom q207 = new QuestionRandom (
                "Quais pressionamentos de tecla alternam um usuário entre aplicativos " +
                        "em execução simultânea no Windows?",
                "FN + TAB", "ALT + TAB", "CTRL + TAB", "SHIFT + TAB",
                "ALT + TAB ");
        this.addQuestionRandom (q207);

        QuestionRandom q208 = new QuestionRandom (
                "Qual é o tipo de arquivo do registro do Windows 9x?",
                "Arquivo de texto simples", "Banco de dados relacional",
                "Banco de dados hierárquico", "Modelo de planilha",
                "Banco de dados hierárquico");
        this.addQuestionRandom (q208);

        QuestionRandom q209 = new QuestionRandom (
                "Quais dessas afirmações seriam encontradas no arquivo autoexec.bat?",
                "FILES = 40", "PATH = C: \\;",
                "DOS = HIGH, UMB", "DEVICE = HIMEM.SYS ",
                " PATH = C: \\; ");
        this.addQuestionRandom (q209);

        QuestionRandom q210 = new QuestionRandom(
                "Qual é o comando apropriado para instalar o Console de recuperação" +
                        " do Windows 2000 como uma opção de inicialização se o CD Rom for a unidade E?",
                "E:|i386\\SETUP.EXE\\CONSOLE",
                "E:|i386\\CONSOLE.EXE\\INSTALL",
                "E:|i386\\WINNT32.EXE\\CMDCONS",
                "E:|i386\\WIN2000.EXE\\RECOVERY",
                "E:|i386\\WINNT32.EXE\\CMDCONS");
        this.addQuestionRandom(q210);

        QuestionRandom q211 = new QuestionRandom (
                "A parte da instrução de nível de máquina, que informa ao processador" +
                        " central o que deve ser feito, é",
                "Código de operação", "Endereço",
                "Localizador", "Flip-Flop",
                "Operação código ");
        this.addQuestionRandom (q211);

        QuestionRandom q212 = new QuestionRandom (
                "Qual dos seguintes se refere à memória associativa?",
                "O endereço dos dados é gerado pela CPU",
                "O endereço dos dados é fornecido pelos usuários",
                "não há necessidade para um endereço, isto é, os dados " +
                        "são usados ​​como um endereço ",
                " os dados são acessados ​​sequencialmente ",
                " não há necessidade de um endereço, ou seja, os dados " +
                        "são usados ​​como um endereço ");
        this.addQuestionRandom (q212);

        QuestionRandom q213 = new QuestionRandom (
                "Para evitar a condição de corrida, o número de processos que" +
                        " podem estar simultaneamente dentro de sua seção crítica é",
                "8", "16", "1", "0",
                "1");
        this.addQuestionRandom (q213);

        QuestionRandom q214 = new QuestionRandom (
                "Um programa de sistema que combina os módulos compilados " +
                        "separadamente de um programa em uma forma adequada para execução",
                "assembler", "assembler",
                "cross compiler", "load and go",
                "linking loader" );
        this.addQuestionRandom (q214);

        QuestionRandom q215 = new QuestionRandom (
                "Processo é",
                "programa em linguagem de alto nível mantido no disco",
                "conteúdo da memória principal",
                "um programa em execução",
                "um trabalho na memória secundária",
                "um programa em execução" );
        this.addQuestionRandom (q215);

        QuestionRandom q216 = new QuestionRandom (
                "Estrutura de endereçamento",
                "define o método fundamental para determinar endereços de operandos eficazes",
                "são variações no uso de estruturas de endereçamento fundamentais " +
                        "ou algumas ações associadas relacionadas ao endereçamento",
                "executa as operações indicadas em dois registros rápidos da máquina e " +
                        "deixam o resultado em um dos registros ",
                " todas as anteriores ",
                " define o método fundamental de determinação dos" +
                        " endereços efetivos dos operandos ");
        this.addQuestionRandom (q216);

        QuestionRandom q217 = new QuestionRandom(
                "tudo acima",
                "é um dispositivo de memória de hardware que denota a localização " +
                        "da instrução atual sendo executada",
                "é um grupo de circuitos elétricos (hardware), que executa a intenção " +
                        "de instruções buscadas na memória",
                "contém o endereço do local da memória que deve ser lido ou armazenado em",
                "contém uma cópia do local de memória designado especificado pelo MAR " +
                        "após uma \"leitura\" or the new contents of the memory prior to a \"write\"",
                "contains a copy of the designated memory location specified" +
                        " by the MAR after a \"read\" or the new contents of the memory prior" +
                        " to a \"write\"");
        this.addQuestionRandom(q217);

        QuestionRandom q218 = new QuestionRandom (
                "A estratégia de permitir que processos logicamente executáveis" +
                        " ​​sejam temporariamente suspensos é chamada de",
                "agendamento preemptivo", "agendamento não preemptivo",
                "trabalho mais curto primeiro", "trabalho mais curto primeiro",
                "agendamento preemptivo ");
        this.addQuestionRandom (q218);

        QuestionRandom q219 = new QuestionRandom (
                "O algoritmo LRU",
                "sai das páginas que foram usadas recentemente",
                "sai das páginas que não foram usadas recentemente",
                "sai das páginas que foram menos usadas recentemente",
                "sai das páginas a primeira página em uma determinada área ",
                " páginas que foram menos usadas recentemente ");
        this.addQuestionRandom (q219);

        QuestionRandom q220 = new QuestionRandom (
                "Qual dos seguintes softwares de sistema faz o trabalho " +
                        "de mesclar os registros de dois arquivos em um?",
                "Software de segurança",
                "Programa utilitário",
                "Software de rede",
                "Sistema de documentação",
                "Utilitário programa");
        this.addQuestionRandom (q220);

        QuestionRandom q221 = new QuestionRandom (
                "Fork é",
                "o despacho de uma tarefa",
                "a criação de um novo trabalho",
                "a criação de um novo processo",
                "aumentando a prioridade de uma tarefa",
                "a criação de um novo processo ");
        this.addQuestionRandom (q221);

        QuestionRandom q222 = new QuestionRandom (
                "Thrashing",
                "é uma consequência natural dos sistemas de memória virtual",
                "sempre pode ser evitado trocando",
                "sempre ocorre em computadores grandes",
                "pode ​​ser causado por algoritmos de paginação deficientes",
                "pode ser causado por algoritmos de paginação deficientes ");
        this.addQuestionRandom (q222);

        QuestionRandom q223 = new QuestionRandom (
                "O estado do supervisor é",
                "nunca usado",
                "inserido pelos programas quando entram no processador",
                "necessário para realizar qualquer I / O",
                "permitido apenas para o sistema operacional",
                "apenas permitido para o sistema operacional ");
        this.addQuestionRandom (q223);

        QuestionRandom q224 = new QuestionRandom (
                "Qual das seguintes etapas de instrução, seria escrito dentro " +
                        "da caixa em forma de diamante, de um fluxograma?",
                "S = B - C", "IS A <10", "PRINT A", "DATA X, 4Z",
                "IS A <10");
        this.addQuestionRandom (q224);

        QuestionRandom q225 = new QuestionRandom (
                "Qual das seguintes afirmações é falsa?",
                "A técnica de compactação de armazenamento envolve mover todas as " +
                        "áreas ocupadas de armazenamento para uma extremidade ou " +
                        "outra do armazenamento principal",
                "a compactação não envolve realocação de programas",
                "compactação também é conhecida como coleta de lixo",
                "o sistema deve parar tudo enquanto executa a compactação",
                "a compactação não envolve realocação de programas");
        this.addQuestionRandom (q225);

        QuestionRandom q226 = new QuestionRandom (
                "Comunicação entre processos",
                "é necessária para todos os processos",
                "geralmente é feita por meio de unidades de disco",
                "nunca é necessário",
                "permite que os processos sincronizem a atividade",
                "permite que os processos sincronizem a atividade") ;
        this.addQuestionRandom (q226);

        QuestionRandom q227 = new QuestionRandom (
                "Qual das funções a seguir é (são) realizada (s) pelo carregador",
                "alocar espaço na memória para os programas e resolver referências " +
                        "simbólicas entre conjuntos de objetos",
                "ajustar todos os locais dependentes de endereço, como constantes " +
                        "de endereço , para corresponder ao espaço alocado ",
                " coloque fisicamente as instruções da máquina e os dados na memória ",
                " Todas as anteriores ",
                " Todas as anteriores ");
        this.addQuestionRandom (q227);

        QuestionRandom q228 = new QuestionRandom (
                "Sistemas amigáveis ​​são:",
                "necessários para programação orientada a objetos",
                "fácil de desenvolver",
                "comum entre sistemas operacionais de mainframe tradicionais",
                "tornando-se mais comum",
                "tornando-se mais comum" );
        this.addQuestionRandom (q228);

        QuestionRandom q229 = new QuestionRandom (
                "Qual dos seguintes modos de endereçamento facilita o " +
                        "acesso a um operando cuja localização é definida em relação " +
                        "ao início da estrutura de dados em que aparece?",
                "Ascendente",
                "ordenação",
                "índice",
                "indireto",
                "índice");
        this.addQuestionRandom (q229);

        QuestionRandom q230 = new QuestionRandom (
                "Ao executar o DOS em um PC, qual comando seria usado para " +
                        "duplicar o disquete inteiro?",
                "COPY", "DISKCOPY", "CHKDSK", "TYPE",
                "DISKCOPY");
        this.addQuestionRandom (q230);

        QuestionRandom q231 = new QuestionRandom (
                "Memory",
                "é um dispositivo que realiza uma sequência de operações" +
                        " especificadas por instruções na memória.",
                "É o dispositivo onde as informações são armazenadas",
                "é uma sequência de instruções",
                "é tipicamente caracterizado por processamento interativo e divisão de" +
                        " tempo do tempo da CPU para permitir uma resposta rápida a cada usuário. ",
                " é o dispositivo onde a informação é armazenada ");
        this.addQuestionRandom (q231);

        QuestionRandom q232 = new QuestionRandom (
                "Qual das seguintes regras exclui o uso de IR PARA?",
                "Fluxograma", "HIPO-DIAGRAMAS",
                "Diagrama de Nassi-Shneiderman", "Todos os anteriores",
                "Diagrama de Nassi-Shneiderman ");
        this.addQuestionRandom (q232);

        QuestionRandom q233 = new QuestionRandom (
                "Um programa de sistema que configura um programa " +
                        "executável na memória principal pronto para execução é",
                "assembler", "linker", "loader", "compiler",
                "loader");
        this.addQuestionRandom (q233);

        QuestionRandom q234 = new QuestionRandom (
                "Um programa de sistema que configura um programa " +
                        "executável na memória principal pronto para execução é",
                "assembler", "linker", "loader", "compiler",
                "loader");
        this.addQuestionRandom (q234);

        QuestionRandom q235 = new QuestionRandom (
                "Quais dos itens a seguir são carregados na memória principal " +
                        "quando o computador é inicializado?",
                "Instruções de comando interno", "instruções de comando externo",
                "programas utilitários", "instruções de processamento de texto",
                "comando interno instruções ");
        this.addQuestionRandom (q235);

        QuestionRandom q236 = new QuestionRandom (
                "O algoritmo FIFO",
                "executa primeiro o trabalho que entrou na fila por último",
                "executa primeiro o trabalho que entrou na fila",
                "executa primeiro o trabalho que está há mais tempo na fila" ,
                "executa primeiro o trabalho com o mínimo de necessidades do processador",
                "executa primeiro o trabalho que entrou primeiro na fila");
        this.addQuestionRandom (q236);

        QuestionRandom q237 = new QuestionRandom (
                "Qual é o nome dado à coleção organizada de software que" +
                        " controla a operação geral de um computador?",
                "Sistema de trabalho", "Sistema periférico",
                "Sistema operacional", "Sistema de controle",
                " Sistema operacional");
        this.addQuestionRandom (q237);

        QuestionRandom q238 = new QuestionRandom (
                "O princípio da localidade de referência justifica o uso de",
                "reenterável", "não reutilizável",
                "memória virtual", "memória cache",
                "memória cache");
        this.addQuestionRandom (q238);

        QuestionRandom q239 = new QuestionRandom (
                "O registro ou local da memória principal que contém o" +
                        " endereço efetivo do operando é conhecido como",
                "ponteiro", "registro indexado", "localização especial",
                "bloco de rascunho",
                "ponteiro");
        this.addQuestionRandom (q239);

        QuestionRandom q240 = new QuestionRandom (
                "A base de dados de código de montagem está associada a",
                "versão em linguagem de montagem do programa que é criada pela" +
                        " fase de geração de código e é inserida na fase de montagem.",
                "Uma tabela permanente de regras de decisão no forma de padrões" +
                        " para combinar com a tabela de símbolos uniforme para " +
                        "descobrir a estrutura sintática. ",
                " consiste em uma lista completa ou parcial ou os tokens" +
                        " conforme aparecem no programa. Criado por análise lexical e" +
                        " usado para análise e interpretação de sintaxe. ",
                " uma tabela permanente que lista todas as palavras-chave e s" +
                        "ímbolos especiais da linguagem em forma simbólica. ",
                " versão em linguagem de montagem do programa que é criada pela" +
                        " fase de geração de código e é entrada para a fase de montagem. ");
        this.addQuestionRandom (q240);

        QuestionRandom q241 = new QuestionRandom (
                "Thrashing pode ser evitado se",
                "as páginas, pertencentes ao conjunto de trabalho dos " +
                        "programas, estão na memória principal",
                "a velocidade da CPU é aumentada",
                "a velocidade do processador I / O é aumentado ",
                " todas as opções anteriores ",
                " as páginas, pertencentes ao conjunto de trabalho dos" +
                        " programas, estão na memória principal ");
        this.addQuestionRandom (q241);

        QuestionRandom q242 = new QuestionRandom(
                "Ao analisar a compilação do programa PL / I, " +
                        "o termo\"Análise lexical\" está associado com",
                "reconhecimento de construções sintáticas básicas por meio de reduções.",
                "reconhecimento de elementos básicos e criação de símbolos uniformes",
                "criação de mais matriz opcional.",
                "uso de processador de macro para produzir código de montagem mais otimizado",
                "reconhecimento de elementos básicos e criação de símbolos uniformes");
        this.addQuestionRandom(q242);

        QuestionRandom q243 = new QuestionRandom (
                "A resolução de símbolos definidos externamente é realizada por",
                "Linker", "Loader",
                "Compiler", "Assembler",
                "Linker");
        this.addQuestionRandom (q243);

        QuestionRandom q244 = new QuestionRandom (
                "Geração de sistema:",
                "é sempre muito simples",
                "é sempre muito difícil",
                "varia em dificuldade entre sistemas",
                "requer ferramentas extensas para ser compreensível",
                "varia em dificuldade entre sistemas" );
        this.addQuestionRandom (q244);

        QuestionRandom q245 = new QuestionRandom(
                "O Registro de Endereço de Memória",
                "é um dispositivo de memória de hardware que denota a localização " +
                        "da instrução atual sendo executada.",
                "é um grupo de circuitos elétricos (hardware), que executa a " +
                        "intenção de instruções buscadas na memória.",
                "contém o endereço do local da memória que deve ser lido ou armazenado.",
                "contém uma cópia do local de memória designado especificado pelo" +
                        " MAR após uma \"leitura\" ou o novo conteúdo da memória antes de" +
                        " uma \"escrita\".",
                "contém o endereço do local da memória que deve ser lido ou armazenado em.");
        this.addQuestionRandom(q245);

        QuestionRandom q246 = new QuestionRandom (
                "Em sistemas de memória virtual, tradução de endereço dinâmico",
                "é o hardware necessário para implementar paginação",
                "armazena páginas em um local específico no disco",
                "é inútil quando a troca é usada",
                "faz parte do algoritmo de paginação do sistema operacional ",
                " é o hardware necessário para implementar a paginação ");
        this.addQuestionRandom (q246);

        QuestionRandom q247 = new QuestionRandom (
                "Fragmentação do sistema de arquivos",
                "ocorre apenas se o sistema de arquivos for usado incorretamente",
                "sempre pode ser evitado",
                "pode ​​ser removido temporariamente por compactação",
                "é uma característica de todos os sistemas de arquivos ",
                " pode ser removido temporariamente por compactação ");
        this.addQuestionRandom (q247);

        QuestionRandom q248 = new QuestionRandom (
                "Um programa não realocável é aquele que",
                "não pode ser executado em qualquer área de armazenamento " +
                        "que não seja aquela designada para ele no momento de" +
                        " sua codificação ou tradução.",
                "Consiste em um programa e informações relevantes para a sua realocação. ",
                " pode ele mesmo realizar a realocação de suas partes sensíveis ao endereço. ",
                " todas as opções acima ",
                " não podem ser executadas em qualquer área de armazenamento " +
                        "diferente da designada para ele no momento de sua codificação ou tradução. ");
        this.addQuestionRandom (q248);

        QuestionRandom q249 = new QuestionRandom (
                "Quais dos seguintes são (são) Processadores de linguagem",
                "monta", "compiladores", "intérpretes", "Todos os anteriores",
                "Todos os anteriores");
        this.addQuestionRandom (q249);

        QuestionRandom q250 = new QuestionRandom (
                "Em qual modo de endereçamento o endereço efetivo do" +
                        " operando é o conteúdo de um registro especificado na " +
                        "instrução e após acessar o operando, o conteúdo deste registro " +
                        "é incrementado para apontar para o próximo item na lista? ",
                " endereçamento de índice ",
                " endereçamento indireto ",
                " incremento automático ",
                " decremento automático ",
                " incremento automático ");
        this.addQuestionRandom (q250);

        QuestionRandom q251 = new QuestionRandom(
                "O esquema de alocação de memória está sujeito a \"external\" fragmentação é",
                "segmentação","trocando","paginação de demanda pura",
                "múltiplas partições fixas contíguas",
                "segmentação");
        this.addQuestionRandom(q251);

        QuestionRandom q252 = new QuestionRandom (
                "Ao trabalhar com o MS-DOS, qual comando você usará para transferir" +
                        " um arquivo específico de um disco para outro?",
                "DISKCOPY", "COPY", "RENAME", "FORMAT",
                "COPY ");
        this.addQuestionRandom (q252);

        QuestionRandom q253 = new QuestionRandom (
                "Qual é o nome do sistema operacional do laptop chamado MacLite?",
                "Windows", "DOS", "MS-DOS", "OZ",
                "OZ");
        this.addQuestionRandom (q253);

        QuestionRandom q254 = new QuestionRandom (
                "Em qual modo de endereçamento o conteúdo de um registro especificado " +
                        "na instrução é diminuído primeiro e, em seguida, esse conteúdo" +
                        " é usado como o endereço efetivo dos operandos?",
                "Endereçamento de índice", "endereçamento indireto",
                "auto incremento", "auto decremento",
                "auto decremento");
        this.addQuestionRandom (q254);

        QuestionRandom q255 = new QuestionRandom (
                "Qual é o nome dado aos valores que são fornecidos automaticamente" +
                        " pelo software para reduzir o pressionamento de teclas e melhorar a" +
                        " produtividade do usuário do computador?",
                "Valores definidos", "Valores fixos", "Valores padrão",
                "Especial valores ",
                " Valores padrão ");
        this.addQuestionRandom (q255);

        QuestionRandom q256 = new QuestionRandom (
                "Roubo de página",
                "é um sinal de um sistema eficiente",
                "está pegando frames de página de outros conjuntos de trabalho",
                "deve ser o objetivo do ajuste",
                "está ocupando espaço em disco maior para páginas paginadas ",
                " está pegando frames de página de outros conjuntos de trabalho ");
        this.addQuestionRandom (q256);

        QuestionRandom q257 = new QuestionRandom (
                "No MS-DOS 5.0, qual é o número que atua como um código para " +
                        "identificar exclusivamente o produto de software?",
                "MS", "DOS", "MS DOS", "5.0",
                "5.0 ");
        this.addQuestionRandom (q257);

        QuestionRandom q258 = new QuestionRandom (
                "Bug significa",
                "Um erro lógico em um programa",
                "Um erro de sintaxe difícil em um programa",
                "Documentando programas usando uma ferramenta de documentação eficiente",
                "Todas as opções acima",
                "Uma lógica erro em um programa ");
        this.addQuestionRandom (q258);

        QuestionRandom q259 = new QuestionRandom (
                "Gerenciamento de memória é:",
                "não usado no sistema operacional moderno",
                "substituído por memória virtual nos sistemas atuais",
                "não usado em sistemas de multiprogramação",
                "crítico até mesmo para os sistemas operacionais mais simples",
                "crítico até mesmo para os sistemas operacionais mais simples");
        this.addQuestionRandom (q259);

        QuestionRandom q260 = new QuestionRandom (
                "O valor inicial do semáforo que permite que apenas um " +
                        "dos muitos processos entre em suas seções críticas é",
                "8", "1", "16", "0",
                "1") ;
        this.addQuestionRandom (q260);

        QuestionRandom q261 = new QuestionRandom(
                "As instruções de registro para registro (RR)",
                "têm ambos os operandos na loja principal.",
                "que realizam uma operação em um operando de registro e um operando" +
                        " que fica na loja principal, geralmente deixando o resultado" +
                        " no registro, exceto no caso de operação de loja quando " +
                        "também é escrito no local de armazenamento especificado.",
                "que realizam as operações indicadas em dois registros rápidos da máquina " +
                        "e deixar o resultado em um dos registros.",
                "tudo acima",
                "que realizam as operações indicadas em dois registros rápidos do " +
                        "máquina e deixar o resultado em um dos registradores.");
        this.addQuestionRandom(q261);

        QuestionRandom q262 = new QuestionRandom (
                "Uma falha de página",
                "é um erro é uma página específica",
                "ocorre quando um programa acessa uma página da memória",
                "é um acesso a uma página que não está atualmente na memória",
                "é um referência a uma página pertencente a outro programa ",
                " é um acesso a uma página que não está atualmente na memória ");
        this.addQuestionRandom (q262);

        QuestionRandom q263 = new QuestionRandom (
                "Um algoritmo é melhor descrito como",
                "Uma linguagem de computador",
                "Um procedimento passo a passo para resolver um problema",
                "Um ramo da matemática",
                "Todas as anteriores",
                "Uma etapa procedimento passo a passo para resolver um problema ");
        this.addQuestionRandom (q263);

        QuestionRandom q264 = new QuestionRandom (
                "O processo de transferência de dados destinados a um dispositivo " +
                        "periférico para um disco (ou armazenamento intermediário) " +
                        "para que possam ser transferidos para o periférico em um " +
                        "momento mais conveniente ou em massa, é conhecido como",
                "multiprogramação" , "spool", "cache", "programação virtual",
                "spool");
        this.addQuestionRandom (q264);

        QuestionRandom q265 = new QuestionRandom (
                "Caches de bloco ou caches de buffer são usados",
                "para melhorar o desempenho do disco",
                "para lidar com interrupções",
                "para aumentar a capacidade da memória principal",
                "para acelerar a operação de leitura da memória principal",
                "para melhorar o desempenho do disco");
        this.addQuestionRandom (q265);

        QuestionRandom q266 = new QuestionRandom (
                "Qual das seguintes afirmações é falsa?",
                "Um tamanho de página pequeno causa tabelas de páginas grandes",
                "a fragmentação interna é aumentada com páginas pequenas",
                "um tamanho de página grande causa instruções e dados que não ser" +
                        " referenciado trazido para o armazenamento primário ",
                " As transferências de E / S são mais eficientes com páginas grandes ",
                " a fragmentação interna é aumentada com páginas pequenas ");
        this.addQuestionRandom (q266);

        QuestionRandom q267 = new QuestionRandom (
                "A ação de analisar o programa de origem nas classes sintáticas " +
                        "adequadas é conhecida como",
                "análise de sintaxe", "análise lexical",
                "análise de interpretação", "análise de sintaxe geral",
                "análise lexical") ;
        this.addQuestionRandom (q267);

        QuestionRandom q268 = new QuestionRandom (
                "Qual das alternativas a seguir não é verdadeira sobre a" +
                        " descrição de uma tabela de decisão?",
                "Uma tabela de decisão é fácil de modificar",
                "Uma tabela de decisão é compreendida diretamente pelo computador",
                "Uma decisão a tabela é de fácil compreensão ",
                " Todas as anteriores ",
                " Uma tabela de decisão é compreendida diretamente pelo computador ");
        this.addQuestionRandom (q268);

        QuestionRandom q269 = new QuestionRandom (
                "programas Cavalo de Tróia",
                "são programas legítimos que permitem acesso não autorizado"
                , "geralmente não funcionam",
                "são programas ocultos que não aparecem no sistema",
                "geralmente são descobertos imediatamente" ,
                "são programas legítimos que permitem acesso não autorizado");
        this.addQuestionRandom (q269);

        QuestionRandom q270 = new QuestionRandom (
                "Quando a IBM lançou a primeira versão do sistema operacional de disco" +
                        " DOS versão 1.0?",
                "1981", "1982", "1983", "1984",
                "1981");
        this.addQuestionRandom (q270);

        QuestionRandom q271 = new QuestionRandom (
                "Qual das afirmações a seguir é falsa sobre o disco em comparação com " +
                        "a memória principal?",
                "Não volátil",
                "maior capacidade de armazenamento",
                "menor preço por bit",
                "mais rápido",
                "mais rápido") ;
        this.addQuestionRandom (q271);

        QuestionRandom q272 = new QuestionRandom (
                "O problema do consumidor do produtor pode ser resolvido usando",
                "semáforos",
                "contadores de eventos",
                "monitores",
                "todos os anteriores",
                "todos os anteriores");
        this.addQuestionRandom (q272);

        QuestionRandom q273 = new QuestionRandom (
                "A maioria dos sistemas operacionais de microcomputadores como " +
                        "Apple DOS, MS DOS e PC DOS etc. são chamados de sistemas operacionais " +
                        "de disco porque",
                "eles residem na memória",
                "são inicialmente armazenados no disco",
                "eles estão disponíveis em fitas magnéticas ",
                " estão parcialmente na memória primária e parcialmente no disco ",
                " são inicialmente armazenados no disco ");
        this.addQuestionRandom (q273);

        QuestionRandom q274 = new QuestionRandom (
                "A CPU, após receber uma interrupção de um dispositivo de E / S",
                "pára por um tempo predeterminado",
                "entrega o controle do barramento de endereço e barramento de dados para o" +
                        " dispositivo de interrupção",
                "ramifica para a rotina de interrupção de serviço imediatamente ",
                " ramifica-se para a rotina de interrupção de serviço após a " +
                        "conclusão da instrução atual "
                ," ramifica-se para a rotina de interrupção de serviço após a" +
                " conclusão da instrução atual ");
        this.addQuestionRandom (q274);

        QuestionRandom q275 = new QuestionRandom (
                "Seeks analysis",
                "é usado para analisar problemas de paging",
                "é usado para analisar problemas de unidade de controle ocupada",
                "só é mostrado em telas em tempo real",
                "é usado para analisar dispositivo ocupado problemas ",
                " é usado para analisar problemas de ocupação do dispositivo ");
        this.addQuestionRandom (q275);

        QuestionRandom q276 = new QuestionRandom (
                "Qual é um banco de dados permanente no modelo geral de compilador?",
                "Tabela Literal", "Tabela Identificador",
                "Tabela Terminal", "Código-fonte",
                "Tabela Terminal");
        this.addQuestionRandom (q276);

        QuestionRandom q277 = new QuestionRandom (
                "Qual é o nome da técnica na qual o sistema operacional de " +
                        "um computador executa vários programas simultaneamente alternando " +
                        "entre eles?",
                "Particionamento", "Multitarefa", "Janelas", "Paginação ",
                " Multitarefa ");
        this.addQuestionRandom (q277);

        QuestionRandom q278 = new QuestionRandom (
                "Sistema operacional",
                "vincula um programa às sub-rotinas às quais faz referência",
                "fornece uma interface amigável em camadas",
                "permite que o programador desenhe um fluxograma",
                "todos os anteriores",
                "fornece uma interface amigável em camadas");
        this.addQuestionRandom (q278);

        QuestionRandom q279 = new QuestionRandom (
                "Software que mede, monitora, analisa e controla eventos " +
                        "do mundo real é chamado de:",
                "software de sistema", "software em tempo real",
                "software científico", "software de negócios",
                "software em tempo real");
        this.addQuestionRandom (q279);

        QuestionRandom q280 = new QuestionRandom (
                "Os detalhes de todos os símbolos externos e formação de realocação" +
                        " (lista de realocação ou mapa) são fornecidos ao vinculador por",
                "Processador de macro", "Tradutor", "Carregador", "Editor",
                "Tradutor") ;
        this.addQuestionRandom (q280);

        QuestionRandom q281 = new QuestionRandom (
                "O processador de macro deve executar",
                "reconhecer definições de macro e chamadas de macro",
                "salvar as definições de macro",
                "expandir chamadas de macros e substituir argumentos",
                "todos os anteriores",
                "todos os acima de");
        this.addQuestionRandom (q281);

        QuestionRandom q282 = new QuestionRandom (
                "Uma estratégia de desenvolvimento pela qual os módulos de " +
                        "controle executivo de um sistema são codificados e testados primeiro, " +
                        "é conhecida como",
                "Desenvolvimento de baixo para cima",
                "Desenvolvimento de cima para baixo",
                "Desenvolvimento de esquerda para direita",
                "Todas as opções anteriores",
                "Desenvolvimento de cima para baixo");
        this.addQuestionRandom (q282);

        QuestionRandom q283 = new QuestionRandom (
                "Qual das alternativas a seguir é útil para avaliar o software de" +
                        " aplicativos que melhor atende às suas necessidades?",
                "Recomendações de outros usuários", "revistas de computador",
                "análises objetivas de software", "todas as opções anteriores" ,
                "tudo acima");
        this.addQuestionRandom (q283);

        QuestionRandom q284 = new QuestionRandom (
                "Qual problema é resolvido pelo algoritmo do banqueiro de Dijkstra?",
                "Exclusão mútua", "recuperação de deadlock",
                "prevenção de deadlock", "coerência de cache",
                "prevenção de deadlock");
        this.addQuestionRandom (q284);

        QuestionRandom q285 = new QuestionRandom (
                "O despachante",
                "realmente agenda as tarefas no processador",
                "coloca as tarefas em espera de E / S",
                "é sempre pequeno e simples",
                "nunca muda as prioridades das tarefas",
                "realmente agenda o tarefas no processador ");
        this.addQuestionRandom (q285);

        QuestionRandom q286 = new QuestionRandom (
                "Programas de sistema, como Compiladores, são projetados de forma que sejam",
                "reinseríveis", "não reutilizáveis",
                "utilizáveis ​​em série", "recursivos",
                "reinseríveis");
        this.addQuestionRandom (q286);

        QuestionRandom q287 = new QuestionRandom (
                "IBM lançou seu primeiro PC em 1981. Você pode citar o " +
                        "sistema operacional que era mais popular naquela época?",
                "MS-DOS", "PC-DOS", "OS / 360", " CP / M ",
                " CP / M ");
        this.addQuestionRandom (q287);

        QuestionRandom q288 = new QuestionRandom (
                "Se o número de bits em um endereço virtual de um programa " +
                        "for 16 e o ​​tamanho da página for 0,5 K bytes, o número de" +
                        " páginas no espaço de endereço virtual será",
                "16", "32", "64", "128",
                "128");
        this.addQuestionRandom (q288);

        QuestionRandom q289 = new QuestionRandom (
                "Qual tabela é um banco de dados permanente que possui uma" +
                        " entrada para cada símbolo de terminal.",
                "Tabela de terminal", "Reduções",
                "Tabela de identificador", "Tabela literal",
                "Tabela de terminal");
        this.addQuestionRandom (q289);

        QuestionRandom q290 = new QuestionRandom (
                "A (s) função (ões) da fase Sintaxe é (são)",
                "para reconhecer as principais construções da linguagem e para " +
                        "chamar as rotinas de ação apropriadas que irão gerar a forma " +
                        "intermediária ou matriz para essas construções. ",
                " para construir uma tabela literal e uma tabela de identificadores ",
                " para construir uma tabela de símbolos uniforme ",
                " para analisar o programa de origem nos elementos básicos ou tokens da linguagem. ",
                " para reconhecer as principais construções da linguagem e chamar as " +
                        "rotinas de ação apropriadas que irão gerar a forma ou matriz " +
                        "intermediária para essas construções. ");
        this.addQuestionRandom (q290);

        QuestionRandom q291 = new QuestionRandom (
                "Troca",
                "funciona melhor com muitas partições pequenas",
                "permite que muitos programas usem memória simultaneamente",
                "permite que cada programa, por sua vez, use a memória",
                "não funciona com sobreposição33",
                " permite que cada programa, por sua vez, use a memória ");
        this.addQuestionRandom (q291);

        QuestionRandom q292 = new QuestionRandom (
                "Um algoritmo de agendamento de disco em um sistema operacional " +
                        "faz com que o braço do disco se mova para frente e para trás pela " +
                        "superfície do disco para atender a todas as solicitações em seu caminho." +
                        " Este é um",
                "Primeiro a chegar, primeiro a ser servido",
                "Shortest Seek Time First (SSTE)",
                "Scan",
                "FIFO",
                "Scan");
        this.addQuestionRandom (q292);

        QuestionRandom q293 = new QuestionRandom (
                "Um tradutor é melhor descrito como",
                "um software de aplicativo",
                "um software de sistema",
                "um componente de hardware",
                "todos os anteriores",
                "um software de sistema");
        this.addQuestionRandom (q293);

        QuestionRandom q294 = new QuestionRandom (
                "Criptografia de dados",
                "é usado principalmente por redes públicas",
                "é usado principalmente por redes financeiras",
                "não pode ser usado por instalações privadas",
                "não é necessário, uma vez que os dados não podem ser interceptados",
                "é usado principalmente por redes financeiras");
        this.addQuestionRandom (q294);

        QuestionRandom q295 = new QuestionRandom (
                "Qual é o nome dado ao processo de inicialização de um " +
                        "microcomputador com seu sistema operacional?",
                "Inicialização a frio", "Inicialização",
                "Inicialização a quente", "Gravação de inicialização",
                "Inicialização");
        this.addQuestionRandom (q295);

        QuestionRandom q296 = new QuestionRandom (
                "A (s) função (ões) da Atribuição de Armazenamento é (são)",
                "para atribuir armazenamento a todas as variáveis ​​referenciadas no " +
                        "programa de origem.",
                "Para atribuir armazenamento a todos os locais temporários que são necessários " +
                        "para intermediários resultados ",
                " para atribuir armazenamento a literais e para garantir que o armazenamento " +
                        "seja alocado e os locais apropriados sejam inicializados. ",
                " todos os anteriores ",
                " todos os anteriores ");
        this.addQuestionRandom (q296);

        QuestionRandom q297 = new QuestionRandom (
                "Um Processador", "é um dispositivo que executa uma sequência " +
                "de operações especificadas por instruções na memória.",
                "É o dispositivo onde as informações são armazenadas",
                "é uma sequência de instruções",
                "é normalmente caracterizado por processamento interativo e tempo de tempo " +
                        "da CPU para permitir resposta rápida a cada usuário ",
                " é um dispositivo que realiza uma sequência de operações especificadas " +
                        "por instruções em memória ");
        this.addQuestionRandom (q297);

        QuestionRandom q298 = new QuestionRandom (
                "Com o MS-DOS, qual comando dividirá a superfície do disquete " +
                        "em branco em setores e atribuirá um endereço único a cada um?",
                "Comando FORMAT", "Comando FAT",
                "Comando VER", "Comando CHKDSK",
                "FORMATAR comando");
        this.addQuestionRandom (q298);

        QuestionRandom q299 = new QuestionRandom (
                "Multiprogramação", "é um método de alocação de memória " +
                "pelo qual o programa é subdividido em partes iguais, ou as páginas e o" +
                " núcleo são subdivididos em partes iguais ou blocos.",
                "Consiste nos endereços que podem ser gerados por um processador durante " +
                        "a execução de um cálculo ",
                " é um método de alocação de tempo do processador. ",
                " permite que vários programas residam em áreas separadas do núcleo " +
                        "no momento ",
                " permite que vários programas residam em áreas separadas do núcleo no Tempo");
        this.addQuestionRandom (q299);

        QuestionRandom q300 = new QuestionRandom (
                "Um tradutor que lê um programa inteiro escrito em uma " +
                        "linguagem de alto nível e o converte em código de linguagem de máquina é:",
                "assembler", "tradutor", "compilador",
                "software do sistema",
                "compilador ");
        this.addQuestionRandom (q300);

    }

    public void addQuestionRandom(QuestionRandom quest) {
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION3());
        values.put(KEY_ANSWER, quest.getANSWER3());
        values.put(KEY_OPTA, quest.getOPTA3());
        values.put(KEY_OPTB, quest.getOPTB3());
        values.put(KEY_OPTC, quest.getOPTC3());
        values.put(KEY_OPTD, quest.getOPTD3());
        // Inserting Row
        dbase.insert(TABLE_QUEST3, null, values);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public List<QuestionCompFunda> getAllQuestions1(String tname, String lname) {
        List<QuestionCompFunda> quesList1 = new ArrayList<QuestionCompFunda>();
        String selectQuery1 = " SELECT * FROM " + tname + " WHERE " + KEY_CAT + " = '" + lname + "'";

        dbase = this.getReadableDatabase();

        Cursor cursor = dbase.rawQuery(selectQuery1, null);

        // percorrendo todas as linhas e adicionando à lista
        if (cursor.moveToFirst()) {
            do {
                QuestionCompFunda quest1 = new QuestionCompFunda();
                quest1.setID1(cursor.getInt(0));
                quest1.setQUESTION1(cursor.getString(1));
                quest1.setANSWER1(cursor.getString(2));
                quest1.setOPTA1(cursor.getString(3));
                quest1.setOPTB1(cursor.getString(4));
                quest1.setOPTC1(cursor.getString(5));
                quest1.setOPTD1(cursor.getString(6));
                quesList1.add(quest1);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList1;
    }

    public List<QuestionOS> getAllQuestions(String tname, String lname) {
        List<QuestionOS> quesList1= new ArrayList<QuestionOS>();
        String selectQuery1 = "SELECT  * FROM " + tname + " WHERE " + KEY_CAT + " = '" + lname+"'";

        dbase = this.getReadableDatabase();

        Cursor cursor = dbase.rawQuery(selectQuery1, null);

        // percorrendo todas as linhas e adicionando à lista
        if (cursor.moveToFirst()) {
            do {
                QuestionOS quest1 = new QuestionOS();
                quest1.setID(cursor.getInt(0));
                quest1.setQUESTION(cursor.getString(1));
                quest1.setANSWER(cursor.getString(2));
                quest1.setOPTA(cursor.getString(3));
                quest1.setOPTB(cursor.getString(4));
                quest1.setOPTC(cursor.getString(5));
                quest1.setOPTD(cursor.getString(6));
                quesList1.add(quest1);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList1;
    }

    public List<QuestionHardWare> getAllQuestions2(String tname, String lname)
    {
        List<QuestionHardWare> quesList1= new ArrayList<QuestionHardWare>();
        String selectQuery1 = "SELECT  * FROM " + tname+" WHERE "+KEY_CAT+" = '"+lname+"'";
        dbase=this.getReadableDatabase();

        Cursor cursor = dbase.rawQuery(selectQuery1, null);

        // percorrendo todas as linhas e adicionando à lista
        if (cursor.moveToFirst()) {
            do {
                QuestionHardWare quest1 = new QuestionHardWare();
                quest1.setID2(cursor.getInt(0));
                quest1.setQUESTION2(cursor.getString(1));
                quest1.setANSWER2(cursor.getString(2));
                quest1.setOPTA2(cursor.getString(3));
                quest1.setOPTB2(cursor.getString(4));
                quest1.setOPTC2(cursor.getString(5));
                quest1.setOPTD2(cursor.getString(6));
                quesList1.add(quest1);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList1;
    }

    public List<QuestionRandom> getAllQuestions3(String tname) {
        List<QuestionRandom> quesList1= new ArrayList<QuestionRandom>();
        String selectQuery1 = "SELECT * FROM " + tname ;

        dbase = this.getReadableDatabase();

        Cursor cursor = dbase.rawQuery(selectQuery1, null);
        // percorrendo todas as linhas e adicionando à lista
        if (cursor.moveToFirst()) {
            do {
                QuestionRandom quest1 = new QuestionRandom();
                quest1.setID3(cursor.getInt(0));
                quest1.setQUESTION3(cursor.getString(1));
                quest1.setANSWER3(cursor.getString(2));
                quest1.setOPTA3(cursor.getString(3));
                quest1.setOPTB3(cursor.getString(4));
                quest1.setOPTC3(cursor.getString(5));
                quest1.setOPTD3(cursor.getString(6));
                quesList1.add(quest1);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList1;
    }

    public boolean insertScoreCompFunda(int scoreCompFunda,String tname, String cname) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(SCORE_KEY_SECTION.toString(), tname);
        contentValues.put(SCORE_KEY_CAT.toString(), cname);
        contentValues.put(SCORE_KEY_SCORE.toString(), scoreCompFunda);
        long resultscore = db.insert(TABLE_SCORE, null, contentValues);
        if(resultscore == -1)
            return false;
        else
            return true;
    }

    public boolean insertScoreOS(int scoreOS, String tname, String cname){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(SCORE_KEY_SECTION.toString(), tname);
        contentValues.put(SCORE_KEY_CAT.toString(), cname);
        contentValues.put(SCORE_KEY_SCORE.toString(), scoreOS);

        long resultscore = db.insert(TABLE_SCORE, null, contentValues);
        if(resultscore == -1)
            return false;
        else
            return true;
    }

    public boolean insertScoreHardware(int scoreHardware, String tname, String cname) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put(SCORE_KEY_SECTION.toString(), tname);
        contentValues.put(SCORE_KEY_CAT.toString(), cname);
        contentValues.put(SCORE_KEY_SCORE.toString(), scoreHardware);
        long resultscore = db.insert(TABLE_SCORE, null, contentValues);
        if(resultscore == -1)
            return false;
        else
            return true;
    }

    public boolean insertScoreFinal(int scoreRandom, String tname){
        SQLiteDatabase db = this.getWritableDatabase();
        String cname = null;
        ContentValues contentValues = new ContentValues();
        contentValues.put(SCORE_KEY_SECTION.toString(), tname);
        contentValues.put(SCORE_KEY_CAT.toString(), cname);
        contentValues.put(SCORE_KEY_SCORE.toString(), scoreRandom);
        long resultscore = db.insert(TABLE_SCORE, null, contentValues);
        if(resultscore == -1)
            return false;
        else
            return true;
    }

    public int getScoreCompFundaB() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM "
                + TABLE_SCORE + " WHERE "+ SCORE_KEY_SECTION + " = '"
                + TABLE_QUEST1 +"' AND "+ SCORE_KEY_CAT + " = " +"'B'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

    public int getScoreCompFundaI() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE
                + " WHERE "+ SCORE_KEY_SECTION + " = '" + TABLE_QUEST1 +"' AND "
                + SCORE_KEY_CAT + " = " +"'I'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

    public int getScoreCompFundaE() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE
                + " WHERE "+ SCORE_KEY_SECTION + " = '" + TABLE_QUEST1 +"' AND "
                + SCORE_KEY_CAT + " = " +"'E'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

    public int getScoreOSB() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE
                + " WHERE "+ SCORE_KEY_SECTION + " = '" + TABLE_QUEST +"' AND "
                + SCORE_KEY_CAT + " = " +"'B'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

    public int getScoreOSI() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE
                + " WHERE "+ SCORE_KEY_SECTION + " = '" + TABLE_QUEST +"' AND "
                + SCORE_KEY_CAT + " = " +"'I'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

    public int getScoreOSE() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE
                + " WHERE "+ SCORE_KEY_SECTION + " = '" + TABLE_QUEST +"' AND "
                + SCORE_KEY_CAT + " = " +"'E'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

    public int getScoreHardwareB() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE + " WHERE "
                + SCORE_KEY_SECTION + " = '" + TABLE_QUEST2 + "' AND " + SCORE_KEY_CAT + " = " +"'B'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

    public int getScoreHardwareI() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE + " WHERE "
                + SCORE_KEY_SECTION + " = '" + TABLE_QUEST2 + "' AND " + SCORE_KEY_CAT + " = " +"'I'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

    public int getScoreHardwareE() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE + " WHERE "
                + SCORE_KEY_SECTION + " = '" + TABLE_QUEST2 + "' AND "+ SCORE_KEY_CAT + " = " + "'E'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

    public int getScoreRandom() {
        Cursor c;
        SQLiteDatabase db = this.getWritableDatabase();
        String sqlSelectQuery="SELECT MAX(" + SCORE_KEY_SCORE + ") FROM " + TABLE_SCORE + " WHERE "
                + SCORE_KEY_SECTION + " = '"+ TABLE_QUEST3 + "'";
        c = db.rawQuery(sqlSelectQuery, null);
        c.moveToFirst();
        int x = c.getInt(0);
        return x;
    }

}
