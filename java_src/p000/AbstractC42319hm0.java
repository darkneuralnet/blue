package p000;

import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC36230Tt0;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b#\u0010$J#\u0010\t\u001a\u00020\b*\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0001\u0002%&¨\u0006'"}, m28432d2 = {"Lhm0;", "Element", "Collection", "Builder", "Ll0;", "", "index", "element", "", "n", "(Ljava/lang/Object;ILjava/lang/Object;)V", "Lrb1;", "encoder", "value", "serialize", "(Lrb1;Ljava/lang/Object;)V", "LTt0;", "decoder", "builder", "startIndex", "size", "g", "(LTt0;Ljava/lang/Object;II)V", "", "checkIndex", "h", "(LTt0;ILjava/lang/Object;Z)V", "LKj2;", C17296a.f69688o, "LKj2;", "elementSerializer", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "(LKj2;)V", "Lim0;", "LC24;", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n488#2,4:284\n1#3:288\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n*L\n66#1:284,4\n*E\n"})
/* renamed from: hm0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42319hm0<Element, Collection, Builder> extends AbstractC25581l0<Element, Collection, Builder> {

    /* renamed from: a */
    public final InterfaceC34036Kj2<Element> f85867a;

    public /* synthetic */ AbstractC42319hm0(InterfaceC34036Kj2 interfaceC34036Kj2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC34036Kj2);
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: g */
    public final void mo8897g(InterfaceC36230Tt0 decoder, Builder builder, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i3 = 0; i3 < i2; i3++) {
                mo5867h(decoder, i + i3, builder, false);
            }
            return;
        }
        throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public abstract InterfaceC34588Ms5 getDescriptor();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC25581l0
    /* renamed from: h */
    public void mo5867h(InterfaceC36230Tt0 decoder, int i, Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        mo15382n(builder, i, InterfaceC36230Tt0.C8139a.m82314c(decoder, getDescriptor(), i, this.f85867a, null, 8, null));
    }

    /* renamed from: n */
    public abstract void mo15382n(Builder builder, int i, Element element);

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, Collection collection) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int mo5868e = mo5868e(collection);
        InterfaceC34588Ms5 descriptor = getDescriptor();
        InterfaceC36464Ut0 mo1125z = encoder.mo1125z(descriptor, mo5868e);
        Iterator<Element> mo28033d = mo28033d(collection);
        for (int i = 0; i < mo5868e; i++) {
            mo1125z.mo1126y(getDescriptor(), i, this.f85867a, mo28033d.next());
        }
        mo1125z.mo1151a(descriptor);
    }

    public AbstractC42319hm0(InterfaceC34036Kj2<Element> interfaceC34036Kj2) {
        super(null);
        this.f85867a = interfaceC34036Kj2;
    }
}
