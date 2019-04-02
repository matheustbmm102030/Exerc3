
public class CriaPecas {
     
    public static void main(String[] args){
        
        PlacaMae pm1= new PlacaMae();
        pm1.modelo="LGA1151";
        pm1.marca="Gigabyte";
        pm1.chipset="Intel Express Chipset Z370";
        pm1.preco=714.90;
        
        PlacaMae pm2= new PlacaMae();
        pm2.modelo="AM4 mATX GA-A320M-S2H";
        pm2.marca="Gigabyte";
        pm2.chipset="AMD A320";
        pm2.preco=379.90;
        
        PlacaMae pm3= new PlacaMae();
        pm3.modelo="H310M-HG4";
        pm3.marca="ASRock";
        pm3.chipset="Intel H310";
        pm3.preco=376.90;
        
        
        Processador p1= new Processador();
        p1.modelo="Ryzen 7 2700";
        p1.cache="20MB";
        p1.frequencia="4.1GHz";
        p1.cores=8;
        p1.threads=16;
        p1.preco=1268.99;
        
        Processador p2= new Processador();
        p2.modelo="intel i3 8300";
        p2.cache="8MB";
        p2.frequencia="3.7GHz";
        p2.cores=4;
        p2.threads=4;
        p2.preco=850.99;
        
        Processador p3= new Processador();
        p3.modelo="ATHLON 240GE";
        p3.cache="5MB";
        p3.frequencia="3.5GHz";
        p3.cores=2;
        p3.threads=4;
        p3.preco=407.95;
        
        
        PlacadeVideo pv1= new PlacadeVideo();
        pv1.nome="GEFORCE RTX 2060";
        pv1.marca="Gigabyte";
        pv1.memoriaVideo="6GB";
        pv1.preco=2442.02;
        
        PlacadeVideo pv2= new PlacadeVideo();
        pv2.nome="GEFORCE 1060";
        pv2.marca="Zotac";
        pv2.memoriaVideo="6GB";
        pv2.preco=1363.61;
        
        PlacadeVideo pv3= new PlacadeVideo();
        pv3.nome="GTX 1050 TI";
        pv3.marca="Galax";
        pv3.memoriaVideo="4GB";
        pv3.preco=909.07;
        
        
        Ram r1= new Ram();
        r1.marca="G.Skill";
        r1.memoria="16GB";
        r1.frequencia="2400mhz";
        r1.preço=737.52;
        
        Ram r2= new Ram();
        r2.marca="Adata";
        r2.memoria="8GB";
        r2.frequencia="2666mhz";
        r2.preço=294.21;
        
        Ram r3= new Ram();
        r3.marca="G.Skill";
        r3.memoria="16GB";
        r3.frequencia="3000mhz";
        r3.preço=1590.79;
        
        
        System.out.println(p1.modelo);
        System.out.println(pm1.modelo);
        System.out.println(pv1.nome);
        System.out.println(r1.memoria);
        
    }
    
    
    
}
