package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class AnnotatedMethodCollector extends CollectorBase {
    private final boolean _collectAnnotations;
    private final ClassIntrospector.MixInResolver _mixInResolver;

    /* loaded from: classes5.dex */
    public static final class MethodBuilder {
        public AnnotationCollector annotations;
        public Method method;
        public TypeResolutionContext typeContext;

        public MethodBuilder(TypeResolutionContext typeResolutionContext, Method method, AnnotationCollector annotationCollector) {
            this.typeContext = typeResolutionContext;
            this.method = method;
            this.annotations = annotationCollector;
        }

        public AnnotatedMethod build() {
            Method method = this.method;
            if (method == null) {
                return null;
            }
            return new AnnotatedMethod(this.typeContext, method, this.annotations.asAnnotationMap(), null);
        }
    }

    public AnnotatedMethodCollector(AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, boolean z) {
        super(annotationIntrospector);
        this._mixInResolver = annotationIntrospector == null ? null : mixInResolver;
        this._collectAnnotations = z;
    }

    private void _addMemberMethods(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        Method[] classMethods;
        AnnotationCollector collectAnnotations;
        if (cls2 != null) {
            _addMethodMixIns(typeResolutionContext, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : ClassUtil.getClassMethods(cls)) {
            if (_isIncludableMemberMethod(method)) {
                MemberKey memberKey = new MemberKey(method);
                MethodBuilder methodBuilder = map.get(memberKey);
                if (methodBuilder == null) {
                    if (this._intr == null) {
                        collectAnnotations = AnnotationCollector.emptyCollector();
                    } else {
                        collectAnnotations = collectAnnotations(method.getDeclaredAnnotations());
                    }
                    map.put(memberKey, new MethodBuilder(typeResolutionContext, method, collectAnnotations));
                } else {
                    if (this._collectAnnotations) {
                        methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, method.getDeclaredAnnotations());
                    }
                    Method method2 = methodBuilder.method;
                    if (method2 == null) {
                        methodBuilder.method = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        methodBuilder.method = method;
                        methodBuilder.typeContext = typeResolutionContext;
                    }
                }
            }
        }
    }

    private static boolean _isIncludableMemberMethod(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }

    public static AnnotatedMethodMap collectMethods(AnnotationIntrospector annotationIntrospector, TypeResolutionContext typeResolutionContext, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls, boolean z) {
        return new AnnotatedMethodCollector(annotationIntrospector, mixInResolver, z).collect(typeFactory, typeResolutionContext, javaType, list, cls);
    }

    public void _addMethodMixIns(TypeResolutionContext typeResolutionContext, Class<?> cls, Map<MemberKey, MethodBuilder> map, Class<?> cls2) {
        Method[] declaredMethods;
        if (this._intr == null) {
            return;
        }
        for (Class<?> cls3 : ClassUtil.findRawSuperTypes(cls2, cls, true)) {
            for (Method method : cls3.getDeclaredMethods()) {
                if (_isIncludableMemberMethod(method)) {
                    MemberKey memberKey = new MemberKey(method);
                    MethodBuilder methodBuilder = map.get(memberKey);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (methodBuilder == null) {
                        map.put(memberKey, new MethodBuilder(typeResolutionContext, null, collectAnnotations(declaredAnnotations)));
                    } else {
                        methodBuilder.annotations = collectDefaultAnnotations(methodBuilder.annotations, declaredAnnotations);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AnnotatedMethodMap collect(TypeFactory typeFactory, TypeResolutionContext typeResolutionContext, JavaType javaType, List<JavaType> list, Class<?> cls) {
        boolean z;
        Class<?> findMixInClassFor;
        Class<?> findMixInClassFor2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _addMemberMethods(typeResolutionContext, javaType.getRawClass(), linkedHashMap, cls);
        for (JavaType javaType2 : list) {
            ClassIntrospector.MixInResolver mixInResolver = this._mixInResolver;
            if (mixInResolver == null) {
                findMixInClassFor2 = null;
            } else {
                findMixInClassFor2 = mixInResolver.findMixInClassFor(javaType2.getRawClass());
            }
            _addMemberMethods(new TypeResolutionContext.Basic(typeFactory, javaType2.getBindings()), javaType2.getRawClass(), linkedHashMap, findMixInClassFor2);
        }
        ClassIntrospector.MixInResolver mixInResolver2 = this._mixInResolver;
        if (mixInResolver2 != null && (findMixInClassFor = mixInResolver2.findMixInClassFor(Object.class)) != null) {
            _addMethodMixIns(typeResolutionContext, javaType.getRawClass(), linkedHashMap, findMixInClassFor);
            z = true;
        } else {
            z = false;
        }
        if (z && this._intr != null && !linkedHashMap.isEmpty()) {
            for (Map.Entry<MemberKey, MethodBuilder> entry : linkedHashMap.entrySet()) {
                MemberKey key = entry.getKey();
                if ("hashCode".equals(key.getName())) {
                    if (key.argCount() == 0) {
                        try {
                            Method declaredMethod = Object.class.getDeclaredMethod(key.getName(), new Class[0]);
                            if (declaredMethod != null) {
                                MethodBuilder value = entry.getValue();
                                value.annotations = collectDefaultAnnotations(value.annotations, declaredMethod.getDeclaredAnnotations());
                                value.method = declaredMethod;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    while (r5.hasNext()) {
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new AnnotatedMethodMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry<MemberKey, MethodBuilder> entry2 : linkedHashMap.entrySet()) {
            AnnotatedMethod build = entry2.getValue().build();
            if (build != null) {
                linkedHashMap2.put(entry2.getKey(), build);
            }
        }
        return new AnnotatedMethodMap(linkedHashMap2);
    }
}
