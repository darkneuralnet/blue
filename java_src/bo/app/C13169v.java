package bo.app;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\f"}, m28432d2 = {"Lbo/app/v;", "", "Landroid/content/Intent;", "intent", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lbo/app/o3;", C17296a.f69688o, "Landroid/net/NetworkCapabilities;", "networkCapabilities", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.v */
/* loaded from: classes.dex */
public final class C13169v {

    /* renamed from: a */
    public static final C13169v f59362a = new C13169v();

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.v$a */
    /* loaded from: classes.dex */
    public static final class C13170a extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ NetworkCapabilities f59363b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13170a(NetworkCapabilities networkCapabilities) {
            super(0);
            this.f59363b = networkCapabilities;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Capabilities changed. ", this.f59363b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.v$b */
    /* loaded from: classes.dex */
    public static final class C13171b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13171b(String str) {
            super(0);
            this.f59364b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Unexpected system broadcast received [" + ((Object) this.f59364b) + ']';
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.v$c */
    /* loaded from: classes.dex */
    public static final class C13172c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13172c f59365b = new C13172c();

        public C13172c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
        }
    }

    private C13169v() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final EnumC12982o3 m62884a(Intent intent, ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        String action = intent.getAction();
        if (Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", action)) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
                if (activeNetworkInfo != null && !booleanExtra) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type == 1 || type == 6) {
                            return EnumC12982o3.GREAT;
                        }
                        if (type != 9) {
                            return EnumC12982o3.NONE;
                        }
                        return EnumC12982o3.GOOD;
                    }
                    int subtype = activeNetworkInfo.getSubtype();
                    if (subtype != 3) {
                        if (subtype != 13 && subtype != 20) {
                            return EnumC12982o3.BAD;
                        }
                        return EnumC12982o3.GREAT;
                    }
                    return EnumC12982o3.GOOD;
                }
                return EnumC12982o3.NONE;
            } catch (SecurityException e) {
                C43664k20.m29442e(C43664k20.f93782a, f59362a, C43664k20.EnumC25082a.E, e, false, C13172c.f59365b, 4, null);
                return EnumC12982o3.NONE;
            }
        }
        C43664k20.m29442e(C43664k20.f93782a, f59362a, C43664k20.EnumC25082a.W, null, false, new C13171b(action), 6, null);
        return EnumC12982o3.NONE;
    }

    @JvmStatic
    /* renamed from: a */
    public static final EnumC12982o3 m62883a(NetworkCapabilities networkCapabilities) {
        C43664k20.m29442e(C43664k20.f93782a, f59362a, C43664k20.EnumC25082a.V, null, false, new C13170a(networkCapabilities), 6, null);
        if (networkCapabilities == null) {
            return EnumC12982o3.NONE;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (min > 14000) {
            return EnumC12982o3.GREAT;
        }
        if (min > 4000) {
            return EnumC12982o3.GOOD;
        }
        return EnumC12982o3.BAD;
    }
}
