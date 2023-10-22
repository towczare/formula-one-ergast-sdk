package pl.kodujmy.formula.ergast.exceptions;


public class QueryLimitException extends IllegalArgumentException {
    public QueryLimitException(String msg) {
        super(msg);
    }
}
