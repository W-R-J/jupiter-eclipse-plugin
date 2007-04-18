package csdl.jupiter.model.reviewissue;

/**
 * Provides the review interval. Clients can instantiate this with a key.
 *
 * @author Takuya Yamashita
 * @version $Id: Interval.java,v 1.1 2004/07/26 06:32:09 takuyay Exp $
 */
public class Interval {
  /** The key of the type. */
  private String key;

  /**
   * Instantiates this with the key of the type.
   *
   * @param key the key of the type.
   */
  public Interval(String key) {
    this.key = key;
  }

  /**
   * Gets the key for the <code>Interval</code> instance.
   *
   * @return the key for the <code>Interval</code> instance.
   */
  public String getKey() {
    return this.key;
  }
}
