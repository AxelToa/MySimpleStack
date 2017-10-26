package deqo.axto.MySimpleStack;

public class Item {

    private Object value;

    Item(Object value){
        this.value = value;
    }

    Object getValue(){
        return value;
    }

    void setValue(Object value){
        this.value = value;
    }
}
