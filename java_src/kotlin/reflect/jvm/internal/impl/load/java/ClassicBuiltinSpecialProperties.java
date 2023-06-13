package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
@SourceDebugExtension({"SMAP\nClassicBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1747#3,3:38\n*S KotlinDebug\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n*L\n33#1:38,3\n*E\n"})
/* loaded from: classes8.dex */
public final class ClassicBuiltinSpecialProperties {
    public static final ClassicBuiltinSpecialProperties INSTANCE = new ClassicBuiltinSpecialProperties();

    private ClassicBuiltinSpecialProperties() {
    }

    private final boolean hasBuiltinSpecialPropertyFqNameImpl(CallableMemberDescriptor callableMemberDescriptor) {
        boolean contains;
        contains = CollectionsKt___CollectionsKt.contains(BuiltinSpecialProperties.INSTANCE.getSPECIAL_FQ_NAMES(), DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor));
        if (contains && callableMemberDescriptor.getValueParameters().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.isBuiltIn(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "overriddenDescriptors");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        if (!collection.isEmpty()) {
            for (CallableMemberDescriptor it : collection) {
                ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = INSTANCE;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (classicBuiltinSpecialProperties.hasBuiltinSpecialPropertyFqName(it)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String getBuiltinSpecialPropertyGetterName(CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
        CallableMemberDescriptor firstOverridden$default = DescriptorUtilsKt.firstOverridden$default(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor), false, C25318xccd5eab2.INSTANCE, 1, null);
        if (firstOverridden$default == null || (name = BuiltinSpecialProperties.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(DescriptorUtilsKt.getFqNameSafe(firstOverridden$default))) == null) {
            return null;
        }
        return name.asString();
    }

    public final boolean hasBuiltinSpecialPropertyFqName(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (!BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        return hasBuiltinSpecialPropertyFqNameImpl(callableMemberDescriptor);
    }
}
