package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* renamed from: vo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50646vo7 implements InterfaceC53018zo7 {

    /* renamed from: a */
    public final List f114721a;

    public C50646vo7(Context context, AbstractC50054uo7 abstractC50054uo7) {
        ArrayList arrayList = new ArrayList();
        this.f114721a = arrayList;
        if (abstractC50054uo7.mo9709c()) {
            arrayList.add(new C39984dp7(context, abstractC50054uo7));
        }
    }

    @Override // p000.InterfaceC53018zo7
    /* renamed from: a */
    public final void mo405a(InterfaceC48868so7 interfaceC48868so7) {
        for (InterfaceC53018zo7 interfaceC53018zo7 : this.f114721a) {
            interfaceC53018zo7.mo405a(interfaceC48868so7);
        }
    }
}
