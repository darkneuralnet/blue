package p000;

import com.google.firebase.perf.metrics.Trace;
import p000.C34872Ny1;
/* renamed from: Lp5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34327Lp5 {

    /* renamed from: a */
    public static final C10776ad f22095a = C10776ad.m71007e();

    /* renamed from: a */
    public static Trace m96313a(Trace trace, C34872Ny1.C5752a c5752a) {
        if (c5752a.m93155d() > 0) {
            trace.putMetric(EnumC36041Sy0.FRAMES_TOTAL.toString(), c5752a.m93155d());
        }
        if (c5752a.m93156c() > 0) {
            trace.putMetric(EnumC36041Sy0.FRAMES_SLOW.toString(), c5752a.m93156c());
        }
        if (c5752a.m93157b() > 0) {
            trace.putMetric(EnumC36041Sy0.FRAMES_FROZEN.toString(), c5752a.m93157b());
        }
        C10776ad c10776ad = f22095a;
        c10776ad.m71011a("Screen trace: " + trace.m47080g() + " _fr_tot:" + c5752a.m93155d() + " _fr_slo:" + c5752a.m93156c() + " _fr_fzn:" + c5752a.m93157b());
        return trace;
    }
}
