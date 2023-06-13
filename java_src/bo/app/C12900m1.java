package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import com.braze.receivers.BrazeActionReceiver;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u0005\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\u0011"}, m28432d2 = {"Lbo/app/m1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/app/PendingIntent;", "b", C17296a.f69688o, "Lbo/app/a5;", "serverConfigStorageProvider", "", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "Ld20;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.m1 */
/* loaded from: classes.dex */
public final class C12900m1 {

    /* renamed from: a */
    public static final C12900m1 f58913a = new C12900m1();

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m1$a */
    /* loaded from: classes.dex */
    public static final class C12901a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12901a f58914b = new C12901a();

        public C12901a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences enabled in server configuration.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m1$b */
    /* loaded from: classes.dex */
    public static final class C12902b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12902b f58915b = new C12902b();

        public C12902b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences explicitly disabled via server configuration.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m1$c */
    /* loaded from: classes.dex */
    public static final class C12903c extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12903c f58916b = new C12903c();

        public C12903c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences implicitly disabled via server configuration.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m1$d */
    /* loaded from: classes.dex */
    public static final class C12904d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12904d f58917b = new C12904d();

        public C12904d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Did not find stored geofences.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m1$e */
    /* loaded from: classes.dex */
    public static final class C12905e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12905e f58918b = new C12905e();

        public C12905e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to find stored geofence keys.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m1$f */
    /* loaded from: classes.dex */
    public static final class C12906f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12906f(String str) {
            super(0);
            this.f58919b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank serialized geofence string for geofence id " + this.f58919b + " from shared preferences. Not parsing.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m1$g */
    /* loaded from: classes.dex */
    public static final class C12907g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58920b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12907g(String str) {
            super(0);
            this.f58920b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Encountered Json exception while parsing stored geofence: ", this.f58920b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.m1$h */
    /* loaded from: classes.dex */
    public static final class C12908h extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f58921b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12908h(String str) {
            super(0);
            this.f58921b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Encountered unexpected exception while parsing stored geofence: ", this.f58921b);
        }
    }

    private C12900m1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final PendingIntent m63319a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("com.appboy.action.receiver.BRAZE_GEOFENCE_LOCATION_UPDATE").setClass(context, BrazeActionReceiver.class);
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, C38352b62.m64970c() | 134217728);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(context, 0, geofenceIntent, flags)");
        return broadcast;
    }

    @JvmStatic
    /* renamed from: b */
    public static final PendingIntent m63316b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent("com.appboy.action.receiver.BRAZE_GEOFENCE_UPDATE").setClass(context, BrazeActionReceiver.class);
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, C38352b62.m64970c() | 134217728);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(context, 0, geofenceIntent, flags)");
        return broadcast;
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m63317a(C12521a5 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (serverConfigStorageProvider.m63927n()) {
            if (serverConfigStorageProvider.m63928m()) {
                C43664k20.m29442e(C43664k20.f93782a, f58913a, C43664k20.EnumC25082a.I, null, false, C12901a.f58914b, 6, null);
                return true;
            }
            C43664k20.m29442e(C43664k20.f93782a, f58913a, C43664k20.EnumC25082a.I, null, false, C12902b.f58915b, 6, null);
            return false;
        }
        C43664k20.m29442e(C43664k20.f93782a, f58913a, C43664k20.EnumC25082a.I, null, false, C12903c.f58916b, 6, null);
        return false;
    }

    @JvmStatic
    /* renamed from: b */
    public static final int m63315b(C12521a5 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (serverConfigStorageProvider.m63935f() > 0) {
            return serverConfigStorageProvider.m63935f();
        }
        return 20;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070 A[SYNTHETIC] */
    @JvmStatic
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<C39514d20> m63318a(SharedPreferences sharedPreferences) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null || all.isEmpty()) {
            C43664k20.m29442e(C43664k20.f93782a, f58913a, null, null, false, C12904d.f58917b, 7, null);
            return arrayList;
        }
        Set<String> keySet = all.keySet();
        if (keySet.isEmpty()) {
            C43664k20.m29442e(C43664k20.f93782a, f58913a, C43664k20.EnumC25082a.W, null, false, C12905e.f58918b, 6, null);
            return arrayList;
        }
        for (String str : keySet) {
            String string = sharedPreferences.getString(str, null);
            if (string != null) {
                try {
                    isBlank = StringsKt__StringsJVMKt.isBlank(string);
                } catch (JSONException e) {
                    C43664k20.m29442e(C43664k20.f93782a, f58913a, C43664k20.EnumC25082a.E, e, false, new C12907g(string), 4, null);
                } catch (Exception e2) {
                    C43664k20.m29442e(C43664k20.f93782a, f58913a, C43664k20.EnumC25082a.E, e2, false, new C12908h(string), 4, null);
                }
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        C43664k20.m29442e(C43664k20.f93782a, f58913a, C43664k20.EnumC25082a.W, null, false, new C12906f(str), 6, null);
                    } else {
                        arrayList.add(new C39514d20(new JSONObject(string)));
                    }
                }
            }
            z = true;
            if (!z) {
            }
        }
        return arrayList;
    }
}
