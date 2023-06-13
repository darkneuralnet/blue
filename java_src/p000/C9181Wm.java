package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.constant.ZoomBehavior;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007J\f\u0010\u0007\u001a\u00020\u0003*\u00020\u0006H\u0007J\f\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\tH\u0007J\u000e\u0010\u000b\u001a\u00020\t*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u0011"}, m28432d2 = {"LWm;", "", "Lco/bird/android/model/Polygon;", "", "b", "e", "Lco/bird/android/model/constant/ZoomBehavior;", DateTokenConverter.CONVERTER_KEY, "f", "Lco/bird/android/model/constant/AreaIconType;", "c", C17296a.f69688o, "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.lib.persistence.area.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAreaConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaConverters.kt\nco/bird/android/persistence/area/impl/converters/AreaConverters\n+ 2 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n13#2,2:32\n15#2,2:36\n1109#3,2:34\n1#4:38\n*S KotlinDebug\n*F\n+ 1 AreaConverters.kt\nco/bird/android/persistence/area/impl/converters/AreaConverters\n*L\n23#1:32,2\n23#1:36,2\n23#1:34,2\n*E\n"})
/* renamed from: Wm */
/* loaded from: classes4.dex */
public final class C9181Wm {

    /* renamed from: a */
    public static final C9181Wm f42090a = new C9181Wm();

    /* renamed from: b */
    public static final C51174wi2 f42091b = Converters.f66822a.m55283a();

    private C9181Wm() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final AreaIconType m77845a(String str) {
        AreaIconType areaIconType;
        if (str != null) {
            try {
                areaIconType = AreaIconType.valueOf(str);
            } catch (Exception unused) {
                areaIconType = AreaIconType.UNKNOWN;
            }
            if (areaIconType != null) {
                return areaIconType;
            }
        }
        return AreaIconType.UNKNOWN;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m77844b(Polygon polygon) {
        Intrinsics.checkNotNullParameter(polygon, "<this>");
        return f42091b.m6453i(polygon);
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m77843c(AreaIconType areaIconType) {
        if (areaIconType != null) {
            return areaIconType.name();
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m77842d(ZoomBehavior zoomBehavior) {
        Intrinsics.checkNotNullParameter(zoomBehavior, "<this>");
        return zoomBehavior.name();
    }

    @JvmStatic
    /* renamed from: e */
    public static final Polygon m77841e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (Polygon) f42091b.m6459c(str, Reflection.getOrCreateKotlinClass(Polygon.class));
    }

    @JvmStatic
    /* renamed from: f */
    public static final ZoomBehavior m77840f(String str) {
        Enum r6;
        Object[] enumConstants;
        int i;
        boolean equals;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            try {
                enumConstants = ZoomBehavior.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
            } catch (Exception unused) {
                Object[] enumConstants2 = ZoomBehavior.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj : enumConstants2) {
                    if (Intrinsics.areEqual(((Enum) obj).name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        r6 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            for (Object obj2 : enumConstants) {
                equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), str, true);
                if (equals) {
                    Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                    r6 = (Enum) obj2;
                    return (ZoomBehavior) r6;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused2) {
            return ZoomBehavior.ALWAYS_HIDDEN;
        }
    }
}
