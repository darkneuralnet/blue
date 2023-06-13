package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Typography;
import kotlinx.serialization.SerializationException;
import p000.OX3;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\b\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0014\u001a\u00020\u0013H$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m28432d2 = {"Lki2;", "", "T", "LKj2;", "Lkotlin/reflect/KClass;", "subClass", "baseClass", "", "throwSubtypeNotRegistered", "Lrb1;", "encoder", "value", "", "serialize", "(Lrb1;Ljava/lang/Object;)V", "LGV0;", "decoder", "deserialize", "(LGV0;)Ljava/lang/Object;", "Lxi2;", "element", "LE01;", "selectDeserializer", "Lkotlin/reflect/KClass;", "LMs5;", "descriptor", "LMs5;", "getDescriptor", "()LMs5;", "<init>", "(Lkotlin/reflect/KClass;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ki2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44060ki2<T> implements InterfaceC34036Kj2<T> {
    private final KClass<T> baseClass;
    private final InterfaceC34588Ms5 descriptor;

    public AbstractC44060ki2(KClass<T> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = C35524Qs5.m87850c("JsonContentPolymorphicSerializer<" + baseClass.getSimpleName() + Typography.greater, OX3.C6028b.f26739a, new InterfaceC34588Ms5[0], null, 8, null);
    }

    private final Void throwSubtypeNotRegistered(KClass<?> kClass, KClass<?> kClass2) {
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(kClass);
        }
        throw new SerializationException("Class '" + simpleName + "' is not registered for polymorphic serialization " + ("in the scope of '" + kClass2.getSimpleName() + CoreConstants.SINGLE_QUOTE_CHAR) + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    @Override // p000.E01
    public final T deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC48803si2 m111822d = C32155Ci2.m111822d(decoder);
        AbstractC51767xi2 mo13802v = m111822d.mo13802v();
        E01<T> selectDeserializer = selectDeserializer(mo13802v);
        Intrinsics.checkNotNull(selectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) m111822d.mo13803d().m64106a((InterfaceC34036Kj2) selectDeserializer, mo13802v);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return this.descriptor;
    }

    public abstract E01<T> selectDeserializer(AbstractC51767xi2 abstractC51767xi2);

    @Override // p000.InterfaceC40615et5
    public final void serialize(InterfaceC48140rb1 encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC40615et5<T> mo28232e = encoder.mo1147c().mo28232e(this.baseClass, value);
        if (mo28232e == null && (mo28232e = C42987it5.m31675a(Reflection.getOrCreateKotlinClass(value.getClass()))) == null) {
            throwSubtypeNotRegistered(Reflection.getOrCreateKotlinClass(value.getClass()), this.baseClass);
            throw new KotlinNothingValueException();
        } else {
            ((InterfaceC34036Kj2) mo28232e).serialize(encoder, value);
        }
    }
}
