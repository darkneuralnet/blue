package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.time.DurationKt;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.InterfaceC47527qZ0;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489.:B\u0007¢\u0006\u0004\b7\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00032\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0004¢\u0006\u0004\b \u0010\u0005J\u001b\u0010\"\u001a\u00020!2\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010\u0005R$\u00102\u001a\u00020!2\u0006\u0010-\u001a\u00020!8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0013¨\u0006;"}, m28432d2 = {"LLg1;", "LMg1;", "LqZ0;", "", "shutdown", "()V", "", "timeMillis", "LWc0;", "continuation", "l", "(JLWc0;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lo51;", "y0", "(JLjava/lang/Runnable;)Lo51;", "c0", "()J", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "y", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "o0", "(Ljava/lang/Runnable;)V", "now", "LLg1$c;", "delayedTask", "v0", "(JLLg1$c;)V", AbstractC26684u0.f100690q, "", "p0", "(Ljava/lang/Runnable;)Z", "n0", "()Ljava/lang/Runnable;", "m0", "B0", "(LLg1$c;)Z", "", "w0", "(JLLg1$c;)I", "t0", "value", "c", "()Z", "z0", "(Z)V", "isCompleted", "r0", "isEmpty", "V", "nextTime", "<init>", C17296a.f69688o, "b", DateTokenConverter.CONVERTER_KEY, "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Lg1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC34242Lg1 extends AbstractC34476Mg1 implements InterfaceC47527qZ0 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21885f = AtomicReferenceFieldUpdater.newUpdater(AbstractC34242Lg1.class, Object.class, "_queue");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21886g = AtomicReferenceFieldUpdater.newUpdater(AbstractC34242Lg1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m28432d2 = {"LLg1$a;", "LLg1$c;", "", "run", "", "toString", "LWc0;", DateTokenConverter.CONVERTER_KEY, "LWc0;", "cont", "", "nanoTime", "<init>", "(LLg1;JLWc0;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Lg1$a */
    /* loaded from: classes8.dex */
    public final class C5057a extends AbstractRunnableC5059c {

        /* renamed from: d */
        public final InterfaceC36779Wc0<Unit> f21887d;

        /* JADX WARN: Multi-variable type inference failed */
        public C5057a(long j, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
            super(j);
            this.f21887d = interfaceC36779Wc0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21887d.mo76787S(AbstractC34242Lg1.this, Unit.INSTANCE);
        }

        @Override // p000.AbstractC34242Lg1.AbstractRunnableC5059c
        public String toString() {
            return super.toString() + this.f21887d;
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m28432d2 = {"LLg1$b;", "LLg1$c;", "", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Lg1$b */
    /* loaded from: classes8.dex */
    public static final class C5058b extends AbstractRunnableC5059c {

        /* renamed from: d */
        public final Runnable f21889d;

        public C5058b(long j, Runnable runnable) {
            super(j);
            this.f21889d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f21889d.run();
        }

        @Override // p000.AbstractC34242Lg1.AbstractRunnableC5059c
        public String toString() {
            return super.toString() + this.f21889d;
        }
    }

    @Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b(\u0010)J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"2\f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b\u0016\u0010&¨\u0006*"}, m28432d2 = {"LLg1$c;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lo51;", "LE36;", LegacyRepairType.OTHER_KEY, "", "c", "", "now", "", "f", "LLg1$d;", "delayed", "LLg1;", "eventLoop", "e", "", "dispose", "", "toString", "b", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "LD36;", "value", C17296a.f69688o, "()LD36;", "(LD36;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Lg1$c */
    /* loaded from: classes8.dex */
    public static abstract class AbstractRunnableC5059c implements Runnable, Comparable<AbstractRunnableC5059c>, InterfaceC46067o51, E36 {
        private volatile Object _heap;
        @JvmField

        /* renamed from: b */
        public long f21890b;

        /* renamed from: c */
        public int f21891c = -1;

        public AbstractRunnableC5059c(long j) {
            this.f21890b = j;
        }

        @Override // p000.E36
        /* renamed from: a */
        public D36<?> mo96493a() {
            Object obj = this._heap;
            if (obj instanceof D36) {
                return (D36) obj;
            }
            return null;
        }

        @Override // p000.E36
        /* renamed from: b */
        public void mo96492b(D36<?> d36) {
            C49885uX5 c49885uX5;
            boolean z;
            Object obj = this._heap;
            c49885uX5 = C34944Og1.f27027a;
            if (obj != c49885uX5) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = d36;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // java.lang.Comparable
        /* renamed from: c */
        public int compareTo(AbstractRunnableC5059c abstractRunnableC5059c) {
            int i = ((this.f21890b - abstractRunnableC5059c.f21890b) > 0L ? 1 : ((this.f21890b - abstractRunnableC5059c.f21890b) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        @Override // p000.InterfaceC46067o51
        public final synchronized void dispose() {
            C49885uX5 c49885uX5;
            C5060d c5060d;
            C49885uX5 c49885uX52;
            Object obj = this._heap;
            c49885uX5 = C34944Og1.f27027a;
            if (obj == c49885uX5) {
                return;
            }
            if (obj instanceof C5060d) {
                c5060d = (C5060d) obj;
            } else {
                c5060d = null;
            }
            if (c5060d != null) {
                c5060d.m110980g(this);
            }
            c49885uX52 = C34944Og1.f27027a;
            this._heap = c49885uX52;
        }

        /* renamed from: e */
        public final synchronized int m96490e(long j, C5060d c5060d, AbstractC34242Lg1 abstractC34242Lg1) {
            C49885uX5 c49885uX5;
            Object obj = this._heap;
            c49885uX5 = C34944Og1.f27027a;
            if (obj == c49885uX5) {
                return 2;
            }
            synchronized (c5060d) {
                AbstractRunnableC5059c m110985b = c5060d.m110985b();
                if (abstractC34242Lg1.m96506c()) {
                    return 1;
                }
                if (m110985b == null) {
                    c5060d.f21892b = j;
                } else {
                    long j2 = m110985b.f21890b;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - c5060d.f21892b > 0) {
                        c5060d.f21892b = j;
                    }
                }
                long j3 = this.f21890b;
                long j4 = c5060d.f21892b;
                if (j3 - j4 < 0) {
                    this.f21890b = j4;
                }
                c5060d.m110986a(this);
                return 0;
            }
        }

        /* renamed from: f */
        public final boolean m96489f(long j) {
            return j - this.f21890b >= 0;
        }

        @Override // p000.E36
        public int getIndex() {
            return this.f21891c;
        }

        @Override // p000.E36
        public void setIndex(int i) {
            this.f21891c = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f21890b + ']';
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, m28432d2 = {"LLg1$d;", "LD36;", "LLg1$c;", "", "b", "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Lg1$d */
    /* loaded from: classes8.dex */
    public static final class C5060d extends D36<AbstractRunnableC5059c> {
        @JvmField

        /* renamed from: b */
        public long f21892b;

        public C5060d(long j) {
            this.f21892b = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: c */
    public final boolean m96506c() {
        return this._isCompleted;
    }

    /* renamed from: B0 */
    public final boolean m96508B0(AbstractRunnableC5059c abstractRunnableC5059c) {
        C5060d c5060d = (C5060d) this._delayed;
        return (c5060d != null ? c5060d.m110982e() : null) == abstractRunnableC5059c;
    }

    @Override // p000.AbstractC34008Kg1
    /* renamed from: V */
    public long mo96507V() {
        AbstractRunnableC5059c m110982e;
        long nanoTime;
        long coerceAtLeast;
        C49885uX5 c49885uX5;
        if (super.mo96507V() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C40652ex2) {
                if (!((C40652ex2) obj).m42355g()) {
                    return 0L;
                }
            } else {
                c49885uX5 = C34944Og1.f27028b;
                if (obj != c49885uX5) {
                    return 0L;
                }
                return LongCompanionObject.MAX_VALUE;
            }
        }
        C5060d c5060d = (C5060d) this._delayed;
        if (c5060d == null || (m110982e = c5060d.m110982e()) == null) {
            return LongCompanionObject.MAX_VALUE;
        }
        long j = m110982e.f21890b;
        AbstractC28153s1 m13249a = C28498t1.m13249a();
        if (m13249a != null) {
            nanoTime = m13249a.m14889a();
        } else {
            nanoTime = System.nanoTime();
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j - nanoTime, 0L);
        return coerceAtLeast;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057  */
    @Override // p000.AbstractC34008Kg1
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo96505c0() {
        Runnable m96502n0;
        long nanoTime;
        AbstractRunnableC5059c abstractRunnableC5059c;
        boolean z;
        if (m98565f0()) {
            return 0L;
        }
        C5060d c5060d = (C5060d) this._delayed;
        if (c5060d != null && !c5060d.m110983d()) {
            AbstractC28153s1 m13249a = C28498t1.m13249a();
            if (m13249a != null) {
                nanoTime = m13249a.m14889a();
            } else {
                nanoTime = System.nanoTime();
            }
            do {
                synchronized (c5060d) {
                    AbstractRunnableC5059c m110985b = c5060d.m110985b();
                    abstractRunnableC5059c = null;
                    if (m110985b != null) {
                        AbstractRunnableC5059c abstractRunnableC5059c2 = m110985b;
                        if (abstractRunnableC5059c2.m96489f(nanoTime)) {
                            z = m96501p0(abstractRunnableC5059c2);
                        } else {
                            z = false;
                        }
                        if (z) {
                            abstractRunnableC5059c = c5060d.m110979h(0);
                        }
                    }
                }
            } while (abstractRunnableC5059c != null);
            m96502n0 = m96502n0();
            if (m96502n0 == null) {
            }
        } else {
            m96502n0 = m96502n0();
            if (m96502n0 == null) {
                m96502n0.run();
                return 0L;
            }
            return mo96507V();
        }
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: l */
    public void mo14152l(long j, InterfaceC36779Wc0<? super Unit> interfaceC36779Wc0) {
        long nanoTime;
        long m91701c = C34944Og1.m91701c(j);
        if (m91701c < DurationKt.MAX_MILLIS) {
            AbstractC28153s1 m13249a = C28498t1.m13249a();
            if (m13249a != null) {
                nanoTime = m13249a.m14889a();
            } else {
                nanoTime = System.nanoTime();
            }
            C5057a c5057a = new C5057a(m91701c + nanoTime, interfaceC36779Wc0);
            m96497v0(nanoTime, c5057a);
            C37481Zc0.m72855a(interfaceC36779Wc0, c5057a);
        }
    }

    /* renamed from: m0 */
    public final void m96503m0() {
        C49885uX5 c49885uX5;
        C49885uX5 c49885uX52;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21885f;
                c49885uX5 = C34944Og1.f27028b;
                if (C22859i1.m35391a(atomicReferenceFieldUpdater, this, null, c49885uX5)) {
                    return;
                }
            } else if (obj instanceof C40652ex2) {
                ((C40652ex2) obj).m42358d();
                return;
            } else {
                c49885uX52 = C34944Og1.f27028b;
                if (obj == c49885uX52) {
                    return;
                }
                C40652ex2 c40652ex2 = new C40652ex2(8, true);
                c40652ex2.m42361a((Runnable) obj);
                if (C22859i1.m35391a(f21885f, this, obj, c40652ex2)) {
                    return;
                }
            }
        }
    }

    /* renamed from: n0 */
    public final Runnable m96502n0() {
        C49885uX5 c49885uX5;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C40652ex2) {
                C40652ex2 c40652ex2 = (C40652ex2) obj;
                Object m42352j = c40652ex2.m42352j();
                if (m42352j != C40652ex2.f79192h) {
                    return (Runnable) m42352j;
                }
                C22859i1.m35391a(f21885f, this, obj, c40652ex2.m42353i());
            } else {
                c49885uX5 = C34944Og1.f27028b;
                if (obj == c49885uX5) {
                    return null;
                }
                if (C22859i1.m35391a(f21885f, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: o0 */
    public void mo71241o0(Runnable runnable) {
        if (m96501p0(runnable)) {
            m95068k0();
        } else {
            RunnableC38004aX0.f50615h.mo71241o0(runnable);
        }
    }

    /* renamed from: p0 */
    public final boolean m96501p0(Runnable runnable) {
        C49885uX5 c49885uX5;
        while (true) {
            Object obj = this._queue;
            if (m96506c()) {
                return false;
            }
            if (obj == null) {
                if (C22859i1.m35391a(f21885f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C40652ex2) {
                C40652ex2 c40652ex2 = (C40652ex2) obj;
                int m42361a = c40652ex2.m42361a(runnable);
                if (m42361a == 0) {
                    return true;
                }
                if (m42361a != 1) {
                    if (m42361a == 2) {
                        return false;
                    }
                } else {
                    C22859i1.m35391a(f21885f, this, obj, c40652ex2.m42353i());
                }
            } else {
                c49885uX5 = C34944Og1.f27028b;
                if (obj == c49885uX5) {
                    return false;
                }
                C40652ex2 c40652ex22 = new C40652ex2(8, true);
                c40652ex22.m42361a((Runnable) obj);
                c40652ex22.m42361a(runnable);
                if (C22859i1.m35391a(f21885f, this, obj, c40652ex22)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: r0 */
    public boolean m96500r0() {
        C49885uX5 c49885uX5;
        if (!m98566b0()) {
            return false;
        }
        C5060d c5060d = (C5060d) this._delayed;
        if (c5060d != null && !c5060d.m110983d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C40652ex2) {
                return ((C40652ex2) obj).m42355g();
            }
            c49885uX5 = C34944Og1.f27028b;
            if (obj != c49885uX5) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC34008Kg1
    public void shutdown() {
        C51387x36.f117057a.m5887c();
        m96494z0(true);
        m96503m0();
        do {
        } while (mo96505c0() <= 0);
        m96499t0();
    }

    @Override // p000.InterfaceC47527qZ0
    /* renamed from: t */
    public InterfaceC46067o51 mo14151t(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return InterfaceC47527qZ0.C27616a.m17456a(this, j, runnable, coroutineContext);
    }

    /* renamed from: t0 */
    public final void m96499t0() {
        long nanoTime;
        AbstractRunnableC5059c m110978i;
        AbstractC28153s1 m13249a = C28498t1.m13249a();
        if (m13249a != null) {
            nanoTime = m13249a.m14889a();
        } else {
            nanoTime = System.nanoTime();
        }
        while (true) {
            C5060d c5060d = (C5060d) this._delayed;
            if (c5060d != null && (m110978i = c5060d.m110978i()) != null) {
                mo71242j0(nanoTime, m110978i);
            } else {
                return;
            }
        }
    }

    /* renamed from: u0 */
    public final void m96498u0() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: v0 */
    public final void m96497v0(long j, AbstractRunnableC5059c abstractRunnableC5059c) {
        int m96496w0 = m96496w0(j, abstractRunnableC5059c);
        if (m96496w0 != 0) {
            if (m96496w0 != 1) {
                if (m96496w0 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            mo71242j0(j, abstractRunnableC5059c);
        } else if (m96508B0(abstractRunnableC5059c)) {
            m95068k0();
        }
    }

    /* renamed from: w0 */
    public final int m96496w0(long j, AbstractRunnableC5059c abstractRunnableC5059c) {
        if (m96506c()) {
            return 1;
        }
        C5060d c5060d = (C5060d) this._delayed;
        if (c5060d == null) {
            C22859i1.m35391a(f21886g, this, null, new C5060d(j));
            Object obj = this._delayed;
            Intrinsics.checkNotNull(obj);
            c5060d = (C5060d) obj;
        }
        return abstractRunnableC5059c.m96490e(j, c5060d, this);
    }

    @Override // p000.SC0
    /* renamed from: y */
    public final void mo14150y(CoroutineContext coroutineContext, Runnable runnable) {
        mo71241o0(runnable);
    }

    /* renamed from: y0 */
    public final InterfaceC46067o51 m96495y0(long j, Runnable runnable) {
        long nanoTime;
        long m91701c = C34944Og1.m91701c(j);
        if (m91701c < DurationKt.MAX_MILLIS) {
            AbstractC28153s1 m13249a = C28498t1.m13249a();
            if (m13249a != null) {
                nanoTime = m13249a.m14889a();
            } else {
                nanoTime = System.nanoTime();
            }
            C5058b c5058b = new C5058b(m91701c + nanoTime, runnable);
            m96497v0(nanoTime, c5058b);
            return c5058b;
        }
        return W83.f40466b;
    }

    /* renamed from: z0 */
    public final void m96494z0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }
}
