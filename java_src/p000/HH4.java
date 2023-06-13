package p000;

import android.net.Uri;
import co.bird.android.model.ComplaintSection;
import co.bird.android.model.ComplaintType;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J \u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t0\bH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH&J\u001e\u0010\u0012\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nH&J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\nH&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001aH&J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001fH&J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001aH&J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001aH&J\b\u0010$\u001a\u00020\u0004H&J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH&J\b\u0010&\u001a\u00020\u0004H&J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\nH&J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H&J\u0014\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\b0\u0003H&¨\u0006."}, m28432d2 = {"LHH4;", "LaM5;", "LS74;", "Lio/reactivex/Observable;", "", "Lg", "e", "Gc", "", "Lkotlin/Pair;", "", "l2", "birdCode", "m", "Lco/bird/android/model/ComplaintSection;", "sections", "Lco/bird/android/model/ComplaintType;", "type", "Mb", "", "title", "E", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "value", "F0", "", "show", "dh", "bool", "L0", "", JsonDocumentFields.POLICY_ID, "completed", "u2", "E3", "g9", "Sc", "ej", "g", "url", "j", "Landroid/net/Uri;", "imageUri", "B3", "v", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HH4 */
/* loaded from: classes2.dex */
public interface HH4 extends InterfaceC37910aM5, S74 {
    /* renamed from: B3 */
    void mo102582B3(Uri uri);

    /* renamed from: E */
    void mo102581E(int i);

    /* renamed from: E3 */
    void mo102580E3(boolean z);

    /* renamed from: F0 */
    void mo102579F0(String str);

    /* renamed from: Gc */
    Observable<Unit> mo102578Gc();

    /* renamed from: Id */
    Map<String, String> mo102577Id();

    /* renamed from: L0 */
    void mo102576L0(boolean z);

    /* renamed from: Lg */
    Observable<Unit> mo102575Lg();

    /* renamed from: Mb */
    void mo102574Mb(List<ComplaintSection> list, ComplaintType complaintType);

    /* renamed from: Sc */
    void mo102570Sc(boolean z);

    /* renamed from: dh */
    void mo102569dh(boolean z);

    /* renamed from: e */
    Observable<Unit> mo102568e();

    /* renamed from: ej */
    void mo102567ej();

    /* renamed from: g */
    Observable<Unit> mo102566g();

    /* renamed from: g9 */
    void mo102565g9();

    /* renamed from: j */
    void mo102564j(String str);

    /* renamed from: l2 */
    List<Pair<String, Observable<Unit>>> mo102563l2();

    /* renamed from: m */
    void mo102562m(String str);

    void setAddress(String str);

    /* renamed from: u2 */
    void mo102561u2(boolean z);

    /* renamed from: v */
    Observable<List<Uri>> mo102560v();
}
