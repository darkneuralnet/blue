package co.bird.android.feature.nestflightsheet;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.NestFlightSheetButton;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;", "LwZ;", "Lco/bird/android/model/NestFlightSheetButton;", "LD33;", "c", "LD33;", DateTokenConverter.CONVERTER_KEY, "()LD33;", "adapter", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "e", "()Landroidx/recyclerview/widget/GridLayoutManager;", "layoutManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class NestFlightSheetBottomSheetAdapter extends AbstractC29912wZ<NestFlightSheetButton> {

    /* renamed from: e */
    public static final C15007b f64259e = new C15007b(null);

    /* renamed from: c */
    public final D33 f64260c;

    /* renamed from: d */
    public final GridLayoutManager f64261d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/NestFlightSheetButton;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/NestFlightSheetButton;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.nestflightsheet.NestFlightSheetBottomSheetAdapter$a */
    /* loaded from: classes3.dex */
    public static final class C15006a extends Lambda implements Function1<NestFlightSheetButton, Unit> {
        public C15006a() {
            super(1);
        }

        /* renamed from: a */
        public final void m57900a(NestFlightSheetButton it) {
            Intrinsics.checkNotNullParameter(it, "it");
            NestFlightSheetBottomSheetAdapter.this.m6672a().invoke(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NestFlightSheetButton nestFlightSheetButton) {
            m57900a(nestFlightSheetButton);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$b;", "", "", "SPAN_COUNT", "I", "<init>", "()V", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.nestflightsheet.NestFlightSheetBottomSheetAdapter$b */
    /* loaded from: classes3.dex */
    public static final class C15007b {
        public /* synthetic */ C15007b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15007b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestFlightSheetBottomSheetAdapter(final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f64260c = new D33();
        this.f64261d = new GridLayoutManager(context, this) { // from class: co.bird.android.feature.nestflightsheet.NestFlightSheetBottomSheetAdapter$layoutManager$1

            @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m28432d2 = {"co/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1$a", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "", "position", "f", "nest-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.feature.nestflightsheet.NestFlightSheetBottomSheetAdapter$layoutManager$1$a */
            /* loaded from: classes3.dex */
            public static final class C15008a extends GridLayoutManager.AbstractC11826b {

                /* renamed from: e */
                public final /* synthetic */ NestFlightSheetBottomSheetAdapter f64263e;

                public C15008a(NestFlightSheetBottomSheetAdapter nestFlightSheetBottomSheetAdapter) {
                    this.f64263e = nestFlightSheetBottomSheetAdapter;
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC11826b
                /* renamed from: f */
                public int mo56202f(int i) {
                    return this.f64263e.getAdapter().getItemViewType(i) == C48223rj4.item_nest_flight_sheet_birdle_icon ? 1 : 10;
                }
            }

            {
                m66760x3(new C15008a(this));
            }
        };
        getAdapter().m110998x(new C15006a());
    }

    @Override // p000.AbstractC29912wZ
    /* renamed from: d */
    public D33 getAdapter() {
        return this.f64260c;
    }

    @Override // p000.AbstractC29912wZ
    /* renamed from: e */
    public GridLayoutManager getLayoutManager() {
        return this.f64261d;
    }
}
