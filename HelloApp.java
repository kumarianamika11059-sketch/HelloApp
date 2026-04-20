public class HelloApp {
    public HelloApp() {
    }
    public static void main(String[] var0){
        String var1 = "world";
        if(var0.length>0){
        StringBuilder var2 = new StringBuilder();

        for(int var3 = 0; var3 < var0.length; ++var3) {
             var2.append(var0[var3]);
             if (var3 < var0.length - 1){
                var2.append(",");
             }
        
        var1 = var2.toString();
        }
    }
        System.out.println("Hello, " + var1 + "!");
    }
}