package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;
/* loaded from: classes8.dex */
public final class DeserializationComponents {
    private final AdditionalClassPartsProvider additionalClassPartsProvider;
    private final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader;
    private final ClassDataFinder classDataFinder;
    private final ClassDeserializer classDeserializer;
    private final DeserializationConfiguration configuration;
    private final ContractDeserializer contractDeserializer;
    private final ErrorReporter errorReporter;
    private final ExtensionRegistryLite extensionRegistryLite;
    private final Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories;
    private final FlexibleTypeDeserializer flexibleTypeDeserializer;
    private final NewKotlinTypeChecker kotlinTypeChecker;
    private final LocalClassifierTypeSettings localClassifierTypeSettings;
    private final LookupTracker lookupTracker;
    private final ModuleDescriptor moduleDescriptor;
    private final NotFoundClasses notFoundClasses;
    private final PackageFragmentProvider packageFragmentProvider;
    private final PlatformDependentDeclarationFilter platformDependentDeclarationFilter;
    private final PlatformDependentTypeTransformer platformDependentTypeTransformer;
    private final SamConversionResolver samConversionResolver;
    private final StorageManager storageManager;
    private final List<TypeAttributeTranslator> typeAttributeTranslators;

    /* JADX WARN: Multi-variable type inference failed */
    public DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration configuration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable<? extends ClassDescriptorFactory> fictitiousClassDescriptorFactories, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker kotlinTypeChecker, SamConversionResolver samConversionResolver, PlatformDependentTypeTransformer platformDependentTypeTransformer, List<? extends TypeAttributeTranslator> typeAttributeTranslators) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(classDataFinder, "classDataFinder");
        Intrinsics.checkNotNullParameter(annotationAndConstantLoader, "annotationAndConstantLoader");
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(localClassifierTypeSettings, "localClassifierTypeSettings");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        Intrinsics.checkNotNullParameter(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(contractDeserializer, "contractDeserializer");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(platformDependentTypeTransformer, "platformDependentTypeTransformer");
        Intrinsics.checkNotNullParameter(typeAttributeTranslators, "typeAttributeTranslators");
        this.storageManager = storageManager;
        this.moduleDescriptor = moduleDescriptor;
        this.configuration = configuration;
        this.classDataFinder = classDataFinder;
        this.annotationAndConstantLoader = annotationAndConstantLoader;
        this.packageFragmentProvider = packageFragmentProvider;
        this.localClassifierTypeSettings = localClassifierTypeSettings;
        this.errorReporter = errorReporter;
        this.lookupTracker = lookupTracker;
        this.flexibleTypeDeserializer = flexibleTypeDeserializer;
        this.fictitiousClassDescriptorFactories = fictitiousClassDescriptorFactories;
        this.notFoundClasses = notFoundClasses;
        this.contractDeserializer = contractDeserializer;
        this.additionalClassPartsProvider = additionalClassPartsProvider;
        this.platformDependentDeclarationFilter = platformDependentDeclarationFilter;
        this.extensionRegistryLite = extensionRegistryLite;
        this.kotlinTypeChecker = kotlinTypeChecker;
        this.samConversionResolver = samConversionResolver;
        this.platformDependentTypeTransformer = platformDependentTypeTransformer;
        this.typeAttributeTranslators = typeAttributeTranslators;
        this.classDeserializer = new ClassDeserializer(this);
    }

    public final DeserializationContext createContext(PackageFragmentDescriptor descriptor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource) {
        List emptyList;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return new DeserializationContext(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, deserializedContainerSource, null, emptyList);
    }

    public final ClassDescriptor deserializeClass(ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return ClassDeserializer.deserializeClass$default(this.classDeserializer, classId, null, 2, null);
    }

    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.additionalClassPartsProvider;
    }

    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> getAnnotationAndConstantLoader() {
        return this.annotationAndConstantLoader;
    }

    public final ClassDataFinder getClassDataFinder() {
        return this.classDataFinder;
    }

    public final ClassDeserializer getClassDeserializer() {
        return this.classDeserializer;
    }

    public final DeserializationConfiguration getConfiguration() {
        return this.configuration;
    }

    public final ContractDeserializer getContractDeserializer() {
        return this.contractDeserializer;
    }

    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public final ExtensionRegistryLite getExtensionRegistryLite() {
        return this.extensionRegistryLite;
    }

    public final Iterable<ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.fictitiousClassDescriptorFactories;
    }

    public final FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.flexibleTypeDeserializer;
    }

    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.kotlinTypeChecker;
    }

    public final LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.localClassifierTypeSettings;
    }

    public final LookupTracker getLookupTracker() {
        return this.lookupTracker;
    }

    public final ModuleDescriptor getModuleDescriptor() {
        return this.moduleDescriptor;
    }

    public final NotFoundClasses getNotFoundClasses() {
        return this.notFoundClasses;
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.platformDependentDeclarationFilter;
    }

    public final PlatformDependentTypeTransformer getPlatformDependentTypeTransformer() {
        return this.platformDependentTypeTransformer;
    }

    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    public final List<TypeAttributeTranslator> getTypeAttributeTranslators() {
        return this.typeAttributeTranslators;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable iterable, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker newKotlinTypeChecker, SamConversionResolver samConversionResolver, PlatformDependentTypeTransformer platformDependentTypeTransformer, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, iterable, notFoundClasses, contractDeserializer, r16, r17, extensionRegistryLite, r19, samConversionResolver, r21, r22);
        List list2;
        List listOf;
        AdditionalClassPartsProvider.None none = (i & 8192) != 0 ? AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProvider;
        PlatformDependentDeclarationFilter.All all = (i & 16384) != 0 ? PlatformDependentDeclarationFilter.All.INSTANCE : platformDependentDeclarationFilter;
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = (65536 & i) != 0 ? NewKotlinTypeChecker.Companion.getDefault() : newKotlinTypeChecker;
        PlatformDependentTypeTransformer.None none2 = (262144 & i) != 0 ? PlatformDependentTypeTransformer.None.INSTANCE : platformDependentTypeTransformer;
        if ((i & 524288) != 0) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(DefaultTypeAttributeTranslator.INSTANCE);
            list2 = listOf;
        } else {
            list2 = list;
        }
    }
}
