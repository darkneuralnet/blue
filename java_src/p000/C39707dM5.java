package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m28432d2 = {"LdM5;", "", "Lpm0;", C17296a.f69688o, "(LEt0;I)J", "backgroundColor", "b", "primaryActionColor", "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39707dM5 {

    /* renamed from: a */
    public static final C39707dM5 f76502a = new C39707dM5();

    private C39707dM5() {
    }

    @JvmName(name = "getBackgroundColor")
    /* renamed from: a */
    public final long m44348a(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(1630911716);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1630911716, i, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:200)");
        }
        TM2 tm2 = TM2.f35372a;
        long m8177d = C50619vm0.m8177d(C47063pm0.m18743m(tm2.m83731a(interfaceC32720Et0, 6).m94901i(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), tm2.m83731a(interfaceC32720Et0, 6).m94896n());
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m8177d;
    }

    @JvmName(name = "getPrimaryActionColor")
    /* renamed from: b */
    public final long m44347b(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long m94899k;
        interfaceC32720Et0.mo89638F(-810329402);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-810329402, i, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)");
        }
        C34529Mm0 m83731a = TM2.f35372a.m83731a(interfaceC32720Et0, 6);
        if (m83731a.m94895o()) {
            m94899k = C50619vm0.m8177d(C47063pm0.m18743m(m83731a.m94896n(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), m83731a.m94900j());
        } else {
            m94899k = m83731a.m94899k();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m94899k;
    }
}
