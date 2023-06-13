package p000;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, m28432d2 = {"T", "Lio/reactivex/F;", "Ljava/util/concurrent/Semaphore;", "lock", "f", "bluetooth_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: K36 */
/* loaded from: classes4.dex */
public final class K36 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: K36$a */
    /* loaded from: classes4.dex */
    public static final class C4326a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends T>> {

        /* renamed from: g */
        public final /* synthetic */ AbstractC23442F<T> f19004g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4326a(AbstractC23442F<T> abstractC23442F) {
            super(1);
            this.f19004g = abstractC23442F;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends T> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f19004g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: K36$b */
    /* loaded from: classes4.dex */
    public static final class C4327b extends Lambda implements Function1<T, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Semaphore f19005g;

        /* renamed from: h */
        public final /* synthetic */ Ref.BooleanRef f19006h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4327b(Semaphore semaphore, Ref.BooleanRef booleanRef) {
            super(1);
            this.f19005g = semaphore;
            this.f19006h = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2((C4327b) obj);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(T t) {
            if (this.f19005g.availablePermits() == 0) {
                this.f19005g.release();
                this.f19006h.element = true;
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: K36$c */
    /* loaded from: classes4.dex */
    public static final class C4328c extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Semaphore f19007g;

        /* renamed from: h */
        public final /* synthetic */ Ref.BooleanRef f19008h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4328c(Semaphore semaphore, Ref.BooleanRef booleanRef) {
            super(1);
            this.f19007g = semaphore;
            this.f19008h = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (this.f19007g.availablePermits() == 0) {
                this.f19007g.release();
                this.f19008h.element = true;
            }
        }
    }

    /* renamed from: f */
    public static final <T> AbstractC23442F<T> m99283f(AbstractC23442F<T> abstractC23442F, final Semaphore lock) {
        Intrinsics.checkNotNullParameter(abstractC23442F, "<this>");
        Intrinsics.checkNotNullParameter(lock, "lock");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        AbstractC23442F<T> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: F36
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m99282g;
                m99282g = K36.m99282g(Ref.BooleanRef.this, lock);
                return m99282g;
            }
        }).m33142Y(C24542a.m31932c());
        final C4326a c4326a = new C4326a(abstractC23442F);
        AbstractC23442F<R> m33165A = m33142Y.m33165A(new InterfaceC23492o() { // from class: G36
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m99281h;
                m99281h = K36.m99281h(Function1.this, obj);
                return m99281h;
            }
        });
        final C4327b c4327b = new C4327b(lock, booleanRef);
        AbstractC23442F m33101w = m33165A.m33101w(new InterfaceC23484g() { // from class: H36
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                K36.m99280i(Function1.this, obj);
            }
        });
        final C4328c c4328c = new C4328c(lock, booleanRef);
        AbstractC23442F<T> m33108s = m33101w.m33106t(new InterfaceC23484g() { // from class: I36
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                K36.m99279j(Function1.this, obj);
            }
        }).m33108s(new InterfaceC23478a() { // from class: J36
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                K36.m99278k(Ref.BooleanRef.this, lock);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33108s, "Single<T>.synchronizeBlu…k.release()\n      }\n    }");
        return m33108s;
    }

    /* renamed from: g */
    public static final Unit m99282g(Ref.BooleanRef hasUnlocked, Semaphore lock) {
        Intrinsics.checkNotNullParameter(hasUnlocked, "$hasUnlocked");
        Intrinsics.checkNotNullParameter(lock, "$lock");
        hasUnlocked.element = false;
        lock.acquire();
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final InterfaceC23447K m99281h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m99280i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m99279j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m99278k(Ref.BooleanRef hasUnlocked, Semaphore lock) {
        Intrinsics.checkNotNullParameter(hasUnlocked, "$hasUnlocked");
        Intrinsics.checkNotNullParameter(lock, "$lock");
        if (!hasUnlocked.element && lock.availablePermits() == 0) {
            lock.release();
        }
    }
}
