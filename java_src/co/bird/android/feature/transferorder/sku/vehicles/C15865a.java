package co.bird.android.feature.transferorder.sku.vehicles;

import android.content.Context;
import co.bird.android.feature.transferorder.sku.vehicles.InterfaceC15868b;
/* renamed from: co.bird.android.feature.transferorder.sku.vehicles.a */
/* loaded from: classes3.dex */
public final class C15865a {

    /* renamed from: co.bird.android.feature.transferorder.sku.vehicles.a$a */
    /* loaded from: classes3.dex */
    public static final class C15866a implements InterfaceC15868b.InterfaceC15869a {
        @Override // co.bird.android.feature.transferorder.sku.vehicles.InterfaceC15868b.InterfaceC15869a
        /* renamed from: a */
        public InterfaceC15868b mo56353a(InterfaceC44393lG2 interfaceC44393lG2) {
            C51679xZ3.m5005b(interfaceC44393lG2);
            return new C15867b(interfaceC44393lG2);
        }

        private C15866a() {
        }
    }

    /* renamed from: co.bird.android.feature.transferorder.sku.vehicles.a$b */
    /* loaded from: classes3.dex */
    public static final class C15867b implements InterfaceC15868b {

        /* renamed from: a */
        public final InterfaceC44393lG2 f65841a;

        /* renamed from: b */
        public final C15867b f65842b;

        @Override // co.bird.android.feature.transferorder.sku.vehicles.InterfaceC15868b
        /* renamed from: a */
        public void mo56354a(SkuOrderVehiclesActivity skuOrderVehiclesActivity) {
            m56357b(skuOrderVehiclesActivity);
        }

        /* renamed from: b */
        public final SkuOrderVehiclesActivity m56357b(SkuOrderVehiclesActivity skuOrderVehiclesActivity) {
            C4650Ky.m98043b(skuOrderVehiclesActivity, (InterfaceC40099e13) C51679xZ3.m5003d(this.f65841a.mo27461w2()));
            C4650Ky.m98042c(skuOrderVehiclesActivity, (C22454gl) C51679xZ3.m5003d(this.f65841a.mo27479r()));
            C4650Ky.m98041d(skuOrderVehiclesActivity, (C36207Tq4) C51679xZ3.m5003d(this.f65841a.mo27595B1()));
            EC5.m109304c(skuOrderVehiclesActivity, m56355d());
            EC5.m109306a(skuOrderVehiclesActivity, m56356c());
            return skuOrderVehiclesActivity;
        }

        /* renamed from: c */
        public final GC5 m56356c() {
            return new GC5((Context) C51679xZ3.m5003d(this.f65841a.mo27552R1()));
        }

        /* renamed from: d */
        public final MC5 m56355d() {
            return new MC5((O86) C51679xZ3.m5003d(this.f65841a.mo27485p()));
        }

        public C15867b(InterfaceC44393lG2 interfaceC44393lG2) {
            this.f65842b = this;
            this.f65841a = interfaceC44393lG2;
        }
    }

    private C15865a() {
    }

    /* renamed from: a */
    public static InterfaceC15868b.InterfaceC15869a m56358a() {
        return new C15866a();
    }
}
