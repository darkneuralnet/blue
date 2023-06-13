package bo.app;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m28432d2 = {"Lbo/app/k1;", "Lbo/app/r;", "Lbo/app/g2;", "externalPublisher", "Lbo/app/d;", "apiResponse", "", C17296a.f69688o, "", "containsNoNewData", "Z", "b", "()Z", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "", "urlBase", "Lbo/app/u1;", "geofenceEvent", "<init>", "(Ljava/lang/String;Lbo/app/u1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.k1 */
/* loaded from: classes.dex */
public final class C12813k1 extends AbstractC13065r {

    /* renamed from: t */
    public static final C12814a f58750t = new C12814a(null);

    /* renamed from: r */
    private final InterfaceC13160u1 f58751r;

    /* renamed from: s */
    private final boolean f58752s;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbo/app/k1$a;", "", "", "GEOFENCE_EVENT", "Ljava/lang/String;", "URL_EXTENSION", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k1$a */
    /* loaded from: classes.dex */
    public static final class C12814a {
        public /* synthetic */ C12814a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12814a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k1$b */
    /* loaded from: classes.dex */
    public static final class C12815b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12815b f58753b = new C12815b();

        public C12815b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "GeofenceReportRequest executed successfully.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.k1$c */
    /* loaded from: classes.dex */
    public static final class C12816c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12816c f58754b = new C12816c();

        public C12816c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating geofence report request. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12813k1(String urlBase, InterfaceC13160u1 geofenceEvent) {
        super(new C13082r4(Intrinsics.stringPlus(urlBase, "geofence/report")));
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
        this.f58751r = geofenceEvent;
    }

    @Override // bo.app.InterfaceC12868l2
    /* renamed from: a */
    public void mo62660a(InterfaceC12658g2 externalPublisher, C12570d c12570d) {
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C12815b.f58753b, 7, null);
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: b */
    public boolean mo62594b() {
        return this.f58752s;
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: l */
    public JSONObject mo62580l() {
        JSONObject mo62580l = super.mo62580l();
        if (mo62580l == null) {
            return null;
        }
        try {
            mo62580l.put("geofence_event", this.f58751r.forJsonPut());
            return mo62580l;
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, C12816c.f58754b, 4, null);
            return null;
        }
    }
}
