//****************************************************************************************
// CLASS: Operator (Operator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Spring 2021
// Project Number: 4
//
// TEAM NAME: Y
// AUTHOR 1: Teodoro Salgado, tjsalgad, tsalgado96@gmail.com
// AUTHOR 2: Isaac Pena, ipena5, ippenaisaac@gmail.com
// AUTHOR 3: Stephen Elledge, saelledg, saelledg@asu.edu
// ****************************************************************************************

/**
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token {

    public Operator(){
    }

    public abstract boolean isBinaryOperator();

    public abstract int precedence();

    public abstract int stackPrecedence();
}
