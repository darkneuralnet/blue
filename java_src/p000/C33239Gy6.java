package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BottomSheetButton;
import co.bird.android.model.WarehouseFlightSheetButton;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m28432d2 = {"LGy6;", "LwZ;", "Lco/bird/android/model/BottomSheetButton;", "LEy6;", "c", "LEy6;", DateTokenConverter.CONVERTER_KEY, "()LEy6;", "adapter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "warehouse-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gy6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33239Gy6 extends AbstractC29912wZ<BottomSheetButton> {

    /* renamed from: c */
    public final C32771Ey6 f12682c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/WarehouseFlightSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/WarehouseFlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Gy6$a */
    /* loaded from: classes3.dex */
    public static final class C2994a extends Lambda implements Function1<WarehouseFlightSheetButton, Unit> {
        public C2994a() {
            super(1);
        }

        /* renamed from: a */
        public final void m104536a(WarehouseFlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C33239Gy6.this.m6672a().invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WarehouseFlightSheetButton warehouseFlightSheetButton) {
            m104536a(warehouseFlightSheetButton);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33239Gy6(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12682c = new C32771Ey6();
        getAdapter().m108165v(new C2994a());
    }

    @Override // p000.AbstractC29912wZ
    /* renamed from: d */
    public C32771Ey6 getAdapter() {
        return this.f12682c;
    }
}
