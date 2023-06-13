package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* renamed from: H09 */
/* loaded from: classes5.dex */
public final class H09 implements InterfaceC40688f09 {

    /* renamed from: a */
    public final List f12721a;

    public H09(Context context, AbstractC51360x09 abstractC51360x09) {
        ArrayList arrayList = new ArrayList();
        this.f12721a = arrayList;
        if (abstractC51360x09.mo5985c()) {
            arrayList.add(new A29(context, abstractC51360x09));
        }
    }

    @Override // p000.InterfaceC40688f09
    /* renamed from: a */
    public final void mo42285a(VZ8 vz8) {
        for (InterfaceC40688f09 interfaceC40688f09 : this.f12721a) {
            interfaceC40688f09.mo42285a(vz8);
        }
    }
}
