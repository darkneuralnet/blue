package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import bo.app.C12954o1;
import bo.app.InterfaceC13189w1;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007J \u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J&\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u001e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0002¨\u0006\u0016"}, m28432d2 = {"Lbo/app/o1;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Ld20;", "geofenceList", "Landroid/app/PendingIntent;", "geofenceRequestIntent", "", "b", BaseGmsClient.KEY_PENDING_INTENT, "Lbo/app/w1;", "resultListener", C17296a.f69688o, "newGeofencesToRegister", "", "obsoleteGeofenceIds", "Landroid/content/SharedPreferences;", "c", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.o1 */
/* loaded from: classes.dex */
public final class C12954o1 {

    /* renamed from: a */
    public static final C12954o1 f58996a = new C12954o1();

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$a */
    /* loaded from: classes.dex */
    public static final class C12955a extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12955a f58997b = new C12955a();

        public C12955a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Deleting registered geofence cache.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$b */
    /* loaded from: classes.dex */
    public static final class C12956b extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12956b f58998b = new C12956b();

        public C12956b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences successfully registered with Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$c */
    /* loaded from: classes.dex */
    public static final class C12957c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f58999b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12957c(int i) {
            super(0);
            this.f58999b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ", Integer.valueOf(this.f58999b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$d */
    /* loaded from: classes.dex */
    public static final class C12958d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f59000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12958d(int i) {
            super(0);
            this.f59000b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ", Integer.valueOf(this.f59000b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$e */
    /* loaded from: classes.dex */
    public static final class C12959e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f59001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12959e(int i) {
            super(0);
            this.f59001b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ", Integer.valueOf(this.f59001b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$f */
    /* loaded from: classes.dex */
    public static final class C12960f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12960f f59002b = new C12960f();

        public C12960f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Received Geofence registration success code in failure block with Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$g */
    /* loaded from: classes.dex */
    public static final class C12961g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f59003b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12961g(int i) {
            super(0);
            this.f59003b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Geofence pending result returned unknown status code: ", Integer.valueOf(this.f59003b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$h */
    /* loaded from: classes.dex */
    public static final class C12962h extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12962h f59004b = new C12962h();

        public C12962h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofence exception encountered while adding geofences.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$i */
    /* loaded from: classes.dex */
    public static final class C12963i extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ List<String> f59005b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12963i(List<String> list) {
            super(0);
            this.f59005b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Un-registering " + this.f59005b.size() + " obsolete geofences from Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$j */
    /* loaded from: classes.dex */
    public static final class C12964j extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12964j f59006b = new C12964j();

        public C12964j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "No obsolete geofences need to be unregistered from Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$k */
    /* loaded from: classes.dex */
    public static final class C12965k extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ List<C39514d20> f59007b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12965k(List<C39514d20> list) {
            super(0);
            this.f59007b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Registering " + this.f59007b.size() + " new geofences with Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$l */
    /* loaded from: classes.dex */
    public static final class C12966l extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12966l f59008b = new C12966l();

        public C12966l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "No new geofences need to be registered with Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$m */
    /* loaded from: classes.dex */
    public static final class C12967m extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12967m f59009b = new C12967m();

        public C12967m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Exception while adding geofences.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$n */
    /* loaded from: classes.dex */
    public static final class C12968n extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59010b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12968n(String str) {
            super(0);
            this.f59010b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofence with id: " + this.f59010b + " removed from shared preferences.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$o */
    /* loaded from: classes.dex */
    public static final class C12969o extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12969o f59011b = new C12969o();

        public C12969o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofences successfully un-registered with Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$p */
    /* loaded from: classes.dex */
    public static final class C12970p extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f59012b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12970p(int i) {
            super(0);
            this.f59012b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ", Integer.valueOf(this.f59012b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$q */
    /* loaded from: classes.dex */
    public static final class C12971q extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f59013b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12971q(int i) {
            super(0);
            this.f59013b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ", Integer.valueOf(this.f59013b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$r */
    /* loaded from: classes.dex */
    public static final class C12972r extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f59014b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12972r(int i) {
            super(0);
            this.f59014b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Geofences cannot be un-registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ", Integer.valueOf(this.f59014b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$s */
    /* loaded from: classes.dex */
    public static final class C12973s extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12973s f59015b = new C12973s();

        public C12973s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Received Geofence un-registration success code in failure block with Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$t */
    /* loaded from: classes.dex */
    public static final class C12974t extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ int f59016b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12974t(int i) {
            super(0);
            this.f59016b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Geofence pending result returned unknown status code: ", Integer.valueOf(this.f59016b));
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$u */
    /* loaded from: classes.dex */
    public static final class C12975u extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12975u f59017b = new C12975u();

