package com.afollestad.materialdialogs.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\u001a)\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0080\b¨\u0006\u0005"}, m28432d2 = {"pullIndices", "", "T", "indices", "", "core"}, m28431k = 2, m28430mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class ArraysKt {
    public static final /* synthetic */ <T> List<T> pullIndices(List<? extends T> list, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(list.get(i));
        }
        return arrayList;
    }
}
