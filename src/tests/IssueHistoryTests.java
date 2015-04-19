package tests;

import com.thoughtworks.example.Book;
import com.thoughtworks.example.IssueDetail;
import com.thoughtworks.example.IssueHistory;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 17/04/15.
 */
public class IssueHistoryTests {

    @Test
    public void NewIssueHistoryShouldBeEmpty()  {
        IssueHistory issueHistory = new IssueHistory();
        assertEquals(0, issueHistory.count());
    }

    @Test
    public void ShouldAddIssueDetail()   {
        IssueHistory issueHistory = new IssueHistory();
        issueHistory.add(new IssueDetail(new Book(), "John"));
        assertEquals(1, issueHistory.count());
    }

    @Test
    public void ShouldReturnACutomerName(){
        IssueHistory issueHistory= new IssueHistory();
        assertEquals("John",issueHistory.getCustomerName(1));
    }
}
