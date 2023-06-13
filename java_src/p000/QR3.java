package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"LQR3;", "T", "LK0;", "next", "()Ljava/lang/Object;", "previous", "", DateTokenConverter.CONVERTER_KEY, "[Ljava/lang/Object;", "tail", "Lpa6;", "e", "Lpa6;", "trieIterator", "", "root", "", "index", "size", "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QR3 */
/* loaded from: classes.dex */
public final class QR3<T> extends AbstractC4296K0<T> {

    /* renamed from: d */
    public final T[] f30367d;

    /* renamed from: e */
    public final C46949pa6<T> f30368e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QR3(Object[] root, T[] tail, int i, int i2, int i3) {
        super(i, i2);
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(tail, "tail");
        this.f30367d = tail;
        int m80982d = C36371Ui6.m80982d(i2);
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(i, m80982d);
        this.f30368e = new C46949pa6<>(root, coerceAtMost, m80982d, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        m99367a();
        if (this.f30368e.hasNext()) {
            m99363e(m99365c() + 1);
            return this.f30368e.next();
        }
        T[] tArr = this.f30367d;
        int m99365c = m99365c();
        m99363e(m99365c + 1);
        return tArr[m99365c - this.f30368e.m99364d()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        m99366b();
        if (m99365c() > this.f30368e.m99364d()) {
            T[] tArr = this.f30367d;
            m99363e(m99365c() - 1);
            return tArr[m99365c() - this.f30368e.m99364d()];
        }
        m99363e(m99365c() - 1);
        return this.f30368e.previous();
    }
}
