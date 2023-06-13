package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.Permission;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"La50;", "Lgu5;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Liy6;", "Liy6;", "warehouseChecker", "Lmu5;", "b", "Lmu5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LDQ3;", "LDQ3;", "permissionManager", "Le13;", "e", "Le13;", "navigator", "<init>", "(Liy6;Lmu5;Lcom/uber/autodispose/ScopeProvider;LDQ3;Le13;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkServiceProgressLandingPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkServiceProgressLandingPresenterImpl.kt\nco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,47:1\n161#2:48\n*S KotlinDebug\n*F\n+ 1 BulkServiceProgressLandingPresenterImpl.kt\nco/bird/android/feature/servicecenter/status/bulk/landing/BulkServiceProgressLandingPresenterImpl\n*L\n35#1:48\n*E\n"})
/* renamed from: a50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37747a50 implements InterfaceC41811gu5, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final C43038iy6 f49805a;

    /* renamed from: b */
    public final InterfaceC45369mu5 f49806b;

    /* renamed from: c */
    public final ScopeProvider f49807c;

    /* renamed from: d */
    public final DQ3 f49808d;

    /* renamed from: e */
    public final InterfaceC40099e13 f49809e;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a50$a */
    /* loaded from: classes3.dex */
    public static final class C10567a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C10567a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37747a50.this.f49808d.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: a50$b */
    /* loaded from: classes3.dex */
    public static final class C10568b extends Lambda implements Function1<FQ3, Unit> {
        public C10568b() {
            super(1);
        }

        /* renamed from: a */
        public final void m71917a(FQ3 fq3) {
            C37747a50.this.f49809e.mo37096S1();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m71917a(fq3);
            return Unit.INSTANCE;
        }
    }

    public C37747a50(C43038iy6 warehouseChecker, InterfaceC45369mu5 ui, ScopeProvider scopeProvider, DQ3 permissionManager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f49805a = warehouseChecker;
        this.f49806b = ui;
        this.f49807c = scopeProvider;
        this.f49808d = permissionManager;
        this.f49809e = navigator;
        warehouseChecker.m31479B(ui);
    }

    /* renamed from: g */
    public static final InterfaceC23447K m71919g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m71918h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC41811gu5
    /* renamed from: a */
    public void mo28196a() {
        AbstractC24490k<Unit> flowable = this.f49806b.mo22197w().toFlowable(EnumC23460b.DROP);
        final C10567a c10567a = new C10567a();
        AbstractC24490k<R> m32148f1 = flowable.m32148f1(new InterfaceC23492o() { // from class: Y40
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m71919g;
                m71919g = C37747a50.m71919g(Function1.this, obj);
                return m71919g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32148f1, "override fun onCreate() …hideEnterCodeButton()\n  }");
        Object m32150f = m32148f1.m32150f(AutoDispose.m45239a(this.f49807c));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10568b c10568b = new C10568b();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: Z40
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37747a50.m71918h(Function1.this, obj);
            }
        });
        this.f49806b.mo22208E5();
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f49805a.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.InterfaceC41811gu5
    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
