package redis;

import redis.clients.jedis.Jedis;
import junit.framework.TestCase;

public class JedisTest extends TestCase{
	private Jedis jedis;
	
	@Override
	protected void setUp() throws Exception {
		jedis = new Jedis("127.0.0.1");
	}
	
	
	public void testSet(){
		jedis.set("name", "chenjunjie");
		System.out.println(jedis.get("name"));
	}
	
}
