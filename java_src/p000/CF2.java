package p000;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Handler;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.analytics.EmailSubmitted;
import co.bird.android.model.analytics.LoginLocationRequestTimedOut;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.CF2;
import p000.S74;
@Metadata(m28433d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.\u0012\u0006\u00105\u001a\u000202\u0012\u0006\u00109\u001a\u000206\u0012\u0006\u0010=\u001a\u00020:\u0012\u0006\u0010A\u001a\u00020>\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u000e\b\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00020K0J\u0012\b\b\u0001\u0010R\u001a\u00020O\u0012\b\b\u0001\u0010V\u001a\u00020S\u0012\b\b\u0001\u0010Z\u001a\u00020W¢\u0006\u0004\ba\u0010bJ\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\"\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020K0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006c"}, m28432d2 = {"LCF2;", "LcF2;", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "completedTask", "A", "", "d0", "", "permissionGranted", "locationOptOutEnabled", "B", "validationRequired", "", "email", "F", "account", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "G", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", "LTq4;", "c", "LTq4;", "reactiveConfig", "LEa;", DateTokenConverter.CONVERTER_KEY, "LEa;", "analyticsManager", "Ldr4;", "e", "Ldr4;", "locationManager", "LEp0;", "f", "LEp0;", "optInManager", "Lgl;", "g", "Lgl;", "preference", "LOh;", "h", "LOh;", "buildConfig", "Lm46;", "i", "Lm46;", "timeProvider", "Llh6;", "j", "Llh6;", "userManager", "LRp;", "k", "LRp;", "authManager", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "l", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "googleSignInClient", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "m", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LKF2;", "n", "LKF2;", "ui", "Le13;", "o", "Le13;", "navigator", "LDQ3;", "p", "LDQ3;", "permissionManager", "q", "Ljava/lang/String;", "agreement", "r", "Z", "optInEnabled", "<init>", "(Landroid/content/Context;Landroid/os/Handler;LTq4;LEa;Ldr4;LEp0;Lgl;LOh;Lm46;Llh6;LRp;Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LKF2;Le13;LDQ3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMagicLinkIntroPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MagicLinkIntroPresenter.kt\nco/bird/android/app/feature/magiclink/MagicLinkIntroPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,336:1\n180#2:337\n180#2:338\n180#2:339\n180#2:340\n180#2:341\n180#2:342\n180#2:343\n199#2:344\n*S KotlinDebug\n*F\n+ 1 MagicLinkIntroPresenter.kt\nco/bird/android/app/feature/magiclink/MagicLinkIntroPresenterImpl\n*L\n94#1:337\n122#1:338\n137#1:339\n145#1:340\n219#1:341\n228#1:342\n234#1:343\n312#1:344\n*E\n"})
/* renamed from: CF2 */
/* loaded from: classes2.dex */
public final class CF2 implements InterfaceC39030cF2 {

    /* renamed from: a */
    public final Context f3650a;

    /* renamed from: b */
    public final Handler f3651b;

    /* renamed from: c */
    public final C36207Tq4 f3652c;

    /* renamed from: d */
    public final InterfaceC1880Ea f3653d;

    /* renamed from: e */
    public final InterfaceC40001dr4 f3654e;

    /* renamed from: f */
    public final InterfaceC32684Ep0 f3655f;

    /* renamed from: g */
    public final C22454gl f3656g;

    /* renamed from: h */
    public final InterfaceC6097Oh f3657h;

    /* renamed from: i */
    public final InterfaceC44876m46 f3658i;

    /* renamed from: j */
    public final InterfaceC44647lh6 f3659j;

    /* renamed from: k */
    public final InterfaceC7277Rp f3660k;

    /* renamed from: l */
    public final GoogleSignInClient f3661l;

    /* renamed from: m */
    public final LifecycleScopeProvider<EnumC7097RE> f3662m;

    /* renamed from: n */
    public final KF2 f3663n;

    /* renamed from: o */
    public final InterfaceC40099e13 f3664o;

    /* renamed from: p */
    public final DQ3 f3665p;

    /* renamed from: q */
    public final String f3666q;

