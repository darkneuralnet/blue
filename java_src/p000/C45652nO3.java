package p000;

import androidx.recyclerview.widget.C11925l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdPayment;
import co.bird.android.widget.PaymentMethodsView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LnO3;", "LxE;", "LlO3;", "", "Lco/bird/android/model/BirdPayment;", "birds", "", "U8", "defaultBirdPayment", "ke", "Lio/reactivex/Observable;", "Oh", "", "show", "", "hiddenState", "showProgress", "Z4", "Lco/bird/android/widget/PaymentMethodsView;", "b", "Lco/bird/android/widget/PaymentMethodsView;", "view", "LmX5;", "c", "LmX5;", "swipeToRemoveHelper", "Landroidx/recyclerview/widget/l;", DateTokenConverter.CONVERTER_KEY, "Landroidx/recyclerview/widget/l;", "itemTouchHelper", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nO3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45652nO3 extends AbstractC30071xE implements InterfaceC44466lO3 {

    /* renamed from: b */
    public final PaymentMethodsView f99858b;

    /* renamed from: c */
    public final C45142mX5 f99859c;

    /* renamed from: d */
    public final C11925l f99860d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "position", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lco/bird/android/model/BirdPayment;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: nO3$a */
    /* loaded from: classes2.dex */
    public static final class C26471a extends Lambda implements Function1<Integer, BirdPayment> {
        public C26471a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final BirdPayment invoke(Integer position) {
            Intrinsics.checkNotNullParameter(position, "position");
            return C45652nO3.this.f99858b.m54503d().m44895q(position.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45652nO3(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        PaymentMethodsView paymentMethodsView = (PaymentMethodsView) C40788fB0.m41779c(activity, C36585Vg4.cardsView);
        this.f99858b = paymentMethodsView;
        C45142mX5 c45142mX5 = new C45142mX5(activity, 0, null, null, 14, null);
        this.f99859c = c45142mX5;
        C11925l c11925l = new C11925l(c45142mX5);
        this.f99860d = c11925l;
        c11925l.m66204g(paymentMethodsView);
    }

    /* renamed from: Ql */
    public static final BirdPayment m23903Ql(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (BirdPayment) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44466lO3
    /* renamed from: Oh */
    public Observable<BirdPayment> mo23905Oh() {
        return this.f99858b.m54503d().m44893t();
    }

    @Override // p000.InterfaceC44466lO3
    /* renamed from: U8 */
    public void mo23902U8(List<BirdPayment> birds) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        this.f99858b.setPaymentMethods(birds);
    }

    @Override // p000.InterfaceC44466lO3
    /* renamed from: Z4 */
    public Observable<BirdPayment> mo23901Z4() {
        Observable<Integer> m25451b = this.f99859c.m25451b();
        final C26471a c26471a = new C26471a();
        Observable map = m25451b.map(new InterfaceC23492o() { // from class: mO3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                BirdPayment m23903Ql;
                m23903Ql = C45652nO3.m23903Ql(Function1.this, obj);
                return m23903Ql;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun onPaymentMe…ter[position]\n      }\n  }");
        return map;
    }

    @Override // p000.InterfaceC44466lO3
    /* renamed from: ke */
    public void mo23900ke(BirdPayment birdPayment) {
        this.f99858b.setDefaultPaymentMethod(birdPayment);
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        super.showProgress(z, 4);
    }
}
