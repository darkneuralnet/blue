package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* renamed from: HW8 */
/* loaded from: classes5.dex */
public final class HW8 implements InterfaceC51073wX8 {

    /* renamed from: a */
    public final List f13494a;

    public HW8(Context context, AbstractC51064wW8 abstractC51064wW8) {
        ArrayList arrayList = new ArrayList();
        this.f13494a = arrayList;
        if (abstractC51064wW8.mo6709c()) {
            arrayList.add(new NZ8(context, abstractC51064wW8));
        }
    }

    @Override // p000.InterfaceC51073wX8
    /* renamed from: a */
    public final void mo6683a(C43968kY8 c43968kY8) {
        for (InterfaceC51073wX8 interfaceC51073wX8 : this.f13494a) {
            interfaceC51073wX8.mo6683a(c43968kY8);
        }
    }
}
