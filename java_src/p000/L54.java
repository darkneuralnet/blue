package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import co.bird.android.model.wire.configs.PrivateBirdConfig;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.InterfaceC44023ke5;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004Jb\u0010\u000e\u001a2\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002J$\u0010\u0014\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LL54;", "", "", "retailAvailable", "", "Lco/bird/android/model/VehicleConnection;", "connectedVehicles", "Lco/bird/android/model/persistence/Bird;", "privateBirds", "LTk5;", "nearbyBirdVehicles", "LH6;", "b", "Lwb4;", C17296a.f69688o, "e", "undetectedSavedBirdAirs", DateTokenConverter.CONVERTER_KEY, "nearbyBirdAir", "nearbyBirdBikes", "c", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "LTq4;", "reactiveConfig", "<init>", "(Landroid/content/Context;LTq4;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdsOverviewConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdsOverviewConverter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n766#2:151\n857#2,2:152\n766#2:154\n857#2:155\n1747#2,3:156\n858#2:159\n819#2:160\n847#2:161\n2624#2,3:162\n848#2:165\n766#2:166\n857#2:167\n2624#2,3:168\n858#2:171\n766#2:172\n857#2:173\n2624#2,3:174\n2624#2,3:177\n858#2:180\n766#2:181\n857#2:182\n2624#2,3:183\n2624#2,3:186\n858#2:189\n1549#2:190\n1620#2,3:191\n1549#2:194\n1620#2,3:195\n1549#2:199\n1620#2,3:200\n1#3:198\n*S KotlinDebug\n*F\n+ 1 PrivateBirdsOverviewConverter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdsOverviewConverter\n*L\n62#1:151\n62#1:152,2\n63#1:154\n63#1:155\n64#1:156,3\n63#1:159\n68#1:160\n68#1:161\n71#1:162,3\n68#1:165\n76#1:166\n76#1:167\n79#1:168,3\n76#1:171\n83#1:172\n83#1:173\n84#1:174,3\n86#1:177,3\n83#1:180\n92#1:181\n92#1:182\n93#1:183,3\n95#1:186,3\n92#1:189\n112#1:190\n112#1:191,3\n123#1:194\n123#1:195,3\n143#1:199\n143#1:200,3\n*E\n"})
/* renamed from: L54 */
/* loaded from: classes3.dex */
public final class L54 {

    /* renamed from: a */
    public final Context f20740a;

    /* renamed from: b */
    public final C36207Tq4 f20741b;

    public L54(Context context, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f20740a = context;
        this.f20741b = reactiveConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x011a, code lost:
        if (r5 != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x022b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C51106wb4<List<Bird>, List<Bird>, List<C36154Tk5>, List<C36154Tk5>> m97789a(List<? extends VehicleConnection> list, List<Bird> list2, List<? extends C36154Tk5> list3) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean equals;
        boolean z4;
        boolean z5;
        String str2;
        boolean equals2;
        boolean z6;
        boolean z7;
        boolean z8;
        String str3;
        boolean equals3;
        boolean z9;
        boolean z10;
        String str4;
        boolean equals4;
        boolean z11;
        boolean z12;
        boolean z13;
        String nickname;
        boolean z14;
        boolean z15;
        String str5;
        boolean z16;
        boolean z17;
        String str6;
        boolean z18;
        boolean z19;
        boolean equals5;
        boolean z20;
        ArrayList<VehicleConnection> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z21 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((VehicleConnection) next).getRxBleDevice().mo17283b() == InterfaceC44023ke5.EnumC25197a.CONNECTED) {
                z21 = true;
            }
            if (z21) {
                arrayList.add(next);
            }
        }
        List<Bird> list4 = list2;
        ArrayList<Bird> arrayList2 = new ArrayList();
        for (Object obj : list4) {
            Bird bird = (Bird) obj;
            if (Bird_Kt.isBirdAir(bird)) {
                if (!arrayList.isEmpty()) {
                    for (VehicleConnection vehicleConnection : arrayList) {
                        equals5 = StringsKt__StringsJVMKt.equals(bird.getSerialNumber(), vehicleConnection.getDeviceName(), true);
                        if (equals5) {
                            z20 = true;
                            break;
                        }
                    }
                }
                z20 = false;
                if (z20) {
                    z19 = true;
                    if (!z19) {
                        arrayList2.add(obj);
                    }
                }
            }
            z19 = false;
            if (!z19) {
            }
        }
        ArrayList<Bird> arrayList3 = new ArrayList();
        for (Object obj2 : list4) {
            Bird bird2 = (Bird) obj2;
            if (Bird_Kt.isBirdAir(bird2)) {
                PrivateBird privateBird = bird2.getPrivateBird();
                if (privateBird != null) {
                    str5 = privateBird.getNickname();
                } else {
                    str5 = null;
                }
                if (str5 != null && str5.length() != 0) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (!z16) {
                    if (!arrayList2.isEmpty()) {
                        for (Bird bird3 : arrayList2) {
                            if (Intrinsics.areEqual(bird2.getId(), bird3.getId())) {
                                z17 = false;
                                break;
                            }
                        }
                    }
                    z17 = true;
                    if (z17) {
                        List<? extends C36154Tk5> list5 = list3;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            for (C36154Tk5 c36154Tk5 : list5) {
                                String mo17280e = c36154Tk5.m83016a().mo17280e();
                                PrivateBird privateBird2 = bird2.getPrivateBird();
                                if (privateBird2 != null) {
                                    str6 = privateBird2.getId();
                                } else {
                                    str6 = null;
                                }
                                if (Intrinsics.areEqual(mo17280e, str6)) {
                                    z18 = false;
                                    break;
                                }
                            }
                        }
                        z18 = true;
                    }
                }
                z15 = true;
                if (z15) {
                    arrayList3.add(obj2);
                }
            }
            z15 = false;
            if (z15) {
            }
        }
        ArrayList<Bird> arrayList4 = new ArrayList();
        for (Object obj3 : list4) {
            Bird bird4 = (Bird) obj3;
            if (Bird_Kt.isBirdAir(bird4)) {
                PrivateBird privateBird3 = bird4.getPrivateBird();
                if (privateBird3 != null && (nickname = privateBird3.getNickname()) != null) {
                    if (nickname.length() > 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        z12 = true;
                        if (z12) {
                            if (!arrayList3.isEmpty()) {
                                for (Bird bird5 : arrayList3) {
                                    if (Intrinsics.areEqual(bird4.getId(), bird5.getId())) {
                                        z13 = false;
                                        break;
                                    }
                                }
                            }
                            z13 = true;
                            if (z13) {
                                z11 = true;
                                if (!z11) {
                                    arrayList4.add(obj3);
                                }
                            }
                        }
                    }
                }
                z12 = false;
                if (z12) {
                }
            }
            z11 = false;
            if (!z11) {
            }
        }
        List<? extends C36154Tk5> list6 = list3;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list6) {
            C36154Tk5 c36154Tk52 = (C36154Tk5) obj4;
            if (C36388Uk5.m80950A(c36154Tk52)) {
                if (!arrayList3.isEmpty()) {
                    for (Bird bird6 : arrayList3) {
                        if (Bird_Kt.isBirdAir(bird6)) {
                            PrivateBird privateBird4 = bird6.getPrivateBird();
                            if (privateBird4 != null) {
                                str3 = privateBird4.getId();
                            } else {
                                str3 = null;
                            }
                            equals3 = StringsKt__StringsJVMKt.equals(str3, c36154Tk52.m83016a().mo17280e(), true);
                            if (equals3) {
                                z7 = true;
                                continue;
                                if (z7) {
                                    z8 = false;
                                    break;
                                }
                            }
                        }
                        z7 = false;
                        continue;
                        if (z7) {
                        }
                    }
                }
                z8 = true;
                if (z8) {
                    if (!arrayList4.isEmpty()) {
                        for (Bird bird7 : arrayList4) {
                            if (Bird_Kt.isBirdAir(bird7)) {
                                PrivateBird privateBird5 = bird7.getPrivateBird();
                                if (privateBird5 != null) {
                                    str4 = privateBird5.getId();
                                } else {
                                    str4 = null;
                                }
                                equals4 = StringsKt__StringsJVMKt.equals(str4, c36154Tk52.m83016a().mo17280e(), true);
                                if (equals4) {
                                    z9 = true;
                                    continue;
                                    if (z9) {
                                        z10 = false;
                                        break;
                                    }
                                }
                            }
                            z9 = false;
                            continue;
                            if (z9) {
                            }
                        }
                    }
                    z10 = true;
                    if (z10) {
                        z6 = true;
                        if (!z6) {
                            arrayList5.add(obj4);
                        }
                    }
                }
            }
            z6 = false;
            if (!z6) {
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : list6) {
            C36154Tk5 c36154Tk53 = (C36154Tk5) obj5;
            if (C36388Uk5.m80948C(c36154Tk53)) {
                if (!arrayList3.isEmpty()) {
                    for (Bird bird8 : arrayList3) {
                        if (Bird_Kt.isBirdBike(bird8)) {
                            PrivateBird privateBird6 = bird8.getPrivateBird();
                            if (privateBird6 != null) {
                                str = privateBird6.getId();
                            } else {
                                str = null;
                            }
                            equals = StringsKt__StringsJVMKt.equals(str, c36154Tk53.m83016a().mo17280e(), true);
                            if (equals) {
                                z2 = true;
                                continue;
                                if (z2) {
                                    z3 = false;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        continue;
                        if (z2) {
                        }
                    }
                }
                z3 = true;
                if (z3) {
                    if (!arrayList4.isEmpty()) {
                        for (Bird bird9 : arrayList4) {
                            if (Bird_Kt.isBirdBike(bird9)) {
                                PrivateBird privateBird7 = bird9.getPrivateBird();
                                if (privateBird7 != null) {
                                    str2 = privateBird7.getId();
                                } else {
                                    str2 = null;
                                }
                                equals2 = StringsKt__StringsJVMKt.equals(str2, c36154Tk53.m83016a().mo17280e(), true);
                                if (equals2) {
                                    z4 = true;
                                    continue;
                                    if (z4) {
                                        z5 = false;
                                        break;
                                    }
                                }
                            }
                            z4 = false;
                            continue;
                            if (z4) {
                            }
                        }
                    }
                    z5 = true;
                    if (z5) {
                        z = true;
                        if (!z) {
                            arrayList6.add(obj5);
                        }
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return new C51106wb4<>(arrayList3, arrayList4, arrayList5, arrayList6);
    }

    /* renamed from: b */
    public final List<C3023H6> m97788b(boolean z, List<? extends VehicleConnection> connectedVehicles, List<Bird> privateBirds, List<? extends C36154Tk5> nearbyBirdVehicles) {
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(connectedVehicles, "connectedVehicles");
        Intrinsics.checkNotNullParameter(privateBirds, "privateBirds");
        Intrinsics.checkNotNullParameter(nearbyBirdVehicles, "nearbyBirdVehicles");
        C51106wb4<List<Bird>, List<Bird>, List<C36154Tk5>, List<C36154Tk5>> m97789a = m97789a(connectedVehicles, privateBirds, nearbyBirdVehicles);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{m97785e(z), m97786d(m97789a.m6614a(), m97789a.m6613b()), m97787c(m97789a.m6612c(), m97789a.m6611d())});
        return listOfNotNull;
    }

    /* renamed from: c */
    public final C3023H6 m97787c(List<? extends C36154Tk5> list, List<? extends C36154Tk5> list2) {
        List plus;
        int collectionSizeOrDefault;
        List mutableList;
        PrivateBirdConfig privateBirdConfig = this.f20741b.m82623f8().m73665a().getPrivateBirdConfig();
        if (!privateBirdConfig.getEnableBirdAir()) {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        List<? extends C36154Tk5> list3 = list;
        if (!privateBirdConfig.getEnableBirdBike()) {
            list2 = null;
        }
        if (list2 == null) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) list3, (Iterable) list2);
        List<C36154Tk5> list4 = plus;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C36154Tk5 c36154Tk5 : list4) {
            arrayList.add(new C2637G6(c36154Tk5, C31698Aj4.item_private_bird, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(new ArrayList(), new C2637G6(new C3023H6(mutableList, null, null, 6, null), C31698Aj4.item_nearby_bird_vehicles_section, false, 4, null), null, 4, null);
    }

    /* renamed from: d */
    public final C3023H6 m97786d(List<Bird> list, List<Bird> list2) {
        int collectionSizeOrDefault;
        List mutableList;
        int collectionSizeOrDefault2;
        String localBrandName;
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        List<Bird> list3 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Bird bird : list3) {
            if (Bird_Kt.isBirdAir(bird)) {
                localBrandName = this.f20740a.getString(C45871nl4.retail_bird_ready_to_connect_label);
            } else if (!Bird_Kt.isES500(bird) && !Bird_Kt.isBirdBike(bird)) {
                localBrandName = this.f20740a.getString(C45871nl4.retail_bird_battery_label, String.valueOf(bird.getBatteryLevel()));
            } else {
                localBrandName = Bird_Kt.localBrandName(bird);
            }
            String str = localBrandName;
            Intrinsics.checkNotNullExpressionValue(str, "when {\n            bird.…l.toString())\n          }");
            arrayList.add(new C2637G6(new K44(bird, false, str, 2, null), C31698Aj4.item_private_bird, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        List<Bird> list4 = list2;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (Bird bird2 : list4) {
            String string = this.f20740a.getString(C45871nl4.retail_bird_not_detected_label);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_bird_not_detected_label)");
            arrayList2.add(new C2637G6(new K44(bird2, false, string), C31698Aj4.item_private_bird, false, 4, null));
        }
        mutableList.addAll(arrayList2);
        return new C3023H6(new ArrayList(), new C2637G6(new C3023H6(mutableList, null, null, 6, null), C31698Aj4.item_private_birds_section, false, 4, null), null, 4, null);
    }

    /* renamed from: e */
    public final C3023H6 m97785e(boolean z) {
        List mutableListOf;
        String byobMenuName = this.f20741b.m82623f8().m73665a().getShopConfig().getByobMenuName();
        if (z) {
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(byobMenuName, C31698Aj4.item_promotion, false, 4, null));
            return new C3023H6(mutableListOf, null, null, 6, null);
        }
        return null;
    }
}
