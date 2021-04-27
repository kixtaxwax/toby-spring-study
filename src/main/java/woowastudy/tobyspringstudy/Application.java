package woowastudy.tobyspringstudy;

import woowastudy.tobyspringstudy.user.dao.DUserDao;
import woowastudy.tobyspringstudy.user.dao.UserDao;
import woowastudy.tobyspringstudy.user.domain.User;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDao dao = new DUserDao();

        User user = new User();
        user.setId("whiteship");
        user.setName("백기선");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }
}
