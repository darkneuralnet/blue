package p000;

import android.content.Intent;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"Lku5;", "Lgu5;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Liy6;", "Liy6;", "warehouseChecker", "Lmu5;", "b", "Lmu5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "Le13;", "navigator", "LDQ3;", "e", "LDQ3;", "permissionManager", "<init>", "(Liy6;Lmu5;Lcom/uber/autodispose/ScopeProvider;Le13;LDQ3;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServiceProgressLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceProgressLandingPresenter.kt\nco/bird/android/feature/servicecenter/status/single/landing/ServiceProgressLandingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,60:1\n161#2:61\n180#2:62\n*S KotlinDebug\n*F\n+ 1 ServiceProgressLandingPresenter.kt\nco/bird/android/feature/servicecenter/status/single/landing/ServiceProgressLandingPresenterImpl\n*L\n39#1:61\n46#1:62\n*E\n"})
/* renamed from: ku5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44183ku5 implements InterfaceC41811gu5, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final C43038iy6 f95177a;

    /* renamed from: b */
    public final InterfaceC45369mu5 f95178b;

    /* renamed from: c */
    public final ScopeProvider f95179c;

    /* renamed from: d */
    public final InterfaceC40099e13 f95180d;

    /* renamed from: e */
    public final DQ3 f95181e;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ku5$a */
    /* loaded from: classes3.dex */
    public static final class C25545a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C25545a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44183ku5.this.f95181e.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ku5$b */
    /* loaded from: classes3.dex */
    public static final class C25546b extends Lambda implements Function1<FQ3, Unit> {
        public C25546b() {
            super(1);
        }

        /* renamed from: a */
        public final void m28188a(FQ3 fq3) {
            InterfaceC40099e13.C19924a.goToScanCode$default(C44183ku5.this.f95180d, null, null, null, null, false, false, false, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m28188a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ku5$c */
    /* loaded from: classes3.dex */
    public static final class C25547c extends Lambda implements Function1<Unit, Unit> {
        public C25547c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToEnterCode$default(C44183ku5.this.f95180d, null, null, 3, null);
        }
    }

    public C44183ku5(C43038iy6 warehouseChecker, InterfaceC45369mu5 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, DQ3 permissionManager) {
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        this.f95177a = warehouseChecker;
        this.f95178b = ui;
        this.f95179c = scopeProvider;
        this.f95180d = navigator;
        this.f95181e = permissionManager;
        warehouseChecker.m31479B(ui);
    }

    /* renamed from: h */
    public static final InterfaceC23447K m28191h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m28190i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m28189j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC41811gu5
    /* renamed from: a */
    public void mo28196a() {
        AbstractC24490k<Unit> flowable = this.f95178b.mo22197w().toFlowable(EnumC23460b.DROP);
        final C25545a c25545a = new C25545a();
        AbstractC24490k<R> m32148f1 = flowable.m32148f1(new InterfaceC23492o() { // from class: hu5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m28191h;
                m28191h = C44183ku5.m28191h(Function1.this, obj);
                return m28191h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32148f1, "override fun onCreate() …tor.goToEnterCode() }\n  }");
        Object m32150f = m32148f1.m32150f(AutoDispose.m45239a(this.f95179c));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25546b c25546b = new C25546b();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: iu5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44183ku5.m28190i(Function1.this, obj);
            }
        });
        Object m33094as = this.f95178b.mo22201n().m33094as(AutoDispose.m45239a(this.f95179c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25547c c25547c = new C25547c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: ju5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44183ku5.m28189j(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f95177a.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.InterfaceC41811gu5
    public void onActivityResult(int i, int i2, Intent intent) {
        if ((i == 10001 || i == 10003) && i2 == -1 && intent != null) {
            InterfaceC40099e13 interfaceC40099e13 = this.f95180d;
            Parcelable parcelableExtra = intent.getParcelableExtra("bird");
            Intrinsics.checkNotNull(parcelableExtra);
            interfaceC40099e13.mo37069X3((WireBird) parcelableExtra);
            this.f95178b.vibrate(1000L);
        }
    }
}
