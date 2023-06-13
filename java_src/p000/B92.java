package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BarcodeScanType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006%"}, m28432d2 = {"LB92;", "LA92;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LD92;", C17296a.f69688o, "LD92;", "ui", "Le13;", "b", "Le13;", "navigator", "Liy6;", "c", "Liy6;", "warehouseChecker", "", "Z", "e", "()Z", "f", "(Z)V", "hasGoneToBarcodeScanner", "isWarehouseVerified", "g", "<init>", "(LD92;Le13;Liy6;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: B92 */
/* loaded from: classes3.dex */
public final class B92 implements A92, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final D92 f1917a;

    /* renamed from: b */
    public final InterfaceC40099e13 f1918b;

    /* renamed from: c */
    public final C43038iy6 f1919c;

    /* renamed from: d */
    public boolean f1920d;

    /* renamed from: e */
    public boolean f1921e;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m28432d2 = {"B92$a", "LRx6;", "", "b", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: B92$a */
    /* loaded from: classes3.dex */
    public static final class C0534a implements InterfaceC35804Rx6 {
        public C0534a() {
        }

        @Override // p000.InterfaceC35804Rx6
        /* renamed from: a */
        public void mo86162a() {
            B92.this.f1917a.mo109341A9(true);
        }

        @Override // p000.InterfaceC35804Rx6
        /* renamed from: b */
        public void mo86161b() {
            B92.this.m114321g(true);
            if (!B92.this.m114323e()) {
                B92.this.m114322f(true);
                B92.this.f1918b.mo37064Y3(BarcodeScanType.RAW, Integer.valueOf(C45871nl4.inventory));
            }
        }
    }

    public B92(D92 ui, InterfaceC40099e13 navigator, C43038iy6 warehouseChecker) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        this.f1917a = ui;
        this.f1918b = navigator;
        this.f1919c = warehouseChecker;
        warehouseChecker.m31479B(ui);
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f1919c.mo28195d(interfaceC35804Rx6);
    }

    /* renamed from: e */
    public final boolean m114323e() {
        return this.f1920d;
    }

    /* renamed from: f */
    public final void m114322f(boolean z) {
        this.f1920d = z;
    }

    /* renamed from: g */
    public final void m114321g(boolean z) {
        this.f1921e = z;
    }

    @Override // p000.A92
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 10009) {
            if (i == 10017) {
                if (i2 == -1 && intent != null) {
                    if (intent.getIntExtra("raw_scan_result_unexpected", 0) == 1) {
                        this.f1918b.mo37064Y3(BarcodeScanType.RAW, Integer.valueOf(C45871nl4.inventory));
                    } else {
                        this.f1918b.mo37030e3();
                    }
                } else if (i2 == 0) {
                    this.f1918b.mo37064Y3(BarcodeScanType.RAW, Integer.valueOf(C45871nl4.inventory));
                } else {
                    this.f1918b.mo37030e3();
                }
            }
        } else if (i2 == -1 && intent != null) {
            InterfaceC40099e13 interfaceC40099e13 = this.f1918b;
            String stringExtra = intent.getStringExtra(PaymentMethodOptionsParams.Blik.PARAM_CODE);
            Intrinsics.checkNotNull(stringExtra);
            interfaceC40099e13.mo37100R2(stringExtra);
        } else {
            this.f1918b.mo37030e3();
        }
    }

    @Override // p000.InterfaceC36038Sx6
    public void onResume() {
        C0534a c0534a = new C0534a();
        if (!this.f1921e) {
            mo28195d(c0534a);
        }
    }
}
