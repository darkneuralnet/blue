package androidx.compose.p003ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u001a)\u0010\n\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\b\u0010\u0010\u001a\u00020\bH\u0002\u001a\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0019"}, m28432d2 = {"LJm2;", "container", "LYt0;", "parent", "LXt0;", C17296a.f69688o, "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlin/Function0;", "", "content", "e", "(Landroidx/compose/ui/platform/AbstractComposeView;LYt0;Lkotlin/jvm/functions/Function2;)LXt0;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "b", "(Landroidx/compose/ui/platform/AndroidComposeView;LYt0;Lkotlin/jvm/functions/Function2;)LXt0;", "c", "", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "TAG", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWrapper.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Wrapper.android.kt\nandroidx/compose/ui/platform/Wrapper_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
/* renamed from: androidx.compose.ui.platform.m */
/* loaded from: classes.dex */
public final class C11447m {

    /* renamed from: a */
    public static final String f53403a = "Wrapper";

    /* renamed from: b */
    public static final ViewGroup.LayoutParams f53404b = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: a */
    public static final InterfaceC37166Xt0 m68287a(C33829Jm2 container, AbstractC37400Yt0 parent) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return C40027du0.m43531a(new C50535vd6(container), parent);
    }

    /* renamed from: b */
    public static final InterfaceC37166Xt0 m68286b(AndroidComposeView androidComposeView, AbstractC37400Yt0 abstractC37400Yt0, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> function2) {
        WrappedComposition wrappedComposition;
        if (m68284d(androidComposeView)) {
            androidComposeView.setTag(C46424oh4.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
            m68285c();
        }
        InterfaceC37166Xt0 m43531a = C40027du0.m43531a(new C50535vd6(androidComposeView.m68548z0()), abstractC37400Yt0);
        View m68611B0 = androidComposeView.m68611B0();
        int i = C46424oh4.wrapped_composition_tag;
        Object tag = m68611B0.getTag(i);
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition) tag;
        } else {
            wrappedComposition = null;
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, m43531a);
            androidComposeView.m68611B0().setTag(i, wrappedComposition);
        }
        wrappedComposition.mo44876f(function2);
        return wrappedComposition;
    }

    /* renamed from: c */
    public static final void m68285c() {
        if (!K32.m99301c()) {
            try {
                Field declaredField = K32.class.getDeclaredField("isDebugInspectorInfoEnabled");
                declaredField.setAccessible(true);
                declaredField.setBoolean(null, true);
            } catch (Exception unused) {
                Log.w(f53403a, "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
            }
        }
    }

    /* renamed from: d */
    public static final boolean m68284d(AndroidComposeView androidComposeView) {
        if (Build.VERSION.SDK_INT >= 29 && (!C41441gH6.f81927a.m39691a(androidComposeView).isEmpty())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final InterfaceC37166Xt0 m68283e(AbstractComposeView abstractComposeView, AbstractC37400Yt0 parent, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(abstractComposeView, "<this>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(content, "content");
        C11432j.f53379a.m68291a();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            Context context = abstractComposeView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            androidComposeView = new AndroidComposeView(context);
            abstractComposeView.addView(androidComposeView.m68611B0(), f53404b);
        }
        return m68286b(androidComposeView, parent, content);
    }
}
