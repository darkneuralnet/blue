package me.dm7.barcodescanner.zxing;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import me.dm7.barcodescanner.core.BarcodeScannerView;
import me.dm7.barcodescanner.core.DisplayUtils;
/* loaded from: classes8.dex */
public class ZXingScannerView extends BarcodeScannerView {
    public static final List<EnumC7009Qx> ALL_FORMATS;
    private static final String TAG = "ZXingScannerView";
    private List<EnumC7009Qx> mFormats;
    private C51058wW2 mMultiFormatReader;
    private ResultHandler mResultHandler;

    /* loaded from: classes8.dex */
    public interface ResultHandler {
        void handleResult(C38511bN4 c38511bN4);
    }

    static {
        ArrayList arrayList = new ArrayList();
        ALL_FORMATS = arrayList;
        arrayList.add(EnumC7009Qx.AZTEC);
        arrayList.add(EnumC7009Qx.CODABAR);
        arrayList.add(EnumC7009Qx.CODE_39);
        arrayList.add(EnumC7009Qx.CODE_93);
        arrayList.add(EnumC7009Qx.CODE_128);
        arrayList.add(EnumC7009Qx.DATA_MATRIX);
        arrayList.add(EnumC7009Qx.EAN_8);
        arrayList.add(EnumC7009Qx.EAN_13);
        arrayList.add(EnumC7009Qx.ITF);
        arrayList.add(EnumC7009Qx.MAXICODE);
        arrayList.add(EnumC7009Qx.PDF_417);
        arrayList.add(EnumC7009Qx.QR_CODE);
        arrayList.add(EnumC7009Qx.RSS_14);
        arrayList.add(EnumC7009Qx.RSS_EXPANDED);
        arrayList.add(EnumC7009Qx.UPC_A);
        arrayList.add(EnumC7009Qx.UPC_E);
        arrayList.add(EnumC7009Qx.UPC_EAN_EXTENSION);
    }

    public ZXingScannerView(Context context) {
        super(context);
        initMultiFormatReader();
    }

    private void initMultiFormatReader() {
        EnumMap enumMap = new EnumMap(EnumC47491qV0.class);
        enumMap.put((EnumMap) EnumC47491qV0.POSSIBLE_FORMATS, (EnumC47491qV0) getFormats());
        C51058wW2 c51058wW2 = new C51058wW2();
        this.mMultiFormatReader = c51058wW2;
        c51058wW2.m6716d(enumMap);
    }

    public C45122mV3 buildLuminanceSource(byte[] bArr, int i, int i2) {
        Rect framingRectInPreview = getFramingRectInPreview(i, i2);
        if (framingRectInPreview == null) {
            return null;
        }
        try {
            return new C45122mV3(bArr, i, i2, framingRectInPreview.left, framingRectInPreview.top, framingRectInPreview.width(), framingRectInPreview.height(), false);
        } catch (Exception unused) {
            return null;
        }
    }

    public Collection<EnumC7009Qx> getFormats() {
        List<EnumC7009Qx> list = this.mFormats;
        if (list == null) {
            return ALL_FORMATS;
        }
        return list;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        C51058wW2 c51058wW2;
        C51058wW2 c51058wW22;
        if (this.mResultHandler == null) {
            return;
        }
        try {
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            int i = previewSize.width;
            int i2 = previewSize.height;
            if (DisplayUtils.getScreenOrientation(getContext()) == 1) {
                int rotationCount = getRotationCount();
                if (rotationCount == 1 || rotationCount == 3) {
                    i = i2;
                    i2 = i;
                }
                bArr = getRotatedData(bArr, camera);
            }
            C45122mV3 buildLuminanceSource = buildLuminanceSource(bArr, i, i2);
            final C38511bN4 c38511bN4 = null;
            if (buildLuminanceSource != null) {
                try {
                    try {
                        c38511bN4 = this.mMultiFormatReader.m6717c(new C7707TG(new TN1(buildLuminanceSource)));
                        c51058wW2 = this.mMultiFormatReader;
                    } catch (NullPointerException unused) {
                        c51058wW2 = this.mMultiFormatReader;
                    }
                } catch (ReaderException unused2) {
                    c51058wW2 = this.mMultiFormatReader;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    c51058wW2 = this.mMultiFormatReader;
                }
                c51058wW2.reset();
                if (c38511bN4 == null) {
                    try {
                        c38511bN4 = this.mMultiFormatReader.m6717c(new C7707TG(new TN1(buildLuminanceSource.m1614e())));
                        c51058wW22 = this.mMultiFormatReader;
                    } catch (NotFoundException unused4) {
                        c51058wW22 = this.mMultiFormatReader;
                    } catch (Throwable th) {
                        this.mMultiFormatReader.reset();
                        throw th;
                    }
                    c51058wW22.reset();
                }
            }
            if (c38511bN4 != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: me.dm7.barcodescanner.zxing.ZXingScannerView.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ResultHandler resultHandler = ZXingScannerView.this.mResultHandler;
                        ZXingScannerView.this.mResultHandler = null;
                        ZXingScannerView.this.stopCameraPreview();
                        if (resultHandler != null) {
                            resultHandler.handleResult(c38511bN4);
                        }
                    }
                });
            } else {
                camera.setOneShotPreviewCallback(this);
            }
        } catch (RuntimeException e) {
            Log.e(TAG, e.toString(), e);
        }
    }

    public void resumeCameraPreview(ResultHandler resultHandler) {
        this.mResultHandler = resultHandler;
        super.resumeCameraPreview();
    }

    public void setFormats(List<EnumC7009Qx> list) {
        this.mFormats = list;
        initMultiFormatReader();
    }

    public void setResultHandler(ResultHandler resultHandler) {
        this.mResultHandler = resultHandler;
    }

    public ZXingScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initMultiFormatReader();
    }
}
