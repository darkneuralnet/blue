package co.bird.android.feature.payment.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\"\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014R\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m28432d2 = {"Lco/bird/android/feature/payment/views/SupportedPaymentBrandsView;", "Landroid/widget/GridView;", "", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethods", "", "unsupportedCardBrands", "", "setPaymentMethods", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "b", "I", "itemSize", "LwV5;", "c", "LwV5;", "getAdapter", "()LwV5;", "adapter", "LuV5;", DateTokenConverter.CONVERTER_KEY, "LuV5;", "getConverter", "()LuV5;", "converter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "e", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SupportedPaymentBrandsView extends GridView {

    /* renamed from: e */
    public static final C15132a f64502e = new C15132a(null);

    /* renamed from: f */
    public static final int f64503f = C37278Yf4.payment_brand_size;

    /* renamed from: b */
    public final int f64504b;

    /* renamed from: c */
    public final C51052wV5 f64505c;

    /* renamed from: d */
    public final C49867uV5 f64506d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/payment/views/SupportedPaymentBrandsView$a;", "", "", "ITEM_SIZE_DIMEN_ID", "I", C17296a.f69688o, "()I", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.payment.views.SupportedPaymentBrandsView$a */
    /* loaded from: classes3.dex */
    public static final class C15132a {
        public /* synthetic */ C15132a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m57677a() {
            return SupportedPaymentBrandsView.f64503f;
        }

        private C15132a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupportedPaymentBrandsView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public final void setPaymentMethods(List<? extends PaymentMethod> paymentMethods, List<String> unsupportedCardBrands) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(unsupportedCardBrands, "unsupportedCardBrands");
        this.f64505c.m6727b(this.f64506d.m10204a(paymentMethods, unsupportedCardBrands));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupportedPaymentBrandsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SupportedPaymentBrandsView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupportedPaymentBrandsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(f64503f);
        this.f64504b = dimensionPixelSize;
        C51052wV5 c51052wV5 = new C51052wV5(context);
        this.f64505c = c51052wV5;
        this.f64506d = new C49867uV5(context);
        setAdapter((ListAdapter) c51052wV5);
        setNumColumns(-1);
        setColumnWidth(dimensionPixelSize);
        setEnabled(false);
    }
}
