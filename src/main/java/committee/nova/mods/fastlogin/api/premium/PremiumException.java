package committee.nova.mods.fastlogin.api.premium;

/**
 * Author cnlimiter
 * CreateTime 2023/6/11 4:14
 * Name PremiumException
 * Description
 */

public class PremiumException extends Exception {

    private final Issue issue;

    public PremiumException(Issue issue, Exception exception) {
        super(exception);
        this.issue = issue;
    }

    public PremiumException(Issue issue, String message) {
        super(message);
        this.issue = issue;
    }

    public Issue getIssue() {
        return issue;
    }

    public enum Issue {
        THROTTLED, SERVER_EXCEPTION, UNDEFINED
    }

}
