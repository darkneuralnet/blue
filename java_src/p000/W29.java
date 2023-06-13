package p000;

import com.google.firebase.encoders.EncodingException;
/* renamed from: W29 */
/* loaded from: classes5.dex */
public final /* synthetic */ class W29 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final /* synthetic */ W29 f40312a = new W29();

    private /* synthetic */ W29() {
    }

    @Override // p000.InterfaceC45768nb1
    public final void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) {
        String str;
        InterfaceC34919Od3 interfaceC34919Od3 = C48426s39.f108189d;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
