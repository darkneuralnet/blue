package p000;

import androidx.camera.core.InterfaceC11183i;
import java.util.Objects;
import p000.C40160e74;
import p000.C44621lf0;
/* renamed from: hB5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41979hB5 {

    /* renamed from: a */
    public C40753f74 f84842a;

    /* renamed from: b */
    public C40160e74.AbstractC19964a f84843b;

    /* renamed from: hB5$a */
    /* loaded from: classes.dex */
    public class C22589a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ C40753f74 f84844a;

        public C22589a(C40753f74 c40753f74) {
            this.f84844a = c40753f74;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            O36.m92961a();
            C40753f74 c40753f74 = this.f84844a;
            C41979hB5 c41979hB5 = C41979hB5.this;
            if (c40753f74 == c41979hB5.f84842a) {
                c41979hB5.f84842a = null;
            }
        }
    }

    /* renamed from: c */
    public final void m36639c(InterfaceC11183i interfaceC11183i) {
        boolean z;
        O36.m92961a();
        boolean z2 = true;
        if (this.f84842a != null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103729i(z);
        Object m5016c = interfaceC11183i.mo40428i1().mo3254b().m5016c(this.f84842a.m41985h());
        Objects.requireNonNull(m5016c);
        if (((Integer) m5016c).intValue() != this.f84842a.m41986g().get(0).intValue()) {
            z2 = false;
        }
        HZ3.m103729i(z2);
        this.f84843b.mo43251a().accept(C40160e74.AbstractC19965b.m43246c(this.f84842a, interfaceC11183i));
        this.f84842a = null;
    }

    /* renamed from: d */
    public void m36638d() {
    }

    /* renamed from: e */
    public final void m36637e(C40753f74 c40753f74) {
        boolean z;
        O36.m92961a();
        boolean z2 = false;
        if (c40753f74.m41986g().size() == 1) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103728j(z, "Cannot handle multi-image capture.");
        if (this.f84842a == null) {
            z2 = true;
        }
        HZ3.m103728j(z2, "Already has an existing request.");
        this.f84842a = c40753f74;
        IA1.m102842b(c40753f74.m41992a(), new C22589a(c40753f74), C31631Ac0.m115449a());
    }

    /* renamed from: f */
    public C40160e74.AbstractC19964a m36636f(C44621lf0.AbstractC25756c abstractC25756c) {
        abstractC25756c.mo15140b().m14666a(new InterfaceC48378rz0() { // from class: fB5
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                C41979hB5.this.m36639c((InterfaceC11183i) obj);
            }
        });
        abstractC25756c.mo15139c().m14666a(new InterfaceC48378rz0() { // from class: gB5
            @Override // p000.InterfaceC48378rz0
            public final void accept(Object obj) {
                C41979hB5.this.m36637e((C40753f74) obj);
            }
        });
        C40160e74.AbstractC19964a m43249c = C40160e74.AbstractC19964a.m43249c(abstractC25756c.mo15141a());
        this.f84843b = m43249c;
        return m43249c;
    }
}
