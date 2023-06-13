package p000;

import co.bird.android.model.persistence.BirdPlusView;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC38466bI4;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u000fH&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\f\u001a\u00020\u0004H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0014\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u0002H&¨\u0006\u0017"}, m28432d2 = {"LoR;", "LbI4;", "Lio/reactivex/c;", "v1", "", "subscriptionPlanId", "", "trial", "m", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlusView", "K", "userSubscriptionId", "Q", "a0", "Lio/reactivex/Observable;", "", "F1", "Z0", "K0", "codename", "s1", "u1", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oR */
/* loaded from: classes2.dex */
public interface InterfaceC26980oR extends InterfaceC38466bI4 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: oR$a */
    /* loaded from: classes2.dex */
    public static final class C26981a {
        /* renamed from: a */
        public static <T> Observable<T> m21084a(InterfaceC26980oR interfaceC26980oR, Observable<T> receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return InterfaceC38466bI4.C12353a.m64703i(interfaceC26980oR, receiver);
        }
    }

    /* renamed from: F1 */
    Observable<List<BirdPlusView>> mo10302F1();

    @Deprecated(message = "Not implemented currently, do not use.")
    /* renamed from: K */
    AbstractC23461c mo10300K(BirdPlusView birdPlusView);

    /* renamed from: K0 */
    Observable<BirdPlusView> mo10299K0(String str);

    /* renamed from: Q */
    AbstractC23461c mo10292Q(String str);

    /* renamed from: Z0 */
    Observable<BirdPlusView> mo10289Z0(String str);

    /* renamed from: a0 */
    AbstractC23461c mo10288a0(String str);

    /* renamed from: m */
    AbstractC23461c mo10287m(String str, boolean z);

    /* renamed from: s1 */
    Observable<BirdPlusView> mo10286s1(String str);

    /* renamed from: u1 */
    AbstractC23461c mo10285u1();

    /* renamed from: v1 */
    AbstractC23461c mo10284v1();
}
