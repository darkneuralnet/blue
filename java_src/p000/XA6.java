package p000;

import android.content.Intent;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BarcodeScanType;
import co.bird.android.model.Detail;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WirePart;
import co.bird.api.response.WhitelistResponse;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.ResponseBody;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B9\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b/\u00100J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0011\"\u000e\b\u0001\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u0012*\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0016\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, m28432d2 = {"LXA6;", "LRA6;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "q", "T", "LHM4;", "R", "Lio/reactivex/F;", "m", "LPA6;", "l", "LZA6;", C17296a.f69688o, "LZA6;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "LXY3;", "LXY3;", "powerlineManager", "Liy6;", "e", "Liy6;", "warehouseChecker", "Lwi2;", "f", "Lwi2;", "deserializer", "<init>", "(LZA6;Lcom/uber/autodispose/ScopeProvider;Le13;LXY3;Liy6;Lwi2;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWhitelistImeiLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhitelistImeiLandingPresenter.kt\nco/bird/android/feature/servicecenter/whitelist/WhitelistImeiLandingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n161#2:154\n161#2:155\n199#2:157\n1#3:156\n*S KotlinDebug\n*F\n+ 1 WhitelistImeiLandingPresenter.kt\nco/bird/android/feature/servicecenter/whitelist/WhitelistImeiLandingPresenterImpl\n*L\n47#1:154\n54#1:155\n81#1:157\n*E\n"})
/* renamed from: XA6 */
/* loaded from: classes3.dex */
public final class XA6 implements RA6, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final ZA6 f42749a;

    /* renamed from: b */
    public final ScopeProvider f42750b;

    /* renamed from: c */
    public final InterfaceC40099e13 f42751c;

    /* renamed from: d */
    public final XY3 f42752d;

    /* renamed from: e */
    public final C43038iy6 f42753e;

    /* renamed from: f */
    public final C51174wi2 f42754f;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XA6$a */
    /* loaded from: classes3.dex */
    public static final class C9337a extends Lambda implements Function1<Unit, Unit> {
        public C9337a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            XA6.this.f42751c.mo37064Y3(BarcodeScanType.RAW, Integer.valueOf(C45871nl4.whitelist));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XA6$b */
    /* loaded from: classes3.dex */
    public static final class C9338b extends Lambda implements Function1<Unit, Unit> {
        public C9338b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToEnterCode$default(XA6.this.f42751c, null, PartKind.SIM_CARD, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"LXA6$c;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "LPA6;", "b", "LPA6;", "errorResponse", "", "getMessage", "()Ljava/lang/String;", "message", "LHM4;", "response", "<init>", "(LXA6;LHM4;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: XA6$c */
    /* loaded from: classes3.dex */
    public final class C9339c extends RuntimeException {

        /* renamed from: b */
        public final PA6 f42757b;

        /* renamed from: c */
        public final /* synthetic */ XA6 f42758c;

        public C9339c(XA6 xa6, HM4<?> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f42758c = xa6;
            this.f42757b = xa6.m77253l(response);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            PA6 pa6 = this.f42757b;
            if (pa6 != null) {
                return pa6.m90604b();
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "LHM4;", "R", "response", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: XA6$d */
    /* loaded from: classes3.dex */
    public static final class C9340d extends Lambda implements Function1<R, T> {
        public C9340d() {
            super(1);
        }

        /* JADX WARN: Incorrect types in method signature: (TR;)TT; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(HM4 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Object m103944a = response.m103944a();
            if (m103944a != null) {
                return m103944a;
            }
            throw new C9339c(XA6.this, response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WhitelistResponse;", "kotlin.jvm.PlatformType", "whitelistResponse", "", C17296a.f69688o, "(Lco/bird/api/response/WhitelistResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: XA6$e */
    /* loaded from: classes3.dex */
    public static final class C9341e extends Lambda implements Function1<WhitelistResponse, Unit> {
        public C9341e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77246a(WhitelistResponse whitelistResponse) {
            if (Intrinsics.areEqual(whitelistResponse.getSuccess(), Boolean.TRUE)) {
                XA6.this.f42751c.mo37030e3();
                XA6.this.f42749a.topToast(C45871nl4.whitelist_successful_toast, EnumC40735f56.LONG);
                return;
            }
            XA6.this.f42749a.error(C45871nl4.whitelist_error_snack);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WhitelistResponse whitelistResponse) {
            m77246a(whitelistResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: XA6$f */
    /* loaded from: classes3.dex */
    public static final class C9342f extends Lambda implements Function1<Throwable, Unit> {
        public C9342f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            Unit unit;
            String message = th.getMessage();
            if (message != null) {
                XA6.this.f42749a.error(message);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                XA6.this.f42749a.error(C45871nl4.whitelist_error_snack);
            }
            C41318g46.m40159e(th);
        }
    }

    public XA6(ZA6 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, XY3 powerlineManager, C43038iy6 warehouseChecker, C51174wi2 deserializer) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(powerlineManager, "powerlineManager");
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f42749a = ui;
        this.f42750b = scopeProvider;
        this.f42751c = navigator;
        this.f42752d = powerlineManager;
        this.f42753e = warehouseChecker;
        this.f42754f = deserializer;
        warehouseChecker.m31479B(ui);
        AbstractC24490k<Unit> m32111s0 = ui.mo71795o1().m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "ui.scanButtonClicks()\n  …dSchedulers.mainThread())");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9337a c9337a = new C9337a();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: UA6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                XA6.m77255j(Function1.this, obj);
            }
        });
        AbstractC24490k<Unit> m32111s02 = ui.mo71796Ei().m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s02, "ui.enterImeiButtonClicks…dSchedulers.mainThread())");
        Object m32150f2 = m32111s02.m32150f(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m32150f2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9338b c9338b = new C9338b();
        ((FlowableSubscribeProxy) m32150f2).subscribe(new InterfaceC23484g() { // from class: VA6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                XA6.m77254k(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public static final void m77255j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m77254k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final Object m77251n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m77250o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m77249p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f42753e.mo28195d(interfaceC35804Rx6);
    }

    /* renamed from: l */
    public final <T> PA6 m77253l(HM4<T> hm4) {
        String string;
        ResponseBody m103940e = hm4.m103940e();
        if (m103940e == null || (string = m103940e.string()) == null) {
            return null;
        }
        try {
            return (PA6) this.f42754f.m6459c(string, Reflection.getOrCreateKotlinClass(PA6.class));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final <T, R extends HM4<T>> AbstractC23442F<T> m77252m(AbstractC23442F<R> abstractC23442F) {
        final C9340d c9340d = new C9340d();
        AbstractC23442F<T> abstractC23442F2 = (AbstractC23442F<T>) abstractC23442F.m33157I(new InterfaceC23492o() { // from class: WA6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m77251n;
                m77251n = XA6.m77251n(Function1.this, obj);
                return m77251n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC23442F2, "private fun <T, R : Resp…Exception(response) }\n  }");
        return abstractC23442F2;
    }

    @Override // p000.RA6
    public void onActivityResult(int i, int i2, Intent intent) {
        String key;
        String stringExtra;
        if (i != 10004) {
            if (i == 10009 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra(PaymentMethodOptionsParams.Blik.PARAM_CODE)) != null) {
                key = m77248q(stringExtra);
            }
            key = null;
        } else {
            if (i2 == -1 && intent != null) {
                Parcelable parcelableExtra = intent.getParcelableExtra("part");
                Intrinsics.checkNotNull(parcelableExtra);
                key = ((WirePart) parcelableExtra).getKey();
            }
            key = null;
        }
        if (key != null) {
            AbstractC23442F m33152N = m77252m(this.f42752d.mo74898a(key)).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "powerlineManager.whiteli…dSchedulers.mainThread())");
            Object m33135e = C28237sD.progress$default(m33152N, this.f42749a, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(this.f42750b));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C9341e c9341e = new C9341e();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: SA6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    XA6.m77250o(Function1.this, obj);
                }
            };
            final C9342f c9342f = new C9342f();
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: TA6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    XA6.m77249p(Function1.this, obj);
                }
            });
        }
    }

    @Override // p000.InterfaceC36038Sx6
    public void onResume() {
        this.f42753e.onResume();
    }

    /* renamed from: q */
    public final String m77248q(String str) {
        boolean contains$default;
        List split$default;
        List split$default2;
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) Detail.EMPTY_CHAR, false, 2, (Object) null);
        if (contains$default) {
            split$default2 = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{Detail.EMPTY_CHAR}, false, 0, 6, (Object) null);
            return (String) split$default2.get(1);
        }
        split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{";"}, false, 0, 6, (Object) null);
        return (String) split$default.get(0);
    }
}
