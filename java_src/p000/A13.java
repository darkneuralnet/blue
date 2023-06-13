package p000;

import android.annotation.SuppressLint;
import co.bird.android.model.NearbyBirdViewModel;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ:\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\u000e\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001c"}, m28432d2 = {"LA13;", "", "", "Lco/bird/android/model/NearbyBirdViewModel;", "scannedBirds", "previousBirds", "", "useBuckets", "Lio/reactivex/F;", "LH6;", "c", "", "updatedBirds", "", "b", "", C17296a.f69688o, "I", "getMinSignal", "()I", "f", "(I)V", "minSignal", "getMaxSignal", "e", "maxSignal", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNearbyBirdsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdsConverter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,95:1\n1855#2:96\n288#2,2:97\n1856#2:99\n766#2:100\n857#2,2:101\n1855#2:103\n1856#2:106\n1549#2:110\n1620#2,3:111\n1054#2:115\n1549#2:116\n1620#2,3:117\n1282#3,2:104\n11335#3:107\n11670#3,2:108\n11672#3:114\n*S KotlinDebug\n*F\n+ 1 NearbyBirdsConverter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsConverter\n*L\n78#1:96\n79#1:97,2\n78#1:99\n37#1:100\n37#1:101,2\n45#1:103\n45#1:106\n59#1:110\n59#1:111,3\n67#1:115\n68#1:116\n68#1:117,3\n47#1:104,2\n58#1:107\n58#1:108,2\n58#1:114\n*E\n"})
/* renamed from: A13 */
/* loaded from: classes2.dex */
public final class A13 {

    /* renamed from: c */
    public static final C0006a f19c = new C0006a(null);

    /* renamed from: d */
    public static final int f20d = 8;

    /* renamed from: e */
    public static final Integer[] f21e = {-10, -20, -30, -40, -50, -60, -70, -80, -90, -100};

    /* renamed from: a */
    public int f22a = -100;

    /* renamed from: b */
    public int f23b;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"LA13$a;", "", "", "MAX_SIGNAL_STRENGTH", "I", "MIN_SIGNAL_STRENGTH", "", "SIGNAL_BUCKETS", "[Ljava/lang/Integer;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: A13$a */
    /* loaded from: classes2.dex */
    public static final class C0006a {
        public /* synthetic */ C0006a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0006a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 NearbyBirdsConverter.kt\nco/bird/android/app/feature/nearbybirds/adapters/NearbyBirdsConverter\n*L\n1#1,328:1\n67#2:329\n*E\n"})
    /* renamed from: A13$b */
    /* loaded from: classes2.dex */
    public static final class C0007b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int i;
            int compareValues;
            Integer rssi = ((NearbyBirdViewModel) t2).getVehicle().getRssi();
            int i2 = Integer.MIN_VALUE;
            if (rssi != null) {
                i = rssi.intValue();
            } else {
                i = Integer.MIN_VALUE;
            }
            Integer valueOf = Integer.valueOf(i);
            Integer rssi2 = ((NearbyBirdViewModel) t).getVehicle().getRssi();
            if (rssi2 != null) {
                i2 = rssi2.intValue();
            }
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(valueOf, Integer.valueOf(i2));
            return compareValues;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC23442F convertNearbyBirds$default(A13 a13, List list, List list2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = CollectionsKt__CollectionsKt.emptyList();
        }
        return a13.m116191c(list, list2, z);
    }

