package p000;

import android.content.Intent;
import android.os.Handler;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.payment.preload.p013v2.options.PreloadV2OptionsActivity;
import co.bird.android.model.COMPLETE;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.PaymentIntentStatus;
import co.bird.android.model.PaymentIntentStatusKt;
import co.bird.android.model.REQUIRES_AUTHENTICATION;
import co.bird.android.model.REQUIRES_PAYMENT_METHOD;
import co.bird.android.model.UNEXPECTED;
import co.bird.api.response.PreloadAndMaybeConfigureAutoReloadResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C44844m14;
import p000.InterfaceC40099e13;
import p000.InterfaceC44647lh6;
import p000.InterfaceC46820pM3;
import p000.VM3;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209¢\u0006\u0004\b=\u0010>J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00130\rH\u0002R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, m28432d2 = {"Lm14;", "La14;", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "", "onActivityResult", "", "optionId", "", "enableAutoReload", "Lio/reactivex/p;", "Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", C17296a.f69688o, "m", "Lio/reactivex/c;", "v", "LHM4;", "request", "o", "Llh6;", "Llh6;", "userManager", "LpM3;", "b", "LpM3;", "manager", "LEa;", "c", "LEa;", "analyticsManager", "LVM3;", DateTokenConverter.CONVERTER_KEY, "LVM3;", "paymentManagerV3", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "handler", "LDL3;", "f", "LDL3;", "paymentAuthorizationHandler", "Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;", "g", "Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;", "activity", "Le13;", "h", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lgl;", "j", "Lgl;", "preference", "<init>", "(Llh6;LpM3;LEa;LVM3;Landroid/os/Handler;LDL3;Lco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsActivity;Le13;Lcom/uber/autodispose/ScopeProvider;Lgl;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreloadV2OptionsPaymentIntentDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsPaymentIntentDelegateImpl.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPaymentIntentDelegateImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,205:1\n218#2:206\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsPaymentIntentDelegateImpl.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPaymentIntentDelegateImpl\n*L\n57#1:206\n*E\n"})
/* renamed from: m14  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44844m14 implements InterfaceC37711a14 {

    /* renamed from: a */
    public final InterfaceC44647lh6 f97102a;

    /* renamed from: b */
    public final InterfaceC46820pM3 f97103b;

    /* renamed from: c */
    public final InterfaceC1880Ea f97104c;

    /* renamed from: d */
    public final VM3 f97105d;

    /* renamed from: e */
    public final Handler f97106e;

    /* renamed from: f */
    public final DL3 f97107f;

    /* renamed from: g */
    public final PreloadV2OptionsActivity f97108g;

    /* renamed from: h */
    public final InterfaceC40099e13 f97109h;

    /* renamed from: i */
    public final ScopeProvider f97110i;

    /* renamed from: j */
    public final C22454gl f97111j;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: m14$a */
    /* loaded from: classes3.dex */
    public static final class C25858a extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C25858a() {
            super(1);
        }

        /* renamed from: a */
        public final void m26492a(InterfaceC23465c interfaceC23465c) {
            C44844m14.this.f97111j.m37620h();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m26492a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: m14$b */
    /* loaded from: classes3.dex */
    public static final class C25859b extends Lambda implements Function1<Throwable, Unit> {
        public C25859b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C44844m14.this.f97103b.mo8810g(new UNEXPECTED(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001 \u0004*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", "response", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "c", "(LHM4;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: m14$c */
    /* loaded from: classes3.dex */
    public static final class C25860c extends Lambda implements Function1<HM4<PreloadAndMaybeConfigureAutoReloadResponse>, InterfaceC24574u<? extends PreloadAndMaybeConfigureAutoReloadResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: m14$c$a */
        /* loaded from: classes3.dex */
        public static final class C25861a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C44844m14 f97115g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25861a(C44844m14 c44844m14) {
                super(1);
                this.f97115g = c44844m14;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f97115g.f97103b.mo8810g(new UNEXPECTED(th));
            }
        }

        public C25860c() {
            super(1);
        }

        /* renamed from: d */
        public static final void m26488d(C44844m14 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f97103b.mo8810g(COMPLETE.INSTANCE);
        }

        /* renamed from: e */
        public static final void m26487e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends PreloadAndMaybeConfigureAutoReloadResponse> invoke(HM4<PreloadAndMaybeConfigureAutoReloadResponse> response) {
            List listOf;
            Intrinsics.checkNotNullParameter(response, "response");
            C41318g46.m40163a("handleConfigurePreloadAndMaybeAutoReload received response: " + response, new Object[0]);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{C44844m14.this.f97105d.mo25779A(), InterfaceC44647lh6.C25764a.fetchBalance$default(C44844m14.this.f97102a, null, 1, null).m33159G()});
            AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
            final C44844m14 c44844m14 = C44844m14.this;
            AbstractC23461c m33029z = m33037r.m33029z(new InterfaceC23478a() { // from class: n14
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C44844m14.C25860c.m26488d(C44844m14.this);
                }
            });
            final C25861a c25861a = new C25861a(C44844m14.this);
            return m33029z.m33084B(new InterfaceC23484g() { // from class: o14
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44844m14.C25860c.m26487e(Function1.this, obj);
                }
            }).m33046j0(response.m103944a()).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", "response", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: m14$d */
    /* loaded from: classes3.dex */
    public static final class C25862d extends Lambda implements Function1<PreloadAndMaybeConfigureAutoReloadResponse, InterfaceC24574u<? extends PreloadAndMaybeConfigureAutoReloadResponse>> {

        /* renamed from: g */
        public static final C25862d f97116g = new C25862d();

        public C25862d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends PreloadAndMaybeConfigureAutoReloadResponse> invoke(PreloadAndMaybeConfigureAutoReloadResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            C41318g46.m40163a("handleConfigurePreloadAndMaybeAutoReload successful response", new Object[0]);
            return AbstractC24507p.m32068G(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "error", "Lio/reactivex/u;", "Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: m14$e */
    /* loaded from: classes3.dex */
    public static final class C25863e extends Lambda implements Function1<Throwable, InterfaceC24574u<? extends PreloadAndMaybeConfigureAutoReloadResponse>> {

        /* renamed from: g */
        public static final C25863e f97117g = new C25863e();

        public C25863e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends PreloadAndMaybeConfigureAutoReloadResponse> invoke(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            C41318g46.m40161c(error, "handleConfigurePreloadAndMaybeAutoReload error: ", new Object[0]);
            return AbstractC24507p.m32023v(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PaymentIntentStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/PaymentIntentStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPreloadV2OptionsPaymentIntentDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsPaymentIntentDelegateImpl.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsPaymentIntentDelegateImpl$observePaymentStatus$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    /* renamed from: m14$f */
    /* loaded from: classes3.dex */
    public static final class C25864f extends Lambda implements Function1<PaymentIntentStatus, Unit> {
        public C25864f() {
            super(1);
        }

        /* renamed from: a */
        public final void m26484a(PaymentIntentStatus paymentIntentStatus) {
            Unit unit;
            if (paymentIntentStatus instanceof REQUIRES_AUTHENTICATION) {
                C44844m14.this.f97108g.m57735S();
                C44844m14.this.f97103b.mo8804m(C44844m14.this.f97108g);
            } else if (paymentIntentStatus instanceof REQUIRES_PAYMENT_METHOD) {
                C44844m14.this.f97108g.m57735S();
                C44844m14.this.f97103b.mo8799r();
                InterfaceC40099e13.C19924a.goToEnterCard$default(C44844m14.this.f97109h, 10069, false, PaymentAddSource.PRELOAD_SCREEN, 2, null);
            } else if (paymentIntentStatus instanceof COMPLETE) {
                C44844m14.this.f97108g.m57728d0().mo57713c(true);
            } else if (paymentIntentStatus instanceof UNEXPECTED) {
                Throwable throwable = ((UNEXPECTED) paymentIntentStatus).getThrowable();
                if (throwable != null) {
                    C44844m14.this.f97108g.m57728d0().m42280h(new C51153wg1(throwable));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    C44844m14.this.f97108g.m57728d0().m42280h(new C47597qg1(C45871nl4.payment_error_title));
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentIntentStatus paymentIntentStatus) {
            m26484a(paymentIntentStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/PaymentIntentStatus;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/PaymentIntentStatus;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: m14$g */
    /* loaded from: classes3.dex */
    public static final class C25865g extends Lambda implements Function1<PaymentIntentStatus, Boolean> {

        /* renamed from: g */
        public static final C25865g f97119g = new C25865g();

        public C25865g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PaymentIntentStatus it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(PaymentIntentStatusKt.isEnded(it));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/PreloadAndMaybeConfigureAutoReloadResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: m14$h */
    /* loaded from: classes3.dex */
    public static final class C25866h extends Lambda implements Function1<PreloadAndMaybeConfigureAutoReloadResponse, Unit> {
        public C25866h() {
            super(1);
        }

        /* renamed from: a */
        public final void m26482a(PreloadAndMaybeConfigureAutoReloadResponse preloadAndMaybeConfigureAutoReloadResponse) {
            if (preloadAndMaybeConfigureAutoReloadResponse.getAction() == null) {
                C44844m14.this.f97108g.m57728d0().m42280h(new C33658It2(false));
                C44844m14.this.f97108g.m57728d0().mo57713c(true);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PreloadAndMaybeConfigureAutoReloadResponse preloadAndMaybeConfigureAutoReloadResponse) {
            m26482a(preloadAndMaybeConfigureAutoReloadResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: m14$i */
    /* loaded from: classes3.dex */
    public static final class C25867i extends Lambda implements Function1<Throwable, Unit> {
        public C25867i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Exception while handling activity result", new Object[0]);
            C44844m14.this.f97103b.mo8810g(new UNEXPECTED(th));
            C44844m14.this.f97108g.m57728d0().m42280h(new C33658It2(false));
            C44844m14.this.f97108g.m57728d0().m42280h(new V84(th));
        }
    }

    public C44844m14(InterfaceC44647lh6 userManager, InterfaceC46820pM3 manager, InterfaceC1880Ea analyticsManager, VM3 paymentManagerV3, Handler handler, DL3 paymentAuthorizationHandler, PreloadV2OptionsActivity activity, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, C22454gl preference) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(paymentAuthorizationHandler, "paymentAuthorizationHandler");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(preference, "preference");
        this.f97102a = userManager;
        this.f97103b = manager;
        this.f97104c = analyticsManager;
        this.f97105d = paymentManagerV3;
        this.f97106e = handler;
        this.f97107f = paymentAuthorizationHandler;
        this.f97108g = activity;
        this.f97109h = navigator;
        this.f97110i = scopeProvider;
        this.f97111j = preference;
    }

    /* renamed from: n */
    public static final void m26505n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final InterfaceC24574u m26503p(final C44844m14 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C41318g46.m40163a("handleConfigurePreloadAndMaybeAutoReload requires payment action, waiting...", new Object[0]);
        return this$0.f97103b.mo8798s().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: k14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m26502q;
                m26502q = C44844m14.m26502q(C44844m14.this);
                return m26502q;
            }
        })).m33053f0();
    }

    /* renamed from: q */
    public static final InterfaceC23496h m26502q(C44844m14 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.m26497v();
    }

    /* renamed from: r */
    public static final void m26501r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC24574u m26500s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC24574u m26499t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC24574u m26498u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m26496w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final boolean m26495x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: y */
    public static final void m26494y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m26493z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37711a14
    /* renamed from: a */
    public AbstractC24507p<PreloadAndMaybeConfigureAutoReloadResponse> mo26518a(String optionId, boolean z) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        this.f97103b.mo8808i();
        this.f97111j.m37661X1(optionId, z);
        return m26504o(this.f97107f.mo103984a(VM3.C8609a.configurePreloadAndMaybeAutoReload$default(this.f97105d, optionId, z, null, 4, null)));
    }

    /* renamed from: m */
    public final AbstractC24507p<PreloadAndMaybeConfigureAutoReloadResponse> m26506m() {
        Pair<String, Boolean> m37687R = this.f97111j.m37687R();
        if (m37687R == null) {
            AbstractC24507p<PreloadAndMaybeConfigureAutoReloadResponse> m32023v = AbstractC24507p.m32023v(new NullPointerException("No stored option information found in persistent storage, cannot continue with payment intent flow"));
            Intrinsics.checkNotNullExpressionValue(m32023v, "error(NullPointerExcepti…th payment intent flow\"))");
            return m32023v;
        }
        boolean booleanValue = m37687R.component2().booleanValue();
        AbstractC24507p<PreloadAndMaybeConfigureAutoReloadResponse> m26504o = m26504o(this.f97107f.mo103984a(this.f97105d.mo25731l(m37687R.component1(), booleanValue, this.f97103b.mo8800q())));
        final C25858a c25858a = new C25858a();
        AbstractC24507p<PreloadAndMaybeConfigureAutoReloadResponse> m32027r = m26504o.m32027r(new InterfaceC23484g() { // from class: e14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44844m14.m26505n(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32027r, "private fun continueConf…ReloadFlowDetails() }\n  }");
        return m32027r;
    }

    /* renamed from: o */
    public final AbstractC24507p<PreloadAndMaybeConfigureAutoReloadResponse> m26504o(AbstractC24507p<HM4<PreloadAndMaybeConfigureAutoReloadResponse>> abstractC24507p) {
        AbstractC24507p<HM4<PreloadAndMaybeConfigureAutoReloadResponse>> m32059P = abstractC24507p.m32059P(1L);
        final C25859b c25859b = new C25859b();
        AbstractC24507p<HM4<PreloadAndMaybeConfigureAutoReloadResponse>> m32029p = m32059P.m32029p(new InterfaceC23484g() { // from class: f14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44844m14.m26501r(Function1.this, obj);
            }
        });
        final C25860c c25860c = new C25860c();
        AbstractC24507p m32066I = m32029p.m32021x(new InterfaceC23492o() { // from class: g14
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m26500s;
                m26500s = C44844m14.m26500s(Function1.this, obj);
                return m26500s;
            }
        }).m32066I(C23454a.m33087a());
        final C25862d c25862d = C25862d.f97116g;
        InterfaceC23492o interfaceC23492o = new InterfaceC23492o() { // from class: h14
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m26499t;
                m26499t = C44844m14.m26499t(Function1.this, obj);
                return m26499t;
            }
        };
        final C25863e c25863e = C25863e.f97117g;
        AbstractC24507p<PreloadAndMaybeConfigureAutoReloadResponse> m32019z = m32066I.m32019z(interfaceC23492o, new InterfaceC23492o() { // from class: i14
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m26498u;
                m26498u = C44844m14.m26498u(Function1.this, obj);
                return m26498u;
            }
        }, new Callable() { // from class: j14
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC24574u m26503p;
                m26503p = C44844m14.m26503p(C44844m14.this);
                return m26503p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32019z, "private fun handleConfig…e()\n        }\n      )\n  }");
        return m32019z;
    }

    @Override // p000.InterfaceC37711a14
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f97103b.mo8806k().m73665a().booleanValue()) {
            return;
        }
        this.f97103b.mo8803n();
        if (i2 == -1) {
            this.f97108g.m57728d0().m42280h(new C33658It2(true));
            Object m32048b = m26506m().m32048b(AutoDispose.m45239a(this.f97110i));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C25866h c25866h = new C25866h();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: b14
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44844m14.m26494y(Function1.this, obj);
                }
            };
            final C25867i c25867i = new C25867i();
            ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: d14
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44844m14.m26493z(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: v */
    public final AbstractC23461c m26497v() {
        Observable m74576S = C37279Yf5.m74576S(InterfaceC46820pM3.C27275a.observePaymentStatus$default(this.f97103b, false, 1, null));
        final C25864f c25864f = new C25864f();
        Observable doOnNext = m74576S.doOnNext(new InterfaceC23484g() { // from class: l14
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44844m14.m26496w(Function1.this, obj);
            }
        });
        final C25865g c25865g = C25865g.f97119g;
        AbstractC23461c m33159G = doOnNext.filter(new InterfaceC23494q() { // from class: c14
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m26495x;
                m26495x = C44844m14.m26495x(Function1.this, obj);
                return m26495x;
            }
        }).firstOrError().m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun observePayme…     .ignoreElement()\n  }");
        return m33159G;
    }
}
