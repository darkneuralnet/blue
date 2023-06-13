package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* renamed from: Mv5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34615Mv5<T> {

    /* renamed from: a */
    public final List<T> f23819a;

    public C34615Mv5(int i) {
        this.f23819a = new ArrayList(i);
    }

    /* renamed from: c */
    public static <T> C34615Mv5<T> m94564c(int i) {
        return new C34615Mv5<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public C34615Mv5<T> m94566a(T t) {
        this.f23819a.add(C52272yZ3.m3258c(t, "Set contributions cannot be null"));
        return this;
    }

    /* renamed from: b */
    public Set<T> m94565b() {
        if (this.f23819a.isEmpty()) {
            return Collections.emptySet();
        }
        if (this.f23819a.size() == 1) {
            return Collections.singleton(this.f23819a.get(0));
        }
        return Collections.unmodifiableSet(new HashSet(this.f23819a));
    }
}
