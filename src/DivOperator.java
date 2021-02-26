//****************************************************************************************
// CLASS: DivOperator (DivOperator.java)
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
 * Represents the division operator which is a specific type of binary operator.
 */
public class DivOperator extends BinaryOperator {

    public DivOperator(){
    }

    /**
     * Returns the value after division of the left-hand side operand and the right-hand side operand.
     */
    @Override
    public Operand evaluate(Operand pLhsOperand, Operand pRhsOperand){
        return new Operand(pLhsOperand.getValue() / pRhsOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence(){
        return 3;
    }

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
    public int stackPrecedence() {
        return 3;
    }
}