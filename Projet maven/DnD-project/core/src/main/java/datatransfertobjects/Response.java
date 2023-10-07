package datatransfertobjects;

public class Response {
    final private String message;
    final private CharacterSheetDTO data;

    public Response(String message, CharacterSheetDTO data){
        this.message=message;
        this.data=data;
    }

    public String getMessage(){
        return this.message;
    }

    public CharacterSheetDTO getData(){
        return this.data;
    }
}
