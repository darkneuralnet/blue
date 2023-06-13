package p000;

import co.bird.android.model.VehicleCommand;
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
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lrn0;", "", "Lco/bird/android/model/VehicleCommand;", "command", "", "c", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lsn0;", "b", "Lsn0;", "ui", "<init>", "(Lcom/uber/autodispose/ScopeProvider;Lsn0;)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterErrorPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterErrorPresenter.kt\nco/bird/android/command/errordialog/CommandCenterErrorPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,29:1\n180#2:30\n*S KotlinDebug\n*F\n+ 1 CommandCenterErrorPresenter.kt\nco/bird/android/command/errordialog/CommandCenterErrorPresenter\n*L\n17#1:30\n*E\n"})
/* renamed from: rn0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48259rn0 {

    /* renamed from: a */
    public final ScopeProvider f107613a;

    /* renamed from: b */
    public final C48851sn0 f107614b;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rn0$a */
    /* loaded from: classes2.dex */
    public static final class C27998a extends Lambda implements Function1<Unit, Unit> {
        public C27998a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C48259rn0.this.f107614b.dismiss();
        }
    }

    public C48259rn0(ScopeProvider scopeProvider, C48851sn0 ui) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f107613a = scopeProvider;
        this.f107614b = ui;
        Observable<Unit> observeOn = ui.m13678J4().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.okayClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27998a c27998a = new C27998a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qn0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48259rn0.m15393b(Function1.this, obj);
            }
        });
    }

    /* renamed from: b */
    public static final void m15393b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c */
    public final void m15392c(VehicleCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f107614b.m13677Pl(command);
    }
}
