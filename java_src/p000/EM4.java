package p000;

import com.android.volley.VolleyError;
import p000.Y70;
/* renamed from: EM4 */
/* loaded from: classes.dex */
public class EM4<T> {

    /* renamed from: a */
    public final T f7348a;

    /* renamed from: b */
    public final Y70.C9639a f7349b;

    /* renamed from: c */
    public final VolleyError f7350c;

    /* renamed from: d */
    public boolean f7351d;

    /* renamed from: EM4$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1799a {
        void onErrorResponse(VolleyError volleyError);
    }

    /* renamed from: EM4$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1800b<T> {
        void onResponse(T t);
    }

    public EM4(T t, Y70.C9639a c9639a) {
        this.f7351d = false;
        this.f7348a = t;
        this.f7349b = c9639a;
        this.f7350c = null;
    }

    /* renamed from: a */
    public static <T> EM4<T> m109113a(VolleyError volleyError) {
        return new EM4<>(volleyError);
    }

    /* renamed from: c */
    public static <T> EM4<T> m109111c(T t, Y70.C9639a c9639a) {
        return new EM4<>(t, c9639a);
    }

    /* renamed from: b */
    public boolean m109112b() {
        return this.f7350c == null;
    }

    public EM4(VolleyError volleyError) {
        this.f7351d = false;
        this.f7348a = null;
        this.f7349b = null;
        this.f7350c = volleyError;
    }
}
