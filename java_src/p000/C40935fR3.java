package p000;

import android.widget.TextView;
import androidx.constraintlayout.widget.C11515b;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.PermissionStatusView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u0014\u0010\u001bR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b¨\u0006#"}, m28432d2 = {"LfR3;", "LeR3;", "", "show", "", "m", "i", "f", "l", "enabled", "j", "h", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "k", "close", "Lco/bird/android/core/mvp/BaseActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Ly4;", "b", "Ly4;", "binding", "Lio/reactivex/Observable;", "c", "Lio/reactivex/Observable;", "e", "()Lio/reactivex/Observable;", "enableLocationClicks", "enableBluetoothClicks", "g", "enableNotificationsClicks", "enableCameraClicks", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ly4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fR3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40935fR3 implements InterfaceC40342eR3 {

    /* renamed from: a */
    public final BaseActivity f80111a;

    /* renamed from: b */
    public final C30411y4 f80112b;

    /* renamed from: c */
    public final Observable<Unit> f80113c;

    /* renamed from: d */
    public final Observable<Unit> f80114d;

    /* renamed from: e */
    public final Observable<Unit> f80115e;

    /* renamed from: f */
    public final Observable<Unit> f80116f;

    public C40935fR3(BaseActivity activity, C30411y4 binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f80111a = activity;
        this.f80112b = binding;
        PermissionStatusView permissionStatusView = binding.f118680f;
        Intrinsics.checkNotNullExpressionValue(permissionStatusView, "binding.locationPermissionStatus");
        this.f80113c = C45219mf5.m25214a(permissionStatusView);
        PermissionStatusView permissionStatusView2 = binding.f118677c;
        Intrinsics.checkNotNullExpressionValue(permissionStatusView2, "binding.bluetoothPermissionStatus");
        this.f80114d = C45219mf5.m25214a(permissionStatusView2);
        PermissionStatusView permissionStatusView3 = binding.f118683i;
        Intrinsics.checkNotNullExpressionValue(permissionStatusView3, "binding.notificationPermissionStatus");
        this.f80115e = C45219mf5.m25214a(permissionStatusView3);
        PermissionStatusView permissionStatusView4 = binding.f118678d;
        Intrinsics.checkNotNullExpressionValue(permissionStatusView4, "binding.cameraPermissionStatus");
        this.f80116f = C45219mf5.m25214a(permissionStatusView4);
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: a */
    public void mo41385a(boolean z) {
        int i;
        PermissionStatusView permissionStatusView = this.f80112b.f118678d;
        permissionStatusView.setPermissionEnabled(z);
        BaseActivity baseActivity = this.f80111a;
        if (z) {
            i = C45871nl4.required_permission_camera_enabled;
        } else {
            i = C45871nl4.required_permission_camera_disabled;
        }
        String string = baseActivity.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(\n    …led\n          }\n        )");
        permissionStatusView.setTitle(string);
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: b */
    public Observable<Unit> mo41384b() {
        return this.f80114d;
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: c */
    public Observable<Unit> mo41383c() {
        return this.f80116f;
    }

    @Override // p000.InterfaceC40342eR3
    public void close() {
        this.f80111a.finish();
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: d */
    public void mo41382d(boolean z) {
        int i;
        PermissionStatusView permissionStatusView = this.f80112b.f118683i;
        permissionStatusView.setPermissionEnabled(z);
        BaseActivity baseActivity = this.f80111a;
        if (z) {
            i = C45871nl4.required_permission_notifications_enabled;
        } else {
            i = C45871nl4.required_permission_notifications_disabled;
        }
        String string = baseActivity.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(\n    …led\n          }\n        )");
        permissionStatusView.setTitle(string);
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: e */
    public Observable<Unit> mo41381e() {
        return this.f80113c;
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: f */
    public void mo41380f(boolean z) {
        PermissionStatusView permissionStatusView = this.f80112b.f118683i;
        Intrinsics.checkNotNullExpressionValue(permissionStatusView, "binding.notificationPermissionStatus");
        C49520tu6.show$default(permissionStatusView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: g */
    public Observable<Unit> mo41379g() {
        return this.f80115e;
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: h */
    public void mo41378h(boolean z) {
        int i;
        PermissionStatusView permissionStatusView = this.f80112b.f118677c;
        permissionStatusView.setPermissionEnabled(z);
        BaseActivity baseActivity = this.f80111a;
        if (z) {
            i = C45871nl4.required_permission_bluetooth_enabled;
        } else {
            i = C45871nl4.required_permission_bluetooth_disabled;
        }
        String string = baseActivity.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(\n    …led\n          }\n        )");
        permissionStatusView.setTitle(string);
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: i */
    public void mo41377i(boolean z) {
        PermissionStatusView permissionStatusView = this.f80112b.f118677c;
        Intrinsics.checkNotNullExpressionValue(permissionStatusView, "binding.bluetoothPermissionStatus");
        C49520tu6.show$default(permissionStatusView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: j */
    public void mo41376j(boolean z) {
        int i;
        PermissionStatusView permissionStatusView = this.f80112b.f118680f;
        permissionStatusView.setPermissionEnabled(z);
        BaseActivity baseActivity = this.f80111a;
        if (z) {
            i = C45871nl4.required_permission_location_enabled;
        } else {
            i = C45871nl4.required_permission_location_disabled;
        }
        String string = baseActivity.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(\n    …led\n          }\n        )");
        permissionStatusView.setTitle(string);
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: k */
    public void mo41375k(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        TextView textView = this.f80112b.f118685k;
        BaseActivity baseActivity = this.f80111a;
        if (z) {
            i = C45871nl4.required_permission_header_no_camera;
        } else {
            i = C45871nl4.required_permission_header;
        }
        textView.setText(baseActivity.getString(i));
        TextView textView2 = this.f80112b.f118686l;
        BaseActivity baseActivity2 = this.f80111a;
        if (z) {
            i2 = C45871nl4.required_permission_subheader_no_camera;
        } else {
            i2 = C45871nl4.required_permission_subheader;
        }
        textView2.setText(baseActivity2.getString(i2));
        C11515b c11515b = new C11515b();
        c11515b.m67812p(this.f80112b.f118684j);
        int i5 = 0;
        if (z) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        c11515b.m67829U(C36585Vg4.locationPermissionStatus, i3);
        c11515b.m67829U(C36585Vg4.bluetoothPermissionStatus, i3);
        c11515b.m67829U(C36585Vg4.notificationPermissionStatus, i3);
        c11515b.m67829U(C36585Vg4.cameraPermissionStatus, i3);
        int i6 = C36585Vg4.permissionRequiredHeader;
        int i7 = 4;
        if (z) {
            i4 = 3;
        } else {
            i4 = 4;
        }
        c11515b.m67814n(i6, i4);
        if (!z) {
            i7 = 3;
        }
        if (z) {
            i5 = C36585Vg4.middle_guideline;
        }
        c11515b.m67809s(i6, i7, i5, 3);
        c11515b.m67819i(this.f80112b.f118684j);
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: l */
    public void mo41374l(boolean z) {
        PermissionStatusView permissionStatusView = this.f80112b.f118678d;
        Intrinsics.checkNotNullExpressionValue(permissionStatusView, "binding.cameraPermissionStatus");
        C49520tu6.show$default(permissionStatusView, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40342eR3
    /* renamed from: m */
    public void mo41373m(boolean z) {
        PermissionStatusView permissionStatusView = this.f80112b.f118680f;
        Intrinsics.checkNotNullExpressionValue(permissionStatusView, "binding.locationPermissionStatus");
        C49520tu6.show$default(permissionStatusView, z, 0, 2, null);
    }
}
