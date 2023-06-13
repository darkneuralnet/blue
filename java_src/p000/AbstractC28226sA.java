package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.CommandCenterBody;
import co.bird.android.model.CommandCenterNotice;
import co.bird.android.model.Detail;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0004J.\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0004J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0004J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0004J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0004¨\u0006\u0019"}, m28432d2 = {"LsA;", "LtA;", "", "Lco/bird/android/model/CommandCenterNotice;", "notices", "LH6;", "u", "Lco/bird/android/model/wire/WireBird;", "bird", "", "lock", "alarm", "sleep", "r", "Lco/bird/android/model/CommandCenterBody;", "commandCenter", "t", "s", "v", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", C17296a.f69688o, "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseCommandCenterConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandCenterConverter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1549#2:87\n1620#2,3:88\n1549#2:91\n1620#2,3:92\n1549#2:95\n1620#2,3:96\n1549#2:99\n1620#2,3:100\n*S KotlinDebug\n*F\n+ 1 BaseCommandCenterConverter.kt\nco/bird/android/commandcenter/adapters/BaseCommandCenterConverter\n*L\n27#1:87\n27#1:88,3\n50#1:91\n50#1:92,3\n65#1:95\n65#1:96,3\n74#1:99\n74#1:100,3\n*E\n"})
/* renamed from: sA */
/* loaded from: classes2.dex */
public abstract class AbstractC28226sA extends AbstractC28540tA {

    /* renamed from: b */
    public static final C28227a f108409b = new C28227a(null);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LsA$a;", "", "", "MAX_DIAGNOSTICS", "I", "MAX_REPAIR_LOGS", "<init>", "()V", "co.bird.android.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: sA$a */
    /* loaded from: classes2.dex */
    public static final class C28227a {
        public /* synthetic */ C28227a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28227a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC28226sA(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ C3023H6 generateCommandSection$default(AbstractC28226sA abstractC28226sA, WireBird wireBird, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            if ((i & 8) != 0) {
                z3 = true;
            }
            return abstractC28226sA.m14615r(wireBird, z, z2, z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateCommandSection");
    }

    /* renamed from: r */
    public final C3023H6 m14615r(WireBird bird, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        String string = m12962m().getString(C45871nl4.command_center_command_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…and_center_command_title)");
        return m12967h(bird, new C2637G6(new C36626Vl0(string, true, false, null, 12, null), C52372yj4.item_command_center_header, false, 4, null), z, z2, z3);
    }

    /* renamed from: s */
    public final C3023H6 m14614s(CommandCenterBody commandCenter) {
        int collectionSizeOrDefault;
        List mutableList;
        Intrinsics.checkNotNullParameter(commandCenter, "commandCenter");
        String string = m12962m().getString(C45871nl4.command_center_details_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…and_center_details_title)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C52372yj4.item_command_center_header, false, 4, null);
        List<Detail> details = commandCenter.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Detail detail : details) {
            arrayList.add(new C2637G6(detail.copyWithoutNulls(), C52372yj4.item_command_center_details, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, c2637g6, null, 4, null);
    }

    /* renamed from: t */
    public final C3023H6 m14613t(CommandCenterBody commandCenter) {
        IntRange until;
        int collectionSizeOrDefault;
        List mutableList;
        Intrinsics.checkNotNullParameter(commandCenter, "commandCenter");
        String string = m12962m().getString(C45871nl4.command_center_diagnostic_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_center_diagnostic_title)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C52372yj4.item_command_center_header, false, 4, null);
        until = RangesKt___RangesKt.until(0, Math.min(commandCenter.getDamageTracks().size(), 5));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2637G6(commandCenter.getDamageTracks().get(((IntIterator) it).nextInt()), C52372yj4.item_command_center_diagnostic, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        C3023H6 c3023h6 = new C3023H6(mutableList, c2637g6, new C2637G6(m12962m().getString(C45871nl4.command_center_diagnostic_empty), C52372yj4.item_command_center_empty_state, false, 4, null));
        c3023h6.m104406g(mutableList.isEmpty());
        return c3023h6;
    }

    /* renamed from: u */
    public final C3023H6 m14612u(List<CommandCenterNotice> notices) {
        int collectionSizeOrDefault;
        List mutableList;
        Intrinsics.checkNotNullParameter(notices, "notices");
        if (notices.isEmpty()) {
            return null;
        }
        String string = m12962m().getString(C45871nl4.command_center_notice_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…mand_center_notice_title)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C52372yj4.item_command_center_header, false, 4, null);
        List<CommandCenterNotice> list = notices;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (CommandCenterNotice commandCenterNotice : list) {
            arrayList.add(new C2637G6(commandCenterNotice, C52372yj4.item_command_center_notice, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        C3023H6 c3023h6 = new C3023H6(mutableList, c2637g6, null, 4, null);
        c3023h6.m104405h(!mutableList.isEmpty());
        return c3023h6;
    }

    /* renamed from: v */
    public final C3023H6 m14611v(CommandCenterBody commandCenter) {
        IntRange until;
        int collectionSizeOrDefault;
        List mutableList;
        Intrinsics.checkNotNullParameter(commandCenter, "commandCenter");
        String string = m12962m().getString(C45871nl4.command_center_repair_log_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_center_repair_log_title)");
        C2637G6 c2637g6 = new C2637G6(new C36626Vl0(string, false, false, null, 12, null), C52372yj4.item_command_center_header, false, 4, null);
        until = RangesKt___RangesKt.until(0, Math.min(commandCenter.getRepairLogs().size(), 20));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2637G6(commandCenter.getRepairLogs().get(((IntIterator) it).nextInt()), C52372yj4.item_command_center_repair_log, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        C3023H6 c3023h6 = new C3023H6(mutableList, c2637g6, new C2637G6(m12962m().getString(C45871nl4.command_center_repair_log_empty), C52372yj4.item_command_center_empty_state, false, 4, null));
        c3023h6.m104406g(mutableList.isEmpty());
        return c3023h6;
    }
}
