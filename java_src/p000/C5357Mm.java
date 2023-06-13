package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AreaBottomSheetButton;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m28432d2 = {"LMm;", "LwZ;", "Lco/bird/android/model/AreaBottomSheetButton;", "LNm;", "c", "LNm;", DateTokenConverter.CONVERTER_KEY, "()LNm;", "adapter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mm */
/* loaded from: classes3.dex */
public final class C5357Mm extends AbstractC29912wZ<AreaBottomSheetButton> {

    /* renamed from: c */
    public final C5679Nm f23515c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/AreaBottomSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/AreaBottomSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Mm$a */
    /* loaded from: classes3.dex */
    public static final class C5358a extends Lambda implements Function1<AreaBottomSheetButton, Unit> {
        public C5358a() {
            super(1);
        }

        /* renamed from: a */
        public final void m94912a(AreaBottomSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C5357Mm.this.m6672a().invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AreaBottomSheetButton areaBottomSheetButton) {
            m94912a(areaBottomSheetButton);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5357Mm(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23515c = new C5679Nm();
        getAdapter().m93472w(new C5358a());
    }

    @Override // p000.AbstractC29912wZ
    /* renamed from: d */
    public C5679Nm getAdapter() {
        return this.f23515c;
    }
}
