package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import p000.AbstractC41381gB0;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001Bæ\u0001\u0012\u0016\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00180\u0017\u0012*\u0010\u001b\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u0017\u0012.\u0010\u001f\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u001cj\u0006\u0012\u0002\b\u0003`\u001d0\u0017\u0012&\u0010 \u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u0017\u0012A\u0010%\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u001cj\u0006\u0012\u0002\b\u0003`$0\u0017¢\u0006\u0004\b&\u0010'J9\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ4\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f\"\b\b\u0000\u0010\u0003*\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J:\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R$\u0010\u001a\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R8\u0010\u001b\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u00178\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R<\u0010\u001f\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u001cj\u0006\u0012\u0002\b\u0003`\u001d0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R4\u0010 \u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019RO\u0010%\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u001cj\u0006\u0012\u0002\b\u0003`$0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006("}, m28432d2 = {"LUs5;", "Lkt5;", "", "T", "Lkotlin/reflect/KClass;", "baseClass", "value", "Let5;", "e", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Let5;", "", "serializedClassName", "LE01;", DateTokenConverter.CONVERTER_KEY, "kClass", "", "LKj2;", "typeArgumentsSerializers", "b", "Lmt5;", "collector", "", C17296a.f69688o, "", "LgB0;", "Ljava/util/Map;", "class2ContextualFactory", "polyBase2Serializers", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "c", "polyBase2DefaultSerializerProvider", "polyBase2NamedSerializers", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "polyBase2DefaultDeserializerProvider", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,236:1\n215#2,2:237\n215#2:239\n215#2:240\n216#2:242\n216#2:243\n215#2,2:244\n215#2,2:246\n80#3:241\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n*L\n177#1:237,2\n187#1:239\n188#1:240\n188#1:242\n187#1:243\n197#1:244,2\n201#1:246,2\n192#1:241\n*E\n"})
/* renamed from: Us5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C36460Us5 extends AbstractC44173kt5 {

    /* renamed from: a */
    public final Map<KClass<?>, AbstractC41381gB0> f38195a;
    @JvmField

    /* renamed from: b */
    public final Map<KClass<?>, Map<KClass<?>, InterfaceC34036Kj2<?>>> f38196b;

    /* renamed from: c */
    public final Map<KClass<?>, Function1<?, InterfaceC40615et5<?>>> f38197c;

    /* renamed from: d */
    public final Map<KClass<?>, Map<String, InterfaceC34036Kj2<?>>> f38198d;

    /* renamed from: e */
    public final Map<KClass<?>, Function1<String, E01<?>>> f38199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36460Us5(Map<KClass<?>, ? extends AbstractC41381gB0> class2ContextualFactory, Map<KClass<?>, ? extends Map<KClass<?>, ? extends InterfaceC34036Kj2<?>>> polyBase2Serializers, Map<KClass<?>, ? extends Function1<?, ? extends InterfaceC40615et5<?>>> polyBase2DefaultSerializerProvider, Map<KClass<?>, ? extends Map<String, ? extends InterfaceC34036Kj2<?>>> polyBase2NamedSerializers, Map<KClass<?>, ? extends Function1<? super String, ? extends E01<?>>> polyBase2DefaultDeserializerProvider) {
        super(null);
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f38195a = class2ContextualFactory;
        this.f38196b = polyBase2Serializers;
        this.f38197c = polyBase2DefaultSerializerProvider;
        this.f38198d = polyBase2NamedSerializers;
        this.f38199e = polyBase2DefaultDeserializerProvider;
    }

    @Override // p000.AbstractC44173kt5
    /* renamed from: a */
    public void mo28236a(InterfaceC45359mt5 collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry<KClass<?>, AbstractC41381gB0> entry : this.f38195a.entrySet()) {
            KClass<?> key = entry.getKey();
            AbstractC41381gB0 value = entry.getValue();
            if (value instanceof AbstractC41381gB0.C20767a) {
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                InterfaceC34036Kj2<?> m39951b = ((AbstractC41381gB0.C20767a) value).m39951b();
                Intrinsics.checkNotNull(m39951b, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.mo24758d(key, m39951b);
            } else if (value instanceof AbstractC41381gB0.C20768b) {
                collector.mo24757e(key, ((AbstractC41381gB0.C20768b) value).m39949b());
            }
        }
        for (Map.Entry<KClass<?>, Map<KClass<?>, InterfaceC34036Kj2<?>>> entry2 : this.f38196b.entrySet()) {
            KClass<?> key2 = entry2.getKey();
            for (Map.Entry<KClass<?>, InterfaceC34036Kj2<?>> entry3 : entry2.getValue().entrySet()) {
                KClass<?> key3 = entry3.getKey();
                InterfaceC34036Kj2<?> value2 = entry3.getValue();
                Intrinsics.checkNotNull(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.mo24759c(key2, key3, value2);
            }
        }
        for (Map.Entry<KClass<?>, Function1<?, InterfaceC40615et5<?>>> entry4 : this.f38197c.entrySet()) {
            KClass<?> key4 = entry4.getKey();
            Function1<?, InterfaceC40615et5<?>> value3 = entry4.getValue();
            Intrinsics.checkNotNull(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'value')] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicSerializerProvider<kotlin.Any> }");
            collector.mo24760b(key4, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value3, 1));
        }
        for (Map.Entry<KClass<?>, Function1<String, E01<?>>> entry5 : this.f38199e.entrySet()) {
            KClass<?> key5 = entry5.getKey();
            Function1<String, E01<?>> value4 = entry5.getValue();
            Intrinsics.checkNotNull(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = 'className')] kotlin.String?, kotlinx.serialization.DeserializationStrategy<out kotlin.Any>?>{ kotlinx.serialization.modules.SerializersModuleKt.PolymorphicDeserializerProvider<out kotlin.Any> }");
            collector.mo24761a(key5, (Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(value4, 1));
        }
    }

    @Override // p000.AbstractC44173kt5
    /* renamed from: b */
    public <T> InterfaceC34036Kj2<T> mo28235b(KClass<T> kClass, List<? extends InterfaceC34036Kj2<?>> typeArgumentsSerializers) {
        InterfaceC34036Kj2<?> interfaceC34036Kj2;
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        AbstractC41381gB0 abstractC41381gB0 = this.f38195a.get(kClass);
        if (abstractC41381gB0 != null) {
            interfaceC34036Kj2 = abstractC41381gB0.mo39950a(typeArgumentsSerializers);
        } else {
            interfaceC34036Kj2 = null;
        }
        if (!(interfaceC34036Kj2 instanceof InterfaceC34036Kj2)) {
            return null;
        }
        return (InterfaceC34036Kj2<T>) interfaceC34036Kj2;
    }

    @Override // p000.AbstractC44173kt5
    /* renamed from: d */
    public <T> E01<T> mo28233d(KClass<? super T> baseClass, String str) {
        InterfaceC34036Kj2<?> interfaceC34036Kj2;
        Function1<String, E01<?>> function1;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map<String, InterfaceC34036Kj2<?>> map = this.f38198d.get(baseClass);
        if (map != null) {
            interfaceC34036Kj2 = map.get(str);
        } else {
            interfaceC34036Kj2 = null;
        }
        if (!(interfaceC34036Kj2 instanceof InterfaceC34036Kj2)) {
            interfaceC34036Kj2 = null;
        }
        if (interfaceC34036Kj2 != null) {
            return interfaceC34036Kj2;
        }
        Function1<String, E01<?>> function12 = this.f38199e.get(baseClass);
        if (TypeIntrinsics.isFunctionOfArity(function12, 1)) {
            function1 = function12;
        } else {
            function1 = null;
        }
        if (function1 == null) {
            return null;
        }
        return (E01<T>) function1.invoke(str);
    }

    @Override // p000.AbstractC44173kt5
    /* renamed from: e */
    public <T> InterfaceC40615et5<T> mo28232e(KClass<? super T> baseClass, T value) {
        InterfaceC34036Kj2<?> interfaceC34036Kj2;
        Function1<?, InterfaceC40615et5<?>> function1;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        Map<KClass<?>, InterfaceC34036Kj2<?>> map = this.f38196b.get(baseClass);
        if (map != null) {
            interfaceC34036Kj2 = map.get(Reflection.getOrCreateKotlinClass(value.getClass()));
        } else {
            interfaceC34036Kj2 = null;
        }
        if (!(interfaceC34036Kj2 instanceof InterfaceC40615et5)) {
            interfaceC34036Kj2 = null;
        }
        if (interfaceC34036Kj2 != null) {
            return interfaceC34036Kj2;
        }
        Function1<?, InterfaceC40615et5<?>> function12 = this.f38197c.get(baseClass);
        if (TypeIntrinsics.isFunctionOfArity(function12, 1)) {
            function1 = function12;
        } else {
            function1 = null;
        }
        if (function1 == null) {
            return null;
        }
        return (InterfaceC40615et5<T>) function1.invoke(value);
    }
}
