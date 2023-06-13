package com.fasterxml.jackson.module.kotlin;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.ReflectJvmMapping;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014J\f\u0010\u0015\u001a\u00020\u0006*\u00020\u0011H\u0002J\f\u0010\u0016\u001a\u00020\u0006*\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinValueInstantiator;", "Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;", "src", "cache", "Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;", "nullToEmptyCollection", "", "nullToEmptyMap", "nullIsSameAsDefault", "strictNullChecks", "(Lcom/fasterxml/jackson/databind/deser/std/StdValueInstantiator;Lcom/fasterxml/jackson/module/kotlin/ReflectionCache;ZZZZ)V", "createFromObjectWith", "", "ctxt", "Lcom/fasterxml/jackson/databind/DeserializationContext;", "props", "", "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;", "buffer", "Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;", "(Lcom/fasterxml/jackson/databind/DeserializationContext;[Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/deser/impl/PropertyValueBuffer;)Ljava/lang/Object;", "hasInjectableValueId", "isPrimitive", "Lkotlin/reflect/KParameter;", "jackson-module-kotlin"}, m28431k = 1, m28430mv = {1, 5, 1}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class KotlinValueInstantiator extends StdValueInstantiator {
    private final ReflectionCache cache;
    private final boolean nullIsSameAsDefault;
    private final boolean nullToEmptyCollection;
    private final boolean nullToEmptyMap;
    private final boolean strictNullChecks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinValueInstantiator(StdValueInstantiator src, ReflectionCache cache, boolean z, boolean z2, boolean z3, boolean z4) {
        super(src);
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.cache = cache;
        this.nullToEmptyCollection = z;
        this.nullToEmptyMap = z2;
        this.nullIsSameAsDefault = z3;
        this.strictNullChecks = z4;
    }

    private final boolean hasInjectableValueId(SettableBeanProperty settableBeanProperty) {
        return settableBeanProperty.getInjectableValueId() != null;
    }

    private final boolean isPrimitive(KParameter kParameter) {
        Type javaType = ReflectJvmMapping.getJavaType(kParameter.getType());
        if (javaType instanceof Class) {
            return ((Class) javaType).isPrimitive();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
        if (r12.isOptional() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192  */
    @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createFromObjectWith(DeserializationContext ctxt, SettableBeanProperty[] settableBeanPropertyArr, PropertyValueBuffer propertyValueBuffer) {
        KParameter[] kParameterArr;
        Object[] objArr;
        int i;
        Object parameter;
        int i2;
        Iterator it;
        int i3;
        int i4;
        String str;
        KType kType;
        KType kType2;
        Object orNull;
        KType type;
        boolean z;
        boolean z2;
        boolean z3;
        Object orNull2;
        KType type2;
        boolean z4;
        boolean z5;
        boolean z6;
        Object orNull3;
        KType type3;
        boolean z7;
        boolean z8;
        boolean z9;
        JsonDeserializer<Object> valueDeserializer;
        SettableBeanProperty[] props = settableBeanPropertyArr;
        PropertyValueBuffer buffer = propertyValueBuffer;
        Intrinsics.checkNotNullParameter(ctxt, "ctxt");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        ReflectionCache reflectionCache = this.cache;
        AnnotatedWithParams _withArgsCreator = this._withArgsCreator;
        Intrinsics.checkNotNullExpressionValue(_withArgsCreator, "_withArgsCreator");
        ValueCreator<?> valueCreatorFromJava = reflectionCache.valueCreatorFromJava(_withArgsCreator);
        if (valueCreatorFromJava == null) {
            return super.createFromObjectWith(ctxt, settableBeanPropertyArr, propertyValueBuffer);
        }
        boolean z10 = true;
        int i5 = 0;
        if (valueCreatorFromJava instanceof MethodValueCreator) {
            int length = props.length + 1;
            kParameterArr = new KParameter[length];
            MethodValueCreator methodValueCreator = (MethodValueCreator) valueCreatorFromJava;
            kParameterArr[0] = methodValueCreator.getInstanceParameter();
            objArr = new Object[length];
            objArr[0] = methodValueCreator.getCompanionObjectInstance();
            i = 1;
        } else {
            int length2 = props.length;
            kParameterArr = new KParameter[length2];
            objArr = new Object[length2];
            i = 0;
        }
        Iterator it2 = valueCreatorFromJava.getValueParameters().iterator();
        int i6 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i7 = i6 + 1;
            if (i6 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            KParameter kParameter = (KParameter) next;
            SettableBeanProperty settableBeanProperty = props[i6];
            boolean hasParameter = buffer.hasParameter(settableBeanProperty) ^ z10;
            if (!hasParameter || !kParameter.isOptional()) {
                if (hasParameter && !isPrimitive(kParameter) && !hasInjectableValueId(settableBeanProperty)) {
                    parameter = (kParameter.getType().isMarkedNullable() || (valueDeserializer = settableBeanProperty.getValueDeserializer()) == null) ? null : valueDeserializer.getAbsentValue(ctxt);
                } else {
                    parameter = buffer.getParameter(settableBeanProperty);
                    if (this.nullIsSameAsDefault) {
                        if (parameter == null) {
                        }
                    }
                }
                if (parameter == null && ((this.nullToEmptyCollection && settableBeanProperty.getType().isCollectionLikeType()) || (this.nullToEmptyMap && settableBeanProperty.getType().isMapLikeType()))) {
                    parameter = new NullsAsEmptyProvider(settableBeanProperty.getValueDeserializer()).getNullValue(ctxt);
                }
                boolean z11 = ReflectJvmMapping.getJavaType(kParameter.getType()) instanceof TypeVariable;
                if (parameter == null && hasParameter && settableBeanProperty.isRequired()) {
                    i2 = 1;
                } else {
                    i2 = i5;
                }
                if (i2 == 0 && (z11 || parameter != null || kParameter.getType().isMarkedNullable())) {
                    if (this.strictNullChecks && parameter != null) {
                        if (settableBeanProperty.getType().isCollectionLikeType()) {
                            orNull3 = CollectionsKt___CollectionsKt.getOrNull(kParameter.getType().getArguments(), 0);
                            KTypeProjection kTypeProjection = (KTypeProjection) orNull3;
                            if (kTypeProjection == null || (type3 = kTypeProjection.getType()) == null || type3.isMarkedNullable()) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7) {
                                Collection<Object> collection = (Collection) parameter;
                                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                    for (Object obj : collection) {
                                        if (obj == null) {
                                            z8 = true;
                                            continue;
                                        } else {
                                            z8 = false;
                                            continue;
                                        }
                                        if (z8) {
                                            z9 = true;
                                            break;
                                        }
                                    }
                                }
                                z9 = false;
                                if (z9) {
                                    str = "collection";
                                    kType = kParameter.getType().getArguments().get(0).getType();
                                    if (!settableBeanProperty.getType().isMapLikeType()) {
                                        it = it2;
                                        orNull2 = CollectionsKt___CollectionsKt.getOrNull(kParameter.getType().getArguments(), 1);
                                        KTypeProjection kTypeProjection2 = (KTypeProjection) orNull2;
                                        if (kTypeProjection2 == null || (type2 = kTypeProjection2.getType()) == null || type2.isMarkedNullable()) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            Map map = (Map) parameter;
                                            if (!map.isEmpty()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    if (entry.getValue() == null) {
                                                        z5 = true;
                                                        continue;
                                                    } else {
                                                        z5 = false;
                                                        continue;
                                                    }
                                                    if (z5) {
                                                        z6 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            z6 = false;
                                            if (z6) {
                                                kType = kParameter.getType().getArguments().get(1).getType();
                                                str = "map";
                                                if (settableBeanProperty.getType().isArrayType()) {
                                                    orNull = CollectionsKt___CollectionsKt.getOrNull(kParameter.getType().getArguments(), 0);
                                                    KTypeProjection kTypeProjection3 = (KTypeProjection) orNull;
                                                    if (kTypeProjection3 == null || (type = kTypeProjection3.getType()) == null || type.isMarkedNullable()) {
                                                        z = false;
                                                    } else {
                                                        z = true;
                                                    }
                                                    if (z) {
                                                        Object[] objArr2 = (Object[]) parameter;
                                                        int length3 = objArr2.length;
                                                        i3 = i7;
                                                        int i8 = 0;
                                                        while (true) {
                                                            if (i8 < length3) {
                                                                if (objArr2[i8] == null) {
                                                                    z3 = true;
                                                                } else {
                                                                    z3 = false;
                                                                }
                                                                if (z3) {
                                                                    z2 = true;
                                                                    break;
                                                                }
                                                                i8++;
                                                            } else {
                                                                z2 = false;
                                                                break;
                                                            }
                                                        }
                                                        if (z2) {
                                                            i4 = 0;
                                                            kType = kParameter.getType().getArguments().get(0).getType();
                                                            str = "array";
                                                            kType2 = kType;
                                                            if (str != null && kType2 != null) {
                                                                MissingKotlinParameterException missingKotlinParameterException = new MissingKotlinParameterException(kParameter, ctxt.getParser(), "Instantiation of " + kType2 + ' ' + ((Object) str) + " failed for JSON property " + ((Object) settableBeanProperty.getName()) + " due to null value in a " + ((Object) str) + " that does not allow null values");
                                                                Class<?> valueClass = getValueClass();
                                                                String name = settableBeanProperty.getName();
                                                                Intrinsics.checkNotNullExpressionValue(name, "jsonProp.name");
                                                                JsonMappingException wrapWithPath = ExtensionsKt.wrapWithPath(missingKotlinParameterException, valueClass, name);
                                                                Intrinsics.checkNotNullExpressionValue(wrapWithPath, "MissingKotlinParameterEx…alueClass, jsonProp.name)");
                                                                throw wrapWithPath;
                                                            }
                                                        }
                                                        i4 = 0;
                                                        kType2 = kType;
                                                        if (str != null) {
                                                            MissingKotlinParameterException missingKotlinParameterException2 = new MissingKotlinParameterException(kParameter, ctxt.getParser(), "Instantiation of " + kType2 + ' ' + ((Object) str) + " failed for JSON property " + ((Object) settableBeanProperty.getName()) + " due to null value in a " + ((Object) str) + " that does not allow null values");
                                                            Class<?> valueClass2 = getValueClass();
                                                            String name2 = settableBeanProperty.getName();
                                                            Intrinsics.checkNotNullExpressionValue(name2, "jsonProp.name");
                                                            JsonMappingException wrapWithPath2 = ExtensionsKt.wrapWithPath(missingKotlinParameterException2, valueClass2, name2);
                                                            Intrinsics.checkNotNullExpressionValue(wrapWithPath2, "MissingKotlinParameterEx…alueClass, jsonProp.name)");
                                                            throw wrapWithPath2;
                                                        }
                                                    }
                                                }
                                                i3 = i7;
                                                i4 = 0;
                                                kType2 = kType;
                                                if (str != null) {
                                                }
                                            }
                                        }
                                    } else {
                                        it = it2;
                                    }
                                    if (settableBeanProperty.getType().isArrayType()) {
                                    }
                                    i3 = i7;
                                    i4 = 0;
                                    kType2 = kType;
                                    if (str != null) {
                                    }
                                }
                            }
                        }
                        str = null;
                        kType = null;
                        if (!settableBeanProperty.getType().isMapLikeType()) {
                        }
                        if (settableBeanProperty.getType().isArrayType()) {
                        }
                        i3 = i7;
                        i4 = 0;
                        kType2 = kType;
                        if (str != null) {
                        }
                    } else {
                        it = it2;
                        i3 = i7;
                        i4 = 0;
                    }
                    objArr[i] = parameter;
                    kParameterArr[i] = kParameter;
                    i++;
                    props = settableBeanPropertyArr;
                    buffer = propertyValueBuffer;
                    i5 = i4;
                    it2 = it;
                    i6 = i3;
                    z10 = true;
                } else {
                    MissingKotlinParameterException missingKotlinParameterException3 = new MissingKotlinParameterException(kParameter, ctxt.getParser(), "Instantiation of " + ((Object) getValueTypeDesc()) + " value failed for JSON property " + ((Object) settableBeanProperty.getName()) + " due to missing (therefore NULL) value for creator parameter " + ((Object) kParameter.getName()) + " which is a non-nullable type");
                    Class<?> valueClass3 = getValueClass();
                    String name3 = settableBeanProperty.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "jsonProp.name");
                    JsonMappingException wrapWithPath3 = ExtensionsKt.wrapWithPath(missingKotlinParameterException3, valueClass3, name3);
                    Intrinsics.checkNotNullExpressionValue(wrapWithPath3, "MissingKotlinParameterEx…alueClass, jsonProp.name)");
                    throw wrapWithPath3;
                }
            }
            i6 = i7;
            z10 = true;
        }
        int i9 = i5;
        if (i == objArr.length && (valueCreatorFromJava instanceof ConstructorValueCreator)) {
            return super.createFromObjectWith(ctxt, objArr);
        }
        valueCreatorFromJava.checkAccessibility(ctxt);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList(kParameterArr.length);
        int length4 = kParameterArr.length;
        int i10 = i9;
        while (i10 < length4) {
            KParameter kParameter2 = kParameterArr[i10];
            int i11 = i9 + 1;
            if (kParameter2 != null) {
                linkedHashMap.put(kParameter2, objArr[i9]);
            }
            arrayList.add(Unit.INSTANCE);
            i10++;
            i9 = i11;
        }
        return valueCreatorFromJava.callBy(linkedHashMap);
    }
}
