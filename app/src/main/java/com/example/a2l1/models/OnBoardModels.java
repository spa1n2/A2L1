package com.example.a2l1.models;

public class OnBoardModels {
    private int image;
    private String text;
    private String buttonText;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    public OnBoardModels(int image, String text, String buttonText) {
        this.image = image;
        this.text = text;
        this.buttonText = buttonText;
    }
}
