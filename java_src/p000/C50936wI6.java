package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentCappedReservationGroup;
import co.bird.android.model.persistence.nestedstructures.ZoneAssignmentReleaseAssignment;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\u00020\u0004H\u0007J\u0012\u0010\b\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007J\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002*\u00020\u0004H\u0007R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"LwI6;", "", "", "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentReleaseAssignment;", "", DateTokenConverter.CONVERTER_KEY, "f", "Lco/bird/android/model/persistence/nestedstructures/ZoneAssignmentCappedReservationGroup;", C17296a.f69688o, "e", "Lwi2;", "b", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", "c", "()Ljava/lang/reflect/Type;", "zoneReleaseAssignmentType", "cappedReservationGroupType", "<init>", "()V", "co.bird.android.lib.persistence.release-assignment.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wI6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50936wI6 {

    /* renamed from: a */
    public static final C50936wI6 f115780a = new C50936wI6();

    /* renamed from: b */
    public static final C51174wi2 f115781b = Converters.f66822a.m55283a();

    private C50936wI6() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m7028a(List<ZoneAssignmentCappedReservationGroup> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f115781b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: d */
    public static final String m7025d(List<ZoneAssignmentReleaseAssignment> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return f115781b.m6453i(list);
    }

    @JvmStatic
    /* renamed from: e */
    public static final List<ZoneAssignmentCappedReservationGroup> m7024e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f115781b.m6460b(str, f115780a.m7027b());
    }

    @JvmStatic
    /* renamed from: f */
    public static final List<ZoneAssignmentReleaseAssignment> m7023f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (List) f115781b.m6460b(str, f115780a.m7026c());
    }

    /* renamed from: b */
    public final Type m7027b() {
        return f115781b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(ZoneAssignmentCappedReservationGroup.class));
    }

    /* renamed from: c */
    public final Type m7026c() {
        return f115781b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(ZoneAssignmentReleaseAssignment.class));
    }
}
