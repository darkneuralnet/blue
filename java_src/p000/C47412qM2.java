package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
/* renamed from: qM2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47412qM2 {

    /* renamed from: a */
    public final List<AbstractC26856oB<C45409my5, Path>> f105186a;

    /* renamed from: b */
    public final List<AbstractC26856oB<Integer, Integer>> f105187b;

    /* renamed from: c */
    public final List<C46819pM2> f105188c;

    public C47412qM2(List<C46819pM2> list) {
        this.f105188c = list;
        this.f105186a = new ArrayList(list.size());
        this.f105187b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f105186a.add(list.get(i).m19426b().mo951a());
            this.f105187b.add(list.get(i).m19425c().mo951a());
        }
    }

    /* renamed from: a */
    public List<AbstractC26856oB<C45409my5, Path>> m17594a() {
        return this.f105186a;
    }

    /* renamed from: b */
    public List<C46819pM2> m17593b() {
        return this.f105188c;
    }

    /* renamed from: c */
    public List<AbstractC26856oB<Integer, Integer>> m17592c() {
        return this.f105187b;
    }
}
