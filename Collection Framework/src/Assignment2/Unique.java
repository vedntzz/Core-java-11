package Assignment2;

import java.util.Objects;

public class Unique {

        int unique;
        public Unique( int unique) {
            super();

            this.unique = unique;
        }
        public int getUnique() {
            return unique;
        }

        public void setUnique(int unique) {
            this.unique = unique;
        }


    @Override
    public int hashCode() {
        return Objects.hash(unique);
    }
    @Override

    public String toString(){
        return "price: "+ unique;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Unique other = (Unique) obj;
        return unique == other.unique;
    }

}
