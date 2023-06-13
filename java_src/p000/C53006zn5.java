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
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lzn5;", "Lxn5;", "LAn5;", C17296a.f69688o, "LAn5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "c", "Le13;", "navigator", "<init>", "(LAn5;Lcom/uber/autodispose/ScopeProvider;Le13;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapInspectionCompletePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapInspectionCompletePresenter.kt\nco/bird/android/feature/scrap/dialog/inspectioncomplete/ScrapInspectionCompletePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,25:1\n180#2:26\n*S KotlinDebug\n*F\n+ 1 ScrapInspectionCompletePresenter.kt\nco/bird/android/feature/scrap/dialog/inspectioncomplete/ScrapInspectionCompletePresenterImpl\n*L\n18#1:26\n*E\n"})
/* renamed from: zn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C53006zn5 implements InterfaceC51820xn5 {

    /* renamed from: a */
    public final InterfaceC31735An5 f122230a;

    /* renamed from: b */
    public final ScopeProvider f122231b;

    /* renamed from: c */
    public final InterfaceC40099e13 f122232c;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zn5$a */
    /* loaded from: classes3.dex */
    public static final class C31498a extends Lambda implements Function1<Unit, Unit> {
        public C31498a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C53006zn5.this.f122230a.dismiss();
            C53006zn5.this.f122232c.close();
        }
    }

    public C53006zn5(InterfaceC31735An5 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f122230a = ui;
        this.f122231b = scopeProvider;
        this.f122232c = navigator;
        Object m33094as = ui.doneClicks().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31498a c31498a = new C31498a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: yn5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53006zn5.m437b(Function1.this, obj);
            }
        });
    }

    /* renamed from: b */
    public static final void m437b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }
}
