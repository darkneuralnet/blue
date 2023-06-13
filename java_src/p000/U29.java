package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* renamed from: U29 */
/* loaded from: classes5.dex */
public final class U29 implements InterfaceC47251q49 {

    /* renamed from: a */
    public final List f36757a;

    public U29(Context context, L29 l29) {
        ArrayList arrayList = new ArrayList();
        this.f36757a = arrayList;
        if (l29.mo16570c()) {
            arrayList.add(new C45492n69(context, l29));
        }
    }

    @Override // p000.InterfaceC47251q49
    /* renamed from: a */
    public final void mo18232a(C52596z59 c52596z59) {
        for (InterfaceC47251q49 interfaceC47251q49 : this.f36757a) {
            interfaceC47251q49.mo18232a(c52596z59);
        }
    }
}
