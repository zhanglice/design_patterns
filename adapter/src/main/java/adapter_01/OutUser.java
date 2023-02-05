package adapter_01;

import java.util.HashMap;
import java.util.Map;

public class OutUser implements IOutUser{
    @Override
    public Map getUserBaseInfo() {
        HashMap<String,String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName","员工名字叫混世魔王。。。");
        baseInfoMap.put("mobileNumber","员工电话是。。。");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap<String,String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber","员工家庭电话是。。。");
        homeInfo.put("homeAddress","员工家庭住址。。。");
        return homeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap<String,String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition","员工职位是Boss。。。");
        officeInfo.put("officeTelNumber","员工办公电话是。。。");
        return officeInfo;
    }
}
