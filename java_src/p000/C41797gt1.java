package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.CampaignButton;
import co.bird.android.model.FlightSheetButton;
import co.bird.android.model.FlightSheetMap;
import co.bird.android.model.QuickCaptureButton;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.FlightSheetDetail;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lgt1;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlightSheetV2AdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2AdapterDiff.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2AdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,69:1\n18#2:70\n18#2:75\n18#2:80\n18#2:85\n18#2:90\n18#2:95\n18#2:100\n18#2:105\n18#2:110\n18#2:115\n18#2:120\n9#3,4:71\n9#3,4:76\n9#3,4:81\n9#3,4:86\n9#3,4:91\n9#3,4:96\n9#3,4:101\n9#3,4:106\n9#3,4:111\n9#3,4:116\n9#3,4:121\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2AdapterDiff.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2AdapterDiff\n*L\n24#1:70\n27#1:75\n28#1:80\n29#1:85\n34#1:90\n43#1:95\n49#1:100\n53#1:105\n57#1:110\n61#1:115\n64#1:120\n24#1:71,4\n27#1:76,4\n28#1:81,4\n29#1:86,4\n34#1:91,4\n43#1:96,4\n49#1:101,4\n53#1:106,4\n57#1:111,4\n61#1:116,4\n64#1:121,4\n*E\n"})
/* renamed from: gt1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41797gt1 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String text;
        String label;
        String m79460d;
        String command;
        String message;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C37548Zj4.item_flight_sheet_summary) {
            return "summary";
        }
        CampaignButton campaignButton = null;
        if (m105817b == C37548Zj4.item_flight_sheet_campaign) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof CampaignButton) {
                campaignButton = m105816c;
            }
            CampaignButton campaignButton2 = campaignButton;
            if (campaignButton2 != null && (message = campaignButton2.getMessage()) != null) {
                return message;
            }
        } else if (m105817b == C37548Zj4.item_flight_sheet_summary_quick_capture) {
            return "quick_capture";
        } else {
            if (m105817b == C37548Zj4.item_flight_sheet_status) {
                return "status";
            }
            if (m105817b == C37548Zj4.item_flight_sheet_command) {
                Object m105816c2 = adapterItem.m105816c();
                if (m105816c2 instanceof VehicleCommand) {
                    campaignButton = m105816c2;
                }
                VehicleCommand vehicleCommand = campaignButton;
                if (vehicleCommand != null && (command = vehicleCommand.getCommand()) != null) {
                    return command;
                }
            } else if (m105817b == C37548Zj4.item_collapsable_header) {
                Object m105816c3 = adapterItem.m105816c();
                if (m105816c3 instanceof C36626Vl0) {
                    campaignButton = m105816c3;
                }
                C36626Vl0 c36626Vl0 = campaignButton;
                if (c36626Vl0 != null && (m79460d = c36626Vl0.m79460d()) != null) {
                    return m79460d;
                }
            } else if (m105817b == C37548Zj4.item_labeled_detail) {
                Object m105816c4 = adapterItem.m105816c();
                if (m105816c4 instanceof FlightSheetDetail) {
                    campaignButton = m105816c4;
                }
                FlightSheetDetail flightSheetDetail = campaignButton;
                if (flightSheetDetail != null && (label = flightSheetDetail.getLabel()) != null) {
                    return label;
                }
            } else if (m105817b == C37548Zj4.item_labeled_rating) {
                return "rating";
            } else {
                if (m105817b == C37548Zj4.item_last_ride_map) {
                    return "map";
                }
                if (m105817b == C37548Zj4.item_last_ride_photo) {
                    return "photo";
                }
                boolean z = true;
                if (m105817b != C45268mk4.item_button_secondary && m105817b != C45268mk4.item_white_button_with_end_chevron) {
                    z = false;
                }
                if (z) {
                    Object m105816c5 = adapterItem.m105816c();
                    if (m105816c5 instanceof FlightSheetButton) {
                        campaignButton = m105816c5;
                    }
                    FlightSheetButton flightSheetButton = campaignButton;
                    if (flightSheetButton != null && (text = flightSheetButton.getText()) != null) {
                        return text;
                    }
                }
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        boolean z;
        Bird bird;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (m105816c instanceof TU5) {
            if (!Intrinsics.areEqual(m105816c, newItem.m105816c())) {
                return true;
            }
        } else {
            Object obj = null;
            if (m105816c instanceof QuickCaptureButton) {
                Object m105816c2 = newItem.m105816c();
                if (!(m105816c2 instanceof QuickCaptureButton)) {
                    m105816c2 = null;
                }
                QuickCaptureButton quickCaptureButton = (QuickCaptureButton) m105816c2;
                QuickCaptureButton quickCaptureButton2 = (QuickCaptureButton) m105816c;
                String id = quickCaptureButton2.getBird().getId();
                if (quickCaptureButton != null && (bird = quickCaptureButton.getBird()) != null) {
                    obj = bird.getId();
                }
                if (!Intrinsics.areEqual(id, obj) || quickCaptureButton2.getState() != quickCaptureButton.getState() || !Intrinsics.areEqual(quickCaptureButton2.getTimeout(), quickCaptureButton.getTimeout())) {
                    return true;
                }
            } else if ((m105816c instanceof CampaignButton) || (m105816c instanceof GQ5)) {
                return true;
            } else {
                if (m105816c instanceof VehicleCommand) {
                    Object m105816c3 = newItem.m105816c();
                    if (!(m105816c3 instanceof VehicleCommand)) {
                        m105816c3 = null;
                    }
                    VehicleCommand vehicleCommand = (VehicleCommand) m105816c3;
                    String command = ((VehicleCommand) m105816c).getCommand();
                    if (vehicleCommand != null) {
                        obj = vehicleCommand.getCommand();
                    }
                    if (!Intrinsics.areEqual(command, obj)) {
                        return true;
                    }
                } else if (m105816c instanceof FlightSheetButton) {
                    Object m105816c4 = newItem.m105816c();
                    if (!(m105816c4 instanceof FlightSheetButton)) {
                        m105816c4 = null;
                    }
                    FlightSheetButton flightSheetButton = (FlightSheetButton) m105816c4;
                    String text = ((FlightSheetButton) m105816c).getText();
                    if (flightSheetButton != null) {
                        obj = flightSheetButton.getText();
                    }
                    if (!Intrinsics.areEqual(text, obj)) {
                        return true;
                    }
                } else if (m105816c instanceof XL2) {
                    Object m105816c5 = newItem.m105816c();
                    if (!(m105816c5 instanceof FlightSheetMap)) {
                        m105816c5 = null;
                    }
                    FlightSheetMap flightSheetMap = (FlightSheetMap) m105816c5;
                    List<Geolocation> m77101e = ((XL2) m105816c).m77101e();
                    if (flightSheetMap != null) {
                        obj = flightSheetMap.getTracks();
                    }
                    if (!Intrinsics.areEqual(m77101e, obj)) {
                        return true;
                    }
                } else if (m105816c instanceof C46484on4) {
                    Object m105816c6 = newItem.m105816c();
                    if (m105816c6 instanceof C46484on4) {
                        obj = m105816c6;
                    }
                    C46484on4 c46484on4 = (C46484on4) obj;
                    if (c46484on4 != null && ((C46484on4) m105816c).m20491d() == c46484on4.m20491d()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return true;
                    }
                } else if (m105816c instanceof FlightSheetDetail) {
                    String detail = ((FlightSheetDetail) m105816c).getDetail();
                    Object m105816c7 = newItem.m105816c();
                    if (!(m105816c7 instanceof FlightSheetDetail)) {
                        m105816c7 = null;
                    }
                    FlightSheetDetail flightSheetDetail = (FlightSheetDetail) m105816c7;
                    if (flightSheetDetail != null) {
                        obj = flightSheetDetail.getDetail();
                    }
                    if (!Intrinsics.areEqual(detail, obj)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
