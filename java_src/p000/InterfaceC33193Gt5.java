package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Warehouse;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002H&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nH&JU\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u001b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00022\u0006\u0010\u001e\u001a\u00020\u0007H&¨\u0006 "}, m28432d2 = {"LGt5;", "", "Lio/reactivex/F;", "LHM4;", "", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "f", "", "birdId", "b", "Lco/bird/android/model/wire/WireLocation;", "location", "Lco/bird/android/model/Warehouse;", "e", "Lco/bird/android/model/constant/ServiceCenterStatus;", "status", "Lco/bird/android/model/wire/WireBird;", "bird", "notes", "sessionId", "LbH;", "mode", "", "numberInBulk", "", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/constant/ServiceCenterStatus;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;LbH;Ljava/lang/Integer;)Lio/reactivex/F;", "Lco/bird/android/model/persistence/Bird;", "c", "(Lco/bird/android/model/constant/ServiceCenterStatus;Lco/bird/android/model/persistence/Bird;Ljava/lang/String;Ljava/lang/String;LbH;Ljava/lang/Integer;)Lio/reactivex/F;", "warehouseId", C17296a.f69688o, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gt5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC33193Gt5 {
    /* renamed from: a */
    AbstractC23442F<HM4<Warehouse>> mo94633a(String str);

    /* renamed from: b */
    AbstractC23442F<HM4<WireServiceCenterStatus>> mo94632b(String str);

    /* renamed from: c */
    AbstractC23442F<HM4<Unit>> mo94631c(ServiceCenterStatus serviceCenterStatus, Bird bird, String str, String str2, EnumC12346bH enumC12346bH, Integer num);

    /* renamed from: d */
    AbstractC23442F<HM4<Unit>> mo94630d(ServiceCenterStatus serviceCenterStatus, WireBird wireBird, String str, String str2, EnumC12346bH enumC12346bH, Integer num);

    /* renamed from: e */
    AbstractC23442F<HM4<List<Warehouse>>> mo94629e(WireLocation wireLocation);

    /* renamed from: f */
    AbstractC23442F<HM4<List<WireServiceCenterStatus>>> mo94628f();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gt5$a */
    /* loaded from: classes2.dex */
    public static final class C2969a {
        public static /* synthetic */ AbstractC23442F addEvent$default(InterfaceC33193Gt5 interfaceC33193Gt5, ServiceCenterStatus serviceCenterStatus, WireBird wireBird, String str, String str2, EnumC12346bH enumC12346bH, Integer num, int i, Object obj) {
            String str3;
            if (obj == null) {
                String str4 = (i & 4) != 0 ? null : str;
                if ((i & 8) != 0) {
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                    str3 = uuid;
                } else {
                    str3 = str2;
                }
                return interfaceC33193Gt5.mo94630d(serviceCenterStatus, wireBird, str4, str3, enumC12346bH, (i & 32) != 0 ? null : num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEvent");
        }

        public static /* synthetic */ AbstractC23442F addEvent$default(InterfaceC33193Gt5 interfaceC33193Gt5, ServiceCenterStatus serviceCenterStatus, Bird bird, String str, String str2, EnumC12346bH enumC12346bH, Integer num, int i, Object obj) {
            String str3;
            if (obj == null) {
                String str4 = (i & 4) != 0 ? null : str;
                if ((i & 8) != 0) {
                    String uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                    str3 = uuid;
                } else {
                    str3 = str2;
                }
                return interfaceC33193Gt5.mo94631c(serviceCenterStatus, bird, str4, str3, enumC12346bH, (i & 32) != 0 ? null : num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEvent");
        }
    }
}
