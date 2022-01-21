public class AgeProgrammClass {
    public static void main(String[] args){
        int vasyaAge = -54;
        int katyaAge = 493;
        int mishaAge = 2;
        int min = 0;
        int middle = 0;
        int max = 0;

        if(vasyaAge < katyaAge & vasyaAge < mishaAge)
            min = vasyaAge;
        else if(vasyaAge > katyaAge & vasyaAge > mishaAge)
            max = vasyaAge;
        else middle = vasyaAge;

        if(katyaAge < vasyaAge & katyaAge < mishaAge)
            min = katyaAge;
        else if(katyaAge > vasyaAge & katyaAge > mishaAge)
            max = katyaAge;
        else middle = katyaAge;

        if(mishaAge < vasyaAge & mishaAge < katyaAge)
            min = mishaAge;
        else if(mishaAge > vasyaAge & mishaAge > katyaAge)
            max = mishaAge;
        else middle = mishaAge;

        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximum age: " + max);
    }
}
