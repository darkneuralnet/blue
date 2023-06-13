package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.offer.WireCouponDeal;
import co.bird.android.model.offer.WireCouponOffer;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&R \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"Lue3;", "", "Lio/reactivex/c;", "c", "", "id", "b", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/offer/WireCouponOffer;", C17296a.f69688o, "()Lio/reactivex/Observable;", "offers", "Lco/bird/android/model/offer/WireCouponDeal;", DateTokenConverter.CONVERTER_KEY, "deals", "co.bird.android.manager.offer.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ue3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC49950ue3 {
    /* renamed from: a */
    Observable<List<WireCouponOffer>> mo3141a();

    /* renamed from: b */
    AbstractC23461c mo3140b(String str);

    /* renamed from: c */
    AbstractC23461c mo3139c();

    /* renamed from: d */
    Observable<List<WireCouponDeal>> mo3138d();
}
