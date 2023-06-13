package p000;

import android.os.Handler;
import java.util.Timer;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: vO6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50397vO6 extends KN6 {

    /* renamed from: p */
    public static C50397vO6 f113995p;

    /* renamed from: l */
    public WM6 f114005l;

    /* renamed from: m */
    public VF2 f114006m;

    /* renamed from: n */
    public Handler f114007n;

    /* renamed from: c */
    public JSONObject f113996c = new JSONObject();

    /* renamed from: d */
    public JSONArray f113997d = new JSONArray();

    /* renamed from: e */
    public JSONArray f113998e = new JSONArray();

    /* renamed from: f */
    public boolean f113999f = false;

    /* renamed from: g */
    public int f114000g = 0;

    /* renamed from: h */
    public boolean f114001h = false;

    /* renamed from: i */
    public boolean f114002i = true;

    /* renamed from: j */
    public int f114003j = 0;

    /* renamed from: k */
    public String f114004k = "";

    /* renamed from: o */
    public Timer f114008o = new Timer();

    /* renamed from: r */
    public static synchronized C50397vO6 m8748r() {
        C50397vO6 c50397vO6;
        synchronized (C50397vO6.class) {
            if (f113995p == null) {
                f113995p = new C50397vO6();
            }
            c50397vO6 = f113995p;
        }
        return c50397vO6;
    }

    @Override // p000.KN6
    /* renamed from: d */
    public JSONObject mo8750d() {
        return null;
    }

    /* renamed from: q */
    public void m8749q(WM6 wm6, VF2 vf2, Handler handler) {
        this.f114005l = wm6;
        this.f114006m = vf2;
        this.f114007n = handler;
    }
}
