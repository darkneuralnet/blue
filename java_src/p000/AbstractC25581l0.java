package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\t\b\u0004¢\u0006\u0004\b(\u0010)J\u0013\u0010\u0006\u001a\u00020\u0005*\u00028\u0001H$¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b*\u00028\u0001H$¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0002H$¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0005*\u00028\u0002H$¢\u0006\u0004\b\r\u0010\u0007J\u0013\u0010\u000e\u001a\u00028\u0001*\u00028\u0002H$¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00028\u0002*\u00028\u0001H$¢\u0006\u0004\b\u0010\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00028\u00022\u0006\u0010\u0011\u001a\u00020\u0005H$¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010!\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u00022\b\b\u0002\u0010 \u001a\u00020\u001fH$¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00028\u00022\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H$¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00028\u0002H\u0002¢\u0006\u0004\b&\u0010'\u0082\u0001\u0002*+¨\u0006,"}, m28432d2 = {"Ll0;", "Element", "Collection", "Builder", "LKj2;", "", "e", "(Ljava/lang/Object;)I", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/util/Iterator;", C17296a.f69688o, "()Ljava/lang/Object;", "b", "l", "(Ljava/lang/Object;)Ljava/lang/Object;", "k", "size", "", "c", "(Ljava/lang/Object;I)V", "LGV0;", "decoder", "previous", "f", "(LGV0;Ljava/lang/Object;)Ljava/lang/Object;", "deserialize", "(LGV0;)Ljava/lang/Object;", "LTt0;", "index", "builder", "", "checkIndex", "h", "(LTt0;ILjava/lang/Object;Z)V", "startIndex", "g", "(LTt0;Ljava/lang/Object;II)V", "j", "(LTt0;Ljava/lang/Object;)I", "<init>", "()V", "Lhm0;", "LvK2;", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: l0 */
/* loaded from: classes8.dex */
public abstract class AbstractC25581l0<Element, Collection, Builder> implements InterfaceC34036Kj2<Collection> {
    public /* synthetic */ AbstractC25581l0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: i */
    public static /* synthetic */ void m28031i(AbstractC25581l0 abstractC25581l0, InterfaceC36230Tt0 interfaceC36230Tt0, int i, Object obj, boolean z, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        abstractC25581l0.mo5867h(interfaceC36230Tt0, i, obj, z);
    }

    /* renamed from: a */
    public abstract Builder mo15386a();

    /* renamed from: b */
    public abstract int mo15385b(Builder builder);

    /* renamed from: c */
    public abstract void mo15384c(Builder builder, int i);

    /* renamed from: d */
    public abstract Iterator<Element> mo28033d(Collection collection);

    public Collection deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return m28032f(decoder, null);
    }

    /* renamed from: e */
    public abstract int mo5868e(Collection collection);

    /* renamed from: f */
    public final Collection m28032f(GV0 decoder, Collection collection) {
        Builder mo15386a;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (collection == null || (mo15386a = mo5866k(collection)) == null) {
            mo15386a = mo15386a();
        }
        int mo15385b = mo15385b(mo15386a);
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(getDescriptor());
        if (!mo3298b.mo3290k()) {
            while (true) {
                int mo11843q = mo3298b.mo11843q(getDescriptor());
                if (mo11843q == -1) {
                    break;
                }
                m28031i(this, mo3298b, mo15385b + mo11843q, mo15386a, false, 8, null);
            }
        } else {
            mo8897g(mo3298b, mo15386a, mo15385b, m28030j(mo3298b, mo15386a));
        }
        mo3298b.mo3300a(getDescriptor());
        return mo15383l(mo15386a);
    }

    /* renamed from: g */
    public abstract void mo8897g(InterfaceC36230Tt0 interfaceC36230Tt0, Builder builder, int i, int i2);

    /* renamed from: h */
    public abstract void mo5867h(InterfaceC36230Tt0 interfaceC36230Tt0, int i, Builder builder, boolean z);

    /* renamed from: j */
    public final int m28030j(InterfaceC36230Tt0 interfaceC36230Tt0, Builder builder) {
        int mo3278y = interfaceC36230Tt0.mo3278y(getDescriptor());
        mo15384c(builder, mo3278y);
        return mo3278y;
    }

    /* renamed from: k */
    public abstract Builder mo5866k(Collection collection);

    /* renamed from: l */
    public abstract Collection mo15383l(Builder builder);

    private AbstractC25581l0() {
    }
}
