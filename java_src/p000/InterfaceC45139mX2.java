package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* renamed from: mX2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC45139mX2<E> extends Collection<E> {

    /* renamed from: mX2$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC26111a<E> {
        int getCount();

        E getElement();
    }

    /* renamed from: A2 */
    int mo20922A2(Object obj, int i);

    /* renamed from: F2 */
    Set<E> mo25465F2();

    /* renamed from: H0 */
    int mo20921H0(E e, int i);

    /* renamed from: P0 */
    boolean mo25464P0(E e, int i, int i2);

    /* renamed from: Q1 */
    int mo25463Q1(E e, int i);

    @Override // java.util.Collection, p000.InterfaceC45139mX2
    boolean contains(Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    /* renamed from: d3 */
    int mo20918d3(Object obj);

    Set<InterfaceC26111a<E>> entrySet();

    @Override // java.util.Collection, java.lang.Iterable, p000.InterfaceC45139mX2
    Iterator<E> iterator();

    @Override // java.util.Collection, p000.InterfaceC45139mX2
    boolean remove(Object obj);

    @Override // java.util.Collection, p000.InterfaceC45139mX2
    int size();
}
