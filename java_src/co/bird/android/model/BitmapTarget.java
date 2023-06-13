package co.bird.android.model;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/BitmapTarget;", "LLY5;", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "bitmap", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface BitmapTarget extends LY5<Bitmap> {
    Bitmap getBitmap();

    @Override // p000.LY5
    /* synthetic */ InterfaceC45599nI4 getRequest();

    @Override // p000.LY5
    /* synthetic */ void getSize(FB5 fb5);

    @Override // p000.InterfaceC32227Cq2
    /* synthetic */ void onDestroy();

    @Override // p000.LY5
    /* synthetic */ void onLoadCleared(Drawable drawable);

    @Override // p000.LY5
    /* synthetic */ void onLoadFailed(Drawable drawable);

    @Override // p000.LY5
    /* synthetic */ void onLoadStarted(Drawable drawable);

    @Override // p000.LY5
    /* synthetic */ void onResourceReady(Bitmap bitmap, G96<? super Bitmap> g96);

    @Override // p000.InterfaceC32227Cq2
    /* synthetic */ void onStart();

    @Override // p000.InterfaceC32227Cq2
    /* synthetic */ void onStop();

    @Override // p000.LY5
    /* synthetic */ void removeCallback(FB5 fb5);

    @Override // p000.LY5
    /* synthetic */ void setRequest(InterfaceC45599nI4 interfaceC45599nI4);
}
