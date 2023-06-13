package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.google.firebase.remoteconfig.internal.b */
/* loaded from: classes6.dex */
public class C18378b {

    /* renamed from: g */
    public static final Date f74435g = new Date(0);

    /* renamed from: a */
    public JSONObject f74436a;

    /* renamed from: b */
    public JSONObject f74437b;

    /* renamed from: c */
    public Date f74438c;

    /* renamed from: d */
    public JSONArray f74439d;

    /* renamed from: e */
    public JSONObject f74440e;

    /* renamed from: f */
    public long f74441f;

    /* renamed from: com.google.firebase.remoteconfig.internal.b$b */
    /* loaded from: classes6.dex */
    public static class C18380b {

        /* renamed from: a */
        public JSONObject f74442a;

        /* renamed from: b */
        public Date f74443b;

        /* renamed from: c */
        public JSONArray f74444c;

        /* renamed from: d */
        public JSONObject f74445d;

        /* renamed from: e */
        public long f74446e;

        /* renamed from: a */
        public C18378b m46989a() throws JSONException {
            return new C18378b(this.f74442a, this.f74443b, this.f74444c, this.f74445d, this.f74446e);
        }

        /* renamed from: b */
        public C18380b m46988b(JSONObject jSONObject) {
            try {
                this.f74442a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: c */
        public C18380b m46987c(JSONArray jSONArray) {
            try {
                this.f74444c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: d */
        public C18380b m46986d(Date date) {
            this.f74443b = date;
            return this;
        }

        /* renamed from: e */
        public C18380b m46985e(JSONObject jSONObject) {
            try {
                this.f74445d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: f */
        public C18380b m46984f(long j) {
            this.f74446e = j;
            return this;
        }

        private C18380b() {
            this.f74442a = new JSONObject();
            this.f74443b = C18378b.f74435g;
            this.f74444c = new JSONArray();
            this.f74445d = new JSONObject();
            this.f74446e = 0L;
        }
    }

    /* renamed from: b */
    public static C18378b m46998b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new C18378b(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    /* renamed from: c */
    public static C18378b m46997c(JSONObject jSONObject) throws JSONException {
        return m46998b(new JSONObject(jSONObject.toString()));
    }

    /* renamed from: j */
    public static C18380b m46990j() {
        return new C18380b();
    }

    /* renamed from: d */
    public JSONArray m46996d() {
        return this.f74439d;
    }

    /* renamed from: e */
    public Set<String> m46995e(C18378b c18378b) throws JSONException {
        JSONObject m46994f = m46997c(c18378b.f74436a).m46994f();
        HashSet hashSet = new HashSet();
        Iterator<String> keys = m46994f().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!c18378b.m46994f().has(next)) {
                hashSet.add(next);
            } else if (!m46994f().get(next).equals(c18378b.m46994f().get(next))) {
                hashSet.add(next);
            } else if ((m46992h().has(next) && !c18378b.m46992h().has(next)) || (!m46992h().has(next) && c18378b.m46992h().has(next))) {
                hashSet.add(next);
            } else if (m46992h().has(next) && c18378b.m46992h().has(next) && !m46992h().getJSONObject(next).toString().equals(c18378b.m46992h().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else {
                m46994f.remove(next);
            }
        }
        Iterator<String> keys2 = m46994f.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18378b)) {
            return false;
        }
        return this.f74436a.toString().equals(((C18378b) obj).toString());
    }

    /* renamed from: f */
    public JSONObject m46994f() {
        return this.f74437b;
    }

    /* renamed from: g */
    public Date m46993g() {
        return this.f74438c;
    }

    /* renamed from: h */
    public JSONObject m46992h() {
        return this.f74440e;
    }

    public int hashCode() {
        return this.f74436a.hashCode();
    }

    /* renamed from: i */
    public long m46991i() {
        return this.f74441f;
    }

    public String toString() {
        return this.f74436a.toString();
    }

    public C18378b(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        this.f74437b = jSONObject;
        this.f74438c = date;
        this.f74439d = jSONArray;
        this.f74440e = jSONObject2;
        this.f74441f = j;
        this.f74436a = jSONObject3;
    }
}
