package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Deal;
import co.bird.api.request.DealAcknowledgmentState;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J(\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH&R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m28432d2 = {"LJT0;", "", "Lco/bird/android/model/Deal;", "deal", "", "f", "dealSeen", "g", "Lco/bird/api/request/DealAcknowledgmentState;", TransferTable.COLUMN_STATE, "Lio/reactivex/F;", "LHM4;", DateTokenConverter.CONVERTER_KEY, "", "stripePaymentSource", "c", "LZ84;", "Lco/bird/android/buava/Optional;", "e", "()LZ84;", "latestDeal", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: JT0 */
/* loaded from: classes2.dex */
public interface JT0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: JT0$a */
    /* loaded from: classes2.dex */
    public static final class C4089a {
        public static /* synthetic */ AbstractC23442F acceptDeal$default(JT0 jt0, Deal deal, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return jt0.mo92273c(deal, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptDeal");
        }
    }

    /* renamed from: c */
    AbstractC23442F<HM4<Unit>> mo92273c(Deal deal, String str);

    /* renamed from: d */
    AbstractC23442F<HM4<Unit>> mo92272d(Deal deal, DealAcknowledgmentState dealAcknowledgmentState);

    /* renamed from: e */
    Z84<Optional<Deal>> mo92271e();

    /* renamed from: f */
    void mo92270f(Deal deal);

    /* renamed from: g */
    void mo92269g(Deal deal);
}
