package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u0003\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/User;", "", C17296a.f69688o, "Lco/bird/android/model/wire/WireBird;", DateTokenConverter.CONVERTER_KEY, "", "Lco/bird/android/model/AgreementRole;", "Ljava/util/List;", "c", "()Ljava/util/List;", "REQUIRED_RIDER_AGREEMENTS", "b", "REQUIRED_PRIVATE_BIRD_RIDER_AGREEMENTS", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: S55 */
/* loaded from: classes2.dex */
public final class S55 {

    /* renamed from: a */
    public static final List<AgreementRole> f33155a;

    /* renamed from: b */
    public static final List<AgreementRole> f33156b;

    static {
        List<AgreementRole> listOf;
        List<AgreementRole> listOf2;
        AgreementRole agreementRole = AgreementRole.RIDER;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AgreementRole[]{agreementRole, AgreementRole.PRELOAD, AgreementRole.MULTI_RIDE_HOST, AgreementRole.MULTI_RIDE_GUEST});
        f33155a = listOf;
        listOf2 = CollectionsKt__CollectionsJVMKt.listOf(agreementRole);
        f33156b = listOf2;
    }

    /* renamed from: a */
    public static final boolean m86020a(User user) {
        Intrinsics.checkNotNullParameter(user, "<this>");
        Boolean isCashPay = user.isCashPay();
        if (isCashPay != null) {
            return isCashPay.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public static final List<AgreementRole> m86019b() {
        return f33156b;
    }

    /* renamed from: c */
    public static final List<AgreementRole> m86018c() {
        return f33155a;
    }

    /* renamed from: d */
    public static final boolean m86017d(WireBird wireBird) {
        return (wireBird != null ? wireBird.getPrivateBird() : null) != null;
    }
}
