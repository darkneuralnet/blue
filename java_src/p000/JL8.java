package p000;

import android.content.ComponentName;
/* renamed from: JL8 */
/* loaded from: classes6.dex */
public final class JL8 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ComponentName f17396b;

    /* renamed from: c */
    public final /* synthetic */ EM8 f17397c;

    public JL8(EM8 em8, ComponentName componentName) {
        this.f17397c = em8;
        this.f17396b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QM8.m88568M(this.f17397c.f7357d, this.f17396b);
    }
}
