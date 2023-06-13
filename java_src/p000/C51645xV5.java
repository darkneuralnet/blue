package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00030\u00030\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m28432d2 = {"LxV5;", "LyS0;", "Lio/reactivex/Observable;", "Lco/bird/android/model/constant/PaymentMethod;", "v", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Lw1;", "onCreateViewHolder", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "paymentMethodSubject", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xV5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51645xV5 extends AbstractC52206yS0 {

    /* renamed from: c */
    public final C24558d<PaymentMethod> f117731c;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LxV5$a;", "Lw1;", "", "position", "", "bind", "LAe2;", "b", "LAe2;", "binding", "Landroid/view/View;", "view", "<init>", "(LxV5;Landroid/view/View;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSupportedPaymentMethodAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethodAdapter.kt\nco/bird/android/feature/payment/adapters/SupportedPaymentMethodAdapter$SupportedPaymentMethodViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,66:1\n18#2:67\n9#3,4:68\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethodAdapter.kt\nco/bird/android/feature/payment/adapters/SupportedPaymentMethodAdapter$SupportedPaymentMethodViewHolder\n*L\n46#1:67\n46#1:68,4\n*E\n"})
    /* renamed from: xV5$a */
    /* loaded from: classes3.dex */
    public final class C30217a extends C29735w1 {

        /* renamed from: b */
        public final C31651Ae2 f117732b;

        /* renamed from: c */
        public final /* synthetic */ C51645xV5 f117733c;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nSupportedPaymentMethodAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethodAdapter.kt\nco/bird/android/feature/payment/adapters/SupportedPaymentMethodAdapter$SupportedPaymentMethodViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,66:1\n18#2:67\n9#3,4:68\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethodAdapter.kt\nco/bird/android/feature/payment/adapters/SupportedPaymentMethodAdapter$SupportedPaymentMethodViewHolder$1\n*L\n39#1:67\n39#1:68,4\n*E\n"})
        /* renamed from: xV5$a$a */
        /* loaded from: classes3.dex */
        public static final class C30218a extends Lambda implements Function1<View, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C51645xV5 f117734g;

            /* renamed from: h */
            public final /* synthetic */ C30217a f117735h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30218a(C51645xV5 c51645xV5, C30217a c30217a) {
                super(1);
                this.f117734g = c51645xV5;
                this.f117735h = c30217a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View view) {
                Object m105816c = this.f117734g.m94545o().m109397e(this.f117735h.getPosition()).m105816c();
                if (!(m105816c instanceof C52831zV5)) {
                    m105816c = null;
                }
                C52831zV5 c52831zV5 = (C52831zV5) m105816c;
                if (c52831zV5 != null) {
                    C51645xV5 c51645xV5 = this.f117734g;
                    if (c52831zV5.m1291d() == null) {
                        c51645xV5.f117731c.onNext(c52831zV5.m1292c());
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30217a(C51645xV5 c51645xV5, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.f117733c = c51645xV5;
            C31651Ae2 m115420a = C31651Ae2.m115420a(view);
            Intrinsics.checkNotNullExpressionValue(m115420a, "bind(view)");
            this.f117732b = m115420a;
            ConstraintLayout root = m115420a.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            C34585Ms2.m94661j(root, new C30218a(c51645xV5, this));
        }

        @Override // p000.C29735w1
        public void bind(int i) {
            boolean z;
            Object m105816c = this.f117733c.m94545o().m109397e(i).m105816c();
            if (!(m105816c instanceof C52831zV5)) {
                m105816c = null;
            }
            C52831zV5 c52831zV5 = (C52831zV5) m105816c;
            if (c52831zV5 != null) {
                if (c52831zV5.m1291d() == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f117732b.f896b.setImageResource(c52831zV5.m1293b());
                this.f117732b.f898d.setText(c52831zV5.m1290e());
                TextView textView = this.f117732b.f897c;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.paymentSubtitle");
                C49520tu6.setTextAndVisibility$default(textView, c52831zV5.m1291d(), 0, 2, null);
                if (z) {
                    ConstraintLayout root = this.f117732b.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                    this.f117732b.f898d.setTextColor(C49520tu6.m11241j(root, C32364Df4.colorPrimary));
                    ImageView imageView = this.f117732b.f899e;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.sideIcon");
                    C49520tu6.m11239l(imageView);
                    return;
                }
                ConstraintLayout root2 = this.f117732b.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "binding.root");
                this.f117732b.f898d.setTextColor(C49520tu6.m11241j(root2, C32364Df4.passiveText));
                ImageView imageView2 = this.f117732b.f899e;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.sideIcon");
                C49520tu6.m11233r(imageView2);
            }
        }
    }

    public C51645xV5() {
        C24558d<PaymentMethod> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<PaymentMethod>()");
        this.f117731c = m31902e;
    }

    /* renamed from: v */
    public final Observable<PaymentMethod> m5109v() {
        Observable<PaymentMethod> hide = this.f117731c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "paymentMethodSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public C29735w1 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        return i == C31932Bj4.item_payment_method ? new C30217a(this, m41761u) : new C29735w1(m41761u);
    }
}
