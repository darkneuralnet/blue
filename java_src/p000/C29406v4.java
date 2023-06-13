package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.bird.android.feature.bulkscanner.widgets.BulkScanListSheetView;
import co.bird.android.widget.QrCodeZXingScannerView;
import co.bird.android.widget.actions.OperatorTaskActionBottomSheet;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: v4 */
/* loaded from: classes3.dex */
public final class C29406v4 implements InterfaceC34094Kp6 {

    /* renamed from: A */
    public final ImageView f113461A;

    /* renamed from: a */
    public final CoordinatorLayout f113462a;

    /* renamed from: b */
    public final OperatorTaskActionBottomSheet f113463b;

    /* renamed from: c */
    public final Guideline f113464c;

    /* renamed from: d */
    public final ImageView f113465d;

    /* renamed from: e */
    public final FrameLayout f113466e;

    /* renamed from: f */
    public final View f113467f;

    /* renamed from: g */
    public final Guideline f113468g;

    /* renamed from: h */
    public final BulkScanListSheetView f113469h;

    /* renamed from: i */
    public final Group f113470i;

    /* renamed from: j */
    public final LinearLayout f113471j;

    /* renamed from: k */
    public final ImageView f113472k;

    /* renamed from: l */
    public final AppCompatEditText f113473l;

    /* renamed from: m */
    public final Guideline f113474m;

    /* renamed from: n */
    public final Guideline f113475n;

    /* renamed from: o */
    public final View f113476o;

    /* renamed from: p */
    public final ImageView f113477p;

    /* renamed from: q */
    public final TextView f113478q;

    /* renamed from: r */
    public final LinearProgressIndicator f113479r;

    /* renamed from: s */
    public final CoordinatorLayout f113480s;

    /* renamed from: t */
    public final TextView f113481t;

    /* renamed from: u */
    public final LinearLayout f113482u;

    /* renamed from: v */
    public final QrCodeZXingScannerView f113483v;

    /* renamed from: w */
    public final Guideline f113484w;

    /* renamed from: x */
    public final Guideline f113485x;

    /* renamed from: y */
    public final View f113486y;

    /* renamed from: z */
    public final View f113487z;

    public C29406v4(CoordinatorLayout coordinatorLayout, OperatorTaskActionBottomSheet operatorTaskActionBottomSheet, Guideline guideline, ImageView imageView, FrameLayout frameLayout, View view, Guideline guideline2, BulkScanListSheetView bulkScanListSheetView, Group group, LinearLayout linearLayout, ImageView imageView2, AppCompatEditText appCompatEditText, Guideline guideline3, Guideline guideline4, View view2, ImageView imageView3, TextView textView, LinearProgressIndicator linearProgressIndicator, CoordinatorLayout coordinatorLayout2, TextView textView2, LinearLayout linearLayout2, QrCodeZXingScannerView qrCodeZXingScannerView, Guideline guideline5, Guideline guideline6, View view3, View view4, ImageView imageView4) {
        this.f113462a = coordinatorLayout;
        this.f113463b = operatorTaskActionBottomSheet;
        this.f113464c = guideline;
        this.f113465d = imageView;
        this.f113466e = frameLayout;
        this.f113467f = view;
        this.f113468g = guideline2;
        this.f113469h = bulkScanListSheetView;
        this.f113470i = group;
        this.f113471j = linearLayout;
        this.f113472k = imageView2;
        this.f113473l = appCompatEditText;
        this.f113474m = guideline3;
        this.f113475n = guideline4;
        this.f113476o = view2;
        this.f113477p = imageView3;
        this.f113478q = textView;
        this.f113479r = linearProgressIndicator;
        this.f113480s = coordinatorLayout2;
        this.f113481t = textView2;
        this.f113482u = linearLayout2;
        this.f113483v = qrCodeZXingScannerView;
        this.f113484w = guideline5;
        this.f113485x = guideline6;
        this.f113486y = view3;
        this.f113487z = view4;
        this.f113461A = imageView4;
    }

