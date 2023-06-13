package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.A24;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-¢\u0006\u0004\b/\u00100J\u0013\u0010\u0007\u001a\u00020\u0006*\u00028\u0002H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00028\u0001*\u00028\u0002H\u0004¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f*\u00028\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f*\u00028\u0001H\u0004¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\f*\u00028\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00028\u0002H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0001H$¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\u0006H$¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0001¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00028\u00012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00061"}, m28432d2 = {"LC24;", "Element", "Array", "LA24;", "Builder", "Lhm0;", "", "p", "(LA24;)I", "t", "(LA24;)Ljava/lang/Object;", "size", "", "q", "(LA24;I)V", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/util/Iterator;", "index", "element", "s", "(LA24;ILjava/lang/Object;)V", "o", "()LA24;", "r", "()Ljava/lang/Object;", "LUt0;", "encoder", "content", "u", "(LUt0;Ljava/lang/Object;I)V", "Lrb1;", "value", "serialize", "(Lrb1;Ljava/lang/Object;)V", "LGV0;", "decoder", "deserialize", "(LGV0;)Ljava/lang/Object;", "LMs5;", "b", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "LKj2;", "primitiveSerializer", "<init>", "(LKj2;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n1#1,283:1\n488#2,4:284\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n*L\n174#1:284,4\n*E\n"})
/* renamed from: C24 */
/* loaded from: classes8.dex */
public abstract class C24<Element, Array, Builder extends A24<Array>> extends AbstractC42319hm0<Element, Array, Builder> {

    /* renamed from: b */
    public final InterfaceC34588Ms5 f3320b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24(InterfaceC34036Kj2<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f3320b = new B24(primitiveSerializer.getDescriptor());
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: d */
    public final Iterator<Element> mo28033d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // p000.AbstractC25581l0, p000.E01
    public final Array deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return m28032f(decoder, null);
    }

    @Override // p000.AbstractC42319hm0, p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public final InterfaceC34588Ms5 getDescriptor() {
        return this.f3320b;
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: o */
    public final Builder mo15386a() {
        return (Builder) mo5866k(mo5865r());
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: p */
    public final int mo15385b(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return builder.mo9204d();
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: q */
    public final void mo15384c(Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        builder.mo9205b(i);
    }

    /* renamed from: r */
    public abstract Array mo5865r();

    @Override // p000.AbstractC42319hm0
    /* renamed from: s */
    public final void mo15382n(Builder builder, int i, Element element) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    @Override // p000.AbstractC42319hm0, p000.InterfaceC40615et5
    public final void serialize(InterfaceC48140rb1 encoder, Array array) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int mo5868e = mo5868e(array);
        InterfaceC34588Ms5 interfaceC34588Ms5 = this.f3320b;
        InterfaceC36464Ut0 mo1125z = encoder.mo1125z(interfaceC34588Ms5, mo5868e);
        mo5864u(mo1125z, array, mo5868e);
        mo1125z.mo1151a(interfaceC34588Ms5);
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: t */
    public final Array mo15383l(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        return (Array) builder.mo9206a();
    }

    /* renamed from: u */
    public abstract void mo5864u(InterfaceC36464Ut0 interfaceC36464Ut0, Array array, int i);
}
