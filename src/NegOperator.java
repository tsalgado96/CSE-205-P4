//****************************************************************************************
// CLASS: NegOperator (NegOperator.java)
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
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator {

    public NegOperator(){
    }

    /**
     * Returns the value after division of the left-hand side operand and the right-hand side operand.
     */
    @Override
    public Operand evaluate(Operand pOperand){
        return new Operand(-pOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence(){
        return 4;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    public int stackPrecedence() {
        return 4;
    }
}