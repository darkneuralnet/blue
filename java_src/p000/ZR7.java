package p000;

import com.google.firebase.encoders.EncodingException;
/* renamed from: ZR7 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ZR7 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final /* synthetic */ ZR7 f48578a = new ZR7();

    private /* synthetic */ ZR7() {
    }

    @Override // p000.InterfaceC45768nb1
    public final void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) {
        String str;
        InterfaceC34919Od3 interfaceC34919Od3 = C46285oS7.f102028d;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
