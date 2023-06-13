package p000;

import android.view.View;
import co.bird.android.feature.fleetstatus.kpi.views.ScoreboardView;
/* renamed from: Of2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34936Of2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ScoreboardView f27017a;

    /* renamed from: b */
    public final ScoreboardView f27018b;

    public C34936Of2(ScoreboardView scoreboardView, ScoreboardView scoreboardView2) {
        this.f27017a = scoreboardView;
        this.f27018b = scoreboardView2;
    }

    /* renamed from: a */
    public static C34936Of2 m91721a(View view) {
        if (view != null) {
            ScoreboardView scoreboardView = (ScoreboardView) view;
            return new C34936Of2(scoreboardView, scoreboardView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ScoreboardView getRoot() {
        return this.f27017a;
    }
}
