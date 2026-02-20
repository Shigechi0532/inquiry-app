package com.example.inquiry_app.controller;

import com.example.inquiry_app.form.InquiryForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

    // 入力画面表示
    @GetMapping
    public String form(Model model){
        // HTML側で"inquiryForm"という名前でデータを利用できるようにする。
        model.addAttribute("inquiryForm", new InquiryForm());
        return "inquiry/form";
    }

    // 確認画面へ遷移（入力チェックあり）
    @PostMapping("/confirm")
    public String confirm(@Validated @ModelAttribute InquiryForm inquiryForm,
                          BindingResult result, Model model)
    {
        // バリデーションエラーがある場合
        if (result.hasErrors()) {
            // 入力画面に戻る（エラーメッセージが表示される）
            return "inquiry/form";
        }
        // バリデーションエラーがなければ確認画面へ
        return "inquiry/confirm";

    }
}
