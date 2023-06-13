package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"LS84;", "LL14;", "LZg3;", "onPaymentMethodSelectedListener", "", "Lco/bird/android/model/constant/PaymentMethod;", "excludePaymentMethods", "", "autoPayToggled", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "LZg3;", DateTokenConverter.CONVERTER_KEY, "()LZg3;", "b", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "Z", "()Z", "<init>", "(LZg3;Ljava/util/Set;Z)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: S84 */
/* loaded from: classes3.dex */
public final class S84 implements L14 {

    /* renamed from: a */
    public final InterfaceC37520Zg3 f33239a;

    /* renamed from: b */
    public final Set<PaymentMethod> f33240b;

    /* renamed from: c */
    public final boolean f33241c;

    /* JADX WARN: Multi-variable type inference failed */
    public S84(InterfaceC37520Zg3 onPaymentMethodSelectedListener, Set<? extends PaymentMethod> excludePaymentMethods, boolean z) {
        Intrinsics.checkNotNullParameter(onPaymentMethodSelectedListener, "onPaymentMethodSelectedListener");
        Intrinsics.checkNotNullParameter(excludePaymentMethods, "excludePaymentMethods");
        this.f33239a = onPaymentMethodSelectedListener;
        this.f33240b = excludePaymentMethods;
        this.f33241c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ S84 copy$default(S84 s84, InterfaceC37520Zg3 interfaceC37520Zg3, Set set, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC37520Zg3 = s84.f33239a;
        }
        if ((i & 2) != 0) {
            set = s84.f33240b;
        }
        if ((i & 4) != 0) {
            z = s84.f33241c;
        }
        return s84.m85907a(interfaceC37520Zg3, set, z);
    }

    /* renamed from: a */
    public final S84 m85907a(InterfaceC37520Zg3 onPaymentMethodSelectedListener, Set<? extends PaymentMethod> excludePaymentMethods, boolean z) {
        Intrinsics.checkNotNullParameter(onPaymentMethodSelectedListener, "onPaymentMethodSelectedListener");
        Intrinsics.checkNotNullParameter(excludePaymentMethods, "excludePaymentMethods");
        return new S84(onPaymentMethodSelectedListener, excludePaymentMethods, z);
    }

    /* renamed from: b */
    public final boolean m85906b() {
        return this.f33241c;
    }

    /* renamed from: c */
    public final Set<PaymentMethod> m85905c() {
        return this.f33240b;
    }

    /* renamed from: d */
    public final InterfaceC37520Zg3 m85904d() {
        return this.f33239a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S84) {
            S84 s84 = (S84) obj;
            return Intrinsics.areEqual(this.f33239a, s84.f33239a) && Intrinsics.areEqual(this.f33240b, s84.f33240b) && this.f33241c == s84.f33241c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f33239a.hashCode() * 31) + this.f33240b.hashCode()) * 31;
        boolean z = this.f33241c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        InterfaceC37520Zg3 interfaceC37520Zg3 = this.f33239a;
        Set<PaymentMethod> set = this.f33240b;
        boolean z = this.f33241c;
        return "PromptAddPayment(onPaymentMethodSelectedListener=" + interfaceC37520Zg3 + ", excludePaymentMethods=" + set + ", autoPayToggled=" + z + ")";
    }
}