        public C12975u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofence exception encountered while removing geofences.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$v */
    /* loaded from: classes.dex */
    public static final class C12976v extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12976v f59018b = new C12976v();

        public C12976v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Requesting single location update from Google Play Services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$w */
    /* loaded from: classes.dex */
    public static final class C12977w extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12977w f59019b = new C12977w();

        public C12977w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Single location request from Google Play services was successful.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$x */
    /* loaded from: classes.dex */
    public static final class C12978x extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12978x f59020b = new C12978x();

        public C12978x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get single location update from Google Play services.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$y */
    /* loaded from: classes.dex */
    public static final class C12979y extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C12979y f59021b = new C12979y();

        public C12979y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to request location update due to exception.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.o1$z */
    /* loaded from: classes.dex */
    public static final class C12980z extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ C39514d20 f59022b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12980z(C39514d20 c39514d20) {
            super(0);
            this.f59022b = c39514d20;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Geofence with id: " + this.f59022b.getId() + " added to shared preferences.";
        }
    }

    private C12954o1() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m63243a(Context context, PendingIntent pendingIntent, final InterfaceC13189w1 resultListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        try {
            C43664k20.m29442e(C43664k20.f93782a, f58996a, null, null, false, C12976v.f59018b, 7, null);
            LocationRequest create = LocationRequest.create();
            Intrinsics.checkNotNullExpressionValue(create, "create()");
            create.setPriority(100);
            create.setNumUpdates(1);
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            LocationServices.getFusedLocationProviderClient(context).requestLocationUpdates(create, pendingIntent).addOnSuccessListener(new OnSuccessListener() { // from class: KO6
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C12954o1.m63238a(InterfaceC13189w1.this, (Void) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: LO6
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    C12954o1.m63239a(InterfaceC13189w1.this, exc);
                }
            });
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.W, e, false, C12979y.f59021b, 4, null);
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m63234b(Context context, List<C39514d20> geofenceList, PendingIntent geofenceRequestIntent) {
        int collectionSizeOrDefault;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        try {
            List<C39514d20> m63318a = C12900m1.m63318a(f58996a.m63236b(context));
            ArrayList<C39514d20> arrayList = new ArrayList();
            Iterator<T> it = geofenceList.iterator();
            while (true) {
                boolean z3 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C39514d20 c39514d20 = (C39514d20) next;
                if (!(m63318a instanceof Collection) || !m63318a.isEmpty()) {
                    for (C39514d20 c39514d202 : m63318a) {
                        if (Intrinsics.areEqual(c39514d202.getId(), c39514d20.getId()) && c39514d202.m44706b(c39514d20)) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                }
                z3 = true;
                if (z3) {
                    arrayList.add(next);
                }
            }
            ArrayList<C39514d20> arrayList2 = new ArrayList();
            for (Object obj : m63318a) {
                C39514d20 c39514d203 = (C39514d20) obj;
                if (!arrayList.isEmpty()) {
                    for (C39514d20 c39514d204 : arrayList) {
                        if (Intrinsics.areEqual(c39514d204.getId(), c39514d203.getId())) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    arrayList2.add(obj);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (C39514d20 c39514d205 : arrayList2) {
                arrayList3.add(c39514d205.getId());
            }
            if (!arrayList3.isEmpty()) {
                C43664k20 c43664k20 = C43664k20.f93782a;
                C12954o1 c12954o1 = f58996a;
                C43664k20.m29442e(c43664k20, c12954o1, null, null, false, new C12963i(arrayList3), 7, null);
                c12954o1.m63235b(context, arrayList3);
            } else {
                C43664k20.m29442e(C43664k20.f93782a, f58996a, null, null, false, C12964j.f59006b, 7, null);
            }
            if (!arrayList.isEmpty()) {
                C43664k20 c43664k202 = C43664k20.f93782a;
                C12954o1 c12954o12 = f58996a;
                C43664k20.m29442e(c43664k202, c12954o12, null, null, false, new C12965k(arrayList), 7, null);
                c12954o12.m63241a(context, arrayList, geofenceRequestIntent);
                return;
            }
            C43664k20.m29442e(C43664k20.f93782a, f58996a, null, null, false, C12966l.f59008b, 7, null);
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.E, e, false, C12967m.f59009b, 4, null);
        }
    }

    /* renamed from: c */
    private final void m63231c(Context context, List<C39514d20> list) {
        SharedPreferences.Editor edit = m63236b(context).edit();
        for (C39514d20 c39514d20 : list) {
            edit.putString(c39514d20.getId(), c39514d20.forJsonPut().toString());
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12980z(c39514d20), 6, null);
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63238a(InterfaceC13189w1 resultListener, Void r9) {
        Intrinsics.checkNotNullParameter(resultListener, "$resultListener");
        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.V, null, false, C12977w.f59019b, 6, null);
        resultListener.mo62846a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63239a(InterfaceC13189w1 resultListener, Exception exc) {
        Intrinsics.checkNotNullParameter(resultListener, "$resultListener");
        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.E, exc, false, C12978x.f59020b, 4, null);
        resultListener.mo62846a(false);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m63244a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C12954o1 c12954o1 = f58996a;
        C43664k20.m29442e(c43664k20, c12954o1, null, null, false, C12955a.f58997b, 7, null);
        c12954o1.m63236b(context).edit().clear().apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63240a(Context context, List newGeofencesToRegister, Void r10) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(newGeofencesToRegister, "$newGeofencesToRegister");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C12954o1 c12954o1 = f58996a;
        C43664k20.m29442e(c43664k20, c12954o1, null, null, false, C12956b.f58998b, 7, null);
        c12954o1.m63231c(context, newGeofencesToRegister);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m63237a(Exception exc) {
        if (exc instanceof ApiException) {
            int statusCode = ((ApiException) exc).getStatusCode();
            if (statusCode != 0) {
                switch (statusCode) {
                    case 1000:
                        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.W, null, false, new C12959e(statusCode), 6, null);
                        return;
                    case 1001:
                        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.W, null, false, new C12957c(statusCode), 6, null);
                        return;
                    case 1002:
                        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.W, null, false, new C12958d(statusCode), 6, null);
                        return;
                    default:
                        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.W, null, false, new C12961g(statusCode), 6, null);
                        return;
                }
            }
            C43664k20.m29442e(C43664k20.f93782a, f58996a, null, null, false, C12960f.f59002b, 7, null);
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.E, exc, false, C12962h.f59004b, 4, null);
    }

    /* renamed from: a */
    private final void m63242a(Context context, List<String> list) {
        SharedPreferences.Editor edit = m63236b(context).edit();
        for (String str : list) {
            edit.remove(str);
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C12968n(str), 6, null);
        }
        edit.apply();
    }

