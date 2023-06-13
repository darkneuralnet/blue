package bo.app;

import com.appboy.events.IEventSubscriber;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m28434bv = {}, m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016JL\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052 \u0010\t\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\b0\u0007H\u0002J\u001c\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J.\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002J:\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\b\"\u0004\b\u0000\u0010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\bH\u0002J*\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J*\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J*\u0010\u0010\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J+\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0011\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0012J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u0017"}, m28432d2 = {"Lbo/app/a1;", "Lbo/app/g2;", "T", "Lcom/appboy/events/IEventSubscriber;", "subscriber", "Ljava/lang/Class;", "eventClass", "Ljava/util/concurrent/ConcurrentMap;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "subscriptionMap", "", C17296a.f69688o, "", "subscribers", "subscriberList", "b", "c", "message", "(Ljava/lang/Object;Ljava/lang/Class;)V", "Lbo/app/v4;", "sdkEnablementProvider", "<init>", "(Lbo/app/v4;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.a1 */
/* loaded from: classes.dex */
public final class C12511a1 implements InterfaceC12658g2 {

    /* renamed from: a */
    private final C13179v4 f58208a;

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<IEventSubscriber<?>>> f58209b;

    /* renamed from: c */
    private final ConcurrentMap<Class<?>, CopyOnWriteArraySet<IEventSubscriber<?>>> f58210c;

    /* renamed from: d */
    private final ConcurrentMap<Class<?>, Object> f58211d;

    /* renamed from: e */
    private final ReentrantLock f58212e;

    /* renamed from: f */
    private final ReentrantLock f58213f;

    /* renamed from: g */
    private final ReentrantLock f58214g;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a1$a */
    /* loaded from: classes.dex */
    public static final class C12512a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f58215b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12512a(Class<T> cls) {
            super(0);
            this.f58215b = cls;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Publishing cached event for class: ", this.f58215b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a1$b */
    /* loaded from: classes.dex */
    public static final class C12513b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f58216b;

        /* renamed from: c */
        final /* synthetic */ CopyOnWriteArraySet<IEventSubscriber<?>> f58217c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12513b(Class<T> cls, CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet) {
            super(0);
            this.f58216b = cls;
            this.f58217c = copyOnWriteArraySet;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Triggering " + ((Object) this.f58216b.getName()) + " on " + this.f58217c.size() + " subscribers.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a1$c */
    /* loaded from: classes.dex */
    public static final class C12514c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f58218b;

        /* renamed from: c */
        final /* synthetic */ T f58219c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12514c(Class<T> cls, T t) {
            super(0);
            this.f58218b = cls;
            this.f58219c = t;
        }

        /* renamed from: a */
        public final String m63950a() {
            return "SDK is disabled. Not publishing event class: " + ((Object) this.f58218b.getName()) + " and message: " + this.f58219c;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return m63950a();
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a1$d */
    /* loaded from: classes.dex */
    public static final class C12515d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f58220b;

        /* renamed from: c */
        final /* synthetic */ T f58221c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12515d(Class<T> cls, T t) {
            super(0);
            this.f58220b = cls;
            this.f58221c = t;
        }

        /* renamed from: a */
        public final String m63949a() {
            return ((Object) this.f58220b.getName()) + " fired: " + this.f58221c;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return m63949a();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m28432d2 = {"T", "LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.events.EventManager$publish$3", m28418f = "EventManager.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: bo.app.a1$e */
    /* loaded from: classes.dex */
    public static final class C12516e extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: b */
        int f58222b;

        /* renamed from: c */
        final /* synthetic */ IEventSubscriber<T> f58223c;

        /* renamed from: d */
        final /* synthetic */ T f58224d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12516e(IEventSubscriber<T> iEventSubscriber, T t, Continuation<? super C12516e> continuation) {
            super(2, continuation);
            this.f58223c = iEventSubscriber;
            this.f58224d = t;
        }

        /* renamed from: a */
        public final Object m63948a(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C12516e) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C12516e(this.f58223c, this.f58224d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return m63948a(zc0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f58222b == 0) {
                ResultKt.throwOnFailure(obj);
                this.f58223c.trigger(this.f58224d);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"T", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.a1$f */
    /* loaded from: classes.dex */
    public static final class C12517f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Class<T> f58225b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12517f(Class<T> cls) {
            super(0);
            this.f58225b = cls;
        }

        /* renamed from: a */
        public final String m63947a() {
            return Intrinsics.stringPlus("Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: ", this.f58225b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return m63947a();
        }
    }

    public C12511a1(C13179v4 sdkEnablementProvider) {
        Intrinsics.checkNotNullParameter(sdkEnablementProvider, "sdkEnablementProvider");
        this.f58208a = sdkEnablementProvider;
        this.f58209b = new ConcurrentHashMap();
        this.f58210c = new ConcurrentHashMap();
        this.f58211d = new ConcurrentHashMap();
        this.f58212e = new ReentrantLock();
        this.f58213f = new ReentrantLock();
        this.f58214g = new ReentrantLock();
    }

    @Override // bo.app.InterfaceC12658g2
    /* renamed from: a */
    public <T> void mo63716a(IEventSubscriber<T> subscriber, Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        ReentrantLock reentrantLock = this.f58212e;
        reentrantLock.lock();
        try {
            m63956a(subscriber, eventClass, this.f58209b);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.InterfaceC12658g2
    /* renamed from: b */
    public <T> boolean mo63714b(IEventSubscriber<T> subscriber, Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        ReentrantLock reentrantLock = this.f58213f;
        reentrantLock.lock();
        try {
            return m63956a(subscriber, eventClass, this.f58210c);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.InterfaceC12658g2
    /* renamed from: c */
    public <T> boolean mo63713c(IEventSubscriber<T> subscriber, Class<T> eventClass) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        ReentrantLock reentrantLock = this.f58212e;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet = this.f58209b.get(eventClass);
            if (copyOnWriteArraySet == null) {
                reentrantLock.unlock();
                return false;
            }
            return m63953a(copyOnWriteArraySet, subscriber);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r3.isEmpty() == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    @Override // bo.app.InterfaceC12658g2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> void mo63715a(T t, Class<T> eventClass) {
        boolean z;
        CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet;
        Intrinsics.checkNotNullParameter(eventClass, "eventClass");
        if (this.f58208a.m62861a()) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12514c(eventClass, t), 7, null);
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12515d(eventClass, t), 7, null);
        CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet2 = this.f58209b.get(eventClass);
        boolean z2 = true;
        if (copyOnWriteArraySet2 != null) {
            Iterator<IEventSubscriber<T>> it = m63954a(eventClass, copyOnWriteArraySet2).iterator();
            while (it.hasNext()) {
                Z30.m73800d(Z10.f47750b, null, null, new C12516e(it.next(), t, null), 3, null);
            }
            if (!copyOnWriteArraySet2.isEmpty()) {
                z = true;
                copyOnWriteArraySet = this.f58210c.get(eventClass);
                if (copyOnWriteArraySet != null) {
                    Iterator<IEventSubscriber<T>> it2 = m63954a(eventClass, copyOnWriteArraySet).iterator();
                    while (it2.hasNext()) {
                        it2.next().trigger(t);
                    }
                }
                z2 = z;
                if (!z2 || t == null) {
                }
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C12517f(eventClass), 6, null);
                ReentrantLock reentrantLock = this.f58214g;
                reentrantLock.lock();
                try {
                    this.f58211d.put(eventClass, t);
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        z = false;
        copyOnWriteArraySet = this.f58210c.get(eventClass);
        if (copyOnWriteArraySet != null) {
        }
        z2 = z;
        if (z2) {
        }
    }

    @Override // bo.app.InterfaceC12658g2
    /* renamed from: a */
    public void mo63717a() {
        ReentrantLock reentrantLock = this.f58212e;
        reentrantLock.lock();
        try {
            this.f58209b.clear();
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.f58213f;
            reentrantLock2.lock();
            try {
                this.f58210c.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    private final <T> boolean m63956a(IEventSubscriber<T> iEventSubscriber, Class<T> cls, ConcurrentMap<Class<?>, CopyOnWriteArraySet<IEventSubscriber<?>>> concurrentMap) {
        CopyOnWriteArraySet<IEventSubscriber<?>> putIfAbsent;
        CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet = concurrentMap.get(cls);
        if (copyOnWriteArraySet == null && (putIfAbsent = concurrentMap.putIfAbsent(cls, (copyOnWriteArraySet = new CopyOnWriteArraySet<>()))) != null) {
            copyOnWriteArraySet = putIfAbsent;
        }
        boolean add = copyOnWriteArraySet.add(iEventSubscriber);
        m63955a(cls);
        return add;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final <T> void m63955a(Class<T> cls) {
        ReentrantLock reentrantLock = this.f58214g;
        reentrantLock.lock();
        try {
            if (this.f58211d.containsKey(cls)) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12512a(cls), 6, null);
                Object remove = this.f58211d.remove(cls);
                if (remove != null) {
                    mo63715a((C12511a1) remove, (Class<C12511a1>) cls);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    private final <T> boolean m63953a(CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet, IEventSubscriber<T> iEventSubscriber) {
        return copyOnWriteArraySet.remove(iEventSubscriber);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final <T> CopyOnWriteArraySet<IEventSubscriber<T>> m63954a(Class<T> cls, CopyOnWriteArraySet<IEventSubscriber<?>> copyOnWriteArraySet) {
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C12513b(cls, copyOnWriteArraySet), 7, null);
        return copyOnWriteArraySet;
    }
}
