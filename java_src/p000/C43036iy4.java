package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DeliveryWindow;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0012"}, m28432d2 = {"Liy4;", "LxE;", "Lco/bird/android/model/DeliveryWindow;", "window", "", "Pl", "Lio/reactivex/Observable;", "doneClicks", "LIC2;", "b", "LIC2;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LIC2;)V", "c", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iy4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43036iy4 extends AbstractC30071xE {

    /* renamed from: c */
    public static final C24656a f91782c = new C24656a(null);

    /* renamed from: d */
    public static final int f91783d = 8;

    /* renamed from: e */
    public static final DateTimeFormatter f91784e = DateTimeFormat.forStyle("-S");

    /* renamed from: f */
    public static final DateTimeFormatter f91785f = DateTimeFormat.forStyle("L-");

    /* renamed from: b */
    public final IC2 f91786b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, m28432d2 = {"Liy4$a;", "", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "DATE_FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "TIME_FORMATTER", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: iy4$a */
    /* loaded from: classes2.dex */
    public static final class C24656a {
        public /* synthetic */ C24656a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C24656a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43036iy4(BaseActivity activity, IC2 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f91786b = binding;
    }

    /* renamed from: Pl */
    public final void m31545Pl(DeliveryWindow window) {
        Intrinsics.checkNotNullParameter(window, "window");
        String print = f91785f.print(window.getStart());
        DateTimeFormatter dateTimeFormatter = f91784e;
        this.f91786b.f14808c.setText(getActivity().getString(C45871nl4.long_term_rental_pickup_confirmed_message, print, dateTimeFormatter.print(window.getStart()), dateTimeFormatter.print(window.getEnd()), window.getAddress()));
    }

    public final Observable<Unit> doneClicks() {
        return this.f91786b.f14807b.m54693b();
    }
}
