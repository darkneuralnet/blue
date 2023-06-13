package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import co.bird.android.widget.QrCodeZXingScannerView;
/* renamed from: Zp6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37604Zp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f49365a;

    /* renamed from: b */
    public final AppCompatImageButton f49366b;

    /* renamed from: c */
    public final View f49367c;

    /* renamed from: d */
    public final AppCompatImageButton f49368d;

    /* renamed from: e */
    public final View f49369e;

    /* renamed from: f */
    public final AppCompatImageButton f49370f;

    /* renamed from: g */
    public final TextView f49371g;

    /* renamed from: h */
    public final View f49372h;

    /* renamed from: i */
    public final View f49373i;

    /* renamed from: j */
    public final ImageView f49374j;

    /* renamed from: k */
    public final QrCodeZXingScannerView f49375k;

    public C37604Zp6(View view, AppCompatImageButton appCompatImageButton, View view2, AppCompatImageButton appCompatImageButton2, View view3, AppCompatImageButton appCompatImageButton3, TextView textView, View view4, View view5, ImageView imageView, QrCodeZXingScannerView qrCodeZXingScannerView) {
        this.f49365a = view;
        this.f49366b = appCompatImageButton;
        this.f49367c = view2;
        this.f49368d = appCompatImageButton2;
        this.f49369e = view3;
        this.f49370f = appCompatImageButton3;
        this.f49371g = textView;
        this.f49372h = view4;
        this.f49373i = view5;
        this.f49374j = imageView;
        this.f49375k = qrCodeZXingScannerView;
    }

    /* renamed from: a */
    public static C37604Zp6 m72408a(View view) {
        View m96312a;
        View m96312a2;
        View m96312a3;
        View m96312a4;
        int i = C42283hi4.bluetooth;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C34328Lp6.m96312a(view, i);
        if (appCompatImageButton != null && (m96312a = C34328Lp6.m96312a(view, (i = C42283hi4.bottomScrim))) != null) {
            i = C42283hi4.code;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) C34328Lp6.m96312a(view, i);
            if (appCompatImageButton2 != null && (m96312a2 = C34328Lp6.m96312a(view, (i = C42283hi4.endScrim))) != null) {
                i = C42283hi4.flash;
                AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) C34328Lp6.m96312a(view, i);
                if (appCompatImageButton3 != null) {
                    i = C42283hi4.instructions;
                    TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView != null && (m96312a3 = C34328Lp6.m96312a(view, (i = C42283hi4.startScrim))) != null && (m96312a4 = C34328Lp6.m96312a(view, (i = C42283hi4.topScrim))) != null) {
                        i = C42283hi4.viewFinder;
                        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                        if (imageView != null) {
                            i = C42283hi4.zxingScannerView;
                            QrCodeZXingScannerView qrCodeZXingScannerView = (QrCodeZXingScannerView) C34328Lp6.m96312a(view, i);
                            if (qrCodeZXingScannerView != null) {
                                return new C37604Zp6(view, appCompatImageButton, m96312a, appCompatImageButton2, m96312a2, appCompatImageButton3, textView, m96312a3, m96312a4, imageView, qrCodeZXingScannerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C37604Zp6 m72407b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36144Tj4.view_code_scanner, viewGroup);
            return m72408a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f49365a;
    }
}
