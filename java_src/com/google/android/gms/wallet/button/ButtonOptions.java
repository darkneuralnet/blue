package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ButtonOptionsCreator")
/* loaded from: classes6.dex */
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new C46141oC7();
    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getButtonType", m51606id = 1)

    /* renamed from: b */
    public int f72012b;
    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getButtonTheme", m51606id = 2)

    /* renamed from: c */
    public int f72013c;
    @SafeParcelable.Field(defaultValueUnchecked = "0", getter = "getCornerRadius", m51606id = 3)

    /* renamed from: d */
    public int f72014d;
    @SafeParcelable.Field(getter = "getAllowedPaymentMethods", m51606id = 4)

    /* renamed from: e */
    public String f72015e;

    /* renamed from: com.google.android.gms.wallet.button.ButtonOptions$a */
    /* loaded from: classes6.dex */
    public final class C17645a {
        public /* synthetic */ C17645a(C35400Qe7 c35400Qe7) {
        }

        /* renamed from: a */
        public C17645a m50515a(int i) {
            ButtonOptions.this.f72012b = i;
            return this;
        }
    }

    private ButtonOptions() {
    }

    /* renamed from: F */
    public static C17645a m50519F() {
        return new C17645a(null);
    }

    /* renamed from: E */
    public int m50520E() {
        return this.f72014d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (Objects.equal(Integer.valueOf(this.f72012b), Integer.valueOf(buttonOptions.f72012b)) && Objects.equal(Integer.valueOf(this.f72013c), Integer.valueOf(buttonOptions.f72013c)) && Objects.equal(Integer.valueOf(this.f72014d), Integer.valueOf(buttonOptions.f72014d)) && Objects.equal(this.f72015e, buttonOptions.f72015e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f72012b));
    }

    /* renamed from: s */
    public String m50518s() {
        return this.f72015e;
    }

    /* renamed from: u */
    public int m50517u() {
        return this.f72013c;
    }

    /* renamed from: v */
    public int m50516v() {
        return this.f72012b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, m50516v());
        SafeParcelWriter.writeInt(parcel, 2, m50517u());
        SafeParcelWriter.writeInt(parcel, 3, m50520E());
        SafeParcelWriter.writeString(parcel, 4, m50518s(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public ButtonOptions(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) String str) {
        this.f72012b = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        this.f72013c = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i2))).intValue();
        this.f72014d = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i3))).intValue();
        this.f72015e = (String) Preconditions.checkNotNull(str);
    }
}
