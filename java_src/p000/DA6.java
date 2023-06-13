package p000;

import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* renamed from: DA6 */
/* loaded from: classes.dex */
public class DA6 {

    /* renamed from: a */
    public final WebkitToCompatConverterBoundaryInterface f5327a;

    public DA6(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f5327a = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: a */
    public C37803aA6 m110808a(WebSettings webSettings) {
        return new C37803aA6((WebSettingsBoundaryInterface) C48980t00.m13276a(WebSettingsBoundaryInterface.class, this.f5327a.convertSettings(webSettings)));
    }
}
