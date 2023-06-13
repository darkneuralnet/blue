package p000;

import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.AbstractC24569h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LrE6;", "LoE6;", "Lco/bird/android/model/Issue;", "issue", "", C17296a.f69688o, "LsE6;", "LsE6;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/subjects/h;", "Lco/bird/android/model/DialogResponse;", "c", "Lio/reactivex/subjects/h;", "responseSubject", "<init>", "(LsE6;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/h;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderInspectionDisputePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionDisputePresenter.kt\nco/bird/android/feature/workorders/inspection/dialog/dispute/WorkOrderInspectionDisputePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,31:1\n180#2:32\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionDisputePresenter.kt\nco/bird/android/feature/workorders/inspection/dialog/dispute/WorkOrderInspectionDisputePresenterImpl\n*L\n23#1:32\n*E\n"})
/* renamed from: rE6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47937rE6 implements InterfaceC46158oE6 {

    /* renamed from: a */
    public final InterfaceC48529sE6 f106752a;

    /* renamed from: b */
    public final ScopeProvider f106753b;

    /* renamed from: c */
    public final AbstractC24569h<DialogResponse> f106754c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rE6$a */
    /* loaded from: classes3.dex */
    public static final class C27887a extends Lambda implements Function1<DialogResponse, Unit> {
        public C27887a() {
            super(1);
        }

        /* renamed from: a */
        public final void m16163a(DialogResponse dialogResponse) {
            C47937rE6.this.f106752a.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m16163a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rE6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C27888b extends FunctionReferenceImpl implements Function1<DialogResponse, Unit> {
        public C27888b(Object obj) {
            super(1, obj, AbstractC24569h.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m16162a(DialogResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AbstractC24569h) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m16162a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public C47937rE6(InterfaceC48529sE6 ui, ScopeProvider scopeProvider, AbstractC24569h<DialogResponse> responseSubject) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(responseSubject, "responseSubject");
        this.f106752a = ui;
        this.f106753b = scopeProvider;
        this.f106754c = responseSubject;
        Observable<DialogResponse> mo8981B1 = ui.mo8981B1();
        final C27887a c27887a = new C27887a();
        Observable<DialogResponse> doOnNext = mo8981B1.doOnNext(new InterfaceC23484g() { // from class: pE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47937rE6.m16165d(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "ui.buttonClicks()\n      .doOnNext { ui.dismiss() }");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C27888b c27888b = new C27888b(responseSubject);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qE6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47937rE6.m16164e(Function1.this, obj);
            }
        });
    }

    /* renamed from: d */
    public static final void m16165d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public static final void m16164e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC46158oE6
    /* renamed from: a */
    public void mo16168a(Issue issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        this.f106752a.mo8980a(issue);
    }
}
