package p000;

import java.util.ArrayList;
import java.util.List;
/* renamed from: TE2 */
/* loaded from: classes6.dex */
public class TE2 implements InterfaceC19921e {

    /* renamed from: a */
    public final List<InterfaceC19921e> f35012a = new ArrayList();

    public TE2() {
    }

    @Override // p000.InterfaceC19921e
    /* renamed from: a */
    public C19649d mo9937a(int i, int i2, byte[] bArr, int i3) {
        for (InterfaceC19921e interfaceC19921e : this.f35012a) {
            C19649d mo9937a = interfaceC19921e.mo9937a(i, i2, bArr, i3);
            if (mo9937a != null) {
                return mo9937a;
            }
        }
        return null;
    }

    public TE2(InterfaceC19921e... interfaceC19921eArr) {
        for (InterfaceC19921e interfaceC19921e : interfaceC19921eArr) {
            this.f35012a.add(interfaceC19921e);
        }
    }
}
