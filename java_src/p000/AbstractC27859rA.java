package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.CommandCenterButton;
import co.bird.android.model.CommandCenterNotice;
import co.bird.android.model.DamageTrack;
import co.bird.android.model.Detail;
import co.bird.android.model.Issue;
import co.bird.android.model.RepairLog;
import co.bird.android.model.VehicleCommand;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LrA;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseCommandCenterAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterAdapterDiff.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,82:1\n18#2:83\n18#2:88\n18#2:93\n18#2:98\n18#2:103\n18#2:108\n18#2:113\n18#2:118\n18#2:123\n18#2:128\n18#2:133\n18#2:138\n9#3,4:84\n9#3,4:89\n9#3,4:94\n9#3,4:99\n9#3,4:104\n9#3,4:109\n9#3,4:114\n9#3,4:119\n9#3,4:124\n9#3,4:129\n9#3,4:134\n9#3,4:139\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterAdapterDiff.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterAdapterDiff\n*L\n22#1:83\n24#1:88\n28#1:93\n32#1:98\n36#1:103\n40#1:108\n45#1:113\n48#1:118\n59#1:123\n64#1:128\n71#1:133\n75#1:138\n22#1:84,4\n24#1:89,4\n28#1:94,4\n32#1:99,4\n36#1:104,4\n40#1:109,4\n45#1:114,4\n48#1:119,4\n59#1:124,4\n64#1:129,4\n71#1:134,4\n75#1:139,4\n*E\n"})
/* renamed from: rA */
/* loaded from: classes2.dex */
public abstract class AbstractC27859rA implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String text;
        String str;
        String str2;
        Integer num;
        DateTime createdAtTime;
        String str3;
        DateTime createdAtTime2;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        CommandCenterButton commandCenterButton = null;
        C36626Vl0 c36626Vl0 = null;
        CommandCenterNotice commandCenterNotice = null;
        VehicleCommand vehicleCommand = null;
        r3 = null;
        String str4 = null;
        r3 = null;
        Long l = null;
        String str5 = null;
        Issue issue = null;
        if (m105817b == C52372yj4.item_command_center_header) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof C36626Vl0) {
                c36626Vl0 = m105816c;
            }
            C36626Vl0 c36626Vl02 = c36626Vl0;
            if (c36626Vl02 == null || (text = c36626Vl02.m79460d()) == null) {
                return "";
            }
        } else if (m105817b == C52372yj4.item_command_center_notice) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof CommandCenterNotice) {
                commandCenterNotice = m105816c2;
            }
            CommandCenterNotice commandCenterNotice2 = commandCenterNotice;
            if (commandCenterNotice2 == null || (text = commandCenterNotice2.getMessage()) == null) {
                return "";
            }
        } else if (m105817b == C45851nj4.item_command_center_command) {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof VehicleCommand) {
                vehicleCommand = m105816c3;
            }
            VehicleCommand vehicleCommand2 = vehicleCommand;
            if (vehicleCommand2 == null || (text = vehicleCommand2.getCommand()) == null) {
                return "";
            }
        } else if (m105817b == C52372yj4.item_command_center_repair_log) {
            Object m105816c4 = adapterItem.m105816c();
            if (!(m105816c4 instanceof RepairLog)) {
                m105816c4 = null;
            }
            RepairLog repairLog = (RepairLog) m105816c4;
            if (repairLog != null) {
                str3 = repairLog.getRepairType();
            } else {
                str3 = null;
            }
            if (repairLog != null && (createdAtTime2 = repairLog.getCreatedAtTime()) != null) {
                str4 = createdAtTime2.toString();
            }
            return str3 + InstructionFileId.DOT + str4;
        } else if (m105817b == C52372yj4.item_command_center_diagnostic) {
            Object m105816c5 = adapterItem.m105816c();
            if (!(m105816c5 instanceof DamageTrack)) {
                m105816c5 = null;
            }
            DamageTrack damageTrack = (DamageTrack) m105816c5;
            if (damageTrack != null) {
                str2 = damageTrack.getCodeHeader();
            } else {
                str2 = null;
            }
            if (damageTrack != null) {
                num = Integer.valueOf(damageTrack.getCode());
            } else {
                num = null;
            }
            if (damageTrack != null && (createdAtTime = damageTrack.getCreatedAtTime()) != null) {
                l = Long.valueOf(createdAtTime.getMillis());
            }
            return str2 + InstructionFileId.DOT + num + InstructionFileId.DOT + l;
        } else if (m105817b == C52372yj4.item_command_center_details) {
            Object m105816c6 = adapterItem.m105816c();
            if (!(m105816c6 instanceof Detail)) {
                m105816c6 = null;
            }
            Detail detail = (Detail) m105816c6;
            if (detail != null) {
                str = detail.getTitle();
            } else {
                str = null;
            }
            if (detail != null) {
                str5 = detail.getDetail();
            }
            return str + InstructionFileId.DOT + str5;
        } else if (m105817b == C52372yj4.item_work_order_header) {
            return "active_work_order_header";
        } else {
            if (m105817b == C52372yj4.item_work_order_issue_header) {
                Object m105816c7 = adapterItem.m105816c();
                if (m105816c7 instanceof Issue) {
                    issue = m105816c7;
                }
                Issue issue2 = issue;
                if (issue2 == null || (text = issue2.getId()) == null) {
                    return "";
                }
            } else {
                boolean z = true;
                if (m105817b != C45268mk4.item_button && m105817b != C45268mk4.item_button_secondary) {
                    z = false;
                }
                if (!z) {
                    return "";
                }
                Object m105816c8 = adapterItem.m105816c();
                if (m105816c8 instanceof CommandCenterButton) {
                    commandCenterButton = m105816c8;
                }
                CommandCenterButton commandCenterButton2 = commandCenterButton;
                if (commandCenterButton2 == null || (text = commandCenterButton2.getText()) == null) {
                    return "";
                }
            }
        }
        return text;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (m105816c instanceof C50043un6) {
            return true;
        }
        String str = null;
        if (m105816c instanceof Detail) {
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof Detail)) {
                m105816c2 = null;
            }
            Detail detail = (Detail) m105816c2;
            String detail2 = ((Detail) m105816c).getDetail();
            if (detail != null) {
                str = detail.getDetail();
            }
            if (!Intrinsics.areEqual(detail2, str)) {
                return true;
            }
        } else if (m105816c instanceof Issue) {
            Object m105816c3 = newItem.m105816c();
            if (!(m105816c3 instanceof Issue)) {
                m105816c3 = null;
            }
            Issue issue = (Issue) m105816c3;
            Issue issue2 = (Issue) m105816c;
            String id = issue2.getId();
            if (issue != null) {
                str = issue.getId();
            }
            if (!Intrinsics.areEqual(id, str) || issue2.getStatus() != issue.getStatus() || !Intrinsics.areEqual(issue2.getStatusColor(), issue.getStatusColor())) {
                return true;
            }
        } else if (m105816c instanceof String) {
            Object m105816c4 = newItem.m105816c();
            if (m105816c4 instanceof String) {
                str = m105816c4;
            }
            if (!Intrinsics.areEqual(m105816c, (String) str)) {
                return true;
            }
        } else if (m105816c instanceof CommandCenterButton) {
            Object m105816c5 = newItem.m105816c();
            if (!(m105816c5 instanceof CommandCenterButton)) {
                m105816c5 = null;
            }
            CommandCenterButton commandCenterButton = (CommandCenterButton) m105816c5;
            String text = ((CommandCenterButton) m105816c).getText();
            if (commandCenterButton != null) {
                str = commandCenterButton.getText();
            }
            if (!Intrinsics.areEqual(text, str)) {
                return true;
            }
        }
        return false;
    }
}
