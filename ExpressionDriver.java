/**
 * Driver class ("script") for working with the Expression hierarchy.
 */
public class ExpressionDriver {

    public static void main(String[] args) {
        Expression intExp1 = new IntConstant(2);
        Expression intExp2 = new IntConstant(3);
        Expression plusExp = new PlusExpression(intExp1, intExp2);
        System.out.println("(2 + 3) = " + plusExp.value());
        //System.out.println("(2 + 3) has " + plusExp.numberOfNodes() + " nodes");
		
		Expression timesExp = new TimesExpression(intExp1, intExp2);
		System.out.println("(2 * 3) = " + timesExp.value());
		
		Expression intExp3 = new IntConstant(4);
		Expression timeExp2 = new TimesExpression(plusExp, intExp3);
		
		System.out.println(plusExp.toString());
		System.out.println(timesExp.toString());
		System.out.println(timeExp2.toString());
		//e.g. ((2 + 3) * 4)
		// so left 2
		//right 3
		//left 2 + 3
		//right 4
    }
}
