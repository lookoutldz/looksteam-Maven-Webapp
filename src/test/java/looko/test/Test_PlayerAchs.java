package looko.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import looko.api.API_OwnedGames;
import looko.api.API_PlayerAchievement;
import looko.model.PlayerAchievement;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class Test_PlayerAchs 
{
	@Test
	public void test1()
	{
		API_PlayerAchievement api_PlayerAch = new API_PlayerAchievement();
		List<PlayerAchievement> playerAchs = api_PlayerAch.getPlayerAllAchs("76561198367830998", new API_OwnedGames().getAsOwnedGames("76561198367830998"));
		for (PlayerAchievement playerAchievement : playerAchs) 
		{
			System.out.print(playerAchievement.getAppid() + " : ");
			System.out.print(playerAchievement.getAchievementname());
		}
	}
}
