package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.full.KClasses;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0017\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m28432d2 = {"Llq5;", "Lnf1;", "Lcom/fasterxml/jackson/databind/cfg/SerializerFactoryConfig;", "config", "Lcom/fasterxml/jackson/databind/ser/SerializerFactory;", "withConfig", "Lcom/fasterxml/jackson/databind/SerializerProvider;", "prov", "Lcom/fasterxml/jackson/databind/JavaType;", "origType", "Lcom/fasterxml/jackson/databind/JsonSerializer;", "", "createSerializer", "Lkotlin/Function0;", "Lcom/fasterxml/jackson/databind/SerializationConfig;", "c", "Lkotlin/jvm/functions/Function0;", "Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "b", "()Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;", "defaultSerializerProvider", "factoryConfig", "Lef1;", "enumCache", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/fasterxml/jackson/databind/cfg/SerializerFactoryConfig;Lef1;)V", "co.bird.android.lib.persistence.common"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSealedClassSerializerFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedClassSerializerFactory.kt\nco/bird/android/persistence/common/impl/serialization/factories/SealedClassSerializerFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1747#2,3:44\n*S KotlinDebug\n*F\n+ 1 SealedClassSerializerFactory.kt\nco/bird/android/persistence/common/impl/serialization/factories/SealedClassSerializerFactory\n*L\n38#1:44,3\n*E\n"})
/* renamed from: lq5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44736lq5 extends C45808nf1 {

    /* renamed from: c */
    public final Function0<SerializationConfig> f96794c;

    /* renamed from: d */
    public final Lazy f96795d;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;", "kotlin.jvm.PlatformType", "b", "()Lcom/fasterxml/jackson/databind/ser/DefaultSerializerProvider$Impl;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lq5$a */
    /* loaded from: classes4.dex */
    public static final class C25801a extends Lambda implements Function0<DefaultSerializerProvider.Impl> {
        public C25801a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final DefaultSerializerProvider.Impl invoke() {
            return new DefaultSerializerProvider.Impl().createInstance((SerializationConfig) C44736lq5.this.f96794c.invoke(), (SerializerFactory) BeanSerializerFactory.instance);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44736lq5(Function0<SerializationConfig> config, SerializerFactoryConfig serializerFactoryConfig, C40471ef1 enumCache) {
        super(serializerFactoryConfig, enumCache);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(enumCache, "enumCache");
        this.f96794c = config;
        lazy = LazyKt__LazyJVMKt.lazy(new C25801a());
        this.f96795d = lazy;
    }

    /* renamed from: b */
    public final DefaultSerializerProvider.Impl m26745b() {
        return (DefaultSerializerProvider.Impl) this.f96795d.getValue();
    }

    @Override // p000.C45808nf1, com.fasterxml.jackson.databind.ser.BeanSerializerFactory, com.fasterxml.jackson.databind.ser.BasicSerializerFactory, com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType origType) {
        Intrinsics.checkNotNullParameter(prov, "prov");
        Intrinsics.checkNotNullParameter(origType, "origType");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(origType.getRawClass());
        if (!orCreateKotlinClass.isSealed()) {
            List<KClass<?>> superclasses = KClasses.getSuperclasses(orCreateKotlinClass);
            boolean z = false;
            if (!(superclasses instanceof Collection) || !superclasses.isEmpty()) {
                Iterator<T> it = superclasses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((KClass) it.next()).isSealed()) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                return super.createSerializer(prov, origType);
            }
        }
        DefaultSerializerProvider.Impl defaultSerializerProvider = m26745b();
        Intrinsics.checkNotNullExpressionValue(defaultSerializerProvider, "defaultSerializerProvider");
        return new C44143kq5(orCreateKotlinClass, defaultSerializerProvider);
    }

    @Override // p000.C45808nf1, com.fasterxml.jackson.databind.ser.BeanSerializerFactory, com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public SerializerFactory withConfig(SerializerFactoryConfig serializerFactoryConfig) {
        return new C44736lq5(this.f96794c, serializerFactoryConfig, m23346a());
    }
}
