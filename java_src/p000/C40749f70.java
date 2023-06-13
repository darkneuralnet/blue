package p000;

import android.os.Bundle;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u001a0\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a \u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b\u001a$\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\t¨\u0006\r"}, m28432d2 = {"", "E", "Landroid/os/Bundle;", "", "key", "getEnum", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Enum;", "enum", C17296a.f69688o, "", "getEnumList", "enums", "b", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBundle+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1#2:23\n13#3,2:24\n15#3,2:28\n13#3,2:33\n15#3,2:37\n1109#4,2:26\n1109#4,2:35\n1549#5:30\n1620#5,2:31\n1622#5:39\n1549#5:40\n1620#5,3:41\n*S KotlinDebug\n*F\n+ 1 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n*L\n6#1:24,2\n6#1:28,2\n15#1:33,2\n15#1:37,2\n6#1:26,2\n15#1:35,2\n15#1:30\n15#1:31,2\n15#1:39\n19#1:40\n19#1:41,3\n*E\n"})
/* renamed from: f70  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40749f70 {
    /* renamed from: a */
    public static final Bundle m42020a(Bundle bundle, String key, Enum<?> r3) {
        String name;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (r3 != null && (name = r3.name()) != null) {
            bundle.putString(key, name);
        }
        return bundle;
    }

    /* renamed from: b */
    public static final Bundle m42019b(Bundle bundle, String key, List<? extends Enum<?>> enums) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(enums, "enums");
        List<? extends Enum<?>> list = enums;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        bundle.putStringArrayList(key, C44691lm0.m26849a(arrayList));
        return bundle;
    }

    public static final /* synthetic */ <E extends Enum<E>> E getEnum(Bundle bundle, String key) {
        boolean equals;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String string = bundle.getString(key);
        if (string != null) {
            try {
                Intrinsics.reifiedOperationMarker(4, "E");
                Object[] enumConstants = Enum.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), string, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        return (E) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Intrinsics.reifiedOperationMarker(4, "E");
                Object[] enumConstants2 = Enum.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    E e = (E) obj2;
                    if (Intrinsics.areEqual(e.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        return e;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        return null;
    }

    public static final /* synthetic */ <E extends Enum<E>> List<E> getEnumList(Bundle bundle, String key) {
        List<E> emptyList;
        int collectionSizeOrDefault;
        Enum r9;
        Object[] enumConstants;
        int i;
        boolean equals;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
        if (stringArrayList != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(stringArrayList, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (String name : stringArrayList) {
                Intrinsics.checkNotNullExpressionValue(name, "name");
                try {
                    Intrinsics.reifiedOperationMarker(4, "E");
                    enumConstants = Enum.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants);
                } catch (Exception unused) {
                    Intrinsics.reifiedOperationMarker(4, "E");
                    Object[] enumConstants2 = Enum.class.getEnumConstants();
                    Intrinsics.checkNotNull(enumConstants2);
                    for (Object obj : enumConstants2) {
                        r9 = (Enum) obj;
                        if (Intrinsics.areEqual(r9.name(), "UNKNOWN")) {
                            Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                for (Object obj2 : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), name, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r9 = (Enum) obj2;
                        arrayList.add(r9);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return arrayList;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }
}
