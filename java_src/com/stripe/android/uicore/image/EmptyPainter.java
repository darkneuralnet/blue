package com.stripe.android.uicore.image;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014R\u001d\u0010\b\u001a\u00020\u00058VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/uicore/image/EmptyPainter;", "LnE3;", "LI61;", "", "onDraw", "LxB5;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "<init>", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class EmptyPainter extends AbstractC45562nE3 {
    public static final EmptyPainter INSTANCE = new EmptyPainter();

    private EmptyPainter() {
    }

    @Override // p000.AbstractC45562nE3
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo116236getIntrinsicSizeNHjbRc() {
        return C51465xB5.f117175b.m5724a();
    }

    @Override // p000.AbstractC45562nE3
    public void onDraw(I61 i61) {
        Intrinsics.checkNotNullParameter(i61, "<this>");
    }
}
