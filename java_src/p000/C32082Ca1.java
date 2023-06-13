package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Collections;
import java.util.Set;
/* renamed from: Ca1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32082Ca1 {

    /* renamed from: Ca1$a */
    /* loaded from: classes.dex */
    public static class C1070a {
        private C1070a() {
        }

        /* renamed from: a */
        public static Set<int[]> m112104a() {
            return C1071b.m112103a();
        }
    }

    /* renamed from: Ca1$b */
    /* loaded from: classes.dex */
    public static class C1071b {
        private C1071b() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: a */
        public static Set<int[]> m112103a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set<int[]> set = (Set) invoke;
                for (int[] iArr : set) {
                    if (!(iArr instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    private C32082Ca1() {
    }

    /* renamed from: a */
    public static Set<int[]> m112105a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1070a.m112104a();
        }
        return C1071b.m112103a();
    }
}
