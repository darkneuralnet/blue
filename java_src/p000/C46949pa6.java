package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\fJ7\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u000f\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m28432d2 = {"Lpa6;", "E", "LK0;", "", "", "root", "", "index", "size", "height", "", "j", "([Ljava/lang/Object;III)V", "next", "()Ljava/lang/Object;", "previous", "startLevel", "h", "indexPredicate", "i", "g", DateTokenConverter.CONVERTER_KEY, "I", "e", "[Ljava/lang/Object;", "path", "", "f", "Z", "isInRightEdge", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pa6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46949pa6<E> extends AbstractC4296K0<E> {

    /* renamed from: d */
    public int f103820d;

    /* renamed from: e */
    public Object[] f103821e;

    /* renamed from: f */
    public boolean f103822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C46949pa6(Object[] root, int i, int i2, int i3) {
        super(i, i2);
        ?? r5;
        Intrinsics.checkNotNullParameter(root, "root");
        this.f103820d = i3;
        Object[] objArr = new Object[i3];
        this.f103821e = objArr;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.f103822f = r5;
        objArr[0] = root;
        m19096h(i - r5, 1);
    }

    /* renamed from: g */
    public final E m19097g() {
        Object obj = this.f103821e[this.f103820d - 1];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[m99365c() & 31];
    }

    /* renamed from: h */
    public final void m19096h(int i, int i2) {
        int i3 = (this.f103820d - i2) * 5;
        while (i2 < this.f103820d) {
            Object[] objArr = this.f103821e;
            Object[] objArr2 = objArr[i2 - 1];
            Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = objArr2[C36371Ui6.m80985a(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    /* renamed from: i */
    public final void m19095i(int i) {
        int i2 = 0;
        while (C36371Ui6.m80985a(m99365c(), i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            m19096h(m99365c(), ((this.f103820d - 1) - (i2 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* renamed from: j */
    public final void m19094j(Object[] root, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(root, "root");
        m99363e(i);
        m99362f(i2);
        this.f103820d = i3;
        if (this.f103821e.length < i3) {
            this.f103821e = new Object[i3];
        }
        ?? r0 = 0;
        this.f103821e[0] = root;
        if (i == i2) {
            r0 = 1;
        }
        this.f103822f = r0;
        m19096h(i - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (hasNext()) {
            E m19097g = m19097g();
            m99363e(m99365c() + 1);
            if (m99365c() == m99364d()) {
                this.f103822f = true;
                return m19097g;
            }
            m19095i(0);
            return m19097g;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public E previous() {
        if (hasPrevious()) {
            m99363e(m99365c() - 1);
            if (this.f103822f) {
                this.f103822f = false;
                return m19097g();
            }
            m19095i(31);
            return m19097g();
        }
        throw new NoSuchElementException();
    }
}
