package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.AreaIconType;
import co.bird.android.model.persistence.Area;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0002J\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0002J\u0012\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LSm;", "", "Lco/bird/android/model/persistence/Area;", "LRm;", "e", DateTokenConverter.CONVERTER_KEY, "", "showRefreshUi", "b", C17296a.f69688o, "", "label", "c", "LTq4;", "LTq4;", "reactiveConfig", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ldr4;", "Ldr4;", "locationManager", "Lbn;", "Lbn;", "areaManager", "<init>", "(LTq4;Landroid/content/Context;Ldr4;Lbn;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAreaBottomSheetModelConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetModelConversion.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetModelConversion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
/* renamed from: Sm */
/* loaded from: classes3.dex */
public final class C7540Sm {

    /* renamed from: a */
    public final C36207Tq4 f34239a;

    /* renamed from: b */
    public final Context f34240b;

    /* renamed from: c */
    public final InterfaceC40001dr4 f34241c;

    /* renamed from: d */
    public final InterfaceC12495bn f34242d;

    public C7540Sm(C36207Tq4 reactiveConfig, Context context, InterfaceC40001dr4 locationManager, InterfaceC12495bn areaManager) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(areaManager, "areaManager");
        this.f34239a = reactiveConfig;
        this.f34240b = context;
        this.f34241c = locationManager;
        this.f34242d = areaManager;
    }

    /* renamed from: a */
    public final InterfaceC7269Rm m84859a() {
        return new C5374Mn(this.f34242d.mo63993w().m73665a().m59035e());
    }

    /* renamed from: b */
    public final InterfaceC7269Rm m84858b(Area area, boolean z) {
        Double d;
        Intrinsics.checkNotNullParameter(area, "<this>");
        int m35857d = C22727ho.m35857d(area);
        String title = area.title();
        int m35860a = C22727ho.m35860a(area);
        String m35859b = C22727ho.m35859b(area);
        if (m35859b == null) {
            m35859b = "";
        }
        String str = m35859b;
        int m35858c = C22727ho.m35858c(area);
        AreaIconType areaReleaseCapacityIconType = area.getAreaReleaseCapacityIconType();
        EnumC52318ye0 m35856e = C22727ho.m35856e(area);
        Integer releaseCapacity = area.getReleaseCapacity();
        Geolocation centerPoint = area.getCenterPoint();
        Geolocation centerPoint2 = area.getCenterPoint();
        if (centerPoint2 != null) {
            d = Double.valueOf(this.f34241c.mo43618n(UB1.m81891a(centerPoint2)));
        } else {
            d = null;
        }
        return new C22473go(m35857d, title, m35860a, str, m35858c, areaReleaseCapacityIconType, m35856e, releaseCapacity, centerPoint, d, this.f34242d.mo63993w().m73665a().m59035e(), z);
    }

    /* renamed from: c */
    public final InterfaceC7269Rm m84857c(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new C40087e01(label, this.f34242d.mo63993w().m73665a().m59035e());
    }

    /* renamed from: d */
    public final InterfaceC7269Rm m84856d(Area area) {
        Integer num;
        Intrinsics.checkNotNullParameter(area, "<this>");
        AreaIconType overlayIcon = area.getOverlayIcon();
        if (overlayIcon != null) {
            num = C10854an.m70750a(overlayIcon);
        } else {
            num = null;
        }
        return new C40011ds4(num, C40604es4.m42476b(area, this.f34240b), C40604es4.m42475c(area), C40604es4.m42477a(area, this.f34240b));
    }

    /* renamed from: e */
    public final InterfaceC7269Rm m84855e(Area area) {
        Integer num;
        Intrinsics.checkNotNullParameter(area, "<this>");
        AreaIconType overlayIcon = area.getOverlayIcon();
        if (overlayIcon != null) {
            num = C10854an.m70750a(overlayIcon);
        } else {
            num = null;
        }
        return new C34976Oj6(num, C35210Pj6.m89885b(area, this.f34240b), C35210Pj6.m89884c(area), C35210Pj6.m89886a(area, this.f34240b), this.f34239a.m82623f8().m73665a().getOperatorConfig().getFeatures().getMap().getOperatorArea().getVariableFeeZendeskArticleId());
    }
}
