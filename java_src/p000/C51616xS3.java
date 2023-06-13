package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LastLockComplianceModel;
import co.bird.android.model.analytics.LockComplianceModalViewed;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B5\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LxS3;", "LvS3;", "Lco/bird/android/model/LastLockComplianceModel;", RequestHeadersFactory.MODEL, "", C17296a.f69688o, "onBackPressed", "g", "", "formFactor", "e", "f", DateTokenConverter.CONVERTER_KEY, "LEa;", "LEa;", "analyticsManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "b", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LBS3;", "c", "LBS3;", "ui", "Le13;", "Le13;", "navigator", "<init>", "(LEa;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LBS3;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhysicalLockLastCompliancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockLastCompliancePresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockLastCompliancePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,97:1\n180#2:98\n*S KotlinDebug\n*F\n+ 1 PhysicalLockLastCompliancePresenter.kt\nco/bird/android/app/feature/physicallock/PhysicalLockLastCompliancePresenterImpl\n*L\n58#1:98\n*E\n"})
/* renamed from: xS3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51616xS3 implements InterfaceC50430vS3 {

    /* renamed from: e */
    public static final C30176a f117626e = new C30176a(null);

    /* renamed from: f */
    public static final int f117627f = 8;

    /* renamed from: a */
    public final InterfaceC1880Ea f117628a;

    /* renamed from: b */
    public final LifecycleScopeProvider<EnumC7097RE> f117629b;

    /* renamed from: c */
    public final BS3 f117630c;

    /* renamed from: d */
    public final InterfaceC40099e13 f117631d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LxS3$a;", "", "", "CABLE", "Ljava/lang/String;", "ULOCK", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: xS3$a */
    /* loaded from: classes2.dex */
    public static final class C30176a {
        public /* synthetic */ C30176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C30176a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xS3$b */
    /* loaded from: classes2.dex */
    public static final class C30177b extends Lambda implements Function1<Unit, Unit> {
        public C30177b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C51616xS3.this.f117631d.mo37030e3();
        }
    }

    public C51616xS3(InterfaceC1880Ea analyticsManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, BS3 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f117628a = analyticsManager;
        this.f117629b = scopeProvider;
        this.f117630c = ui;
        this.f117631d = navigator;
    }

    /* renamed from: c */
    public static final void m5246c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC50430vS3
    /* renamed from: a */
    public void mo5248a(LastLockComplianceModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.getShowCompliant() != model.getWarnNotCompliant()) {
            if (model.getShowCompliant()) {
                m5244e(model.getLockFormFactor());
                this.f117628a.mo55956N(new LockComplianceModalViewed(true));
            } else if (model.getWarnNotCompliant()) {
                m5242g();
                this.f117628a.mo55956N(new LockComplianceModalViewed(false));
            }
            Object m33094as = this.f117630c.mo112226t5().m33094as(AutoDispose.m45239a(this.f117629b));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30177b c30177b = new C30177b();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: wS3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C51616xS3.m5246c(Function1.this, obj);
                }
            });
            return;
        }
        throw new IllegalArgumentException("model is invalid, either we should show compliant or warn but not both or none");
    }

    /* renamed from: d */
    public final void m5245d() {
        this.f117630c.mo112229Ca(C48193rg4.ic_lock_compliant_cable);
        this.f117630c.setTitle(C45871nl4.physical_lock_compliant_cable_title);
        this.f117630c.mo112228El(C45871nl4.physical_lock_compliant_cable_subtitle);
        this.f117630c.mo112227kd(C45871nl4.physical_lock_compliant_cable_button);
    }

    /* renamed from: e */
    public final void m5244e(String str) {
        if (Intrinsics.areEqual(str, "ulock")) {
            m5243f();
        } else if (Intrinsics.areEqual(str, "cable")) {
            m5245d();
        } else {
            m5245d();
        }
    }

    /* renamed from: f */
    public final void m5243f() {
        this.f117630c.mo112229Ca(C48193rg4.ic_lock_compliant_ulock);
        this.f117630c.setTitle(C45871nl4.physical_lock_compliant_ulock_title);
        this.f117630c.mo112228El(C45871nl4.physical_lock_compliant_ulock_subtitle);
        this.f117630c.mo112227kd(C45871nl4.physical_lock_compliant_ulock_button);
    }

    /* renamed from: g */
    public final void m5242g() {
        this.f117630c.mo112229Ca(C48193rg4.ic_lock_not_compliant);
        this.f117630c.setTitle(C45871nl4.physical_lock_not_compliant_title);
        this.f117630c.mo112228El(C45871nl4.physical_lock_not_compliant_subtitle);
        this.f117630c.mo112227kd(C45871nl4.physical_lock_not_compliant_button);
    }

    @Override // p000.InterfaceC50430vS3
    public void onBackPressed() {
        this.f117631d.mo37030e3();
    }
}
