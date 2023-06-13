package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WirePart;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LBI3;", "", "Lco/bird/android/model/wire/WirePart;", "part", "", DateTokenConverter.CONVERTER_KEY, "e", "Lio/reactivex/subjects/g;", "Lco/bird/android/model/DialogResponse;", C17296a.f69688o, "Lio/reactivex/subjects/g;", "responseSubject", "LCI3;", "b", "LCI3;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lio/reactivex/subjects/g;LCI3;Lcom/uber/autodispose/ScopeProvider;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPartSwapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartSwapPresenter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/partswap/PartSwapPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,33:1\n180#2:34\n*S KotlinDebug\n*F\n+ 1 PartSwapPresenter.kt\nco/bird/android/feature/repair/v3/issues/dialogs/partswap/PartSwapPresenter\n*L\n26#1:34\n*E\n"})
/* renamed from: BI3 */
/* loaded from: classes3.dex */
public final class BI3 {

    /* renamed from: a */
    public final C24567g<DialogResponse> f2178a;

    /* renamed from: b */
    public final CI3 f2179b;

    /* renamed from: c */
    public final ScopeProvider f2180c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BI3$a */
    /* loaded from: classes3.dex */
    public static final class C0595a extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C0595a f2181g = new C0595a();

        public C0595a() {
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
    /* renamed from: BI3$b */
    /* loaded from: classes3.dex */
    public static final class C0596b extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C0596b f2182g = new C0596b();

        public C0596b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return DialogResponse.CANCEL;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BI3$c */
    /* loaded from: classes3.dex */
    public static final class C0597c extends Lambda implements Function1<DialogResponse, Unit> {
        public C0597c() {
            super(1);
        }

        /* renamed from: a */
        public final void m114118a(DialogResponse dialogResponse) {
            BI3.this.f2178a.onSuccess(dialogResponse);
            BI3.this.f2179b.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m114118a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public BI3(C24567g<DialogResponse> responseSubject, CI3 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(responseSubject, "responseSubject");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f2178a = responseSubject;
        this.f2179b = ui;
        this.f2180c = scopeProvider;
    }

    /* renamed from: f */
    public static final DialogResponse m114123f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final DialogResponse m114122g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m114121h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final void m114125d(WirePart part) {
        Intrinsics.checkNotNullParameter(part, "part");
        this.f2179b.m112369Pl(part);
    }

    /* renamed from: e */
    public final void m114124e() {
        Observable<Unit> m112367f = this.f2179b.m112367f();
        final C0595a c0595a = C0595a.f2181g;
        InterfaceC23434B map = m112367f.map(new InterfaceC23492o() { // from class: yI3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m114123f;
                m114123f = BI3.m114123f(Function1.this, obj);
                return m114123f;
            }
        });
        Observable<Unit> m112368d = this.f2179b.m112368d();
        final C0596b c0596b = C0596b.f2182g;
        Observable merge = Observable.merge(map, m112368d.map(new InterfaceC23492o() { // from class: zI3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m114122g;
                m114122g = BI3.m114122g(Function1.this, obj);
                return m114122g;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.confirmC…ogResponse.CANCEL }\n    )");
        Object m33094as = merge.m33094as(AutoDispose.m45239a(this.f2180c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C0597c c0597c = new C0597c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: AI3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                BI3.m114121h(Function1.this, obj);
            }
        });
    }
}
