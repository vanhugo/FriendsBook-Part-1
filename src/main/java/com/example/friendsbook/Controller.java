package com.example.friendsbook;

import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class Controller {
    @FXML
    public TextField friendName;
    public TextField friendAge;
    public TextField friendCheese;
    public ListView<Friend> friendList;
    private ArrayList<Friend> friends;
    public Label displayName;
    public Label displayAge;
    public Label displayCheese;


    public Controller() {
        this.friends = new ArrayList<>();
    }

    @FXML
    public void onCreateButtonPressed() {
        Friend temp = new Friend(friendName.getText(), friendAge.getText(), friendCheese.getText());
        friendAge.clear();
        friendName.clear();
        friendCheese.clear();
        friends.add(temp);
        friendList.getItems().add(temp);

    }
    @FXML
    public void onDeleteButtonPressed() {
        // Get the index of the selected friend in the list
        int exFriend = friendList.getSelectionModel().getSelectedIndex();

        // Remove the selected friend from the list
        friendList.getItems().remove(exFriend);

        // Clear the displayed name, age, and favorite cheese fields
        displayName.setText("");
        displayAge.setText("");
        displayCheese.setText("");
    }
    public void displayFriend(MouseEvent mouseEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        displayName.setText(temp.name);
        displayAge.setText(temp.age);
        displayCheese.setText(temp.cheese);
    }
}