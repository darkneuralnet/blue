package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.ReservationBannerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001e\u0010\"B#\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010$J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0016J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, m28432d2 = {"Lco/bird/android/widget/ReservationBannerView;", "Landroidx/cardview/widget/CardView;", "LuS;", "Lco/bird/android/widget/ReservationBannerView$a;", TransferTable.COLUMN_STATE, "", "setReservationState", "", "priceString", "", "maxLines", "setPriceString", "Lio/reactivex/Observable;", "G1", "s", "", "show", "v", "Lnt6;", "k", "Lnt6;", "binding", "<set-?>", "l", "Lco/bird/android/widget/ReservationBannerView$a;", "u", "()Lco/bird/android/widget/ReservationBannerView$a;", "currentState", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ReservationBannerView extends CardView implements InterfaceC29196uS {

    /* renamed from: k */
    public final C45953nt6 f67620k;

    /* renamed from: l */
    public EnumC16574a f67621l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/widget/ReservationBannerView$a;", "", "", "b", "I", DateTokenConverter.CONVERTER_KEY, "()I", "title", "c", "callToAction", "callToActionColor", "<init>", "(Ljava/lang/String;IIII)V", "e", "f", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.ReservationBannerView$a */
    /* loaded from: classes4.dex */
    public enum EnumC16574a {
        BEFORE(C45871nl4.reservation_reserve_bird, C45871nl4.reservation_reserve, C32364Df4.calloutText),
        IN_PROGRESS(C45871nl4.reservation_in_progress, C45871nl4.reservation_cancel, C32364Df4.red);
        

        /* renamed from: b */
        public final int f67625b;

        /* renamed from: c */
        public final int f67626c;

        /* renamed from: d */
        public final int f67627d;

        EnumC16574a(int i, int i2, int i3) {
            this.f67625b = i;
            this.f67626c = i2;
            this.f67627d = i3;
        }

        /* renamed from: b */
        public final int m54401b() {
            return this.f67626c;
        }

        /* renamed from: c */
        public final int m54400c() {
            return this.f67627d;
        }

        /* renamed from: d */
        public final int m54399d() {
            return this.f67625b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.ReservationBannerView$b */
    /* loaded from: classes4.dex */
    public static final class C16575b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C16575b f67628g = new C16575b();

        public C16575b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41318g46.m40163a("clicked on cta", new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReservationBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        C45953nt6 m22234c = C45953nt6.m22234c(C40788fB0.m41772j(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(m22234c, "inflate(context.layoutInflater, this, true)");
        this.f67620k = m22234c;
        this.f67621l = EnumC16574a.BEFORE;
    }

    /* renamed from: t */
    public static final void m54405t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC29196uS
    /* renamed from: G1 */
    public Observable<Unit> mo10275G1() {
        TextView textView = this.f67620k.f100995e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.priceString");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    /* renamed from: s */
    public final Observable<Unit> m54406s() {
        ProgressButton progressButton = this.f67620k.f100993c;
        Intrinsics.checkNotNullExpressionValue(progressButton, "binding.callToAction");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(progressButton, 0L, 1, null);
        final C16575b c16575b = C16575b.f67628g;
        Observable<Unit> doOnNext = clicksThrottle$default.doOnNext(new InterfaceC23484g() { // from class: tK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ReservationBannerView.m54405t(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "binding.callToAction.cli…ber.d(\"clicked on cta\") }");
        return doOnNext;
    }

    @Override // p000.InterfaceC29196uS
    public void setPriceString(String str, int i) {
        boolean z;
        this.f67620k.f100995e.setText(str);
        this.f67620k.f100995e.setMaxLines(i);
        Group group = this.f67620k.f100996f;
        Intrinsics.checkNotNullExpressionValue(group, "binding.priceStringGroup");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(group, z, 0, 2, null);
    }

    public final void setReservationState(EnumC16574a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int m94301c = NA0.m94301c(getContext(), state.m54400c());
        this.f67620k.f100997g.setText(state.m54399d());
        this.f67620k.f100993c.setText(state.m54401b());
        this.f67620k.f100993c.setTextColor(m94301c);
        this.f67620k.f100993c.setProgressColor(m94301c);
        this.f67621l = state;
    }

    /* renamed from: u */
    public final EnumC16574a m54404u() {
        return this.f67621l;
    }

    /* renamed from: v */
    public final void m54403v(boolean z) {
        this.f67620k.f100993c.setInProgress(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReservationBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        C45953nt6 m22234c = C45953nt6.m22234c(C40788fB0.m41772j(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(m22234c, "inflate(context.layoutInflater, this, true)");
        this.f67620k = m22234c;
        this.f67621l = EnumC16574a.BEFORE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReservationBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C45953nt6 m22234c = C45953nt6.m22234c(C40788fB0.m41772j(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(m22234c, "inflate(context.layoutInflater, this, true)");
        this.f67620k = m22234c;
        this.f67621l = EnumC16574a.BEFORE;
    }
}
