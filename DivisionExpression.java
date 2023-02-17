/**
 * Represents an Expression of the form (e1 / e2).
 */
public class DivisionExpression extends BinaryExpression {

    /**
     * Constructs a DivisionExpression with left and right as direct
     * subexpressions.
     *
     * @param left the left subexpression
     * @param right the right subexpression
     * @throws NullPointerException if left or right is null
     */
    public DivisionExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * @return the product of the values of the direct subexpressions
     */
    @Override
    public int value() {
        return this.getLeft().value() / this.getRight().value(); 
    }
	
	@Override
	public String toString(){
		return "(" + this.getLeft().toString() + " / " + this.getRight().toString() + ")";
	}
}