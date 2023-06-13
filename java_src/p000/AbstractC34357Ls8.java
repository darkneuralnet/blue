package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;
/* renamed from: Ls8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC34357Ls8 {

    /* renamed from: a */
    public final Unsafe f22181a;

    public AbstractC34357Ls8(Unsafe unsafe) {
        this.f22181a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo4527a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo4526b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo4525c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo4524d(Object obj, long j, double d);

    /* renamed from: e */
    public abstract void mo4523e(Object obj, long j, float f);

    /* renamed from: f */
    public abstract boolean mo4522f(Object obj, long j);

    /* renamed from: g */
    public final int m96254g(Class<?> cls) {
        return this.f22181a.arrayBaseOffset(cls);
    }

    /* renamed from: h */
    public final int m96253h(Class<?> cls) {
        return this.f22181a.arrayIndexScale(cls);
    }

    /* renamed from: i */
    public final int m96252i(Object obj, long j) {
        return this.f22181a.getInt(obj, j);
    }

    /* renamed from: j */
    public final long m96251j(Object obj, long j) {
        return this.f22181a.getLong(obj, j);
    }

    /* renamed from: k */
    public final long m96250k(Field field) {
        return this.f22181a.objectFieldOffset(field);
    }

    /* renamed from: l */
    public final Object m96249l(Object obj, long j) {
        return this.f22181a.getObject(obj, j);
    }

    /* renamed from: m */
    public final void m96248m(Object obj, long j, int i) {
        this.f22181a.putInt(obj, j, i);
    }

    /* renamed from: n */
    public final void m96247n(Object obj, long j, long j2) {
        this.f22181a.putLong(obj, j, j2);
    }

    /* renamed from: o */
    public final void m96246o(Object obj, long j, Object obj2) {
        this.f22181a.putObject(obj, j, obj2);
    }
}
