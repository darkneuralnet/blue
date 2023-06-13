package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.constant.InspectionContext;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.AbstractC24569h;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\b\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"Lj42;", "", "Lco/bird/android/model/InspectionFlow;", "inspection", "Lco/bird/android/model/constant/InspectionContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "f", "Lio/reactivex/subjects/h;", "Lco/bird/android/model/DialogResponse;", C17296a.f69688o, "Lio/reactivex/subjects/h;", "responseSubject", "Lc42;", "b", "Lc42;", "converter", "Lk42;", "c", "Lk42;", "ui", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "<init>", "(Lio/reactivex/subjects/h;Lc42;Lk42;Lcom/uber/autodispose/ScopeProvider;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInspectionV3CompletePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3CompletePresenter.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompletePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,46:1\n180#2:47\n199#2:48\n*S KotlinDebug\n*F\n+ 1 InspectionV3CompletePresenter.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompletePresenter\n*L\n33#1:47\n42#1:48\n*E\n"})
/* renamed from: j42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43093j42 {

    /* renamed from: a */
    public final AbstractC24569h<DialogResponse> f92102a;

    /* renamed from: b */
    public final C38925c42 f92103b;

    /* renamed from: c */
    public final C43686k42 f92104c;

    /* renamed from: d */
    public final ScopeProvider f92105d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: j42$a */
    /* loaded from: classes3.dex */
    public static final class C24704a extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public final /* synthetic */ boolean f92106g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24704a(boolean z) {
            super(1);
            this.f92106g = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DialogResponse invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (!this.f92106g) {
                return DialogResponse.OK;
            }
            return DialogResponse.CANCEL;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: j42$b */
    /* loaded from: classes3.dex */
    public static final class C24705b extends Lambda implements Function1<Unit, DialogResponse> {

        /* renamed from: g */
        public static final C24705b f92107g = new C24705b();

        public C24705b() {
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
    /* renamed from: j42$c */
    /* loaded from: classes3.dex */
    public static final class C24706c extends Lambda implements Function1<DialogResponse, Unit> {
        public C24706c() {
            super(1);
        }

        /* renamed from: a */
        public final void m31160a(DialogResponse dialogResponse) {
            C43093j42.this.f92102a.onNext(dialogResponse);
            C43093j42.this.f92104c.dismiss();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m31160a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: j42$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24707d extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C24707d(Object obj) {
            super(1, obj, C43686k42.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C43686k42) this.receiver).m29358b(p0);
        }
    }

    public C43093j42(AbstractC24569h<DialogResponse> responseSubject, C38925c42 converter, C43686k42 ui, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(responseSubject, "responseSubject");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f92102a = responseSubject;
        this.f92103b = converter;
        this.f92104c = ui;
        this.f92105d = scopeProvider;
    }

    /* renamed from: g */
    public static final DialogResponse m31167g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final DialogResponse m31166h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DialogResponse) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m31165i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final List m31164j(C43093j42 this$0, InspectionFlow inspection) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(inspection, "$inspection");
        return this$0.f92103b.m61971a(inspection);
    }

    /* renamed from: k */
    public static final void m31163k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public final void m31168f(final InspectionFlow inspection, InspectionContext context) {
        Intrinsics.checkNotNullParameter(inspection, "inspection");
        Intrinsics.checkNotNullParameter(context, "context");
        boolean passed = inspection.getPassed();
        this.f92104c.m29359Rl(inspection.getPassed(), context);
        Observable<Unit> m29361Pl = this.f92104c.m29361Pl();
        final C24704a c24704a = new C24704a(passed);
        InterfaceC23434B map = m29361Pl.map(new InterfaceC23492o() { // from class: e42
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m31167g;
                m31167g = C43093j42.m31167g(Function1.this, obj);
                return m31167g;
            }
        });
        Observable<Unit> m29360Ql = this.f92104c.m29360Ql();
        final C24705b c24705b = C24705b.f92107g;
        Observable merge = Observable.merge(map, m29360Ql.map(new InterfaceC23492o() { // from class: f42
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DialogResponse m31166h;
                m31166h = C43093j42.m31166h(Function1.this, obj);
                return m31166h;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(merge, "passedInspection = inspe…ogResponse.CANCEL }\n    )");
        Object m33094as = merge.m33094as(AutoDispose.m45239a(this.f92105d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24706c c24706c = new C24706c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: g42
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43093j42.m31165i(Function1.this, obj);
            }
        });
        AbstractC23442F m33152N = AbstractC23442F.m33161E(new Callable() { // from class: h42
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m31164j;
                m31164j = C43093j42.m31164j(C43093j42.this, inspection);
                return m31164j;
            }
        }).m33142Y(C24542a.m31934a()).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "fromCallable { converter…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f92105d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24707d c24707d = new C24707d(this.f92104c);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: i42
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43093j42.m31163k(Function1.this, obj);
            }
        });
    }
}
