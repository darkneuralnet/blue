package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdPayment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/widget/PaymentMethodsView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Lco/bird/android/model/BirdPayment;", "birdPayments", "", "setPaymentMethods", "defaultBirdPayment", "setDefaultPaymentMethod", "LxN3;", "b", "LxN3;", DateTokenConverter.CONVERTER_KEY, "()LxN3;", "adapter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PaymentMethodsView extends RecyclerView {

    /* renamed from: b */
    public final C51571xN3 f67455b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentMethodsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: d */
    public final C51571xN3 m54503d() {
        return this.f67455b;
    }

    public final void setDefaultPaymentMethod(BirdPayment birdPayment) {
        this.f67455b.m5329E(birdPayment);
    }

    public final void setPaymentMethods(List<BirdPayment> birdPayments) {
        Intrinsics.checkNotNullParameter(birdPayments, "birdPayments");
        this.f67455b.m44900B(birdPayments);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentMethodsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PaymentMethodsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaymentMethodsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C51571xN3 c51571xN3 = new C51571xN3(context);
        this.f67455b = c51571xN3;
        setLayoutManager(new LinearLayoutManager(context));
        setItemAnimator(new C34466Mf0(D62.f5249f.mo110910b()));
        addItemDecoration(new FN5(context, C37044Xf4.card_spacing));
        setAdapter(c51571xN3);
    }
}
