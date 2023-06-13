package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C11882c;
import androidx.recyclerview.widget.C11884d;
import androidx.recyclerview.widget.C11905h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC11834D;
import java.util.List;
/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public abstract class AbstractC11940o<T, VH extends RecyclerView.AbstractC11834D> extends RecyclerView.AbstractC11843h<VH> {
    final C11884d<T> mDiffer;
    private final C11884d.InterfaceC11888b<T> mListener;

    /* renamed from: androidx.recyclerview.widget.o$a */
    /* loaded from: classes.dex */
    public class C11941a implements C11884d.InterfaceC11888b<T> {
        public C11941a() {
        }

        @Override // androidx.recyclerview.widget.C11884d.InterfaceC11888b
        /* renamed from: a */
        public void mo66175a(List<T> list, List<T> list2) {
            AbstractC11940o.this.onCurrentListChanged(list, list2);
        }
    }

    public AbstractC11940o(C11905h.AbstractC11911f<T> abstractC11911f) {
        C11941a c11941a = new C11941a();
        this.mListener = c11941a;
        C11884d<T> c11884d = new C11884d<>(new C11881b(this), new C11882c.C11883a(abstractC11911f).m66328a());
        this.mDiffer = c11884d;
        c11884d.m66327a(c11941a);
    }

    public List<T> getCurrentList() {
        return this.mDiffer.m66326b();
    }

    public T getItem(int i) {
        return this.mDiffer.m66326b().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.mDiffer.m66326b().size();
    }

    public void onCurrentListChanged(List<T> list, List<T> list2) {
    }

    public void submitList(List<T> list) {
        this.mDiffer.m66323e(list);
    }

    public void submitList(List<T> list, Runnable runnable) {
        this.mDiffer.m66322f(list, runnable);
    }

    public AbstractC11940o(C11882c<T> c11882c) {
        C11941a c11941a = new C11941a();
        this.mListener = c11941a;
        C11884d<T> c11884d = new C11884d<>(new C11881b(this), c11882c);
        this.mDiffer = c11884d;
        c11884d.m66327a(c11941a);
    }
}
