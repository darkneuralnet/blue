package p000;

import android.net.Uri;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\nH&J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\u0006H&R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u00020\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u00020\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001c\u0010&\u001a\u00020\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010-\u001a\u00020\n8&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00101\u001a\u00020\n8&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b0\u0010,\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R\u001c\u00104\u001a\u00020\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u0010\u001fR\u0014\u00105\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010(R\u0014\u00109\u001a\u0002068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010=\u001a\u0004\u0018\u00010:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001c\u0010C\u001a\u00020>8&@&X¦\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010F\u001a\u00020\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010\u001fR\u001e\u0010I\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0012\"\u0004\bH\u0010\u0014R\u001c\u0010O\u001a\u00020J8&@&X¦\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010U\u001a\u00020P8&@&X¦\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001c\u0010[\u001a\u00020V8&@&X¦\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010_\u001a\u00020\n8&@&X¦\u000e¢\u0006\u0012\u0012\u0004\b^\u0010,\u001a\u0004\b\\\u0010(\"\u0004\b]\u0010*R\u0014\u0010c\u001a\u00020`8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006dÀ\u0006\u0001"}, m28432d2 = {"LwO1;", "LaP1;", "Lorg/json/JSONObject;", "", "", "remotePathToLocalAssetMap", "", "c0", "", "f0", "", "logImpression", "logClick", "LmZ1;", "failureType", "T", "q0", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "message", "getExtras", "()Ljava/util/Map;", "setExtras", "(Ljava/util/Map;)V", "extras", "", "e0", "()I", "setDurationInMilliseconds", "(I)V", "durationInMilliseconds", "getBackgroundColor", "setBackgroundColor", "backgroundColor", "g0", "setIconColor", "iconColor", "l0", "()Z", "K", "(Z)V", "getAnimateOut$annotations", "()V", "animateOut", "H", "j0", "getAnimateIn$annotations", "animateIn", "p0", "setIconBackgroundColor", "iconBackgroundColor", "isControl", "LYj0;", "P", "()LYj0;", "clickAction", "Landroid/net/Uri;", "R", "()Landroid/net/Uri;", "uri", "LI41;", "Z", "()LI41;", "setDismissType", "(LI41;)V", "dismissType", "J", "setMessageTextColor", "messageTextColor", "getIcon", "setIcon", "icon", "LCy3;", "F", "()LCy3;", "setOrientation", "(LCy3;)V", "orientation", "LPE0;", "N", "()LPE0;", "setCropType", "(LPE0;)V", "cropType", "", "o0", "()J", "k0", "(J)V", "expirationTimestamp", "getOpenUriInWebView", "setOpenUriInWebView", "getOpenUriInWebView$annotations", "openUriInWebView", "LzT2;", "h0", "()LzT2;", ChallengeRequestData.FIELD_MESSAGE_TYPE, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: wO1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC50985wO1 extends InterfaceC37933aP1<JSONObject> {
    /* renamed from: F */
    EnumC32300Cy3 mo6952F();

    /* renamed from: H */
    boolean mo6951H();

    /* renamed from: J */
    int mo6950J();

    /* renamed from: K */
    void mo6949K(boolean z);

    /* renamed from: N */
    PE0 mo6948N();

    /* renamed from: P */
    EnumC37310Yj0 mo6947P();

    /* renamed from: R */
    Uri mo6946R();

    /* renamed from: T */
    boolean mo6945T(EnumC45156mZ1 enumC45156mZ1);

    /* renamed from: Z */
    I41 mo6944Z();

    /* renamed from: c0 */
    void mo6943c0(Map<String, String> map);

    /* renamed from: e0 */
    int mo6942e0();

    /* renamed from: f0 */
    List<String> mo6941f0();

    /* renamed from: g0 */
    int mo6940g0();

    int getBackgroundColor();

    Map<String, String> getExtras();

    String getIcon();

    String getMessage();

    boolean getOpenUriInWebView();

    /* renamed from: h0 */
    EnumC52810zT2 mo5008h0();

    boolean isControl();

    /* renamed from: j0 */
    void mo6939j0(boolean z);

    /* renamed from: k0 */
    void mo6938k0(long j);

    /* renamed from: l0 */
    boolean mo6937l0();

    boolean logClick();

    boolean logImpression();

    /* renamed from: o0 */
    long mo6936o0();

    /* renamed from: p0 */
    int mo6935p0();

    /* renamed from: q0 */
    void mo6934q0();
}
