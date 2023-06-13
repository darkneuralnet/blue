package co.bird.android.feature.transferorder.operator;

import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mrp.BaseActivityLite;
import com.facebook.share.internal.C17296a;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(dependencies = {InterfaceC44393lG2.class, BaseActivityLite.InterfaceC14454a.class})
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH&¨\u0006\r"}, m28432d2 = {"Lco/bird/android/feature/transferorder/operator/b;", "", "Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;", "activity", "", C17296a.f69688o, "Lrp3;", "fragment", "b", "LIo3;", DateTokenConverter.CONVERTER_KEY, "La7;", "c", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.transferorder.operator.b */
/* loaded from: classes3.dex */
public interface InterfaceC15803b {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/transferorder/operator/b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mrp/BaseActivityLite$a;", "baseComponent", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "Lco/bird/android/feature/transferorder/operator/b;", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.transferorder.operator.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15804a {
        /* renamed from: a */
        InterfaceC15803b mo56523a(InterfaceC44393lG2 interfaceC44393lG2, BaseActivityLite.InterfaceC14454a interfaceC14454a, @BindsInstance FragmentManager fragmentManager, @BindsInstance int i);
    }

    /* renamed from: a */
    void mo56527a(OperatorOrderActivity operatorOrderActivity);

    /* renamed from: b */
    void mo56526b(C48282rp3 c48282rp3);

    /* renamed from: c */
    void mo56525c(C10571a7 c10571a7);

    /* renamed from: d */
    void mo56524d(C33614Io3 c33614Io3);
}
