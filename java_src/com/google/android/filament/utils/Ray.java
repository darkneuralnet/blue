package com.google.android.filament.utils;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m28432d2 = {"Lcom/google/android/filament/utils/Ray;", "", AnalyticsRequestV2.HEADER_ORIGIN, "Lcom/google/android/filament/utils/Float3;", "direction", "(Lcom/google/android/filament/utils/Float3;Lcom/google/android/filament/utils/Float3;)V", "getDirection", "()Lcom/google/android/filament/utils/Float3;", "setDirection", "(Lcom/google/android/filament/utils/Float3;)V", "getOrigin", "setOrigin", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class Ray {
    private Float3 direction;
    private Float3 origin;

    public Ray(Float3 origin, Float3 direction) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.origin = origin;
        this.direction = direction;
    }

    public static /* synthetic */ Ray copy$default(Ray ray, Float3 float3, Float3 float32, int i, Object obj) {
        if ((i & 1) != 0) {
            float3 = ray.origin;
        }
        if ((i & 2) != 0) {
            float32 = ray.direction;
        }
        return ray.copy(float3, float32);
    }

    public final Float3 component1() {
        return this.origin;
    }

    public final Float3 component2() {
        return this.direction;
    }

    public final Ray copy(Float3 origin, Float3 direction) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new Ray(origin, direction);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Ray) {
            Ray ray = (Ray) obj;
            return Intrinsics.areEqual(this.origin, ray.origin) && Intrinsics.areEqual(this.direction, ray.direction);
        }
        return false;
    }

    public final Float3 getDirection() {
        return this.direction;
    }

    public final Float3 getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return (this.origin.hashCode() * 31) + this.direction.hashCode();
    }

    public final void setDirection(Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.direction = float3;
    }

    public final void setOrigin(Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.origin = float3;
    }

    public String toString() {
        return "Ray(origin=" + this.origin + ", direction=" + this.direction + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ Ray(Float3 float3, Float3 float32, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Float3(0.0f, 0.0f, 0.0f, 7, null) : float3, float32);
    }
}
