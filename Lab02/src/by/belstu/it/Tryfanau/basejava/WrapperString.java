package by.belstu.it.Tryfanau.basejava;



public class WrapperString {

    private String str;

    public WrapperString() {
        str = "WrapperString";
    }

    public WrapperString(String str) {
        this.str = str;
    }

    public String toString() {
        return "WrapperString{}";
    }

    public void replace(char oldchar, char newchar)
    {
        str.replace(oldchar, newchar);
    }

    public static class anon extends WrapperString
    {
        @Override
        public void replace(char oldchar, char newchar) {
            super.replace(oldchar, newchar);
        }
    }
/**@author Максим */

}
