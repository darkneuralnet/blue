package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.itemlease.ItemLease;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.LeaseTypeConfig;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p000.C39065cJ1;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u001a\u0012\u0010\n\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u0011\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u001a\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b*\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¨\u0006\u0016"}, m28432d2 = {"LcJ1$b;", "Lco/bird/android/model/itemlease/ItemLease;", "itemLease", "", "g", "c", "b", "LBx;", "", "metadata", "f", "e", "Lco/bird/android/model/User;", "Lgl;", "appPreference", "LOh;", "appBuildConfig", C17296a.f69688o, "LTq4;", "Lco/bird/android/model/wire/WireBird;", "bird", DateTokenConverter.CONVERTER_KEY, "co.bird.android.feature.item-lease"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nco/bird/android/feature/itemlease/ExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1747#2,3:91\n1747#2,3:94\n1747#2,3:97\n1747#2,3:100\n1#3:103\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nco/bird/android/feature/itemlease/ExtensionsKt\n*L\n24#1:91,3\n31#1:94,3\n40#1:97,3\n50#1:100,3\n*E\n"})
/* renamed from: Ki1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34026Ki1 {
    /* renamed from: a */
    public static final boolean m98492a(User user, C22454gl appPreference, InterfaceC6097Oh appBuildConfig) {
        boolean z;
        Intrinsics.checkNotNullParameter(user, "<this>");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        EnumC49958uf1 m37699O = appPreference.m37699O();
        if (user.getAdmin() && UserKt.isAdminDomain(user)) {
            z = true;
        } else {
            z = false;
        }
        if (z || user.getTester() || appBuildConfig.mo89921k() || m37699O != EnumC49958uf1.f112718k) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m98491b(C39065cJ1.C13488b c13488b) {
        boolean z;
        boolean startsWith;
        Intrinsics.checkNotNullParameter(c13488b, "<this>");
        List<C0774Bx> m61594b = c13488b.m61594b();
        if ((m61594b instanceof Collection) && m61594b.isEmpty()) {
            return false;
        }
        for (C0774Bx c0774Bx : m61594b) {
            String rawValue = c0774Bx.m113296e();
            if (rawValue != null) {
                Intrinsics.checkNotNullExpressionValue(rawValue, "rawValue");
                startsWith = StringsKt__StringsJVMKt.startsWith(rawValue, "http", true);
                if (startsWith) {
                    z = true;
                    continue;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            continue;
            if (z) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r0 != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m98490c(C39065cJ1.C13488b c13488b) {
        boolean z;
        boolean startsWith;
        boolean z2;
        boolean contains;
        boolean contains2;
        Intrinsics.checkNotNullParameter(c13488b, "<this>");
        List<C0774Bx> m61594b = c13488b.m61594b();
        if ((m61594b instanceof Collection) && m61594b.isEmpty()) {
            return false;
        }
        for (C0774Bx c0774Bx : m61594b) {
            String it = c0774Bx.m113296e();
            if (it != null) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                startsWith = StringsKt__StringsJVMKt.startsWith(it, "http", true);
                if (startsWith) {
                    contains = StringsKt__StringsKt.contains((CharSequence) it, (CharSequence) "l.bird.co", true);
                    if (!contains) {
                        contains2 = StringsKt__StringsKt.contains((CharSequence) it, (CharSequence) "h.bird.co", true);
                    }
                    z2 = true;
                    if (z2) {
                        z = true;
                        continue;
                        if (z) {
                            return true;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            z = false;
            continue;
            if (z) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final String m98489d(C36207Tq4 c36207Tq4, WireBird wireBird) {
        Intrinsics.checkNotNullParameter(c36207Tq4, "<this>");
        LeaseTypeConfig helmet = C36441Uq4.m80769c(c36207Tq4, wireBird).getLeaseConfig().getLeaseTypes().getHelmet();
        if (helmet.getDelinquentFeeAmount() < 1) {
            return null;
        }
        return C51916xx1.f118396a.m4408d(helmet.getDelinquentFeeAmount(), C45097mS5.m25591o(C36441Uq4.m80769c(c36207Tq4, wireBird).getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
    }

    /* renamed from: e */
    public static final boolean m98488e(C0774Bx c0774Bx, ItemLease itemLease) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(c0774Bx, "<this>");
        Intrinsics.checkNotNullParameter(itemLease, "itemLease");
        String helmet = itemLease.getMetadata().getHelmet();
        if (helmet != null) {
            z = m98487f(c0774Bx, helmet);
        } else {
            z = false;
        }
        if (!z) {
            String physicalLockSticker = itemLease.getMetadata().getPhysicalLockSticker();
            if (physicalLockSticker != null) {
                z2 = m98487f(c0774Bx, physicalLockSticker);
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m98487f(C0774Bx c0774Bx, String metadata) {
        boolean contains;
        Intrinsics.checkNotNullParameter(c0774Bx, "<this>");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        String m113296e = c0774Bx.m113296e();
        if (m113296e != null) {
            contains = StringsKt__StringsKt.contains((CharSequence) m113296e, (CharSequence) metadata, true);
            return contains;
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m98486g(C39065cJ1.C13488b c13488b, ItemLease itemLease) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(c13488b, "<this>");
        Intrinsics.checkNotNullParameter(itemLease, "itemLease");
        if (itemLease.getMetadata().getHelmet() == null && itemLease.getMetadata().getPhysicalLockSticker() == null) {
            return false;
        }
        String helmet = itemLease.getMetadata().getHelmet();
        if (helmet != null) {
            List<C0774Bx> m61594b = c13488b.m61594b();
            if (!(m61594b instanceof Collection) || !m61594b.isEmpty()) {
                for (C0774Bx c0774Bx : m61594b) {
                    if (m98487f(c0774Bx, helmet)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
        } else {
            z = true;
            break;
        }
        String physicalLockSticker = itemLease.getMetadata().getPhysicalLockSticker();
        if (physicalLockSticker != null) {
            List<C0774Bx> m61594b2 = c13488b.m61594b();
            if (!(m61594b2 instanceof Collection) || !m61594b2.isEmpty()) {
                for (C0774Bx c0774Bx2 : m61594b2) {
                    if (m98487f(c0774Bx2, physicalLockSticker)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = true;
            break;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String rentalFineFeeString$default(C36207Tq4 c36207Tq4, WireBird wireBird, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = null;
        }
        return m98489d(c36207Tq4, wireBird);
    }
}
