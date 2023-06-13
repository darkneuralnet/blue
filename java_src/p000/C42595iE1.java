package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u001a"}, m28432d2 = {"LiE1;", "", "Lbu0;", "", "hasNext", C17296a.f69688o, "", "b", "LnE5;", "LnE5;", "getTable", "()LnE5;", "table", "", "c", "I", "getEnd", "()I", "end", DateTokenConverter.CONVERTER_KEY, "index", "e", "version", "start", "<init>", "(LnE5;II)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42595iE1 implements Iterator<InterfaceC38824bu0>, KMappedMarker {

    /* renamed from: b */
    public final C45564nE5 f87000b;

    /* renamed from: c */
    public final int f87001c;

    /* renamed from: d */
    public int f87002d;

    /* renamed from: e */
    public final int f87003e;

    public C42595iE1(C45564nE5 table, int i, int i2) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f87000b = table;
        this.f87001c = i2;
        this.f87002d = i;
        this.f87003e = table.m24117v();
        if (!table.m24116w()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public InterfaceC38824bu0 next() {
        int m19786G;
        m34302b();
        int i = this.f87002d;
        m19786G = C46750pE5.m19786G(this.f87000b.m24121j(), i);
        this.f87002d = m19786G + i;
        return new C46157oE5(this.f87000b, i, this.f87003e);
    }

    /* renamed from: b */
    public final void m34302b() {
        if (this.f87000b.m24117v() == this.f87003e) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f87002d < this.f87001c;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
