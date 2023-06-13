package p000;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* renamed from: lh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44643lh2 implements Serializable {

    /* renamed from: c */
    public static final Set<String> f96556c;
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final Map<String, Object> f96557b;

    /* renamed from: lh2$b */
    /* loaded from: classes6.dex */
    public static class C25763b {

        /* renamed from: a */
        public final Map<String, Object> f96558a = new LinkedHashMap();

        /* renamed from: a */
        public C25763b m26990a(String str) {
            if (str == null) {
                this.f96558a.put("aud", null);
            } else {
                this.f96558a.put("aud", Collections.singletonList(str));
            }
            return this;
        }

        /* renamed from: b */
        public C25763b m26989b(List<String> list) {
            this.f96558a.put("aud", list);
            return this;
        }

        /* renamed from: c */
        public C44643lh2 m26988c() {
            return new C44643lh2(this.f96558a);
        }

        /* renamed from: d */
        public C25763b m26987d(String str, Object obj) {
            this.f96558a.put(str, obj);
            return this;
        }

        /* renamed from: e */
        public C25763b m26986e(Date date) {
            this.f96558a.put("exp", date);
            return this;
        }

        /* renamed from: f */
        public C25763b m26985f(Date date) {
            this.f96558a.put("iat", date);
            return this;
        }

        /* renamed from: g */
        public C25763b m26984g(String str) {
            this.f96558a.put("iss", str);
            return this;
        }

        /* renamed from: h */
        public C25763b m26983h(String str) {
            this.f96558a.put("jti", str);
            return this;
        }

        /* renamed from: i */
        public C25763b m26982i(Date date) {
            this.f96558a.put("nbf", date);
            return this;
        }

        /* renamed from: j */
        public C25763b m26981j(String str) {
            this.f96558a.put("sub", str);
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        f96556c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: e */
    public static C44643lh2 m26994e(String str) throws ParseException {
        return m26993f(C34477Mg2.m95055m(str));
    }

    /* renamed from: f */
    public static C44643lh2 m26993f(Map<String, Object> map) throws ParseException {
        C25763b c25763b = new C25763b();
        for (String str : map.keySet()) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 96944:
                    if (str.equals("aud")) {
                        c = 0;
                        break;
                    }
                    break;
                case 100893:
                    if (str.equals("exp")) {
                        c = 1;
                        break;
                    }
                    break;
                case 104028:
                    if (str.equals("iat")) {
                        c = 2;
                        break;
                    }
                    break;
                case 104585:
                    if (str.equals("iss")) {
                        c = 3;
                        break;
                    }
                    break;
                case 105567:
                    if (str.equals("jti")) {
                        c = 4;
                        break;
                    }
                    break;
                case 108850:
                    if (str.equals("nbf")) {
                        c = 5;
                        break;
                    }
                    break;
                case 114240:
                    if (str.equals("sub")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Object obj = map.get("aud");
                    if (obj instanceof String) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(C34477Mg2.m95060h(map, "aud"));
                        c25763b.m26989b(arrayList);
                        break;
                    } else if (obj instanceof List) {
                        c25763b.m26989b(C34477Mg2.m95058j(map, "aud"));
                        break;
                    } else if (obj == null) {
                        c25763b.m26990a(null);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    c25763b.m26986e(new Date(C34477Mg2.m95061g(map, "exp") * 1000));
                    break;
                case 2:
                    c25763b.m26985f(new Date(C34477Mg2.m95061g(map, "iat") * 1000));
                    break;
                case 3:
                    c25763b.m26984g(C34477Mg2.m95060h(map, "iss"));
                    break;
                case 4:
                    c25763b.m26983h(C34477Mg2.m95060h(map, "jti"));
                    break;
                case 5:
                    c25763b.m26982i(new Date(C34477Mg2.m95061g(map, "nbf") * 1000));
                    break;
                case 6:
                    c25763b.m26981j(C34477Mg2.m95060h(map, "sub"));
                    break;
                default:
                    c25763b.m26987d(str, map.get(str));
                    break;
            }
        }
        return c25763b.m26988c();
    }

    /* renamed from: a */
    public List<String> m26998a() {
        Object m26997b = m26997b("aud");
        if (m26997b instanceof String) {
            return Collections.singletonList((String) m26997b);
        }
        try {
            List<String> m26995d = m26995d("aud");
            if (m26995d == null) {
                return Collections.emptyList();
            }
            return m26995d;
        } catch (ParseException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    public Object m26997b(String str) {
        return this.f96557b.get(str);
    }

    /* renamed from: c */
    public String[] m26996c(String str) throws ParseException {
        if (m26997b(str) == null) {
            return null;
        }
        try {
            List list = (List) m26997b(str);
            int size = list.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                try {
                    strArr[i] = (String) list.get(i);
                } catch (ClassCastException unused) {
                    throw new ParseException("The " + str + " claim is not a list / JSON array of strings", 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException("The " + str + " claim is not a list / JSON array", 0);
        }
    }

    /* renamed from: d */
    public List<String> m26995d(String str) throws ParseException {
        String[] m26996c = m26996c(str);
        if (m26996c == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(m26996c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44643lh2)) {
            return false;
        }
        return Objects.equals(this.f96557b, ((C44643lh2) obj).f96557b);
    }

    /* renamed from: g */
    public Map<String, Object> m26992g() {
        return m26991h(false);
    }

    /* renamed from: h */
    public Map<String, Object> m26991h(boolean z) {
        Map<String, Object> m95056l = C34477Mg2.m95056l();
        for (Map.Entry<String, Object> entry : this.f96557b.entrySet()) {
            if (entry.getValue() instanceof Date) {
                m95056l.put(entry.getKey(), Long.valueOf(C47473qT0.m17500a((Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                List<String> m26998a = m26998a();
                if (m26998a != null && !m26998a.isEmpty()) {
                    if (m26998a.size() == 1) {
                        m95056l.put("aud", m26998a.get(0));
                    } else {
                        List<Object> m101818a = C33541Ig2.m101818a();
                        m101818a.addAll(m26998a);
                        m95056l.put("aud", m101818a);
                    }
                } else if (z) {
                    m95056l.put("aud", null);
                }
            } else if (entry.getValue() != null) {
                m95056l.put(entry.getKey(), entry.getValue());
            } else if (z) {
                m95056l.put(entry.getKey(), null);
            }
        }
        return m95056l;
    }

    public int hashCode() {
        return Objects.hash(this.f96557b);
    }

    public String toString() {
        return C34477Mg2.m95053o(m26992g());
    }

    public C44643lh2(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f96557b = linkedHashMap;
        linkedHashMap.putAll(map);
    }
}
