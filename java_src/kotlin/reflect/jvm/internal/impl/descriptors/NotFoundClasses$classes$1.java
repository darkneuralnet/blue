package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
/* loaded from: classes8.dex */
public final class NotFoundClasses$classes$1 extends Lambda implements Function1<NotFoundClasses.ClassRequest, ClassDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.this$0 = notFoundClasses;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r1 != null) goto L7;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ClassDescriptor invoke(NotFoundClasses.ClassRequest classRequest) {
        MemoizedFunctionToNotNull memoizedFunctionToNotNull;
        DeclarationDescriptor declarationDescriptor;
        StorageManager storageManager;
        Object firstOrNull;
        List<Integer> drop;
        Intrinsics.checkNotNullParameter(classRequest, "<name for destructuring parameter 0>");
        ClassId component1 = classRequest.component1();
        List<Integer> component2 = classRequest.component2();
        if (!component1.isLocal()) {
            ClassId outerClassId = component1.getOuterClassId();
            if (outerClassId != null) {
                NotFoundClasses notFoundClasses = this.this$0;
                drop = CollectionsKt___CollectionsKt.drop(component2, 1);
                declarationDescriptor = notFoundClasses.getClass(outerClassId, drop);
            }
            memoizedFunctionToNotNull = this.this$0.packageFragments;
            FqName packageFqName = component1.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
            declarationDescriptor = (ClassOrPackageFragmentDescriptor) memoizedFunctionToNotNull.invoke(packageFqName);
            DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
            boolean isNestedClass = component1.isNestedClass();
            storageManager = this.this$0.storageManager;
            Name shortClassName = component1.getShortClassName();
            Intrinsics.checkNotNullExpressionValue(shortClassName, "classId.shortClassName");
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) component2);
            Integer num = (Integer) firstOrNull;
            return new NotFoundClasses.MockClassDescriptor(storageManager, declarationDescriptor2, shortClassName, isNestedClass, num != null ? num.intValue() : 0);
        }
        throw new UnsupportedOperationException("Unresolved local class: " + component1);
    }
}
