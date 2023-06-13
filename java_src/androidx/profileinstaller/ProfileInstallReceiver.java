package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.C11817c;
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    /* loaded from: classes.dex */
    public class C11810a implements C11817c.InterfaceC11820c {
        public C11810a() {
        }

        @Override // androidx.profileinstaller.C11817c.InterfaceC11820c
        /* renamed from: a */
        public void mo66787a(int i, Object obj) {
            C11817c.f55135b.mo66787a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.C11817c.InterfaceC11820c
        /* renamed from: b */
        public void mo66786b(int i, Object obj) {
            C11817c.f55135b.mo66786b(i, obj);
        }
    }

    /* renamed from: a */
    public static void m66831a(C11817c.InterfaceC11820c interfaceC11820c) {
        Process.sendSignal(Process.myPid(), 10);
        interfaceC11820c.mo66787a(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            C11817c.m66789k(context, new ExecutorC49647u74(), new C11810a(), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    C11817c.m66788l(context, new ExecutorC49647u74(), new C11810a());
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    C11817c.m66797c(context, new ExecutorC49647u74(), new C11810a());
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m66831a(new C11810a());
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C11810a c11810a = new C11810a();
            if ("DROP_SHADER_CACHE".equals(string2)) {
                C11814a.m66815b(context, c11810a);
            } else {
                c11810a.mo66787a(16, null);
            }
        }
    }
}
