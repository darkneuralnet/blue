package com.stripe.android.p049ui.core;

import com.stripe.android.p049ui.core.elements.LayoutSpec;
import com.stripe.android.p049ui.core.forms.TransformSpecToElements;
/* renamed from: com.stripe.android.ui.core.FormController_Factory */
/* loaded from: classes7.dex */
public final class FormController_Factory implements InterfaceC48812sj1<FormController> {
    private final Y94<LayoutSpec> formSpecProvider;
    private final Y94<TransformSpecToElements> transformSpecToElementProvider;

    public FormController_Factory(Y94<LayoutSpec> y94, Y94<TransformSpecToElements> y942) {
        this.formSpecProvider = y94;
        this.transformSpecToElementProvider = y942;
    }

    public static FormController_Factory create(Y94<LayoutSpec> y94, Y94<TransformSpecToElements> y942) {
        return new FormController_Factory(y94, y942);
    }

    public static FormController newInstance(LayoutSpec layoutSpec, TransformSpecToElements transformSpecToElements) {
        return new FormController(layoutSpec, transformSpecToElements);
    }

    @Override // p000.Y94
    public FormController get() {
        return newInstance(this.formSpecProvider.get(), this.transformSpecToElementProvider.get());
    }
}
