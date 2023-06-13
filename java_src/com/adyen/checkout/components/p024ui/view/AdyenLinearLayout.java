package com.adyen.checkout.components.p024ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.adyen.checkout.components.base.Configuration;
import java.util.Locale;
import p000.InterfaceC38986cA3;
import p000.InterfaceC50113uu6;
/* renamed from: com.adyen.checkout.components.ui.view.AdyenLinearLayout */
/* loaded from: classes.dex */
public abstract class AdyenLinearLayout<OutputDataT extends InterfaceC38986cA3, ConfigurationT extends Configuration, ComponentStateT, ComponentT extends InterfaceC50113uu6<OutputDataT, ConfigurationT, ComponentStateT>> extends LinearLayout implements InterfaceC41796gt0<OutputDataT, ComponentT> {

    /* renamed from: b */
    public ComponentT f68421b;

    /* renamed from: c */
    public Context f68422c;

    public AdyenLinearLayout(Context context) {
        super(context);
    }

    /* renamed from: c */
    public void m53585c(ComponentT componentt, LifecycleOwner lifecycleOwner) {
        this.f68421b = componentt;
        mo37365b();
        m53583e(this.f68421b.mo88649d().m53594c());
        mo37366a();
        mo53582f(this.f68422c);
        setVisibility(0);
        this.f68421b.mo9503c(getContext());
        mo53581g(lifecycleOwner);
    }

    /* renamed from: d */
    public ComponentT m53584d() {
        ComponentT componentt = this.f68421b;
        if (componentt != null) {
            return componentt;
        }
        throw new RuntimeException("Should not get Component before it's attached");
    }

    /* renamed from: e */
    public final void m53583e(Locale locale) {
        android.content.res.Configuration configuration = new android.content.res.Configuration(getContext().getResources().getConfiguration());
        configuration.setLocale(locale);
        this.f68422c = getContext().createConfigurationContext(configuration);
    }

    /* renamed from: f */
    public abstract void mo53582f(Context context);

    /* renamed from: g */
    public abstract void mo53581g(LifecycleOwner lifecycleOwner);

    public AdyenLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdyenLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(isInEditMode() ? 0 : 8);
    }
}
