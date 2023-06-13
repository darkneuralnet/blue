package p000;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
/* renamed from: Iy1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C33702Iy1 {

    /* renamed from: a */
    public Fragment f16522a;

    /* renamed from: b */
    public android.app.Fragment f16523b;

    public C33702Iy1(Fragment fragment) {
        C48817sj6.m13765m(fragment, "fragment");
        this.f16522a = fragment;
    }

    /* renamed from: a */
    public final Activity m101440a() {
        Fragment fragment = this.f16522a;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return this.f16523b.getActivity();
    }

    /* renamed from: b */
    public android.app.Fragment m101439b() {
        return this.f16523b;
    }

    /* renamed from: c */
    public Fragment m101438c() {
        return this.f16522a;
    }

    /* renamed from: d */
    public void m101437d(Intent intent, int i) {
        Fragment fragment = this.f16522a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i);
        } else {
            this.f16523b.startActivityForResult(intent, i);
        }
    }

    public C33702Iy1(android.app.Fragment fragment) {
        C48817sj6.m13765m(fragment, "fragment");
        this.f16523b = fragment;
    }
}
