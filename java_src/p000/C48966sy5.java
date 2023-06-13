package p000;

import android.graphics.Path;
import java.util.List;
/* renamed from: sy5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C48966sy5 extends AbstractC26856oB<C45409my5, Path> {

    /* renamed from: i */
    public final C45409my5 f109623i;

    /* renamed from: j */
    public final Path f109624j;

    /* renamed from: k */
    public List<InterfaceC50152uy5> f109625k;

    public C48966sy5(List<C41125fl2<C45409my5>> list) {
        super(list);
        this.f109623i = new C45409my5();
        this.f109624j = new Path();
    }

    @Override // p000.AbstractC26856oB
    /* renamed from: p */
    public Path mo11803i(C41125fl2<C45409my5> c41125fl2, float f) {
        this.f109623i.m24604c(c41125fl2.f80564b, c41125fl2.f80565c, f);
        C45409my5 c45409my5 = this.f109623i;
        List<InterfaceC50152uy5> list = this.f109625k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c45409my5 = this.f109625k.get(size).mo9422g(c45409my5);
            }
        }
        C48077rU2.m15912h(c45409my5, this.f109624j);
        return this.f109624j;
    }

    /* renamed from: q */
    public void m13295q(List<InterfaceC50152uy5> list) {
        this.f109625k = list;
    }
}
