import com.twoshou.mapper.EmployeeMapper;
import com.twoshou.pojo.Employee;
import com.twoshou.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class EmployeeTest {
    @Test
    public void selectAllTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = employeeMapper.selectAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
    @Test
    public void selectByIdTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.selectById(2);
        System.out.println(employee);
    }
}
