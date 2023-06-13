package p000;

import android.location.Location;
import android.net.Uri;
import co.bird.android.buava.Optional;
import co.bird.android.model.Balance;
import co.bird.android.model.Listing;
import co.bird.android.model.TransactionSummary;
import co.bird.android.model.User;
import co.bird.android.model.UserDeletionStatus;
import co.bird.android.model.Zone;
import co.bird.android.model.wire.WireLocation;
import co.bird.api.response.BalanceRefundResponse;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\b\u001a\u00020\u0007H&J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007H&JD\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007H&JV\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\u001c\u001a\u00020\u0007H&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0019\u001a\u00020\u0007H&J(\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007H&J\b\u0010%\u001a\u00020#H&J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00022\u0006\u0010'\u001a\u00020&H&J%\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00052\u0006\u0010\u0015\u001a\u00020\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010*H&ø\u0001\u0000J\b\u0010-\u001a\u00020#H&J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001c\u001a\u00020\u0007H&J\u0010\u0010/\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0007H&J\b\u00100\u001a\u00020#H&J.\u00105\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000304030\u00052\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000701H&J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u0007H&J\u000e\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0005H&J \u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00052\u0006\u0010\b\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020\fH&R&\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\t040=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0A0=8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010?R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020E0D8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, m28432d2 = {"Llh6;", "Lbr4;", "Lio/reactivex/Observable;", "Lco/bird/android/model/User;", "n1", "Lio/reactivex/F;", "getUser", "", "currency", "Lco/bird/android/model/Balance;", "i0", "B", "", "autoPayActive", "fromPrompt", "autoPayPlan", "d0", "paymentIntentId", "paymentMethodId", "X", "name", "email", PaymentMethod.BillingDetails.PARAM_PHONE, "Landroid/net/Uri;", "photoUri", "locale", "warehouseId", "W", "token", "j1", "H", "S", Stripe3ds2AuthParams.FIELD_SOURCE, "postalCode", "countryCode", "Lio/reactivex/c;", "w0", "n", "Landroid/location/Location;", "location", "Lco/bird/android/model/Zone;", "M", "Lco/bird/android/model/wire/WireLocation;", "Lqa1;", "s", "q", "r0", "b0", "b", "", "ids", "LHM4;", "", "p0", "l1", "Lco/bird/android/model/UserDeletionStatus;", "p", "Ljava/util/Currency;", "requestRefund", "Lco/bird/api/response/BalanceRefundResponse;", "t", "LZ84;", "U", "()LZ84;", "balances", "Lco/bird/android/buava/Optional;", "K", "balance", "Lco/bird/android/model/Listing;", "Lco/bird/android/model/TransactionSummary;", "L", "()Lco/bird/android/model/Listing;", "transactionHistory", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lh6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC44647lh6 extends InterfaceC38798br4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lh6$a */
    /* loaded from: classes2.dex */
    public static final class C25764a {
        /* renamed from: a */
        public static InterfaceC23497i m26955a(InterfaceC44647lh6 interfaceC44647lh6) {
            return InterfaceC38798br4.C13315a.m62290e(interfaceC44647lh6);
        }

        /* renamed from: b */
        public static <T> InterfaceC24575v<T, T> m26954b(InterfaceC44647lh6 interfaceC44647lh6) {
            return InterfaceC38798br4.C13315a.m62288g(interfaceC44647lh6);
        }

        /* renamed from: c */
        public static <T> InterfaceC23435C<T, T> m26953c(InterfaceC44647lh6 interfaceC44647lh6) {
            return InterfaceC38798br4.C13315a.m62286i(interfaceC44647lh6);
        }

        /* renamed from: d */
        public static <T> InterfaceC23448L<T, T> m26952d(InterfaceC44647lh6 interfaceC44647lh6) {
            return InterfaceC38798br4.C13315a.m62284k(interfaceC44647lh6);
        }

        /* renamed from: e */
        public static AbstractC23461c m26951e(InterfaceC44647lh6 interfaceC44647lh6, AbstractC23461c receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38798br4.C13315a.m62282m(interfaceC44647lh6, receiver);
        }

        /* renamed from: f */
        public static <T> Observable<T> m26950f(InterfaceC44647lh6 interfaceC44647lh6, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38798br4.C13315a.m62280o(interfaceC44647lh6, receiver);
        }

        public static /* synthetic */ AbstractC23442F fetchBalance$default(InterfaceC44647lh6 interfaceC44647lh6, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                return interfaceC44647lh6.mo26967i0(str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchBalance");
        }

        /* renamed from: g */
        public static <T> AbstractC23442F<T> m26949g(InterfaceC44647lh6 interfaceC44647lh6, AbstractC23442F<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38798br4.C13315a.m62279p(interfaceC44647lh6, receiver);
        }

        public static /* synthetic */ AbstractC23442F login$default(InterfaceC44647lh6 interfaceC44647lh6, String str, WireLocation wireLocation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    wireLocation = null;
                }
                return interfaceC44647lh6.mo26958s(str, wireLocation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
        }

        public static /* synthetic */ AbstractC23442F queryBalanceRefund$default(InterfaceC44647lh6 interfaceC44647lh6, Currency currency, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return interfaceC44647lh6.mo26957t(currency, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryBalanceRefund");
        }

        public static /* synthetic */ AbstractC23442F updateAutoPay$default(InterfaceC44647lh6 interfaceC44647lh6, boolean z, boolean z2, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z2 = false;
                }
                if ((i & 4) != 0) {
                    str = null;
                }
                return interfaceC44647lh6.mo26968d0(z, z2, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAutoPay");
        }

        public static /* synthetic */ AbstractC23442F updateAutoPayForPaymentIntent$default(InterfaceC44647lh6 interfaceC44647lh6, boolean z, boolean z2, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z2 = false;
                }
                return interfaceC44647lh6.mo26971X(z, z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAutoPayForPaymentIntent");
        }

        public static /* synthetic */ Observable updateUser$default(InterfaceC44647lh6 interfaceC44647lh6, String str, String str2, String str3, Uri uri, String str4, String str5, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    str3 = null;
                }
                if ((i & 8) != 0) {
                    uri = null;
                }
                if ((i & 16) != 0) {
                    str4 = null;
                }
                if ((i & 32) != 0) {
                    str5 = null;
                }
                return interfaceC44647lh6.mo26972W(str, str2, str3, uri, str4, str5);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUser");
        }

        public static /* synthetic */ AbstractC23461c updateUserHomeLocation$default(InterfaceC44647lh6 interfaceC44647lh6, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    str3 = null;
                }
                return interfaceC44647lh6.mo26956w0(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUserHomeLocation");
        }
    }

    /* renamed from: B */
    AbstractC23442F<Balance> mo26979B(String str);

    /* renamed from: H */
    Observable<User> mo26978H();

    /* renamed from: K */
    Z84<Optional<Balance>> mo26977K();

    /* renamed from: L */
    Listing<TransactionSummary> mo26976L();

    /* renamed from: M */
    Observable<Zone> mo26975M(Location location);

    /* renamed from: S */
    Observable<User> mo26974S(String str);

    /* renamed from: U */
    Z84<Map<Currency, Balance>> mo26973U();

    /* renamed from: W */
    Observable<User> mo26972W(String str, String str2, String str3, Uri uri, String str4, String str5);

    /* renamed from: X */
    AbstractC23442F<Balance> mo26971X(boolean z, boolean z2, String str, String str2, String str3);

    /* renamed from: b */
    AbstractC23461c mo26970b();

    /* renamed from: b0 */
    AbstractC23461c mo26969b0(String str);

    /* renamed from: d0 */
    AbstractC23442F<Balance> mo26968d0(boolean z, boolean z2, String str);

    AbstractC23442F<User> getUser();

    /* renamed from: i0 */
    AbstractC23442F<Balance> mo26967i0(String str);

    /* renamed from: j1 */
    Observable<Boolean> mo26966j1(String str);

    /* renamed from: l1 */
    Observable<User> mo26965l1(String str);

    /* renamed from: n */
    AbstractC23461c mo26964n();

    /* renamed from: n1 */
    Observable<User> mo26963n1();

    /* renamed from: p */
    AbstractC23442F<UserDeletionStatus> mo26962p();

    /* renamed from: p0 */
    AbstractC23442F<HM4<Map<String, User>>> mo26961p0(List<String> list);

    /* renamed from: q */
    AbstractC23461c mo26960q();

    /* renamed from: r0 */
    Observable<User> mo26959r0(String str);

    /* renamed from: s */
    AbstractC23442F<C47537qa1> mo26958s(String str, WireLocation wireLocation);

    /* renamed from: t */
    AbstractC23442F<BalanceRefundResponse> mo26957t(Currency currency, boolean z);

    /* renamed from: w0 */
    AbstractC23461c mo26956w0(String str, String str2, String str3);
}
