package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.ScanlessRideItem;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, m28432d2 = {"LBl5;", "", "Lco/bird/android/model/ScanlessRideItem;", "scanlessRideItem", "", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireBird;", "bird", "c", "LZ84;", "", "e", "()LZ84;", "availableScanlessRideVehicles", "Lco/bird/android/buava/Optional;", "b", "currentScanlessRideRequest", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Bl5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC31951Bl5 {
    /* renamed from: a */
    void mo89856a(ScanlessRideItem scanlessRideItem);

    /* renamed from: b */
    Z84<Optional<ScanlessRideItem>> mo89855b();

    /* renamed from: c */
    void mo89854c(WireBird wireBird);

    /* renamed from: d */
    void mo89853d();

    /* renamed from: e */
    Z84<List<ScanlessRideItem>> mo89852e();
}
