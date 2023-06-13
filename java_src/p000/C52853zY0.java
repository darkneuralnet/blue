package p000;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p000.BX5;
/* renamed from: zY0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52853zY0 implements InterfaceC51217wm5 {

    /* renamed from: f */
    public static final Logger f121512f = Logger.getLogger(C42798ia6.class.getName());

    /* renamed from: a */
    public final FG6 f121513a;

    /* renamed from: b */
    public final Executor f121514b;

    /* renamed from: c */
    public final InterfaceC8824Vv f121515c;

    /* renamed from: d */
    public final InterfaceC35412Qg1 f121516d;

    /* renamed from: e */
    public final BX5 f121517e;

    public C52853zY0(Executor executor, InterfaceC8824Vv interfaceC8824Vv, FG6 fg6, InterfaceC35412Qg1 interfaceC35412Qg1, BX5 bx5) {
        this.f121514b = executor;
        this.f121515c = interfaceC8824Vv;
        this.f121513a = fg6;
        this.f121516d = interfaceC35412Qg1;
        this.f121517e = bx5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m1182d(T96 t96, AbstractC33774Jg1 abstractC33774Jg1) {
        this.f121516d.mo72712p1(t96, abstractC33774Jg1);
        this.f121513a.mo107365a(t96, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m1181e(final T96 t96, InterfaceC44577la6 interfaceC44577la6, AbstractC33774Jg1 abstractC33774Jg1) {
        try {
            S96 s96 = this.f121515c.get(t96.mo16804b());
            if (s96 == null) {
                String format = String.format("Transport backend '%s' is not registered", t96.mo16804b());
                f121512f.warning(format);
                interfaceC44577la6.mo27131a(new IllegalArgumentException(format));
                return;
            }
            final AbstractC33774Jg1 mo85874b = s96.mo85874b(abstractC33774Jg1);
            this.f121517e.mo72733c(new BX5.InterfaceC0634a() { // from class: xY0
                @Override // p000.BX5.InterfaceC0634a
                public final Object execute() {
                    Object m1182d;
                    m1182d = C52853zY0.this.m1182d(t96, mo85874b);
                    return m1182d;
                }
            });
            interfaceC44577la6.mo27131a(null);
        } catch (Exception e) {
            Logger logger = f121512f;
            logger.warning("Error scheduling event " + e.getMessage());
            interfaceC44577la6.mo27131a(e);
        }
    }

    @Override // p000.InterfaceC51217wm5
    /* renamed from: a */
    public void mo1185a(final T96 t96, final AbstractC33774Jg1 abstractC33774Jg1, final InterfaceC44577la6 interfaceC44577la6) {
        this.f121514b.execute(new Runnable() { // from class: wY0
            @Override // java.lang.Runnable
            public final void run() {
                C52853zY0.this.m1181e(t96, interfaceC44577la6, abstractC33774Jg1);
            }
        });
    }
}
