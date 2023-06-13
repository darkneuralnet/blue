package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"LT84;", "Lz04;", "LZg3;", "onPaymentMethodSelectedListener", "", "Lco/bird/android/model/constant/PaymentMethod;", "excludePaymentMethods", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "LZg3;", "c", "()LZg3;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "<init>", "(LZg3;Ljava/util/Set;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: T84 */
/* loaded from: classes3.dex */
public final class T84 implements InterfaceC52541z04 {

    /* renamed from: a */
    public final InterfaceC37520Zg3 f34837a;

    /* renamed from: b */
    public final Set<PaymentMethod> f34838b;

    /* JADX WARN: Multi-variable type inference failed */
    public T84(InterfaceC37520Zg3 onPaymentMethodSelectedListener, Set<? extends PaymentMethod> excludePaymentMethods) {
        Intrinsics.checkNotNullParameter(onPaymentMethodSelectedListener, "onPaymentMethodSelectedListener");
        Intrinsics.checkNotNullParameter(excludePaymentMethods, "excludePaymentMethods");
        this.f34837a = onPaymentMethodSelectedListener;
        this.f34838b = excludePaymentMethods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ T84 copy$default(T84 t84, InterfaceC37520Zg3 interfaceC37520Zg3, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC37520Zg3 = t84.f34837a;
        }
        if ((i & 2) != 0) {
            set = t84.f34838b;
        }
        return t84.m84275a(interfaceC37520Zg3, set);
    }

    /* renamed from: a */
    public final T84 m84275a(InterfaceC37520Zg3 onPaymentMethodSelectedListener, Set<? extends PaymentMethod> excludePaymentMethods) {
        Intrinsics.checkNotNullParameter(onPaymentMethodSelectedListener, "onPaymentMethodSelectedListener");
        Intrinsics.checkNotNullParameter(excludePaymentMethods, "excludePaymentMethods");
        return new T84(onPaymentMethodSelectedListener, excludePaymentMethods);
    }

    /* renamed from: b */
    public final Set<PaymentMethod> m84274b() {
        return this.f34838b;
    }

    /* renamed from: c */
    public final InterfaceC37520Zg3 m84273c() {
        return this.f34837a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof T84) {
            T84 t84 = (T84) obj;
            return Intrinsics.areEqual(this.f34837a, t84.f34837a) && Intrinsics.areEqual(this.f34838b, t84.f34838b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f34837a.hashCode() * 31) + this.f34838b.hashCode();
    }

    public String toString() {
        InterfaceC37520Zg3 interfaceC37520Zg3 = this.f34837a;
        Set<PaymentMethod> set = this.f34838b;
        return "PromptAddPaymentPayPerRide(onPaymentMethodSelectedListener=" + interfaceC37520Zg3 + ", excludePaymentMethods=" + set + ")";
    }
}
