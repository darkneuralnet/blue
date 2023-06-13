package pl.charmas.android.reactivelocation2.observables;

import com.google.android.gms.common.api.Status;
/* loaded from: classes8.dex */
public class StatusException extends Throwable {
    private final Status status;

    public StatusException(Status status) {
        super(status.getStatusCode() + ": " + status.getStatusMessage());
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }
}
