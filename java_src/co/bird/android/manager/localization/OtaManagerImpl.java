package co.bird.android.manager.localization;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.localization.OtaManagerImpl;
import co.bird.android.model.Detail;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.response.WireLocalizationOtaPullResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B;\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b3\u00104J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0003H\u0016J0\u0010\r\u001a\u00020\f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010(\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\b0\b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u00101¨\u00065"}, m28432d2 = {"Lco/bird/android/manager/localization/OtaManagerImpl;", "LLy3;", "LFq2;", "", "onAppCreated", "onAppForeground", "e", "", "", "", "oldTranslations", "newTranslations", "", "f", "LTq4;", "b", "LTq4;", "reactiveConfig", "LIv2;", "c", "LIv2;", "localizationClient", "LOh;", DateTokenConverter.CONVERTER_KEY, "LOh;", "appBuildConfig", "LLifecycleOwner;", "LLifecycleOwner;", "processLifecycleOwner", "Landroid/content/Context;", "Landroid/content/Context;", "appContext", "Le13;", "g", "Le13;", "navigator", "Lma4;", "kotlin.jvm.PlatformType", "h", "Lma4;", "refreshRelay", "i", "Ljava/lang/String;", "cachePrefix", "", "j", "I", "cacheBusterCount", "Lco/bird/android/model/wire/configs/Config;", "()Lco/bird/android/model/wire/configs/Config;", "config", "<init>", "(LTq4;LIv2;LOh;LLifecycleOwner;Landroid/content/Context;Le13;)V", "localization_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOtaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaManagerImpl.kt\nco/bird/android/manager/localization/OtaManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,153:1\n237#2:154\n215#3,2:155\n*S KotlinDebug\n*F\n+ 1 OtaManagerImpl.kt\nco/bird/android/manager/localization/OtaManagerImpl\n*L\n108#1:154\n145#1:155,2\n*E\n"})
/* loaded from: classes4.dex */
public final class OtaManagerImpl implements InterfaceC34406Ly3, InterfaceC32929Fq2 {

    /* renamed from: b */
    public final C36207Tq4 f66449b;

    /* renamed from: c */
    public final InterfaceC33676Iv2 f66450c;

    /* renamed from: d */
    public final InterfaceC6097Oh f66451d;

    /* renamed from: e */
    public final LifecycleOwner f66452e;

    /* renamed from: f */
    public final Context f66453f;

    /* renamed from: g */
    public final InterfaceC40099e13 f66454g;

    /* renamed from: h */
    public final C45168ma4<String> f66455h;

    /* renamed from: i */
    public final String f66456i;

    /* renamed from: j */
    public int f66457j;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "birdProjectId", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "e", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.manager.localization.OtaManagerImpl$a */
    /* loaded from: classes4.dex */
    public static final class C16186a extends Lambda implements Function1<String, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.manager.localization.OtaManagerImpl$a$a */
        /* loaded from: classes4.dex */
        public static final class C16187a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public static final C16187a f66459g = new C16187a();

            public C16187a() {
                super(1);
            }

            /* renamed from: a */
            public final void m55587a(InterfaceC23465c interfaceC23465c) {
                C41318g46.m40163a("calling ota/pull now.", new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m55587a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/WireLocalizationOtaPullResponse;", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireLocalizationOtaPullResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nOtaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaManagerImpl.kt\nco/bird/android/manager/localization/OtaManagerImpl$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
        /* renamed from: co.bird.android.manager.localization.OtaManagerImpl$a$b */
        /* loaded from: classes4.dex */
        public static final class C16188b extends Lambda implements Function1<WireLocalizationOtaPullResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public final /* synthetic */ OtaManagerImpl f66460g;

            @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "entry", "", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: co.bird.android.manager.localization.OtaManagerImpl$a$b$a */
            /* loaded from: classes4.dex */
            public static final class C16189a extends Lambda implements Function1<Map.Entry<? extends String, ? extends StringBuilder>, CharSequence> {

                /* renamed from: g */
                public static final C16189a f66461g = new C16189a();

                public C16189a() {
                    super(1);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final CharSequence invoke2(Map.Entry<String, StringBuilder> entry) {
                    Intrinsics.checkNotNullParameter(entry, "entry");
                    String key = entry.getKey();
                    StringBuilder value = entry.getValue();
                    String simpleName = Reflection.getOrCreateKotlinClass(entry.getValue().getClass()).getSimpleName();
                    if (simpleName == null) {
                        simpleName = "Unknown";
                    }
                    return ((Object) key) + " = '" + ((Object) value) + "' (type = " + simpleName + ")";
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends StringBuilder> entry) {
                    return invoke2((Map.Entry<String, StringBuilder>) entry);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16188b(OtaManagerImpl otaManagerImpl) {
                super(1);
                this.f66460g = otaManagerImpl;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
                r1 = kotlin.collections.MapsKt__MapsKt.toMap(r1);
             */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final InterfaceC24574u<? extends Unit> invoke(WireLocalizationOtaPullResponse it) {
                Locale locale;
                Map map;
                int i;
                String joinToString$default;
                Map emptyMap;
                Set<Map.Entry<String, Map<String, StringBuilder>>> entrySet;
                Object firstOrNull;
                Intrinsics.checkNotNullParameter(it, "it");
                C50711vv2 m7769e = C50711vv2.m7769e();
                String str = null;
                if (!(!m7769e.m7767g())) {
                    m7769e = null;
                }
                if (m7769e != null) {
                    locale = m7769e.m7771c(0);
                } else {
                    locale = null;
                }
                Map<String, Map<String, StringBuilder>> translations = it.getResponse().getTranslations();
                if (translations != null && (entrySet = translations.entrySet()) != null) {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull(entrySet);
                    Map.Entry entry = (Map.Entry) firstOrNull;
                    if (entry != null) {
                        map = (Map) entry.getValue();
                        if (locale == null && map != null) {
                            C41318g46.m40163a("OTA Pull - Updating " + map.size() + " translations for current locale " + locale.toLanguageTag(), new Object[0]);
                            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(map.entrySet(), null, null, null, 0, null, C16189a.f66461g, 31, null);
                            StringBuilder sb = new StringBuilder();
                            sb.append("Translations: ");
                            sb.append(joinToString$default);
                            C41318g46.m40163a(sb.toString(), new Object[0]);
                            Map<String, CharSequence> map2 = UM4.m81592d().mo29256c().get(locale);
                            if (map2 == null || emptyMap == null) {
                                emptyMap = MapsKt__MapsKt.emptyMap();
                            }
                            UM4.m81590f(locale, map);
                            if (this.f66460g.m55595f(emptyMap, map)) {
                                return AbstractC24507p.m32068G(Unit.INSTANCE);
                            }
                            return AbstractC24507p.m32024u();
                        }
                        if (map == null) {
                            i = map.size();
                        } else {
                            i = 0;
                        }
                        if (locale != null) {
                            str = locale.toLanguageTag();
                        }
                        C41318g46.m40163a("OTA Pull - " + i + " translations returned and inferred locale was '" + str + "', no translations were updated", new Object[0]);
                        return AbstractC24507p.m32024u();
                    }
                }
                map = null;
                if (locale == null) {
                }
                if (map == null) {
                }
                if (locale != null) {
                }
                C41318g46.m40163a("OTA Pull - " + i + " translations returned and inferred locale was '" + str + "', no translations were updated", new Object[0]);
                return AbstractC24507p.m32024u();
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nOtaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtaManagerImpl.kt\nco/bird/android/manager/localization/OtaManagerImpl$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
        /* renamed from: co.bird.android.manager.localization.OtaManagerImpl$a$c */
        /* loaded from: classes4.dex */
        public static final class C16190c extends Lambda implements Function1<Unit, Unit> {

            /* renamed from: g */
            public final /* synthetic */ OtaManagerImpl f66462g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16190c(OtaManagerImpl otaManagerImpl) {
                super(1);
                this.f66462g = otaManagerImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Unit unit) {
                Unit unit2;
                Window window;
                View findViewById;
                View rootView;
                C41318g46.m40163a("OTA Pull - calling reword", new Object[0]);
                Activity mo36934u3 = this.f66462g.f66454g.mo36934u3();
                if (mo36934u3 == null || (window = mo36934u3.getWindow()) == null || (findViewById = window.findViewById(16908290)) == null || (rootView = findViewById.getRootView()) == null) {
                    unit2 = null;
                } else {
                    C41318g46.m40163a("called reword on root view " + rootView, new Object[0]);
                    GO4.m105148b(rootView);
                    unit2 = Unit.INSTANCE;
                }
                if (unit2 == null) {
                    C41318g46.m40163a("OTA Pull - no activity root view found, reword not called. Next app restart will update strings.", new Object[0]);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.manager.localization.OtaManagerImpl$a$d */
        /* loaded from: classes4.dex */
        public static final class C16191d extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C16191d f66463g = new C16191d();

            public C16191d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C41318g46.m40161c(th, "Error while pulling latest OTA translations", new Object[0]);
            }
        }

        public C16186a() {
            super(1);
        }

        /* renamed from: f */
        public static final void m55589f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m55588g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC24574u invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC23496h invoke(String birdProjectId) {
            String str;
            Intrinsics.checkNotNullParameter(birdProjectId, "birdProjectId");
            C41318g46.m40163a("refreshing ota pulls for project " + birdProjectId, new Object[0]);
            InterfaceC33676Iv2 interfaceC33676Iv2 = OtaManagerImpl.this.f66450c;
            DateTime mo89924h = OtaManagerImpl.this.f66451d.mo89924h();
            if (OtaManagerImpl.this.m55597d().getLocalizationConfig().getOta().getEnableCacheBusting()) {
                String str2 = OtaManagerImpl.this.f66456i;
                OtaManagerImpl otaManagerImpl = OtaManagerImpl.this;
                int i = otaManagerImpl.f66457j;
                otaManagerImpl.f66457j = i + 1;
                str = str2 + Detail.EMPTY_CHAR + i;
            } else {
                str = null;
            }
            AbstractC23442F<WireLocalizationOtaPullResponse> m101480a = interfaceC33676Iv2.m101480a(birdProjectId, mo89924h, null, str);
            final C16187a c16187a = C16187a.f66459g;
            AbstractC23442F<WireLocalizationOtaPullResponse> m33138b0 = m101480a.m33102v(new InterfaceC23484g() { // from class: Ny3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    OtaManagerImpl.C16186a.invoke$lambda$0(Function1.this, obj);
                }
            }).m33138b0(30L, TimeUnit.SECONDS, C24542a.m31932c());
            final C16188b c16188b = new C16188b(OtaManagerImpl.this);
            AbstractC24507p m32066I = m33138b0.m33163C(new InterfaceC23492o() { // from class: Oy3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u invoke$lambda$1;
                    invoke$lambda$1 = OtaManagerImpl.C16186a.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            }).m32066I(C23454a.m33087a());
            final C16190c c16190c = new C16190c(OtaManagerImpl.this);
            AbstractC24507p m32026s = m32066I.m32026s(new InterfaceC23484g() { // from class: Py3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    OtaManagerImpl.C16186a.m55589f(Function1.this, obj);
                }
            });
            final C16191d c16191d = C16191d.f66463g;
            return m32026s.m32029p(new InterfaceC23484g() { // from class: Qy3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    OtaManagerImpl.C16186a.m55588g(Function1.this, obj);
                }
            }).m32069F().m33069Q();
        }
    }

    public OtaManagerImpl(C36207Tq4 reactiveConfig, InterfaceC33676Iv2 localizationClient, InterfaceC6097Oh appBuildConfig, LifecycleOwner processLifecycleOwner, Context appContext, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(localizationClient, "localizationClient");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f66449b = reactiveConfig;
        this.f66450c = localizationClient;
        this.f66451d = appBuildConfig;
        this.f66452e = processLifecycleOwner;
        this.f66453f = appContext;
        this.f66454g = navigator;
        C45168ma4<String> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<String>()");
        this.f66455h = m25409g;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f66456i = uuid;
        C41318g46.m40163a("otamanager adding process lifecycle owner now", new Object[0]);
        processLifecycleOwner.getLifecycle().mo67008a(this);
        Observable<String> observeOn = m25409g.observeOn(C24542a.m31932c());
        final C16186a c16186a = new C16186a();
        AbstractC23461c m33066T = observeOn.switchMapCompletable(new InterfaceC23492o() { // from class: My3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m55598b;
                m55598b = OtaManagerImpl.m55598b(Function1.this, obj);
                return m55598b;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "refreshRelay\n      .obse…()\n      }\n      .retry()");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: b */
    public static final InterfaceC23496h m55598b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final Config m55597d() {
        return this.f66449b.m82623f8().m73665a();
    }

    /* renamed from: e */
    public void m55596e() {
        String birdProjectId = m55597d().getLocalizationConfig().getOta().getBirdProjectId();
        if (m55597d().getLocalizationConfig().getOta().getEnabled() && birdProjectId != null) {
            this.f66455h.accept(birdProjectId);
        } else {
            C41318g46.m40163a("refreshLatestTranslations called but FF is not enabled or was missing bird project id", new Object[0]);
        }
    }

    /* renamed from: f */
    public final boolean m55595f(Map<String, ? extends CharSequence> map, Map<String, ? extends CharSequence> map2) {
        String str;
        Set<Map.Entry<String, ? extends CharSequence>> entrySet = map.entrySet();
        C41318g46.m40152l("oldTranslations: " + entrySet, new Object[0]);
        C41318g46.m40152l("newTranslations: " + map2, new Object[0]);
        if (map2.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, ? extends CharSequence> entry : map2.entrySet()) {
            String key = entry.getKey();
            CharSequence value = entry.getValue();
            if (map.containsKey(key)) {
                CharSequence charSequence = map.get(key);
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual(str, value.toString())) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_CREATE)
    public final void onAppCreated() {
        C41318g46.m40163a("onAppCreated called, initializing OTA Restring library", new Object[0]);
        UM4.m81591e(this.f66453f);
        C36461Us6.m80683b(HO4.f13334a);
    }

    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
    public final void onAppForeground() {
        C41318g46.m40163a("onAppForeground called, checking for latest ota strings if necessary", new Object[0]);
        m55596e();
    }
}
