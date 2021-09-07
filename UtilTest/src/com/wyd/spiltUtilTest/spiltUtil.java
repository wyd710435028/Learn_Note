package com.wyd.spiltUtilTest;

/**
 * @author WYD
 * @version 1.0
 * @description: TODO
 * @date 2021/8/26 11:39
 */
public class spiltUtil {
    public static void main(String[] args) {
        String s ="用例标识:GN-HCZC_001-002^^测试用例综述:测试利用twemperf开展memcached的性能测试^^前提和约束:1.拷贝twemperf工具软件包到测试机 2.启动服务systemctlstartmemcached^^测试步骤:1.打开终端，执行命令: unziptwemperf-master.zip cdtwemperf-master/ sudoautoreconf-fvi sudo./configure sudomake sudomakeinstall 2.运行twemperf工具: mcperf--linger=0--timeout=5--conn-rate=1000--call-rate=1000--num-calls=10--num-conns=1000--sizes=u1,16  ^^期望结果与评估标准:1.twemperf工具成功安装和运行 2.执行后结果Total:connections1000requests10000responses10000test-duration1.009s  Connectionrate:991.1conn/s(1.0ms/conn<=12concurrentconnections) Connectiontime[ms]:avg10.2min10.0max10.5stddev0.06 Connecttime[ms]:avg0.2min0.1max0.5stddev0.06  Requestrate:9911.2req/s(0.1ms/req) Requestsize[B]:avg35.9min28.0max44.0stddev4.80  Responserate:9911.2rsp/s(0.1ms/rsp) Responsesize[B]:avg8.0min8.0max8.0stddev0.00 Responsetime[ms]:avg0.1min0.0max0.5stddev0.00 Responsetime[ms]:p251.0p501.0p751.0 Responsetime[ms]:p951.0p991.0p9991.0 Responsetype:stored10000not_stored0exists0not_found0 Responsetype:num0deleted0end0value0 Responsetype:error0client_error0server_error0  Errors:total0client-timo0socket-timo0connrefused0connreset0 Errors:fd-unavail0ftab-full0addrunavail0other0  CPUtime[s]:user0.44system0.57(user43.8%system56.1%total99.9%) NetI/O:bytes428.7KBrate424.8KB/s(3.5*10^6bps)";
        String[] split = s.split("\\^\\^");//以"^切割"
        for (int i=0;i<split.length;i++){
            System.out.println(split[i]);
        }
    }
}
