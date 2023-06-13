package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\rJ\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002J6\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\n0\tH&R\u0014\u0010\u000f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m28432d2 = {"LR62;", "T", "", "", "index", "LR62$a;", "get", "fromIndex", "toIndex", "Lkotlin/Function1;", "", "block", "b", C17296a.f69688o, "()I", "size", "LtX2;", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: R62 */
/* loaded from: classes.dex */
public interface R62<T> {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R\u0017\u0010\r\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"LR62$a;", "T", "", "", C17296a.f69688o, "I", "b", "()I", "startIndex", "size", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(IILjava/lang/Object;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    /* renamed from: R62$a */
    /* loaded from: classes.dex */
    public static final class C7065a<T> {

        /* renamed from: a */
        public final int f31526a;

        /* renamed from: b */
        public final int f31527b;

        /* renamed from: c */
        public final T f31528c;

        public C7065a(int i, int i2, T t) {
            boolean z;
            this.f31526a = i;
            this.f31527b = i2;
            this.f31528c = t;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i2 > 0) {
                    return;
                }
                throw new IllegalArgumentException(("size should be >0, but was " + i2).toString());
            }
            throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i).toString());
        }

        /* renamed from: a */
        public final int m87321a() {
            return this.f31527b;
        }

        /* renamed from: b */
        public final int m87320b() {
            return this.f31526a;
        }

        /* renamed from: c */
        public final T m87319c() {
            return this.f31528c;
        }
    }

    /* renamed from: a */
    int mo12149a();

    /* renamed from: b */
    void mo12148b(int i, int i2, Function1<? super C7065a<? extends T>, Unit> function1);

    C7065a<T> get(int i);
}
