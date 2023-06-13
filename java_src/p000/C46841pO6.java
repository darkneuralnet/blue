package p000;

import android.content.Context;
import android.os.Handler;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* renamed from: pO6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46841pO6 extends KN6 {

    /* renamed from: n */
    public static C46841pO6 f103618n;

    /* renamed from: d */
    public WM6 f103620d;

    /* renamed from: e */
    public VF2 f103621e;

    /* renamed from: f */
    public Handler f103622f;

    /* renamed from: c */
    public Context f103619c = null;

    /* renamed from: g */
    public List<String> f103623g = new ArrayList();

    /* renamed from: h */
    public long f103624h = 0;

    /* renamed from: i */
    public boolean f103625i = false;

    /* renamed from: j */
    public boolean f103626j = false;

    /* renamed from: k */
    public boolean f103627k = false;

    /* renamed from: l */
    public C27285a f103628l = C27285a.m19350a();

    /* renamed from: m */
    public HashMap<String, EditText> f103629m = new HashMap<>();

    /* renamed from: pO6$a */
    /* loaded from: classes8.dex */
    public static class C27285a {

        /* renamed from: g */
        public static C27285a f103630g;

        /* renamed from: a */
        public boolean f103631a = false;

        /* renamed from: b */
        public boolean f103632b = false;

        /* renamed from: c */
        public boolean f103633c = false;

        /* renamed from: d */
        public boolean f103634d = false;

        /* renamed from: e */
        public boolean f103635e = false;

        /* renamed from: f */
        public boolean f103636f = false;

        private C27285a() {
        }

        /* renamed from: a */
        public static synchronized C27285a m19350a() {
            C27285a c27285a;
            synchronized (C27285a.class) {
                if (f103630g == null) {
                    f103630g = new C27285a();
                }
                c27285a = f103630g;
            }
            return c27285a;
        }
    }

    /* renamed from: r */
    public static synchronized C46841pO6 m19351r() {
        C46841pO6 c46841pO6;
        synchronized (C46841pO6.class) {
            if (f103618n == null) {
                f103618n = new C46841pO6();
            }
            c46841pO6 = f103618n;
        }
        return c46841pO6;
    }

    @Override // p000.KN6
    /* renamed from: d */
    public JSONObject mo8750d() {
        return null;
    }

    /* renamed from: q */
    public void m19352q(WM6 wm6, VF2 vf2, Handler handler) {
        this.f103620d = wm6;
        this.f103621e = vf2;
        this.f103622f = handler;
    }
}
