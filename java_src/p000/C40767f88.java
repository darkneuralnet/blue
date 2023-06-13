package p000;

import android.accounts.Account;
/* renamed from: f88  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40767f88 {

    /* renamed from: a */
    public static final Account f79536a = new Account("shared", "mobstore");

    /* renamed from: a */
    public static Account m41952a(String str) {
        boolean z;
        if ("shared".equals(str)) {
            return f79536a;
        }
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            z = true;
        } else {
            z = false;
        }
        C32368Df8.m110018a(z, "Malformed account", new Object[0]);
        return new Account(str.substring(indexOf + 1), str.substring(0, indexOf));
    }

    /* renamed from: b */
    public static String m41951b(Account account) {
        boolean z;
        boolean z2;
        boolean z3;
        if (account.type.indexOf(58) == -1) {
            z = true;
        } else {
            z = false;
        }
        C32368Df8.m110018a(z, "Account type contains ':'.", new Object[0]);
        if (account.type.indexOf(47) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32368Df8.m110018a(z2, "Account type contains '/'.", new Object[0]);
        if (account.name.indexOf(47) == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C32368Df8.m110018a(z3, "Account name contains '/'.", new Object[0]);
        if (f79536a.equals(account)) {
            return "shared";
        }
        String str = account.type;
        String str2 = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
