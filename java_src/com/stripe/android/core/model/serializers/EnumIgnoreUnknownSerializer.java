package com.stripe.android.core.model.serializers;

import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.E24;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\b'\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001d\u0012\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00028\u00000\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001e\u0010\u001c\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00028\u00000\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"Lcom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer;", "", "T", "LKj2;", "Lrb1;", "encoder", "value", "", "serialize", "(Lrb1;Ljava/lang/Enum;)V", "LGV0;", "decoder", "deserialize", "(LGV0;)Ljava/lang/Enum;", "defaultValue", "Ljava/lang/Enum;", "LMs5;", "descriptor", "LMs5;", "getDescriptor", "()LMs5;", "", "", "lookup", "Ljava/util/Map;", "revLookup", "getSerialName", "(Ljava/lang/Enum;)Ljava/lang/String;", "serialName", "", "values", "<init>", "([Ljava/lang/Enum;Ljava/lang/Enum;)V", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnumIgnoreUnknownSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumIgnoreUnknownSerializer.kt\ncom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,44:1\n8945#2,2:45\n9215#2,4:47\n8811#2,2:51\n9071#2,4:53\n*S KotlinDebug\n*F\n+ 1 EnumIgnoreUnknownSerializer.kt\ncom/stripe/android/core/model/serializers/EnumIgnoreUnknownSerializer\n*L\n27#1:45,2\n27#1:47,4\n28#1:51,2\n28#1:53,4\n*E\n"})
/* loaded from: classes6.dex */
public abstract class EnumIgnoreUnknownSerializer<T extends Enum<T>> implements InterfaceC34036Kj2<T> {
    private final T defaultValue;
    private final InterfaceC34588Ms5 descriptor;
    private final Map<T, String> lookup;
    private final Map<String, T> revLookup;

    /* JADX WARN: Multi-variable type inference failed */
    public EnumIgnoreUnknownSerializer(T[] values, T defaultValue) {
        Object first;
        int mapCapacity;
        int coerceAtLeast;
        int mapCapacity2;
        int coerceAtLeast2;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.defaultValue = defaultValue;
        first = ArraysKt___ArraysKt.first(values);
        String qualifiedName = Reflection.getOrCreateKotlinClass(first.getClass()).getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        this.descriptor = C35524Qs5.m87852a(qualifiedName, E24.C1721i.f6873a);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        for (T t : values) {
            linkedHashMap.put(t, getSerialName(t));
        }
        this.lookup = linkedHashMap;
        mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(values.length);
        coerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(mapCapacity2, 16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(coerceAtLeast2);
        for (T t2 : values) {
            linkedHashMap2.put(getSerialName(t2), t2);
        }
        this.revLookup = linkedHashMap2;
    }

    private final String getSerialName(Enum<T> r3) {
        String value;
        InterfaceC36694Vs5 interfaceC36694Vs5 = (InterfaceC36694Vs5) r3.getClass().getField(r3.name()).getAnnotation(InterfaceC36694Vs5.class);
        if (interfaceC36694Vs5 == null || (value = interfaceC36694Vs5.value()) == null) {
            return r3.name();
        }
        return value;
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC40615et5
    public /* bridge */ /* synthetic */ void serialize(InterfaceC48140rb1 interfaceC48140rb1, Object obj) {
        serialize(interfaceC48140rb1, (InterfaceC48140rb1) ((Enum) obj));
    }

    @Override // p000.E01
    public T deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        T t = this.revLookup.get(decoder.mo3282t());
        return t == null ? this.defaultValue : t;
    }

    public void serialize(InterfaceC48140rb1 encoder, T value) {
        Object value2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        value2 = MapsKt__MapsKt.getValue(this.lookup, value);
        encoder.mo1134q((String) value2);
    }
}
