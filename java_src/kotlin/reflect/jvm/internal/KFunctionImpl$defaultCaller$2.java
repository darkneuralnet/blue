package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.InlineClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Executable;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nKFunctionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$defaultCaller$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,188:1\n1549#2:189\n1620#2,3:190\n1549#2:193\n1620#2,3:194\n*S KotlinDebug\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$defaultCaller$2\n*L\n101#1:189\n101#1:190,3\n106#1:193\n106#1:194,3\n*E\n"})
/* loaded from: classes8.dex */
public final class KFunctionImpl$defaultCaller$2 extends Lambda implements Function0<Caller<? extends Executable>> {
    final /* synthetic */ KFunctionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$defaultCaller$2(KFunctionImpl kFunctionImpl) {
        super(0);
        this.this$0 = kFunctionImpl;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.reflect.Member, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Caller<? extends Executable> invoke() {
        GenericDeclaration genericDeclaration;
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Caller caller;
        ?? mo118082getMember;
        JvmFunctionSignature mapSignature = RuntimeTypeMapper.INSTANCE.mapSignature(this.this$0.getDescriptor());
        if (mapSignature instanceof JvmFunctionSignature.KotlinFunction) {
            KDeclarationContainerImpl container = this.this$0.getContainer();
            JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) mapSignature;
            String methodName = kotlinFunction.getMethodName();
            String methodDesc = kotlinFunction.getMethodDesc();
            Intrinsics.checkNotNull(this.this$0.getCaller().mo118082getMember());
            genericDeclaration = container.findDefaultMethod(methodName, methodDesc, !Modifier.isStatic(mo118082getMember.getModifiers()));
        } else if (mapSignature instanceof JvmFunctionSignature.KotlinConstructor) {
            if (this.this$0.isAnnotationConstructor()) {
                Class<?> jClass = this.this$0.getContainer().getJClass();
                List<KParameter> parameters = this.this$0.getParameters();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault2);
                for (KParameter kParameter : parameters) {
                    String name = kParameter.getName();
                    Intrinsics.checkNotNull(name);
                    arrayList.add(name);
                }
                return new AnnotationConstructorCaller(jClass, arrayList, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            genericDeclaration = this.this$0.getContainer().findDefaultConstructor(((JvmFunctionSignature.KotlinConstructor) mapSignature).getConstructorDesc());
        } else if (mapSignature instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
            List<Method> methods = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) mapSignature).getMethods();
            Class<?> jClass2 = this.this$0.getContainer().getJClass();
            List<Method> list = methods;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (Method method : list) {
                arrayList2.add(method.getName());
            }
            return new AnnotationConstructorCaller(jClass2, arrayList2, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, methods);
        } else {
            genericDeclaration = null;
        }
        if (genericDeclaration instanceof Constructor) {
            KFunctionImpl kFunctionImpl = this.this$0;
            caller = kFunctionImpl.createConstructorCaller((Constructor) genericDeclaration, kFunctionImpl.getDescriptor(), true);
        } else if (genericDeclaration instanceof Method) {
            if (this.this$0.getDescriptor().getAnnotations().mo118085findAnnotation(UtilKt.getJVM_STATIC()) != null) {
                DeclarationDescriptor containingDeclaration = this.this$0.getDescriptor().getContainingDeclaration();
                Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (!((ClassDescriptor) containingDeclaration).isCompanionObject()) {
                    caller = this.this$0.createJvmStaticInObjectCaller((Method) genericDeclaration);
                }
            }
            caller = this.this$0.createStaticMethodCaller((Method) genericDeclaration);
        } else {
            caller = null;
        }
        if (caller != null) {
            return InlineClassAwareCallerKt.createInlineClassAwareCallerIfNeeded(caller, this.this$0.getDescriptor(), true);
        }
        return null;
    }
}
