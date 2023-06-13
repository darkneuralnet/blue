package p000;

import co.bird.android.model.wire.WireNestPhoto;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0007H&J\u0019\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u0012"}, m28432d2 = {"LP23;", "", "", "Lco/bird/android/model/wire/WireNestPhoto;", "photos", "", "Xc", "", "name", "setName", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "", "availableParking", "yh", "(Ljava/lang/Integer;)V", "notes", "f5", "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: P23 */
/* loaded from: classes3.dex */
public interface P23 {
    /* renamed from: Xc */
    void mo89087Xc(List<WireNestPhoto> list);

    /* renamed from: f5 */
    void mo89086f5(String str);

    void setAddress(String str);

    void setName(String str);

    /* renamed from: yh */
    void mo89085yh(Integer num);
}
