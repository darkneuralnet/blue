package co.bird.android.feature.operator.releaseassignment;

import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.operator.releaseassignment.ReleaseAssignmentActivity;
import co.bird.android.model.Point;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.InterfaceC24578y;
import io.reactivex.Observable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b<\u0010=J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010+\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010'0'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010.\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010,0,0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R!\u00104\u001a\b\u0012\u0004\u0012\u00020'0/8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R!\u00107\u001a\b\u0012\u0004\u0012\u00020,0/8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u00103¨\u0006>"}, m28432d2 = {"Lco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "Lzu4;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LEu4;", TransferTable.COLUMN_STATE, "S", "Luu4;", "j", "Luu4;", "R", "()Luu4;", "setPresenter", "(Luu4;)V", "presenter", "Ldu4;", "k", "Ldu4;", "P", "()Ldu4;", "setAdapter", "(Ldu4;)V", "adapter", "Lfu4;", "l", "Lfu4;", "Q", "()Lfu4;", "setConverter", "(Lfu4;)V", "converter", "Ld5;", "m", "Ld5;", "binding", "Lma4;", "Lco/bird/android/model/Point;", "kotlin.jvm.PlatformType", "n", "Lma4;", "directionClicksRelay", "", "o", "cancelClicksRelay", "Lio/reactivex/Observable;", "p", "Lkotlin/Lazy;", "m2", "()Lio/reactivex/Observable;", "directionClicks", "q", "z0", "cancelClicks", "r", "Lio/reactivex/Observable;", "r0", "swipeRefreshed", "<init>", "()V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReleaseAssignmentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentActivity.kt\nco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,87:1\n1#2:88\n199#3:89\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentActivity.kt\nco/bird/android/feature/operator/releaseassignment/ReleaseAssignmentActivity\n*L\n79#1:89\n*E\n"})
/* loaded from: classes3.dex */
public final class ReleaseAssignmentActivity extends BaseActivityLite implements InterfaceC53075zu4 {

    /* renamed from: j */
    public C50111uu4 f64275j;

    /* renamed from: k */
    public C40031du4 f64276k;

    /* renamed from: l */
    public C41217fu4 f64277l;

    /* renamed from: m */
    public C19673d5 f64278m;

    /* renamed from: n */
    public final C45168ma4<Point> f64279n;

    /* renamed from: o */
    public final C45168ma4<String> f64280o;

    /* renamed from: p */
    public final Lazy f64281p;

    /* renamed from: q */
    public final Lazy f64282q;

