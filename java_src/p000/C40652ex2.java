package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b\u0000\u0018\u0000 \u0010*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\b\u001cB\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b'\u0010(J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0005R\u0011\u0010&\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, m28432d2 = {"Lex2;", "", "E", "", DateTokenConverter.CONVERTER_KEY, "()Z", "element", "", C17296a.f69688o, "(Ljava/lang/Object;)I", "j", "()Ljava/lang/Object;", "i", "()Lex2;", "index", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lex2;", "oldHead", "newHead", "k", "(II)Lex2;", "", "h", "()J", TransferTable.COLUMN_STATE, "c", "(J)Lex2;", "b", "I", "capacity", "Z", "singleConsumer", "mask", "g", "isEmpty", "f", "()I", "size", "<init>", "(IZ)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: ex2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40652ex2<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f79193a;

    /* renamed from: b */
    public final boolean f79194b;

    /* renamed from: c */
    public final int f79195c;

    /* renamed from: d */
    public /* synthetic */ AtomicReferenceArray f79196d;

    /* renamed from: e */
    public static final C20150a f79189e = new C20150a(null);
    @JvmField

    /* renamed from: h */
    public static final C49885uX5 f79192h = new C49885uX5("REMOVE_FROZEN");

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f79190f = AtomicReferenceFieldUpdater.newUpdater(C40652ex2.class, Object.class, "_next");

    /* renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f79191g = AtomicLongFieldUpdater.newUpdater(C40652ex2.class, "_state");

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004J\u0012\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005J\n\u0010\n\u001a\u00020\u0005*\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\fR\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\fR\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\f¨\u0006!"}, m28432d2 = {"Lex2$a;", "", "", LegacyRepairType.OTHER_KEY, DateTokenConverter.CONVERTER_KEY, "", "newHead", "b", "newTail", "c", C17296a.f69688o, "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "LuX5;", "REMOVE_FROZEN", "LuX5;", "TAIL_MASK", "TAIL_SHIFT", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: ex2$a */
    /* loaded from: classes8.dex */
    public static final class C20150a {
        public /* synthetic */ C20150a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int m42350a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m42349b(long j, int i) {
            return m42347d(j, 1073741823L) | (i << 0);
        }

        /* renamed from: c */
        public final long m42348c(long j, int i) {
            return m42347d(j, 1152921503533105152L) | (i << 30);
        }

        /* renamed from: d */
        public final long m42347d(long j, long j2) {
            return j & (~j2);
        }

        private C20150a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lex2$b;", "", "", C17296a.f69688o, "I", "index", "<init>", "(I)V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: ex2$b */
    /* loaded from: classes8.dex */
    public static final class C20151b {
        @JvmField

        /* renamed from: a */
        public final int f79197a;

        public C20151b(int i) {
            this.f79197a = i;
        }
    }

    public C40652ex2(int i, boolean z) {
        boolean z2;
        this.f79193a = i;
        this.f79194b = z;
        int i2 = i - 1;
        this.f79195c = i2;
        this.f79196d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((i & i2) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m42361a(E e) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return f79189e.m42350a(j);
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f79195c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.f79194b && this.f79196d.get(i2 & i3) != null) {
                int i4 = this.f79193a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    break;
                }
            } else if (f79191g.compareAndSet(this, j, f79189e.m42348c(j, (i2 + 1) & 1073741823))) {
                this.f79196d.set(i2 & i3, e);
                C40652ex2<E> c40652ex2 = this;
                while ((c40652ex2._state & 1152921504606846976L) != 0 && (c40652ex2 = c40652ex2.m42353i().m42357e(i2, e)) != null) {
                }
                return 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final C40652ex2<E> m42360b(long j) {
        C40652ex2<E> c40652ex2 = new C40652ex2<>(this.f79193a * 2, this.f79194b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f79195c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f79196d.get(i3 & i);
                if (obj == null) {
                    obj = new C20151b(i);
                }
                c40652ex2.f79196d.set(c40652ex2.f79195c & i, obj);
                i++;
            } else {
                c40652ex2._state = f79189e.m42347d(j, 1152921504606846976L);
                return c40652ex2;
            }
        }
    }

    /* renamed from: c */
    public final C40652ex2<E> m42359c(long j) {
        while (true) {
            C40652ex2<E> c40652ex2 = (C40652ex2) this._next;
            if (c40652ex2 != null) {
                return c40652ex2;
            }
            C22859i1.m35391a(f79190f, this, null, m42360b(j));
        }
    }

    /* renamed from: d */
    public final boolean m42358d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f79191g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: e */
    public final C40652ex2<E> m42357e(int i, E e) {
        Object obj = this.f79196d.get(this.f79195c & i);
        if ((obj instanceof C20151b) && ((C20151b) obj).f79197a == i) {
            this.f79196d.set(i & this.f79195c, e);
            return this;
        }
        return null;
    }

    /* renamed from: f */
    public final int m42356f() {
        long j = this._state;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean m42355g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: h */
    public final long m42354h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f79191g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: i */
    public final C40652ex2<E> m42353i() {
        return m42359c(m42354h());
    }

    /* renamed from: j */
    public final Object m42352j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f79192h;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = this.f79195c;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i & i2)) {
                return null;
            }
            Object obj = this.f79196d.get(i2 & i);
            if (obj == null) {
                if (this.f79194b) {
                    return null;
                }
            } else if (obj instanceof C20151b) {
                return null;
            } else {
                int i3 = (i + 1) & 1073741823;
                if (f79191g.compareAndSet(this, j, f79189e.m42349b(j, i3))) {
                    this.f79196d.set(this.f79195c & i, null);
                    return obj;
                } else if (this.f79194b) {
                    C40652ex2<E> c40652ex2 = this;
                    do {
                        c40652ex2 = c40652ex2.m42351k(i, i3);
                    } while (c40652ex2 != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: k */
    public final C40652ex2<E> m42351k(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            i3 = (int) ((1073741823 & j) >> 0);
            if ((1152921504606846976L & j) != 0) {
                return m42353i();
            }
        } while (!f79191g.compareAndSet(this, j, f79189e.m42349b(j, i2)));
        this.f79196d.set(i3 & this.f79195c, null);
        return null;
    }
}
