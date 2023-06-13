package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bR\"\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, m28432d2 = {"LK0;", "E", "", "", "hasNext", "hasPrevious", "", "nextIndex", "previousIndex", "", C17296a.f69688o, "()V", "b", "I", "c", "()I", "e", "(I)V", "index", DateTokenConverter.CONVERTER_KEY, "f", "size", "<init>", "(II)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: K0 */
/* loaded from: classes.dex */
public abstract class AbstractC4296K0<E> implements ListIterator<E>, KMappedMarker {

    /* renamed from: b */
    public int f18897b;

    /* renamed from: c */
    public int f18898c;

    public AbstractC4296K0(int i, int i2) {
        this.f18897b = i;
        this.f18898c = i2;
    }

    /* renamed from: a */
    public final void m99367a() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public final void m99366b() {
        if (hasPrevious()) {
            return;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    public final int m99365c() {
        return this.f18897b;
    }

    /* renamed from: d */
    public final int m99364d() {
        return this.f18898c;
    }

    /* renamed from: e */
    public final void m99363e(int i) {
        this.f18897b = i;
    }

    /* renamed from: f */
    public final void m99362f(int i) {
        this.f18898c = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f18897b < this.f18898c;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f18897b > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f18897b;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f18897b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
