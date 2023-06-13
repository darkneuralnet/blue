package p000;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.library.mlkitscanner.MLKitScanView;
import co.bird.android.widget.QrCodeZXingScannerView;
import co.bird.android.widget.standardcomponents.OptionalImeEditText;
/* renamed from: Yy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37445Yy0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f47681a;

    /* renamed from: b */
    public final ImageButton f47682b;

    /* renamed from: c */
    public final View f47683c;

    /* renamed from: d */
    public final ImageButton f47684d;

    /* renamed from: e */
    public final OptionalImeEditText f47685e;

    /* renamed from: f */
    public final ImageButton f47686f;

    /* renamed from: g */
    public final ImageView f47687g;

    /* renamed from: h */
    public final TextView f47688h;

    /* renamed from: i */
    public final TextView f47689i;

    /* renamed from: j */
    public final MLKitScanView f47690j;

    /* renamed from: k */
    public final ImageView f47691k;

    /* renamed from: l */
    public final QrCodeZXingScannerView f47692l;

    public C37445Yy0(ConstraintLayout constraintLayout, ImageButton imageButton, View view, ImageButton imageButton2, OptionalImeEditText optionalImeEditText, ImageButton imageButton3, ImageView imageView, TextView textView, TextView textView2, MLKitScanView mLKitScanView, ImageView imageView2, QrCodeZXingScannerView qrCodeZXingScannerView) {
        this.f47681a = constraintLayout;
        this.f47682b = imageButton;
        this.f47683c = view;
        this.f47684d = imageButton2;
        this.f47685e = optionalImeEditText;
        this.f47686f = imageButton3;
        this.f47687g = imageView;
        this.f47688h = textView;
        this.f47689i = textView2;
        this.f47690j = mLKitScanView;
        this.f47691k = imageView2;
        this.f47692l = qrCodeZXingScannerView;
    }

    /* renamed from: a */
    public static C37445Yy0 m73948a(View view) {
        View m96312a;
        int i = C42283hi4.bluetooth;
        ImageButton imageButton = (ImageButton) C34328Lp6.m96312a(view, i);
        if (imageButton != null && (m96312a = C34328Lp6.m96312a(view, (i = C42283hi4.buttonSpacer))) != null) {
            i = C42283hi4.code;
            ImageButton imageButton2 = (ImageButton) C34328Lp6.m96312a(view, i);
            if (imageButton2 != null) {
                i = C42283hi4.codeEditor;
                OptionalImeEditText optionalImeEditText = (OptionalImeEditText) C34328Lp6.m96312a(view, i);
                if (optionalImeEditText != null) {
                    i = C42283hi4.flashlight;
                    ImageButton imageButton3 = (ImageButton) C34328Lp6.m96312a(view, i);
                    if (imageButton3 != null) {
                        i = C42283hi4.icon;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C42283hi4.instructions;
                            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView != null) {
                                i = C42283hi4.instructions2;
                                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                if (textView2 != null) {
                                    i = C42283hi4.mlKitScanner;
                                    MLKitScanView mLKitScanView = (MLKitScanView) C34328Lp6.m96312a(view, i);
                                    if (mLKitScanView != null) {
                                        i = C42283hi4.peripheralIcon;
                                        ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                        if (imageView2 != null) {
                                            i = C42283hi4.scanner;
                                            QrCodeZXingScannerView qrCodeZXingScannerView = (QrCodeZXingScannerView) C34328Lp6.m96312a(view, i);
                                            if (qrCodeZXingScannerView != null) {
                                                return new C37445Yy0((ConstraintLayout) view, imageButton, m96312a, imageButton2, optionalImeEditText, imageButton3, imageView, textView, textView2, mLKitScanView, imageView2, qrCodeZXingScannerView);
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

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f47681a;
    }
}
