package p000;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007¨\u0006\u000f"}, m28432d2 = {"LcQ5;", "", "Landroid/text/StaticLayout;", "layout", "", C17296a.f69688o, "Landroid/text/StaticLayout$Builder;", "builder", "", "lineBreakStyle", "lineBreakWordStyle", "", "b", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cQ5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39132cQ5 {

    /* renamed from: a */
    public static final C39132cQ5 f60618a = new C39132cQ5();

    private C39132cQ5() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m61417a(StaticLayout layout) {
        boolean isFallbackLineSpacingEnabled;
        Intrinsics.checkNotNullParameter(layout, "layout");
        isFallbackLineSpacingEnabled = layout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m61416b(StaticLayout.Builder builder, int i, int i2) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        Intrinsics.checkNotNullParameter(builder, "builder");
        C38539bQ5.m64540a();
        lineBreakStyle = C37946aQ5.m71411a().setLineBreakStyle(i);
        lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i2);
        build = lineBreakWordStyle.build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(build);
    }
}
