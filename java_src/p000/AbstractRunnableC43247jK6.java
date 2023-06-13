package p000;

import android.support.annotation.Nullable;
/* renamed from: jK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractRunnableC43247jK6 implements Runnable {
    @Nullable

    /* renamed from: b */
    public final C37929aO6<?> f92571b;

    public AbstractRunnableC43247jK6() {
        this.f92571b = null;
    }

    /* renamed from: a */
    public abstract void mo8889a();

    /* renamed from: b */
    public final void m30768b(Exception exc) {
        C37929aO6<?> c37929aO6 = this.f92571b;
        if (c37929aO6 != null) {
            c37929aO6.m71486d(exc);
        }
    }

    @Nullable
    /* renamed from: c */
    public final C37929aO6<?> m30767c() {
        return this.f92571b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo8889a();
        } catch (Exception e) {
            m30768b(e);
        }
    }

    public AbstractRunnableC43247jK6(@Nullable C37929aO6<?> c37929aO6) {
        this.f92571b = c37929aO6;
    }
}
