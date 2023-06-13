package com.stripe.android.paymentsheet;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/BottomSheetController;", "", "Landroid/view/ViewGroup;", "bottomSheet", "", "setup", "hide", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "LBX2;", "", "_shouldFinish", "LBX2;", "LEu1;", "shouldFinish", "LEu1;", "getShouldFinish$paymentsheet_release", "()LEu1;", "<init>", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomSheetController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetController.kt\ncom/stripe/android/paymentsheet/BottomSheetController\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,67:1\n40#2:68\n56#2:69\n*S KotlinDebug\n*F\n+ 1 BottomSheetController.kt\ncom/stripe/android/paymentsheet/BottomSheetController\n*L\n23#1:68\n23#1:69\n*E\n"})
/* loaded from: classes7.dex */
public final class BottomSheetController {
    private final BX2<Boolean> _shouldFinish;
    private final BottomSheetBehavior<ViewGroup> bottomSheetBehavior;
    private final InterfaceC32730Eu1<Boolean> shouldFinish;

    public BottomSheetController(BottomSheetBehavior<ViewGroup> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "bottomSheetBehavior");
        this.bottomSheetBehavior = bottomSheetBehavior;
        BX2<Boolean> m79031b = C36748Vy5.m79031b(1, 0, null, 6, null);
        this._shouldFinish = m79031b;
        this.shouldFinish = m79031b;
    }

    public final InterfaceC32730Eu1<Boolean> getShouldFinish$paymentsheet_release() {
        return this.shouldFinish;
    }

    public final void hide() {
        if (this.bottomSheetBehavior.m50128L() == 5) {
            this._shouldFinish.mo10357b(Boolean.TRUE);
        } else {
            this.bottomSheetBehavior.m50082p0(5);
        }
    }

    public final void setup(final ViewGroup bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.bottomSheetBehavior.m50098h0(true);
        this.bottomSheetBehavior.m50108c0(false);
        this.bottomSheetBehavior.m50082p0(5);
        this.bottomSheetBehavior.m50088m0(-1);
        this.bottomSheetBehavior.m50104e0(true);
        bottomSheet.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.paymentsheet.BottomSheetController$setup$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomSheetBehavior bottomSheetBehavior;
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                bottomSheetBehavior = BottomSheetController.this.bottomSheetBehavior;
                bottomSheetBehavior.m50082p0(3);
                ViewGroup viewGroup = bottomSheet;
                final BottomSheetController bottomSheetController = BottomSheetController.this;
                viewGroup.post(new Runnable() { // from class: com.stripe.android.paymentsheet.BottomSheetController$setup$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BottomSheetBehavior bottomSheetBehavior2;
                        bottomSheetBehavior2 = BottomSheetController.this.bottomSheetBehavior;
                        bottomSheetBehavior2.m50104e0(false);
                    }
                });
            }
        });
        this.bottomSheetBehavior.m50073u(new BottomSheetBehavior.AbstractC17702f() { // from class: com.stripe.android.paymentsheet.BottomSheetController$setup$2
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
            public void onSlide(View bottomSheet2, float f) {
                Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC17702f
            public void onStateChanged(View bottomSheet2, int i) {
                BX2 bx2;
                Intrinsics.checkNotNullParameter(bottomSheet2, "bottomSheet");
                if (i == 5) {
                    bx2 = BottomSheetController.this._shouldFinish;
                    bx2.mo10357b(Boolean.TRUE);
                }
            }
        });
    }
}
