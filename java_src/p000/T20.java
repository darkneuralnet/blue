package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
/* renamed from: T20 */
/* loaded from: classes2.dex */
public abstract class T20 extends Fragment implements V20 {

    /* renamed from: b */
    public R20 f34686b = null;

    /* renamed from: c */
    public String f34687c;

    /* renamed from: N6 */
    public String mo84411N6() {
        return this.f34687c;
    }

    /* renamed from: a5 */
    public void m84410a5(int i, Intent intent) {
        this.f34686b.m87405j(new W20().m78899e(intent).m78898f(i), this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        String packageName = context.getApplicationContext().getPackageName();
        this.f34687c = packageName.toLowerCase().replace("_", "") + ".browserswitch";
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34686b = R20.m87406i(mo84411N6());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f34686b.m87411d(this);
    }
}
