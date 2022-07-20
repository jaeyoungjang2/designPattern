package headfirst.designpatterns.decorator.starbuzz;

public class Main {
    public static void main(String[] args) {
        String scripts = String.format("parent._alert(null, \"관리자 계정\", false); parent._resetSignUp();");
        System.out.println(scripts);
        scripts = "parent._alert(null, \"관리자 계정\", false);"
                + "parent._resetSignUp();";
        System.out.println(scripts);


    }
}
