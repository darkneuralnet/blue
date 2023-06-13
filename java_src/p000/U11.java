package p000;

import android.graphics.Rect;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.util.List;
/* renamed from: U11 */
/* loaded from: classes6.dex */
public class U11 {

    /* renamed from: a */
    public final Rect f36695a;

    /* renamed from: b */
    public final Integer f36696b;

    /* renamed from: c */
    public final List f36697c;

    /* renamed from: U11$a */
    /* loaded from: classes6.dex */
    public static class C8175a {

        /* renamed from: a */
        public final String f36698a;

        /* renamed from: b */
        public final float f36699b;

        /* renamed from: c */
        public final int f36700c;

        @KeepForSdk
        public C8175a(String str, float f, int i) {
            this.f36698a = str;
            this.f36699b = f;
            this.f36700c = i;
        }

        /* renamed from: a */
        public float m82114a() {
            return this.f36699b;
        }

        /* renamed from: b */
        public int m82113b() {
            return this.f36700c;
        }

        /* renamed from: c */
        public String m82112c() {
            return this.f36698a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C8175a)) {
                return false;
            }
            C8175a c8175a = (C8175a) obj;
            if (Objects.equal(this.f36698a, c8175a.f36698a) && Float.compare(this.f36699b, c8175a.m82114a()) == 0 && this.f36700c == c8175a.m82113b()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f36698a, Float.valueOf(this.f36699b), Integer.valueOf(this.f36700c));
        }
    }

    @KeepForSdk
    public U11(Rect rect, Integer num, List<C8175a> list) {
        this.f36695a = rect;
        this.f36696b = num;
        this.f36697c = list;
    }

    /* renamed from: a */
    public Rect m82117a() {
        return this.f36695a;
    }

    /* renamed from: b */
    public List<C8175a> m82116b() {
        return this.f36697c;
    }

    /* renamed from: c */
    public Integer m82115c() {
        return this.f36696b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof U11)) {
            return false;
        }
        U11 u11 = (U11) obj;
        if (Objects.equal(this.f36695a, u11.f36695a) && Objects.equal(this.f36696b, u11.f36696b) && Objects.equal(this.f36697c, u11.f36697c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f36695a, this.f36696b, this.f36697c);
    }
}
