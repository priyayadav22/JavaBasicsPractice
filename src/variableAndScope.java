public class variableAndScope {
    public  void main(String[] args){
        int cookies =10;
        for(int i=0; i<=cookies; i++){
            System.out.println("cookie Number: " + i);
        }
        int tofee =5;
        leftTofee(tofee);
    }

    public void leftTofee(int tofee){
        int eaten =2;
        System.out.println(tofee-eaten);
    }

}
