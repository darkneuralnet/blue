package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m28432d2 = {"LUm4;", "", "Lpm0;", "selectedColor", "unselectedColor", "disabledColor", "LTm4;", C17296a.f69688o, "(JJJLEt0;II)LTm4;", "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n67#2,3:234\n66#2:237\n1114#3,6:238\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n168#1:234,3\n168#1:237\n168#1:238,6\n*E\n"})
/* renamed from: Um4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36405Um4 {

    /* renamed from: a */
    public static final C36405Um4 f37975a = new C36405Um4();

    /* renamed from: b */
    public static final int f37976b = 0;

    private C36405Um4() {
    }

    /* renamed from: a */
    public final InterfaceC36171Tm4 m80876a(long j, long j2, long j3, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        long j4;
        long j5;
        long j6;
        interfaceC32720Et0.mo89638F(1370708026);
        if ((i2 & 1) != 0) {
            j4 = TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94898l();
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j5 = j2;
        }
        if ((i2 & 4) != 0) {
            j6 = C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j6 = j3;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1370708026, i, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)");
        }
        C47063pm0 m18747i = C47063pm0.m18747i(j4);
        C47063pm0 m18747i2 = C47063pm0.m18747i(j5);
        C47063pm0 m18747i3 = C47063pm0.m18747i(j6);
        interfaceC32720Et0.mo89638F(1618982084);
        boolean mo89539n = interfaceC32720Et0.mo89539n(m18747i) | interfaceC32720Et0.mo89539n(m18747i2) | interfaceC32720Et0.mo89539n(m18747i3);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C48703sY0(j4, j5, j6, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C48703sY0 c48703sY0 = (C48703sY0) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c48703sY0;
    }
}
