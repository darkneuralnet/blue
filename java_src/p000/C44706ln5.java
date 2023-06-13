package p000;

import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lln5;", "Ljn5;", "Lmn5;", C17296a.f69688o, "Lmn5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lmn5;Lcom/uber/autodispose/ScopeProvider;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapCompletePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapCompletePresenter.kt\nco/bird/android/feature/commandcenter/vehicledetails/dialogs/ScrapCompletePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,20:1\n180#2:21\n*S KotlinDebug\n*F\n+ 1 ScrapCompletePresenter.kt\nco/bird/android/feature/commandcenter/vehicledetails/dialogs/ScrapCompletePresenterImpl\n*L\n16#1:21\n*E\n"})
/* renamed from: ln5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44706ln5 implements InterfaceC43520jn5 {

    /* renamed from: a */
    public final InterfaceC45299mn5 f96706a;

    /* renamed from: b */
    public final ScopeProvider f96707b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ln5$a */
    /* loaded from: classes3.dex */
    public static final class C25776a extends Lambda implements Function1<Unit, Unit> {
        public C25776a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C44706ln5.this.f96706a.dismiss();
        }
    }

    public C44706ln5(InterfaceC45299mn5 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f96706a = ui;
        this.f96707b = scopeProvider;
        Object m33094as = ui.doneClicks().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25776a c25776a = new C25776a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kn5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44706ln5.m26813b(Function1.this, obj);
            }
        });
    }

    /* renamed from: b */
    public static final void m26813b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
