package co.bird.android.app.feature.autopay;

import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&¨\u0006\r"}, m28432d2 = {"Lco/bird/android/app/feature/autopay/b;", "LS74;", "LaM5;", "", "amount", "Ljava/util/Currency;", "currency", "", "Lb", "Lio/reactivex/Observable;", "t3", "l1", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.autopay.b */
/* loaded from: classes2.dex */
public interface InterfaceC13676b extends S74, InterfaceC37910aM5 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/autopay/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.autopay.b$a */
    /* loaded from: classes2.dex */
    public enum EnumC13677a {
        MODAL,
        ACTIVITY
    }

    /* renamed from: Lb */
    void mo60814Lb(long j, Currency currency);

    /* renamed from: l1 */
    Observable<Unit> mo60811l1();

    /* renamed from: t3 */
    Observable<Unit> mo60810t3();
}
