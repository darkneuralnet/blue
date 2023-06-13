package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0014J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0014J\n\u0010\b\u001a\u00020\u000f*\u00020\u000eJ\n\u0010\u0010\u001a\u00020\t*\u00020\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011¨\u0006#"}, m28432d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "", "changed", "", "l", "t", "r", "b", "", "onLayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "LFd;", "Landroidx/compose/material/ripple/RippleHostView;", C17296a.f69688o, "I", "MaxRippleHosts", "", "c", "Ljava/util/List;", "rippleHosts", DateTokenConverter.CONVERTER_KEY, "unusedRippleHosts", "Ltb5;", "e", "Ltb5;", "rippleHostMap", "f", "nextHostIndex", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "material-ripple_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {

    /* renamed from: b */
    public final int f52922b;

    /* renamed from: c */
    public final List<RippleHostView> f52923c;

    /* renamed from: d */
    public final List<RippleHostView> f52924d;

    /* renamed from: e */
    public final C49329tb5 f52925e;

    /* renamed from: f */
    public int f52926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleContainer(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52922b = 5;
        ArrayList arrayList = new ArrayList();
        this.f52923c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f52924d = arrayList2;
        this.f52925e = new C49329tb5();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f52926f = 1;
        setTag(C46424oh4.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* renamed from: a */
    public final void m68886a(C2364Fd c2364Fd) {
        Intrinsics.checkNotNullParameter(c2364Fd, "<this>");
        c2364Fd.m106877k();
        RippleHostView m12019b = this.f52925e.m12019b(c2364Fd);
        if (m12019b != null) {
            m12019b.m68881d();
            this.f52925e.m12018c(c2364Fd);
            this.f52924d.add(m12019b);
        }
    }

    /* renamed from: b */
    public final RippleHostView m68885b(C2364Fd c2364Fd) {
        Object removeFirstOrNull;
        int lastIndex;
        Intrinsics.checkNotNullParameter(c2364Fd, "<this>");
        RippleHostView m12019b = this.f52925e.m12019b(c2364Fd);
        if (m12019b != null) {
            return m12019b;
        }
        removeFirstOrNull = CollectionsKt__MutableCollectionsKt.removeFirstOrNull(this.f52924d);
        RippleHostView rippleHostView = (RippleHostView) removeFirstOrNull;
        if (rippleHostView == null) {
            int i = this.f52926f;
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f52923c);
            if (i > lastIndex) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                rippleHostView = new RippleHostView(context);
                addView(rippleHostView);
                this.f52923c.add(rippleHostView);
            } else {
                rippleHostView = this.f52923c.get(this.f52926f);
                C2364Fd m12020a = this.f52925e.m12020a(rippleHostView);
                if (m12020a != null) {
                    m12020a.m106877k();
                    this.f52925e.m12018c(m12020a);
                    rippleHostView.m68881d();
                }
            }
            int i2 = this.f52926f;
            if (i2 < this.f52922b - 1) {
                this.f52926f = i2 + 1;
            } else {
                this.f52926f = 0;
            }
        }
        this.f52925e.m12017d(c2364Fd, rippleHostView);
        return rippleHostView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
