package p000;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;
/* renamed from: IZ1 */
/* loaded from: classes5.dex */
public class IZ1 {

    /* renamed from: IZ1$a */
    /* loaded from: classes5.dex */
    public static class RunnableC3708a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                IZ1.m101928a();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: IZ1$b */
    /* loaded from: classes5.dex */
    public static class RunnableC3709b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                IZ1.m101928a();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m101928a() {
        if (TD0.m84203d(IZ1.class)) {
            return;
        }
        try {
            m101927b();
        } catch (Throwable th) {
            TD0.m84205b(th, IZ1.class);
        }
    }

    /* renamed from: b */
    public static void m101927b() {
        if (TD0.m84203d(IZ1.class)) {
            return;
        }
        try {
            Map<String, JSONObject> map = JZ1.f17801v;
            LZ1.m96630e(map, JZ1.f17802w);
            map.clear();
        } catch (Throwable th) {
            TD0.m84205b(th, IZ1.class);
        }
    }

    /* renamed from: c */
    public static void m101926c(Context context) {
        JZ1 m100210j;
        if (TD0.m84203d(IZ1.class)) {
            return;
        }
        try {
            if (OZ1.m92013a("com.android.billingclient.api.Purchase") != null && (m100210j = JZ1.m100210j(context)) != null && JZ1.f17800u.get()) {
                if (LZ1.m96631d()) {
                    m100210j.m100208l("inapp", new RunnableC3708a());
                } else {
                    m100210j.m100209k("inapp", new RunnableC3709b());
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, IZ1.class);
        }
    }
}
