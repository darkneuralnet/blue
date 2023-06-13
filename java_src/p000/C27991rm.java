package p000;

import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.AugmentedFace;
import com.google.p034ar.core.AugmentedImage;
import com.google.p034ar.core.Camera;
import com.google.p034ar.core.Frame;
import com.google.p034ar.core.HitResult;
import com.google.p034ar.core.Plane;
import com.google.p034ar.core.Trackable;
import io.github.sceneview.p052ar.arcore.ArSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010$\u001a\u00020 \u0012\u0006\u0010*\u001a\u00020%\u0012\u0006\u0010/\u001a\u00020+¢\u0006\u0004\bE\u0010FJJ\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0007JF\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0007J,\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J:\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0007J\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0000J\u0010\u0010\u0018\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0000J\u0010\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0000J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010/\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001b\u00103\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b&\u00102R!\u00107\u001a\b\u0012\u0004\u0012\u0002040\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b5\u00106R\u0017\u0010<\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\n8F¢\u0006\u0006\u001a\u0004\b>\u00106R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020@0\n8F¢\u0006\u0006\u001a\u0004\bA\u00106R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\n8F¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006G"}, m28432d2 = {"Lrm;", "", "", "xPx", "yPx", "", "plane", "depth", "instant", "approximateDistance", "", "Lcom/google/ar/core/HitResult;", "n", "j", "Lhu1;", "Lio/github/sceneview/math/Position;", "position", "k", "Landroid/view/MotionEvent;", "motionEvent", "l", "arFrame", "", "o", C17296a.f69688o, "p", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lio/github/sceneview/ar/arcore/ArSession;", "Lio/github/sceneview/ar/arcore/ArSession;", DateTokenConverter.CONVERTER_KEY, "()Lio/github/sceneview/ar/arcore/ArSession;", "session", "LPy1;", "b", "LPy1;", "e", "()LPy1;", "time", "Lcom/google/ar/core/Frame;", "c", "Lcom/google/ar/core/Frame;", "()Lcom/google/ar/core/Frame;", "frame", "Lcom/google/ar/core/Camera;", "Lkotlin/Lazy;", "()Lcom/google/ar/core/Camera;", "camera", "Lcom/google/ar/core/Trackable;", "i", "()Ljava/util/List;", "updatedTrackables", "f", "D", "getFps", "()D", "fps", "Lcom/google/ar/core/Plane;", "h", "updatedPlanes", "Lcom/google/ar/core/AugmentedImage;", "g", "updatedAugmentedImages", "Lcom/google/ar/core/AugmentedFace;", "updatedAugmentedFaces", "<init>", "(Lio/github/sceneview/ar/arcore/ArSession;LPy1;Lcom/google/ar/core/Frame;)V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: rm */
/* loaded from: classes6.dex */
public final class C27991rm {

    /* renamed from: a */
    public final ArSession f107578a;

    /* renamed from: b */
    public final C35340Py1 f107579b;

    /* renamed from: c */
    public final Frame f107580c;

    /* renamed from: d */
    public final Lazy f107581d;

    /* renamed from: e */
    public final Lazy f107582e;

    /* renamed from: f */
    public final double f107583f;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcom/google/ar/core/Camera;", "b", "()Lcom/google/ar/core/Camera;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: rm$a */
    /* loaded from: classes6.dex */
    public static final class C27992a extends Lambda implements Function0<Camera> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27992a() {
            super(0);
            C27991rm.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Camera invoke() {
            Camera camera = C27991rm.this.m15447c().getCamera();
            Intrinsics.checkNotNullExpressionValue(camera, "frame.camera");
            return camera;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "Lcom/google/ar/core/Trackable;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* renamed from: rm$b */
    /* loaded from: classes6.dex */
    public static final class C27993b extends Lambda implements Function0<List<? extends Trackable>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27993b() {
            super(0);
            C27991rm.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Trackable> invoke() {
            List<? extends Trackable> list;
            Collection updatedTrackables = C27991rm.this.m15447c().getUpdatedTrackables(Trackable.class);
            Intrinsics.checkNotNullExpressionValue(updatedTrackables, "frame.getUpdatedTrackables(Trackable::class.java)");
            list = CollectionsKt___CollectionsKt.toList(updatedTrackables);
            return list;
        }
    }

    public C27991rm(ArSession session, C35340Py1 time, Frame frame) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.f107578a = session;
        this.f107579b = time;
        this.f107580c = frame;
        lazy = LazyKt__LazyJVMKt.lazy(new C27992a());
        this.f107581d = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C27993b());
        this.f107582e = lazy2;
        this.f107583f = time.m89222c();
    }

