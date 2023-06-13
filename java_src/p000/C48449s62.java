package p000;

import androidx.camera.core.ImageCaptureException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p000.HX1;
import p000.O80;
/* renamed from: s62  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C48449s62 {

    /* renamed from: a */
    public final Executor f108261a;

    /* renamed from: b */
    public final HX1 f108262b;

    public C48449s62(AbstractC52288yb0 abstractC52288yb0) {
        boolean z;
        if (abstractC52288yb0.m3208e() == 4) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103737a(z);
        this.f108261a = abstractC52288yb0.m3211b();
        HX1 m3210c = abstractC52288yb0.m3210c();
        Objects.requireNonNull(m3210c);
        this.f108262b = m3210c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m14779c(O80.C5832a c5832a, HX1.InterfaceC3155a interfaceC3155a) {
        try {
            c5832a.m92861c(this.f108262b.m103795a(interfaceC3155a));
        } catch (Exception e) {
            c5832a.m92858f(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m14778d(final HX1.InterfaceC3155a interfaceC3155a, final O80.C5832a c5832a) throws Exception {
        this.f108261a.execute(new Runnable() { // from class: r62
            @Override // java.lang.Runnable
            public final void run() {
                C48449s62.this.m14779c(c5832a, interfaceC3155a);
            }
        });
        return "InternalImageProcessor#process " + interfaceC3155a.hashCode();
    }

    /* renamed from: e */
    public HX1.InterfaceC3156b m14777e(final HX1.InterfaceC3155a interfaceC3155a) throws ImageCaptureException {
        try {
            return (HX1.InterfaceC3156b) O80.m92864a(new O80.InterfaceC5834c() { // from class: q62
                @Override // p000.O80.InterfaceC5834c
                /* renamed from: a */
                public final Object mo3207a(O80.C5832a c5832a) {
                    Object m14778d;
                    m14778d = C48449s62.this.m14778d(interfaceC3155a, c5832a);
                    return m14778d;
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
