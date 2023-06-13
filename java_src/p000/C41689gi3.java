package p000;

import android.bluetooth.BluetoothGatt;
import io.reactivex.AbstractC23437E;
/* renamed from: gi3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41689gi3 implements InterfaceC49405tj1<C41096fi3> {

    /* renamed from: a */
    public final Z94<C50544ve5> f84053a;

    /* renamed from: b */
    public final Z94<BluetoothGatt> f84054b;

    /* renamed from: c */
    public final Z94<C35332Px2> f84055c;

    /* renamed from: d */
    public final Z94<L46> f84056d;

    /* renamed from: e */
    public final Z94<AbstractC23437E> f84057e;

    /* renamed from: f */
    public final Z94<AbstractC23437E> f84058f;

    /* renamed from: g */
    public final Z94<C35982Sr4> f84059g;

    public C41689gi3(Z94<C50544ve5> z94, Z94<BluetoothGatt> z942, Z94<C35332Px2> z943, Z94<L46> z944, Z94<AbstractC23437E> z945, Z94<AbstractC23437E> z946, Z94<C35982Sr4> z947) {
        this.f84053a = z94;
        this.f84054b = z942;
        this.f84055c = z943;
        this.f84056d = z944;
        this.f84057e = z945;
        this.f84058f = z946;
        this.f84059g = z947;
    }

    /* renamed from: a */
    public static C41689gi3 m37883a(Z94<C50544ve5> z94, Z94<BluetoothGatt> z942, Z94<C35332Px2> z943, Z94<L46> z944, Z94<AbstractC23437E> z945, Z94<AbstractC23437E> z946, Z94<C35982Sr4> z947) {
        return new C41689gi3(z94, z942, z943, z944, z945, z946, z947);
    }

    /* renamed from: c */
    public static C41096fi3 m37881c(C50544ve5 c50544ve5, BluetoothGatt bluetoothGatt, C35332Px2 c35332Px2, L46 l46, AbstractC23437E abstractC23437E, AbstractC23437E abstractC23437E2, Z94<C35982Sr4> z94) {
        return new C41096fi3(c50544ve5, bluetoothGatt, c35332Px2, l46, abstractC23437E, abstractC23437E2, z94);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C41096fi3 get() {
        return m37881c(this.f84053a.get(), this.f84054b.get(), this.f84055c.get(), this.f84056d.get(), this.f84057e.get(), this.f84058f.get(), this.f84059g);
    }
}
