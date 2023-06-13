package com.google.android.filament.utils;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bQ\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\tB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\nB-\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J1\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010V\u001a\u00020\u00052\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010X\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020ZH\u0086\u0002J\u0019\u0010X\u001a\u00020\u00032\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020ZH\u0086\u0002J!\u0010X\u001a\u00020\b2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020ZH\u0086\u0002J)\u0010X\u001a\u00020\u00002\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020Z2\u0006\u0010^\u001a\u00020ZH\u0086\u0002J\u0011\u0010X\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020_H\u0086\u0002J\u0019\u0010X\u001a\u00020\u00032\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_H\u0086\u0002J!\u0010X\u001a\u00020\b2\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010]\u001a\u00020_H\u0086\u0002J)\u0010X\u001a\u00020\u00002\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010]\u001a\u00020_2\u0006\u0010^\u001a\u00020_H\u0086\u0002J\t\u0010`\u001a\u00020_HÖ\u0001J\u0011\u0010a\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020_H\u0086\nJ1\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020Z2\u0006\u0010^\u001a\u00020Z2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J)\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010]\u001a\u00020Z2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020Z2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010b\u001a\u00020c2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010b\u001a\u00020c2\u0006\u0010Y\u001a\u00020_2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J)\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010]\u001a\u00020_2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J1\u0010b\u001a\u00020c2\u0006\u0010[\u001a\u00020_2\u0006\u0010\\\u001a\u00020_2\u0006\u0010]\u001a\u00020_2\u0006\u0010^\u001a\u00020_2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\t\u0010d\u001a\u00020eHÖ\u0001R&\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R&\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R&\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R&\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R&\u0010 \u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R&\u0010#\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010(\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\nR&\u00101\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010\u0013R&\u00104\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R&\u00107\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R&\u0010:\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010/\"\u0004\b<\u0010\nR&\u0010=\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0011\"\u0004\b?\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0011\"\u0004\bA\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010\u0013R&\u0010D\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010%\"\u0004\bF\u0010'R&\u0010G\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010*\"\u0004\bI\u0010,R&\u0010J\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010/\"\u0004\bL\u0010\nR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0011\"\u0004\bN\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0011\"\u0004\bP\u0010\u0013¨\u0006f"}, m28432d2 = {"Lcom/google/android/filament/utils/Bool4;", "", "v", "Lcom/google/android/filament/utils/Bool2;", "z", "", "w", "(Lcom/google/android/filament/utils/Bool2;ZZ)V", "Lcom/google/android/filament/utils/Bool3;", "(Lcom/google/android/filament/utils/Bool3;Z)V", "(Lcom/google/android/filament/utils/Bool4;)V", "x", "y", "(ZZZZ)V", "value", C17296a.f69688o, "getA", "()Z", "setA", "(Z)V", "b", "getB", "setB", "g", "getG", "setG", "p", "getP", "setP", "q", "getQ", "setQ", "r", "getR", "setR", "rg", "getRg", "()Lcom/google/android/filament/utils/Bool2;", "setRg", "(Lcom/google/android/filament/utils/Bool2;)V", "rgb", "getRgb", "()Lcom/google/android/filament/utils/Bool3;", "setRgb", "(Lcom/google/android/filament/utils/Bool3;)V", "rgba", "getRgba", "()Lcom/google/android/filament/utils/Bool4;", "setRgba", "s", "getS", "setS", "st", "getSt", "setSt", "stp", "getStp", "setStp", "stpq", "getStpq", "setStpq", "t", "getT", "setT", "getW", "setW", "getX", "setX", "xy", "getXy", "setXy", "xyz", "getXyz", "setXyz", "xyzw", "getXyzw", "setXyzw", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "get", "index", "Lcom/google/android/filament/utils/VectorComponent;", "index1", "index2", "index3", "index4", "", "hashCode", "invoke", "set", "", "toString", "", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class Bool4 {

    /* renamed from: w */
    private boolean f70129w;

    /* renamed from: x */
    private boolean f70130x;

    /* renamed from: y */
    private boolean f70131y;

    /* renamed from: z */
    private boolean f70132z;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VectorComponent.values().length];
            try {
                iArr[VectorComponent.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VectorComponent.R.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VectorComponent.S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VectorComponent.Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VectorComponent.G.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VectorComponent.T.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VectorComponent.Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VectorComponent.B.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VectorComponent.P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VectorComponent.W.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VectorComponent.A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VectorComponent.Q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Bool4() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ Bool4 copy$default(Bool4 bool4, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bool4.f70130x;
        }
        if ((i & 2) != 0) {
            z2 = bool4.f70131y;
        }
        if ((i & 4) != 0) {
            z3 = bool4.f70132z;
        }
        if ((i & 8) != 0) {
            z4 = bool4.f70129w;
        }
        return bool4.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.f70130x;
    }

    public final boolean component2() {
        return this.f70131y;
    }

    public final boolean component3() {
        return this.f70132z;
    }

    public final boolean component4() {
        return this.f70129w;
    }

    public final Bool4 copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new Bool4(z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Bool4) {
            Bool4 bool4 = (Bool4) obj;
            return this.f70130x == bool4.f70130x && this.f70131y == bool4.f70131y && this.f70132z == bool4.f70132z && this.f70129w == bool4.f70129w;
        }
        return false;
    }

    public final boolean get(VectorComponent index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f70130x;
            case 4:
            case 5:
            case 6:
                return this.f70131y;
            case 7:
            case 8:
            case 9:
                return this.f70132z;
            case 10:
            case 11:
            case 12:
                return this.f70129w;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean getA() {
        return getW();
    }

    public final boolean getB() {
        return getZ();
    }

    public final boolean getG() {
        return getY();
    }

    public final boolean getP() {
        return getZ();
    }

    public final boolean getQ() {
        return getW();
    }

    public final boolean getR() {
        return getX();
    }

    public final Bool2 getRg() {
        return new Bool2(getX(), getY());
    }

    public final Bool3 getRgb() {
        return new Bool3(getX(), getY(), getZ());
    }

    public final Bool4 getRgba() {
        return new Bool4(getX(), getY(), getZ(), getW());
    }

    public final boolean getS() {
        return getX();
    }

    public final Bool2 getSt() {
        return new Bool2(getX(), getY());
    }

    public final Bool3 getStp() {
        return new Bool3(getX(), getY(), getZ());
    }

    public final Bool4 getStpq() {
        return new Bool4(getX(), getY(), getZ(), getW());
    }

    public final boolean getT() {
        return getY();
    }

    public final boolean getW() {
        return this.f70129w;
    }

    public final boolean getX() {
        return this.f70130x;
    }

    public final Bool2 getXy() {
        return new Bool2(getX(), getY());
    }

    public final Bool3 getXyz() {
        return new Bool3(getX(), getY(), getZ());
    }

    public final Bool4 getXyzw() {
        return new Bool4(getX(), getY(), getZ(), getW());
    }

    public final boolean getY() {
        return this.f70131y;
    }

    public final boolean getZ() {
        return this.f70132z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.f70130x;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f70131y;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.f70132z;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.f70129w;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean invoke(int i) {
        return get(i - 1);
    }

    public final void set(int i, boolean z) {
        if (i == 0) {
            this.f70130x = z;
        } else if (i == 1) {
            this.f70131y = z;
        } else if (i == 2) {
            this.f70132z = z;
        } else if (i == 3) {
            this.f70129w = z;
        } else {
            throw new IllegalArgumentException("index must be in 0..3");
        }
    }

    public final void setA(boolean z) {
        setW(z);
    }

    public final void setB(boolean z) {
        setZ(z);
    }

    public final void setG(boolean z) {
        setY(z);
    }

    public final void setP(boolean z) {
        setZ(z);
    }

    public final void setQ(boolean z) {
        setW(z);
    }

    public final void setR(boolean z) {
        setX(z);
    }

    public final void setRg(Bool2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setRgb(Bool3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setRgba(Bool4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setS(boolean z) {
        setX(z);
    }

    public final void setSt(Bool2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setStp(Bool3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setStpq(Bool4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setT(boolean z) {
        setY(z);
    }

    public final void setW(boolean z) {
        this.f70129w = z;
    }

    public final void setX(boolean z) {
        this.f70130x = z;
    }

    public final void setXy(Bool2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setXyz(Bool3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setXyzw(Bool4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setY(boolean z) {
        this.f70131y = z;
    }

    public final void setZ(boolean z) {
        this.f70132z = z;
    }

    public String toString() {
        return "Bool4(x=" + this.f70130x + ", y=" + this.f70131y + ", z=" + this.f70132z + ", w=" + this.f70129w + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Bool4(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f70130x = z;
        this.f70131y = z2;
        this.f70132z = z3;
        this.f70129w = z4;
    }

    public final Bool2 get(VectorComponent index1, VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Bool2(get(index1), get(index2));
    }

    public final void set(int i, int i2, boolean z) {
        set(i, z);
        set(i2, z);
    }

    public /* synthetic */ Bool4(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }

    public final Bool3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new Bool3(get(index1), get(index2), get(index3));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool4(Bool2 v, boolean z, boolean z2) {
        this(v.getX(), v.getY(), z, z2);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final Bool4 get(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        return new Bool4(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(int i, int i2, int i3, boolean z) {
        set(i, z);
        set(i2, z);
        set(i3, z);
    }

    public /* synthetic */ Bool4(Bool2 bool2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool2, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public final boolean get(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return this.f70129w;
                    }
                    throw new IllegalArgumentException("index must be in 0..3");
                }
                return this.f70132z;
            }
            return this.f70131y;
        }
        return this.f70130x;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool4(Bool3 v, boolean z) {
        this(v.getX(), v.getY(), v.getZ(), z);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public /* synthetic */ Bool4(Bool3 bool3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool3, (i & 2) != 0 ? false : z);
    }

    public final void set(int i, int i2, int i3, int i4, boolean z) {
        set(i, z);
        set(i2, z);
        set(i3, z);
        set(i4, z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool4(Bool4 v) {
        this(v.f70130x, v.f70131y, v.f70132z, v.f70129w);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final Bool2 get(int i, int i2) {
        return new Bool2(get(i), get(i2));
    }

    public final Bool3 get(int i, int i2, int i3) {
        return new Bool3(get(i), get(i2), get(i3));
    }

    public final void set(VectorComponent index, boolean z) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f70130x = z;
                return;
            case 4:
            case 5:
            case 6:
                this.f70131y = z;
                return;
            case 7:
            case 8:
            case 9:
                this.f70132z = z;
                return;
            case 10:
            case 11:
            case 12:
                this.f70129w = z;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Bool4 get(int i, int i2, int i3, int i4) {
        return new Bool4(get(i), get(i2), get(i3), get(i4));
    }

    public final void set(VectorComponent index1, VectorComponent index2, boolean z) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        set(index1, z);
        set(index2, z);
    }

    public final void set(VectorComponent index1, VectorComponent index2, VectorComponent index3, boolean z) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        set(index1, z);
        set(index2, z);
        set(index3, z);
    }

    public final void set(VectorComponent index1, VectorComponent index2, VectorComponent index3, VectorComponent index4, boolean z) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        set(index1, z);
        set(index2, z);
        set(index3, z);
        set(index4, z);
    }
}
