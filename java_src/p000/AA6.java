package p000;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* renamed from: AA6 */
/* loaded from: classes.dex */
public class AA6 implements InterfaceC52643zA6 {

    /* renamed from: a */
    public WebViewProviderFactoryBoundaryInterface f231a;

    public AA6(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f231a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // p000.InterfaceC52643zA6
    /* renamed from: a */
    public String[] mo1719a() {
        return this.f231a.getSupportedFeatures();
    }

    @Override // p000.InterfaceC52643zA6
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C48980t00.m13276a(WebkitToCompatConverterBoundaryInterface.class, this.f231a.getWebkitToCompatConverter());
    }
}
