package co.bird.android.feature.p010ar.resolution;

import android.app.Activity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(dependencies = {InterfaceC44393lG2.class})
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/ar/resolution/b;", "", "Lco/bird/android/feature/ar/resolution/VpsResolveActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.ar.resolution.b */
/* loaded from: classes3.dex */
public interface InterfaceC14502b {

    @Component.Factory
    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/ar/resolution/b$a;", "", "LlG2;", "mainComponent", "Landroid/app/Activity;", "activity", "LDQ3;", "permissionManager", "Lco/bird/android/model/wire/WireBird;", "bird", "", "rideId", "Lco/bird/android/feature/ar/resolution/b;", C17296a.f69688o, "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.b$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14503a {
        /* renamed from: a */
        InterfaceC14502b mo58889a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance Activity activity, @BindsInstance DQ3 dq3, @BindsInstance WireBird wireBird, @BindsInstance String str);
    }

    /* renamed from: a */
    void mo58890a(VpsResolveActivity vpsResolveActivity);
}
