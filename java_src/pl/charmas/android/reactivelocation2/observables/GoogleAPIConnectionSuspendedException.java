package pl.charmas.android.reactivelocation2.observables;
/* loaded from: classes8.dex */
public class GoogleAPIConnectionSuspendedException extends RuntimeException {
    private final int cause;

    public GoogleAPIConnectionSuspendedException(int i) {
        this.cause = i;
    }

    public int getErrorCause() {
        return this.cause;
    }
}
