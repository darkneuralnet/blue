package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes8.dex */
public /* synthetic */ class KClassImpl$getLocalProperty$2$1$1 extends FunctionReference implements Function2<MemberDeserializer, ProtoBuf.Property, PropertyDescriptor> {
    public static final KClassImpl$getLocalProperty$2$1$1 INSTANCE = new KClassImpl$getLocalProperty$2$1$1();

    public KClassImpl$getLocalProperty$2$1$1() {
        super(2);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "loadProperty";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(MemberDeserializer.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
    }

    @Override // kotlin.jvm.functions.Function2
    public final PropertyDescriptor invoke(MemberDeserializer p0, ProtoBuf.Property p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return p0.loadProperty(p1);
    }
}