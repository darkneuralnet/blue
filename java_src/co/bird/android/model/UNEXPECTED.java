package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/UNEXPECTED;", "Lco/bird/android/model/PaymentIntentStatus;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UNEXPECTED implements PaymentIntentStatus {
    private final Throwable throwable;

    public UNEXPECTED() {
        this(null, 1, null);
    }

    public static /* synthetic */ UNEXPECTED copy$default(UNEXPECTED unexpected, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = unexpected.throwable;
        }
        return unexpected.copy(th);
    }

    public final Throwable component1() {
        return this.throwable;
    }

    public final UNEXPECTED copy(Throwable th) {
        return new UNEXPECTED(th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UNEXPECTED) && Intrinsics.areEqual(this.throwable, ((UNEXPECTED) obj).throwable);
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        Throwable th = this.throwable;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public String toString() {
        Throwable th = this.throwable;
        return "UNEXPECTED(throwable=" + th + ")";
    }

    public UNEXPECTED(Throwable th) {
        this.throwable = th;
    }

    public /* synthetic */ UNEXPECTED(Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th);
    }
}
