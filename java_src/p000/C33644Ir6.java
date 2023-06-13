package p000;

import android.graphics.RenderEffect;
import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, m28432d2 = {"LIr6;", "", "Landroid/view/View;", "view", "Low4;", "target", "", C17296a.f69688o, "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ir6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33644Ir6 {

    /* renamed from: a */
    public static final C33644Ir6 f16338a = new C33644Ir6();

    private C33644Ir6() {
    }

    /* renamed from: a */
    public final void m101581a(View view, AbstractC46574ow4 abstractC46574ow4) {
        RenderEffect renderEffect;
        Intrinsics.checkNotNullParameter(view, "view");
        if (abstractC46574ow4 != null) {
            renderEffect = abstractC46574ow4.m20255a();
        } else {
            renderEffect = null;
        }
        view.setRenderEffect(renderEffect);
    }
}
