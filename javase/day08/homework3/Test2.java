package javase.day08.homework3;

public class Test2 {
    static void traverse(Graphic[] graphics){
        for(int i=0;i<graphics.length;i++){
            System.out.println(graphics[i].getInfo());
        }
    }
    static void sortByArea(Graphic[] graphics){
        for(int i=graphics.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(graphics[j].getArea()>graphics[j+1].getArea()){
                    Graphic temp=graphics[j];
                    graphics[j]=graphics[j+1];
                    graphics[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graphic[] graphics = new Graphic[3];
        graphics[0] = new Circle(2);
        graphics[1] = new Rectangle(2, 3);
        graphics[2] = new Triangle(3, 4, 5);
        traverse(graphics);
        sortByArea(graphics);
        System.out.println();
        traverse(graphics);
    }
}
