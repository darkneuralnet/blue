package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableListIterator;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000f\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0005H\u0016J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000e\u001a\u00020\u0003H\u0096\u0002J\u0010\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\bJ\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\rJ\b\u0010\u0012\u001a\u00020\u000bH\u0002R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006!"}, m28432d2 = {"LzP5;", "T", "", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", "add", "(Ljava/lang/Object;)V", "hasNext", "next", "remove", "set", C17296a.f69688o, "LMM5;", "b", "LMM5;", "getList", "()LMM5;", "list", "c", "I", "index", DateTokenConverter.CONVERTER_KEY, "modification", "offset", "<init>", "(LMM5;I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/StateListIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n1#2:458\n*E\n"})
/* renamed from: zP5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52777zP5<T> implements ListIterator<T>, KMutableListIterator {

    /* renamed from: b */
    public final MM5<T> f121313b;

    /* renamed from: c */
    public int f121314c;

    /* renamed from: d */
    public int f121315d;

    public C52777zP5(MM5<T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f121313b = list;
        this.f121314c = i - 1;
        this.f121315d = list.m95408a();
    }

    /* renamed from: a */
    public final void m1391a() {
        if (this.f121313b.m95408a() == this.f121315d) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public void add(T t) {
        m1391a();
        this.f121313b.add(this.f121314c + 1, t);
        this.f121314c++;
        this.f121315d = this.f121313b.m95408a();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f121314c < this.f121313b.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f121314c >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        m1391a();
        int i = this.f121314c + 1;
        NM5.m94011e(i, this.f121313b.size());
        T t = this.f121313b.get(i);
        this.f121314c = i;
        return t;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f121314c + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        m1391a();
        NM5.m94011e(this.f121314c, this.f121313b.size());
        this.f121314c--;
        return this.f121313b.get(this.f121314c);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f121314c;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        m1391a();
        this.f121313b.remove(this.f121314c);
        this.f121314c--;
        this.f121315d = this.f121313b.m95408a();
    }

    @Override // java.util.ListIterator
    public void set(T t) {
        m1391a();
        this.f121313b.set(this.f121314c, t);
        this.f121315d = this.f121313b.m95408a();
    }
}
