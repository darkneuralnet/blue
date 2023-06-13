package p000;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BountyFlightSheetButton;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LF00;", "LwZ;", "Lco/bird/android/model/BountyFlightSheetButton;", "LE00;", "c", "LE00;", DateTokenConverter.CONVERTER_KEY, "()LE00;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "e", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: F00 */
/* loaded from: classes3.dex */
public final class F00 extends AbstractC29912wZ<BountyFlightSheetButton> {

    /* renamed from: c */
    public final E00 f8422c;

    /* renamed from: d */
    public final LinearLayoutManager f8423d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/BountyFlightSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/BountyFlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: F00$a */
    /* loaded from: classes3.dex */
    public static final class C2047a extends Lambda implements Function1<BountyFlightSheetButton, Unit> {
        public C2047a() {
            super(1);
        }

        /* renamed from: a */
        public final void m108124a(BountyFlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
            F00.this.m6672a().invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BountyFlightSheetButton bountyFlightSheetButton) {
            m108124a(bountyFlightSheetButton);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F00(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8422c = new E00(null, 1, null);
        this.f8423d = new LinearLayoutManager(context);
        getAdapter().m109503x(new C2047a());
    }

    @Override // p000.AbstractC29912wZ
    /* renamed from: d */
    public E00 getAdapter() {
        return this.f8422c;
    }

    @Override // p000.AbstractC29912wZ
    /* renamed from: e */
    public LinearLayoutManager getLayoutManager() {
        return this.f8423d;
    }
}
