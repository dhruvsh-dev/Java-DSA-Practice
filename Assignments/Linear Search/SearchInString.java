public class SearchInString {
    public static void main(String[] args) {
        String name = "Dhruv";
        System.out.println(searchString(name,'u'));
    }
    static boolean  searchString(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return  true;
            }
        }
        return  false;
    }

    static boolean  searchString2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(target==ch){
                return  true;
            }
        }
        return  false;
    }

}

