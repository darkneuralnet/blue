package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes6.dex */
public class StreetViewPanoramaView extends FrameLayout {

    /* renamed from: b */
    public final C45974nv7 f71393b;

    public StreetViewPanoramaView(Context context) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"));
        this.f71393b = new C45974nv7(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet);
        this.f71393b = new C45974nv7(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super((Context) Preconditions.checkNotNull(context, "context must not be null"), attributeSet, i);
        this.f71393b = new C45974nv7(this, context, null);
    }
}
