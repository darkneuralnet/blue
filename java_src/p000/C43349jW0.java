package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43349jW0;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00072\u00020\u0001:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002J\u0016\u0010\u0012\u001a\u00020\u0010*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R(\u0010%\u001a\u0004\u0018\u00010\u001e2\b\u0010\"\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010#\"\u0004\b\u001f\u0010$¨\u0006("}, m28432d2 = {"LjW0;", "LhW0;", "Landroid/content/Intent;", "intent", "Lio/reactivex/F;", "LcW0;", "b", "e", "", "c", "Landroid/net/Uri;", "outerLink", "LKV0;", "i", "innerLink", "h", "Landroid/net/Uri$Builder;", LegacyRepairType.OTHER_KEY, "g", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LKm1;", "LKm1;", "firebaseDynamicLinks", "LEa;", "LEa;", "analyticsManager", "Ljava/util/concurrent/atomic/AtomicReference;", "LoW0;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/atomic/AtomicReference;", "_currentDeeplinkType", "value", "()LoW0;", "(LoW0;)V", "currentDeeplinkType", "<init>", "(Landroid/content/Context;LKm1;LEa;)V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeeplinkManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeeplinkManagerImpl.kt\nco/bird/android/manager/deeplink/DeeplinkManagerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n1855#2:130\n1855#2,2:131\n1856#2:133\n*S KotlinDebug\n*F\n+ 1 DeeplinkManagerImpl.kt\nco/bird/android/manager/deeplink/DeeplinkManagerImpl\n*L\n121#1:130\n122#1:131,2\n121#1:133\n*E\n"})
/* renamed from: jW0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43349jW0 implements InterfaceC42163hW0 {

    /* renamed from: e */
    public static final C24913a f92858e = new C24913a(null);

    /* renamed from: a */
    public final Context f92859a;

    /* renamed from: b */
    public final AbstractC34062Km1 f92860b;

    /* renamed from: c */
    public final InterfaceC1880Ea f92861c;

    /* renamed from: d */
    public final AtomicReference<EnumC46314oW0> f92862d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LjW0$a;", "", "", "APPBOY_SOURCE", "Ljava/lang/String;", "BRAZE_SOURCE", "<init>", "()V", "deeplink_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jW0$a */
    /* loaded from: classes4.dex */
    public static final class C24913a {
        public /* synthetic */ C24913a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C24913a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "LcW0;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDeeplinkManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeeplinkManagerImpl.kt\nco/bird/android/manager/deeplink/DeeplinkManagerImpl$parseBrazeLink$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
    /* renamed from: jW0$b */
    /* loaded from: classes4.dex */
    public static final class C24914b extends Lambda implements Function1<InterfaceC23444H<AbstractC39181cW0>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Intent f92863g;

        /* renamed from: h */
        public final /* synthetic */ C43349jW0 f92864h;

        /* renamed from: i */
        public final /* synthetic */ Uri f92865i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24914b(Intent intent, C43349jW0 c43349jW0, Uri uri) {
            super(1);
            this.f92863g = intent;
            this.f92864h = c43349jW0;
            this.f92865i = uri;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<AbstractC39181cW0> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
            if (r1 != false) goto L11;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(InterfaceC23444H<AbstractC39181cW0> emitter) {
            boolean equals;
            boolean equals2;
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            String stringExtra = this.f92863g.getStringExtra("uri");
            Uri parse = stringExtra != null ? Uri.parse(stringExtra) : null;
            String stringExtra2 = this.f92863g.getStringExtra(Stripe3ds2AuthParams.FIELD_SOURCE);
            equals = StringsKt__StringsJVMKt.equals(stringExtra2, "Appboy", true);
            if (!equals) {
                equals2 = StringsKt__StringsJVMKt.equals(stringExtra2, "Braze", true);
            }
            if (parse != null) {
                emitter.onSuccess(new KV0(this.f92864h.m30411h(this.f92865i, parse), this.f92865i, parse));
                return;
            }
            emitter.onError(new Throwable("No Braze Link detected"));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "LcW0;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jW0$c */
    /* loaded from: classes4.dex */
    public static final class C24915c extends Lambda implements Function1<InterfaceC23444H<AbstractC39181cW0>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Intent f92867h;

        /* renamed from: i */
        public final /* synthetic */ Uri f92868i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24915c(Intent intent, Uri uri) {
            super(1);
            this.f92867h = intent;
            this.f92868i = uri;
        }

        /* renamed from: c */
        public static final void m30406c(C43349jW0 this$0, InterfaceC23444H emitter, Uri uri, Task dynamicLinkResult) {
            Intent intent;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(dynamicLinkResult, "dynamicLinkResult");
            try {
                C38537bQ3 c38537bQ3 = (C38537bQ3) dynamicLinkResult.getResult();
                Uri uri2 = null;
                if (c38537bQ3 != null) {
                    intent = c38537bQ3.m64541d(this$0.f92859a);
                } else {
                    intent = null;
                }
                if (intent != null) {
                    emitter.onSuccess(new C39273cf6(intent));
                    return;
                }
                if (c38537bQ3 != null) {
                    uri2 = c38537bQ3.m64544a();
                }
                emitter.onSuccess(new KV0(this$0.m30411h(uri, uri2), uri, uri2));
            } catch (Exception e) {
                C41318g46.m40159e(e);
                emitter.onSuccess(this$0.m30410i(uri));
            }
        }

        /* renamed from: d */
        public static final void m30405d(InterfaceC23444H emitter, C43349jW0 this$0, Uri uri, Exception it) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            C41318g46.m40159e(it);
            emitter.onSuccess(this$0.m30410i(uri));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<AbstractC39181cW0> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<AbstractC39181cW0> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            Task<C38537bQ3> mo96369b = C43349jW0.this.f92860b.mo96369b(this.f92867h);
            final C43349jW0 c43349jW0 = C43349jW0.this;
            final Uri uri = this.f92868i;
            Task<C38537bQ3> addOnCompleteListener = mo96369b.addOnCompleteListener(new OnCompleteListener() { // from class: kW0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C43349jW0.C24915c.m30406c(C43349jW0.this, emitter, uri, task);
                }
            });
            final C43349jW0 c43349jW02 = C43349jW0.this;
            final Uri uri2 = this.f92868i;
            addOnCompleteListener.addOnFailureListener(new OnFailureListener() { // from class: lW0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    C43349jW0.C24915c.m30405d(InterfaceC23444H.this, c43349jW02, uri2, exc);
                }
            });
        }
    }

    public C43349jW0(Context context, AbstractC34062Km1 firebaseDynamicLinks, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firebaseDynamicLinks, "firebaseDynamicLinks");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f92859a = context;
        this.f92860b = firebaseDynamicLinks;
        this.f92861c = analyticsManager;
        this.f92862d = new AtomicReference<>();
    }

    /* renamed from: j */
    public static final AbstractC39181cW0 m30409j(C43349jW0 this$0, Uri uri, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        C41318g46.m40159e(it);
        return this$0.m30410i(uri);
    }

    @Override // p000.InterfaceC42163hW0
    /* renamed from: a */
    public EnumC46314oW0 mo30418a() {
        return this.f92862d.get();
    }

    @Override // p000.InterfaceC42163hW0
    /* renamed from: b */
    public AbstractC23442F<AbstractC39181cW0> mo30417b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return C45832nh5.m23305k(new C24914b(intent, this, intent.getData()));
    }

    @Override // p000.InterfaceC42163hW0
    /* renamed from: c */
    public void mo30416c() {
        mo30415d(null);
    }

    @Override // p000.InterfaceC42163hW0
    /* renamed from: d */
    public void mo30415d(EnumC46314oW0 enumC46314oW0) {
        this.f92862d.set(enumC46314oW0);
    }

    @Override // p000.InterfaceC42163hW0
    /* renamed from: e */
    public AbstractC23442F<AbstractC39181cW0> mo30414e(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        final Uri data = intent.getData();
        AbstractC23442F<AbstractC39181cW0> m33149Q = C45832nh5.m23305k(new C24915c(intent, data)).m33149Q(new InterfaceC23492o() { // from class: iW0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                AbstractC39181cW0 m30409j;
                m30409j = C43349jW0.m30409j(C43349jW0.this, data, (Throwable) obj);
                return m30409j;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33149Q, "override fun parseDynami…nt(outerLink)\n      }\n  }");
        return m33149Q;
    }

    /* renamed from: g */
    public final Uri.Builder m30412g(Uri.Builder builder, Uri uri) {
        Set<String> queryParameterNames;
        if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null) {
            for (String str : queryParameterNames) {
                List<String> queryParameters = uri.getQueryParameters(str);
                Intrinsics.checkNotNullExpressionValue(queryParameters, "other.getQueryParameters(queryParamName)");
                for (String str2 : queryParameters) {
                    builder.appendQueryParameter(str, str2);
                }
            }
        }
        return builder;
    }

    /* renamed from: h */
    public final Uri m30411h(Uri uri, Uri uri2) {
        Uri.Builder buildUpon;
        boolean z = false;
        if (uri2 != null && uri2.isOpaque()) {
            z = true;
        }
        if (z) {
            return uri2;
        }
        if (uri2 != null && (buildUpon = uri2.buildUpon()) != null) {
            Uri.Builder clearQuery = buildUpon.clearQuery();
            Intrinsics.checkNotNullExpressionValue(clearQuery, "innerLink?.buildUpon() ?…Link)\n      .clearQuery()");
            return m30412g(m30412g(clearQuery, uri), uri2).build();
        }
        return uri;
    }

    /* renamed from: i */
    public final KV0 m30410i(Uri uri) {
        return new KV0(uri, uri, null);
    }
}
