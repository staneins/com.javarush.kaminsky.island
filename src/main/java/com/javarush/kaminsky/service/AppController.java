package com.javarush.kaminsky.service;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.Map;

public class AppController {
    PrototypeFactory prototypeFactory;
    private Map<Integer, Label> labels = new HashMap<>();

    public Label getLabel(int index) {
        return labels.get(index);
    }

    @FXML private Label cell1;
    @FXML private Label cell2;
    @FXML private Label cell3;
    @FXML private Label cell4;
    @FXML private Label cell5;
    @FXML private Label cell6;
    @FXML private Label cell7;
    @FXML private Label cell8;
    @FXML private Label cell9;
    @FXML private Label cell10;

    @FXML private Label cell11;
    @FXML private Label cell12;
    @FXML private Label cell13;
    @FXML private Label cell14;
    @FXML private Label cell15;
    @FXML private Label cell16;
    @FXML private Label cell17;
    @FXML private Label cell18;
    @FXML private Label cell19;
    @FXML private Label cell20;

    @FXML private Label cell21;
    @FXML private Label cell22;
    @FXML private Label cell23;
    @FXML private Label cell24;
    @FXML private Label cell25;
    @FXML private Label cell26;
    @FXML private Label cell27;
    @FXML private Label cell28;
    @FXML private Label cell29;
    @FXML private Label cell30;

    @FXML private Label cell31;
    @FXML private Label cell32;
    @FXML private Label cell33;
    @FXML private Label cell34;
    @FXML private Label cell35;
    @FXML private Label cell36;
    @FXML private Label cell37;
    @FXML private Label cell38;
    @FXML private Label cell39;
    @FXML private Label cell40;

    @FXML private Label cell41;
    @FXML private Label cell42;
    @FXML private Label cell43;
    @FXML private Label cell44;
    @FXML private Label cell45;
    @FXML private Label cell46;
    @FXML private Label cell47;
    @FXML private Label cell48;
    @FXML private Label cell49;
    @FXML private Label cell50;

    @FXML private Label cell51;
    @FXML private Label cell52;
    @FXML private Label cell53;
    @FXML private Label cell54;
    @FXML private Label cell55;
    @FXML private Label cell56;
    @FXML private Label cell57;
    @FXML private Label cell58;
    @FXML private Label cell59;
    @FXML private Label cell60;

    @FXML private Label cell61;
    @FXML private Label cell62;
    @FXML private Label cell63;
    @FXML private Label cell64;
    @FXML private Label cell65;
    @FXML private Label cell66;
    @FXML private Label cell67;
    @FXML private Label cell68;
    @FXML private Label cell69;
    @FXML private Label cell70;

    @FXML private Label cell71;
    @FXML private Label cell72;
    @FXML private Label cell73;
    @FXML private Label cell74;
    @FXML private Label cell75;
    @FXML private Label cell76;
    @FXML private Label cell77;
    @FXML private Label cell78;
    @FXML private Label cell79;
    @FXML private Label cell80;

    @FXML private Label cell81;
    @FXML private Label cell82;
    @FXML private Label cell83;
    @FXML private Label cell84;
    @FXML private Label cell85;
    @FXML private Label cell86;
    @FXML private Label cell87;
    @FXML private Label cell88;
    @FXML private Label cell89;
    @FXML private Label cell90;

    @FXML private Label cell91;
    @FXML private Label cell92;
    @FXML private Label cell93;
    @FXML private Label cell94;
    @FXML private Label cell95;
    @FXML private Label cell96;
    @FXML private Label cell97;
    @FXML private Label cell98;
    @FXML private Label cell99;
    @FXML private Label cell100;

    @FXML
    public void initialize() {
        labels.put(1, cell1);
        labels.put(2, cell2);
        labels.put(3, cell3);
        labels.put(4, cell4);
        labels.put(5, cell5);
        labels.put(6, cell6);
        labels.put(7, cell7);
        labels.put(8, cell8);
        labels.put(9, cell9);
        labels.put(10, cell10);

        labels.put(11, cell11);
        labels.put(12, cell12);
        labels.put(13, cell13);
        labels.put(14, cell14);
        labels.put(15, cell15);
        labels.put(16, cell16);
        labels.put(17, cell17);
        labels.put(18, cell18);
        labels.put(19, cell19);
        labels.put(20, cell20);

        labels.put(21, cell21);
        labels.put(22, cell22);
        labels.put(23, cell23);
        labels.put(24, cell24);
        labels.put(25, cell25);
        labels.put(26, cell26);
        labels.put(27, cell27);
        labels.put(28, cell28);
        labels.put(29, cell29);
        labels.put(30, cell30);

        labels.put(31, cell31);
        labels.put(32, cell32);
        labels.put(33, cell33);
        labels.put(34, cell34);
        labels.put(35, cell35);
        labels.put(36, cell36);
        labels.put(37, cell37);
        labels.put(38, cell38);
        labels.put(39, cell39);
        labels.put(40, cell40);

        labels.put(41, cell41);
        labels.put(42, cell42);
        labels.put(43, cell43);
        labels.put(44, cell44);
        labels.put(45, cell45);
        labels.put(46, cell46);
        labels.put(47, cell47);
        labels.put(48, cell48);
        labels.put(49, cell49);
        labels.put(50, cell50);

        labels.put(51, cell51);
        labels.put(52, cell52);
        labels.put(53, cell53);
        labels.put(54, cell54);
        labels.put(55, cell55);
        labels.put(56, cell56);
        labels.put(57, cell57);
        labels.put(58, cell58);
        labels.put(59, cell59);
        labels.put(60, cell60);

        labels.put(61, cell61);
        labels.put(62, cell62);
        labels.put(63, cell63);
        labels.put(64, cell64);
        labels.put(65, cell65);
        labels.put(66, cell66);
        labels.put(67, cell67);
        labels.put(68, cell68);
        labels.put(69, cell69);
        labels.put(70, cell70);

        labels.put(71, cell71);
        labels.put(72, cell72);
        labels.put(73, cell73);
        labels.put(74, cell74);
        labels.put(75, cell75);
        labels.put(76, cell76);
        labels.put(77, cell77);
        labels.put(78, cell78);
        labels.put(79, cell79);
        labels.put(80, cell80);

        labels.put(81, cell81);
        labels.put(82, cell82);
        labels.put(83, cell83);
        labels.put(84, cell84);
        labels.put(85, cell85);
        labels.put(86, cell86);
        labels.put(87, cell87);
        labels.put(88, cell88);
        labels.put(89, cell89);
        labels.put(90, cell90);

        labels.put(91, cell91);
        labels.put(92, cell92);
        labels.put(93, cell93);
        labels.put(94, cell94);
        labels.put(95, cell95);
        labels.put(96, cell96);
        labels.put(97, cell97);
        labels.put(98, cell98);
        labels.put(99, cell99);
        labels.put(100, cell100);
    }
}
