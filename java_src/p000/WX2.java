package p000;

import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.WX2;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28432d2 = {"LWX2;", "", "Lio/reactivex/c;", "refresh", "", "birdId", "", "b", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/wire/WireBird;", C17296a.f69688o, "()Lio/reactivex/Observable;", "privateBirds", "isEmpty", "()Z", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WX2 */
/* loaded from: classes2.dex */
public interface WX2 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: WX2$a */
    /* loaded from: classes2.dex */
    public static final class C9078a {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lco/bird/android/model/wire/WireBird;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: WX2$a$a */
        /* loaded from: classes2.dex */
        public static final class C9079a extends Lambda implements Function1<List<? extends WireBird>, Boolean> {

            /* renamed from: g */
            public static final C9079a f41234g = new C9079a();

            public C9079a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(List<WireBird> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isEmpty());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(List<? extends WireBird> list) {
                return invoke2((List<WireBird>) list);
            }
        }

        /* renamed from: b */
        public static Boolean m78250b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        /* renamed from: c */
        public static boolean m78249c(WX2 wx2) {
            Observable<List<WireBird>> mo72986a = wx2.mo72986a();
            final C9079a c9079a = C9079a.f41234g;
            Object blockingFirst = mo72986a.map(new InterfaceC23492o() { // from class: VX2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m78250b;
                    m78250b = WX2.C9078a.m78250b(Function1.this, obj);
                    return m78250b;
                }
            }).blockingFirst();
            Intrinsics.checkNotNullExpressionValue(blockingFirst, "privateBirds.map { it.isEmpty() }.blockingFirst()");
            return ((Boolean) blockingFirst).booleanValue();
        }
    }

    /* renamed from: a */
    Observable<List<WireBird>> mo72986a();

    /* renamed from: b */
    boolean mo72985b(String str);

    boolean isEmpty();

    AbstractC23461c refresh();
}
