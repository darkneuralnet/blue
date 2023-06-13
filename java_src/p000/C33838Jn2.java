package p000;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: Jn2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33838Jn2 implements JH1 {

    /* renamed from: c */
    public final Map<String, List<InterfaceC33604In2>> f18217c;

    /* renamed from: d */
    public volatile Map<String, String> f18218d;

    /* renamed from: Jn2$a */
    /* loaded from: classes5.dex */
    public static final class C4234a {

        /* renamed from: d */
        public static final String f18219d;

        /* renamed from: e */
        public static final Map<String, List<InterfaceC33604In2>> f18220e;

        /* renamed from: a */
        public boolean f18221a = true;

        /* renamed from: b */
        public Map<String, List<InterfaceC33604In2>> f18222b = f18220e;

        /* renamed from: c */
        public boolean f18223c = true;

        static {
            String m99711b = m99711b();
            f18219d = m99711b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(m99711b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C4235b(m99711b)));
            }
            f18220e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        public static String m99711b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C33838Jn2 m99712a() {
            this.f18221a = true;
            return new C33838Jn2(this.f18222b);
        }
    }

    /* renamed from: Jn2$b */
    /* loaded from: classes5.dex */
    public static final class C4235b implements InterfaceC33604In2 {

        /* renamed from: a */
        public final String f18224a;

        public C4235b(String str) {
            this.f18224a = str;
        }

        @Override // p000.InterfaceC33604In2
        /* renamed from: a */
        public String mo99710a() {
            return this.f18224a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C4235b) {
                return this.f18224a.equals(((C4235b) obj).f18224a);
            }
            return false;
        }

        public int hashCode() {
            return this.f18224a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f18224a + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
        }
    }

    public C33838Jn2(Map<String, List<InterfaceC33604In2>> map) {
        this.f18217c = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public final String m99714a(List<InterfaceC33604In2> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String mo99710a = list.get(i).mo99710a();
            if (!TextUtils.isEmpty(mo99710a)) {
                sb.append(mo99710a);
                if (i != list.size() - 1) {
                    sb.append(CoreConstants.COMMA_CHAR);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final Map<String, String> m99713b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<InterfaceC33604In2>> entry : this.f18217c.entrySet()) {
            String m99714a = m99714a(entry.getValue());
            if (!TextUtils.isEmpty(m99714a)) {
                hashMap.put(entry.getKey(), m99714a);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C33838Jn2) {
            return this.f18217c.equals(((C33838Jn2) obj).f18217c);
        }
        return false;
    }

    @Override // p000.JH1
    public Map<String, String> getHeaders() {
        if (this.f18218d == null) {
            synchronized (this) {
                if (this.f18218d == null) {
                    this.f18218d = Collections.unmodifiableMap(m99713b());
                }
            }
        }
        return this.f18218d;
    }

    public int hashCode() {
        return this.f18217c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f18217c + CoreConstants.CURLY_RIGHT;
    }
}
