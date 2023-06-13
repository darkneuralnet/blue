package com.google.android.filament.utils;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u001d\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0086\u0002J\u0019\u0010*\u001a\u00020\u00002\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0086\u0002J\u0011\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020/H\u0086\u0002J\u0019\u0010*\u001a\u00020\u00002\u0006\u0010-\u001a\u00020/2\u0006\u0010.\u001a\u00020/H\u0086\u0002J\t\u00100\u001a\u00020/HÖ\u0001J\u0011\u00101\u001a\u00020\u00052\u0006\u0010+\u001a\u00020/H\u0086\nJ!\u00102\u001a\u0002032\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u00102\u001a\u0002032\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\u0019\u00102\u001a\u0002032\u0006\u0010+\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J!\u00102\u001a\u0002032\u0006\u0010-\u001a\u00020/2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\u0002J\t\u00104\u001a\u000205HÖ\u0001R&\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR&\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0003R&\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR&\u0010\u0018\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0003R&\u0010\u001b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR&\u0010 \u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0003R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\r¨\u00066"}, m28432d2 = {"Lcom/google/android/filament/utils/Bool2;", "", "v", "(Lcom/google/android/filament/utils/Bool2;)V", "x", "", "y", "(ZZ)V", "value", "g", "getG", "()Z", "setG", "(Z)V", "r", "getR", "setR", "rg", "getRg", "()Lcom/google/android/filament/utils/Bool2;", "setRg", "s", "getS", "setS", "st", "getSt", "setSt", "t", "getT", "setT", "getX", "setX", "xy", "getXy", "setXy", "getY", "setY", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "get", "index", "Lcom/google/android/filament/utils/VectorComponent;", "index1", "index2", "", "hashCode", "invoke", "set", "", "toString", "", "filament-utils-android_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes5.dex */
public final class Bool2 {

    /* renamed from: x */
    private boolean f70124x;

    /* renamed from: y */
    private boolean f70125y;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Bool2() {
        this(false, false, 3, null);
    }

    public static /* synthetic */ Bool2 copy$default(Bool2 bool2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bool2.f70124x;
        }
        if ((i & 2) != 0) {
            z2 = bool2.f70125y;
        }
        return bool2.copy(z, z2);
    }

    public final boolean component1() {
        return this.f70124x;
    }

    public final boolean component2() {
        return this.f70125y;
    }

    public final Bool2 copy(boolean z, boolean z2) {
        return new Bool2(z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Bool2) {
            Bool2 bool2 = (Bool2) obj;
            return this.f70124x == bool2.f70124x && this.f70125y == bool2.f70125y;
        }
        return false;
    }

    public final boolean get(VectorComponent index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.f70124x;
            case 4:
            case 5:
            case 6:
                return this.f70125y;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final boolean getG() {
        return getY();
    }

    public final boolean getR() {
        return getX();
    }

    public final Bool2 getRg() {
        return new Bool2(getX(), getY());
    }

    public final boolean getS() {
        return getX();
    }

    public final Bool2 getSt() {
        return new Bool2(getX(), getY());
    }

    public final boolean getT() {
        return getY();
    }

    public final boolean getX() {
        return this.f70124x;
    }

    public final Bool2 getXy() {
        return new Bool2(getX(), getY());
    }

    public final boolean getY() {
        return this.f70125y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f70124x;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f70125y;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean invoke(int i) {
        return get(i - 1);
    }

    public final void set(int i, boolean z) {
        if (i == 0) {
            this.f70124x = z;
        } else if (i == 1) {
            this.f70125y = z;
        } else {
            throw new IllegalArgumentException("index must be in 0..1");
        }
    }

    public final void setG(boolean z) {
        setY(z);
    }

    public final void setR(boolean z) {
        setX(z);
    }

    public final void setRg(Bool2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setS(boolean z) {
        setX(z);
    }

    public final void setSt(Bool2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setT(boolean z) {
        setY(z);
    }

    public final void setX(boolean z) {
        this.f70124x = z;
    }

    public final void setXy(Bool2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setY(boolean z) {
        this.f70125y = z;
    }

    public String toString() {
        return "Bool2(x=" + this.f70124x + ", y=" + this.f70125y + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public Bool2(boolean z, boolean z2) {
        this.f70124x = z;
        this.f70125y = z2;
    }

    public /* synthetic */ Bool2(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Bool2(Bool2 v) {
        this(v.f70124x, v.f70125y);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final void set(int i, int i2, boolean z) {
        set(i, z);
        set(i2, z);
    }

    public final Bool2 get(VectorComponent index1, VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Bool2(get(index1), get(index2));
    }

    public final boolean get(int i) {
        if (i != 0) {
            if (i == 1) {
                return this.f70125y;
            }
            throw new IllegalArgumentException("index must be in 0..1");
        }
        return this.f70124x;
    }

    public final void set(VectorComponent index, boolean z) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f70124x = z;
                return;
            case 4:
            case 5:
            case 6:
                this.f70125y = z;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final Bool2 get(int i, int i2) {
        return new Bool2(get(i), get(i2));
    }

    public final void set(VectorComponent index1, VectorComponent index2, boolean z) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        set(index1, z);
        set(index2, z);
    }
}
