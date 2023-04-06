class Main{
    public static void main(String[] args) {
        int[] myNumbers = {1,2,3};
        try{
            System.out.println(myNumbers[9]);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("Code is finished");
    }
}