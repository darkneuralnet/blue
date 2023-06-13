package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.VehicleClass;
import co.bird.android.model.ridertutorial.TutorialKind;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LGW2;", "", "", "b", "Le13;", C17296a.f69688o, "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LKW2;", "c", "LKW2;", "ui", "", "LGk6;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getVehicles", "()Ljava/util/List;", "vehicles", "<init>", "(Le13;Lcom/uber/autodispose/ScopeProvider;LKW2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMultiModalRiderTutorialSelectionPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiModalRiderTutorialSelectionPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/MultiModalRiderTutorialSelectionPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,49:1\n180#2:50\n*S KotlinDebug\n*F\n+ 1 MultiModalRiderTutorialSelectionPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/MultiModalRiderTutorialSelectionPresenterImpl\n*L\n42#1:50\n*E\n"})
/* renamed from: GW2 */
/* loaded from: classes2.dex */
public final class GW2 {

    /* renamed from: a */
    public final InterfaceC40099e13 f12008a;

    /* renamed from: b */
    public final ScopeProvider f12009b;

    /* renamed from: c */
    public final KW2 f12010c;

    /* renamed from: d */
    public final List<C33113Gk6> f12011d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/ridertutorial/TutorialKind;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/ridertutorial/TutorialKind;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GW2$a */
    /* loaded from: classes2.dex */
    public static final class C2866a extends Lambda implements Function1<TutorialKind, Unit> {
        public C2866a() {
            super(1);
        }

        /* renamed from: a */
        public final void m105043a(TutorialKind tutorialKind) {
            GW2.this.f12008a.mo36941t2(tutorialKind.name());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TutorialKind tutorialKind) {
            m105043a(tutorialKind);
            return Unit.INSTANCE;
        }
    }

    public GW2(InterfaceC40099e13 navigator, ScopeProvider scopeProvider, KW2 ui) {
        List<C33113Gk6> listOf;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f12008a = navigator;
        this.f12009b = scopeProvider;
        this.f12010c = ui;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C33113Gk6[]{new C33113Gk6("url", "Moped", VehicleClass.MOPED), new C33113Gk6("url", "Scooter", VehicleClass.SCOOTER)});
        this.f12011d = listOf;
    }

    /* renamed from: c */
    public static final void m105044c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b */
    public void m105045b() {
        this.f12010c.mo92117m1(this.f12011d);
        Object m33094as = this.f12010c.mo92122N4().m33094as(AutoDispose.m45239a(this.f12009b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2866a c2866a = new C2866a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: FW2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GW2.m105044c(Function1.this, obj);
            }
        });
    }
}
