package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.wire.WireHydratedRoute;
import co.bird.android.model.wire.WireRoute;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J*\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH&J\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0011"}, m28432d2 = {"Ltc5;", "", "", "birdId", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/wire/WireRoute;", "c", "Lco/bird/android/model/constant/ServiceCenterRoute;", "currentRoute", "", C17296a.f69688o, "route", "e", "Lco/bird/android/model/wire/WireHydratedRoute;", "b", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tc5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC49339tc5 {
    /* renamed from: a */
    AbstractC23442F<HM4<List<WireRoute>>> mo9967a(String str, ServiceCenterRoute serviceCenterRoute);

    /* renamed from: b */
    AbstractC23442F<HM4<List<WireHydratedRoute>>> mo9966b(String str);

    /* renamed from: c */
    AbstractC23442F<HM4<WireRoute>> mo9965c(String str);

    /* renamed from: d */
    AbstractC23442F<HM4<WireRoute>> mo9964d(String str);

    /* renamed from: e */
    AbstractC23442F<HM4<WireRoute>> mo9963e(String str, ServiceCenterRoute serviceCenterRoute);
}
