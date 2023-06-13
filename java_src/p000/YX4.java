package p000;

import androidx.appcompat.app.AppCompatActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: YX4 */
/* loaded from: classes2.dex */
public final class YX4 implements XX4 {

    /* renamed from: a */
    public final ZX4 f45982a;

    public YX4(ZX4 zx4) {
        this.f45982a = zx4;
    }

    /* renamed from: b */
    public static Y94<XX4> m74929b(ZX4 zx4) {
        return C39546d52.m44621a(new YX4(zx4));
    }

    @Override // p000.XX4
    /* renamed from: a */
    public VX4 mo74930a(C51174wi2 c51174wi2, ScopeProvider scopeProvider, AppCompatActivity appCompatActivity) {
        return this.f45982a.m72977b(c51174wi2, scopeProvider, appCompatActivity);
    }
}
