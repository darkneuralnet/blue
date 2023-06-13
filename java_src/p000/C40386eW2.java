package p000;

import android.content.Intent;
import android.net.Uri;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LeW2;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "LjG2;", "LjG2;", "mainNavigator", "Le13;", "b", "Le13;", "navigator", "LAz6;", "c", "LAz6;", "webArchiveManager", "<init>", "(LjG2;Le13;LAz6;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eW2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40386eW2 implements MV0 {

    /* renamed from: a */
    public final C43207jG2 f78498a;

    /* renamed from: b */
    public final InterfaceC40099e13 f78499b;

    /* renamed from: c */
    public final InterfaceC31844Az6 f78500c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: eW2$a */
    /* loaded from: classes3.dex */
    public static final class C20060a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20060a f78501g = new C20060a();

        public C20060a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            throw new LV0();
        }
    }

    public C40386eW2(C43207jG2 mainNavigator, InterfaceC40099e13 navigator, InterfaceC31844Az6 webArchiveManager) {
        Intrinsics.checkNotNullParameter(mainNavigator, "mainNavigator");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(webArchiveManager, "webArchiveManager");
        this.f78498a = mainNavigator;
        this.f78499b = navigator;
        this.f78500c = webArchiveManager;
    }

    /* renamed from: e */
    public static final InterfaceC23496h m42820e(final C40386eW2 this$0, final String input) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(input, "$input");
        AbstractC23461c m33029z = this$0.f78500c.mo99404b(input).m33029z(new InterfaceC23478a() { // from class: cW2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C40386eW2.m42819f(C40386eW2.this, input);
            }
        });
        final C20060a c20060a = C20060a.f78501g;
        return m33029z.m33084B(new InterfaceC23484g() { // from class: dW2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C40386eW2.m42818g(Function1.this, obj);
            }
        });
    }

    /* renamed from: f */
    public static final void m42819f(C40386eW2 this$0, String input) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(input, "$input");
        this$0.f78499b.mo37027f0(input);
    }

    /* renamed from: g */
    public static final void m42818g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(Intent intent) {
        final String queryParameter;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        if (data != null && (queryParameter = data.getQueryParameter("page")) != null) {
            AbstractC23461c m33049i = this.f78498a.mo4134a(intent).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: bW2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m42820e;
                    m42820e = C40386eW2.m42820e(C40386eW2.this, queryParameter);
                    return m42820e;
                }
            }));
            Intrinsics.checkNotNullExpressionValue(m33049i, "mainNavigator.navigate(i…inkException() }\n      })");
            return m33049i;
        }
        AbstractC23461c m33080F = AbstractC23461c.m33080F(new NullPointerException("Motmot deeplink missing 'page' query string parameter"));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(NullPointerExcepti…query string parameter\"))");
        return m33080F;
    }
}
