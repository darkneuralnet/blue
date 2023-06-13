package co.bird.android.app.feature.map.cluster;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001%B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0004j\u0002`\u0007H\u0016J\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00112\n\u0010\b\u001a\u00060\u0004j\u0002`\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u001a\u0010\u0015\u001a\u00020\u00148\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a0\u00198\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\n\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00070\u001f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;", "T", "Lco/bird/android/app/feature/map/cluster/UnreadyMarkerOverrides;", "marker", "", "markerId", "(Ljava/lang/Object;)Ljava/lang/String;", "Lco/bird/android/coreinterface/manager/MarkerOverrideId;", "overrideId", "", "ready", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "heldItem", "(Ljava/lang/Object;)Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "", "removeHeldItem", "(Ljava/lang/Object;)V", "", "setReadyAndReleaseItemsFor", "clear", "LBK2;", "markerOverridesManager", "LBK2;", "getMarkerOverridesManager", "()LBK2;", "", "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;", "notReady", "Ljava/util/List;", "getNotReady", "()Ljava/util/List;", "", "Ljava/util/Set;", "getReady", "()Ljava/util/Set;", "<init>", "(LBK2;)V", "HeldClusterItem", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUnreadyMarkerOverrides.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnreadyMarkerOverrides.kt\nco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,64:1\n288#2,2:65\n766#2:67\n857#2,2:68\n1549#2:70\n1620#2,3:71\n*S KotlinDebug\n*F\n+ 1 UnreadyMarkerOverrides.kt\nco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides\n*L\n40#1:65,2\n50#1:67\n50#1:68,2\n52#1:70\n52#1:71,3\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseUnreadyMarkerOverrides<T> implements UnreadyMarkerOverrides<T> {
    private final BK2 markerOverridesManager;
    private final List<HeldClusterItem<T>> notReady;
    private final Set<String> ready;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides$HeldClusterItem;", "T", "", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "item", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "getItem", "()Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "LLt2;", "loadingOverride", "LLt2;", "getLoadingOverride", "()LLt2;", "<init>", "(Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;LLt2;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class HeldClusterItem<T> {
        private final BirdMarkerClusterItem<T> item;
        private final C34360Lt2 loadingOverride;

        public HeldClusterItem(BirdMarkerClusterItem<T> item, C34360Lt2 loadingOverride) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(loadingOverride, "loadingOverride");
            this.item = item;
            this.loadingOverride = loadingOverride;
        }

        public final BirdMarkerClusterItem<T> getItem() {
            return this.item;
        }

        public final C34360Lt2 getLoadingOverride() {
            return this.loadingOverride;
        }
    }

    public BaseUnreadyMarkerOverrides(BK2 markerOverridesManager) {
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
        this.markerOverridesManager = markerOverridesManager;
        this.notReady = new ArrayList();
        this.ready = new LinkedHashSet();
    }

    @Override // co.bird.android.app.feature.map.cluster.UnreadyMarkerOverrides
    public void clear() {
        this.notReady.clear();
    }

    public final BK2 getMarkerOverridesManager() {
        return this.markerOverridesManager;
    }

    public final List<HeldClusterItem<T>> getNotReady() {
        return this.notReady;
    }

    public final Set<String> getReady() {
        return this.ready;
    }

    @Override // co.bird.android.app.feature.map.cluster.UnreadyMarkerOverrides
    public BirdMarkerClusterItem<T> heldItem(T t) {
        T t2;
        Iterator<T> it = this.notReady.iterator();
        while (true) {
            if (it.hasNext()) {
                t2 = it.next();
                if (Intrinsics.areEqual(((HeldClusterItem) t2).getItem().getId(), markerId(t))) {
                    break;
                }
            } else {
                t2 = null;
                break;
            }
        }
        HeldClusterItem heldClusterItem = (HeldClusterItem) t2;
        if (heldClusterItem == null) {
            return null;
        }
        return heldClusterItem.getItem();
    }

    public abstract String markerId(T t);

    @Override // co.bird.android.app.feature.map.cluster.UnreadyMarkerOverrides
    public boolean ready(String overrideId) {
        Intrinsics.checkNotNullParameter(overrideId, "overrideId");
        return this.ready.contains(overrideId);
    }

    @Override // co.bird.android.app.feature.map.cluster.UnreadyMarkerOverrides
    public void removeHeldItem(T t) {
        CollectionsKt__MutableCollectionsKt.removeAll((List) this.notReady, (Function1) new BaseUnreadyMarkerOverrides$removeHeldItem$1(this, t));
    }

    @Override // co.bird.android.app.feature.map.cluster.UnreadyMarkerOverrides
    public List<BirdMarkerClusterItem<T>> setReadyAndReleaseItemsFor(String overrideId) {
        List<BirdMarkerClusterItem<T>> emptyList;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(overrideId, "overrideId");
        if (this.ready.add(overrideId)) {
            ArrayList<HeldClusterItem> arrayList = new ArrayList();
            for (T t : this.notReady) {
                if (Intrinsics.areEqual(((HeldClusterItem) t).getLoadingOverride().m96242b(), overrideId)) {
                    arrayList.add(t);
                }
            }
            CollectionsKt__MutableCollectionsKt.removeAll((List) this.notReady, (Function1) new BaseUnreadyMarkerOverrides$setReadyAndReleaseItemsFor$1(overrideId));
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (HeldClusterItem heldClusterItem : arrayList) {
                arrayList2.add(heldClusterItem.getItem());
            }
            return arrayList2;
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }
}
