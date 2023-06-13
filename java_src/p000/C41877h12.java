package p000;

import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* renamed from: h12  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C41877h12 implements InterfaceC52643zA6 {

    /* renamed from: a */
    public static final String[] f84622a = new String[0];

    @Override // p000.InterfaceC52643zA6
    /* renamed from: a */
    public String[] mo1719a() {
        return f84622a;
    }

    @Override // p000.InterfaceC52643zA6
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }
}
