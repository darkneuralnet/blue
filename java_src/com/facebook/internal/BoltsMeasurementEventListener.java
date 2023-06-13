package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Detail;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener;", "Landroid/content/BroadcastReceiver;", "", "finalize", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "intent", "onReceive", "f", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: b */
    public static BoltsMeasurementEventListener f69464b;

    /* renamed from: a */
    public final Context f69467a;

    /* renamed from: d */
    public static final C17230a f69466d = new C17230a(null);

    /* renamed from: c */
    public static final String f69465c = "com.parse.bolts.measurement_event";

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Lcom/facebook/internal/BoltsMeasurementEventListener$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/facebook/internal/BoltsMeasurementEventListener;", C17296a.f69688o, "", "BOLTS_MEASUREMENT_EVENT_PREFIX", "Ljava/lang/String;", "MEASUREMENT_EVENT_ARGS_KEY", "MEASUREMENT_EVENT_NAME_KEY", "singleton", "Lcom/facebook/internal/BoltsMeasurementEventListener;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.internal.BoltsMeasurementEventListener$a */
    /* loaded from: classes5.dex */
    public static final class C17230a {
        private C17230a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final BoltsMeasurementEventListener m52688a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (BoltsMeasurementEventListener.m52694a() != null) {
                return BoltsMeasurementEventListener.m52694a();
            }
            BoltsMeasurementEventListener boltsMeasurementEventListener = new BoltsMeasurementEventListener(context, null);
            BoltsMeasurementEventListener.m52693b(boltsMeasurementEventListener);
            BoltsMeasurementEventListener.m52692c(boltsMeasurementEventListener);
            return BoltsMeasurementEventListener.m52694a();
        }

        public /* synthetic */ C17230a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BoltsMeasurementEventListener(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f69467a = applicationContext;
    }

    /* renamed from: a */
    public static final /* synthetic */ BoltsMeasurementEventListener m52694a() {
        if (TD0.m84203d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f69464b;
        } catch (Throwable th) {
            TD0.m84205b(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m52693b(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (TD0.m84203d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            boltsMeasurementEventListener.m52689f();
        } catch (Throwable th) {
            TD0.m84205b(th, BoltsMeasurementEventListener.class);
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m52692c(BoltsMeasurementEventListener boltsMeasurementEventListener) {
        if (TD0.m84203d(BoltsMeasurementEventListener.class)) {
            return;
        }
        try {
            f69464b = boltsMeasurementEventListener;
        } catch (Throwable th) {
            TD0.m84205b(th, BoltsMeasurementEventListener.class);
        }
    }

    @JvmStatic
    /* renamed from: e */
    public static final BoltsMeasurementEventListener m52690e(Context context) {
        if (TD0.m84203d(BoltsMeasurementEventListener.class)) {
            return null;
        }
        try {
            return f69466d.m52688a(context);
        } catch (Throwable th) {
            TD0.m84205b(th, BoltsMeasurementEventListener.class);
            return null;
        }
    }

    /* renamed from: d */
    public final void m52691d() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            C34603Mu2 m94592b = C34603Mu2.m94592b(this.f69467a);
            Intrinsics.checkNotNullExpressionValue(m94592b, "LocalBroadcastManager.ge…tance(applicationContext)");
            m94592b.m94589e(this);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: f */
    public final void m52689f() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            C34603Mu2 m94592b = C34603Mu2.m94592b(this.f69467a);
            Intrinsics.checkNotNullExpressionValue(m94592b, "LocalBroadcastManager.ge…tance(applicationContext)");
            m94592b.m94591c(this, new IntentFilter(f69465c));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    public final void finalize() throws Throwable {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            m52691d();
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        Bundle bundle;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            C45485n62 c45485n62 = new C45485n62(context);
            StringBuilder sb = new StringBuilder();
            sb.append("bf_");
            Set<String> set = null;
            if (intent != null) {
                str = intent.getStringExtra(AnalyticsRequestV2.PARAM_EVENT_NAME);
            } else {
                str = null;
            }
            sb.append(str);
            String sb2 = sb.toString();
            if (intent != null) {
                bundle = intent.getBundleExtra("event_args");
            } else {
                bundle = null;
            }
            Bundle bundle2 = new Bundle();
            if (bundle != null) {
                set = bundle.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle2.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, Detail.EMPTY_CHAR), ""), ""), (String) bundle.get(key));
                }
            }
            c45485n62.m24341e(sb2, bundle2);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    public /* synthetic */ BoltsMeasurementEventListener(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
