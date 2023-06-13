package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import io.reactivex.subjects.C24567g;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LvT3;", "T", "", "Lio/reactivex/subjects/g;", "subject", "Ljava/util/concurrent/atomic/AtomicBoolean;", "requestsStarted", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lio/reactivex/subjects/g;", "c", "()Lio/reactivex/subjects/g;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "(Lio/reactivex/subjects/g;Ljava/util/concurrent/atomic/AtomicBoolean;)V", "rx_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vT3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50439vT3<T> {

    /* renamed from: a */
    public final C24567g<T> f114149a;

    /* renamed from: b */
    public final AtomicBoolean f114150b;

    public C50439vT3() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C50439vT3 copy$default(C50439vT3 c50439vT3, C24567g c24567g, AtomicBoolean atomicBoolean, int i, Object obj) {
        if ((i & 1) != 0) {
            c24567g = c50439vT3.f114149a;
        }
        if ((i & 2) != 0) {
            atomicBoolean = c50439vT3.f114150b;
        }
        return c50439vT3.m8621a(c24567g, atomicBoolean);
    }

    /* renamed from: a */
    public final C50439vT3<T> m8621a(C24567g<T> subject, AtomicBoolean requestsStarted) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(requestsStarted, "requestsStarted");
        return new C50439vT3<>(subject, requestsStarted);
    }

    /* renamed from: b */
    public final AtomicBoolean m8620b() {
        return this.f114150b;
    }

    /* renamed from: c */
    public final C24567g<T> m8619c() {
        return this.f114149a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C50439vT3) {
            C50439vT3 c50439vT3 = (C50439vT3) obj;
            return Intrinsics.areEqual(this.f114149a, c50439vT3.f114149a) && Intrinsics.areEqual(this.f114150b, c50439vT3.f114150b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f114149a.hashCode() * 31) + this.f114150b.hashCode();
    }

    public String toString() {
        C24567g<T> c24567g = this.f114149a;
        AtomicBoolean atomicBoolean = this.f114150b;
        return "PiggybackSession(subject=" + c24567g + ", requestsStarted=" + atomicBoolean + ")";
    }

    public C50439vT3(C24567g<T> subject, AtomicBoolean requestsStarted) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(requestsStarted, "requestsStarted");
        this.f114149a = subject;
        this.f114150b = requestsStarted;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C50439vT3(C24567g c24567g, AtomicBoolean atomicBoolean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c24567g, (i & 2) != 0 ? new AtomicBoolean(false) : atomicBoolean);
        if ((i & 1) != 0) {
            c24567g = C24567g.m31882w0();
            Intrinsics.checkNotNullExpressionValue(c24567g, "create<T>()");
        }
    }
}
