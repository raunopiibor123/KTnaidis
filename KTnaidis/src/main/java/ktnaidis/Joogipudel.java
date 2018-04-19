package ktnaidis;
public class Joogipudel{
    double maht;
    String pudelityyp;
    double mass;
    double taarahind;
    Jook sisu;
    public Joogipudel(double maht, String pudelityyp, double mass, 
       double taarahind, Jook sisu){
        this.maht=maht;
        this.pudelityyp=pudelityyp;
        this.mass=mass;
        this.taarahind=taarahind;
        this.sisu=sisu;
    }
    public double koguMass(){
        if(sisu==null){return mass;}
        return mass+sisu.erikaal*maht;
    }
    public double koguHind(){
        if(sisu==null){return taarahind;}
        return taarahind+maht*sisu.liitriomahind;
    }
    @Override
    public String toString(){
       return maht+"-liitrine pudel tüübiga "+pudelityyp+", sisu "+sisu+
         ", koguhind "+koguHind()+", kogumass "+koguMass();
    }
}
