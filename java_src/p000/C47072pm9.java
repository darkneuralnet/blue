package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* renamed from: pm9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47072pm9 implements Xl9 {

    /* renamed from: a */
    public final List f104075a;

    public C47072pm9(Context context, AbstractC43514jm9 abstractC43514jm9) {
        ArrayList arrayList = new ArrayList();
        this.f104075a = arrayList;
        if (abstractC43514jm9.mo29938c()) {
            arrayList.add(new Wn9(context, abstractC43514jm9));
        }
    }

    @Override // p000.Xl9
    /* renamed from: a */
    public final void mo18710a(Rl9 rl9) {
        for (Xl9 xl9 : this.f104075a) {
            xl9.mo18710a(rl9);
        }
    }
}
