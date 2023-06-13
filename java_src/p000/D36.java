package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import p000.E36;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0010\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000eH\u0082\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000eH\u0082\u0010¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR$\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\u001b\u0010\u0016R\u0011\u0010%\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"LD36;", "LE36;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "e", "()LE36;", "i", "node", "", "g", "(LE36;)Z", "b", "", "index", "h", "(I)LE36;", "", C17296a.f69688o, "(LE36;)V", "l", "(I)V", "k", "", "f", "()[LE36;", "j", "m", "(II)V", "[LE36;", "value", "c", "()I", "size", DateTokenConverter.CONVERTER_KEY, "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: D36 */
/* loaded from: classes8.dex */
public class D36<T extends E36 & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a */
    public T[] f5174a;

    @PublishedApi
    /* renamed from: a */
    public final void m110986a(T t) {
        t.mo96492b(this);
        T[] m110981f = m110981f();
        int m110984c = m110984c();
        m110977j(m110984c + 1);
        m110981f[m110984c] = t;
        t.setIndex(m110984c);
        m110975l(m110984c);
    }

    @PublishedApi
    /* renamed from: b */
    public final T m110985b() {
        T[] tArr = this.f5174a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m110984c() {
        return this._size;
    }

    /* renamed from: d */
    public final boolean m110983d() {
        return m110984c() == 0;
    }

    /* renamed from: e */
    public final T m110982e() {
        T m110985b;
        synchronized (this) {
            m110985b = m110985b();
        }
        return m110985b;
    }

    /* renamed from: f */
    public final T[] m110981f() {
        T[] tArr = this.f5174a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new E36[4];
            this.f5174a = tArr2;
            return tArr2;
        } else if (m110984c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, m110984c() * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((E36[]) copyOf);
            this.f5174a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    /* renamed from: g */
    public final boolean m110980g(T t) {
        boolean z;
        synchronized (this) {
            if (t.mo96493a() == null) {
                z = false;
            } else {
                m110979h(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    @PublishedApi
    /* renamed from: h */
    public final T m110979h(int i) {
        T[] tArr = this.f5174a;
        Intrinsics.checkNotNull(tArr);
        m110977j(m110984c() - 1);
        if (i < m110984c()) {
            m110974m(i, m110984c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                Intrinsics.checkNotNull(t);
                T t2 = tArr[i2];
                Intrinsics.checkNotNull(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m110974m(i, i2);
                    m110975l(i2);
                }
            }
            m110976k(i);
        }
        T t3 = tArr[m110984c()];
        Intrinsics.checkNotNull(t3);
        t3.mo96492b(null);
        t3.setIndex(-1);
        tArr[m110984c()] = null;
        return t3;
    }

    /* renamed from: i */
    public final T m110978i() {
        T t;
        synchronized (this) {
            if (m110984c() > 0) {
                t = m110979h(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    /* renamed from: j */
    public final void m110977j(int i) {
        this._size = i;
    }

    /* renamed from: k */
    public final void m110976k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= m110984c()) {
                return;
            }
            T[] tArr = this.f5174a;
            Intrinsics.checkNotNull(tArr);
            int i3 = i2 + 1;
            if (i3 < m110984c()) {
                T t = tArr[i3];
                Intrinsics.checkNotNull(t);
                T t2 = tArr[i2];
                Intrinsics.checkNotNull(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            Intrinsics.checkNotNull(t3);
            T t4 = tArr[i2];
            Intrinsics.checkNotNull(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m110974m(i, i2);
            i = i2;
        }
    }

    /* renamed from: l */
    public final void m110975l(int i) {
        while (i > 0) {
            T[] tArr = this.f5174a;
            Intrinsics.checkNotNull(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            Intrinsics.checkNotNull(t);
            T t2 = tArr[i];
            Intrinsics.checkNotNull(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m110974m(i, i2);
            i = i2;
        }
    }

    /* renamed from: m */
    public final void m110974m(int i, int i2) {
        T[] tArr = this.f5174a;
        Intrinsics.checkNotNull(tArr);
        T t = tArr[i2];
        Intrinsics.checkNotNull(t);
        T t2 = tArr[i];
        Intrinsics.checkNotNull(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
