package co.bird.android.feature.payment.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.PaymentMethod;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J<\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, m28432d2 = {"Lco/bird/android/feature/payment/views/SupportedPaymentMethodsView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/PaymentMethod;", DateTokenConverter.CONVERTER_KEY, "", "paymentMethods", "", "googlePayAvailable", "paypalAvailable", "", "", "paymentMethodExclusion", "", "setPaymentMethods", "LxV5;", "b", "LxV5;", "getAdapter", "()LxV5;", "adapter", "LyV5;", "c", "LyV5;", "getConverter", "()LyV5;", "converter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SupportedPaymentMethodsView extends RecyclerView {

    /* renamed from: b */
    public final C51645xV5 f64507b;

    /* renamed from: c */
    public final C52238yV5 f64508c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupportedPaymentMethodsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setPaymentMethods$default(SupportedPaymentMethodsView supportedPaymentMethodsView, List list, boolean z, boolean z2, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        supportedPaymentMethodsView.setPaymentMethods(list, z, z2, map);
    }

    /* renamed from: d */
    public final Observable<PaymentMethod> m57676d() {
        return this.f64507b.m5109v();
    }

    public final void setPaymentMethods(List<? extends PaymentMethod> paymentMethods, boolean z, boolean z2, Map<PaymentMethod, String> paymentMethodExclusion) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(paymentMethodExclusion, "paymentMethodExclusion");
        this.f64507b.mo24871u(this.f64508c.m3440a(paymentMethods, z, z2, paymentMethodExclusion));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupportedPaymentMethodsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SupportedPaymentMethodsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupportedPaymentMethodsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C51645xV5 c51645xV5 = new C51645xV5();
        this.f64507b = c51645xV5;
        this.f64508c = new C52238yV5(context);
        setLayoutManager(new LinearLayoutManager(context));
        setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        addItemDecoration(new FN5(context, C37044Xf4.card_spacing));
        setAdapter(c51645xV5);
    }
}
