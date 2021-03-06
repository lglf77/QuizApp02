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
                "Qual ?? o equivalente decimal do n??mero bin??rio 10111",
                "21","23","39","42",
                "23",
                "B");
        this.addQuestionCompFunda(q101);

        QuestionCompFunda q102 = new QuestionCompFunda(
                "Para escrever em um disquete com o seu PC IBM, voc?? deve primeiro",
                "digitalize-o","formate-o","compilar","hardware isso",
                "formate-o",
                "B");
        this.addQuestionCompFunda(q102);

        QuestionCompFunda q103 = new QuestionCompFunda(
                "Qual ?? o termo para uma ??rea de armazenamento tempor??rio que compensa " +
                        "as diferen??as na taxa de dados e no fluxo de dados entre os dispositivos?",
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
                "Uma das coisas que separa um TERMINAL de um PC ?? que o terminal n??o " +
                        "tem o qu???",
                "Keyboard","Monitor","Power Cord","CPU",
                "CPU",
                "B");
        this.addQuestionCompFunda(q105);

        QuestionCompFunda q106 = new QuestionCompFunda(
                "Os dados s??o armazenados em disquete de que forma?",
                "Ink","Laser Bubble","Magnetism","Circuits",
                "Magnetism",
                "B");
        this.addQuestionCompFunda(q106);

        QuestionCompFunda q107 = new QuestionCompFunda (
                "O menor elemento visual em um monitor de v??deo ?? chamado de qu???",
                "Caractere", "Pixel", "Byte", "Kwerk",
                "Pixel",
                "B");
        this.addQuestionCompFunda (q107);

        QuestionCompFunda q108 = new QuestionCompFunda (
                "O tipo de armazenamento de dados considerado vol??til ???",
                "R-O-M", "R-A-M", "TAPE", "DISK",
                "R-A-M",
                "B");
        this.addQuestionCompFunda(q108);

        QuestionCompFunda q109 = new QuestionCompFunda (
                "Qual elemento natural ?? o ingrediente principal em chips de computador?",
                "Sil??cio", "Carbono", "Ferro", "Ur??nio",
                "Sil??cio",
                "B");
        this.addQuestionCompFunda(q109);

        QuestionCompFunda q110 = new QuestionCompFunda (
                "Onde voc?? encontra um entalhe de prote????o contra grava????o?",
                "Em um chip de computador", "Em um cart??o perfurado",
                "Em uma mem??ria somente leitura", "Em um disquete",
                "Em um disquete",
                "B");
        this.addQuestionCompFunda(q110);

        QuestionCompFunda q111 = new QuestionCompFunda (
                "Qual das seguintes linguagens ?? mais adequada para um programa estruturado?",
                "PL / 1", "FORTRAN", "BASIC", "PASCAL",
                "PASCAL",
                "B");
        this.addQuestionCompFunda(q111);

        QuestionCompFunda q112 = new QuestionCompFunda (
                "Um m??todo assistido por computador para o registro e an??lise de " +
                        "sistemas existentes ou hipot??ticos ??", "Transmiss??o de dados",
                "Fluxo de dados", "Captura de dados", "Processamento de dados",
                "Fluxo de dados",
                "B");
        this.addQuestionCompFunda(q112);

        QuestionCompFunda q113 = new QuestionCompFunda (
                "O c??rebro de qualquer sistema de computador ??", "ALU",
                "CPU", "Mem??ria", "Unidade de controle",
                "CPU",
                "B");
        this.addQuestionCompFunda(q113);

        QuestionCompFunda q114 = new QuestionCompFunda (
                "Que diferen??a o computador de 5?? gera????o tem dos computadores de outra gera????o?",
                "Avan??o tecnol??gico", "C??digo cient??fico",
                "Programa????o orientada a objetos", "Todos os anteriores",
                "Avan??o tecnol??gico",
                "B");
        this.addQuestionCompFunda (q114);

        QuestionCompFunda q115 = new QuestionCompFunda (
                "Qual das seguintes linguagens de computador ?? usada para intelig??ncia " +
                        "artificial?", "FORTRAN", "PROLOG", "C", "COBOL",
                "PROLOG",
                "B");
        this.addQuestionCompFunda (q115);

        QuestionCompFunda q116 = new QuestionCompFunda (
                "As faixas em um disco que podem ser acessadas sem reposicionar os cabe??otes R/W s??o",
                "Surface", "Cylinder", "Cluster", "All of the above",
                "Cylinder",
                " B ");
        this.addQuestionCompFunda (q116);

        QuestionCompFunda q117 = new QuestionCompFunda (
                "Qual dos seguintes ?? o complemento de 1 de 10?", "01",
                "110", "11", "10",
                "01",
                "B");
        this.addQuestionCompFunda (q117);

        QuestionCompFunda q118 = new QuestionCompFunda (
                "Uma se????o do c??digo para a qual o controle ?? transferido quando" +
                        " um processador ?? interrompido ?? conhecida como",
                "M", "SVC", "IP", "MDR",
                "M",
                "B") ;
        this.addQuestionCompFunda (q118);

        QuestionCompFunda q119 = new QuestionCompFunda (
                "Qual parte interpreta as instru????es do programa e inicia as " +
                        "opera????es de controle.", "Entrada", "Unidade de armazenamento",
                "Unidade l??gica", "Unidade de controle",
                "Unidade de controle",
                "B");
        this.addQuestionCompFunda (q119);

        QuestionCompFunda q120 = new QuestionCompFunda (
                "O sistema bin??rio usa pot??ncias de",
                "2", "10", "8", "16", "2", "B");
        this.addQuestionCompFunda (q120);

        QuestionCompFunda q121 = new QuestionCompFunda (
                "Um programa de computador que converte linguagem assembly " +
                        "em linguagem de m??quina ??", "Compiler", "Interpreter",
                "Assembler", "Comparator",
                "Assembler", "B");
        this.addQuestionCompFunda (q121);

        QuestionCompFunda q122 = new QuestionCompFunda (
                "O tempo necess??rio para a busca e execu????o de uma instru????o de " +
                        "m??quina simples ??", "Tempo de atraso", "Ciclo da CPU",
                "Tempo real", "Tempo de busca",
                "Ciclo da CPU", "B ");
        this.addQuestionCompFunda (q122);

        QuestionCompFunda q123 = new QuestionCompFunda (
                "O tempo de funcionamento de um equipamento ?? denominado",
                "Tempo de busca", "Tempo efetivo", "Tempo de acesso", "Tempo real",
                "Tempo efetivo", "B");
        this.addQuestionCompFunda (q123);

        QuestionCompFunda q124 = new QuestionCompFunda (
                "Os n??meros bin??rios precisam de mais casas para contar porque",
                "Eles s??o sempre n??meros grandes",
                "Qualquer n??mero de 0s pode ser adicionado na frente deles",
                "A base bin??ria ?? pequena", "0s e l deve ser espa??ado adequadamente ",
                " A base bin??ria ?? pequena "," B ");
        this.addQuestionCompFunda (q124);

        QuestionCompFunda q125 = new QuestionCompFunda (
                "Qual m??todo de acesso ?? usado para obter um registro de uma " +
                        "fita cassete?", "Direto", "Sequencial", "Aleat??rio",
                "Todas as op????es acima",
                "Sequencial", "B") ;
        this.addQuestionCompFunda (q125);

        QuestionCompFunda q126 = new QuestionCompFunda (
                "Qualquer tipo de armazenamento usado para armazenar informa????es " +
                        "entre as etapas de seu processamento ??", "CPU",
                "Armazenamento prim??rio", "Armazenamento intermedi??rio",
                "Armazenamento interno",
                "Armazenamento intermedi??rio", " B ");
        this.addQuestionCompFunda (q126);
        QuestionCompFunda q127 = new QuestionCompFunda (
                "Um nome aplicado pela Intel corp. ?? tecnologia MOS de " +
                        "alta velocidade ?? chamado", "HDLC", "LAP", "HMOS",
                "SDLC",
                "HMOS",
                "B");
        this.addQuestionCompFunda (q127);

        QuestionCompFunda q128 = new QuestionCompFunda (
                "Um componente do programa que permite a estrutura????o de um" +
                        " programa de forma incomum ?? conhecido como",
                "Correla????o", "Corotina", "Diagonaliza????o", "Quene",
                "Corotina",
                "B");
        this.addQuestionCompFunda (q128);

        QuestionCompFunda q129 = new QuestionCompFunda(
                "O radiano de um sistema num??rico",
                "?? vari??vel",
                "N??o tem nada a ver com o valor da posi????o do d??gito",
                "?? igual ao n??mero de seus d??gitos de contagem distintos",
                "?? sempre um n??mero par",
                "?? igual ao n??mero de seus d??gitos de contagem distintos",
                "B");
        this.addQuestionCompFunda(q129);

        QuestionCompFunda q130 = new QuestionCompFunda (
                "A se????o da CPU que seleciona, interpreta e v?? a execu????o " +
                        "das instru????es do programa",
                "Mem??ria", "Unidade de registro", "Unidade de controle",
                "ALU",
                "Unidade de controle",
                " B ");
        this.addQuestionCompFunda (q130);

        QuestionCompFunda q131 = new QuestionCompFunda (
                "Que tipo de sistema coloca o usu??rio em conversa direta " +
                        "com o computador atrav??s de um teclado?",
                "Processamento em tempo real", "Computador interativo",
                "Processamento em lote", "Compartilhamento de tempo",
                "Computador interativo ",
                " B ");
        this.addQuestionCompFunda (q131);

        QuestionCompFunda q132 = new QuestionCompFunda (
                "O termo referente ?? evacua????o do conte??do de alguma parte " +
                        "da m??quina ?? conhecido como",
                "Dump", "Enhancement", "Down", "Compiler",
                "Dump",
                "B");
        this.addQuestionCompFunda (q132);

        QuestionCompFunda q133 = new QuestionCompFunda (
                "Um ??nico pacote em um link de dados ?? conhecido como",
                "Caminho", "Quadro", "Bloco", "Grupo",
                "Quadro",
                "B");
        this.addQuestionCompFunda (q133);

        QuestionCompFunda q134 = new QuestionCompFunda (
                "O processo de comunica????o com um arquivo de um terminal ??",
                "Interativo", "Interroga????o", "Heur??stica",
                "Todas as anteriores",
                "Interroga????o",
                "B");
        this.addQuestionCompFunda (q134);

        QuestionCompFunda q135 = new QuestionCompFunda (
                "Um limite comum entre dois sistemas ?? denominado",
                "Interdi????o", "Interface", "Superf??cie",
                "Nenhuma das alternativas anteriores",
                "Interface",
                "B");
        this.addQuestionCompFunda (q135);

        QuestionCompFunda q136 = new QuestionCompFunda (
                "O exame e altera????o de bits ??nicos ou pequenos grupos dentro de " +
                        "uma palavra ?? chamado de",
                "Bit", "Byte", "Manipula????o de bits",
                "Fatia de bits",
                "Manipula????o de bits",
                " B ");
        this.addQuestionCompFunda (q136);

        QuestionCompFunda q137 = new QuestionCompFunda (
                "Qual computador foi projetado para ser o mais compacto poss??vel?",
                "Mini", "Super computador", "Micro computador",
                "Mainframe",
                "Micro computador",
                "B");
        this.addQuestionCompFunda (q137);

        QuestionCompFunda q138 = new QuestionCompFunda (
                "Qual m??todo ?? usado para conectar um computador remoto?",
                "Dispositivo", "Discagem", "Diagn??stico",
                "Circuito l??gico",
                "Discagem",
                "B");
        this.addQuestionCompFunda (q138);

        QuestionCompFunda q139 = new QuestionCompFunda (
                "Quantos c??digos de bits s??o usados ??????pelo c??digo Murray para " +
                        "m??quinas TELEPRINTER.",
                "4", "5", "9", "25",
                "5",
                "B");
        this.addQuestionCompFunda (q139);

        QuestionCompFunda q140 = new QuestionCompFunda (
                "Os s??mbolos usados ??????em uma linguagem assembly s??o",
                "Codes", "Mnem??nicos", "Assembler", "Todos os anteriores",
                "Mnem??nicos",
                "B");
        this.addQuestionCompFunda (q140);

        QuestionCompFunda q141 = new QuestionCompFunda (
                "O complemento de 2 de um n??mero bin??rio ?? obtido adicionando " +
                        "..... ao seu complemento de 1.", "0", "1", "10",
                "12",
                "1" ,
                "B");
        this.addQuestionCompFunda (q141);

        QuestionCompFunda q142 = new QuestionCompFunda (
                "Uma linguagem de programa????o de sistemas para microcomputadores" +
                        " na fam??lia Intel ??",
                "PL / C", "PL / CT", "PL / M", "PLA",
                "PL / M",
                "B ");
        this.addQuestionCompFunda (q142);

        QuestionCompFunda q143 = new QuestionCompFunda (
                "Um dado que indica algum estado importante no conte??do da entrada" +
                        " ou sa??da ??",
                "Sequ??ncia", "Sentinela", "SIO", "Irm??o",
                "Sentinela",
                "B");
        this.addQuestionCompFunda (q143);

        QuestionCompFunda q144 = new QuestionCompFunda (
                "Qual ?? uma vers??o n??o padr??o de uma linguagem de computa????o?",
                "PROLOG", "APL", "Ex??rcito", "PL / 1",
                "Ex??rcito",
                "B");
        this.addQuestionCompFunda (q144);

        QuestionCompFunda q145 = new QuestionCompFunda (
                "Qual dos seguintes ainda ?? ??til para adicionar n??meros?",
                "EDSAC", "ENIAC", "Abacus", "UNIVAC",
                "Abacus",
                "B");
        this.addQuestionCompFunda (q145);

        QuestionCompFunda q146 = new QuestionCompFunda (
                "O tempo m??dio necess??rio para o setor correto de um disco " +
                        "chegar ?? cabe??a de leitura e grava????o ?? _____",
                "Tempo de inatividade", "Tempo de busca",
                "Atraso de rota????o", "Tempo de acesso",
                " Atraso rotacional ",
                " B ");
        this.addQuestionCompFunda (q146);

        QuestionCompFunda q147 = new QuestionCompFunda (
                "Um n??mero que ?? usado para controlar a forma de outro " +
                        "n??mero ?? conhecido como", "Mapa",
                "M??scara", "Mamtossa", "Marcador",
                "M??scara",
                "B");
        this.addQuestionCompFunda (q147);

        QuestionCompFunda q148 = new QuestionCompFunda (
                "Um microcomputador de usu??rio ??nico de uso geral projetado" +
                        "para ser operado por uma pessoa por vez ??",
                "Computador de uso especial", "KIPS", "M", "PC",
                "PC",
                "B");
        this.addQuestionCompFunda (q148);

        QuestionCompFunda q149 = new QuestionCompFunda (
                "ASCII significa", "C??digo padr??o americano para " +
                "interc??mbio de informa????es",
                "C??digo cient??fico multifacetado para interc??mbio de informa????es",
                "C??digo de seguran??a americano para interc??mbio de informa????es",
                "C??digo cient??fico americano para interc??mbio de informa????es",
                " C??digo padr??o americano para interc??mbio de informa????es ",
                " B ");
        this.addQuestionCompFunda (q149);

        QuestionCompFunda q150 = new QuestionCompFunda (
                "Qual dispositivo de opera????o do computador dispensa o uso do teclado?",
                "Joystick", "Caneta de luz", "Mouse", "Touch",
                "Mouse",
                "B");
        this.addQuestionCompFunda (q150);

        QuestionCompFunda q151 = new QuestionCompFunda (
                "O microcomputador, Intel MCS-80 ?? baseado no amplamente usado Intel",
                "microprocessador 8080", "microprocessador 8085",
                "microprocessador 8086", "microprocessador 8082",
                "microprocessador 8080",
                "I ");
        this.addQuestionCompFunda (q151);

        QuestionCompFunda q152 = new QuestionCompFunda (
                "Que ?? uma linguagem de alto n??vel orientada ?? m??quina para as " +
                        "m??quinas da s??rie GEC 4080.",
                "LOGO", "SNOBOL", "Babbage", "ALGOL",
                "Babbage",
                "I") ;
        this.addQuestionCompFunda (q152);

        QuestionCompFunda q153 = new QuestionCompFunda (
                "Um programa que ?? empregado no desenvolvimento, reparo" +
                        " ou aprimoramento de outros programas ?? conhecido como",
                "Software de sistema", "Ferramenta de software",
                "Programa de aplicativos", "Programa utilit??rio",
                "Ferramenta de software ",
                "EU");
        this.addQuestionCompFunda (q153);

        QuestionCompFunda q154 = new QuestionCompFunda (
                "Qualquer dispositivo de armazenamento adicionado a um " +
                        "computador al??m do armazenamento principal" +
                        " imediatamente utiliz??vel ?? conhecido como",
                "Disquete", "Disco r??gido",
                "Armazenamento de backup", "Cart??o perfurado",
                "Armazenamento de backup",
                "EU");
        this.addQuestionCompFunda (q154);

        QuestionCompFunda q155 = new QuestionCompFunda (
                "Qual dispositivo de sa??da ?? usado para traduzir " +
                        "informa????es de um computador para a forma pict??rica no papel.",
                "Mouse", "Plotter",
                "Painel de toque", "Perfurador de cart??o",
                "Plotter",
                "I ");
        this.addQuestionCompFunda (q155);

        QuestionCompFunda q156 = new QuestionCompFunda (
                "A lista de instru????es codificadas ?? chamada",
                "Programa de computador", "Algoritmo",
                "Fluxograma", "Programas utilit??rios",
                "Programa de computador",
                "I");
        this.addQuestionCompFunda (q156);

        QuestionCompFunda q157 = new QuestionCompFunda (
                "Uma t??cnica usada por c??digos para converter um sinal" +
                        " anal??gico em um fluxo de bits digital ?? conhecida como",
                "Modula????o de c??digo de pulso", "Esticador de pulso",
                "Processamento de consulta", "Gerenciamento de fila",
                "Pulso modula????o de c??digo ",
                " I ");
        this.addQuestionCompFunda (q157);

        QuestionCompFunda q158 = new QuestionCompFunda (
                "Um dispositivo de entrada ??ptica que interpreta marcas" +
                        " de l??pis em m??dia de papel ??",
                "O.M.R", "Leitor de cart??o perfurado",
                "Scanners ??pticos", "Fita magn??tica",
                "O.M.R",
                "I");
        this.addQuestionCompFunda (q158);

        QuestionCompFunda q159 = new QuestionCompFunda (
                "A vantagem mais importante de um" +
                        " IC ?? sua", "F??cil substitui????o em caso de falha do circuito",
                "Confiabilidade extremamente alta",
                "Custo reduzido",
                "Baixo consumo de energia",
                "Confiabilidade extremamente alta",
                "EU");
        this.addQuestionCompFunda (q159);

        QuestionCompFunda q160 = new  QuestionCompFunda (
                "Divis??o de dados ?? a terceira divis??o de um programa _____.",
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
                        " de c??digo diferente do normal ?? conhecido como",
                "Encoder", "Simulation", "Emulator", "Coding",
                "Encoder",
                "I" );
        this.addQuestionCompFunda (q162);

        QuestionCompFunda q163 = new QuestionCompFunda (
                "Um dispositivo projetado para ler informa????es codificadas em um pequeno " +
                        "cart??o de pl??stico ??", "Fita magn??tica", "Leitor de crach??",
                "Perfurador de fita", "Perfurador de cart??o",
                "Leitor de crach??",
                "I" );
        this.addQuestionCompFunda (q163);

        QuestionCompFunda q164 = new QuestionCompFunda (
                "Um computador h??brido usa um _____ para converter sinais digitais de " +
                        "um computador em sinais anal??gicos.", "Modulador",
                "Demodulador", "Modem", "Decodificador",
                "Modem",
                "I") ;
        this.addQuestionCompFunda (q164);

        QuestionCompFunda q165 = new QuestionCompFunda (
                "Um grupo de fitas magn??ticas, v??deos ou terminais geralmente sob o " +
                        "controle de um mestre ??",
                "Cylinder", "Cluster", "Surface", "Track",
                "Cluster",
                "I") ;
        this.addQuestionCompFunda (q165);

        QuestionCompFunda q166 = new  QuestionCompFunda (
                "Qualquer dispositivo que realiza convers??o de sinal ??",
                "Modulador", "Modem", "Teclado", "Plotter",
                "Modulador",
                "I");
        this.addQuestionCompFunda (q166);

        QuestionCompFunda q167 = new QuestionCompFunda (
                "C??digos que consistem em marcas claras e escuras que podem ser lidas " +
                        "opticamente s??o conhecidos como",
                "Mnem??nicos", "C??digo de barras",
                "Decodificador", "Todos os anteriores",
                "C??digo de barras",
                " EU");
        this.addQuestionCompFunda (q167);

        QuestionCompFunda q168 = new QuestionCompFunda (
                "Um tipo de canal usado para conectar um processador central" +
                        " e perif??ricos que usa multiplica????o ?? conhecido como",
                "Modem", "Rede", "Multiplexador", "Todos os anteriores",
                "Multiplexador",
                "EU");
        this.addQuestionCompFunda (q168);

        QuestionCompFunda q169 = new  QuestionCompFunda (
                "A primeira gera????o de computadores dispon??veis era baseada " +
                        "nos microprocessadores de bits.",
                "4", "8", "16", "64",
                "8",
                "I");
        this.addQuestionCompFunda (q169);

        QuestionCompFunda q170 = new  QuestionCompFunda (
                "O quadro completo dos dados armazenados no banco de dados ?? conhecido como",
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
                "Uma linguagem semelhante ?? usada no computador ??",
                "Linguagem de alto n??vel", "Linguagem de montagem",
                "Linguagem de baixo n??vel", "Todas as anteriores",
                "Baixo- linguagem de n??vel ",
                " I ");
        this.addQuestionCompFunda (q172);

        QuestionCompFunda q173 = new QuestionCompFunda (
                "Que ?? uma unidade que representa os bits n??o discretos.",
                "Baud", "Byte", "Bit", "Todos os anteriores",
                "Baud",
                "I");
        this.addQuestionCompFunda (q173);

        QuestionCompFunda q174 = new QuestionCompFunda (
                "O dispositivo que pode alimentar e aceitar dados de um computador ??",
                "ALU", "CPU", "Dispositivo de entrada-sa??da",
                "Todos os anteriores",
                "Entrada-sa??da dispositivo ",
                " I ");
        this.addQuestionCompFunda (q174);

        QuestionCompFunda q175 = new  QuestionCompFunda (
                "O pessoal que lida com o computador e sua gest??o juntos s??o chamados",
                "Software", "Humanware", "Firmware", "Hardware",
                "Humanware",
                "I");
        this.addQuestionCompFunda (q175);

        QuestionCompFunda q176 = new QuestionCompFunda (
                "Um computador digital moderno tem",
                "Velocidade extremamente alta", "Grande mem??ria",
                "Matriz quase ilimitada", "Todas as anteriores",
                "Todas as anteriores",
                "I");
        this.addQuestionCompFunda (q176);

        QuestionCompFunda q177 = new QuestionCompFunda (
                "Qual dos seguintes pode armazenar informa????es na forma de cavidades" +
                        " microsc??picas em discos de metal.",
                "Discos de laser", "Cassetes de fita",
                "Cartucho de RAM", "Cart??es perfurados",
                "Discos de laser" ,
                "EU");
        this.addQuestionCompFunda (q177);

        QuestionCompFunda q178 = new QuestionCompFunda (
                "Um dispositivo para converter impress??es manuscritas em " +
                        "caracteres codificados e coordenadas posicionais para entrada em um " +
                        "computador ??",
                "Touch panel", "Mouse", "Wand", "Writing tablet",
                "Writing tablet",
                "EU");
        this.addQuestionCompFunda (q178);

        QuestionCompFunda q179 = new QuestionCompFunda (
                "Um sistema de armazenamento para pequenas quantidades de dados ??",
                "Cart??o magn??tico",
                "Fita magn??tica",
                "Cart??o perfurado",
                "Leitor de marca ??ptica",
                "Cart??o magn??tico",
                "I");
        this.addQuestionCompFunda (q179);

        QuestionCompFunda q180 = new  QuestionCompFunda (
                "Qual ?? outro nome para linguagem funcional?",
                "M??quina", "Linguagem de aplicativo",
                "Linguagem de baixo n??vel", "Linguagem de alto n??vel",
                "Linguagem de aplicativo",
                "I");
        this.addQuestionCompFunda (q180);

        QuestionCompFunda q181 = new  QuestionCompFunda (
                "Compiladores e int??rpretes s??o eles pr??prios",
                "Linguagem de alto n??vel",
                "C??digos", "Programas", "Mnem??nicos",
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
                        "e ?? usado para apontar pontos em uma tela de v??deo.",
                "Mouse", "Caneta de luz", "Joystick", "Plotter",
                "Caneta de luz ",
                "EU");
        this.addQuestionCompFunda (q183);

        QuestionCompFunda q184 = new QuestionCompFunda (
                "Uma nota????o usada para expressar claramente no algoritmo ?? conhecida como",
                "Linguagem de algoritmo", "Linguagem de montagem",
                "Linguagem de m??quina", "Linguagem de alto n??vel",
                "Linguagem de algoritmo",
                "I") ;
        this.addQuestionCompFunda (q184);

        QuestionCompFunda q185 = new  QuestionCompFunda(
                "Compress??o de dados digitais para armazenamento eficiente ??",
                        "Buffer", "CPU", "Embalagem", "Campo",
                        "Embalagem",
                        "I");
        this.addQuestionCompFunda (q185);

        QuestionCompFunda q186 = new QuestionCompFunda(
                "Um sistema operacional destinado ao uso em sistemas baseados " +
                        "em microprocessador que oferecem suporte a um ??nico usu??rio ??",
                "PC-DOS","MS-DOS","UNIX","CP/M",
                "CP/M",
                "I");
        this.addQuestionCompFunda(q186);

        QuestionCompFunda q187 = new  QuestionCompFunda (
                "Qual linguagem de programa????o ?? baseada no Algol 60.",
                "PILOT", "SNOBOL", "ADA", "SIMULA",
                "SIMULA",
                "I");
        this.addQuestionCompFunda (q187);

        QuestionCompFunda q188 = new  QuestionCompFunda (
                "A mem??ria do computador consiste em",
                "RAM", "ROM", "PROM", "Todas as anteriores",
                "Todas as anteriores",
                "I");
        this.addQuestionCompFunda (q188);

        QuestionCompFunda q189 = new QuestionCompFunda (
                "Um caminho pelo qual a comunica????o ?? alcan??ada entre " +
                        "um processador central e outros dispositivos ?? chamado",
                "Trilha de auditoria", "Rede", "Barramento", "Canal",
                "Barramento",
                "I") ;
        this.addQuestionCompFunda (q189);

        QuestionCompFunda q190 = new QuestionCompFunda (
                "Um sistema aut??nomo que produz uma p??gina de sa??da impressa por vez ??",
                "Impressora de p??gina", "Impressora de linha",
                "Impressora a laser", "Impressora matricial",
                "Impressora de p??gina" ,
                "EU");
        this.addQuestionCompFunda (q190);

        QuestionCompFunda q191 = new QuestionCompFunda (
                "Uma mem??ria que n??o muda seu conte??do sem causas externas ?? conhecida como",
                "Mem??ria din??mica", "Mem??ria est??tica", "RAM", "EEPROM",
                "Mem??ria est??tica",
                "I") ;
        this.addQuestionCompFunda (q191);

        QuestionCompFunda q192 = new  QuestionCompFunda (
                "O boletim e a lista de m??rito formam o",
                "Dados de sa??da", "Processamento de dados",
                "Processamento central", "Dados de entrada",
                "Dados de sa??da",
                "I");
        this.addQuestionCompFunda (q192);

        QuestionCompFunda q193 = new QuestionCompFunda (
                "Um n??mero que ?? armazenado e processado, mas n??o na forma exponencial padr??o ?? chamado",
                "N??mero de ponto flutuante", "N??mero de ponto fixo",
                "N??mero octal", "N??mero decimal",
                "Ponto fixo n??mero ",
                " I ");
        this.addQuestionCompFunda (q193);

        QuestionCompFunda q194 = new  QuestionCompFunda (
                "Uma mem??ria que cont??m micro programas ??",
                "Mem??ria de n??cleo", "ROM", "RAM", "Mem??ria de controle",
                "ROM",
                "I");
        this.addQuestionCompFunda (q194);

        QuestionCompFunda q195 = new QuestionCompFunda (
                "Um dispositivo inventado pelo Dr. Bobeck em 1966, para " +
                        "armazenamento em massa de dados ??",
                "Fita de papel perfurada", "Armazenamento de bolha magn??tica",
                "Fita magn??tica", "Disco magn??tico",
                "Bolha magn??tica armazenamento ",
                " I ");
        this.addQuestionCompFunda (q195);

        QuestionCompFunda q196 = new  QuestionCompFunda (
                "A organiza????o e interconex??o dos v??rios componentes de um sistema " +
                        "de computador ??",
                "Arquitetura", "Redes",
                "Gr??ficos", "Projetando",
                "Arquitetura",
                "I");
        this.addQuestionCompFunda (q196);

        QuestionCompFunda q197 = new QuestionCompFunda (
                "Qual das op????es a seguir ?? a codifica????o de dados para que n??o " +
                        "seja facilmente compreendido se interceptado.",
                "C??digo de barras", "Decodificador",
                "Criptografia", "Mnem??nicos",
                "Criptografia", "EU");
        this.addQuestionCompFunda (q197);

        QuestionCompFunda q198 = new QuestionCompFunda (
                "RAM ?? usada como mem??ria curta porque ??", "Vol??til",
                "Tem pequena capacidade", "?? muito caro", "?? program??vel",
                "Vol??til",
                "I");
        this.addQuestionCompFunda (q198);

        QuestionCompFunda q199 = new QuestionCompFunda (
                "Um computador eletr??nico moderno ?? uma m??quina destinada a",
                "Fazer c??lculos matem??ticos r??pidos",
                "Armazenamento de entrada, manipula????o de sa??da de dados",
                "Processamento eletr??nico de dados",
                "Executar tarefas repetitivas com precis??o" ,
                "Armazenamento de entrada, manipula????o de sa??da de dados",
                "I");
        this.addQuestionCompFunda (q199);

        QuestionCompFunda q200 = new QuestionCompFunda (
                "Qual ?? um dispositivo que transforma informa????es em formato digital?",
                "Modem", "Digitalizador", "Mouse", "Caneta de luz",
                "Digitalizador",
                "I");
        this.addQuestionCompFunda (q200);

        QuestionCompFunda q201 = new QuestionCompFunda (
                "Qual das quatro palavras a seguir ?? estranha?",
                "Aplicativo", "Perif??rico", "Programa", "Software",
                "Perif??rico",
                "E");
        this.addQuestionCompFunda (q201);

        QuestionCompFunda q202 = new QuestionCompFunda (
                "Uma CPU cont??m",
                "um leitor de cart??o", "um motor anal??tico",
                "unidade de controle e ALU", "apenas ALU",
                "unidade de controle e ALU",
                "E");
        this.addQuestionCompFunda (q202);

        QuestionCompFunda q203 = new QuestionCompFunda
                ("Qual dos seguintes controla o processo de intera????o entre " +
                        "o usu??rio e o sistema operacional?",
                        "Interface do usu??rio", "tradutor de idioma",
                        "plataforma", "protetor de tela",
                        "interface do usu??rio",
                        "E");
        this.addQuestionCompFunda (q203);

        QuestionCompFunda q204 = new  QuestionCompFunda (
                "Os primeiros computadores foram programados usando",
                "linguagem de montagem", "linguagem de m??quina",
                "c??digo-fonte", "c??digo de objeto",
                "linguagem de m??quina",
                "E");
        this.addQuestionCompFunda (q204);

        QuestionCompFunda q205 = new QuestionCompFunda (
                "?? uma combina????o de hardware e software que facilita " +
                        "o compartilhamento de informa????es entre dispositivos computacionais",
                "rede", "perif??rico", "placa de expans??o",
                "dispositivo digital",
                "rede",
                "E" );
        this.addQuestionCompFunda (q205);

        QuestionCompFunda q206 = new QuestionCompFunda (
                "As configura????es autom??ticas e padr??o s??o chamadas de",
                "padr??o", "??cone", "CPU", "personalizado",
                "padr??o",
                "E");
        this.addQuestionCompFunda (q206);

        QuestionCompFunda q207 = new QuestionCompFunda (
                "As entradas codificadas que s??o usadas para obter acesso a" +
                        " um sistema de computador s??o chamadas de",
                "c??digos de entrada",
                "senhas", "comandos de seguran??a", "palavras-c??digo",
                "senhas",
                "E") ;
        this.addQuestionCompFunda (q207);

        QuestionCompFunda q208 = new  QuestionCompFunda (
                "Voc?? pode organizar arquivos armazenando-os em",
                "arquivos", "pastas", "??ndices", "listas",
                "pastas",
                "E");
        this.addQuestionCompFunda (q208);

        QuestionCompFunda q209 = new QuestionCompFunda (
                "Quantos documentos diferentes voc?? pode abrir ao mesmo tempo?",
                "N??o mais de 3", "apenas um",
                "o m??ximo que a mem??ria do seu computador comportar",
                "m??ximo de cinco",
                "tantos quantos a mem??ria do seu computador aguentar",
                "E");
        this.addQuestionCompFunda (q209);

        QuestionCompFunda q210 = new  QuestionCompFunda (
                "Diret??rio no diret??rio ?? chamado",
                "mini diret??rio", "diret??rio j??nior",
                "diret??rio parcial", "subdiret??rio",
                "subdiret??rio",
                "E");
        this.addQuestionCompFunda (q210);

        QuestionCompFunda q211 = new QuestionCompFunda (
                "Salvar ?? um processo", "Para copiar o documento da mem??ria para a m??dia de armazenamento",
                "Para alterar o status atual do documento",
                "Para alterar a face ou a forma inteira",
                "Para desenvolver o documento gravando o texto com o uso do teclado ",
                " Para copiar o documento da mem??ria para o meio de armazenamento ",
                " E ");
        this.addQuestionCompFunda (q211);

        QuestionCompFunda q212 = new  QuestionCompFunda (
                "Lixo eletr??nico tamb??m ?? chamado -", "spam", "spoof",
                "script sniffer", "spool",
                "spam",
                "E");
        this.addQuestionCompFunda (q212);

        QuestionCompFunda q213 = new QuestionCompFunda (
                "Que tipo de computadores s??o computadores clientes?",
                "Mainframe", "Mini-computador", "Micro-computador",
                "PDA",
                "Micro-computador",
                "E");
        this.addQuestionCompFunda (q213);

        QuestionCompFunda q214= new QuestionCompFunda(
                "Hackers-",
                "todos t??m o mesmo motivo","invadir computadores de outras pessoas",
                "cientista da computa????o","s??o boas pessoas",
                "invadir computadores de outras pessoas",
                "E");
        this.addQuestionCompFunda(q214);

        QuestionCompFunda q215 = new  QuestionCompFunda (
                "Um computador n??o pode inicializar se n??o tiver",
                "compilador", "carregador", "sistema operacional",
                "montador",
                "sistema operacional",
                "E");
        this.addQuestionCompFunda (q215);

        QuestionCompFunda q216 = new  QuestionCompFunda (
                "Exemplo de dados n??o num??ricos",
                "endere??o", "pontua????o no exame",
                "saldo banc??rio", "todos estes",
                "endere??o",
                "E");
        this.addQuestionCompFunda (q216);

        QuestionCompFunda q217 = new  QuestionCompFunda (
                "Primeira p??gina do site -",
                "p??gina inicial", "??ndice", "javascript", "favorito",
                "p??gina inicial",
                "E");
        this.addQuestionCompFunda (q217);

        QuestionCompFunda q218 = new QuestionCompFunda (
                "A apar??ncia dos caracteres digitados ?? -",
                "tamanho", "formato", "ponto", "cor",
                "formato",
                "E");
        this.addQuestionCompFunda (q218);

        QuestionCompFunda q219 = new QuestionCompFunda (
                "Office LANS, que est??o espalhados geograficamente em " +
                        "grande escala, podem ser conectados pelo uso de corporativo -",
                "CAN", "MAN", "LAN", "WAN",
                "WAN",
                " E ");
        this.addQuestionCompFunda (q219);

        QuestionCompFunda q220 = new QuestionCompFunda (
                "Onde os dados e o programa s??o armazenados quando o processador os usa?",
                "Mem??ria principal", "mem??ria secund??ria",
                "disco", "mem??ria do programa",
                "mem??ria principal",
                "E");
        this.addQuestionCompFunda (q220);

        QuestionCompFunda q221 = new QuestionCompFunda (
                "Se o arquivo salvo anteriormente for editado, ent??o -",
                "?? essencial salvar o arquivo novamente para armazenar a altera????o",
                "A altera????o ser?? salva automaticamente no arquivo",
                "Se o comprimento for mais do que uma p??gina, o arquivo precisar?? ser salvo ",
                " Ser?? necess??rio alterar o nome ",
                " ?? essencial salvar o arquivo novamente para armazenar a altera????o ",
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
                "Mem??ria que esquece tudo quando voc?? desliga a energia ?? conhecida como",
                "Corrompida", "Vol??til", "N??o Vol??til", "N??o Corrompida",
                "Vol??til",
                "E");
        this.addQuestionCompFunda (q224);

        QuestionCompFunda q225 = new QuestionCompFunda (
                "A liga????o de computadores com um sistema de comunica????o ?? chamada",
                "rede", "emparelhamento", "bloqueio", "montagem",
                "rede",
                "E");
        this.addQuestionCompFunda (q225);

        QuestionCompFunda q226 = new QuestionCompFunda (
                "O microprocessador de 16 bits significa que tem",
                "16 linhas de endere??o", "16 barramentos",
                "16 linhas de dados", "16 rotas",
                "16 linhas de dados",
                "E");
        this.addQuestionCompFunda (q226);

        QuestionCompFunda q227 = new QuestionCompFunda (
                "Os dados que v??o para os computadores s??o chamados de",
                "sa??da", "algoritmo", "entrada", "fluxograma",
                "entrada",
                "E");
        this.addQuestionCompFunda (q227);

        QuestionCompFunda q228 = new QuestionCompFunda (
                "Os dados provenientes dos computadores s??o chamados de",
                "sa??da", "algoritmo", "entrada", "fluxograma",
                "sa??da",
                "E");
        this.addQuestionCompFunda (q228);

        QuestionCompFunda q229 = new QuestionCompFunda (
                "Qual dos seguintes se refere a uma pequena rede de local ??nico?",
                "LAN", "DSL", "RAM", "USB",
                "LAN",
                "E");
        this.addQuestionCompFunda (q229);

        QuestionCompFunda q230 = new QuestionCompFunda (
                "Quantas op????es oferece uma escolha bin??ria?",
                "Zero", "Um", "Dois", "Tr??s",
                "Dois",
                "E");
        this.addQuestionCompFunda (q230);

        QuestionCompFunda q231 = new QuestionCompFunda (
                "Uma cole????o de programas que controla como o sistema do seu " +
                        "computador funciona e processa as informa????es ?? chamada de",
                "sistema operacional", "computador",
                "escrit??rio", "compilador",
                "sistema operacional",
                "E" );
        this.addQuestionCompFunda (q231);

        QuestionCompFunda q232 = new QuestionCompFunda (
                "Computador conectado a uma LAN (Rede Local) pode",
                "rodar r??pido", "estar online",
                "compartilhar perif??ricos", "e-mail",
                "compartilhar perif??ricos",
                "E");
        this.addQuestionCompFunda (q232);

        QuestionCompFunda q233 = new QuestionCompFunda (
                "A informa????o viaja entre os componentes na placa-m??e atrav??s de",
                "Mem??ria Flash", "CMOS", "Barramentos", "Perif??ricos",
                "Barramentos",
                "E");
        this.addQuestionCompFunda (q233);

        QuestionCompFunda q234 = new QuestionCompFunda (
                "Como os dados s??o organizados em uma planilha?",
                "Linhas e espa??os", "Camadas",
                "Altura e largura", "Linhas e colunas",
                "Linhas e colunas",
                "E");
        this.addQuestionCompFunda (q234);

        QuestionCompFunda q235 = new QuestionCompFunda (
                "O s??mbolo piscando na tela do computador ?? chamado de",
                "mouse", "m??o", "cursor", "palma",
                "cursor",
                "E");
        this.addQuestionCompFunda (q235);

        QuestionCompFunda q236 = new QuestionCompFunda (
                "Uma falha em um programa de computador que o impede " +
                        "de funcionar corretamente ?? conhecida como",
                "Boot", "Bug", "Bit", "Bin??rio",
                "Bug",
                "E");
        this.addQuestionCompFunda (q236);

        QuestionCompFunda q237 = new QuestionCompFunda (
                "Quantas op????es um sistema octal oferece?",
                "Oito", "Quatro", "Dois", "Tr??s",
                "Oito",
                "E");
        this.addQuestionCompFunda (q237);

        QuestionCompFunda q238 = new QuestionCompFunda (
                "Quantas op????es um sistema hexadecimal oferece?",
                "Oito", "Seis", "Dezesseis", "Tr??s",
                "Dezesseis",
                "E");
        this.addQuestionCompFunda (q238);

        QuestionCompFunda q239 = new QuestionCompFunda
                ("Pai da linguagem de programa????o C",
                        "Dennis Ritchie", "John Kennedy", "Bill Gates",
                        "James Gosling",
                        "Dennis Ritchie",
                        "E");
        this.addQuestionCompFunda (q239);

        QuestionCompFunda q240 = new QuestionCompFunda (
                "Pai da linguagem de programa????o Java",
                "Dennis Ritchie", "John Kennedy",
                "Bill Gates", "James Gosling",
                "James Gosling",
                "E");
        this.addQuestionCompFunda (q240);

        QuestionCompFunda q241 = new QuestionCompFunda (
                "BIOS significa",
                "Sistema de entrada e sa??da b??sico",
                "Sistema de sa??da de entrada bin??ria",
                "Sistema de entrada b??sico desligado",
                "Todas as op????es acima",
                "Sistema de entrada e sa??da b??sico",
                "E" );
        this.addQuestionCompFunda (q241);

        QuestionCompFunda q242 = new QuestionCompFunda (
                "VDU tamb??m ?? chamado de",
                "Tela", "Monitor", "Ambos 1 e 2", "Impressora",
                "Ambos 1 e 2",
                "E");
        this.addQuestionCompFunda (q242);

        QuestionCompFunda q243 = new QuestionCompFunda (
                "O dispositivo usado para transportar dados digitais em " +
                        "linhas anal??gicas ?? chamado de",
                "Modem", "Multiplexer", "DeMultiplexer", "Modulador",
                "Modem",
                "E");
        this.addQuestionCompFunda (q243);

        QuestionCompFunda q244 = new QuestionCompFunda (
                "SMPS significa",
                "Fonte de alimenta????o comutada",
                "Fonte de alimenta????o em modo inicial",
                "Fonte de alimenta????o em modo armazenamento",
                "Fonte de alimenta????o em modo ??nico",
                "Fonte de alimenta????o em modo comutado",
                "E" );
        this.addQuestionCompFunda (q244);

        QuestionCompFunda q245 = new QuestionCompFunda (
                "1 Byte =?", "8 bits", "4 bits", "2 bits", "1 bit",
                "8 bits",
                "E");
        this.addQuestionCompFunda (q245);

        QuestionCompFunda q246 = new QuestionCompFunda (
                "Qual dos seguintes ?? um princ??pio OOP", "Programa????o estruturada",
                "Programa????o procedural", "Heran??a", "Vincula????o",
                "Heran??a",
                "E");
        this.addQuestionCompFunda (q246);

        QuestionCompFunda q247 = new QuestionCompFunda (
                "Que comando divide a superf??cie do disco em branco em setores " +
                        "e atribui um endere??o ??nico a cada um",
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
                "Firewalls s??o usados ??????para proteger contra",
                "Ataques n??o autorizados", "V??rus",
                "Ataques de inc??ndio", "Ataques acionados por dados",
                "Ataques n??o autorizados",
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
                "Qual m??todo de backup ?? mais r??pido e requer a menor quantidad" +
                        "e de espa??o de armazenamento de backup?",
                "Di??rio", "Normal", "Diferencial", "Incremental",
                "Incremental",
                "B");
        this.addQuestionOS (q1);

        QuestionOS q2 = new QuestionOS (
                "Verifica????es e corre????es de disco de verifica????o ____.",
                "Unidades de fita", "Unidades de disco r??gido",
                "Unidades de CD-ROM", "Unidades de DVD-ROM",
                "Unidades de disco r??gido",
                "B");
        this.addQuestionOS (q2);

        QuestionOS q3 = new QuestionOS(
                "Onde est?? localizado o comando DIR?",
                "C:|WINDOWS","COMMAND.COM","C:|WINDOWS|SYSTEM",
                "C:|WINDOWS|COMMAND", "COMMAND.COM",
                "B");
        this.addQuestionOS(q3);

        QuestionOS q4 = new QuestionOS (
                "Qual comando permite visualizar ou editar arquivos de configura????o?",
                "SYSEDIT", "REGEDIT", "CFGEDIT", "AUTOEDIT",
                "SYSEDIT",
                "B");
        this.addQuestionOS (q4);

        QuestionOS q5 = new QuestionOS (
                "Qual utilit??rio ?? o melhor para editar o registro do Windows 95?",
                "Editar", "Regedit", "Reged32", "Gerenciador de Dispositivos",
                "Regedit",
                "B");
        this.addQuestionOS (q5);

        QuestionOS q6 = new QuestionOS (
                "Quais arquivos determinam a configura????o de inicializa????o m??ltipla do Windows 9x?",
                "IO.SYS", "SYSTEM.INI", "MSDOS.SYS", "CONFIG.SYS",
                "MSDOS.SYS", " B ");
        this.addQuestionOS (q6);

        QuestionOS q7 = new QuestionOS (
                "Quais pressionamentos de tecla alternam um usu??rio entre " +
                        "aplicativos executados simultaneamente no Windows?",
                "FN + TAB", "ALT + TAB", "CTRL + TAB", "SHIFT + TAB",
                "ALT + TAB ",
                " B ");
        this.addQuestionOS (q7);

        QuestionOS q8 = new QuestionOS (
                "Qual tipo de arquivo ?? o registro do Windows 9x?",
                "Arquivo de texto simples", "Banco de dados relacional",
                "Banco de dados hier??rquico", "Modelo de planilha",
                "Banco de dados hier??rquico", "B") ;
        this.addQuestionOS (q8);

        QuestionOS q9 = new QuestionOS (
                "Quais dessas declara????es seriam encontradas no arquivo autoexec.bat?",
                "FILES = 40", "PATH = C: \\;", "DOS = HIGH, UMB",
                "DEVICE = HIMEM.SYS ",
                " PATH = C: \\; ",
                " B ");
        this.addQuestionOS (q9);

        QuestionOS q10 = new QuestionOS(
                "Qual ?? o comando apropriado para instalar o Console de " +
                        "recupera????o do Windows 2000 como uma op????o de inicializa????o se " +
                        "o CD Rom for a unidade E?",
                "E:|i386\\SETUP.EXE\\CONSOLE","E:|i386\\CONSOLE.EXE\\INSTALL",
                "E:|i386\\WINNT32.EXE\\CMDCONS","E:|i386\\WIN2000.EXE\\RECOVERY",
                "E:|i386\\WINNT32.EXE\\CMDCONS",
                "B");
        this.addQuestionOS(q10);

        QuestionOS q11 = new QuestionOS (
                "A parte da instru????o de n??vel de m??quina, que informa ao " +
                        "processador central o que deve ser feito, ??",
                "C??digo de opera????o", "Endere??o", "Localizador", "Flip-Flop",
                "C??digo de opera????o ",
                " B ");
        this.addQuestionOS (q11);

        QuestionOS q12 = new QuestionOS (
                "Qual dos seguintes se refere ?? mem??ria associativa?",
                "O endere??o dos dados ?? gerado pela CPU",
                "o endere??o dos dados ?? fornecido pelos usu??rios",
                "n??o h?? necessidade para um endere??o, ou seja, os dados s??o usados ??????como um endere??o ",
                " os dados s??o acessados ??????sequencialmente ",
                " n??o h?? necessidade de um endere??o, ou seja, os dados s??o " +
                        "usados ??????como um endere??o ",
                " B ");
        this.addQuestionOS (q12);

        QuestionOS q13 = new QuestionOS (
                "Para evitar a condi????o de corrida, o n??mero de processos " +
                        "que podem estar simultaneamente dentro de sua se????o cr??tica ??",
                "8", "16", "1", "0",
                "1",
                "B ");
        this.addQuestionOS (q13);
        QuestionOS q14 = new QuestionOS (
                "Um programa de sistema que combina os m??dulos compilados" +
                        " separadamente de um programa em uma forma adequada para execu????o",
                "assembler", "assembler", "cross compiler", "load and go",
                "linking loader" ,
                "B");
        this.addQuestionOS (q14);

        QuestionOS q15 = new QuestionOS (
                "Processo ??",
                "programa em linguagem de alto n??vel mantido no disco",
                "conte??do da mem??ria principal", "um programa em execu????o",
                "um trabalho na mem??ria secund??ria",
                "um programa em execu????o" ,
                "B");
        this.addQuestionOS (q15);

        QuestionOS q16 = new QuestionOS (
                "Estrutura de endere??amento",
                "define o m??todo fundamental para determinar endere??os de" +
                        " operandos efetivos",
                "s??o varia????es no uso de estruturas de endere??amento fundamentais," +
                        " ou algumas a????es associadas que est??o relacionadas ao endere??amento",
                "executa as opera????es indicadas em dois registros r??pidos da m??quina e " +
                        "deixam o resultado em um dos registros ",
                " todas as anteriores ",
                " define o m??todo fundamental de determina????o dos " +
                        "endere??os efetivos dos operandos ",
                " B ");
        this.addQuestionOS (q16);

        QuestionOS q17 = new QuestionOS(
                "tudo acima",
                "?? um dispositivo de mem??ria de hardware que denota a localiza????o " +
                        "da instru????o atual sendo executada",
                "?? um grupo de circuitos el??tricos (hardware), que realiza a inten????o de " +
                        "instru????es buscadas na mem??ria",
                "cont??m o endere??o do local da mem??ria que deve ser lido ou armazenado em",
                "cont??m uma c??pia do local de mem??ria designado especificado pelo MAR " +
                        "ap??s uma \"leitura\" ou o novo conte??do da mem??ria antes de uma \"escrita\"",
                "cont??m uma c??pia do local de mem??ria designado especificado pelo" +
                        " MAR ap??s uma \"leitura\" ou o novo conte??do da mem??ria antes" +
                        " de uma \"escrita\"",
                "B");
        this.addQuestionOS(q17);

        // PAREI AQUI NA TRADU????O

        QuestionOS q18 = new QuestionOS (
                "A estrat??gia de permitir que processos logicamente " +
                        "execut??veis ??????sejam temporariamente suspensos ?? chamada de",
                "agendamento preemptivo", "agendamento n??o preemptivo",
                "trabalho mais curto primeiro", "trabalho mais curto primeiro",
                "agendamento preemptivo ",
                " B ");
        this.addQuestionOS (q18);

        QuestionOS q19 = new QuestionOS (
                "O algoritmo LRU",
                "sai das p??ginas que foram usadas recentemente",
                "sai das p??ginas que n??o foram usadas recentemente",
                "sai das p??ginas que foram menos usadas recentemente",
                "sai das p??ginas a primeira p??gina em uma determinada ??rea ",
                " p??ginas que foram menos usadas recentemente ",
                " B ");
        this.addQuestionOS (q19);

        QuestionOS q20 = new QuestionOS (
                "Qual dos seguintes softwares de sistema faz o trabalho de" +
                        " mesclar os registros de dois arquivos em um?",
                "Software de seguran??a",
                "Programa utilit??rio",
                "Software de rede",
                "Sistema de documenta????o",
                "Utilit??rio programa ",
                " B ");
        this.addQuestionOS (q20);

        QuestionOS q21 = new QuestionOS (
                "Fork ??",
                "o despacho de uma tarefa",
                "a cria????o de um novo trabalho",
                "a cria????o de um novo processo",
                "aumentando a prioridade de uma tarefa",
                "a cria????o de um novo processo ",
                " B ");
        this.addQuestionOS (q21);

        QuestionOS q22 = new QuestionOS (
                "Thrashing",
                "?? uma consequ??ncia natural dos sistemas de mem??ria virtual",
                "sempre pode ser evitado trocando",
                "sempre ocorre em computadores grandes",
                "pode ??????ser causado por algoritmos de pagina????o deficientes",
                "pode ser causado por algoritmos de pagina????o deficientes ",
                " B ");
        this.addQuestionOS (q22);

        QuestionOS q23 = new QuestionOS (
                "Estado do supervisor ??",
                "nunca usado",
                "inserido pelos programas quando entram no processador",
                "necess??rio para realizar qualquer I / O",
                "permitido apenas para o sistema operacional",
                "apenas permitido para o sistema operacional ",
                " B ");
        this.addQuestionOS (q23);

        QuestionOS q24 = new QuestionOS (
                "Qual das seguintes etapas de instru????o, seria escrito dentro " +
                        "da caixa em forma de diamante, de um fluxograma?",
                "S = B - C", "IS A <10", "PRINT A", "DATA X, 4Z",
                "IS A <10",
                "B");
        this.addQuestionOS (q24);

        QuestionOS q25 = new QuestionOS (
                "Qual das seguintes afirma????es ?? falsa?",
                "A t??cnica de compacta????o de armazenamento envolve mover" +
                        " todas as ??reas ocupadas de armazenamento para uma " +
                        "extremidade ou outra do armazenamento principal",
                "a compacta????o n??o envolve realoca????o de programas",
                "compacta????o tamb??m ?? conhecida como coleta de lixo",
                "o sistema deve parar tudo enquanto realiza a compacta????o",
                "compacta????o n??o envolve realoca????o de programas",
                "B");
        this.addQuestionOS (q25);

        QuestionOS q26 = new QuestionOS (
                "Comunica????o entre processos", "?? necess??ria para " +
                "todos os processos",
                "geralmente ?? feita atrav??s de drives de disco",
                "nunca ?? necess??rio",
                "permite que os processos sincronizem a atividade",
                "permite que os processos sincronizem a atividade",
                "B");
        this.addQuestionOS (q26);

        QuestionOS q27 = new QuestionOS (
                "Qual das seguintes fun????es ?? (s??o) realizadas pelo carregador",
                "alocar espa??o na mem??ria para os programas e resolver " +
                        "refer??ncias simb??licas entre conjuntos de objetos",
                "ajustar todos os locais dependentes de endere??o, como constantes" +
                        " de endere??o , para corresponder ao espa??o alocado ",
                " coloque fisicamente as instru????es da m??quina e os dados na mem??ria ",
                " Todas as anteriores ",
                " Todas as anteriores ",
                " B ");
        this.addQuestionOS (q27);

        QuestionOS q28 = new QuestionOS (
                "Sistemas de f??cil utiliza????o s??o:",
                "necess??rio para programa????o orientada a objetos",
                "f??cil de desenvolver",
                "comum entre sistemas operacionais de mainframe tradicionais",
                "tornando-se mais comum",
                "tornando-se mais comum" ,
                "B");
        this.addQuestionOS (q28);

        QuestionOS q29 = new QuestionOS (
                "Qual dos seguintes modos de endere??amento facilita " +
                        "o acesso a um operando cuja localiza????o ?? definida em " +
                        "rela????o ao in??cio da estrutura de dados em que aparece?",
                "Ascendente", "ordena????o", "??ndice", "indireto",
                "??ndice",
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
                "Mem??ria",
                "?? um dispositivo que realiza uma sequ??ncia de opera????es especificadas" +
                        " por instru????es na mem??ria.",
                "?? o dispositivo onde a informa????o ?? armazenada",
                "?? uma sequ??ncia de instru????es",
                "?? tipicamente caracterizada por processamento interativo e " +
                        "divis??o de tempo da CPU para permitir uma resposta r??pida a cada usu??rio. ",
                " ?? o dispositivo onde as informa????es s??o armazenadas ",
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
                "Um programa de sistema que configura um programa execut??vel na mem??ria " +
                        "principal pronto para execu????o ??",
                "assembler", "linker", "loader", "compiler",
                "loader",
                "B");
        this.addQuestionOS (q33);

        QuestionOS q34 = new QuestionOS (
                "Um programa de sistema que configura um programa execut??vel " +
                        "na mem??ria principal pronto para execu????o ??",
                "assembler", "linker", "loader", "compiler",
                "loader",
                "B");
        this.addQuestionOS (q34);

        QuestionOS q35 = new QuestionOS (
                "Quais dos seguintes s??o carregados na mem??ria principal quando o " +
                        "computador ?? inicializado?",
                "Instru????es de comando interno",
                "instru????es de comando externo",
                "programas utilit??rios",
                "instru????es de processamento de texto",
                "comando interno instru????es ",
                " B ");
        this.addQuestionOS (q35);

        QuestionOS q36 = new QuestionOS (
                "O algoritmo FIFO",
                "executa primeiro o trabalho que entrou na fila por ??ltimo",
                "executa primeiro o trabalho que entrou na fila",
                "executa primeiro o trabalho que est?? h?? mais tempo na fila" ,
                "executa primeiro o trabalho com o m??nimo de necessidades do processador",
                "executa primeiro o trabalho que entrou primeiro na fila",
                "B");
        this.addQuestionOS (q36);

        QuestionOS q37 = new QuestionOS (
                "Qual ?? o nome dado ?? cole????o organizada de software que controla o " +
                        "funcionamento geral de um computador?",
                "Sistema de trabalho",
                "Sistema perif??rico",
                "Sistema operacional",
                "Sistema de controle",
                " Sistema operacional ",
                " B ");
        this.addQuestionOS (q37);

        QuestionOS q38 = new QuestionOS (
                "O princ??pio da localidade de refer??ncia justifica o uso de",
                "reenter??vel",
                "n??o reutiliz??vel",
                "mem??ria virtual",
                "mem??ria cache",
                "mem??ria cache",
                "B");
        this.addQuestionOS (q38);

        QuestionOS q39 = new QuestionOS (
                "O registro ou local da mem??ria principal que cont??m o endere??o" +
                        " efetivo do operando ?? conhecido como",
                "ponteiro",
                "registro indexado",
                "localiza????o especial",
                "bloco de rascunho",
                "ponteiro",
                " B ");
        this.addQuestionOS (q39);

        QuestionOS q40 = new QuestionOS (
                "A base de dados de c??digo de montagem est?? associada a",
                "vers??o em linguagem de montagem do programa que ?? criada pela fase de " +
                        "gera????o de c??digo e ?? inserida na fase de montagem.",
                "Uma tabela permanente de regras de decis??o no forma de padr??es " +
                        "para combinar com a tabela de s??mbolos uniforme para " +
                        "descobrir a estrutura sint??tica. ",
                " consiste em uma lista completa ou parcial ou os tokens conforme " +
                        "aparecem no programa. Criado por an??lise lexical e usado " +
                        "para an??lise e interpreta????o de sintaxe. ",
                " uma tabela permanente que lista todas as palavras-chave e " +
                        "s??mbolos especiais da linguagem em forma simb??lica. ",
                " vers??o em linguagem de montagem do programa que ?? criada pela " +
                        "fase de gera????o de c??digo e ?? inserida na fase de montagem. ",
                " B ");
        this.addQuestionOS (q40);

        QuestionOS q41 = new QuestionOS (
                "Thrashing pode ser evitado se",
                "as p??ginas, pertencentes ao conjunto de trabalho dos " +
                        "programas, estiverem na mem??ria principal",
                "a velocidade da CPU ?? aumentada",
                "a velocidade do processador I / O ?? acrescido ",
                " todas as anteriores ",
                " as p??ginas, pertencentes ao conjunto de trabalho dos programas," +
                        " est??o na mem??ria principal ",
                " B ");
        this.addQuestionOS (q41);

        QuestionOS q42 = new QuestionOS(
                "Ao analisar a compila????o do programa PL / I, o " +
                        "termo \"An??lise lexical\" est?? associado com",
                "reconhecimento de constru????es sint??ticas b??sicas por meio de redu????es.",
                "reconhecimento de elementos b??sicos e cria????o de s??mbolos uniformes",
                "cria????o de mais matriz opcional.",
                "uso de processador de macro para produzir c??digo de montagem mais otimizado",
                "reconhecimento de elementos b??sicos e cria????o de s??mbolos uniformes",
                "B");
        this.addQuestionOS(q42);

        QuestionOS q43 = new QuestionOS (
                "A resolu????o de s??mbolos definidos externamente ?? realizada por",
                "Linker", "Loader", "Compiler", "Assembler",
                "Linker",
                "B");
        this.addQuestionOS (q43);

        QuestionOS q44 = new QuestionOS (
                "Gera????o de sistema:",
                "?? sempre bastante simples",
                "?? sempre muito dif??cil",
                "varia em dificuldade entre sistemas",
                "requer ferramentas extensas para ser compreens??vel",
                "varia em dificuldade entre sistemas",
                "B");
        this.addQuestionOS (q44);

        QuestionOS q45 = new QuestionOS(
                "O Registro de Endere??o de Mem??ria",
                "?? um dispositivo de mem??ria de hardware que denota a localiza????o " +
                        "da instru????o atual sendo executada.",
                "?? um grupo de circuitos el??tricos (hardware), que realiza a inten????o " +
                        "de instru????es buscadas na mem??ria.",
                "cont??m o endere??o do local da mem??ria que deve ser lido ou armazenado.",
                "cont??m uma c??pia do local de mem??ria designado especificado " +
                        "pelo MAR ap??s uma \"leitura\" ou o novo conte??do da mem??ria " +
                        "antes de uma\"escrita\".",
                "cont??m o endere??o do local da mem??ria que deve ser lido ou armazenado.",
                "B");
        this.addQuestionOS(q45);

        QuestionOS q46 = new QuestionOS (
                "Em sistemas de mem??ria virtual, tradu????o din??mica de endere??os",
                "?? o hardware necess??rio para implementar pagina????o",
                "armazena p??ginas em um local espec??fico no disco",
                "?? in??til quando a troca ?? usada",
                "faz parte do algoritmo de pagina????o do sistema operacional ",
                " ?? o hardware necess??rio para implementar a pagina????o ",
                " B ");
        this.addQuestionOS (q46);

        QuestionOS q47 = new QuestionOS (
                "Fragmenta????o do sistema de arquivos",
                "ocorre apenas se o sistema de arquivos for usado incorretamente",
                "sempre pode ser evitado",
                "pode ??????ser removido temporariamente por compacta????o",
                "?? uma caracter??stica de todos os sistemas de arquivos ",
                " pode ser removido temporariamente por compacta????o ",
                " B ");
        this.addQuestionOS (q47);

        QuestionOS q48 = new QuestionOS (
                "Um programa n??o realoc??vel ?? aquele que",
                "n??o pode ser executado em qualquer ??rea de armazenamento que n??o" +
                        " a designada para ele no momento de sua codifica????o ou tradu????o.",
                "Consiste em um programa e informa????es relevantes para a sua realoca????o. ",
                " pode ele mesmo realizar a realoca????o de suas partes sens??veis ao endere??o. ",
                " todas as op????es acima ",
                " n??o podem ser executadas em qualquer ??rea de armazenamento diferente" +
                        " da designada para ele no momento de sua codifica????o ou tradu????o. ",
                " B ");
        this.addQuestionOS (q48);

        QuestionOS q49 = new QuestionOS (
                "Quais dos seguintes s??o (s??o) Processadores de linguagem",
                "monta", "compiladores", "int??rpretes", "Todos os anteriores",
                "Todos os anteriores",
                "B ");
        this.addQuestionOS (q49);

        QuestionOS q50 = new QuestionOS (
                "Em qual modo de endere??amento o endere??o efetivo do operando ?? " +
                        "o conte??do de um registro especificado na instru????o e ap??s o " +
                        "acesso ao operando, o conte??do deste registro ?? incrementado " +
                        "para apontar para o pr??ximo item da lista? ",
                " endere??amento de ??ndice ",
                " endere??amento indireto ",
                " incremento autom??tico ",
                " decremento autom??tico ",
                " incremento autom??tico ",
                " B ");
        this.addQuestionOS (q50);

        QuestionOS q51 = new QuestionOS(
                "O esquema de aloca????o de mem??ria est?? sujeito a \"externa\" fragmenta????o ??",
                "segmenta????o",
                "trocando",
                "pagina????o de demanda pura",
                "m??ltiplas parti????es fixas cont??guas",
                "segmenta????o",
                "I");
        this.addQuestionOS(q51);

        QuestionOS q52 = new QuestionOS (
                "Enquanto estiver trabalhando com MS-DOS, qual comando voc?? usar?? " +
                        "para transferir um arquivo espec??fico de um disco para outro?",
                "DISKCOPY", "COPY", "RENAME", "FORMAT",
                "COPY ",
                "EU");
        this.addQuestionOS (q52);

        QuestionOS q53 = new QuestionOS (
                "Qual ?? o nome do sistema operacional do laptop chamado MacLite?",
                "Windows", "DOS", "MS-DOS", "OZ",
                "OZ",
                "I") ;
        this.addQuestionOS (q53);

        QuestionOS q54 = new QuestionOS (
                "Em qual modo de endere??amento o conte??do de um registro " +
                        "especificado na instru????o ?? primeiro diminu??do e, em seguida, " +
                        "esse conte??do ?? usado como o endere??o efetivo dos operandos?",
                "Endere??amento de ??ndice",
                "endere??amento indireto",
                "auto incremento",
                "auto decremento",
                "auto decremento",
                "I");
        this.addQuestionOS (q54);

        QuestionOS q55 = new QuestionOS (
                "Qual ?? o nome dado aos valores que s??o fornecidos automaticamente" +
                        " pelo software para reduzir o pressionamento de teclas e melhorar a " +
                        "produtividade do usu??rio do computador?",
                "Valores definidos",
                "Valores fixos",
                "Valores padr??o",
                "Especial valores ",
                " Valores padr??o ",
                " I ");
        this.addQuestionOS (q55);

        QuestionOS q56 = new QuestionOS (
                "Roubo de p??gina",
                "?? um sinal de um sistema eficiente",
                "est?? pegando frames de p??gina de outros conjuntos de trabalho",
                "deve ser o objetivo do ajuste",
                "est?? ocupando espa??o em disco maior para p??ginas paginadas ",
                " est?? pegando quadros de p??gina de outros conjuntos de trabalho ",
                " I ");
        this.addQuestionOS (q56);

        QuestionOS q57 = new QuestionOS (
                "No MS-DOS 5.0, qual ?? o n??mero que atua como um c??digo para " +
                        "identificar exclusivamente o produto de software?",
                "MS", "DOS", "MS DOS", "5.0",
                "5.0 ",
                "EU");
        this.addQuestionOS (q57);

        QuestionOS q58 = new QuestionOS (
                "Bug significa",
                "Um erro l??gico em um programa",
                "Um erro de sintaxe dif??cil em um programa",
                "Documentando programas usando uma ferramenta de documenta????o eficiente",
                "Todas as op????es acima",
                "Uma l??gica erro em um programa ",
                " I ");
        this.addQuestionOS (q58);

        QuestionOS q59 = new QuestionOS (
                "Gerenciamento de mem??ria ??:",
                "n??o usado no sistema operacional moderno",
                "substitu??do por mem??ria virtual nos sistemas atuais",
                "n??o usado em sistemas de multiprograma????o",
                "cr??tico at?? mesmo para os sistemas operacionais mais simples",
                "cr??tico at?? mesmo para os sistemas operacionais mais simples",
                "I");
        this.addQuestionOS (q59);

        QuestionOS q60 = new QuestionOS (
                "O valor inicial do sem??foro que permite que apenas um dos " +
                        "muitos processos entre em suas se????es cr??ticas, ??",
                "8", "1", "16", "0",
                "1",
                "EU");
        this.addQuestionOS (q60);

        QuestionOS q61 = new QuestionOS (
                "As instru????es Register-to-Register (RR)",
                "t??m seus operandos na loja principal.",
                "Que executam uma opera????o em um operando de registro e em um operando " +
                        "localizado na loja principal. , geralmente deixando o resultado " +
                        "no registro, exceto no caso de opera????o de armazenamento quando " +
                        "tamb??m ?? escrito no local de armazenamento especificado. ",
                " que executa as opera????es indicadas em dois registros r??pidos da m??quina " +
                        "e deixa o resultado em um dos registros . ",
                " todas as anteriores ",
                " que realizam as opera????es indicadas em dois registros r??pidos da m??quina" +
                        " e deixam o resultado em um dos registros. ",
                " I ");
        this.addQuestionOS (q61);

        QuestionOS q62 = new QuestionOS (
                "Um erro de p??gina",
                "?? um erro ?? uma p??gina espec??fica",
                "ocorre quando um programa acessa uma p??gina da mem??ria",
                "?? um acesso a uma p??gina que n??o est?? na mem??ria",
                "?? um refer??ncia a uma p??gina pertencente a outro programa ",
                " ?? um acesso a uma p??gina que n??o est?? atualmente na mem??ria ",
                " I ");
        this.addQuestionOS (q62);

        QuestionOS q63 = new QuestionOS (
                "Um algoritmo ?? melhor descrito como",
                "Uma linguagem de computador",
                "Um procedimento passo a passo para resolver um problema",
                "Um ramo da matem??tica", "Todas as anteriores",
                "Um passo procedimento passo a passo para resolver um problema ",
                " I ");
        this.addQuestionOS (q63);

        QuestionOS q64 = new QuestionOS (
                "O processo de transfer??ncia de dados destinados a um dispositivo " +
                        "perif??rico para um disco (ou armazenamento intermedi??rio) " +
                        "para que possam ser transferidos para um perif??rico em um " +
                        "momento mais conveniente ou em massa, ?? conhecido como",
                "multiprograma????o" , "spool", "cache", "programa????o virtual",
                "spool",
                "I");
        this.addQuestionOS (q64);

        QuestionOS q65 = new QuestionOS (
                "Caches de bloco ou caches de buffer s??o usados",
                "para melhorar o desempenho do disco",
                "para lidar com interrup????es",
                "para aumentar a capacidade da mem??ria principal",
                "para acelerar a opera????o de leitura da mem??ria principal",
                "para melhorar o desempenho do disco",
                "I");
        this.addQuestionOS (q65);

        QuestionOS q66 = new QuestionOS (
                "Qual das seguintes afirma????es ?? falsa?",
                "Um tamanho de p??gina pequeno causa tabelas de p??ginas grandes",
                "a fragmenta????o interna ?? aumentada com p??ginas pequenas",
                "um tamanho de p??gina grande causa instru????es e dados que n??o ser" +
                        " referenciado colocado no armazenamento prim??rio ",
                " As transfer??ncias de E / S s??o mais eficientes com p??ginas grandes ",
                " a fragmenta????o interna ?? aumentada com p??ginas pequenas ",
                " I ");
        this.addQuestionOS (q66);

        QuestionOS q67 = new QuestionOS (
                "A a????o de analisar o programa de origem nas classes sint??ticas" +
                        " adequadas ?? conhecida como",
                "an??lise de sintaxe",
                "an??lise lexical",
                "an??lise de interpreta????o",
                "an??lise de sintaxe geral",
                "an??lise lexical",
                "EU");
        this.addQuestionOS (q67);

        QuestionOS q68 = new QuestionOS (
                "Qual dos seguintes n??o ?? verdadeiro sobre a descri????o de uma tabela de decis??o?",
                "Uma tabela de decis??o ?? f??cil de modificar",
                "Uma tabela de decis??o ?? diretamente entendida pelo computador",
                "Uma decis??o a tabela ?? f??cil de entender ",
                " Todas as anteriores ",
                " Uma tabela de decis??o ?? compreendida diretamente pelo computador ",
                " I ");
        this.addQuestionOS (q68);

        QuestionOS q69 = new QuestionOS (
                "programas Cavalo de Tr??ia",
                "s??o programas leg??timos que permitem acesso n??o autorizado",
                "geralmente n??o funcionam",
                "s??o programas ocultos que n??o aparecem no sistema",
                "geralmente s??o descobertos imediatamente" ,
                "s??o programas leg??timos que permitem acesso n??o autorizado",
                "I");
        this.addQuestionOS (q69);

        QuestionOS q70 = new QuestionOS (
                "Quando a IBM lan??ou a primeira vers??o do sistema operacional de disco DOS vers??o 1.0?",
                "1981", "1982", "1983", "1984",
                "1981",
                "I");
        this.addQuestionOS (q70);

        QuestionOS q71 = new QuestionOS (
                "Qual das afirma????es a seguir ?? falsa sobre o disco quando comparado ?? mem??ria principal?",
                "N??o vol??til",
                "maior capacidade de armazenamento",
                "menor pre??o por bit", "mais r??pido",
                "mais r??pido",
                "EU");
        this.addQuestionOS (q71);

        QuestionOS q72 = new QuestionOS (
                "Problema do consumidor do produtor pode ser resolvido usando",
                "sem??foros",
                "contadores de eventos",
                "monitores", "todos os anteriores",
                "todos os anteriores",
                "I");
        this.addQuestionOS (q72);

        QuestionOS q73 = new QuestionOS (
                "A maioria dos sistemas operacionais de microcomputadores como Apple DOS," +
                        " MS DOS e PC DOS etc. s??o chamados de sistemas operacionais de disco porque",
                "eles residem na mem??ria",
                "s??o inicialmente armazenados no disco",
                "eles est??o dispon??veis em fitas magn??ticas ",
                " est??o parcialmente na mem??ria prim??ria e parcialmente no disco ",
                " s??o inicialmente armazenados no disco ",
                " I ");
        this.addQuestionOS (q73);

        QuestionOS q74 = new QuestionOS (
                "A CPU, ap??s receber uma interrup????o de um dispositivo de I / O",
                "p??ra por um tempo predeterminado",
                "entrega o controle do barramento de endere??o e barramento de " +
                        "dados para o dispositivo de interrup????o",
                "ramifica para a rotina de interrup????o de servi??o imediatamente ",
                " ramifica-se para a rotina de interrup????o de servi??o ap??s a " +
                        "conclus??o da instru????o atual ",
                " ramifica-se para a rotina de interrup????o de servi??o ap??s a" +
                        " conclus??o da instru????o atual ",
                " I ");
        this.addQuestionOS (q74);

        QuestionOS q75 = new QuestionOS (
                "Seeks analysis",
                "?? usado para analisar problemas de paging",
                "?? usado para analisar problemas de unidade de controle ocupada",
                "?? mostrado apenas em telas em tempo real",
                "?? usado para analisar dispositivo ocupado problemas ",
                " ?? usado para analisar problemas de ocupa????o do dispositivo ",
                " I ");
        this.addQuestionOS (q75);

        QuestionOS q76 = new QuestionOS (
                "Qual ?? um banco de dados permanente no modelo geral de compilador?",
                "Tabela Literal",
                "Tabela Identificador",
                "Tabela Terminal",
                "C??digo-fonte",
                "Tabela Terminal",
                "I") ;
        this.addQuestionOS (q76);

        QuestionOS q77 = new QuestionOS (
                "Qual ?? o nome da t??cnica em que o sistema operacional " +
                        "de um computador executa v??rios programas simultaneamente " +
                        "alternando entre eles?",
                "Particionamento", "Multitarefa", "Janelas", "Pagina????o ",
                " Multitarefa ",
                " I ");
        this.addQuestionOS (q77);

        QuestionOS q78 = new QuestionOS (
                "Sistema operacional",
                "vincula um programa ??s sub-rotinas ??s quais faz refer??ncia",
                "fornece uma interface amig??vel em camadas",
                "permite ao programador desenhar um fluxograma",
                "todas as op????es anteriores",
                "fornece uma interface amig??vel em camadas",
                "I");
        this.addQuestionOS (q78);

        QuestionOS q79 = new QuestionOS (
                "Software que mede, monitora, analisa e controla eventos " +
                        "do mundo real ?? chamado de:",
                "software de sistema",
                "software em tempo real",
                "software cient??fico",
                "software de neg??cios",
                "real -time software ",
                " I ");
        this.addQuestionOS (q79);

        QuestionOS q80 = new QuestionOS (
                "Os detalhes de todos os s??mbolos externos e forma????o " +
                        "de realoca????o (lista de realoca????o ou mapa) s??o fornecidos " +
                        "ao vinculador por",
                "Processador de macro",
                "Tradutor", "Carregador",
                "Editor",
                "Tradutor",
                "EU");
        this.addQuestionOS (q80);

        QuestionOS q81 = new QuestionOS (
                "O processador de macro deve executar",
                "reconhecer defini????es de macro e chamadas de macro",
                "salvar as defini????es de macro",
                "expandir chamadas de macros e substituir argumentos",
                "todos os anteriores",
                "todos os acima de ",
                " I ");
        this.addQuestionOS (q81);

        QuestionOS q82 = new QuestionOS (
                "Uma estrat??gia de desenvolvimento em que os m??dulos " +
                        "de controle executivo de um sistema s??o codificados e " +
                        "testados primeiro, ?? conhecida como",
                "Desenvolvimento de baixo para cima",
                "Desenvolvimento de cima para baixo",
                "Desenvolvimento de esquerda para direita",
                "Todas as op????es anteriores",
                "Desenvolvimento de cima para baixo",
                "I");
        this.addQuestionOS (q82);

        QuestionOS q83 = new QuestionOS (
                "Qual das alternativas a seguir ?? ??til para avaliar o " +
                        "software de aplicativos que melhor atende ??s suas necessidades?",
                "Recomenda????es de outros usu??rios",
                "revistas de inform??tica",
                "an??lises objetivas de software",
                "todas as op????es anteriores" ,
                "todas as anteriores",
                "I");
        this.addQuestionOS (q83);

        QuestionOS q84 = new QuestionOS (
                "Qual problema ?? resolvido pelo algoritmo do banqueiro de Dijkstra?",
                "Exclus??o m??tua",
                "recupera????o de deadlock",
                "preven????o de deadlock",
                "coer??ncia de cache",
                "preven????o de deadlock",
                "I");
        this.addQuestionOS (q84);

        QuestionOS q85 = new QuestionOS (
                "O despachante",
                "realmente agenda as tarefas no processador",
                "coloca tarefas em espera de E / S",
                "?? sempre pequeno e simples",
                "nunca muda as prioridades das tarefas",
                "realmente agenda o tarefas no processador ",
                " I ");
        this.addQuestionOS (q85);

        QuestionOS q86 = new QuestionOS (
                "Programas de sistema, como Compiladores, s??o projetados de forma que sejam",
                "reentr??veis",
                "n??o reutiliz??veis",
                "utiliz??veis ??????em s??rie",
                "recursivos",
                "reenter??veis", "I");
        this.addQuestionOS (q86);

        QuestionOS q87 = new QuestionOS (
                "A IBM lan??ou seu primeiro PC em 1981. Voc?? pode citar o " +
                        "sistema operacional que era mais popular naquela ??poca?",
                "MS-DOS", "PC-DOS", "OS / 360", " CP / M ",
                " CP / M ",
                " I ");
        this.addQuestionOS (q87);

        QuestionOS q88 = new QuestionOS (
                "Se o n??mero de bits em um endere??o virtual de um programa " +
                        "?? 16 e o ??????tamanho da p??gina ?? 0,5 K bytes, o n??mero de p??ginas" +
                        " no espa??o de endere??o virtual ??",
                "16", "32", "64", "128",
                "128",
                "I");
        this.addQuestionOS (q88);

        QuestionOS q89 = new QuestionOS (
                "Qual tabela ?? um banco de dados permanente que possui " +
                        "uma entrada para cada s??mbolo de terminal.",
                "Tabela de terminais",
                "Redu????es",
                "Tabela de identificadores",
                "Tabela literal",
                "Tabela de terminais", "I ");
        this.addQuestionOS (q89);

        QuestionOS q90 = new QuestionOS (
                "A(s) fun????o(??es) da fase de sintaxe ?? (s??o)",
                "para reconhecer as principais constru????es da linguagem e para " +
                        "chamar as rotinas de a????o apropriadas que ir??o gerar a " +
                        "forma intermedi??ria ou matriz para essas constru????es. ",
                " para construir uma tabela literal e uma tabela de identificadores ",
                " para construir uma tabela de s??mbolos uniforme ",
                " para analisar o programa de origem nos elementos b??sicos ou tokens da linguagem. ",
                " para reconhecer as principais constru????es da linguagem e chamar as" +
                        " rotinas de a????o apropriadas que ir??o gerar a forma ou matriz " +
                        "intermedi??ria para essas constru????es. ",
                " I ");
        this.addQuestionOS (q90);

        QuestionOS q91 = new QuestionOS (
                "Troca",
                "funciona melhor com muitas parti????es pequenas",
                "permite que muitos programas usem mem??ria simultaneamente",
                "permite que cada programa por sua vez use a mem??ria",
                "n??o funciona com sobreposi????o33",
                " permite que cada programa, por sua vez, use a mem??ria ",
                " I ");
        this.addQuestionOS (q91);

        QuestionOS q92 = new QuestionOS (
                "Um algoritmo de escalonamento de disco em um sistema " +
                        "operacional faz com que o bra??o do disco se mova para frente " +
                        "e para tr??s pela superf??cie do disco para atender a todas as " +
                        "solicita????es em seu caminho. Este ?? um",
                "Primeiro a chegar, primeiro servido",
                "Shortest Seek Time First (SSTE)",
                "Scan", "FIFO",
                "Scan",
                "I");
        this.addQuestionOS (q92);

        QuestionOS q93 = new QuestionOS (
                "Um tradutor ?? melhor descrito como",
                "um software de aplicativo",
                "um software de sistema",
                "um componente de hardware",
                "todos os anteriores",
                "um software de sistema",
                "I") ;
        this.addQuestionOS (q93);

        QuestionOS q94 = new QuestionOS (
                "Criptografia de dados",
                "?? usado principalmente por redes p??blicas",
                "?? usado principalmente por redes financeiras",
                "n??o pode ser usado por instala????es privadas",
                "n??o ?? necess??rio, uma vez que os dados n??o podem ser interceptados",
                "?? usado principalmente por redes financeiras",
                "I");
        this.addQuestionOS (q94);

        QuestionOS q95 = new QuestionOS (
                "Qual ?? o nome dado ao processo de inicializa????o de " +
                        "um microcomputador com seu sistema operacional?",
                "Inicializa????o a frio",
                "Inicializa????o",
                "Inicializa????o a quente",
                "Grava????o de inicializa????o",
                "Inicializa????o",
                " EU");
        this.addQuestionOS (q95);

        QuestionOS q96 = new QuestionOS (
                "A (s) fun????o (??es) da Atribui????o de Armazenamento ?? (s??o)",
                "para atribuir armazenamento a todas as vari??veis ??????referenciadas " +
                        "no programa de origem.",
                "Para atribuir armazenamento a todos os locais tempor??rios que" +
                        " s??o necess??rios para intermedi??rios resultados ",
                " para atribuir armazenamento a literais e para garantir que o " +
                        "armazenamento seja alocado e os locais apropriados sejam inicializados. ",
                " todos os anteriores ",
                " todos os anteriores ",
                " I ");
        this.addQuestionOS (q96);

        QuestionOS q97 = new QuestionOS (
                "Um Processador",
                "?? um dispositivo que executa uma sequ??ncia de opera????es especificadas " +
                        "por instru????es na mem??ria.",
                "?? o dispositivo onde as informa????es s??o armazenadas",
                "?? uma sequ??ncia de instru????es",
                "?? tipicamente caracterizado por processamento interativo e tempo de " +
                        "tempo da CPU para permitir resposta r??pida a cada usu??rio ",
                " ?? um dispositivo que realiza uma seq????ncia de opera????es " +
                        "especificadas por instru????es em mem??ria ",
                " I ");
        this.addQuestionOS (q97);

        QuestionOS q98 = new QuestionOS (
                "Com o MS-DOS, qual comando dividir?? a superf??cie do " +
                        "disquete vazio em setores e atribuir?? um endere??o ??nico a cada um?",
                "Comando FORMAT",
                "Comando FAT",
                "Comando VER",
                "Comando CHKDSK",
                "comando FORMAT",
                "I");
        this.addQuestionOS (q98);

        QuestionOS q99 = new QuestionOS (
                "Multiprograma????o",
                "?? um m??todo de aloca????o de mem??ria pelo qual o programa " +
                        "?? subdividido em partes iguais, ou as p??ginas e o n??cleo" +
                        " s??o subdivididos em partes iguais ou blocos.",
                "Consiste nos endere??os que podem ser gerados por um " +
                        "processador durante a execu????o de um c??lculo ",
                " ?? um m??todo de aloca????o de tempo do processador. ",
                " permite que v??rios programas residam em ??reas " +
                        "separadas do n??cleo no momento ",
                " permite que v??rios programas residam em ??reas separadas do n??cleo no tempo ",
                " I ");
        this.addQuestionOS (q99);

        QuestionOS q100 = new QuestionOS (
                "Um tradutor que l?? um programa inteiro escrito em uma " +
                        "linguagem de alto n??vel e o converte em c??digo de linguagem " +
                        "de m??quina ??:",
                "assembler", "tradutor", "compilador", "software do sistema",
                "compilador ",
                "EU");
        this.addQuestionOS (q100);

        QuestionOS q101 = new QuestionOS (
                "Se a data e hora do sistema exibida estiverem incorretos, voc?? " +
                        "pode redefini-los usando",
                "Escrever", "Calend??rio", "Painel de controle", "Centro de a????o",
                "Painel de controle",
                "E" );
        this.addQuestionOS (q101);

        QuestionOS q102 = new QuestionOS (
                "Voc?? deve salvar seu computador de",
                "v??rus", "worms", "malwares", "todos os anteriores",
                "todos os anteriores",
                "E");
        this.addQuestionOS (q102);

        QuestionOS q103 = new QuestionOS (
                "World Wide Web est?? sendo padronizado por",
                "Worldwide INC", "W3C", "World Wide Consortium", "World Wide Web Standard",
                "W3C",
                "E");
        this.addQuestionOS (q103);

        QuestionOS q104 = new QuestionOS (
                "Qual dos seguintes ?? um grupo de programa?",
                "Acess??rios", "MS WORD", "Paint", "SharePoint",
                "Acess??rios",
                "E");
        this.addQuestionOS (q104);

        QuestionOS q105 = new QuestionOS (
                "Qual sistema operacional n??o suporta mais de um programa por vez?",
                "DOS", "Linux", "Windows", "Unix",
                "DOS",
                "E");
        this.addQuestionOS (q105);

        QuestionOS q106 = new QuestionOS (
                "Linus ??",
                "C??digo aberto", "Windows", "caro", "MAC",
                "C??digo aberto",
                "E");
        this.addQuestionOS (q106);

        QuestionOS q107 = new QuestionOS (
                "Qual deles n??o ?? um SO",
                "P11", "OS / 2", "Windows", "Unix",
                "P11",
                "E");
        this.addQuestionOS (q107);

        QuestionOS q108 = new QuestionOS (
                "Qual deles n??o ?? um sistema operacional multitarefa",
                "Windows", "Linux", "Win NT", "DOS",
                "DOS",
                "E");
        this.addQuestionOS (q108);

        QuestionOS q109 = new QuestionOS (
                "Uma interface de usu??rio f??cil de usar ??",
                "f??cil de usar", "amig??vel", "simples de usar", "nenhum desses",
                "amig??vel",
                "E");
        this.addQuestionOS (q109);

        QuestionOS q110 = new QuestionOS (
                "Qual ?? a fun????o do bot??o de r??dio?",
                "Para selecionar v??rias op????es",
                "Para selecionar uma op????o",
                "Para selecionar todas as op????es",
                "Todas as op????es acima",
                "Para selecionar uma ??nica op????o" ,
                "E");
        this.addQuestionOS (q110);

        QuestionOS q111 = new QuestionOS (
                "Qual comando ?? usado para exibir o conte??do do arquivo de texto no DOS?",
                "Copiar con", "copiar", "tipo", "dir",
                "tipo",
                "E");
        this.addQuestionOS (q111);

        QuestionOS q112 = new QuestionOS (
                "Arquivo essencial do disco de inicializa????o do MSDOS ??:",
                "COMMAND.COM", "START.COM", "TREE.COM", "VER.COM",
                "COMMAND.COM",
                "E" );
        this.addQuestionOS (q112);

        QuestionOS q113 = new QuestionOS (
                "Qual comando ?? usado para ver a vers??o do SO?",
                "Vol", "vers??o", "ver", "volume",
                "ver",
                "E");
        this.addQuestionOS (q113);

        QuestionOS q114 = new QuestionOS (
                "Quais dos seguintes s??o carregados no modo de seguran??a?",
                "Driver do teclado", "Driver do mouse", "Driver VGA", "Todos",
                "Todos",
                "E");
        this.addQuestionOS (q114);

        QuestionOS q115 = new QuestionOS (
                "O aloritmo dos banqueiros ?? usado para",
                "retificar deadlock",
                "detectar deadlock",
                "prevenir deadlock",
                "retardar deadlock",
                "prevenir deadlock",
                "E");
        this.addQuestionOS (q115);

        QuestionOS q116 = new QuestionOS (
                "Qual das seguintes op????es ?? uma lista suspensa?",
                "Lista", "Caixa de combina????o", "??rea de texto", "Nenhum",
                "Caixa de combina????o",
                "E");
        this.addQuestionOS (q116);

        QuestionOS q117 = new QuestionOS (
                "Uma falha de p??gina ocorre quando",
                "o impasse acontece",
                "a segmenta????o come??a",
                "a p??gina ?? encontrada na mem??ria",
                "a p??gina n??o ?? encontrada na mem??ria",
                "a p??gina n??o ?? encontrado na mem??ria ",
                " E ");
        this.addQuestionOS (q117);

        QuestionOS q118 = new QuestionOS (
                "Barra de tarefas ?? usada para",
                "Navega????o",
                "Alternar programas",
                "Iniciar um programa",
                "Todos os anteriores",
                "Todos os anteriores",
                "E");
        this.addQuestionOS (q118);

        QuestionOS q119 = new QuestionOS (
                "O que ?? Dr.Watson?",
                "Especialista em TI",
                "Ferramenta de diagn??stico",
                "Cirurgi??o",
                "Nenhum",
                "Especialista em TI",
                "E");
        this.addQuestionOS (q119);

        QuestionOS q120 = new QuestionOS (
                "O comando usado para criar unidade l??gica para localiza????o espec??fica do disco",
                "FDisk", "Formato", "Subst", "Todos os anteriores",
                "Subst",
                "E");
        this.addQuestionOS (q120);

        QuestionOS q121 = new QuestionOS (
                "Executar v??rios programas ao mesmo tempo ?? chamado",
                "Multitarefa",
                "Tarefas em segundo plano",
                "Tarefas em primeiro plano",
                "Nenhuma das anteriores",
                "Multitarefa",
                "E");
        this.addQuestionOS (q121);

        QuestionOS q122 = new QuestionOS (
                "Roubo de p??gina",
                "?? um sinal de um sistema eficiente",
                "Est?? tirando quadro de p??gina de outros conjuntos de trabalho",
                "Deve ser a meta de giro",
                "Est?? ocupando espa??o em disco de camada para p??gina na p??gina out ",
                " est?? tirando quadro de p??gina de outros conjuntos de trabalho ",
                " E ");
        this.addQuestionOS (q122);

        QuestionOS q123 = new QuestionOS (
                "O que voc?? quer dizer com caixa de di??logo?",
                "Caixa de mensagem interativa",
                "Grupo de op????es",
                "Conjunto de controles",
                "Todas as op????es acima",
                "Todas as op????es acima",
                " E ");
        this.addQuestionOS (q123);

        QuestionOS q124 = new QuestionOS (
                "Conex??o discada permite",
                "Conectar ISP", "Internet", "Servidor", "Todos os itens acima",
                "Conectar ISP",
                "E");
        this.addQuestionOS (q124);

        QuestionOS q125 = new QuestionOS (
                "O que n??o ?? uma ferramenta de sistema?",
                "Pasta", "Backup", "Scandisk", "Formato",
                "Pasta",
                "E");
        this.addQuestionOS (q125);

        QuestionOS q126 = new QuestionOS (
                "Scandisk", "Verifica o disco",
                "Fornece informa????es sobre o disco",
                "Executar no modo DOS",
                "Todas as op????es anteriores",
                "Todas as op????es anteriores",
                "E");
        this.addQuestionOS (q126);

        QuestionOS q127 = new QuestionOS (
                "Arquivo em lote ?? usado para",
                "Executar programa",
                "Mostrar o conte??do",
                "executar comandos automaticamente",
                "Todos os itens acima",
                "Todos os itens acima",
                "E");
        this.addQuestionOS (q127);

        QuestionOS q128 = new QuestionOS (
                "Qual dos seguintes n??o ?? estados de processo?",
                "Novo", "Pronto", "Executando", "Conclu??do",
                "Conclu??do",
                "E");
        this.addQuestionOS (q128);

        QuestionOS q129 = new QuestionOS (
                "Podemos iniciar o aplicativo?",
                "Logoff", "Local de rede", "Lixeira", "Executar",
                "Executar",
                "E");
        this.addQuestionOS (q129);

        QuestionOS q130 = new QuestionOS (
                "O que voc?? digita no prompt de comando do DOS para retornar ao Windows?",
                "Comando", "Sair", "Sair", "Retornar",
                "Sair",
                "E");
        this.addQuestionOS (q130);

        QuestionOS q131 = new QuestionOS (
                "Qual das alternativas a seguir faz parte do sistema operacional?",
                "C??lula", "FAT", "Kernel", "Disco",
                "Kernel",
                "E");
        this.addQuestionOS (q131);

        QuestionOS q132 = new QuestionOS (
                "Dormir ?? um bom modo de usar porque",
                "Ele economiza energia, o que por sua vez est?? economizando dinheiro",
                "Ele renova o computador depois de acordar",
                "Consome bateria fraca ao reinici??-lo ",
                " Todas as op????es anteriores ",
                " Economiza energia que por sua vez est?? economizando dinheiro ",
                " E ");
        this.addQuestionOS (q132);

        QuestionOS q133 = new QuestionOS (
                "O recurso operacional que integra o arquivo criado em diferentes " +
                        "aplicativos em p??ginas da Web",
                "Integra????o da Web",
                "Integra????o da Internet",
                "Integra????o da intranet",
                "Integra????o de hipertexto",
                "Integra????o da Web",
                "E" );
        this.addQuestionOS (q133);

        QuestionOS q134 = new QuestionOS (
                "Qual buraco ser?? alocado no algoritmo Worst-Fit de gerenciamento de mem??ria?",
                "Aloca o buraco menor do que o buraco de mem??ria necess??rio",
                "Aloca o menor buraco dos buracos de mem??ria dispon??veis",
                "Aloca o maior buraco dos buracos de mem??ria dispon??veis ",
                " Aloca exatamente o mesmo tamanho do buraco de mem??ria ",
                " Aloca o maior buraco dos buracos de mem??ria dispon??veis ",
                " E ");
        this.addQuestionOS (q134);

        QuestionOS q135 = new QuestionOS (
                "BIOS ?? usado por",
                "Sistema operacional",
                "Compilador",
                "Int??rprete",
                "Software aplicativo",
                "Sistema operacional",
                "E");
        this.addQuestionOS (q135);

        QuestionOS q136 = new QuestionOS (
                "Normalmente a rede de rede ?? chamada",
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
                "Qual dos seguintes ?? o m??todo de aloca????o de um espa??o em disco?",
                "Aloca????o cont??gua",
                "Aloca????o vinculada",
                "Aloca????o indexada",
                "Todas as op????es acima",
                "Todas as acima" , "E");
        this.addQuestionOS (q138);

        QuestionOS q139 = new QuestionOS (
                "Quando voc?? corta ou copia o texto ou imagem, ele ?? armazenado temporariamente em",
                "Arquivo", "??rea de Transfer??ncia", "??cone", "Todos os acima",
                "??rea de Transfer??ncia",
                "E") ;
        this.addQuestionOS (q139);

        QuestionOS q140 = new QuestionOS (
                "Um min??sculo ponto de luz no monitor ?? chamado",
                "Chip de sil??cio", "Ilus??o de ??tica", "??cone", "Pixel",
                "Pixel",
                "E");
        this.addQuestionOS (q140);

        QuestionOS q141 = new QuestionOS (
                "Quem ?? chamado de supervisor da atividade do computador?",
                "Mem??ria",
                "Sistema operacional",
                "Dispositivos de E / S",
                "Unidade de controle",
                "Sistema operacional",
                "E");
        this.addQuestionOS (q141);

        QuestionOS q142 = new QuestionOS (
                "Sistema operacional gerencia",
                "Mem??ria",
                "Processador",
                "Dispositivos de E / S",
                "Todos os anteriores",
                "Todos os anteriores",
                "E");
        this.addQuestionOS (q142);

        QuestionOS q143 = new QuestionOS (
                "Qual dos seguintes conceitos ?? o melhor para evitar falhas de p??gina?",
                "Paging",
                "The working set",
                "Hit ratios",
                "Address location resolution",
                "Paging",
                "E") ;
        this.addQuestionOS (q143);

        QuestionOS q144 = new QuestionOS (
                "Qual propriedade n??o ?? v??lida para configura????o de atributos?",
                "C", "S", "H", "R",
                "C",
                "E");
        this.addQuestionOS (q144);

        QuestionOS q145 = new QuestionOS (
                "Mem??ria virtual normalmente localizada em",
                "RAM", "CPU", "Flash Card", "Disco r??gido",
                "Disco r??gido",
                "E");
        this.addQuestionOS (q145);

        QuestionOS q146 = new QuestionOS (
                "Estrutura em ??rvore exibe",
                "Somente arquivo",
                "Somente diret??rio",
                "Nome do arquivo e diret??rio",
                "Nenhum dos anteriores",
                "Nome do arquivo e diret??rio",
                "E");
        this.addQuestionOS (q146);

        QuestionOS q147 = new QuestionOS (
                "Pressione a tecla ____ durante a inicializa????o para exibir o" +
                        " menu de inicializa????o avan??ada",
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
                "O que voc?? quer dizer com compacta????o de mem??ria?",
                "Combine v??rios buracos de mem??ria iguais em um grande buraco",
                "Combine v??rios pequenos buracos de mem??ria em um grande buraco",
                "Divida grande buraco de mem??ria em pequenos buracos" ,
                "Divida o buraco da mem??ria por 2",
                "Combine v??rios pequenos buracos da mem??ria em um grande buraco",
                "E");
        this.addQuestionOS (q149);

        QuestionOS q150 = new QuestionOS (
                "Copiar um processo da mem??ria para o disco para permitir " +
                        "espa??o para outros processos ?? chamado",
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
                "De que local as primeiras instru????es do computador est??o" +
                        " dispon??veis na inicializa????o?",
                "ROM BIOS", "CPU", "boot.ini", "CONFIG.SYS",
                "ROM BIOS",
                "B ");
        this.addQuestionHardware (q1);

        QuestionHardWare q2 = new QuestionHardWare (
                "O que poderia causar um erro de disco corrigido.",
                "Sem CD instalado",
                "RAM defeituosa",
                "processador lento",
                "Configura????es incorretas de CMOS",
                "Configura????es incorretas de CMOS",
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
                "Ao instalar PCI NICS voc?? pode verificar a disponibilidade de IRQ olhando em",
                "dip switches",
                "CONFIG.SYS",
                "jumper settings",
                "motherboard BIOS",
                "motherboard BIOS",
                "B ");
        this.addQuestionHardware (q4);

        QuestionHardWare q5 = new QuestionHardWare (
                "Com rela????o a uma placa de interface de rede, o termo 10/100 se refere a",
                "velocidade de protocolo",
                "velocidade de fibra",
                "megabits por segundo",
                "velocidade m??nima e m??xima do servidor",
                " megabits por segundos ",
                " B ");
        this.addQuestionHardware (q5);

        QuestionHardWare q6 = new QuestionHardWare (
                "Qual formato da placa-m??e usa um conector de 20 pinos",
                "ATX", "Todas as op????es anteriores", "BABY AT", "AT",
                "ATX",
                "B");
        this.addQuestionHardware (q6);

        QuestionHardWare q7 = new QuestionHardWare (
                "Um disco r??gido ?? dividido em trilhas que s??o subdivididas em:",
                "clusters", "setores", "vetores", "cabe??as",
                "setores",
                "B");
        this.addQuestionHardware (q7);

        QuestionHardWare q8 = new QuestionHardWare (
                "Uma pulseira de aterramento cont??m qual dos seguintes:",
                "Protetor de sobretens??o", "Capacitor", "Volt??metro", "Resistor",
                "Resistor",
                "B");
        this.addQuestionHardware (q8);

        QuestionHardWare q9 = new QuestionHardWare (
                "Qual padr??o rege as comunica????es paralelas?",
                "RS232", "RS-232a", "CAT 5", "IEEE 1284",
                "IEEE 1284",
                "B");
        this.addQuestionHardware (q9);

        QuestionHardWare q10 = new QuestionHardWare (
                "Na tecnologia de impressora a laser, o que acontece durante " +
                        "o est??gio de condicionamento?",
                "O fio corona coloca uma carga positiva uniforme no papel",
                "Uma carga negativa uniforme ?? colocada no tambor fotossens??vel",
                "A carga negativa uniforme ?? colocada no toner ",
                " Todas as anteriores ",
                " Uma carga negativa uniforme ?? colocada no tambor fotossens??vel ",
                " B ");
        this.addQuestionHardware (q10);

        QuestionHardWare q11 = new QuestionHardWare (
                "Qual produto ?? usado para limpar teclas manchadas em um teclado?",
                "Solvente TMC",
                "Spray de silicone",
                "??lcool desnaturado",
                "Limpador multiuso",
                "Limpador multiuso",
                "B");
        this.addQuestionHardware (q11);

        QuestionHardWare q12 = new QuestionHardWare (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimenta????o",
                "Placa de expans??o",
                "Monitor", "Teclado",
                "Placa de expans??o",
                "B");
        this.addQuestionHardware (q12);

        QuestionHardWare q13 = new QuestionHardWare (
                "Para visualizar qualquer programa Terminate Stay Resident" +
                        " (TSR) em execu????o, voc?? pode digitar:",
                "Memory", "MEM", "Memmaker", "SYS / M",
                "MEM",
                "B" );
        this.addQuestionHardware (q13);

        QuestionHardWare q14 = new QuestionHardWare (
                "Que tipo de placa de sistema ?? o candidato MAIS prov??vel" +
                        " para atualiza????o de processador se voc?? deseja desempenho " +
                        "m??ximo e compatibilidade futura?",
                "ML", "PCI", "EISA", "ISA",
                "PCI"
                , "B");
        this.addQuestionHardware (q14);

        QuestionHardWare q15 = new QuestionHardWare (
                "Qual porta perif??rica fornece a taxa de transfer??ncia MAIS R??PIDA " +
                        "para impressoras a laser?",
                "RS-232", "SCSI", "Paralela", "Serial",
                "Paralela",
                "B");
        this.addQuestionHardware (q15);

        QuestionHardWare q16 = new QuestionHardWare (
                "O ponteiro do mouse se move erraticamente, qual ?? a poss??vel causa? O mouse",
                "a bola est?? suja",
                "n??o est?? conectada",
                "o driver n??o est?? instalado corretamente",
                "tem uma configura????o de IRQ incorreta" ,
                "bola ?? sujeira",
                "B");
        this.addQuestionHardware (q16);

        QuestionHardWare q17 = new QuestionHardWare (
                "A tens??o ?? medida:",
                "em paralelo",
                "em s??rie",
                "ap??s interromper o circuito",
                "ap??s verificar a resist??ncia",
                "em paralelo",
                "B");
        this.addQuestionHardware (q17);

        QuestionHardWare q18 = new QuestionHardWare (
                "Seu cliente informa que a qualidade de impress??o de sua impressora " +
                        "matricial ?? clara e depois escura. Qual das alternativas a seguir pode " +
                        "causar o problema.",
                "Deslizamento do papel",
                "Avan??o impr??prio da fita",
                "Espessura do papel" ,
                "Posi????o da cabe??a",
                "Avan??o impr??prio da fita",
                "B");
        this.addQuestionHardware (q18);

        QuestionHardWare q19 = new QuestionHardWare (
                "A conex??o de 34 pinos em uma placa de E / S ?? para?",
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
                "No barramento ISA de 16 bits, IRQ2 ?? elevado a qual n??vel " +
                        "superior de interrup????o?",
                "9", "11", "13", "15",
                "9",
                "B") ;
        this.addQuestionHardware (q21);

        QuestionHardWare q22 = new QuestionHardWare (
                "Para visualizar qualquer programa Terminate Stay Resident (TSR) " +
                        "em execu????o, voc?? pode digitar:",
                "Memory", "MEM", "SYS / M", "Memmaker",
                "MEM",
                "B" );
        this.addQuestionHardware (q22);

        QuestionHardWare q23 = new QuestionHardWare (
                "Qual parte da impressora a laser N??O deve ser exposta ?? luz solar?",
                "Conjunto de corona de transfer??ncia",
                "Tambor de PC",
                "Fio de corona prim??rio",
                "Fio de corona prim??rio de tambor de PC",
                "Tambor de PC" ,
                "B");
        this.addQuestionHardware (q23);

        QuestionHardWare q24 = new QuestionHardWare (
                "Depois de fazer uma formata????o de baixo n??vel, qual seria a " +
                        "pr??xima etapa na configura????o do disco r??gido em um sistema?",
                "Formatar parti????o DOS",
                "Instalar sistema operacional",
                "Configurar canal DMA e voltar -up interrup????o ",
                " Parti????o com disco ",
                " Formatar parti????o DOS ",
                " B ");
        this.addQuestionHardware (q24);

        QuestionHardWare q25 = new QuestionHardWare (
                "A resist??ncia ?? medida em?",
                "Volts", "Amps", "Watts", "Ohms",
                "Ohms",
                "B");
        this.addQuestionHardware (q25);

        QuestionHardWare q26 = new QuestionHardWare (
                "Que comando ?? usado para redefinir um MODEM ao usar o Conjunto de comandos AT?",
                "ATR", "ATZ", "DTR", "DCE",
                "ATZ",
                "B");
        this.addQuestionHardware (q26);

        QuestionHardWare q27 = new QuestionHardWare (
                "Ao instalar uma unidade de CD-ROM SCSI, voc?? deve definir o " +
                        "adaptador de CD-ROM SCSI para:",
                "B0007",
                "Um endere??o SCSI n??o utilizado",
                "O mesmo endere??o do dispositivo SCSI antes do CD-ROM ",
                " SCSI ID = 1 ",
                " Um endere??o SCSI n??o utilizado ",
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
                "Na tecnologia de jato de tinta, as gotas de tinta s??o desviadas por?",
                "Bicos multidirecionais",
                "placas eletronicamente carregadas",
                "placas de alta press??o",
                "absor????o eletrost??tica",
                "bicos multidirecionais",
                " B ");
        this.addQuestionHardware (q29);

        QuestionHardWare q30 = new QuestionHardWare (
                "Qual ferramenta ?? usada para testar portas seriais e paralelas?",
                "Sonda de alta voltagem",
                "scanner de cabo",
                "loop backs (plugues envolventes)",
                "sniffer",
                "loop backs (plugues envolventes )) ",
                " B ");
        this.addQuestionHardware (q30);

        QuestionHardWare q31 = new QuestionHardWare (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimenta????o",
                "Placa de expans??o",
                "Monitor",
                "Teclado",
                "Placa de expans??o",
                "B");
        this.addQuestionHardware (q31);

        QuestionHardWare q32 = new QuestionHardWare (
                "Qual ?? o maior n??mero bin??rio que pode ser referido em um bloco de" +
                        " jumpers de tr??s posi????es?",
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
                "Uma verifica????o de c??digo de erro num??rico: A 17xx indica um problema com:",
                "CMOS",
                "ROM BIOS",
                "controlador DMA",
                "disco r??gido ou controlador",
                "disco r??gido ou controlador",
                "B");
        this.addQuestionHardware (q34);

        QuestionHardWare q35 = new QuestionHardWare (
                "Qual fornece o acesso mais r??pido a grandes arquivos de v??deo?",
                "Unidades ??pticas",
                "Discos r??gidos IDE",
                "Discos r??gidos SCSI",
                "Discos r??gidos EIDE",
                "Discos r??gidos SCSI",
                "B ");
        this.addQuestionHardware (q35);

        QuestionHardWare q36 = new QuestionHardWare (
                "Um conector f??mea de 25 pinos na parte traseira do seu " +
                        "computador normalmente ser??:",
                "Porta serial 1", "Uma porta paralela", "Docking", "porta COM2",
                "Uma porta paralela ",
                " B ");
        this.addQuestionHardware (q36);

        QuestionHardWare q37 = new QuestionHardWare (
                "Voc?? estava instalando um aplicativo no Windows 95 e" +
                        " o computador trava, o que voc?? faz?",
                "Pressione alt + Ctrl + delete, duas vezes",
                "pressione alt + Ctrl + delete e finalize a tarefa ",
                " pressione o bot??o reset no computador ",
                " desligue o computador e inicialize por um disquete ",
                " desligue o computador e inicialize por um disquete ",
                " B ");
        this.addQuestionHardware (q37);

        QuestionHardWare q38 = new QuestionHardWare (
                "RS-232 ?? um padr??o que se aplica a:",
                "portas seriais",
                "portas paralelas",
                "portas de jogos",
                "redes",
                "portas seriais",
                "B");
        this.addQuestionHardware (q38);

        QuestionHardWare q39 = new QuestionHardWare (
                "Voc?? acabou de instalar um novo disco r??gido IDE," +
                        " mas o BIOS do sistema n??o reconhece a nova unidade, " +
                        "o que voc?? deve verificar primeiro.",
                "Sequ??ncia de cabos",
                "jumpers no disco r??gido",
                "drivers que precisam ser carregados ",
                " informa????es do site do fabricante do disco r??gido ",
                " drivers que precisam ser carregados ",
                " B ");
        this.addQuestionHardware (q39);

        QuestionHardWare q40 = new QuestionHardWare (
                "Durante a inicializa????o, o teste de mem??ria:",
                "?? uma etapa sup??rflua que deve ser ignorada",
                "Verifica e verifica se a mem??ria cont??gua est?? instalada",
                "?? um erro operacional",
                "Exibe o que a mem??ria est?? instalada, mas nada mais ",
                " Verifica e verifica se a mem??ria cont??gua est?? instalada ",
                " B ");
        this.addQuestionHardware (q40);

        QuestionHardWare q41 = new QuestionHardWare (
                "Qual ?? o melhor aterramento para uma bancada de trabalho condutiva?",
                "Tomada CA",
                "Terra para dobrar",
                "Para outro dispositivo",
                "Aterramento do chassi",
                "Tomada CA",
                "B" );
        this.addQuestionHardware (q41);

        QuestionHardWare q42 = new QuestionHardWare (
                "Topicamente, quantas placas PC tipo III voc?? pode inserir em um laptop",
                "1", "2", "3", "4",
                "1",
                "B");
        this.addQuestionHardware (q42);

        QuestionHardWare q43 = new QuestionHardWare (
                "Qual ?? a primeira coisa que voc?? pode fazer para verificar " +
                        "se h?? danos em uma impressora ap??s receb??-la?",
                "Executar diagn??sticos MSD",
                "Conectar a um PC e imprimir algo",
                "Verificar os cabos" ,
                "Retire da caixa e examine-o quanto a danos f??sicos",
                "Retire da caixa e examine-o quanto a danos f??sicos",
                "B");
        this.addQuestionHardware (q43);

        QuestionHardWare q44 = new QuestionHardWare (
                "Voc?? tem um sistema que trava periodicamente. " +
                        "Voc?? descartou software e agora suspeita que seja hardware. " +
                        "O que voc?? deve fazer primeiro para ajud??-lo a restringir " +
                        "o componente com falha?",
                "girar a RAM",
                "substituir a RAM",
                "substituir o cache SIMM n??vel 2",
                "desativar o cache da CPU no CMOS",
                "desativar o cache da CPU no CMOS",
                "B");
        this.addQuestionHardware (q44);

        QuestionHardWare q45 = new QuestionHardWare (
                "Qual ?? a melhor maneira de proteger os dados do seu disco r??gido?",
                "Backups regulares",
                "desfragment??-los periodicamente",
                "executar chkdsk pelo menos uma vez por semana",
                "executar scandisk pelo menos uma vez por semana" ,
                "backups regulares",
                "B");
        this.addQuestionHardware (q45);

        QuestionHardWare q46 = new QuestionHardWare (
                "Em uma impressora matricial, voc?? nunca deve lubrificar qual parte?",
                "Trilhos do carro",
                "pinos do cabe??ote de impress??o",
                "rolamentos de avan??o do papel",
                "rolamentos do carro",
                "pinos do cabe??ote de impress??o",
                "B ");
        this.addQuestionHardware (q46);

        QuestionHardWare q47 = new QuestionHardWare (
                "Quantos dispositivos podem ser usados ??????em um ??nico " +
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
                "Corresponder o driver de dispositivo HIMEM.SYS ?? sua opera????o.",
                "Suporta emula????o de terminal (ANSI)",
                "Gerencia o uso de mem??ria estendida",
                "Usa mem??ria expandida em um processador 80386",
                "Suporta troca de p??gina de c??digo ",
                " Gerencia o uso de mem??ria estendida ",
                " B ");
        this.addQuestionHardware (q48);

        QuestionHardWare q49 = new QuestionHardWare (
                "_____ ajuda a prevenir picos de energia.",
                "Supressor de picos",
                "Protetor de picos",
                "Sistema UPS",
                "Mult??metro de alta qualidade",
                "Supressor de picos",
                "B");
        this.addQuestionHardware (q49);

        QuestionHardWare q50 = new QuestionHardWare (
                "O mult??metro digital est?? configurado para DC, Ohm e 20k." +
                        " Voc?? ler?? _____ enquanto mede um bom fus??vel de 2 A.",
                "0,00", "0,02", "0,20", "2,00",
                " 0,00 ",
                " B ");
        this.addQuestionHardware (q50);

        QuestionHardWare q51 = new QuestionHardWare (
                "Uma pulseira antiest??tica usa um pequeno _____ " +
                        "para garantir que voc?? n??o se torne o menor caminho de resist??ncia para o solo?",
                "Capacitor", "diodo", "transistor", "resistor",
                " resistor ",
                " E ");
        this.addQuestionHardware (q51);

        QuestionHardWare q52 = new QuestionHardWare (
                "Se os slots de mem??ria tiverem 30 pinos, o chip ?? um?",
                "DIMM", "SIMM", "SDRAM", "Todos os anteriores",
                "SIMM",
                "E");
        this.addQuestionHardware (q52);

        QuestionHardWare q53 = new QuestionHardWare (
                "As velocidades da impressora Laser Jet s??o medidas em " +
                        "p??ginas por minuto (ppm) o que usamos para medir impressoras matriciais?",
                "Linhas por polegada",
                "linhas por folha",
                "caracteres por polegada" ,
                "caracteres por segundo",
                "caracteres por segundo",
                "E");
        this.addQuestionHardware (q53);

        QuestionHardWare q54 = new QuestionHardWare (
                "Quais valores s??o mantidos no CMOS para o disco r??gido",
                "tamanho (cabe??as, cilindros, setores)",
                "IRQ", "Espa??o livre", "Alerta de v??rus",
                "tamanho (cabe??as, cilindros , setores) ",
                " E ");
        this.addQuestionHardware (q54);

        QuestionHardWare q55 = new QuestionHardWare (
                "Qual das alternativas a seguir seria uma primeira " +
                        "etapa l??gica na solu????o de problemas de um PC?",
                "Verifique o CMOS do computador",
                "Defina as circunst??ncias do problema",
                "Ligue para o fornecedor",
                "Defina quais aplicativos est??o sendo usados ??????",
                " Definir as circunst??ncias do problema ",
                " E ");
        this.addQuestionHardware (q55);

        QuestionHardWare q56 = new QuestionHardWare (
                "Qual driver DOS ?? usado para emular mem??ria expandida?",
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
                "Qual componente deve ser aspirado ou substitu??do " +
                        "durante a manuten????o preventiva em uma impressora a laser?",
                "Espelho de digitaliza????o",
                "Cartucho de toner",
                "Filtro de oz??nio",
                "Todos os anteriores",
                "Filtro de oz??nio" ,
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
                "Quando ?? o maior risco de descarga eletrost??tica?",
                "Hor??rio diurno",
                "Umidade alta",
                "Umidade baixa",
                "Hor??rio noturno",
                "Umidade baixa",
                "E");
        this.addQuestionHardware (q60);

        QuestionHardWare q61 = new QuestionHardWare (
                "Um modem pode ser conectado a qual porta?",
                "Porta paralela",
                "Porta ASYNC",
                "Conector de teclado",
                "Porta de v??deo",
                "Porta paralela",
                "E");
        this.addQuestionHardware (q61);

        QuestionHardWare q62 = new QuestionHardWare(
                "Qual dispositivo evita interrup????es de energia, " +
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
                "Em um computador com um adaptador eide, onde voc?? deve conectar " +
                        "uma unidade de CD-ROM ATA?",
                "No barramento de disquete",
                "no IDE prim??rio",
                "no IDE secund??rio",
                " no barramento SCSI ",
                " no IDE secund??rio ",
                " E ");
        this.addQuestionHardware (q64);

        QuestionHardWare q65 = new QuestionHardWare (
                "Qual ?? o maior n??mero bin??rio que pode ser referido em um bloco " +
                        "de jumpers de tr??s posi????es?",
                "4", "6", "5", "1",
                "1",
                "E" );
        this.addQuestionHardware (q65);

        QuestionHardWare q66 = new QuestionHardWare (
                "Durante a inicializa????o, o teste de mem??ria:",
                "?? uma etapa sup??rflua que deve ser ignorada",
                "Verifica e verifica se a mem??ria cont??gua est?? instalada",
                "?? um erro operacional",
                "Exibe o que a mem??ria est?? instalada, mas nada mais ",
                " Verifica e verifica se a mem??ria cont??gua est?? instalada ",
                " E ");
        this.addQuestionHardware (q66);

        QuestionHardWare q67 = new QuestionHardWare (
                "IRQ6 ?? normalmente reservado para:",
                "O disquete",
                "O controlador do teclado",
                "LPT2",
                "O modem",
                "O disquete",
                "E");
        this.addQuestionHardware (q67);

        QuestionHardWare q68 = new QuestionHardWare (
                "O que voc?? faria primeiro ao solucionar problemas em um monitor com defeito?",
                "Verifique suas conex??es com o computador e a fonte de alimenta????o",
                "Use um medidor para verificar a continuidade do CRT e dos circuitos internos",
                "Desligue o monitor e, em seguida, ligue-o novamente para ver se isso corrige o problema ",
                " Desligue o computador e ligue-o novamente para ver se isso corrige o problema ",
                " Verifique suas conex??es com o computador e a fonte de alimenta????o ",
                " E ");
        this.addQuestionHardware (q68);

        QuestionHardWare q69 = new QuestionHardWare (
                "Para instalar uma segunda unidade IDE em um computador, voc?? deve:",
                "Definir o jumper mestre-escravo para escravo na segunda unidade",
                "Use o software de configura????o IDE para definir a nova unidade como escravo ",
                " Verifique se voc?? define a nova unidade como D: na configura????o do CMOS ",
                " Verifique se voc?? conecta a unidade ao conector na extremidade do cabo de fita ",
                " Defina o jumper mestre-escravo como escravo no segundo drive ",
                " E ");
        this.addQuestionHardware (q69);

        QuestionHardWare q70 = new QuestionHardWare (
                "Por que uma unidade de rede mapeada com sucesso desaparece " +
                        "toda vez que voc?? inicializa o computador?",
                "O computador ao qual voc?? est?? conectado mudou",
                "Voc?? n??o clicou em reconectar ao fazer logon",
                "O mapa a instru????o n??o est?? no arquivo autoexec.bat ",
                " A ??ltima unidade n??o foi configurada corretamente ",
                " A instru????o do mapa n??o est?? no arquivo autoexec.bat ",
                " E ");
        this.addQuestionHardware (q70);

        QuestionHardWare q71 = new QuestionHardWare (
                "O que voc?? precisa para verificar a porta serial e paralela?",
                "Adaptador de porta",
                "Sonda l??gica",
                "Plug de loopback",
                "Todos os anteriores",
                "Plug de loopback",
                "E" );
        this.addQuestionHardware (q71);

        QuestionHardWare q72 = new QuestionHardWare (
                "Voc?? tem um PC sem v??deo * Qual das alternativas a " +
                        "seguir tem MENOS probabilidade de estar causando o problema?",
                "RAM com defeito (banco zero)",
                "microprocessador com defeito",
                "disco r??gido travado",
                "placa de v??deo solta",
                "disco r??gido travado",
                "E");
        this.addQuestionHardware (q72);

        QuestionHardWare q73 = new QuestionHardWare (
                "Para testar a ondula????o CA em uma fonte de alimenta????o " +
                        "de PC, voc?? deve definir o volt / ohm??metro para:",
                "escala de tens??o CC",
                "tens??o CA",
                "escala OHM",
                "escala Farad" ,
                "Tens??o CA",
                "E");
        this.addQuestionHardware (q73);

        QuestionHardWare q74 = new QuestionHardWare (
                "Voc?? recebe um erro de checksum CMOS durante a inicializa????o. Qual ?? a causa mais prov??vel?",
                "Fonte de alimenta????o est?? ruim",
                "BIOS precisa ser atualizada",
                "Bateria CMOS est?? chegando ao fim",
                "dif??cil os tipos de unidade est??o definidos incorretamente ",
                " A bateria CMOS est?? quase no fim de sua vida ??til ",
                " E ");
        this.addQuestionHardware (q74);

        QuestionHardWare q75 = new QuestionHardWare (
                "No barramento ISA de 16 bits, IRQ2 ?? elevado a " +
                        "qual interrup????o de n??vel superior?",
                "9", "11", "13", "15",
                "9",
                "E") ;
        this.addQuestionHardware (q75);

        QuestionHardWare q76 = new QuestionHardWare (
                "Depois de tentar descarregar um TSR, voc?? recebe uma mensagem " +
                        "de erro dizendo que outros TSRs foram carregados depois daquele " +
                        "que voc?? tentou remover. Qual dos seguintes comandos voc?? poderia " +
                        "usar para ver a ordem de carregamento atual?",
                "MEM / P", "MEMMAKER", "MEM / C", "SYS:",
                "SYS:",
                "E");
        this.addQuestionHardware (q76);

        QuestionHardWare q77 = new QuestionHardWare (
                "Qual ?? a linguagem comum que os computadores usam para se comunicar em uma rede",
                "cliente", "adaptador", "protocolo", "sistemas operacionais",
                "protocolo",
                "E") ;
        this.addQuestionHardware (q77);

        QuestionHardWare q78 = new QuestionHardWare (
                "Qual driver DOS ?? usado para emular mem??ria expandida?",
                "Himem.sys", "EMM386.exe", "Mem386.sys", "Ramdrive.sys",
                "EMM386.exe",
                " E ");
        this.addQuestionHardware (q78);

        QuestionHardWare q79 = new QuestionHardWare (
                "Qual voc?? deve usar para limpar telas de LCD protegidas com Mylar?",
                "Limpador de janelas com am??nia",
                "Limpador n??o abrasivo",
                "Toalhetes antiest??ticos",
                "Toalhetes impregnados com ??lcool",
                "N??o - limpador abrasivo ",
                " E ");
        this.addQuestionHardware (q79);

        QuestionHardWare q80 = new QuestionHardWare (
                "O que poderia causar um erro de disco fixo?",
                "Sem CD instalado",
                "RAM inv??lida",
                "Processador lento",
                "Configura????es de CMOS incorretas",
                "Configura????es de CMOS incorretas",
                "E") ;
        this.addQuestionHardware (q80);

        QuestionHardWare q81 = new QuestionHardWare (
                "O potencial ESD diminui com o uso de:",
                "Ventiladores desionizantes",
                "Uma pulseira",
                "Luvas de borracha com tampa correspondente",
                "Um medidor est??tico",
                "Uma pulseira",
                "E");
        this.addQuestionHardware (q81);

        QuestionHardWare q82 = new QuestionHardWare (
                "Qual das seguintes FRUs seria considerada um dispositivo de entrada / sa??da?",
                "Placa de v??deo",
                "Adaptador host SCSI",
                "CPU da placa do sistema",
                "Todos os anteriores",
                "SCSI adaptador host ",
                " E ");
        this.addQuestionHardware (q82);

        QuestionHardWare q83 = new QuestionHardWare (
                "Uma porta COM ?? uma porta _____.",
                "Paralela", "serial", "est??tica", "multi",
                "serial",
                "E");
        this.addQuestionHardware (q83);

        QuestionHardWare q84 = new QuestionHardWare (
                "Qual dispositivo est?? no IRQ 6?",
                "Teclado", "IDE", "Unidade de disquete", "Placa de v??deo",
                "Unidade de disquete",
                "E");
        this.addQuestionHardware (q84);

        QuestionHardWare q85 = new QuestionHardWare (
                "Um sistema tem dois discos r??gidos IDE que s??o divididos em " +
                        "parti????es prim??rias e estendidas, qual letra de unidade ?? atribu??da" +
                        " ?? parti????o prim??ria da segunda unidade?",
                "C", "D", "E "," F ",
                " D ",
                " E ");
        this.addQuestionHardware (q85);

        QuestionHardWare q86 = new QuestionHardWare (
                "Qual ?? a diferen??a mais significativa entre os padr??es USB e IEEE1394?",
                "IEEE 1394 ?? mais r??pido",
                "USB n??o oferece suporte a USB",
                "USB ?? plug and play",
                "IEEE 1394 ?? quente troc??vel ",
                " IEEE 1394 ?? mais r??pido ",
                " E ");
        this.addQuestionHardware (q86);

        QuestionHardWare q87 = new QuestionHardWare (
                "Ao conectar dois discos r??gidos SCSI internos a um computador," +
                        " onde voc?? conecta o segundo disco r??gido?",
                "Qualquer porta SCSI aberta no computador",
                "Uma porta serial no primeiro adaptador host",
                "Uma porta paralela aberta no computador",
                "Uma porta SCSI aberta no primeiro disco r??gido",
                "Qualquer porta SCSI aberta no computador",
                "E");
        this.addQuestionHardware (q87);

        QuestionHardWare q88 = new QuestionHardWare (
                "Ao conectar um cabo de fita a um conector, " +
                        "como voc?? sabe em que dire????o conect??-lo?",
                "A linha vermelha no cabo vai para o n??mero de pino mais alto",
                "A linha colorida no o cabo vai para o pino # 1 ",
                " N??o importa ",
                " A linha azul ou vermelha no cabo vai para o conector de alimenta????o ",
                " A linha colorida no cabo vai para o pino # 1 ",
                " E ") ;
        this.addQuestionHardware (q88);

        QuestionHardWare q89 = new QuestionHardWare (
                "Qual ?? a primeira etapa para diagnosticar um computador " +
                        "completamente morto no site do cliente que estava funcionando no" +
                        " dia anterior.",
                "Teste a fonte de alimenta????o",
                "substitua a bateria CMOS",
                "verifique a tomada CA ",
                " recoloque o cabo do controlador do disco r??gido ",
                " verifique a tomada CA ",
                " E ");
        this.addQuestionHardware (q89);

        QuestionHardWare q90 = new QuestionHardWare (
                "Que especifica????o abrange placas de disco r??gido de PC?",
                "SCSI", "ISA", "PCMCIA", "MFM",
                "PCMCIA",
                "E");
        this.addQuestionHardware (q90);
        QuestionHardWare q91 = new QuestionHardWare (
                "Qual especifica????o de barramento comum fornece a taxa de" +
                        " transfer??ncia de dados mais r??pida?",
                "Barramento VL", "ISA", "PCI", "Todos os anteriores",
                "PCI",
                "E");
        this.addQuestionHardware (q91);

        QuestionHardWare q92 = new QuestionHardWare (
                "Modems usam transmiss??o.",
                "S??ncrono", "ass??ncrono", "intervalo cronometrado", "ata",
                "ass??ncrono",
                "E");
        this.addQuestionHardware (q92);

        QuestionHardWare q93 = new QuestionHardWare (
                "A 6xx indica um problema com:",
                "unidade de disquete", "disco r??gido", "teclado", "CD ROM",
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
                "Durante a manuten????o preventiva em uma impressora matricial, N??O lubrifique:",
                "Conjunto do cilindro",
                "Polia da cabe??a de impress??o",
                "Pinos da cabe??a de impress??o",
                "Buchas da engrenagem de avan??o do papel",
                "Pinos da cabe??a de impress??o ",
                " E ");
        this.addQuestionHardware (q95);

        QuestionHardWare q96 = new QuestionHardWare(
                "Voc?? v?? a mensagem \"invalid media device (dispositivo de m??dia inv??lido)\" " +
                        "depois de instalar um novo disco r??gido. O que voc?? faz em seguida?",
                "Format",
                "Fdisk",
                "Partition",
                "Add the OS",
                "Format",
                "E");
        this.addQuestionHardware(q96);

        QuestionHardWare q97 = new QuestionHardWare (
                "O que ?? o comando para desligar o modem?",
                "ATHU", "ATH", "ATZ", "ATX",
                "ATH",
                "E");
        this.addQuestionHardware (q97);

        QuestionHardWare q98 = new QuestionHardWare (
        "Quais tipos de expans??o a maioria das placas-m??e pll / plll suportam?",
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
                "Interromper a CPU para solicitar servi??o",
                "Passar dados para a CPU a serem processados",
                "Passar dados de uma placa para outra",
                "Passar dados para a mem??ria do computador ",
                " Interromper a CPU para solicitar servi??o ",
                " E ");
        this.addQuestionHardware (q100);

        QuestionHardWare q101 = new QuestionHardWare (
                "Qual ?? o IRQ padr??o para LPT1?",
                "2", "5", "7", "13",
                "7",
                "I");
        this.addQuestionHardware (q101);

        QuestionHardWare q102 = new QuestionHardWare (
                "Qual ?? a causa mais prov??vel de uma placa de som e uma " +
                        "impressora funcionando de forma intermitente?",
                "IRQs conflitantes.",
                "Configura????o incorreta de APM.",
                "Um cabo de impressora alterado.",
                "Um cabo incorreto de impressora. cart??o sentado. ",
                " IRQs conflitantes. ",
                " I ");
        this.addQuestionHardware (q102);

        QuestionHardWare q103 = new QuestionHardWare (
                "USB pode fornecer energia para todos os seguintes, exceto",
                "hub de 4 portas", "Teclado", "Mouse", "Disco r??gido externo",
                "hub de 4 portas",
                "I");
        this.addQuestionHardware (q103);

        QuestionHardWare q104 = new QuestionHardWare (
                "Qual ?? o IRQ padr??o para COM1?",
                "2", "3", "4", "5",
                "4",
                "I");
        this.addQuestionHardware (q104);

        QuestionHardWare q105= new QuestionHardWare(
                "Ao configurar placas de interface de rede ISA sem jumpers ou plug and" +
                        " play. O que ?? usado para definir IRQs?",
                "DMA.","COMS.","O sistema operacional","Software de configura????o",
                "Configuration software",
                "I");
        this.addQuestionHardware(q105);

        QuestionHardWare q106 = new QuestionHardWare (
                "Qual ?? o IRQ padr??o para o controlador da unidade de disquete?",
                "2", "3", "6", "9",
                "6",
                "I");
        this.addQuestionHardware (q106);

        QuestionHardWare q107 = new QuestionHardWare (
                "Qual interrup????o ?? reservada para o temporizador do sistema?",
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
                "O que voc?? precisa fazer ao substituir a placa-m??e em um computador port??til?",
                "Verifique se a placa ?? AT ou ATX.",
                "Corresponda exatamente o n??mero do fabricante e do modelo.",
                "Qualquer um a placa-m??e funcionar?? enquanto for especificada para um laptop. ",
                " Verifique se a placa ?? desse fabricante e se as placas s??o intercambi??veis. ",
                " Verifique se a placa ?? desse fabricante e se as placas s??o intercambi??veis. " ,
                "EU");
        this.addQuestionHardware (q109);

        QuestionHardWare q110 = new QuestionHardWare (
                "Voc?? instalou um novo modem com jumpers definidos para COM2 e IRQ3, " +
                        "mas o Windows n??o consegue detectar o modem. Qual ?? o problema?",
                "Sem tom de discagem",
                "Conflito de IRQ",
                "DMA overrun" ,
                "Velocidade da porta COM n??o definida para 256Kbps",
                "Conflito de IRQ",
                "I");
        this.addQuestionHardware (q110);

        QuestionHardWare q111 = new QuestionHardWare (
                "Qual interrup????o o rel??gio de tempo real usa?",
                "0", "1", "8", "13",
                "8",
                "I");
        this.addQuestionHardware (q111);

        QuestionHardWare q112 = new QuestionHardWare (
                "Qual ?? o menor espa??o para armazenar dados em um disco r??gido?",
                "Track", "Sector", "Cluster", "Cylinder",
                "Sector",
                "I");
        this.addQuestionHardware (q112);

        QuestionHardWare q113 = new QuestionHardWare (
                "Qual ?? o comprimento m??ximo do cabo, em metros, usando cabo " +
                        "blindado de par tran??ado de calibre 20 entre dois dispositivos" +
                        "USB de velocidade total?",
                "5", "6", "7", "8" ,
                "5",
                "I");
        this.addQuestionHardware (q113);

        QuestionHardWare q114 = new QuestionHardWare (
                "Qual configura????o um dispositivo deve ter para interromper a CPU?",
                "IRQ",
                "Endere??o de E / S",
                "Canal DMA",
                "Endere??o de mem??ria",
                "IRQ",
                "I" );
        this.addQuestionHardware (q114);

        QuestionHardWare q115 = new QuestionHardWare (
                "Qual ?? o comprimento m??ximo para uma conex??o de cabo de um " +
                        "dispositivo USB de velocidade total a um PC. Qual ser?? sua resposta?",
                "3 M", "4 M", "5 M", " 6 M ",
                " 5 M ",
                " I ");
        this.addQuestionHardware (q115);

        QuestionHardWare q116 = new QuestionHardWare (
                "O conector el??trico entre a docking station e um computador port??til ??",
                "Usado como supressor de surto",
                "Espec??fico do fabricante apenas",
                "Espec??fico do fabricante e do modelo",
                "N??o ?? propriedade, mas ?? um padr??o da ind??stria ",
                " Espec??fico do fabricante apenas ",
                " I ");
        this.addQuestionHardware (q116);

        QuestionHardWare q117 = new QuestionHardWare (
                "Um t??cnico conecta um joystick a uma placa de som. Qual IRQ o joystick usaria?",
                "IRQ 2", "IRQ 5", "IRQ 10", "Joystick n??o usa IRQ",
                "IRQ 5",
                "I");
        this.addQuestionHardware (q117);

        QuestionHardWare q118 = new QuestionHardWare (
                "conectores RJ-45 s??o usados ??????em quais das seguintes topologias?",
                "10Base2", "10Base5", "10BaseT", "10BaseFL",
                "10Base2",
                "I");
        this.addQuestionHardware (q118);

        QuestionHardWare q119 = new QuestionHardWare (
                "De que local as primeiras instru????es do computador est??o " +
                        "dispon??veis na inicializa????o?",
                "ROM BIOS", "CPU", "boot.ini", "config.sys",
                "ROM BIOS",
                "I ");
        this.addQuestionHardware (q119);

        QuestionHardWare q120 = new QuestionHardWare (
                "O que poderia causar um erro de disco fixo.",
                "Nenhum CD instalado",
                "RAM danificada",
                "Processador lento",
                "Configura????es de cmos incorretas",
                "Configura????es de cmos incorretas",
                "I");
        this.addQuestionHardware (q120);

        QuestionHardWare q121 = new QuestionHardWare (
                "A falta de tampas de slot em um computador pode causar?",
                "Superaquecimento", "oscila????o de energia", "EMI", "alta tens??o",
                "superaquecimento",
                "I");
        this.addQuestionHardware (q121);

        QuestionHardWare q122 = new QuestionHardWare (
                "Com rela????o a uma placa de interface de rede, o termo 10/100 se refere a",
                "velocidade de protocolo",
                "velocidade de fibra",
                "megabits por segundo" +
                "s", "velocidade m??xima do servidor",
                "megabits por segundos ",
                " I ");
        this.addQuestionHardware (q122);

        QuestionHardWare q123 = new QuestionHardWare (
                "Qual formato da placa-m??e usa um conector de 20 pinos",
                "ATX", "AT", "BABY AT", "BIG AT",
                "ATX",
                "I");
        this.addQuestionHardware (q123);

        QuestionHardWare q124 = new QuestionHardWare (
                "Um disco r??gido ?? dividido em trilhas que s??o subdivididas em",
                "clusters", "setores", "cilindro", "bits",
                "setores",
                "I");
        this.addQuestionHardware (q124);

        QuestionHardWare q125 = new QuestionHardWare (
                "De que local as primeiras instru????es do computador est??o " +
                        "dispon??veis na inicializa????o?",
                "ROM BIOS", "CPU", "boot.ini", "CONFIG.SYS",
                "ROM BIOS",
                "I ");
        this.addQuestionHardware (q125);

        QuestionHardWare q126 = new QuestionHardWare (
                "O que poderia causar um erro de disco corrigido.",
                "Sem CD instalado",
                "RAM defeituosa",
                "processador lento",
                "Configura????es incorretas de CMOS",
                "Configura????es incorretas de CMOS",
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
                "Ao instalar PCI NICS voc?? pode verificar a disponibilidade de IRQ olhando em",
                "dip switches",
                "CONFIG.SYS",
                "jumper settings",
                "motherboard BIOS",
                "motherboard BIOS",
                "I ");
        this.addQuestionHardware (q128);

        QuestionHardWare q129 = new QuestionHardWare (
                "Com rela????o a uma placa de interface de rede, o termo 10/100 se refere a",
                "velocidade do protocolo",
                "velocidade da fibra",
                "megabits por segundo",
                "velocidade m??nima e m??xima do servidor",
                " megabits por segundos ",
                " I ");
        this.addQuestionHardware (q129);

        QuestionHardWare q130 = new QuestionHardWare (
                "O potencial ESD diminui com o uso de:",
                "Ventiladores desionizantes",
                "Uma pulseira",
                "Luvas de borracha com tampa correspondente",
                "Um medidor est??tico",
                "Uma pulseira",
                "EU");
        this.addQuestionHardware (q130);

        QuestionHardWare q131 = new QuestionHardWare (
                "Qual das seguintes FRUs seria considerada um dispositivo de entrada / sa??da?",
                "Placa de v??deo",
                "Adaptador host SCSI",
                "CPU da placa do sistema",
                "Todos os anteriores",
                "SCSI adaptador host ",
                " I ");
        this.addQuestionHardware (q131);

        QuestionHardWare q132 = new QuestionHardWare (
                "Uma porta COM ?? uma porta _____.",
                "Paralela", "serial", "est??tica", "multi",
                "serial",
                "I");
        this.addQuestionHardware (q132);
        QuestionHardWare q133 = new QuestionHardWare (
                "Qual dispositivo est?? no IRQ 6?",
                "Teclado", "IDE", "Unidade de disquete", "Placa de v??deo",
                "Unidade de disquete",
                "I");
        this.addQuestionHardware (q133);

        QuestionHardWare q134 = new QuestionHardWare (
                "Um sistema tem dois discos r??gidos IDE que s??o divididos " +
                        "em parti????es prim??rias e estendidas, que letra de unidade " +
                        "?? atribu??da ?? parti????o prim??ria da segunda unidade?",
                "C", "D", "E "," F ",
                " D ",
                " I ");
        this.addQuestionHardware (q134);

        QuestionHardWare q135 = new QuestionHardWare (
                "Uma pulseira de aterramento cont??m qual dos seguintes:",
                "protetor de sobretens??o", "capacitor", "volt??metro", "resistor",
                "resistor",
                "I");
        this.addQuestionHardware (q135);

        QuestionHardWare q136 = new QuestionHardWare (
                "Qual padr??o rege as comunica????es paralelas?",
                "RS232", "RS232-a", "CAT 5", "IEEE 1284",
                "IEEE 1284",
                "I");
        this.addQuestionHardware (q136);

        QuestionHardWare q137 = new QuestionHardWare (
                "Qual produto ?? usado para limpar teclas manchadas em um teclado?",
                "Solvente TMC",
                "Spray de silicone",
                "??lcool desnaturado",
                "Limpador multiuso",
                "Limpador multiuso",
                "EU");
        this.addQuestionHardware (q137);

        QuestionHardWare q138 = new QuestionHardWare (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimenta????o",
                "Placa de expans??o",
                "Monitor",
                "Teclado",
                "Placa de expans??o",
                "I");
        this.addQuestionHardware (q138);

        QuestionHardWare q139 = new QuestionHardWare (
                "Qual porta perif??rica fornece o rendimento mais R??PIDO " +
                        "para impressoras a laser?",
                "RS-232", "SCSI", "Paralelo", "Serial",
                "Paralelo",
                "I");
        this.addQuestionHardware (q139);

        QuestionHardWare q140 = new QuestionHardWare (
                "O ponteiro do mouse se move erraticamente, qual ?? a poss??vel causa? O mouse",
                "a bola est?? suja",
                "n??o est?? conectada",
                "o driver n??o est?? instalado corretamente",
                "tem uma configura????o de IRQ incorreta" ,
                "bola est?? suja",
                "I");
        this.addQuestionHardware (q140);

        QuestionHardWare q141 = new QuestionHardWare (
                "Voltage4s medido:",
                "em paralelo",
                "em s??rie",
                "ap??s interromper o circuito",
                "ap??s verificar a resist??ncia",
                "em paralelo",
                "I");
        this.addQuestionHardware (q141);

        QuestionHardWare q142 = new QuestionHardWare (
                "Qual ?? o maior n??mero bin??rio que pode ser referido em um" +
                        " bloco de jumpers de tr??s posi????es?",
                "4", "6", "F", "1",
                "1",
                "I" );
        this.addQuestionHardware (q142);

        QuestionHardWare q143 = new QuestionHardWare (
                "Durante a inicializa????o, o teste de mem??ria:",
                "?? uma etapa sup??rflua que deve ser ignorada",
                "Verifica e verifica se a mem??ria cont??gua est?? instalada",
                "?? um erro operacional",
                "Exibe o que a mem??ria est?? instalada, mas nada mais ",
                " Verifica e verifica se a mem??ria cont??gua est?? instalada ",
                " I ");
        this.addQuestionHardware (q143);

        QuestionHardWare q144 = new QuestionHardWare (
                "O que voc?? precisa para verificar a porta serial e paralela?",
                "Adaptador de porta",
                "Sonda l??gica",
                "Plug de loopback",
                "Todas as op????es acima",
                "Plug de loopback",
                "I" );
        this.addQuestionHardware (q144);

        QuestionHardWare q145 = new QuestionHardWare (
                "Para testar a ondula????o CA em uma fonte de alimenta????o de PC, " +
                        "voc?? deve definir o volt / ohm??metro para:",
                "DC", "AC", "Ohm", "Farad",
                "AC",
                "EU");
        this.addQuestionHardware (q145);

        QuestionHardWare q146 = new QuestionHardWare (
                "No barramento ISA de 16 bits, IRQ2 ?? elevado a qual interrup????o " +
                        "de n??vel superior?",
                "9", "11", "13", "15",
                "9",
                "I") ;
        this.addQuestionHardware (q146);

        QuestionHardWare q147 =new QuestionHardWare (
                "Qual ?? a linguagem comum que os computadores usam para se" +
                        " comunicar em uma rede",
                "cliente", "adaptador", "protocolo", "OS",
                "protocolo",
                "I");
        this.addQuestionHardware (q147);

        QuestionHardWare q148 = new QuestionHardWare (
                "Uma porta COM ?? uma porta _____.",
                "Paralela", "serial", "est??tica", "multi",
                "serial",
                "I");
        this.addQuestionHardware (q148);

        QuestionHardWare q149 = new QuestionHardWare (
                "Modems usam transmiss??o.",
                "S??ncrono", "ass??ncrono", "intervalo cronometrado", "ata",
                "ass??ncrono",
                "I");
        this.addQuestionHardware (q149);

        QuestionHardWare q150 = new QuestionHardWare (
                "A tens??o DC na maioria das placas de circuito ??:",
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
                "De que local as primeiras instru????es do computador est??o " +
                        "dispon??veis na inicializa????o?",
                "ROM BIOS", "CPU", "boot.ini", "CONFIG.SYS",
                "ROM BIOS");
        this.addQuestionRandom (q1);

        QuestionRandom q2 = new QuestionRandom (
                "O que poderia causar um erro de disco fixo.",
                "Nenhum CD instalado", "RAM defeituosa",
                "processador lento", "Configura????es de CMOS incorretas",
                "Configura????es de CMOS incorretas");
        this.addQuestionRandom (q2);

        QuestionRandom q3 = new QuestionRandom (
                "A falta de tampas de slot em um computador pode causar?",
                "Superaquecimento", "picos de energia",
                "EMI", "caminho incompleto para ESD",
                "superaquecimento");
        this.addQuestionRandom (q3);

        QuestionRandom q4 = new QuestionRandom (
                "Ao instalar PCI NICS, voc?? pode verificar a disponibilidade de IRQ em",
                "interruptores dip", "CONFIG.SYS",
                "configura????es de jumper", "BIOS da placa-m??e",
                "BIOS da placa-m??e");
        this.addQuestionRandom (q4);

        QuestionRandom q5 = new QuestionRandom (
                "Com rela????o a uma placa de interface de rede, o termo 10/100 se refere a",
                "velocidade de protocolo", "velocidade de fibra",
                "megabits por segundo", "velocidade m??nima e m??xima do servidor",
                " megabits por segundos ");
        this.addQuestionRandom (q5);

        QuestionRandom q6 = new QuestionRandom (
                "Qual formato da placa-m??e usa um conector de 20 pinos",
                "ATX", "Todas as op????es anteriores", "BABY AT", "AT",
                "ATX");
        this.addQuestionRandom (q6);

        QuestionRandom q7 = new QuestionRandom (
                "Um disco r??gido ?? dividido em trilhas que s??o subdivididas em:",
                "clusters", "setores", "vetores", "cabe??as",
                "setores");
        this.addQuestionRandom (q7);

        QuestionRandom q8 = new QuestionRandom (
                "Uma pulseira de aterramento cont??m qual dos seguintes:",
                "Protetor de sobretens??o", "Capacitor",
                "Volt??metro", "Resistor",
                "Resistor");
        this.addQuestionRandom (q8);

        QuestionRandom q9 = new QuestionRandom (
                "Qual padr??o governa as comunica????es paralelas?",
                "RS232", "RS-232a", "CAT 5", "IEEE 1284",
                "IEEE 1284");
        this.addQuestionRandom (q9);

        QuestionRandom q10 = new QuestionRandom (
                "Na tecnologia de impressora a laser, o que acontece " +
                        "durante o est??gio de condicionamento?",
                "O fio corona coloca uma carga positiva uniforme no papel",
                "Uma carga negativa uniforme ?? colocada no tambor fotossens??vel",
                "A carga negativa uniforme ?? colocada no toner ",
                " Todas as anteriores ",
                " Uma carga negativa uniforme ?? colocada no tambor fotossens??vel ");
        this.addQuestionRandom (q10);

        QuestionRandom q11 = new QuestionRandom (
                "Qual produto ?? usado para limpar teclas manchadas em um teclado?",
                "Solvente TMC", "Spray de silicone", "??lcool desnaturado",
                "Limpador multiuso",
                "Limpador multiuso") ;
        this.addQuestionRandom (q11);

        QuestionRandom q12 = new QuestionRandom (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimenta????o", "Placa de expans??o",
                "Monitor", "Teclado",
                "Placa de expans??o");
        this.addQuestionRandom (q12);

        QuestionRandom q13 = new QuestionRandom (
                "Para visualizar qualquer programa Terminate Stay Resident" +
                        " (TSR) em execu????o, voc?? pode digitar:",
                "Memory", "MEM", "Memmaker", "SYS / M",
                "MEM");
        this.addQuestionRandom (q13);

        QuestionRandom q14 = new QuestionRandom (
                "Que tipo de placa de sistema ?? o candidato MAIS prov??vel" +
                        " para atualiza????o de processador se voc?? deseja desempenho " +
                        "m??ximo e compatibilidade futura?",
                "ML", "PCI", "EISA", "ISA",
                "PCI" );
        this.addQuestionRandom (q14);

        QuestionRandom q15 = new QuestionRandom (
                "Qual porta perif??rica fornece o rendimento mais R??PIDO " +
                        "para impressoras a laser?",
                "RS-232", "SCSI", "Paralelo", "Serial",
                "Paralelo");
        this.addQuestionRandom (q15);

        QuestionRandom q16 = new QuestionRandom (
                "O ponteiro do mouse se move erraticamente, " +
                        "qual ?? a poss??vel causa? O mouse",
                "a bola est?? suja",
                "n??o est?? conectado",
                "o driver n??o est?? instalado corretamente",
                "tem uma configura????o de IRQ incorreta" ,
                "bola ?? sujeira");
        this.addQuestionRandom (q16);

        QuestionRandom q17 = new QuestionRandom (
                "A tens??o ?? medida:",
                "em paralelo", "em s??rie", "ap??s interromper o circuito",
                "ap??s verificar a resist??ncia",
                "em paralelo");
        this.addQuestionRandom (q17);

        QuestionRandom q18 = new QuestionRandom (
                "Seu cliente diz que a qualidade de impress??o de sua" +
                        " impressora matricial ?? clara e depois escura. Qual das " +
                        "alternativas a seguir pode causar o problema.",
                "Deslizamento do papel", "Avan??o impr??prio da fita",
                "Espessura do papel" , "Posi????o da cabe??a",
                "Avan??o impr??prio da fita");
        this.addQuestionRandom (q18);

        QuestionRandom q19 = new QuestionRandom (
                "A conex??o de 34 pinos em uma placa de E / S ?? para?",
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
                "No barramento ISA de 16 bits, IRQ2 ?? elevado para qual" +
                        " n??vel superior de interrup????o?",
                "9", "11", "13", "15",
                "9");
        this.addQuestionRandom (q21);

        QuestionRandom q22 = new QuestionRandom (
                "Para visualizar qualquer programa Terminate Stay" +
                        " Resident (TSR) em execu????o, voc?? pode digitar:",
                "Memory", "MEM", "SYS / M", "Memmaker",
                "MEM");
        this.addQuestionRandom (q22);

        QuestionRandom q23 = new QuestionRandom (
                "Qual parte da impressora a laser N??O deve ser exposta" +
                        " ?? luz solar?",
                "Conjunto de corona de transfer??ncia",
                "Tambor de PC",
                "Fio de corona prim??rio",
                "Fio de corona prim??rio de tambor de PC",
                "Tambor de PC" );
        this.addQuestionRandom (q23);

        QuestionRandom q24 = new QuestionRandom (
                "Depois de fazer uma formata????o de baixo n??vel, qual seria a " +
                        "pr??xima etapa na configura????o do disco r??gido em um sistema?",
                "Formatar parti????o DOS",
                "Instalar sistema operacional",
                "Configurar canal DMA e voltar -up interrup????o ",
                " Parti????o com disco ",
                " Formatar parti????o DOS ");
        this.addQuestionRandom (q24);

        QuestionRandom q25 = new QuestionRandom (
                "A resist??ncia ?? medida em?",
                "Volts", "Amps", "Watts", "Ohms",
                "Ohms");
        this.addQuestionRandom (q25);

        QuestionRandom q26 = new QuestionRandom (
                "Que comando ?? usado para redefinir um MODEM ao usar " +
                        "o Conjunto de comandos AT?",
                "ATR", "ATZ", "DTR", "DCE",
                "ATZ");
        this.addQuestionRandom (q26);

        QuestionRandom q27 = new QuestionRandom (
                "Ao instalar uma unidade de CD-ROM SCSI, voc?? deve definir o" +
                        " adaptador SCSI de CD-ROM para:",
                "B0007", "Um endere??o SCSI n??o utilizado",
                "O mesmo endere??o do dispositivo SCSI antes de CD-ROM ",
                " SCSI ID = 1 ",
                " Um endere??o SCSI n??o utilizado ");
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
                "Na tecnologia Inkjet as gotas de tinta s??o desviadas por?",
                "Bicos multidirecionais", "placas eletronicamente carregadas",
                "placas de alta press??o", "absor????o eletrost??tica",
                "bicos multidirecionais") ;
        this.addQuestionRandom (q29);

        QuestionRandom q30 = new QuestionRandom (
                "Qual ferramenta ?? usada para testar portas seriais e paralelas?",
                "Sonda de alta voltagem", "scanner de cabo",
                "loop backs (plugues envolventes)", "sniffer",
                "loop backs (plugues envolventes ) ");
        this.addQuestionRandom (q30);

        QuestionRandom q31 = new QuestionRandom (
                "ESD causaria mais danos a qual componente?",
                "Fonte de alimenta????o", "Placa de expans??o", "Monitor", "Teclado",
                "Placa de expans??o");
        this.addQuestionRandom (q31);

        QuestionRandom q32 = new QuestionRandom (
                "Qual ?? o maior n??mero bin??rio que pode ser referido em um " +
                        "bloco de jumpers de tr??s posi????es?",
                "4", "6", "F", "1",
                "1");
        this.addQuestionRandom (q32);

        QuestionRandom q33 = new QuestionRandom (
                "Que tens??o um sistema Pentium usa?",
                "+ 12 volts", "+ 5 volts", "+ 5 volts", "+ 3,3 volts",
                "+ 3,3 volts");
        this.addQuestionRandom (q33);

        QuestionRandom q34 = new QuestionRandom (
                "Uma verifica????o de c??digo de erro num??rico: A 17xx indica um problema com:",
                "CMOS", "ROM BIOS",
                "controlador DMA", "disco r??gido ou controlador",
                "disco r??gido ou controlador") ;
        this.addQuestionRandom (q34);

        QuestionRandom q35 = new QuestionRandom (
                "Qual fornece o acesso mais r??pido a grandes arquivos de v??deo?",
                "Unidades ??pticas", "Discos r??gidos IDE", "Discos r??gidos SCSI",
                "Discos r??gidos EIDE",
                "Discos r??gidos SCSI");
        this.addQuestionRandom (q35);

        QuestionRandom q36 = new QuestionRandom (
                "Um conector f??mea de 25 pinos na parte de tr??s do seu computador normalmente ser??:",
                "Porta serial 1", "Uma porta paralela",
                "Docking", "Porta COM2",
                "Uma porta paralela ");
        this.addQuestionRandom (q36);

        QuestionRandom q37 = new QuestionRandom (
                "Voc?? estava instalando um aplicativo no Windows 95 e o " +
                        "computador trava, o que voc?? faz?",
                "Pressione alt + Ctrl + delete, duas vezes",
                "pressione alt + Ctrl + delete e finalize a tarefa ",
                " pressione o bot??o reset no computador ",
                " desligue o computador e inicialize de um disquete ",
                " desligue o computador e inicialize de um disquete ");
        this.addQuestionRandom (q37);

        QuestionRandom q38 = new QuestionRandom (
                "RS-232 ?? um padr??o que se aplica a:",
                "portas seriais", "portas paralelas",
                "portas de jogos", "redes",
                "portas seriais");
        this.addQuestionRandom (q38);

        QuestionRandom q39 = new QuestionRandom (
                "Voc?? acabou de instalar um novo disco r??gido IDE, mas o BIOS" +
                        " do sistema n??o reconhece a nova unidade, o que voc?? deve verificar primeiro.",
                "Sequ??ncia de cabos",
                "jumpers no disco r??gido",
                "drivers que precisam ser carregados ",
                " informa????es do site do fabricante do disco r??gido ",
                " drivers que precisam ser carregados ");
        this.addQuestionRandom (q39);

        QuestionRandom q40 = new QuestionRandom (
                "Durante a inicializa????o, o teste de mem??ria:",
                "?? uma etapa sup??rflua que deve ser ignorada",
                "Verifica e verifica se a mem??ria cont??gua est?? instalada",
                "?? um erro operacional",
                "Exibe o que a mem??ria est?? instalada, mas nada mais ",
                " Verifica e verifica se a mem??ria cont??gua est?? instalada ");
        this.addQuestionRandom (q40);

        QuestionRandom q41 = new QuestionRandom (
                "Qual ?? o melhor aterramento para uma bancada de trabalho condutiva?",
                "Tomada CA", "Terra para dobrar",
                "Para outro dispositivo", "Aterramento do chassi",
                "Tomada CA");
        this.addQuestionRandom (q41);

        QuestionRandom q42 = new QuestionRandom (
                "Topicamente, quantas placas PC tipo III voc?? pode inserir em um laptop",
                "1", "2", "3", "4",
                "1");
        this.addQuestionRandom (q42);

        QuestionRandom q43 = new QuestionRandom (
                "Qual ?? a primeira coisa que voc?? pode fazer para verificar " +
                        "se h?? danos em uma impressora ap??s receb??-la?",
                "Executar diagn??sticos MSD",
                "Conectar a um PC e imprimir algo",
                "Verificar os cabos" ,
                "Retire da caixa e examine-o quanto a danos f??sicos",
                "Retire da caixa e examine quanto a danos f??sicos");
        this.addQuestionRandom (q43);

        QuestionRandom q44 = new QuestionRandom (
                "Voc?? tem um sistema que trava periodicamente. Voc?? " +
                        "descartou o software e agora suspeita que seja hardware. " +
                        "O que voc?? deve fazer primeiro para ajud??-lo a restringir " +
                        "o componente com falha?",
                "girar a RAM",
                "substituir a RA" +
                "M", "substituir o cache SIMM n??vel 2",
                "desativar o cache da CPU no CMOS",
                "desativar o cache da CPU no CMOS");
        this.addQuestionRandom (q44);

        QuestionRandom q45 = new QuestionRandom (
                "Qual ?? a melhor maneira de proteger os dados do seu disco r??gido?",
                "Backups regulares", "desfragment??-lo periodicamente",
                "execute chkdsk pelo menos uma vez por semana",
                "execute o scandisk pelo menos uma vez por semana" ,
                "backups regulares");
        this.addQuestionRandom (q45);

        QuestionRandom q46 = new QuestionRandom (
                "Em uma impressora matricial, voc?? nunca deve lubrificar qual parte?",
                "Trilhos do carro",
                "pinos do cabe??ote de impress??o",
                "rolamentos de avan??o do papel",
                "rolamentos do carro",
                "pinos do cabe??ote de impress??o");
        this.addQuestionRandom (q46);

        QuestionRandom q47 = new QuestionRandom (
                "Quantos dispositivos podem ser usados ??????em um ??nico barramento " +
                        "SCSI? Lembre-se de que o adaptador host SCSI conta como um dispositivo.",
                "1", "8", "20", "10", "8");
        this.addQuestionRandom (q47);

        QuestionRandom q48 = new QuestionRandom (
                "Combine o driver de dispositivo HIMEM.SYS com sua opera????o.",
                "Suporta emula????o de terminal (ANSI)",
                "Gerencia o uso de mem??ria estendida",
                "Usa mem??ria expandida em um processador 80386",
                "Suporta troca de p??gina de c??digo ",
                " Gerencia o uso de mem??ria estendida ");
        this.addQuestionRandom (q48);

        QuestionRandom q49 = new QuestionRandom (
                "_____ ajuda a prevenir surtos de energia.",
                "Supressor de surto", "Protetor de pico",
                "Sistema UPS", "Mult??metro de alta qualidade",
                "Supressor de surto");
        this.addQuestionRandom (q49);

        QuestionRandom q50 = new QuestionRandom (
                "O mult??metro digital est?? configurado para DC, Ohm e 20k." +
                        " Voc?? ler?? _____ enquanto mede um bom fus??vel de 2 A.",
                "0,00", "0,02", "0,20", "2,00",
                " 0,00 ");
        this.addQuestionRandom (q50);

        QuestionRandom q51 = new QuestionRandom (
                "Uma tira antiest??tica usa um pequeno _____ para garantir " +
                        "que voc?? n??o se torne o menor caminho de resist??ncia para o solo?",
                "Capacitor",
                "diodo",
                "transistor",
                "resistor",
                " resistor ");
        this.addQuestionRandom (q51);

        QuestionRandom q52 = new QuestionRandom (
                "Se os slots de mem??ria tiverem 30 pinos, o chip ?? um?",
                "DIMM", "SIMM", "SDRAM", "Todos os anteriores",
                "SIMM");
        this.addQuestionRandom (q52);

        QuestionRandom q53 = new QuestionRandom (
                "As velocidades da impressora Laser Jet s??o medidas em p??ginas " +
                        "por minuto (ppm) o que usamos para medir impressoras matriciais?",
                "Linhas por polegada",
                "linhas por folha",
                "caracteres por polegada" ,
                "caracteres por segundo",
                "caracteres por segundo");
        this.addQuestionRandom (q53);

        QuestionRandom q54 = new QuestionRandom (
                "Quais valores s??o mantidos no CMOS para o disco r??gido",
                "tamanho (cabe??as, cilindros, setores)",
                "IRQ",
                "Espa??o livre",
                "Alerta de v??rus",
                "tamanho (cabe??as, cilindros , setores) ");
        this.addQuestionRandom (q54);

        QuestionRandom q55 = new QuestionRandom (
                "Qual das alternativas a seguir seria uma primeira " +
                        "etapa l??gica na solu????o de problemas de um PC?",
                "Verifique o CMOS do computador",
                "Defina as circunst??ncias do problema",
                "Ligue para o fornecedor",
                "Defina quais aplicativos est??o sendo usados ??????",
                " Definir as circunst??ncias do problema ");
        this.addQuestionRandom (q55);

        QuestionRandom q56 = new QuestionRandom (
                "Qual driver DOS ?? usado para emular a mem??ria expandida?",
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
                "Qual componente deve ser aspirado ou substitu??do durante " +
                        "a manuten????o preventiva em uma impressora a laser?",
                "Espelho de varredura",
                "Cartucho de toner",
                "Filtro de oz??nio",
                "Todos os itens acima",
                "Filtro de oz??nio" );
        this.addQuestionRandom (q58);

        QuestionRandom q59 = new QuestionRandom (
                "Qual dispositivo usa um canal DMA?",
                "Modem",
                "Placa de rede",
                "Placa de som",
                "Todas as op????es anteriores",
                "Placa de som");
        this.addQuestionRandom (q59);

        QuestionRandom q60 = new QuestionRandom (
                "Quando ?? o maior risco de descarga eletrost??tica?",
                "Hor??rio diurno",
                "Umidade alta",
                "Umidade baixa",
                "Hor??rio noturno",
                "Umidade baixa");
        this.addQuestionRandom (q60);

        QuestionRandom q61 = new QuestionRandom (
                "Um modem pode ser conectado a qual porta?",
                "Porta paralela", "Porta ASYNC",
                "Conector de teclado", "Porta de v??deo",
                "Porta paralela");
        this.addQuestionRandom (q61);

        QuestionRandom q62 = new QuestionRandom (
                "Qual dispositivo evita interrup????es de energia, resultando" +
                        " em dados corrompidos?",
                "Unidade de backup de bateria", "Protetor de sobretens??o",
                "Tiras de v??rios SIMMs", "Sistema de prote????o de dados",
                "Backup de bateria unidade");
        this.addQuestionRandom (q62);

        QuestionRandom q63 = new QuestionRandom (
                "SCSI deve ser terminado com?",
                "Chave DIP", "Resistor", "BNC", "Todos os anteriores",
                "Resistor");
        this.addQuestionRandom (q63);

        QuestionRandom q64 = new QuestionRandom (
                "Em um computador com um adaptador eide, onde voc?? deve conectar" +
                        " uma unidade de CD-ROM ATA?",
                "No barramento de disquete", "no IDE prim??rio",
                "no IDE secund??rio", " no barramento SCSI ",
                " no IDE secund??rio ");
        this.addQuestionRandom (q64);

        QuestionRandom q65 = new QuestionRandom (
                "Qual ?? o maior n??mero bin??rio que pode ser referido em um bloco " +
                        "de jumpers de tr??s posi????es?", "4", "6", "5", "1",
                "1");
        this.addQuestionRandom (q65);

        QuestionRandom q66 = new QuestionRandom (
                "Durante a inicializa????o, o teste de mem??ria:",
                "?? uma etapa sup??rflua que deve ser ignorada",
                "Verifica e verifica se a mem??ria cont??gua est?? instalada",
                "?? um erro operacional",
                "Exibe o que a mem??ria est?? instalada, mas nada mais ",
                " Verifica e verifica se a mem??ria cont??gua est?? instalada ");
        this.addQuestionRandom (q66);

        QuestionRandom q67 = new QuestionRandom (
                "IRQ6 ?? normalmente reservado para:",
                "O disquete", "O controlador do teclado",
                "LPT2", "O modem",
                "O disquete");
        this.addQuestionRandom (q67);

        QuestionRandom q68 = new QuestionRandom (
                "O que voc?? faria primeiro ao solucionar problemas" +
                        " em um monitor com defeito?",
                "Verifique suas conex??es com o computador e a fonte de alimenta????o",
                "Use um medidor para verificar a continuidade do CRT e dos circuitos internos",
                "Desligue o monitor e, em seguida, ligue-o novamente para ver se isso corrige o problema ",
                " Desligue o computador e ligue-o novamente para ver se isso corrige o problema ",
                " Verifique suas conex??es com o computador e a fonte de alimenta????o ");
        this.addQuestionRandom (q68);

        QuestionRandom q69 = new QuestionRandom (
                "Para instalar uma segunda unidade IDE em um computador, voc?? deve:",
                "Definir o jumper mestre-escravo para escravo na segunda unidade",
                "Use o software de configura????o IDE para definir a nova unidade como escravo ",
                " Verifique se voc?? define a nova unidade como D: na configura????o do CMOS ",
                " Verifique se voc?? conecta a unidade ao conector na extremidade do cabo de fita ",
                " Defina o jumper mestre-escravo como escravo no segundo dirigir");
        this.addQuestionRandom (q69);

        QuestionRandom q70 = new QuestionRandom (
                "Por que uma unidade de rede mapeada com sucesso desaparece" +
                        " toda vez que voc?? inicializa o computador?",
                "O computador ao qual voc?? est?? conectado mudou",
                "Voc?? n??o clicou em reconectar ao fazer logon",
                "O mapa a instru????o n??o est?? no arquivo autoexec.bat ",
                " A ??ltima unidade n??o foi configurada corretamente ",
                " A instru????o do mapa n??o est?? no arquivo autoexec.bat ");
        this.addQuestionRandom (q70);

        QuestionRandom q71 = new QuestionRandom (
                "O que voc?? precisa para verificar a porta serial e paralela?",
                "Adaptador de porta", "Sonda l??gica",
                "Plugue de loopback", "Todos os anteriores",
                "Plugue de loopback");
        this.addQuestionRandom (q71);

        QuestionRandom q72 = new QuestionRandom (
                "Voc?? tem um PC sem v??deo * Qual das alternativas a seguir " +
                        "tem MENOS probabilidade de estar causando o problema?",
                "RAM com defeito (banco zero)", "microprocessador com defeito",
                "disco r??gido travado", "placa de v??deo solta",
                "disco r??gido travado");
        this.addQuestionRandom (q72);

        QuestionRandom q73 = new QuestionRandom (
                "Para testar a ondula????o CA em uma fonte de alimenta????o de PC," +
                        " voc?? deve definir o volt / ohm??metro para:",
                "escala de tens??o CC", "tens??o CA",
                "escala OHM", "escala Farad" ,
                "Tens??o CA");
        this.addQuestionRandom (q73);

        QuestionRandom q74 = new QuestionRandom (
                "Voc?? obt??m um erro de checksum CMOS durante a inicializa????o." +
                        " Qual ?? a causa mais prov??vel?",
                "Fonte de alimenta????o est?? ruim",
                "BIOS precisa ser atualizada",
                "Bateria CMOS est?? quase no fim",
                "dif??cil os tipos de unidade est??o definidos incorretamente ",
                " A bateria CMOS est?? quase no fim de sua vida ??til ");
        this.addQuestionRandom (q74);

        QuestionRandom q75 = new QuestionRandom (
                "No barramento ISA de 16 bits, IRQ2 ?? elevado a qual " +
                        "interrup????o de n??vel superior?",
                "9", "11", "13", "15",
                "9");
        this.addQuestionRandom (q75);

        QuestionRandom q76 = new QuestionRandom (
                "Depois de tentar descarregar um TSR, voc?? receber?? uma mensagem " +
                        "de erro informando que outros TSRs foram carregados depois daquele " +
                        "que voc?? tentou remover. Qual dos seguintes comandos voc?? poderia " +
                        "usar para ver a ordem de carregamento atual?",
                "MEM / P", "MEMMAKER", "MEM / C", "SYS:",
                "SYS:");
        this.addQuestionRandom (q76);

        QuestionRandom q77 = new QuestionRandom (
                "Qual ?? a linguagem comum que os computadores usam para falar" +
                        " uns com os outros em uma rede",
                "cliente", "adaptador",
                "protocolo", "sistemas operacionais",
                "protocolo");
        this.addQuestionRandom (q77);

        QuestionRandom q78 = new QuestionRandom (
                "Qual driver DOS ?? usado para emular a mem??ria expandida?",
                "Himem.sys", "EMM386.exe", "Mem386.sys", "Ramdrive.sys",
                "EMM386.exe");
        this.addQuestionRandom (q78);

        QuestionRandom q79 = new QuestionRandom (
                "Qual voc?? deve usar para limpar telas LCD protegidas com Mylar?",
                "Limpador de janelas com am??nia", "Limpador n??o abrasivo",
                "Toalhetes antiest??ticos", "Toalhetes impregnados com ??lcool",
                "N??o - limpador abrasivo ");
        this.addQuestionRandom (q79);

        QuestionRandom q80 = new QuestionRandom (
                "O que poderia causar um erro de disco fixo?",
                "Sem CD instalado", "RAM inv??lida",
                "Processador lento", "Configura????es de CMOS incorretas",
                "Configura????es de CMOS incorretas");
        this.addQuestionRandom (q80);

        QuestionRandom q81 = new QuestionRandom (
                "O potencial ESD diminui com o uso de:",
                "Ventiladores desionizantes", "Uma pulseira",
                "Luvas de borracha com tampa correspondente", "Um medidor est??tico",
                "Uma pulseira") ;
        this.addQuestionRandom (q81);

        QuestionRandom q82 = new QuestionRandom (
                "Qual das seguintes FRUs seria considerada um dispositivo " +
                        "de entrada / sa??da?",
                "Placa de v??deo", "Adaptador host SCSI",
                "CPU da placa do sistema", "Todos os anteriores",
                "SCSI adaptador host ");
        this.addQuestionRandom (q82);

        QuestionRandom q83 = new QuestionRandom (
                "Uma porta COM ?? uma porta _____.",
                "Paralela", "serial",
                "est??tica", "multi",
                "serial");
        this.addQuestionRandom (q83);

        QuestionRandom q84 = new QuestionRandom (
                "Qual dispositivo est?? no IRQ 6?",
                "Teclado", "IDE", "Unidade de disquete",
                "Placa de v??deo",
                "Unidade de disquete");
        this.addQuestionRandom (q84);

        QuestionRandom q85 = new QuestionRandom (
                "Um sistema tem dois discos r??gidos IDE, cada um dividido em parti????es " +
                        "prim??ria e estendida, qual letra de unidade ?? atribu??da ??" +
                        " parti????o prim??ria da segunda unidade?",
                "C", "D", "E "," F ",
                " D ");
        this.addQuestionRandom (q85);

        QuestionRandom q86 = new QuestionRandom (
                "Qual ?? a diferen??a mais significativa entre os padr??es USB e IEEE1394?",
                "IEEE 1394 ?? mais r??pido",
                "USB n??o oferece suporte a USB",
                "USB ?? plug and play",
                "IEEE 1394 ?? quente troc??vel ",
                " IEEE 1394 ?? mais r??pido ");
        this.addQuestionRandom (q86);

        QuestionRandom q87 = new QuestionRandom (
                "Ao conectar dois discos r??gidos SCSI internos a um computador, " +
                        "onde voc?? conecta o segundo disco r??gido?",
                "Qualquer porta SCSI aberta no computador",
                "Uma porta serial no primeiro adaptador host",
                "Uma porta paralela aberta no computador",
                "Uma porta SCSI aberta no primeiro disco r??gido",
                "Qualquer porta SCSI aberta no computador");
        this.addQuestionRandom (q87);

        QuestionRandom q88 = new QuestionRandom (
                "Ao conectar um cabo de fita a um conector, como voc?? sabe em " +
                        "que dire????o conect??-lo?",
                "A linha vermelha no cabo vai para o n??mero de pino mais alto",
                "A linha colorida no o cabo vai para o pino # 1 ",
                " N??o importa ",
                " A linha azul ou vermelha no cabo vai para o conector de alimenta????o ",
                " A linha colorida no cabo vai para o pino # 1 ");
        this.addQuestionRandom (q88);

        QuestionRandom q89 = new QuestionRandom (
                "Qual ?? a primeira etapa para diagnosticar um computador " +
                        "completamente morto no site do cliente que estava funcionando no dia " +
                        "anterior.",
                "Teste a fonte de alimenta????o",
                "substitua a bateria CMOS",
                "verifique a tomada CA ",
                " recoloque o cabo do controlador do disco r??gido ",
                " verifique a tomada CA ");
        this.addQuestionRandom (q89);

        QuestionRandom q90 = new QuestionRandom (
                "Que especifica????o abrange placas de disco r??gido de PC?",
                "SCSI", "ISA", "PCMCIA", "MFM",
                "PCMCIA");
        this.addQuestionRandom (q90);

        QuestionRandom q91 = new QuestionRandom (
                "Qual especifica????o de barramento comum fornece a taxa de transfer??ncia de dados mais r??pida?",
                "Barramento VL", "ISA", "PCI", "Todos os anteriores",
                "PCI");
        this.addQuestionRandom (q91);

        QuestionRandom q92 = new QuestionRandom (
                "Modems usam transmiss??o.",
                "S??ncrono", "ass??ncrono", "intervalo de tempo", "ata",
                "ass??ncrono");
        this.addQuestionRandom (q92);

        QuestionRandom q93 = new QuestionRandom (
                "A 6xx indica um problema com:",
                "unidade de disquete", "disco r??gido", "teclado", "CD ROM",
                "unidade de disquete");
        this.addQuestionRandom (q93);

        QuestionRandom q94 = new QuestionRandom (
                "Uma placa de som normalmente usa qual IRQ?",
                "6", "5", "15", "1",
                "5");
        this.addQuestionRandom (q94);

        QuestionRandom q95 = new QuestionRandom (
                "Durante a manuten????o preventiva em uma impressora matricial, N??O lubrifique:",
                "Conjunto do cilindro",
                "Polia da cabe??a de impress??o",
                "Pinos da cabe??a de impress??o",
                "Buchas da engrenagem de avan??o do papel",
                "Pinos da cabe??a de impress??o ");
        this.addQuestionRandom (q95);

        QuestionRandom q96 = new QuestionRandom(
                "Voc?? v?? a mensagem \"invalid media device\" depois de " +
                        "instalar um novo disco r??gido. O que voc?? faz em seguida?",
                "Format","Fdisk",
                "Partition","Add the OS" +
                "","Format");
        this.addQuestionRandom(q96);

        QuestionRandom q97 = new QuestionRandom (
                "O que ?? o comando para desligar o modem?",
                "ATHU", "ATH", "ATZ", "ATX",
                "ATH");
        this.addQuestionRandom (q97);

        QuestionRandom q98 = new QuestionRandom (
                "Quais s??o os tipos de expans??o compat??veis com a maioria das " +
                        "placas-m??e pll / plll?",
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
                "Interromper a CPU para solicitar servi??o",
                "Passar dados para a CPU para serem processados",
                "Passar dados de um cart??o para outro",
                "Passar dados para a mem??ria do computador ",
                " Interromper a CPU para solicitar servi??o ");
        this.addQuestionRandom (q100);

        QuestionRandom q101 = new QuestionRandom(
                "Qual ?? o equivalente decimal do n??mero bin??rio 10111",
                "21","23","39","42",
                "23");
        this.addQuestionRandom(q101);

        QuestionRandom q102 = new QuestionRandom(
                "Para escrever em um disquete com o seu PC IBM, voc?? deve primeiro",
                "digitalize-o","formate-o","compilar","hardware isso",
                "formate-o");
        this.addQuestionRandom(q102);

        QuestionRandom q103 = new QuestionRandom(
                "Qual ?? o termo para uma ??rea de armazenamento tempor??rio que compensa " +
                        "as diferen??as na taxa de dados e no fluxo de dados entre os dispositivos?",
                "Buffer","Bus","Channel","Modem",
                "Buffer");
        this.addQuestionRandom(q103);

        QuestionRandom q104 = new QuestionRandom(
                "Quantos pontos coloridos formam um pixel colorido em uma tela?",
                "256","16","3","1",
                "3");
        this.addQuestionRandom(q104);

        QuestionRandom q105 = new QuestionRandom(
                "Uma das coisas que separa um TERMINAL de um PC ?? que o terminal n??o " +
                        "tem o qu???",
                "Keyboard","Monitor","Power Cord","CPU",
                "CPU");
        this.addQuestionRandom(q105);

        QuestionRandom q106 = new QuestionRandom(
                "Os dados s??o armazenados em disquete de que forma?",
                "Ink","Laser Bubble","Magnetism","Circuits",
                "Magnetism");
        this.addQuestionRandom(q106);

        QuestionRandom q107 = new QuestionRandom (
                "O menor elemento visual em um monitor de v??deo ?? chamado de qu???",
                "Caractere", "Pixel", "Byte", "Kwerk",
                "Pixel");
        this.addQuestionRandom (q107);

        QuestionRandom q108 = new QuestionRandom (
                "O tipo de armazenamento de dados considerado vol??til ???",
                "R-O-M", "R-A-M", "TAPE", "DISK",
                "R-A-M");
        this.addQuestionRandom (q108);

        QuestionRandom q109 = new QuestionRandom (
                "Qual elemento natural ?? o ingrediente principal em chips de computador?",
                "Sil??cio", "Carbono", "Ferro", "Ur??nio",
                "Sil??cio");
        this.addQuestionRandom (q109);

        QuestionRandom q110 = new QuestionRandom (
                "Onde voc?? encontra um entalhe de prote????o contra grava????o?",
                "Em um chip de computador", "Em um cart??o perfurado",
                "Em uma mem??ria somente leitura", "Em um disquete",
                "Em um disquete");
        this.addQuestionRandom (q110);

        QuestionRandom q111 = new QuestionRandom (
                "Qual das seguintes linguagens ?? mais adequada para um programa estruturado?",
                "PL / 1", "FORTRAN", "BASIC", "PASCAL",
                "PASCAL");
        this.addQuestionRandom (q111);

        QuestionRandom q112 = new QuestionRandom (
                "Um m??todo assistido por computador para registrar e analisar sistemas" +
                        " existentes ou hipot??ticos ??",
                "Transmiss??o de dados", "Fluxo de dados",
                "Captura de dados", "Processamento de dados",
                "Fluxo de dados");
        this.addQuestionRandom (q112);

        QuestionRandom q113 = new QuestionRandom (
                "O c??rebro de qualquer sistema de computador ??",
                "ALU", "CPU", "Mem??ria", "Unidade de controle",
                "CPU");
        this.addQuestionRandom (q113);

        QuestionRandom q114 = new QuestionRandom (
                "Que diferen??a o computador de 5?? gera????o tem dos computadores " +
                        "de outra gera????o?",
                "Avan??o tecnol??gico", "C??digo cient??fico",
                "Programa????o orientada a objetos", "Todas as anteriores",
                "Avan??o tecnol??gico") ;
        this.addQuestionRandom (q114);

        QuestionRandom q115 = new QuestionRandom (
                "Qual das seguintes linguagens de computador ?? usada para " +
                        "intelig??ncia artificial?",
                "FORTRAN", "PROLOG", "C", "COBOL",
                "PROLOG");
        this.addQuestionRandom (q115);

        QuestionRandom q116 = new QuestionRandom (
                "As faixas em um disco que podem ser acessadas sem " +
                        "reposicionar os cabe??otes R / W s??o",
                "Surface", "Cylinder", "Cluster", "All of the above"
                , "Cylinder");
        this.addQuestionRandom (q116);
        QuestionRandom q117 = new QuestionRandom (
                "Qual dos seguintes ?? o complemento de 1 de 10?", "01", "110",
                "11", "10",
                "01");
        this.addQuestionRandom (q117);

        QuestionRandom q118 = new QuestionRandom (
                "Uma se????o do c??digo para a qual o controle ?? transferido quando um " +
                        "processador ?? interrompido ?? conhecida como",
                "M", "SVC", "IP", "MDR",
                "M");
        this.addQuestionRandom (q118);

        QuestionRandom q119 = new QuestionRandom (
                "Qual parte interpreta as instru????es do programa e inicia " +
                        "as opera????es de controle.",
                "Entrada", "Unidade de armazenamento",
                "Unidade l??gica", "Unidade de controle",
                "Unidade de controle");
        this.addQuestionRandom (q119);

        QuestionRandom q120 = new QuestionRandom (
                "O sistema bin??rio usa pot??ncias de",
                "2", "10", "8", "16",
                "2");
        this.addQuestionRandom (q120);

        QuestionRandom q121 = new QuestionRandom (
                "Um programa de computador que converte linguagem assembly " +
                        "em linguagem de m??quina ??",
                "Compiler", "Interpreter", "Assembler", "Comparator",
                "Assembler");
        this.addQuestionRandom (q121);

        QuestionRandom q122 = new QuestionRandom (
                "O tempo necess??rio para buscar e executar uma instru????o de" +
                        " m??quina simples ??",
                "Tempo de atraso", "Ciclo da CPU",
                "Tempo real", "Tempo de busca",
                "Ciclo da CPU");
        this.addQuestionRandom (q122);

        QuestionRandom q123 = new QuestionRandom (
                "O tempo durante o qual uma pe??a do equipamento opera ?? chamado",
                "Tempo de busca", "Tempo efetivo",
                "Tempo de acesso", "Tempo real",
                "Tempo efetivo");
        this.addQuestionRandom (q123);

        QuestionRandom q124 = new QuestionRandom (
                "Os n??meros bin??rios precisam de mais casas para contar porque",
                "Eles s??o sempre n??meros grandes",
                "Qualquer n??mero de 0s pode ser adicionado na frente deles",
                "A base bin??ria ?? pequena",
                "0s e 1s devem estar devidamente espa??ados ",
                " A base bin??ria ?? pequena ");
        this.addQuestionRandom (q124);

        QuestionRandom q125 = new QuestionRandom (
                "Qual m??todo de acesso ?? usado para obter um registro " +
                        "de uma fita cassete?",
                "Direto", "Sequencial",
                "Aleat??rio", "Todas as op????es anteriores",
                "Sequencial");
        this.addQuestionRandom (q125);

        QuestionRandom q126 = new QuestionRandom (
                "Qualquer tipo de armazenamento usado para armazenar informa????es" +
                        " entre as etapas de seu processamento ??",
                "CPU", "Armazenamento prim??rio",
                "Armazenamento intermedi??rio", "Armazenamento interno",
                "Armazenamento intermedi??rio");
        this.addQuestionRandom (q126);

        QuestionRandom q127 = new QuestionRandom (
                "Um nome aplicado pela Intel Corp. ?? tecnologia MOS de" +
                        " alta velocidade ?? chamado",
                "HDLC", "LAP", "HMOS", "SDLC",
                "HMOS");
        this.addQuestionRandom (q127);

        QuestionRandom q128 = new QuestionRandom (
                "Um componente do programa que permite estruturar um programa" +
                        " de forma incomum ?? conhecido como",
                "Correla????o", "Coroutine", "Diagonalization", "Quene",
                "Coroutine");
        this.addQuestionRandom (q128);

        QuestionRandom q129 = new QuestionRandom (
                "O radiano de um sistema num??rico",
                "?? vari??vel",
                "N??o tem nada a ver com o valor da posi????o do d??gito",
                "?? igual ao n??mero de seus d??gitos de contagem distintos",
                "?? sempre um n??mero par",
                "?? igual ao n??mero de seus d??gitos de contagem distintos");
        this.addQuestionRandom (q129);

        QuestionRandom q130 = new QuestionRandom (
                "A se????o da CPU que seleciona, interpreta e v?? a execu????o das" +
                        " instru????es do programa",
                "Mem??ria", "Unidade de registro",
                "Unidade de controle", "ALU",
                "Unidade de controle");
        this.addQuestionRandom (q130);

        QuestionRandom q131 = new QuestionRandom (
                "Qual tipo de sistema coloca o usu??rio em conversa direta com o " +
                        "computador por meio de um teclado?",
                "Processamento em tempo real",
                "Computador interativo",
                "Processamento em lote"
                , "Compartilhamento de tempo",
                "Computador interativo ");
        this.addQuestionRandom (q131);

        QuestionRandom q132 = new QuestionRandom (
                "O termo que se refere ?? evacua????o do conte??do de algumas partes " +
                        "da m??quina ?? conhecido como",
                "Dump", "Enhancement", "Down", "Compiler",
                "Dump");
        this.addQuestionRandom (q132);

        QuestionRandom q133 = new QuestionRandom (
                "Um ??nico pacote em um link de dados ?? conhecido como",
                "Caminho", "Quadro", "Bloco", "Grupo",
                "Quadro");
        this.addQuestionRandom (q133);

        QuestionRandom q134 = new QuestionRandom (
                "O processo de comunica????o com um arquivo de um terminal ??",
                "Interactive", "Interrogation",
                "Heuristic", "All of the above",
                "Interrogation");
        this.addQuestionRandom (q134);

        QuestionRandom q135 = new QuestionRandom (
                "Um limite comum entre dois sistemas ?? chamado",
                "Interdi????o", "Interface",
                "Superf??cie", "Nenhuma das op????es acima",
                "Interface");
        this.addQuestionRandom (q135);

        QuestionRandom q136 = new QuestionRandom (
                "O exame e altera????o de bits ??nicos ou pequenos grupos dentro de" +
                        " uma palavra ?? chamado",
                "Bit", "Byte", "Manipula????o de bit", "Fatia de bit",
                "Manipula????o de bit");
        this.addQuestionRandom (q136);

        QuestionRandom q137 = new QuestionRandom (
                "Qual computador foi projetado para ser o mais compacto poss??vel?",
                "Mini", "Super computador", "Micro computador", "Mainframe",
                "Micro computador");
        this.addQuestionRandom (q137);

        QuestionRandom q138 = new QuestionRandom (
                "Qual m??todo ?? usado para conectar um computador remoto?",
                "Dispositivo", "Dialup", "Diagnostic", "Logic circuit",
                "Dialup");
        this.addQuestionRandom (q138);

        QuestionRandom q139 = new QuestionRandom (
                "Quantos c??digos de bits s??o usados ??????pelo c??digo Murray para " +
                        "m??quinas TELEPRINTER.",
                "4", "5", "9", "25",
                "5");
        this.addQuestionRandom (q139);

        QuestionRandom q140 = new QuestionRandom (
                "Os s??mbolos usados ??????em uma linguagem assembly s??o",
                "C??digos", "Mnem??nicos", "Assembler", "Todos os anteriores",
                "Mnem??nicos");
        this.addQuestionRandom (q140);

        QuestionRandom q141 = new QuestionRandom (
                "O complemento de 2 de um n??mero bin??rio ?? obtido adicionando " +
                        "...... ao seu complemento de 1.",
                "0", "1", "10", "12"
                , "1 ");
        this.addQuestionRandom (q141);

        QuestionRandom q142 = new QuestionRandom (
                "Uma linguagem de programa????o de sistemas para microcomputadores " +
                        "na fam??lia Intel ??",
                "PL / C", "PL / CT", "PL / M", "PLA",
                "PL / M");
        this.addQuestionRandom (q142);

        QuestionRandom q143 = new QuestionRandom (
                "O dado que indica algum estado importante no conte??do de entrada " +
                        "ou sa??da ??",
                "Sequence", "Sentinel", "SIO", "Sibling",
                "Sentinel");
        this.addQuestionRandom (q143);

        QuestionRandom q144 = new QuestionRandom (
                "Qual ?? uma vers??o n??o padr??o de uma linguagem de computa????o?",
                "PROLOG", "APL", "Ex??rcito", "PL / 1",
                "Ex??rcito");
        this.addQuestionRandom (q144);

        QuestionRandom q145 = new QuestionRandom (
                "Qual das alternativas a seguir ainda ?? ??til para adicionar n??meros?",
                "EDSAC", "ENIAC", "Abacus", "UNIVAC",
                "Abacus");
        this.addQuestionRandom (q145);

        QuestionRandom q146 = new QuestionRandom (
                "O tempo m??dio necess??rio para o setor correto de um disco " +
                        "chegar ao cabe??ote de leitura e grava????o ?? _____",
                "Tempo de inatividade", "Tempo de busca",
                "Atraso de rota????o", "Tempo de acesso",
                " Atraso rotacional ");
        this.addQuestionRandom (q146);

        QuestionRandom q147 = new QuestionRandom (
                "Um n??mero que ?? usado para controlar a forma de outro n??mero" +
                        " ?? conhecido como",
                "Mapa", "M??scara", "Mamtossa", "Marcador",
                "M??scara");
        this.addQuestionRandom (q147);

        QuestionRandom q148 = new QuestionRandom (
                "Um microcomputador de uso ??nico de uso geral projetado " +
                        "para ser operado por uma pessoa por vez ??",
                "Computador de uso especial", "KIPS",
                "M", "PC",
                "PC") ;
        this.addQuestionRandom (q148);

        QuestionRandom q149 = new QuestionRandom (
                "ASCII significa",
                "C??digo da American Scientific para interc??mbio de informa????es",
                "C??digo cient??fico multifacetado para interc??mbio de informa????es",
                "C??digo da American Scientific para interc??mbio de informa????es",
                "C??digo da American Scientific para interc??mbio de informa????es",
                " C??digo padr??o americano para interc??mbio de informa????es ");
        this.addQuestionRandom (q149);

        QuestionRandom q150 = new QuestionRandom (
                "Qual dispositivo de opera????o do computador dispensa o uso do teclado?",
                "Joystick", "Caneta de luz", "Mouse", "Touch",
                "Mouse");
        this.addQuestionRandom (q150);

        QuestionRandom q151 = new QuestionRandom (
                "O microcomputador, Intel MCS-80 ?? baseado no amplamente utilizado Intel",
                "microprocessador 8080", "microprocessador 8085",
                "microprocessador 8086", "microprocessador 8082",
                "microprocessador 8080");
        this.addQuestionRandom (q151);

        QuestionRandom q152 = new QuestionRandom (
                "Que ?? uma linguagem de alto n??vel orientada ?? m??quina para " +
                        "as m??quinas da s??rie GEC 4080.",
                "LOGO", "SNOBOL", "Babbage", "ALGOL",
                "Babbage");
        this.addQuestionRandom (q152);

        QuestionRandom q153 = new QuestionRandom (
                "Um programa que ?? empregado no desenvolvimento, reparo " +
                        "ou aprimoramento de outros programas ?? conhecido como",
                "Software de sistema", "Ferramenta de softwa" +
                "re", "Programa de aplicativos", "Programa utilit??rio",
                "Ferramenta de software ");
        this.addQuestionRandom (q153);

        QuestionRandom q154 = new QuestionRandom (
                "Qualquer dispositivo de armazenamento adicionado a um computador " +
                        "al??m do armazenamento principal imediatamente utiliz??vel ?? conhecido como",
                "Disquete", "Disco r??gido",
                "Armazenamento de backup", "Cart??o perfurado",
                "Armazenamento de backup") ;
        this.addQuestionRandom (q154);

        QuestionRandom q155 = new QuestionRandom (
                "Qual dispositivo de sa??da ?? usado para traduzir informa????es " +
                        "de um computador para a forma pict??rica no papel.",
                "Mouse", "Plotter", "Painel de toque", "Perfurador de cart??o",
                "Plotter");
        this.addQuestionRandom (q155);

        QuestionRandom q156 = new QuestionRandom (
                "A lista de instru????es codificadas ?? chamada",
                "Programa de computador", "Algoritmo",
                "Fluxograma", "Programas utilit??rios",
                "Programa de computador");
        this.addQuestionRandom (q156);

        QuestionRandom q157 = new QuestionRandom (
                "A t??cnica usada pelos c??digos para converter um sinal " +
                        "anal??gico em um fluxo de bits digital ?? conhecida como",
                "Modula????o de c??digo de pulso", "Esticador de pulso",
                "Processamento de consulta", "Gerenciamento de fila",
                "Pulso modula????o de c??digo ");
        this.addQuestionRandom (q157);

        QuestionRandom q158 = new QuestionRandom (
                "Um dispositivo de entrada ??ptica que interpreta " +
                        "marcas de l??pis em m??dia de papel ??",
                "O.M.R", "Leitor de cart??o perfurado",
                "Scanners ??pticos", "Fita magn??tica",
                "O.M.R");
        this.addQuestionRandom (q158);

        QuestionRandom q159 = new QuestionRandom (
                "A vantagem mais importante de um IC ?? sua",
                "F??cil substitui????o em caso de falha de circuito",
                "Confiabilidade extremamente alta",
                "Custo reduzido",
                "Baixo consumo de energia",
                "Confiabilidade extremamente alta") ;
        this.addQuestionRandom (q159);

        QuestionRandom q160 = new QuestionRandom (
                "Divis??o de data ?? a terceira divis??o de um programa _____.",
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
                        "sistema de c??digo diferente do normal ?? conhecido como",
                "Encoder", "Simulation", "Emulator", "Coding",
                "Encoder");
        this.addQuestionRandom (q162);

        QuestionRandom q163 = new QuestionRandom (
                "Um dispositivo projetado para ler informa????es codificadas em um " +
                        "pequeno cart??o de pl??stico ??",
                "Fita magn??tica",
                "Leitor de crach??",
                "Perfurador de fita",
                "Perfurador de cart??o",
                "Leitor de crach??");
        this.addQuestionRandom (q163);

        QuestionRandom q164 = new QuestionRandom (
                "Um computador h??brido usa um _____ para converter sinais digitais" +
                        " de um computador em sinais anal??gicos.",
                "Modulador", "Demodulador", "Modem", "Decodificador",
                "Modem");
        this.addQuestionRandom (q164);

        QuestionRandom q165 = new QuestionRandom (
                "Um grupo de fitas magn??ticas, v??deos ou terminais " +
                        "geralmente sob o controle de um mestre ??",
                "Cylinder", "Cluster", "Surface", "Track",
                "Cluster");
        this.addQuestionRandom (q165);

        QuestionRandom q166 = new QuestionRandom (
                "Qualquer dispositivo que realiza convers??o de sinal ??",
                "Modulador", "Modem", "Teclado", "Plotter",
                "Modulador");
        this.addQuestionRandom (q166);

        QuestionRandom q167 = new QuestionRandom (
                "C??digos que consistem em marcas claras e escuras que podem " +
                        "ser lidas opticamente s??o conhecidos como",
                "Mnem??nicos", "C??digo de barras",
                "Decodificador", "Todos os anteriores",
                "C??digo de barras");
        this.addQuestionRandom (q167);

        QuestionRandom q168 = new QuestionRandom (
                "Um tipo de canal usado para conectar um processador central " +
                        "e perif??ricos que usa multiplexa????o ?? conhecido como",
                "Modem", "Rede",
                "Multiplexador", "Todos os anteriores",
                "Multiplexador") ;
        this.addQuestionRandom (q168);

        QuestionRandom q169 = new QuestionRandom (
                "A primeira gera????o de computadores dispon??veis foi " +
                        "baseada nos microprocessadores de bits.",
                "4", "8", "16", "64",
                "8");
        this.addQuestionRandom (q169);

        QuestionRandom q170 = new QuestionRandom (
                "O quadro completo dos dados armazenados no banco de " +
                        "dados ?? conhecido como",
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
                "Um idioma que est?? perto de ser usado no computador ??",
                "Linguagem de alto n??vel", "Linguagem de montagem",
                "Linguagem de baixo n??vel", "Todas as anteriores",
                "Baixo- linguagem de n??vel ");
        this.addQuestionRandom (q172);

        QuestionRandom q173 = new QuestionRandom (
                "Que ?? uma unidade que representa os bits n??o discretos.",
                "Baud", "Byte", "Bit", "Todos os anteriores",
                "Baud");
        this.addQuestionRandom (q173);

        QuestionRandom q174 = new QuestionRandom (
                "O dispositivo que pode alimentar e aceitar dados de um computador ??",
                "ALU", "CPU",
                "Dispositivo de entrada-sa??da", "Todos os anteriores",
                "Entrada-sa??da dispositivo");
        this.addQuestionRandom (q174);

        QuestionRandom q175 = new QuestionRandom (
                "O pessoal que lida com o computador e seu gerenciamento " +
                        "juntos s??o chamados de",
                "Software", "Humanware",
                "Firmware", "Hardware",
                "Humanware");
        this.addQuestionRandom (q175);

        QuestionRandom q176 = new QuestionRandom (
                "Um computador digital moderno tem",
                "Velocidade extremamente alta", "Grande mem??ria",
                "Matriz quase ilimitada", "Todas as anteriores",
                "Todas as anteriores");
        this.addQuestionRandom (q176);

        QuestionRandom q177 = new QuestionRandom (
                "Qual dos seguintes pode armazenar informa????es na forma " +
                        "de cavidades microsc??picas em discos de metal.",
                "Discos de laser", "Cassetes de fita",
                "Cartucho de RAM", "Cart??es perfurados",
                "Discos de laser" );
        this.addQuestionRandom (q177);

        QuestionRandom q178 = new QuestionRandom (
                "Um dispositivo para converter impress??es manuscritas em " +
                        "caracteres codificados e coordenadas posicionais para entrada em " +
                        "um computador ??",
                "Touch panel", "Mouse", "Wand", "Writing tablet",
                "Writing tablet") ;
        this.addQuestionRandom (q178);

        QuestionRandom q179 = new QuestionRandom (
                "Um sistema de armazenamento para pequenas quantidades de dados ??",
                "Cart??o magn??tico", "Fita magn??tica",
                "Cart??o perfurado", "Leitor de marca ??ptica",
                "Cart??o magn??tico");
        this.addQuestionRandom (q179);

        QuestionRandom q180 = new QuestionRandom (
                "Qual ?? outro nome para linguagem funcional?",
                "M??quina", "Linguagem de aplicativo",
                "Linguagem de baixo n??vel", "Linguagem de alto n??vel",
                "Linguagem de aplicativo");
        this.addQuestionRandom (q180);

        QuestionRandom q181 = new QuestionRandom (
                "Compiladores e int??rpretes s??o eles pr??prios",
                "Linguagem de alto n??vel", "C??digos",
                "Programas", "Mnem??nicos",
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
                        "e ?? usado para apontar pontos na tela de v??deo.",
                "Mouse", "Caneta de luz", "Joystick", "Plotter",
                "Caneta de luz ");
        this.addQuestionRandom (q183);

        QuestionRandom q184 = new QuestionRandom (
                "Uma nota????o usada para expressar claramente no algoritmo ?? conhecida como",
                "Linguagem de algoritmo", "Linguagem de montagem",
                "Linguagem de m??quina", "Linguagem de alto n??vel",
                "Linguagem de algoritmo");
        this.addQuestionRandom (q184);

        QuestionRandom q185 = new QuestionRandom (
                "Compacta????o de dados digitais ?? um armazenamento eficiente",
                "Buffer", "CPU", "Packing", "Field",
                "Packing");
        this.addQuestionRandom (q185);

        QuestionRandom q186 = new QuestionRandom (
                "Um sistema operacional destinado ao uso em sistemas " +
                        "baseados em microprocessadores que suportam um ??nico usu??rio ??",
                "PC-DOS", "MS-DOS", "UNIX", "CP / M",
                "CP / M ");
        this.addQuestionRandom (q186);

        QuestionRandom q187 = new QuestionRandom (
                "Qual linguagem de programa????o ?? baseada no Algol 60.",
                "PILOT", "SNOBOL", "ADA", "simula",
                "simula");
        this.addQuestionRandom (q187);

        QuestionRandom q188 = new QuestionRandom (
                "A mem??ria do computador consiste em",
                "RAM", "ROM", "PROM", "Todas as anteriores",
                "Todas as anteriores");
        this.addQuestionRandom (q188);

        QuestionRandom q189 = new QuestionRandom (
                "O caminho pelo qual a comunica????o ?? alcan??ada entre o " +
                        "processador central e outros dispositivos ?? chamado",
                "Trilha de auditoria", "Rede", "Barramento", "Canal",
                "Barramento");
        this.addQuestionRandom (q189);

        QuestionRandom q190 = new QuestionRandom (
                "Um sistema aut??nomo que produz uma p??gina de sa??da impressa por vez ??",
                "Impressora de p??gina", "Impressora de linha",
                "Impressora a laser", "Impressora matricial",
                "Impressora de p??gina" );
        this.addQuestionRandom (q190);

        QuestionRandom q191 = new QuestionRandom (
                "Uma mem??ria que n??o muda seu conte??do sem causas externas ?? conhecida como",
                "Mem??ria din??mica", "Mem??ria est??tica",
                "RAM", "EEPROM",
                "Mem??ria est??tica");
        this.addQuestionRandom (q191);

        QuestionRandom q192 = new QuestionRandom (
                "O boletim e a lista de m??rito formam os",
                "Dados de sa??da", "Processamento de dados",
                "Processamento central", "Dados de entrada",
                "Dados de sa??da");
        this.addQuestionRandom (q192);

        QuestionRandom q193 = new QuestionRandom (
                "Um n??mero que ?? armazenado e processado, mas n??o na forma" +
                        " padr??o exponencial ?? chamado",
                "N??mero de ponto flutuante", "N??mero de ponto fixo",
                "N??mero octal", "N??mero decimal",
                "Ponto fixo n??mero");
        this.addQuestionRandom (q193);

        QuestionRandom q194 = new QuestionRandom (
                "Uma mem??ria que cont??m micro programas ??",
                "Mem??ria central", "ROM", "RAM", "Mem??ria de controle",
                "ROM");
        this.addQuestionRandom (q194);

        QuestionRandom q195 = new QuestionRandom (
                "Um dispositivo inventado pelo Dr. Bobeck em 1966, para" +
                        " armazenamento em massa de dados ??",
                "Fita de papel perfurada", "Armazenamento de bolha magn??tica",
                "Fita magn??tica", "Disco magn??tico",
                "Bolha magn??tica armazenar");
        this.addQuestionRandom (q195);

        QuestionRandom q196 = new QuestionRandom (
                "A organiza????o e a interconex??o dos v??rios componentes de um" +
                        " sistema de computador ??",
                "Arquitetura", "Redes", "Gr??ficos", "Projetando",
                "Arquitetura");
        this.addQuestionRandom (q196);

        QuestionRandom q197 = new QuestionRandom (
                "Qual das alternativas a seguir ?? a codifica????o de dados para que " +
                        "n??o possam ser facilmente compreendidos se interceptados.",
                "Barcode", "Decoder", "Encryption", "Mnemonics",
                "Encryption") ;
        this.addQuestionRandom (q197);

        QuestionRandom q198 = new QuestionRandom (
                "RAM ?? usada como mem??ria curta porque ??",
                "Vol??til", "Tem pequena capacidade",
                "?? muito caro", "?? program??vel",
                "Vol??til");
        this.addQuestionRandom (q198);

        QuestionRandom q199 = new QuestionRandom(
                "Um computador eletr??nico moderno ?? uma m??quina que se destina a",
                "Fazendo c??lculos matem??ticos r??pidos",
                "Armazenamento de entrada, manipula????o de sa??da de dados"
                ,"Processamento eletr??nico de dados",
                "Executar tarefas repetitivas com precis??o",
                "Armazenamento de entrada, manipula????o de sa??da de dados");
        this.addQuestionRandom(q199);

        QuestionRandom q200 = new QuestionRandom (
                "Qual ?? um dispositivo que transforma informa????es em formato digital?",
                "Modem", "Digitalizador", "Mouse", "Caneta de luz",
                "Digitalizador");
        this.addQuestionRandom (q200);

        QuestionRandom q201 = new QuestionRandom (
                "Qual m??todo de backup ?? o mais r??pido e requer a menor quantidade de " +
                        "espa??o de armazenamento de backup?",
                "Di??rio", "Normal", "Diferencial", "Incremental",
                "Incremental");
        this.addQuestionRandom (q201);

        QuestionRandom q202 = new QuestionRandom (
                "Verificar o disco verifica e corrige ____.",
                "Unidades de fita", "Unidades de disco r??gido",
                "Unidades de CD-ROM", "Unidades de DVD-ROM",
                "Unidades de disco r??gido");
        this.addQuestionRandom (q202);

        QuestionRandom q203 = new QuestionRandom (
                "Onde est?? localizado o comando DIR?",
                "C: | WINDOWS", "COMMAND.COM",
                "C: | WINDOWS | SYSTEM", "C: | WINDOWS | COMMAND",
                "COMMAND. COM");
        this.addQuestionRandom (q203);

        QuestionRandom q204 = new QuestionRandom (
                "Qual comando permite visualizar ou editar arquivos de configura????o?",
                "SYSEDIT", "REGEDIT",
                "CFGEDIT", "AUTOEDIT", "SYSEDIT");
        this.addQuestionRandom (q204);

        QuestionRandom q205 = new QuestionRandom (
                "Qual utilit??rio ?? o melhor para editar o registro do Windows 95?",
                "Editar", "Regedit",
                "Reged32", "Gerenciador de Dispositivos",
                "Regedit");
        this.addQuestionRandom (q205);

        QuestionRandom q206 = new QuestionRandom (
                "Quais arquivos ir??o determinar a configura????o de inicializa????o" +
                        " m??ltipla do Windows 9x?",
                "IO.SYS", "SYSTEM.INI", "MSDOS.SYS", "CONFIG.SYS",
                "MSDOS.SYS") ;
        this.addQuestionRandom (q206);

        QuestionRandom q207 = new QuestionRandom (
                "Quais pressionamentos de tecla alternam um usu??rio entre aplicativos " +
                        "em execu????o simult??nea no Windows?",
                "FN + TAB", "ALT + TAB", "CTRL + TAB", "SHIFT + TAB",
                "ALT + TAB ");
        this.addQuestionRandom (q207);

        QuestionRandom q208 = new QuestionRandom (
                "Qual ?? o tipo de arquivo do registro do Windows 9x?",
                "Arquivo de texto simples", "Banco de dados relacional",
                "Banco de dados hier??rquico", "Modelo de planilha",
                "Banco de dados hier??rquico");
        this.addQuestionRandom (q208);

        QuestionRandom q209 = new QuestionRandom (
                "Quais dessas afirma????es seriam encontradas no arquivo autoexec.bat?",
                "FILES = 40", "PATH = C: \\;",
                "DOS = HIGH, UMB", "DEVICE = HIMEM.SYS ",
                " PATH = C: \\; ");
        this.addQuestionRandom (q209);

        QuestionRandom q210 = new QuestionRandom(
                "Qual ?? o comando apropriado para instalar o Console de recupera????o" +
                        " do Windows 2000 como uma op????o de inicializa????o se o CD Rom for a unidade E?",
                "E:|i386\\SETUP.EXE\\CONSOLE",
                "E:|i386\\CONSOLE.EXE\\INSTALL",
                "E:|i386\\WINNT32.EXE\\CMDCONS",
                "E:|i386\\WIN2000.EXE\\RECOVERY",
                "E:|i386\\WINNT32.EXE\\CMDCONS");
        this.addQuestionRandom(q210);

        QuestionRandom q211 = new QuestionRandom (
                "A parte da instru????o de n??vel de m??quina, que informa ao processador" +
                        " central o que deve ser feito, ??",
                "C??digo de opera????o", "Endere??o",
                "Localizador", "Flip-Flop",
                "Opera????o c??digo ");
        this.addQuestionRandom (q211);

        QuestionRandom q212 = new QuestionRandom (
                "Qual dos seguintes se refere ?? mem??ria associativa?",
                "O endere??o dos dados ?? gerado pela CPU",
                "O endere??o dos dados ?? fornecido pelos usu??rios",
                "n??o h?? necessidade para um endere??o, isto ??, os dados " +
                        "s??o usados ??????como um endere??o ",
                " os dados s??o acessados ??????sequencialmente ",
                " n??o h?? necessidade de um endere??o, ou seja, os dados " +
                        "s??o usados ??????como um endere??o ");
        this.addQuestionRandom (q212);

        QuestionRandom q213 = new QuestionRandom (
                "Para evitar a condi????o de corrida, o n??mero de processos que" +
                        " podem estar simultaneamente dentro de sua se????o cr??tica ??",
                "8", "16", "1", "0",
                "1");
        this.addQuestionRandom (q213);

        QuestionRandom q214 = new QuestionRandom (
                "Um programa de sistema que combina os m??dulos compilados " +
                        "separadamente de um programa em uma forma adequada para execu????o",
                "assembler", "assembler",
                "cross compiler", "load and go",
                "linking loader" );
        this.addQuestionRandom (q214);

        QuestionRandom q215 = new QuestionRandom (
                "Processo ??",
                "programa em linguagem de alto n??vel mantido no disco",
                "conte??do da mem??ria principal",
                "um programa em execu????o",
                "um trabalho na mem??ria secund??ria",
                "um programa em execu????o" );
        this.addQuestionRandom (q215);

        QuestionRandom q216 = new QuestionRandom (
                "Estrutura de endere??amento",
                "define o m??todo fundamental para determinar endere??os de operandos eficazes",
                "s??o varia????es no uso de estruturas de endere??amento fundamentais " +
                        "ou algumas a????es associadas relacionadas ao endere??amento",
                "executa as opera????es indicadas em dois registros r??pidos da m??quina e " +
                        "deixam o resultado em um dos registros ",
                " todas as anteriores ",
                " define o m??todo fundamental de determina????o dos" +
                        " endere??os efetivos dos operandos ");
        this.addQuestionRandom (q216);

        QuestionRandom q217 = new QuestionRandom(
                "tudo acima",
                "?? um dispositivo de mem??ria de hardware que denota a localiza????o " +
                        "da instru????o atual sendo executada",
                "?? um grupo de circuitos el??tricos (hardware), que executa a inten????o " +
                        "de instru????es buscadas na mem??ria",
                "cont??m o endere??o do local da mem??ria que deve ser lido ou armazenado em",
                "cont??m uma c??pia do local de mem??ria designado especificado pelo MAR " +
                        "ap??s uma \"leitura\" or the new contents of the memory prior to a \"write\"",
                "contains a copy of the designated memory location specified" +
                        " by the MAR after a \"read\" or the new contents of the memory prior" +
                        " to a \"write\"");
        this.addQuestionRandom(q217);

        QuestionRandom q218 = new QuestionRandom (
                "A estrat??gia de permitir que processos logicamente execut??veis" +
                        " ??????sejam temporariamente suspensos ?? chamada de",
                "agendamento preemptivo", "agendamento n??o preemptivo",
                "trabalho mais curto primeiro", "trabalho mais curto primeiro",
                "agendamento preemptivo ");
        this.addQuestionRandom (q218);

        QuestionRandom q219 = new QuestionRandom (
                "O algoritmo LRU",
                "sai das p??ginas que foram usadas recentemente",
                "sai das p??ginas que n??o foram usadas recentemente",
                "sai das p??ginas que foram menos usadas recentemente",
                "sai das p??ginas a primeira p??gina em uma determinada ??rea ",
                " p??ginas que foram menos usadas recentemente ");
        this.addQuestionRandom (q219);

        QuestionRandom q220 = new QuestionRandom (
                "Qual dos seguintes softwares de sistema faz o trabalho " +
                        "de mesclar os registros de dois arquivos em um?",
                "Software de seguran??a",
                "Programa utilit??rio",
                "Software de rede",
                "Sistema de documenta????o",
                "Utilit??rio programa");
        this.addQuestionRandom (q220);

        QuestionRandom q221 = new QuestionRandom (
                "Fork ??",
                "o despacho de uma tarefa",
                "a cria????o de um novo trabalho",
                "a cria????o de um novo processo",
                "aumentando a prioridade de uma tarefa",
                "a cria????o de um novo processo ");
        this.addQuestionRandom (q221);

        QuestionRandom q222 = new QuestionRandom (
                "Thrashing",
                "?? uma consequ??ncia natural dos sistemas de mem??ria virtual",
                "sempre pode ser evitado trocando",
                "sempre ocorre em computadores grandes",
                "pode ??????ser causado por algoritmos de pagina????o deficientes",
                "pode ser causado por algoritmos de pagina????o deficientes ");
        this.addQuestionRandom (q222);

        QuestionRandom q223 = new QuestionRandom (
                "O estado do supervisor ??",
                "nunca usado",
                "inserido pelos programas quando entram no processador",
                "necess??rio para realizar qualquer I / O",
                "permitido apenas para o sistema operacional",
                "apenas permitido para o sistema operacional ");
        this.addQuestionRandom (q223);

        QuestionRandom q224 = new QuestionRandom (
                "Qual das seguintes etapas de instru????o, seria escrito dentro " +
                        "da caixa em forma de diamante, de um fluxograma?",
                "S = B - C", "IS A <10", "PRINT A", "DATA X, 4Z",
                "IS A <10");
        this.addQuestionRandom (q224);

        QuestionRandom q225 = new QuestionRandom (
                "Qual das seguintes afirma????es ?? falsa?",
                "A t??cnica de compacta????o de armazenamento envolve mover todas as " +
                        "??reas ocupadas de armazenamento para uma extremidade ou " +
                        "outra do armazenamento principal",
                "a compacta????o n??o envolve realoca????o de programas",
                "compacta????o tamb??m ?? conhecida como coleta de lixo",
                "o sistema deve parar tudo enquanto executa a compacta????o",
                "a compacta????o n??o envolve realoca????o de programas");
        this.addQuestionRandom (q225);

        QuestionRandom q226 = new QuestionRandom (
                "Comunica????o entre processos",
                "?? necess??ria para todos os processos",
                "geralmente ?? feita por meio de unidades de disco",
                "nunca ?? necess??rio",
                "permite que os processos sincronizem a atividade",
                "permite que os processos sincronizem a atividade") ;
        this.addQuestionRandom (q226);

        QuestionRandom q227 = new QuestionRandom (
                "Qual das fun????es a seguir ?? (s??o) realizada (s) pelo carregador",
                "alocar espa??o na mem??ria para os programas e resolver refer??ncias " +
                        "simb??licas entre conjuntos de objetos",
                "ajustar todos os locais dependentes de endere??o, como constantes " +
                        "de endere??o , para corresponder ao espa??o alocado ",
                " coloque fisicamente as instru????es da m??quina e os dados na mem??ria ",
                " Todas as anteriores ",
                " Todas as anteriores ");
        this.addQuestionRandom (q227);

        QuestionRandom q228 = new QuestionRandom (
                "Sistemas amig??veis ??????s??o:",
                "necess??rios para programa????o orientada a objetos",
                "f??cil de desenvolver",
                "comum entre sistemas operacionais de mainframe tradicionais",
                "tornando-se mais comum",
                "tornando-se mais comum" );
        this.addQuestionRandom (q228);

        QuestionRandom q229 = new QuestionRandom (
                "Qual dos seguintes modos de endere??amento facilita o " +
                        "acesso a um operando cuja localiza????o ?? definida em rela????o " +
                        "ao in??cio da estrutura de dados em que aparece?",
                "Ascendente",
                "ordena????o",
                "??ndice",
                "indireto",
                "??ndice");
        this.addQuestionRandom (q229);

        QuestionRandom q230 = new QuestionRandom (
                "Ao executar o DOS em um PC, qual comando seria usado para " +
                        "duplicar o disquete inteiro?",
                "COPY", "DISKCOPY", "CHKDSK", "TYPE",
                "DISKCOPY");
        this.addQuestionRandom (q230);

        QuestionRandom q231 = new QuestionRandom (
                "Memory",
                "?? um dispositivo que realiza uma sequ??ncia de opera????es" +
                        " especificadas por instru????es na mem??ria.",
                "?? o dispositivo onde as informa????es s??o armazenadas",
                "?? uma sequ??ncia de instru????es",
                "?? tipicamente caracterizado por processamento interativo e divis??o de" +
                        " tempo do tempo da CPU para permitir uma resposta r??pida a cada usu??rio. ",
                " ?? o dispositivo onde a informa????o ?? armazenada ");
        this.addQuestionRandom (q231);

        QuestionRandom q232 = new QuestionRandom (
                "Qual das seguintes regras exclui o uso de IR PARA?",
                "Fluxograma", "HIPO-DIAGRAMAS",
                "Diagrama de Nassi-Shneiderman", "Todos os anteriores",
                "Diagrama de Nassi-Shneiderman ");
        this.addQuestionRandom (q232);

        QuestionRandom q233 = new QuestionRandom (
                "Um programa de sistema que configura um programa " +
                        "execut??vel na mem??ria principal pronto para execu????o ??",
                "assembler", "linker", "loader", "compiler",
                "loader");
        this.addQuestionRandom (q233);

        QuestionRandom q234 = new QuestionRandom (
                "Um programa de sistema que configura um programa " +
                        "execut??vel na mem??ria principal pronto para execu????o ??",
                "assembler", "linker", "loader", "compiler",
                "loader");
        this.addQuestionRandom (q234);

        QuestionRandom q235 = new QuestionRandom (
                "Quais dos itens a seguir s??o carregados na mem??ria principal " +
                        "quando o computador ?? inicializado?",
                "Instru????es de comando interno", "instru????es de comando externo",
                "programas utilit??rios", "instru????es de processamento de texto",
                "comando interno instru????es ");
        this.addQuestionRandom (q235);

        QuestionRandom q236 = new QuestionRandom (
                "O algoritmo FIFO",
                "executa primeiro o trabalho que entrou na fila por ??ltimo",
                "executa primeiro o trabalho que entrou na fila",
                "executa primeiro o trabalho que est?? h?? mais tempo na fila" ,
                "executa primeiro o trabalho com o m??nimo de necessidades do processador",
                "executa primeiro o trabalho que entrou primeiro na fila");
        this.addQuestionRandom (q236);

        QuestionRandom q237 = new QuestionRandom (
                "Qual ?? o nome dado ?? cole????o organizada de software que" +
                        " controla a opera????o geral de um computador?",
                "Sistema de trabalho", "Sistema perif??rico",
                "Sistema operacional", "Sistema de controle",
                " Sistema operacional");
        this.addQuestionRandom (q237);

        QuestionRandom q238 = new QuestionRandom (
                "O princ??pio da localidade de refer??ncia justifica o uso de",
                "reenter??vel", "n??o reutiliz??vel",
                "mem??ria virtual", "mem??ria cache",
                "mem??ria cache");
        this.addQuestionRandom (q238);

        QuestionRandom q239 = new QuestionRandom (
                "O registro ou local da mem??ria principal que cont??m o" +
                        " endere??o efetivo do operando ?? conhecido como",
                "ponteiro", "registro indexado", "localiza????o especial",
                "bloco de rascunho",
                "ponteiro");
        this.addQuestionRandom (q239);

        QuestionRandom q240 = new QuestionRandom (
                "A base de dados de c??digo de montagem est?? associada a",
                "vers??o em linguagem de montagem do programa que ?? criada pela" +
                        " fase de gera????o de c??digo e ?? inserida na fase de montagem.",
                "Uma tabela permanente de regras de decis??o no forma de padr??es" +
                        " para combinar com a tabela de s??mbolos uniforme para " +
                        "descobrir a estrutura sint??tica. ",
                " consiste em uma lista completa ou parcial ou os tokens" +
                        " conforme aparecem no programa. Criado por an??lise lexical e" +
                        " usado para an??lise e interpreta????o de sintaxe. ",
                " uma tabela permanente que lista todas as palavras-chave e s" +
                        "??mbolos especiais da linguagem em forma simb??lica. ",
                " vers??o em linguagem de montagem do programa que ?? criada pela" +
                        " fase de gera????o de c??digo e ?? entrada para a fase de montagem. ");
        this.addQuestionRandom (q240);

        QuestionRandom q241 = new QuestionRandom (
                "Thrashing pode ser evitado se",
                "as p??ginas, pertencentes ao conjunto de trabalho dos " +
                        "programas, est??o na mem??ria principal",
                "a velocidade da CPU ?? aumentada",
                "a velocidade do processador I / O ?? aumentado ",
                " todas as op????es anteriores ",
                " as p??ginas, pertencentes ao conjunto de trabalho dos" +
                        " programas, est??o na mem??ria principal ");
        this.addQuestionRandom (q241);

        QuestionRandom q242 = new QuestionRandom(
                "Ao analisar a compila????o do programa PL / I, " +
                        "o termo\"An??lise lexical\" est?? associado com",
                "reconhecimento de constru????es sint??ticas b??sicas por meio de redu????es.",
                "reconhecimento de elementos b??sicos e cria????o de s??mbolos uniformes",
                "cria????o de mais matriz opcional.",
                "uso de processador de macro para produzir c??digo de montagem mais otimizado",
                "reconhecimento de elementos b??sicos e cria????o de s??mbolos uniformes");
        this.addQuestionRandom(q242);

        QuestionRandom q243 = new QuestionRandom (
                "A resolu????o de s??mbolos definidos externamente ?? realizada por",
                "Linker", "Loader",
                "Compiler", "Assembler",
                "Linker");
        this.addQuestionRandom (q243);

        QuestionRandom q244 = new QuestionRandom (
                "Gera????o de sistema:",
                "?? sempre muito simples",
                "?? sempre muito dif??cil",
                "varia em dificuldade entre sistemas",
                "requer ferramentas extensas para ser compreens??vel",
                "varia em dificuldade entre sistemas" );
        this.addQuestionRandom (q244);

        QuestionRandom q245 = new QuestionRandom(
                "O Registro de Endere??o de Mem??ria",
                "?? um dispositivo de mem??ria de hardware que denota a localiza????o " +
                        "da instru????o atual sendo executada.",
                "?? um grupo de circuitos el??tricos (hardware), que executa a " +
                        "inten????o de instru????es buscadas na mem??ria.",
                "cont??m o endere??o do local da mem??ria que deve ser lido ou armazenado.",
                "cont??m uma c??pia do local de mem??ria designado especificado pelo" +
                        " MAR ap??s uma \"leitura\" ou o novo conte??do da mem??ria antes de" +
                        " uma \"escrita\".",
                "cont??m o endere??o do local da mem??ria que deve ser lido ou armazenado em.");
        this.addQuestionRandom(q245);

        QuestionRandom q246 = new QuestionRandom (
                "Em sistemas de mem??ria virtual, tradu????o de endere??o din??mico",
                "?? o hardware necess??rio para implementar pagina????o",
                "armazena p??ginas em um local espec??fico no disco",
                "?? in??til quando a troca ?? usada",
                "faz parte do algoritmo de pagina????o do sistema operacional ",
                " ?? o hardware necess??rio para implementar a pagina????o ");
        this.addQuestionRandom (q246);

        QuestionRandom q247 = new QuestionRandom (
                "Fragmenta????o do sistema de arquivos",
                "ocorre apenas se o sistema de arquivos for usado incorretamente",
                "sempre pode ser evitado",
                "pode ??????ser removido temporariamente por compacta????o",
                "?? uma caracter??stica de todos os sistemas de arquivos ",
                " pode ser removido temporariamente por compacta????o ");
        this.addQuestionRandom (q247);

        QuestionRandom q248 = new QuestionRandom (
                "Um programa n??o realoc??vel ?? aquele que",
                "n??o pode ser executado em qualquer ??rea de armazenamento " +
                        "que n??o seja aquela designada para ele no momento de" +
                        " sua codifica????o ou tradu????o.",
                "Consiste em um programa e informa????es relevantes para a sua realoca????o. ",
                " pode ele mesmo realizar a realoca????o de suas partes sens??veis ao endere??o. ",
                " todas as op????es acima ",
                " n??o podem ser executadas em qualquer ??rea de armazenamento " +
                        "diferente da designada para ele no momento de sua codifica????o ou tradu????o. ");
        this.addQuestionRandom (q248);

        QuestionRandom q249 = new QuestionRandom (
                "Quais dos seguintes s??o (s??o) Processadores de linguagem",
                "monta", "compiladores", "int??rpretes", "Todos os anteriores",
                "Todos os anteriores");
        this.addQuestionRandom (q249);

        QuestionRandom q250 = new QuestionRandom (
                "Em qual modo de endere??amento o endere??o efetivo do" +
                        " operando ?? o conte??do de um registro especificado na " +
                        "instru????o e ap??s acessar o operando, o conte??do deste registro " +
                        "?? incrementado para apontar para o pr??ximo item na lista? ",
                " endere??amento de ??ndice ",
                " endere??amento indireto ",
                " incremento autom??tico ",
                " decremento autom??tico ",
                " incremento autom??tico ");
        this.addQuestionRandom (q250);

        QuestionRandom q251 = new QuestionRandom(
                "O esquema de aloca????o de mem??ria est?? sujeito a \"external\" fragmenta????o ??",
                "segmenta????o","trocando","pagina????o de demanda pura",
                "m??ltiplas parti????es fixas cont??guas",
                "segmenta????o");
        this.addQuestionRandom(q251);

        QuestionRandom q252 = new QuestionRandom (
                "Ao trabalhar com o MS-DOS, qual comando voc?? usar?? para transferir" +
                        " um arquivo espec??fico de um disco para outro?",
                "DISKCOPY", "COPY", "RENAME", "FORMAT",
                "COPY ");
        this.addQuestionRandom (q252);

        QuestionRandom q253 = new QuestionRandom (
                "Qual ?? o nome do sistema operacional do laptop chamado MacLite?",
                "Windows", "DOS", "MS-DOS", "OZ",
                "OZ");
        this.addQuestionRandom (q253);

        QuestionRandom q254 = new QuestionRandom (
                "Em qual modo de endere??amento o conte??do de um registro especificado " +
                        "na instru????o ?? diminu??do primeiro e, em seguida, esse conte??do" +
                        " ?? usado como o endere??o efetivo dos operandos?",
                "Endere??amento de ??ndice", "endere??amento indireto",
                "auto incremento", "auto decremento",
                "auto decremento");
        this.addQuestionRandom (q254);

        QuestionRandom q255 = new QuestionRandom (
                "Qual ?? o nome dado aos valores que s??o fornecidos automaticamente" +
                        " pelo software para reduzir o pressionamento de teclas e melhorar a" +
                        " produtividade do usu??rio do computador?",
                "Valores definidos", "Valores fixos", "Valores padr??o",
                "Especial valores ",
                " Valores padr??o ");
        this.addQuestionRandom (q255);

        QuestionRandom q256 = new QuestionRandom (
                "Roubo de p??gina",
                "?? um sinal de um sistema eficiente",
                "est?? pegando frames de p??gina de outros conjuntos de trabalho",
                "deve ser o objetivo do ajuste",
                "est?? ocupando espa??o em disco maior para p??ginas paginadas ",
                " est?? pegando frames de p??gina de outros conjuntos de trabalho ");
        this.addQuestionRandom (q256);

        QuestionRandom q257 = new QuestionRandom (
                "No MS-DOS 5.0, qual ?? o n??mero que atua como um c??digo para " +
                        "identificar exclusivamente o produto de software?",
                "MS", "DOS", "MS DOS", "5.0",
                "5.0 ");
        this.addQuestionRandom (q257);

        QuestionRandom q258 = new QuestionRandom (
                "Bug significa",
                "Um erro l??gico em um programa",
                "Um erro de sintaxe dif??cil em um programa",
                "Documentando programas usando uma ferramenta de documenta????o eficiente",
                "Todas as op????es acima",
                "Uma l??gica erro em um programa ");
        this.addQuestionRandom (q258);

        QuestionRandom q259 = new QuestionRandom (
                "Gerenciamento de mem??ria ??:",
                "n??o usado no sistema operacional moderno",
                "substitu??do por mem??ria virtual nos sistemas atuais",
                "n??o usado em sistemas de multiprograma????o",
                "cr??tico at?? mesmo para os sistemas operacionais mais simples",
                "cr??tico at?? mesmo para os sistemas operacionais mais simples");
        this.addQuestionRandom (q259);

        QuestionRandom q260 = new QuestionRandom (
                "O valor inicial do sem??foro que permite que apenas um " +
                        "dos muitos processos entre em suas se????es cr??ticas ??",
                "8", "1", "16", "0",
                "1") ;
        this.addQuestionRandom (q260);

        QuestionRandom q261 = new QuestionRandom(
                "As instru????es de registro para registro (RR)",
                "t??m ambos os operandos na loja principal.",
                "que realizam uma opera????o em um operando de registro e um operando" +
                        " que fica na loja principal, geralmente deixando o resultado" +
                        " no registro, exceto no caso de opera????o de loja quando " +
                        "tamb??m ?? escrito no local de armazenamento especificado.",
                "que realizam as opera????es indicadas em dois registros r??pidos da m??quina " +
                        "e deixar o resultado em um dos registros.",
                "tudo acima",
                "que realizam as opera????es indicadas em dois registros r??pidos do " +
                        "m??quina e deixar o resultado em um dos registradores.");
        this.addQuestionRandom(q261);

        QuestionRandom q262 = new QuestionRandom (
                "Uma falha de p??gina",
                "?? um erro ?? uma p??gina espec??fica",
                "ocorre quando um programa acessa uma p??gina da mem??ria",
                "?? um acesso a uma p??gina que n??o est?? atualmente na mem??ria",
                "?? um refer??ncia a uma p??gina pertencente a outro programa ",
                " ?? um acesso a uma p??gina que n??o est?? atualmente na mem??ria ");
        this.addQuestionRandom (q262);

        QuestionRandom q263 = new QuestionRandom (
                "Um algoritmo ?? melhor descrito como",
                "Uma linguagem de computador",
                "Um procedimento passo a passo para resolver um problema",
                "Um ramo da matem??tica",
                "Todas as anteriores",
                "Uma etapa procedimento passo a passo para resolver um problema ");
        this.addQuestionRandom (q263);

        QuestionRandom q264 = new QuestionRandom (
                "O processo de transfer??ncia de dados destinados a um dispositivo " +
                        "perif??rico para um disco (ou armazenamento intermedi??rio) " +
                        "para que possam ser transferidos para o perif??rico em um " +
                        "momento mais conveniente ou em massa, ?? conhecido como",
                "multiprograma????o" , "spool", "cache", "programa????o virtual",
                "spool");
        this.addQuestionRandom (q264);

        QuestionRandom q265 = new QuestionRandom (
                "Caches de bloco ou caches de buffer s??o usados",
                "para melhorar o desempenho do disco",
                "para lidar com interrup????es",
                "para aumentar a capacidade da mem??ria principal",
                "para acelerar a opera????o de leitura da mem??ria principal",
                "para melhorar o desempenho do disco");
        this.addQuestionRandom (q265);

        QuestionRandom q266 = new QuestionRandom (
                "Qual das seguintes afirma????es ?? falsa?",
                "Um tamanho de p??gina pequeno causa tabelas de p??ginas grandes",
                "a fragmenta????o interna ?? aumentada com p??ginas pequenas",
                "um tamanho de p??gina grande causa instru????es e dados que n??o ser" +
                        " referenciado trazido para o armazenamento prim??rio ",
                " As transfer??ncias de E / S s??o mais eficientes com p??ginas grandes ",
                " a fragmenta????o interna ?? aumentada com p??ginas pequenas ");
        this.addQuestionRandom (q266);

        QuestionRandom q267 = new QuestionRandom (
                "A a????o de analisar o programa de origem nas classes sint??ticas " +
                        "adequadas ?? conhecida como",
                "an??lise de sintaxe", "an??lise lexical",
                "an??lise de interpreta????o", "an??lise de sintaxe geral",
                "an??lise lexical") ;
        this.addQuestionRandom (q267);

        QuestionRandom q268 = new QuestionRandom (
                "Qual das alternativas a seguir n??o ?? verdadeira sobre a" +
                        " descri????o de uma tabela de decis??o?",
                "Uma tabela de decis??o ?? f??cil de modificar",
                "Uma tabela de decis??o ?? compreendida diretamente pelo computador",
                "Uma decis??o a tabela ?? de f??cil compreens??o ",
                " Todas as anteriores ",
                " Uma tabela de decis??o ?? compreendida diretamente pelo computador ");
        this.addQuestionRandom (q268);

        QuestionRandom q269 = new QuestionRandom (
                "programas Cavalo de Tr??ia",
                "s??o programas leg??timos que permitem acesso n??o autorizado"
                , "geralmente n??o funcionam",
                "s??o programas ocultos que n??o aparecem no sistema",
                "geralmente s??o descobertos imediatamente" ,
                "s??o programas leg??timos que permitem acesso n??o autorizado");
        this.addQuestionRandom (q269);

        QuestionRandom q270 = new QuestionRandom (
                "Quando a IBM lan??ou a primeira vers??o do sistema operacional de disco" +
                        " DOS vers??o 1.0?",
                "1981", "1982", "1983", "1984",
                "1981");
        this.addQuestionRandom (q270);

        QuestionRandom q271 = new QuestionRandom (
                "Qual das afirma????es a seguir ?? falsa sobre o disco em compara????o com " +
                        "a mem??ria principal?",
                "N??o vol??til",
                "maior capacidade de armazenamento",
                "menor pre??o por bit",
                "mais r??pido",
                "mais r??pido") ;
        this.addQuestionRandom (q271);

        QuestionRandom q272 = new QuestionRandom (
                "O problema do consumidor do produtor pode ser resolvido usando",
                "sem??foros",
                "contadores de eventos",
                "monitores",
                "todos os anteriores",
                "todos os anteriores");
        this.addQuestionRandom (q272);

        QuestionRandom q273 = new QuestionRandom (
                "A maioria dos sistemas operacionais de microcomputadores como " +
                        "Apple DOS, MS DOS e PC DOS etc. s??o chamados de sistemas operacionais " +
                        "de disco porque",
                "eles residem na mem??ria",
                "s??o inicialmente armazenados no disco",
                "eles est??o dispon??veis em fitas magn??ticas ",
                " est??o parcialmente na mem??ria prim??ria e parcialmente no disco ",
                " s??o inicialmente armazenados no disco ");
        this.addQuestionRandom (q273);

        QuestionRandom q274 = new QuestionRandom (
                "A CPU, ap??s receber uma interrup????o de um dispositivo de E / S",
                "p??ra por um tempo predeterminado",
                "entrega o controle do barramento de endere??o e barramento de dados para o" +
                        " dispositivo de interrup????o",
                "ramifica para a rotina de interrup????o de servi??o imediatamente ",
                " ramifica-se para a rotina de interrup????o de servi??o ap??s a " +
                        "conclus??o da instru????o atual "
                ," ramifica-se para a rotina de interrup????o de servi??o ap??s a" +
                " conclus??o da instru????o atual ");
        this.addQuestionRandom (q274);

        QuestionRandom q275 = new QuestionRandom (
                "Seeks analysis",
                "?? usado para analisar problemas de paging",
                "?? usado para analisar problemas de unidade de controle ocupada",
                "s?? ?? mostrado em telas em tempo real",
                "?? usado para analisar dispositivo ocupado problemas ",
                " ?? usado para analisar problemas de ocupa????o do dispositivo ");
        this.addQuestionRandom (q275);

        QuestionRandom q276 = new QuestionRandom (
                "Qual ?? um banco de dados permanente no modelo geral de compilador?",
                "Tabela Literal", "Tabela Identificador",
                "Tabela Terminal", "C??digo-fonte",
                "Tabela Terminal");
        this.addQuestionRandom (q276);

        QuestionRandom q277 = new QuestionRandom (
                "Qual ?? o nome da t??cnica na qual o sistema operacional de " +
                        "um computador executa v??rios programas simultaneamente alternando " +
                        "entre eles?",
                "Particionamento", "Multitarefa", "Janelas", "Pagina????o ",
                " Multitarefa ");
        this.addQuestionRandom (q277);

        QuestionRandom q278 = new QuestionRandom (
                "Sistema operacional",
                "vincula um programa ??s sub-rotinas ??s quais faz refer??ncia",
                "fornece uma interface amig??vel em camadas",
                "permite que o programador desenhe um fluxograma",
                "todos os anteriores",
                "fornece uma interface amig??vel em camadas");
        this.addQuestionRandom (q278);

        QuestionRandom q279 = new QuestionRandom (
                "Software que mede, monitora, analisa e controla eventos " +
                        "do mundo real ?? chamado de:",
                "software de sistema", "software em tempo real",
                "software cient??fico", "software de neg??cios",
                "software em tempo real");
        this.addQuestionRandom (q279);

        QuestionRandom q280 = new QuestionRandom (
                "Os detalhes de todos os s??mbolos externos e forma????o de realoca????o" +
                        " (lista de realoca????o ou mapa) s??o fornecidos ao vinculador por",
                "Processador de macro", "Tradutor", "Carregador", "Editor",
                "Tradutor") ;
        this.addQuestionRandom (q280);

        QuestionRandom q281 = new QuestionRandom (
                "O processador de macro deve executar",
                "reconhecer defini????es de macro e chamadas de macro",
                "salvar as defini????es de macro",
                "expandir chamadas de macros e substituir argumentos",
                "todos os anteriores",
                "todos os acima de");
        this.addQuestionRandom (q281);

        QuestionRandom q282 = new QuestionRandom (
                "Uma estrat??gia de desenvolvimento pela qual os m??dulos de " +
                        "controle executivo de um sistema s??o codificados e testados primeiro, " +
                        "?? conhecida como",
                "Desenvolvimento de baixo para cima",
                "Desenvolvimento de cima para baixo",
                "Desenvolvimento de esquerda para direita",
                "Todas as op????es anteriores",
                "Desenvolvimento de cima para baixo");
        this.addQuestionRandom (q282);

        QuestionRandom q283 = new QuestionRandom (
                "Qual das alternativas a seguir ?? ??til para avaliar o software de" +
                        " aplicativos que melhor atende ??s suas necessidades?",
                "Recomenda????es de outros usu??rios", "revistas de computador",
                "an??lises objetivas de software", "todas as op????es anteriores" ,
                "tudo acima");
        this.addQuestionRandom (q283);

        QuestionRandom q284 = new QuestionRandom (
                "Qual problema ?? resolvido pelo algoritmo do banqueiro de Dijkstra?",
                "Exclus??o m??tua", "recupera????o de deadlock",
                "preven????o de deadlock", "coer??ncia de cache",
                "preven????o de deadlock");
        this.addQuestionRandom (q284);

        QuestionRandom q285 = new QuestionRandom (
                "O despachante",
                "realmente agenda as tarefas no processador",
                "coloca as tarefas em espera de E / S",
                "?? sempre pequeno e simples",
                "nunca muda as prioridades das tarefas",
                "realmente agenda o tarefas no processador ");
        this.addQuestionRandom (q285);

        QuestionRandom q286 = new QuestionRandom (
                "Programas de sistema, como Compiladores, s??o projetados de forma que sejam",
                "reinser??veis", "n??o reutiliz??veis",
                "utiliz??veis ??????em s??rie", "recursivos",
                "reinser??veis");
        this.addQuestionRandom (q286);

        QuestionRandom q287 = new QuestionRandom (
                "IBM lan??ou seu primeiro PC em 1981. Voc?? pode citar o " +
                        "sistema operacional que era mais popular naquela ??poca?",
                "MS-DOS", "PC-DOS", "OS / 360", " CP / M ",
                " CP / M ");
        this.addQuestionRandom (q287);

        QuestionRandom q288 = new QuestionRandom (
                "Se o n??mero de bits em um endere??o virtual de um programa " +
                        "for 16 e o ??????tamanho da p??gina for 0,5 K bytes, o n??mero de" +
                        " p??ginas no espa??o de endere??o virtual ser??",
                "16", "32", "64", "128",
                "128");
        this.addQuestionRandom (q288);

        QuestionRandom q289 = new QuestionRandom (
                "Qual tabela ?? um banco de dados permanente que possui uma" +
                        " entrada para cada s??mbolo de terminal.",
                "Tabela de terminal", "Redu????es",
                "Tabela de identificador", "Tabela literal",
                "Tabela de terminal");
        this.addQuestionRandom (q289);

        QuestionRandom q290 = new QuestionRandom (
                "A (s) fun????o (??es) da fase Sintaxe ?? (s??o)",
                "para reconhecer as principais constru????es da linguagem e para " +
                        "chamar as rotinas de a????o apropriadas que ir??o gerar a forma " +
                        "intermedi??ria ou matriz para essas constru????es. ",
                " para construir uma tabela literal e uma tabela de identificadores ",
                " para construir uma tabela de s??mbolos uniforme ",
                " para analisar o programa de origem nos elementos b??sicos ou tokens da linguagem. ",
                " para reconhecer as principais constru????es da linguagem e chamar as " +
                        "rotinas de a????o apropriadas que ir??o gerar a forma ou matriz " +
                        "intermedi??ria para essas constru????es. ");
        this.addQuestionRandom (q290);

        QuestionRandom q291 = new QuestionRandom (
                "Troca",
                "funciona melhor com muitas parti????es pequenas",
                "permite que muitos programas usem mem??ria simultaneamente",
                "permite que cada programa, por sua vez, use a mem??ria",
                "n??o funciona com sobreposi????o33",
                " permite que cada programa, por sua vez, use a mem??ria ");
        this.addQuestionRandom (q291);

        QuestionRandom q292 = new QuestionRandom (
                "Um algoritmo de agendamento de disco em um sistema operacional " +
                        "faz com que o bra??o do disco se mova para frente e para tr??s pela " +
                        "superf??cie do disco para atender a todas as solicita????es em seu caminho." +
                        " Este ?? um",
                "Primeiro a chegar, primeiro a ser servido",
                "Shortest Seek Time First (SSTE)",
                "Scan",
                "FIFO",
                "Scan");
        this.addQuestionRandom (q292);

        QuestionRandom q293 = new QuestionRandom (
                "Um tradutor ?? melhor descrito como",
                "um software de aplicativo",
                "um software de sistema",
                "um componente de hardware",
                "todos os anteriores",
                "um software de sistema");
        this.addQuestionRandom (q293);

        QuestionRandom q294 = new QuestionRandom (
                "Criptografia de dados",
                "?? usado principalmente por redes p??blicas",
                "?? usado principalmente por redes financeiras",
                "n??o pode ser usado por instala????es privadas",
                "n??o ?? necess??rio, uma vez que os dados n??o podem ser interceptados",
                "?? usado principalmente por redes financeiras");
        this.addQuestionRandom (q294);

        QuestionRandom q295 = new QuestionRandom (
                "Qual ?? o nome dado ao processo de inicializa????o de um " +
                        "microcomputador com seu sistema operacional?",
                "Inicializa????o a frio", "Inicializa????o",
                "Inicializa????o a quente", "Grava????o de inicializa????o",
                "Inicializa????o");
        this.addQuestionRandom (q295);

        QuestionRandom q296 = new QuestionRandom (
                "A (s) fun????o (??es) da Atribui????o de Armazenamento ?? (s??o)",
                "para atribuir armazenamento a todas as vari??veis ??????referenciadas no " +
                        "programa de origem.",
                "Para atribuir armazenamento a todos os locais tempor??rios que s??o necess??rios " +
                        "para intermedi??rios resultados ",
                " para atribuir armazenamento a literais e para garantir que o armazenamento " +
                        "seja alocado e os locais apropriados sejam inicializados. ",
                " todos os anteriores ",
                " todos os anteriores ");
        this.addQuestionRandom (q296);

        QuestionRandom q297 = new QuestionRandom (
                "Um Processador", "?? um dispositivo que executa uma sequ??ncia " +
                "de opera????es especificadas por instru????es na mem??ria.",
                "?? o dispositivo onde as informa????es s??o armazenadas",
                "?? uma sequ??ncia de instru????es",
                "?? normalmente caracterizado por processamento interativo e tempo de tempo " +
                        "da CPU para permitir resposta r??pida a cada usu??rio ",
                " ?? um dispositivo que realiza uma sequ??ncia de opera????es especificadas " +
                        "por instru????es em mem??ria ");
        this.addQuestionRandom (q297);

        QuestionRandom q298 = new QuestionRandom (
                "Com o MS-DOS, qual comando dividir?? a superf??cie do disquete " +
                        "em branco em setores e atribuir?? um endere??o ??nico a cada um?",
                "Comando FORMAT", "Comando FAT",
                "Comando VER", "Comando CHKDSK",
                "FORMATAR comando");
        this.addQuestionRandom (q298);

        QuestionRandom q299 = new QuestionRandom (
                "Multiprograma????o", "?? um m??todo de aloca????o de mem??ria " +
                "pelo qual o programa ?? subdividido em partes iguais, ou as p??ginas e o" +
                " n??cleo s??o subdivididos em partes iguais ou blocos.",
                "Consiste nos endere??os que podem ser gerados por um processador durante " +
                        "a execu????o de um c??lculo ",
                " ?? um m??todo de aloca????o de tempo do processador. ",
                " permite que v??rios programas residam em ??reas separadas do n??cleo " +
                        "no momento ",
                " permite que v??rios programas residam em ??reas separadas do n??cleo no Tempo");
        this.addQuestionRandom (q299);

        QuestionRandom q300 = new QuestionRandom (
                "Um tradutor que l?? um programa inteiro escrito em uma " +
                        "linguagem de alto n??vel e o converte em c??digo de linguagem de m??quina ??:",
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

        // percorrendo todas as linhas e adicionando ?? lista
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

        // percorrendo todas as linhas e adicionando ?? lista
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

        // percorrendo todas as linhas e adicionando ?? lista
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
        // percorrendo todas as linhas e adicionando ?? lista
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
