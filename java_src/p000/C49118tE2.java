package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u0017\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u0006J1\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00012\b\u0010\u0012\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR0\u0010\"\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R$\u0010&\u001a\u0012\u0012\u0004\u0012\u00028\u00000#j\b\u0012\u0004\u0012\u00028\u0000`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R$\u0010+\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010(R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010(R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010(¨\u00063"}, m28432d2 = {"LtE2;", "K", "V", "", "key", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "maxSize", "", "j", "f", "", "evicted", "oldValue", "newValue", "c", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "b", "i", "(Ljava/lang/Object;Ljava/lang/Object;)I", "", "toString", "g", "LRX5;", C17296a.f69688o, "LRX5;", "monitor", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "keySet", "<set-?>", "I", "h", "()I", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "<init>", "(I)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,352:1\n349#1:353\n349#1:362\n349#1:364\n349#1:366\n349#1:368\n349#1:370\n349#1:372\n24#2:354\n24#2:356\n24#2:357\n24#2:358\n24#2:359\n24#2:360\n24#2:361\n24#2:363\n24#2:365\n24#2:367\n24#2:369\n24#2:371\n24#2:373\n24#2:374\n24#2:375\n24#2:376\n1#3:355\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/compose/ui/text/caches/LruCache\n*L\n41#1:353\n296#1:362\n302#1:364\n308#1:366\n313#1:368\n318#1:370\n323#1:372\n41#1:354\n72#1:356\n87#1:357\n105#1:358\n143#1:359\n177#1:360\n219#1:361\n296#1:363\n302#1:365\n308#1:367\n313#1:369\n318#1:371\n323#1:373\n330#1:374\n340#1:375\n349#1:376\n*E\n"})
/* renamed from: tE2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C49118tE2<K, V> {

    /* renamed from: a */
    public final RX5 f110192a = CX5.m112154a();

    /* renamed from: b */
    public final HashMap<K, V> f110193b;

    /* renamed from: c */
    public final LinkedHashSet<K> f110194c;

    /* renamed from: d */
    public int f110195d;

    /* renamed from: e */
    public int f110196e;

    /* renamed from: f */
    public int f110197f;

    /* renamed from: g */
    public int f110198g;

    /* renamed from: h */
    public int f110199h;

    /* renamed from: i */
    public int f110200i;

    /* renamed from: j */
    public int f110201j;

    public C49118tE2(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f110196e = i;
            this.f110193b = new HashMap<>(0, 0.75f);
            this.f110194c = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* renamed from: b */
    public V m12576b(K k) {
        return null;
    }

    /* renamed from: c */
    public void m12575c(boolean z, K k, V v, V v2) {
    }

    /* renamed from: d */
    public final V m12574d(K k) {
        synchronized (this.f110192a) {
            V v = this.f110193b.get(k);
            if (v != null) {
                this.f110194c.remove(k);
                this.f110194c.add(k);
                this.f110200i++;
                return v;
            }
            this.f110201j++;
            V m12576b = m12576b(k);
            if (m12576b == null) {
                return null;
            }
            synchronized (this.f110192a) {
                this.f110198g++;
                V put = this.f110193b.put(k, m12576b);
                this.f110194c.remove(k);
                this.f110194c.add(k);
                if (put != null) {
                    this.f110193b.put(k, put);
                    v = put;
                } else {
                    this.f110195d = m12570h() + m12571g(k, m12576b);
                }
                Unit unit = Unit.INSTANCE;
            }
            if (v != null) {
                m12575c(false, k, m12576b, v);
                return v;
            }
            m12568j(this.f110196e);
            return m12576b;
        }
    }

    /* renamed from: e */
    public final V m12573e(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this.f110192a) {
                this.f110197f++;
                this.f110195d = m12570h() + m12571g(k, v);
                put = this.f110193b.put(k, v);
                if (put != null) {
                    this.f110195d = m12570h() - m12571g(k, put);
                }
                if (this.f110194c.contains(k)) {
                    this.f110194c.remove(k);
                }
                this.f110194c.add(k);
            }
            if (put != null) {
                m12575c(false, k, put, v);
            }
            m12568j(this.f110196e);
            return put;
        }
        throw null;
    }

    /* renamed from: f */
    public final V m12572f(K k) {
        V remove;
        k.getClass();
        synchronized (this.f110192a) {
            remove = this.f110193b.remove(k);
            this.f110194c.remove(k);
            if (remove != null) {
                this.f110195d = m12570h() - m12571g(k, remove);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (remove != null) {
            m12575c(false, k, remove, null);
        }
        return remove;
    }

    /* renamed from: g */
    public final int m12571g(K k, V v) {
        boolean z;
        int m12569i = m12569i(k, v);
        if (m12569i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m12569i;
        }
        throw new IllegalStateException(("Negative size: " + k + '=' + v).toString());
    }

    @JvmName(name = "size")
    /* renamed from: h */
    public final int m12570h() {
        int i;
        synchronized (this.f110192a) {
            i = this.f110195d;
        }
        return i;
    }

    /* renamed from: i */
    public int m12569i(K k, V v) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m12568j(int i) {
        Object obj;
        V v;
        while (true) {
            synchronized (this.f110192a) {
                if (m12570h() < 0 || ((this.f110193b.isEmpty() && m12570h() != 0) || this.f110193b.isEmpty() != this.f110194c.isEmpty())) {
                    break;
                }
                if (m12570h() > i && !this.f110193b.isEmpty()) {
                    obj = CollectionsKt___CollectionsKt.first(this.f110194c);
                    v = this.f110193b.get(obj);
                    if (v != null) {
                        TypeIntrinsics.asMutableMap(this.f110193b).remove(obj);
                        TypeIntrinsics.asMutableCollection(this.f110194c).remove(obj);
                        int m12570h = m12570h();
                        Intrinsics.checkNotNull(obj);
                        Intrinsics.checkNotNull(v);
                        this.f110195d = m12570h - m12571g(obj, v);
                        this.f110199h++;
                    } else {
                        throw new IllegalStateException("inconsistent state");
                    }
                } else {
                    obj = null;
                    v = null;
                }
                Unit unit = Unit.INSTANCE;
            }
            if (obj == null && v == null) {
                return;
            }
            Intrinsics.checkNotNull(obj);
            Intrinsics.checkNotNull(v);
            m12575c(true, obj, v, null);
        }
    }

    public String toString() {
        int i;
        String str;
        synchronized (this.f110192a) {
            int i2 = this.f110200i;
            int i3 = this.f110201j + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=" + this.f110196e + ",hits=" + this.f110200i + ",misses=" + this.f110201j + ",hitRate=" + i + "%]";
        }
        return str;
    }
}
