package com.fasterxml.jackson.core.sym;
/* loaded from: classes5.dex */
public final class Name3 extends Name {

    /* renamed from: q1 */
    private final int f69954q1;

    /* renamed from: q2 */
    private final int f69955q2;

    /* renamed from: q3 */
    private final int f69956q3;

    public Name3(String str, int i, int i2, int i3, int i4) {
        super(str, i);
        this.f69954q1 = i2;
        this.f69955q2 = i3;
        this.f69956q3 = i4;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2, int i3) {
        return this.f69954q1 == i && this.f69955q2 == i2 && this.f69956q3 == i3;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 3 && iArr[0] == this.f69954q1 && iArr[1] == this.f69955q2 && iArr[2] == this.f69956q3;
    }
}
