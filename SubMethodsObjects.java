
package methods_objects;


public class SubMethodsObjects {
    private String girlname;
    public void setname(String name){
        girlname=name;
    }
    public String getname(){
        return girlname;
    }
    public void saying(){
        System.out.printf("Your first girlfrend was %s",getname());
    }
}
