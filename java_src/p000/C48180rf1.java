package p000;

import com.facebook.share.internal.C17296a;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"", "T", "", "serialName", "", "values", "names", "", "annotations", "LKj2;", C17296a.f69688o, "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;)LKj2;", "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,151:1\n13644#2,2:152\n13579#2,2:154\n13646#2:156\n13579#2,2:157\n13644#2,2:159\n13579#2,2:161\n13646#2:163\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumsKt\n*L\n70#1:152,2\n73#1:154,2\n70#1:156\n91#1:157,2\n94#1:159,2\n97#1:161,2\n94#1:163\n*E\n"})
/* renamed from: rf1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48180rf1 {
    /* renamed from: a */
    public static final <T extends Enum<T>> InterfaceC34036Kj2<T> m15590a(String serialName, T[] values, String[] names, Annotation[][] annotations) {
        Object orNull;
        Object orNull2;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        C41657gf1 c41657gf1 = new C41657gf1(serialName, values.length);
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            T t = values[i];
            int i3 = i2 + 1;
            orNull = ArraysKt___ArraysKt.getOrNull(names, i2);
            String str = (String) orNull;
            if (str == null) {
                str = t.name();
            }
            AW3.m115696l(c41657gf1, str, false, 2, null);
            orNull2 = ArraysKt___ArraysKt.getOrNull(annotations, i2);
            Annotation[] annotationArr = (Annotation[]) orNull2;
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    c41657gf1.m115691q(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        return new C44622lf1(serialName, values, c41657gf1);
    }
}
