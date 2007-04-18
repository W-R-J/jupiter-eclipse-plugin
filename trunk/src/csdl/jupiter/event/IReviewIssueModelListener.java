package csdl.jupiter.event;


/**
 * Provides an interface for the ReviewIssue model change listener. 
 * The <code>EventIssueModelEvent</code> will be notified when ReviewIssueModel is
 * changed in such a way that a new ReviewIssue is added, an existing ReviewIssue is deleted,
 * and so forth. See the <code>ReviewIssueModelEvent</code> class for all the possible event.
 * Clients can add an implementing sub class into the <code>ReviewIssueModel</code>.
 *
 * @author Takuya Yamashita
 * @version $Id: IReviewIssueModelListener.java,v 1.3 2005/03/25 18:32:02 takuyay Exp $
 */
public interface IReviewIssueModelListener {
  /**
   * Called when a notifier notifies to this listener. <code>ReviewIssueModelEvent</code>
   * instance contains the event type such as <code>ReviewIssueModelEvent.ADD</code>, etc.
   * @param event the codeReview event to be notified.
   */
  void reviewIssueModelChanged(ReviewIssueModelEvent event);
}
