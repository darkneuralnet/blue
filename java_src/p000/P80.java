package p000;

import android.graphics.Typeface;
import android.os.Handler;
import p000.C32280Cw1;
import p000.C34386Lw1;
/* renamed from: P80 */
/* loaded from: classes.dex */
public class P80 {

    /* renamed from: a */
    public final C34386Lw1.C5133c f27950a;

    /* renamed from: b */
    public final Handler f27951b;

    /* renamed from: P80$a */
    /* loaded from: classes.dex */
    public class RunnableC6272a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C34386Lw1.C5133c f27952b;

        /* renamed from: c */
        public final /* synthetic */ Typeface f27953c;

        public RunnableC6272a(C34386Lw1.C5133c c5133c, Typeface typeface) {
            this.f27952b = c5133c;
            this.f27953c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27952b.mo96104b(this.f27953c);
        }
    }

    /* renamed from: P80$b */
    /* loaded from: classes.dex */
    public class RunnableC6273b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C34386Lw1.C5133c f27955b;

        /* renamed from: c */
        public final /* synthetic */ int f27956c;

        public RunnableC6273b(C34386Lw1.C5133c c5133c, int i) {
            this.f27955b = c5133c;
            this.f27956c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27955b.mo96105a(this.f27956c);
        }
    }

    public P80(C34386Lw1.C5133c c5133c, Handler handler) {
        this.f27950a = c5133c;
        this.f27951b = handler;
    }

    /* renamed from: a */
    public final void m90714a(int i) {
        this.f27951b.post(new RunnableC6273b(this.f27950a, i));
    }

    /* renamed from: b */
    public void m90713b(C32280Cw1.C1260e c1260e) {
        if (c1260e.m111266a()) {
            m90712c(c1260e.f4940a);
        } else {
            m90714a(c1260e.f4941b);
        }
    }

    /* renamed from: c */
    public final void m90712c(Typeface typeface) {
        this.f27951b.post(new RunnableC6272a(this.f27950a, typeface));
    }
}
