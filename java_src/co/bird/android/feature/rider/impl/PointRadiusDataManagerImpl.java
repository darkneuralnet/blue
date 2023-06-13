package co.bird.android.feature.rider.impl;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B5\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0001\u0010#\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016J\u001e\u0010\u0010\u001a\u00020\r*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bJ\f\u0010\u0012\u001a\u00020\u0011*\u00020\bH\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u001a\u0010#\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001b\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010-\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010%0%0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, m28432d2 = {"Lco/bird/android/feature/rider/impl/PointRadiusDataManagerImpl;", "Lwu6;", "Lvt4;", "LVX0;", "LLifecycleOwner;", "owner", "", "onCreate", "Lcom/google/android/gms/maps/model/LatLngBounds;", "region", "", "Lco/bird/android/model/wire/WireBird;", "birds", "Lio/reactivex/c;", C17296a.f69688o, "bird", "e", "", "b", "LaM;", "LaM;", "birdManager", "Lbn;", "c", "Lbn;", "areaManager", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LLifecycleOwner;", "processLifecycleOwner", "f", "Lvt4;", "()Lvt4;", "cellType", "La94;", "", "g", "La94;", "isEnabledRelay", "LZ84;", "kotlin.jvm.PlatformType", "h", "LZ84;", "isEnabled", "()LZ84;", "<init>", "(LaM;Lbn;LTq4;LLifecycleOwner;Lvt4;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PointRadiusDataManagerImpl implements InterfaceC51298wu6<InterfaceC50693vt4>, VX0 {

    /* renamed from: b */
    public final InterfaceC10636aM f65166b;

    /* renamed from: c */
    public final InterfaceC12495bn f65167c;

    /* renamed from: d */
    public final C36207Tq4 f65168d;

    /* renamed from: e */
    public final LifecycleOwner f65169e;

    /* renamed from: f */
    public final InterfaceC50693vt4 f65170f;

    /* renamed from: g */
    public final C37791a94<Boolean> f65171g;

    /* renamed from: h */
    public final Z84<Boolean> f65172h;

    public PointRadiusDataManagerImpl(InterfaceC10636aM birdManager, InterfaceC12495bn areaManager, C36207Tq4 reactiveConfig, LifecycleOwner processLifecycleOwner, InterfaceC50693vt4 cellType) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        Intrinsics.checkNotNullParameter(cellType, "cellType");
        this.f65166b = birdManager;
        this.f65167c = areaManager;
        this.f65168d = reactiveConfig;
        this.f65169e = processLifecycleOwner;
        this.f65170f = cellType;
        C37791a94<Boolean> create$default = C37791a94.C10586a.create$default(C37791a94.f49908h, Boolean.TRUE, null, 2, null);
        this.f65171g = create$default;
        this.f65172h = Z84.f47888d.m73663b(create$default);
        processLifecycleOwner.getLifecycle().mo67008a(this);
    }

    public static /* synthetic */ AbstractC23461c refreshViaPointRadius$default(PointRadiusDataManagerImpl pointRadiusDataManagerImpl, InterfaceC50693vt4 interfaceC50693vt4, LatLngBounds latLngBounds, WireBird wireBird, int i, Object obj) {
        if ((i & 2) != 0) {
            wireBird = null;
        }
        return pointRadiusDataManagerImpl.m57019e(interfaceC50693vt4, latLngBounds, wireBird);
    }

    @Override // p000.InterfaceC51298wu6
    /* renamed from: a */
    public AbstractC23461c mo6122a(LatLngBounds region, List<WireBird> list) {
        WireBird wireBird;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(region, "region");
        InterfaceC50693vt4 m57020d = m57020d();
        if (list != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) list);
            wireBird = (WireBird) firstOrNull;
        } else {
            wireBird = null;
        }
        return m57019e(m57020d, region, wireBird);
    }

    /* renamed from: b */
    public final float m57021b(LatLngBounds latLngBounds) {
        LatLng southwest = latLngBounds.f71432b;
        Intrinsics.checkNotNullExpressionValue(southwest, "southwest");
        Location m60884e = C39339cm2.m60884e(southwest);
        LatLng northeast = latLngBounds.f71433c;
        Intrinsics.checkNotNullExpressionValue(northeast, "northeast");
        return m60884e.distanceTo(C39339cm2.m60884e(northeast));
    }

    /* renamed from: d */
    public InterfaceC50693vt4 m57020d() {
        return this.f65170f;
    }

    /* renamed from: e */
    public final AbstractC23461c m57019e(InterfaceC50693vt4 interfaceC50693vt4, LatLngBounds region, WireBird wireBird) {
        String str;
        Intrinsics.checkNotNullParameter(interfaceC50693vt4, "<this>");
        Intrinsics.checkNotNullParameter(region, "region");
        LatLng m50668v = region.m50668v();
        Intrinsics.checkNotNullExpressionValue(m50668v, "region.center");
        Location m60884e = C39339cm2.m60884e(m50668v);
        double m57021b = m57021b(region) / 2.0d;
        InterfaceC50693vt4 m57020d = m57020d();
        if (m57020d instanceof InterfaceC8259UK) {
            return this.f65166b.mo71599J0(m60884e, GoogleMap_Kt.adjustedNearbyRadius(m57021b));
        }
        if (m57020d instanceof InterfaceC8440Um) {
            return this.f65167c.mo64005Z(m60884e, m57021b, MapMode.RIDER, true);
        }
        if (m57020d instanceof B23) {
            InterfaceC12495bn interfaceC12495bn = this.f65167c;
            if (wireBird != null) {
                str = wireBird.getId();
            } else {
                str = null;
            }
            AbstractC23461c m33159G = interfaceC12495bn.mo64000f(m57021b, str, m60884e).m33159G();
            Intrinsics.checkNotNullExpressionValue(m33159G, "areaManager.nearbyParkin…\n        .ignoreElement()");
            return m33159G;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p000.InterfaceC51298wu6
    public Z84<Boolean> isEnabled() {
        return this.f65172h;
    }

    @Override // p000.VX0
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        this.f65171g.accept(Boolean.TRUE);
    }
}
