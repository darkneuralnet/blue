package p000;

import android.content.Intent;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.PotentialIssuesScreenType;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000e\u001a\u00020\f\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LNY3;", "LLY3;", "Landroid/content/Intent;", "intent", "", "b", "c", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", C17296a.f69688o, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "Le13;", "Le13;", "navigator", "LRY3;", "LRY3;", "ui", "Lco/bird/android/model/wire/WireBird;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireBird;", "bird", "<init>", "(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Le13;LRY3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPotentialIssuesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PotentialIssuesPresenter.kt\nco/bird/android/app/feature/testride/PotentialIssuesPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,63:1\n180#2:64\n*S KotlinDebug\n*F\n+ 1 PotentialIssuesPresenter.kt\nco/bird/android/app/feature/testride/PotentialIssuesPresenterImpl\n*L\n57#1:64\n*E\n"})
/* renamed from: NY3 */
/* loaded from: classes2.dex */
public final class NY3 implements LY3 {

    /* renamed from: a */
    public final LifecycleScopeProvider<EnumC7097RE> f24760a;

    /* renamed from: b */
    public final InterfaceC40099e13 f24761b;

    /* renamed from: c */
    public final RY3 f24762c;

    /* renamed from: d */
    public WireBird f24763d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NY3$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5604a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PotentialIssuesScreenType.values().length];
            try {
                iArr[PotentialIssuesScreenType.POTENTIAL_ISSUES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PotentialIssuesScreenType.CONNECTION_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: NY3$b */
    /* loaded from: classes2.dex */
    public static final class C5605b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C5605b f24764g = new C5605b();

        public C5605b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }
    }

    public NY3(LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40099e13 navigator, RY3 ui) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f24760a = scopeProvider;
        this.f24761b = navigator;
        this.f24762c = ui;
    }

    /* renamed from: d */
    public static final void m93783d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.LY3
    /* renamed from: b */
    public void mo93785b(Intent intent) {
        int i;
        Intrinsics.checkNotNullParameter(intent, "intent");
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("bird_problems");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        Parcelable parcelableExtra = intent.getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f24763d = (WireBird) parcelableExtra;
        PotentialIssuesScreenType potentialIssuesScreenType = (PotentialIssuesScreenType) intent.getParcelableExtra("potential_issues_screen_type");
        if (potentialIssuesScreenType == null) {
            i = -1;
        } else {
            i = C5604a.$EnumSwitchMapping$0[potentialIssuesScreenType.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                this.f24762c.mo85295h6();
            } else {
                this.f24762c.mo85296Wa();
            }
        } else {
            this.f24762c.mo85295h6();
        }
        this.f24762c.mo85297Mf(parcelableArrayListExtra);
        m93784c();
    }

    /* renamed from: c */
    public final void m93784c() {
        Observable<Unit> observeOn = this.f24762c.mo85294xj().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.startCantFixClicks()\n…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f24760a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5605b c5605b = C5605b.f24764g;
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: MY3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                NY3.m93783d(Function1.this, obj);
            }
        });
    }
}
