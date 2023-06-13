package p000;

import android.content.Intent;
import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.User;
import co.bird.android.model.persistence.RidePassView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.InterfaceC42586iD1;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 I2\u00020\u0001:\u0001\u0005Bi\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0017\u0010<\u001a\u0002078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006J"}, m28432d2 = {"LwV4;", "LfV4;", "Lio/reactivex/c;", "r", "", C17296a.f69688o, "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LWU4;", "LWU4;", "ridePassManager", "LAM3;", "b", "LAM3;", "paymentManagerV2", "LiD1;", "c", "LiD1;", "googlePayManager", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "LRh6;", "e", "LRh6;", "userStream", "Landroid/os/Handler;", "f", "Landroid/os/Handler;", "handler", "", "g", "Ljava/lang/String;", "ridePassLinkCode", "LJV4;", "h", "LJV4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "j", "Le13;", "navigator", "Lco/bird/android/core/mvp/BaseActivity;", "k", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "", "l", "Z", "getShowPayPal", "()Z", "showPayPal", "Lco/bird/android/model/persistence/RidePassView;", "m", "Lco/bird/android/model/persistence/RidePassView;", "v", "()Lco/bird/android/model/persistence/RidePassView;", "J", "(Lco/bird/android/model/persistence/RidePassView;)V", "ridePass", "LTq4;", "reactiveConfig", "<init>", "(LWU4;LAM3;LiD1;LEa;LRh6;Landroid/os/Handler;Ljava/lang/String;LJV4;Lcom/uber/autodispose/ScopeProvider;Le13;Lco/bird/android/core/mvp/BaseActivity;LTq4;)V", "n", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassPresenter.kt\nco/bird/android/feature/ridepass/v1/RidePassPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,183:1\n199#2:184\n237#2:185\n237#2:186\n180#2:187\n237#2:188\n237#2:189\n*S KotlinDebug\n*F\n+ 1 RidePassPresenter.kt\nco/bird/android/feature/ridepass/v1/RidePassPresenterImpl\n*L\n64#1:184\n99#1:185\n118#1:186\n122#1:187\n140#1:188\n155#1:189\n*E\n"})
/* renamed from: wV4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51051wV4 implements InterfaceC40972fV4 {

    /* renamed from: n */
    public static final C29893a f116054n = new C29893a(null);

    /* renamed from: a */
    public final WU4 f116055a;

    /* renamed from: b */
    public final AM3 f116056b;

    /* renamed from: c */
    public final InterfaceC42586iD1 f116057c;

    /* renamed from: d */
    public final InterfaceC1880Ea f116058d;

    /* renamed from: e */
    public final InterfaceC35660Rh6 f116059e;

    /* renamed from: f */
    public final Handler f116060f;

    /* renamed from: g */
    public final String f116061g;

    /* renamed from: h */
    public final JV4 f116062h;

    /* renamed from: i */
    public final ScopeProvider f116063i;

    /* renamed from: j */
    public final InterfaceC40099e13 f116064j;

    /* renamed from: k */
    public final BaseActivity f116065k;

    /* renamed from: l */
    public final boolean f116066l;

    /* renamed from: m */
    public RidePassView f116067m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LwV4$a;", "", "", "SUCCESS_EXIT_DELAY_MILLIS", "J", "<init>", "()V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: wV4$a */
    /* loaded from: classes3.dex */
    public static final class C29893a {
        public /* synthetic */ C29893a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29893a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wV4$b */
    /* loaded from: classes3.dex */
    public static final class C29894b extends Lambda implements Function1<Throwable, Unit> {
        public C29894b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            String message = th.getMessage();
            C41318g46.m40160d("message: " + message, new Object[0]);
            InterfaceC1880Ea interfaceC1880Ea = C51051wV4.this.f116058d;
            String linkCode = C51051wV4.this.m6736v().getLinkCode();
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "something went wrong";
            }
            interfaceC1880Ea.mo55905y(new DV4(null, null, null, linkCode, -1, message2, 7, null));
            C51051wV4.this.f116062h.error(C45871nl4.merchant_input_payment_invalid_payment_error);
            C51051wV4.this.f116062h.mo98812ti(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wV4$c */
    /* loaded from: classes3.dex */
    public static final class C29895c extends Lambda implements Function1<Throwable, Unit> {
        public C29895c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C51051wV4.this.f116062h.mo98812ti(true);
            C51051wV4.this.f116062h.error(C45871nl4.merchant_input_payment_invalid_payment_error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wV4$d */
    /* loaded from: classes3.dex */
    public static final class C29896d extends Lambda implements Function1<Unit, Unit> {
        public C29896d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C51051wV4.this.f116064j.mo36922w3(Long.parseLong(C51051wV4.this.m6736v().getZendeskArticleId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/RidePassView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wV4$e */
    /* loaded from: classes3.dex */
    public static final class C29897e extends Lambda implements Function1<RidePassView, Unit> {
        public C29897e() {
            super(1);
        }

        /* renamed from: a */
        public final void m6731a(RidePassView it) {
            C51051wV4 c51051wV4 = C51051wV4.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c51051wV4.m6758J(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RidePassView ridePassView) {
            m6731a(ridePassView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wV4$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29898f extends FunctionReferenceImpl implements Function1<RidePassView, Unit> {
        public C29898f(Object obj) {
            super(1, obj, JV4.class, "init", "init(Lco/bird/android/model/persistence/RidePassView;)V", 0);
        }

        /* renamed from: a */
        public final void m6730a(RidePassView p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((JV4) this.receiver).mo98810vc(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RidePassView ridePassView) {
            m6730a(ridePassView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wV4$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29899g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C29899g f116072b = new C29899g();

        public C29899g() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wV4$h */
    /* loaded from: classes3.dex */
    public static final class C29900h extends Lambda implements Function1<Unit, Unit> {
        public C29900h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C51051wV4.this.f116058d.mo55905y(new AV4(null, null, null, C51051wV4.this.f116061g, 7, null));
            C51051wV4.this.f116062h.mo98812ti(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wV4$j */
    /* loaded from: classes3.dex */
    public static final class C29902j extends Lambda implements Function1<Throwable, Unit> {
        public C29902j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C51051wV4.this.f116062h.mo98812ti(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wV4$k */
    /* loaded from: classes3.dex */
    public static final class C29903k extends Lambda implements Function1<Unit, Unit> {
        public C29903k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C51051wV4.this.f116062h.mo98812ti(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wV4$l */
    /* loaded from: classes3.dex */
    public static final class C29904l extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C29904l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BirdPayment m59035e = C51051wV4.this.f116056b.mo85677e().m73665a().m59035e();
            boolean z = false;
            if (m59035e != null && m59035e.isPaypal()) {
                z = true;
            }
            if (z) {
                return C51051wV4.this.m6740r();
            }
            C51051wV4.this.f116064j.mo37204A(10038, true);
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wV4$m */
    /* loaded from: classes3.dex */
    public static final class C29905m extends Lambda implements Function1<Throwable, Unit> {
        public C29905m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C51051wV4.this.f116062h.mo98812ti(true);
        }
    }

    public C51051wV4(WU4 ridePassManager, AM3 paymentManagerV2, InterfaceC42586iD1 googlePayManager, InterfaceC1880Ea analyticsManager, InterfaceC35660Rh6 userStream, Handler handler, String ridePassLinkCode, JV4 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, BaseActivity activity, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(ridePassLinkCode, "ridePassLinkCode");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f116055a = ridePassManager;
        this.f116056b = paymentManagerV2;
        this.f116057c = googlePayManager;
        this.f116058d = analyticsManager;
        this.f116059e = userStream;
        this.f116060f = handler;
        this.f116061g = ridePassLinkCode;
        this.f116062h = ui;
        this.f116063i = scopeProvider;
        this.f116064j = navigator;
        this.f116065k = activity;
        this.f116066l = reactiveConfig.m82623f8().getValue().getPaymentConfig().getEnablePaypal();
    }

    /* renamed from: A */
    public static final void m6767A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m6766B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m6765C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23496h m6764D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m6763E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m6762F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23496h m6761G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m6760H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m6759I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m6739s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m6738t(final C51051wV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f116058d.mo55905y(new EV4(null, null, null, this$0.m6736v().getLinkCode(), 7, null));
        this$0.f116062h.success(this$0.m6736v().getConfirmationToast());
        this$0.f116060f.postDelayed(new Runnable() { // from class: mV4
            @Override // java.lang.Runnable
            public final void run() {
                C51051wV4.m6737u(C51051wV4.this);
            }
        }, 3000L);
    }

    /* renamed from: u */
    public static final void m6737u(C51051wV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f116064j.mo37030e3();
    }

    /* renamed from: w */
    public static final InterfaceC23496h m6735w(C51051wV4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.m6740r();
    }

    /* renamed from: x */
    public static final void m6734x() {
    }

    /* renamed from: y */
    public static final void m6733y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m6732z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public final void m6758J(RidePassView ridePassView) {
        Intrinsics.checkNotNullParameter(ridePassView, "<set-?>");
        this.f116067m = ridePassView;
    }

    @Override // p000.InterfaceC40972fV4
    /* renamed from: a */
    public void mo6757a() {
        this.f116058d.mo55905y(new BV4(null, null, null, this.f116061g, null, null, null, 119, null));
        AbstractC23442F<RidePassView> mo55501G0 = this.f116055a.mo55501G0(this.f116061g);
        final C29897e c29897e = new C29897e();
        AbstractC23442F<RidePassView> m33152N = mo55501G0.m33101w(new InterfaceC23484g() { // from class: pV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51051wV4.m6732z(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "override fun onCreate() …eId.toLong())\n      }\n  }");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f116063i));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29898f c29898f = new C29898f(this.f116062h);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: qV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51051wV4.m6767A(Function1.this, obj);
            }
        };
        final C29899g c29899g = C29899g.f116072b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: rV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51051wV4.m6766B(Function1.this, obj);
            }
        });
        this.f116062h.mo98813e2(this.f116066l);
        Observable<Unit> mo98814Tb = this.f116062h.mo98814Tb();
        final C29900h c29900h = new C29900h();
        Observable<Unit> doOnNext = mo98814Tb.doOnNext(new InterfaceC23484g() { // from class: sV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51051wV4.m6765C(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onCreate() …eId.toLong())\n      }\n  }");
        Z84<Optional<BirdPayment>> mo85677e = this.f116056b.mo85677e();
        Observable<Boolean> m33123k0 = this.f116057c.mo16237g().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "googlePayManager.googlePayReady().toObservable()");
        Observable m31949b = C24527f.m31949b(doOnNext, mo85677e, m33123k0);
        final C29901i c29901i = new C29901i();
        AbstractC23461c flatMapCompletable = m31949b.flatMapCompletable(new InterfaceC23492o() { // from class: tV4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m6764D;
                m6764D = C51051wV4.m6764D(Function1.this, obj);
                return m6764D;
            }
        });
        final C29902j c29902j = new C29902j();
        AbstractC23461c m33066T = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: uV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51051wV4.m6763E(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun onCreate() …eId.toLong())\n      }\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f116063i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Unit> mo98811ug = this.f116062h.mo98811ug();
        final C29903k c29903k = new C29903k();
        Observable<Unit> doOnNext2 = mo98811ug.doOnNext(new InterfaceC23484g() { // from class: vV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51051wV4.m6762F(Function1.this, obj);
            }
        });
        final C29904l c29904l = new C29904l();
        AbstractC23461c flatMapCompletable2 = doOnNext2.flatMapCompletable(new InterfaceC23492o() { // from class: hV4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m6761G;
                m6761G = C51051wV4.m6761G(Function1.this, obj);
                return m6761G;
            }
        });
        final C29905m c29905m = new C29905m();
        AbstractC23461c m33066T2 = flatMapCompletable2.m33084B(new InterfaceC23484g() { // from class: iV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51051wV4.m6760H(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T2, "override fun onCreate() …eId.toLong())\n      }\n  }");
        Object m33041n2 = m33066T2.m33041n(AutoDispose.m45239a(this.f116063i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Object m33094as = this.f116062h.mo98815J8().m33094as(AutoDispose.m45239a(this.f116063i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29896d c29896d = new C29896d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: jV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51051wV4.m6759I(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC40972fV4
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 10030) {
            if (i == 10031 || i == 10038) {
                if (i2 == -1) {
                    Object m33041n = C28237sD.progress$default(m6740r(), this.f116062h, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f116063i));
                    Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                    ((CompletableSubscribeProxy) m33041n).subscribe();
                    return;
                }
                this.f116062h.mo98812ti(true);
            }
        } else if (i2 == -1) {
            AbstractC23461c m33049i = InterfaceC42586iD1.C23161a.handleGooglePayForPaymentMethod$default(this.f116057c, i2, intent, !this.f116056b.mo85677e().getValue().m59037c(), null, 8, null).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: gV4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m6735w;
                    m6735w = C51051wV4.m6735w(C51051wV4.this);
                    return m6735w;
                }
            }));
            Intrinsics.checkNotNullExpressionValue(m33049i, "googlePayManager\n       ….defer { buyRidePass() })");
            Object m33041n2 = C28237sD.progress$default(m33049i, this.f116062h, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f116063i));
            Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: nV4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C51051wV4.m6734x();
                }
            };
            final C29895c c29895c = new C29895c();
            ((CompletableSubscribeProxy) m33041n2).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: oV4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C51051wV4.m6733y(Function1.this, obj);
                }
            });
        } else {
            InterfaceC40099e13.C19924a.goToPayment$default(this.f116064j, 10031, false, 2, null);
            this.f116062h.mo98812ti(true);
        }
    }

    /* renamed from: r */
    public final AbstractC23461c m6740r() {
        AbstractC23461c m33070P = C28237sD.progress$default(this.f116055a.mo55485y0(m6736v().getLinkCode()), this.f116062h, 0, 2, (Object) null).m33070P(C23454a.m33087a());
        final C29894b c29894b = new C29894b();
        AbstractC23461c m33029z = m33070P.m33084B(new InterfaceC23484g() { // from class: kV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51051wV4.m6739s(Function1.this, obj);
            }
        }).m33029z(new InterfaceC23478a() { // from class: lV4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C51051wV4.m6738t(C51051wV4.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "private fun buyRidePass(…DELAY_MILLIS)\n      }\n  }");
        return m33029z;
    }

    /* renamed from: v */
    public final RidePassView m6736v() {
        RidePassView ridePassView = this.f116067m;
        if (ridePassView != null) {
            return ridePassView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ridePass");
        return null;
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\n \u0002*\u0004\u0018\u00010\u00070\u00072<\u0010\u0006\u001a8\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Triple;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wV4$i */
    /* loaded from: classes3.dex */
    public static final class C29901i extends Lambda implements Function1<Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean>, InterfaceC23496h> {
        public C29901i() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Triple<Unit, Optional<BirdPayment>, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Boolean googlePayReady = triple.component3();
            BirdPayment m59035e = triple.component2().m59035e();
            if ((m59035e == null || m59035e.isGooglePay()) ? false : true) {
                return C51051wV4.this.m6740r();
            }
            Intrinsics.checkNotNullExpressionValue(googlePayReady, "googlePayReady");
            if (googlePayReady.booleanValue()) {
                InterfaceC42586iD1 interfaceC42586iD1 = C51051wV4.this.f116057c;
                User mo76584a = C51051wV4.this.f116059e.mo76584a();
                Intrinsics.checkNotNull(mo76584a);
                interfaceC42586iD1.mo16236h(mo76584a, C51051wV4.this.f116065k, 10030, C45097mS5.m25591o(C51051wV4.this.m6736v().getCurrency()), Long.valueOf(C51051wV4.this.m6736v().getPrice()));
                return AbstractC23461c.m33039p();
            }
            InterfaceC40099e13.C19924a.goToPayment$default(C51051wV4.this.f116064j, 10031, false, 2, null);
            return AbstractC23461c.m33039p();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean> triple) {
            return invoke2((Triple<Unit, Optional<BirdPayment>, Boolean>) triple);
        }
    }
}
