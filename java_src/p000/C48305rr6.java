package p000;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.stripe.android.core.networking.AnalyticsFields;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: rr6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C48305rr6 {

    /* renamed from: e */
    public static final String f107786e = "rr6";

    /* renamed from: f */
    public static C48305rr6 f107787f;

    /* renamed from: b */
    public WeakReference<Activity> f107789b;

    /* renamed from: c */
    public Timer f107790c;

    /* renamed from: d */
    public String f107791d = null;

    /* renamed from: a */
    public final Handler f107788a = new Handler(Looper.getMainLooper());

    /* renamed from: rr6$a */
    /* loaded from: classes5.dex */
    public class C28038a extends TimerTask {
        public C28038a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) C48305rr6.m15168a(C48305rr6.this).get();
                View m77975e = C9155Wi.m77975e(activity);
                if (activity != null && m77975e != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (!C35690Rl0.m86341j()) {
                        return;
                    }
                    if (C50820w62.m7409b()) {
                        C43431je6.m30141a();
                        return;
                    }
                    FutureTask futureTask = new FutureTask(new CallableC28042e(m77975e));
                    C48305rr6.m15167b(C48305rr6.this).post(futureTask);
                    String str = "";
                    try {
                        str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                    } catch (Exception e) {
                        Log.e(C48305rr6.m15166c(), "Failed to take screenshot.", e);
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("screenname", simpleName);
                        jSONObject.put("screenshot", str);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(C45933nr6.m22288d(m77975e));
                        jSONObject.put("view", jSONArray);
                    } catch (JSONException unused) {
                        Log.e(C48305rr6.m15166c(), "Failed to create JSONObject");
                    }
                    C48305rr6.m15165d(C48305rr6.this, jSONObject.toString());
                }
            } catch (Exception e2) {
                Log.e(C48305rr6.m15166c(), "UI Component tree indexing failure!", e2);
            }
        }
    }

    /* renamed from: rr6$b */
    /* loaded from: classes5.dex */
    public class RunnableC28039b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ TimerTask f107793b;

        public RunnableC28039b(TimerTask timerTask) {
            this.f107793b = timerTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                try {
                    if (C48305rr6.m15164e(C48305rr6.this) != null) {
                        C48305rr6.m15164e(C48305rr6.this).cancel();
                    }
                    C48305rr6.m15161h(C48305rr6.this, null);
                    C48305rr6.m15163f(C48305rr6.this, new Timer());
                    C48305rr6.m15164e(C48305rr6.this).scheduleAtFixedRate(this.f107793b, 0L, 1000L);
                } catch (Exception e) {
                    Log.e(C48305rr6.m15166c(), "Error scheduling indexing job", e);
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: rr6$c */
    /* loaded from: classes5.dex */
    public class RunnableC28040c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f107795b;

        public RunnableC28040c(String str) {
            this.f107795b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                String m2846c0 = C52364yi6.m2846c0(this.f107795b);
                AccessToken m52920c = AccessToken.m52920c();
                if (m2846c0 != null && m2846c0.equals(C48305rr6.m15162g(C48305rr6.this))) {
                    return;
                }
                C48305rr6.this.m15159j(C48305rr6.m15160i(this.f107795b, m52920c, C17216a.m52740f(), "app_indexing"), m2846c0);
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: rr6$d */
    /* loaded from: classes5.dex */
    public static class C28041d implements GraphRequest.InterfaceC17205b {
        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public void mo2794a(WD1 wd1) {
            C32992Fx2.m106220g(EnumC36034Sx2.APP_EVENTS, C48305rr6.m15166c(), "App index sent to FB!");
        }
    }

    /* renamed from: rr6$e */
    /* loaded from: classes5.dex */
    public static class CallableC28042e implements Callable<String> {

        /* renamed from: b */
        public WeakReference<View> f107797b;

        public CallableC28042e(View view) {
            this.f107797b = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            View view = this.f107797b.get();
            if (view != null && view.getWidth() != 0 && view.getHeight() != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            return "";
        }
    }

    public C48305rr6(Activity activity) {
        this.f107789b = new WeakReference<>(activity);
        f107787f = this;
    }

    /* renamed from: a */
    public static /* synthetic */ WeakReference m15168a(C48305rr6 c48305rr6) {
        if (TD0.m84203d(C48305rr6.class)) {
            return null;
        }
        try {
            return c48305rr6.f107789b;
        } catch (Throwable th) {
            TD0.m84205b(th, C48305rr6.class);
            return null;
        }
    }

    /* renamed from: b */
    public static /* synthetic */ Handler m15167b(C48305rr6 c48305rr6) {
        if (TD0.m84203d(C48305rr6.class)) {
            return null;
        }
        try {
            return c48305rr6.f107788a;
        } catch (Throwable th) {
            TD0.m84205b(th, C48305rr6.class);
            return null;
        }
    }

    /* renamed from: c */
    public static /* synthetic */ String m15166c() {
        if (TD0.m84203d(C48305rr6.class)) {
            return null;
        }
        try {
            return f107786e;
        } catch (Throwable th) {
            TD0.m84205b(th, C48305rr6.class);
            return null;
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m15165d(C48305rr6 c48305rr6, String str) {
        if (TD0.m84203d(C48305rr6.class)) {
            return;
        }
        try {
            c48305rr6.m15157l(str);
        } catch (Throwable th) {
            TD0.m84205b(th, C48305rr6.class);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Timer m15164e(C48305rr6 c48305rr6) {
        if (TD0.m84203d(C48305rr6.class)) {
            return null;
        }
        try {
            return c48305rr6.f107790c;
        } catch (Throwable th) {
            TD0.m84205b(th, C48305rr6.class);
            return null;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ Timer m15163f(C48305rr6 c48305rr6, Timer timer) {
        if (TD0.m84203d(C48305rr6.class)) {
            return null;
        }
        try {
            c48305rr6.f107790c = timer;
            return timer;
        } catch (Throwable th) {
            TD0.m84205b(th, C48305rr6.class);
            return null;
        }
    }

    /* renamed from: g */
    public static /* synthetic */ String m15162g(C48305rr6 c48305rr6) {
        if (TD0.m84203d(C48305rr6.class)) {
            return null;
        }
        try {
            return c48305rr6.f107791d;
        } catch (Throwable th) {
            TD0.m84205b(th, C48305rr6.class);
            return null;
        }
    }

    /* renamed from: h */
    public static /* synthetic */ String m15161h(C48305rr6 c48305rr6, String str) {
        if (TD0.m84203d(C48305rr6.class)) {
            return null;
        }
        try {
            c48305rr6.f107791d = str;
            return str;
        } catch (Throwable th) {
            TD0.m84205b(th, C48305rr6.class);
            return null;
        }
    }

    /* renamed from: i */
    public static GraphRequest m15160i(String str, AccessToken accessToken, String str2, String str3) {
        if (TD0.m84203d(C48305rr6.class) || str == null) {
            return null;
        }
        try {
            GraphRequest m52823x = GraphRequest.m52823x(accessToken, String.format(Locale.US, "%s/app_indexing", str2), null, null);
            Bundle m52829r = m52823x.m52829r();
            if (m52829r == null) {
                m52829r = new Bundle();
            }
            m52829r.putString("tree", str);
            m52829r.putString(AnalyticsFields.APP_VERSION, C9155Wi.m77976d());
            m52829r.putString("platform", "android");
            m52829r.putString("request_type", str3);
            if (str3.equals("app_indexing")) {
                m52829r.putString("device_session_id", C35690Rl0.m86342i());
            }
            m52823x.m52850C(m52829r);
            m52823x.m52821z(new C28041d());
            return m52823x;
        } catch (Throwable th) {
            TD0.m84205b(th, C48305rr6.class);
            return null;
        }
    }

    /* renamed from: j */
    public void m15159j(GraphRequest graphRequest, String str) {
        if (TD0.m84203d(this) || graphRequest == null) {
            return;
        }
        try {
            WD1 m52837j = graphRequest.m52837j();
            try {
                JSONObject m78703c = m52837j.m78703c();
                if (m78703c != null) {
                    if ("true".equals(m78703c.optString("success"))) {
                        C32992Fx2.m106220g(EnumC36034Sx2.APP_EVENTS, f107786e, "Successfully send UI component tree to server");
                        this.f107791d = str;
                    }
                    if (m78703c.has("is_app_indexing_enabled")) {
                        C35690Rl0.m86336o(Boolean.valueOf(m78703c.getBoolean("is_app_indexing_enabled")));
                        return;
                    }
                    return;
                }
                String str2 = f107786e;
                Log.e(str2, "Error sending UI component tree to Facebook: " + m52837j.m78704b());
            } catch (JSONException e) {
                Log.e(f107786e, "Error decoding server response.", e);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: k */
    public void m15158k() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            try {
                C17216a.m52731o().execute(new RunnableC28039b(new C28038a()));
            } catch (RejectedExecutionException e) {
                Log.e(f107786e, "Error scheduling indexing job", e);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: l */
    public final void m15157l(String str) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            C17216a.m52731o().execute(new RunnableC28040c(str));
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: m */
    public void m15156m() {
        Timer timer;
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (this.f107789b.get() != null && (timer = this.f107790c) != null) {
                try {
                    timer.cancel();
                    this.f107790c = null;
                } catch (Exception e) {
                    Log.e(f107786e, "Error unscheduling indexing job", e);
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
