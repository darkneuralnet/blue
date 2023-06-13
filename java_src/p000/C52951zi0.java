package p000;

import android.content.Context;
import android.os.Process;
import java.util.HashSet;
import java.util.Set;
/* renamed from: zi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52951zi0 {

    /* renamed from: a */
    public final Context f122086a;

    /* renamed from: b */
    public final Set<String> f122087b = new HashSet();

    public C52951zi0(Context context) {
        this.f122086a = context;
    }

    /* renamed from: a */
    public boolean m534a(String[] strArr) {
        for (String str : strArr) {
            if (m533b(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m533b(String str) {
        if (str != null) {
            boolean z = true;
            if (this.f122087b.contains(str)) {
                return true;
            }
            if (this.f122086a.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                z = false;
            }
            if (z) {
                this.f122087b.add(str);
            }
            return z;
        }
        throw new IllegalArgumentException("permission is null");
    }
}
