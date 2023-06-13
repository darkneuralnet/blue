package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
@KeepForSdk
/* renamed from: Um1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36402Um1 {

    @KeepForSdk
    /* renamed from: Um1$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC8441a {
    }

    @KeepForSdk
    /* renamed from: a */
    void m80885a(String str, String str2) throws IOException;

    @KeepForSdk
    /* renamed from: b */
    void m80884b(InterfaceC8441a interfaceC8441a);

    @KeepForSdk
    /* renamed from: c */
    Task<String> m80883c();

    @KeepForSdk
    String getToken();
}
