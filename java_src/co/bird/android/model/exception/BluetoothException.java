package co.bird.android.model.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\nB\u0019\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/exception/BluetoothException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "cause", "", "reason", "Lco/bird/android/model/exception/BluetoothException$Reason;", "(Ljava/lang/Throwable;Lco/bird/android/model/exception/BluetoothException$Reason;)V", "getReason", "()Lco/bird/android/model/exception/BluetoothException$Reason;", "Reason", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BluetoothException extends RuntimeException {
    private final Reason reason;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/exception/BluetoothException$Reason;", "", "(Ljava/lang/String;I)V", "DISABLED", "SCAN", "CONNECTION", "TIMEOUT", "UNKNOWN", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum Reason {
        DISABLED,
        SCAN,
        CONNECTION,
        TIMEOUT,
        UNKNOWN
    }

    public /* synthetic */ BluetoothException(Throwable th, Reason reason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th, reason);
    }

    public final Reason getReason() {
        return this.reason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothException(Throwable th, Reason reason) {
        super(th);
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.reason = reason;
    }
}
