package p000;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BarcodeScanType;
import co.bird.android.model.analytics.EmailVerified;
import co.bird.android.model.analytics.OnboardingLocationEnabled;
import co.bird.android.model.analytics.VerificationEmailResent;
import co.bird.android.model.constant.Permission;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsKt;
import p000.C37213Xy2;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001\u0012Bg\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u000e\b\u0001\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\b\b\u0001\u00101\u001a\u00020.\u0012\b\b\u0001\u00105\u001a\u000202\u0012\b\b\u0001\u00109\u001a\u000206¢\u0006\u0004\bA\u0010BJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u0010@\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006D"}, m28432d2 = {"LNy2;", "Lpy2;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "clearCode", "Lio/reactivex/F;", "", "D", "Landroid/content/Intent;", "intent", "H", "token", "Lio/reactivex/c;", "M", "blockIfNotGranted", "z", "b", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lgl;", "Lgl;", "preference", "LEa;", "c", "LEa;", "analyticsManager", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LEp0;", "e", "LEp0;", "optInManager", "Llh6;", "f", "Llh6;", "userManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "g", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LSy2;", "h", "LSy2;", "ui", "Le13;", "i", "Le13;", "navigator", "LDQ3;", "j", "LDQ3;", "permissionManager", "k", "Ljava/lang/String;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "email", "<init>", "(Landroid/content/Context;Lgl;LEa;LTq4;LEp0;Llh6;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LSy2;Le13;LDQ3;)V", "l", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLoginPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginPresenter.kt\nco/bird/android/app/feature/magiclink/LoginPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n180#2:253\n161#2:254\n180#2:255\n180#2:256\n180#2:257\n199#2:258\n199#2:260\n199#2:261\n1#3:259\n*S KotlinDebug\n*F\n+ 1 LoginPresenter.kt\nco/bird/android/app/feature/magiclink/LoginPresenterImpl\n*L\n87#1:253\n103#1:254\n115#1:255\n125#1:256\n136#1:257\n145#1:258\n193#1:260\n214#1:261\n*E\n"})
/* renamed from: Ny2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34873Ny2 implements InterfaceC47185py2 {

    /* renamed from: l */
    public static final C5753a f25418l = new C5753a(null);

    /* renamed from: m */
    public static final int f25419m = 8;

    /* renamed from: n */
    public static final Regex f25420n = new Regex(".*@bird-ext.co|.*@birdcanada-ext.co|.*\\+qr.*", RegexOption.IGNORE_CASE);

    /* renamed from: a */
    public final Context f25421a;

    /* renamed from: b */
    public final C22454gl f25422b;

    /* renamed from: c */
    public final InterfaceC1880Ea f25423c;

    /* renamed from: d */
    public final C36207Tq4 f25424d;

    /* renamed from: e */
    public final InterfaceC32684Ep0 f25425e;

    /* renamed from: f */
    public final InterfaceC44647lh6 f25426f;

    /* renamed from: g */
    public final LifecycleScopeProvider<EnumC7097RE> f25427g;

    /* renamed from: h */
    public final InterfaceC36043Sy2 f25428h;

    /* renamed from: i */
    public final InterfaceC40099e13 f25429i;

    /* renamed from: j */
    public final DQ3 f25430j;

    /* renamed from: k */
    public String f25431k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LNy2$a;", "", "Lkotlin/text/Regex;", "BIRD_EMAIL_REGEX", "Lkotlin/text/Regex;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ny2$a */
    /* loaded from: classes2.dex */
    public static final class C5753a {
        public /* synthetic */ C5753a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5753a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ny2$b */
    /* loaded from: classes2.dex */
    public static final class C5754b extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f25432g;

        /* renamed from: h */
        public final /* synthetic */ C34873Ny2 f25433h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5754b(boolean z, C34873Ny2 c34873Ny2) {
            super(1);
            this.f25432g = z;
            this.f25433h = c34873Ny2;
        }

        /* renamed from: a */
        public final void m93103a(FQ3 fq3) {
            if (!fq3.m107154a() && this.f25432g) {
                C41318g46.m40151m("User deny location", new Object[0]);
                return;
            }
            this.f25433h.f25423c.mo55956N(new OnboardingLocationEnabled());
            this.f25433h.f25429i.mo36956r(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m93103a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$c */
    /* loaded from: classes2.dex */
    public static final class C5755c extends Lambda implements Function1<Throwable, Unit> {
        public C5755c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            InterfaceC36043Sy2 interfaceC36043Sy2 = C34873Ny2.this.f25428h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC36043Sy2.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ny2$d */
    /* loaded from: classes2.dex */
    public static final class C5756d extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f25435g;

        /* renamed from: h */
        public final /* synthetic */ C34873Ny2 f25436h;

        /* renamed from: i */
        public final /* synthetic */ String f25437i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5756d(boolean z, C34873Ny2 c34873Ny2, String str) {
            super(1);
            this.f25435g = z;
            this.f25436h = c34873Ny2;
            this.f25437i = str;
        }

        /* renamed from: a */
        public final void m93102a(InterfaceC23465c interfaceC23465c) {
            QF2 qf2;
            if (this.f25435g) {
                qf2 = QF2.CLIPBOARD;
            } else {
                qf2 = QF2.KEYBOARD;
            }
            this.f25436h.f25423c.mo55905y(new C37844aF2(null, null, null, this.f25437i, qf2.name(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m93102a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$e */
    /* loaded from: classes2.dex */
    public static final class C5757e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f25439h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5757e(boolean z) {
            super(1);
            this.f25439h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C49375tg1 m86159a;
            C41318g46.m40159e(it);
            C34873Ny2.this.f25423c.mo55956N(new EmailVerified(false));
            if (this.f25439h) {
                C34873Ny2.this.f25428h.mo75975R2();
            }
            InterfaceC36043Sy2 interfaceC36043Sy2 = C34873Ny2.this.f25428h;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            m86159a = C35809Ry2.m86159a(it);
            interfaceC36043Sy2.mo75967lf(m86159a.m11932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$f */
    /* loaded from: classes2.dex */
    public static final class C5758f extends Lambda implements Function1<Boolean, Unit> {
        public C5758f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C34873Ny2.this.f25423c.mo55956N(new EmailVerified(true));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$g */
    /* loaded from: classes2.dex */
    public static final class C5759g extends Lambda implements Function1<Throwable, Unit> {
        public C5759g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C34873Ny2.this.f25423c.mo55956N(new EmailVerified(false));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "locationOptOut", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$h */
    /* loaded from: classes2.dex */
    public static final class C5760h extends Lambda implements Function1<Boolean, Unit> {
        public C5760h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C34873Ny2.this.m93104z(!bool.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$i */
    /* loaded from: classes2.dex */
    public static final class C5761i extends Lambda implements Function1<Throwable, Unit> {
        public C5761i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            InterfaceC36043Sy2 interfaceC36043Sy2 = C34873Ny2.this.f25428h;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            interfaceC36043Sy2.error(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$j */
    /* loaded from: classes2.dex */
    public static final class C5762j extends Lambda implements Function1<Unit, Unit> {
        public C5762j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C34873Ny2.this.f25429i.mo36956r(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$k */
    /* loaded from: classes2.dex */
    public static final class C5763k extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C5763k f25445g = new C5763k();

        public C5763k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$l */
    /* loaded from: classes2.dex */
    public static final class C5764l extends Lambda implements Function1<Throwable, Unit> {
        public C5764l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            InterfaceC36043Sy2 interfaceC36043Sy2 = C34873Ny2.this.f25428h;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            interfaceC36043Sy2.error(e);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ny2$m */
    /* loaded from: classes2.dex */
    public static final class C5765m extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C5765m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C34873Ny2.this.f25430j.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ny2$n */
    /* loaded from: classes2.dex */
    public static final class C5766n extends Lambda implements Function1<FQ3, Unit> {
        public C5766n() {
            super(1);
        }

        /* renamed from: a */
        public final void m93101a(FQ3 fq3) {
            if (fq3.m107153b() == Permission.CAMERA && fq3.m107154a()) {
                C34873Ny2.this.f25429i.mo37064Y3(BarcodeScanType.RAW, Integer.valueOf(C45871nl4.login_scan_code));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m93101a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$o */
    /* loaded from: classes2.dex */
    public static final class C5767o extends Lambda implements Function1<Unit, Unit> {
        public C5767o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C34873Ny2.this.f25428h.mo75966nf();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$p */
    /* loaded from: classes2.dex */
    public static final class C5768p extends Lambda implements Function1<Unit, Unit> {
        public C5768p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C34873Ny2.this.f25429i.mo36928v3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LXy2$a;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ny2$q */
    /* loaded from: classes2.dex */
    public static final class C5769q extends Lambda implements Function1<Pair<? extends String, ? extends C37213Xy2.EnumC9562a>, InterfaceC23447K<? extends Unit>> {
        public C5769q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Unit> invoke(Pair<String, ? extends C37213Xy2.EnumC9562a> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String component1 = pair.component1();
            C37213Xy2.EnumC9562a component2 = pair.component2();
            C34873Ny2 c34873Ny2 = C34873Ny2.this;
            if (component2 == C37213Xy2.EnumC9562a.PASTED) {
                z = true;
            } else {
                z = false;
            }
            return c34873Ny2.m93151D(component1, z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$r */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5770r extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C5770r f25452b = new C5770r();

        public C5770r() {
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
    /* renamed from: Ny2$s */
    /* loaded from: classes2.dex */
    public static final class C5771s extends Lambda implements Function1<Unit, Unit> {
        public C5771s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C34873Ny2.this.f25429i.mo36956r(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ny2$t */
    /* loaded from: classes2.dex */
    public static final class C5772t extends Lambda implements Function1<Unit, Unit> {
        public C5772t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C34873Ny2.this.f25423c.mo55956N(new VerificationEmailResent());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ny2$u */
    /* loaded from: classes2.dex */
    public static final class C5773u extends Lambda implements Function1<Unit, InterfaceC24574u<? extends String>> {
        public C5773u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends String> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37279Yf5.m74545l0(C34873Ny2.this.m93152C());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "email", "Lio/reactivex/K;", "Lqa1;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ny2$v */
    /* loaded from: classes2.dex */
    public static final class C5774v extends Lambda implements Function1<String, InterfaceC23447K<? extends C47537qa1>> {
        public C5774v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends C47537qa1> invoke(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return C28237sD.progress$default(C34873Ny2.this.f25426f.mo26958s(email, C34873Ny2.this.f25422b.m37667W()), C34873Ny2.this.f25428h, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lqa1;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lqa1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ny2$w */
    /* loaded from: classes2.dex */
    public static final class C5775w extends Lambda implements Function1<C47537qa1, Unit> {
        public C5775w() {
            super(1);
        }

        /* renamed from: a */
        public final void m93098a(C47537qa1 c47537qa1) {
            C34873Ny2.this.f25428h.success(C34873Ny2.this.f25421a.getString(C45871nl4.login_resend_success, C34873Ny2.this.m93152C()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47537qa1 c47537qa1) {
            m93098a(c47537qa1);
            return Unit.INSTANCE;
        }
    }

    public C34873Ny2(Context context, C22454gl preference, InterfaceC1880Ea analyticsManager, C36207Tq4 reactiveConfig, InterfaceC32684Ep0 optInManager, InterfaceC44647lh6 userManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC36043Sy2 ui, InterfaceC40099e13 navigator, DQ3 permissionManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(optInManager, "optInManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f25421a = context;
        this.f25422b = preference;
        this.f25423c = analyticsManager;
        this.f25424d = reactiveConfig;
        this.f25425e = optInManager;
        this.f25426f = userManager;
        this.f25427g = scopeProvider;
        this.f25428h = ui;
        this.f25429i = navigator;
        this.f25430j = permissionManager;
    }

    /* renamed from: A */
    public static final void m93154A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m93153B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m93150E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m93149F(C34873Ny2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f25423c.mo55956N(new EmailVerified(true));
    }

    /* renamed from: G */
    public static final void m93148G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m93146I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m93145J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m93144K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m93143L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m93141N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m93140O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m93139P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23447K m93138Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m93137R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m93136S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m93135T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m93134U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m93133V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m93132W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC24574u m93131X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m93130Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m93129Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m93128a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final String m93152C() {
        return this.f25431k;
    }

    /* renamed from: D */
    public final AbstractC23442F<Unit> m93151D(String str, boolean z) {
        AbstractC23461c m93142M = m93142M(str);
        final C5756d c5756d = new C5756d(z, this, str);
        AbstractC23461c m33070P = m93142M.m33081E(new InterfaceC23484g() { // from class: Fy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93150E(Function1.this, obj);
            }
        }).m33029z(new InterfaceC23478a() { // from class: Gy2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C34873Ny2.m93149F(C34873Ny2.this);
            }
        }).m33070P(C23454a.m33087a());
        final C5757e c5757e = new C5757e(z);
        AbstractC23442F<Unit> m33046j0 = m33070P.m33084B(new InterfaceC23484g() { // from class: Hy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93148G(Function1.this, obj);
            }
        }).m33046j0(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(m33046j0, "private fun handleCode(c…toSingleDefault(Unit)\n  }");
        return m33046j0;
    }

    /* renamed from: H */
    public final void m93147H(Intent intent) {
        Integer num;
        int lastIndexOf$default;
        String dataString = intent.getDataString();
        String dataString2 = intent.getDataString();
        String str = null;
        if (dataString2 != null) {
            lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) dataString2, "/", 0, false, 6, (Object) null);
            num = Integer.valueOf(lastIndexOf$default);
        } else {
            num = null;
        }
        if (dataString != null && num != null && num.intValue() != -1) {
            boolean z = true;
            String substring = dataString.substring(num.intValue() + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() <= 0) {
                z = false;
            }
            if (z) {
                str = substring;
            }
            if (str != null) {
                this.f25423c.mo55905y(new C37844aF2(null, null, null, str, "DEEP_LINK", 7, null));
                AbstractC23442F m74533r0 = C37279Yf5.m74533r0(m93142M(str), this.f25424d.m82649d4());
                final C5758f c5758f = new C5758f();
                AbstractC23442F m33101w = m74533r0.m33101w(new InterfaceC23484g() { // from class: Ay2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C34873Ny2.m93146I(Function1.this, obj);
                    }
                });
                final C5759g c5759g = new C5759g();
                AbstractC23442F m33152N = m33101w.m33106t(new InterfaceC23484g() { // from class: Cy2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C34873Ny2.m93145J(Function1.this, obj);
                    }
                }).m33152N(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(m33152N, "private fun interceptVer…     })\n      }\n    }\n  }");
                Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f25427g));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C5760h c5760h = new C5760h();
                InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Dy2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C34873Ny2.m93144K(Function1.this, obj);
                    }
                };
                final C5761i c5761i = new C5761i();
                ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Ey2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C34873Ny2.m93143L(Function1.this, obj);
                    }
                });
            }
        }
    }

    /* renamed from: M */
    public final AbstractC23461c m93142M(String str) {
        AbstractC23461c m33049i = this.f25426f.mo26969b0(str).m33049i(this.f25425e.mo101670c(true));
        Intrinsics.checkNotNullExpressionValue(m33049i, "userManager\n      .login…romSignUp = true)\n      )");
        return C28237sD.progress$default(m33049i, this.f25428h, 0, 2, (Object) null);
    }

    @Override // p000.InterfaceC47185py2
    /* renamed from: a */
    public void mo18370a(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        AbstractC23442F<Unit> m33152N = m93151D(code, true).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "handleCode(code = code, …dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f25427g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5762j c5762j = new C5762j();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: yy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93141N(Function1.this, obj);
            }
        };
        final C5763k c5763k = C5763k.f25445g;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: zy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93140O(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC47185py2
    /* renamed from: b */
    public void mo18369b(Intent intent) {
        Unit unit;
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("email");
        if (stringExtra == null) {
            stringExtra = this.f25422b.m37650a0();
        }
        this.f25431k = stringExtra;
        if (stringExtra != null) {
            this.f25428h.mo75964ta(f25420n.matches(stringExtra));
            this.f25428h.mo75981C(stringExtra);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f25428h.mo75981C("email");
        }
        m93147H(intent);
        this.f25423c.mo55905y(new PF2(null, null, null, 7, null));
        Object m33094as = this.f25428h.mo75968hj().m33094as(AutoDispose.m45239a(this.f25427g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5768p c5768p = new C5768p();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Iy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93139P(Function1.this, obj);
            }
        });
        AbstractC24490k flowable = Observable.merge(this.f25428h.mo75979J5(), this.f25428h.mo75978Ng()).toFlowable(EnumC23460b.DROP);
        final C5769q c5769q = new C5769q();
        AbstractC24490k m32111s0 = flowable.m32146g0(new InterfaceC23492o() { // from class: Ly2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m93135T;
                m93135T = C34873Ny2.m93135T(Function1.this, obj);
                return m93135T;
            }
        }, false, 1).m32111s0(C23454a.m33087a());
        final C5770r c5770r = C5770r.f25452b;
        AbstractC24490k m32192J0 = m32111s0.m32195I(new InterfaceC23484g() { // from class: My2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93134U(Function1.this, obj);
            }
        }).m32192J0();
        Intrinsics.checkNotNullExpressionValue(m32192J0, "override fun onCreate(in…sCodeEditor()\n      }\n  }");
        Object m32150f = m32192J0.m32150f(AutoDispose.m45239a(this.f25427g));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5771s c5771s = new C5771s();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: ry2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93133V(Function1.this, obj);
            }
        });
        Observable<Unit> mo75963wb = this.f25428h.mo75963wb();
        final C5772t c5772t = new C5772t();
        Observable<Unit> doOnNext = mo75963wb.doOnNext(new InterfaceC23484g() { // from class: sy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93132W(Function1.this, obj);
            }
        });
        final C5773u c5773u = new C5773u();
        Observable<R> flatMapMaybe = doOnNext.flatMapMaybe(new InterfaceC23492o() { // from class: ty2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m93131X;
                m93131X = C34873Ny2.m93131X(Function1.this, obj);
                return m93131X;
            }
        });
        final C5774v c5774v = new C5774v();
        Observable flatMapSingle = flatMapMaybe.flatMapSingle(new InterfaceC23492o() { // from class: uy2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m93130Y;
                m93130Y = C34873Ny2.m93130Y(Function1.this, obj);
                return m93130Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate(in…sCodeEditor()\n      }\n  }");
        Object m33094as2 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f25427g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5775w c5775w = new C5775w();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: vy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93129Z(Function1.this, obj);
            }
        };
        final C5764l c5764l = new C5764l();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: wy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93128a0(Function1.this, obj);
            }
        });
        Observable<Unit> mo75965o1 = this.f25428h.mo75965o1();
        final C5765m c5765m = new C5765m();
        Observable observeOn = mo75965o1.flatMapSingle(new InterfaceC23492o() { // from class: xy2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m93138Q;
                m93138Q = C34873Ny2.m93138Q(Function1.this, obj);
                return m93138Q;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(in…sCodeEditor()\n      }\n  }");
        Object m33094as3 = observeOn.m33094as(AutoDispose.m45239a(this.f25427g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5766n c5766n = new C5766n();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Jy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93137R(Function1.this, obj);
            }
        });
        Object m33094as4 = this.f25428h.mo75980Ec().m33094as(AutoDispose.m45239a(this.f25427g));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5767o c5767o = new C5767o();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Ky2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93136S(Function1.this, obj);
            }
        });
    }

    /* renamed from: z */
    public final void m93104z(boolean z) {
        Object m33135e = this.f25430j.m110485l(Permission.ACCESS_FINE_LOCATION).m33135e(AutoDispose.m45239a(this.f25427g));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5754b c5754b = new C5754b(z, this);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: qy2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93154A(Function1.this, obj);
            }
        };
        final C5755c c5755c = new C5755c();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: By2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C34873Ny2.m93153B(Function1.this, obj);
            }
        });
    }
}
