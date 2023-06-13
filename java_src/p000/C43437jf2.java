package p000;

import android.view.View;
import co.bird.android.feature.fleetstatus.kpi.views.FleetReportPanelView;
/* renamed from: jf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43437jf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FleetReportPanelView f93109a;

    /* renamed from: b */
    public final FleetReportPanelView f93110b;

    public C43437jf2(FleetReportPanelView fleetReportPanelView, FleetReportPanelView fleetReportPanelView2) {
        this.f93109a = fleetReportPanelView;
        this.f93110b = fleetReportPanelView2;
    }

    /* renamed from: a */
    public static C43437jf2 m30130a(View view) {
        if (view != null) {
            FleetReportPanelView fleetReportPanelView = (FleetReportPanelView) view;
            return new C43437jf2(fleetReportPanelView, fleetReportPanelView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FleetReportPanelView getRoot() {
        return this.f93109a;
    }
}
