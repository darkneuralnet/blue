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
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Landroid/view/View;", "LLifecycleOwner;", "lifecycleOwner", "", "b", "(Landroid/view/View;LLifecycleOwner;)V", C17296a.f69688o, "(Landroid/view/View;)LLifecycleOwner;", "lifecycle-runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "ViewTreeLifecycleOwner")
/* renamed from: Qt6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35534Qt6 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/view/View;", "currentView", C17296a.f69688o, "(Landroid/view/View;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt6$a */
    /* loaded from: classes.dex */
    public static final class C6973a extends Lambda implements Function1<View, View> {

        /* renamed from: g */
        public static final C6973a f31140g = new C6973a();

        public C6973a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(View currentView) {
            Intrinsics.checkNotNullParameter(currentView, "currentView");
            ViewParent parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "viewParent", "LLifecycleOwner;", C17296a.f69688o, "(Landroid/view/View;)LLifecycleOwner;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Qt6$b */
    /* loaded from: classes.dex */
    public static final class C6974b extends Lambda implements Function1<View, LifecycleOwner> {

        /* renamed from: g */
        public static final C6974b f31141g = new C6974b();

        public C6974b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final LifecycleOwner invoke(View viewParent) {
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            Object tag = viewParent.getTag(C48213ri4.view_tree_lifecycle_owner);
            if (tag instanceof LifecycleOwner) {
                return (LifecycleOwner) tag;
            }
            return null;
        }
    }

    @JvmName(name = "get")
    /* renamed from: a */
    public static final LifecycleOwner m87653a(View view) {
        Sequence generateSequence;
        Sequence mapNotNull;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(view, "<this>");
        generateSequence = SequencesKt__SequencesKt.generateSequence(view, C6973a.f31140g);
        mapNotNull = SequencesKt___SequencesKt.mapNotNull(generateSequence, C6974b.f31141g);
        firstOrNull = SequencesKt___SequencesKt.firstOrNull(mapNotNull);
        return (LifecycleOwner) firstOrNull;
    }

    @JvmName(name = "set")
    /* renamed from: b */
    public static final void m87652b(View view, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C48213ri4.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
