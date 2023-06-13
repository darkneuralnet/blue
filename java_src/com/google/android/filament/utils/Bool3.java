package com.google.android.filament.utils;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0007B#\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J'\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010?\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020CH\u0086\u0002J\u0019\u0010A\u001a\u00020\u00032\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0086\u0002J!\u0010A\u001a\u00020\u00002\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u00020CH\u0086\u0002J\u0011\u0010A\u001a\u00020\u00052\u0006\u0010B\u001a\u00020GH\u0086\u0002J\u0019\u0010A\u001a\u00020\u00032\u0006\u0010D\u001a\u00020G2\u0006\u0010E\u001a\u00020GH\u0086\u0002J!\u0010A\u001a\u00020\u00002\u0006\u0010D\u001a\u00020G2\u0006\u0010E\u001a\u00020G2\u0006\u0010F\u001a\u00020GH\u0086\u0002J\t\u0010H\u001a\u00020GHÖ\u0001J\u0011\u0010I\u001a\u00020\u00052\u0006\u0010B\u001a\u00020GH\u0086\nJ)\u0010J\u001a\u00020K2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u00020C2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010J\u001a\u00020K2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010J\u001a\u00020K2\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u0010J\u001a\u00020K2\u0006\u0010B\u001a\u00020G2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u0010J\u001a\u00020K2\u0006\u0010D\u001a\u00020G2\u0006\u0010E\u001a\u00020G2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J)\u0010J\u001a\u00020K2\u0006\u0010D\u001a\u00020G2\u0006\u0010E\u001a\u00020G2\u0006\u0010F\u001a\u00020G2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\t\u0010L\u001a\u00020MHÖ\u0001R&\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R&\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R&\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\u0007R&\u0010#\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R&\u0010&\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR&\u0010)\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010\u0007R&\u0010,\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0010R&\u00101\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR&\u00104\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010!\"\u0004\b6\u0010\u0007R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000e\"\u0004\b8\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000e\"\u0004\b:\u0010\u0010¨\u0006N"}, m28432d2 = {"Lcom/google/android/filament/utils/Bool3;", "", "v", "Lcom/google/android/filament/utils/Bool2;", "z", "", "(Lcom/google/android/filament/utils/Bool2;Z)V", "(Lcom/google/android/filament/utils/Bool3;)V", "x", "y", "(ZZZ)V", "value", "b", "getB", "()Z", "setB", "(Z)V", "g", "getG", "setG", "p", "getP", "setP", "r", "getR", "setR", "rg", "getRg", "()Lcom/google/android/filament/utils/Bool2;", "setRg", "(Lcom/google/android/filament/utils/Bool2;)V", "rgb", "getRgb", "()Lcom/google/android/filament/utils/Bool3;", "setRgb", "s", "getS", "setS", "st", "getSt", "setSt", "stp", "getStp", "setStp", "t", "getT", "setT", "getX", "setX", "xy", "getXy", "setXy", "xyz", "getXyz", "setXyz", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "get", "index", "Lcom/google/android/filament/utils/VectorComponent;", "index1", "index2", "index3", "", "hashCode", "invoke", "set", "", "toString", "", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class Bool3 {

    /* renamed from: x */
    private boolean f70126x;

    /* renamed from: y */
    private boolean f70127y;

    /* renamed from: z */
    private boolean f70128z;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Bool3() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ Bool3 copy$default(Bool3 bool3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bool3.f70126x;
        }
        if ((i & 2) != 0) {
            z2 = bool3.f70127y;
        }
        if ((i & 4) != 0) {
            z3 = bool3.f70128z;
        }
        return bool3.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.f70126x;
    }

    public final boolean component2() {
        return this.f70127y;
    }

    public final boolean component3() {
        return this.f70128z;
    }

    public final Bool3 copy(boolean z, boolean z2, boolean z3) {
        return new Bool3(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Bool3) {
            Bool3 bool3 = (Bool3) obj;
            return this.f70126x == bool3.f70126x && this.f70127y == bool3.f70127y && this.f70128z == bool3.f70128z;
        }
        return false;
    }

    public final boolean get(VectorComponent index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f70126x;
            case 4:
            case 5:
            case 6:
                return this.f70127y;
            case 7:
            case 8:
            case 9:
                return this.f70128z;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
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

    public final boolean getR() {
        return getX();
    }

    public final Bool2 getRg() {
        return new Bool2(getX(), getY());
    }

    public final Bool3 getRgb() {
        return new Bool3(getX(), getY(), getZ());
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

    public final boolean getT() {
        return getY();
    }

    public final boolean getX() {
        return this.f70126x;
    }

    public final Bool2 getXy() {
        return new Bool2(getX(), getY());
    }

    public final Bool3 getXyz() {
        return new Bool3(getX(), getY(), getZ());
    }

    public final boolean getY() {
        return this.f70127y;
    }

    public final boolean getZ() {
        return this.f70128z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f70126x;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f70127y;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        boolean z2 = this.f70128z;
        return i3 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean invoke(int i) {
        return get(i - 1);
    }

    public final void set(int i, boolean z) {
        if (i == 0) {
            this.f70126x = z;
        } else if (i == 1) {
            this.f70127y = z;
        } else if (i == 2) {
            this.f70128z = z;
        } else {
            throw new IllegalArgumentException("index must be in 0..2");
        }
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

    public final void setT(boolean z) {
        setY(z);
    }

    public final void setX(boolean z) {
        this.f70126x = z;
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

    public final void setY(boolean z) {
        this.f70127y = z;
    }

    public final void setZ(boolean z) {
        this.f70128z = z;
    }

    public String toString() {
        return "Bool3(x=" + this.f70126x + ", y=" + this.f70127y + ", z=" + this.f70128z + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Bool3(boolean z, boolean z2, boolean z3) {
        this.f70126x = z;
        this.f70127y = z2;
        this.f70128z = z3;
    }

    public /* synthetic */ Bool3(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool3(Bool2 v, boolean z) {
        this(v.getX(), v.getY(), z);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public /* synthetic */ Bool3(Bool2 bool2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool2, (i & 2) != 0 ? false : z);
    }

    public final void set(int i, int i2, boolean z) {
        set(i, z);
        set(i2, z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool3(Bool3 v) {
        this(v.f70126x, v.f70127y, v.f70128z);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final Bool2 get(VectorComponent index1, VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Bool2(get(index1), get(index2));
    }

    public final Bool3 get(VectorComponent index1, VectorComponent index2, VectorComponent index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new Bool3(get(index1), get(index2), get(index3));
    }

    public final void set(int i, int i2, int i3, boolean z) {
        set(i, z);
        set(i2, z);
        set(i3, z);
    }

    public final boolean get(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return this.f70128z;
                }
                throw new IllegalArgumentException("index must be in 0..2");
            }
            return this.f70127y;
        }
        return this.f70126x;
    }

    public final void set(VectorComponent index, boolean z) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f70126x = z;
                return;
            case 4:
            case 5:
            case 6:
                this.f70127y = z;
                return;
            case 7:
            case 8:
            case 9:
                this.f70128z = z;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final Bool2 get(int i, int i2) {
        return new Bool2(get(i), get(i2));
    }

    public final Bool3 get(int i, int i2, int i3) {
        return new Bool3(get(i), get(i2), get(i3));
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
}
