package p000;

import co.bird.android.model.IssueType;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24552a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\n\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"LVF6;", "LQF6;", "", "Lco/bird/android/model/IssueType;", "issues", "Lio/reactivex/subjects/a;", "", "clickSubject", "", "b", C17296a.f69688o, "LXF6;", "LXF6;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LJF6;", "c", "LJF6;", "converter", "<init>", "(LXF6;Lcom/uber/autodispose/ScopeProvider;LJF6;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderIssuesUncheckConfirmationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesUncheckConfirmationPresenter.kt\nco/bird/android/feature/workorders/issues/uncheckconfirmation/WorkOrderIssuesUncheckConfirmationPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,55:1\n199#2:56\n161#2:57\n161#2:58\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssuesUncheckConfirmationPresenter.kt\nco/bird/android/feature/workorders/issues/uncheckconfirmation/WorkOrderIssuesUncheckConfirmationPresenterImpl\n*L\n30#1:56\n36#1:57\n42#1:58\n*E\n"})
/* renamed from: VF6 */
/* loaded from: classes3.dex */
public final class VF6 implements QF6 {

    /* renamed from: a */
    public final XF6 f38804a;

    /* renamed from: b */
    public final ScopeProvider f38805b;

    /* renamed from: c */
    public final JF6 f38806c;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "sections", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: VF6$a */
    /* loaded from: classes3.dex */
    public static final class C8589a extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C8589a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> sections) {
            XF6 xf6 = VF6.this.f38804a;
            Intrinsics.checkNotNullExpressionValue(sections, "sections");
            xf6.mo75292b(sections);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VF6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8590b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C8590b f38808b = new C8590b();

        public C8590b() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VF6$c */
    /* loaded from: classes3.dex */
    public static final class C8591c extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C24552a<Boolean> f38809g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8591c(C24552a<Boolean> c24552a) {
            super(1);
            this.f38809g = c24552a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f38809g.onNext(Boolean.TRUE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: VF6$d */
    /* loaded from: classes3.dex */
    public static final class C8592d extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C24552a<Boolean> f38810g;

        /* renamed from: h */
        public final /* synthetic */ VF6 f38811h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8592d(C24552a<Boolean> c24552a, VF6 vf6) {
            super(1);
            this.f38810g = c24552a;
            this.f38811h = vf6;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            this.f38810g.onNext(Boolean.FALSE);
            this.f38811h.f38804a.dismiss();
        }
    }

    public VF6(XF6 ui, ScopeProvider scopeProvider, JF6 converter) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f38804a = ui;
        this.f38805b = scopeProvider;
        this.f38806c = converter;
    }

    /* renamed from: g */
    public static final void m80134g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m80133h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m80132i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m80131j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.QF6
    /* renamed from: a */
    public void mo80140a(C24552a<Boolean> clickSubject) {
        Intrinsics.checkNotNullParameter(clickSubject, "clickSubject");
        clickSubject.onNext(Boolean.FALSE);
        this.f38804a.dismiss();
    }

    @Override // p000.QF6
    /* renamed from: b */
    public void mo80139b(List<IssueType> issues, C24552a<Boolean> clickSubject) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(clickSubject, "clickSubject");
        AbstractC23442F<List<C3023H6>> m33152N = this.f38806c.mo97503a(issues).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "converter.convert(issues…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f38805b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8589a c8589a = new C8589a();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: RF6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VF6.m80134g(Function1.this, obj);
            }
        };
        final C8590b c8590b = C8590b.f38808b;
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: SF6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VF6.m80133h(Function1.this, obj);
            }
        });
        Object m32150f = this.f38804a.mo75293a().m32150f(AutoDispose.m45239a(this.f38805b));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8591c c8591c = new C8591c(clickSubject);
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: TF6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VF6.m80132i(Function1.this, obj);
            }
        });
        Object m32150f2 = this.f38804a.mo75291d().m32150f(AutoDispose.m45239a(this.f38805b));
        Intrinsics.checkExpressionValueIsNotNull(m32150f2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8592d c8592d = new C8592d(clickSubject, this);
        ((FlowableSubscribeProxy) m32150f2).subscribe(new InterfaceC23484g() { // from class: UF6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VF6.m80131j(Function1.this, obj);
            }
        });
    }
}
