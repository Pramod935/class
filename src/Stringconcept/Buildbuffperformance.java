package Stringconcept;

public class Buildbuffperformance {
    public static void main(String[] args) {
        long StartTime=System.currentTimeMillis();
        StringBuffer bf=new StringBuffer("placement");
        for(int i=0;i<100000;i++){
            bf.append("training");
        }
        System.out.println("timt taken by string Buffer:"
        +(System.currentTimeMillis()-StartTime)+"ms");
        StartTime=System.currentTimeMillis();
        StringBuilder bl=new StringBuilder("placement");
        for(int i=0;i<100000;i++){
            bl.append("Training");
        }
        System.out.println("time take by string Builder:"+(System.currentTimeMillis()-StartTime)+"ms");
    }
}
