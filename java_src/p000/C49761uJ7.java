package p000;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Map;
/* renamed from: uJ7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49761uJ7 {

    /* renamed from: a */
    public final int f112198a;

    /* renamed from: b */
    public final Map f112199b = new HashMap();

    @SuppressLint({"UseSparseArrays"})
    public C49761uJ7(int i) {
        this.f112198a = i;
    }

    /* renamed from: a */
    public final synchronized void m10464a(long j) {
        this.f112199b.remove(Long.valueOf(j));
    }

    /* renamed from: b */
    public final synchronized boolean m10463b(Object obj, long j) {
        if (this.f112199b.size() == this.f112198a) {
            XU7 xu7 = XU7.f43305b;
            StringBuilder sb = new StringBuilder(47);
            sb.append("Buffer is full. Drop frame ");
            sb.append(j);
            xu7.m76942c(this, sb.toString(), new Object[0]);
            return false;
        }
        this.f112199b.put(Long.valueOf(j), obj);
        return true;
    }
}
