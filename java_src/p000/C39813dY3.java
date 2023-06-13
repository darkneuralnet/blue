package p000;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0007\"\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n\"(\u0010\u0013\u001a\u00020\r*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\"\u0015\u0010\u0015\u001a\u00020\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\"\u0018\u0010\u0019\u001a\u00020\u0016*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m28432d2 = {"Landroid/view/View;", "LeY3;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", C17296a.f69688o, "g", "b", "Landroid/view/ViewGroup;", "c", "", "I", "PoolingContainerListenerHolderTag", "IsPoolingContainerTag", "", "value", "e", "(Landroid/view/View;)Z", "h", "(Landroid/view/View;Z)V", "isPoolingContainer", "f", "isWithinPoolingContainer", "LfY3;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)LfY3;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, m28431k = 2, m28430mv = {1, 6, 0})
@JvmName(name = "PoolingContainer")
/* renamed from: dY3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39813dY3 {

    /* renamed from: a */
    public static final int f76759a = C36594Vh4.pooling_container_listener_holder_tag;

    /* renamed from: b */
    public static final int f76760b = C36594Vh4.is_pooling_container_tag;

    @SuppressLint({"ExecutorRegistration"})
    /* renamed from: a */
    public static final void m44170a(View view, InterfaceC40405eY3 listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        m44167d(view).m41205a(listener);
    }

    /* renamed from: b */
    public static final void m44169b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (View view2 : C53047zr6.m221a(view)) {
            m44167d(view2).m41204b();
        }
    }

    /* renamed from: c */
    public static final void m44168c(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        for (View view : C41782gr6.m37379b(viewGroup)) {
            m44167d(view).m41204b();
        }
    }

    /* renamed from: d */
    public static final C40998fY3 m44167d(View view) {
        int i = f76759a;
        C40998fY3 c40998fY3 = (C40998fY3) view.getTag(i);
        if (c40998fY3 == null) {
            C40998fY3 c40998fY32 = new C40998fY3();
            view.setTag(i, c40998fY32);
            return c40998fY32;
        }
        return c40998fY3;
    }

    /* renamed from: e */
    public static final boolean m44166e(View view) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(f76760b);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m44165f(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        for (ViewParent viewParent : C53047zr6.m220b(view)) {
            if ((viewParent instanceof View) && m44166e((View) viewParent)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ExecutorRegistration"})
    /* renamed from: g */
    public static final void m44164g(View view, InterfaceC40405eY3 listener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        m44167d(view).m41203c(listener);
    }

    /* renamed from: h */
    public static final void m44163h(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(f76760b, Boolean.valueOf(z));
    }
}
