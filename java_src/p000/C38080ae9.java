package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
/* renamed from: ae9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38080ae9 implements Le9 {

    /* renamed from: a */
    public final List f50904a;

    public C38080ae9(Context context, Sd9 sd9) {
        ArrayList arrayList = new ArrayList();
        this.f50904a = arrayList;
        if (sd9.mo70986c()) {
            arrayList.add(new C39286cg9(context, sd9));
        }
    }

    @Override // p000.Le9
    /* renamed from: a */
    public final void mo61068a(C47595qf9 c47595qf9) {
        for (Le9 le9 : this.f50904a) {
            le9.mo61068a(c47595qf9);
        }
    }
}
