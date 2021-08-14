
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.froi.arbolactivacion.gramaticas;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class GramaticaParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return GramaticaParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public GramaticaParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public GramaticaParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public GramaticaParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\002\004\000\002\002\005\000\002\003" +
    "\004\000\002\004\004\000\002\004\003\000\002\007\011" +
    "\000\002\010\004\000\002\010\003\000\002\011\006\000" +
    "\002\005\003\000\002\005\002\000\002\006\005\000\002" +
    "\012\004\000\002\012\003\000\002\013\003\000\002\013" +
    "\003\000\002\013\003\000\002\014\006\000\002\015\006" +
    "\000\002\016\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\004\004\005\001\002\000\004\002\055\001" +
    "\002\000\004\017\006\001\002\000\004\005\011\001\002" +
    "\000\006\005\ufffd\010\ufffd\001\002\000\004\002\000\001" +
    "\002\000\004\017\040\001\002\000\006\005\011\010\014" +
    "\001\002\000\006\005\ufffe\010\ufffe\001\002\000\004\017" +
    "\017\001\002\000\004\002\uffff\001\002\000\006\011\ufff3" +
    "\017\ufff3\001\002\000\006\012\026\015\027\001\002\000" +
    "\004\011\025\001\002\000\006\011\ufff2\017\ufff2\001\002" +
    "\000\006\011\ufff1\017\ufff1\001\002\000\006\011\ufff4\017" +
    "\017\001\002\000\004\011\ufff5\001\002\000\004\002\ufff6" +
    "\001\002\000\006\014\034\020\033\001\002\000\004\007" +
    "\030\001\002\000\004\016\031\001\002\000\004\013\032" +
    "\001\002\000\006\011\uffee\017\uffee\001\002\000\004\013" +
    "\037\001\002\000\004\017\035\001\002\000\004\015\027" +
    "\001\002\000\006\011\uffef\017\uffef\001\002\000\006\011" +
    "\ufff0\017\ufff0\001\002\000\004\015\041\001\002\000\004" +
    "\006\042\001\002\000\004\016\043\001\002\000\004\017" +
    "\044\001\002\000\004\015\051\001\002\000\006\011\ufffa" +
    "\017\ufffa\001\002\000\006\011\050\017\044\001\002\000" +
    "\006\011\ufffb\017\ufffb\001\002\000\006\005\ufffc\010\ufffc" +
    "\001\002\000\006\016\ufff7\017\052\001\002\000\004\016" +
    "\ufff8\001\002\000\004\016\054\001\002\000\006\011\ufff9" +
    "\017\ufff9\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\003\007\004\011\007\006\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\006\014\007\012\001\001\000\002\001\001\000\014" +
    "\012\017\013\022\014\015\015\020\016\021\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\012" +
    "\023\013\022\014\015\015\020\016\021\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\016\035\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\010\045\011" +
    "\044\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\011\046\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\052\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$GramaticaParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$GramaticaParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$GramaticaParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public GramaticaParser(GramaticaLexer lexer) {
        super(lexer);
    }
    public void report_error(String message, Object info) {
        System.out.println("reporterror");
    }
    public void report_fatal_error(String message, Object info) {
        System.out.println("reportfatal");
    }
    public void syntax_error(Symbol cur_token) {
        System.out.println("syntaxerr " + symbl_name_from_id(cur_token.sym) + " " + cur_token.left + " - " + cur_token.right);
    }
    protected int error_sync_size() {
        return 1;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$GramaticaParser$actions {
  private final GramaticaParser parser;

  /** Constructor */
  CUP$GramaticaParser$actions(GramaticaParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$GramaticaParser$do_action_part00000000(
    int                        CUP$GramaticaParser$act_num,
    java_cup.runtime.lr_parser CUP$GramaticaParser$parser,
    java.util.Stack            CUP$GramaticaParser$stack,
    int                        CUP$GramaticaParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$GramaticaParser$result;

      /* select the action based on the action number */
      switch (CUP$GramaticaParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-1)).value;
		RESULT = start_val;
              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-1)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$GramaticaParser$parser.done_parsing();
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= PROGRAMA ALFANUMERICO instrucciones 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-2)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= procesos proceso_begin 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-1)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // procesos ::= procesos proceso_individual 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("procesos",2, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-1)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // procesos ::= proceso_individual 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("procesos",2, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // proceso_individual ::= PROCEDIMIENTO ALFANUMERICO PARA PARAM PARC cuerpo_proceso END 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("proceso_individual",5, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-6)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // cuerpo_proceso ::= cuerpo_proceso cuerpo_proceso_p 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("cuerpo_proceso",6, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-1)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // cuerpo_proceso ::= cuerpo_proceso_p 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("cuerpo_proceso",6, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // cuerpo_proceso_p ::= ALFANUMERICO PARA parametro PARC 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("cuerpo_proceso_p",7, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-3)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // parametro ::= ALFANUMERICO 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("parametro",3, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // parametro ::= 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("parametro",3, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // proceso_begin ::= BEGIN cuerpo_begin END 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("proceso_begin",4, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-2)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // cuerpo_begin ::= instruccion_begin cuerpo_begin 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("cuerpo_begin",8, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-1)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // cuerpo_begin ::= instruccion_begin 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("cuerpo_begin",8, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // instruccion_begin ::= declaracion_variable 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("instruccion_begin",9, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // instruccion_begin ::= asignacion_valor 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("instruccion_begin",9, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // instruccion_begin ::= ejecucion_metodo 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("instruccion_begin",9, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // declaracion_variable ::= ALFANUMERICO PUNTOS INTEGER PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("declaracion_variable",10, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-3)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // asignacion_valor ::= ALFANUMERICO PUNTOS IGUAL ejecucion_metodo 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("asignacion_valor",11, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-3)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ejecucion_metodo ::= ALFANUMERICO PARA PARAMS PARC PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$GramaticaParser$result = parser.getSymbolFactory().newSymbol("ejecucion_metodo",12, ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.elementAt(CUP$GramaticaParser$top-4)), ((java_cup.runtime.Symbol)CUP$GramaticaParser$stack.peek()), RESULT);
            }
          return CUP$GramaticaParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$GramaticaParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$GramaticaParser$do_action(
    int                        CUP$GramaticaParser$act_num,
    java_cup.runtime.lr_parser CUP$GramaticaParser$parser,
    java.util.Stack            CUP$GramaticaParser$stack,
    int                        CUP$GramaticaParser$top)
    throws java.lang.Exception
    {
              return CUP$GramaticaParser$do_action_part00000000(
                               CUP$GramaticaParser$act_num,
                               CUP$GramaticaParser$parser,
                               CUP$GramaticaParser$stack,
                               CUP$GramaticaParser$top);
    }
}

}
