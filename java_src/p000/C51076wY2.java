package p000;

import java.io.Serializable;
/* renamed from: wY2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51076wY2 extends AbstractC53114zy3<Comparable<?>> implements Serializable {

    /* renamed from: b */
    public static final C51076wY2 f116145b = new C51076wY2();
    private static final long serialVersionUID = 0;

    private C51076wY2() {
    }

    private Object readResolve() {
        return f116145b;
    }

    @Override // p000.AbstractC53114zy3
    /* renamed from: f */
    public <S extends Comparable<?>> AbstractC53114zy3<S> mo55f() {
        return C52174yO4.f119480b;
    }

    @Override // p000.AbstractC53114zy3, java.util.Comparator
    /* renamed from: h */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        EZ3.m108801n(comparable);
        EZ3.m108801n(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
