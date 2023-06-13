package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: uE2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49711uE2<T, Y> {

    /* renamed from: a */
    public final Map<T, C29122a<Y>> f111994a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f111995b;

    /* renamed from: c */
    public long f111996c;

    /* renamed from: d */
    public long f111997d;

    /* renamed from: uE2$a */
    /* loaded from: classes5.dex */
    public static final class C29122a<Y> {

        /* renamed from: a */
        public final Y f111998a;

        /* renamed from: b */
        public final int f111999b;

        public C29122a(Y y, int i) {
            this.f111998a = y;
            this.f111999b = i;
        }
    }

    public C49711uE2(long j) {
        this.f111995b = j;
        this.f111996c = j;
    }

    /* renamed from: b */
    public void m10527b() {
        m10521m(0L);
    }

    /* renamed from: f */
    public final void m10526f() {
        m10521m(this.f111996c);
    }

    /* renamed from: g */
    public synchronized Y m10525g(T t) {
        Y y;
        C29122a<Y> c29122a = this.f111994a.get(t);
        if (c29122a != null) {
            y = c29122a.f111998a;
        } else {
            y = null;
        }
        return y;
    }

    /* renamed from: h */
    public synchronized long m10524h() {
        return this.f111996c;
    }

    /* renamed from: i */
    public int mo3792i(Y y) {
        return 1;
    }

    /* renamed from: j */
    public void mo3791j(T t, Y y) {
    }

    /* renamed from: k */
    public synchronized Y m10523k(T t, Y y) {
        C29122a<Y> c29122a;
        int mo3792i = mo3792i(y);
        long j = mo3792i;
        Y y2 = null;
        if (j >= this.f111996c) {
            mo3791j(t, y);
            return null;
        }
        if (y != null) {
            this.f111997d += j;
        }
        Map<T, C29122a<Y>> map = this.f111994a;
        if (y == null) {
            c29122a = null;
        } else {
            c29122a = new C29122a<>(y, mo3792i);
        }
        C29122a<Y> put = map.put(t, c29122a);
        if (put != null) {
            this.f111997d -= put.f111999b;
            if (!put.f111998a.equals(y)) {
                mo3791j(t, put.f111998a);
            }
        }
        m10526f();
        if (put != null) {
            y2 = put.f111998a;
        }
        return y2;
    }

    /* renamed from: l */
    public synchronized Y m10522l(T t) {
        C29122a<Y> remove = this.f111994a.remove(t);
        if (remove == null) {
            return null;
        }
        this.f111997d -= remove.f111999b;
        return remove.f111998a;
    }

    /* renamed from: m */
    public synchronized void m10521m(long j) {
        while (this.f111997d > j) {
            Iterator<Map.Entry<T, C29122a<Y>>> it = this.f111994a.entrySet().iterator();
            Map.Entry<T, C29122a<Y>> next = it.next();
            C29122a<Y> value = next.getValue();
            this.f111997d -= value.f111999b;
            T key = next.getKey();
            it.remove();
            mo3791j(key, value.f111998a);
        }
    }
}
