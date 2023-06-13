package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
/* renamed from: Dx0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C32522Dx0 {

    /* renamed from: a */
    public static final long f6645a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: b */
    public static boolean f6646b = false;

    /* renamed from: Dx0$a */
    /* loaded from: classes2.dex */
    public static class C1675a implements HN1 {

        /* renamed from: a */
        public final /* synthetic */ G10 f6647a;

        /* renamed from: b */
        public final /* synthetic */ String f6648b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC32288Cx0 f6649c;

        /* renamed from: d */
        public final /* synthetic */ N10 f6650d;

        public C1675a(G10 g10, String str, InterfaceC32288Cx0 interfaceC32288Cx0, N10 n10) {
            this.f6647a = g10;
            this.f6648b = str;
            this.f6649c = interfaceC32288Cx0;
            this.f6650d = n10;
        }

        @Override // p000.HN1
        /* renamed from: a */
        public void mo10871a(Exception exc) {
            C32522Dx0.f6646b = false;
            this.f6650d.onResponse(exc);
        }

        @Override // p000.HN1
        public void success(String str) {
            try {
                C40650ex0 m42371a = C40650ex0.m42371a(str);
                Context m105966T9 = this.f6647a.m105966T9();
                C32522Dx0.m109592b(m105966T9, this.f6648b + this.f6647a.m105965da().mo53279b(), m42371a);
                C32522Dx0.f6646b = false;
                this.f6649c.mo10872k(m42371a);
            } catch (JSONException e) {
                C32522Dx0.f6646b = false;
                this.f6650d.onResponse(e);
            }
        }
    }

    private C32522Dx0() {
    }

    /* renamed from: b */
    public static void m109592b(Context context, String str, C40650ex0 c40650ex0) {
        String encodeToString = Base64.encodeToString(str.getBytes(), 0);
        O10.m93011a(context).edit().putString(encodeToString, c40650ex0.m42364h()).putLong(encodeToString + "_timestamp", System.currentTimeMillis()).apply();
    }

    /* renamed from: c */
    public static C40650ex0 m109591c(Context context, String str) {
        SharedPreferences m93011a = O10.m93011a(context);
        String encodeToString = Base64.encodeToString(str.getBytes(), 0);
        if (System.currentTimeMillis() - m93011a.getLong(encodeToString + "_timestamp", 0L) > f6645a) {
            return null;
        }
        try {
            return C40650ex0.m42371a(m93011a.getString(encodeToString, ""));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m109590d(G10 g10, InterfaceC32288Cx0 interfaceC32288Cx0, N10<Exception> n10) {
        String uri = Uri.parse(g10.m105965da().mo53278c()).buildUpon().appendQueryParameter("configVersion", "3").build().toString();
        Context m105966T9 = g10.m105966T9();
        C40650ex0 m109591c = m109591c(m105966T9, uri + g10.m105965da().mo53279b());
        if (m109591c != null) {
            interfaceC32288Cx0.mo10872k(m109591c);
            return;
        }
        f6646b = true;
        g10.m105962ha().mo3552a(uri, new C1675a(g10, uri, interfaceC32288Cx0, n10));
    }

    /* renamed from: e */
    public static boolean m109589e() {
        return f6646b;
    }
}
