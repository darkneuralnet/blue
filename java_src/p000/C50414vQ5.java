package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.AbstractC24569h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C45672nQ5;
import p000.H31;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m28432d2 = {"LvQ5;", "LoQ5;", "", "LH6;", "sections", "", "b1", "g1", "onBackPressed", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "b", "Le13;", "navigator", "LxQ5;", "c", "LxQ5;", "ui", "Lio/reactivex/subjects/h;", "LnQ5$b;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/h;", "responseSubject", "<init>", "(Lcom/uber/autodispose/ScopeProvider;Le13;LxQ5;Lio/reactivex/subjects/h;)V", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStatusDialogPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusDialogPresenter.kt\nco/bird/android/statusdialog/StatusDialogPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,86:1\n180#2:87\n180#2:88\n180#2:89\n180#2:90\n199#2:91\n*S KotlinDebug\n*F\n+ 1 StatusDialogPresenter.kt\nco/bird/android/statusdialog/StatusDialogPresenterImpl\n*L\n31#1:87\n39#1:88\n47#1:89\n53#1:90\n77#1:91\n*E\n"})
/* renamed from: vQ5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50414vQ5 implements InterfaceC46265oQ5 {

    /* renamed from: a */
    public final ScopeProvider f114040a;

    /* renamed from: b */
    public final InterfaceC40099e13 f114041b;

    /* renamed from: c */
    public final InterfaceC51600xQ5 f114042c;

    /* renamed from: d */
    public final AbstractC24569h<C45672nQ5.EnumC26504b> f114043d;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vQ5$a */
    /* loaded from: classes4.dex */
    public static final class C29530a extends Lambda implements Function1<Unit, Unit> {
        public C29530a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C50414vQ5.this.f114042c.dismiss();
            C50414vQ5.this.f114043d.onNext(C45672nQ5.EnumC26504b.OKAY);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vQ5$b */
    /* loaded from: classes4.dex */
    public static final class C29531b extends Lambda implements Function1<Unit, Unit> {
        public C29531b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C50414vQ5.this.f114042c.dismiss();
            C50414vQ5.this.f114043d.onNext(C45672nQ5.EnumC26504b.NEXT_ONE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vQ5$c */
    /* loaded from: classes4.dex */
    public static final class C29532c extends Lambda implements Function1<Unit, Unit> {
        public C29532c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C50414vQ5.this.f114043d.onNext(C45672nQ5.EnumC26504b.TRY_AGAIN);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vQ5$d */
    /* loaded from: classes4.dex */
    public static final class C29533d extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {
        public C29533d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return H31.C3014a.dialog$default(C50414vQ5.this.f114042c, C35719Ro2.f32625d, false, false, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vQ5$e */
    /* loaded from: classes4.dex */
    public static final class C29534e extends Lambda implements Function1<DialogResponse, Unit> {
        public C29534e() {
            super(1);
        }

        /* renamed from: a */
        public final void m8688a(DialogResponse dialogResponse) {
            if (dialogResponse == DialogResponse.OK) {
                C50414vQ5.this.f114042c.dismiss();
                C50414vQ5.this.f114041b.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m8688a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: vQ5$f */
    /* loaded from: classes4.dex */
    public static final class C29535f extends Lambda implements Function1<DialogResponse, Unit> {
        public C29535f() {
            super(1);
        }

        /* renamed from: a */
        public final void m8687a(DialogResponse dialogResponse) {
            if (dialogResponse == DialogResponse.OK) {
                C50414vQ5.this.f114042c.dismiss();
                C50414vQ5.this.f114041b.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m8687a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public C50414vQ5(ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC51600xQ5 ui, AbstractC24569h<C45672nQ5.EnumC26504b> responseSubject) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(responseSubject, "responseSubject");
        this.f114040a = scopeProvider;
        this.f114041b = navigator;
        this.f114042c = ui;
        this.f114043d = responseSubject;
        Observable<Unit> observeOn = ui.mo5278J4().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.okayClicks()\n      .o…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29530a c29530a = new C29530a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qQ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50414vQ5.m8695g(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn2 = ui.mo5274q9().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.nextOneClicks()\n     …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29531b c29531b = new C29531b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: rQ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50414vQ5.m8693h(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn3 = ui.mo5275p5().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.tryAgainClicks()\n    …dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29532c c29532c = new C29532c();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: sQ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50414vQ5.m8692i(Function1.this, obj);
            }
        });
        Observable<Unit> mo5276d = ui.mo5276d();
        final C29533d c29533d = new C29533d();
        Observable observeOn4 = mo5276d.flatMapSingle(new InterfaceC23492o() { // from class: tQ5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m8691j;
                m8691j = C50414vQ5.m8691j(Function1.this, obj);
                return m8691j;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.cancelClicks()\n      …dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29534e c29534e = new C29534e();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: uQ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50414vQ5.m8690k(Function1.this, obj);
            }
        });
    }

    /* renamed from: g */
    public static final void m8695g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m8693h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m8692i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final InterfaceC23447K m8691j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m8690k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m8689l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC46265oQ5
    /* renamed from: b1 */
    public void mo8700b1(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f114042c.mo5277b(sections);
        this.f114042c.mo5279H4(true);
        this.f114042c.vibrate(250L);
    }

    @Override // p000.InterfaceC46265oQ5
    /* renamed from: g1 */
    public void mo8694g1(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f114042c.mo5277b(sections);
        this.f114042c.mo5279H4(false);
        this.f114042c.vibrate(1000L);
    }

    @Override // p000.InterfaceC46265oQ5
    public void onBackPressed() {
        AbstractC23442F m33152N = H31.C3014a.dialog$default(this.f114042c, C35719Ro2.f32625d, false, false, 4, null).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "ui.dialog(LeavePageConfi…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f114040a));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29535f c29535f = new C29535f();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: pQ5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C50414vQ5.m8689l(Function1.this, obj);
            }
        });
    }
}
