package com.google.android.filament.android;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
/* loaded from: classes5.dex */
public class UiHelper {
    private static final boolean LOGGING = false;
    private static final String LOG_TAG = "UiHelper";
    private int mDesiredHeight;
    private int mDesiredWidth;
    private boolean mHasSwapChain;
    private Object mNativeWindow;
    private boolean mOpaque;
    private boolean mOverlay;
    private RendererCallback mRenderCallback;
    private RenderSurface mRenderSurface;

    /* loaded from: classes5.dex */
    public enum ContextErrorPolicy {
        CHECK,
        DONT_CHECK
    }

    /* loaded from: classes5.dex */
    public interface RenderSurface {
        void detach();

        void resize(int i, int i2);
    }

    /* loaded from: classes5.dex */
    public interface RendererCallback {
        void onDetachedFromSurface();

        void onNativeWindowChanged(Surface surface);

        void onResized(int i, int i2);
    }

    /* loaded from: classes5.dex */
    public static class SurfaceHolderHandler implements RenderSurface {
        private SurfaceHolder mSurfaceHolder;

        public SurfaceHolderHandler(SurfaceHolder surfaceHolder) {
            this.mSurfaceHolder = surfaceHolder;
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void detach() {
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void resize(int i, int i2) {
            this.mSurfaceHolder.setFixedSize(i, i2);
        }
    }

    /* loaded from: classes5.dex */
    public static class SurfaceViewHandler implements RenderSurface {
        private SurfaceView mSurfaceView;

        public SurfaceViewHandler(SurfaceView surfaceView) {
            this.mSurfaceView = surfaceView;
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void detach() {
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void resize(int i, int i2) {
            this.mSurfaceView.getHolder().setFixedSize(i, i2);
        }
    }

    /* loaded from: classes5.dex */
    public class TextureViewHandler implements RenderSurface {
        private Surface mSurface;
        private TextureView mTextureView;

        public TextureViewHandler(TextureView textureView) {
            this.mTextureView = textureView;
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void detach() {
            setSurface(null);
        }

        @Override // com.google.android.filament.android.UiHelper.RenderSurface
        public void resize(int i, int i2) {
            this.mTextureView.getSurfaceTexture().setDefaultBufferSize(i, i2);
            UiHelper.this.mRenderCallback.onResized(i, i2);
        }

        public void setSurface(Surface surface) {
            Surface surface2;
            if (surface == null && (surface2 = this.mSurface) != null) {
                surface2.release();
            }
            this.mSurface = surface;
        }
    }

    public UiHelper() {
        this(ContextErrorPolicy.CHECK);
    }

    private boolean attach(Object obj) {
        Object obj2 = this.mNativeWindow;
        if (obj2 != null) {
            if (obj2 == obj) {
                return false;
            }
            destroySwapChain();
        }
        this.mNativeWindow = obj;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createSwapChain(Surface surface) {
        this.mRenderCallback.onNativeWindowChanged(surface);
        this.mHasSwapChain = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroySwapChain() {
        RenderSurface renderSurface = this.mRenderSurface;
        if (renderSurface != null) {
            renderSurface.detach();
        }
        this.mRenderCallback.onDetachedFromSurface();
        this.mHasSwapChain = false;
    }

    public void attachTo(SurfaceView surfaceView) {
        int i;
        if (attach(surfaceView)) {
            boolean z = !isOpaque();
            if (isMediaOverlay()) {
                surfaceView.setZOrderMediaOverlay(z);
            } else {
                surfaceView.setZOrderOnTop(z);
            }
            int i2 = isOpaque() ? -1 : -3;
            surfaceView.getHolder().setFormat(i2);
            this.mRenderSurface = new SurfaceViewHandler(surfaceView);
            SurfaceHolder.Callback callback = new SurfaceHolder.Callback() { // from class: com.google.android.filament.android.UiHelper.1
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
                    UiHelper.this.mRenderCallback.onResized(i4, i5);
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    UiHelper.this.createSwapChain(surfaceHolder.getSurface());
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    UiHelper.this.destroySwapChain();
                }
            };
            SurfaceHolder holder = surfaceView.getHolder();
            holder.addCallback(callback);
            int i3 = this.mDesiredWidth;
            if (i3 > 0 && (i = this.mDesiredHeight) > 0) {
                holder.setFixedSize(i3, i);
            }
            Surface surface = holder.getSurface();
            if (surface == null || !surface.isValid()) {
                return;
            }
            callback.surfaceCreated(holder);
            callback.surfaceChanged(holder, i2, holder.getSurfaceFrame().width(), holder.getSurfaceFrame().height());
        }
    }

    public void detach() {
        destroySwapChain();
        this.mNativeWindow = null;
        this.mRenderSurface = null;
    }

    public int getDesiredHeight() {
        return this.mDesiredHeight;
    }

    public int getDesiredWidth() {
        return this.mDesiredWidth;
    }

    public RendererCallback getRenderCallback() {
        return this.mRenderCallback;
    }

    public long getSwapChainFlags() {
        return isOpaque() ? 0L : 1L;
    }

    public boolean isMediaOverlay() {
        return this.mOverlay;
    }

    public boolean isOpaque() {
        return this.mOpaque;
    }

    public boolean isReadyToRender() {
        return this.mHasSwapChain;
    }

    public void setDesiredSize(int i, int i2) {
        this.mDesiredWidth = i;
        this.mDesiredHeight = i2;
        RenderSurface renderSurface = this.mRenderSurface;
        if (renderSurface != null) {
            renderSurface.resize(i, i2);
        }
    }

    public void setMediaOverlay(boolean z) {
        this.mOverlay = z;
    }

    public void setOpaque(boolean z) {
        this.mOpaque = z;
    }

    public void setRenderCallback(RendererCallback rendererCallback) {
        this.mRenderCallback = rendererCallback;
    }

    public UiHelper(ContextErrorPolicy contextErrorPolicy) {
        this.mOpaque = true;
        this.mOverlay = false;
    }

    public void attachTo(TextureView textureView) {
        if (attach(textureView)) {
            textureView.setOpaque(isOpaque());
            this.mRenderSurface = new TextureViewHandler(textureView);
            TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: com.google.android.filament.android.UiHelper.2
                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    if (UiHelper.this.mDesiredWidth > 0 && UiHelper.this.mDesiredHeight > 0) {
                        surfaceTexture.setDefaultBufferSize(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
                    }
                    Surface surface = new Surface(surfaceTexture);
                    ((TextureViewHandler) UiHelper.this.mRenderSurface).setSurface(surface);
                    UiHelper.this.createSwapChain(surface);
                    UiHelper.this.mRenderCallback.onResized(i, i2);
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    UiHelper.this.destroySwapChain();
                    return true;
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                    if (UiHelper.this.mDesiredWidth > 0 && UiHelper.this.mDesiredHeight > 0) {
                        surfaceTexture.setDefaultBufferSize(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
                        UiHelper.this.mRenderCallback.onResized(UiHelper.this.mDesiredWidth, UiHelper.this.mDesiredHeight);
                        return;
                    }
                    UiHelper.this.mRenderCallback.onResized(i, i2);
                }

                @Override // android.view.TextureView.SurfaceTextureListener
                public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }
            };
            textureView.setSurfaceTextureListener(surfaceTextureListener);
            if (textureView.isAvailable()) {
                surfaceTextureListener.onSurfaceTextureAvailable(textureView.getSurfaceTexture(), this.mDesiredWidth, this.mDesiredHeight);
            }
        }
    }

    public void attachTo(final SurfaceHolder surfaceHolder) {
        int i;
        if (attach(surfaceHolder)) {
            int i2 = isOpaque() ? -1 : -3;
            surfaceHolder.setFormat(i2);
            this.mRenderSurface = new SurfaceHolderHandler(surfaceHolder);
            SurfaceHolder.Callback callback = new SurfaceHolder.Callback() { // from class: com.google.android.filament.android.UiHelper.3
                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder2, int i3, int i4, int i5) {
                    UiHelper.this.mRenderCallback.onResized(i4, i5);
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder2) {
                    UiHelper.this.createSwapChain(surfaceHolder.getSurface());
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder2) {
                    UiHelper.this.destroySwapChain();
                }
            };
            surfaceHolder.addCallback(callback);
            int i3 = this.mDesiredWidth;
            if (i3 > 0 && (i = this.mDesiredHeight) > 0) {
                surfaceHolder.setFixedSize(i3, i);
            }
            Surface surface = surfaceHolder.getSurface();
            if (surface == null || !surface.isValid()) {
                return;
            }
            callback.surfaceCreated(surfaceHolder);
            callback.surfaceChanged(surfaceHolder, i2, surfaceHolder.getSurfaceFrame().width(), surfaceHolder.getSurfaceFrame().height());
        }
    }
}
