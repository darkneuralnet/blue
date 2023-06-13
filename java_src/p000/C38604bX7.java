package p000;

import com.google.firebase.encoders.EncodingException;
/* renamed from: bX7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C38604bX7 implements InterfaceC34919Od3 {

    /* renamed from: a */
    public static final /* synthetic */ C38604bX7 f57679a = new C38604bX7();

    private /* synthetic */ C38604bX7() {
    }

    @Override // p000.InterfaceC45768nb1
    public final void encode(Object obj, InterfaceC35153Pd3 interfaceC35153Pd3) {
        String str;
        InterfaceC34919Od3 interfaceC34919Od3 = C47516qX7.f105383d;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
