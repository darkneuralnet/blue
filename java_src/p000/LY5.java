package p000;

import android.graphics.drawable.Drawable;
/* renamed from: LY5 */
/* loaded from: classes5.dex */
public interface LY5<R> extends InterfaceC32227Cq2 {
    InterfaceC45599nI4 getRequest();

    void getSize(FB5 fb5);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, G96<? super R> g96);

    void removeCallback(FB5 fb5);

    void setRequest(InterfaceC45599nI4 interfaceC45599nI4);
}