    /* renamed from: r */
    public final boolean f3667r;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "checked", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$a */
    /* loaded from: classes2.dex */
    public static final class C0931a extends Lambda implements Function1<Boolean, Unit> {
        public C0931a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean checked) {
            KF2 kf2 = CF2.this.f3663n;
            Intrinsics.checkNotNullExpressionValue(checked, "checked");
            kf2.mo94132xk(checked.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lqa1;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(Lqa1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF2$b */
    /* loaded from: classes2.dex */
    public static final class C0932b extends Lambda implements Function1<C47537qa1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f3669g;

        /* renamed from: h */
        public final /* synthetic */ CF2 f3670h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0932b(String str, CF2 cf2) {
            super(1);
            this.f3669g = str;
            this.f3670h = cf2;
        }

        /* renamed from: a */
        public final void m112535a(C47537qa1 result) {
            if (this.f3669g != null) {
                this.f3670h.f3653d.mo55905y(new DD1(null, null, null, 7, null));
                CF2 cf2 = this.f3670h;
                Intrinsics.checkNotNullExpressionValue(result, "result");
                cf2.m112586F(result.m118446unboximpl(), this.f3669g);
                return;
            }
            C41318g46.m40160d("Validation required from Google log in and user has no email.", new Object[0]);
            this.f3670h.f3653d.mo55905y(new CD1(null, null, null, "Validation required from Google log in and user has no email.", 7, null));
            this.f3670h.f3663n.error(C45871nl4.login_google_error);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C47537qa1 c47537qa1) {
            m112535a(c47537qa1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$c */
    /* loaded from: classes2.dex */
    public static final class C0933c extends Lambda implements Function1<Throwable, Unit> {
        public C0933c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            CF2.this.f3653d.mo55905y(new CD1(null, null, null, th.getLocalizedMessage(), 7, null));
            CF2.this.f3663n.error(C45871nl4.login_google_error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$d */
    /* loaded from: classes2.dex */
    public static final class C0934d extends Lambda implements Function1<String, Unit> {
        public C0934d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            boolean isBlank;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            isBlank = StringsKt__StringsJVMKt.isBlank(it);
            if (isBlank) {
                CF2.this.f3663n.mo94149H8(C45871nl4.error_invalid_email);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$e */
    /* loaded from: classes2.dex */
    public static final class C0935e extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public static final C0935e f3673g = new C0935e();

        public C0935e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String it) {
            boolean isBlank;
            Intrinsics.checkNotNullParameter(it, "it");
            isBlank = StringsKt__StringsJVMKt.isBlank(it);
            return Boolean.valueOf(!isBlank);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "email", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$f */
    /* loaded from: classes2.dex */
    public static final class C0936f extends Lambda implements Function1<String, Unit> {
        public C0936f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            CF2.this.f3653d.mo55905y(new C49315ta1(null, null, null, Boolean.valueOf(!CF2.this.f3656g.m37662X0()), str, Boolean.valueOf(CF2.this.f3663n.mo94140X0()), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\t\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "email", "Lio/reactivex/K;", "Lkotlin/Triple;", "LFQ3;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF2$g */
    /* loaded from: classes2.dex */
    public static final class C0937g extends Lambda implements Function1<String, InterfaceC23447K<? extends Triple<? extends String, ? extends FQ3, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LFQ3;", "it", "Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: CF2$g$a */
        /* loaded from: classes2.dex */
        public static final class C0938a extends Lambda implements Function1<FQ3, Triple<? extends String, ? extends FQ3, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ String f3676g;

            /* renamed from: h */
            public final /* synthetic */ CF2 f3677h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0938a(String str, CF2 cf2) {
                super(1);
                this.f3676g = str;
                this.f3677h = cf2;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<String, FQ3, Boolean> invoke(FQ3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Triple<>(this.f3676g, it, Boolean.valueOf(this.f3677h.f3652c.m82623f8().getValue().getRideConfig().getEnableLocationOptOut()));
            }
        }

        public C0937g() {
            super(1);
        }

        /* renamed from: b */
        public static final Triple m112533b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Triple<String, FQ3, Boolean>> invoke(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            AbstractC23442F progress$default = C28237sD.progress$default(CF2.this.f3665p.m110485l(Permission.ACCESS_FINE_LOCATION), CF2.this.f3663n, 0, 2, (Object) null);
            final C0938a c0938a = new C0938a(email, CF2.this);
            return progress$default.m33157I(new InterfaceC23492o() { // from class: DF2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m112533b;
                    m112533b = CF2.C0937g.m112533b(Function1.this, obj);
                    return m112533b;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "LFQ3;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF2$h */
    /* loaded from: classes2.dex */
    public static final class C0939h extends Lambda implements Function1<Triple<? extends String, ? extends FQ3, ? extends Boolean>, Unit> {
        public C0939h() {
            super(1);
        }

        /* renamed from: a */
        public final void m112531a(Triple<String, FQ3, Boolean> triple) {
            if (!CF2.this.m112590B(triple.component2().m107154a(), triple.component3().booleanValue())) {
                CF2.this.f3663n.error(C45871nl4.main_location_error);
                S74.C7343a.showProgress$default(CF2.this.f3663n, false, 0, 2, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends String, ? extends FQ3, ? extends Boolean> triple) {
            m112531a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Triple;", "", "LFQ3;", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF2$i */
    /* loaded from: classes2.dex */
    public static final class C0940i extends Lambda implements Function1<Triple<? extends String, ? extends FQ3, ? extends Boolean>, Boolean> {
        public C0940i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Triple<String, FQ3, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            return Boolean.valueOf(CF2.this.m112590B(triple.component2().m107154a(), triple.component3().booleanValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001ab\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \b*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006 \b*0\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \b*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "LFQ3;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF2$j */
    /* loaded from: classes2.dex */
    public static final class C0941j extends Lambda implements Function1<Triple<? extends String, ? extends FQ3, ? extends Boolean>, InterfaceC23447K<? extends Pair<? extends String, ? extends WireLocation>>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: CF2$j$a */
        /* loaded from: classes2.dex */
        public static final class C0942a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ CF2 f3681g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0942a(CF2 cf2) {
                super(1);
                this.f3681g = cf2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f3681g.f3653d.mo55956N(new LoginLocationRequestTimedOut());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "it", "Landroid/location/Location;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: CF2$j$b */
        /* loaded from: classes2.dex */
        public static final class C0943b extends Lambda implements Function1<Location, Pair<? extends String, ? extends WireLocation>> {

            /* renamed from: g */
            public final /* synthetic */ String f3682g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0943b(String str) {
                super(1);
                this.f3682g = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Pair<String, WireLocation> invoke(Location it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f3682g, new WireLocation(it.getLatitude(), it.getLongitude(), null, null, null, null, false, null, null, 508, null));
            }
        }

        public C0941j() {
            super(1);
        }

        /* renamed from: d */
        public static final Pair m112526d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<String, WireLocation>> invoke(Triple<String, FQ3, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            String component1 = triple.component1();
            AbstractC23442F m33140a0 = C28237sD.progress$default(CF2.this.f3654e.mo43627e(true), CF2.this.f3663n, 0, 2, (Object) null).m33142Y(C24542a.m31932c()).m33140a0(10L, TimeUnit.SECONDS);
            final C0942a c0942a = new C0942a(CF2.this);
            AbstractC23442F m33106t = m33140a0.m33106t(new InterfaceC23484g() { // from class: EF2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CF2.C0941j.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C0943b c0943b = new C0943b(component1);
            return m33106t.m33157I(new InterfaceC23492o() { // from class: FF2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m112526d;
                    m112526d = CF2.C0941j.m112526d(Function1.this, obj);
                    return m112526d;
                }
            }).m33148R(TuplesKt.m28425to(component1, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001 \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0006*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001 \u0006*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireLocation;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lqa1;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF2$k */
    /* loaded from: classes2.dex */
    public static final class C0944k extends Lambda implements Function1<Pair<? extends String, ? extends WireLocation>, InterfaceC23447K<? extends Pair<? extends C47537qa1, ? extends String>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lqa1;", "loginResponse", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Z)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: CF2$k$a */
        /* loaded from: classes2.dex */
        public static final class C0945a extends Lambda implements Function1<C47537qa1, Pair<? extends C47537qa1, ? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ String f3684g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0945a(String str) {
                super(1);
                this.f3684g = str;
            }

            /* renamed from: a */
            public final Pair<C47537qa1, String> m112523a(boolean z) {
                return TuplesKt.m28425to(C47537qa1.m118445boximpl(z), this.f3684g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Pair<? extends C47537qa1, ? extends String> invoke(C47537qa1 c47537qa1) {
                return m112523a(c47537qa1.m118446unboximpl());
            }
        }

        public C0944k() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<C47537qa1, String>> invoke(Pair<String, WireLocation> pair) {
            List split$default;
            String str;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String component1 = pair.component1();
            WireLocation component2 = pair.component2();
            String m86444f = C7241Rh.m86444f(CF2.this.f3657h);
            split$default = StringsKt__StringsKt.split$default((CharSequence) component1, new String[]{"@"}, false, 0, 6, (Object) null);
            if (CF2.this.f3652c.m82623f8().getValue().getPlatformConfig().getInsertEmailFlavorExtension() && m86444f != null && split$default.size() == 2) {
                str = split$default.get(0) + "+" + m86444f + CF2.this.f3658i.mo26387a() + "@" + split$default.get(1);
            } else {
                str = component1;
            }
            AbstractC23442F progress$default = C28237sD.progress$default(CF2.this.f3659j.mo26958s(str, component2), CF2.this.f3663n, 0, 2, (Object) null);
            final C0945a c0945a = new C0945a(component1);
            return progress$default.m33157I(new InterfaceC23492o() { // from class: GF2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = CF2.C0944k.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lqa1;", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF2$l */
    /* loaded from: classes2.dex */
    public static final class C0946l extends Lambda implements Function1<Pair<? extends C47537qa1, ? extends String>, Unit> {
        public C0946l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C47537qa1, ? extends String> pair) {
            invoke2((Pair<C47537qa1, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<C47537qa1, String> pair) {
            if (CF2.this.f3667r) {
                CF2.this.f3655f.mo101672a(CF2.this.f3663n.mo94140X0(), CF2.this.f3663n.mo94150E0());
            }
            CF2.this.f3653d.mo55956N(new EmailSubmitted(true));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$m */
    /* loaded from: classes2.dex */
    public static final class C0947m extends Lambda implements Function1<Throwable, Unit> {
        public C0947m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C41318g46.m40159e(it);
            CF2.this.f3653d.mo55956N(new EmailSubmitted(false));
            KF2 kf2 = CF2.this.f3663n;
            Context context = CF2.this.f3650a;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            C37513Zf5.displayStyledError$default(kf2, context, it, CF2.this.f3664o, null, null, false, 56, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lqa1;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: CF2$n */
    /* loaded from: classes2.dex */
    public static final class C0948n extends Lambda implements Function1<Pair<? extends C47537qa1, ? extends String>, Unit> {
        public C0948n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends C47537qa1, ? extends String> pair) {
            invoke2((Pair<C47537qa1, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<C47537qa1, String> pair) {
            CF2.this.m112586F(pair.component1().m118446unboximpl(), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "e", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$o */
    /* loaded from: classes2.dex */
    public static final class C0949o extends Lambda implements Function1<Throwable, Unit> {
        public C0949o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            C41318g46.m40159e(e);
            CF2.this.f3663n.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$p */
    /* loaded from: classes2.dex */
    public static final class C0950p extends Lambda implements Function1<Unit, Unit> {
        public C0950p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            CF2.this.m112558d0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "hasFocus", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$q */
    /* loaded from: classes2.dex */
    public static final class C0951q extends Lambda implements Function1<Boolean, Unit> {
        public C0951q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean hasFocus) {
            Intrinsics.checkNotNullExpressionValue(hasFocus, "hasFocus");
            boolean z = false;
            boolean z2 = hasFocus.booleanValue() && !CF2.this.f3663n.mo94131y7();
            boolean z3 = CF2.this.f3652c.m82623f8().m73665a().getZendeskConfig().getSignInScreenHelpUrl() != null;
            if (z2) {
                CF2.this.f3653d.mo55905y(new C49908ua1(null, null, null, Boolean.valueOf(!CF2.this.f3656g.m37662X0()), 7, null));
                CF2.this.f3663n.mo94134l3();
            }
            KF2 kf2 = CF2.this.f3663n;
            if (!z2 && z3) {
                z = true;
            }
            kf2.mo94137df(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$r */
    /* loaded from: classes2.dex */
    public static final class C0952r extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C0952r f3691g = new C0952r();

        public C0952r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getEnableSignInWithGoogle());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enableSignInWithGoogle", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$s */
    /* loaded from: classes2.dex */
    public static final class C0953s extends Lambda implements Function1<Boolean, Unit> {
        public C0953s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enableSignInWithGoogle) {
            KF2 kf2 = CF2.this.f3663n;
            Intrinsics.checkNotNullExpressionValue(enableSignInWithGoogle, "enableSignInWithGoogle");
            kf2.mo94138bf(enableSignInWithGoogle.booleanValue());
            if (enableSignInWithGoogle.booleanValue()) {
                CF2.this.f3653d.mo55905y(new BD1(null, null, null, 7, null));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$t */
    /* loaded from: classes2.dex */
    public static final class C0954t extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0954t f3693g = new C0954t();

        public C0954t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error handling google sign in button visibility", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$u */
    /* loaded from: classes2.dex */
    public static final class C0955u extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C0955u f3694g = new C0955u();

        public C0955u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getZendeskConfig().getSignInScreenHelpUrl() != null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "hasSignInHelpUrl", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$v */
    /* loaded from: classes2.dex */
    public static final class C0956v extends Lambda implements Function1<Boolean, Unit> {
        public C0956v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean hasSignInHelpUrl) {
            KF2 kf2 = CF2.this.f3663n;
            Intrinsics.checkNotNullExpressionValue(hasSignInHelpUrl, "hasSignInHelpUrl");
            kf2.mo94137df(hasSignInHelpUrl.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$w */
    /* loaded from: classes2.dex */
    public static final class C0957w extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0957w f3696g = new C0957w();

        public C0957w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error handling report issue button visibility", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$x */
    /* loaded from: classes2.dex */
    public static final class C0958x extends Lambda implements Function1<Unit, Unit> {
        public C0958x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13 interfaceC40099e13 = CF2.this.f3664o;
            String signInScreenHelpUrl = CF2.this.f3652c.m82623f8().m73665a().getZendeskConfig().getSignInScreenHelpUrl();
            if (signInScreenHelpUrl == null) {
                signInScreenHelpUrl = CF2.this.f3663n.getString(C45278ml4.static_report_an_issue_url, new Object[0]);
            }
            interfaceC40099e13.mo36983m2(signInScreenHelpUrl);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: CF2$y */
    /* loaded from: classes2.dex */
    public static final class C0959y extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0959y f3698g = new C0959y();

        public C0959y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error handling report issue button", new Object[0]);
        }
    }

    public CF2(Context context, Handler handler, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC40001dr4 locationManager, InterfaceC32684Ep0 optInManager, C22454gl preference, InterfaceC6097Oh buildConfig, InterfaceC44876m46 timeProvider, InterfaceC44647lh6 userManager, InterfaceC7277Rp authManager, GoogleSignInClient googleSignInClient, LifecycleScopeProvider<EnumC7097RE> scopeProvider, KF2 ui, InterfaceC40099e13 navigator, DQ3 permissionManager) {
        String capitalize;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(optInManager, "optInManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(googleSignInClient, "googleSignInClient");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f3650a = context;
        this.f3651b = handler;
        this.f3652c = reactiveConfig;
        this.f3653d = analyticsManager;
        this.f3654e = locationManager;
        this.f3655f = optInManager;
        this.f3656g = preference;
        this.f3657h = buildConfig;
        this.f3658i = timeProvider;
        this.f3659j = userManager;
        this.f3660k = authManager;
        this.f3661l = googleSignInClient;
        this.f3662m = scopeProvider;
        this.f3663n = ui;
        this.f3664o = navigator;
        this.f3665p = permissionManager;
        this.f3666q = reactiveConfig.m82623f8().getValue().getCommunicationOptIn().getLocalizedCommunicationOptInString();
        this.f3667r = reactiveConfig.m82623f8().getValue().getCommunicationOptIn().getCommunicationOptIn();
        Observable<Boolean> mo94145S1 = ui.mo94145S1();
        final C0931a c0931a = new C0931a();
        Observable<Boolean> doOnNext = mo94145S1.doOnNext(new InterfaceC23484g() { // from class: tF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112536z(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "ui.optInCheckBoxCheckedC…CheckBox(checked)\n      }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
        String string = ui.getString(C45871nl4.terms_of_service, new Object[0]);
        String str = "<a href=\"" + ui.getString(C45278ml4.terms_of_service_url, new Object[0]) + "\">" + string + "</a>";
        String str2 = "<a href=\"" + ui.getString(C45278ml4.privacy_policy_url, new Object[0]) + "\">" + ui.getString(C45871nl4.privacy_policy, new Object[0]) + "</a>";
        int minRiderAge = reactiveConfig.m82623f8().m73665a().getRideConfig().getMinRiderAge();
        capitalize = StringsKt__StringsJVMKt.capitalize(buildConfig.mo89926f());
        ui.mo94139bb(minRiderAge, capitalize, str, str2);
    }

    /* renamed from: D */
    public static final void m112588D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m112587E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m112584H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final boolean m112583I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: J */
    public static final void m112582J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC23447K m112581K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m112580L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final boolean m112579M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: N */
    public static final InterfaceC23447K m112578N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23447K m112577O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m112576P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m112575Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final Boolean m112574R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m112573S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m112572T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m112571U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m112570V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m112569W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m112568X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final Boolean m112567Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m112566Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m112564a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m112562b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m112560c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m112536z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final GoogleSignInAccount m112591A(Task<GoogleSignInAccount> task) {
        try {
            GoogleSignInAccount result = task.getResult(ApiException.class);
            if (result == null) {
                this.f3653d.mo55905y(new CD1(null, null, null, "GoogleSignInAccount from Google sign in result is null", 7, null));
                C41318g46.m40160d("GoogleSignInAccount from Google sign in result is null", new Object[0]);
                return result;
            }
            return result;
        } catch (ApiException e) {
            this.f3653d.mo55905y(new CD1(null, null, null, e.getLocalizedMessage(), 7, null));
            C41318g46.m40158f(e, "Google Login Failed", new Object[0]);
            this.f3663n.error(C45871nl4.login_google_error);
            return null;
        }
    }

    /* renamed from: B */
    public final boolean m112590B(boolean z, boolean z2) {
        return (C40788fB0.m41760v(this.f3650a) && z) || z2;
    }

    /* renamed from: C */
    public final void m112589C(GoogleSignInAccount googleSignInAccount) {
        String idToken = googleSignInAccount.getIdToken();
        String email = googleSignInAccount.getEmail();
        if (idToken != null) {
            Object m33135e = C28237sD.progress$default(this.f3660k.mo72457t(idToken), this.f3663n, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(this.f3662m));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C0932b c0932b = new C0932b(email, this);
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: dF2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CF2.m112588D(Function1.this, obj);
                }
            };
            final C0933c c0933c = new C0933c();
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: oF2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    CF2.m112587E(Function1.this, obj);
                }
            });
            return;
        }
        C41318g46.m40160d("idToken from GoogleSignInAccount should not be null", new Object[0]);
        this.f3653d.mo55905y(new CD1(null, null, null, "idToken from GoogleSignInAccount should not be null", 7, null));
        this.f3663n.error(C45871nl4.login_google_error);
    }

    /* renamed from: F */
    public final void m112586F(boolean z, String str) {
        if (!z) {
            this.f3664o.mo36956r(true);
        } else {
            this.f3664o.mo37049b2(str);
        }
    }

    /* renamed from: G */
    public void m112585G() {
        this.f3653d.mo55905y(new IA5(null, null, null, Boolean.valueOf(!this.f3656g.m37662X0()), 7, null));
        this.f3653d.mo55905y(new C48423s36(null, null, null, Boolean.valueOf(!this.f3656g.m37662X0()), 7, null));
        String m37650a0 = this.f3656g.m37650a0();
        if (m37650a0 != null) {
            this.f3663n.mo94151C(m37650a0);
        }
        Z84<Config> m82623f8 = this.f3652c.m82623f8();
        final C0952r c0952r = C0952r.f3691g;
        Observable observeOn = m82623f8.map(new InterfaceC23492o() { // from class: uF2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m112574R;
                m112574R = CF2.m112574R(Function1.this, obj);
                return m112574R;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reactiveConfig.config\n  …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f3662m));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0953s c0953s = new C0953s();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: hF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112569W(Function1.this, obj);
            }
        };
        final C0954t c0954t = C0954t.f3693g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: kF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112568X(Function1.this, obj);
            }
        });
        this.f3663n.mo94136h1(this.f3667r, this.f3666q);
        Z84<Config> m82623f82 = this.f3652c.m82623f8();
        final C0955u c0955u = C0955u.f3694g;
        Observable observeOn2 = m82623f82.map(new InterfaceC23492o() { // from class: lF2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m112567Y;
                m112567Y = CF2.m112567Y(Function1.this, obj);
                return m112567Y;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "reactiveConfig.config\n  …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f3662m));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0956v c0956v = new C0956v();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: mF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112566Z(Function1.this, obj);
            }
        };
        final C0957w c0957w = C0957w.f3696g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: nF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112564a0(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f3663n.mo94141V3().m33094as(AutoDispose.m45239a(this.f3662m));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0958x c0958x = new C0958x();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: pF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112562b0(Function1.this, obj);
            }
        };
        final C0959y c0959y = C0959y.f3698g;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: qF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112560c0(Function1.this, obj);
            }
        });
        Observable<String> mo94135hk = this.f3663n.mo94135hk();
        final C0934d c0934d = new C0934d();
        Observable<String> doOnNext = mo94135hk.doOnNext(new InterfaceC23484g() { // from class: rF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112584H(Function1.this, obj);
            }
        });
        final C0935e c0935e = C0935e.f3673g;
        Observable<String> filter = doOnNext.filter(new InterfaceC23494q() { // from class: sF2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m112583I;
                m112583I = CF2.m112583I(Function1.this, obj);
                return m112583I;
            }
        });
        final C0936f c0936f = new C0936f();
        Observable<String> doOnNext2 = filter.doOnNext(new InterfaceC23484g() { // from class: vF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112582J(Function1.this, obj);
            }
        });
        final C0937g c0937g = new C0937g();
        Observable<R> flatMapSingle = doOnNext2.flatMapSingle(new InterfaceC23492o() { // from class: wF2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m112581K;
                m112581K = CF2.m112581K(Function1.this, obj);
                return m112581K;
            }
        });
        final C0939h c0939h = new C0939h();
        Observable doOnNext3 = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: xF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112580L(Function1.this, obj);
            }
        });
        final C0940i c0940i = new C0940i();
        Observable filter2 = doOnNext3.filter(new InterfaceC23494q() { // from class: yF2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m112579M;
                m112579M = CF2.m112579M(Function1.this, obj);
                return m112579M;
            }
        });
        final C0941j c0941j = new C0941j();
        Observable flatMapSingle2 = filter2.flatMapSingle(new InterfaceC23492o() { // from class: zF2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m112578N;
                m112578N = CF2.m112578N(Function1.this, obj);
                return m112578N;
            }
        });
        final C0944k c0944k = new C0944k();
        Observable flatMapSingle3 = flatMapSingle2.flatMapSingle(new InterfaceC23492o() { // from class: AF2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m112577O;
                m112577O = CF2.m112577O(Function1.this, obj);
                return m112577O;
            }
        });
        final C0946l c0946l = new C0946l();
        Observable observeOn3 = flatMapSingle3.doOnNext(new InterfaceC23484g() { // from class: BF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112576P(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a());
        final C0947m c0947m = new C0947m();
        Observable retry = observeOn3.doOnError(new InterfaceC23484g() { // from class: eF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112575Q(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a()).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate() …& hasHelpUrl)\n      }\n  }");
        Object m33094as4 = retry.m33094as(AutoDispose.m45239a(this.f3662m));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0948n c0948n = new C0948n();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: fF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112573S(Function1.this, obj);
            }
        };
        final C0949o c0949o = new C0949o();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: gF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112572T(Function1.this, obj);
            }
        });
        Object m33094as5 = this.f3663n.mo94143T6().m33094as(AutoDispose.m45239a(this.f3662m));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0950p c0950p = new C0950p();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: iF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112571U(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f3663n.emailEditorFocuses().m33094as(AutoDispose.m45239a(this.f3662m));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0951q c0951q = new C0951q();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: jF2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                CF2.m112570V(Function1.this, obj);
            }
        });
    }

    /* renamed from: d0 */
    public final void m112558d0() {
        Intent signInIntent = this.f3661l.getSignInIntent();
        Intrinsics.checkNotNullExpressionValue(signInIntent, "googleSignInClient.signInIntent");
        this.f3664o.mo37081V1(signInIntent, 10020);
    }

    @Override // p000.InterfaceC39030cF2
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10020 && i2 == -1) {
            Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(intent);
            Intrinsics.checkNotNullExpressionValue(signedInAccountFromIntent, "getSignedInAccountFromIntent(data)");
            GoogleSignInAccount m112591A = m112591A(signedInAccountFromIntent);
            if (m112591A != null) {
                m112589C(m112591A);
                return;
            }
            C41318g46.m40160d("GoogleSignInAccount cannot be null", new Object[0]);
            this.f3663n.error(C45871nl4.login_google_error);
        }
    }

    @Override // p000.InterfaceC39030cF2
    public boolean onBackPressed() {
        if (this.f3663n.mo94131y7()) {
            this.f3663n.mo94130yf();
            return true;
        }
        return false;
    }
}
