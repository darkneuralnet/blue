package androidx.work;

import androidx.work.C12124b;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC41897h32 {
    @Override // p000.AbstractC41897h32
    /* renamed from: b */
    public C12124b mo36877b(List<C12124b> list) {
        C12124b.C12125a c12125a = new C12124b.C12125a();
        HashMap hashMap = new HashMap();
        for (C12124b c12124b : list) {
            hashMap.putAll(c12124b.m65586h());
        }
        c12125a.m65578d(hashMap);
        return c12125a.m65581a();
    }
}
