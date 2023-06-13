package zendesk.support.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C42732iT3;
import zendesk.support.PicassoTransformations;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class CellAttachmentLoadingUtil {
    private static final String LOG_TAG = "AttachmentLoadingUtil";
    private final ImageLoadingLogic imageLoadingLogic;
    private final ImageSizingLogic imageSizingLogic;

    /* loaded from: classes8.dex */
    public static class ImageLoadingLogic {
        private static final int IMAGE_DOWNSCALE_FACTOR = 2;
        private final C42732iT3 picasso;

        /* loaded from: classes8.dex */
        public static class DefaultDisplayStrategy implements LoadingStrategy {
            private DefaultDisplayStrategy() {
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageLoadingLogic.LoadingStrategy
            public void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
            }
        }

        /* loaded from: classes8.dex */
        public static class DisplayImageFromLocalSource implements LoadingStrategy {
            private final FI4 requestCreator;

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageLoadingLogic.LoadingStrategy
            public void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
                ImageLoadingLogic.loadImage(imageView, this.requestCreator.m107337j().m107338i(), imageDimensions, null);
            }

            private DisplayImageFromLocalSource(FI4 fi4) {
                this.requestCreator = fi4;
            }
        }

        /* loaded from: classes8.dex */
        public static class DisplayImageFromWeb implements LoadingStrategy {
            final C42732iT3 picasso;
            final String thumbnailUrl;
            final String url;

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageLoadingLogic.LoadingStrategy
            public void load(final ImageView imageView, final ImageSizingLogic.ImageDimensions imageDimensions) {
                ImageLoadingLogic.loadImage(imageView, this.picasso.m33877l(this.thumbnailUrl).m107335l(PicassoTransformations.getBlurTransformation(imageView.getContext().getApplicationContext())), imageDimensions, new I80() { // from class: zendesk.support.request.CellAttachmentLoadingUtil.ImageLoadingLogic.DisplayImageFromWeb.1
                    @Override // p000.I80
                    public void onError(Exception exc) {
                        C33694Ix2.m101457b("RequestActivity", "Unable to load thumbnail. Url: '%s'", DisplayImageFromWeb.this.thumbnailUrl, exc);
                        ImageView imageView2 = imageView;
                        DisplayImageFromWeb displayImageFromWeb = DisplayImageFromWeb.this;
                        ImageLoadingLogic.loadImage(imageView2, displayImageFromWeb.picasso.m33877l(displayImageFromWeb.url).m107337j(), imageDimensions, null);
                    }

                    @Override // p000.I80
                    public void onSuccess() {
                        ImageView imageView2 = imageView;
                        DisplayImageFromWeb displayImageFromWeb = DisplayImageFromWeb.this;
                        ImageLoadingLogic.loadImage(imageView2, displayImageFromWeb.picasso.m33877l(displayImageFromWeb.url).m107337j(), imageDimensions, null);
                    }
                });
            }

            private DisplayImageFromWeb(C42732iT3 c42732iT3, String str, String str2) {
                this.picasso = c42732iT3;
                this.url = str;
                this.thumbnailUrl = str2;
            }
        }

        /* loaded from: classes8.dex */
        public interface LoadingStrategy {
            void load(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions);
        }

        public ImageLoadingLogic(C42732iT3 c42732iT3) {
            this.picasso = c42732iT3;
        }

        private LoadingStrategy getLoadingStrategy(StateRequestAttachment stateRequestAttachment) {
            if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                return new DisplayImageFromLocalSource(this.picasso.m33878k(stateRequestAttachment.getLocalFile()));
            }
            if (C44504lS5.m27273b(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                return new DisplayImageFromLocalSource(this.picasso.m33879j(stateRequestAttachment.getParsedLocalUri()));
            }
            if (C44504lS5.m27273b(stateRequestAttachment.getUrl()) && C44504lS5.m27273b(stateRequestAttachment.getThumbnailUrl())) {
                return new DisplayImageFromWeb(this.picasso, stateRequestAttachment.getUrl(), stateRequestAttachment.getThumbnailUrl());
            }
            C33694Ix2.m101457b("RequestActivity", "Can't load image. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
            return new DefaultDisplayStrategy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void loadImage(ImageView imageView, FI4 fi4, ImageSizingLogic.ImageDimensions imageDimensions, I80 i80) {
            fi4.m107335l(PicassoTransformations.getRoundedTransformation(imageView.getContext().getResources().getDimensionPixelOffset(C35640Rf4.zs_request_attachment_corner_radius) / 2)).m107336k(imageDimensions.getImageWidth() / 2, imageDimensions.getImageHeight() / 2).m107346a().m107339h(imageView, i80);
        }

        public void initImageView(ImageView imageView) {
            this.picasso.m33886c(imageView);
            imageView.setImageResource(C52925zf4.zs_color_transparent);
        }

        public boolean isImageLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            Object tag = imageView.getTag();
            if ((tag instanceof StateRequestAttachment) && ((StateRequestAttachment) tag).getId() == stateRequestAttachment.getId()) {
                return true;
            }
            return false;
        }

        public void loadAttachment(ImageView imageView, StateRequestAttachment stateRequestAttachment, ImageSizingLogic.ImageDimensions imageDimensions) {
            getLoadingStrategy(stateRequestAttachment).load(imageView, imageDimensions);
        }

        public void setImageViewLoading(ImageView imageView, StateRequestAttachment stateRequestAttachment) {
            imageView.setTag(stateRequestAttachment);
        }
    }

    /* loaded from: classes8.dex */
    public static class ImageSizingLogic {
        private static final double ASPECT_RATIO = 1.7777777777777777d;
        private final Map<String, ImageDimensions> cachedDimensions = new HashMap();
        private final ImageDimensions maxSize;
        private final C42732iT3 picasso;

        /* loaded from: classes8.dex */
        public static class DefaultStrategy implements DimensionStrategy {
            private DefaultStrategy() {
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.DimensionStrategy
            public void findDimensions(AbstractC44415lI6<ImageDimensions> abstractC44415lI6) {
                abstractC44415lI6.onSuccess(new ImageDimensions());
            }
        }

        /* loaded from: classes8.dex */
        public interface DimensionStrategy {
            void findDimensions(AbstractC44415lI6<ImageDimensions> abstractC44415lI6);
        }

        /* loaded from: classes8.dex */
        public static class ExistingDimensions implements DimensionStrategy {
            private final int height;
            private final ImageDimensions maxSize;
            private final int width;

            public ExistingDimensions(int i, int i2, ImageDimensions imageDimensions) {
                this.width = i;
                this.height = i2;
                this.maxSize = imageDimensions;
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.DimensionStrategy
            public void findDimensions(AbstractC44415lI6<ImageDimensions> abstractC44415lI6) {
                abstractC44415lI6.onSuccess(ImageSizingLogic.determineTargetDimensions(this.width, this.height, this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }
        }

        /* loaded from: classes8.dex */
        public static class ReadFromBitmap implements DimensionStrategy {
            final File file;
            private final ImageDimensions maxSize;

            public ReadFromBitmap(File file, ImageDimensions imageDimensions) {
                this.maxSize = imageDimensions;
                this.file = file;
            }

            private ImageDimensions loadImageDimensions(File file) {
                ImageDimensions imageDimensions = new ImageDimensions();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                imageDimensions.setDimensions(options.outWidth, options.outHeight);
                return imageDimensions;
            }

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.DimensionStrategy
            public void findDimensions(AbstractC44415lI6<ImageDimensions> abstractC44415lI6) {
                ImageDimensions loadImageDimensions = loadImageDimensions(this.file);
                abstractC44415lI6.onSuccess(ImageSizingLogic.determineTargetDimensions(loadImageDimensions.getImageWidth(), loadImageDimensions.getImageHeight(), this.maxSize.getImageWidth(), this.maxSize.getImageHeight()));
            }
        }

        /* loaded from: classes8.dex */
        public static class ReadFromPicasso implements DimensionStrategy {
            private static final List<MY5> TARGET_REFERENCE_TRAP = new ArrayList();
            private final ImageDimensions maxSize;
            private final FI4 requestCreator;

            @Override // zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.DimensionStrategy
            public void findDimensions(final AbstractC44415lI6<ImageDimensions> abstractC44415lI6) {
                MY5 my5 = new MY5() { // from class: zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.ReadFromPicasso.1
                    @Override // p000.MY5
                    public void onBitmapFailed(Exception exc, Drawable drawable) {
                        C33694Ix2.m101457b("RequestActivity", "Unable to load image.", new Object[0]);
                        abstractC44415lI6.onSuccess(new ImageDimensions());
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }

                    @Override // p000.MY5
                    public void onBitmapLoaded(Bitmap bitmap, C42732iT3.EnumC23266e enumC23266e) {
                        abstractC44415lI6.onSuccess(ImageSizingLogic.determineTargetDimensions(bitmap.getWidth(), bitmap.getHeight(), ReadFromPicasso.this.maxSize.getImageWidth(), ReadFromPicasso.this.maxSize.getImageHeight()));
                        ReadFromPicasso.TARGET_REFERENCE_TRAP.remove(this);
                    }

                    @Override // p000.MY5
                    public void onPrepareLoad(Drawable drawable) {
                    }
                };
                TARGET_REFERENCE_TRAP.add(my5);
                this.requestCreator.m107341f(my5);
            }

            private ReadFromPicasso(FI4 fi4, ImageDimensions imageDimensions) {
                this.requestCreator = fi4;
                this.maxSize = imageDimensions;
            }
        }

        public ImageSizingLogic(C42732iT3 c42732iT3, Context context) {
            this.picasso = c42732iT3;
            this.maxSize = getMaxSize(context);
        }

        private int calculateMaxWidth(Context context) {
            Resources resources = context.getResources();
            return (resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelSize(C35640Rf4.zs_request_message_composer_expanded_side_margin)) - resources.getDimensionPixelSize(C35640Rf4.zs_request_message_margin_side);
        }

        public static ImageDimensions determineTargetDimensions(int i, int i2, int i3, int i4) {
            ImageDimensions imageDimensions = new ImageDimensions();
            int i5 = (int) (i3 / ((i * 1.0d) / i2));
            if (i > i2) {
                if (i > i3) {
                    i = i3;
                    i2 = i5;
                }
            } else if (i2 > i5) {
                i = Math.min(i3, i);
                i2 = i5;
            }
            imageDimensions.setDimensions(i, Math.max(Math.min(i4, i2), 0));
            return imageDimensions;
        }

        private DimensionStrategy getDimensionStrategy(StateRequestAttachment stateRequestAttachment, ImageDimensions imageDimensions) {
            if (stateRequestAttachment.getHeight() > 0 && stateRequestAttachment.getWidth() > 0) {
                return new ExistingDimensions(stateRequestAttachment.getWidth(), stateRequestAttachment.getHeight(), imageDimensions);
            }
            if (C44504lS5.m27273b(stateRequestAttachment.getLocalUri()) && this.cachedDimensions.containsKey(stateRequestAttachment.getLocalUri())) {
                ImageDimensions imageDimensions2 = this.cachedDimensions.get(stateRequestAttachment.getLocalUri());
                return new ExistingDimensions(imageDimensions2.getImageWidth(), imageDimensions2.getImageHeight(), imageDimensions);
            } else if (stateRequestAttachment.getLocalFile() != null && stateRequestAttachment.getLocalFile().exists() && stateRequestAttachment.getLocalFile().length() > 0) {
                return new ReadFromBitmap(stateRequestAttachment.getLocalFile(), imageDimensions);
            } else {
                if (C44504lS5.m27273b(stateRequestAttachment.getLocalUri()) && Uri.parse(stateRequestAttachment.getLocalUri()) != null) {
                    return new ReadFromPicasso(this.picasso.m33879j(Uri.parse(stateRequestAttachment.getLocalUri())), imageDimensions);
                }
                if (C44504lS5.m27273b(stateRequestAttachment.getUrl())) {
                    return new ReadFromPicasso(this.picasso.m33877l(stateRequestAttachment.getUrl()), imageDimensions);
                }
                C33694Ix2.m101457b("RequestActivity", "Can't load dimensions. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
                return new DefaultStrategy();
            }
        }

        public ImageDimensions getMaxSize() {
            return this.maxSize;
        }

        public void loadDimensionsForAttachment(final StateRequestAttachment stateRequestAttachment, final AbstractC44415lI6<ImageDimensions> abstractC44415lI6) {
            getDimensionStrategy(stateRequestAttachment, this.maxSize).findDimensions(new AbstractC44415lI6<ImageDimensions>() { // from class: zendesk.support.request.CellAttachmentLoadingUtil.ImageSizingLogic.1
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(ImageDimensions imageDimensions) {
                    if (C44504lS5.m27273b(stateRequestAttachment.getLocalUri()) && imageDimensions.areKnown()) {
                        ImageSizingLogic.this.cachedDimensions.put(stateRequestAttachment.getLocalUri(), imageDimensions);
                    }
                    abstractC44415lI6.onSuccess(imageDimensions);
                }
            });
        }

        private ImageDimensions getMaxSize(Context context) {
            int calculateMaxWidth = calculateMaxWidth(context);
            return new ImageDimensions(calculateMaxWidth, (int) (calculateMaxWidth / ASPECT_RATIO));
        }

        /* loaded from: classes8.dex */
        public static class ImageDimensions {
            private static final int UNKNOWN_DIMENSION = -1;
            private int imageHeight;
            private int imageWidth;

            public ImageDimensions(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }

            public boolean areKnown() {
                return (this.imageWidth == -1 || this.imageHeight == -1) ? false : true;
            }

            public int getImageHeight() {
                return this.imageHeight;
            }

            public int getImageWidth() {
                return this.imageWidth;
            }

            public void setDimensions(int i, int i2) {
                this.imageWidth = i;
                this.imageHeight = i2;
            }

            public String toString() {
                return "ImageDimensions{width=" + this.imageWidth + ", height=" + this.imageHeight + CoreConstants.CURLY_RIGHT;
            }

            public ImageDimensions() {
                this.imageWidth = -1;
                this.imageHeight = -1;
            }
        }
    }

    public CellAttachmentLoadingUtil(C42732iT3 c42732iT3, Context context) {
        this.imageSizingLogic = new ImageSizingLogic(c42732iT3, context);
        this.imageLoadingLogic = new ImageLoadingLogic(c42732iT3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void adjustImageViewDimensions(ImageView imageView, ImageSizingLogic.ImageDimensions imageDimensions) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = imageDimensions.getImageWidth();
        layoutParams.height = imageDimensions.getImageHeight();
        imageView.setLayoutParams(layoutParams);
    }

    public void bindImage(final ImageView imageView, final StateRequestAttachment stateRequestAttachment) {
        if (!this.imageLoadingLogic.isImageLoading(imageView, stateRequestAttachment)) {
            this.imageLoadingLogic.setImageViewLoading(imageView, stateRequestAttachment);
            adjustImageViewDimensions(imageView, this.imageSizingLogic.getMaxSize());
            this.imageLoadingLogic.initImageView(imageView);
            this.imageSizingLogic.loadDimensionsForAttachment(stateRequestAttachment, new AbstractC44415lI6<ImageSizingLogic.ImageDimensions>() { // from class: zendesk.support.request.CellAttachmentLoadingUtil.1
                @Override // p000.AbstractC44415lI6
                public void onError(InterfaceC48782sg1 interfaceC48782sg1) {
                }

                @Override // p000.AbstractC44415lI6
                public void onSuccess(ImageSizingLogic.ImageDimensions imageDimensions) {
                    if (!imageDimensions.areKnown()) {
                        C33694Ix2.m101457b("RequestActivity", "Unable retrieve image size. Id: %s", Long.valueOf(stateRequestAttachment.getId()));
                        return;
                    }
                    CellAttachmentLoadingUtil.this.adjustImageViewDimensions(imageView, imageDimensions);
                    CellAttachmentLoadingUtil.this.imageLoadingLogic.loadAttachment(imageView, stateRequestAttachment, imageDimensions);
                }
            });
        }
    }
}
