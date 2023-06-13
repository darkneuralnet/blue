package p000;

import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC23170iE;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016R\u001c\u0010\u0015\u001a\u00028\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LcE;", "LiE;", "T", "Lhc5;", "Ldm5;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "", "onResume", "onPause", "q", "getPresenter", "()LiE;", "setPresenter", "(LiE;)V", "presenter", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cE */
/* loaded from: classes4.dex */
public abstract class AbstractC13474cE<T extends AbstractC23170iE<?>> extends AbstractC42224hc5 implements InterfaceC39953dm5 {
    public abstract T getPresenter();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C40679f00.m42291c(inflater).getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getPresenter().m34310g();
    }

    @Override // p000.AbstractC45245mi1, androidx.fragment.app.Fragment
    public void onResume() {
        FrameLayout frameLayout;
        Window window;
        View decorView;
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(C33795Ji4.design_bottom_sheet)) != null) {
            Rect rect = new Rect();
            FragmentActivity activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.getWindowVisibleDisplayFrame(rect);
                Unit unit = Unit.INSTANCE;
                frameLayout.getLayoutParams().height = rect.height();
            }
        }
        getPresenter().m34309h();
    }

    @Override // p000.InterfaceC39953dm5
    /* renamed from: q */
    public void mo43724q() {
        InterfaceC40099e13 mo58957w;
        FragmentActivity activity = getActivity();
        BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
        if (baseActivity == null || (mo58957w = baseActivity.mo58957w()) == null) {
            return;
        }
        InterfaceC40099e13.C19924a.goToNearbyBirds$default(mo58957w, true, null, null, null, null, null, null, this, 126, null);
    }
}
