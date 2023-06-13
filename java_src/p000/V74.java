package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Link;
import co.bird.android.model.wire.WireCoupon;
import co.bird.android.model.wire.WireCouponDisplayView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\n\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH&J\u0016\u0010\u0014\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00030\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0017¨\u0006\""}, m28432d2 = {"LV74;", "", "Lio/reactivex/F;", "", "Lco/bird/android/model/wire/WireCoupon;", "i", "Lco/bird/android/model/Link;", "x", "", "v", "linkCode", "g", "", "w", "Lio/reactivex/c;", "f", "z", "couponId", "c", "coupons", "e", "LZ84;", "y", "()LZ84;", "", "r", "skipPreload", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "promoOffers", "h", "noBatteryCoupons", "Lco/bird/android/model/wire/WireCouponDisplayView;", DateTokenConverter.CONVERTER_KEY, "couponDisplayViews", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: V74 */
/* loaded from: classes2.dex */
public interface V74 {
    /* renamed from: C */
    Z84<List<WireCoupon>> mo27815C();

    /* renamed from: c */
    AbstractC23461c mo27800c(String str);

    /* renamed from: d */
    Z84<List<WireCouponDisplayView>> mo27798d();

    /* renamed from: e */
    void mo27797e(List<WireCoupon> list);

    /* renamed from: f */
    AbstractC23461c mo27795f();

    /* renamed from: g */
    AbstractC23442F<WireCoupon> mo27793g(String str);

    /* renamed from: h */
    Z84<List<WireCoupon>> mo27790h();

    /* renamed from: i */
    AbstractC23442F<List<WireCoupon>> mo27787i();

    /* renamed from: r */
    Z84<Boolean> mo27777r();

    /* renamed from: v */
    AbstractC23442F<String> mo27769v();

    /* renamed from: w */
    void mo27766w();

    /* renamed from: x */
    AbstractC23442F<Link> mo27765x();

    /* renamed from: y */
    Z84<List<WireCoupon>> mo27764y();

    /* renamed from: z */
    AbstractC23461c mo27763z();
}
