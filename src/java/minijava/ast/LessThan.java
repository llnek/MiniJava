package minijava.ast;

import minijava.visitor.Visitor;

public class LessThan extends Expression {

	public final Expression e1;
	public final Expression e2;
	
	public LessThan(Expression e1, Expression e2) {
		super();
		super.setType(BooleanType.instance);
		this.e1 = e1;
		this.e2 = e2;
	}
	
	@Override
	public <R> R accept(Visitor<R> v) {
		return v.visit(this);
	}


}
