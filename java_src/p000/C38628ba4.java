package p000;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;
/* renamed from: ba4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C38628ba4 extends BasicPermission {

    /* renamed from: b */
    public final String f57723b;

    /* renamed from: c */
    public final int f57724c;

    public C38628ba4(String str, String str2) {
        super(str, str2);
        this.f57723b = str2;
        this.f57724c = m64342a(str2);
    }

    /* renamed from: a */
    public final int m64342a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(C46876pS5.m19295e(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38628ba4) {
            C38628ba4 c38628ba4 = (C38628ba4) obj;
            return this.f57724c == c38628ba4.f57724c && getName().equals(c38628ba4.getName());
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public String getActions() {
        return this.f57723b;
    }

    public int hashCode() {
        return getName().hashCode() + this.f57724c;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public boolean implies(Permission permission) {
        if ((permission instanceof C38628ba4) && getName().equals(permission.getName())) {
            int i = this.f57724c;
            int i2 = ((C38628ba4) permission).f57724c;
            return (i & i2) == i2;
        }
        return false;
    }
}
