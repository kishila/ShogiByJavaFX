package application.Controllers;


import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class ShogiController {
	@FXML private ImageView cell_00;
	@FXML private ImageView cell_10;
	@FXML private ImageView cell_20;
	@FXML private ImageView cell_30;
	@FXML private ImageView cell_40;
	@FXML private ImageView cell_50;
	@FXML private ImageView cell_60;
	@FXML private ImageView cell_70;
	@FXML private ImageView cell_80;

	@FXML
	private void onClickCell(MouseEvent event){
		String id = event.getPickResult().getIntersectedNode().getId(); // cellのidの取得

		System.out.println(id);


	}
}
