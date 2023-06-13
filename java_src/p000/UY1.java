package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\bJ\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m28432d2 = {"LUY1;", "E", "", "LRY1;", "", "fromIndex", "toIndex", "subList", C17296a.f69688o, "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UY1 */
/* loaded from: classes.dex */
public interface UY1<E> extends List<E>, RY1<E>, KMappedMarker {

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B%\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LUY1$a;", "E", "LUY1;", "Lkotlin/collections/AbstractList;", "", "index", "get", "(I)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "b", "LUY1;", Stripe3ds2AuthParams.FIELD_SOURCE, "c", "I", DateTokenConverter.CONVERTER_KEY, "e", "_size", "getSize", "()I", "size", "<init>", "(LUY1;II)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: UY1$a */
    /* loaded from: classes.dex */
    public static final class C8310a<E> extends AbstractList<E> implements UY1<E> {

        /* renamed from: b */
        public final UY1<E> f37520b;

        /* renamed from: c */
        public final int f37521c;

        /* renamed from: d */
        public final int f37522d;

        /* renamed from: e */
        public int f37523e;

        /* JADX WARN: Multi-variable type inference failed */
        public C8310a(UY1<? extends E> source, int i, int i2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f37520b = source;
            this.f37521c = i;
            this.f37522d = i2;
            C38213as2.m65371c(i, i2, source.size());
            this.f37523e = i2 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i) {
            C38213as2.m65373a(i, this.f37523e);
            return this.f37520b.get(this.f37521c + i);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.f37523e;
        }

        @Override // kotlin.collections.AbstractList, java.util.List, p000.UY1
        public UY1<E> subList(int i, int i2) {
            C38213as2.m65371c(i, i2, this.f37523e);
            UY1<E> uy1 = this.f37520b;
            int i3 = this.f37521c;
            return new C8310a(uy1, i + i3, i3 + i2);
        }
    }

    @Override // java.util.List
    default UY1<E> subList(int i, int i2) {
        return new C8310a(this, i, i2);
    }
}
