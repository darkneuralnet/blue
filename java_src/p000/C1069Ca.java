package p000;

import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, m28432d2 = {"LCa;", "LBa;", "", "eventName", "", "b", "propertyKey", "propertyValue", C17296a.f69688o, "Lco/bird/android/core/mvp/BaseActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LR2;", "LR2;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LR2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ca */
/* loaded from: classes2.dex */
public final class C1069Ca implements InterfaceC0647Ba {

    /* renamed from: a */
    public final BaseActivity f4251a;

    /* renamed from: b */
    public final C7055R2 f4252b;

    public C1069Ca(BaseActivity activity, C7055R2 binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f4251a = activity;
        this.f4252b = binding;
    }

    @Override // p000.InterfaceC0647Ba
    /* renamed from: a */
    public void mo112107a(String propertyKey, String propertyValue) {
        Intrinsics.checkNotNullParameter(propertyKey, "propertyKey");
        Intrinsics.checkNotNullParameter(propertyValue, "propertyValue");
        BaseActivity baseActivity = this.f4251a;
        int i = C32184Cl4.TextAppearance_Caption;
        TextView textView = new TextView(baseActivity, null, i, i);
        textView.setText(propertyKey + ": " + propertyValue);
        this.f4252b.f31407b.addView(textView);
    }

    @Override // p000.InterfaceC0647Ba
    /* renamed from: b */
    public void mo112106b(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.f4252b.f31408c.setText(eventName);
    }
}
