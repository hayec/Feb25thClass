import javafx.application.Application;
import javafx.stage.Stage;


public class Demo extends Application
{

	public static void main(String[] args) 
	{
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception
	{
		WindowView window = new WindowView(stage);
		Student model = new Student();
		StudentController  controller = new StudentController(model, window);
	}
}
