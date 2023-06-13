package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* renamed from: CI1 */
/* loaded from: classes6.dex */
public class CI1 {

    /* renamed from: a */
    public final SharedPreferences f3892a;

    public CI1(Context context, String str) {
        this.f3892a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void m112385a() {
        long j = this.f3892a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f3892a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f3892a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f3892a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: b */
    public synchronized void m112384b() {
        SharedPreferences.Editor edit = this.f3892a.edit();
        for (Map.Entry<String, ?> entry : this.f3892a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                edit.remove(entry.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* renamed from: c */
    public synchronized List<DI1> m112383c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f3892a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(DI1.m110608a(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        m112374l(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: d */
    public final synchronized String m112382d(long j) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    public final synchronized String m112381e(String str) {
        for (Map.Entry<String, ?> entry : this.f3892a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str.equals(str2)) {
                        return entry.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: f */
    public synchronized boolean m112380f(long j, long j2) {
        return m112382d(j).equals(m112382d(j2));
    }

    /* renamed from: g */
    public synchronized void m112379g() {
        String m112382d = m112382d(System.currentTimeMillis());
        this.f3892a.edit().putString("last-used-date", m112382d).commit();
        m112378h(m112382d);
    }

    /* renamed from: h */
    public final synchronized void m112378h(String str) {
        String m112381e = m112381e(str);
        if (m112381e == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f3892a.getStringSet(m112381e, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f3892a.edit().remove(m112381e).commit();
        } else {
            this.f3892a.edit().putStringSet(m112381e, hashSet).commit();
        }
    }

    /* renamed from: i */
    public synchronized boolean m112377i(long j) {
        return m112376j("fire-global", j);
    }

    /* renamed from: j */
    public synchronized boolean m112376j(String str, long j) {
        if (this.f3892a.contains(str)) {
            if (!m112380f(this.f3892a.getLong(str, -1L), j)) {
                this.f3892a.edit().putLong(str, j).commit();
                return true;
            }
            return false;
        }
        this.f3892a.edit().putLong(str, j).commit();
        return true;
    }

    /* renamed from: k */
    public synchronized void m112375k(long j, String str) {
        String m112382d = m112382d(j);
        if (this.f3892a.getString("last-used-date", "").equals(m112382d)) {
            String m112381e = m112381e(m112382d);
            if (m112381e == null) {
                return;
            }
            if (m112381e.equals(str)) {
                return;
            }
            m112373m(str, m112382d);
            return;
        }
        long j2 = this.f3892a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            m112385a();
            j2 = this.f3892a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f3892a.getStringSet(str, new HashSet()));
        hashSet.add(m112382d);
        this.f3892a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", m112382d).commit();
    }

    /* renamed from: l */
    public synchronized void m112374l(long j) {
        this.f3892a.edit().putLong("fire-global", j).commit();
    }

    /* renamed from: m */
    public final synchronized void m112373m(String str, String str2) {
        m112378h(str2);
        HashSet hashSet = new HashSet(this.f3892a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f3892a.edit().putStringSet(str, hashSet).commit();
    }
}
