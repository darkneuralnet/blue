package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\r\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, m28432d2 = {"LWz0;", "", "", "highContrastAlpha", "lowContrastAlpha", C17296a.f69688o, "(FFLEt0;I)F", "c", "(LEt0;I)F", "high", DateTokenConverter.CONVERTER_KEY, "medium", "b", "disabled", "<init>", "()V", "material_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,132:1\n76#2:133\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n77#1:133\n*E\n"})
/* renamed from: Wz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36986Wz0 {

    /* renamed from: a */
    public static final C36986Wz0 f42427a = new C36986Wz0();

    /* renamed from: b */
    public static final int f42428b = 0;

    private C36986Wz0() {
    }

    /* renamed from: a */
    public final float m77589a(float f, float f2, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(-1528360391);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1528360391, i, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:70)");
        }
        long m18733w = ((C47063pm0) interfaceC32720Et0.mo89572c(C41372gA0.m39962a())).m18733w();
        if (!TM2.f35372a.m83731a(interfaceC32720Et0, 6).m94895o() ? C50619vm0.m8175f(m18733w) >= 0.5d : C50619vm0.m8175f(m18733w) <= 0.5d) {
            f = f2;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return f;
    }

    @JvmName(name = "getDisabled")
    /* renamed from: b */
    public final float m77588b(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(621183615);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(621183615, i, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:56)");
        }
        float m77589a = m77589a(0.38f, 0.38f, interfaceC32720Et0, ((i << 6) & 896) | 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m77589a;
    }

    @JvmName(name = "getHigh")
    /* renamed from: c */
    public final float m77587c(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(629162431);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(629162431, i, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:34)");
        }
        float m77589a = m77589a(1.0f, 0.87f, interfaceC32720Et0, ((i << 6) & 896) | 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m77589a;
    }

    @JvmName(name = "getMedium")
    /* renamed from: d */
    public final float m77586d(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        interfaceC32720Et0.mo89638F(1999054879);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1999054879, i, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:45)");
        }
        float m77589a = m77589a(0.74f, 0.6f, interfaceC32720Et0, ((i << 6) & 896) | 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m77589a;
    }
}
