package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.Name;
@SourceDebugExtension({"SMAP\nSyntheticJavaPartsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1360#2:91\n1446#2,5:92\n1855#2,2:97\n1360#2:99\n1446#2,5:100\n1855#2,2:105\n1855#2,2:107\n1360#2:109\n1446#2,5:110\n1855#2,2:115\n*S KotlinDebug\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n*L\n54#1:91\n54#1:92,5\n63#1:97,2\n68#1:99\n68#1:100,5\n72#1:105,2\n77#1:107,2\n82#1:109\n82#1:110,5\n87#1:115,2\n*E\n"})
/* loaded from: classes8.dex */
public final class CompositeSyntheticJavaPartsProvider implements SyntheticJavaPartsProvider {
    private final List<SyntheticJavaPartsProvider> inner;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(List<? extends SyntheticJavaPartsProvider> inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.inner = inner;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateConstructors(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, List<ClassConstructorDescriptor> result) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(result, "result");
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            syntheticJavaPartsProvider.generateConstructors(_context_receiver_0, thisDescriptor, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateMethods(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            syntheticJavaPartsProvider.generateMethods(_context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateNestedClass(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, Name name, List<ClassDescriptor> result) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            syntheticJavaPartsProvider.generateNestedClass(_context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public void generateStaticFunctions(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor, Name name, Collection<SimpleFunctionDescriptor> result) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            syntheticJavaPartsProvider.generateStaticFunctions(_context_receiver_0, thisDescriptor, name, result);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getMethodNames(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, syntheticJavaPartsProvider.getMethodNames(_context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getNestedClassNames(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, syntheticJavaPartsProvider.getNestedClassNames(_context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public List<Name> getStaticFunctionNames(LazyJavaResolverContext _context_receiver_0, ClassDescriptor thisDescriptor) {
        Intrinsics.checkNotNullParameter(_context_receiver_0, "_context_receiver_0");
        Intrinsics.checkNotNullParameter(thisDescriptor, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (SyntheticJavaPartsProvider syntheticJavaPartsProvider : this.inner) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, syntheticJavaPartsProvider.getStaticFunctionNames(_context_receiver_0, thisDescriptor));
        }
        return arrayList;
    }
}
