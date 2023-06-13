package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Sx1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36033Sx1 {

    /* renamed from: a */
    public final XA0 f34523a;

    /* renamed from: b */
    public final C46218oL3 f34524b;

    /* renamed from: c */
    public C36267Tx1 f34525c;

    /* renamed from: Sx1$a */
    /* loaded from: classes6.dex */
    public class RunnableC7616a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f34526b;

        public RunnableC7616a(String str) {
            this.f34526b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C36033Sx1.this.f34524b.mo3548e("tracking/events", this.f34526b, null);
        }
    }

    public C36033Sx1(XA0 xa0, C46218oL3 c46218oL3) {
        this.f34523a = xa0;
        this.f34524b = c46218oL3;
    }

    /* renamed from: b */
    public final JSONObject m84579b(Map<String, String> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : map.keySet()) {
            jSONObject.accumulate(str, map.get(str));
        }
        return jSONObject;
    }

    /* renamed from: c */
    public final int m84578c() {
        return new GregorianCalendar().getTimeZone().getRawOffset();
    }

    /* renamed from: d */
    public final String m84577d() {
        return Integer.toString((m84578c() / 1000) / 60);
    }

    /* renamed from: e */
    public void m84576e(String str) {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC7616a(str), (new Random().nextInt(190) + 10) * 1000);
    }

    /* renamed from: f */
    public void m84575f(EnumC45489n66 enumC45489n66, String str, Map<String, String> map, S94 s94) {
        String str2;
        if (C52922zf1.m613c(str)) {
            return;
        }
        C36267Tx1 c36267Tx1 = this.f34525c;
        if (c36267Tx1 == null || !c36267Tx1.m82223a()) {
            this.f34525c = new C36267Tx1();
        }
        long currentTimeMillis = System.currentTimeMillis();
        String m30178a = C43421jd6.m30178a(Y42.m75781a(this.f34523a.m77268b()));
        StringBuilder sb = new StringBuilder();
        sb.append("mobile:otc:");
        sb.append(enumC45489n66.m24326a());
        sb.append(":");
        String str3 = "";
        if (s94 == null) {
            str2 = "";
        } else {
            str2 = s94.name();
        }
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(":");
        sb3.append("Android:" + str + ":");
        if (enumC45489n66.m24325b()) {
            str3 = "|error";
        }
        sb3.append(str3);
        String sb4 = sb3.toString();
        HashMap hashMap = new HashMap(map);
        hashMap.put("apid", H21.m104488a(this.f34523a.m77268b()) + "|3.17.2|" + this.f34523a.m77268b().getPackageName());
        hashMap.put("bchn", "otc");
        hashMap.put("bzsr", "mobile");
        hashMap.put("dsid", m30178a);
        hashMap.put("e", "im");
        hashMap.put("g", m84577d());
        hashMap.put("lgin", "out");
        hashMap.put("mapv", "3.17.2");
        hashMap.put("mcar", H21.m104485d(this.f34523a.m77268b()));
        hashMap.put("mdvs", H21.m104487b());
        hashMap.put("mosv", H21.m104486c());
        hashMap.put("page", sb4);
        hashMap.put("pgrp", sb2);
        hashMap.put("rsta", Locale.getDefault().toString());
        hashMap.put("srce", "otc");
        hashMap.put("sv", "mobile");
        hashMap.put("t", Long.toString(currentTimeMillis - m84578c()));
        hashMap.put("vers", "Android:" + str + ":");
        hashMap.put("vid", this.f34525c.f36490a);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.accumulate("tracking_visitor_id", m30178a);
            jSONObject.accumulate("tracking_visit_id", this.f34525c.f36490a);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.accumulate("actor", jSONObject);
            jSONObject2.accumulate("channel", "mobile");
            jSONObject2.accumulate("tracking_event", Long.toString(currentTimeMillis));
            jSONObject2.accumulate("event_params", m84579b(hashMap));
            m84576e(new JSONObject().accumulate("events", jSONObject2).toString());
        } catch (JSONException unused) {
        }
    }
}
