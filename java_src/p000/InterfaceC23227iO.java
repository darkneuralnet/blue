package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireMerchantSite;
import com.adyen.checkout.components.model.payments.response.QrCodeAction;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0013J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\nH&J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0012\u001a\u00020\rH&J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0002H&J\"\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H&J7\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00100\u000f2\u0006\u0010!\u001a\u00020\rH&R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0)0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010'¨\u0006,"}, m28432d2 = {"LiO;", "", "", "latitude", "longitude", "radius", "Lio/reactivex/c;", "g", "Lco/bird/android/model/wire/WireMerchantSite;", "merchantSite", "", DateTokenConverter.CONVERTER_KEY, "b", "", "merchantSiteId", "Lio/reactivex/F;", "LHM4;", "i", "id", C17296a.f69688o, "Landroid/location/Location;", "location", "j", "LiO$a;", "type", "threshold", "c", "", "amount", "tip", "LuL3;", "h", "(Ljava/lang/String;ILjava/lang/Integer;)Lio/reactivex/F;", QrCodeAction.ACTION_TYPE, "LbT2;", "k", "LZ84;", "Lco/bird/android/buava/Optional;", "e", "()LZ84;", "currentMerchantSite", "", "f", "nearbyMerchants", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iO */
/* loaded from: classes2.dex */
public interface InterfaceC23227iO {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"LiO$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: iO$a */
    /* loaded from: classes2.dex */
    public enum EnumC23228a {
        BANNER,
        PIN
    }

    /* renamed from: a */
    AbstractC23442F<WireMerchantSite> mo27366a(String str);

    /* renamed from: b */
    void mo27365b();

    /* renamed from: c */
    WireMerchantSite mo27364c(Location location, EnumC23228a enumC23228a, double d);

    /* renamed from: d */
    void mo27363d(WireMerchantSite wireMerchantSite);

    /* renamed from: e */
    Z84<Optional<WireMerchantSite>> mo27362e();

    /* renamed from: f */
    Z84<List<WireMerchantSite>> mo27361f();

    /* renamed from: g */
    AbstractC23461c mo27360g(double d, double d2, double d3);

    /* renamed from: h */
    AbstractC23442F<HM4<C49775uL3>> mo27359h(String str, int i, Integer num);

    /* renamed from: i */
    AbstractC23442F<HM4<WireMerchantSite>> mo27358i(String str);

    /* renamed from: j */
    WireMerchantSite mo27357j(Location location, double d);

    /* renamed from: k */
    AbstractC23442F<HM4<C38563bT2>> mo27356k(String str);
}
