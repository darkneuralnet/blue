package p000;

import android.graphics.Color;
import android.net.Uri;
import bo.app.C12793j3;
import bo.app.C13109s0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0017\u0018\u0000 A2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001BB\t\b\u0016¢\u0006\u0004\b;\u0010<B\u001d\b\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b;\u0010>Bc\b\u0012\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010#\u001a\u00020\u001c\u0012\b\b\u0001\u00100\u001a\u00020\n\u0012\b\b\u0001\u00104\u001a\u00020\n\u0012\u0006\u0010+\u001a\u00020$\u0012\b\b\u0001\u00108\u001a\u00020\n¢\u0006\u0004\b;\u0010@J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001b\u001a\u0004\u0018\u00010\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00100\u001a\u00020\n8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010/R\"\u00104\u001a\u00020\n8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\r\u001a\u0004\b2\u0010\u000f\"\u0004\b3\u0010/R\"\u00108\u001a\u00020\n8G@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\r\u001a\u0004\b6\u0010\u000f\"\u0004\b7\u0010/R\u0011\u0010:\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b9\u0010 ¨\u0006C"}, m28432d2 = {"LmT2;", "LaP1;", "Lorg/json/JSONObject;", "LDO1;", "", "v", "e", "b", "Lorg/json/JSONObject;", "jsonObject", "", "<set-?>", DateTokenConverter.CONVERTER_KEY, "I", "getId", "()I", "id", "LYj0;", "LYj0;", "P", "()LYj0;", "clickAction", "Landroid/net/Uri;", "f", "Landroid/net/Uri;", "R", "()Landroid/net/Uri;", "uri", "", "g", "Ljava/lang/String;", "z", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", Entry.TYPE_TEXT, "", "h", "Z", "x", "()Z", "setOpenUriInWebview", "(Z)V", "openUriInWebview", "i", "getBackgroundColor", "B", "(I)V", "backgroundColor", "j", "A", "D", "textColor", "k", "w", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "borderColor", "y", "stringId", "<init>", "()V", "darkThemeObject", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "darkThemeJsonObject", "(Lorg/json/JSONObject;Lorg/json/JSONObject;ILYj0;Ljava/lang/String;Ljava/lang/String;IIZI)V", "l", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: mT2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C45103mT2 implements InterfaceC37933aP1<JSONObject>, DO1 {

    /* renamed from: l */
    public static final C26102a f98059l = new C26102a(null);

    /* renamed from: m */
    public static final String f98060m = C43664k20.m29433n(C45103mT2.class);

    /* renamed from: b */
    public JSONObject f98061b;

    /* renamed from: c */
    public C12793j3 f98062c;

    /* renamed from: d */
    public int f98063d;

    /* renamed from: e */
    public EnumC37310Yj0 f98064e;

    /* renamed from: f */
    public Uri f98065f;

    /* renamed from: g */
    public String f98066g;

    /* renamed from: h */
    public boolean f98067h;

    /* renamed from: i */
    public int f98068i;

    /* renamed from: j */
    public int f98069j;

    /* renamed from: k */
    public int f98070k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, m28432d2 = {"LmT2$a;", "", "", "BG_COLOR", "Ljava/lang/String;", "BORDER_COLOR", "CLICK_ACTION", "ID", "OPEN_URI_IN_WEBVIEW", "TAG", "TEXT", "TEXT_COLOR", "URI", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: mT2$a */
    /* loaded from: classes2.dex */
    public static final class C26102a {
        public /* synthetic */ C26102a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26102a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: mT2$b */
    /* loaded from: classes2.dex */
    public static final class C26103b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C26103b f98071g = new C26103b();

        public C26103b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    public C45103mT2() {
        this.f98063d = -1;
        this.f98064e = EnumC37310Yj0.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.f98068i = parseColor;
        this.f98069j = -1;
        this.f98070k = parseColor;
    }

    /* renamed from: A */
    public final int m25557A() {
        return this.f98069j;
    }

    /* renamed from: B */
    public final void m25556B(int i) {
        this.f98068i = i;
    }

    /* renamed from: C */
    public final void m25555C(int i) {
        this.f98070k = i;
    }

    /* renamed from: D */
    public final void m25554D(int i) {
        this.f98069j = i;
    }

    /* renamed from: P */
    public final EnumC37310Yj0 m25553P() {
        return this.f98064e;
    }

    /* renamed from: R */
    public final Uri m25552R() {
        return this.f98065f;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f98063d);
            jSONObject.put("click_action", this.f98064e.toString());
            Uri uri = this.f98065f;
            if (uri != null) {
                jSONObject.put("uri", String.valueOf(uri));
            }
            jSONObject.putOpt(Entry.TYPE_TEXT, this.f98066g);
            jSONObject.put("bg_color", this.f98068i);
            jSONObject.put("text_color", this.f98069j);
            jSONObject.put("use_webview", this.f98067h);
            jSONObject.put("border_color", this.f98070k);
            return jSONObject;
        } catch (JSONException unused) {
            return this.f98061b;
        }
    }

    public final int getBackgroundColor() {
        return this.f98068i;
    }

    @Override // p000.DO1
    /* renamed from: v */
    public void mo14014v() {
        C12793j3 c12793j3 = this.f98062c;
        if (c12793j3 == null) {
            C43664k20.m29441f(C43664k20.f93782a, f98060m, null, null, false, C26103b.f98071g, 14, null);
            return;
        }
        if (c12793j3.m63486a() != null) {
            m25556B(c12793j3.m63486a().intValue());
        }
        if (c12793j3.m63484c() != null) {
            m25554D(c12793j3.m63484c().intValue());
        }
        if (c12793j3.m63485b() != null) {
            m25555C(c12793j3.m63485b().intValue());
        }
    }

    /* renamed from: w */
    public final int m25550w() {
        return this.f98070k;
    }

    /* renamed from: x */
    public final boolean m25549x() {
        return this.f98067h;
    }

    /* renamed from: y */
    public final String m25548y() {
        return String.valueOf(this.f98063d);
    }

    /* renamed from: z */
    public final String m25547z() {
        return this.f98066g;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C45103mT2(JSONObject jsonObject, JSONObject jSONObject) {
        this(jsonObject, jSONObject, r5, r6, r7, r8, jsonObject.optInt("bg_color"), jsonObject.optInt("text_color"), jsonObject.optBoolean("use_webview", false), jsonObject.optInt("border_color"));
        EnumC37310Yj0 enumC37310Yj0;
        String upperCase;
        EnumC37310Yj0[] values;
        int length;
        int i;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        int optInt = jsonObject.optInt("id", -1);
        EnumC37310Yj0 enumC37310Yj02 = EnumC37310Yj0.NEWS_FEED;
        try {
            C13109s0 c13109s0 = C13109s0.f59272a;
            String string = jsonObject.getString("click_action");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            values = EnumC37310Yj0.values();
            length = values.length;
            i = 0;
        } catch (Exception unused) {
            enumC37310Yj0 = enumC37310Yj02;
        }
        while (i < length) {
            EnumC37310Yj0 enumC37310Yj03 = values[i];
            i++;
            if (Intrinsics.areEqual(enumC37310Yj03.name(), upperCase)) {
                enumC37310Yj0 = enumC37310Yj03;
                String optString = jsonObject.optString("uri");
                String optString2 = jsonObject.optString(Entry.TYPE_TEXT);
                Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(TEXT)");
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C45103mT2(JSONObject jSONObject, JSONObject jSONObject2, int i, EnumC37310Yj0 enumC37310Yj0, String str, String str2, int i2, int i3, boolean z, int i4) {
        boolean z2;
        boolean isBlank;
        this.f98063d = -1;
        this.f98064e = EnumC37310Yj0.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.f98068i = parseColor;
        this.f98069j = -1;
        this.f98070k = parseColor;
        this.f98061b = jSONObject;
        this.f98063d = i;
        this.f98064e = enumC37310Yj0;
        if (enumC37310Yj0 == EnumC37310Yj0.URI) {
            if (str != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (!isBlank) {
                    z2 = false;
                    if (!z2) {
                        this.f98065f = Uri.parse(str);
                    }
                }
            }
            z2 = true;
            if (!z2) {
            }
        }
        this.f98066g = str2;
        this.f98068i = i2;
        this.f98069j = i3;
        this.f98067h = z;
        this.f98070k = i4;
        this.f98062c = jSONObject2 == null ? null : new C12793j3(jSONObject2);
    }
}
