package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B)\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0012"}, m28432d2 = {"Lbo/app/i0;", "Lbo/app/a;", "Lbo/app/h0;", "newDevice", "", C17296a.f69688o, "e", "f", "outboundObject", "", "isSuccessful", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.i0 */
/* loaded from: classes.dex */
public final class C12731i0 extends AbstractC12501a<C12697h0> {

    /* renamed from: e */
    public static final C12732a f58625e = new C12732a(null);

    /* renamed from: b */
    private final X10 f58626b;

    /* renamed from: c */
    public final SharedPreferences f58627c;

    /* renamed from: d */
    private C12697h0 f58628d;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lbo/app/i0$a;", "", "", "CACHED_DEVICE_KEY", "Ljava/lang/String;", "getCACHED_DEVICE_KEY$annotations", "()V", "FILE_PREFIX_V3", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i0$a */
    /* loaded from: classes.dex */
    public static final class C12732a {
        public /* synthetic */ C12732a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12732a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i0$b */
    /* loaded from: classes.dex */
    public static final class C12733b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12733b f58629b = new C12733b();

        public C12733b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception confirming and unlocking device cache.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i0$c */
    /* loaded from: classes.dex */
    public static final class C12734c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12734c f58630b = new C12734c();

        public C12734c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Device object cache cleared.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i0$d */
    /* loaded from: classes.dex */
    public static final class C12735d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12735d f58631b = new C12735d();

        public C12735d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception confirming and unlocking Json objects.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i0$e */
    /* loaded from: classes.dex */
    public static final class C12736e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12736e f58632b = new C12736e();

        public C12736e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception creating dirty outbound device on a jsonObject value. Returning the whole device.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.i0$f */
    /* loaded from: classes.dex */
    public static final class C12737f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12737f f58633b = new C12737f();

        public C12737f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception creating dirty outbound device. Returning the whole device.";
        }
    }

    public /* synthetic */ C12731i0(Context context, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    /* renamed from: a */
    public final void m63604a(C12697h0 c12697h0) {
        this.f58628d = c12697h0;
    }

    /* renamed from: e */
    public final void m63602e() {
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, C12734c.f58630b, 6, null);
        this.f58627c.edit().clear().apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r2.hasNext() == true) goto L18;
     */
    @Override // bo.app.AbstractC12501a
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C12697h0 mo63134d() {
        JSONObject forJsonPut;
        boolean z;
        String str = "{}";
        C12697h0 c12697h0 = this.f58628d;
        Iterator<String> it = null;
        if (c12697h0 == null) {
            forJsonPut = null;
        } else {
            forJsonPut = c12697h0.forJsonPut();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String string = this.f58627c.getString("cached_device", "{}");
            if (string != null) {
                str = string;
            }
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12735d.f58631b, 4, null);
        }
        JSONObject jSONObject2 = new JSONObject();
        if (forJsonPut != null) {
            it = forJsonPut.keys();
        }
        while (true) {
            if (it != null) {
                z = true;
            }
            z = false;
            if (z) {
                String next = it.next();
                Object opt = forJsonPut.opt(next);
                Object opt2 = jSONObject.opt(next);
                if (opt != null) {
                    if (opt instanceof JSONObject) {
                        if (opt2 != null) {
                            try {
                                if (!C31696Aj2.m115358a((JSONObject) opt, (JSONObject) opt2)) {
                                }
                            } catch (JSONException e2) {
                                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e2, false, C12736e.f58632b, 4, null);
                                return this.f58628d;
                            }
                        }
                        jSONObject2.put(next, opt);
                    } else if (Intrinsics.areEqual(opt, opt2)) {
                        continue;
                    } else {
                        try {
                            jSONObject2.put(next, opt);
                        } catch (JSONException e3) {
                            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e3, false, C12737f.f58633b, 4, null);
                            return this.f58628d;
                        }
                    }
                }
            } else {
                return C12697h0.f58558m.m63639a(this.f58626b, jSONObject2);
            }
        }
    }

    public C12731i0(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58626b = new X10(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.device_cache.v3", C43318jS5.m30601c(context, str, str2)), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…y), Context.MODE_PRIVATE)");
        this.f58627c = sharedPreferences;
    }

    @Override // bo.app.AbstractC12501a
    /* renamed from: a */
    public void mo63140b(C12697h0 outboundObject, boolean z) {
        String str = "{}";
        Intrinsics.checkNotNullParameter(outboundObject, "outboundObject");
        if (z) {
            try {
                String string = this.f58627c.getString("cached_device", "{}");
                if (string != null) {
                    str = string;
                }
                JSONObject jSONObject = new JSONObject(str);
                JSONObject forJsonPut = outboundObject.forJsonPut();
                SharedPreferences.Editor edit = this.f58627c.edit();
                edit.putString("cached_device", C31696Aj2.m115348k(jSONObject, forJsonPut).toString());
                edit.apply();
            } catch (JSONException e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12733b.f58629b, 4, null);
            }
        }
    }
}
