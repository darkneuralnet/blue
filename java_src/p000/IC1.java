package p000;

import android.content.Intent;
import android.net.Uri;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m28432d2 = {"LIC1;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "LV74;", "LV74;", "promoManager", "Le13;", "b", "Le13;", "navigator", "<init>", "(LV74;Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IC1 */
/* loaded from: classes3.dex */
public final class IC1 implements MV0 {

    /* renamed from: a */
    public final V74 f14802a;

    /* renamed from: b */
    public final InterfaceC40099e13 f14803b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", PaymentMethodOptionsParams.Blik.PARAM_CODE, "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IC1$a */
    /* loaded from: classes3.dex */
    public static final class C3404a extends Lambda implements Function1<String, InterfaceC23496h> {
        public C3404a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return IC1.this.f14802a.mo27793g(code).m33159G();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IC1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3405b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C3405b f14805b = new C3405b();

        public C3405b() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    public IC1(V74 promoManager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(promoManager, "promoManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f14802a = promoManager;
        this.f14803b = navigator;
    }

    /* renamed from: e */
    public static final InterfaceC23496h m102790e(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m102789f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m102788g(IC1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC40099e13.C19924a.goToRider$default(this$0.f14803b, false, false, null, 7, null);
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            str = data.getQueryParameter(PaymentMethodOptionsParams.Blik.PARAM_CODE);
        } else {
            str = null;
        }
        AbstractC24507p m74545l0 = C37279Yf5.m74545l0(str);
        final C3404a c3404a = new C3404a();
        AbstractC23461c m32074A = m74545l0.m32074A(new InterfaceC23492o() { // from class: FC1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m102790e;
                m102790e = IC1.m102790e(Function1.this, obj);
                return m102790e;
            }
        });
        final C3405b c3405b = C3405b.f14805b;
        AbstractC23461c m33029z = m32074A.m33084B(new InterfaceC23484g() { // from class: GC1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                IC1.m102789f(Function1.this, obj);
            }
        }).m33069Q().m33029z(new InterfaceC23478a() { // from class: HC1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                IC1.m102788g(IC1.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "override fun navigate(\n …r.goToRider()\n      }\n  }");
        return m33029z;
    }
}
