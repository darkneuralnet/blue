package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;
import p000.InterfaceC36230Tt0;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0017J'\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lb1;", "", "T", "LKj2;", "Lrb1;", "encoder", "value", "", "serialize", "(Lrb1;Ljava/lang/Object;)V", "LGV0;", "decoder", "deserialize", "(LGV0;)Ljava/lang/Object;", "LTt0;", "", "klassName", "LE01;", "c", "Let5;", DateTokenConverter.CONVERTER_KEY, "(Lrb1;Ljava/lang/Object;)Let5;", "compositeDecoder", "b", "(LTt0;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "<init>", "()V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAbstractPolymorphicSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n475#2,2:116\n477#2,2:119\n84#3:118\n565#4,2:121\n567#4,2:124\n1#5:123\n*S KotlinDebug\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n*L\n33#1:116,2\n33#1:119,2\n35#1:118\n39#1:121,2\n39#1:124,2\n*E\n"})
/* renamed from: b1 */
/* loaded from: classes8.dex */
public abstract class AbstractC12270b1<T> implements InterfaceC34036Kj2<T> {
    /* renamed from: b */
    public final T m65120b(InterfaceC36230Tt0 interfaceC36230Tt0) {
        return (T) InterfaceC36230Tt0.C8139a.m82314c(interfaceC36230Tt0, getDescriptor(), 1, RX3.m86631a(this, interfaceC36230Tt0, interfaceC36230Tt0.mo3296e(getDescriptor(), 0)), null, 8, null);
    }

    /* renamed from: c */
    public E01<T> mo29846c(InterfaceC36230Tt0 decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.mo3297c().mo28233d(mo29844e(), str);
    }

    /* renamed from: d */
    public InterfaceC40615et5<T> mo29845d(InterfaceC48140rb1 encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.mo1147c().mo28232e(mo29844e(), value);
    }

    @Override // p000.E01
    public final T deserialize(GV0 decoder) {
        T t;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (mo3298b.mo3290k()) {
            t = (T) m65120b(mo3298b);
        } else {
            t = null;
            while (true) {
                int mo11843q = mo3298b.mo11843q(getDescriptor());
                if (mo11843q != -1) {
                    if (mo11843q != 0) {
                        if (mo11843q != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) objectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(mo11843q);
                            throw new SerializationException(sb.toString());
                        }
                        T t2 = objectRef.element;
                        if (t2 != null) {
                            objectRef.element = t2;
                            t = (T) InterfaceC36230Tt0.C8139a.m82314c(mo3298b, getDescriptor(), mo11843q, RX3.m86631a(this, mo3298b, (String) t2), null, 8, null);
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                    } else {
                        objectRef.element = (T) mo3298b.mo3296e(getDescriptor(), mo11843q);
                    }
                } else if (t != null) {
                    Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                } else {
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.element)).toString());
                }
            }
        }
        mo3298b.mo3300a(descriptor);
        return t;
    }

    /* renamed from: e */
    public abstract KClass<T> mo29844e();

    @Override // p000.InterfaceC40615et5
    public final void serialize(InterfaceC48140rb1 encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC40615et5<? super T> m86630b = RX3.m86630b(this, encoder, value);
        InterfaceC34588Ms5 descriptor = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor);
        mo1149b.mo1128w(getDescriptor(), 0, m86630b.getDescriptor().mo10456h());
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(m86630b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        mo1149b.mo1126y(descriptor2, 1, m86630b, value);
        mo1149b.mo1151a(descriptor);
    }
}
