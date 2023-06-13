package p000;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p000.InterfaceC12447ba;
/* renamed from: y1 */
/* loaded from: classes6.dex */
public class C30405y1 {

    /* renamed from: g */
    public static final String[] f118613g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h */
    public static final DateFormat f118614h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a */
    public final String f118615a;

    /* renamed from: b */
    public final String f118616b;

    /* renamed from: c */
    public final String f118617c;

    /* renamed from: d */
    public final Date f118618d;

    /* renamed from: e */
    public final long f118619e;

    /* renamed from: f */
    public final long f118620f;

    public C30405y1(String str, String str2, String str3, Date date, long j, long j2) {
        this.f118615a = str;
        this.f118616b = str2;
        this.f118617c = str3;
        this.f118618d = date;
        this.f118619e = j;
        this.f118620f = j2;
    }

    /* renamed from: a */
    public static C30405y1 m4244a(InterfaceC12447ba.C12450c c12450c) {
        String str = c12450c.f57704d;
        if (str == null) {
            str = "";
        }
        return new C30405y1(c12450c.f57702b, String.valueOf(c12450c.f57703c), str, new Date(c12450c.f57713m), c12450c.f57705e, c12450c.f57710j);
    }

    /* renamed from: b */
    public static C30405y1 m4243b(Map<String, String> map) throws AbtException {
        String str;
        m4238g(map);
        try {
            Date parse = f118614h.parse(map.get("experimentStartTime"));
            long parseLong = Long.parseLong(map.get("triggerTimeoutMillis"));
            long parseLong2 = Long.parseLong(map.get("timeToLiveMillis"));
            String str2 = map.get("experimentId");
            String str3 = map.get("variantId");
            if (map.containsKey("triggerEvent")) {
                str = map.get("triggerEvent");
            } else {
                str = "";
            }
            return new C30405y1(str2, str3, str, parse, parseLong, parseLong2);
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    /* renamed from: g */
    public static void m4238g(Map<String, String> map) throws AbtException {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : f118613g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
    }

    /* renamed from: c */
    public String m4242c() {
        return this.f118615a;
    }

    /* renamed from: d */
    public long m4241d() {
        return this.f118618d.getTime();
    }

    /* renamed from: e */
    public String m4240e() {
        return this.f118616b;
    }

    /* renamed from: f */
    public InterfaceC12447ba.C12450c m4239f(String str) {
        String str2;
        InterfaceC12447ba.C12450c c12450c = new InterfaceC12447ba.C12450c();
        c12450c.f57701a = str;
        c12450c.f57713m = m4241d();
        c12450c.f57702b = this.f118615a;
        c12450c.f57703c = this.f118616b;
        if (TextUtils.isEmpty(this.f118617c)) {
            str2 = null;
        } else {
            str2 = this.f118617c;
        }
        c12450c.f57704d = str2;
        c12450c.f57705e = this.f118619e;
        c12450c.f57710j = this.f118620f;
        return c12450c;
    }
}
