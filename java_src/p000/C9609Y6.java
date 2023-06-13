package p000;

import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.PaymentMethod;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.H31;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0016\u0010\u001b\u001a\u00020\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\rH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010)\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\u00040\u00040%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006."}, m28432d2 = {"LY6;", "LX6;", "LxE;", "Lio/reactivex/Observable;", "", "Ye", "", "enable", "jd", "Lc04;", "Qe", "ah", "Al", "", "", "supportedBanks", "Lio/reactivex/p;", "v4", "balanceLabel", "pk", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "sb", "minBalanceLabel", "e3", "LH6;", "section", "Aj", "Ih", "LN2;", "b", "LN2;", "binding", "La04;", "c", "La04;", "adapter", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "dialogDismissSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LN2;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Y6 */
/* loaded from: classes3.dex */
public final class C9609Y6 extends AbstractC30071xE implements InterfaceC9297X6 {

    /* renamed from: b */
    public final C5462N2 f44515b;

    /* renamed from: c */
    public final C37701a04 f44516c;

    /* renamed from: d */
    public final C24558d<Unit> f44517d;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y6$a */
    /* loaded from: classes3.dex */
    public static final class C9610a extends Lambda implements Function0<Unit> {
        public C9610a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C9609Y6.this.dismissDialog();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Y6$b */
    /* loaded from: classes3.dex */
    public static final class C9611b extends Lambda implements Function0<Unit> {
        public C9611b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C9609Y6.this.f44517d.onNext(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9609Y6(BaseActivity activity, C5462N2 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f44515b = binding;
        C37701a04 c37701a04 = new C37701a04();
        this.f44516c = c37701a04;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f44517d = m31902e;
        binding.f23989i.setAdapter(c37701a04);
        binding.f23989i.addItemDecoration(new C38294b04());
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: Aj */
    public void mo75751Aj(List<C3023H6> section) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.f44516c.mo24871u(section);
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: Al */
    public Observable<Unit> mo75750Al() {
        Observable<Unit> hide = this.f44517d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "dialogDismissSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: Ih */
    public void mo75749Ih() {
        H31.C3014a.showCustomDialog$default((H31) this, C31932Bj4.dialog_balance_loaded, (Integer) null, (Integer) null, false, false, false, (Integer) null, (Integer) null, (CharSequence) null, (CharSequence) null, C34956Oh4.confirmButton, (Integer) null, (String) null, (String) null, (Function0) new C9610a(), (Function0) null, (Function0) new C9611b(), (Function0) null, false, 441326, (Object) null);
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: Qe */
    public C38887c04 mo75748Qe() {
        return this.f44516c.m72132v();
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: Ye */
    public Observable<Unit> mo75747Ye() {
        Button button = this.f44515b.f23990j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.primaryButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: ah */
    public void mo75746ah() {
        TextView textView = this.f44515b.f23986f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.minRideAmountLabel");
        C49520tu6.show$default(textView, false, 0, 2, null);
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: e3 */
    public void mo75745e3(String minBalanceLabel) {
        Intrinsics.checkNotNullParameter(minBalanceLabel, "minBalanceLabel");
        TextView setMinBalanceToRide$lambda$2 = this.f44515b.f23986f;
        Intrinsics.checkNotNullExpressionValue(setMinBalanceToRide$lambda$2, "setMinBalanceToRide$lambda$2");
        C49520tu6.m11233r(setMinBalanceToRide$lambda$2);
        setMinBalanceToRide$lambda$2.setText(setMinBalanceToRide$lambda$2.getContext().getString(C45871nl4.minimum_balance_description, minBalanceLabel));
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: jd */
    public void mo75744jd(boolean z) {
        this.f44515b.f23990j.setEnabled(z);
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: pk */
    public void mo75743pk(String balanceLabel) {
        Intrinsics.checkNotNullParameter(balanceLabel, "balanceLabel");
        this.f44515b.f23982b.setText(balanceLabel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (r1 == null) goto L8;
     */
    @Override // p000.InterfaceC9297X6
    /* renamed from: sb */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo75742sb(PaymentMethod paymentMethod) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        TextView textView = this.f44515b.f23987g;
        Integer m19355a = C46838pO3.m19355a(paymentMethod);
        if (m19355a != null) {
            drawable = textView.getContext().getDrawable(m19355a.intValue());
        }
        drawable = null;
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setText(C46838pO3.m19354b(paymentMethod, getActivity()));
    }

    @Override // p000.InterfaceC9297X6
    /* renamed from: v4 */
    public AbstractC24507p<String> mo75741v4(List<String> supportedBanks) {
        Intrinsics.checkNotNullParameter(supportedBanks, "supportedBanks");
        return H31.C3014a.selectorDialog$default(this, supportedBanks, false, getString(C45871nl4.payment_select_bank, new Object[0]), 2, null);
    }
}
