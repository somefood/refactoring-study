package me.whiteship.refactoring._02_duplicated_code.practice._06_pull_up_method;

import java.io.IOException;

public class ReviewerDashboard extends Dashboard {

    public void printReviewers() throws IOException {
        printUsernames(30);
    }
}
