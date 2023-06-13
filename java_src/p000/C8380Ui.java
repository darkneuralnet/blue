package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONException;
import p000.C9459Xi;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J*\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011H\u0007J0\u0010 \u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0011H\u0007R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010/\u001a\n ,*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m28432d2 = {"LUi;", "", "", "o", "Lov1;", "reason", "k", "LE1;", "accessTokenAppId", "LSi;", "appEvent", "h", "", "m", "l", "LTi;", "appEventCollection", "Lqv1;", "p", "flushResults", "", "Lcom/facebook/GraphRequest;", "j", "Luv5;", "appEvents", "", "limitEventUsage", "flushState", "i", "request", "LWD1;", "response", "n", "", C17296a.f69688o, "Ljava/lang/String;", "TAG", "", "b", "I", "NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER", "c", "LTi;", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledFuture;", "e", "Ljava/util/concurrent/ScheduledFuture;", "scheduledFuture", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "flushRunnable", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Ui */
/* loaded from: classes5.dex */
public final class C8380Ui {

    /* renamed from: a */
    public static final String f37804a;

    /* renamed from: b */
    public static final int f37805b;

    /* renamed from: c */
    public static volatile C7913Ti f37806c;

    /* renamed from: d */
    public static final ScheduledExecutorService f37807d;

    /* renamed from: e */
    public static ScheduledFuture<?> f37808e;

    /* renamed from: f */
    public static final Runnable f37809f;

    /* renamed from: g */
    public static final C8380Ui f37810g = new C8380Ui();

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Ui$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC8381a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C1706E1 f37811b;

        /* renamed from: c */
        public final /* synthetic */ C7508Si f37812c;

        public RunnableC8381a(C1706E1 c1706e1, C7508Si c7508Si) {
            this.f37811b = c1706e1;
            this.f37812c = c7508Si;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C8380Ui c8380Ui = C8380Ui.f37810g;
                C8380Ui.m81062a(c8380Ui).m83150a(this.f37811b, this.f37812c);
                if (C9459Xi.m76554d() != C9459Xi.EnumC9460a.EXPLICIT_ONLY && C8380Ui.m81062a(c8380Ui).m83147d() > C8380Ui.m81060c(c8380Ui)) {
                    C8380Ui.m81051l(EnumC46561ov1.EVENT_THRESHOLD);
                } else if (C8380Ui.m81059d(c8380Ui) == null) {
                    C8380Ui.m81056g(c8380Ui, C8380Ui.m81058e(c8380Ui).schedule(C8380Ui.m81061b(c8380Ui), 15, TimeUnit.SECONDS));
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LWD1;", "response", "", C17296a.f69688o, "(LWD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Ui$b */
    /* loaded from: classes5.dex */
    public static final class C8382b implements GraphRequest.InterfaceC17205b {

        /* renamed from: a */
        public final /* synthetic */ C1706E1 f37813a;

        /* renamed from: b */
        public final /* synthetic */ GraphRequest f37814b;

        /* renamed from: c */
        public final /* synthetic */ C50122uv5 f37815c;

        /* renamed from: d */
        public final /* synthetic */ C47747qv1 f37816d;

        public C8382b(C1706E1 c1706e1, GraphRequest graphRequest, C50122uv5 c50122uv5, C47747qv1 c47747qv1) {
            this.f37813a = c1706e1;
            this.f37814b = graphRequest;
            this.f37815c = c50122uv5;
            this.f37816d = c47747qv1;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public final void mo2794a(WD1 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            C8380Ui.m81049n(this.f37813a, this.f37814b, response, this.f37815c, this.f37816d);
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Ui$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC8383c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ EnumC46561ov1 f37817b;

        public RunnableC8383c(EnumC46561ov1 enumC46561ov1) {
            this.f37817b = enumC46561ov1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C8380Ui.m81051l(this.f37817b);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Ui$d */
    /* loaded from: classes5.dex */
    public static final class RunnableC8384d implements Runnable {

        /* renamed from: b */
        public static final RunnableC8384d f37818b = new RunnableC8384d();

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C8380Ui.m81056g(C8380Ui.f37810g, null);
                if (C9459Xi.m76554d() != C9459Xi.EnumC9460a.EXPLICIT_ONLY) {
                    C8380Ui.m81051l(EnumC46561ov1.TIMER);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Ui$e */
    /* loaded from: classes5.dex */
    public static final class RunnableC8385e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C1706E1 f37819b;

        /* renamed from: c */
        public final /* synthetic */ C50122uv5 f37820c;

        public RunnableC8385e(C1706E1 c1706e1, C50122uv5 c50122uv5) {
            this.f37819b = c1706e1;
            this.f37820c = c50122uv5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C8724Vi.m79555a(this.f37819b, this.f37820c);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: Ui$f */
    /* loaded from: classes5.dex */
    public static final class RunnableC8386f implements Runnable {

        /* renamed from: b */
        public static final RunnableC8386f f37821b = new RunnableC8386f();

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C8380Ui c8380Ui = C8380Ui.f37810g;
                C8724Vi.m79554b(C8380Ui.m81062a(c8380Ui));
                C8380Ui.m81057f(c8380Ui, new C7913Ti());
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    static {
        String name = C8380Ui.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "AppEventQueue::class.java.name");
        f37804a = name;
        f37805b = 100;
        f37806c = new C7913Ti();
        f37807d = Executors.newSingleThreadScheduledExecutor();
        f37809f = RunnableC8384d.f37818b;
    }

    private C8380Ui() {
    }

    /* renamed from: a */
    public static final /* synthetic */ C7913Ti m81062a(C8380Ui c8380Ui) {
        if (TD0.m84203d(C8380Ui.class)) {
            return null;
        }
        try {
            return f37806c;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ Runnable m81061b(C8380Ui c8380Ui) {
        if (TD0.m84203d(C8380Ui.class)) {
            return null;
        }
        try {
            return f37809f;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ int m81060c(C8380Ui c8380Ui) {
        if (TD0.m84203d(C8380Ui.class)) {
            return 0;
        }
        try {
            return f37805b;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
            return 0;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ ScheduledFuture m81059d(C8380Ui c8380Ui) {
        if (TD0.m84203d(C8380Ui.class)) {
            return null;
        }
        try {
            return f37808e;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ ScheduledExecutorService m81058e(C8380Ui c8380Ui) {
        if (TD0.m84203d(C8380Ui.class)) {
            return null;
        }
        try {
            return f37807d;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m81057f(C8380Ui c8380Ui, C7913Ti c7913Ti) {
        if (TD0.m84203d(C8380Ui.class)) {
            return;
        }
        try {
            f37806c = c7913Ti;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m81056g(C8380Ui c8380Ui, ScheduledFuture scheduledFuture) {
        if (TD0.m84203d(C8380Ui.class)) {
            return;
        }
        try {
            f37808e = scheduledFuture;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
        }
    }

    @JvmStatic
    /* renamed from: h */
    public static final void m81055h(C1706E1 accessTokenAppId, C7508Si appEvent) {
        if (TD0.m84203d(C8380Ui.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
            f37807d.execute(new RunnableC8381a(accessTokenAppId, appEvent));
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
        }
    }

    @JvmStatic
    /* renamed from: i */
    public static final GraphRequest m81054i(C1706E1 accessTokenAppId, C50122uv5 appEvents, boolean z, C47747qv1 flushState) {
        if (TD0.m84203d(C8380Ui.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String m109494b = accessTokenAppId.m109494b();
            boolean z2 = false;
            C34512Mk1 m93517o = C34746Nk1.m93517o(m109494b, false);
            GraphRequest.C17206c c17206c = GraphRequest.f69390s;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{m109494b}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            GraphRequest m52780x = c17206c.m52780x(null, format, null, null);
            Bundle m52829r = m52780x.m52829r();
            if (m52829r == null) {
                m52829r = new Bundle();
            }
            m52829r.putString("access_token", accessTokenAppId.m109495a());
            String m24331c = C45485n62.f99442b.m24331c();
            if (m24331c != null) {
                m52829r.putString("device_token", m24331c);
            }
            String m74454g = C9916Yi.m74454g();
            if (m74454g != null) {
                m52829r.putString("install_referrer", m74454g);
            }
            m52780x.m52850C(m52829r);
            if (m93517o != null) {
                z2 = m93517o.m94966p();
            }
            Context m52741e = C17216a.m52741e();
            Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
            int m9487e = appEvents.m9487e(m52780x, m52741e, z2, z);
            if (m9487e == 0) {
                return null;
            }
            flushState.m16790c(flushState.m16792a() + m9487e);
            m52780x.m52821z(new C8382b(accessTokenAppId, m52780x, appEvents, flushState));
            return m52780x;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: j */
    public static final List<GraphRequest> m81053j(C7913Ti appEventCollection, C47747qv1 flushResults) {
        if (TD0.m84203d(C8380Ui.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean m52727s = C17216a.m52727s(C17216a.m52741e());
            ArrayList arrayList = new ArrayList();
            for (C1706E1 c1706e1 : appEventCollection.m83145f()) {
                C50122uv5 m83148c = appEventCollection.m83148c(c1706e1);
                if (m83148c != null) {
                    GraphRequest m81054i = m81054i(c1706e1, m83148c, m52727s, flushResults);
                    if (m81054i != null) {
                        arrayList.add(m81054i);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: k */
    public static final void m81052k(EnumC46561ov1 reason) {
        if (TD0.m84203d(C8380Ui.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f37807d.execute(new RunnableC8383c(reason));
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
        }
    }

    @JvmStatic
    /* renamed from: l */
    public static final void m81051l(EnumC46561ov1 reason) {
        if (TD0.m84203d(C8380Ui.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f37806c.m83149b(C8724Vi.m79553c());
            try {
                C47747qv1 m81047p = m81047p(reason, f37806c);
                if (m81047p != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", m81047p.m16792a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", m81047p.m16791b());
                    C34603Mu2.m94592b(C17216a.m52741e()).m94590d(intent);
                }
            } catch (Exception e) {
                Log.w(f37804a, "Caught unexpected exception while flushing app events: ", e);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
        }
    }

    @JvmStatic
    /* renamed from: m */
    public static final Set<C1706E1> m81050m() {
        if (TD0.m84203d(C8380Ui.class)) {
            return null;
        }
        try {
            return f37806c.m83145f();
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: n */
    public static final void m81049n(C1706E1 accessTokenAppId, GraphRequest request, WD1 response, C50122uv5 appEvents, C47747qv1 flushState) {
        String str;
        if (TD0.m84203d(C8380Ui.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            FacebookRequestError m78704b = response.m78704b();
            String str2 = "Success";
            EnumC47154pv1 enumC47154pv1 = EnumC47154pv1.SUCCESS;
            boolean z = true;
            if (m78704b != null) {
                if (m78704b.m52866b() == -1) {
                    str2 = "Failed: No Connectivity";
                    enumC47154pv1 = EnumC47154pv1.NO_CONNECTIVITY;
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), m78704b.toString()}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                    enumC47154pv1 = EnumC47154pv1.SERVER_ERROR;
                }
            }
            if (C17216a.m52720z(EnumC36034Sx2.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) request.m52827t()).toString(2);
                    Intrinsics.checkNotNullExpressionValue(str, "jsonArray.toString(2)");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                C32992Fx2.f10539f.m106213d(EnumC36034Sx2.APP_EVENTS, f37804a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.m52833n()), str2, str);
            }
            if (m78704b == null) {
                z = false;
            }
            appEvents.m9490b(z);
            EnumC47154pv1 enumC47154pv12 = EnumC47154pv1.NO_CONNECTIVITY;
            if (enumC47154pv1 == enumC47154pv12) {
                C17216a.m52731o().execute(new RunnableC8385e(accessTokenAppId, appEvents));
            }
            if (enumC47154pv1 != EnumC47154pv1.SUCCESS && flushState.m16791b() != enumC47154pv12) {
                flushState.m16789d(enumC47154pv1);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
        }
    }

    @JvmStatic
    /* renamed from: o */
    public static final void m81048o() {
        if (TD0.m84203d(C8380Ui.class)) {
            return;
        }
        try {
            f37807d.execute(RunnableC8386f.f37821b);
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
        }
    }

    @JvmStatic
    /* renamed from: p */
    public static final C47747qv1 m81047p(EnumC46561ov1 reason, C7913Ti appEventCollection) {
        if (TD0.m84203d(C8380Ui.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            C47747qv1 c47747qv1 = new C47747qv1();
            List<GraphRequest> m81053j = m81053j(appEventCollection, c47747qv1);
            if (!(!m81053j.isEmpty())) {
                return null;
            }
            C32992Fx2.f10539f.m106213d(EnumC36034Sx2.APP_EVENTS, f37804a, "Flushing %d events due to %s.", Integer.valueOf(c47747qv1.m16792a()), reason.toString());
            for (GraphRequest graphRequest : m81053j) {
                graphRequest.m52837j();
            }
            return c47747qv1;
        } catch (Throwable th) {
            TD0.m84205b(th, C8380Ui.class);
            return null;
        }
    }
}
