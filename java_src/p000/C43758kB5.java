package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u0014\u0010\b\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m28432d2 = {"LkB5;", "E", "LK0;", "next", "()Ljava/lang/Object;", "previous", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "element", "", "index", "<init>", "(Ljava/lang/Object;I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: kB5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43758kB5<E> extends AbstractC4296K0<E> {

    /* renamed from: d */
    public final E f94061d;

    public C43758kB5(E e, int i) {
        super(i, 1);
        this.f94061d = e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        m99367a();
        m99363e(m99365c() + 1);
        return this.f94061d;
    }

    @Override // java.util.ListIterator
    public E previous() {
        m99366b();
        m99363e(m99365c() - 1);
        return this.f94061d;
    }
}
