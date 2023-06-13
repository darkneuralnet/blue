package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.AbstractC24569h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LIn5;", "LFn5;", "Lco/bird/android/model/wire/WireBird;", "bird", "", C17296a.f69688o, "LJn5;", "LJn5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/subjects/h;", "Lco/bird/android/model/DialogResponse;", "c", "Lio/reactivex/subjects/h;", "responseSubject", "<init>", "(LJn5;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/h;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapInspectionConfirmationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapInspectionConfirmationPresenter.kt\nco/bird/android/feature/scrap/landing/dialog/inspectionconfirmation/ScrapInspectionConfirmationPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,37:1\n180#2:38\n*S KotlinDebug\n*F\n+ 1 ScrapInspectionConfirmationPresenter.kt\nco/bird/android/feature/scrap/landing/dialog/inspectionconfirmation/ScrapInspectionConfirmationPresenterImpl\n*L\n29#1:38\n*E\n"})
/* renamed from: In5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33607In5 implements InterfaceC32905Fn5 {

    /* renamed from: a */
    public final InterfaceC33841Jn5 f16201a;

    /* renamed from: b */
    public final ScopeProvider f16202b;

    /* renamed from: c */
    public final AbstractC24569h<DialogResponse> f16203c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: In5$a */
    /* loaded from: classes3.dex */
    public static final class C3754a extends Lambda implements Function1<DialogResponse, Unit> {
        public C3754a() {
            super(1);
        }

        /* renamed from: a */
        public final void m101712a(DialogResponse dialogResponse) {
            C33607In5.this.f16201a.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m101712a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: In5$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3755b extends FunctionReferenceImpl implements Function1<DialogResponse, Unit> {
        public C3755b(Object obj) {
            super(1, obj, AbstractC24569h.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m101711a(DialogResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC24569h) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m101711a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public C33607In5(InterfaceC33841Jn5 ui, ScopeProvider scopeProvider, AbstractC24569h<DialogResponse> responseSubject) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(responseSubject, "responseSubject");
        this.f16201a = ui;
        this.f16202b = scopeProvider;
        this.f16203c = responseSubject;
        Observable observeOn = Observable.merge(ui.mo94833f(), ui.mo94834d()).observeOn(C23454a.m33087a());
        final C3754a c3754a = new C3754a();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: Gn5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33607In5.m101714d(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "merge(\n      ui.confirmC…doOnNext { ui.dismiss() }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3755b c3755b = new C3755b(responseSubject);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Hn5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33607In5.m101713e(Function1.this, obj);
            }
        });
    }

    /* renamed from: d */
    public static final void m101714d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m101713e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC32905Fn5
    /* renamed from: a */
    public void mo101717a(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f16201a.mo94837R5(bird);
    }
}
