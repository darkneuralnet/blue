package p000;

import com.google.android.gms.common.internal.Preconditions;
/* renamed from: cb9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39236cb9 {

    /* renamed from: a */
    public final String f60936a;

    public C39236cb9(String str) {
        boolean z;
        String str2;
        boolean z2;
        String str3;
        boolean z3;
        String str4;
        Preconditions.checkNotNull(str, "Null FID");
        int length = str.length();
        if (length == 22) {
            z = true;
        } else {
            z = false;
        }
        if (str.length() != 0) {
            str2 = "Invalid FID: must be exactly 22 characters: ".concat(str);
        } else {
            str2 = new String("Invalid FID: must be exactly 22 characters: ");
        }
        Preconditions.checkArgument(z, str2);
        char charAt = str.charAt(0);
        if (charAt >= 'c' && charAt <= 'f') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (str.length() != 0) {
            str3 = "Invalid FID: must start with [c-f]: ".concat(str);
        } else {
            str3 = new String("Invalid FID: must start with [c-f]: ");
        }
        Preconditions.checkArgument(z2, str3);
        for (int i = 0; i < length; i++) {
            char charAt2 = str.charAt(i);
            if ((charAt2 >= '0' && charAt2 <= '9') || ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '-' || charAt2 == '_'))) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (str.length() != 0) {
                str4 = "Invalid FID: must contain only URL-safe base-64 characters: ".concat(str);
            } else {
                str4 = new String("Invalid FID: must contain only URL-safe base-64 characters: ");
            }
            Preconditions.checkArgument(z3, str4);
        }
        this.f60936a = str;
    }

    /* renamed from: a */
    public final String m61181a() {
        return this.f60936a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C39236cb9)) {
            return false;
        }
        return this.f60936a.equals(((C39236cb9) obj).f60936a);
    }

    public final int hashCode() {
        return this.f60936a.hashCode();
    }
}
