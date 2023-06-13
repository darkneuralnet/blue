package com.afollestad.materialdialogs.utils;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¨\u0006\u0006"}, m28432d2 = {"appendAll", "", "values", "", "", "removeAll", "core"}, m28431k = 2, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class IntArraysKt {
    public static final int[] appendAll(int[] iArr, Collection<Integer> collection) {
        List mutableList;
        int[] intArray;
        mutableList = ArraysKt___ArraysKt.toMutableList(iArr);
        mutableList.addAll(collection);
        intArray = CollectionsKt___CollectionsKt.toIntArray(mutableList);
        return intArray;
    }

    public static final int[] removeAll(int[] iArr, Collection<Integer> collection) {
        List mutableList;
        int[] intArray;
        mutableList = ArraysKt___ArraysKt.toMutableList(iArr);
        CollectionsKt__MutableCollectionsKt.removeAll(mutableList, (Function1) new IntArraysKt$removeAll$$inlined$apply$lambda$1(collection));
        intArray = CollectionsKt___CollectionsKt.toIntArray(mutableList);
        return intArray;
    }
}
