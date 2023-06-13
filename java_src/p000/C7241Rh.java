package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.HabitatType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0000¨\u0006\t"}, m28432d2 = {"LOh;", "", "f", "Lco/bird/android/model/constant/HabitatType;", "e", DateTokenConverter.CONVERTER_KEY, "c", C17296a.f69688o, "b", "build-config_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppBuildConfig+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBuildConfig+.kt\nco/bird/android/buildconfig/core/extension/AppBuildConfig_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
/* renamed from: Rh */
/* loaded from: classes2.dex */
public final class C7241Rh {
    /* renamed from: a */
    public static final String m86449a(InterfaceC6097Oh interfaceC6097Oh) {
        Intrinsics.checkNotNullParameter(interfaceC6097Oh, "<this>");
        String mo89929c = interfaceC6097Oh.mo89929c();
        return "market://details?id=" + mo89929c;
    }

    /* renamed from: b */
    public static final String m86448b(InterfaceC6097Oh interfaceC6097Oh) {
        Intrinsics.checkNotNullParameter(interfaceC6097Oh, "<this>");
        String mo89929c = interfaceC6097Oh.mo89929c();
        return "https://play.google.com/store/apps/details?id=" + mo89929c;
    }

    /* renamed from: c */
    public static final String m86447c(InterfaceC6097Oh interfaceC6097Oh) {
        Intrinsics.checkNotNullParameter(interfaceC6097Oh, "<this>");
        return HabitatType.BIRD.getHabitatId();
    }

    /* renamed from: d */
    public static final String m86446d(InterfaceC6097Oh interfaceC6097Oh) {
        boolean z;
        Intrinsics.checkNotNullParameter(interfaceC6097Oh, "<this>");
        HabitatType m86445e = m86445e(interfaceC6097Oh);
        if (m86445e != HabitatType.BIRD) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m86445e = null;
        }
        if (m86445e == null) {
            return null;
        }
        return m86445e.getHabitatId();
    }

    /* renamed from: e */
    public static final HabitatType m86445e(InterfaceC6097Oh interfaceC6097Oh) {
        Intrinsics.checkNotNullParameter(interfaceC6097Oh, "<this>");
        if (Intrinsics.areEqual(interfaceC6097Oh.mo89926f(), "circ")) {
            return HabitatType.CIRC;
        }
        return HabitatType.BIRD;
    }

    /* renamed from: f */
    public static final String m86444f(InterfaceC6097Oh interfaceC6097Oh) {
        Intrinsics.checkNotNullParameter(interfaceC6097Oh, "<this>");
        return null;
    }
}
