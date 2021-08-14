package com.froi.arolactivador.gramaticas;

import java_cup.runtime.*;
import static com.froi.arbolactivacion.gramaticas.GramaticaParserSym.*;

%%
%public
%class GramaticaLexer
%cup
%unicode
%line
%column
TerminacionLinea = [\r|\n|\r\n]
WS = [ \t\f]
Ignore = {WS} | {TerminacionLinea}

ALFANUMERICO = ([a-zA-Z] | [0-9])+

%%

<YYINITIAL> {

    "programa"          {return new Symbol(PROGRAMA, yyline+1, yycolumn+1, yytext());}
    "procedimiento"     {return new Symbol(PROCEDIMIENTO, yyline+1, yycolumn+1, yytext());}
    "param"             {return new Symbol(PARAM, yyline+1, yycolumn+1, yytext());}
    "params"            {return new Symbol(PARAMS, yyline+1, yycolumn+1, yytext());}
    "begin"             {return new Symbol(BEGIN, yyline+1, yycolumn+1, yytext());}
    "integer"           {return new Symbol(INTEGER, yyline+1, yycolumn+1, yytext());}
    "end"               {return new Symbol(END, yyline+1, yycolumn+1, yytext());}
    ":"                 {return new Symbol(PUNTOS, yyline+1, yycolumn+1, yytext());}
    ";"                 {return new Symbol(PUNTO_COMA, yyline+1, yycolumn+1, yytext());}
    "="                 {return new Symbol(IGUAL, yyline+1, yycolumn+1, yytext());}
    "("                 {return new Symbol(PARA, yyline+1, yycolumn+1, yytext());}
    ")"                 {return new Symbol(PARC, yyline+1, yycolumn+1, yytext());}

    {ALFANUMERICO}      {return new Symbol(ALFANUMERICO, yyline+1, yycolumn+1, yytext());}
    {Ignore}            {/*Ignore*/}

}

[^] {

}
