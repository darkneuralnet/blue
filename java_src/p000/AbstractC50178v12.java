package p000;
/* renamed from: v12  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC50178v12<E> extends AbstractC38616bZ1<E> {

    /* renamed from: v12$a */
    /* loaded from: classes6.dex */
    public class C29353a extends VY1<E> {
        public C29353a() {
        }

        @Override // java.util.List
        public E get(int i) {
            return (E) AbstractC50178v12.this.get(i);
        }

        @Override // p000.QY1
        /* renamed from: h */
        public boolean mo9378h() {
            return AbstractC50178v12.this.mo9378h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return AbstractC50178v12.this.size();
        }
    }

    @Override // p000.QY1
    /* renamed from: b */
    public int mo9381b(Object[] objArr, int i) {
        return mo10675a().mo9381b(objArr, i);
    }

    public abstract E get(int i);

    @Override // p000.AbstractC38616bZ1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC48175re6<E> iterator() {
        return mo10675a().iterator();
    }

    @Override // p000.AbstractC38616bZ1
    /* renamed from: y */
    public VY1<E> mo9379y() {
        return new C29353a();
    }
}
