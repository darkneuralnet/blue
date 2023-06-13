package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.VehicleHibernationCategory;
import co.bird.android.model.persistence.nestedstructures.HibernationMessage;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000e"}, m28432d2 = {"LRL1;", "", "Lco/bird/android/model/constant/VehicleHibernationCategory;", "", "b", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;", "c", C17296a.f69688o, "Lwi2;", "Lwi2;", "deserializer", "<init>", "()V", "co.bird.android.lib.persistence.hibernation.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHibernationConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationConverters.kt\nco/bird/android/persistence/hibernation/impl/converters/HibernationConverters\n+ 2 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n13#2,2:27\n15#2,2:31\n1109#3,2:29\n1#4:33\n*S KotlinDebug\n*F\n+ 1 HibernationConverters.kt\nco/bird/android/persistence/hibernation/impl/converters/HibernationConverters\n*L\n17#1:27,2\n17#1:31,2\n17#1:29,2\n*E\n"})
/* renamed from: RL1 */
/* loaded from: classes4.dex */
public final class RL1 {

    /* renamed from: a */
    public static final RL1 f31913a = new RL1();

    /* renamed from: b */
    public static final C51174wi2 f31914b = Converters.f66822a.m55283a();

    private RL1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final HibernationMessage m86838a(String str) {
        if (str != null) {
            return (HibernationMessage) f31914b.m6459c(str, Reflection.getOrCreateKotlinClass(HibernationMessage.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m86837b(VehicleHibernationCategory vehicleHibernationCategory) {
        Intrinsics.checkNotNullParameter(vehicleHibernationCategory, "<this>");
        String lowerCase = vehicleHibernationCategory.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m86836c(HibernationMessage hibernationMessage) {
        if (hibernationMessage != null) {
            return f31914b.m6453i(hibernationMessage);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final VehicleHibernationCategory m86835d(String str) {
        Enum r6;
        Object[] enumConstants;
        int i;
        boolean equals;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            enumConstants = VehicleHibernationCategory.class.getEnumConstants();
            Intrinsics.checkNotNull(enumConstants);
        } catch (Exception unused) {
            Object[] enumConstants2 = VehicleHibernationCategory.class.getEnumConstants();
            Intrinsics.checkNotNull(enumConstants2);
            for (Object obj : enumConstants2) {
                r6 = (Enum) obj;
                if (Intrinsics.areEqual(r6.name(), "UNKNOWN")) {
                    Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        for (Object obj2 : enumConstants) {
            equals = StringsKt__StringsJVMKt.equals(((Enum) obj2).name(), str, true);
            if (equals) {
                Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                r6 = (Enum) obj2;
                return (VehicleHibernationCategory) r6;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
