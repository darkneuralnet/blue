package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import co.bird.android.model.persistence.nestedstructures.TutorialPage;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u001c\u0010\u0010\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0011\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LQv0;", "", "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;", "", C17296a.f69688o, "c", "", "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;", "b", DateTokenConverter.CONVERTER_KEY, "Lwi2;", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "Ljava/lang/reflect/Type;", "tutorialPageTypeToken", "stringListToken", "<init>", "()V", "co.bird.android.lib.persistence.configurable-tutorial.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConfigurableTutorialConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurableTutorialConverters.kt\nco/bird/android/persistence/announcements/converters/ConfigurableTutorialConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* renamed from: Qv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35546Qv0 {

    /* renamed from: a */
    public static final C35546Qv0 f31222a = new C35546Qv0();

    /* renamed from: b */
    public static final C51174wi2 f31223b = Converters.f66822a.m55283a();

    /* renamed from: c */
    public static final Type f31224c = new C7002a().getType();

    /* renamed from: d */
    public static final Type f31225d = C32798Fb6.getParameterized(List.class, String.class).getType();

    @Metadata(m28433d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"Qv0$a", "LFb6;", "", "Lco/bird/android/model/persistence/nestedstructures/TutorialPage;", "co.bird.android.lib.persistence.configurable-tutorial.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Qv0$a */
    /* loaded from: classes4.dex */
    public static final class C7002a extends C32798Fb6<List<? extends TutorialPage>> {
    }

    private C35546Qv0() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m87579a(LegacyAsset legacyAsset) {
        if (legacyAsset != null) {
            return f31223b.m6453i(legacyAsset);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m87578b(List<TutorialPage> list) {
        if (list != null) {
            return f31223b.m6453i(list);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: c */
    public static final LegacyAsset m87577c(String str) {
        if (str != null) {
            return (LegacyAsset) f31223b.m6459c(str, Reflection.getOrCreateKotlinClass(LegacyAsset.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final List<TutorialPage> m87576d(String str) {
        if (str != null) {
            C51174wi2 c51174wi2 = f31223b;
            Type tutorialPageTypeToken = f31224c;
            Intrinsics.checkNotNullExpressionValue(tutorialPageTypeToken, "tutorialPageTypeToken");
            return (List) c51174wi2.m6460b(str, tutorialPageTypeToken);
        }
        return null;
    }
}
