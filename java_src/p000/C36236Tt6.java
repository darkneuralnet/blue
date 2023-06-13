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
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Landroid/view/View;", "LPi5;", "owner", "", "b", "(Landroid/view/View;LPi5;)V", C17296a.f69688o, "(Landroid/view/View;)LPi5;", "savedstate_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "ViewTreeSavedStateRegistryOwner")
/* renamed from: Tt6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36236Tt6 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/view/View;", "view", C17296a.f69688o, "(Landroid/view/View;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Tt6$a */
    /* loaded from: classes.dex */
    public static final class C8140a extends Lambda implements Function1<View, View> {

        /* renamed from: g */
        public static final C8140a f36418g = new C8140a();

        public C8140a() {
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "view", "LPi5;", C17296a.f69688o, "(Landroid/view/View;)LPi5;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Tt6$b */
    /* loaded from: classes.dex */
    public static final class C8141b extends Lambda implements Function1<View, InterfaceC35200Pi5> {

        /* renamed from: g */
        public static final C8141b f36419g = new C8141b();

        public C8141b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC35200Pi5 invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object tag = view.getTag(C36117Tg4.view_tree_saved_state_registry_owner);
            if (tag instanceof InterfaceC35200Pi5) {
                return (InterfaceC35200Pi5) tag;
            }
            return null;
        }
    }

    @JvmName(name = "get")
    /* renamed from: a */
    public static final InterfaceC35200Pi5 m82297a(View view) {
        Sequence generateSequence;
        Sequence mapNotNull;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(view, "<this>");
        generateSequence = SequencesKt__SequencesKt.generateSequence(view, C8140a.f36418g);
        mapNotNull = SequencesKt___SequencesKt.mapNotNull(generateSequence, C8141b.f36419g);
        firstOrNull = SequencesKt___SequencesKt.firstOrNull(mapNotNull);
        return (InterfaceC35200Pi5) firstOrNull;
    }

    @JvmName(name = "set")
    /* renamed from: b */
    public static final void m82296b(View view, InterfaceC35200Pi5 interfaceC35200Pi5) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(C36117Tg4.view_tree_saved_state_registry_owner, interfaceC35200Pi5);
    }
}
