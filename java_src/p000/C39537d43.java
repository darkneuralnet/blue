package p000;

import co.bird.android.model.persistence.nestedstructures.NestAvailableSpaceDetail;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Ld43;", "", "", "Lco/bird/android/model/persistence/nestedstructures/NestAvailableSpaceDetail;", "", "b", "c", "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", C17296a.f69688o, "()Ljava/lang/reflect/Type;", "nestAvailableDetailsListType", "<init>", "()V", "co.bird.android.lib.persistence.nestmarker.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: d43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39537d43 {

    /* renamed from: a */
    public static final C39537d43 f76097a = new C39537d43();

    /* renamed from: b */
    public static final C51174wi2 f76098b = Converters.f66822a.m55283a();

    private C39537d43() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m44644b(List<NestAvailableSpaceDetail> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f76098b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: c */
    public static final List<NestAvailableSpaceDetail> m44643c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f76098b.m6460b(str, f76097a.m44645a());
    }

    /* renamed from: a */
    public final Type m44645a() {
        return f76098b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(NestAvailableSpaceDetail.class));
    }
}
