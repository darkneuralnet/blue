package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00010\u0002:\u0004\b\n\u000f\u0005B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"LTX2;", "LSX2;", "", "owner", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Z", "", C17296a.f69688o, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "c", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: TX2 */
/* loaded from: classes8.dex */
public final class TX2 implements SX2 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35626a = AtomicReferenceFieldUpdater.newUpdater(TX2.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"LTX2$a;", "LTX2$b;", "LTX2;", "", "R", "", "P", "", "toString", "LWc0;", "h", "LWc0;", "cont", "", "owner", "<init>", "(LTX2;Ljava/lang/Object;LWc0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: TX2$a */
    /* loaded from: classes8.dex */
    public final class C7872a extends AbstractC7874b {

        /* renamed from: h */
        public final InterfaceC36779Wc0<Unit> f35627h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
        /* renamed from: TX2$a$a */
        /* loaded from: classes8.dex */
        public static final class C7873a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ TX2 f35629g;

            /* renamed from: h */
            public final /* synthetic */ C7872a f35630h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7873a(TX2 tx2, C7872a c7872a) {
                super(1);
                this.f35629g = tx2;
                this.f35630h = c7872a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f35629g.mo83451b(this.f35630h.f35632e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C7872a(Object obj, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
            super(obj);
            this.f35627h = interfaceC36779Wc0;
        }

        @Override // p000.TX2.AbstractC7874b
        /* renamed from: P */
        public void mo83448P() {
            this.f35627h.mo76800B(C37247Yc0.f46071a);
        }

        @Override // p000.TX2.AbstractC7874b
        /* renamed from: R */
        public boolean mo83446R() {
            if (!m83447Q() || this.f35627h.mo76786X(Unit.INSTANCE, null, new C7873a(TX2.this, this)) == null) {
                return false;
            }
            return true;
        }

        @Override // p000.C38856bx2
        public String toString() {
            return "LockCont[" + this.f35632e + ", " + this.f35627h + "] for " + TX2.this;
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LTX2$b;", "Lbx2;", "Lo51;", "", "Q", "()Z", "", "dispose", "()V", "R", "P", "", "e", "Ljava/lang/Object;", "owner", "<init>", "(LTX2;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: TX2$b */
    /* loaded from: classes8.dex */
    public abstract class AbstractC7874b extends C38856bx2 implements InterfaceC46067o51 {

        /* renamed from: g */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f35631g = AtomicIntegerFieldUpdater.newUpdater(AbstractC7874b.class, "isTaken");
        @JvmField

        /* renamed from: e */
        public final Object f35632e;
        private volatile /* synthetic */ int isTaken = 0;

        public AbstractC7874b(Object obj) {
            this.f35632e = obj;
        }

        /* renamed from: P */
        public abstract void mo83448P();

        /* renamed from: Q */
        public final boolean m83447Q() {
            return f35631g.compareAndSet(this, 0, 1);
        }

        /* renamed from: R */
        public abstract boolean mo83446R();

        @Override // p000.InterfaceC46067o51
        public final void dispose() {
            mo62093J();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LTX2$c;", "LZw2;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: TX2$c */
    /* loaded from: classes8.dex */
    public static final class C7875c extends C37663Zw2 {
        @JvmField
        public volatile Object owner;

        public C7875c(Object obj) {
            this.owner = obj;
        }

        @Override // p000.C38856bx2
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LTX2$d;", "Lrp;", "LTX2;", "affected", "", "k", "failure", "", "j", "LTX2$c;", "b", "LTX2$c;", "queue", "<init>", "(LTX2$c;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: TX2$d */
    /* loaded from: classes8.dex */
    public static final class C7876d extends AbstractC28006rp<TX2> {
        @JvmField

        /* renamed from: b */
        public final C7875c f35634b;

        public C7876d(C7875c c7875c) {
            this.f35634b = c7875c;
        }

        @Override // p000.AbstractC28006rp
        /* renamed from: j */
        public void mo15331d(TX2 tx2, Object obj) {
            Object obj2;
            if (obj == null) {
                obj2 = UX2.f37515f;
            } else {
                obj2 = this.f35634b;
            }
            C22859i1.m35391a(TX2.f35626a, tx2, this, obj2);
        }

        @Override // p000.AbstractC28006rp
        /* renamed from: k */
        public Object mo15326i(TX2 tx2) {
            C49885uX5 c49885uX5;
            if (this.f35634b.m72291P()) {
                return null;
            }
            c49885uX5 = UX2.f37511b;
            return c49885uX5;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: TX2$e */
    /* loaded from: classes8.dex */
    public static final class C7877e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Object f35636h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7877e(Object obj) {
            super(1);
            this.f35636h = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            TX2.this.mo83451b(this.f35636h);
        }
    }

    public TX2(boolean z) {
        C34188La1 c34188La1;
        if (z) {
            c34188La1 = UX2.f37514e;
        } else {
            c34188La1 = UX2.f37515f;
        }
        this._state = c34188La1;
    }

    @Override // p000.SX2
    /* renamed from: a */
    public Object mo83452a(Object obj, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        if (m83449d(obj)) {
            return Unit.INSTANCE;
        }
        Object m83450c = m83450c(obj, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m83450c == coroutine_suspended) {
            return m83450c;
        }
        return Unit.INSTANCE;
    }

    @Override // p000.SX2
    /* renamed from: b */
    public void mo83451b(Object obj) {
        C34188La1 c34188La1;
        C34188La1 c34188La12;
        C49885uX5 c49885uX5;
        C7875c c7875c;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C34188La1) {
                if (obj == null) {
                    Object obj3 = ((C34188La1) obj2).f21694a;
                    c49885uX5 = UX2.f37513d;
                    if (obj3 == c49885uX5) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    if (((C34188La1) obj2).f21694a != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + c34188La1.f21694a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35626a;
                c34188La12 = UX2.f37515f;
                if (C22859i1.m35391a(atomicReferenceFieldUpdater, this, obj2, c34188La12)) {
                    return;
                }
            } else if (obj2 instanceof AbstractC33083Gh3) {
                ((AbstractC33083Gh3) obj2).mo15332c(this);
            } else if (obj2 instanceof C7875c) {
                if (obj != null) {
                    if (((C7875c) obj2).owner != obj) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException(("Mutex is locked by " + c7875c.owner + " but expected " + obj).toString());
                    }
                }
                C7875c c7875c2 = (C7875c) obj2;
                C38856bx2 m62092K = c7875c2.m62092K();
                if (m62092K == null) {
                    C7876d c7876d = new C7876d(c7875c2);
                    if (C22859i1.m35391a(f35626a, this, obj2, c7876d) && c7876d.mo15332c(this) == null) {
                        return;
                    }
                } else {
                    AbstractC7874b abstractC7874b = (AbstractC7874b) m62092K;
                    if (abstractC7874b.mo83446R()) {
                        Object obj4 = abstractC7874b.f35632e;
                        if (obj4 == null) {
                            obj4 = UX2.f37512c;
                        }
                        c7875c2.owner = obj4;
                        abstractC7874b.mo83448P();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
        p000.C37481Zc0.m72853c(r0, r1);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m83450c(Object obj, Continuation<? super Unit> continuation) {
        Continuation intercepted;
        C49885uX5 c49885uX5;
        C34188La1 c34188La1;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        boolean z;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        C37013Xc0 m72854b = C37481Zc0.m72854b(intercepted);
        C7872a c7872a = new C7872a(obj, m72854b);
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C34188La1) {
                C34188La1 c34188La12 = (C34188La1) obj2;
                Object obj3 = c34188La12.f21694a;
                c49885uX5 = UX2.f37513d;
                if (obj3 != c49885uX5) {
                    C22859i1.m35391a(f35626a, this, obj2, new C7875c(c34188La12.f21694a));
                } else {
                    if (obj == null) {
                        c34188La1 = UX2.f37514e;
                    } else {
                        c34188La1 = new C34188La1(obj);
                    }
                    if (C22859i1.m35391a(f35626a, this, obj2, c34188La1)) {
                        m72854b.mo76767t(Unit.INSTANCE, new C7877e(obj));
                        break;
                    }
                }
            } else if (obj2 instanceof C7875c) {
                C7875c c7875c = (C7875c) obj2;
                if (c7875c.owner != obj) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c7875c.m62085s(c7872a);
                    if (this._state == obj2 || !c7872a.m83447Q()) {
                        break;
                    }
                    c7872a = new C7872a(obj, m72854b);
                } else {
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
            } else if (obj2 instanceof AbstractC33083Gh3) {
                ((AbstractC33083Gh3) obj2).mo15332c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
        Object m76770q = m72854b.m76770q();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m76770q == coroutine_suspended2) {
            return m76770q;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public boolean m83449d(Object obj) {
        C49885uX5 c49885uX5;
        C34188La1 c34188La1;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C34188La1) {
                Object obj3 = ((C34188La1) obj2).f21694a;
                c49885uX5 = UX2.f37513d;
                if (obj3 != c49885uX5) {
                    return false;
                }
                if (obj == null) {
                    c34188La1 = UX2.f37514e;
                } else {
                    c34188La1 = new C34188La1(obj);
                }
                if (C22859i1.m35391a(f35626a, this, obj2, c34188La1)) {
                    return true;
                }
            } else if (obj2 instanceof C7875c) {
                if (((C7875c) obj2).owner == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof AbstractC33083Gh3) {
                ((AbstractC33083Gh3) obj2).mo15332c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C34188La1) {
                return "Mutex[" + ((C34188La1) obj).f21694a + ']';
            } else if (obj instanceof AbstractC33083Gh3) {
                ((AbstractC33083Gh3) obj).mo15332c(this);
            } else if (obj instanceof C7875c) {
                return "Mutex[" + ((C7875c) obj).owner + ']';
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
