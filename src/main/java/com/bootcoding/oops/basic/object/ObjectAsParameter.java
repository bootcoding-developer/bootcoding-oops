package com.bootcoding.oops.basic.object;

public class ObjectAsParameter {

    public static void main(String[] args) {
        Remote r  = new Remote("Videocon", "Gray", 55.00);
        ObjectAsParameter.isRemoteBlack(r);
        String remoteCostLabel = getRemoteCostLabel(r);
    }

    private static String getRemoteCostLabel(Remote r) {
        if(r.price >= 120){
            return "Expensive";
        }if(r.price >= 100){
            return "Affordable";
        }
        return "Cheaper";
    }

    //static - class
    //

    public static boolean isRemoteBlack(Remote remote){
        if(remote.color.equals("Black")){
            return true;
        }
        return false;
    }

    // Remote - expensive affordable cheaper

}
