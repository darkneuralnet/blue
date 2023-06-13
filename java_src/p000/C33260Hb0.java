package p000;

import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.utils.Float2;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.github.sceneview.SceneView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0006\b\tB\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0017j\b\u0012\u0004\u0012\u00020\u0014`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0017j\b\u0012\u0004\u0012\u00020\u0014`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R$\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0017j\b\u0012\u0004\u0012\u00020\u0014`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010&\u001a\u00020\u001f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010*\u001a\u00020'8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010-\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, m28432d2 = {"LHb0;", "", "Landroid/view/MotionEvent;", "event", "", "e", C17296a.f69688o, "", "b", "c", DateTokenConverter.CONVERTER_KEY, "Lio/github/sceneview/SceneView;", "Lio/github/sceneview/SceneView;", "sceneView", "LHb0$b;", "LHb0$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LHb0$a;", "LHb0$a;", "currentGesture", "LHb0$c;", "LHb0$c;", "previousTouch", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "tentativePanEvents", "f", "tentativeOrbitEvents", "g", "tentativeZoomEvents", "", "h", "I", "kGestureConfidenceCount", "i", "kPanConfidenceDistance", "j", "kZoomConfidenceDistance", "", "k", "F", "kZoomSpeed", "l", "Z", "isPanEnabled", "()Z", "setPanEnabled", "(Z)V", "<init>", "(Lio/github/sceneview/SceneView;LHb0$b;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Hb0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C33260Hb0 {

    /* renamed from: a */
    public final SceneView f13589a;

    /* renamed from: b */
    public final InterfaceC3171b f13590b;

    /* renamed from: c */
    public EnumC3170a f13591c;

    /* renamed from: d */
    public C3172c f13592d;

    /* renamed from: e */
    public final ArrayList<C3172c> f13593e;

    /* renamed from: f */
    public final ArrayList<C3172c> f13594f;

    /* renamed from: g */
    public final ArrayList<C3172c> f13595g;

    /* renamed from: h */
    public final int f13596h;

    /* renamed from: i */
    public final int f13597i;

    /* renamed from: j */
    public final int f13598j;

    /* renamed from: k */
    public final float f13599k;

    /* renamed from: l */
    public boolean f13600l;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LHb0$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Hb0$a */
    /* loaded from: classes6.dex */
    public enum EnumC3170a {
        NONE,
        ORBIT,
        PAN,
        ZOOM
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J \u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\r\u001a\u00020\u0007H&¨\u0006\u000e"}, m28432d2 = {"LHb0$b;", "", "", "x", "y", "", "scrollDelta", "", "onScroll", "", "strafe", "b", "c", C17296a.f69688o, "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Hb0$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC3171b {
        /* renamed from: a */
        void mo33446a();

        /* renamed from: b */
        void mo33445b(int i, int i2, boolean z);

        /* renamed from: c */
        void mo33444c(int i, int i2);

        void onScroll(int i, int i2, float f);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$B\t\b\u0016¢\u0006\u0004\b#\u0010%B\u0019\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b#\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\rR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018R\u0011\u0010\"\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\u0018¨\u0006*"}, m28432d2 = {"LHb0$c;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lcom/google/android/filament/utils/Float2;", C17296a.f69688o, "Lcom/google/android/filament/utils/Float2;", "getPt0", "()Lcom/google/android/filament/utils/Float2;", "setPt0", "(Lcom/google/android/filament/utils/Float2;)V", "pt0", "b", "getPt1", "setPt1", "pt1", "c", "I", "getCount", "()I", "setCount", "(I)V", "count", "", "()F", "separation", "midpoint", "x", DateTokenConverter.CONVERTER_KEY, "y", "<init>", "(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V", "()V", "Landroid/view/MotionEvent;", "me", "height", "(Landroid/view/MotionEvent;I)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: Hb0$c */
    /* loaded from: classes6.dex */
    public static final class C3172c {

        /* renamed from: a */
        public Float2 f13606a;

        /* renamed from: b */
        public Float2 f13607b;

        /* renamed from: c */
        public int f13608c;

        public C3172c(Float2 pt0, Float2 pt1, int i) {
            Intrinsics.checkNotNullParameter(pt0, "pt0");
            Intrinsics.checkNotNullParameter(pt1, "pt1");
            this.f13606a = pt0;
            this.f13607b = pt1;
            this.f13608c = i;
        }

        /* renamed from: a */
        public final Float2 m103687a() {
            Float2 float2 = this.f13606a;
            Float2 float22 = this.f13607b;
            return new Float2((float2.getX() * 0.5f) + (float22.getX() * 0.5f), (float2.getY() * 0.5f) + (float22.getY() * 0.5f));
        }

        /* renamed from: b */
        public final float m103686b() {
            Float2 float2 = this.f13606a;
            Float2 float22 = this.f13607b;
            Float2 float23 = new Float2(float2.getX() - float22.getX(), float2.getY() - float22.getY());
            return (float) Math.sqrt((float23.getX() * float23.getX()) + (float23.getY() * float23.getY()));
        }

        /* renamed from: c */
        public final int m103685c() {
            return (int) m103687a().getX();
        }

        /* renamed from: d */
        public final int m103684d() {
            return (int) m103687a().getY();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3172c) {
                C3172c c3172c = (C3172c) obj;
                return Intrinsics.areEqual(this.f13606a, c3172c.f13606a) && Intrinsics.areEqual(this.f13607b, c3172c.f13607b) && this.f13608c == c3172c.f13608c;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f13606a.hashCode() * 31) + this.f13607b.hashCode()) * 31) + Integer.hashCode(this.f13608c);
        }

        public String toString() {
            return "TouchPair(pt0=" + this.f13606a + ", pt1=" + this.f13607b + ", count=" + this.f13608c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C3172c() {
            this(new Float2(0.0f), new Float2(0.0f), 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C3172c(MotionEvent me2, int i) {
            this();
            Intrinsics.checkNotNullParameter(me2, "me");
            if (me2.getPointerCount() >= 1) {
                Float2 float2 = new Float2(me2.getX(0), i - me2.getY(0));
                this.f13606a = float2;
                this.f13607b = float2;
                this.f13608c++;
            }
            if (me2.getPointerCount() >= 2) {
                this.f13607b = new Float2(me2.getX(1), i - me2.getY(1));
                this.f13608c++;
            }
        }
    }

    public C33260Hb0(SceneView sceneView, InterfaceC3171b listener) {
        Intrinsics.checkNotNullParameter(sceneView, "sceneView");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f13589a = sceneView;
        this.f13590b = listener;
        this.f13591c = EnumC3170a.NONE;
        this.f13592d = new C3172c();
        this.f13593e = new ArrayList<>();
        this.f13594f = new ArrayList<>();
        this.f13595g = new ArrayList<>();
        this.f13596h = 2;
        this.f13597i = 10;
        this.f13598j = 10;
        this.f13599k = 0.1f;
        this.f13600l = true;
    }

    /* renamed from: a */
    public final void m103693a() {
        this.f13593e.clear();
        this.f13594f.clear();
        this.f13595g.clear();
        this.f13591c = EnumC3170a.NONE;
        this.f13590b.mo33446a();
    }

    /* renamed from: b */
    public final boolean m103692b() {
        return this.f13594f.size() > this.f13596h;
    }

    /* renamed from: c */
    public final boolean m103691c() {
        Object first;
        Object last;
        if (this.f13600l && this.f13593e.size() > this.f13596h) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f13593e);
            Float2 m103687a = ((C3172c) first).m103687a();
            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f13593e);
            Float2 m103687a2 = ((C3172c) last).m103687a();
            Float2 float2 = new Float2(m103687a.getX() - m103687a2.getX(), m103687a.getY() - m103687a2.getY());
            if (((float) Math.sqrt((float2.getX() * float2.getX()) + (float2.getY() * float2.getY()))) <= this.f13597i) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m103690d() {
        Object first;
        Object last;
        if (this.f13595g.size() > this.f13596h) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f13595g);
            float m103686b = ((C3172c) first).m103686b();
            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f13595g);
            if (Math.abs(((C3172c) last).m103686b() - m103686b) <= this.f13598j) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void m103689e(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C3172c c3172c = new C3172c(event, this.f13589a.getHeight());
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return;
                }
            } else if ((event.getPointerCount() != 1 && this.f13591c == EnumC3170a.ORBIT) || ((event.getPointerCount() != 2 && this.f13591c == EnumC3170a.PAN) || (event.getPointerCount() != 2 && this.f13591c == EnumC3170a.ZOOM))) {
                m103693a();
                return;
            } else {
                EnumC3170a enumC3170a = this.f13591c;
                EnumC3170a enumC3170a2 = EnumC3170a.ZOOM;
                if (enumC3170a == enumC3170a2) {
                    this.f13590b.onScroll(c3172c.m103685c(), c3172c.m103684d(), (this.f13592d.m103686b() - c3172c.m103686b()) * this.f13599k);
                    this.f13592d = c3172c;
                    return;
                } else if (enumC3170a != EnumC3170a.NONE) {
                    this.f13590b.mo33444c(c3172c.m103685c(), c3172c.m103684d());
                    return;
                } else {
                    if (event.getPointerCount() == 1) {
                        this.f13594f.add(c3172c);
                    }
                    if (event.getPointerCount() == 2) {
                        this.f13593e.add(c3172c);
                        this.f13595g.add(c3172c);
                    }
                    if (m103692b()) {
                        this.f13590b.mo33445b(c3172c.m103685c(), c3172c.m103684d(), false);
                        this.f13591c = EnumC3170a.ORBIT;
                        return;
                    } else if (m103690d()) {
                        this.f13591c = enumC3170a2;
                        this.f13592d = c3172c;
                        return;
                    } else if (m103691c()) {
                        this.f13590b.mo33445b(c3172c.m103685c(), c3172c.m103684d(), true);
                        this.f13591c = EnumC3170a.PAN;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        m103693a();
    }
}
