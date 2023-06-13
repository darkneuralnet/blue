package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
/* loaded from: classes8.dex */
public final class JavaLoadingKt {
    private static final boolean isMethodWithOneObjectParameter(JavaMethod javaMethod) {
        Object singleOrNull;
        JavaType javaType;
        FqName fqName;
        singleOrNull = CollectionsKt___CollectionsKt.singleOrNull((List<? extends Object>) javaMethod.getValueParameters());
        JavaValueParameter javaValueParameter = (JavaValueParameter) singleOrNull;
        JavaClassifierType javaClassifierType = null;
        if (javaValueParameter != null) {
            javaType = javaValueParameter.getType();
        } else {
            javaType = null;
        }
        if (javaType instanceof JavaClassifierType) {
            javaClassifierType = (JavaClassifierType) javaType;
        }
        if (javaClassifierType == null) {
            return false;
        }
        JavaClassifier classifier = javaClassifierType.getClassifier();
        if (!(classifier instanceof JavaClass) || (fqName = ((JavaClass) classifier).getFqName()) == null || !Intrinsics.areEqual(fqName.asString(), "java.lang.Object")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r0.equals("toString") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
        return r3.getValueParameters().isEmpty();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean isObjectMethod(JavaMethod javaMethod) {
        String asString = javaMethod.getName().asString();
        int hashCode = asString.hashCode();
        if (hashCode != -1776922004) {
            if (hashCode != -1295482945) {
                if (hashCode == 147696667) {
                }
            } else if (asString.equals("equals")) {
                return isMethodWithOneObjectParameter(javaMethod);
            }
            return false;
        }
    }

    public static final boolean isObjectMethodInInterface(JavaMember javaMember) {
        Intrinsics.checkNotNullParameter(javaMember, "<this>");
        if (javaMember.getContainingClass().isInterface() && (javaMember instanceof JavaMethod) && isObjectMethod((JavaMethod) javaMember)) {
            return true;
        }
        return false;
    }
}
