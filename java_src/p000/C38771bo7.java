package p000;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
/* renamed from: bo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38771bo7 implements Result {

    /* renamed from: b */
    public final Status f59577b;

    public C38771bo7(Status status) {
        this.f59577b = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.f59577b;
    }
}
