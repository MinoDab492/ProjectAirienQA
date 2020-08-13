package com.salifm.qa.model.view;

import java.util.List;

public class ProfileViewModel {
    private String username;
    private List<String> roles;
    private List<QuestionPreviewViewModel> questions;
    private List<QuestionPreviewViewModel> answeredQuestions;

    public ProfileViewModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public List<QuestionPreviewViewModel> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionPreviewViewModel> questions) {
        this.questions = questions;
    }

    public List<QuestionPreviewViewModel> getAnsweredQuestions() {
        return answeredQuestions;
    }

    public void setAnsweredQuestions(List<QuestionPreviewViewModel> answeredQuestions) {
        this.answeredQuestions = answeredQuestions;
    }
}