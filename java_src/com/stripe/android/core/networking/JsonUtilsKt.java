package com.stripe.android.core.networking;

import com.stripe.android.core.exception.InvalidSerializationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0007\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007\u001a\u0010\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0007*\u00020\u0006H\u0007\u001a\u0016\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0001*\u00020\bH\u0007¨\u0006\t"}, m28432d2 = {"Lxi2;", "", "", "toMap", "", "toPrimitives", "Lei2;", "", "LSi2;", "stripe-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nJsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonUtils.kt\ncom/stripe/android/core/networking/JsonUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n125#3:51\n152#3,3:52\n*S KotlinDebug\n*F\n+ 1 JsonUtils.kt\ncom/stripe/android/core/networking/JsonUtilsKt\n*L\n37#1:47\n37#1:48,3\n45#1:51\n45#1:52,3\n*E\n"})
/* loaded from: classes6.dex */
public final class JsonUtilsKt {
    public static final Map<String, ?> toMap(AbstractC51767xi2 abstractC51767xi2) {
        Intrinsics.checkNotNullParameter(abstractC51767xi2, "<this>");
        if (abstractC51767xi2 instanceof C35899Si2) {
            return toMap((C35899Si2) abstractC51767xi2);
        }
        String simpleName = abstractC51767xi2.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        throw new InvalidSerializationException(simpleName);
    }

    public static final Object toPrimitives(AbstractC51767xi2 abstractC51767xi2) {
        Intrinsics.checkNotNullParameter(abstractC51767xi2, "<this>");
        if (Intrinsics.areEqual(abstractC51767xi2, C35197Pi2.INSTANCE)) {
            return null;
        }
        if (abstractC51767xi2 instanceof C40502ei2) {
            return toPrimitives((C40502ei2) abstractC51767xi2);
        }
        if (abstractC51767xi2 instanceof C35899Si2) {
            return toMap((C35899Si2) abstractC51767xi2);
        }
        if (abstractC51767xi2 instanceof AbstractC37303Yi2) {
            return new Regex("^\"|\"$").replace(((AbstractC37303Yi2) abstractC51767xi2).mo74434a(), "");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Map<String, ?> toMap(C35899Si2 c35899Si2) {
        Map<String, ?> map;
        Intrinsics.checkNotNullParameter(c35899Si2, "<this>");
        ArrayList arrayList = new ArrayList(c35899Si2.size());
        for (Map.Entry<String, AbstractC51767xi2> entry : c35899Si2.entrySet()) {
            arrayList.add(TuplesKt.m28425to(entry.getKey(), toPrimitives(entry.getValue())));
        }
        map = MapsKt__MapsKt.toMap(arrayList);
        return map;
    }

    public static final List<?> toPrimitives(C40502ei2 c40502ei2) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(c40502ei2, "<this>");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(c40502ei2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<AbstractC51767xi2> it = c40502ei2.iterator();
        while (it.hasNext()) {
            arrayList.add(toPrimitives(it.next()));
        }
        return arrayList;
    }
}
