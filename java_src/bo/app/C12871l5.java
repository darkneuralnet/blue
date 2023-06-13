package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0005B#\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\n¨\u0006\u0012"}, m28432d2 = {"Lbo/app/l5;", "Lbo/app/q2;", "Lorg/json/JSONObject;", "jsonObject", "", C17296a.f69688o, "Lbo/app/d5;", "session", "", "sessionId", "()Lbo/app/d5;", "storedOpenSession", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.l5 */
/* loaded from: classes.dex */
public final class C12871l5 implements InterfaceC13047q2 {

    /* renamed from: b */
    public static final C12872a f58855b = new C12872a(null);

    /* renamed from: a */
    private final SharedPreferences f58856a;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbo/app/l5$a;", "", "", "SESSION_STORAGE_FILENAME", "Ljava/lang/String;", "STORED_OPEN_SESSION_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l5$a */
    /* loaded from: classes.dex */
    public static final class C12872a {
        public /* synthetic */ C12872a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12872a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l5$b */
    /* loaded from: classes.dex */
    public static final class C12873b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12873b f58857b = new C12873b();

        public C12873b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set end time to now for session json data";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l5$c */
    /* loaded from: classes.dex */
    public static final class C12874c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12874c f58858b = new C12874c();

        public C12874c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "No stored open session in storage.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.l5$d */
    /* loaded from: classes.dex */
    public static final class C12875d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12875d f58859b = new C12875d();

        public C12875d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Could not create new mutable session for open session.";
        }
    }

    public C12871l5(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58856a = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.session_storage", C43318jS5.m30601c(context, str, str2)), 0);
    }

    @Override // bo.app.InterfaceC13047q2
    /* renamed from: a */
    public C12584d5 mo62908a() {
        String str = "";
        if (!this.f58856a.contains("current_open_session")) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12874c.f58858b, 7, null);
            return null;
        }
        try {
            String string = this.f58856a.getString(this.f58856a.getString("current_open_session", ""), "");
            if (string != null) {
                str = string;
            }
            return new C12584d5(new JSONObject(str));
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12875d.f58859b, 4, null);
            return null;
        }
    }

    @Override // bo.app.InterfaceC13047q2
    /* renamed from: a */
    public void mo62907a(C12584d5 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        String c12648f5 = session.m63839n().toString();
        JSONObject forJsonPut = session.forJsonPut();
        SharedPreferences.Editor edit = this.f58856a.edit();
        m63362a(forJsonPut);
        edit.putString(c12648f5, forJsonPut.toString());
        if (!session.m63836y()) {
            edit.putString("current_open_session", c12648f5);
        } else if (Intrinsics.areEqual(this.f58856a.getString("current_open_session", ""), c12648f5)) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    @Override // bo.app.InterfaceC13047q2
    /* renamed from: a */
    public void mo62905a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        SharedPreferences.Editor edit = this.f58856a.edit();
        edit.remove(sessionId);
        if (Intrinsics.areEqual(sessionId, this.f58856a.getString("current_open_session", null))) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    /* renamed from: a */
    private final void m63362a(JSONObject jSONObject) {
        if (jSONObject.has("end_time")) {
            return;
        }
        try {
            jSONObject.put("end_time", C46287oT0.m21026j());
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C12873b.f58857b, 4, null);
        }
    }
}
