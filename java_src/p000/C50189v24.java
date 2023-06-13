package p000;

import android.location.Location;
import co.bird.android.model.VehiclePricingDetails;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Lv24;", "Lu24;", "Landroid/location/Location;", "location", "", "radius", "Lio/reactivex/F;", "Lco/bird/android/model/VehiclePricingDetails;", C17296a.f69688o, "(Landroid/location/Location;Ljava/lang/Double;)Lio/reactivex/F;", "Lt24;", "Lt24;", "pricingClient", "<init>", "(Lt24;)V", "pricing_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: v24  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50189v24 implements InterfaceC49597u24 {

    /* renamed from: a */
    public final InterfaceC49004t24 f113424a;

    public C50189v24(InterfaceC49004t24 pricingClient) {
        Intrinsics.checkNotNullParameter(pricingClient, "pricingClient");
        this.f113424a = pricingClient;
    }

    @Override // p000.InterfaceC49597u24
    /* renamed from: a */
    public AbstractC23442F<VehiclePricingDetails> mo9281a(Location location, Double d) {
        return this.f113424a.m13202a(location != null ? Double.valueOf(location.getLatitude()) : null, location != null ? Double.valueOf(location.getLongitude()) : null, d);
    }
}
