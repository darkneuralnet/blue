package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¨\u0006\r"}, m28432d2 = {"LmW3;", C17296a.f69688o, "Landroid/graphics/Typeface;", "LIw1;", "variationSettings", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "", "name", "LJw1;", "fontWeight", "b", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: pW3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46910pW3 {
    /* renamed from: a */
    public static final InterfaceC45131mW3 m19153a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new C45724nW3();
        }
        return new C46317oW3();
    }

    /* renamed from: b */
    public static final String m19152b(String name, C33918Jw1 fontWeight) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int m99544k = fontWeight.m99544k() / 100;
        boolean z4 = true;
        if (m99544k >= 0 && m99544k < 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return name + "-thin";
        }
        if (2 <= m99544k && m99544k < 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return name + "-light";
        } else if (m99544k != 4) {
            if (m99544k == 5) {
                return name + "-medium";
            }
            if (6 <= m99544k && m99544k < 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if (8 > m99544k || m99544k >= 11) {
                    z4 = false;
                }
                if (z4) {
                    return name + "-black";
                }
                return name;
            }
            return name;
        } else {
            return name;
        }
    }

    /* renamed from: c */
    public static final Typeface m19151c(Typeface typeface, C33684Iw1 variationSettings, Context context) {
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            return C34670Nb6.f24839a.m93724a(typeface, variationSettings, context);
        }
        return typeface;
    }
}
