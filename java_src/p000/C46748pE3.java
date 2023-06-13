package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.p003ui.platform.C11411h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p000.C49890uY1;
import p000.InterfaceC32720Et0;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u000f"}, m28432d2 = {"", "id", "LnE3;", DateTokenConverter.CONVERTER_KEY, "(ILEt0;I)LnE3;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "LtY1;", "c", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILEt0;I)LtY1;", "LMW1;", "b", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,116:1\n76#2:117\n76#2:135\n25#3:118\n67#3,3:125\n66#3:128\n1114#4,6:119\n1114#4,6:129\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:117\n88#1:135\n60#1:118\n69#1:125,3\n69#1:128\n60#1:119,6\n69#1:129,6\n*E\n"})
/* renamed from: pE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46748pE3 {
    /* renamed from: b */
    public static final MW1 m19795b(Resources resources, int i) {
        return PX1.m90164a(MW1.f23178a, resources, i);
    }

    /* renamed from: c */
    public static final C49297tY1 m19794c(Resources.Theme theme, Resources resources, int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        interfaceC32720Et0.mo89638F(21855625);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)");
        }
        C49890uY1 c49890uY1 = (C49890uY1) interfaceC32720Et0.mo89572c(C11411h.m68323h());
        C49890uY1.C29252b c29252b = new C49890uY1.C29252b(theme, i);
        C49890uY1.C29251a m10091b = c49890uY1.m10091b(c29252b);
        if (m10091b == null) {
            XmlResourceParser xml = resources.getXml(i);
            Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(id)");
            if (Intrinsics.areEqual(XH6.m77140j(xml).getName(), "vector")) {
                m10091b = C43491jk6.m30006a(theme, resources, xml, i2);
                c49890uY1.m10089d(c29252b, m10091b);
            } else {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
            }
        }
        C49297tY1 m10087b = m10091b.m10087b();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return m10087b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r7 == true) goto L11;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC45562nE3 m19793d(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        AbstractC45562nE3 c13582cU;
        boolean endsWith$default;
        interfaceC32720Et0.mo89638F(473971343);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) interfaceC32720Et0.mo89572c(C11411h.m68324g());
        Resources m110565a = DM4.m110565a(interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-492369756);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            mo89635G = new TypedValue();
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        TypedValue typedValue = (TypedValue) mo89635G;
        boolean z = true;
        m110565a.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            endsWith$default = StringsKt__StringsKt.endsWith$default(charSequence, (CharSequence) ".xml", false, 2, (Object) null);
        }
        z = false;
        if (z) {
            interfaceC32720Et0.mo89638F(-738265327);
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
            c13582cU = C41712gk6.m37758b(m19794c(theme, m110565a, i, typedValue.changingConfigurations, interfaceC32720Et0, ((i2 << 6) & 896) | 72), interfaceC32720Et0, 0);
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-738265172);
            Object valueOf = Integer.valueOf(i);
            Object theme2 = context.getTheme();
            interfaceC32720Et0.mo89638F(1618982084);
            boolean mo89539n = interfaceC32720Et0.mo89539n(valueOf) | interfaceC32720Et0.mo89539n(charSequence) | interfaceC32720Et0.mo89539n(theme2);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = m19795b(m110565a, i);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            c13582cU = new C13582cU((MW1) mo89635G2, 0L, 0L, 6, null);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return c13582cU;
    }
}
