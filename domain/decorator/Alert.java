package domain.decorator;

import domain.model.AlertDecorator;
public interface Alert {
    String getMessage();
    int getSeverityLevel();
}

public abstract class AlertDecorator implements Alert{
    protected Alert wrappedAlert;

    public AlertDecorator(Alert alert){
        this.wrappedAlert = alert;
    }

    public String getMessage(){
        return wrappedAlert.getMessage()''
    }
}