    /* renamed from: a */
    public static C29406v4 m9231a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        int i = C41087fh4.actionSheet;
        OperatorTaskActionBottomSheet operatorTaskActionBottomSheet = (OperatorTaskActionBottomSheet) C34328Lp6.m96312a(view, i);
        if (operatorTaskActionBottomSheet != null) {
            i = C41087fh4.barcodeFinderBottomGutter;
            Guideline guideline = (Guideline) C34328Lp6.m96312a(view, i);
            if (guideline != null) {
                i = C41087fh4.bluetoothButton;
                ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                if (imageView != null) {
                    i = C41087fh4.bottom;
                    FrameLayout frameLayout = (FrameLayout) C34328Lp6.m96312a(view, i);
                    if (frameLayout != null && (m96312a = C34328Lp6.m96312a(view, (i = C41087fh4.bottomScrim))) != null) {
                        i = C41087fh4.bottomSheetPeekHighGutter;
                        Guideline guideline2 = (Guideline) C34328Lp6.m96312a(view, i);
                        if (guideline2 != null) {
                            i = C41087fh4.bulkActionView;
                            BulkScanListSheetView bulkScanListSheetView = (BulkScanListSheetView) C34328Lp6.m96312a(view, i);
                            if (bulkScanListSheetView != null) {
                                i = C41087fh4.bulkScanV1Group;
                                Group group = (Group) C34328Lp6.m96312a(view, i);
                                if (group != null) {
                                    i = C41087fh4.buttons;
                                    LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                                    if (linearLayout != null) {
                                        i = C41087fh4.codeButton;
                                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView2 != null) {
                                            i = C41087fh4.codeEditor;
                                            AppCompatEditText appCompatEditText = (AppCompatEditText) C34328Lp6.m96312a(view, i);
                                            if (appCompatEditText != null) {
                                                i = C41087fh4.endGutter;
                                                Guideline guideline3 = (Guideline) C34328Lp6.m96312a(view, i);
                                                if (guideline3 != null) {
                                                    i = C41087fh4.endGutterNoMargin;
                                                    Guideline guideline4 = (Guideline) C34328Lp6.m96312a(view, i);
                                                    if (guideline4 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C41087fh4.endScrim))) != null) {
                                                        i = C41087fh4.flashButton;
                                                        ImageView imageView3 = (ImageView) C34328Lp6.m96312a(view, i);
                                                        if (imageView3 != null) {
                                                            i = C41087fh4.instructions;
                                                            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                                            if (textView != null) {
                                                                i = C41087fh4.progressBar;
                                                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                                                                if (linearProgressIndicator != null) {
                                                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                                                                    i = C41087fh4.scanInstructions;
                                                                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                                                    if (textView2 != null) {
                                                                        i = C41087fh4.scanInstructionsContainer;
                                                                        LinearLayout linearLayout2 = (LinearLayout) C34328Lp6.m96312a(view, i);
                                                                        if (linearLayout2 != null) {
                                                                            i = C41087fh4.scannerView;
                                                                            QrCodeZXingScannerView qrCodeZXingScannerView = (QrCodeZXingScannerView) C34328Lp6.m96312a(view, i);
                                                                            if (qrCodeZXingScannerView != null) {
                                                                                i = C41087fh4.startGutter;
                                                                                Guideline guideline5 = (Guideline) C34328Lp6.m96312a(view, i);
                                                                                if (guideline5 != null) {
                                                                                    i = C41087fh4.startGutterNoMargin;
                                                                                    Guideline guideline6 = (Guideline) C34328Lp6.m96312a(view, i);
                                                                                    if (guideline6 != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C41087fh4.startScrim))) != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C41087fh4.topScrim))) != null) {
                                                                                        i = C41087fh4.viewFinder;
                                                                                        ImageView imageView4 = (ImageView) C34328Lp6.m96312a(view, i);
                                                                                        if (imageView4 != null) {
                                                                                            return new C29406v4(coordinatorLayout, operatorTaskActionBottomSheet, guideline, imageView, frameLayout, m96312a, guideline2, bulkScanListSheetView, group, linearLayout, imageView2, appCompatEditText, guideline3, guideline4, m96312a2, imageView3, textView, linearProgressIndicator, coordinatorLayout, textView2, linearLayout2, qrCodeZXingScannerView, guideline5, guideline6, m96312a3, m96312a4, imageView4);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C29406v4 m9229c(LayoutInflater layoutInflater) {
        return m9228d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29406v4 m9228d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35901Si4.activity_operator_bulk_scanner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m9231a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CoordinatorLayout getRoot() {
        return this.f113462a;
    }
}
