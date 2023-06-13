package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R.\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\n\u0010\f¨\u0006\u0015"}, m28432d2 = {"Lbo/app/u4;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "signature", C17296a.f69688o, "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getSignature$annotations", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.u4 */
/* loaded from: classes.dex */
public final class C13165u4 {

    /* renamed from: e */
    public static final C13166a f59356e = new C13166a(null);

    /* renamed from: a */
    private final Context f59357a;

    /* renamed from: b */
    private final String f59358b;

    /* renamed from: c */
    private final String f59359c;

    /* renamed from: d */
    private final SharedPreferences f59360d;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lbo/app/u4$a;", "", "", "CACHED_SIGNATURE_KEY", "Ljava/lang/String;", "FILE_PREFIX", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u4$a */
    /* loaded from: classes.dex */
    public static final class C13166a {
        public /* synthetic */ C13166a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13166a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u4$b */
    /* loaded from: classes.dex */
    public static final class C13167b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13167b(String str) {
            super(0);
            this.f59361b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Setting signature to: ", this.f59361b);
        }
    }

    public C13165u4(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59357a = context;
        this.f59358b = str;
        this.f59359c = str2;
        this.f59360d = context.getSharedPreferences(Intrinsics.stringPlus("com.braze.storage.sdk_auth_cache", C43318jS5.m30601c(context, str, str2)), 0);
    }

    /* renamed from: a */
    public final String m62888a() {
        return this.f59360d.getString("auth_signature", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13165u4) {
            C13165u4 c13165u4 = (C13165u4) obj;
            return Intrinsics.areEqual(this.f59357a, c13165u4.f59357a) && Intrinsics.areEqual(this.f59358b, c13165u4.f59358b) && Intrinsics.areEqual(this.f59359c, c13165u4.f59359c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f59357a.hashCode() * 31;
        String str = this.f59358b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59359c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SdkAuthenticationCache(context=" + this.f59357a + ", userId=" + ((Object) this.f59358b) + ", apiKey=" + ((Object) this.f59359c) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: a */
    public final void m62887a(String str) {
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C13167b(str), 6, null);
        this.f59360d.edit().putString("auth_signature", str).apply();
    }
}
