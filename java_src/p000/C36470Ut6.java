package p000;

import android.view.View;
import android.view.ViewParent;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Landroid/view/View;", "LXr6;", "viewModelStoreOwner", "", "b", "(Landroid/view/View;LXr6;)V", C17296a.f69688o, "(Landroid/view/View;)LXr6;", "lifecycle-viewmodel_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "ViewTreeViewModelStoreOwner")
/* renamed from: Ut6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36470Ut6 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/view/View;", "view", C17296a.f69688o, "(Landroid/view/View;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ut6$a */
    /* loaded from: classes.dex */
    public static final class C8492a extends Lambda implements Function1<View, View> {

        /* renamed from: g */
        public static final C8492a f38220g = new C8492a();

        public C8492a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "view", "LXr6;", C17296a.f69688o, "(Landroid/view/View;)LXr6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ut6$b */
    /* loaded from: classes.dex */
    public static final class C8493b extends Lambda implements Function1<View, InterfaceC37154Xr6> {

        /* renamed from: g */
        public static final C8493b f38221g = new C8493b();

        public C8493b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC37154Xr6 invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object tag = view.getTag(C32157Ci4.view_tree_view_model_store_owner);
            if (tag instanceof InterfaceC37154Xr6) {
                return (InterfaceC37154Xr6) tag;
            }
            return null;
        }
    }

    @JvmName(name = "get")
    /* renamed from: a */
    public static final InterfaceC37154Xr6 m80658a(View view) {
        Sequence generateSequence;
        Sequence mapNotNull;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(view, "<this>");
        generateSequence = SequencesKt__SequencesKt.generateSequence(view, C8492a.f38220g);
        mapNotNull = SequencesKt___SequencesKt.mapNotNull(generateSequence, C8493b.f38221g);
        firstOrNull = SequencesKt___SequencesKt.firstOrNull(mapNotNull);
        return (InterfaceC37154Xr6) firstOrNull;
    }

    @JvmName(name = "set")
    /* renamed from: b */
    public static final void m80657b(View view, InterfaceC37154Xr6 interfaceC37154Xr6) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C32157Ci4.view_tree_view_model_store_owner, interfaceC37154Xr6);
    }
}
