package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lnn4;", "", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "average", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "D", "()D", "<init>", "(Ljava/lang/String;D)V", "co.bird.android.feature.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nn4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45891nn4 {

    /* renamed from: a */
    public final String f100515a;

    /* renamed from: b */
    public final double f100516b;

    public C45891nn4(String code, double d) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f100515a = code;
        this.f100516b = d;
    }

    public static /* synthetic */ C45891nn4 copy$default(C45891nn4 c45891nn4, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c45891nn4.f100515a;
        }
        if ((i & 2) != 0) {
            d = c45891nn4.f100516b;
        }
        return c45891nn4.m23147a(str, d);
    }

    /* renamed from: a */
    public final C45891nn4 m23147a(String code, double d) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new C45891nn4(code, d);
    }

    /* renamed from: b */
    public final double m23146b() {
        return this.f100516b;
    }

    /* renamed from: c */
    public final String m23145c() {
        return this.f100515a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C45891nn4) {
            C45891nn4 c45891nn4 = (C45891nn4) obj;
            return Intrinsics.areEqual(this.f100515a, c45891nn4.f100515a) && Double.compare(this.f100516b, c45891nn4.f100516b) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (this.f100515a.hashCode() * 31) + Double.hashCode(this.f100516b);
    }

    public String toString() {
        String str = this.f100515a;
        double d = this.f100516b;
        return "RatingSummary(code=" + str + ", average=" + d + ")";
    }
}
