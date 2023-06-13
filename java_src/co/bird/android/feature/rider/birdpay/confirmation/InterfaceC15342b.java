package co.bird.android.feature.rider.birdpay.confirmation;

import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC15344c.class})
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/confirmation/b;", "", "Lco/bird/android/feature/rider/birdpay/confirmation/PaymentConfirmationActivity;", "activity", "", C17296a.f69688o, "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.rider.birdpay.confirmation.b */
/* loaded from: classes3.dex */
public interface InterfaceC15342b {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/rider/birdpay/confirmation/b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/feature/rider/birdpay/confirmation/b;", C17296a.f69688o, "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.rider.birdpay.confirmation.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15343a {
        /* renamed from: a */
        InterfaceC15342b mo57358a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity);
    }

    /* renamed from: a */
    void mo57359a(PaymentConfirmationActivity paymentConfirmationActivity);
}