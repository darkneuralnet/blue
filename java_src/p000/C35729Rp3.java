package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.nestedstructures.OperatorOrderViewDetail;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0004H\u0007J\f\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0007J\f\u0010\t\u001a\u00020\u0007*\u00020\u0004H\u0007R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LRp3;", "", "", "Lco/bird/android/model/persistence/nestedstructures/OperatorOrderViewDetail;", "", "c", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/constant/OperatorOrderViewType;", "b", "e", "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "detailListToken", "<init>", "()V", "co.bird.android.lib.persistence.operator-order-view.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rp3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35729Rp3 {

    /* renamed from: a */
    public static final C35729Rp3 f32707a = new C35729Rp3();

    /* renamed from: b */
    public static final C51174wi2 f32708b = Converters.f66822a.m55283a();

    private C35729Rp3() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m86281b(OperatorOrderViewType operatorOrderViewType) {
        Intrinsics.checkNotNullParameter(operatorOrderViewType, "<this>");
        return f32708b.m6453i(operatorOrderViewType);
    }

    @JvmStatic
    /* renamed from: c */
    public static final String m86280c(List<OperatorOrderViewDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f32708b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: d */
    public static final List<OperatorOrderViewDetail> m86279d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f32708b.m6460b(str, f32707a.m86282a());
    }

    @JvmStatic
    /* renamed from: e */
    public static final OperatorOrderViewType m86278e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (OperatorOrderViewType) f32708b.m6460b(str, OperatorOrderViewType.class);
    }

    /* renamed from: a */
    public final Type m86282a() {
        return f32708b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(OperatorOrderViewDetail.class));
    }
}
