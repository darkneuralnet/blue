package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetHeader;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetMapButtonOverrides;
import co.bird.android.model.persistence.nestedstructures.BountyFlightSheetSection;
import co.bird.android.persistence.common.impl.Converters;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u0016\u0010\t\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006*\u0004\u0018\u00010\u0003H\u0007J\u001d\u0010\f\u001a\u0004\u0018\u00010\u0003*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LA00;", "", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetHeader;", "", "f", "c", "", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;", "e", "g", "Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetMapButtonOverrides;", DateTokenConverter.CONVERTER_KEY, "h", "(Ljava/util/List;)Ljava/lang/String;", "Lwi2;", "b", "Lwi2;", "deserializer", "Ljava/lang/reflect/Type;", "()Ljava/lang/reflect/Type;", "sectionListToken", C17296a.f69688o, "mapButtonOverridesListToken", "<init>", "()V", "co.bird.android.lib.persistence.bounty-flight-sheet.impl"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyConverters.kt\nco/bird/android/persistence/bountyflightsheet/impl/converters/BountyConverters\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
/* renamed from: A00 */
/* loaded from: classes4.dex */
public final class A00 {

    /* renamed from: a */
    public static final A00 f0a = new A00();

    /* renamed from: b */
    public static final C51174wi2 f1b = Converters.f66822a.m55283a();

    private A00() {
    }

    @JvmStatic
    /* renamed from: c */
    public static final BountyFlightSheetHeader m116210c(String str) {
        if (str != null) {
            return (BountyFlightSheetHeader) f1b.m6459c(str, Reflection.getOrCreateKotlinClass(BountyFlightSheetHeader.class));
        }
        return null;
    }

    @JvmStatic
    /* renamed from: d */
    public static final List<BountyFlightSheetMapButtonOverrides> m116209d(String str) {
        if (str != null) {
            return (List) f1b.m6460b(str, f0a.m116212a());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: e */
    public static final List<BountyFlightSheetSection> m116208e(String str) {
        if (str != null) {
            return (List) f1b.m6460b(str, f0a.m116211b());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: f */
    public static final String m116207f(BountyFlightSheetHeader bountyFlightSheetHeader) {
        if (bountyFlightSheetHeader != null) {
            return f1b.m6453i(bountyFlightSheetHeader);
        }
        return null;
    }

    @JvmStatic
    /* renamed from: g */
    public static final String m116206g(List<BountyFlightSheetSection> list) {
        if (list != null) {
            return f1b.m6453i(list);
        }
        return null;
    }

    @JvmStatic
    @JvmName(name = "toJsonBountyFlightSheetMapButtonOverrides")
    /* renamed from: h */
    public static final String m116205h(List<BountyFlightSheetMapButtonOverrides> list) {
        if (list != null) {
            return f1b.m6453i(list);
        }
        return null;
    }

    /* renamed from: a */
    public final Type m116212a() {
        return f1b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(BountyFlightSheetMapButtonOverrides.class));
    }

    /* renamed from: b */
    public final Type m116211b() {
        return f1b.m6461a(Reflection.getOrCreateKotlinClass(List.class), Reflection.getOrCreateKotlinClass(BountyFlightSheetSection.class));
    }
}
