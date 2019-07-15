package zookeeperHelloWorld;

import java.io.IOException;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;

/**
 * zookeeper
 * ����zookeeper
 * ����znode
 * ��ȡznodeֵ
 * �Ͽ�����
 */
public class ZookeeperDemo {
	
	private ZooKeeper zookeeper;
	
	public ZookeeperDemo() {
		super();
		try {
			zkConnect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//����zookeeper
	public ZooKeeper zkConnect() throws IOException{
		String basepath="127.0.0.1:2181";
		
		//��һ��ip�Ͷ˿ڣ��ڶ��������ǳ�ʱʱ�䣬�����������ǹ۲���
		this.zookeeper = new ZooKeeper(basepath,20*1000, null);
		return zookeeper;
	}
	
	/**
     * ����znode�ڵ�
     * @param path��znode��·��
     * @param value��znode��ֵ
     * @param watcher
     * @param node //����node��ģʽ
     * @throws KeeperException
     * @throws InterruptedException
     */
	private void createZnode(String path,byte[] value,Watcher watch,CreateMode node) throws KeeperException, InterruptedException {
		zookeeper.create(path, value,ZooDefs.Ids.OPEN_ACL_UNSAFE, node);
	}
	
	/**
     * ͨ��path���znode��ֵ
     * @param path
     * @return
     * @throws KeeperException
     * @throws InterruptedException
     */
    public String getZnodeValue(String path ) throws KeeperException, InterruptedException {
        //           �ڶ���ֵ�Ǵ����Ƿ������������ﻹ���Ȳ���.�������������ǽṹ��
        byte[] data = zookeeper.getData(path, false, new Stat());
        return new String(data);
    }
    
    public void close() {
        try {
            if (zookeeper != null) {
                zookeeper.close();
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
	
    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        ZookeeperDemo zookeeperDemo = new ZookeeperDemo();
        //��ȡ����
        //����znode
        zookeeperDemo.createZnode("/amber2", "hahaha".getBytes(), null, CreateMode.PERSISTENT_SEQUENTIAL);
        //��ȡznode��ֵ
        //String znodeValue = zookeeperDemo.getZnodeValue("/zktest/tem");
        //System.out.println(znodeValue);
        System.out.println("success");
        zookeeperDemo.close();

    }
}
