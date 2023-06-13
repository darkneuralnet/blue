package p000;

import java.io.Serializable;
/* renamed from: yO4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52174yO4 extends AbstractC53114zy3<Comparable<?>> implements Serializable {

    /* renamed from: b */
    public static final C52174yO4 f119480b = new C52174yO4();
    private static final long serialVersionUID = 0;

    private C52174yO4() {
    }

    private Object readResolve() {
        return f119480b;
    }

    @Override // p000.AbstractC53114zy3
    /* renamed from: f */
    public <S extends Comparable<?>> AbstractC53114zy3<S> mo55f() {
        return AbstractC53114zy3.m58c();
    }

    @Override // p000.AbstractC53114zy3, java.util.Comparator
    /* renamed from: h */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        EZ3.m108801n(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
