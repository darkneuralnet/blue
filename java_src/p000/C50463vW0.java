package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.Condition;
import co.bird.android.model.constant.PartnerBirdState;
import co.bird.android.model.constant.SpecialCondition;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J\f\u0010\n\u001a\u00020\t*\u00020\u0003H\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\u0003H\u0003J\f\u0010\r\u001a\u00020\t*\u00020\u0003H\u0002J\f\u0010\u000e\u001a\u00020\u000b*\u00020\u0003H\u0003R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LvW0;", "", "", "Lco/bird/android/model/persistence/Bird;", "birds", "Lco/bird/android/model/wire/WireBird;", "tasks", "LH6;", C17296a.f69688o, "", "b", "", "c", DateTokenConverter.CONVERTER_KEY, "e", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDefaultBulkBirdDetailConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultBulkBirdDetailConverter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/DefaultBulkBirdDetailConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1549#2:108\n1620#2,2:109\n1747#2,3:111\n1622#2:114\n1#3:115\n*S KotlinDebug\n*F\n+ 1 DefaultBulkBirdDetailConverter.kt\nco/bird/android/feature/bulkscanner/scan/adapters/DefaultBulkBirdDetailConverter\n*L\n27#1:108\n27#1:109,2\n46#1:111,3\n27#1:114\n*E\n"})
/* renamed from: vW0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50463vW0 {

    /* renamed from: a */
    public final Context f114182a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vW0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29566a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PartnerBirdState.values().length];
            try {
                iArr[PartnerBirdState.ASLEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PartnerBirdState.OFFLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PartnerBirdState.AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PartnerBirdState.IN_RIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PartnerBirdState.LOW_BATTERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PartnerBirdState.CAPTURED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PartnerBirdState.DAMAGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PartnerBirdState.REPORTED_DAMAGED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PartnerBirdState.MISSING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PartnerBirdState.LOST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PartnerBirdState.CHARGING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C50463vW0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f114182a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m8572a(List<Bird> birds, List<WireBird> tasks) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        String m8569d;
        int m8568e;
        Intrinsics.checkNotNullParameter(birds, "birds");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        List<Bird> list = birds;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Bird bird : list) {
            if (bird.getPartnerId() != null) {
                m8569d = m8571b(bird);
                m8568e = m8570c(bird);
            } else {
                m8569d = m8569d(bird);
                m8568e = m8568e(bird);
            }
            String str = m8569d;
            int i = m8568e;
            String code = bird.getCode();
            int batteryLevel = bird.getBatteryLevel();
            List<WireBird> list2 = tasks;
            boolean z = false;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.areEqual(bird.getCode(), ((WireBird) it.next()).getCode())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(new C2637G6(new C19728dL(bird, code, batteryLevel, str, i, z), C35901Si4.item_operator_bird_detail, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    /* renamed from: b */
    public final String m8571b(Bird bird) {
        int i;
        int i2;
        PartnerBirdState partnerBirdState = bird.getPartnerBirdState();
        if (partnerBirdState == null) {
            i = -1;
        } else {
            i = C29566a.$EnumSwitchMapping$0[partnerBirdState.ordinal()];
        }
        switch (i) {
            case 1:
                i2 = C45871nl4.operator_partner_bird_status_asleep;
                break;
            case 2:
                i2 = C45871nl4.operator_partner_bird_status_offline;
                break;
            case 3:
                i2 = C45871nl4.operator_partner_bird_status_available;
                break;
            case 4:
                i2 = C45871nl4.operator_partner_bird_status_in_ride;
                break;
            case 5:
                i2 = C45871nl4.operator_partner_bird_status_low_battery;
                break;
            case 6:
                i2 = C45871nl4.operator_partner_bird_status_captured;
                break;
            case 7:
            case 8:
                i2 = C45871nl4.operator_partner_bird_status_damaged;
                break;
            case 9:
                i2 = C45871nl4.operator_partner_bird_status_missing;
                break;
            case 10:
                i2 = C45871nl4.operator_partner_bird_status_lost;
                break;
            case 11:
                i2 = C45871nl4.operator_partner_bird_status_charging;
                break;
            default:
                i2 = C45871nl4.operator_partner_bird_status_unknown;
                break;
        }
        String string = this.f114182a.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringIdx)");
        return string;
    }

    /* renamed from: c */
    public final int m8570c(Bird bird) {
        if (bird.getPartnerBirdState() != PartnerBirdState.DAMAGED && bird.getPartnerBirdState() != PartnerBirdState.REPORTED_DAMAGED) {
            return NA0.m94301c(this.f114182a, C32364Df4.birdNewRoad);
        }
        return NA0.m94301c(this.f114182a, C32364Df4.birdRed);
    }

    /* renamed from: d */
    public final String m8569d(Bird bird) {
        if (bird.getLifecycle().getSpecialCondition() == SpecialCondition.ACCIDENT) {
            String string = this.f114182a.getString(C45871nl4.operator_task_status_collect_label);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ask_status_collect_label)");
            return string;
        } else if (bird.getLifecycle().getCondition() != Condition.NEEDS_SERVICE && bird.getLifecycle().getCondition() != Condition.TOTALED && !bird.getDisconnected() && !bird.getSubmerged()) {
            String string2 = this.f114182a.getString(C45871nl4.operator_map_filter_ready_label);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…r_map_filter_ready_label)");
            return string2;
        } else {
            String string3 = this.f114182a.getString(C45871nl4.operator_task_status_damaged_label);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…ask_status_damaged_label)");
            return string3;
        }
    }

    /* renamed from: e */
    public final int m8568e(Bird bird) {
        if (bird.getLifecycle().getSpecialCondition() == SpecialCondition.ACCIDENT) {
            return NA0.m94301c(this.f114182a, C32364Df4.birdRed);
        }
        if (bird.getLifecycle().getCondition() != Condition.NEEDS_SERVICE && bird.getLifecycle().getCondition() != Condition.TOTALED && !bird.getDisconnected() && !bird.getSubmerged()) {
            return NA0.m94301c(this.f114182a, C32364Df4.birdNewRoad);
        }
        return NA0.m94301c(this.f114182a, C32364Df4.birdRed);
    }
}
