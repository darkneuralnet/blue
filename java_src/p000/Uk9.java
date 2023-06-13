package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Uk9 */
/* loaded from: classes5.dex */
public final class Uk9 implements Dk9 {

    /* renamed from: a */
    public final List f37945a;

    public Uk9(Context context, Ok9 ok9) {
        ArrayList arrayList = new ArrayList();
        this.f37945a = arrayList;
        if (ok9.mo15466c()) {
            arrayList.add(new C42338hn9(context, ok9));
        }
    }

    @Override // p000.Dk9
    /* renamed from: a */
    public final void mo35862a(InterfaceC51794xk9 interfaceC51794xk9) {
        for (Dk9 dk9 : this.f37945a) {
            dk9.mo35862a(interfaceC51794xk9);
        }
    }
}