    /* renamed from: m */
    public static /* synthetic */ HitResult m15437m(C27991rm c27991rm, MotionEvent motionEvent, boolean z, boolean z2, boolean z3, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            z = c27991rm.f107578a.m33361u();
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = c27991rm.f107578a.m33371f();
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = c27991rm.f107578a.m33364q();
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            f = c27991rm.f107578a.m33374b();
        }
        return c27991rm.m15438l(motionEvent, z4, z5, z6, f);
    }

    /* renamed from: a */
    public final double m15449a(C27991rm c27991rm) {
        return this.f107579b.m89224a(c27991rm != null ? c27991rm.f107579b : null);
    }

    /* renamed from: b */
    public final Camera m15448b() {
        return (Camera) this.f107581d.getValue();
    }

    /* renamed from: c */
    public final Frame m15447c() {
        return this.f107580c;
    }

    /* renamed from: d */
    public final ArSession m15446d() {
        return this.f107578a;
    }

    /* renamed from: e */
    public final C35340Py1 m15445e() {
        return this.f107579b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27991rm) {
            C27991rm c27991rm = (C27991rm) obj;
            return Intrinsics.areEqual(this.f107578a, c27991rm.f107578a) && Intrinsics.areEqual(this.f107579b, c27991rm.f107579b) && Intrinsics.areEqual(this.f107580c, c27991rm.f107580c);
        }
        return false;
    }

    /* renamed from: f */
    public final List<AugmentedFace> m15444f() {
        AugmentedFace augmentedFace;
        ArrayList arrayList = new ArrayList();
        for (Trackable trackable : m15441i()) {
            if (trackable instanceof AugmentedFace) {
                augmentedFace = (AugmentedFace) trackable;
            } else {
                augmentedFace = null;
            }
            if (augmentedFace != null) {
                arrayList.add(augmentedFace);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final List<AugmentedImage> m15443g() {
        AugmentedImage augmentedImage;
        ArrayList arrayList = new ArrayList();
        for (Trackable trackable : m15441i()) {
            if (trackable instanceof AugmentedImage) {
                augmentedImage = (AugmentedImage) trackable;
            } else {
                augmentedImage = null;
            }
            if (augmentedImage != null) {
                arrayList.add(augmentedImage);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public final List<Plane> m15442h() {
        Plane plane;
        ArrayList arrayList = new ArrayList();
        for (Trackable trackable : m15441i()) {
            if (trackable instanceof Plane) {
                plane = (Plane) trackable;
            } else {
                plane = null;
            }
            if (plane != null) {
                arrayList.add(plane);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return (((this.f107578a.hashCode() * 31) + this.f107579b.hashCode()) * 31) + this.f107580c.hashCode();
    }

    /* renamed from: i */
    public final List<Trackable> m15441i() {
        return (List) this.f107582e.getValue();
    }

    @JvmOverloads
    /* renamed from: j */
    public final HitResult m15440j(float f, float f2, boolean z, boolean z2, boolean z3, float f3) {
        return C28382sm.m13702a(m15436n(f, f2, z, z2, z3, f3), m15448b(), z, z2, z3);
    }

    /* renamed from: k */
    public final HitResult m15439k(C42400hu1 position, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(position, "position");
        return m15440j((this.f107578a.m33367n() / 2.0f) * (position.m35576g() + 1.0f), (this.f107578a.m33368l() / 2.0f) * (1.0f - position.m35575h()), z, z2, z3, Math.abs(position.m35574i()));
    }

    @JvmOverloads
    /* renamed from: l */
    public final HitResult m15438l(MotionEvent motionEvent, boolean z, boolean z2, boolean z3, float f) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        Camera camera = this.f107580c.getCamera();
        Intrinsics.checkNotNullExpressionValue(camera, "frame.camera");
        return C28382sm.m13702a(m15436n(motionEvent.getX(), motionEvent.getY(), z, z2, z3, f), camera, z, z2, z3);
    }

    @JvmOverloads
    /* renamed from: n */
    public final List<HitResult> m15436n(float f, float f2, boolean z, boolean z2, boolean z3, float f3) {
        List<HitResult> emptyList;
        if (C34430Mb0.m95150a(m15448b())) {
            if (z || z2) {
                List<HitResult> it = this.f107580c.hitTest(f, f2);
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (!(!it.isEmpty())) {
                    it = null;
                }
                if (it != null) {
                    return it;
                }
            }
            if (z3) {
                List<HitResult> hitTestInstantPlacement = this.f107580c.hitTestInstantPlacement(f, f2, f3);
                Intrinsics.checkNotNullExpressionValue(hitTestInstantPlacement, "frame.hitTestInstantPlac…yPx, approximateDistance)");
                return hitTestInstantPlacement;
            }
        }
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        return emptyList;
    }

    /* renamed from: o */
    public final double m15435o(C27991rm c27991rm) {
        return this.f107579b.m89217h(c27991rm != null ? c27991rm.f107579b : null);
    }

    /* renamed from: p */
    public final double m15434p(C27991rm c27991rm) {
        return m15449a(c27991rm) / this.f107583f;
    }

    public String toString() {
        return "ArFrame(session=" + this.f107578a + ", time=" + this.f107579b + ", frame=" + this.f107580c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
