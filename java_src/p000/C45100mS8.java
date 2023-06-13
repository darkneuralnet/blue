package p000;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* renamed from: mS8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45100mS8<K> extends RQ8<K> {

    /* renamed from: d */
    public final transient AbstractC50417vQ8<K, ?> f98053d;

    /* renamed from: e */
    public final transient ZP8<K> f98054e;

    public C45100mS8(AbstractC50417vQ8<K, ?> abstractC50417vQ8, ZP8<K> zp8) {
        this.f98053d = abstractC50417vQ8;
        this.f98054e = zp8;
    }

    @Override // p000.XO8
    /* renamed from: a */
    public final int mo21022a(Object[] objArr, int i) {
        return this.f98054e.mo21022a(objArr, 0);
    }

    @Override // p000.XO8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object obj) {
        if (this.f98053d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // p000.RQ8, p000.XO8
    /* renamed from: e */
    public final ZP8<K> mo25571e() {
        return this.f98054e;
    }

    @Override // p000.RQ8, p000.XO8
    /* renamed from: f */
    public final AbstractC38578bU8<K> mo21021f() {
        return this.f98054e.listIterator(0);
    }

    @Override // p000.RQ8, p000.XO8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return this.f98054e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f98053d.size();
    }
}
