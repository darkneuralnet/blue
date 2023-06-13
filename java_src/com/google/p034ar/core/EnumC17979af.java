package com.google.p034ar.core;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.af */
/* loaded from: classes6.dex */
public enum EnumC17979af {
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, null),
    PLANE(1095893249, Plane.class),
    POINT(1095893250, Point.class),
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    FACE(1095893253, AugmentedFace.class),
    EARTH(1095893257, Earth.class),
    DEPTH_POINT(1095893265, DepthPoint.class),
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class);
    

    /* renamed from: j */
    final int f73785j;

    /* renamed from: l */
    private final Class f73786l;

    EnumC17979af(int i, Class cls) {
        this.f73785j = i;
        this.f73786l = cls;
    }

    /* renamed from: a */
    public static EnumC17979af m48434a(Class cls) {
        EnumC17979af[] values;
        for (EnumC17979af enumC17979af : values()) {
            Class cls2 = enumC17979af.f73786l;
            if (cls2 != null && cls2.equals(cls)) {
                return enumC17979af;
            }
        }
        return UNKNOWN_TO_JAVA;
    }
}
