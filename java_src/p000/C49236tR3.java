package p000;

import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rR2\u0010\u0010\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0015"}, m28432d2 = {"LtR3;", "K", "V", "", "", "", "hasNext", C17296a.f69688o, "", "remove", "key", "newValue", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "LrR3;", "LrR3;", "base", "LqR3;", "builder", "<init>", "(LqR3;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tR3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49236tR3<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    /* renamed from: b */
    public final C48051rR3<K, V, Map.Entry<K, V>> f110461b;

    public C49236tR3(C47458qR3<K, V> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        AbstractC48135ra6[] abstractC48135ra6Arr = new AbstractC48135ra6[8];
        for (int i = 0; i < 8; i++) {
            abstractC48135ra6Arr[i] = new C50505va6(this);
        }
        this.f110461b = new C48051rR3<>(builder, abstractC48135ra6Arr);
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public Map.Entry<K, V> next() {
        return this.f110461b.next();
    }

    /* renamed from: b */
    public final void m12379b(K k, V v) {
        this.f110461b.m15969j(k, v);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f110461b.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f110461b.remove();
    }
}
