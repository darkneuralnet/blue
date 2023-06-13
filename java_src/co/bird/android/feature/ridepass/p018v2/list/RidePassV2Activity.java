package co.bird.android.feature.ridepass.p018v2.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.ridepass.p018v2.list.RidePassV2Activity;
import co.bird.android.model.persistence.RidePassView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.H31;
import p000.InterfaceC40099e13;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\bZ\u0010[J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010(0(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\"\u0010.\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00050\u00050'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\"\u00100\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u000f0\u000f0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+R\"\u00102\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u00010\u00050\u00050'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+R\"\u00105\u001a\u0010\u0012\f\u0012\n )*\u0004\u0018\u000103030'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010+R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R!\u0010?\u001a\b\u0012\u0004\u0012\u0002030:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R!\u0010B\u001a\b\u0012\u0004\u0012\u0002030:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R!\u0010E\u001a\b\u0012\u0004\u0012\u0002030:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bD\u0010>R \u0010I\u001a\b\u0012\u0004\u0012\u0002030:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010>R!\u0010M\u001a\b\u0012\u0004\u0012\u00020J0:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bK\u0010<\u001a\u0004\bL\u0010>R \u0010P\u001a\b\u0012\u0004\u0012\u00020(0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010>R \u0010S\u001a\b\u0012\u0004\u0012\u00020\u00050:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010G\u001a\u0004\bR\u0010>R \u0010V\u001a\b\u0012\u0004\u0012\u00020\u000f0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010G\u001a\u0004\bU\u0010>R \u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010G\u001a\u0004\bX\u0010>¨\u0006\\"}, m28432d2 = {"Lco/bird/android/feature/ridepass/v2/list/RidePassV2Activity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LxW4;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LyW4;", TransferTable.COLUMN_STATE, "S", "LtW4;", "j", "LtW4;", "R", "()LtW4;", "setPresenter", "(LtW4;)V", "presenter", "LPV4;", "k", "LPV4;", "Q", "()LPV4;", "setAdapter", "(LPV4;)V", "adapter", "Lio/reactivex/subjects/d;", "LJa4;", "kotlin.jvm.PlatformType", "l", "Lio/reactivex/subjects/d;", "purchaseResultSubject", "m", "purchaseConfirmSubject", "n", "googlePayResultSubject", "o", "informationClicksSubject", "Lco/bird/android/model/persistence/RidePassView;", "p", "transferPassConfirmSubject", "LL5;", "q", "LL5;", "binding", "Lio/reactivex/Observable;", "r", "Lkotlin/Lazy;", "r7", "()Lio/reactivex/Observable;", "buyPassClicks", "s", "h3", "transferPassClicks", "t", "W8", "cancelPassClicks", "u", "Lio/reactivex/Observable;", "o8", "transferPassConfirm", "", "v", "T7", "rideNowClicks", "w", "W1", "purchaseResult", "x", "s3", "purchaseConfirm", "y", "P0", "googlePayResult", "z", "u7", "informationClicks", "<init>", "()V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.ridepass.v2.list.RidePassV2Activity */
/* loaded from: classes3.dex */
public final class RidePassV2Activity extends BaseActivityLite implements InterfaceC51653xW4 {

    /* renamed from: j */
    public C49282tW4 f64820j;

    /* renamed from: k */
    public PV4 f64821k;

    /* renamed from: l */
    public final C24558d<C33723Ja4> f64822l;

    /* renamed from: m */
    public final C24558d<Unit> f64823m;

    /* renamed from: n */
    public final C24558d<Boolean> f64824n;

    /* renamed from: o */
    public final C24558d<Unit> f64825o;

    /* renamed from: p */
    public final C24558d<RidePassView> f64826p;

    /* renamed from: q */
    public C4732L5 f64827q;

    /* renamed from: r */
    public final Lazy f64828r;

    /* renamed from: s */
    public final Lazy f64829s;

    /* renamed from: t */
    public final Lazy f64830t;

    /* renamed from: u */
    public final Observable<RidePassView> f64831u;

    /* renamed from: v */
    public final Lazy f64832v;

    /* renamed from: w */
    public final Observable<C33723Ja4> f64833w;

    /* renamed from: x */
    public final Observable<Unit> f64834x;

    /* renamed from: y */
    public final Observable<Boolean> f64835y;

    /* renamed from: z */
    public final Observable<Unit> f64836z;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/RidePassView;", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ridepass.v2.list.RidePassV2Activity$a */
    /* loaded from: classes3.dex */
    public static final class C15315a extends Lambda implements Function0<Observable<RidePassView>> {
        public C15315a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<RidePassView> invoke() {
            return RidePassV2Activity.this.m57405Q().m90178v();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/RidePassView;", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ridepass.v2.list.RidePassV2Activity$b */
    /* loaded from: classes3.dex */
    public static final class C15316b extends Lambda implements Function0<Observable<RidePassView>> {
        public C15316b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<RidePassView> invoke() {
            return RidePassV2Activity.this.m57405Q().m90174z0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.ridepass.v2.list.RidePassV2Activity$c */
    /* loaded from: classes3.dex */
    public static final class C15317c extends Lambda implements Function0<Unit> {

        /* renamed from: h */
        public final /* synthetic */ AbstractC52246yW4 f64840h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15317c(AbstractC52246yW4 abstractC52246yW4) {
            super(0);
            this.f64840h = abstractC52246yW4;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            RidePassV2Activity.this.f64826p.onNext(((C38988cA5) this.f64840h).m61806b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.ridepass.v2.list.RidePassV2Activity$d */
    /* loaded from: classes3.dex */
    public static final class C15318d extends Lambda implements Function0<Unit> {
        public C15318d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            RidePassV2Activity.this.f64823m.onNext(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ridepass.v2.list.RidePassV2Activity$e */
    /* loaded from: classes3.dex */
    public static final class C15319e extends Lambda implements Function0<Observable<String>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.ridepass.v2.list.RidePassV2Activity$e$a */
        /* loaded from: classes3.dex */
        public static final class C15320a extends Lambda implements Function1<Unit, String> {

            /* renamed from: g */
            public final /* synthetic */ RidePassV2Activity f64843g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C15320a(RidePassV2Activity ridePassV2Activity) {
                super(1);
                this.f64843g = ridePassV2Activity;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f64843g.getString(C45871nl4.ride_pass_success_toast);
            }
        }

        public C15319e() {
            super(0);
        }

        /* renamed from: c */
        public static final String m57397c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            C4732L5 c4732l5 = RidePassV2Activity.this.f64827q;
            if (c4732l5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c4732l5 = null;
            }
            Button button = c4732l5.f20730d;
            Intrinsics.checkNotNullExpressionValue(button, "binding.rideNow");
            Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(button, 0L, 1, null);
            final C15320a c15320a = new C15320a(RidePassV2Activity.this);
            return clicksThrottle$default.map(new InterfaceC23492o() { // from class: NV4
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m57397c;
                    m57397c = RidePassV2Activity.C15319e.m57397c(Function1.this, obj);
                    return m57397c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/RidePassView;", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ridepass.v2.list.RidePassV2Activity$f */
    /* loaded from: classes3.dex */
    public static final class C15321f extends Lambda implements Function0<Observable<RidePassView>> {
        public C15321f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<RidePassView> invoke() {
            return RidePassV2Activity.this.m57405Q().m90176x();
        }
    }

    public RidePassV2Activity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        C24558d<C33723Ja4> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<PurchasePaymentResult>()");
        this.f64822l = m31902e;
        C24558d<Unit> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Unit>()");
        this.f64823m = m31902e2;
        C24558d<Boolean> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Boolean>()");
        this.f64824n = m31902e3;
        C24558d<Unit> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<Unit>()");
        this.f64825o = m31902e4;
        C24558d<RidePassView> m31902e5 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e5, "create<RidePassView>()");
        this.f64826p = m31902e5;
        lazy = LazyKt__LazyJVMKt.lazy(new C15315a());
        this.f64828r = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C15321f());
        this.f64829s = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C15316b());
        this.f64830t = lazy3;
        Observable<RidePassView> hide = m31902e5.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "transferPassConfirmSubject.hide()");
        this.f64831u = hide;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C15319e());
        this.f64832v = lazy4;
        Observable<C33723Ja4> hide2 = m31902e.hide();
        Intrinsics.checkNotNullExpressionValue(hide2, "purchaseResultSubject.hide()");
        this.f64833w = hide2;
        Observable<Unit> hide3 = m31902e2.hide();
        Intrinsics.checkNotNullExpressionValue(hide3, "purchaseConfirmSubject.hide()");
        this.f64834x = hide3;
        Observable<Boolean> hide4 = m31902e3.hide();
        Intrinsics.checkNotNullExpressionValue(hide4, "googlePayResultSubject.hide()");
        this.f64835y = hide4;
        Observable<Unit> hide5 = m31902e4.hide();
        Intrinsics.checkNotNullExpressionValue(hide5, "informationClicksSubject.hide()");
        this.f64836z = hide5;
    }

    /* renamed from: U */
    public static final void m57402U(RidePassV2Activity this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C4732L5 c4732l5 = this$0.f64827q;
        if (c4732l5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c4732l5 = null;
        }
        c4732l5.f20729c.smoothScrollToPosition(i);
    }

    @Override // p000.InterfaceC51653xW4
    /* renamed from: P0 */
    public Observable<Boolean> mo5087P0() {
        return this.f64835y;
    }

    /* renamed from: Q */
    public final PV4 m57405Q() {
        PV4 pv4 = this.f64821k;
        if (pv4 != null) {
            return pv4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    /* renamed from: R */
    public final C49282tW4 m57404R() {
        C49282tW4 c49282tW4 = this.f64820j;
        if (c49282tW4 != null) {
            return c49282tW4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: S */
    public void render(AbstractC52246yW4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C38988cA5) {
            H31.C3014a.showDialog$default(m58990F(), GV4.f12003d, false, false, new C15317c(state), null, null, null, 116, null);
        } else if (state instanceof C38395bA5) {
            H31.C3014a.showDialog$default(m58990F(), CV4.f4134d, false, false, new C15318d(), null, null, null, 116, null);
        } else {
            C4732L5 c4732l5 = null;
            if (state instanceof C46121oA5) {
                C4732L5 c4732l52 = this.f64827q;
                if (c4732l52 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c4732l52 = null;
                }
                Button button = c4732l52.f20730d;
                Intrinsics.checkNotNullExpressionValue(button, "binding.rideNow");
                C49520tu6.show$default(button, ((C46121oA5) state).m21677b(), 0, 2, null);
            } else if (state instanceof C34381Lv5) {
                C34381Lv5 c34381Lv5 = (C34381Lv5) state;
                m57405Q().mo24871u(c34381Lv5.m96146c());
                Integer m90175y = m57405Q().m90175y(c34381Lv5.m96147b());
                if (m90175y != null) {
                    final int intValue = m90175y.intValue();
                    C4732L5 c4732l53 = this.f64827q;
                    if (c4732l53 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        c4732l5 = c4732l53;
                    }
                    c4732l5.f20729c.post(new Runnable() { // from class: MV4
                        @Override // java.lang.Runnable
                        public final void run() {
                            RidePassV2Activity.m57402U(RidePassV2Activity.this, intValue);
                        }
                    });
                }
            } else if (state instanceof KE1) {
                m57405Q().mo24871u(((KE1) state).m99061a());
            } else if (state instanceof C33892Jt2) {
                if (((C33892Jt2) state).m99602a()) {
                    m58990F().startProgress();
                } else {
                    S74.C7343a.stopProgress$default(m58990F(), 0, 1, null);
                }
            } else if (state instanceof C37436Yx0) {
                m58990F().success(((C37436Yx0) state).m73950a());
            } else if (state instanceof C42669iM3) {
                C48955sx4 m58990F = m58990F();
                String m34133a = ((C42669iM3) state).m34133a();
                if (m34133a == null) {
                    m34133a = getString(C45871nl4.error_generic_body);
                    Intrinsics.checkNotNullExpressionValue(m34133a, "this.getString(L.string.error_generic_body)");
                }
                m58990F.error(m34133a);
            } else if (state instanceof C40172e86) {
                C40172e86 c40172e86 = (C40172e86) state;
                C37513Zf5.displayStyledError$default(m58990F(), c40172e86.m43187b(), mo58957w(), null, c40172e86.m43188a().getZendeskArticleId(), true, 4, null);
            } else if (!(state instanceof C43740k96) && (state instanceof C48842sm1)) {
                InterfaceC40099e13.C19924a.closeDownWithResult$default(mo58957w(), -1, null, 2, null);
            }
        }
    }

    @Override // p000.InterfaceC51653xW4
    /* renamed from: T7 */
    public Observable<String> mo5086T7() {
        Object value = this.f64832v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-rideNowClicks>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC51653xW4
    /* renamed from: W1 */
    public Observable<C33723Ja4> mo5085W1() {
        return this.f64833w;
    }

    @Override // p000.InterfaceC51653xW4
    /* renamed from: W8 */
    public Observable<RidePassView> mo5084W8() {
        return (Observable) this.f64830t.getValue();
    }

    @Override // p000.InterfaceC51653xW4
    /* renamed from: h3 */
    public Observable<RidePassView> mo5083h3() {
        return (Observable) this.f64829s.getValue();
    }

    @Override // p000.InterfaceC51653xW4
    /* renamed from: o8 */
    public Observable<RidePassView> mo5082o8() {
        return this.f64831u;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (i != 10030) {
            if (i == 10046 && i2 != 0) {
                this.f64822l.onNext(new C33723Ja4(z, intent));
                return;
            }
            return;
        }
        this.f64824n.onNext(Boolean.valueOf(z));
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C15322a.m57394a().mo57390a(m58989H(), this, getIntent().getStringExtra("ride_pass_link_code"), C45871nl4.ride_pass_left_navigation_title).mo57391a(this);
        C4732L5 m97797c = C4732L5.m97797c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m97797c, "inflate(layoutInflater)");
        this.f64827q = m97797c;
        C4732L5 c4732l5 = null;
        if (m97797c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m97797c = null;
        }
        setContentView(m97797c.getRoot());
        C4732L5 c4732l52 = this.f64827q;
        if (c4732l52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c4732l5 = c4732l52;
        }
        RecyclerView recyclerView = c4732l5.f20729c;
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(m57405Q());
        m57404R().consume(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C35451Qk4.menu_ride_pass_v2, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C36126Th4.help) {
            this.f64825o.onNext(Unit.INSTANCE);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // p000.InterfaceC51653xW4
    /* renamed from: r7 */
    public Observable<RidePassView> mo5081r7() {
        return (Observable) this.f64828r.getValue();
    }

    @Override // p000.InterfaceC51653xW4
    /* renamed from: s3 */
    public Observable<Unit> mo5080s3() {
        return this.f64834x;
    }

    @Override // p000.InterfaceC51653xW4
    /* renamed from: u7 */
    public Observable<Unit> mo5079u7() {
        return this.f64836z;
    }
}
