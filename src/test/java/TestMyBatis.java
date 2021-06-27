import com.ggms.mapper.FieldApplicationMapper;import com.ggms.mapper.UserMapper;
import com.ggms.pojo.User;
import com.ggms.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class TestMyBatis {

    private UserMapper userMapper;

    @Test
    public void testMyBatis() {
        SqlSession session = MyBatisUtils.getSqlSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);


        User user = new User();
        user.setUserid("201811701333");
        user.setUname("张三");
        user.setUcredit(3);
        user.setUpassword("123456");
        user.setUphone("12345641264");
        user.setUtype(1);
        user.setUunit("good");

        User user2 = new User();
        user2.setUserid("201911801345");
        user2.setUname("李四");
        user2.setUcredit(3);
        user2.setUpassword("123456");
        user2.setUphone("12345641264");
        user2.setUtype(1);
        user2.setUunit("great");

        userMapper.insert(user);
        userMapper.insert(user2);

        List<User> users = userMapper.selectByExample(null);
        for(User u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void testTimeFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String s = "12:22:00";

        Date d = null;
        try {
            d = simpleDateFormat.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Time time = new Time(d.getTime());
        System.out.println(time.valueOf(s).toString());
    }
}
