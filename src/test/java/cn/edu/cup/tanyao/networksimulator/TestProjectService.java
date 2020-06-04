package cn.edu.cup.tanyao.networksimulator;


import cn.edu.cup.tanyao.networksimulator.service.ProjectService;
import cn.edu.cup.tanyao.networksimulator.structrue.EdgeTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tanyao
 * @create 2020/06/04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestProjectService {

	@Autowired
	private ProjectService projectService;

	/**
	 * 根据项目id获取项目结构数据
	 */
	@Test
	public void testProject() {
		EdgeTable project = projectService.queryStructure(1);
		System.out.println("边表数据结构：");
		System.out.println(project);
	}
}
