package p000;

import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.OperatorTaskGroup;
import co.bird.android.model.persistence.nestedstructures.OperatorTask;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.wire.WireOperatorTask;
import co.bird.android.model.wire.WireOperatorTaskGroup;
import co.bird.android.model.wire.WireThemedColors;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorTaskGroup;", "Lco/bird/android/model/persistence/OperatorTaskGroup;", C17296a.f69688o, "Lco/bird/android/model/wire/WireOperatorTask;", "Lco/bird/android/model/persistence/nestedstructures/OperatorTask;", "b", "co.bird.android.repository.fleet-status"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskGroupConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskGroupConversion.kt\nco/bird/android/repository/operatortaskv2/converters/OperatorTaskGroupConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1549#2:36\n1620#2,3:37\n*S KotlinDebug\n*F\n+ 1 OperatorTaskGroupConversion.kt\nco/bird/android/repository/operatortaskv2/converters/OperatorTaskGroupConversionKt\n*L\n13#1:36\n13#1:37,3\n*E\n"})
/* renamed from: Yu3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37412Yu3 {
    /* renamed from: a */
    public static final OperatorTaskGroup m74019a(WireOperatorTaskGroup wireOperatorTaskGroup) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireOperatorTaskGroup, "<this>");
        String title = wireOperatorTaskGroup.getTitle();
        List<WireOperatorTask> tasks = wireOperatorTaskGroup.getTasks();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(tasks, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireOperatorTask wireOperatorTask : tasks) {
            arrayList.add(m74018b(wireOperatorTask));
        }
        return new OperatorTaskGroup(title, arrayList);
    }

    /* renamed from: b */
    public static final OperatorTask m74018b(WireOperatorTask wireOperatorTask) {
        ThemedColors themedColors;
        ThemedColors themedColors2;
        ThemedColors themedColors3;
        Intrinsics.checkNotNullParameter(wireOperatorTask, "<this>");
        String birdId = wireOperatorTask.getBirdId();
        String taskId = wireOperatorTask.getTaskId();
        String imei = wireOperatorTask.getImei();
        String birdCode = wireOperatorTask.getBirdCode();
        String subtitle = wireOperatorTask.getSubtitle();
        WireThemedColors subtitleColor = wireOperatorTask.getSubtitleColor();
        if (subtitleColor != null) {
            themedColors = C47311qB0.m17961f(subtitleColor);
        } else {
            themedColors = null;
        }
        Integer batteryLevel = wireOperatorTask.getBatteryLevel();
        String labelText = wireOperatorTask.getLabelText();
        WireThemedColors labelColor = wireOperatorTask.getLabelColor();
        if (labelColor != null) {
            themedColors2 = C47311qB0.m17961f(labelColor);
        } else {
            themedColors2 = null;
        }
        ClientIcon statusIcon = wireOperatorTask.getStatusIcon();
        WireThemedColors statusIconBackgroundColor = wireOperatorTask.getStatusIconBackgroundColor();
        if (statusIconBackgroundColor != null) {
            themedColors3 = C47311qB0.m17961f(statusIconBackgroundColor);
        } else {
            themedColors3 = null;
        }
        return new OperatorTask(birdId, taskId, imei, birdCode, subtitle, themedColors, batteryLevel, labelText, themedColors2, statusIcon, themedColors3, wireOperatorTask.getStatusDisplayName(), wireOperatorTask.getActions());
    }
}
