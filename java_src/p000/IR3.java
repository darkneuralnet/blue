package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0002R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LIR3;", "E", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", C17296a.f69688o, "", "b", "Ljava/lang/Object;", "nextElement", "", "LXr2;", "c", "Ljava/util/Map;", "getMap$runtime_release", "()Ljava/util/Map;", "map", "", DateTokenConverter.CONVERTER_KEY, "I", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "index", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IR3 */
/* loaded from: classes.dex */
public class IR3<E> implements Iterator<E>, KMappedMarker {

    /* renamed from: b */
    public Object f15477b;

    /* renamed from: c */
    public final Map<E, C37150Xr2> f15478c;

    /* renamed from: d */
    public int f15479d;

    public IR3(Object obj, Map<E, C37150Xr2> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f15477b = obj;
        this.f15478c = map;
    }

    /* renamed from: a */
    public final void m102407a() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f15479d < this.f15478c.size();
    }

    @Override // java.util.Iterator
    public E next() {
        m102407a();
        E e = (E) this.f15477b;
        this.f15479d++;
        C37150Xr2 c37150Xr2 = this.f15478c.get(e);
        if (c37150Xr2 != null) {
            this.f15477b = c37150Xr2.m76203c();
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
