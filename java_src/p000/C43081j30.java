package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0003\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\bX\u0088\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m28432d2 = {"Lj30;", "T", "LK0;", "next", "()Ljava/lang/Object;", "previous", "", DateTokenConverter.CONVERTER_KEY, "[Ljava/lang/Object;", "buffer", "", "index", "size", "<init>", "([Ljava/lang/Object;II)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: j30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43081j30<T> extends AbstractC4296K0<T> {

    /* renamed from: d */
    public final T[] f92057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43081j30(T[] buffer, int i, int i2) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f92057d = buffer;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        if (hasNext()) {
            T[] tArr = this.f92057d;
            int m99365c = m99365c();
            m99363e(m99365c + 1);
            return tArr[m99365c];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public T previous() {
        if (hasPrevious()) {
            T[] tArr = this.f92057d;
            m99363e(m99365c() - 1);
            return tArr[m99365c()];
        }
        throw new NoSuchElementException();
    }
}
