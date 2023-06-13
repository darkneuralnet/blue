package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Listing;
import co.bird.android.model.wire.WireLocation;
import co.bird.android.model.wire.WireMerchantDescription;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WireMerchantTransaction;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\bH&J,\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000bH&J,\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e0\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H&R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170$0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001eR\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R&\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001b0\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001e¨\u0006-"}, m28432d2 = {"LaS2;", "", "", "merchantId", "storeId", "Lco/bird/android/model/Listing;", "Lco/bird/android/model/wire/WireMerchantTransaction;", "i", "", "b", "merchantSiteId", "", "open", "Lio/reactivex/F;", "LHM4;", "e", "siteId", "enabled", "Lio/reactivex/c;", "g", "Lco/bird/android/model/wire/WireLocation;", "location", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireMerchantSite;", "store", "f", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantDescription;", "h", "()Lio/reactivex/Observable;", "merchant", "j", "isMerchant", "c", "currentStore", "", "k", "sites", "", "l", "()I", "storeCount", C17296a.f69688o, "merchantTransactionListing", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aS2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC37961aS2 {
    /* renamed from: a */
    Observable<Optional<Listing<WireMerchantTransaction>>> mo12346a();

    /* renamed from: b */
    void mo12345b();

    /* renamed from: c */
    Observable<Optional<WireMerchantSite>> mo12344c();

    /* renamed from: d */
    AbstractC23442F<HM4<Object>> mo12343d(String str, String str2, WireLocation wireLocation);

    /* renamed from: e */
    AbstractC23442F<HM4<Object>> mo12342e(String str, String str2, boolean z);

    /* renamed from: f */
    void mo12341f(WireMerchantSite wireMerchantSite);

    /* renamed from: g */
    AbstractC23461c mo12340g(String str, String str2, boolean z);

    /* renamed from: h */
    Observable<Optional<WireMerchantDescription>> mo12339h();

    /* renamed from: i */
    Listing<WireMerchantTransaction> mo12338i(String str, String str2);

    /* renamed from: j */
    Observable<Boolean> mo12337j();

    /* renamed from: k */
    Observable<List<WireMerchantSite>> mo12336k();

    /* renamed from: l */
    int mo12335l();
}
