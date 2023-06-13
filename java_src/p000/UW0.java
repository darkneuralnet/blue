package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m28432d2 = {"LUW0;", "Ly12;", "Le62;", "interactionSource", "Lz12;", C17296a.f69688o, "(Le62;LEt0;I)Lz12;", "<init>", "()V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,186:1\n36#2:187\n1114#3,6:188\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/DefaultDebugIndication\n*L\n171#1:187\n171#1:188,6\n*E\n"})
/* renamed from: UW0 */
/* loaded from: classes.dex */
public final class UW0 implements InterfaceC51956y12 {

    /* renamed from: a */
    public static final UW0 f37485a = new UW0();

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B1\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u0010"}, m28432d2 = {"LUW0$a;", "Lz12;", "LiA0;", "", C17296a.f69688o, "LsP5;", "", "b", "LsP5;", "isPressed", "c", "isHovered", DateTokenConverter.CONVERTER_KEY, "isFocused", "<init>", "(LsP5;LsP5;LsP5;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: UW0$a */
    /* loaded from: classes.dex */
    public static final class C8306a implements InterfaceC52549z12 {

        /* renamed from: b */
        public final InterfaceC48627sP5<Boolean> f37486b;

        /* renamed from: c */
        public final InterfaceC48627sP5<Boolean> f37487c;

        /* renamed from: d */
        public final InterfaceC48627sP5<Boolean> f37488d;

        public C8306a(InterfaceC48627sP5<Boolean> isPressed, InterfaceC48627sP5<Boolean> isHovered, InterfaceC48627sP5<Boolean> isFocused) {
            Intrinsics.checkNotNullParameter(isPressed, "isPressed");
            Intrinsics.checkNotNullParameter(isHovered, "isHovered");
            Intrinsics.checkNotNullParameter(isFocused, "isFocused");
            this.f37486b = isPressed;
            this.f37487c = isHovered;
            this.f37488d = isFocused;
        }

        @Override // p000.InterfaceC52549z12
        /* renamed from: a */
        public void mo2014a(InterfaceC42558iA0 interfaceC42558iA0) {
            Intrinsics.checkNotNullParameter(interfaceC42558iA0, "<this>");
            interfaceC42558iA0.mo34387n0();
            if (this.f37486b.getValue().booleanValue()) {
                I61.m102945z0(interfaceC42558iA0, C47063pm0.m18743m(C47063pm0.f104050b.m18732a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC42558iA0.mo96360h(), 0.0f, null, null, 0, 122, null);
            } else if (this.f37487c.getValue().booleanValue() || this.f37488d.getValue().booleanValue()) {
                I61.m102945z0(interfaceC42558iA0, C47063pm0.m18743m(C47063pm0.f104050b.m18732a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC42558iA0.mo96360h(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private UW0() {
    }

    @Override // p000.InterfaceC51956y12
    /* renamed from: a */
    public InterfaceC52549z12 mo4237a(InterfaceC40148e62 interactionSource, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        interfaceC32720Et0.mo89638F(1683566979);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1683566979, i, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i2 = i & 14;
        InterfaceC48627sP5<Boolean> m86094a = S14.m86094a(interactionSource, interfaceC32720Et0, i2);
        InterfaceC48627sP5<Boolean> m27384a = C44455lN1.m27384a(interactionSource, interfaceC32720Et0, i2);
        InterfaceC48627sP5<Boolean> m116a = C53082zv1.m116a(interactionSource, interfaceC32720Et0, i2);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(interactionSource);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new C8306a(m86094a, m27384a, m116a);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C8306a c8306a = (C8306a) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c8306a;
    }
}
