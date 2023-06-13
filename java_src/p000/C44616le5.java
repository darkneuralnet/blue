package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* renamed from: le5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44616le5 implements InterfaceC44023ke5 {

    /* renamed from: a */
    public final InterfaceC47776qy0 f96484a;

    /* renamed from: b */
    public final C50544ve5 f96485b;

    /* renamed from: c */
    public final BluetoothGatt f96486c;

    /* renamed from: d */
    public final InterfaceC40503ei3 f96487d;

    /* renamed from: e */
    public final Z94<Object> f96488e;

    /* renamed from: f */
    public final AbstractC23437E f96489f;

    /* renamed from: g */
    public final C36001St5 f96490g;

    /* renamed from: h */
    public final C38034aa3 f96491h;

    /* renamed from: i */
    public final InterfaceC46316oW2 f96492i;

    /* renamed from: j */
    public final A01 f96493j;

    /* renamed from: k */
    public final C47501qW1 f96494k;

    /* renamed from: le5$a */
    /* loaded from: classes6.dex */
    public class C25750a implements InterfaceC23492o<C49952ue5, AbstractC23442F<? extends BluetoothGattCharacteristic>> {

        /* renamed from: b */
        public final /* synthetic */ UUID f96495b;

        public C25750a(UUID uuid) {
            this.f96495b = uuid;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public AbstractC23442F<? extends BluetoothGattCharacteristic> apply(C49952ue5 c49952ue5) {
            return c49952ue5.m9922b(this.f96495b);
        }
    }

    /* renamed from: le5$b */
    /* loaded from: classes6.dex */
    public class C25751b implements InterfaceC23492o<BluetoothGattCharacteristic, InterfaceC23434B<? extends Observable<byte[]>>> {

        /* renamed from: b */
        public final /* synthetic */ EnumC41046fd3 f96497b;

        public C25751b(EnumC41046fd3 enumC41046fd3) {
            this.f96497b = enumC41046fd3;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public Observable<? extends Observable<byte[]>> apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return C44616le5.this.m27053f(bluetoothGattCharacteristic, this.f96497b);
        }
    }

    /* renamed from: le5$c */
    /* loaded from: classes6.dex */
    public class C25752c implements InterfaceC23492o<BluetoothGattCharacteristic, InterfaceC23447K<? extends byte[]>> {

        /* renamed from: b */
        public final /* synthetic */ byte[] f96499b;

        public C25752c(byte[] bArr) {
            this.f96499b = bArr;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC23447K<? extends byte[]> apply(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return C44616le5.this.m27052g(bluetoothGattCharacteristic, this.f96499b);
        }
    }

    public C44616le5(InterfaceC47776qy0 interfaceC47776qy0, C50544ve5 c50544ve5, BluetoothGatt bluetoothGatt, C36001St5 c36001St5, C38034aa3 c38034aa3, InterfaceC46316oW2 interfaceC46316oW2, A01 a01, InterfaceC40503ei3 interfaceC40503ei3, Z94<Object> z94, AbstractC23437E abstractC23437E, C47501qW1 c47501qW1) {
        this.f96484a = interfaceC47776qy0;
        this.f96485b = c50544ve5;
        this.f96486c = bluetoothGatt;
        this.f96490g = c36001St5;
        this.f96491h = c38034aa3;
        this.f96492i = interfaceC46316oW2;
        this.f96493j = a01;
        this.f96487d = interfaceC40503ei3;
        this.f96488e = z94;
        this.f96489f = abstractC23437E;
        this.f96494k = c47501qW1;
    }

    @Override // p000.InterfaceC44023ke5
    /* renamed from: a */
    public AbstractC23442F<C49952ue5> mo27058a() {
        return this.f96490g.m84683a(20L, TimeUnit.SECONDS);
    }

    @Override // p000.InterfaceC44023ke5
    /* renamed from: b */
    public Observable<Observable<byte[]>> mo27057b(UUID uuid, EnumC41046fd3 enumC41046fd3) {
        return m27054e(uuid).m33162D(new C25751b(enumC41046fd3));
    }

    @Override // p000.InterfaceC44023ke5
    /* renamed from: c */
    public AbstractC23442F<byte[]> mo27056c(UUID uuid, byte[] bArr) {
        return m27054e(uuid).m33165A(new C25752c(bArr));
    }

    @Override // p000.InterfaceC44023ke5
    /* renamed from: d */
    public Observable<Observable<byte[]>> mo27055d(UUID uuid) {
        return mo27057b(uuid, EnumC41046fd3.DEFAULT);
    }

    @Deprecated
    /* renamed from: e */
    public AbstractC23442F<BluetoothGattCharacteristic> m27054e(UUID uuid) {
        return mo27058a().m33165A(new C25750a(uuid));
    }

    /* renamed from: f */
    public Observable<Observable<byte[]>> m27053f(BluetoothGattCharacteristic bluetoothGattCharacteristic, EnumC41046fd3 enumC41046fd3) {
        return this.f96494k.m17478a(bluetoothGattCharacteristic, 16).m33043l(this.f96491h.m71185x(bluetoothGattCharacteristic, enumC41046fd3, false));
    }

    /* renamed from: g */
    public AbstractC23442F<byte[]> m27052g(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return this.f96494k.m17478a(bluetoothGattCharacteristic, 76).m33043l(this.f96484a.mo14979a(this.f96487d.mo41007c(bluetoothGattCharacteristic, bArr))).firstOrError();
    }
}