    /* renamed from: b */
    private final void m63235b(final Context context, final List<String> list) {
        LocationServices.getGeofencingClient(context).removeGeofences(list).addOnSuccessListener(new OnSuccessListener() { // from class: IO6
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C12954o1.m63233b(context, list, (Void) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: JO6
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C12954o1.m63232b(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m63233b(Context context, List obsoleteGeofenceIds, Void r10) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(obsoleteGeofenceIds, "$obsoleteGeofenceIds");
        C43664k20 c43664k20 = C43664k20.f93782a;
        C12954o1 c12954o1 = f58996a;
        C43664k20.m29442e(c43664k20, c12954o1, null, null, false, C12969o.f59011b, 7, null);
        c12954o1.m63242a(context, obsoleteGeofenceIds);
    }

    /* renamed from: a */
    private final void m63241a(final Context context, final List<C39514d20> list, PendingIntent pendingIntent) {
        int collectionSizeOrDefault;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C39514d20 c39514d20 : list) {
            arrayList.add(c39514d20.m44699x0());
        }
        GeofencingRequest build = new GeofencingRequest.Builder().addGeofences(arrayList).setInitialTrigger(0).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .a…r(0)\n            .build()");
        LocationServices.getGeofencingClient(context).addGeofences(build, pendingIntent).addOnSuccessListener(new OnSuccessListener() { // from class: MO6
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C12954o1.m63240a(context, list, (Void) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: NO6
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C12954o1.m63237a(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m63232b(Exception exc) {
        if (exc instanceof ApiException) {
            int statusCode = ((ApiException) exc).getStatusCode();
            if (statusCode != 0) {
                switch (statusCode) {
                    case 1000:
                        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.W, null, false, new C12972r(statusCode), 6, null);
                        return;
                    case 1001:
                        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.W, null, false, new C12970p(statusCode), 6, null);
                        return;
                    case 1002:
                        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.W, null, false, new C12971q(statusCode), 6, null);
                        return;
                    default:
                        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.W, null, false, new C12974t(statusCode), 6, null);
                        return;
                }
            }
            C43664k20.m29442e(C43664k20.f93782a, f58996a, null, null, false, C12973s.f59015b, 7, null);
            return;
        }
        C43664k20.m29442e(C43664k20.f93782a, f58996a, C43664k20.EnumC25082a.E, exc, false, C12975u.f59017b, 4, null);
    }

    /* renamed from: b */
    private final SharedPreferences m63236b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.support.geofences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ON, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
