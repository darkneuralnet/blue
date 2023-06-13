package com.fasterxml.jackson.module.kotlin;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.module.kotlin.ValueClassStaticJsonValueSerializer;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.full.KClassifiers;
import kotlin.reflect.jvm.ReflectJvmMapping;
@Metadata(m28433d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010\u001bJ#\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u0004\u0018\u00010\u0007*\u00020!H\u0002¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u0004\u0018\u00010\u0007*\u00020$H\u0002¢\u0006\u0002\u0010%J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007*\u00020&H\u0002¢\u0006\u0002\u0010'J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007*\u00020$H\u0002¢\u0006\u0002\u0010%J\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0007*\u00020(H\u0002¢\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030+H\u0002J\u0018\u0010/\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u00100\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-H\u0002J\f\u00101\u001a\u00020\u0007*\u000202H\u0002J\u0013\u00103\u001a\u0004\u0018\u00010\u0007*\u000204H\u0002¢\u0006\u0002\u00105J\u0013\u00103\u001a\u0004\u0018\u00010\u0007*\u00020!H\u0002¢\u0006\u0002\u0010\"J\u0014\u00106\u001a\u00020\u0007*\n\u0012\u0002\b\u0003\u0012\u0002\b\u000307H\u0002J\u0010\u00108\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030+H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/fasterxml/jackson/databind/Module$SetupContext;", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "nullToEmptyCollection", "", "nullToEmptyMap", "nullIsSameAsDefault", "(Lcom/fasterxml/jackson/databind/Module$SetupContext;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZ)V", "findCreatorAnnotation", "Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;", "config", "Lcom/fasterxml/jackson/databind/cfg/MapperConfig;", C17296a.f69688o, "Lcom/fasterxml/jackson/databind/introspect/Annotated;", "findNullSerializer", "Lcom/fasterxml/jackson/databind/ser/std/StdSerializer;", "am", "findSerializer", "findSubtypes", "", "Lcom/fasterxml/jackson/databind/jsontype/NamedType;", "hasRequiredMarker", "m", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Boolean;", "requiredAnnotationOrNullability", "byAnnotation", "byNullability", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "getRequiredMarkerFromAccessorLikeMethod", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)Ljava/lang/Boolean;", "getRequiredMarkerFromCorrespondingAccessor", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMethod;)Ljava/lang/Boolean;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;)Ljava/lang/Boolean;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;)Ljava/lang/Boolean;", "isConstructorParameterRequired", "Lkotlin/reflect/KFunction;", "index", "", "isGetterLike", "isMethodParameterRequired", "isParameterRequired", "isRequired", "Lkotlin/reflect/KType;", "isRequiredByAnnotation", "Ljava/lang/reflect/AccessibleObject;", "(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/Boolean;", "isRequiredByNullability", "Lkotlin/reflect/KProperty1;", "isSetterLike", "Companion", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class KotlinAnnotationIntrospector extends NopAnnotationIntrospector {
    public static final Companion Companion = new Companion(null);
    private static final KType UNIT_TYPE = KClassifiers.createType$default(Reflection.getOrCreateKotlinClass(Unit.class), null, false, null, 7, null);
    private final ReflectionCache cache;
    private final Module.SetupContext context;
    private final boolean nullIsSameAsDefault;
    private final boolean nullToEmptyCollection;
    private final boolean nullToEmptyMap;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinAnnotationIntrospector$Companion;", "", "()V", "UNIT_TYPE", "Lkotlin/reflect/KType;", "getUNIT_TYPE", "()Lkotlin/reflect/KType;", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KType getUNIT_TYPE() {
            return KotlinAnnotationIntrospector.UNIT_TYPE;
        }

        private Companion() {
        }
    }

    public KotlinAnnotationIntrospector(Module.SetupContext context, ReflectionCache cache, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.context = context;
        this.cache = cache;
        this.nullToEmptyCollection = z;
        this.nullToEmptyMap = z2;
        this.nullIsSameAsDefault = z3;
    }

    private final Boolean getRequiredMarkerFromAccessorLikeMethod(Method method) {
        KFunction<?> kotlinFunction = ReflectJvmMapping.getKotlinFunction(method);
        if (kotlinFunction == null) {
            return null;
        }
        Boolean isRequiredByAnnotation = isRequiredByAnnotation(method);
        if (isGetterLike(kotlinFunction)) {
            return requiredAnnotationOrNullability(isRequiredByAnnotation, Boolean.valueOf(isRequired(kotlinFunction.getReturnType())));
        }
        if (!isSetterLike(kotlinFunction)) {
            return null;
        }
        return requiredAnnotationOrNullability(isRequiredByAnnotation, Boolean.valueOf(isMethodParameterRequired(kotlinFunction, 0)));
    }

    private final Boolean getRequiredMarkerFromCorrespondingAccessor(AnnotatedMethod annotatedMethod) {
        Method method;
        KProperty1<?, ?> kProperty1;
        KMutableProperty1 kMutableProperty1;
        Class<?> declaringClass = annotatedMethod.getMember().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "member.declaringClass");
        Iterator it = KClasses.getDeclaredMemberProperties(JvmClassMappingKt.getKotlinClass(declaringClass)).iterator();
        do {
            method = null;
            if (!it.hasNext()) {
                return null;
            }
            kProperty1 = (KProperty1) it.next();
            if (Intrinsics.areEqual(ReflectJvmMapping.getJavaGetter(kProperty1), annotatedMethod.getMember())) {
                break;
            }
            if (kProperty1 instanceof KMutableProperty1) {
                kMutableProperty1 = (KMutableProperty1) kProperty1;
            } else {
                kMutableProperty1 = null;
            }
            if (kMutableProperty1 != null) {
                method = ReflectJvmMapping.getJavaSetter(kMutableProperty1);
            }
        } while (!Intrinsics.areEqual(method, annotatedMethod.getMember()));
        Method member = annotatedMethod.getMember();
        Intrinsics.checkNotNullExpressionValue(member, "this.member");
        return requiredAnnotationOrNullability(isRequiredByAnnotation(member), Boolean.valueOf(isRequiredByNullability(kProperty1)));
    }

    private final boolean isConstructorParameterRequired(KFunction<?> kFunction, int i) {
        return isParameterRequired(kFunction, i);
    }

    private final boolean isGetterLike(KFunction<?> kFunction) {
        return kFunction.getParameters().size() == 1;
    }

    private final boolean isMethodParameterRequired(KFunction<?> kFunction, int i) {
        return isParameterRequired(kFunction, i + 1);
    }

    private final boolean isParameterRequired(KFunction<?> kFunction, int i) {
        boolean z;
        KParameter kParameter = kFunction.getParameters().get(i);
        KType type = kParameter.getType();
        Type javaType = ReflectJvmMapping.getJavaType(type);
        if (javaType instanceof Class) {
            z = ((Class) javaType).isPrimitive();
        } else {
            z = false;
        }
        if (type.isMarkedNullable() || kParameter.isOptional()) {
            return false;
        }
        if (z && !this.context.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            return false;
        }
        return true;
    }

    private final boolean isRequired(KType kType) {
        return !kType.isMarkedNullable();
    }

    private final Boolean isRequiredByAnnotation(AccessibleObject accessibleObject) {
        JsonProperty jsonProperty;
        Annotation[] annotations = accessibleObject.getAnnotations();
        if (annotations == null) {
            return null;
        }
        int length = annotations.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jsonProperty = null;
                break;
            }
            jsonProperty = annotations[i];
            if (Intrinsics.areEqual(JvmClassMappingKt.getAnnotationClass(jsonProperty), Reflection.getOrCreateKotlinClass(JsonProperty.class))) {
                break;
            }
            i++;
        }
        if (jsonProperty == null) {
            return null;
        }
        return Boolean.valueOf(jsonProperty.required());
    }

    private final boolean isRequiredByNullability(KProperty1<?, ?> kProperty1) {
        return isRequired(kProperty1.getReturnType());
    }

    private final boolean isSetterLike(KFunction<?> kFunction) {
        return kFunction.getParameters().size() == 2 && Intrinsics.areEqual(kFunction.getReturnType(), UNIT_TYPE);
    }

    private final Boolean requiredAnnotationOrNullability(Boolean bool, Boolean bool2) {
        if (bool == null || bool2 == null) {
            return bool2 != null ? bool2 : bool;
        }
        return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> config, Annotated a) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(a, "a");
        return super.findCreatorAnnotation(config, a);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(Annotated a) {
        int collectionSizeOrDefault;
        List<NamedType> mutableList;
        Intrinsics.checkNotNullParameter(a, "a");
        Class<?> it = a.getRawType();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        List<NamedType> list = null;
        if (!KotlinModuleKt.isKotlinClass(it)) {
            it = null;
        }
        if (it == null) {
            return null;
        }
        List<KClass> sealedSubclasses = JvmClassMappingKt.getKotlinClass(it).getSealedSubclasses();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sealedSubclasses, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (KClass kClass : sealedSubclasses) {
            arrayList.add(new NamedType(JvmClassMappingKt.getJavaClass(kClass)));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        List<NamedType> list2 = mutableList;
        if (!list2.isEmpty()) {
            list = list2;
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return this.cache.javaMemberIsRequired(m, new KotlinAnnotationIntrospector$hasRequiredMarker$hasRequired$1(this, m));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean hasRequiredMarker(AnnotatedField annotatedField) {
        KType returnType;
        Member member = annotatedField.getMember();
        if (member != null) {
            Boolean isRequiredByAnnotation = isRequiredByAnnotation((Field) member);
            Member member2 = annotatedField.getMember();
            if (member2 != null) {
                KProperty<?> kotlinProperty = ReflectJvmMapping.getKotlinProperty((Field) member2);
                Boolean bool = null;
                if (kotlinProperty != null && (returnType = kotlinProperty.getReturnType()) != null) {
                    bool = Boolean.valueOf(isRequired(returnType));
                }
                return requiredAnnotationOrNullability(isRequiredByAnnotation, bool);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Field");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Field");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public StdSerializer<?> findNullSerializer(Annotated am) {
        Intrinsics.checkNotNullParameter(am, "am");
        return findSerializer(am);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public StdSerializer<?> findSerializer(Annotated am) {
        Collection collection;
        Object obj;
        KProperty1 kProperty1;
        KType returnType;
        Class<? extends Object> javaClass;
        Intrinsics.checkNotNullParameter(am, "am");
        if ((am instanceof AnnotatedMethod) && KotlinVersion.CURRENT.isAtLeast(1, 5)) {
            Method member = ((AnnotatedMethod) am).getMember();
            Class<?> returnType2 = member.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType2, "this.returnType");
            if (ExtensionsKt.isUnboxableValueClass(returnType2)) {
                return null;
            }
            Class<?> declaringClass = member.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getter\n                        .declaringClass");
            try {
                collection = KClasses.getMemberProperties(JvmClassMappingKt.getKotlinClass(declaringClass));
            } catch (Error unused) {
                collection = null;
            }
            if (collection == null) {
                kProperty1 = null;
            } else {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(ReflectJvmMapping.getJavaGetter((KProperty1) obj), member)) {
                        break;
                    }
                }
                kProperty1 = (KProperty1) obj;
            }
            KClassifier classifier = (kProperty1 == null || (returnType = kProperty1.getReturnType()) == null) ? null : returnType.getClassifier();
            KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
            if (kClass == null) {
                return null;
            }
            if (!kClass.isValue()) {
                kClass = null;
            }
            if (kClass == null || (javaClass = JvmClassMappingKt.getJavaClass(kClass)) == null) {
                return null;
            }
            Class<?> innerClazz = member.getReturnType();
            ValueClassStaticJsonValueSerializer.Companion companion = ValueClassStaticJsonValueSerializer.Companion;
            Intrinsics.checkNotNullExpressionValue(innerClazz, "innerClazz");
            ValueClassStaticJsonValueSerializer createdOrNull = companion.createdOrNull(javaClass, innerClazz);
            return createdOrNull == null ? new ValueClassBoxSerializer(javaClass, innerClazz) : createdOrNull;
        }
        return null;
    }

    private final Boolean isRequiredByAnnotation(Method method) {
        JsonProperty jsonProperty;
        Annotation[] annotations = method.getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "this.annotations");
        int length = annotations.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jsonProperty = null;
                break;
            }
            jsonProperty = annotations[i];
            if (Intrinsics.areEqual(JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(jsonProperty)), JsonProperty.class)) {
                break;
            }
            i++;
        }
        JsonProperty jsonProperty2 = jsonProperty instanceof JsonProperty ? jsonProperty : null;
        if (jsonProperty2 == null) {
            return null;
        }
        return Boolean.valueOf(jsonProperty2.required());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean hasRequiredMarker(AnnotatedMethod annotatedMethod) {
        Boolean requiredMarkerFromCorrespondingAccessor = getRequiredMarkerFromCorrespondingAccessor(annotatedMethod);
        if (requiredMarkerFromCorrespondingAccessor == null) {
            Method member = annotatedMethod.getMember();
            Intrinsics.checkNotNullExpressionValue(member, "this.member");
            return getRequiredMarkerFromAccessorLikeMethod(member);
        }
        return requiredMarkerFromCorrespondingAccessor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean hasRequiredMarker(AnnotatedParameter annotatedParameter) {
        Member member = annotatedParameter.getMember();
        JsonProperty jsonProperty = (JsonProperty) annotatedParameter.getAnnotation(JsonProperty.class);
        Boolean bool = null;
        Boolean valueOf = jsonProperty == null ? null : Boolean.valueOf(jsonProperty.required());
        if (member instanceof Constructor) {
            Intrinsics.checkNotNullExpressionValue(member, "member");
            KFunction<?> kotlinFunction = ReflectJvmMapping.getKotlinFunction((Constructor) member);
            if (kotlinFunction != null) {
                bool = Boolean.valueOf(isConstructorParameterRequired(kotlinFunction, annotatedParameter.getIndex()));
            }
        } else if (member instanceof Method) {
            Intrinsics.checkNotNullExpressionValue(member, "member");
            KFunction<?> kotlinFunction2 = ReflectJvmMapping.getKotlinFunction((Method) member);
            if (kotlinFunction2 != null) {
                bool = Boolean.valueOf(isMethodParameterRequired(kotlinFunction2, annotatedParameter.getIndex()));
            }
        }
        return requiredAnnotationOrNullability(valueOf, bool);
    }
}
