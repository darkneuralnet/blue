package p000;

import android.location.Location;
import co.bird.android.app.feature.map.GoogleMap_Kt;
import co.bird.android.model.ZoomBehaviorable;
import co.bird.android.model.constant.ZoomBehavior;
import co.bird.android.model.persistence.Area;
import com.facebook.share.internal.C17296a;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¨\u0006\u000b"}, m28432d2 = {"", "color", "", "alpha", "b", "Lco/bird/android/model/ZoomBehaviorable;", "Landroid/location/Location;", "userLocation", "zoomLevel", "LjJ6;", C17296a.f69688o, "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPolygon+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polygon+.kt\nco/bird/android/utility/misc/Polygon_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
/* renamed from: KX3 */
/* loaded from: classes4.dex */
public final class KX3 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: KX3$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C4463a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ZoomBehavior.values().length];
            try {
                iArr[ZoomBehavior.ALWAYS_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ZoomBehavior.ALWAYS_VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ZoomBehavior.VISIBLE_ONLY_WHEN_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ZoomBehavior.NO_FILL_WHEN_ZOOMED_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ZoomBehavior.VISIBLE_WHEN_ZOOMED_OUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ZoomBehavior.VISIBLE_WHEN_ZOOMED_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ZoomBehavior.VISIBLE_WHEN_ZOOMED_IN_OR_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ZoomBehavior.VISIBLE_WHEN_ZOOMED_OUT_OR_INSIDE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static final C43238jJ6 m98794a(ZoomBehaviorable zoomBehaviorable, Location userLocation, float f) {
        Area area;
        boolean z;
        boolean z2;
        boolean z3;
        int color;
        Intrinsics.checkNotNullParameter(zoomBehaviorable, "<this>");
        Intrinsics.checkNotNullParameter(userLocation, "userLocation");
        if (zoomBehaviorable instanceof Area) {
            area = (Area) zoomBehaviorable;
        } else {
            area = null;
        }
        boolean z4 = false;
        if (area == null) {
            return new C43238jJ6(0, false, false);
        }
        int color2 = area.getColor();
        switch (C4463a.$EnumSwitchMapping$0[area.getZoomBehavior().ordinal()]) {
            case 1:
                z = false;
                z2 = false;
                break;
            case 2:
            default:
                z2 = false;
                z = true;
                break;
            case 3:
                z = GoogleMap_Kt.contains(area, userLocation);
                z2 = false;
                break;
            case 4:
                if (f < 14.6f) {
                    color2 = area.getColor();
                    z3 = false;
                } else {
                    if (f < 15.4f) {
                        color2 = m98793b(area.getColor(), 0.1f);
                    } else {
                        color2 = 0;
                    }
                    z3 = true;
                }
                z2 = z3;
                z = true;
                break;
            case 5:
                if (f < 15.4f) {
                    if (f > 14.6f) {
                        color = m98793b(area.getColor(), 0.1f);
                    } else {
                        color = area.getColor();
                    }
                    color2 = color;
                    z2 = false;
                    z = true;
                    break;
                }
                z = false;
                z2 = false;
                break;
            case 6:
                if (f >= 17.0f) {
                    if (f < 16.4f) {
                        color = m98793b(area.getColor(), 0.1f);
                    } else {
                        color = area.getColor();
                    }
                    color2 = color;
                    z2 = false;
                    z = true;
                    break;
                }
                z = false;
                z2 = false;
                break;
            case 7:
                if (GoogleMap_Kt.contains(area, userLocation) || f > 17.0f) {
                    if (f > 17.0f) {
                        color = m98793b(area.getColor(), 0.1f);
                    } else {
                        color = area.getColor();
                    }
                    color2 = color;
                    z2 = false;
                    z = true;
                    break;
                }
                z = false;
                z2 = false;
                break;
            case 8:
                if (GoogleMap_Kt.contains(area, userLocation) || f < 17.0f) {
                    if (f >= 14.6f) {
                        color = m98793b(area.getColor(), 0.1f);
                    } else {
                        color = area.getColor();
                    }
                    color2 = color;
                    z2 = false;
                    z = true;
                    break;
                }
                z = false;
                z2 = false;
                break;
        }
        if (z && !z2) {
            z4 = true;
        }
        return new C43238jJ6(color2, z, z4);
    }

    /* renamed from: b */
    public static final int m98793b(int i, float f) {
        return (i & 16777215) | (((int) (f * ((float) KotlinVersion.MAX_COMPONENT_VALUE))) << 24);
    }
}
