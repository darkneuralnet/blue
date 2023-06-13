package p000;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import java.util.HashMap;
import lib.android.paypal.com.magnessdk.InvalidInputException;
import org.json.JSONException;
import org.json.JSONObject;
import p000.VF2;
/* renamed from: UF2 */
/* loaded from: classes8.dex */
public final class UF2 {

    /* renamed from: j */
    public static UF2 f37131j;

    /* renamed from: a */
    public C44460lN6 f37132a;

    /* renamed from: b */
    public VF2 f37133b;

    /* renamed from: c */
    public JSONObject f37134c;

    /* renamed from: d */
    public Handler f37135d;

    /* renamed from: e */
    public HandlerThread f37136e;

    /* renamed from: f */
    public MN6 f37137f;

    /* renamed from: g */
    public WM6 f37138g;

    /* renamed from: h */
    public C46841pO6 f37139h = C46841pO6.m19351r();

    /* renamed from: i */
    public C50397vO6 f37140i = C50397vO6.m8748r();

    private UF2() {
    }

    /* renamed from: g */
    public static synchronized UF2 m81767g() {
        UF2 uf2;
        synchronized (UF2.class) {
            if (f37131j == null) {
                f37131j = new UF2();
            }
            uf2 = f37131j;
        }
        return uf2;
    }

    /* renamed from: a */
    public final TF2 m81773a(@NonNull Context context, @Size(max = 32) @Nullable String str, @Nullable HashMap<String, String> hashMap, boolean z) throws InvalidInputException {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("COLLECT method called with paypalClientMetaDataId : ");
        sb.append(str);
        sb.append(" , Is pass in additionalData null? : ");
        sb.append(Boolean.toString(hashMap == null));
        KJ6.m99012a(UF2.class, 0, sb.toString());
        if (str == null || str.length() <= 32) {
            if (this.f37133b == null) {
                KJ6.m99012a(UF2.class, 2, "No MagnesSettings specified, using platform default.");
                VF2 m80145j = new VF2.C8588b(context).m80145j();
                this.f37133b = m80145j;
                m81766h(m80145j);
            }
            if (this.f37132a.m27369s()) {
                KJ6.m99012a(UF2.class, 0, "nc presents, collecting coreData.");
                MN6 mn6 = new MN6();
                this.f37137f = mn6;
                this.f37134c = mn6.m95357r(this.f37133b, this.f37138g, this.f37132a);
                C44460lN6.m27379i(false);
            }
            JSONObject m98936g = this.f37137f.m98936g(new C38522bO6(z).m64574u(this.f37133b, this.f37138g, this.f37132a, this.f37137f.m95353v(), str, hashMap, this.f37135d));
            try {
                KJ6.m99012a(UF2.class, 0, "Device Info JSONObject : " + m98936g.toString(2));
                str2 = m98936g.getString("pairing_id");
            } catch (JSONException e) {
                KJ6.m99011b(UF2.class, 3, e);
                str2 = null;
            }
            return new TF2().m84126c(m98936g).m84125d(str2);
        }
        throw new InvalidInputException(UL6.CMID_EXCEPTION_MESSAGE.toString());
    }

    /* renamed from: b */
    public WM6 m81772b() {
        if (this.f37138g == null) {
            this.f37138g = new WM6(this.f37133b, this.f37135d);
        }
        return this.f37138g;
    }

    /* renamed from: c */
    public final void m81771c(Context context, JSONObject jSONObject) {
        new C38495bL6(EnumC39097cM6.DEVICE_INFO_URL, jSONObject, false, this.f37133b, this.f37135d).m64644c();
        if (m81769e()) {
            new LJ6(EnumC39097cM6.PRODUCTION_BEACON_URL, this.f37133b, this.f37135d, jSONObject).m97343b();
        }
    }

    /* renamed from: d */
    public final void m81770d() {
        if (this.f37136e == null) {
            HandlerThread handlerThread = new HandlerThread("MagnesHandlerThread");
            this.f37136e = handlerThread;
            handlerThread.start();
            this.f37135d = HandlerC45053mN6.m25694a(this.f37136e.getLooper(), this);
        }
    }

    /* renamed from: e */
    public final boolean m81769e() {
        return !this.f37133b.m80157g() && this.f37133b.m80161c() == EnumC51736xf1.LIVE;
    }

    /* renamed from: f */
    public TF2 m81768f(@NonNull Context context, @Size(max = 32) @Nullable String str, @Nullable HashMap<String, String> hashMap) throws InvalidInputException {
        StringBuilder sb = new StringBuilder();
        sb.append("SUBMIT method called with paypalClientMetaDataId : ");
        sb.append(str);
        sb.append(" , Is pass in additionalData null? : ");
        sb.append(Boolean.toString(hashMap == null));
        KJ6.m99012a(UF2.class, 0, sb.toString());
        if (str == null || str.length() <= 32) {
            TF2 m81773a = m81773a(context, str, hashMap, true);
            m81771c(context, m81773a.m84128a());
            return m81773a;
        }
        throw new InvalidInputException(UL6.CMID_EXCEPTION_MESSAGE.toString());
    }

    @NonNull
    /* renamed from: h */
    public VF2 m81766h(@NonNull VF2 vf2) {
        this.f37133b = vf2;
        m81770d();
        this.f37132a = new C44460lN6(vf2, this.f37135d);
        WM6 wm6 = new WM6(vf2, this.f37135d);
        this.f37138g = wm6;
        this.f37139h.m19352q(wm6, this.f37133b, this.f37135d);
        this.f37140i.m8749q(this.f37138g, this.f37133b, this.f37135d);
        if (this.f37137f == null) {
            MN6 mn6 = new MN6();
            this.f37137f = mn6;
            this.f37134c = mn6.m95357r(vf2, this.f37138g, this.f37132a);
        }
        return vf2;
    }
}
