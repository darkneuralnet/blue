package p000;

import android.content.Intent;
import android.os.Bundle;
import co.bird.android.model.UserRoleItemKt;
import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23484g;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LjG2;", "LMV0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/c;", C17296a.f69688o, "k", "i", "g", "Lgl;", "Lgl;", "preference", "Le13;", "b", "Le13;", "navigator", "<init>", "(Lgl;Le13;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jG2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43207jG2 implements MV0 {

    /* renamed from: a */
    public final C22454gl f92404a;

    /* renamed from: b */
    public final InterfaceC40099e13 f92405b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jG2$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C24764a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapMode.values().length];
            try {
                iArr[MapMode.RIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapMode.CHARGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapMode.OPERATOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MapMode.MERCHANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MapMode.SERVICE_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "extras", "", C17296a.f69688o, "(Landroid/os/Bundle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jG2$b */
    /* loaded from: classes3.dex */
    public static final class C24765b extends Lambda implements Function1<Bundle, Unit> {
        public C24765b() {
            super(1);
        }

        /* renamed from: a */
        public final void m30903a(Bundle bundle) {
            int i = bundle.getInt("co.bird.android.force_map_mode", -1);
            boolean z = false;
            if (i >= 0 && i < MapMode.values().length) {
                z = true;
            }
            if (z) {
                MapMode mapMode = MapMode.values()[i];
                C43207jG2.this.f92404a.m37548z(mapMode);
                C43207jG2.this.f92404a.m37732F2(UserRoleItemKt.toUserRoleItem(mapMode.toDefaultUserRole()));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Bundle bundle) {
            m30903a(bundle);
            return Unit.INSTANCE;
        }
    }

    public C43207jG2(C22454gl preference, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f92404a = preference;
        this.f92405b = navigator;
    }

    /* renamed from: h */
    public static final Unit m30910h(C43207jG2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f92405b.mo37072X0(false);
        this$0.f92405b.close();
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m30908j(C43207jG2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC40099e13.C19924a.goToOperator$default(this$0.f92405b, false, null, null, 6, null);
        this$0.f92405b.close();
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m30906l(C43207jG2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC40099e13.C19924a.goToRider$default(this$0.f92405b, false, false, null, 7, null);
        this$0.f92405b.close();
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final void m30905m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC23496h m30904n(C43207jG2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = C24764a.$EnumSwitchMapping$0[this$0.f92404a.m37571t0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new NotImplementedError(null, 1, null);
                    }
                    return this$0.m30911g();
                }
                return this$0.m30909i();
            }
            return this$0.m30907k();
        }
        return this$0.m30907k();
    }

    @Override // p000.MV0
    /* renamed from: a */
    public AbstractC23461c mo4134a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        AbstractC24507p m74545l0 = C37279Yf5.m74545l0(intent.getExtras());
        final C24765b c24765b = new C24765b();
        AbstractC23461c m33049i = m74545l0.m32026s(new InterfaceC23484g() { // from class: eG2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43207jG2.m30905m(Function1.this, obj);
            }
        }).m32069F().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: fG2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m30904n;
                m30904n = C43207jG2.m30904n(C43207jG2.this);
                return m30904n;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33049i, "override fun navigate(\n …()\n        }\n      })\n  }");
        return m33049i;
    }

    /* renamed from: g */
    public final AbstractC23461c m30911g() {
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: hG2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m30910h;
                m30910h = C43207jG2.m30910h(C43207jG2.this);
                return m30910h;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    navig…    navigator.close()\n  }");
        return m33078H;
    }

    /* renamed from: i */
    public final AbstractC23461c m30909i() {
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: gG2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m30908j;
                m30908j = C43207jG2.m30908j(C43207jG2.this);
                return m30908j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    navig…    navigator.close()\n  }");
        return m33078H;
    }

    /* renamed from: k */
    public final AbstractC23461c m30907k() {
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: iG2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m30906l;
                m30906l = C43207jG2.m30906l(C43207jG2.this);
                return m30906l;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    navig…    navigator.close()\n  }");
        return m33078H;
    }
}
