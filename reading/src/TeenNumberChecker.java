public class TeenNumberChecker {
    public static boolean hasTeen (int personA, int personB, int personC){
        return ((personA>=13 && personA<=19) ||(personB>=13 && personB<=19)||(personC>=13 && personC<=19));
    }
    public static boolean isTeen (int personD){
        return (personD<=19 && personD>=13);
    }
}
