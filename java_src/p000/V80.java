package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import java.nio.BufferUnderflowException;
import p000.C36825Wh1;
/* renamed from: V80 */
/* loaded from: classes.dex */
public class V80 implements InterfaceC51685xa0 {

    /* renamed from: a */
    public final C51672xY5 f38670a;

    /* renamed from: b */
    public final CaptureResult f38671b;

    public V80(C51672xY5 c51672xY5, CaptureResult captureResult) {
        this.f38670a = c51672xY5;
        this.f38671b = captureResult;
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: a */
    public void mo5000a(C36825Wh1.C9150b c9150b) {
        super.mo5000a(c9150b);
        Rect rect = (Rect) this.f38671b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            c9150b.m77990j(rect.width()).m77991i(rect.height());
        }
        try {
            Integer num = (Integer) this.f38671b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                c9150b.m77987m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            C33928Jx2.m99522l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l = (Long) this.f38671b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l != null) {
            c9150b.m77994f(l.longValue());
        }
        Float f = (Float) this.f38671b.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            c9150b.m77988l(f.floatValue());
        }
        Integer num2 = (Integer) this.f38671b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num2 != null) {
            Integer num3 = (Integer) this.f38671b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST);
            if (num3 != null) {
                num2 = Integer.valueOf(num2.intValue() * ((int) (num3.intValue() / 100.0f)));
            }
            c9150b.m77989k(num2.intValue());
        }
        Float f2 = (Float) this.f38671b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            c9150b.m77992h(f2.floatValue());
        }
        Integer num4 = (Integer) this.f38671b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            C36825Wh1.EnumC9154c enumC9154c = C36825Wh1.EnumC9154c.AUTO;
            if (num4.intValue() == 0) {
                enumC9154c = C36825Wh1.EnumC9154c.MANUAL;
            }
            c9150b.m77986n(enumC9154c);
        }
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: b */
    public C51672xY5 mo2304b() {
        return this.f38670a;
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: c */
    public EnumC49907ua0 mo2303c() {
        Integer num = (Integer) this.f38671b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC49907ua0.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return EnumC49907ua0.INACTIVE;
            case 1:
            case 3:
                return EnumC49907ua0.SCANNING;
            case 2:
                return EnumC49907ua0.PASSIVE_FOCUSED;
            case 4:
                return EnumC49907ua0.LOCKED_FOCUSED;
            case 5:
                return EnumC49907ua0.LOCKED_NOT_FOCUSED;
            case 6:
                return EnumC49907ua0.PASSIVE_NOT_FOCUSED;
            default:
                C33928Jx2.m99531c("C2CameraCaptureResult", "Undefined af state: " + num);
                return EnumC49907ua0.UNKNOWN;
        }
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: d */
    public EnumC50499va0 mo2302d() {
        Integer num = (Integer) this.f38671b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC50499va0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        C33928Jx2.m99531c("C2CameraCaptureResult", "Undefined awb state: " + num);
                        return EnumC50499va0.UNKNOWN;
                    }
                    return EnumC50499va0.LOCKED;
                }
                return EnumC50499va0.CONVERGED;
            }
            return EnumC50499va0.METERING;
        }
        return EnumC50499va0.INACTIVE;
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: e */
    public EnumC48721sa0 mo2301e() {
        Integer num = (Integer) this.f38671b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC48721sa0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                C33928Jx2.m99531c("C2CameraCaptureResult", "Undefined ae state: " + num);
                                return EnumC48721sa0.UNKNOWN;
                            }
                        } else {
                            return EnumC48721sa0.FLASH_REQUIRED;
                        }
                    } else {
                        return EnumC48721sa0.LOCKED;
                    }
                } else {
                    return EnumC48721sa0.CONVERGED;
                }
            }
            return EnumC48721sa0.SEARCHING;
        }
        return EnumC48721sa0.INACTIVE;
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: f */
    public EnumC51092wa0 mo2300f() {
        Integer num = (Integer) this.f38671b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC51092wa0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3 && intValue != 4) {
                    C33928Jx2.m99531c("C2CameraCaptureResult", "Undefined flash state: " + num);
                    return EnumC51092wa0.UNKNOWN;
                }
                return EnumC51092wa0.FIRED;
            }
            return EnumC51092wa0.READY;
        }
        return EnumC51092wa0.NONE;
    }

    @Override // p000.InterfaceC51685xa0
    /* renamed from: g */
    public CaptureResult mo4999g() {
        return this.f38671b;
    }

    @Override // p000.InterfaceC51685xa0
    public long getTimestamp() {
        Long l = (Long) this.f38671b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    /* renamed from: h */
    public EnumC49314ta0 m80323h() {
        Integer num = (Integer) this.f38671b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC49314ta0.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1 && intValue != 2) {
                if (intValue != 3 && intValue != 4) {
                    if (intValue != 5) {
                        C33928Jx2.m99531c("C2CameraCaptureResult", "Undefined af mode: " + num);
                        return EnumC49314ta0.UNKNOWN;
                    }
                } else {
                    return EnumC49314ta0.ON_CONTINUOUS_AUTO;
                }
            } else {
                return EnumC49314ta0.ON_MANUAL_AUTO;
            }
        }
        return EnumC49314ta0.OFF;
    }

    public V80(CaptureResult captureResult) {
        this(C51672xY5.m5018a(), captureResult);
    }
}
