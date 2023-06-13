package p000;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.IOException;
import java.util.ArrayList;
import p000.AbstractC39920dj2;
/* renamed from: jw1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C43606jw1 {

    /* renamed from: a */
    public static final AbstractC39920dj2.C19847a f93552a = AbstractC39920dj2.C19847a.m43839a("ch", "size", "w", "style", "fFamily", MessageExtension.FIELD_DATA);

    /* renamed from: b */
    public static final AbstractC39920dj2.C19847a f93553b = AbstractC39920dj2.C19847a.m43839a("shapes");

    private C43606jw1() {
    }

    /* renamed from: a */
    public static C43013iw1 m29722a(AbstractC39920dj2 abstractC39920dj2, C47924rD2 c47924rD2) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC39920dj2.mo2770c();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d2 = 0.0d;
        while (abstractC39920dj2.mo2767g()) {
            int mo2760s = abstractC39920dj2.mo2760s(f93552a);
            if (mo2760s != 0) {
                if (mo2760s != 1) {
                    if (mo2760s != 2) {
                        if (mo2760s != 3) {
                            if (mo2760s != 4) {
                                if (mo2760s != 5) {
                                    abstractC39920dj2.mo2759t();
                                    abstractC39920dj2.mo2758u();
                                } else {
                                    abstractC39920dj2.mo2770c();
                                    while (abstractC39920dj2.mo2767g()) {
                                        if (abstractC39920dj2.mo2760s(f93553b) != 0) {
                                            abstractC39920dj2.mo2759t();
                                            abstractC39920dj2.mo2758u();
                                        } else {
                                            abstractC39920dj2.mo2771b();
                                            while (abstractC39920dj2.mo2767g()) {
                                                arrayList.add((C47781qy5) AA0.m116044a(abstractC39920dj2, c47924rD2));
                                            }
                                            abstractC39920dj2.mo2769d();
                                        }
                                    }
                                    abstractC39920dj2.mo2768f();
                                }
                            } else {
                                str2 = abstractC39920dj2.mo2762n();
                            }
                        } else {
                            str = abstractC39920dj2.mo2762n();
                        }
                    } else {
                        d = abstractC39920dj2.mo2765k();
                    }
                } else {
                    d2 = abstractC39920dj2.mo2765k();
                }
            } else {
                c = abstractC39920dj2.mo2762n().charAt(0);
            }
        }
        abstractC39920dj2.mo2768f();
        return new C43013iw1(arrayList, c, d2, d, str, str2);
    }
}
