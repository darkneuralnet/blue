package p000;

import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23492o;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u001a\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t\u001a\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005*\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\t\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005*\u00020\u000e¨\u0006\u0010"}, m28432d2 = {"Landroid/widget/EditText;", "", "delay", "", "skipFirst", "Lio/reactivex/Observable;", "", "e", "Landroid/view/View;", "", "delayMillis", "", "c", DateTokenConverter.CONVERTER_KEY, "Landroid/view/MenuItem;", "b", "rx_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: lf5 */
/* loaded from: classes3.dex */
public final class C44626lf5 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lf5$a */
    /* loaded from: classes3.dex */
    public static final class C25758a extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C25758a f96524g = new C25758a();

        public C25758a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    /* renamed from: b */
    public static final Observable<Unit> m27018b(MenuItem menuItem) {
        Observable m83235b;
        Intrinsics.checkNotNullParameter(menuItem, "<this>");
        m83235b = C36100Te5.m83235b(menuItem, null, 1, null);
        Observable<Unit> observeOn = m83235b.debounce(500L, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "clicks()\n  .debounce(500…dSchedulers.mainThread())");
        return observeOn;
    }

    /* renamed from: c */
    public static final Observable<Unit> m27017c(View view, long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Observable<Unit> observeOn = C45219mf5.m25214a(view).throttleFirst(j, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "clicks()\n  .throttleFirs…dSchedulers.mainThread())");
        return observeOn;
    }

    public static /* synthetic */ Observable clicksThrottle$default(View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        return m27017c(view, j);
    }

    /* renamed from: d */
    public static final Observable<Unit> m27016d(View view, long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Observable<Unit> observeOn = C45219mf5.m25214a(view).debounce(j, TimeUnit.MILLISECONDS).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "clicks()\n  .debounce(del…dSchedulers.mainThread())");
        return observeOn;
    }

    public static /* synthetic */ Observable debounceClicks$default(View view, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 100;
        }
        return m27016d(view, j);
    }

    /* renamed from: e */
    public static final Observable<String> m27015e(EditText editText, int i, boolean z) {
        long j;
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Observable<CharSequence> debounce = C40475ef5.m42643d(editText).debounce(i, TimeUnit.MILLISECONDS);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        Observable<CharSequence> observeOn = debounce.skip(j).observeOn(C23454a.m33087a());
        final C25758a c25758a = C25758a.f96524g;
        Observable map = observeOn.map(new InterfaceC23492o() { // from class: kf5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m27014f;
                m27014f = C44626lf5.m27014f(Function1.this, obj);
                return m27014f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "textChanges()\n    .debou…   .map { it.toString() }");
        return map;
    }

    /* renamed from: f */
    public static final String m27014f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    public static /* synthetic */ Observable textChanges$default(EditText editText, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return m27015e(editText, i, z);
    }
}
