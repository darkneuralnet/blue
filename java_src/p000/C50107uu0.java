package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* renamed from: uu0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C50107uu0 {

    /* renamed from: a */
    public final List<C51691xa6> f113174a = new ArrayList();

    /* renamed from: a */
    public void m9539a(C51691xa6 c51691xa6) {
        this.f113174a.add(c51691xa6);
    }

    /* renamed from: b */
    public void m9538b(Path path) {
        for (int size = this.f113174a.size() - 1; size >= 0; size--) {
            C33095Gi6.m104870b(path, this.f113174a.get(size));
        }
    }
}
