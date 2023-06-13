package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJG\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, m28432d2 = {"Lsi0;", "", "Lpm0;", "checkedColor", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "Lri0;", C17296a.f69688o, "(JJJJJLEt0;II)Lri0;", "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n83#2,3:486\n1114#3,6:489\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n*L\n234#1:486,3\n234#1:489,6\n*E\n"})
/* renamed from: si0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48801si0 {

    /* renamed from: a */
    public static final C48801si0 f109138a = new C48801si0();

    /* renamed from: b */
    public static final int f109139b = 0;

    private C48801si0() {
    }

    /* renamed from: a */
    public final InterfaceC48209ri0 m13807a(long j, long j2, long j3, long j4, long j5, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        interfaceC32720Et0.mo89638F(469524104);
        if ((i2 & 1) != 0) {
            j6 = TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94898l();
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            j8 = TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94896n();
        } else {
            j8 = j3;
        }
        if ((i2 & 8) != 0) {
            j9 = C47063pm0.m18743m(TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94901i(), C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j9 = j4;
        }
        if ((i2 & 16) != 0) {
            j10 = C47063pm0.m18743m(j6, C36986Wz0.f42427a.m77588b(interfaceC32720Et0, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j10 = j5;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(469524104, i, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:226)");
        }
        Object[] objArr = {C47063pm0.m18747i(j6), C47063pm0.m18747i(j7), C47063pm0.m18747i(j8), C47063pm0.m18747i(j9), C47063pm0.m18747i(j10)};
        interfaceC32720Et0.mo89638F(-568225417);
        boolean z = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z |= interfaceC32720Et0.mo89539n(objArr[i3]);
        }
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (z || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new CW0(j8, C47063pm0.m18743m(j8, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j6, C47063pm0.m18743m(j6, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j9, C47063pm0.m18743m(j9, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j10, j6, j7, j9, j10, null);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        CW0 cw0 = (CW0) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return cw0;
    }
}
