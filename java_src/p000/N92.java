package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.model.wire.WireSkuScanItemKt;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.android.schedulers.C23454a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.H31;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u0002J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0015"}, m28432d2 = {"LN92;", "LxE;", "", "rawScan", "error", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Rl", "warehouse", "Pl", "Ql", "LM92;", "b", "LM92;", "ui", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LM92;)V", "c", C17296a.f69688o, "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInventoryScanningUiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningUiDelegate.kt\nco/bird/android/library/inventoryscanning/ui/InventoryScanningUiDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
/* renamed from: N92 */
/* loaded from: classes3.dex */
public final class N92 extends AbstractC30071xE {

    /* renamed from: c */
    public static final C5485a f24196c = new C5485a(null);

    /* renamed from: b */
    public final M92 f24197b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LN92$a;", "", "", "HAPTIC_DELAY_MS", "J", "<init>", "()V", "inventory-scanning_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: N92$a */
    /* loaded from: classes3.dex */
    public static final class C5485a {
        public /* synthetic */ C5485a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5485a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: N92$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5486b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InventoryScanningError.values().length];
            try {
                iArr[InventoryScanningError.HARD_COUNT_NOT_VALID_QR_NOT_VALID_SERIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InventoryScanningError.NOT_VALID_QR_NOT_VALID_SERIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InventoryScanningError.HARD_COUNT_VALID_QR_NOT_IN_DB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InventoryScanningError.VALID_QR_NOT_IN_DB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InventoryScanningError.HARD_COUNT_VALID_SERIAL_NOT_IN_DB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InventoryScanningError.VALID_SERIAL_NOT_IN_DB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InventoryScanningError.NOT_AUTHORIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InventoryScanningError.ACTION_NOT_PERMITTED_AT_THIS_STATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InventoryScanningError.HARD_COUNT_DUPLICATE_SCAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[InventoryScanningError.DUPLICATE_SCAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[InventoryScanningError.ITEM_ALREADY_IN_SKU_ORDER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[InventoryScanningError.NOT_IN_THE_RIGHT_ZONE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[InventoryScanningError.INCORRECT_COMMODITY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[InventoryScanningError.INCORRECT_COMMODITY_TYPE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[InventoryScanningError.INCORRECT_CONDITION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[InventoryScanningError.INCORRECT_FLEET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[InventoryScanningError.INCORRECT_SKU.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[InventoryScanningError.ITEM_NOT_IN_SKU_ORDER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[InventoryScanningError.ITEM_ALREADY_CHECKED_IN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[InventoryScanningError.TERMINATED_VEHICLE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N92(BaseActivity activity, M92 ui) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f24197b = ui;
    }

    /* renamed from: Pl */
    public final AbstractC23442F<DialogResponse> m94309Pl(String warehouse) {
        Intrinsics.checkNotNullParameter(warehouse, "warehouse");
        return H31.C3014a.birdDialog$default(this, new C32491Dt5(warehouse), false, false, 6, null);
    }

    /* renamed from: Ql */
    public final AbstractC23442F<DialogResponse> m94308Ql(AbstractC23442F<DialogResponse> abstractC23442F) {
        AbstractC23442F<DialogResponse> m33116o = abstractC23442F.m33116o(500L, TimeUnit.MILLISECONDS, C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33116o, "this.delaySubscription(H…dSchedulers.mainThread())");
        return m33116o;
    }

    /* renamed from: Rl */
    public final AbstractC23442F<DialogResponse> m94307Rl(String rawScan, String str) {
        InventoryScanningError inventoryScanningError;
        int i;
        AbstractC23442F<DialogResponse> m95666Wl;
        Intrinsics.checkNotNullParameter(rawScan, "rawScan");
        if (this.f24197b.dialogShown()) {
            AbstractC23442F<DialogResponse> m33158H = AbstractC23442F.m33158H(DialogResponse.OTHER);
            Intrinsics.checkNotNullExpressionValue(m33158H, "just(DialogResponse.OTHER)");
            return m33158H;
        }
        if (str != null && WireSkuScanItemKt.toInventoryScanningError(str) != InventoryScanningError.UNKNOWN) {
            this.f24197b.vibrate(1000L);
        }
        if (str != null) {
            inventoryScanningError = WireSkuScanItemKt.toInventoryScanningError(str);
        } else {
            inventoryScanningError = null;
        }
        if (inventoryScanningError == null) {
            i = -1;
        } else {
            i = C5486b.$EnumSwitchMapping$0[inventoryScanningError.ordinal()];
        }
        switch (i) {
            case 1:
            case 2:
                return m94308Ql(this.f24197b.m95659dm());
            case 3:
            case 4:
                return m94308Ql(this.f24197b.m95672Ql(rawScan));
            case 5:
            case 6:
                return m94308Ql(this.f24197b.m95671Rl(rawScan));
            case 7:
            case 8:
                return m94308Ql(this.f24197b.m95670Sl());
            case 9:
            case 10:
                return m94308Ql(this.f24197b.m95673Pl());
            case 11:
                return m94308Ql(this.f24197b.m95669Tl());
            case 12:
                return m94308Ql(this.f24197b.m95660cm());
            case 13:
                return m94308Ql(this.f24197b.m95665Xl());
            case 14:
                return m94308Ql(this.f24197b.m95664Yl());
            case 15:
                return m94308Ql(this.f24197b.m95663Zl());
            case 16:
                return m94308Ql(this.f24197b.m95662am());
            case 17:
                return m94308Ql(this.f24197b.m95661bm());
            case 18:
                return m94308Ql(this.f24197b.m95657fm());
            case 19:
                return m94308Ql(this.f24197b.m95658em());
            case 20:
                return m94308Ql(this.f24197b.m95656gm());
            default:
                if (str == null || (m95666Wl = this.f24197b.m95666Wl(str)) == null) {
                    AbstractC23442F<DialogResponse> m33158H2 = AbstractC23442F.m33158H(DialogResponse.OTHER);
                    Intrinsics.checkNotNullExpressionValue(m33158H2, "just(DialogResponse.OTHER)");
                    return m33158H2;
                }
                return m95666Wl;
        }
    }
}
