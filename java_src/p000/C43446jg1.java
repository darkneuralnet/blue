package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Ljg1;", "LXs;", "", "throwable", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jg1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43446jg1 implements InterfaceC9534Xs {

    /* renamed from: a */
    public final Throwable f93122a;

    public C43446jg1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f93122a = throwable;
    }

    public static /* synthetic */ C43446jg1 copy$default(C43446jg1 c43446jg1, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c43446jg1.f93122a;
        }
        return c43446jg1.m30125a(th);
    }

    /* renamed from: a */
    public final C43446jg1 m30125a(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C43446jg1(throwable);
    }

    /* renamed from: b */
    public final Throwable m30124b() {
        return this.f93122a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C43446jg1) && Intrinsics.areEqual(this.f93122a, ((C43446jg1) obj).f93122a);
    }

    public int hashCode() {
        return this.f93122a.hashCode();
    }

    public String toString() {
        Throwable th = this.f93122a;
        return "ErrorMessage(throwable=" + th + ")";
    }
}
