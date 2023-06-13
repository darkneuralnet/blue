package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.constant.BirdTaskAction;
import co.bird.android.model.persistence.OperatorTaskGroup;
import co.bird.android.model.persistence.nestedstructures.OperatorTask;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C44794lw3;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00050\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Llw3;", "Lf1;", "Ltw3;", "Luw3;", "renderer", "", "z", "", "e", "N", "Lom3;", "Lom3;", "operatorManager", "", "f", "Ljava/lang/String;", "taskGroupTitle", "LQv3;", "g", "LQv3;", "converter", "Le13;", "h", "Le13;", "navigator", "Lma4;", "kotlin.jvm.PlatformType", "i", "Lma4;", "refreshRelay", "<init>", "(Lom3;Ljava/lang/String;LQv3;Le13;)V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskListV2FragmentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,112:1\n52#2,2:113\n180#3:115\n237#3:116\n180#3:117\n180#3:118\n180#3:119\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter\n*L\n33#1:113,2\n44#1:115\n61#1:116\n67#1:117\n74#1:118\n102#1:119\n*E\n"})
/* renamed from: lw3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44794lw3 extends AbstractC20169f1<InterfaceC49537tw3, AbstractC50130uw3> {

    /* renamed from: e */
    public final InterfaceC46473om3 f96973e;

    /* renamed from: f */
    public final String f96974f;

    /* renamed from: g */
    public final C35549Qv3 f96975g;

    /* renamed from: h */
    public final InterfaceC40099e13 f96976h;

    /* renamed from: i */
    public final C45168ma4<Unit> f96977i;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/persistence/OperatorTaskGroup;", "it", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/OperatorTaskGroup;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lw3$a */
    /* loaded from: classes3.dex */
    public static final class C25818a extends Lambda implements Function1<OperatorTaskGroup, List<? extends OperatorTask>> {

        /* renamed from: g */
        public static final C25818a f96978g = new C25818a();

        public C25818a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<OperatorTask> invoke(OperatorTaskGroup it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getTasks();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012,\u0010\u0004\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorTaskListV2FragmentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter$consume$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n766#2:113\n857#2,2:114\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter$consume$1$2\n*L\n38#1:113\n38#1:114,2\n*E\n"})
    /* renamed from: lw3$b */
    /* loaded from: classes3.dex */
    public static final class C25819b extends Lambda implements Function1<Pair<? extends Optional<String>, ? extends List<? extends OperatorTask>>, List<? extends OperatorTask>> {

        /* renamed from: g */
        public static final C25819b f96979g = new C25819b();

        public C25819b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends OperatorTask> invoke(Pair<? extends Optional<String>, ? extends List<? extends OperatorTask>> pair) {
            return invoke2((Pair<Optional<String>, ? extends List<OperatorTask>>) pair);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
            if (r3 != false) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0021 A[SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<OperatorTask> invoke2(Pair<Optional<String>, ? extends List<OperatorTask>> pair) {
            boolean z;
            boolean startsWith$default;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<String> component1 = pair.component1();
            List<OperatorTask> tasks = pair.component2();
            Intrinsics.checkNotNullExpressionValue(tasks, "tasks");
            ArrayList arrayList = new ArrayList();
            for (Object obj : tasks) {
                OperatorTask operatorTask = (OperatorTask) obj;
                if (component1.m59037c()) {
                    z = false;
                    if (component1.m59037c()) {
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(operatorTask.getBirdCode(), component1.m59038b(), false, 2, null);
                    }
                    if (!z) {
                        arrayList.add(obj);
                    }
                }
                z = true;
                if (!z) {
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "it", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lw3$c */
    /* loaded from: classes3.dex */
    public static final class C25820c extends Lambda implements Function1<List<? extends OperatorTask>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C25820c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<OperatorTask> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44794lw3.this.f96975g.m87574b(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lw3$d */
    /* loaded from: classes3.dex */
    public static final class C25821d extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C25821d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            C44794lw3 c44794lw3 = C44794lw3.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c44794lw3.m42280h(new C38849bw5(it));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lw3$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25822e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C25822e f96982b = new C25822e();

        public C25822e() {
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
    /* renamed from: lw3$f */
    /* loaded from: classes3.dex */
    public static final class C25823f extends Lambda implements Function1<Unit, Unit> {
        public C25823f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C44794lw3.this.m42280h(new C50863wA5(false));
            C44794lw3.this.m42280h(new C32956Ft2(true));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lw3$g */
    /* loaded from: classes3.dex */
    public static final class C25824g extends Lambda implements Function1<Unit, InterfaceC23496h> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: lw3$g$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C25825a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
            public C25825a(Object obj) {
                super(1, obj, C44794lw3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((C44794lw3) this.receiver).m26645N(p0);
            }
        }

        public C25824g() {
            super(1);
        }

        /* renamed from: d */
        public static final void m26625d(C44794lw3 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m42280h(new C32956Ft2(false));
        }

        /* renamed from: e */
        public static final void m26624e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo8142M0 = C44794lw3.this.f96973e.mo8142M0();
            final C44794lw3 c44794lw3 = C44794lw3.this;
            AbstractC23461c m33029z = mo8142M0.m33029z(new InterfaceC23478a() { // from class: mw3
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C44794lw3.C25824g.m26625d(C44794lw3.this);
                }
            });
            final C25825a c25825a = new C25825a(C44794lw3.this);
            return m33029z.m33084B(new InterfaceC23484g() { // from class: nw3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44794lw3.C25824g.m26624e(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/OperatorTask;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lw3$h */
    /* loaded from: classes3.dex */
    public static final class C25826h extends Lambda implements Function1<OperatorTask, Unit> {
        public C25826h() {
            super(1);
        }

        /* renamed from: a */
        public final void m26623a(OperatorTask operatorTask) {
            C44794lw3.this.m42280h(new C42563iA5(operatorTask.getBirdId()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorTask operatorTask) {
            m26623a(operatorTask);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lw3$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25827i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C25827i f96986b = new C25827i();

        public C25827i() {
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

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "kotlin.jvm.PlatformType", "task", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/OperatorTask;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorTaskListV2FragmentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter$consume$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n223#2,2:113\n*S KotlinDebug\n*F\n+ 1 OperatorTaskListV2FragmentPresenter.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2FragmentPresenter$consume$4\n*L\n77#1:113,2\n*E\n"})
    /* renamed from: lw3$j */
    /* loaded from: classes3.dex */
    public static final class C25828j extends Lambda implements Function1<OperatorTask, Unit> {
        public C25828j() {
            super(1);
        }

        /* renamed from: a */
        public final void m26622a(OperatorTask operatorTask) {
            boolean z;
            for (BirdTaskAction birdTaskAction : operatorTask.getActions()) {
                if (BirdTaskAction.Companion.getCANCEL_ACTIONS().contains(birdTaskAction)) {
                    C44794lw3 c44794lw3 = C44794lw3.this;
                    String birdCode = operatorTask.getBirdCode();
                    String taskId = operatorTask.getTaskId();
                    if (birdTaskAction == BirdTaskAction.CANCEL_TASK_DIRECT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c44794lw3.m42280h(new C37802aA5(new C35843Sc0(birdCode, taskId, z)));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorTask operatorTask) {
            m26622a(operatorTask);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LSc0;", "cancelData", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LSc0;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lw3$k */
    /* loaded from: classes3.dex */
    public static final class C25829k extends Lambda implements Function1<C35843Sc0, InterfaceC23434B<? extends WireBird>> {
        public C25829k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends WireBird> invoke(C35843Sc0 cancelData) {
            Intrinsics.checkNotNullParameter(cancelData, "cancelData");
            if (cancelData.m85201c()) {
                return C44794lw3.this.f96973e.mo8105f1(cancelData.m85200d());
            }
            C44794lw3.this.f96976h.mo36955r0(cancelData.m85202b(), cancelData.m85200d());
            C44794lw3.this.m42280h(IL4.f15381a);
            return Observable.empty();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lw3$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C25830l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C25830l(Object obj) {
            super(1, obj, C44794lw3.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C44794lw3) this.receiver).m26645N(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lw3$m */
    /* loaded from: classes3.dex */
    public static final class C25831m extends Lambda implements Function1<WireBird, Unit> {
        public C25831m() {
            super(1);
        }

        /* renamed from: a */
        public final void m26620a(WireBird wireBird) {
            C44794lw3.this.f96977i.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireBird wireBird) {
            m26620a(wireBird);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: lw3$n */
    /* loaded from: classes3.dex */
    public static final class C25832n<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C25832n<T1, T2, R> f96990a = new C25832n<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44794lw3(InterfaceC46473om3 operatorManager, String str, C35549Qv3 converter, InterfaceC40099e13 navigator) {
        super(AO5.f472a);
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f96973e = operatorManager;
        this.f96974f = str;
        this.f96975g = converter;
        this.f96976h = navigator;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f96977i = m25409g;
    }

    /* renamed from: A */
    public static final void m26658A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC23434B m26657B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m26656C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m26655D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final List m26654E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final List m26653F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23447K m26652G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m26651H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m26650I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m26649J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC23496h m26648K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m26647L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m26646M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public final void m26645N(Throwable th) {
        C41318g46.m40159e(th);
        m42280h(new C32956Ft2(false));
        m42280h(C40784fA5.f79633a);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: z */
    public void consume(InterfaceC49537tw3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        String str = this.f96974f;
        if (str != null) {
            C40463ee3 c40463ee3 = C40463ee3.f78649a;
            Observable<Optional<String>> mo11194P2 = renderer.mo11194P2();
            Observable<OperatorTaskGroup> mo8140N0 = this.f96973e.mo8140N0(str);
            final C25818a c25818a = C25818a.f96978g;
            InterfaceC23434B map = mo8140N0.map(new InterfaceC23492o() { // from class: Yv3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m26654E;
                    m26654E = C44794lw3.m26654E(Function1.this, obj);
                    return m26654E;
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "operatorManager.streamOp…upTitle).map { it.tasks }");
            Observable combineLatest = Observable.combineLatest(mo11194P2, map, C25832n.f96990a);
            Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
            final C25819b c25819b = C25819b.f96979g;
            Observable map2 = combineLatest.map(new InterfaceC23492o() { // from class: fw3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m26653F;
                    m26653F = C44794lw3.m26653F(Function1.this, obj);
                    return m26653F;
                }
            });
            final C25820c c25820c = new C25820c();
            Observable flatMapSingle = map2.flatMapSingle(new InterfaceC23492o() { // from class: gw3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m26652G;
                    m26652G = C44794lw3.m26652G(Function1.this, obj);
                    return m26652G;
                }
            });
            Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun consume(ren…hRelay.accept(Unit) }\n  }");
            Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(renderer));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C25821d c25821d = new C25821d();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: hw3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44794lw3.m26651H(Function1.this, obj);
                }
            };
            final C25822e c25822e = C25822e.f96982b;
            ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: iw3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44794lw3.m26650I(Function1.this, obj);
                }
            });
            Observable merge = Observable.merge(renderer.mo11192r0(), this.f96977i);
            final C25823f c25823f = new C25823f();
            Observable doOnNext = merge.doOnNext(new InterfaceC23484g() { // from class: jw3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44794lw3.m26649J(Function1.this, obj);
                }
            });
            final C25824g c25824g = new C25824g();
            AbstractC23461c m33066T = doOnNext.flatMapCompletable(new InterfaceC23492o() { // from class: kw3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h m26648K;
                    m26648K = C44794lw3.m26648K(Function1.this, obj);
                    return m26648K;
                }
            }).m33066T();
            Intrinsics.checkNotNullExpressionValue(m33066T, "override fun consume(ren…hRelay.accept(Unit) }\n  }");
            Object m33041n = m33066T.m33041n(AutoDispose.m45239a(renderer));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            ((CompletableSubscribeProxy) m33041n).subscribe();
        }
        Object m33094as2 = renderer.mo11195C6().m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25826h c25826h = new C25826h();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: Zv3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44794lw3.m26647L(Function1.this, obj);
            }
        };
        final C25827i c25827i = C25827i.f96986b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: aw3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44794lw3.m26646M(Function1.this, obj);
            }
        });
        Object m33094as3 = renderer.mo11191r2().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25828j c25828j = new C25828j();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: bw3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44794lw3.m26658A(Function1.this, obj);
            }
        });
        Observable<C35843Sc0> mo11193X4 = renderer.mo11193X4();
        final C25829k c25829k = new C25829k();
        Observable<R> flatMap = mo11193X4.flatMap(new InterfaceC23492o() { // from class: cw3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m26657B;
                m26657B = C44794lw3.m26657B(Function1.this, obj);
                return m26657B;
            }
        });
        final C25830l c25830l = new C25830l(this);
        Observable retry = flatMap.doOnError(new InterfaceC23484g() { // from class: dw3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44794lw3.m26656C(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…hRelay.accept(Unit) }\n  }");
        Object m33094as4 = retry.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25831m c25831m = new C25831m();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: ew3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44794lw3.m26655D(Function1.this, obj);
            }
        });
    }
}
