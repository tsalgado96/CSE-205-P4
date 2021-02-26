//****************************************************************************************
// CLASS: Operand (Operand.java)
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
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {
    private Double mValue;

    public Operand(Double pValue){
        setValue(pValue);
    }

    public Double getValue(){
        return mValue;
    }

    public void setValue(Double pValue){
        mValue = pValue;
    }
}
