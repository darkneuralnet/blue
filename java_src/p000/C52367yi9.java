package p000;

import android.util.Log;
import java.net.HttpURLConnection;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: yi9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52367yi9 implements Qj9 {

    /* renamed from: a */
    public final String f120048a;

    /* renamed from: b */
    public final Date f120049b;

    /* renamed from: c */
    public final Yb9 f120050c;

    /* renamed from: d */
    public AbstractC50746vy7 f120051d;

    /* renamed from: e */
    public Vg9 f120052e;

    /* renamed from: f */
    public final /* synthetic */ Gi9 f120053f;

    public C52367yi9(Gi9 gi9, String str, Date date, Yb9 yb9) {
        this.f120053f = gi9;
        this.f120048a = str;
        this.f120049b = date;
        this.f120050c = yb9;
    }

    /* renamed from: a */
    public final AbstractC50746vy7 m2792a() {
        return this.f120051d;
    }

    /* renamed from: b */
    public final Vg9 m2791b() {
        return this.f120052e;
    }

    @Override // p000.Qj9
    public final boolean zza() throws Vi9 {
        C39907dh9 c39907dh9;
        C39907dh9 c39907dh92;
        Kb9 kb9;
        String str;
        AbstractC50746vy7 m104841m;
        try {
            c39907dh9 = this.f120053f.f12302e;
            Log.d("MLKit RemoteConfigRestC", "Creating HTTP connection to remote config service");
            HttpURLConnection m43876b = c39907dh9.m43876b();
            Gi9 gi9 = this.f120053f;
            c39907dh92 = gi9.f12302e;
            kb9 = gi9.f12301d;
            String m61181a = kb9.m98698a().m61181a();
            String str2 = this.f120048a;
            AbstractC50746vy7 m7627c = AbstractC50746vy7.m7627c();
            AbstractC50746vy7 m7627c2 = AbstractC50746vy7.m7627c();
            Date date = this.f120049b;
            str = this.f120053f.f12308k;
            C44650lh9 m43877a = c39907dh92.m43877a(m43876b, m61181a, str2, m7627c, null, m7627c2, date, "o:a:mlkit:1.0.0", str, this.f120050c);
            Log.d("MLKit RemoteConfigRestC", "Got FetchResponse");
            Vg9 m26948a = m43877a.m26948a();
            this.f120052e = m26948a;
            JSONObject m79569d = m26948a.m79569d();
            try {
                m104841m = Gi9.m104841m(m79569d);
                this.f120051d = m104841m;
                return true;
            } catch (JSONException e) {
                this.f120050c.m74824b(EnumC38962c79.RPC_RETURNED_MALFORMED_RESULT);
                Log.e("MLKit RemoteConfigRestC", "Fetched remote config setting has invalid format: ".concat(String.valueOf(m79569d)), e);
                return false;
            }
        } catch (Vi9 e2) {
            Log.e("MLKit RemoteConfigRestC", "Creating HTTP connection to remote config service failed", e2);
            this.f120050c.m74824b(EnumC38962c79.NO_CONNECTION);
            return false;
        }
    }
}
