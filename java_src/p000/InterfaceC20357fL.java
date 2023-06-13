package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.DeviceVerificationMethod;
import co.bird.api.response.DeviceCheckSendResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u0011"}, m28432d2 = {"LfL;", "", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", C17296a.f69688o, "Lio/reactivex/Observable;", "", "b", "", "c", "()Ljava/lang/Double;", "Lco/bird/android/model/constant/DeviceVerificationMethod;", "deviceVerificationMethod", "Lio/reactivex/F;", "Lco/bird/api/response/DeviceCheckSendResponse;", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fL */
/* loaded from: classes2.dex */
public interface InterfaceC20357fL {
    /* renamed from: a */
    void mo21338a(String str);

    /* renamed from: b */
    Observable<Boolean> mo21337b();

    /* renamed from: c */
    Double mo21336c();

    /* renamed from: d */
    AbstractC23442F<DeviceCheckSendResponse> mo21335d(DeviceVerificationMethod deviceVerificationMethod);
}
