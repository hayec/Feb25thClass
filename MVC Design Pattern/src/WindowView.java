import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class WindowView 
{
	private HBox topPane; //For input
	private Label lblName;
	private Label lblID;
	private TextField txtName;
	private TextField txtID;
	private Button btnOK;
	
	private HBox bottomPane; // For output
	private Label lblNameOut;
	private Label lblIDOut;
	private TextField txtNameOut;
	private TextField txtIDOut;
	
	private VBox pane;//to contain top pane and bottom pane
	private OKButtonListener okButtonListener; //New Interface
	
	public WindowView(Stage stage)
	{
		topPane = new HBox(30);
		lblName = new Label("Name : ");
		lblName.setAlignment(Pos.CENTER_RIGHT);
		txtName = new TextField();
		lblID = new Label("ID : ");
		lblID.setAlignment(Pos.CENTER_RIGHT);
		txtID = new TextField();
		btnOK = new Button("OK");
		topPane.getChildren().addAll(lblName, txtName, lblID, txtID, btnOK);
		topPane.setAlignment(Pos.BASELINE_LEFT);
		topPane.setMargin(lblName, new Insets(30, 0, 0, 0));
		btnOK.setOnAction(e -> {
			String name = txtName.getText();
			String id = txtID.getText();
			OKButtonEventObject ev = new OKButtonEventObject(this, name, id);
			if (okButtonListener != null)
			{
				okButtonListener.okButtonClicked(ev);
			}
		});

		bottomPane = new HBox(30);
		lblNameOut = new Label("Name : ");
		lblNameOut.setAlignment(Pos.CENTER_RIGHT);
		txtNameOut = new TextField();
		lblIDOut = new Label("ID : ");
		lblIDOut.setAlignment(Pos.CENTER_RIGHT);
		txtIDOut = new TextField();
		topPane.getChildren().addAll(lblNameOut, txtNameOut, lblIDOut, txtIDOut);
		topPane.setAlignment(Pos.BASELINE_LEFT);
		
		//Parent Pane
		pane = new VBox(30);
		pane.getChildren().addAll(topPane, bottomPane);
		stage.setScene(new Scene(pane, 600, 200));
		stage.show();
		
	
	}
	public void setOKButtonListener(OKButtonListener okButtonListener)
	{
		this.okButtonListener = okButtonListener;
	}
	public void setNameField(String name)
	{
		txtNameOut.setText(name);
	}
	public void setIDField(String id)
	{
		txtIDOut.setText(id);
	}
}
