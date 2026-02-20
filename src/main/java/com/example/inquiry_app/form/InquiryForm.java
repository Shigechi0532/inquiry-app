package com.example.inquiry_app.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class InquiryForm {

    @NotBlank(message = "名前を入力してください")
    @Size(max = 60, message = "名前は60文字以内で入力してください")
    private String name;

    @NotBlank(message = "メールアドレスを入力してください")
    @Email(message = "メールアドレスの形式が正しくありません")
    @Size(max = 254, message = "メールアドレスは254文字以内で入力してください")
    private String email;

    @NotBlank(message = "お問い合わせ内容を入力してください")
    @Size(max = 500, message = "問い合わせ内容は500文字以内で入力してください")
    private String content;

    // Getter / Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
