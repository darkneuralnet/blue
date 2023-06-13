package p000;

import android.graphics.Color;
import android.net.Uri;
import bo.app.C12519a3;
import bo.app.C12547b3;
import bo.app.C12580d3;
import bo.app.C12749j;
import bo.app.C13109s0;
import bo.app.InterfaceC13160u1;
import bo.app.InterfaceC13231y1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b'\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0002©\u0001B\n\b\u0010¢\u0006\u0005\b¦\u0001\u0010.B4\b\u0017\u0012\u0007\u0010§\u0001\u001a\u00020\u0012\u0012\b\u0010\u0094\u0001\u001a\u00030\u008d\u0001\u0012\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u0003\u0012\t\b\u0002\u0010\u0084\u0001\u001a\u00020\u0003¢\u0006\u0006\b¦\u0001\u0010¨\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001c\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010&\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R(\u0010/\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b-\u0010.\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R.\u00106\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010;\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b7\u0010(\u0012\u0004\b:\u0010.\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R(\u0010@\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b<\u0010(\u0012\u0004\b?\u0010.\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R\"\u0010G\u001a\u00020A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\b(\u0010D\"\u0004\bE\u0010FR*\u0010P\u001a\u00020H2\u0006\u0010I\u001a\u00020H8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010X\u001a\u00020Q8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010t\u001a\u00020H8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bq\u0010K\u001a\u0004\br\u0010M\"\u0004\bs\u0010OR\"\u0010w\u001a\u00020H8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bu\u0010K\u001a\u0004\bk\u0010M\"\u0004\bv\u0010OR\"\u0010z\u001a\u00020H8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\bx\u0010K\u001a\u0004\by\u0010M\"\u0004\bK\u0010OR\"\u0010~\u001a\u00020H8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b{\u0010K\u001a\u0004\b|\u0010M\"\u0004\b}\u0010OR\u0017\u0010\u0082\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0084\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u0016\u0010\u0085\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010\u0081\u0001R+\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R,\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R,\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010¢\u0001\u001a\u0004\u0018\u00010\u00188VX\u0096\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010£\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010*R\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010\r8F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010\u001f¨\u0006ª\u0001"}, m28432d2 = {"LhZ1;", "LwO1;", "LDO1;", "", "logImpression", "logClick", "", "q0", "LmZ1;", "failureType", "T", "v", "", "", "f0", "", "remotePathToLocalAssetMap", "c0", "Lorg/json/JSONObject;", "z", "LYj0;", "b", "LYj0;", "internalClickAction", "Landroid/net/Uri;", "c", "Landroid/net/Uri;", "internalUri", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "i0", "(Ljava/lang/String;)V", "message", "e", "getIcon", "X", "icon", "f", "Z", "getOpenUriInWebView", "()Z", "s0", "(Z)V", "getOpenUriInWebView$annotations", "()V", "openUriInWebView", "g", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "V", "(Ljava/util/Map;)V", "extras", "h", "H", "j0", "getAnimateIn$annotations", "animateIn", "i", "l0", "K", "getAnimateOut$annotations", "animateOut", "LI41;", "j", "LI41;", "()LI41;", "Q", "(LI41;)V", "dismissType", "", "value", "k", "I", "e0", "()I", "S", "(I)V", "durationInMilliseconds", "LCy3;", "l", "LCy3;", "F", "()LCy3;", "t0", "(LCy3;)V", "orientation", "LPE0;", "m", "LPE0;", "N", "()LPE0;", "O", "(LPE0;)V", "cropType", "Ls06;", "n", "Ls06;", "D", "()Ls06;", "n0", "(Ls06;)V", "messageTextAlign", "", "o", "J", "o0", "()J", "k0", "(J)V", "expirationTimestamp", "p", "p0", "a0", "iconBackgroundColor", "q", "r0", "messageTextColor", "r", "getBackgroundColor", "backgroundColor", "s", "g0", "b0", "iconColor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "t", "Ljava/util/concurrent/atomic/AtomicBoolean;", "impressionLogged", "u", "clickLogged", "displayFailureLogged", "w", "Lorg/json/JSONObject;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Lorg/json/JSONObject;", "setJsonObject", "(Lorg/json/JSONObject;)V", "jsonObject", "Lbo/app/y1;", "x", "Lbo/app/y1;", "A", "()Lbo/app/y1;", "setBrazeManager", "(Lbo/app/y1;)V", "brazeManager", "Lbo/app/d3;", "y", "Lbo/app/d3;", "B", "()Lbo/app/d3;", "setInAppMessageDarkThemeWrapper", "(Lbo/app/d3;)V", "inAppMessageDarkThemeWrapper", "P", "()LYj0;", "clickAction", "R", "()Landroid/net/Uri;", "uri", "isControl", "G", "triggerId", "<init>", "json", "(Lorg/json/JSONObject;Lbo/app/y1;ZZ)V", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: hZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC42191hZ1 implements InterfaceC50985wO1, DO1 {

    /* renamed from: z */
    public static final C22680a f85440z = new C22680a(null);

    /* renamed from: b */
    public EnumC37310Yj0 f85441b;

    /* renamed from: c */
    public Uri f85442c;

    /* renamed from: d */
    public String f85443d;

    /* renamed from: e */
    public String f85444e;

    /* renamed from: f */
    public boolean f85445f;

    /* renamed from: g */
    public Map<String, String> f85446g;

    /* renamed from: h */
    public boolean f85447h;

    /* renamed from: i */
    public boolean f85448i;

    /* renamed from: j */
    public I41 f85449j;

    /* renamed from: k */
    public int f85450k;

    /* renamed from: l */
    public EnumC32300Cy3 f85451l;

    /* renamed from: m */
    public PE0 f85452m;

    /* renamed from: n */
    public EnumC48393s06 f85453n;

    /* renamed from: o */
    public long f85454o;

    /* renamed from: p */
    public int f85455p;

    /* renamed from: q */
    public int f85456q;

    /* renamed from: r */
    public int f85457r;

    /* renamed from: s */
    public int f85458s;

    /* renamed from: t */
    public final AtomicBoolean f85459t;

    /* renamed from: u */
    public final AtomicBoolean f85460u;

    /* renamed from: v */
    public final AtomicBoolean f85461v;

    /* renamed from: w */
    public JSONObject f85462w;

    /* renamed from: x */
    public InterfaceC13231y1 f85463x;

    /* renamed from: y */
    public C12580d3 f85464y;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, m28432d2 = {"LhZ1$a;", "", "", "ANIMATE_IN", "Ljava/lang/String;", "ANIMATE_OUT", "BG_COLOR", "CLICK_ACTION", "CROP_TYPE", "DISMISS_TYPE", "DURATION", "EXTRAS", "ICON", "ICON_BG_COLOR", "ICON_COLOR", "", "INAPP_MESSAGE_DURATION_DEFAULT_MILLIS", "I", "INAPP_MESSAGE_DURATION_MIN_MILLIS", "IS_CONTROL", "MESSAGE", "MESSAGE_TEXT_ALIGN", "MESSAGE_TEXT_COLOR", "OPEN_URI_IN_WEBVIEW", "ORIENTATION", "TRIGGER_ID", "TYPE", "URI", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$a */
    /* loaded from: classes2.dex */
    public static final class C22680a {
        public /* synthetic */ C22680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C22680a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$b */
    /* loaded from: classes2.dex */
    public static final class C22681b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f85465g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22681b(int i) {
            super(0);
            this.f85465g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Requested in-app message duration " + this.f85465g + " is lower than the minimum of 999. Defaulting to 5000 milliseconds.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$c */
    /* loaded from: classes2.dex */
    public static final class C22682c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f85466g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22682c(int i) {
            super(0);
            this.f85466g = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Set in-app message duration to " + this.f85466g + " milliseconds.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$d */
    /* loaded from: classes2.dex */
    public static final class C22683d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22683d f85467g = new C22683d();

        public C22683d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$e */
    /* loaded from: classes2.dex */
    public static final class C22684e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22684e f85468g = new C22684e();

        public C22684e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to construct json for in-app message";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$f */
    /* loaded from: classes2.dex */
    public static final class C22685f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22685f f85469g = new C22685f();

        public C22685f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$g */
    /* loaded from: classes2.dex */
    public static final class C22686g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22686g f85470g = new C22686g();

        public C22686g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message click because the BrazeManager is null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$h */
    /* loaded from: classes2.dex */
    public static final class C22687h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22687h f85471g = new C22687h();

        public C22687h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$i */
    /* loaded from: classes2.dex */
    public static final class C22688i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22688i f85472g = new C22688i();

        public C22688i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$j */
    /* loaded from: classes2.dex */
    public static final class C22689j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22689j f85473g = new C22689j();

        public C22689j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Logging click on in-app message";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$k */
    /* loaded from: classes2.dex */
    public static final class C22690k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22690k f85474g = new C22690k();

        public C22690k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message display failure.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$l */
    /* loaded from: classes2.dex */
    public static final class C22691l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22691l f85475g = new C22691l();

        public C22691l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message display failure because the BrazeManager is null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$m */
    /* loaded from: classes2.dex */
    public static final class C22692m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22692m f85476g = new C22692m();

        public C22692m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$n */
    /* loaded from: classes2.dex */
    public static final class C22693n extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22693n f85477g = new C22693n();

        public C22693n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$o */
    /* loaded from: classes2.dex */
    public static final class C22694o extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22694o f85478g = new C22694o();

        public C22694o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$p */
    /* loaded from: classes2.dex */
    public static final class C22695p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22695p f85479g = new C22695p();

        public C22695p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$q */
    /* loaded from: classes2.dex */
    public static final class C22696q extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22696q f85480g = new C22696q();

        public C22696q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message impression because the BrazeManager is null.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$r */
    /* loaded from: classes2.dex */
    public static final class C22697r extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22697r f85481g = new C22697r();

        public C22697r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: hZ1$s */
    /* loaded from: classes2.dex */
    public static final class C22698s extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C22698s f85482g = new C22698s();

        public C22698s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    public AbstractC42191hZ1() {
        Map<String, String> emptyMap;
        this.f85441b = EnumC37310Yj0.NONE;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f85446g = emptyMap;
        this.f85447h = true;
        this.f85448i = true;
        this.f85449j = I41.AUTO_DISMISS;
        this.f85450k = 5000;
        this.f85451l = EnumC32300Cy3.ANY;
        this.f85452m = PE0.FIT_CENTER;
        this.f85453n = EnumC48393s06.CENTER;
        this.f85454o = -1L;
        this.f85455p = Color.parseColor("#ff0073d5");
        this.f85456q = Color.parseColor("#555555");
        this.f85457r = -1;
        this.f85458s = -1;
        this.f85459t = new AtomicBoolean(false);
        this.f85460u = new AtomicBoolean(false);
        this.f85461v = new AtomicBoolean(false);
    }

    /* renamed from: A */
    public final InterfaceC13231y1 m36217A() {
        return this.f85463x;
    }

    /* renamed from: B */
    public final C12580d3 m36216B() {
        return this.f85464y;
    }

    /* renamed from: C */
    public final JSONObject m36215C() {
        return this.f85462w;
    }

    /* renamed from: D */
    public EnumC48393s06 m36214D() {
        return this.f85453n;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: F */
    public EnumC32300Cy3 mo6952F() {
        return this.f85451l;
    }

    /* renamed from: G */
    public final String m36213G() {
        JSONObject jSONObject = this.f85462w;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("trigger_id");
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: H */
    public boolean mo6951H() {
        return this.f85447h;
    }

    /* renamed from: I */
    public void m36212I(int i) {
        this.f85457r = i;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: J */
    public int mo6950J() {
        return this.f85456q;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: K */
    public void mo6949K(boolean z) {
        this.f85448i = z;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: N */
    public PE0 mo6948N() {
        return this.f85452m;
    }

    /* renamed from: O */
    public void m36211O(PE0 pe0) {
        Intrinsics.checkNotNullParameter(pe0, "<set-?>");
        this.f85452m = pe0;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: P */
    public EnumC37310Yj0 mo6947P() {
        return this.f85441b;
    }

    /* renamed from: Q */
    public void m36210Q(I41 i41) {
        Intrinsics.checkNotNullParameter(i41, "<set-?>");
        this.f85449j = i41;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: R */
    public Uri mo6946R() {
        return this.f85442c;
    }

    /* renamed from: S */
    public void m36209S(int i) {
        if (i < 999) {
            this.f85450k = 5000;
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C22681b(i), 7, null);
            return;
        }
        this.f85450k = i;
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C22682c(i), 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    @Override // p000.InterfaceC50985wO1
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo6945T(EnumC45156mZ1 failureType) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(failureType, "failureType");
        String m36213G = m36213G();
        if (m36213G != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(m36213G);
            if (!isBlank) {
                z = false;
                if (!z) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C22690k.f85474g, 7, null);
                    return false;
                }
                InterfaceC13231y1 interfaceC13231y1 = this.f85463x;
                if (interfaceC13231y1 == null) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C22691l.f85475g, 6, null);
                    return false;
                } else if (this.f85461v.get()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C22692m.f85476g, 6, null);
                    return false;
                } else if (this.f85460u.get()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C22693n.f85477g, 6, null);
                    return false;
                } else if (this.f85459t.get()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C22694o.f85478g, 6, null);
                    return false;
                } else {
                    InterfaceC13160u1 m63562a = C12749j.f58647h.m63562a(m36213G, failureType);
                    if (m63562a != null) {
                        interfaceC13231y1.mo62756a(m63562a);
                    }
                    this.f85461v.set(true);
                    return true;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* renamed from: V */
    public void m36208V(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f85446g = map;
    }

    /* renamed from: X */
    public void m36207X(String str) {
        this.f85444e = str;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: Z */
    public I41 mo6944Z() {
        return this.f85449j;
    }

    /* renamed from: a0 */
    public void m36206a0(int i) {
        this.f85455p = i;
    }

    /* renamed from: b0 */
    public void m36205b0(int i) {
        this.f85458s = i;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: c0 */
    public void mo6943c0(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: e0 */
    public int mo6942e0() {
        return this.f85450k;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: f0 */
    public List<String> mo6941f0() {
        List<String> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: g0 */
    public int mo6940g0() {
        return this.f85458s;
    }

    @Override // p000.InterfaceC50985wO1
    public int getBackgroundColor() {
        return this.f85457r;
    }

    @Override // p000.InterfaceC50985wO1
    public Map<String, String> getExtras() {
        return this.f85446g;
    }

    @Override // p000.InterfaceC50985wO1
    public String getIcon() {
        return this.f85444e;
    }

    @Override // p000.InterfaceC50985wO1
    public String getMessage() {
        return this.f85443d;
    }

    @Override // p000.InterfaceC50985wO1
    public boolean getOpenUriInWebView() {
        return this.f85445f;
    }

    /* renamed from: i0 */
    public void m36204i0(String str) {
        this.f85443d = str;
    }

    @Override // p000.InterfaceC50985wO1
    public boolean isControl() {
        JSONObject jSONObject = this.f85462w;
        return jSONObject != null && jSONObject.optBoolean("is_control");
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: j0 */
    public void mo6939j0(boolean z) {
        this.f85447h = z;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: k0 */
    public void mo6938k0(long j) {
        this.f85454o = j;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: l0 */
    public boolean mo6937l0() {
        return this.f85448i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    @Override // p000.InterfaceC50985wO1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean logClick() {
        boolean z;
        boolean isBlank;
        String m36213G = m36213G();
        if (m36213G != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(m36213G);
            if (!isBlank) {
                z = false;
                if (!z) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C22685f.f85469g, 7, null);
                    return false;
                }
                InterfaceC13231y1 interfaceC13231y1 = this.f85463x;
                if (interfaceC13231y1 == null) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C22686g.f85470g, 6, null);
                    return false;
                } else if (this.f85460u.get() && mo5008h0() != EnumC52810zT2.HTML) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C22687h.f85471g, 6, null);
                    return false;
                } else if (this.f85461v.get()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C22688i.f85472g, 6, null);
                    return false;
                } else {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C22689j.f85473g, 6, null);
                    InterfaceC13160u1 m63546g = C12749j.f58647h.m63546g(m36213G);
                    if (m63546g != null) {
                        interfaceC13231y1.mo62756a(m63546g);
                    }
                    this.f85460u.set(true);
                    return true;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    @Override // p000.InterfaceC50985wO1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean logImpression() {
        boolean z;
        boolean isBlank;
        String m36213G = m36213G();
        if (m36213G != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(m36213G);
            if (!isBlank) {
                z = false;
                if (!z) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.D, null, false, C22695p.f85479g, 6, null);
                    return false;
                }
                InterfaceC13231y1 interfaceC13231y1 = this.f85463x;
                if (interfaceC13231y1 == null) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C22696q.f85480g, 6, null);
                    return false;
                } else if (this.f85459t.get()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C22697r.f85481g, 6, null);
                    return false;
                } else if (this.f85461v.get()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C22698s.f85482g, 6, null);
                    return false;
                } else {
                    InterfaceC13160u1 m63543i = C12749j.f58647h.m63543i(m36213G);
                    if (m63543i != null) {
                        interfaceC13231y1.mo62756a(m63543i);
                    }
                    this.f85459t.set(true);
                    return true;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    /* renamed from: n0 */
    public void m36203n0(EnumC48393s06 enumC48393s06) {
        Intrinsics.checkNotNullParameter(enumC48393s06, "<set-?>");
        this.f85453n = enumC48393s06;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: o0 */
    public long mo6936o0() {
        return this.f85454o;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: p0 */
    public int mo6935p0() {
        return this.f85455p;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: q0 */
    public void mo6934q0() {
        boolean z;
        InterfaceC13231y1 interfaceC13231y1;
        String m36213G = m36213G();
        if (this.f85460u.get()) {
            if (m36213G != null && m36213G.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z && (interfaceC13231y1 = this.f85463x) != null) {
                interfaceC13231y1.mo62757a(new C12519a3(m36213G));
            }
        }
    }

    /* renamed from: r0 */
    public void m36202r0(int i) {
        this.f85456q = i;
    }

    /* renamed from: s0 */
    public void m36201s0(boolean z) {
        this.f85445f = z;
    }

    /* renamed from: t0 */
    public void m36200t0(EnumC32300Cy3 enumC32300Cy3) {
        Intrinsics.checkNotNullParameter(enumC32300Cy3, "<set-?>");
        this.f85451l = enumC32300Cy3;
    }

    /* renamed from: v */
    public void mo14014v() {
        C12580d3 c12580d3 = this.f85464y;
        if (c12580d3 == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C22683d.f85467g, 7, null);
            return;
        }
        if (c12580d3.m63851a() != null) {
            m36212I(c12580d3.m63851a().intValue());
        }
        if (c12580d3.m63846f() != null) {
            m36205b0(c12580d3.m63846f().intValue());
        }
        if (c12580d3.m63847e() != null) {
            m36206a0(c12580d3.m63847e().intValue());
        }
        if (c12580d3.m63845g() != null) {
            m36202r0(c12580d3.m63845g().intValue());
        }
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: z */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.f85462w;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("message", getMessage());
                jSONObject.put("duration", mo6942e0());
                jSONObject.putOpt("trigger_id", m36213G());
                jSONObject.putOpt("click_action", mo6947P().toString());
                jSONObject.putOpt("message_close", mo6944Z().toString());
                if (mo6946R() != null) {
                    jSONObject.put("uri", String.valueOf(mo6946R()));
                }
                jSONObject.put("use_webview", getOpenUriInWebView());
                jSONObject.put("animate_in", mo6951H());
                jSONObject.put("animate_out", mo6937l0());
                jSONObject.put("bg_color", getBackgroundColor());
                jSONObject.put("text_color", mo6950J());
                jSONObject.put("icon_color", mo6940g0());
                jSONObject.put("icon_bg_color", mo6935p0());
                jSONObject.putOpt("icon", getIcon());
                jSONObject.putOpt("crop_type", mo6948N().toString());
                jSONObject.putOpt("orientation", mo6952F().toString());
                jSONObject.putOpt("text_align_message", m36214D().toString());
                jSONObject.putOpt("is_control", Boolean.valueOf(isControl()));
                if (!getExtras().isEmpty()) {
                    jSONObject.put("extras", getExtras());
                }
            } catch (JSONException e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C22684e.f85468g, 4, null);
            }
        }
        return jSONObject;
    }

    public /* synthetic */ AbstractC42191hZ1(JSONObject jSONObject, InterfaceC13231y1 interfaceC13231y1, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, interfaceC13231y1, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public AbstractC42191hZ1(JSONObject json, InterfaceC13231y1 brazeManager, boolean z, boolean z2) {
        Map<String, String> emptyMap;
        String upperCase;
        I41[] values;
        int length;
        boolean isBlank;
        String upperCase2;
        EnumC37310Yj0[] values2;
        int length2;
        int i;
        String upperCase3;
        EnumC32300Cy3[] values3;
        int length3;
        int i2;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f85441b = EnumC37310Yj0.NONE;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f85446g = emptyMap;
        boolean z3 = true;
        this.f85447h = true;
        this.f85448i = true;
        this.f85449j = I41.AUTO_DISMISS;
        this.f85450k = 5000;
        EnumC32300Cy3 enumC32300Cy3 = EnumC32300Cy3.ANY;
        this.f85451l = enumC32300Cy3;
        this.f85452m = PE0.FIT_CENTER;
        this.f85453n = EnumC48393s06.CENTER;
        this.f85454o = -1L;
        this.f85455p = Color.parseColor("#ff0073d5");
        this.f85456q = Color.parseColor("#555555");
        this.f85457r = -1;
        this.f85458s = -1;
        int i3 = 0;
        this.f85459t = new AtomicBoolean(false);
        this.f85460u = new AtomicBoolean(false);
        this.f85461v = new AtomicBoolean(false);
        this.f85462w = json;
        this.f85463x = brazeManager;
        m36204i0(json.optString("message"));
        mo6939j0(json.optBoolean("animate_in", true));
        mo6949K(json.optBoolean("animate_out", true));
        m36209S(json.optInt("duration"));
        m36207X(json.optString("icon"));
        try {
            C13109s0 c13109s0 = C13109s0.f59272a;
            String string = json.getString("orientation");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase3 = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(locale)");
            values3 = EnumC32300Cy3.values();
            length3 = values3.length;
            i2 = 0;
        } catch (Exception unused) {
        }
        while (i2 < length3) {
            EnumC32300Cy3 enumC32300Cy32 = values3[i2];
            i2++;
            if (Intrinsics.areEqual(enumC32300Cy32.name(), upperCase3)) {
                enumC32300Cy3 = enumC32300Cy32;
                m36200t0(enumC32300Cy3);
                m36201s0(json.optBoolean("use_webview", false));
                m36206a0(json.optInt("icon_bg_color"));
                m36202r0(json.optInt("text_color"));
                m36212I(json.optInt("bg_color"));
                m36205b0(json.optInt("icon_color"));
                this.f85459t.set(z);
                this.f85460u.set(z2);
                m36208V(C31696Aj2.m115355d(json.optJSONObject("extras")));
                String optString = json.optString("uri");
                EnumC37310Yj0 enumC37310Yj0 = EnumC37310Yj0.NONE;
                try {
                    C13109s0 c13109s02 = C13109s0.f59272a;
                    String string2 = json.getString("click_action");
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(key)");
                    Locale US2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US2, "US");
                    upperCase2 = string2.toUpperCase(US2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                    values2 = EnumC37310Yj0.values();
                    length2 = values2.length;
                    i = 0;
                } catch (Exception unused2) {
                }
                while (i < length2) {
                    EnumC37310Yj0 enumC37310Yj02 = values2[i];
                    i++;
                    if (Intrinsics.areEqual(enumC37310Yj02.name(), upperCase2)) {
                        enumC37310Yj0 = enumC37310Yj02;
                        if (enumC37310Yj0 == EnumC37310Yj0.URI) {
                            if (optString != null) {
                                isBlank = StringsKt__StringsJVMKt.isBlank(optString);
                                if (!isBlank) {
                                    z3 = false;
                                }
                            }
                            if (!z3) {
                                this.f85442c = Uri.parse(optString);
                            }
                        }
                        this.f85441b = enumC37310Yj0;
                        I41 i41 = I41.AUTO_DISMISS;
                        try {
                            C13109s0 c13109s03 = C13109s0.f59272a;
                            String string3 = json.getString("message_close");
                            Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(key)");
                            Locale US3 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US3, "US");
                            upperCase = string3.toUpperCase(US3);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                            values = I41.values();
                            length = values.length;
                        } catch (Exception unused3) {
                        }
                        while (i3 < length) {
                            I41 i412 = values[i3];
                            i3++;
                            if (Intrinsics.areEqual(i412.name(), upperCase)) {
                                i41 = i412;
                                m36210Q(i41 == I41.SWIPE ? I41.MANUAL : i41);
                                this.f85464y = C12547b3.m63894a(json);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
