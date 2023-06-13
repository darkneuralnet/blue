package p000;

import co.bird.android.model.persistence.OperatorTaskBanner;
import co.bird.android.model.persistence.OperatorTaskGroup;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"Lsw3;", "Lf1;", "Lrx4;", "Luw3;", "renderer", "", "consume", "Lom3;", "e", "Lom3;", "operatorManager", "<init>", "(Lom3;)V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskListV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2Presenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Presenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,40:1\n180#2:41\n237#2:42\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2Presenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Presenter\n*L\n23#1:41\n36#1:42\n*E\n"})
/* renamed from: sw3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48944sw3 extends AbstractC20169f1<InterfaceC48362rx4<? super AbstractC50130uw3>, AbstractC50130uw3> {

    /* renamed from: e */
    public final InterfaceC46473om3 f109588e;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorTaskBanner;", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "banners", "taskGroups", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sw3$a */
    /* loaded from: classes3.dex */
    public static final class C28482a extends Lambda implements Function2<List<? extends OperatorTaskBanner>, List<? extends OperatorTaskGroup>, Pair<? extends List<? extends OperatorTaskBanner>, ? extends List<? extends OperatorTaskGroup>>> {

        /* renamed from: g */
        public static final C28482a f109589g = new C28482a();

        public C28482a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Pair<? extends List<? extends OperatorTaskBanner>, ? extends List<? extends OperatorTaskGroup>> invoke(List<? extends OperatorTaskBanner> list, List<? extends OperatorTaskGroup> list2) {
            return invoke2((List<OperatorTaskBanner>) list, (List<OperatorTaskGroup>) list2);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Pair<List<OperatorTaskBanner>, List<OperatorTaskGroup>> invoke2(List<OperatorTaskBanner> banners, List<OperatorTaskGroup> taskGroups) {
            Intrinsics.checkNotNullParameter(banners, "banners");
            Intrinsics.checkNotNullParameter(taskGroups, "taskGroups");
            return TuplesKt.m28425to(banners, taskGroups);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004 \u0007*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorTaskBanner;", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sw3$b */
    /* loaded from: classes3.dex */
    public static final class C28483b extends Lambda implements Function1<Pair<? extends List<? extends OperatorTaskBanner>, ? extends List<? extends OperatorTaskGroup>>, Unit> {
        public C28483b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends OperatorTaskBanner>, ? extends List<? extends OperatorTaskGroup>> pair) {
            invoke2((Pair<? extends List<OperatorTaskBanner>, ? extends List<OperatorTaskGroup>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends List<OperatorTaskBanner>, ? extends List<OperatorTaskGroup>> pair) {
            Object firstOrNull;
            List<OperatorTaskBanner> banners = pair.component1();
            List<OperatorTaskGroup> taskGroups = pair.component2();
            C48944sw3 c48944sw3 = C48944sw3.this;
            Intrinsics.checkNotNullExpressionValue(banners, "banners");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) banners);
            Intrinsics.checkNotNullExpressionValue(taskGroups, "taskGroups");
            c48944sw3.m42280h(new C52559z22((OperatorTaskBanner) firstOrNull, taskGroups));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: sw3$c */
    /* loaded from: classes3.dex */
    public static final class C28484c extends Lambda implements Function1<Throwable, Unit> {
        public C28484c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C48944sw3.this.m42280h(C34980Ok1.f27170a);
            C41318g46.m40159e(th);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48944sw3(InterfaceC46473om3 operatorManager) {
        super(AO5.f472a);
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        this.f109588e = operatorManager;
    }

    /* renamed from: g */
    public static final void m13381g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final Pair m13377p(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: q */
    public static final void m13376q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    public void consume(InterfaceC48362rx4<? super AbstractC50130uw3> renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<List<OperatorTaskBanner>> mo8144L = this.f109588e.mo8144L();
        Observable<List<OperatorTaskGroup>> mo8082q1 = this.f109588e.mo8082q1();
        final C28482a c28482a = C28482a.f109589g;
        Observable combineLatest = Observable.combineLatest(mo8144L, mo8082q1, new InterfaceC23480c() { // from class: pw3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m13377p;
                m13377p = C48944sw3.m13377p(Function2.this, obj, obj2);
                return m13377p;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(\n      ope…> banners to taskGroups }");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28483b c28483b = new C28483b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: qw3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48944sw3.m13381g(Function1.this, obj);
            }
        });
        AbstractC23461c m33065U = this.f109588e.mo8142M0().m33065U(1L);
        final C28484c c28484c = new C28484c();
        AbstractC23461c m33069Q = m33065U.m33084B(new InterfaceC23484g() { // from class: rw3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C48944sw3.m13376q(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33041n = m33069Q.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }
}
