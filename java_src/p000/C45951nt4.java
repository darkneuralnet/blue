package p000;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
/* renamed from: nt4  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45951nt4 extends Fragment {

    /* renamed from: b */
    public C45358mt4 f100989b;

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f100989b.m24765f(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f100989b = new C45358mt4(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f100989b.m24764g();
    }
}
