package p000;

import android.graphics.Rect;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u000e"}, m28432d2 = {"Lks5;", "", "Lis5;", C17296a.f69688o, "Lis5;", "b", "()Lis5;", "semanticsNode", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "adjustedBounds", "<init>", "(Lis5;Landroid/graphics/Rect;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ks5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44163ks5 {

    /* renamed from: a */
    public final C42977is5 f95141a;

    /* renamed from: b */
    public final Rect f95142b;

    public C44163ks5(C42977is5 semanticsNode, Rect adjustedBounds) {
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        Intrinsics.checkNotNullParameter(adjustedBounds, "adjustedBounds");
        this.f95141a = semanticsNode;
        this.f95142b = adjustedBounds;
    }

    /* renamed from: a */
    public final Rect m28251a() {
        return this.f95142b;
    }

    /* renamed from: b */
    public final C42977is5 m28250b() {
        return this.f95141a;
    }
}
