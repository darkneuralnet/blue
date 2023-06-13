package p000;

import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J<\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lyd4;", "", "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/PaymentMethod;", C17296a.f69688o, "", "paymentOptions", "", "googlePayAvailable", "paypalAvailable", "", "", "paymentMethodExclusion", "", "b", "Lc00;", "Lc00;", "binding", "<init>", "(Lc00;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yd4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52312yd4 {

    /* renamed from: a */
    public final C38883c00 f119870a;

    public C52312yd4(C38883c00 binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f119870a = binding;
    }

    public static /* synthetic */ void setPaymentMethods$default(C52312yd4 c52312yd4, List list, boolean z, boolean z2, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c52312yd4.m3150b(list, z, z2, map);
    }

    /* renamed from: a */
    public final Observable<PaymentMethod> m3151a() {
        return this.f119870a.f59870b.m57676d();
    }

    /* renamed from: b */
    public final void m3150b(List<? extends PaymentMethod> paymentOptions, boolean z, boolean z2, Map<PaymentMethod, String> paymentMethodExclusion) {
        Intrinsics.checkNotNullParameter(paymentOptions, "paymentOptions");
        Intrinsics.checkNotNullParameter(paymentMethodExclusion, "paymentMethodExclusion");
        this.f119870a.f59870b.setPaymentMethods(paymentOptions, z, z2, paymentMethodExclusion);
    }
}
