package kotlin.collections.builders;

import co.bird.android.model.LegacyRepairType;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a+\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0001\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\t\u001a%\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\r\u001a-\u0010\u000e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u001a\u001a/\u0010\u001b\u001a\u00020\u001c\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, m28432d2 = {"arrayOfUninitializedElements", "", "E", "size", "", "(I)[Ljava/lang/Object;", "copyOfUninitializedElements", "T", "newSize", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "resetAt", "", "index", "([Ljava/lang/Object;I)V", "resetRange", "fromIndex", "toIndex", "([Ljava/lang/Object;II)V", "subarrayContentEquals", "", "offset", "length", LegacyRepairType.OTHER_KEY, "", "([Ljava/lang/Object;IILjava/util/List;)Z", "subarrayContentHashCode", "([Ljava/lang/Object;II)I", "subarrayContentToString", "", "([Ljava/lang/Object;II)Ljava/lang/String;", "kotlin-stdlib"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
/* loaded from: classes8.dex */
public final class ListBuilderKt {
    public static final <E> E[] arrayOfUninitializedElements(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (E[]) new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final <T> T[] copyOfUninitializedElements(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(this, newSize)");
        return tArr2;
    }

    public static final <E> void resetAt(E[] eArr, int i) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i] = null;
    }

    public static final <E> void resetRange(E[] eArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i < i2) {
            resetAt(eArr, i);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean subarrayContentEquals(T[] tArr, int i, int i2, List<?> list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!Intrinsics.areEqual(tArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int subarrayContentHashCode(T[] tArr, int i, int i2) {
        int i3;
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            T t = tArr[i + i5];
            int i6 = i4 * 31;
            if (t != null) {
                i3 = t.hashCode();
            } else {
                i3 = 0;
            }
            i4 = i6 + i3;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> String subarrayContentToString(T[] tArr, int i, int i2) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(tArr[i + i3]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}