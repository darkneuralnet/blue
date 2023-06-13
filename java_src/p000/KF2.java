package p000;

import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\f\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\u0004H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH&J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH&J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH&J\b\u0010\u0015\u001a\u00020\u0006H&J\b\u0010\u0016\u001a\u00020\u0006H&J\u0012\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0017H&J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH&J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\bH&J-\u0010!\u001a\u00020\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u00172\u0012\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e\"\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J(\u0010'\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H&R\u0014\u0010*\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, m28432d2 = {"LKF2;", "LS74;", "LaM5;", "LH31;", "", "email", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "", "show", "agreement", "h1", "X0", "E0", "Lio/reactivex/Observable;", "hk", "df", "V3", "bf", "T6", "emailEditorFocuses", "l3", "yf", "", "errorRes", "H8", "S1", "checked", "xk", "resId", "", "", "formatArgs", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "minAge", "flavorName", "termsHtml", "privacyPolicyHtml", C12452bb.f57736a, "y7", "()Z", "inEmailEntryMode", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: KF2 */
/* loaded from: classes2.dex */
public interface KF2 extends S74, InterfaceC37910aM5, H31 {
    /* renamed from: C */
    void mo94151C(String str);

    /* renamed from: E0 */
    String mo94150E0();

    /* renamed from: H8 */
    void mo94149H8(int i);

    /* renamed from: S1 */
    Observable<Boolean> mo94145S1();

    /* renamed from: T6 */
    Observable<Unit> mo94143T6();

    /* renamed from: V3 */
    Observable<Unit> mo94141V3();

    /* renamed from: X0 */
    boolean mo94140X0();

    /* renamed from: bb */
    void mo94139bb(int i, String str, String str2, String str3);

    /* renamed from: bf */
    void mo94138bf(boolean z);

    /* renamed from: df */
    void mo94137df(boolean z);

    Observable<Boolean> emailEditorFocuses();

    String getString(int i, Object... objArr);

    /* renamed from: h1 */
    void mo94136h1(boolean z, String str);

    /* renamed from: hk */
    Observable<String> mo94135hk();

    /* renamed from: l3 */
    void mo94134l3();

    /* renamed from: xk */
    void mo94132xk(boolean z);

    /* renamed from: y7 */
    boolean mo94131y7();

    /* renamed from: yf */
    void mo94130yf();
}
