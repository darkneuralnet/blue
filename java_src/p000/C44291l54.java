package p000;

import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.WL5;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Ll54;", "", "", "b", "Landroid/view/MenuItem;", "item", "", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", C17296a.f69688o, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LWL5;", "LWL5;", "ui", "Le13;", "c", "Le13;", "navigator", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LWL5;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdSmartlockUnlockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdSmartlockUnlockPresenter.kt\nco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,38:1\n180#2:39\n*S KotlinDebug\n*F\n+ 1 PrivateBirdSmartlockUnlockPresenter.kt\nco/bird/android/app/feature/privatebirds/PrivateBirdSmartlockUnlockPresenter\n*L\n24#1:39\n*E\n"})
/* renamed from: l54  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44291l54 {

    /* renamed from: a */
    public final LifecycleScopeProvider<EnumC7097RE> f95464a;

    /* renamed from: b */
    public final WL5 f95465b;

    /* renamed from: c */
    public final InterfaceC40099e13 f95466c;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: l54$a */
    /* loaded from: classes2.dex */
    public static final class C25597a extends Lambda implements Function1<Unit, Unit> {
        public C25597a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C44291l54.this.f95466c.mo37030e3();
        }
    }

    public C44291l54(LifecycleScopeProvider<EnumC7097RE> scopeProvider, WL5 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f95464a = scopeProvider;
        this.f95465b = ui;
        this.f95466c = navigator;
    }

    /* renamed from: c */
    public static final void m27879c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public final void m27880b() {
        WL5.C8990a.configureAssets$default(this.f95465b, EnumC41838gx2.f84514t, null, 2, null);
        this.f95465b.mo77093X4(true);
        Object m33094as = this.f95465b.mo77091b0().m33094as(AutoDispose.m45239a(this.f95464a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25597a c25597a = new C25597a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: k54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44291l54.m27879c(Function1.this, obj);
            }
        });
    }

    /* renamed from: d */
    public final boolean m27878d(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C36585Vg4.infoButton) {
            this.f95466c.mo36922w3(360027921692L);
            return true;
        }
        return false;
    }
}
