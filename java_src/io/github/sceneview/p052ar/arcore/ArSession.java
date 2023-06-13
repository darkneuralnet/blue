package io.github.sceneview.p052ar.arcore;

import android.view.Display;
import android.view.WindowManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.p034ar.core.AugmentedImageDatabase;
import com.google.p034ar.core.CameraConfig;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.Frame;
import com.google.p034ar.core.Session;
import com.google.p034ar.core.Trackable;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.github.sceneview.p052ar.ArSceneLifecycle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC30295xm;
@Metadata(m28433d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\"\u001a\u00020\u001d\u0012\u000e\b\u0002\u0010z\u001a\b\u0012\u0004\u0012\u00020y0x¢\u0006\u0004\b{\u0010|J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012J \u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u0019R\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010.\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u000e\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u000e\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\"\u00106\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u000e\u001a\u0004\b4\u0010+\"\u0004\b5\u0010-R\"\u0010:\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010A\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=R\u001a\u0010F\u001a\u00020B8\u0006X\u0086D¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b\u001e\u0010ER(\u0010K\u001a\u0004\u0018\u00010\u000f2\b\u0010G\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b/\u0010JR(\u0010S\u001a\b\u0012\u0004\u0012\u00020M0L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010Z\u001a\u00020T2\u0006\u0010U\u001a\u00020T8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010]\u001a\u0002072\u0006\u0010U\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010;\"\u0004\b\\\u0010=R$\u0010c\u001a\u00020^2\u0006\u0010U\u001a\u00020^8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0011\u0010d\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b3\u0010;R$\u0010i\u001a\u00020e2\u0006\u0010U\u001a\u00020e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010f\"\u0004\bg\u0010hR$\u0010l\u001a\u0002072\u0006\u0010U\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010;\"\u0004\bk\u0010=R$\u0010n\u001a\u0002072\u0006\u0010U\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010;\"\u0004\bm\u0010=R$\u0010q\u001a\u0002072\u0006\u0010U\u001a\u0002078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010;\"\u0004\bp\u0010=R$\u0010w\u001a\u00020r2\u0006\u0010U\u001a\u00020r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010v¨\u0006}"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/ArSession;", "Lcom/google/ar/core/Session;", "Lxm;", "LLifecycleOwner;", "owner", "", "onResume", "resume", "onPause", "pause", "onDestroy", "", "width", "height", "I", "Lrm;", "arFrame", "r", "LPy1;", "frameTime", "D", "rotation", "widthPx", "heightPx", "setDisplayGeometry", "Lkotlin/Function1;", "Lcom/google/ar/core/Config;", "config", C17296a.f69688o, "Lio/github/sceneview/ar/ArSceneLifecycle;", "b", "Lio/github/sceneview/ar/ArSceneLifecycle;", "s", "()Lio/github/sceneview/ar/ArSceneLifecycle;", "lifecycle", "Landroid/view/Display;", "c", "Lkotlin/Lazy;", "k", "()Landroid/view/Display;", "display", DateTokenConverter.CONVERTER_KEY, "getDisplayRotation", "()I", "setDisplayRotation", "(I)V", "displayRotation", "e", "n", "setDisplayWidth", "displayWidth", "f", "l", "setDisplayHeight", "displayHeight", "", "g", "Z", "isResumed", "()Z", "setResumed", "(Z)V", "h", "getHasAugmentedImageDatabase", "setHasAugmentedImageDatabase", "hasAugmentedImageDatabase", "", "i", "F", "()F", "approximateDistance", "<set-?>", "j", "Lrm;", "()Lrm;", "currentFrame", "", "Lcom/google/ar/core/Trackable;", "Ljava/util/List;", "getAllTrackables", "()Ljava/util/List;", "setAllTrackables", "(Ljava/util/List;)V", "allTrackables", "Lcom/google/ar/core/Config$FocusMode;", "value", "o", "()Lcom/google/ar/core/Config$FocusMode;", "y", "(Lcom/google/ar/core/Config$FocusMode;)V", "focusMode", "u", "setPlaneFindingEnabled", "planeFindingEnabled", "Lcom/google/ar/core/Config$PlaneFindingMode;", "v", "()Lcom/google/ar/core/Config$PlaneFindingMode;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(Lcom/google/ar/core/Config$PlaneFindingMode;)V", "planeFindingMode", "depthEnabled", "Lcom/google/ar/core/Config$DepthMode;", "()Lcom/google/ar/core/Config$DepthMode;", "x", "(Lcom/google/ar/core/Config$DepthMode;)V", "depthMode", "q", "A", "instantPlacementEnabled", "w", "cloudAnchorEnabled", "p", "z", "geospatialEnabled", "Lcom/google/ar/core/Config$LightEstimationMode;", "t", "()Lcom/google/ar/core/Config$LightEstimationMode;", "B", "(Lcom/google/ar/core/Config$LightEstimationMode;)V", "lightEstimationMode", "", "Lcom/google/ar/core/Session$Feature;", "features", "<init>", "(Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)V", "arsceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: io.github.sceneview.ar.arcore.ArSession */
/* loaded from: classes6.dex */
public final class ArSession extends Session implements InterfaceC30295xm {

    /* renamed from: b */
    public final ArSceneLifecycle f87996b;

    /* renamed from: c */
    public final Lazy f87997c;

    /* renamed from: d */
    public int f87998d;

    /* renamed from: e */
    public int f87999e;

    /* renamed from: f */
    public int f88000f;

    /* renamed from: g */
    public boolean f88001g;

    /* renamed from: h */
    public boolean f88002h;

    /* renamed from: i */
    public final float f88003i;

    /* renamed from: j */
    public C27991rm f88004j;

    /* renamed from: k */
    public List<? extends Trackable> f88005k;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.arcore.ArSession$a */
    /* loaded from: classes6.dex */
    public static final class C23395a extends Lambda implements Function1<Config, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f88006g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23395a(boolean z) {
            super(1);
            this.f88006g = z;
        }

        /* renamed from: a */
        public final void m33355a(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C0204Am.m115306e(it, this.f88006g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m33355a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.arcore.ArSession$b */
    /* loaded from: classes6.dex */
    public static final class C23396b extends Lambda implements Function1<Config, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Config.DepthMode f88007g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23396b(Config.DepthMode depthMode) {
            super(1);
            this.f88007g = depthMode;
        }

        /* renamed from: a */
        public final void m33354a(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setDepthMode(this.f88007g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m33354a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/view/Display;", "kotlin.jvm.PlatformType", "b", "()Landroid/view/Display;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.arcore.ArSession$c */
    /* loaded from: classes6.dex */
    public static final class C23397c extends Lambda implements Function0<Display> {
        public C23397c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Display invoke() {
            Object systemService = ArSession.this.m33363s().m33412w().getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            return ((WindowManager) systemService).getDefaultDisplay();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.arcore.ArSession$d */
    /* loaded from: classes6.dex */
    public static final class C23398d extends Lambda implements Function1<Config, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Config.FocusMode f88009g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23398d(Config.FocusMode focusMode) {
            super(1);
            this.f88009g = focusMode;
        }

        /* renamed from: a */
        public final void m33352a(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setFocusMode(this.f88009g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m33352a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.arcore.ArSession$e */
    /* loaded from: classes6.dex */
    public static final class C23399e extends Lambda implements Function1<Config, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f88010g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23399e(boolean z) {
            super(1);
            this.f88010g = z;
        }

        /* renamed from: a */
        public final void m33351a(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C0204Am.m115305f(it, this.f88010g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m33351a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.arcore.ArSession$f */
    /* loaded from: classes6.dex */
    public static final class C23400f extends Lambda implements Function1<Config, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f88011g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23400f(boolean z) {
            super(1);
            this.f88011g = z;
        }

        /* renamed from: a */
        public final void m33350a(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C0204Am.m115304g(it, this.f88011g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m33350a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.arcore.ArSession$g */
    /* loaded from: classes6.dex */
    public static final class C23401g extends Lambda implements Function1<Config, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Config.LightEstimationMode f88012g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23401g(Config.LightEstimationMode lightEstimationMode) {
            super(1);
            this.f88012g = lightEstimationMode;
        }

        /* renamed from: a */
        public final void m33349a(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setLightEstimationMode(this.f88012g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m33349a(config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lcom/google/ar/core/Config;", "it", "", C17296a.f69688o, "(Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: io.github.sceneview.ar.arcore.ArSession$h */
    /* loaded from: classes6.dex */
    public static final class C23402h extends Lambda implements Function1<Config, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Config.PlaneFindingMode f88013g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23402h(Config.PlaneFindingMode planeFindingMode) {
            super(1);
            this.f88013g = planeFindingMode;
        }

        /* renamed from: a */
        public final void m33348a(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.setPlaneFindingMode(this.f88013g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Config config) {
            m33348a(config);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArSession(ArSceneLifecycle lifecycle, Set<? extends Session.Feature> features) {
        super(lifecycle.m33412w(), features);
        Lazy lazy;
        List<? extends Trackable> emptyList;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(features, "features");
        this.f87996b = lifecycle;
        lazy = LazyKt__LazyJVMKt.lazy(new C23397c());
        this.f87997c = lazy;
        this.f87998d = m33369k().getRotation();
        this.f87999e = m33369k().getWidth();
        this.f88000f = m33369k().getHeight();
        this.f88003i = 2.0f;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f88005k = emptyList;
        lifecycle.mo67008a(this);
    }

    /* renamed from: A */
    public final void m33379A(boolean z) {
        if (m33364q() != z) {
            m33375a(new C23400f(z));
        }
    }

    /* renamed from: B */
    public final void m33378B(Config.LightEstimationMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (m33362t() != value) {
            m33375a(new C23401g(value));
        }
    }

    /* renamed from: C */
    public final void m33377C(Config.PlaneFindingMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (m33360v() != value) {
            m33375a(new C23402h(value));
        }
    }

    /* renamed from: D */
    public final C27991rm m33376D(C35340Py1 frameTime) {
        Intrinsics.checkNotNullParameter(frameTime, "frameTime");
        Frame update = super.update();
        if (update != null) {
            C27991rm c27991rm = new C27991rm(this, frameTime, update);
            this.f88004j = c27991rm;
            return c27991rm;
        }
        return null;
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: F */
    public void mo4733F(Exception exc) {
        InterfaceC30295xm.C30296a.m4725d(this, exc);
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: I */
    public void mo15405I(int i, int i2) {
        setDisplayGeometry(m33369k().getRotation(), i, i2);
    }

    /* renamed from: a */
    public final void m33375a(Function1<? super Config, Unit> config) {
        int i;
        Intrinsics.checkNotNullParameter(config, "config");
        Config config2 = getConfig();
        Intrinsics.checkNotNullExpressionValue(config2, "this");
        config.invoke(config2);
        Config.DepthMode depthMode = config2.getDepthMode();
        Config.DepthMode depthMode2 = Config.DepthMode.DISABLED;
        if (depthMode != depthMode2 && !isDepthModeSupported(config2.getDepthMode())) {
            config2.setDepthMode(depthMode2);
        }
        if (getCameraConfig().getFacingDirection() == CameraConfig.FacingDirection.FRONT) {
            Config.LightEstimationMode lightEstimationMode = config2.getLightEstimationMode();
            Config.LightEstimationMode lightEstimationMode2 = Config.LightEstimationMode.DISABLED;
            if (lightEstimationMode != lightEstimationMode2) {
                config2.setLightEstimationMode(lightEstimationMode2);
            }
        }
        AugmentedImageDatabase augmentedImageDatabase = config2.getAugmentedImageDatabase();
        boolean z = false;
        if (augmentedImageDatabase != null) {
            i = augmentedImageDatabase.getNumImages();
        } else {
            i = 0;
        }
        if (i > 0) {
            z = true;
        }
        this.f88002h = z;
        super.configure(config2);
        ArrayList<InterfaceC30295xm> arrayList = new ArrayList();
        for (InterfaceC32929Fq2 interfaceC32929Fq2 : this.f87996b.m83453q()) {
            if (!(interfaceC32929Fq2 instanceof InterfaceC30295xm)) {
                interfaceC32929Fq2 = null;
            }
            InterfaceC30295xm interfaceC30295xm = (InterfaceC30295xm) interfaceC32929Fq2;
            if (interfaceC30295xm != null) {
                arrayList.add(interfaceC30295xm);
            }
        }
        for (InterfaceC30295xm interfaceC30295xm2 : arrayList) {
            Config config3 = getConfig();
            Intrinsics.checkNotNullExpressionValue(config3, "this@ArSession.config");
            interfaceC30295xm2.mo4731i(this, config3);
        }
    }

    /* renamed from: b */
    public final float m33374b() {
        return this.f88003i;
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: c */
    public void mo4732c(ArSession arSession) {
        InterfaceC30295xm.C30296a.m4724e(this, arSession);
    }

    /* renamed from: d */
    public final boolean m33373d() {
        Config config = getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "config");
        return C0204Am.m115310a(config);
    }

    /* renamed from: e */
    public final C27991rm m33372e() {
        return this.f88004j;
    }

    /* renamed from: f */
    public final boolean m33371f() {
        return m33370j() != Config.DepthMode.DISABLED;
    }

    @Override // p000.InterfaceC48254rm5
    /* renamed from: g */
    public void mo15404g(C35340Py1 c35340Py1) {
        InterfaceC30295xm.C30296a.m4723f(this, c35340Py1);
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: i */
    public void mo4731i(ArSession arSession, Config config) {
        InterfaceC30295xm.C30296a.m4727b(this, arSession, config);
    }

    /* renamed from: j */
    public final Config.DepthMode m33370j() {
        Config.DepthMode depthMode = getConfig().getDepthMode();
        Intrinsics.checkNotNullExpressionValue(depthMode, "config.depthMode");
        return depthMode;
    }

    /* renamed from: k */
    public final Display m33369k() {
        Object value = this.f87997c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-display>(...)");
        return (Display) value;
    }

    /* renamed from: l */
    public final int m33368l() {
        return this.f88000f;
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: m */
    public void mo4730m(ArSession arSession) {
        InterfaceC30295xm.C30296a.m4726c(this, arSession);
    }

    /* renamed from: n */
    public final int m33367n() {
        return this.f87999e;
    }

    /* renamed from: o */
    public final Config.FocusMode m33366o() {
        Config.FocusMode focusMode = getConfig().getFocusMode();
        Intrinsics.checkNotNullExpressionValue(focusMode, "config.focusMode");
        return focusMode;
    }

    @Override // p000.VX0
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        close();
        super.onDestroy(owner);
    }

    @Override // p000.VX0
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        pause();
    }

    @Override // p000.VX0
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        resume();
    }

    /* renamed from: p */
    public final boolean m33365p() {
        Config config = getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "config");
        return C0204Am.m115309b(config);
    }

    @Override // com.google.p034ar.core.Session
    public void pause() {
        this.f88001g = false;
        super.pause();
    }

    /* renamed from: q */
    public final boolean m33364q() {
        Config config = getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "config");
        return C0204Am.m115308c(config);
    }

    @Override // p000.InterfaceC30295xm
    /* renamed from: r */
    public void mo4729r(C27991rm arFrame) {
        List<? extends Trackable> list;
        Intrinsics.checkNotNullParameter(arFrame, "arFrame");
        Collection allTrackables = getAllTrackables(Trackable.class);
        Intrinsics.checkNotNullExpressionValue(allTrackables, "getAllTrackables(Trackable::class.java)");
        list = CollectionsKt___CollectionsKt.toList(allTrackables);
        this.f88005k = list;
    }

    @Override // com.google.p034ar.core.Session
    public void resume() {
        this.f88001g = true;
        super.resume();
        setDisplayGeometry(this.f87998d, this.f87999e, this.f88000f);
        ArrayList<InterfaceC30295xm> arrayList = new ArrayList();
        for (InterfaceC32929Fq2 interfaceC32929Fq2 : this.f87996b.m83453q()) {
            if (!(interfaceC32929Fq2 instanceof InterfaceC30295xm)) {
                interfaceC32929Fq2 = null;
            }
            InterfaceC30295xm interfaceC30295xm = (InterfaceC30295xm) interfaceC32929Fq2;
            if (interfaceC30295xm != null) {
                arrayList.add(interfaceC30295xm);
            }
        }
        for (InterfaceC30295xm interfaceC30295xm2 : arrayList) {
            interfaceC30295xm2.mo4732c(this);
        }
    }

    /* renamed from: s */
    public final ArSceneLifecycle m33363s() {
        return this.f87996b;
    }

    @Override // com.google.p034ar.core.Session
    public void setDisplayGeometry(int i, int i2, int i3) {
        this.f87998d = i;
        this.f87999e = i2;
        this.f88000f = i3;
        if (this.f88001g) {
            super.setDisplayGeometry(i, i2, i3);
        }
    }

    /* renamed from: t */
    public final Config.LightEstimationMode m33362t() {
        Config.LightEstimationMode lightEstimationMode = getConfig().getLightEstimationMode();
        Intrinsics.checkNotNullExpressionValue(lightEstimationMode, "config.lightEstimationMode");
        return lightEstimationMode;
    }

    /* renamed from: u */
    public final boolean m33361u() {
        Config config = getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "config");
        return C0204Am.m115307d(config);
    }

    /* renamed from: v */
    public final Config.PlaneFindingMode m33360v() {
        Config.PlaneFindingMode planeFindingMode = getConfig().getPlaneFindingMode();
        Intrinsics.checkNotNullExpressionValue(planeFindingMode, "config.planeFindingMode");
        return planeFindingMode;
    }

    /* renamed from: w */
    public final void m33359w(boolean z) {
        if (m33373d() != z) {
            m33375a(new C23395a(z));
        }
    }

    /* renamed from: x */
    public final void m33358x(Config.DepthMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (m33370j() != value) {
            m33375a(new C23396b(value));
        }
    }

    /* renamed from: y */
    public final void m33357y(Config.FocusMode value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (m33366o() != value) {
            m33375a(new C23398d(value));
        }
    }

    /* renamed from: z */
    public final void m33356z(boolean z) {
        if (m33365p() != z) {
            m33375a(new C23399e(z));
        }
    }
}
