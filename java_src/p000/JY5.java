package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.C11164h;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* renamed from: JY5 */
/* loaded from: classes.dex */
public abstract class JY5 {

    /* renamed from: a */
    public int f17787a = new C41656gf0().m37926a();

    /* renamed from: JY5$a */
    /* loaded from: classes.dex */
    public interface InterfaceC4143a {
        /* renamed from: a */
        void mo100231a(JY5 jy5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m100238o(ImageCaptureException imageCaptureException) {
        boolean z;
        boolean z2 = true;
        if (mo20322h() != null) {
            z = true;
        } else {
            z = false;
        }
        if (mo20320j() == null) {
            z2 = false;
        }
        if (z && !z2) {
            C11164h.AbstractC11178l mo20322h = mo20322h();
            Objects.requireNonNull(mo20322h);
            mo20322h.mo54646b(imageCaptureException);
        } else if (z2 && !z) {
            C11164h.InterfaceC11179m mo20320j = mo20320j();
            Objects.requireNonNull(mo20320j);
            mo20320j.mo54008b(imageCaptureException);
        } else {
            throw new IllegalStateException("One and only one callback is allowed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m100237p(C11164h.C11182o c11182o) {
        C11164h.InterfaceC11179m mo20320j = mo20320j();
        Objects.requireNonNull(mo20320j);
        Objects.requireNonNull(c11182o);
        mo20320j.mo54009a(c11182o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m100236q(InterfaceC11183i interfaceC11183i) {
        C11164h.AbstractC11178l mo20322h = mo20322h();
        Objects.requireNonNull(mo20322h);
        Objects.requireNonNull(interfaceC11183i);
        mo20322h.mo54647a(interfaceC11183i);
    }

    /* renamed from: r */
    public static JY5 m100235r(Executor executor, C11164h.AbstractC11178l abstractC11178l, C11164h.InterfaceC11179m interfaceC11179m, C11164h.C11180n c11180n, Rect rect, Matrix matrix, int i, int i2, int i3, List<AbstractC46943pa0> list) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (interfaceC11179m == null) {
            z = true;
        } else {
            z = false;
        }
        if (c11180n == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        HZ3.m103736b(z3, "onDiskCallback and outputFileOptions should be both null or both non-null.");
        if (interfaceC11179m == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (abstractC11178l != null) {
            z5 = false;
        }
        HZ3.m103736b(z5 ^ z4, "One and only one on-disk or in-memory callback should be present.");
        return new C27101ou(executor, abstractC11178l, interfaceC11179m, c11180n, rect, matrix, i, i2, i3, list);
    }

    /* renamed from: d */
    public boolean m100239d() {
        O36.m92961a();
        int i = this.f17787a;
        if (i > 0) {
            this.f17787a = i - 1;
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public abstract Executor mo20325e();

    /* renamed from: f */
    public abstract int mo20324f();

    /* renamed from: g */
    public abstract Rect mo20323g();

    /* renamed from: h */
    public abstract C11164h.AbstractC11178l mo20322h();

    /* renamed from: i */
    public abstract int mo20321i();

    /* renamed from: j */
    public abstract C11164h.InterfaceC11179m mo20320j();

    /* renamed from: k */
    public abstract C11164h.C11180n mo20319k();

    /* renamed from: l */
    public abstract int mo20318l();

    /* renamed from: m */
    public abstract Matrix mo20317m();

    /* renamed from: n */
    public abstract List<AbstractC46943pa0> mo20316n();

    /* renamed from: s */
    public void m100234s(final ImageCaptureException imageCaptureException) {
        mo20325e().execute(new Runnable() { // from class: GY5
            @Override // java.lang.Runnable
            public final void run() {
                JY5.this.m100238o(imageCaptureException);
            }
        });
    }

    /* renamed from: t */
    public void m100233t(final C11164h.C11182o c11182o) {
        mo20325e().execute(new Runnable() { // from class: HY5
            @Override // java.lang.Runnable
            public final void run() {
                JY5.this.m100237p(c11182o);
            }
        });
    }

    /* renamed from: u */
    public void m100232u(final InterfaceC11183i interfaceC11183i) {
        mo20325e().execute(new Runnable() { // from class: IY5
            @Override // java.lang.Runnable
            public final void run() {
                JY5.this.m100236q(interfaceC11183i);
            }
        });
    }
}
