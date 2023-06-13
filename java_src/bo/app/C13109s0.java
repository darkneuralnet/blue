package bo.app;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\b\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0003*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0007J:\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0007¨\u0006\u0010"}, m28432d2 = {"Lbo/app/s0;", "", "", "TargetEnum", "", "enumValue", "Ljava/lang/Class;", "targetEnumClass", C17296a.f69688o, "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Enum;", "Ljava/util/EnumSet;", "sourceEnumSet", "", "sourceStringSet", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.s0 */
/* loaded from: classes.dex */
public final class C13109s0 {

    /* renamed from: a */
    public static final C13109s0 f59272a = new C13109s0();

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "TargetEnum", "", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.s0$a */
    /* loaded from: classes.dex */
    public static final class C13110a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59273b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13110a(String str) {
            super(0);
            this.f59273b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to create valid enum from string: ", this.f59273b);
        }
    }

    private C13109s0() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum m62986a(String enumValue, Class<TargetEnum> targetEnumClass) {
        Intrinsics.checkNotNullParameter(enumValue, "enumValue");
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        return (TargetEnum) Enum.valueOf(targetEnumClass, enumValue);
    }

    @JvmStatic
    /* renamed from: a */
    public static final <TargetEnum extends Enum<TargetEnum>> EnumSet<TargetEnum> m62987a(Class<TargetEnum> targetEnumClass, Set<String> sourceStringSet) {
        Intrinsics.checkNotNullParameter(targetEnumClass, "targetEnumClass");
        Intrinsics.checkNotNullParameter(sourceStringSet, "sourceStringSet");
        EnumSet<TargetEnum> result = EnumSet.noneOf(targetEnumClass);
        for (String str : sourceStringSet) {
            try {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String upperCase = str.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                result.add(m62986a(upperCase, targetEnumClass));
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, f59272a, C43664k20.EnumC25082a.E, e, false, new C13110a(str), 4, null);
            }
        }
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    @JvmStatic
    /* renamed from: a */
    public static final Set<String> m62985a(EnumSet<?> sourceEnumSet) {
        int collectionSizeOrDefault;
        Set<String> set;
        Intrinsics.checkNotNullParameter(sourceEnumSet, "sourceEnumSet");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(sourceEnumSet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = sourceEnumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        set = CollectionsKt___CollectionsKt.toSet(arrayList);
        return set;
    }
}