    /* renamed from: r */
    public final Observable<Unit> f64283r;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.operator.releaseassignment.ReleaseAssignmentActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15013a extends Lambda implements Function0<Observable<String>> {
        public C15013a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<String> invoke() {
            return ReleaseAssignmentActivity.this.f64280o.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/Point;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.operator.releaseassignment.ReleaseAssignmentActivity$b */
    /* loaded from: classes3.dex */
    public static final class C15014b extends Lambda implements Function0<Observable<Point>> {
        public C15014b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Point> invoke() {
            return ReleaseAssignmentActivity.this.f64279n.hide();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.operator.releaseassignment.ReleaseAssignmentActivity$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15015c extends FunctionReferenceImpl implements Function1<Point, Unit> {
        public C15015c(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m57882a(Point p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Point point) {
            m57882a(point);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.operator.releaseassignment.ReleaseAssignmentActivity$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C15016d extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C15016d(Object obj) {
            super(1, obj, C45168ma4.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C45168ma4) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/y;", "", "emitter", "b", "(Lio/reactivex/y;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.operator.releaseassignment.ReleaseAssignmentActivity$e */
    /* loaded from: classes3.dex */
    public static final class C15017e extends Lambda implements Function1<InterfaceC24578y<Unit>, Unit> {
        public C15017e() {
            super(1);
        }

        /* renamed from: c */
        public static final void m57879c(InterfaceC24578y emitter) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            emitter.onNext(Unit.INSTANCE);
        }

        /* renamed from: b */
        public final void m57880b(final InterfaceC24578y<Unit> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C19673d5 c19673d5 = ReleaseAssignmentActivity.this.f64278m;
            if (c19673d5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c19673d5 = null;
            }
            c19673d5.f76107d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC11985j() { // from class: bu4
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC11985j
                public final void onRefresh() {
                    ReleaseAssignmentActivity.C15017e.m57879c(InterfaceC24578y.this);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC24578y<Unit> interfaceC24578y) {
            m57880b(interfaceC24578y);
            return Unit.INSTANCE;
        }
    }

    public ReleaseAssignmentActivity() {
        Lazy lazy;
        Lazy lazy2;
        C45168ma4<Point> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Point>()");
        this.f64279n = m25409g;
        C45168ma4<String> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<String>()");
        this.f64280o = m25409g2;
        lazy = LazyKt__LazyJVMKt.lazy(new C15014b());
        this.f64281p = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C15013a());
        this.f64282q = lazy2;
        this.f64283r = C45832nh5.m23307i(new C15017e());
    }

    /* renamed from: P */
    public final C40031du4 m57888P() {
        C40031du4 c40031du4 = this.f64276k;
        if (c40031du4 != null) {
            return c40031du4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    /* renamed from: Q */
    public final C41217fu4 m57887Q() {
        C41217fu4 c41217fu4 = this.f64277l;
        if (c41217fu4 != null) {
            return c41217fu4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("converter");
        return null;
    }

    /* renamed from: R */
    public final C50111uu4 m57886R() {
        C50111uu4 c50111uu4 = this.f64275j;
        if (c50111uu4 != null) {
            return c50111uu4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: S */
    public void render(InterfaceC32733Eu4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C51966y22) {
            m57888P().mo24871u(m57887Q().m40577a(((C51966y22) state).m4230b()));
            return;
        }
        C19673d5 c19673d5 = null;
        Unit unit = null;
        if (state instanceof C41377gA5) {
            C41377gA5 c41377gA5 = (C41377gA5) state;
            if (c41377gA5.m39953c()) {
                m58990F().error(C45871nl4.error_network);
                return;
            }
            String m39954b = c41377gA5.m39954b();
            if (m39954b != null) {
                m58990F().error(m39954b);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                m58990F().errorGeneric();
            }
        } else if (state instanceof C32722Et2) {
            S74.C7343a.showProgress$default(m58990F(), ((C32722Et2) state).m108266a(), 0, 2, null);
        } else if (state instanceof C43156jA5) {
            if (!isFinishing()) {
                C43156jA5 c43156jA5 = (C43156jA5) state;
                Object m33135e = H31.C3014a.birdDialog$default(m58990F(), new C45533nB1(c43156jA5.m31033b().getTitle(), c43156jA5.m31033b().getMessage(), FY3.OKAY), false, false, 6, null).m33135e(AutoDispose.m45239a(this));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                ((SingleSubscribeProxy) m33135e).subscribe();
            }
        } else if (state instanceof C51456xA5) {
            C19673d5 c19673d52 = this.f64278m;
            if (c19673d52 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c19673d5 = c19673d52;
            }
            c19673d5.f76107d.setRefreshing(((C51456xA5) state).m5756b());
        }
    }

    @Override // p000.InterfaceC53075zu4
    /* renamed from: m2 */
    public Observable<Point> mo144m2() {
        Object value = this.f64281p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-directionClicks>(...)");
        return (Observable) value;
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C15018a.m57878a().mo57874a(m58989H(), this).mo57875a(this);
        C19673d5 m44624c = C19673d5.m44624c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m44624c, "inflate(layoutInflater)");
        this.f64278m = m44624c;
        C19673d5 c19673d5 = null;
        if (m44624c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m44624c = null;
        }
        setContentView(m44624c.getRoot());
        C19673d5 c19673d52 = this.f64278m;
        if (c19673d52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c19673d52 = null;
        }
        c19673d52.f76106c.setAdapter(m57888P());
        C19673d5 c19673d53 = this.f64278m;
        if (c19673d53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c19673d5 = c19673d53;
        }
        c19673d5.f76106c.setItemAnimator(new C11894g());
        m57888P().m43517y(new C15015c(this.f64279n));
        m57888P().m43518x(new C15016d(this.f64280o));
        m57886R().consume(this);
    }

    @Override // p000.InterfaceC53075zu4
    /* renamed from: r0 */
    public Observable<Unit> mo143r0() {
        return this.f64283r;
    }

    @Override // p000.InterfaceC53075zu4
    /* renamed from: z0 */
    public Observable<String> mo142z0() {
        Object value = this.f64282q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-cancelClicks>(...)");
        return (Observable) value;
    }
}
