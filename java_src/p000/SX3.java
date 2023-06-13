package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import p000.AbstractC36226Ts5;
import p000.InterfaceC45359mt5;
import p000.RS5;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(JQ\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042/\u0010\f\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006H\u0016JF\u0010\u0014\u001a\u00020\r\"\b\b\u0000\u0010\u000f*\u00020\u0002\"\b\b\u0001\u0010\u0010*\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016JK\u0010\u0018\u001a\u00020\r\"\b\b\u0000\u0010\u000f*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042)\u0010\u0017\u001a%\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00160\u0006H\u0016JM\u0010\u001d\u001a\u00020\r\"\b\b\u0000\u0010\u000f*\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042+\u0010\u001c\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001a\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001b0\u0006H\u0016J\u001c\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\u001c\u0010!\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010&\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%¨\u0006)"}, m28432d2 = {"LSX3;", "Lmt5;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlin/Function1;", "", "LKj2;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "provider", "", "e", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "c", "value", "Let5;", "defaultSerializerProvider", "b", "", "className", "LE01;", "defaultDeserializerProvider", C17296a.f69688o, "LMs5;", "descriptor", "g", "f", "", "Z", "useArrayPolymorphism", "Ljava/lang/String;", "discriminator", "<init>", "(ZLjava/lang/String;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SX3 */
/* loaded from: classes8.dex */
public final class SX3 implements InterfaceC45359mt5 {

    /* renamed from: a */
    public final boolean f33857a;

    /* renamed from: b */
    public final String f33858b;

    public SX3(boolean z, String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.f33857a = z;
        this.f33858b = discriminator;
    }

    @Override // p000.InterfaceC45359mt5
    /* renamed from: a */
    public <Base> void mo24761a(KClass<Base> baseClass, Function1<? super String, ? extends E01<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // p000.InterfaceC45359mt5
    /* renamed from: b */
    public <Base> void mo24760b(KClass<Base> baseClass, Function1<? super Base, ? extends InterfaceC40615et5<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // p000.InterfaceC45359mt5
    /* renamed from: c */
    public <Base, Sub extends Base> void mo24759c(KClass<Base> baseClass, KClass<Sub> actualClass, InterfaceC34036Kj2<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        InterfaceC34588Ms5 descriptor = actualSerializer.getDescriptor();
        m85308g(descriptor, actualClass);
        if (!this.f33857a) {
            m85309f(descriptor, actualClass);
        }
    }

    @Override // p000.InterfaceC45359mt5
    /* renamed from: d */
    public <T> void mo24758d(KClass<T> kClass, InterfaceC34036Kj2<T> interfaceC34036Kj2) {
        InterfaceC45359mt5.C26285a.m24756a(this, kClass, interfaceC34036Kj2);
    }

    @Override // p000.InterfaceC45359mt5
    /* renamed from: e */
    public <T> void mo24757e(KClass<T> kClass, Function1<? super List<? extends InterfaceC34036Kj2<?>>, ? extends InterfaceC34036Kj2<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    /* renamed from: f */
    public final void m85309f(InterfaceC34588Ms5 interfaceC34588Ms5, KClass<?> kClass) {
        int mo10459e = interfaceC34588Ms5.mo10459e();
        for (int i = 0; i < mo10459e; i++) {
            String mo10458f = interfaceC34588Ms5.mo10458f(i);
            if (Intrinsics.areEqual(mo10458f, this.f33858b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + mo10458f + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* renamed from: g */
    public final void m85308g(InterfaceC34588Ms5 interfaceC34588Ms5, KClass<?> kClass) {
        AbstractC36226Ts5 kind = interfaceC34588Ms5.getKind();
        if (!(kind instanceof OX3) && !Intrinsics.areEqual(kind, AbstractC36226Ts5.C8135a.f36381a)) {
            if (this.f33857a) {
                return;
            }
            if (!Intrinsics.areEqual(kind, RS5.C7172b.f32057a) && !Intrinsics.areEqual(kind, RS5.C7173c.f32058a) && !(kind instanceof E24) && !(kind instanceof AbstractC36226Ts5.C8136b)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }
}
