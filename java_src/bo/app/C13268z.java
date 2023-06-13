package bo.app;

import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0007B)\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\u0002`\nH\u0016R$\u0010\f\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u0007\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, m28432d2 = {"Lbo/app/z;", "Lbo/app/r;", "Lbo/app/g2;", "externalPublisher", "Lbo/app/d;", "apiResponse", "", C17296a.f69688o, "", "", "Lcom/braze/communication/MutableHttpHeaders;", "existingHeaders", "userId", "Ljava/lang/String;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "", "containsNoNewData", "Z", "b", "()Z", "Lorg/json/JSONObject;", "l", "()Lorg/json/JSONObject;", "payload", "urlBase", "", "lastCardUpdatedAt", "lastFullSyncAt", "<init>", "(Ljava/lang/String;JJLjava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.z */
/* loaded from: classes.dex */
public final class C13268z extends AbstractC13065r {

    /* renamed from: v */
    public static final C13269a f59512v = new C13269a(null);

    /* renamed from: r */
    private final long f59513r;

    /* renamed from: s */
    private final long f59514s;

    /* renamed from: t */
    private String f59515t;

    /* renamed from: u */
    private final boolean f59516u;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, m28432d2 = {"Lbo/app/z$a;", "", "", "BRAZE_CONTENT_CARDS_HEADER", "Ljava/lang/String;", "LAST_CARD_UPDATED_AT_KEY", "LAST_FULL_SYNC_AT_KEY", "URL_EXTENSION", "USER_ID_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z$a */
    /* loaded from: classes.dex */
    public static final class C13269a {
        public /* synthetic */ C13269a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13269a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z$b */
    /* loaded from: classes.dex */
    public static final class C13270b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13270b f59517b = new C13270b();

        public C13270b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "ContentCardsSyncRequest executed successfully.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.z$c */
    /* loaded from: classes.dex */
    public static final class C13271c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13271c f59518b = new C13271c();

        public C13271c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Experienced JSONException while creating Content Cards request. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13268z(String urlBase, long j, long j2, String str) {
        super(new C13082r4(Intrinsics.stringPlus(urlBase, "content_cards/sync")));
        Intrinsics.checkNotNullParameter(urlBase, "urlBase");
        this.f59513r = j;
        this.f59514s = j2;
        this.f59515t = str;
    }

    /* renamed from: a */
    public String m62661a() {
        return this.f59515t;
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: b */
    public boolean mo62594b() {
        return this.f59516u;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[Catch: JSONException -> 0x0032, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0032, blocks: (B:5:0x0008, B:7:0x001c, B:13:0x0028), top: B:18:0x0008 }] */
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
            mo62580l.put("last_full_sync_at", this.f59514s);
            mo62580l.put("last_card_updated_at", this.f59513r);
            String m62661a = m62661a();
            if (m62661a != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(m62661a);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        mo62580l.put("user_id", m62661a());
                    }
                    return mo62580l;
                }
            }
            z = true;
            if (!z) {
            }
            return mo62580l;
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, C13271c.f59518b, 4, null);
            return null;
        }
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62597a(String str) {
        this.f59515t = str;
    }

    @Override // bo.app.InterfaceC12868l2
    /* renamed from: a */
    public void mo62660a(InterfaceC12658g2 externalPublisher, C12570d c12570d) {
        Intrinsics.checkNotNullParameter(externalPublisher, "externalPublisher");
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13270b.f59517b, 7, null);
    }

    @Override // bo.app.AbstractC13065r, bo.app.InterfaceC13280z1
    /* renamed from: a */
    public void mo62595a(Map<String, String> existingHeaders) {
        Intrinsics.checkNotNullParameter(existingHeaders, "existingHeaders");
        super.mo62595a(existingHeaders);
        existingHeaders.put("X-Braze-DataRequest", "true");
        existingHeaders.put("X-Braze-ContentCardsRequest", "true");
    }
}
