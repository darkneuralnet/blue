package co.bird.android.app.feature.map.p008ui.renderer;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.p008ui.MapModelRenderer;
import co.bird.android.model.wire.WireMerchantSite;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0003J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001a0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer;", "Lco/bird/android/app/feature/map/ui/MapModelRenderer;", "Lco/bird/android/app/feature/map/ui/renderer/MerchantRenderItem;", "Lco/bird/android/model/wire/WireMerchantSite$Icon;", "kind", "", "getDrawableFor", "merchantRenderItem", "Lcom/google/android/gms/maps/model/MarkerOptions;", "getMarkerOptions", "LfM2;", "getOrCreateMarker", "", "models", "", "render", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "LcD1;", "map", "LcD1;", "", "", "markers", "Ljava/util/Map;", "LPT;", "bitmapDescriptors", "<init>", "(Landroid/content/Context;LcD1;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantSiteRenderer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantSiteRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n361#2,7:76\n361#2,7:83\n1855#3,2:90\n1855#3:92\n1856#3:94\n1#4:93\n*S KotlinDebug\n*F\n+ 1 MerchantSiteRenderer.kt\nco/bird/android/app/feature/map/ui/renderer/MerchantSiteRenderer\n*L\n50#1:76,7\n58#1:83,7\n63#1:90,2\n69#1:92\n69#1:94\n*E\n"})
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MerchantSiteRenderer */
/* loaded from: classes2.dex */
public final class MerchantSiteRenderer implements MapModelRenderer<MerchantRenderItem> {
    private final Map<String, C6378PT> bitmapDescriptors;
    private final Context context;
    private final C39011cD1 map;
    private final Map<String, C40889fM2> markers;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.ui.renderer.MerchantSiteRenderer$WhenMappings */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WireMerchantSite.Icon.values().length];
            try {
                iArr[WireMerchantSite.Icon.CART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WireMerchantSite.Icon.FOOD_TRUCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WireMerchantSite.Icon.EVENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MerchantSiteRenderer(Context context, C39011cD1 map) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(map, "map");
        this.context = context;
        this.map = map;
        this.markers = new LinkedHashMap();
        this.bitmapDescriptors = new LinkedHashMap();
    }

    private final int getDrawableFor(WireMerchantSite.Icon icon) {
        int i = WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return C48193rg4.pin_store;
                }
                return C48193rg4.pin_food_truck;
            }
            return C48193rg4.pin_food_truck;
        }
        return C48193rg4.pin_cart;
    }

    private final MarkerOptions getMarkerOptions(MerchantRenderItem merchantRenderItem) {
        C6378PT c6378pt;
        MarkerOptions m50644u = new MarkerOptions().m50643u1(new LatLng(merchantRenderItem.getMerchantSite().getLocation().getLatitude(), merchantRenderItem.getMerchantSite().getLocation().getLongitude())).m50644u(0.5f, 1.0f);
        if (merchantRenderItem.getPinVisibility() == PinVisibility.PIN_WITH_NAMES) {
            c6378pt = C40788fB0.m41763s(this.context, C45268mk4.view_info_window_title, C52955zi4.titleContainer, C52955zi4.title, merchantRenderItem.getMerchantSite().getMerchant().getName(), C52955zi4.icon, getDrawableFor(merchantRenderItem.getMerchantSite().getIcon()), Double.valueOf(merchantRenderItem.getPinSize()));
        } else {
            Map<String, C6378PT> map = this.bitmapDescriptors;
            String name = merchantRenderItem.getMerchantSite().getIcon().name();
            C6378PT c6378pt2 = map.get(name);
            if (c6378pt2 == null) {
                c6378pt2 = C40788fB0.icon$default(this.context, getDrawableFor(merchantRenderItem.getMerchantSite().getIcon()), null, null, 6, null);
                map.put(name, c6378pt2);
            }
            c6378pt = c6378pt2;
        }
        MarkerOptions m50651Y1 = m50644u.m50657N0(c6378pt).m50651Y1(102.0f);
        Intrinsics.checkNotNullExpressionValue(m50651Y1, "MarkerOptions()\n    .pos…_MERCHANT_MARKER_Z_INDEX)");
        return m50651Y1;
    }

    private final C40889fM2 getOrCreateMarker(MerchantRenderItem merchantRenderItem) {
        Map<String, C40889fM2> map = this.markers;
        String markerId = merchantRenderItem.getMarkerId();
        C40889fM2 c40889fM2 = map.get(markerId);
        if (c40889fM2 == null) {
            c40889fM2 = this.map.m61685c(getMarkerOptions(merchantRenderItem));
            Intrinsics.checkNotNull(c40889fM2);
            map.put(markerId, c40889fM2);
        }
        return c40889fM2;
    }

    @Override // co.bird.android.app.feature.map.p008ui.MapModelRenderer
    public void render(List<? extends MerchantRenderItem> models) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(models, "models");
        List<? extends MerchantRenderItem> list = models;
        for (MerchantRenderItem merchantRenderItem : list) {
            C40889fM2 orCreateMarker = getOrCreateMarker(merchantRenderItem);
            orCreateMarker.m41518p(merchantRenderItem);
            orCreateMarker.m41516r(true);
        }
        Iterator<T> it = this.markers.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (Intrinsics.areEqual(((MerchantRenderItem) obj).getMarkerId(), entry.getKey())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ((C40889fM2) entry.getValue()).m41516r(false);
            }
        }
    }
}
