package p000;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, m28432d2 = {"LvY3;", "LwY3;", "Landroid/view/View;", "composeView", "", "width", "height", "", "b", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vY3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50484vY3 extends C51077wY3 {
    @Override // p000.C51077wY3, p000.InterfaceC49299tY3
    /* renamed from: b */
    public void mo6680b(View composeView, int i, int i2) {
        List mutableListOf;
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new Rect(0, 0, i, i2));
        composeView.setSystemGestureExclusionRects(mutableListOf);
    }
}
