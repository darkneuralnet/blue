package p000;

import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LfQ1;", "LdQ1;", "", "idToolDisplay", "", C17296a.f69688o, "LgQ1;", "LgQ1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(LgQ1;Lcom/uber/autodispose/ScopeProvider;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolPromptPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolPromptPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/idtools/IdToolPromptPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,28:1\n180#2:29\n*S KotlinDebug\n*F\n+ 1 IdToolPromptPresenter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/idtools/IdToolPromptPresenterImpl\n*L\n20#1:29\n*E\n"})
/* renamed from: fQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40924fQ1 implements InterfaceC39739dQ1 {

    /* renamed from: a */
    public final InterfaceC41517gQ1 f80080a;

    /* renamed from: b */
    public final ScopeProvider f80081b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: fQ1$a */
    /* loaded from: classes3.dex */
    public static final class C20399a extends Lambda implements Function1<Unit, Unit> {
        public C20399a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C40924fQ1.this.f80080a.dismiss();
        }
    }

    public C40924fQ1(InterfaceC41517gQ1 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f80080a = ui;
        this.f80081b = scopeProvider;
        Observable<Unit> observeOn = ui.mo36436h().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.scanClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20399a c20399a = new C20399a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: eQ1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40924fQ1.m41412c(Function1.this, obj);
            }
        });
    }

    /* renamed from: c */
    public static final void m41412c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC39739dQ1
    /* renamed from: a */
    public void mo41414a(String idToolDisplay) {
        Intrinsics.checkNotNullParameter(idToolDisplay, "idToolDisplay");
        this.f80080a.mo36437Ja(idToolDisplay);
    }
}
