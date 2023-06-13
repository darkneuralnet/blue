package com.google.android.filament.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m28432d2 = {"pointAt", "Lcom/google/android/filament/utils/Float3;", "r", "Lcom/google/android/filament/utils/Ray;", "t", "", "filament-utils-android_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nRay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ray.kt\ncom/google/android/filament/utils/RayKt\n+ 2 Vector.kt\ncom/google/android/filament/utils/Float3\n*L\n1#1,22:1\n292#2,9:23\n*S KotlinDebug\n*F\n+ 1 Ray.kt\ncom/google/android/filament/utils/RayKt\n*L\n21#1:23,9\n*E\n"})
/* loaded from: classes5.dex */
public final class RayKt {
    public static final Float3 pointAt(Ray r, float f) {
        Intrinsics.checkNotNullParameter(r, "r");
        Float3 origin = r.getOrigin();
        Float3 direction = r.getDirection();
        Float3 float3 = new Float3(direction.getX() * f, direction.getY() * f, direction.getZ() * f);
        return new Float3(origin.getX() + float3.getX(), origin.getY() + float3.getY(), origin.getZ() + float3.getZ());
    }
}
