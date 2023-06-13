package p000;

import co.bird.android.model.constant.DeserializerKind;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.module.kotlin.ExtensionsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"LwB0;", "", "<init>", "()V", C17296a.f69688o, "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wB0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50867wB0 {

    /* renamed from: a */
    public static final C29793a f115448a = new C29793a(null);

    /* renamed from: b */
    public static final C51174wi2 f115449b;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\"\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004H\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, m28432d2 = {"LwB0$a;", "", "", "value", "", "b", "properties", C17296a.f69688o, "Lwi2;", "deserializer", "Lwi2;", "<init>", "()V", "analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Converters.kt\nco/bird/android/manager/analytics/persistence/Converters$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
    /* renamed from: wB0$a */
    /* loaded from: classes4.dex */
    public static final class C29793a {
        public /* synthetic */ C29793a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final String m7312a(Map<String, ? extends Object> map) {
            if (map != null) {
                return C50867wB0.f115449b.m6453i(map);
            }
            return null;
        }

        @JvmStatic
        /* renamed from: b */
        public final Map<String, Object> m7311b(String str) {
            if (str != null) {
                return (Map) C50867wB0.f115449b.m6460b(str, C50867wB0.f115449b.m6461a(Reflection.getOrCreateKotlinClass(Map.class), Reflection.getOrCreateKotlinClass(String.class), Reflection.getOrCreateKotlinClass(Object.class)));
            }
            return null;
        }

        private C29793a() {
        }
    }

    static {
        Map mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(DeserializerKind.GSON, new C47932rE1(new C46153oE1())), TuplesKt.m28425to(DeserializerKind.JACKSON, new C48201rh2(ExtensionsKt.jacksonObjectMapper())));
        f115449b = new C51174wi2(mapOf);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m7314a(Map<String, ? extends Object> map) {
        return f115448a.m7312a(map);
    }

    @JvmStatic
    /* renamed from: b */
    public static final Map<String, Object> m7313b(String str) {
        return f115448a.m7311b(str);
    }
}
