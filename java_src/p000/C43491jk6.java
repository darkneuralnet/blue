package p000;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;
import p000.C49297tY1;
import p000.C49890uY1;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0002\u001a\b\u0018\u00010\u0000R\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\n"}, m28432d2 = {"Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "Landroid/content/res/XmlResourceParser;", "parser", "", "changingConfigurations", "LuY1$a;", C17296a.f69688o, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n76#2:154\n83#3,3:155\n1114#4,6:158\n1#5:164\n*S KotlinDebug\n*F\n+ 1 VectorResources.android.kt\nandroidx/compose/ui/res/VectorResources_androidKt\n*L\n49#1:154\n53#1:155,3\n53#1:158,6\n*E\n"})
/* renamed from: jk6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43491jk6 {
    /* renamed from: a */
    public static final C49890uY1.C29251a m30006a(Resources.Theme theme, Resources res, XmlResourceParser parser, int i) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(parser, "parser");
        AttributeSet attrs = Xml.asAttributeSet(parser);
        C12460be c12460be = new C12460be(parser, 0, 2, null);
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        C49297tY1.C28778a m77149a = XH6.m77149a(c12460be, res, theme, attrs);
        int i2 = 0;
        while (!XH6.m77146d(parser)) {
            i2 = XH6.m77143g(c12460be, res, attrs, theme, m77149a, i2);
            parser.next();
        }
        return new C49890uY1.C29251a(m77149a.m12079f(), i);
    }
}