    /* renamed from: d */
    public static final List m116190d(List previousBirds, A13 this$0, List scannedBirds, boolean z) {
        int i;
        List sortedWith;
        ArrayList arrayList;
        int collectionSizeOrDefault;
        List mutableListOf;
        List list;
        int collectionSizeOrDefault2;
        Object last;
        int intValue;
        int i2;
        boolean z2;
        int i3;
        Intrinsics.checkNotNullParameter(previousBirds, "$previousBirds");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(scannedBirds, "$scannedBirds");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(previousBirds);
        this$0.m116192b(arrayList2, scannedBirds);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean z3 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Integer rssi = ((NearbyBirdViewModel) next).getVehicle().getRssi();
            if (rssi != null) {
                i3 = rssi.intValue();
            } else {
                i3 = Integer.MIN_VALUE;
            }
            if ((i3 > this$0.f23b || this$0.f22a > i3) ? false : false) {
                arrayList3.add(next);
            }
        }
        if (z) {
            HashMap hashMap = new HashMap();
            Iterator it2 = arrayList3.iterator();
            while (true) {
                Integer num = null;
                if (!it2.hasNext()) {
                    break;
                }
                NearbyBirdViewModel nearbyBirdViewModel = (NearbyBirdViewModel) it2.next();
                Integer[] numArr = f21e;
                int length = numArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    Integer num2 = numArr[i4];
                    int intValue2 = num2.intValue();
                    Integer rssi2 = nearbyBirdViewModel.getVehicle().getRssi();
                    if (rssi2 != null) {
                        i2 = rssi2.intValue();
                    } else {
                        i2 = -100;
                    }
                    if (i2 > intValue2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        num = num2;
                        break;
                    }
                    i4++;
                }
                if (num == null) {
                    last = ArraysKt___ArraysKt.last(f21e);
                    intValue = ((Number) last).intValue();
                } else {
                    intValue = num.intValue();
                }
                if (!hashMap.containsKey(Integer.valueOf(intValue))) {
                    hashMap.put(Integer.valueOf(intValue), new ArrayList());
                }
                List list2 = (List) hashMap.get(Integer.valueOf(intValue));
                if (list2 != null) {
                    list2.add(nearbyBirdViewModel);
                }
            }
            Integer[] numArr2 = f21e;
            arrayList = new ArrayList(numArr2.length);
            for (Integer num3 : numArr2) {
                List list3 = (List) hashMap.get(Integer.valueOf(num3.intValue()));
                if (list3 != null) {
                    List<NearbyBirdViewModel> list4 = list3;
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10);
                    ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
                    for (NearbyBirdViewModel nearbyBirdViewModel2 : list4) {
                        arrayList4.add(new C2637G6(nearbyBirdViewModel2, C39311cj4.item_nearby_bird, false, 4, null));
                    }
                    list = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4);
                } else {
                    list = null;
                }
                if (list == null) {
                    list = new ArrayList();
                }
                arrayList.add(new C3023H6(list, null, null, 6, null));
            }
        } else {
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList3, new C0007b());
            List list5 = sortedWith;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10);
            arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it3 = list5.iterator();
            while (it3.hasNext()) {
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6((NearbyBirdViewModel) it3.next(), C39311cj4.item_nearby_bird, false, 4, null));
                arrayList.add(new C3023H6(mutableListOf, null, null, 6, null));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m116192b(List<NearbyBirdViewModel> list, List<NearbyBirdViewModel> list2) {
        Object obj;
        int indexOf;
        for (NearbyBirdViewModel nearbyBirdViewModel : list2) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(nearbyBirdViewModel.getVehicle().getBird().getCode(), ((NearbyBirdViewModel) obj).getVehicle().getBird().getCode())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NearbyBirdViewModel nearbyBirdViewModel2 = (NearbyBirdViewModel) obj;
            indexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends NearbyBirdViewModel>) ((List<? extends Object>) list), nearbyBirdViewModel2);
            if (nearbyBirdViewModel2 != null) {
                list.remove(nearbyBirdViewModel2);
                list.add(indexOf, nearbyBirdViewModel);
            } else {
                list.add(nearbyBirdViewModel);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    /* renamed from: c */
    public final AbstractC23442F<List<C3023H6>> m116191c(final List<NearbyBirdViewModel> scannedBirds, final List<NearbyBirdViewModel> previousBirds, final boolean z) {
        Intrinsics.checkNotNullParameter(scannedBirds, "scannedBirds");
        Intrinsics.checkNotNullParameter(previousBirds, "previousBirds");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: z13
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m116190d;
                m116190d = A13.m116190d(previousBirds, this, scannedBirds, z);
                return m116190d;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      // …Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: e */
    public final void m116189e(int i) {
        this.f23b = i;
    }

    /* renamed from: f */
    public final void m116188f(int i) {
        this.f22a = i;
    }
}
