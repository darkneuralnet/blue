package com.google.android.filament.utils;

import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.common.ConstantsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m28432d2 = {"Lcom/google/android/filament/utils/GestureDetector;", "", "view", "Landroid/view/View;", "manipulator", "Lcom/google/android/filament/utils/Manipulator;", "(Landroid/view/View;Lcom/google/android/filament/utils/Manipulator;)V", "currentGesture", "Lcom/google/android/filament/utils/GestureDetector$Gesture;", "kGestureConfidenceCount", "", "kPanConfidenceDistance", "kZoomConfidenceDistance", "kZoomSpeed", "", "previousTouch", "Lcom/google/android/filament/utils/GestureDetector$TouchPair;", "tentativeOrbitEvents", "Ljava/util/ArrayList;", "tentativePanEvents", "tentativeZoomEvents", "endGesture", "", "isOrbitGesture", "", "isPanGesture", "isZoomGesture", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "Gesture", "TouchPair", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/Float2\n*L\n1#1,155:1\n572#2:156\n570#2:158\n129#3:157\n*S KotlinDebug\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector\n*L\n143#1:156\n143#1:158\n143#1:157\n*E\n"})
/* loaded from: classes5.dex */
public final class GestureDetector {
    private Gesture currentGesture;
    private final int kGestureConfidenceCount;
    private final int kPanConfidenceDistance;
    private final int kZoomConfidenceDistance;
    private final float kZoomSpeed;
    private final Manipulator manipulator;
    private TouchPair previousTouch;
    private final ArrayList<TouchPair> tentativeOrbitEvents;
    private final ArrayList<TouchPair> tentativePanEvents;
    private final ArrayList<TouchPair> tentativeZoomEvents;
    private final View view;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/google/android/filament/utils/GestureDetector$Gesture;", "", "(Ljava/lang/String;I)V", ConstantsKt.NONE, "ORBIT", "PAN", "ZOOM", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public enum Gesture {
        NONE,
        ORBIT,
        PAN,
        ZOOM
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J'\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0011\u0010\u001f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\u000e¨\u0006+"}, m28432d2 = {"Lcom/google/android/filament/utils/GestureDetector$TouchPair;", "", "()V", "me", "Landroid/view/MotionEvent;", "height", "", "(Landroid/view/MotionEvent;I)V", "pt0", "Lcom/google/android/filament/utils/Float2;", "pt1", "count", "(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V", "getCount", "()I", "setCount", "(I)V", "midpoint", "getMidpoint", "()Lcom/google/android/filament/utils/Float2;", "getPt0", "setPt0", "(Lcom/google/android/filament/utils/Float2;)V", "getPt1", "setPt1", "separation", "", "getSeparation", "()F", "x", "getX", "y", "getY", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector$TouchPair\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/Float2\n+ 4 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,155:1\n572#2:156\n570#2:158\n601#2,2:159\n603#2:162\n129#3:157\n35#4:161\n*S KotlinDebug\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector$TouchPair\n*L\n44#1:156\n44#1:158\n45#1:159,2\n45#1:162\n44#1:157\n45#1:161\n*E\n"})
    /* loaded from: classes5.dex */
    public static final class TouchPair {
        private int count;
        private Float2 pt0;
        private Float2 pt1;

        public TouchPair(Float2 pt0, Float2 pt1, int i) {
            Intrinsics.checkNotNullParameter(pt0, "pt0");
            Intrinsics.checkNotNullParameter(pt1, "pt1");
            this.pt0 = pt0;
            this.pt1 = pt1;
            this.count = i;
        }

        public static /* synthetic */ TouchPair copy$default(TouchPair touchPair, Float2 float2, Float2 float22, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                float2 = touchPair.pt0;
            }
            if ((i2 & 2) != 0) {
                float22 = touchPair.pt1;
            }
            if ((i2 & 4) != 0) {
                i = touchPair.count;
            }
            return touchPair.copy(float2, float22, i);
        }

        public final Float2 component1() {
            return this.pt0;
        }

        public final Float2 component2() {
            return this.pt1;
        }

        public final int component3() {
            return this.count;
        }

        public final TouchPair copy(Float2 pt0, Float2 pt1, int i) {
            Intrinsics.checkNotNullParameter(pt0, "pt0");
            Intrinsics.checkNotNullParameter(pt1, "pt1");
            return new TouchPair(pt0, pt1, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TouchPair) {
                TouchPair touchPair = (TouchPair) obj;
                return Intrinsics.areEqual(this.pt0, touchPair.pt0) && Intrinsics.areEqual(this.pt1, touchPair.pt1) && this.count == touchPair.count;
            }
            return false;
        }

        public final int getCount() {
            return this.count;
        }

        public final Float2 getMidpoint() {
            Float2 float2 = this.pt0;
            Float2 float22 = this.pt1;
            return new Float2((float2.getX() * 0.5f) + (float22.getX() * 0.5f), (float2.getY() * 0.5f) + (float22.getY() * 0.5f));
        }

        public final Float2 getPt0() {
            return this.pt0;
        }

        public final Float2 getPt1() {
            return this.pt1;
        }

        public final float getSeparation() {
            Float2 float2 = this.pt0;
            Float2 float22 = this.pt1;
            Float2 float23 = new Float2(float2.getX() - float22.getX(), float2.getY() - float22.getY());
            return (float) Math.sqrt((float23.getX() * float23.getX()) + (float23.getY() * float23.getY()));
        }

        public final int getX() {
            return (int) getMidpoint().getX();
        }

        public final int getY() {
            return (int) getMidpoint().getY();
        }

        public int hashCode() {
            return (((this.pt0.hashCode() * 31) + this.pt1.hashCode()) * 31) + Integer.hashCode(this.count);
        }

        public final void setCount(int i) {
            this.count = i;
        }

        public final void setPt0(Float2 float2) {
            Intrinsics.checkNotNullParameter(float2, "<set-?>");
            this.pt0 = float2;
        }

        public final void setPt1(Float2 float2) {
            Intrinsics.checkNotNullParameter(float2, "<set-?>");
            this.pt1 = float2;
        }

        public String toString() {
            return "TouchPair(pt0=" + this.pt0 + ", pt1=" + this.pt1 + ", count=" + this.count + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public TouchPair() {
            this(new Float2(0.0f), new Float2(0.0f), 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TouchPair(MotionEvent me2, int i) {
            this();
            Intrinsics.checkNotNullParameter(me2, "me");
            if (me2.getPointerCount() >= 1) {
                Float2 float2 = new Float2(me2.getX(0), i - me2.getY(0));
                this.pt0 = float2;
                this.pt1 = float2;
                this.count++;
            }
            if (me2.getPointerCount() >= 2) {
                this.pt1 = new Float2(me2.getX(1), i - me2.getY(1));
                this.count++;
            }
        }
    }

    public GestureDetector(View view, Manipulator manipulator) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(manipulator, "manipulator");
        this.view = view;
        this.manipulator = manipulator;
        this.currentGesture = Gesture.NONE;
        this.previousTouch = new TouchPair();
        this.tentativePanEvents = new ArrayList<>();
        this.tentativeOrbitEvents = new ArrayList<>();
        this.tentativeZoomEvents = new ArrayList<>();
        this.kGestureConfidenceCount = 2;
        this.kPanConfidenceDistance = 4;
        this.kZoomConfidenceDistance = 10;
        this.kZoomSpeed = 0.1f;
    }

    private final void endGesture() {
        this.tentativePanEvents.clear();
        this.tentativeOrbitEvents.clear();
        this.tentativeZoomEvents.clear();
        this.currentGesture = Gesture.NONE;
        this.manipulator.grabEnd();
    }

    private final boolean isOrbitGesture() {
        return this.tentativeOrbitEvents.size() > this.kGestureConfidenceCount;
    }

    private final boolean isPanGesture() {
        Object first;
        Object last;
        if (this.tentativePanEvents.size() > this.kGestureConfidenceCount) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.tentativePanEvents);
            Float2 midpoint = ((TouchPair) first).getMidpoint();
            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.tentativePanEvents);
            Float2 midpoint2 = ((TouchPair) last).getMidpoint();
            Float2 float2 = new Float2(midpoint.getX() - midpoint2.getX(), midpoint.getY() - midpoint2.getY());
            if (((float) Math.sqrt((float2.getX() * float2.getX()) + (float2.getY() * float2.getY()))) <= this.kPanConfidenceDistance) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean isZoomGesture() {
        Object first;
        Object last;
        if (this.tentativeZoomEvents.size() > this.kGestureConfidenceCount) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.tentativeZoomEvents);
            float separation = ((TouchPair) first).getSeparation();
            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.tentativeZoomEvents);
            if (Math.abs(((TouchPair) last).getSeparation() - separation) <= this.kZoomConfidenceDistance) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        TouchPair touchPair = new TouchPair(event, this.view.getHeight());
        int actionMasked = event.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return;
                }
            } else if ((event.getPointerCount() != 1 && this.currentGesture == Gesture.ORBIT) || ((event.getPointerCount() != 2 && this.currentGesture == Gesture.PAN) || (event.getPointerCount() != 2 && this.currentGesture == Gesture.ZOOM))) {
                endGesture();
                return;
            } else {
                Gesture gesture = this.currentGesture;
                Gesture gesture2 = Gesture.ZOOM;
                if (gesture == gesture2) {
                    this.manipulator.scroll(touchPair.getX(), touchPair.getY(), (this.previousTouch.getSeparation() - touchPair.getSeparation()) * this.kZoomSpeed);
                    this.previousTouch = touchPair;
                    return;
                } else if (gesture != Gesture.NONE) {
                    this.manipulator.grabUpdate(touchPair.getX(), touchPair.getY());
                    return;
                } else {
                    if (event.getPointerCount() == 1) {
                        this.tentativeOrbitEvents.add(touchPair);
                    }
                    if (event.getPointerCount() == 2) {
                        this.tentativePanEvents.add(touchPair);
                        this.tentativeZoomEvents.add(touchPair);
                    }
                    if (isOrbitGesture()) {
                        this.manipulator.grabBegin(touchPair.getX(), touchPair.getY(), false);
                        this.currentGesture = Gesture.ORBIT;
                        return;
                    } else if (isZoomGesture()) {
                        this.currentGesture = gesture2;
                        this.previousTouch = touchPair;
                        return;
                    } else if (isPanGesture()) {
                        this.manipulator.grabBegin(touchPair.getX(), touchPair.getY(), true);
                        this.currentGesture = Gesture.PAN;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        endGesture();
    }
}
