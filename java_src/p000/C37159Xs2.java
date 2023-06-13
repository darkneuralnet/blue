package p000;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.Executor;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p000.C37159Xs2;
@Metadata(m28433d1 = {"\u00008\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aR\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0000\u001a>\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0000\u001ab\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b28\b\u0002\u0010\u0012\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0005H\u0000\u001a\b\u0010\u0014\u001a\u00020\u000bH\u0003\"\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m28432d2 = {"T1", "T2", "R", "Landroidx/lifecycle/LiveData;", LegacyRepairType.OTHER_KEY, "Lkotlin/Function2;", "func", "c", "Lkotlin/Pair;", "b", "T", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/ParameterName;", "name", "old", "new", "", "areEqual", DateTokenConverter.CONVERTER_KEY, "f", "", C17296a.f69688o, "Ljava/lang/Object;", "uninitializedToken", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Xs2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37159Xs2 {

    /* renamed from: a */
    public static final Object f44077a = new Object();

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xs2$a */
    /* loaded from: classes5.dex */
    public static final class C9535a extends Lambda implements Function1<T1, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<T1> f44078g;

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<T2> f44079h;

        /* renamed from: i */
        public final /* synthetic */ MP2<R> f44080i;

        /* renamed from: j */
        public final /* synthetic */ Function2<T1, T2, R> f44081j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9535a(Ref.ObjectRef<T1> objectRef, Ref.ObjectRef<T2> objectRef2, MP2<R> mp2, Function2<? super T1, ? super T2, ? extends R> function2) {
            super(1);
            this.f44078g = objectRef;
            this.f44079h = objectRef2;
            this.f44080i = mp2;
            this.f44081j = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C9535a) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T1 t1) {
            this.f44078g.element = t1;
            Object obj = this.f44079h.element;
            if (t1 == 0 && this.f44080i.getValue() != null) {
                this.f44080i.setValue(null);
            } else if (t1 == 0 || obj == null) {
            } else {
                this.f44080i.setValue(this.f44081j.invoke(t1, obj));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u000e\u0010\u0005\u001a\n \u0006*\u0004\u0018\u0001H\u0003H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "T1", "T2", "R", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xs2$b */
    /* loaded from: classes5.dex */
    public static final class C9536b extends Lambda implements Function1<T2, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Ref.ObjectRef<T2> f44082g;

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<T1> f44083h;

        /* renamed from: i */
        public final /* synthetic */ MP2<R> f44084i;

        /* renamed from: j */
        public final /* synthetic */ Function2<T1, T2, R> f44085j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9536b(Ref.ObjectRef<T2> objectRef, Ref.ObjectRef<T1> objectRef2, MP2<R> mp2, Function2<? super T1, ? super T2, ? extends R> function2) {
            super(1);
            this.f44082g = objectRef;
            this.f44083h = objectRef2;
            this.f44084i = mp2;
            this.f44085j = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C9536b) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T2 t2) {
            this.f44082g.element = t2;
            Object obj = this.f44083h.element;
            if (t2 == 0 && this.f44084i.getValue() != null) {
                this.f44084i.setValue(null);
            } else if (obj == null || t2 == 0) {
            } else {
                this.f44084i.setValue(this.f44085j.invoke(obj, t2));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u0002H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "T1", "T2", C17296a.f69688o, "b", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xs2$c */
    /* loaded from: classes5.dex */
    public static final class C9537c extends Lambda implements Function2<T1, T2, Pair<? extends T1, ? extends T2>> {

        /* renamed from: g */
        public static final C9537c f44086g = new C9537c();

        public C9537c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C9537c) obj, obj2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Pair<T1, T2> invoke(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "old", "new", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Xs2$d */
    /* loaded from: classes5.dex */
    public static final class C9538d extends Lambda implements Function2 {

        /* renamed from: g */
        public static final C9538d f44087g = new C9538d();

        public C9538d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(Intrinsics.areEqual(obj, obj2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "new", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xs2$e */
    /* loaded from: classes5.dex */
    public static final class C9539e extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Executor f44088g;

        /* renamed from: h */
        public final /* synthetic */ Ref.ObjectRef<Object> f44089h;

        /* renamed from: i */
        public final /* synthetic */ Function2<T, T, Boolean> f44090i;

        /* renamed from: j */
        public final /* synthetic */ MP2<T> f44091j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C9539e(Executor executor, Ref.ObjectRef<Object> objectRef, Function2<? super T, ? super T, Boolean> function2, MP2<T> mp2) {
            super(1);
            this.f44088g = executor;
            this.f44089h = objectRef;
            this.f44090i = function2;
            this.f44091j = mp2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public static final void m76184b(Ref.ObjectRef old, Function2 areEqual, Object obj, MP2 distinctMediator) {
            Intrinsics.checkNotNullParameter(old, "$old");
            Intrinsics.checkNotNullParameter(areEqual, "$areEqual");
            Intrinsics.checkNotNullParameter(distinctMediator, "$distinctMediator");
            if (old.element == C37159Xs2.f44077a || !((Boolean) areEqual.invoke(old.element, obj)).booleanValue()) {
                old.element = obj;
                distinctMediator.postValue(obj);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C9539e) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final T t) {
            Executor executor = this.f44088g;
            final Ref.ObjectRef<Object> objectRef = this.f44089h;
            final Function2<T, T, Boolean> function2 = this.f44090i;
            final MP2<T> mp2 = this.f44091j;
            executor.execute(new Runnable() { // from class: Ys2
                @Override // java.lang.Runnable
                public final void run() {
                    C37159Xs2.C9539e.m76184b(Ref.ObjectRef.this, function2, t, mp2);
                }
            });
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Xs2$f */
    /* loaded from: classes5.dex */
    public static final class C9540f implements InterfaceC41056fe3, FunctionAdapter {

        /* renamed from: b */
        public final /* synthetic */ Function1 f44092b;

        public C9540f(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f44092b = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC41056fe3) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f44092b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // p000.InterfaceC41056fe3
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44092b.invoke(obj);
        }
    }

    /* renamed from: b */
    public static final <T1, T2> LiveData<Pair<T1, T2>> m76191b(LiveData<T1> liveData, LiveData<T2> other) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return m76190c(liveData, other, C9537c.f44086g);
    }

    /* renamed from: c */
    public static final <T1, T2, R> LiveData<R> m76190c(LiveData<T1> liveData, LiveData<T2> other, Function2<? super T1, ? super T2, ? extends R> func) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(func, "func");
        MP2 mp2 = new MP2();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        mp2.mo95315b(liveData, new C9540f(new C9535a(objectRef, objectRef2, mp2, func)));
        mp2.mo95315b(other, new C9540f(new C9536b(objectRef2, objectRef, mp2, func)));
        return mp2;
    }

    /* renamed from: d */
    public static final <T> LiveData<T> m76189d(LiveData<T> liveData, Executor executor, Function2<? super T, ? super T, Boolean> areEqual) {
        Intrinsics.checkNotNullParameter(liveData, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(areEqual, "areEqual");
        MP2 mp2 = new MP2();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) f44077a;
        mp2.mo95315b(liveData, new C9540f(new C9539e(executor, objectRef, areEqual, mp2)));
        return mp2;
    }

    /* renamed from: e */
    public static /* synthetic */ LiveData m76188e(LiveData liveData, Executor executor, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            executor = m76187f();
        }
        if ((i & 2) != 0) {
            function2 = C9538d.f44087g;
        }
        return m76189d(liveData, executor, function2);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    public static final Executor m76187f() {
        Executor m108397g = C1988Em.m108397g();
        Intrinsics.checkNotNullExpressionValue(m108397g, "getIOThreadExecutor()");
        return m108397g;
    }
}
