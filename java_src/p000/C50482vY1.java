package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002H\u0002¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m28432d2 = {"T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "value", "", "f", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "e", "(Ljava/util/ArrayList;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,768:1\n53#2,4:769\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n707#1:769,4\n*E\n"})
/* renamed from: vY1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50482vY1 {
    /* renamed from: d */
    public static final <T> T m8495d(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: e */
    public static final <T> T m8494e(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: f */
    public static final <T> boolean m8493f(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}
