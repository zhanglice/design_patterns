package copy.deepClone;

import java.util.ArrayList;

public class Thing implements Cloneable{
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected Object clone(){
        Thing thing = null;
        try{
            thing = (Thing)super.clone();
            //再将内部的数组，引用对象copy一次，叫做深拷贝
            thing.list = (ArrayList<String>)this.list.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return thing;
    }
    public void setValue(String value){
        this.list.add(value);
    }
    public ArrayList<String> getValue(){
        return this.list;
    }
}
