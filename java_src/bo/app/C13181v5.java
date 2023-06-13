package bo.app;

import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B/\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\u0007\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, m28432d2 = {"Lbo/app/v5;", "Lbo/app/r;", "Lbo/app/g2;", "externalPublisher", "Lbo/app/d;", "apiResponse", "", C17296a.f69688o, "", "userId", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "", "b", "()Z", "containsNoNewData", "doesSendOptionalData", "Z", "g", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "urlBase", "", "deviceLogs", "", "logCreationTime", "<init>", "(Ljava/lang/String;Ljava/util/List;JLjava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.v5 */
/* loaded from: classes.dex */
public final class C13181v5 extends AbstractC13065r {

    /* renamed from: v */
    public static final C13182a f59380v = new C13182a(null);

    /* renamed from: r */
    private final List<String> f59381r;

    /* renamed from: s */
    private final long f59382s;

    /* renamed from: t */
    private String f59383t;

    /* renamed from: u */
    private final boolean f59384u;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, m28432d2 = {"Lbo/app/v5$a;", "", "", "DEVICE_LOGS_CREATION_TIME_KEY", "Ljava/lang/String;", "DEVICE_LOGS_DATA_KEY", "DEVICE_LOGS_USER_ID_KEY", "TEST_USER_DATA_OBJECT_KEY", "URL_EXTENSION", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.v5$a */
    /* loaded from: classes.dex */
    public static final class C13182a {
        public /* synthetic */ C13182a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13182a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.v5$b */
    /* loaded from: classes.dex */
    public static final class C13183b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13183b f59385b = new C13183b();

        public C13183b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "TestUserDeviceLog executed successfully.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.v5$c */
    /* loaded from: classes.dex */
    public static final class C13184c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13184c f59386b = new C13184c();

        public C13184c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13181v5(String urlBase, List<String> deviceLogs, long j, String str) {
        super(new C13082r4(Intrinsics.stringPlus(urlBase, MessageExtension.FIELD_DATA)));
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(deviceLogs, "deviceLogs");
        this.f59381r = deviceLogs;
        this.f59382s = j;
        this.f59383t = str;
        this.f59384u = true;
    }

    /* renamed from: a */
    public String m62860a() {
        return this.f59383t;
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: b */
    public boolean mo62594b() {
        return this.f59381r.isEmpty() && super.mo62594b();
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: g */
    public boolean mo62584g() {
        return this.f59384u;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[Catch: JSONException -> 0x0051, TryCatch #0 {JSONException -> 0x0051, blocks: (B:5:0x0008, B:7:0x001a, B:13:0x0026, B:14:0x002f, B:16:0x0037, B:17:0x0043), top: B:22:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[Catch: JSONException -> 0x0051, TryCatch #0 {JSONException -> 0x0051, blocks: (B:5:0x0008, B:7:0x001a, B:13:0x0026, B:14:0x002f, B:16:0x0037, B:17:0x0043), top: B:22:0x0008 }] */
    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject mo62580l() {
        boolean z;
        boolean isBlank;
        JSONObject mo62580l = super.mo62580l();
        if (mo62580l == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", this.f59382s);
            String m62860a = m62860a();
            if (m62860a != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(m62860a);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        jSONObject.put("user_id", m62860a());
                    }
                    if (!this.f59381r.isEmpty()) {
                        jSONObject.put("device_logs", new JSONArray((Collection) this.f59381r));
                    }
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    mo62580l.put("test_user_data", jSONArray);
                    return mo62580l;
                }
            }
            z = true;
            if (!z) {
            }
            if (!this.f59381r.isEmpty()) {
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject);
            mo62580l.put("test_user_data", jSONArray2);
            return mo62580l;
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C13184c.f59386b, 4, null);
            return null;
        }
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62597a(String str) {
        this.f59383t = str;
    }

    @Override // bo.app.InterfaceC12868l2
    /* renamed from: a */
    public void mo62660a(InterfaceC12658g2 externalPublisher, C12570d c12570d) {
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13183b.f59385b, 7, null);
    }
}
