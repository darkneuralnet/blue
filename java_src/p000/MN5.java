package p000;

import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0004"}, m28432d2 = {"T", "LLN5;", "", C17296a.f69688o, "collection-ktx"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: MN5 */
/* loaded from: classes.dex */
public final class MN5 {

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"MN5$a", "", "", "hasNext", "kotlin.jvm.PlatformType", "next", "()Ljava/lang/Object;", "", "b", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "collection-ktx"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: MN5$a */
    /* loaded from: classes.dex */
    public static final class C5283a implements Iterator<T>, KMappedMarker {

        /* renamed from: b */
        public int f23047b;

        /* renamed from: c */
        public final /* synthetic */ LN5 f23048c;

        public C5283a(LN5<T> ln5) {
            this.f23048c = ln5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23047b < this.f23048c.size();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            LN5 ln5 = this.f23048c;
            int i = this.f23047b;
            this.f23047b = i + 1;
            return ln5.m96975t(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m95368a(LN5<T> ln5) {
        return new C5283a(ln5);
    }
}
