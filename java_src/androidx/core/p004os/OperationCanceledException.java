package androidx.core.p004os;
/* renamed from: androidx.core.os.OperationCanceledException */
/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(C37259Yd3.m74776e(str, "The operation has been canceled."));
    }
}
