package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* renamed from: cz5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39490cz5 {

    /* renamed from: a */
    public final SharedPreferences f75925a;

    /* renamed from: b */
    public final String f75926b;

    /* renamed from: c */
    public final String f75927c;

    /* renamed from: e */
    public final Executor f75929e;

    /* renamed from: d */
    public final ArrayDeque<String> f75928d = new ArrayDeque<>();

    /* renamed from: f */
    public boolean f75930f = false;

    public C39490cz5(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f75925a = sharedPreferences;
        this.f75926b = str;
        this.f75927c = str2;
        this.f75929e = executor;
    }

    /* renamed from: d */
    public static C39490cz5 m44766d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C39490cz5 c39490cz5 = new C39490cz5(sharedPreferences, str, str2, executor);
        c39490cz5.m44765e();
        return c39490cz5;
    }

    /* renamed from: b */
    public boolean m44768b(String str) {
        boolean m44767c;
        if (!TextUtils.isEmpty(str) && !str.contains(this.f75927c)) {
            synchronized (this.f75928d) {
                m44767c = m44767c(this.f75928d.add(str));
            }
            return m44767c;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m44767c(boolean z) {
        if (z && !this.f75930f) {
            m44760j();
        }
        return z;
    }

    /* renamed from: e */
    public final void m44765e() {
        synchronized (this.f75928d) {
            this.f75928d.clear();
            String string = this.f75925a.getString(this.f75926b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f75927c)) {
                String[] split = string.split(this.f75927c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f75928d.add(str);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public String m44764f() {
        String peek;
        synchronized (this.f75928d) {
            peek = this.f75928d.peek();
        }
        return peek;
    }

    /* renamed from: g */
    public boolean m44763g(Object obj) {
        boolean m44767c;
        synchronized (this.f75928d) {
            m44767c = m44767c(this.f75928d.remove(obj));
        }
        return m44767c;
    }

    /* renamed from: h */
    public String m44762h() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f75928d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f75927c);
        }
        return sb.toString();
    }

    /* renamed from: i */
    public final void m44761i() {
        synchronized (this.f75928d) {
            this.f75925a.edit().putString(this.f75926b, m44762h()).commit();
        }
    }

    /* renamed from: j */
    public final void m44760j() {
        this.f75929e.execute(new Runnable() { // from class: bz5
            @Override // java.lang.Runnable
            public final void run() {
                C39490cz5.this.m44761i();
            }
        });
    }
}
