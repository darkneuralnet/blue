package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p000.AbstractC24679j0;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0006\u0010%\u001a\u00020\u001a\u0012\u0006\u0010)\u001a\u00020&\u0012 \u0010F\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0017\u0018\u00010Dj\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`E¢\u0006\u0004\bG\u0010HJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010$R\u0014\u00107\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010;\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010=\u001a\u00020\u00138DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u00106R\u0014\u0010>\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0014\u0010@\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00106R\u0014\u0010C\u001a\u00020A8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b,\u0010B¨\u0006I"}, m28432d2 = {"Lno;", "E", "Lj0;", "element", "", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lxs5;", "send", DateTokenConverter.CONVERTER_KEY, "(Lxs5;)Ljava/lang/Object;", "X", "()Ljava/lang/Object;", "Lrr5;", "select", "Y", "(Lrr5;)Ljava/lang/Object;", "Ljs4;", "receive", "", "N", "(Ljs4;)Z", "wasClosed", "", "T", "(Z)V", "", "currentSize", "LuX5;", "f0", "(I)LuX5;", "d0", "(ILjava/lang/Object;)V", "e0", "(I)V", "e", "I", "capacity", "Lk30;", "f", "Lk30;", "onBufferOverflow", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "h", "[Ljava/lang/Object;", "buffer", "i", "head", "P", "()Z", "isBufferAlwaysEmpty", "Q", "isBufferEmpty", "t", "isBufferAlwaysFull", "u", "isBufferFull", "isEmpty", "R", "isClosedForReceive", "", "()Ljava/lang/String;", "bufferDebugString", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILk30;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: no */
/* loaded from: classes8.dex */
public class C26596no<E> extends AbstractC24679j0<E> {

    /* renamed from: e */
    public final int f100530e;

    /* renamed from: f */
    public final EnumC43674k30 f100531f;

    /* renamed from: g */
    public final ReentrantLock f100532g;

    /* renamed from: h */
    public Object[] f100533h;

    /* renamed from: i */
    public int f100534i;
    private volatile /* synthetic */ int size;

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: no$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C26597a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC43674k30.values().length];
            iArr[EnumC43674k30.SUSPEND.ordinal()] = 1;
            iArr[EnumC43674k30.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC43674k30.DROP_OLDEST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C26596no(int i, EnumC43674k30 enumC43674k30, Function1<? super E, Unit> function1) {
        super(function1);
        this.f100530e = i;
        this.f100531f = enumC43674k30;
        if (i >= 1) {
            this.f100532g = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            ArraysKt___ArraysJvmKt.fill$default(objArr, C25076k0.f93730a, 0, 0, 6, (Object) null);
            this.f100533h = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: N */
    public boolean mo23137N(AbstractC43569js4<? super E> abstractC43569js4) {
        ReentrantLock reentrantLock = this.f100532g;
        reentrantLock.lock();
        try {
            return super.mo23137N(abstractC43569js4);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: P */
    public final boolean mo11167P() {
        return false;
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: Q */
    public final boolean mo11166Q() {
        return this.size == 0;
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: R */
    public boolean mo23136R() {
        ReentrantLock reentrantLock = this.f100532g;
        reentrantLock.lock();
        try {
            return super.mo23136R();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: T */
    public void mo23135T(boolean z) {
        Function1<E, Unit> function1 = this.f93766b;
        ReentrantLock reentrantLock = this.f100532g;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f100533h[this.f100534i];
                if (function1 != null && obj != C25076k0.f93730a) {
                    undeliveredElementException = C47016ph3.m18973c(function1, obj, undeliveredElementException);
                }
                Object[] objArr = this.f100533h;
                int i3 = this.f100534i;
                objArr[i3] = C25076k0.f93730a;
                this.f100534i = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            super.mo23135T(z);
            if (undeliveredElementException == null) {
                return;
            }
            throw undeliveredElementException;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // p000.AbstractC24679j0
    /* renamed from: X */
    public Object mo23134X() {
        ReentrantLock reentrantLock = this.f100532g;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object m29469k = m29469k();
                if (m29469k == null) {
                    m29469k = C25076k0.f93733d;
                }
                return m29469k;
            }
            Object[] objArr = this.f100533h;
            int i2 = this.f100534i;
            Object obj = objArr[i2];
            AbstractC51870xs5 abstractC51870xs5 = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C25076k0.f93733d;
            boolean z = false;
            if (i == this.f100530e) {
                AbstractC51870xs5 abstractC51870xs52 = null;
                while (true) {
                    AbstractC51870xs5 m29474C = m29474C();
                    if (m29474C == null) {
                        abstractC51870xs5 = abstractC51870xs52;
                        break;
                    }
                    Intrinsics.checkNotNull(m29474C);
                    if (m29474C.mo195T(null) != null) {
                        obj2 = m29474C.mo197Q();
                        z = true;
                        abstractC51870xs5 = m29474C;
                        break;
                    }
                    m29474C.mo4531U();
                    abstractC51870xs52 = m29474C;
                }
            }
            if (obj2 != C25076k0.f93733d && !(obj2 instanceof C32180Cl0)) {
                this.size = i;
                Object[] objArr2 = this.f100533h;
                objArr2[(this.f100534i + i) % objArr2.length] = obj2;
            }
            this.f100534i = (this.f100534i + 1) % this.f100533h.length;
            Unit unit = Unit.INSTANCE;
            if (z) {
                Intrinsics.checkNotNull(abstractC51870xs5);
                abstractC51870xs5.mo198P();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x000f, B:10:0x0015, B:12:0x0029, B:14:0x0033, B:30:0x0081, B:32:0x0085, B:34:0x0089, B:40:0x00ab, B:35:0x0095, B:37:0x009b, B:15:0x0043, B:17:0x0047, B:19:0x004b, B:21:0x0051, B:24:0x005d, B:27:0x0065, B:28:0x007f), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    @Override // p000.AbstractC24679j0
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo23133Y(InterfaceC48304rr5<?> interfaceC48304rr5) {
        boolean z;
        ReentrantLock reentrantLock = this.f100532g;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object m29469k = m29469k();
                if (m29469k == null) {
                    m29469k = C25076k0.f93733d;
                }
                return m29469k;
            }
            Object[] objArr = this.f100533h;
            int i2 = this.f100534i;
            Object obj = objArr[i2];
            AbstractC51870xs5 abstractC51870xs5 = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C25076k0.f93733d;
            if (i == this.f100530e) {
                while (true) {
                    AbstractC24679j0.C24686g<E> m31297K = m31297K();
                    Object mo15175h = interfaceC48304rr5.mo15175h(m31297K);
                    if (mo15175h == null) {
                        abstractC51870xs5 = m31297K.m62070o();
                        Intrinsics.checkNotNull(abstractC51870xs5);
                        obj2 = abstractC51870xs5.mo197Q();
                        z = true;
                        break;
                    } else if (mo15175h == C25076k0.f93733d) {
                        break;
                    } else if (mo15175h != C27694qp.f105860b) {
                        if (mo15175h == C48896sr5.m13571d()) {
                            this.size = i;
                            this.f100533h[this.f100534i] = obj;
                            return mo15175h;
                        } else if (mo15175h instanceof C32180Cl0) {
                            z = true;
                            obj2 = mo15175h;
                            abstractC51870xs5 = obj2;
                        } else {
                            throw new IllegalStateException(("performAtomicTrySelect(describeTryOffer) returned " + mo15175h).toString());
                        }
                    }
                }
                if (obj2 == C25076k0.f93733d && !(obj2 instanceof C32180Cl0)) {
                    this.size = i;
                    Object[] objArr2 = this.f100533h;
                    objArr2[(this.f100534i + i) % objArr2.length] = obj2;
                } else if (!interfaceC48304rr5.mo15172l()) {
                    this.size = i;
                    this.f100533h[this.f100534i] = obj;
                    return C48896sr5.m13571d();
                }
                this.f100534i = (this.f100534i + 1) % this.f100533h.length;
                Unit unit = Unit.INSTANCE;
                if (z) {
                    Intrinsics.checkNotNull(abstractC51870xs5);
                    abstractC51870xs5.mo198P();
                }
                return obj;
            }
            z = false;
            if (obj2 == C25076k0.f93733d) {
            }
            if (!interfaceC48304rr5.mo15172l()) {
            }
            this.f100534i = (this.f100534i + 1) % this.f100533h.length;
            Unit unit2 = Unit.INSTANCE;
            if (z) {
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: d */
    public Object mo23132d(AbstractC51870xs5 abstractC51870xs5) {
        ReentrantLock reentrantLock = this.f100532g;
        reentrantLock.lock();
        try {
            return super.mo23132d(abstractC51870xs5);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: d0 */
    public final void m23131d0(int i, E e) {
        if (i < this.f100530e) {
            m23130e0(i);
            Object[] objArr = this.f100533h;
            objArr[(this.f100534i + i) % objArr.length] = e;
            return;
        }
        Object[] objArr2 = this.f100533h;
        int i2 = this.f100534i;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = e;
        this.f100534i = (i2 + 1) % objArr2.length;
    }

    /* renamed from: e0 */
    public final void m23130e0(int i) {
        Object[] objArr = this.f100533h;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f100530e);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f100533h;
                objArr2[i2] = objArr3[(this.f100534i + i2) % objArr3.length];
            }
            ArraysKt___ArraysJvmKt.fill((C49885uX5[]) objArr2, C25076k0.f93730a, i, min);
            this.f100533h = objArr2;
            this.f100534i = 0;
        }
    }

    /* renamed from: f0 */
    public final C49885uX5 m23129f0(int i) {
        if (i < this.f100530e) {
            this.size = i + 1;
            return null;
        }
        int i2 = C26597a.$EnumSwitchMapping$0[this.f100531f.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C25076k0.f93731b;
        }
        return C25076k0.f93732c;
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: g */
    public String mo23128g() {
        return "(buffer:capacity=" + this.f100530e + ",size=" + this.size + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // p000.AbstractC24679j0, p000.InterfaceC44162ks4
    public boolean isEmpty() {
        ReentrantLock reentrantLock = this.f100532g;
        reentrantLock.lock();
        try {
            return m31294S();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: t */
    public final boolean mo11165t() {
        return false;
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: u */
    public final boolean mo11164u() {
        return this.size == this.f100530e && this.f100531f == EnumC43674k30.SUSPEND;
    }

    @Override // p000.AbstractC25077k1
    /* renamed from: w */
    public Object mo23127w(E e) {
        InterfaceC44755ls4<E> mo29475B;
        ReentrantLock reentrantLock = this.f100532g;
        reentrantLock.lock();
        try {
            int i = this.size;
            C32180Cl0<?> m29469k = m29469k();
            if (m29469k != null) {
                return m29469k;
            }
            C49885uX5 m23129f0 = m23129f0(i);
            if (m23129f0 != null) {
                return m23129f0;
            }
            if (i == 0) {
                do {
                    mo29475B = mo29475B();
                    if (mo29475B != null) {
                        if (mo29475B instanceof C32180Cl0) {
                            this.size = i;
                            return mo29475B;
                        }
                        Intrinsics.checkNotNull(mo29475B);
                    }
                } while (mo29475B.mo26719g(e, null) == null);
                this.size = i;
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
                mo29475B.mo26720f(e);
                return mo29475B.mo26721a();
            }
            m23131d0(i, e);
            return C25076k0.f93731b;
        } finally {
            reentrantLock.unlock();
        }
    }
}
