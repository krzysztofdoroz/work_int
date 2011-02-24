package bitmap;

/**
 *
 * @author krzysztof
 */
public class BitMap {
    int map = 0;

    public void printMapContent(){
        for(int i = 32; i > 0; i--){
            System.out.print( (map & (1 << i)) > 1? 1 : 0);
        }
        System.out.println("");
    }

    public void setIthBitInAMap(int bitNumber){
        map |= (1 << bitNumber);
    }

    public static void main(String[] args) {
        BitMap bitmap = new BitMap();
        bitmap.setIthBitInAMap(3);
        bitmap.setIthBitInAMap(5);

        bitmap.printMapContent();
    }
}
