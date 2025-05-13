public class SignedText{
    private String first;
    private String last;

    public SignedText(String first, String last){
        this.first = first;
        this.last = last;
    }

    public String getSignature(){
        if(first.length() == 0){
            return last;
        }
        return first.substring(0,1) + "-"+ last;
    }

    public String addSignature(String add){
        if(add.indexOf(getSignature()) == -1){
            return add + getSignature();
        }
        if(add.indexOf(getSignature()) == 0){
            return add.substring(getSignature().length()) + getSignature();
        }
        return add;
    }
}
