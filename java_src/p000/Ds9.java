package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* renamed from: Ds9 */
/* loaded from: classes6.dex */
public abstract class Ds9 {

    /* renamed from: a */
    public final Unsafe f6457a;

    public Ds9(Unsafe unsafe) {
        this.f6457a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo43557a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo43556b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo43555c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo43554d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo43553e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo43552f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo43551g(Object obj, long j);

    /* renamed from: h */
    public final int m109817h(Class<?> cls) {
        return this.f6457a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m109816i(Class<?> cls) {
        return this.f6457a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m109815j(Object obj, long j) {
        return this.f6457a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long m109814k(Object obj, long j) {
        return this.f6457a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long m109813l(Field field) {
        return this.f6457a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m109812m(Object obj, long j) {
        return this.f6457a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void m109811n(Object obj, long j, int i) {
        this.f6457a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void m109810o(Object obj, long j, long j2) {
        this.f6457a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void m109809p(Object obj, long j, Object obj2) {
        this.f6457a.putObject(obj, j, obj2);
    }
}
