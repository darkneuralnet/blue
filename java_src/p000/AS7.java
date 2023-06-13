package p000;

import com.google.firebase.encoders.EncodingException;
/* renamed from: AS7 */
/* loaded from: classes5.dex */
public final /* synthetic */ class AS7 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final /* synthetic */ AS7 f572a = new AS7();

    private /* synthetic */ AS7() {
    }

    @Override // p000.InterfaceC45768nb1
    public final void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) {
        String str;
        InterfaceC34919Od3 interfaceC34919Od3 = RS7.f32060d;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
