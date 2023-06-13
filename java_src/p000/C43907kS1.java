package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.IdToolOption;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0006"}, m28432d2 = {"Lio/reactivex/Observable;", "", "Lco/bird/android/model/IdToolOption;", "option", "Lco/bird/android/buava/Optional;", "b", "servicecenter_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: kS1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43907kS1 {

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "enabled", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/IdToolOption;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: kS1$a */
    /* loaded from: classes3.dex */
    public static final class C25163a extends Lambda implements Function1<Boolean, Optional<IdToolOption>> {

        /* renamed from: g */
        public final /* synthetic */ IdToolOption f94399g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25163a(IdToolOption idToolOption) {
            super(1);
            this.f94399g = idToolOption;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<IdToolOption> invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            if (enabled.booleanValue()) {
                return Optional.f63040c.m59032c(this.f94399g);
            }
            return Optional.f63040c.m59034a();
        }
    }

    /* renamed from: b */
    public static final Observable<Optional<IdToolOption>> m28957b(Observable<Boolean> observable, IdToolOption idToolOption) {
        final C25163a c25163a = new C25163a(idToolOption);
        Observable map = observable.map(new InterfaceC23492o() { // from class: jS1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m28956c;
                m28956c = C43907kS1.m28956c(Function1.this, obj);
                return m28956c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "option: IdToolOption): O… else Optional.absent() }");
        return map;
    }

    /* renamed from: c */
    public static final Optional m28956c(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }
}
