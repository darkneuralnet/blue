package com.google.p034ar.core;

import com.google.p034ar.core.annotations.UsedByNative;
import java.util.Locale;
@UsedByNative("session_jni_wrapper.cc")
/* renamed from: com.google.ar.core.Pose */
/* loaded from: classes6.dex */
public class Pose {
    public static final Pose IDENTITY = new Pose(new float[]{0.0f, 0.0f, 0.0f}, Quaternion.f73725a);
    @UsedByNative("session_jni_wrapper.cc")
    private final Quaternion quaternion;
    @UsedByNative("session_jni_wrapper.cc")
    private final float[] translation;

    @UsedByNative("session_jni_wrapper.cc")
    private Pose(float[] fArr, Quaternion quaternion) {
        this.translation = fArr;
        this.quaternion = quaternion;
    }

    public static Pose makeInterpolated(Pose pose, Pose pose2, float f) {
        if (f == 0.0f) {
            return pose;
        }
        if (f == 1.0f) {
            return pose2;
        }
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = (pose.translation[i] * (1.0f - f)) + (pose2.translation[i] * f);
        }
        return new Pose(fArr, Quaternion.m48439g(pose.quaternion, pose2.quaternion, f));
    }

    public static Pose makeRotation(float f, float f2, float f3, float f4) {
        return new Pose(IDENTITY.translation, new Quaternion(f, f2, f3, f4));
    }

    public static Pose makeTranslation(float f, float f2, float f3) {
        return new Pose(new float[]{f, f2, f3}, IDENTITY.quaternion);
    }

    public Pose compose(Pose pose) {
        Quaternion.m48437i(this.quaternion, pose.translation, 0, r0, 0);
        float f = r0[0];
        float[] fArr = this.translation;
        float[] fArr2 = {f + fArr[0], fArr2[1] + fArr[1], fArr2[2] + fArr[2]};
        return new Pose(fArr2, this.quaternion.m48441e(pose.quaternion));
    }

    public Pose extractRotation() {
        return new Pose(IDENTITY.translation, this.quaternion);
    }

    public Pose extractTranslation() {
        return new Pose(this.translation, IDENTITY.quaternion);
    }

    public Quaternion getQuaternion() {
        return this.quaternion;
    }

    public float[] getRotationQuaternion() {
        float[] fArr = new float[4];
        getRotationQuaternion(fArr, 0);
        return fArr;
    }

    public float[] getTransformedAxis(int i, float f) {
        float[] fArr = new float[3];
        getTransformedAxis(i, f, fArr, 0);
        return fArr;
    }

    public float[] getTranslation() {
        float[] fArr = new float[3];
        getTranslation(fArr, 0);
        return fArr;
    }

    public float[] getXAxis() {
        return getTransformedAxis(0, 1.0f);
    }

    public float[] getYAxis() {
        return getTransformedAxis(1, 1.0f);
    }

    public float[] getZAxis() {
        return getTransformedAxis(2, 1.0f);
    }

    public Pose inverse() {
        Quaternion m48440f = this.quaternion.m48440f();
        Quaternion.m48437i(m48440f, this.translation, 0, r0, 0);
        float[] fArr = {-fArr[0], -fArr[1], -fArr[2]};
        return new Pose(fArr, m48440f);
    }

    /* renamed from: qw */
    public float m48452qw() {
        return this.quaternion.m48445a();
    }

    /* renamed from: qx */
    public float m48451qx() {
        return this.quaternion.m48444b();
    }

    /* renamed from: qy */
    public float m48450qy() {
        return this.quaternion.m48443c();
    }

    /* renamed from: qz */
    public float m48449qz() {
        return this.quaternion.m48442d();
    }

    public float[] rotateVector(float[] fArr) {
        float[] fArr2 = new float[3];
        rotateVector(fArr, 0, fArr2, 0);
        return fArr2;
    }

    public void toMatrix(float[] fArr, int i) {
        this.quaternion.m48435k(fArr, i);
        float[] fArr2 = this.translation;
        fArr[i + 12] = fArr2[0];
        fArr[i + 13] = fArr2[1];
        fArr[i + 14] = fArr2[2];
        fArr[i + 3] = 0.0f;
        fArr[i + 7] = 0.0f;
        fArr[i + 11] = 0.0f;
        fArr[i + 15] = 1.0f;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "t:[x:%.3f, y:%.3f, z:%.3f], q:[x:%.2f, y:%.2f, z:%.2f, w:%.2f]", Float.valueOf(this.translation[0]), Float.valueOf(this.translation[1]), Float.valueOf(this.translation[2]), Float.valueOf(this.quaternion.m48444b()), Float.valueOf(this.quaternion.m48443c()), Float.valueOf(this.quaternion.m48442d()), Float.valueOf(this.quaternion.m48445a()));
    }

    public float[] transformPoint(float[] fArr) {
        float[] fArr2 = new float[3];
        transformPoint(fArr, 0, fArr2, 0);
        return fArr2;
    }

    /* renamed from: tx */
    public float m48448tx() {
        return this.translation[0];
    }

    /* renamed from: ty */
    public float m48447ty() {
        return this.translation[1];
    }

    /* renamed from: tz */
    public float m48446tz() {
        return this.translation[2];
    }

    private Pose(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.quaternion = new Quaternion(f4, f5, f6, f7);
        this.translation = new float[]{f, f2, f3};
    }

    public static Pose makeRotation(float[] fArr) {
        return makeRotation(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public static Pose makeTranslation(float[] fArr) {
        return makeTranslation(fArr[0], fArr[1], fArr[2]);
    }

    public void getRotationQuaternion(float[] fArr, int i) {
        this.quaternion.m48438h(fArr, i);
    }

    public void getTransformedAxis(int i, float f, float[] fArr, int i2) {
        Quaternion quaternion = this.quaternion;
        float[] fArr2 = {0.0f, 0.0f, 0.0f};
        fArr2[i] = f;
        Quaternion.m48437i(quaternion, fArr2, 0, fArr, i2);
    }

    public void getTranslation(float[] fArr, int i) {
        System.arraycopy(this.translation, 0, fArr, i, 3);
    }

    public void rotateVector(float[] fArr, int i, float[] fArr2, int i2) {
        Quaternion.m48437i(this.quaternion, fArr, i, fArr2, i2);
    }

    public void transformPoint(float[] fArr, int i, float[] fArr2, int i2) {
        rotateVector(fArr, i, fArr2, i2);
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = i3 + i2;
            fArr2[i4] = fArr2[i4] + this.translation[i3];
        }
    }

    public Pose(float[] fArr, float[] fArr2) {
        this(fArr[0], fArr[1], fArr[2], fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
    }
}
