package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: YW2 */
/* loaded from: classes.dex */
public abstract class YW2<C> {

    /* renamed from: a */
    public Set<C> f45961a = new HashSet();

    /* renamed from: a */
    public void m74950a(List<C> list) {
        this.f45961a.addAll(list);
    }

    @Override // 
    /* renamed from: b */
    public abstract YW2<C> clone();

    /* renamed from: c */
    public List<C> m74948c() {
        return Collections.unmodifiableList(new ArrayList(this.f45961a));
    }
}
