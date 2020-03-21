package redis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


import redis.clients.jedis.Jedis;

public class TestRedis {

	public static void main(String[] args) {

		//连接本地的 Redis 服务
		Jedis jed = new Jedis("localhost");
		System.out.println("连接成功");
		//查看服务是否运行
		System.out.println("服务正在运行: "+jed.ping());
		
		System.out.println(" ---------------------------------------------------------------------- ");
		
		String str = jed.getSet("jedis", "test jedis");
		
		System.out.println(str);
		
		System.out.println(" ---------------------------------------------------------------------- ");
		
		jed.lpush("jedislist", "java");
		jed.lpush("jedislist", "python");
		jed.lpush("jedislist", "java");
		
		List<String> list = jed.lrange("jedislist", 0, 10);
		
		for(String jedstr : list) {
			
			System.out.println(jedstr);
			
		}
		
		System.out.println(" ---------------------------------------------------------------------- ");
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1001", "张三");
		map.put("1002", "李四");
		map.put("1003", "王五");
		
		jed.hmset("jedishash", map);
		
//		for(Entry<Integer, String> en : map.entrySet()) {
//			
//			System.out.println(en.getKey() + " --- " + en.getValue());
//			
//		}
		
		Map<String, String> mapstr = jed.hgetAll("jedishash");
		
		for(Entry<String, String> enm : mapstr.entrySet()) {
			
			System.out.println(enm.getKey() + " *** " + enm.getValue());
			
		}
		
		System.out.println(" ---------------------------------------------------------------------- ");
		
		jed.sadd("jedisset", "aaa");
		jed.sadd("jedisset", "bbb");
		jed.sadd("jedisset", "ccc");
		
		Set<String> setstr = jed.smembers("jedisset");
		
		for(String sset : setstr) {
			
			System.out.println(sset);
			
		}
		
		System.out.println(" ---------------------------------------------------------------------- ");
		
		jed.zadd("jediszset", 0, "redis");
		jed.zadd("jediszset", 1, "mysql");
		jed.zadd("jediszset", 2, "mongo");
		
		Set<String> szset = jed.zrangeByScore("jediszset", 0, 10);
		
		for(String zsetval : szset) {
			
			System.out.println(zsetval);
			
		}
		
		System.out.println(" ---------------------------------------------------------------------- ");
		
		Set<String> keys = jed.keys("*");
		
		for(String keyall : keys) {
			
			System.out.println(keyall);
			
		}
		
		System.out.println(" ---------------------------------------------------------------------- ");
		
		jed.select(1);
		
		System.out.println(jed.getSet("encodingtest", "utf-8"));
		
		jed.select(0);
		
	}

}
