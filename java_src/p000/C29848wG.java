package p000;

import co.bird.android.app.feature.ridertutorial.widget.BeginnerModeTopView;
import co.bird.api.response.BeginnerModeOnboardingResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C36298Ua5;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0001\u0010\f\u001a\u00020\t\u0012\b\b\u0001\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LwG;", "LUa5$b;", "", C17296a.f69688o, "Lio/reactivex/Observable;", "closeImmediately", "Lfa5;", "Lfa5;", "riderProfileManager", "Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;", "b", "Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;", "beginnerModeTopView", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lfa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;Lcom/uber/autodispose/ScopeProvider;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBeginnerModeTopViewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginnerModeTopViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeTopViewPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,42:1\n180#2:43\n*S KotlinDebug\n*F\n+ 1 BeginnerModeTopViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeTopViewPresenterImpl\n*L\n30#1:43\n*E\n"})
/* renamed from: wG */
/* loaded from: classes2.dex */
public final class C29848wG implements C36298Ua5.InterfaceC8314b {

    /* renamed from: a */
    public final InterfaceC41018fa5 f115743a;

    /* renamed from: b */
    public final BeginnerModeTopView f115744b;

    /* renamed from: c */
    public final ScopeProvider f115745c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/BeginnerModeOnboardingResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/BeginnerModeOnboardingResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wG$a */
    /* loaded from: classes2.dex */
    public static final class C29849a extends Lambda implements Function1<BeginnerModeOnboardingResponse, Unit> {
        public C29849a() {
            super(1);
        }

        /* renamed from: a */
        public final void m7054a(BeginnerModeOnboardingResponse beginnerModeOnboardingResponse) {
            BeginnerModeTopView beginnerModeTopView = C29848wG.this.f115744b;
            beginnerModeTopView.setIcon(beginnerModeOnboardingResponse.getAsset().getMedia().getMediaUrl());
            beginnerModeTopView.setSubtitle(beginnerModeOnboardingResponse.getContentSubtitle());
            beginnerModeTopView.setTitle(beginnerModeOnboardingResponse.getContentTitle());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BeginnerModeOnboardingResponse beginnerModeOnboardingResponse) {
            m7054a(beginnerModeOnboardingResponse);
            return Unit.INSTANCE;
        }
    }

    public C29848wG(InterfaceC41018fa5 riderProfileManager, BeginnerModeTopView beginnerModeTopView, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(riderProfileManager, "riderProfileManager");
        Intrinsics.checkNotNullParameter(beginnerModeTopView, "beginnerModeTopView");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f115743a = riderProfileManager;
        this.f115744b = beginnerModeTopView;
        this.f115745c = scopeProvider;
    }

    /* renamed from: c */
    public static final void m7055c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.C36298Ua5.InterfaceC8314b
    /* renamed from: a */
    public void mo7057a() {
        Object m33094as = C37279Yf5.m74576S(this.f115743a.mo30290a()).m33094as(AutoDispose.m45239a(this.f115745c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29849a c29849a = new C29849a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: vG
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C29848wG.m7055c(Function1.this, obj);
            }
        });
    }

    @Override // p000.C36298Ua5.InterfaceC8314b
    public Observable<Unit> closeImmediately() {
        Observable<Unit> empty = Observable.empty();
        Intrinsics.checkNotNullExpressionValue(empty, "empty<Unit>()");
        return empty;
    }
}
