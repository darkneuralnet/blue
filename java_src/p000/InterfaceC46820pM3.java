package p000;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import co.bird.android.buava.Optional;
import co.bird.android.model.PaymentIntentStatus;
import co.bird.android.model.Reservation;
import co.bird.android.model.wire.WireRide;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H&J\u001a\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&J\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a0\u00192\b\b\u0002\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&J\b\u0010\u001f\u001a\u00020\u0002H&J\b\u0010 \u001a\u00020\u0002H&J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H&J\b\u0010#\u001a\u00020\u0015H&J\n\u0010$\u001a\u0004\u0018\u00010\u0004H&R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001a0%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001a0%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00170%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006+"}, m28432d2 = {"LpM3;", "", "", "i", "", "q", "Lco/bird/android/model/PaymentIntentStatus;", "status", "g", "Lco/bird/android/model/wire/WireRide;", "ride", "p", "Lco/bird/android/model/Reservation;", "reservation", "t", "id", "l", "", "requestCode", "Landroid/content/Intent;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lio/reactivex/c;", "o", "", "initRequired", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "j", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "m", "r", "n", "secret", "h", "s", "getPaymentMethodId", "LZ84;", "e", "()LZ84;", "f", "k", "navigatedToPaymentActionState", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pM3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC46820pM3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: pM3$a */
    /* loaded from: classes2.dex */
    public static final class C27275a {
        public static /* synthetic */ Observable observePaymentStatus$default(InterfaceC46820pM3 interfaceC46820pM3, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = true;
                }
                return interfaceC46820pM3.mo8807j(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observePaymentStatus");
        }
    }

    /* renamed from: e */
    Z84<Optional<Reservation>> mo8812e();

    /* renamed from: f */
    Z84<Optional<WireRide>> mo8811f();

    /* renamed from: g */
    void mo8810g(PaymentIntentStatus paymentIntentStatus);

    String getPaymentMethodId();

    /* renamed from: h */
    void mo8809h(String str, String str2);

    /* renamed from: i */
    void mo8808i();

    /* renamed from: j */
    Observable<Optional<PaymentIntentStatus>> mo8807j(boolean z);

    /* renamed from: k */
    Z84<Boolean> mo8806k();

    /* renamed from: l */
    void mo8805l(String str);

    /* renamed from: m */
    void mo8804m(AppCompatActivity appCompatActivity);

    /* renamed from: n */
    void mo8803n();

    /* renamed from: o */
    AbstractC23461c mo8802o(int i, Intent intent);

    /* renamed from: p */
    void mo8801p(WireRide wireRide);

    /* renamed from: q */
    String mo8800q();

    /* renamed from: r */
    void mo8799r();

    /* renamed from: s */
    AbstractC23461c mo8798s();

    /* renamed from: t */
    void mo8797t(Reservation reservation);
}
