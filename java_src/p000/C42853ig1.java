package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"Lig1;", "LL14;", "", "message", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ig1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42853ig1 implements L14 {

    /* renamed from: a */
    public final String f87721a;

    public C42853ig1(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f87721a = message;
    }

    public static /* synthetic */ C42853ig1 copy$default(C42853ig1 c42853ig1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c42853ig1.f87721a;
        }
        return c42853ig1.m33604a(str);
    }

    /* renamed from: a */
    public final C42853ig1 m33604a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new C42853ig1(message);
    }

    /* renamed from: b */
    public final String m33603b() {
        return this.f87721a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42853ig1) && Intrinsics.areEqual(this.f87721a, ((C42853ig1) obj).f87721a);
    }

    public int hashCode() {
        return this.f87721a.hashCode();
    }

    public String toString() {
        String str = this.f87721a;
        return "ErrorMessage(message=" + str + ")";
    }
}
