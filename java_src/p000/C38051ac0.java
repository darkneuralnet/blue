package p000;
/* renamed from: ac0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38051ac0 {
    private C38051ac0() {
    }

    /* renamed from: a */
    public static int m71100a(int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = ((i2 - i) + 360) % 360;
        } else {
            i3 = (i2 + i) % 360;
        }
        if (C33928Jx2.m99528f("CameraOrientationUtil")) {
            C33928Jx2.m99533a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)));
        }
        return i3;
    }

    /* renamed from: b */
    public static int m71099b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return 270;
                    }
                    throw new IllegalArgumentException("Unsupported surface rotation: " + i);
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }
}
