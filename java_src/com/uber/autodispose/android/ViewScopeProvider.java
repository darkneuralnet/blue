package com.uber.autodispose.android;

import android.view.View;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.InterfaceC23496h;
/* loaded from: classes7.dex */
public final class ViewScopeProvider implements ScopeProvider {

    /* renamed from: b */
    public final View f75562b;

    public ViewScopeProvider(View view) {
        this.f75562b = view;
    }

    /* renamed from: a */
    public static ScopeProvider m45202a(View view) {
        if (view != null) {
            return new ViewScopeProvider(view);
        }
        throw new NullPointerException("view == null");
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        return new DetachEventCompletable(this.f75562b);
    }
}
