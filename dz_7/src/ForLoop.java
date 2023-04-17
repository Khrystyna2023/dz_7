public class ForLoop {
    public void dis(){
        for (int i = 1; i <= 6; i++) {
            System.out.print("Step: " + i + " | ");
            for (int j = i; j > 0; j--){
                System.out.print('#' + " ");
            }
            System.out.println('\n');
        }
    }
}
