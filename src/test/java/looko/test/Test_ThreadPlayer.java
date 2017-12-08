package looko.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import looko.api.API_Player;
import looko.service.PlayerServiceI;
import looko.thread_db.Thread_Player;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class Test_ThreadPlayer 
{
	private PlayerServiceI playerService;
	
	public PlayerServiceI getPlayerService() {
		return playerService;
	}

	@Autowired
	public void setPlayerService(PlayerServiceI playerService) {
		this.playerService = playerService;
	}

	@Test
	public void testUpdatePlayer()
	{
		API_Player aplayer = new API_Player();
		Thread_Player tplayer = new Thread_Player();
		tplayer.setPlayer(aplayer.getAsPlayer("76561198367830998"));
		tplayer.run();
	}
}
