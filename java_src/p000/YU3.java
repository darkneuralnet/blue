package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.p034ar.core.Config;
import io.github.sceneview.p052ar.node.ArModelNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000ej\u0002\b\u0012j\u0002\b\u0015j\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, m28432d2 = {"LYU3;", "", "", "b", "F", "getInstantPlacementDistance", "()F", "setInstantPlacementDistance", "(F)V", "instantPlacementDistance", "", "c", "Z", "getInstantPlacementFallback", "()Z", "setInstantPlacementFallback", "(Z)V", "instantPlacementFallback", DateTokenConverter.CONVERTER_KEY, "planeEnabled", "Lcom/google/ar/core/Config$PlaneFindingMode;", "e", "()Lcom/google/ar/core/Config$PlaneFindingMode;", "planeFindingMode", "depthEnabled", "instantPlacementEnabled", "<init>", "(Ljava/lang/String;IFZ)V", "f", "g", "h", "i", "j", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: YU3 */
/* loaded from: classes6.dex */
public enum YU3 {
    DISABLED(0.0f, false, 3, null),
    PLANE_HORIZONTAL(0.0f, false, 3, null),
    PLANE_VERTICAL(0.0f, false, 3, null),
    PLANE_HORIZONTAL_AND_VERTICAL(0.0f, false, 3, null),
    DEPTH(0.0f, false, 3, null),
    INSTANT(0.0f, false, 3, null),
    BEST_AVAILABLE(0.0f, true, 1, null);
    

    /* renamed from: b */
    public float f45932b;

    /* renamed from: c */
    public boolean f45933c;

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: YU3$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C9790a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Config.PlaneFindingMode.values().length];
            try {
                iArr[Config.PlaneFindingMode.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Config.PlaneFindingMode.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Config.PlaneFindingMode.HORIZONTAL_AND_VERTICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[YU3.values().length];
            try {
                iArr2[YU3.PLANE_HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[YU3.PLANE_VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[YU3.PLANE_HORIZONTAL_AND_VERTICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[YU3.BEST_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[YU3.DEPTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    YU3(float f, boolean z) {
        this.f45932b = f;
        this.f45933c = z;
    }

    /* renamed from: b */
    public final boolean m74996b() {
        int i = C9790a.$EnumSwitchMapping$1[ordinal()];
        return i == 4 || i == 5;
    }

    /* renamed from: c */
    public final boolean m74995c() {
        return this == INSTANT || this.f45933c;
    }

    /* renamed from: d */
    public final boolean m74994d() {
        int i = C9790a.$EnumSwitchMapping$0[m74993e().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* renamed from: e */
    public final Config.PlaneFindingMode m74993e() {
        int i = C9790a.$EnumSwitchMapping$1[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    return Config.PlaneFindingMode.DISABLED;
                }
                return Config.PlaneFindingMode.HORIZONTAL_AND_VERTICAL;
            }
            return Config.PlaneFindingMode.VERTICAL;
        }
        return Config.PlaneFindingMode.HORIZONTAL;
    }

    /* synthetic */ YU3(float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ArModelNode.f88033W0.m33326a() : f, (i & 2) != 0 ? false : z);
    }
}
