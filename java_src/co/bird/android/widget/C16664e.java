package co.bird.android.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import co.bird.android.widget.C16664e;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C17714b;
import io.reactivex.AbstractC24507p;
import io.reactivex.subjects.C24556c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0012H\u0002R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00120\u00120\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/widget/e;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onStart", "onPause", "Landroid/content/DialogInterface;", "dialog", "onCancel", "onDismiss", "Lio/reactivex/p;", "", "D9", "option", "A9", "Lio/reactivex/subjects/c;", "kotlin.jvm.PlatformType", "b", "Lio/reactivex/subjects/c;", "optionSelection", "<init>", "()V", "c", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.widget.e */
/* loaded from: classes4.dex */
public final class C16664e extends C17714b {

    /* renamed from: c */
    public static final C16665a f68025c = new C16665a(null);

    /* renamed from: b */
    public final C24556c<Integer> f68026b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/e$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.e$a */
    /* loaded from: classes4.dex */
    public static final class C16665a {
        public /* synthetic */ C16665a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16665a() {
        }
    }

    public C16664e() {
        C24556c<Integer> m31906k0 = C24556c.m31906k0();
        Intrinsics.checkNotNullExpressionValue(m31906k0, "create<Int>()");
        this.f68026b = m31906k0;
    }

    /* renamed from: B9 */
    public static final void m54041B9(ViewGroup bottomSheet, LinearLayout linearLayout, C16664e this$0) {
        int i;
        int height;
        ViewParent viewParent;
        View view;
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(bottomSheet, "$bottomSheet");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewGroup.LayoutParams layoutParams = bottomSheet.getLayoutParams();
        int height2 = linearLayout.getHeight();
        FragmentActivity activity = this$0.getActivity();
        int i2 = 0;
        if (activity != null && (frameLayout = (FrameLayout) activity.findViewById(16908290)) != null) {
            i = frameLayout.getHeight();
        } else {
            i = 0;
        }
        if (height2 > i) {
            height = -1;
        } else {
            height = linearLayout.getHeight();
        }
        layoutParams.height = height;
        View view2 = this$0.getView();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (view2 != null) {
            viewParent = view2.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view = (View) viewParent;
        } else {
            view = null;
        }
        if (view != null) {
            layoutParams2 = view.getLayoutParams();
        }
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior m67769f = ((CoordinatorLayout.C11529e) layoutParams2).m67769f();
        Intrinsics.checkNotNull(m67769f, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) m67769f;
        View view3 = this$0.getView();
        if (view3 != null) {
            i2 = view3.getMeasuredHeight();
        }
        bottomSheetBehavior.m50092k0(i2);
    }

    /* renamed from: t8 */
    public static final void m54037t8(C16664e this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m54042A9(i);
    }

    /* renamed from: A9 */
    public final void m54042A9(int i) {
        this.f68026b.onSuccess(Integer.valueOf(i));
        dismiss();
    }

    /* renamed from: D9 */
    public final AbstractC24507p<Integer> m54040D9() {
        return this.f68026b;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f68026b.m31905l0()) {
            this.f68026b.onComplete();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        BottomSheetModel bottomSheetModel;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            bottomSheetModel = (BottomSheetModel) arguments.getParcelable("bottom_sheet_model");
        } else {
            bottomSheetModel = null;
        }
        if (bottomSheetModel == null) {
            bottomSheetModel = new BottomSheetModel(null, null, null, 0, null, 31, null);
        }
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        BottomSheetOptionLayout bottomSheetOptionLayout = new BottomSheetOptionLayout(context, bottomSheetModel.m54722b(), bottomSheetModel.m54721c());
        if (viewGroup != null) {
            bottomSheetOptionLayout.setLayoutParams(new LinearLayout.LayoutParams(viewGroup.getLayoutParams()));
        }
        bottomSheetOptionLayout.setTitle(bottomSheetModel.m54718g());
        bottomSheetOptionLayout.setSubtitle(bottomSheetModel.m54719e());
        int size = bottomSheetModel.m54720d().size();
        for (final int i = 0; i < size; i++) {
            bottomSheetOptionLayout.m54714V(bottomSheetModel.m54720d().get(i)).setOnClickListener(new View.OnClickListener() { // from class: VZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C16664e.m54037t8(C16664e.this, i, view);
                }
            });
        }
        return bottomSheetOptionLayout;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        if (!this.f68026b.m31905l0()) {
            this.f68026b.onComplete();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        dismiss();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onStart() {
        final ViewGroup viewGroup;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            viewGroup = (ViewGroup) dialog.findViewById(C33795Ji4.design_bottom_sheet);
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return;
        }
        final LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C52955zi4.linearLayout);
        linearLayout.post(new Runnable() { // from class: WZ
            @Override // java.lang.Runnable
            public final void run() {
                C16664e.m54041B9(viewGroup, linearLayout, this);
            }
        });
    }
}
