package tests;

import com.thoughtworks.example.Book;
import com.thoughtworks.example.IssueDetail;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;


public class IssueDetailTests {

    @Test
    public void ShouldBeAbleToCreateANewIssueDetail()   {
        Book book = new Book();
        IssueDetail issueDetail = new IssueDetail(book, "john");
        assertNotNull(issueDetail);
    }
}
