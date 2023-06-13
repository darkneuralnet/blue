package p000;

import android.os.Bundle;
import android.text.TextUtils;
/* renamed from: Hz8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33484Hz8 implements DW8 {

    /* renamed from: a */
    public final /* synthetic */ RC8 f14306a;

    public C33484Hz8(RC8 rc8) {
        this.f14306a = rc8;
    }

    @Override // p000.DW8
    /* renamed from: a */
    public final void mo41290a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f14306a.m87158q("auto", "_err", bundle, str);
        } else {
            this.f14306a.m87160o("auto", "_err", bundle);
        }
    }
}
