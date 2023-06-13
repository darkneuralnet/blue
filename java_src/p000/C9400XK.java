package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LXK;", "Lg70;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XK */
/* loaded from: classes2.dex */
public final class C9400XK extends AbstractC41342g70 {

    /* renamed from: a */
    public final String f42980a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9400XK(String code) {
        super(null);
        Intrinsics.checkNotNullParameter(code, "code");
        this.f42980a = code;
    }

    public static /* synthetic */ C9400XK copy$default(C9400XK c9400xk, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c9400xk.f42980a;
        }
        return c9400xk.m77125a(str);
    }

    /* renamed from: a */
    public final C9400XK m77125a(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new C9400XK(code);
    }

    /* renamed from: b */
    public final String m77124b() {
        return this.f42980a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9400XK) && Intrinsics.areEqual(this.f42980a, ((C9400XK) obj).f42980a);
    }

    public int hashCode() {
        return this.f42980a.hashCode();
    }

    public String toString() {
        String str = this.f42980a;
        return "BirdCodeEnteredEvent(code=" + str + ")";
    }
}
