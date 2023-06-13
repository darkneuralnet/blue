package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\u0014\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\"\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0002H\u0002R*\u0010\u001a\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c¨\u0006 "}, m28432d2 = {"LNt6;", "", "Landroid/view/View;", "T", "LMt6;", "viewTransformer", "", "c", "LQq6;", "viewCreator", DateTokenConverter.CONVERTER_KEY, "", "name", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", C17296a.f69688o, "view", "e", "parentView", "f", "b", "", "Ljava/lang/Class;", "Ljava/util/Map;", "transformers", "", "Ljava/util/List;", "creators", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nViewTransformerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTransformerManager.kt\ndev/b3nedikt/reword/ViewTransformerManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* renamed from: Nt6  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34832Nt6 {

    /* renamed from: a */
    public final Map<Class<?>, InterfaceC34598Mt6<View>> f25349a = new LinkedHashMap();

    /* renamed from: b */
    public final List<InterfaceC35507Qq6<View>> f25350b = new ArrayList();

    /* renamed from: a */
    public final View m93219a(String name, Context context, AttributeSet attributeSet) {
        Object obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Iterator<T> it = this.f25350b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((InterfaceC35507Qq6) obj).mo19124b(), name)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC35507Qq6 interfaceC35507Qq6 = (InterfaceC35507Qq6) obj;
        if (interfaceC35507Qq6 == null) {
            return null;
        }
        return interfaceC35507Qq6.mo19125a(context, attributeSet);
    }

    /* renamed from: b */
    public final InterfaceC34598Mt6<View> m93218b(View view) {
        Object obj;
        InterfaceC34598Mt6<View> interfaceC34598Mt6 = this.f25349a.get(view.getClass());
        if (interfaceC34598Mt6 == null) {
            Iterator<T> it = this.f25349a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((InterfaceC34598Mt6) obj).getViewType().isInstance(view)) {
                    break;
                }
            }
            return (InterfaceC34598Mt6) obj;
        }
        return interfaceC34598Mt6;
    }

    /* renamed from: c */
    public final <T extends View> void m93217c(InterfaceC34598Mt6<? super T> viewTransformer) {
        Intrinsics.checkNotNullParameter(viewTransformer, "viewTransformer");
        this.f25349a.put(viewTransformer.getViewType(), viewTransformer);
    }

    /* renamed from: d */
    public final void m93216d(InterfaceC35507Qq6<? extends View> viewCreator) {
        Intrinsics.checkNotNullParameter(viewCreator, "viewCreator");
        this.f25350b.add(viewCreator);
    }

    /* renamed from: e */
    public final View m93215e(View view, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        InterfaceC34598Mt6<View> m93218b = m93218b(view);
        if (m93218b != null) {
            Map<String, Integer> m9705c = C29312up.m9705c(attrs, m93218b.mo6469a());
            view.setTag(C35415Qg4.view_tag, m9705c);
            m93218b.mo6468b(view, m9705c);
        }
        return view;
    }

    /* renamed from: f */
    public final void m93214f(View parentView) {
        List mutableListOf;
        Map<String, Integer> map;
        InterfaceC34598Mt6<View> m93218b;
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        ArrayList arrayList = new ArrayList();
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(parentView);
        while (!mutableListOf.isEmpty()) {
            View view = (View) mutableListOf.remove(0);
            Object tag = view.getTag(C35415Qg4.view_tag);
            if (tag instanceof Map) {
                map = (Map) tag;
            } else {
                map = null;
            }
            if (map != null && (m93218b = m93218b(view)) != null) {
                m93218b.mo6468b(view, map);
            }
            arrayList.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(childAt, "child.getChildAt(i)");
                    mutableListOf.add(childAt);
                }
            }
        }
    }
}
