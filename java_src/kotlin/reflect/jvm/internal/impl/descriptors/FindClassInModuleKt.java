package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
@SourceDebugExtension({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
/* loaded from: classes8.dex */
public final class FindClassInModuleKt {
    public static final ClassDescriptor findClassAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Object first;
        Object first2;
        ClassifierDescriptor mo118092getContributedClassifier;
        Object first3;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            FqName packageFqName = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(packageFqName);
            List<Name> pathSegments = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope = packageViewDescriptor.getMemberScope();
            first3 = CollectionsKt___CollectionsKt.first((List<? extends Object>) pathSegments);
            Intrinsics.checkNotNullExpressionValue(first3, "segments.first()");
            mo118092getContributedClassifier = memberScope.mo118092getContributedClassifier((Name) first3, NoLookupLocation.FROM_DESERIALIZATION);
            if (mo118092getContributedClassifier == null) {
                return null;
            }
            for (Name name : pathSegments.subList(1, pathSegments.size())) {
                if (!(mo118092getContributedClassifier instanceof ClassDescriptor)) {
                    return null;
                }
                MemberScope unsubstitutedInnerClassesScope = ((ClassDescriptor) mo118092getContributedClassifier).getUnsubstitutedInnerClassesScope();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                ClassifierDescriptor mo118092getContributedClassifier2 = unsubstitutedInnerClassesScope.mo118092getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                if (mo118092getContributedClassifier2 instanceof ClassDescriptor) {
                    mo118092getContributedClassifier = (ClassDescriptor) mo118092getContributedClassifier2;
                    continue;
                } else {
                    mo118092getContributedClassifier = null;
                    continue;
                }
                if (mo118092getContributedClassifier == null) {
                    return null;
                }
            }
        } else {
            FqName packageFqName2 = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName2, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(packageFqName2);
            List<Name> pathSegments2 = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments2, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope2 = packageViewDescriptor2.getMemberScope();
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) pathSegments2);
            Intrinsics.checkNotNullExpressionValue(first, "segments.first()");
            ClassifierDescriptor mo118092getContributedClassifier3 = memberScope2.mo118092getContributedClassifier((Name) first, NoLookupLocation.FROM_DESERIALIZATION);
            if (mo118092getContributedClassifier3 != null) {
                for (Name name2 : pathSegments2.subList(1, pathSegments2.size())) {
                    if (mo118092getContributedClassifier3 instanceof ClassDescriptor) {
                        MemberScope unsubstitutedInnerClassesScope2 = ((ClassDescriptor) mo118092getContributedClassifier3).getUnsubstitutedInnerClassesScope();
                        Intrinsics.checkNotNullExpressionValue(name2, "name");
                        ClassifierDescriptor mo118092getContributedClassifier4 = unsubstitutedInnerClassesScope2.mo118092getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                        if (mo118092getContributedClassifier4 instanceof ClassDescriptor) {
                            mo118092getContributedClassifier3 = (ClassDescriptor) mo118092getContributedClassifier4;
                            continue;
                        } else {
                            mo118092getContributedClassifier3 = null;
                            continue;
                        }
                        if (mo118092getContributedClassifier3 == null) {
                        }
                    }
                }
                if (mo118092getContributedClassifier3 != null) {
                    FqName packageFqName3 = classId.getPackageFqName();
                    Intrinsics.checkNotNullExpressionValue(packageFqName3, "classId.packageFqName");
                    PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(packageFqName3);
                    List<Name> pathSegments3 = classId.getRelativeClassName().pathSegments();
                    Intrinsics.checkNotNullExpressionValue(pathSegments3, "classId.relativeClassName.pathSegments()");
                    MemberScope memberScope3 = packageViewDescriptor3.getMemberScope();
                    first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) pathSegments3);
                    Intrinsics.checkNotNullExpressionValue(first2, "segments.first()");
                    mo118092getContributedClassifier = memberScope3.mo118092getContributedClassifier((Name) first2, NoLookupLocation.FROM_DESERIALIZATION);
                    if (mo118092getContributedClassifier == null) {
                        return null;
                    }
                    for (Name name3 : pathSegments3.subList(1, pathSegments3.size())) {
                        if (!(mo118092getContributedClassifier instanceof ClassDescriptor)) {
                            return null;
                        }
                        MemberScope unsubstitutedInnerClassesScope3 = ((ClassDescriptor) mo118092getContributedClassifier).getUnsubstitutedInnerClassesScope();
                        Intrinsics.checkNotNullExpressionValue(name3, "name");
                        ClassifierDescriptor mo118092getContributedClassifier5 = unsubstitutedInnerClassesScope3.mo118092getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
                        if (mo118092getContributedClassifier5 instanceof ClassDescriptor) {
                            mo118092getContributedClassifier = (ClassDescriptor) mo118092getContributedClassifier5;
                            continue;
                        } else {
                            mo118092getContributedClassifier = null;
                            continue;
                        }
                        if (mo118092getContributedClassifier == null) {
                            return null;
                        }
                    }
                } else {
                    return mo118092getContributedClassifier3;
                }
            }
            mo118092getContributedClassifier3 = null;
            if (mo118092getContributedClassifier3 != null) {
            }
        }
        return mo118092getContributedClassifier;
    }

    public static final ClassDescriptor findNonGenericClassAcrossDependencies(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        Sequence generateSequence;
        Sequence map;
        List<Integer> list;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor findClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassAcrossModuleDependencies == null) {
            generateSequence = SequencesKt__SequencesKt.generateSequence(classId, C25290x24bfe126.INSTANCE);
            map = SequencesKt___SequencesKt.map(generateSequence, C25291x24bfe127.INSTANCE);
            list = SequencesKt___SequencesKt.toList(map);
            return notFoundClasses.getClass(classId, list);
        }
        return findClassAcrossModuleDependencies;
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
