package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
@SourceDebugExtension({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope$classes$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* loaded from: classes8.dex */
public final class LazyJavaPackageScope$classes$1 extends Lambda implements Function1<LazyJavaPackageScope.FindClassRequest, ClassDescriptor> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f95001$c;
    final /* synthetic */ LazyJavaPackageScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$classes$1(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.this$0 = lazyJavaPackageScope;
        this.f95001$c = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ClassDescriptor invoke(LazyJavaPackageScope.FindClassRequest request) {
        JvmMetadataVersion jvmMetadataVersion;
        KotlinClassFinder.Result findKotlinClassOrContent;
        LazyJavaPackageScope.KotlinClassLookupResult resolveKotlinBinaryClass;
        JvmMetadataVersion jvmMetadataVersion2;
        JvmMetadataVersion jvmMetadataVersion3;
        JvmMetadataVersion jvmMetadataVersion4;
        Intrinsics.checkNotNullParameter(request, "request");
        ClassId classId = new ClassId(this.this$0.getOwnerDescriptor().getFqName(), request.getName());
        if (request.getJavaClass() != null) {
            KotlinClassFinder kotlinClassFinder = this.f95001$c.getComponents().getKotlinClassFinder();
            JavaClass javaClass = request.getJavaClass();
            jvmMetadataVersion4 = this.this$0.getJvmMetadataVersion();
            findKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(javaClass, jvmMetadataVersion4);
        } else {
            KotlinClassFinder kotlinClassFinder2 = this.f95001$c.getComponents().getKotlinClassFinder();
            jvmMetadataVersion = this.this$0.getJvmMetadataVersion();
            findKotlinClassOrContent = kotlinClassFinder2.findKotlinClassOrContent(classId, jvmMetadataVersion);
        }
        KotlinJvmBinaryClass kotlinJvmBinaryClass = findKotlinClassOrContent != null ? findKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
        ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
        if (classId2 == null || !(classId2.isNestedClass() || classId2.isLocal())) {
            resolveKotlinBinaryClass = this.this$0.resolveKotlinBinaryClass(kotlinJvmBinaryClass);
            if (resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.Found) {
                return ((LazyJavaPackageScope.KotlinClassLookupResult.Found) resolveKotlinBinaryClass).getDescriptor();
            }
            if (resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass) {
                return null;
            }
            if (resolveKotlinBinaryClass instanceof LazyJavaPackageScope.KotlinClassLookupResult.NotFound) {
                JavaClass javaClass2 = request.getJavaClass();
                if (javaClass2 == null) {
                    JavaClassFinder finder = this.f95001$c.getComponents().getFinder();
                    KotlinClassFinder.Result.ClassFileContent classFileContent = findKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) findKotlinClassOrContent : null;
                    javaClass2 = finder.findClass(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
                }
                JavaClass javaClass3 = javaClass2;
                if ((javaClass3 != null ? javaClass3.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
                    FqName fqName = javaClass3 != null ? javaClass3.getFqName() : null;
                    if (fqName == null || fqName.isRoot() || !Intrinsics.areEqual(fqName.parent(), this.this$0.getOwnerDescriptor().getFqName())) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.f95001$c, this.this$0.getOwnerDescriptor(), javaClass3, null, 8, null);
                    this.f95001$c.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                sb.append(javaClass3);
                sb.append("\nClassId: ");
                sb.append(classId);
                sb.append("\nfindKotlinClass(JavaClass) = ");
                KotlinClassFinder kotlinClassFinder3 = this.f95001$c.getComponents().getKotlinClassFinder();
                jvmMetadataVersion2 = this.this$0.getJvmMetadataVersion();
                sb.append(KotlinClassFinderKt.findKotlinClass(kotlinClassFinder3, javaClass3, jvmMetadataVersion2));
                sb.append("\nfindKotlinClass(ClassId) = ");
                KotlinClassFinder kotlinClassFinder4 = this.f95001$c.getComponents().getKotlinClassFinder();
                jvmMetadataVersion3 = this.this$0.getJvmMetadataVersion();
                sb.append(KotlinClassFinderKt.findKotlinClass(kotlinClassFinder4, classId, jvmMetadataVersion3));
                sb.append('\n');
                throw new IllegalStateException(sb.toString());
            }
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
