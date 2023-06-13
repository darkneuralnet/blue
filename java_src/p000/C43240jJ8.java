package p000;
/* renamed from: jJ8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43240jJ8 extends AbstractC36228Ts7 {

    /* renamed from: e */
    public final /* synthetic */ QM8 f92544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43240jJ8(QM8 qm8, InterfaceC35527Qs8 interfaceC35527Qs8) {
        super(interfaceC35527Qs8);
        this.f92544e = qm8;
    }

    @Override // p000.AbstractC36228Ts7
    /* renamed from: c */
    public final void mo6826c() {
        QM8 qm8 = this.f92544e;
        qm8.mo19953e();
        if (!qm8.m88546w()) {
            return;
        }
        qm8.f100966a.mo22258a().m106889s().m42708a("Inactivity, disconnecting from the service");
        qm8.m88564Q();
    }
}
