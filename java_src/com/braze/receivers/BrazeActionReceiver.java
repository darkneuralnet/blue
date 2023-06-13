package com.braze.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import bo.app.C12914n;
import bo.app.EnumC12867l1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.BrazeInternal;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.android.gms.location.LocationResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000b"}, m28432d2 = {"Lcom/braze/receivers/BrazeActionReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class BrazeActionReceiver extends BroadcastReceiver {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00032\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lcom/braze/receivers/BrazeActionReceiver$a;", "", "", DateTokenConverter.CONVERTER_KEY, "", "b", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", "applicationContext", "Landroid/content/Intent;", "Landroid/content/Intent;", "intent", "", "c", "Ljava/lang/String;", "action", "<init>", "(Landroid/content/Context;Landroid/content/Intent;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.receivers.BrazeActionReceiver$a */
    /* loaded from: classes2.dex */
    public static final class C17055a {

        /* renamed from: d */
        public static final C17056a f69012d = new C17056a(null);

        /* renamed from: a */
        public final Context f69013a;

        /* renamed from: b */
        public final Intent f69014b;

        /* renamed from: c */
        public final String f69015c;

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, m28432d2 = {"Lcom/braze/receivers/BrazeActionReceiver$a$a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/google/android/gms/location/LocationResult;", "locationResult", "", "c", "Lcom/google/android/gms/location/GeofencingEvent;", "geofenceEvent", "b", "Landroid/location/Location;", "location", C17296a.f69688o, "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a */
        /* loaded from: classes2.dex */
        public static final class C17056a {

            @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C17057a extends Lambda implements Function0<String> {

                /* renamed from: g */
                public final /* synthetic */ int f69016g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C17057a(int i) {
                    super(0);
                    this.f69016g = i;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final String invoke() {
                    return Intrinsics.stringPlus("Location Services error: ", Integer.valueOf(this.f69016g));
                }
            }

            @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$b */
            /* loaded from: classes2.dex */
            public static final class C17058b extends Lambda implements Function0<String> {

                /* renamed from: g */
                public final /* synthetic */ int f69017g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C17058b(int i) {
                    super(0);
                    this.f69017g = i;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final String invoke() {
                    return Intrinsics.stringPlus("Unsupported transition type received: ", Integer.valueOf(this.f69017g));
                }
            }

            @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$c */
            /* loaded from: classes2.dex */
            public static final class C17059c extends Lambda implements Function0<String> {

                /* renamed from: g */
                public static final C17059c f69018g = new C17059c();

                public C17059c() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final String invoke() {
                    return "Exception while processing location result";
                }
            }

            @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
            /* renamed from: com.braze.receivers.BrazeActionReceiver$a$a$d */
            /* loaded from: classes2.dex */
            public static final class C17060d extends Lambda implements Function0<String> {

                /* renamed from: g */
                public static final C17060d f69019g = new C17060d();

                public C17060d() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a */
                public final String invoke() {
                    return "Exception while processing single location update";
                }
            }

            public /* synthetic */ C17056a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final boolean m53237a(Context context, Location location) {
                try {
                    BrazeInternal.logLocationRecordedEvent(context, new C12914n(location));
                    return true;
                } catch (Exception e) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C17060d.f69019g, 4, null);
                    return false;
                }
            }

            /* renamed from: b */
            public final boolean m53236b(Context applicationContext, GeofencingEvent geofenceEvent) {
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
                if (geofenceEvent.hasError()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C17057a(geofenceEvent.getErrorCode()), 6, null);
                    return false;
                }
                int geofenceTransition = geofenceEvent.getGeofenceTransition();
                List<Geofence> triggeringGeofences = geofenceEvent.getTriggeringGeofences();
                Intrinsics.checkNotNullExpressionValue(triggeringGeofences, "geofenceEvent.triggeringGeofences");
                if (1 == geofenceTransition) {
                    for (Geofence geofence : triggeringGeofences) {
                        String requestId = geofence.getRequestId();
                        Intrinsics.checkNotNullExpressionValue(requestId, "geofence.requestId");
                        BrazeInternal.recordGeofenceTransition(applicationContext, requestId, EnumC12867l1.ENTER);
                    }
                } else if (2 == geofenceTransition) {
                    for (Geofence geofence2 : triggeringGeofences) {
                        String requestId2 = geofence2.getRequestId();
                        Intrinsics.checkNotNullExpressionValue(requestId2, "geofence.requestId");
                        BrazeInternal.recordGeofenceTransition(applicationContext, requestId2, EnumC12867l1.EXIT);
                    }
                } else {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C17058b(geofenceTransition), 6, null);
                    return false;
                }
                return true;
            }

            /* renamed from: c */
            public final boolean m53235c(Context applicationContext, LocationResult locationResult) {
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                Intrinsics.checkNotNullParameter(locationResult, "locationResult");
                try {
                    Location lastLocation = locationResult.getLastLocation();
                    Intrinsics.checkNotNullExpressionValue(lastLocation, "locationResult.lastLocation");
                    BrazeInternal.requestGeofenceRefresh(applicationContext, new C12914n(lastLocation));
                    return true;
                } catch (Exception e) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, C17059c.f69018g, 4, null);
                    return false;
                }
            }

            private C17056a() {
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$b */
        /* loaded from: classes2.dex */
        public static final class C17061b extends Lambda implements Function0<String> {
            public C17061b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Received intent with action ", C17055a.this.f69015c);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$c */
        /* loaded from: classes2.dex */
        public static final class C17062c extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C17062c f69021g = new C17062c();

            public C17062c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Received intent with null action. Doing nothing.";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$d */
        /* loaded from: classes2.dex */
        public static final class C17063d extends Lambda implements Function0<String> {
            public C17063d() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("BrazeActionReceiver received intent with location result: ", C17055a.this.f69015c);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$e */
        /* loaded from: classes2.dex */
        public static final class C17064e extends Lambda implements Function0<String> {
            public C17064e() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("BrazeActionReceiver received intent without location result: ", C17055a.this.f69015c);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$f */
        /* loaded from: classes2.dex */
        public static final class C17065f extends Lambda implements Function0<String> {
            public C17065f() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("BrazeActionReceiver received intent with geofence transition: ", C17055a.this.f69015c);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$g */
        /* loaded from: classes2.dex */
        public static final class C17066g extends Lambda implements Function0<String> {
            public C17066g() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("BrazeActionReceiver received intent with single location update: ", C17055a.this.f69015c);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$h */
        /* loaded from: classes2.dex */
        public static final class C17067h extends Lambda implements Function0<String> {
            public C17067h() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Unknown intent received in BrazeActionReceiver with action: ", C17055a.this.f69015c);
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.braze.receivers.BrazeActionReceiver$a$i */
        /* loaded from: classes2.dex */
        public static final class C17068i extends Lambda implements Function0<String> {
            public C17068i() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Caught exception while performing the BrazeActionReceiver work. Action: " + ((Object) C17055a.this.f69015c) + " Intent: " + C17055a.this.f69014b;
            }
        }

        public C17055a(Context applicationContext, Intent intent) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f69013a = applicationContext;
            this.f69014b = intent;
            this.f69015c = intent.getAction();
        }

        /* renamed from: b */
        public final boolean m53240b() {
            Object parcelable;
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29442e(c43664k20, this, null, null, false, new C17061b(), 7, null);
            String str = this.f69015c;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1382373484) {
                    if (hashCode != 94647129) {
                        if (hashCode == 1794335912 && str.equals("com.appboy.action.receiver.BRAZE_GEOFENCE_UPDATE")) {
                            C43664k20.m29442e(c43664k20, this, null, null, false, new C17065f(), 7, null);
                            C17056a c17056a = f69012d;
                            Context context = this.f69013a;
                            GeofencingEvent fromIntent = GeofencingEvent.fromIntent(this.f69014b);
                            Intrinsics.checkNotNullExpressionValue(fromIntent, "fromIntent(intent)");
                            return c17056a.m53236b(context, fromIntent);
                        }
                    } else if (str.equals("com.appboy.action.receiver.SINGLE_LOCATION_UPDATE")) {
                        Object obj = null;
                        Location location = null;
                        C43664k20.m29442e(c43664k20, this, null, null, false, new C17066g(), 7, null);
                        if (Build.VERSION.SDK_INT >= 33) {
                            Bundle extras = this.f69014b.getExtras();
                            if (extras != null) {
                                parcelable = extras.getParcelable("location", Location.class);
                                location = (Location) parcelable;
                            }
                        } else {
                            Bundle extras2 = this.f69014b.getExtras();
                            if (extras2 != null) {
                                obj = extras2.get("location");
                            }
                            location = (Location) obj;
                        }
                        if (location == null || !f69012d.m53237a(this.f69013a, location)) {
                            return false;
                        }
                        return true;
                    }
                } else if (str.equals("com.appboy.action.receiver.BRAZE_GEOFENCE_LOCATION_UPDATE")) {
                    if (LocationResult.hasResult(this.f69014b)) {
                        C43664k20.m29442e(c43664k20, this, null, null, false, new C17063d(), 7, null);
                        C17056a c17056a2 = f69012d;
                        Context context2 = this.f69013a;
                        LocationResult extractResult = LocationResult.extractResult(this.f69014b);
                        Intrinsics.checkNotNullExpressionValue(extractResult, "extractResult(intent)");
                        return c17056a2.m53235c(context2, extractResult);
                    }
                    C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, new C17064e(), 6, null);
                    return false;
                }
                C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.W, null, false, new C17067h(), 6, null);
                return false;
            }
            C43664k20.m29442e(c43664k20, this, null, null, false, C17062c.f69021g, 7, null);
            return false;
        }

        /* renamed from: d */
        public final void m53238d() {
            try {
                m53240b();
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C17068i(), 4, null);
            }
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.receivers.BrazeActionReceiver$b */
    /* loaded from: classes2.dex */
    public static final class C17069b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17069b f69028g = new C17069b();

        public C17069b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "BrazeActionReceiver received null intent. Doing nothing.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.braze.receivers.BrazeActionReceiver$c */
    /* loaded from: classes2.dex */
    public static final class C17070c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C17070c f69029g = new C17070c();

        public C17070c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "BrazeActionReceiver received null context. Doing nothing.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.receivers.BrazeActionReceiver$onReceive$3", m28418f = "BrazeActionReceiver.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.braze.receivers.BrazeActionReceiver$d */
    /* loaded from: classes2.dex */
    public static final class C17071d extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f69030h;

        /* renamed from: i */
        public final /* synthetic */ C17055a f69031i;

        /* renamed from: j */
        public final /* synthetic */ BroadcastReceiver.PendingResult f69032j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17071d(C17055a c17055a, BroadcastReceiver.PendingResult pendingResult, Continuation<? super C17071d> continuation) {
            super(2, continuation);
            this.f69031i = c17055a;
            this.f69032j = pendingResult;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C17071d) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C17071d(this.f69031i, this.f69032j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f69030h == 0) {
                ResultKt.throwOnFailure(obj);
                this.f69031i.m53238d();
                this.f69032j.finish();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C17069b.f69028g, 6, null);
        } else if (context == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C17070c.f69029g, 6, null);
        } else {
            Context applicationContext = context.getApplicationContext();
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            Z30.m73800d(VC1.f38731b, T41.m84377b(), null, new C17071d(new C17055a(applicationContext, intent), goAsync, null), 2, null);
        }
    }
}
