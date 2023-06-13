package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.AnnouncementContentType;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.AnnouncementDisplayType;
import co.bird.android.model.persistence.nestedstructures.AnnouncementContextParameters;
import co.bird.android.model.persistence.nestedstructures.AnnouncementPage;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0003H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\f\u0010\n\u001a\u00020\u0003*\u00020\tH\u0007J\f\u0010\u000b\u001a\u00020\t*\u00020\u0003H\u0007J\f\u0010\r\u001a\u00020\u0003*\u00020\fH\u0007J\f\u0010\u000e\u001a\u00020\f*\u00020\u0003H\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0007J\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Ldg;", "", "Lco/bird/android/model/constant/AnnouncementContext;", "", "g", "b", "Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;", "i", "c", "Lco/bird/android/model/constant/AnnouncementDisplayType;", "h", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/constant/AnnouncementContentType;", "f", C17296a.f69688o, "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "j", "l", "", "Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;", "k", "e", "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "Ljava/lang/reflect/Type;", "announcementPageTypeToken", "<init>", "()V", "co.bird.android.lib.persistence.announcements.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnouncementConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementConverters.kt\nco/bird/android/persistence/announcements/converters/AnnouncementConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
/* renamed from: dg */
/* loaded from: classes4.dex */
public final class C19837dg {

    /* renamed from: a */
    public static final C19837dg f77020a = new C19837dg();

    /* renamed from: b */
    public static final C51174wi2 f77021b = Converters.f66822a.m55283a();

    /* renamed from: c */
    public static final Type f77022c = new C19838a().getType();

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"dg$a", "LFb6;", "", "Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;", "co.bird.android.lib.persistence.announcements.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: dg$a */
    /* loaded from: classes4.dex */
    public static final class C19838a extends C32798Fb6<List<? extends AnnouncementPage>> {
    }

    private C19837dg() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final AnnouncementContentType m43921a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return AnnouncementContentType.Companion.fromString(str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final AnnouncementContext m43920b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return AnnouncementContext.Companion.fromString(str);
    }

    @JvmStatic
    /* renamed from: c */
    public static final AnnouncementContextParameters m43919c(String str) {
        if (str != null) {
            return (AnnouncementContextParameters) f77021b.m6459c(str, Reflection.getOrCreateKotlinClass(AnnouncementContextParameters.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final AnnouncementDisplayType m43918d(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return AnnouncementDisplayType.Companion.fromString(str);
    }

    @JvmStatic
    /* renamed from: e */
    public static final List<AnnouncementPage> m43917e(String str) {
        if (str != null) {
            C51174wi2 c51174wi2 = f77021b;
            Type announcementPageTypeToken = f77022c;
            Intrinsics.checkNotNullExpressionValue(announcementPageTypeToken, "announcementPageTypeToken");
            return (List) c51174wi2.m6460b(str, announcementPageTypeToken);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final String m43916f(AnnouncementContentType announcementContentType) {
        Intrinsics.checkNotNullParameter(announcementContentType, "<this>");
        return announcementContentType.toString();
    }

    @JvmStatic
    /* renamed from: g */
    public static final String m43915g(AnnouncementContext announcementContext) {
        Intrinsics.checkNotNullParameter(announcementContext, "<this>");
        return announcementContext.toString();
    }

    @JvmStatic
    /* renamed from: h */
    public static final String m43914h(AnnouncementDisplayType announcementDisplayType) {
        Intrinsics.checkNotNullParameter(announcementDisplayType, "<this>");
        return announcementDisplayType.toString();
    }

    @JvmStatic
    /* renamed from: i */
    public static final String m43913i(AnnouncementContextParameters announcementContextParameters) {
        if (announcementContextParameters != null) {
            return f77021b.m6453i(announcementContextParameters);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: j */
    public static final String m43912j(LegacyAsset legacyAsset) {
        if (legacyAsset != null) {
            return f77021b.m6453i(legacyAsset);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: k */
    public static final String m43911k(List<AnnouncementPage> list) {
        if (list != null) {
            return f77021b.m6453i(list);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: l */
    public static final LegacyAsset m43910l(String str) {
        if (str != null) {
            return (LegacyAsset) f77021b.m6459c(str, Reflection.getOrCreateKotlinClass(LegacyAsset.class));
        }
        return null;
    }
}
