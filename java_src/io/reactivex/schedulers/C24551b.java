package io.reactivex.schedulers;

import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.schedulers.b */
/* loaded from: classes8.dex */
public final class C24551b<T> {

    /* renamed from: a */
    public final T f91195a;

    /* renamed from: b */
    public final long f91196b;

    /* renamed from: c */
    public final TimeUnit f91197c;

    public C24551b(T t, long j, TimeUnit timeUnit) {
        this.f91195a = t;
        this.f91196b = j;
        this.f91197c = (TimeUnit) C23544b.m32923e(timeUnit, "unit is null");
    }

    /* renamed from: a */
    public long m31925a() {
        return this.f91196b;
    }

    /* renamed from: b */
    public T m31924b() {
        return this.f91195a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C24551b)) {
            return false;
        }
        C24551b c24551b = (C24551b) obj;
        if (!C23544b.m32925c(this.f91195a, c24551b.f91195a) || this.f91196b != c24551b.f91196b || !C23544b.m32925c(this.f91197c, c24551b.f91197c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        T t = this.f91195a;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        long j = this.f91196b;
        return (((i * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.f91197c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f91196b + ", unit=" + this.f91197c + ", value=" + this.f91195a + "]";
    }
}
