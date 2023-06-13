package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
@SourceDebugExtension({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1549#2:239\n1620#2,3:240\n*S KotlinDebug\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2\n*L\n87#1:239\n87#1:240,3\n*E\n"})
/* loaded from: classes8.dex */
public final class TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2 extends Lambda implements Function0<TypeAliasConstructorDescriptorImpl> {
    final /* synthetic */ ClassConstructorDescriptor $underlyingConstructorDescriptor;
    final /* synthetic */ TypeAliasConstructorDescriptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ClassConstructorDescriptor classConstructorDescriptor) {
        super(0);
        this.this$0 = typeAliasConstructorDescriptorImpl;
        this.$underlyingConstructorDescriptor = classConstructorDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TypeAliasConstructorDescriptorImpl invoke() {
        TypeSubstitutor typeSubstitutorForUnderlyingClass;
        int collectionSizeOrDefault;
        StorageManager storageManager = this.this$0.getStorageManager();
        TypeAliasDescriptor typeAliasDescriptor = this.this$0.getTypeAliasDescriptor();
        ClassConstructorDescriptor classConstructorDescriptor = this.$underlyingConstructorDescriptor;
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.this$0;
        Annotations annotations = classConstructorDescriptor.getAnnotations();
        CallableMemberDescriptor.Kind kind = this.$underlyingConstructorDescriptor.getKind();
        Intrinsics.checkNotNullExpressionValue(kind, "underlyingConstructorDescriptor.kind");
        SourceElement source = this.this$0.getTypeAliasDescriptor().getSource();
        Intrinsics.checkNotNullExpressionValue(source, "typeAliasDescriptor.source");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, classConstructorDescriptor, typeAliasConstructorDescriptorImpl, annotations, kind, source, null);
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl3 = this.this$0;
        ClassConstructorDescriptor classConstructorDescriptor2 = this.$underlyingConstructorDescriptor;
        typeSubstitutorForUnderlyingClass = TypeAliasConstructorDescriptorImpl.Companion.getTypeSubstitutorForUnderlyingClass(typeAliasConstructorDescriptorImpl3.getTypeAliasDescriptor());
        if (typeSubstitutorForUnderlyingClass == null) {
            return null;
        }
        ReceiverParameterDescriptor dispatchReceiverParameter = classConstructorDescriptor2.getDispatchReceiverParameter();
        ReceiverParameterDescriptor substitute = dispatchReceiverParameter != null ? dispatchReceiverParameter.substitute(typeSubstitutorForUnderlyingClass) : null;
        List<ReceiverParameterDescriptor> contextReceiverParameters = classConstructorDescriptor2.getContextReceiverParameters();
        Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "underlyingConstructorDes…contextReceiverParameters");
        List<ReceiverParameterDescriptor> list = contextReceiverParameters;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (ReceiverParameterDescriptor receiverParameterDescriptor : list) {
            arrayList.add(receiverParameterDescriptor.substitute(typeSubstitutorForUnderlyingClass));
        }
        typeAliasConstructorDescriptorImpl2.initialize(null, substitute, arrayList, typeAliasConstructorDescriptorImpl3.getTypeAliasDescriptor().getDeclaredTypeParameters(), typeAliasConstructorDescriptorImpl3.getValueParameters(), typeAliasConstructorDescriptorImpl3.getReturnType(), Modality.FINAL, typeAliasConstructorDescriptorImpl3.getTypeAliasDescriptor().getVisibility());
        return typeAliasConstructorDescriptorImpl2;
    }
}
