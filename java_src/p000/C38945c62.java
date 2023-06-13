package p000;

import android.content.Intent;
import com.facebook.share.internal.C17296a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a0\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0010\b\u0000\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0000¨\u0006\t"}, m28432d2 = {"", "E", "Landroid/content/Intent;", "", "key", "getEnumExtra", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Enum;", "enum", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntent+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,13:1\n1#2:14\n13#3,2:15\n15#3,2:19\n1109#4,2:17\n*S KotlinDebug\n*F\n+ 1 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n*L\n6#1:15,2\n6#1:19,2\n6#1:17,2\n*E\n"})
/* renamed from: c62  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38945c62 {
    /* renamed from: a */
    public static final Intent m61933a(Intent intent, String key, Enum<?> r3) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(r3, "enum");
        intent.putExtra(key, r3.name());
        return intent;
    }

    public static final /* synthetic */ <E extends Enum<E>> E getEnumExtra(Intent intent, String key) {
        boolean equals;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String stringExtra = intent.getStringExtra(key);
        if (stringExtra != null) {
            try {
                Intrinsics.reifiedOperationMarker(4, "E");
                Object[] enumConstants = Enum.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
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
}
