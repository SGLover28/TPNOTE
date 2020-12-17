public enum Habilitation implements Comparable {
ECRITURE,
    LECTURE,
    MODIFICATION,
    SUPPRESSION,
    DROIT_INVITATION;




    /*public int compareTo(Object T) {
        int result;
        if (this == T) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }*/

    public int compareTo(Object T) {
        return super.compareTo((Habilitation) T);
    }
}
