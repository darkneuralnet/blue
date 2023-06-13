package pl.charmas.android.reactivelocation2.observables;

import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes8.dex */
public class GoogleAPIConnectionException extends RuntimeException {
    private final ConnectionResult connectionResult;

    public GoogleAPIConnectionException(String str, ConnectionResult connectionResult) {
        super(str);
        this.connectionResult = connectionResult;
    }

    public ConnectionResult getConnectionResult() {
        return this.connectionResult;
    }
}
