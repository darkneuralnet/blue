package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.IdToolOption;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LwQ1;", "LrE;", "LtQ1;", "Lco/bird/android/model/IdToolOption;", "option", "Lio/reactivex/F;", "", "LH6;", "c", "", "errorMsg", "b", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51003wQ1 extends AbstractC27883rE implements InterfaceC49225tQ1 {

    /* renamed from: a */
    public final Context f115936a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wQ1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C29875a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdToolOption.values().length];
            try {
                iArr[IdToolOption.QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdToolOption.LICENSE_PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdToolOption.BRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdToolOption.HANDLEBAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdToolOption.GERMAN_LICENSE_PLATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdToolOption.IL_LICENSE_PLATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdToolOption.ONE_CODE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdToolOption.BATTERY_SERIAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdToolOption.MOTOR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdToolOption.US_CA_PLATE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IdToolOption.PCM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IdToolOption.BEACON.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[IdToolOption.HELMET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[IdToolOption.PHYSICAL_LOCK_STICKER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C51003wQ1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f115936a = context;
    }

    /* renamed from: o */
    public static final List m6856o(String str, IdToolOption option, C51003wQ1 this$0) {
        Intrinsics.checkNotNullParameter(option, "$option");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str == null) {
            switch (C29875a.$EnumSwitchMapping$0[option.ordinal()]) {
                case 1:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_qr_code_failed);
                    break;
                case 2:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_license_failed);
                    break;
                case 3:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_brain_failed);
                    break;
                case 4:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_handlebar_failed);
                    break;
                case 5:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_german_license_failed);
                    break;
                case 6:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_il_license_failed);
                    break;
                case 7:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_one_code_failed);
                    break;
                case 8:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_battery_serial_failed);
                    break;
                case 9:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_motor_failed);
                    break;
                case 10:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_us_ca_plate_failed);
                    break;
                case 11:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_pcm_failed);
                    break;
                case 12:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_beacon_failed);
                    break;
                case 13:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_helmet_failed);
                    break;
                case 14:
                    str = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_physical_lock_sticker_failed);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullExpressionValue(str, "when (option) {\n        …te_helmet_failed)\n      }");
        }
        return this$0.m16197k(new DQ5(C48193rg4.ic_filled_issue_triangle, str));
    }

    /* renamed from: p */
    public static final List m6855p(IdToolOption option, C51003wQ1 this$0) {
        String string;
        Intrinsics.checkNotNullParameter(option, "$option");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        switch (C29875a.$EnumSwitchMapping$0[option.ordinal()]) {
            case 1:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_qr_code_success);
                break;
            case 2:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_license_success);
                break;
            case 3:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_brain_success);
                break;
            case 4:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_handlebar_success);
                break;
            case 5:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_german_license_success);
                break;
            case 6:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_il_license_success);
                break;
            case 7:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_one_code_success);
                break;
            case 8:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_battery_serial_success);
                break;
            case 9:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_motor_success);
                break;
            case 10:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_us_ca_plate_success);
                break;
            case 11:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_pcm_success);
                break;
            case 12:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_beacon_success);
                break;
            case 13:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_helmet_success);
                break;
            case 14:
                string = this$0.f115936a.getString(C45871nl4.id_tools_status_dissociate_physical_lock_sticker_success);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullExpressionValue(string, "when (option) {\n        …_sticker_success)\n      }");
        return this$0.m16197k(new DQ5(C48193rg4.ic_filled_check_circle, string));
    }

    @Override // p000.InterfaceC49225tQ1
    /* renamed from: b */
    public AbstractC23442F<List<C3023H6>> mo6860b(final IdToolOption option, final String str) {
        Intrinsics.checkNotNullParameter(option, "option");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: uQ1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m6856o;
                m6856o = C51003wQ1.m6856o(str, option, this);
                return m6856o;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }

    @Override // p000.InterfaceC49225tQ1
    /* renamed from: c */
    public AbstractC23442F<List<C3023H6>> mo6859c(final IdToolOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: vQ1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m6855p;
                m6855p = C51003wQ1.m6855p(IdToolOption.this, this);
                return m6855p;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }
}
