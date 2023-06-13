package p000;

import android.bluetooth.BluetoothDevice;
import io.reactivex.AbstractC23437E;
import java.util.concurrent.TimeUnit;
import p000.InterfaceC44023ke5;
/* renamed from: I21 */
/* loaded from: classes6.dex */
public abstract class I21 {

    /* renamed from: I21$a */
    /* loaded from: classes6.dex */
    public class C3317a implements InterfaceC51925xy0 {

        /* renamed from: a */
        public final /* synthetic */ C0058AG f14366a;

        public C3317a(C0058AG c0058ag) {
            this.f14366a = c0058ag;
        }

        @Override // p000.InterfaceC51925xy0
        /* renamed from: a */
        public void mo4373a(InterfaceC44023ke5.EnumC25197a enumC25197a) {
            this.f14366a.accept(enumC25197a);
        }
    }

    /* renamed from: a */
    public static BluetoothDevice m103046a(String str, C46978pd5 c46978pd5) {
        return c46978pd5.m19050a(str);
    }

    /* renamed from: b */
    public static InterfaceC51925xy0 m103045b(C0058AG<InterfaceC44023ke5.EnumC25197a> c0058ag) {
        return new C3317a(c0058ag);
    }

    /* renamed from: c */
    public static C0058AG<InterfaceC44023ke5.EnumC25197a> m103044c() {
        return C0058AG.m115950h(InterfaceC44023ke5.EnumC25197a.DISCONNECTED);
    }

    /* renamed from: d */
    public static L46 m103043d(AbstractC23437E abstractC23437E) {
        return new L46(35L, TimeUnit.SECONDS, abstractC23437E);
    }

    /* renamed from: e */
    public static L46 m103042e(AbstractC23437E abstractC23437E) {
        return new L46(10L, TimeUnit.SECONDS, abstractC23437E);
    }
}
