package com.fasterxml.jackson.module.kotlin;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\u0002\u0010\tJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020 H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020!H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinNamesAnnotationIntrospector;", "Lcom/fasterxml/jackson/databind/introspect/NopAnnotationIntrospector;", "module", "Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "ignoredClassesForImplyingJsonCreator", "", "Lkotlin/reflect/KClass;", "(Lcom/fasterxml/jackson/module/kotlin/KotlinModule;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;Ljava/util/Set;)V", "getCache", "()Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "getIgnoredClassesForImplyingJsonCreator", "()Ljava/util/Set;", "getModule", "()Lcom/fasterxml/jackson/module/kotlin/KotlinModule;", "findImplicitPropertyName", "", "member", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;", "findKotlinParameterName", "param", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", "findRenameByField", "Lcom/fasterxml/jackson/databind/PropertyName;", "config", "Lcom/fasterxml/jackson/databind/cfg/MapperConfig;", "field", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedField;", "implName", "hasCreatorAnnotation", "", "Lcom/fasterxml/jackson/databind/introspect/Annotated;", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedConstructor;", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class KotlinNamesAnnotationIntrospector extends NopAnnotationIntrospector {
    private final ReflectionCache cache;
    private final Set<KClass<?>> ignoredClassesForImplyingJsonCreator;
    private final KotlinModule module;

    /* JADX WARN: Multi-variable type inference failed */
    public KotlinNamesAnnotationIntrospector(KotlinModule module, ReflectionCache cache, Set<? extends KClass<?>> ignoredClassesForImplyingJsonCreator) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(ignoredClassesForImplyingJsonCreator, "ignoredClassesForImplyingJsonCreator");
        this.module = module;
        this.cache = cache;
        this.ignoredClassesForImplyingJsonCreator = ignoredClassesForImplyingJsonCreator;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083 A[Catch: KotlinReflectionInternalError -> 0x00b5, TryCatch #1 {KotlinReflectionInternalError -> 0x00b5, blocks: (B:28:0x0061, B:38:0x007f, B:40:0x0083, B:51:0x00a1, B:54:0x00a8, B:57:0x00b1, B:44:0x0091, B:47:0x0098, B:41:0x008a, B:31:0x006b, B:34:0x0072, B:37:0x007b), top: B:63:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[Catch: KotlinReflectionInternalError -> 0x00b5, TryCatch #1 {KotlinReflectionInternalError -> 0x00b5, blocks: (B:28:0x0061, B:38:0x007f, B:40:0x0083, B:51:0x00a1, B:54:0x00a8, B:57:0x00b1, B:44:0x0091, B:47:0x0098, B:41:0x008a, B:31:0x006b, B:34:0x0072, B:37:0x007b), top: B:63:0x0061 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String findKotlinParameterName(AnnotatedParameter annotatedParameter) {
        List<KParameter> parameters;
        Object firstOrNull;
        KParameter.Kind kind;
        int index;
        List<KParameter> parameters2;
        List<KParameter> parameters3;
        KParameter kParameter;
        KFunction kotlinFunction;
        List<KParameter> parameters4;
        KParameter kParameter2;
        List<KParameter> parameters5;
        Class<?> declaringClass = annotatedParameter.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "param.declaringClass");
        if (!KotlinModuleKt.isKotlinClass(declaringClass)) {
            return null;
        }
        Member member = annotatedParameter.getOwner().getMember();
        int i = 0;
        if (member instanceof Constructor) {
            Constructor constructor = (Constructor) member;
            int length = constructor.getParameterTypes().length;
            try {
                KFunction kotlinFunction2 = ReflectJvmMapping.getKotlinFunction(constructor);
                if (kotlinFunction2 != null && (parameters5 = kotlinFunction2.getParameters()) != null) {
                    i = parameters5.size();
                }
            } catch (UnsupportedOperationException | KotlinReflectionInternalError unused) {
            }
            if (i <= 0 || i != length || (kotlinFunction = ReflectJvmMapping.getKotlinFunction(constructor)) == null || (parameters4 = kotlinFunction.getParameters()) == null || (kParameter2 = parameters4.get(annotatedParameter.getIndex())) == null) {
                return null;
            }
            return kParameter2.getName();
        } else if (!(member instanceof Method)) {
            return null;
        } else {
            try {
                KFunction<?> kotlinFunction3 = ReflectJvmMapping.getKotlinFunction((Method) member);
                if (kotlinFunction3 != null && (parameters = kotlinFunction3.getParameters()) != null) {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) parameters);
                    KParameter kParameter3 = (KParameter) firstOrNull;
                    if (kParameter3 != null) {
                        kind = kParameter3.getKind();
                        if (kind == KParameter.Kind.VALUE) {
                            index = annotatedParameter.getIndex() + 1;
                        } else {
                            index = annotatedParameter.getIndex();
                        }
                        if (kotlinFunction3 != null && (parameters2 = kotlinFunction3.getParameters()) != null) {
                            i = parameters2.size();
                        }
                        if (i <= index && kotlinFunction3 != null && (parameters3 = kotlinFunction3.getParameters()) != null && (kParameter = parameters3.get(index)) != null) {
                            return kParameter.getName();
                        }
                        return null;
                    }
                }
                kind = null;
                if (kind == KParameter.Kind.VALUE) {
                }
                if (kotlinFunction3 != null) {
                    i = parameters2.size();
                }
                if (i <= index) {
                    return null;
                }
                return kParameter.getName();
            } catch (KotlinReflectionInternalError unused2) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0181 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hasCreatorAnnotation(AnnotatedConstructor annotatedConstructor) {
        int collectionSizeOrDefault;
        Set set;
        boolean z;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        Collection<KFunction<?>> declaredFunctions;
        Object obj2;
        boolean z5;
        boolean z6;
        Object obj3;
        ReflectionCache reflectionCache = this.cache;
        Class<?> declaringClass = annotatedConstructor.getDeclaringClass();
        if (declaringClass != null) {
            KClass<Object> kotlinFromJava = reflectionCache.kotlinFromJava(declaringClass);
            if (getIgnoredClassesForImplyingJsonCreator().contains(kotlinFromJava)) {
                return false;
            }
            ReflectionCache reflectionCache2 = this.cache;
            Constructor<?> annotated = annotatedConstructor.getAnnotated();
            if (annotated != null) {
                KFunction<Object> kotlinFromJava2 = reflectionCache2.kotlinFromJava(annotated);
                if (kotlinFromJava2 == null) {
                    return false;
                }
                Collection<KProperty1> memberProperties = KClasses.getMemberProperties(kotlinFromJava);
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(memberProperties, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (KProperty1 kProperty1 : memberProperties) {
                    arrayList.add(kProperty1.getName());
                }
                set = CollectionsKt___CollectionsKt.toSet(arrayList);
                if (KotlinNamesAnnotationIntrospectorKt.access$isPossibleSingleString(kotlinFromJava2, set)) {
                    return false;
                }
                List<KParameter> parameters = kotlinFromJava2.getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    for (KParameter kParameter : parameters) {
                        if (kParameter.getName() == null) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (!z2 && KotlinNamesAnnotationIntrospectorKt.access$isPrimaryConstructor(kotlinFromJava, kotlinFromJava2)) {
                    Collection<KFunction> access$filterOutSingleStringCallables = KotlinNamesAnnotationIntrospectorKt.access$filterOutSingleStringCallables(kotlinFromJava.getConstructors(), set);
                    if (!(access$filterOutSingleStringCallables instanceof Collection) || !access$filterOutSingleStringCallables.isEmpty()) {
                        for (KFunction kFunction : access$filterOutSingleStringCallables) {
                            Iterator<T> it = kFunction.getAnnotations().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((Annotation) obj) instanceof JsonCreator) {
                                    break;
                                }
                            }
                            if (((JsonCreator) obj) != null) {
                                z3 = true;
                                continue;
                            } else {
                                z3 = false;
                                continue;
                            }
                            if (z3) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    Class<?> rawClass = annotatedConstructor.getType().getRawClass();
                    Intrinsics.checkNotNullExpressionValue(rawClass, "member.type.rawClass");
                    KClass<?> companionObject = KClasses.getCompanionObject(JvmClassMappingKt.getKotlinClass(rawClass));
                    if (companionObject != null && (declaredFunctions = KClasses.getDeclaredFunctions(companionObject)) != null) {
                        Collection<KFunction> access$filterOutSingleStringCallables2 = KotlinNamesAnnotationIntrospectorKt.access$filterOutSingleStringCallables(declaredFunctions, set);
                        if (!(access$filterOutSingleStringCallables2 instanceof Collection) || !access$filterOutSingleStringCallables2.isEmpty()) {
                            for (KFunction kFunction2 : access$filterOutSingleStringCallables2) {
                                Iterator<T> it2 = kFunction2.getAnnotations().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it2.next();
                                    if (((Annotation) obj2) instanceof JsonCreator) {
                                        break;
                                    }
                                }
                                if (((JsonCreator) obj2) != null) {
                                    Iterator<T> it3 = kFunction2.getAnnotations().iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        obj3 = it3.next();
                                        if (((Annotation) obj3) instanceof JvmStatic) {
                                            break;
                                        }
                                    }
                                    if (((JvmStatic) obj3) != null) {
                                        z5 = true;
                                        continue;
                                        if (z5) {
                                            z6 = true;
                                            break;
                                        }
                                    }
                                }
                                z5 = false;
                                continue;
                                if (z5) {
                                }
                            }
                        }
                    }
                    z6 = false;
                    return (z4 || z6) ? false : true;
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.Constructor<kotlin.Any>");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember member) {
        boolean contains$default;
        boolean startsWith$default;
        boolean startsWith$default2;
        String str;
        boolean z;
        String substringBefore$default;
        String lowercase;
        Intrinsics.checkNotNullParameter(member, "member");
        if (member instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) member;
            String name = annotatedMethod.getName();
            Intrinsics.checkNotNullExpressionValue(name, "member.name");
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) name, (char) CoreConstants.DASH_CHAR, false, 2, (Object) null);
            if (!contains$default || annotatedMethod.getParameterCount() != 0) {
                return null;
            }
            String name2 = annotatedMethod.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "member.name");
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name2, "get", false, 2, null);
            if (startsWith$default) {
                String name3 = annotatedMethod.getName();
                Intrinsics.checkNotNullExpressionValue(name3, "member.name");
                str = StringsKt__StringsKt.substringAfter$default(name3, "get", (String) null, 2, (Object) null);
            } else {
                String name4 = annotatedMethod.getName();
                Intrinsics.checkNotNullExpressionValue(name4, "member.name");
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(name4, "is", false, 2, null);
                if (startsWith$default2) {
                    String name5 = annotatedMethod.getName();
                    Intrinsics.checkNotNullExpressionValue(name5, "member.name");
                    str = StringsKt__StringsKt.substringAfter$default(name5, "is", (String) null, 2, (Object) null);
                } else {
                    str = null;
                }
            }
            if (str == null) {
                return null;
            }
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                char charAt = str.charAt(0);
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                lowercase = CharsKt__CharJVMKt.lowercase(charAt, locale);
                sb.append(lowercase.toString());
                String substring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str = sb.toString();
            }
            if (str != null) {
                substringBefore$default = StringsKt__StringsKt.substringBefore$default(str, (char) CoreConstants.DASH_CHAR, (String) null, 2, (Object) null);
                return substringBefore$default;
            }
            return null;
        } else if (!(member instanceof AnnotatedParameter)) {
            return null;
        } else {
            return findKotlinParameterName((AnnotatedParameter) member);
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRenameByField(MapperConfig<?> config, AnnotatedField field, PropertyName implName) {
        boolean startsWith$default;
        String stdManglePropertyName;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(implName, "implName");
        String origSimple = implName.getSimpleName();
        Class<?> declaringClass = field.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "field.declaringClass");
        if (KotlinModuleKt.isKotlinClass(declaringClass)) {
            Intrinsics.checkNotNullExpressionValue(origSimple, "origSimple");
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(origSimple, "is", false, 2, null);
            if (startsWith$default && (stdManglePropertyName = BeanUtil.stdManglePropertyName(origSimple, 2)) != null && !stdManglePropertyName.equals(origSimple)) {
                return PropertyName.construct(stdManglePropertyName);
            }
        }
        return null;
    }

    public final ReflectionCache getCache() {
        return this.cache;
    }

    public final Set<KClass<?>> getIgnoredClassesForImplyingJsonCreator() {
        return this.ignoredClassesForImplyingJsonCreator;
    }

    public final KotlinModule getModule() {
        return this.module;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasCreatorAnnotation(Annotated member) {
        Intrinsics.checkNotNullParameter(member, "member");
        if (member instanceof AnnotatedConstructor) {
            AnnotatedConstructor annotatedConstructor = (AnnotatedConstructor) member;
            if (KotlinNamesAnnotationIntrospectorKt.access$isKotlinConstructorWithParameters(annotatedConstructor)) {
                return this.cache.checkConstructorIsCreatorAnnotated(annotatedConstructor, new KotlinNamesAnnotationIntrospector$hasCreatorAnnotation$2(this));
            }
        }
        return false;
    }
}
