package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.constant.OperatorMapKind;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0004H\u0007J\f\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0007J\f\u0010\t\u001a\u00020\u0007*\u00020\u0004H\u0007J\f\u0010\u000b\u001a\u00020\u0004*\u00020\nH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u0004H\u0007R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LXk3;", "", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "", DateTokenConverter.CONVERTER_KEY, "e", "Lco/bird/android/model/constant/OperatorFilterType;", "b", "f", "Lco/bird/android/model/constant/OperatorMapKind;", "c", "g", "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "operatorFilterOptionTypeToken", "<init>", "()V", "co.bird.android.lib.persistence.operator-filter.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xk3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37088Xk3 {

    /* renamed from: a */
    public static final C37088Xk3 f43786a = new C37088Xk3();

    /* renamed from: b */
    public static final C51174wi2 f43787b = Converters.f66822a.m55283a();

    private C37088Xk3() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m76480b(OperatorFilterType operatorFilterType) {
        Intrinsics.checkNotNullParameter(operatorFilterType, "<this>");
        return f43787b.m6453i(operatorFilterType);
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m76479c(OperatorMapKind operatorMapKind) {
        Intrinsics.checkNotNullParameter(operatorMapKind, "<this>");
        return f43787b.m6453i(operatorMapKind);
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m76478d(List<OperatorFilterOption> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f43787b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: e */
    public static final List<OperatorFilterOption> m76477e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f43787b.m6460b(str, f43786a.m76481a());
    }

    @JvmStatic
    /* renamed from: f */
    public static final OperatorFilterType m76476f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (OperatorFilterType) f43787b.m6459c(str, Reflection.getOrCreateKotlinClass(OperatorFilterType.class));
    }

    @JvmStatic
    /* renamed from: g */
    public static final OperatorMapKind m76475g(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (OperatorMapKind) f43787b.m6459c(str, Reflection.getOrCreateKotlinClass(OperatorMapKind.class));
    }

    /* renamed from: a */
    public final Type m76481a() {
        return f43787b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(OperatorFilterOption.class));
    }
}
