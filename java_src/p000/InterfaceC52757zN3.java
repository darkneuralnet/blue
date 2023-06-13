package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.PaymentInfo;
import co.bird.android.model.constant.PaymentMethod;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m28432d2 = {"LzN3;", "", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/BirdPayment;", "b", "", "onlyPostPay", "Lco/bird/android/model/constant/PaymentMethod;", "e", "LZ84;", "Lco/bird/android/buava/Optional;", C17296a.f69688o, "()LZ84;", "defaultPaymentMethod", "Lco/bird/android/model/PaymentInfo;", DateTokenConverter.CONVERTER_KEY, "defaultPaymentInfo", "", "c", "()Ljava/util/Set;", "bankRedirectPaymentMethods", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: zN3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC52757zN3 {
    /* renamed from: a */
    Z84<Optional<BirdPayment>> mo1484a();

    /* renamed from: b */
    Observable<List<BirdPayment>> mo1483b();

    /* renamed from: c */
    Set<PaymentMethod> mo1482c();

    /* renamed from: d */
    Z84<Optional<PaymentInfo>> mo1481d();

    /* renamed from: e */
    Observable<List<PaymentMethod>> mo1480e(boolean z);
}
