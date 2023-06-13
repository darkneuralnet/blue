package p000;

import co.bird.android.model.DialogResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24567g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LEZ;", "", "LNy;", "alert", "", "j", "e", "Lio/reactivex/subjects/g;", "Lco/bird/android/model/DialogResponse;", C17296a.f69688o, "Lio/reactivex/subjects/g;", "responseSubject", "LFZ;", "b", "LFZ;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lio/reactivex/subjects/g;LFZ;Lcom/uber/autodispose/ScopeProvider;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomSheetAlertPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetAlertPresenter.kt\nco/bird/android/core/base/bottomsheetalert/BottomSheetAlertPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,31:1\n180#2:32\n*S KotlinDebug\n*F\n+ 1 BottomSheetAlertPresenter.kt\nco/bird/android/core/base/bottomsheetalert/BottomSheetAlertPresenter\n*L\n27#1:32\n*E\n"})
/* renamed from: EZ */
/* loaded from: classes2.dex */
public final class C1865EZ {

    /* renamed from: a */
    public final C24567g<DialogResponse> f7671a;

    /* renamed from: b */
    public final C2356FZ f7672b;

    /* renamed from: c */
    public final ScopeProvider f7673c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: EZ$a */
    /* loaded from: classes2.dex */
    public static final class C1866a extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C1866a f7674g = new C1866a();

        public C1866a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.OK;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: EZ$b */
    /* loaded from: classes2.dex */
    public static final class C1867b extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C1867b f7675g = new C1867b();

        public C1867b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.CANCEL;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: EZ$c */
    /* loaded from: classes2.dex */
    public static final class C1868c extends Lambda implements Function1<DialogResponse, Unit> {
        public C1868c() {
            super(1);
        }

        /* renamed from: a */
        public final void m108822a(DialogResponse dialogResponse) {
            C1865EZ.this.f7672b.m106951c();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m108822a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: EZ$d */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1869d extends FunctionReferenceImpl implements Function1<DialogResponse, Unit> {
        public C1869d(Object obj) {
            super(1, obj, C24567g.class, "onSuccess", "onSuccess(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m108821a(DialogResponse p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24567g) this.receiver).onSuccess(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m108821a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public C1865EZ(C24567g<DialogResponse> responseSubject, C2356FZ ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(responseSubject, "responseSubject");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f7671a = responseSubject;
        this.f7672b = ui;
        this.f7673c = scopeProvider;
    }

    /* renamed from: f */
    public static final DialogResponse m108829f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final DialogResponse m108828g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m108827h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m108826i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e */
    public final void m108830e() {
        Observable<Unit> m106952b = this.f7672b.m106952b();
        final C1866a c1866a = C1866a.f7674g;
        InterfaceC23434B map = m106952b.map(new InterfaceC23492o() { // from class: AZ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m108829f;
                m108829f = C1865EZ.m108829f(Function1.this, obj);
                return m108829f;
            }
        });
        Observable<Unit> m106953a = this.f7672b.m106953a();
        final C1867b c1867b = C1867b.f7675g;
        Observable merge = Observable.merge(map, m106953a.map(new InterfaceC23492o() { // from class: BZ
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m108828g;
                m108828g = C1865EZ.m108828g(Function1.this, obj);
                return m108828g;
            }
        }));
        final C1868c c1868c = new C1868c();
        Observable doAfterNext = merge.doAfterNext(new InterfaceC23484g() { // from class: CZ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1865EZ.m108827h(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doAfterNext, "fun onResume() {\n    Obs…seSubject::onSuccess)\n  }");
        Object m33094as = doAfterNext.m33094as(AutoDispose.m45239a(this.f7673c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1869d c1869d = new C1869d(this.f7671a);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: DZ
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C1865EZ.m108826i(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public final void m108825j(AbstractC5751Ny alert) {
        Intrinsics.checkNotNullParameter(alert, "alert");
        this.f7672b.m106950d(alert);
    }
}
