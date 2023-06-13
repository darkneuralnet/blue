package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.ParseError;
import p000.AbstractC45006mI4;
import p000.EM4;
/* renamed from: OX1 */
/* loaded from: classes.dex */
public class OX1 extends AbstractC45006mI4<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;
    private EM4.InterfaceC1800b<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    public OX1(String str, EM4.InterfaceC1800b<Bitmap> interfaceC1800b, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, EM4.InterfaceC1799a interfaceC1799a) {
        super(0, str, interfaceC1799a);
        this.mLock = new Object();
        setRetryPolicy(new C49889uY0(1000, 2, 2.0f));
        this.mListener = interfaceC1800b;
        this.mDecodeConfig = config;
        this.mMaxWidth = i;
        this.mMaxHeight = i2;
        this.mScaleType = scaleType;
    }

    private EM4<Bitmap> doParse(O73 o73) {
        Bitmap decodeByteArray;
        byte[] bArr = o73.f25919b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i, i2, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i2, i, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i, i2, resizedDimension, resizedDimension2);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > resizedDimension || decodeByteArray.getHeight() > resizedDimension2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, resizedDimension, resizedDimension2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray == null) {
            return EM4.m109113a(new ParseError(o73));
        }
        return EM4.m109111c(decodeByteArray, EN1.m109101e(o73));
    }

    public static int findBestSampleSize(int i, int i2, int i3, int i4) {
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int getResizedDimension(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            if (i == 0) {
                return i3;
            }
            return i;
        } else if (i == 0) {
            return (int) (i3 * (i2 / i4));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = i4 / i3;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = i2;
                if (i * d < d2) {
                    return (int) (d2 / d);
                }
                return i;
            }
            double d3 = i2;
            if (i * d > d3) {
                return (int) (d3 / d);
            }
            return i;
        }
    }

    @Override // p000.AbstractC45006mI4
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // p000.AbstractC45006mI4
    public AbstractC45006mI4.EnumC26039c getPriority() {
        return AbstractC45006mI4.EnumC26039c.LOW;
    }

    @Override // p000.AbstractC45006mI4
    public EM4<Bitmap> parseNetworkResponse(O73 o73) {
        EM4<Bitmap> doParse;
        synchronized (sDecodeLock) {
            try {
                try {
                    doParse = doParse(o73);
                } catch (OutOfMemoryError e) {
                    C34841Nu6.m93204c("Caught OOM for %d byte image, url=%s", Integer.valueOf(o73.f25919b.length), getUrl());
                    return EM4.m109113a(new ParseError(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return doParse;
    }

    @Override // p000.AbstractC45006mI4
    public void deliverResponse(Bitmap bitmap) {
        EM4.InterfaceC1800b<Bitmap> interfaceC1800b;
        synchronized (this.mLock) {
            interfaceC1800b = this.mListener;
        }
        if (interfaceC1800b != null) {
            interfaceC1800b.onResponse(bitmap);
        }
    }

    @Deprecated
    public OX1(String str, EM4.InterfaceC1800b<Bitmap> interfaceC1800b, int i, int i2, Bitmap.Config config, EM4.InterfaceC1799a interfaceC1799a) {
        this(str, interfaceC1800b, i, i2, ImageView.ScaleType.CENTER_INSIDE, config, interfaceC1799a);
    }
}
