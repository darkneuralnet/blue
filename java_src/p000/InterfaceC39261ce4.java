package p000;

import co.bird.android.model.User;
import co.bird.android.model.wire.configs.Config;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&J3\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001aH&J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001aH&J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001aH&J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0!H&J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0!H&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0!H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0!H&¨\u0006'"}, m28432d2 = {"Lce4;", "LS74;", "LaM5;", "", "token", "LL10;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LG10;", "A5", "LZg3;", "onPaymentMethodSelectedListener", "", "Bb", "Lco/bird/android/model/User;", "user", "", "requestCode", "Ljava/util/Currency;", "currency", "", "price", "Zk", "(Lco/bird/android/model/User;ILjava/util/Currency;Ljava/lang/Long;)V", "Lco/bird/android/model/wire/configs/Config;", "config", "Ak", "", "locationPermissionGranted", "B0", "show", "y", "Kd", "S", "Lio/reactivex/Observable;", "x4", "J", "P3", "A", "j9", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ce4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC39261ce4 extends S74, InterfaceC37910aM5 {
    /* renamed from: A */
    Observable<Unit> mo41083A();

    /* renamed from: A5 */
    G10 mo41082A5(String str, L10 l10);

    /* renamed from: Ak */
    void mo41081Ak(Config config);

    /* renamed from: B0 */
    void mo41080B0(boolean z);

    /* renamed from: Bb */
    void mo41079Bb(InterfaceC37520Zg3 interfaceC37520Zg3);

    /* renamed from: J */
    Observable<Unit> mo41078J();

    /* renamed from: Kd */
    void mo41077Kd(boolean z);

    /* renamed from: P3 */
    Observable<Unit> mo41076P3();

    /* renamed from: S */
    void mo41075S(boolean z);

    /* renamed from: Zk */
    void mo41074Zk(User user, int i, Currency currency, Long l);

    /* renamed from: j9 */
    Observable<Unit> mo41073j9();

    /* renamed from: x4 */
    Observable<Unit> mo41072x4();

    /* renamed from: y */
    void mo41071y(boolean z);
}
