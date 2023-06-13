package com.uber.autodispose.android.internal;

import android.os.Looper;
import com.uber.autodispose.android.AutoDisposeAndroidPlugins;
import com.uber.autodispose.android.internal.AutoDisposeAndroidUtil;
import io.reactivex.functions.InterfaceC23482e;
/* loaded from: classes7.dex */
public class AutoDisposeAndroidUtil {

    /* renamed from: a */
    public static final InterfaceC23482e f75563a = new InterfaceC23482e() { // from class: Mq
        @Override // io.reactivex.functions.InterfaceC23482e
        /* renamed from: a */
        public final boolean mo33005a() {
            boolean m45199c;
            m45199c = AutoDisposeAndroidUtil.m45199c();
            return m45199c;
        }
    };

    private AutoDisposeAndroidUtil() {
    }

    /* renamed from: b */
    public static boolean m45200b() {
        return AutoDisposeAndroidPlugins.m45203a(f75563a);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m45199c() throws Exception {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
