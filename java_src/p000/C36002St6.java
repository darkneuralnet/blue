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
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Landroid/view/View;", "Lcf3;", "onBackPressedDispatcherOwner", "", "b", "(Landroid/view/View;Lcf3;)V", C17296a.f69688o, "(Landroid/view/View;)Lcf3;", "activity_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@JvmName(name = "ViewTreeOnBackPressedDispatcherOwner")
/* renamed from: St6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36002St6 {

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/view/View;", "it", C17296a.f69688o, "(Landroid/view/View;)Landroid/view/View;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: St6$a */
    /* loaded from: classes.dex */
    public static final class C7578a extends Lambda implements Function1<View, View> {

        /* renamed from: g */
        public static final C7578a f34415g = new C7578a();

        public C7578a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final View invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ViewParent parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "it", "Lcf3;", C17296a.f69688o, "(Landroid/view/View;)Lcf3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: St6$b */
    /* loaded from: classes.dex */
    public static final class C7579b extends Lambda implements Function1<View, InterfaceC39270cf3> {

        /* renamed from: g */
        public static final C7579b f34416g = new C7579b();

        public C7579b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC39270cf3 invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object tag = it.getTag(C34965Oi4.view_tree_on_back_pressed_dispatcher_owner);
            if (tag instanceof InterfaceC39270cf3) {
                return (InterfaceC39270cf3) tag;
            }
            return null;
        }
    }

    @JvmName(name = "get")
    /* renamed from: a */
    public static final InterfaceC39270cf3 m84672a(View view) {
        Sequence generateSequence;
        Sequence mapNotNull;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(view, "<this>");
        generateSequence = SequencesKt__SequencesKt.generateSequence(view, C7578a.f34415g);
        mapNotNull = SequencesKt___SequencesKt.mapNotNull(generateSequence, C7579b.f34416g);
        firstOrNull = SequencesKt___SequencesKt.firstOrNull(mapNotNull);
        return (InterfaceC39270cf3) firstOrNull;
    }

    @JvmName(name = "set")
    /* renamed from: b */
    public static final void m84671b(View view, InterfaceC39270cf3 onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(C34965Oi4.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
