package p000;

import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C17714b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\t*\u0001\u0004\b&\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m28432d2 = {"Lmi1;", "Lcom/google/android/material/bottomsheet/b;", "", "onResume", "mi1$b", "b", "Lmi1$b;", "bottomSheetCallback", "<init>", "()V", "c", C17296a.f69688o, "bottom-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExpandedBottomSheetFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpandedBottomSheetFragment.kt\nco/bird/android/library/bottomsheet/ExpandedBottomSheetFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
/* renamed from: mi1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC45245mi1 extends C17714b {

    /* renamed from: c */
    public static final C26168a f98581c = new C26168a(null);

    /* renamed from: d */
    public static final Set<Integer> f98582d;

    /* renamed from: b */
    public final C26169b f98583b = new C26169b();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lmi1$a;", "", "", "", "IGNORED_STATES", "Ljava/util/Set;", "<init>", "()V", "bottom-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mi1$a */
    /* loaded from: classes3.dex */
    public static final class C26168a {
        public /* synthetic */ C26168a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C26168a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"mi1$b", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "slideOffset", "", "onSlide", "", "newState", "onStateChanged", "", C17296a.f69688o, "Z", "()Z", "b", "(Z)V", "attached", "bottom-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mi1$b */
    /* loaded from: classes3.dex */
    public static final class C26169b extends BottomSheetBehavior.AbstractC17702f {

        /* renamed from: a */
        public boolean f98584a;

        /* renamed from: a */
        public final boolean m25155a() {
            return this.f98584a;
        }

        /* renamed from: b */
        public final void m25154b(boolean z) {
            this.f98584a = z;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onSlide(View bottomSheet, float f) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
        public void onStateChanged(View bottomSheet, int i) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (AbstractC45245mi1.f98582d.contains(Integer.valueOf(i))) {
                BottomSheetBehavior.m50133G(bottomSheet).m50082p0(3);
            }
        }
    }

    static {
        Set<Integer> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{6, 4});
        f98582d = of;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        FrameLayout frameLayout;
        BottomSheetBehavior m50133G;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog != null) {
            frameLayout = (FrameLayout) dialog.findViewById(C33795Ji4.design_bottom_sheet);
        } else {
            frameLayout = null;
        }
        if (frameLayout != null && (m50133G = BottomSheetBehavior.m50133G(frameLayout)) != null) {
            m50133G.m50082p0(3);
            if (!this.f98583b.m25155a()) {
                this.f98583b.m25154b(true);
                m50133G.m50073u(this.f98583b);
            }
        }
    }
}
