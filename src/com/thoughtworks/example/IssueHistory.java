package com.thoughtworks.example;

import java.util.ArrayList;

/**
 * Created by dabluk on 17/04/15.
 */
public class IssueHistory {
    private ArrayList<IssueDetail> issueDetailArrayList;

    public IssueHistory() {
        issueDetailArrayList = new ArrayList<IssueDetail>();
    }

    public void add(IssueDetail issueDetail) {
        issueDetailArrayList.add(issueDetail);
    }

    public int count() {
        return issueDetailArrayList.size();
    }

    public String getCustomerName(int bookno) {
        for(IssueDetail issueDetail:issueDetailArrayList){
            return null;
        }
        return null;
    }
}
