package p000;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00148\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006'"}, m28432d2 = {"LUk3;", "LHA;", "LTo2;", "j", "LTo2;", "Vl", "()LTo2;", "assetManager", "Landroid/view/ViewGroup;", "k", "Landroid/view/ViewGroup;", "Zl", "()Landroid/view/ViewGroup;", "bannerView", "Landroid/widget/ImageView;", "l", "Landroid/widget/ImageView;", "Wl", "()Landroid/widget/ImageView;", "bannerImage", "Landroid/widget/TextView;", "m", "Landroid/widget/TextView;", "Yl", "()Landroid/widget/TextView;", "bannerTitle", "n", "Xl", "bannerSubtitle", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LJf;", "adapter", "Lbg;", "converter", "LCt6;", "binding", "<init>", "(LTo2;Lco/bird/android/core/mvp/BaseActivity;LJf;Lbg;LCt6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Uk3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36386Uk3 extends AbstractC3056HA {

    /* renamed from: j */
    public final InterfaceC36187To2 f37919j;

    /* renamed from: k */
    public final ViewGroup f37920k;

    /* renamed from: l */
    public final ImageView f37921l;

    /* renamed from: m */
    public final TextView f37922m;

    /* renamed from: n */
    public final TextView f37923n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36386Uk3(InterfaceC36187To2 assetManager, BaseActivity activity, C4176Jf adapter, C12470bg converter, C32258Ct6 binding) {
        super(activity, adapter, converter);
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f37919j = assetManager;
        RelativeLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        this.f37920k = root;
        ImageView imageView = binding.f4863c;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.bannerImage");
        this.f37921l = imageView;
        TextView textView = binding.f4865e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.bannerTitle");
        this.f37922m = textView;
        TextView textView2 = binding.f4864d;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.bannerSubtitle");
        this.f37923n = textView2;
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Vl */
    public InterfaceC36187To2 mo2709Vl() {
        return this.f37919j;
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Wl */
    public ImageView mo75628Wl() {
        return this.f37921l;
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Xl */
    public TextView mo75624Xl() {
        return this.f37923n;
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Yl */
    public TextView mo75622Yl() {
        return this.f37922m;
    }

    @Override // p000.AbstractC3056HA
    /* renamed from: Zl */
    public ViewGroup mo75617Zl() {
        return this.f37920k;
    }
}
