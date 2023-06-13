package p000;
/* renamed from: qn1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47667qn1 extends AbstractC45077mQ3 {

    /* renamed from: b */
    public static final C10776ad f105787b = C10776ad.m71007e();

    /* renamed from: a */
    public final C19853dm f105788a;

    public C47667qn1(C19853dm c19853dm) {
        this.f105788a = c19853dm;
    }

    @Override // p000.AbstractC45077mQ3
    /* renamed from: c */
    public boolean mo6338c() {
        if (!m17078g()) {
            f105787b.m71002j("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m17078g() {
        C19853dm c19853dm = this.f105788a;
        if (c19853dm == null) {
            f105787b.m71002j("ApplicationInfo is null");
            return false;
        } else if (!c19853dm.m43747f0()) {
            f105787b.m71002j("GoogleAppId is null");
            return false;
        } else if (!this.f105788a.m43749d0()) {
            f105787b.m71002j("AppInstanceId is null");
            return false;
        } else if (!this.f105788a.m43748e0()) {
            f105787b.m71002j("ApplicationProcessState is null");
            return false;
        } else if (this.f105788a.m43750c0()) {
            if (!this.f105788a.m43753Z().m25382Y()) {
                f105787b.m71002j("AndroidAppInfo.packageName is null");
                return false;
            } else if (!this.f105788a.m43753Z().m25381Z()) {
                f105787b.m71002j("AndroidAppInfo.sdkVersion is null");
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
