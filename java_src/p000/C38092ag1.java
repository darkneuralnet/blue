package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lag1;", "Lk02;", "", "error", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ag1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38092ag1 extends AbstractC43646k02 {

    /* renamed from: a */
    public final Throwable f50919a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38092ag1(Throwable error) {
        super(null);
        Intrinsics.checkNotNullParameter(error, "error");
        this.f50919a = error;
    }

    public static /* synthetic */ C38092ag1 copy$default(C38092ag1 c38092ag1, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = c38092ag1.f50919a;
        }
        return c38092ag1.m70898a(th);
    }

    /* renamed from: a */
    public final C38092ag1 m70898a(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new C38092ag1(error);
    }

    /* renamed from: b */
    public final Throwable m70897b() {
        return this.f50919a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38092ag1) && Intrinsics.areEqual(this.f50919a, ((C38092ag1) obj).f50919a);
    }

    public int hashCode() {
        return this.f50919a.hashCode();
    }

    public String toString() {
        Throwable th = this.f50919a;
        return "Error(error=" + th + ")";
    }
}
