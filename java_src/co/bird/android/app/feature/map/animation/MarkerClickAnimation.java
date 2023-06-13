package co.bird.android.app.feature.map.animation;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.BounceInterpolator;
import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/app/feature/map/animation/MarkerClickAnimation;", "", "LfM2;", "marker", "", "run", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "anim", "Ljava/lang/Runnable;", "<init>", "()V", "BounceAnimation", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMarkerClickAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkerClickAnimation.kt\nco/bird/android/app/feature/map/animation/MarkerClickAnimation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/* loaded from: classes2.dex */
public final class MarkerClickAnimation {
    private Runnable anim;
    private final Handler handler = new Handler();

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/app/feature/map/animation/MarkerClickAnimation$BounceAnimation;", "Ljava/lang/Runnable;", "", "run", "", "begin", "J", "duration", "LfM2;", "marker", "LfM2;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/view/animation/Interpolator;", "interpolator", "Landroid/view/animation/Interpolator;", "<init>", "(JJLfM2;Landroid/os/Handler;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class BounceAnimation implements Runnable {
        private final long begin;
        private final long duration;
        private final Handler handler;
        private final Interpolator interpolator;
        private final C40889fM2 marker;

        public BounceAnimation(long j, long j2, C40889fM2 marker, Handler handler) {
            Intrinsics.checkNotNullParameter(marker, "marker");
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.begin = j;
            this.duration = j2;
            this.marker = marker;
            this.handler = handler;
            this.interpolator = new BounceInterpolator();
        }

        @Override // java.lang.Runnable
        public void run() {
            float max = Math.max(1 - this.interpolator.getInterpolation(((float) (SystemClock.uptimeMillis() - this.begin)) / ((float) this.duration)), 0.0f);
            this.marker.m41526h(0.5f, (1.2f * max) + 1.0f);
            if (max > 0.0d) {
                this.handler.postDelayed(this, 16L);
            }
        }
    }

    public final boolean run(C40889fM2 marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        long uptimeMillis = SystemClock.uptimeMillis();
        Runnable runnable = this.anim;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
        BounceAnimation bounceAnimation = new BounceAnimation(uptimeMillis, 600L, marker, this.handler);
        this.anim = bounceAnimation;
        this.handler.post(bounceAnimation);
        return false;
    }
}
