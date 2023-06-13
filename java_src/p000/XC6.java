package p000;

import java.util.concurrent.Executor;
import p000.BX5;
/* renamed from: XC6 */
/* loaded from: classes5.dex */
public class XC6 {

    /* renamed from: a */
    public final Executor f42886a;

    /* renamed from: b */
    public final InterfaceC35412Qg1 f42887b;

    /* renamed from: c */
    public final FG6 f42888c;

    /* renamed from: d */
    public final BX5 f42889d;

    public XC6(Executor executor, InterfaceC35412Qg1 interfaceC35412Qg1, FG6 fg6, BX5 bx5) {
        this.f42886a = executor;
        this.f42887b = interfaceC35412Qg1;
        this.f42888c = fg6;
        this.f42889d = bx5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m77179d() {
        for (T96 t96 : this.f42887b.mo72746S1()) {
            this.f42888c.mo107365a(t96, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m77178e() {
        this.f42889d.mo72733c(new BX5.InterfaceC0634a() { // from class: WC6
            @Override // p000.BX5.InterfaceC0634a
            public final Object execute() {
                Object m77179d;
                m77179d = XC6.this.m77179d();
                return m77179d;
            }
        });
    }

    /* renamed from: c */
    public void m77180c() {
        this.f42886a.execute(new Runnable() { // from class: VC6
            @Override // java.lang.Runnable
            public final void run() {
                XC6.this.m77178e();
            }
        });
    }
}
