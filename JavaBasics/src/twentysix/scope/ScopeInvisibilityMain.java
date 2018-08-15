package twentysix.scope;

public class ScopeInvisibilityMain {

    public static void main(String[] args) {
	    String varFour = "this is private to main()";

	    ScopeInvisibilityCheck scopeInstance = new ScopeInvisibilityCheck();
        scopeInstance.useInner();

        ScopeInvisibilityCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        //as it is private and no visibility outside it class or a containing
        //class of its class
        //System.out.println("varThree is not accessible here " + innerClass.varThree);
//
//       System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
//        System.out.println(varFour);
//
//        scopeInstance.timesTwo();
//        System.out.println("***********************************");
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
    }
}
