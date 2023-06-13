package p000;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.identification.IdentificationDebugResponse;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationEntry;
import co.bird.android.model.identification.IdentificationEntryMethod;
import co.bird.android.model.identification.IdentificationIngestionResult;
import co.bird.android.model.identification.IdentificationIntentPermissionStatus;
import co.bird.android.model.identification.IdentificationManualEntryFormData;
import co.bird.android.model.identification.IdentificationRejectionReason;
import co.bird.android.model.identification.IdentificationRequestIdentifier;
import co.bird.android.model.identification.IdentificationSelfieEntryMethod;
import co.bird.android.model.identification.IdentificationStatus;
import co.bird.android.model.identification.IdentificationSubmissionData;
import co.bird.android.model.identification.IdentificationSubmissionDataKt;
import co.bird.api.request.WireIdentificationIntentPermissionRequest;
import co.bird.api.request.WireIdentificationSubmitRequest;
import co.bird.api.response.WireIdentificationIntentPermissionResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.FilesKt__FileReadWriteKt;
import kotlin.p053io.FilesKt__UtilsKt;
import kotlin.text.Charsets;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import p000.C2029Ey;
import p000.C37791a94;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 e2\u00020\u0001:\u0002(2B1\b\u0007\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00100\u001a\u00020.\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010:\u001a\u000208¢\u0006\u0004\bc\u0010dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u0004\u0018\u00010\n*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\nH\u0002J\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0016Jb\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001e\u001a\u00020\bH\u0016J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0016J\u001e\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00072\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0016J\b\u0010(\u001a\u00020\u0002H\u0016J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0007H\u0016R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010;R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R \u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010@R&\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040>0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b?\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020J0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010@R \u0010M\u001a\b\u0012\u0004\u0012\u00020J0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\b2\u0010HR\u0018\u0010P\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010SR\u0014\u0010X\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010SR\u0018\u0010\\\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010]R\u0016\u0010`\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010_R\u0014\u0010b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010a¨\u0006f"}, m28432d2 = {"LAT1;", "LmT1;", "", "z", "LZV1;", TransferTable.COLUMN_STATE, "D", "LoU1;", "Lco/bird/android/model/identification/IdentificationSubmissionData;", "P", "", "debugJson", "E", "O", "Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "Lco/bird/api/request/WireIdentificationIntentPermissionRequest;", "Q", "identifier", "Lio/reactivex/F;", "i", "Lco/bird/android/model/identification/IdentificationEntryMethod;", "documentEntryMethod", "Lco/bird/android/model/identification/IdentificationDocumentType;", "documentType", "Lco/bird/android/model/identification/IdentificationSelfieEntryMethod;", "selfieEntryMethod", "stateCode", "countryCode", "regionCode", "service", "submissionData", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/identification/IdentificationManualEntryFormData;", "formData", "e", "partialSubmissionData", "Lkotlin/Function0;", "onSubscribe", "k", "b", "f", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LdT1;", "LdT1;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LOh;", "c", "LOh;", "buildConfig", "Lwi2;", "Lwi2;", "deserializer", "LEa;", "LEa;", "analyticsManager", "Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "mutableCurrentSessionIdentifier", "La94;", "Lco/bird/android/buava/Optional;", "g", "La94;", "uploadingInBackgroundIdentificationStatusRelay", "h", "apiResponseIdentificationStatusRelay", "mutableIdentificationStatus", "LZ84;", "j", "LZ84;", "()LZ84;", "identificationStatuses", "LbT1;", "mutableBackgroundSubmissionStates", "l", "backgroundSubmissionStates", "m", "LoU1;", "mutableCurrentPartialSubmissionData", "", "n", "Ljava/lang/Object;", "sessionLock", "o", "submissionLock", "p", "dateTimeLock", "Lorg/joda/time/DateTime;", "q", "Lorg/joda/time/DateTime;", "lastSubmissionDateTime", "()Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "currentSessionIdentifier", "()LoU1;", "currentPartialSubmissionData", "()Ljava/lang/String;", "imageCacheDirectoryPath", "<init>", "(Landroid/content/Context;LdT1;LOh;Lwi2;LEa;)V", "r", "co.bird.android.manager.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdentificationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManagerImpl.kt\nco/bird/android/manager/identification/IdentificationManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,423:1\n180#2:424\n1#3:425\n1#3:436\n1#3:449\n1#3:462\n1#3:475\n1603#4,9:426\n1855#4:435\n1856#4:437\n1612#4:438\n1603#4,9:439\n1855#4:448\n1856#4:450\n1612#4:451\n1603#4,9:452\n1855#4:461\n1856#4:463\n1612#4:464\n1603#4,9:465\n1855#4:474\n1856#4:476\n1612#4:477\n*S KotlinDebug\n*F\n+ 1 IdentificationManagerImpl.kt\nco/bird/android/manager/identification/IdentificationManagerImpl\n*L\n97#1:424\n363#1:436\n364#1:449\n365#1:462\n366#1:475\n363#1:426,9\n363#1:435\n363#1:437\n363#1:438\n364#1:439,9\n364#1:448\n364#1:450\n364#1:451\n365#1:452,9\n365#1:461\n365#1:463\n365#1:464\n366#1:465,9\n366#1:474\n366#1:476\n366#1:477\n*E\n"})
/* renamed from: AT1 */
/* loaded from: classes4.dex */
public final class AT1 implements InterfaceC45102mT1 {

    /* renamed from: r */
    public static final C0095b f578r = new C0095b(null);

    /* renamed from: a */
    public final Context f579a;

    /* renamed from: b */
    public final InterfaceC39766dT1 f580b;

    /* renamed from: c */
    public final InterfaceC6097Oh f581c;

    /* renamed from: d */
    public final C51174wi2 f582d;

    /* renamed from: e */
    public final InterfaceC1880Ea f583e;

    /* renamed from: f */
    public IdentificationRequestIdentifier f584f;

    /* renamed from: g */
    public final C37791a94<Optional<ZV1>> f585g;

    /* renamed from: h */
    public final C37791a94<Optional<ZV1>> f586h;

    /* renamed from: i */
    public final C37791a94<Optional<ZV1>> f587i;

    /* renamed from: j */
    public final Z84<Optional<ZV1>> f588j;

    /* renamed from: k */
    public final C37791a94<AbstractC38562bT1> f589k;

    /* renamed from: l */
    public final Z84<AbstractC38562bT1> f590l;

    /* renamed from: m */
    public C46297oU1 f591m;

    /* renamed from: n */
    public final Object f592n;

    /* renamed from: o */
    public final Object f593o;

    /* renamed from: p */
    public final Object f594p;

    /* renamed from: q */
    public DateTime f595q;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LZV1;", "api", "uploading", C17296a.f69688o, "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIdentificationManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentificationManagerImpl.kt\nco/bird/android/manager/identification/IdentificationManagerImpl$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,423:1\n1#2:424\n*E\n"})
    /* renamed from: AT1$a */
    /* loaded from: classes4.dex */
    public static final class C0094a extends Lambda implements Function2<Optional<ZV1>, Optional<ZV1>, Optional<ZV1>> {

        /* renamed from: g */
        public static final C0094a f596g = new C0094a();

        public C0094a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Optional<ZV1> invoke(Optional<ZV1> api, Optional<ZV1> uploading) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(uploading, "uploading");
            if (!uploading.m59037c()) {
                uploading = null;
            }
            if (uploading != null) {
                return uploading;
            }
            return api;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LAT1$b;", "", "", "MAX_ASYNC_UPLOAD_TIME_SECONDS", "J", "<init>", "()V", "co.bird.android.manager.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: AT1$b */
    /* loaded from: classes4.dex */
    public static final class C0095b {
        public /* synthetic */ C0095b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0095b() {
        }
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0082\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001a\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, m28432d2 = {"LAT1$c;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/identification/IdentificationDocumentType;", "documentType", "Lco/bird/android/model/identification/IdentificationDocumentType;", "getDocumentType", "()Lco/bird/android/model/identification/IdentificationDocumentType;", "", "score", "D", "getScore", "()D", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "ingestionResult", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "getIngestionResult", "()Lco/bird/android/model/identification/IdentificationIngestionResult;", "expirationDate", "Ljava/lang/String;", "getExpirationDate", "()Ljava/lang/String;", "birthdayDate", "getBirthdayDate", "stateCode", "getStateCode", "countryCode", "getCountryCode", "regionCode", "getRegionCode", "secondsToResult", "I", "getSecondsToResult", "()I", "<init>", "(Lco/bird/android/model/identification/IdentificationDocumentType;DLco/bird/android/model/identification/IdentificationIngestionResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "co.bird.android.manager.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: AT1$c */
    /* loaded from: classes4.dex */
    public static final class C0096c {
        @JsonProperty("birthday_date")
        @InterfaceC41208ft5("birthday_date")
        private final String birthdayDate;
        @JsonProperty("country_code")
        @InterfaceC41208ft5("country_code")
        private final String countryCode;
        @JsonProperty("document_type")
        @InterfaceC41208ft5("document_type")
        private final IdentificationDocumentType documentType;
        @JsonProperty("expiration_date")
        @InterfaceC41208ft5("expiration_date")
        private final String expirationDate;
        @JsonProperty("ingestion_result")
        @InterfaceC41208ft5("ingestion_result")
        private final IdentificationIngestionResult ingestionResult;
        @JsonProperty("region_code")
        @InterfaceC41208ft5("region_code")
        private final String regionCode;
        @JsonProperty("score")
        @InterfaceC41208ft5("score")
        private final double score;
        @JsonProperty("seconds_to_result")
        @InterfaceC41208ft5("seconds_to_result")
        private final int secondsToResult;
        @JsonProperty("state_code")
        @InterfaceC41208ft5("state_code")
        private final String stateCode;

        public C0096c(IdentificationDocumentType documentType, double d, IdentificationIngestionResult ingestionResult, String expirationDate, String birthdayDate, String str, String str2, String str3, int i) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            Intrinsics.checkNotNullParameter(ingestionResult, "ingestionResult");
            Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
            Intrinsics.checkNotNullParameter(birthdayDate, "birthdayDate");
            this.documentType = documentType;
            this.score = d;
            this.ingestionResult = ingestionResult;
            this.expirationDate = expirationDate;
            this.birthdayDate = birthdayDate;
            this.stateCode = str;
            this.countryCode = str2;
            this.regionCode = str3;
            this.secondsToResult = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0096c) {
                C0096c c0096c = (C0096c) obj;
                return this.documentType == c0096c.documentType && Double.compare(this.score, c0096c.score) == 0 && this.ingestionResult == c0096c.ingestionResult && Intrinsics.areEqual(this.expirationDate, c0096c.expirationDate) && Intrinsics.areEqual(this.birthdayDate, c0096c.birthdayDate) && Intrinsics.areEqual(this.stateCode, c0096c.stateCode) && Intrinsics.areEqual(this.countryCode, c0096c.countryCode) && Intrinsics.areEqual(this.regionCode, c0096c.regionCode) && this.secondsToResult == c0096c.secondsToResult;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((((((this.documentType.hashCode() * 31) + Double.hashCode(this.score)) * 31) + this.ingestionResult.hashCode()) * 31) + this.expirationDate.hashCode()) * 31) + this.birthdayDate.hashCode()) * 31;
            String str = this.stateCode;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.countryCode;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.regionCode;
            return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.secondsToResult);
        }

        public String toString() {
            IdentificationDocumentType identificationDocumentType = this.documentType;
            double d = this.score;
            IdentificationIngestionResult identificationIngestionResult = this.ingestionResult;
            String str = this.expirationDate;
            String str2 = this.birthdayDate;
            String str3 = this.stateCode;
            String str4 = this.countryCode;
            String str5 = this.regionCode;
            int i = this.secondsToResult;
            return "IdentificationCardBirdScanTestDebug(documentType=" + identificationDocumentType + ", score=" + d + ", ingestionResult=" + identificationIngestionResult + ", expirationDate=" + str + ", birthdayDate=" + str2 + ", stateCode=" + str3 + ", countryCode=" + str4 + ", regionCode=" + str5 + ", secondsToResult=" + i + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AT1$d */
    /* loaded from: classes4.dex */
    public static final class C0097d extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: h */
        public final /* synthetic */ IdentificationRequestIdentifier f598h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0097d(IdentificationRequestIdentifier identificationRequestIdentifier) {
            super(1);
            this.f598h = identificationRequestIdentifier;
        }

        /* renamed from: a */
        public final void m115742a(InterfaceC23465c interfaceC23465c) {
            Object obj = AT1.this.f592n;
            AT1 at1 = AT1.this;
            IdentificationRequestIdentifier identificationRequestIdentifier = this.f598h;
            synchronized (obj) {
                at1.f584f = identificationRequestIdentifier;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m115742a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireIdentificationIntentPermissionResponse;", "response", "LZV1;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireIdentificationIntentPermissionResponse;)LZV1;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AT1$e */
    /* loaded from: classes4.dex */
    public static final class C0098e extends Lambda implements Function1<WireIdentificationIntentPermissionResponse, ZV1> {

        /* renamed from: g */
        public final /* synthetic */ IdentificationRequestIdentifier f599g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0098e(IdentificationRequestIdentifier identificationRequestIdentifier) {
            super(1);
            this.f599g = identificationRequestIdentifier;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ZV1 invoke(WireIdentificationIntentPermissionResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new ZV1(this.f599g, BT1.m114009e(response));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZV1;", "kotlin.jvm.PlatformType", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(LZV1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AT1$f */
    /* loaded from: classes4.dex */
    public static final class C0099f extends Lambda implements Function1<ZV1, Unit> {
        public C0099f() {
            super(1);
        }

        /* renamed from: a */
        public final void m115740a(ZV1 state) {
            C37791a94 c37791a94 = AT1.this.f586h;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(state, "state");
            c37791a94.accept(c14443a.m59032c(state));
            if (!((Optional) AT1.this.f585g.getValue()).m59037c()) {
                AT1.this.f587i.accept(c14443a.m59032c(state));
            }
            AT1.this.m115772D(state);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ZV1 zv1) {
            m115740a(zv1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AT1$g */
    /* loaded from: classes4.dex */
    public static final class C0100g extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C0100g f601g = new C0100g();

        public C0100g() {
            super(1);
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

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/WireIdentificationIntentPermissionResponse;", "response", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/WireIdentificationIntentPermissionResponse;)Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AT1$h */
    /* loaded from: classes4.dex */
    public static final class C0101h extends Lambda implements Function1<WireIdentificationIntentPermissionResponse, IdentificationIntentPermissionStatus> {

        /* renamed from: g */
        public static final C0101h f602g = new C0101h();

        public C0101h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final IdentificationIntentPermissionStatus invoke(WireIdentificationIntentPermissionResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return BT1.m114009e(response);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AT1$i */
    /* loaded from: classes4.dex */
    public static final class C0102i extends Lambda implements Function1<IdentificationIntentPermissionStatus, Unit> {

        /* renamed from: h */
        public final /* synthetic */ IdentificationRequestIdentifier f604h;

        /* renamed from: i */
        public final /* synthetic */ IdentificationDocumentType f605i;

        /* renamed from: j */
        public final /* synthetic */ IdentificationEntryMethod f606j;

        /* renamed from: k */
        public final /* synthetic */ IdentificationSelfieEntryMethod f607k;

        /* renamed from: l */
        public final /* synthetic */ String f608l;

        /* renamed from: m */
        public final /* synthetic */ String f609m;

        /* renamed from: n */
        public final /* synthetic */ String f610n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0102i(IdentificationRequestIdentifier identificationRequestIdentifier, IdentificationDocumentType identificationDocumentType, IdentificationEntryMethod identificationEntryMethod, IdentificationSelfieEntryMethod identificationSelfieEntryMethod, String str, String str2, String str3) {
            super(1);
            this.f604h = identificationRequestIdentifier;
            this.f605i = identificationDocumentType;
            this.f606j = identificationEntryMethod;
            this.f607k = identificationSelfieEntryMethod;
            this.f608l = str;
            this.f609m = str2;
            this.f610n = str3;
        }

        /* renamed from: a */
        public final void m115738a(IdentificationIntentPermissionStatus status) {
            String str;
            C37791a94 c37791a94 = AT1.this.f586h;
            Optional.C14443a c14443a = Optional.f63040c;
            IdentificationRequestIdentifier identificationRequestIdentifier = this.f604h;
            Intrinsics.checkNotNullExpressionValue(status, "status");
            c37791a94.accept(c14443a.m59032c(new ZV1(identificationRequestIdentifier, status)));
            Object obj = AT1.this.f594p;
            AT1 at1 = AT1.this;
            synchronized (obj) {
                at1.f595q = DateTime.now();
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC1880Ea interfaceC1880Ea = AT1.this.f583e;
            IdentificationDocumentType identificationDocumentType = this.f605i;
            String str2 = (identificationDocumentType == null || (r0 = identificationDocumentType.toWire()) == null) ? "unknown" : "unknown";
            String wire = this.f606j.toWire();
            IdentificationSelfieEntryMethod identificationSelfieEntryMethod = this.f607k;
            if (identificationSelfieEntryMethod != null) {
                str = identificationSelfieEntryMethod.toWire();
            } else {
                str = null;
            }
            interfaceC1880Ea.mo55905y(new ZP1(null, null, null, str2, wire, str, this.f608l, this.f609m, this.f610n, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
            m115738a(identificationIntentPermissionStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/identification/IdentificationRequestIdentifier;", "Lco/bird/android/model/identification/IdentificationEntryMethod;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AT1$j */
    /* loaded from: classes4.dex */
    public static final class C0103j extends Lambda implements Function1<Pair<? extends IdentificationRequestIdentifier, ? extends IdentificationEntryMethod>, InterfaceC23447K<? extends IdentificationIntentPermissionStatus>> {

        /* renamed from: h */
        public final /* synthetic */ C46297oU1 f612h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0103j(C46297oU1 c46297oU1) {
            super(1);
            this.f612h = c46297oU1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends IdentificationIntentPermissionStatus> invoke(Pair<IdentificationRequestIdentifier, ? extends IdentificationEntryMethod> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return AT1.this.mo25565d(pair.component1(), pair.component2(), this.f612h.m21015d(), this.f612h.m21017b().getSelfieEntryMethod(), null, this.f612h.m21014e().getCountry(), null, null, AT1.this.m115760P(this.f612h)).m33146T(3L);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AT1$k */
    /* loaded from: classes4.dex */
    public static final class C0104k extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C0104k() {
            super(1);
        }

        /* renamed from: a */
        public final void m115736a(InterfaceC23465c interfaceC23465c) {
            ZV1 zv1 = new ZV1(null, new IdentificationIntentPermissionStatus(IdentificationStatus.PENDING, null, null, null, null, null, 62, null));
            C37791a94 c37791a94 = AT1.this.f585g;
            Optional.C14443a c14443a = Optional.f63040c;
            c37791a94.accept(c14443a.m59032c(zv1));
            AT1.this.f587i.accept(c14443a.m59032c(zv1));
            C41318g46.m40163a("submitting request now", new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m115736a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AT1$l */
    /* loaded from: classes4.dex */
    public static final class C0105l extends Lambda implements Function1<InterfaceC23465c, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function0<Unit> f614g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0105l(Function0<Unit> function0) {
            super(1);
            this.f614g = function0;
        }

        /* renamed from: a */
        public final void m115735a(InterfaceC23465c interfaceC23465c) {
            this.f614g.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m115735a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AT1$m */
    /* loaded from: classes4.dex */
    public static final class C0106m extends Lambda implements Function1<IdentificationIntentPermissionStatus, Unit> {
        public C0106m() {
            super(1);
        }

        /* renamed from: a */
        public final void m115734a(IdentificationIntentPermissionStatus status) {
            AT1.this.f589k.accept(C39155cT1.f60687a);
            C37791a94 c37791a94 = AT1.this.f586h;
            Optional.C14443a c14443a = Optional.f63040c;
            Intrinsics.checkNotNullExpressionValue(status, "status");
            c37791a94.accept(c14443a.m59032c(new ZV1(null, status)));
            AT1.this.m115744z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IdentificationIntentPermissionStatus identificationIntentPermissionStatus) {
            m115734a(identificationIntentPermissionStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AT1$n */
    /* loaded from: classes4.dex */
    public static final class C0107n extends Lambda implements Function1<Throwable, Unit> {
        public C0107n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            AT1.this.f589k.accept(new ZS1(null, th, 1, null));
            AT1.this.m115744z();
            C41318g46.m40158f(th, "Failed to submit identification submission, closing anyways", new Object[0]);
        }
    }

    public AT1(Context context, InterfaceC39766dT1 client, InterfaceC6097Oh buildConfig, C51174wi2 deserializer, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(buildConfig, "buildConfig");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f579a = context;
        this.f580b = client;
        this.f581c = buildConfig;
        this.f582d = deserializer;
        this.f583e = analyticsManager;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        C37791a94<Optional<ZV1>> create$default = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f585g = create$default;
        C37791a94<Optional<ZV1>> create$default2 = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f586h = create$default2;
        C37791a94<Optional<ZV1>> create$default3 = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f587i = create$default3;
        Z84.C10119a c10119a = Z84.f47888d;
        this.f588j = c10119a.m73663b(create$default3);
        C37791a94<AbstractC38562bT1> create$default4 = C37791a94.C10586a.create$default(c10586a, C37969aT1.f50509a, null, 2, null);
        this.f589k = create$default4;
        this.f590l = c10119a.m73663b(create$default4);
        this.f592n = new Object();
        this.f593o = new Object();
        this.f594p = new Object();
        final C0094a c0094a = C0094a.f596g;
        Observable combineLatest = Observable.combineLatest(create$default2, create$default, new InterfaceC23480c() { // from class: wT1
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Optional m115745y;
                m115745y = AT1.m115745y(Function2.this, obj, obj2);
                return m115745y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(\n      api…{ it.isPresent } ?: api }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe(create$default3);
    }

    /* renamed from: A */
    public static final void m115775A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final ZV1 m115774B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (ZV1) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m115773C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m115770F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final IdentificationIntentPermissionStatus m115769G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (IdentificationIntentPermissionStatus) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m115768H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final Pair m115767I(AT1 this$0, C46297oU1 partialSubmissionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(partialSubmissionData, "$partialSubmissionData");
        IdentificationRequestIdentifier mo25559j = this$0.mo25559j();
        if (mo25559j != null) {
            IdentificationEntryMethod documentEntryMethod = partialSubmissionData.m21017b().getDocumentEntryMethod();
            if (documentEntryMethod != null) {
                return TuplesKt.m28425to(mo25559j, documentEntryMethod);
            }
            throw new NullPointerException("Entry method not found while submitting for review in background");
        }
        throw new NullPointerException("No current session identifier found while submitting for review in background");
    }

    /* renamed from: J */
    public static final InterfaceC23447K m115766J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m115765K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m115764L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m115763M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m115762N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final Optional m115745y(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj, obj2);
    }

    /* renamed from: D */
    public final void m115772D(ZV1 zv1) {
        DateTime dateTime;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        IdentificationIngestionResult ingestionResult;
        String wire;
        boolean z;
        String name;
        IdentificationSelfieEntryMethod selfieEntryMethod;
        IdentificationEntryMethod documentEntryMethod;
        IdentificationDocumentType documentType;
        synchronized (this.f594p) {
            dateTime = this.f595q;
        }
        if (dateTime != null && zv1.m73012b().getStatus() != IdentificationStatus.PENDING) {
            synchronized (this.f594p) {
                this.f595q = null;
                Unit unit = Unit.INSTANCE;
            }
            InterfaceC1880Ea interfaceC1880Ea = this.f583e;
            IdentificationEntry idCard = zv1.m73012b().getIdCard();
            String str8 = (idCard == null || (documentType = idCard.getDocumentType()) == null || (r4 = documentType.toWire()) == null) ? "unknown" : "unknown";
            IdentificationEntry idCard2 = zv1.m73012b().getIdCard();
            String str9 = (idCard2 == null || (documentEntryMethod = idCard2.getDocumentEntryMethod()) == null || (r4 = documentEntryMethod.toWire()) == null) ? "unknown" : "unknown";
            IdentificationEntry idCard3 = zv1.m73012b().getIdCard();
            if (idCard3 != null && (selfieEntryMethod = idCard3.getSelfieEntryMethod()) != null) {
                str = selfieEntryMethod.toWire();
            } else {
                str = null;
            }
            IdentificationEntry idCard4 = zv1.m73012b().getIdCard();
            if (idCard4 != null) {
                str2 = idCard4.getStateCode();
            } else {
                str2 = null;
            }
            IdentificationEntry idCard5 = zv1.m73012b().getIdCard();
            if (idCard5 != null) {
                str3 = idCard5.getCountryCode();
            } else {
                str3 = null;
            }
            IdentificationEntry idCard6 = zv1.m73012b().getIdCard();
            if (idCard6 != null) {
                str4 = idCard6.getRegionCode();
            } else {
                str4 = null;
            }
            IdentificationEntry idCard7 = zv1.m73012b().getIdCard();
            if (idCard7 != null) {
                str5 = idCard7.getId();
            } else {
                str5 = null;
            }
            String name2 = zv1.m73012b().getStatus().name();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = name2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            IdentificationRejectionReason rejectionReason = zv1.m73012b().getRejectionReason();
            if (rejectionReason != null && (name = rejectionReason.name()) != null) {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
                str6 = name.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(str6, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str6 = null;
            }
            IdentificationEntry idCard8 = zv1.m73012b().getIdCard();
            if (idCard8 != null && (ingestionResult = idCard8.getIngestionResult()) != null && (wire = ingestionResult.toWire()) != null) {
                if (zv1.m73012b().getRejectionReason() == IdentificationRejectionReason.INGESTION_FAILURE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str7 = wire;
                    DateTime now = DateTime.now();
                    Intrinsics.checkNotNullExpressionValue(now, "now()");
                    interfaceC1880Ea.mo55905y(new YP1(null, null, null, str8, str9, str, str2, str3, str4, str5, lowerCase, str6, str7, C46880pT0.m19253i(now, dateTime), 7, null));
                }
            }
            str7 = null;
            DateTime now2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now2, "now()");
            interfaceC1880Ea.mo55905y(new YP1(null, null, null, str8, str9, str, str2, str3, str4, str5, lowerCase, str6, str7, C46880pT0.m19253i(now2, dateTime), 7, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
        if (r4 == null) goto L7;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m115771E(String str, String str2) {
        byte[] readBytes;
        if (str2 != null) {
            readBytes = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(readBytes, "this as java.lang.String).getBytes(charset)");
        }
        try {
            readBytes = FilesKt__FileReadWriteKt.readBytes(new File(Uri.parse(str).getPath()));
            return C2029Ey.m108181b().m108172e(readBytes);
        } catch (Exception e) {
            C41318g46.m40158f(e, "Failed to prepare " + str + " for upload, was not a valid Uri.", new Object[0]);
            return null;
        }
    }

    /* renamed from: O */
    public final String m115761O(String str) {
        C2029Ey.C2031b m108181b = C2029Ey.m108181b();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return m108181b.m108172e(bytes);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, "bird_scan_test") != false) goto L8;
     */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentificationSubmissionData m115760P(C46297oU1 c46297oU1) {
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str2;
        Object firstOrNull;
        IdentificationDebugResponse m21016c = c46297oU1.m21016c();
        ArrayList arrayList4 = null;
        if (m21016c != null) {
            IdentificationDocumentType m21015d = c46297oU1.m21015d();
            double score = m21016c.getScore();
            IdentificationIngestionResult ingestionResult = m21016c.getIngestionResult();
            String print = ISODateTimeFormat.dateTime().print(DateTime.now().plusDays(m21016c.getExpirationDays()));
            Intrinsics.checkNotNullExpressionValue(print, "dateTime().print(DateTim…ys(debug.expirationDays))");
            String print2 = ISODateTimeFormat.dateTime().print(DateTime.now().minusYears(m21016c.getUserAge()));
            Intrinsics.checkNotNullExpressionValue(print2, "dateTime().print(DateTim…inusYears(debug.userAge))");
            str = this.f582d.m6453i(new C0096c(m21015d, score, ingestionResult, print, print2, null, c46297oU1.m21014e().getCountry(), null, m21016c.getSecondsToResult()));
            List<String> services = c46297oU1.m21017b().getServices();
            if (services != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) services);
                str2 = (String) firstOrNull;
            } else {
                str2 = null;
            }
        }
        str = null;
        IdentificationSubmissionData m21013f = c46297oU1.m21013f();
        List<String> documentBack = c46297oU1.m21013f().getDocumentBack();
        if (documentBack != null) {
            ArrayList arrayList5 = new ArrayList();
            for (String str3 : documentBack) {
                String m115771E = m115771E(str3, str);
                if (m115771E != null) {
                    arrayList5.add(m115771E);
                }
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        List<String> documentFront = c46297oU1.m21013f().getDocumentFront();
        if (documentFront != null) {
            arrayList2 = new ArrayList();
            for (String str4 : documentFront) {
                String m115771E2 = m115771E(str4, str);
                if (m115771E2 != null) {
                    arrayList2.add(m115771E2);
                }
            }
        } else {
            arrayList2 = null;
        }
        List<String> selfiePhoto = c46297oU1.m21013f().getSelfiePhoto();
        if (selfiePhoto != null) {
            arrayList3 = new ArrayList();
            for (String str5 : selfiePhoto) {
                String m115771E3 = m115771E(str5, str);
                if (m115771E3 != null) {
                    arrayList3.add(m115771E3);
                }
            }
        } else {
            arrayList3 = null;
        }
        List<String> selfieVideo = c46297oU1.m21013f().getSelfieVideo();
        if (selfieVideo != null) {
            arrayList4 = new ArrayList();
            for (String str6 : selfieVideo) {
                String m115771E4 = m115771E(str6, str);
                if (m115771E4 != null) {
                    arrayList4.add(m115771E4);
                }
            }
        }
        return IdentificationSubmissionData.copy$default(m21013f, null, arrayList2, arrayList, arrayList3, arrayList4, 1, null);
    }

    /* renamed from: Q */
    public final WireIdentificationIntentPermissionRequest m115759Q(IdentificationRequestIdentifier identificationRequestIdentifier) {
        String str;
        String identificationIntent = identificationRequestIdentifier.getIntent().toString();
        String habitatId = identificationRequestIdentifier.getHabitatId();
        if (habitatId == null && (habitatId = C7241Rh.m86446d(this.f581c)) == null) {
            habitatId = "00000000-0000-0000-0000-000000000000";
        }
        String userGuestId = identificationRequestIdentifier.getUserGuestId();
        BirdModel birdModel = identificationRequestIdentifier.getBirdModel();
        if (birdModel != null) {
            str = birdModel.toString();
        } else {
            str = null;
        }
        return new WireIdentificationIntentPermissionRequest(identificationIntent, habitatId, userGuestId, str);
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: a */
    public String mo25568a() {
        String absolutePath = this.f579a.getCacheDir().getAbsolutePath();
        return absolutePath + "/identification";
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: b */
    public void mo25567b() {
        this.f589k.accept(C37969aT1.f50509a);
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: c */
    public Z84<AbstractC38562bT1> mo25566c() {
        return this.f590l;
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: d */
    public AbstractC23442F<IdentificationIntentPermissionStatus> mo25565d(IdentificationRequestIdentifier identifier, IdentificationEntryMethod documentEntryMethod, IdentificationDocumentType identificationDocumentType, IdentificationSelfieEntryMethod identificationSelfieEntryMethod, String str, String str2, String str3, String str4, IdentificationSubmissionData submissionData) {
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(documentEntryMethod, "documentEntryMethod");
        Intrinsics.checkNotNullParameter(submissionData, "submissionData");
        InterfaceC39766dT1 interfaceC39766dT1 = this.f580b;
        String identificationIntent = identifier.getIntent().toString();
        String habitatId = identifier.getHabitatId();
        if (habitatId == null && (habitatId = C7241Rh.m86446d(this.f581c)) == null) {
            habitatId = "00000000-0000-0000-0000-000000000000";
        }
        String str8 = habitatId;
        String partnerId = identifier.getPartnerId();
        String userGuestId = identifier.getUserGuestId();
        BirdModel birdModel = identifier.getBirdModel();
        if (birdModel != null) {
            str5 = birdModel.toString();
        } else {
            str5 = null;
        }
        if (identificationDocumentType != null) {
            str6 = identificationDocumentType.toWire();
        } else {
            str6 = null;
        }
        String wire = documentEntryMethod.toWire();
        if (identificationSelfieEntryMethod != null) {
            str7 = identificationSelfieEntryMethod.toWire();
        } else {
            str7 = null;
        }
        AbstractC23442F<WireIdentificationIntentPermissionResponse> m44234b = interfaceC39766dT1.m44234b(new WireIdentificationSubmitRequest(identificationIntent, str8, partnerId, userGuestId, str5, wire, IdentificationSubmissionDataKt.toWire(submissionData), str4, null, str6, str7, str, str2, str3));
        final C0100g c0100g = C0100g.f601g;
        AbstractC23442F<WireIdentificationIntentPermissionResponse> m33106t = m44234b.m33106t(new InterfaceC23484g() { // from class: xT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AT1.m115770F(Function1.this, obj);
            }
        });
        final C0101h c0101h = C0101h.f602g;
        AbstractC23442F<R> m33157I = m33106t.m33157I(new InterfaceC23492o() { // from class: yT1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                IdentificationIntentPermissionStatus m115769G;
                m115769G = AT1.m115769G(Function1.this, obj);
                return m115769G;
            }
        });
        final C0102i c0102i = new C0102i(identifier, identificationDocumentType, documentEntryMethod, identificationSelfieEntryMethod, str, str2, str3);
        AbstractC23442F<IdentificationIntentPermissionStatus> m33101w = m33157I.m33101w(new InterfaceC23484g() { // from class: zT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AT1.m115768H(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun submitIdent…e,\n        ))\n      }\n  }");
        return m33101w;
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: e */
    public AbstractC23442F<IdentificationIntentPermissionStatus> mo25564e(IdentificationRequestIdentifier identifier, IdentificationManualEntryFormData formData) {
        Locale locale;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(formData, "formData");
        Locale nationality = formData.getNationality();
        if (nationality != null) {
            locale = new Locale("", nationality.getCountry());
        } else {
            locale = null;
        }
        IdentificationManualEntryFormData copy$default = IdentificationManualEntryFormData.copy$default(formData, null, null, null, null, null, null, null, null, null, locale, null, 1535, null);
        C41318g46.m40163a("attempting to submit manual identification with form data: " + copy$default, new Object[0]);
        String m6453i = this.f582d.m6453i(copy$default);
        C41318g46.m40163a("serialized form data " + m6453i, new Object[0]);
        return mo25565d(identifier, IdentificationEntryMethod.MANUAL_ENTRY, copy$default.getIdentificationDocumentType(), null, null, null, null, null, new IdentificationSubmissionData(m115761O(m6453i), null, null, null, null, 30, null));
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: f */
    public void mo25563f(C46297oU1 partialSubmissionData) {
        Intrinsics.checkNotNullParameter(partialSubmissionData, "partialSubmissionData");
        synchronized (this.f593o) {
            this.f591m = partialSubmissionData;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: g */
    public Z84<Optional<ZV1>> mo25562g() {
        return this.f588j;
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: h */
    public C46297oU1 mo25561h() {
        C46297oU1 c46297oU1;
        synchronized (this.f593o) {
            c46297oU1 = this.f591m;
        }
        return c46297oU1;
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: i */
    public AbstractC23442F<ZV1> mo25560i(IdentificationRequestIdentifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        AbstractC23442F<WireIdentificationIntentPermissionResponse> m44235a = this.f580b.m44235a(m115759Q(identifier));
        final C0097d c0097d = new C0097d(identifier);
        AbstractC23442F<WireIdentificationIntentPermissionResponse> m33102v = m44235a.m33102v(new InterfaceC23484g() { // from class: oT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AT1.m115775A(Function1.this, obj);
            }
        });
        final C0098e c0098e = new C0098e(identifier);
        AbstractC23442F<R> m33157I = m33102v.m33157I(new InterfaceC23492o() { // from class: pT1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                ZV1 m115774B;
                m115774B = AT1.m115774B(Function1.this, obj);
                return m115774B;
            }
        });
        final C0099f c0099f = new C0099f();
        AbstractC23442F<ZV1> m33101w = m33157I.m33101w(new InterfaceC23484g() { // from class: qT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AT1.m115773C(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun getIdentifi…turned(state)\n      }\n  }");
        return m33101w;
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: j */
    public IdentificationRequestIdentifier mo25559j() {
        IdentificationRequestIdentifier identificationRequestIdentifier;
        synchronized (this.f592n) {
            identificationRequestIdentifier = this.f584f;
        }
        return identificationRequestIdentifier;
    }

    @Override // p000.InterfaceC45102mT1
    /* renamed from: k */
    public void mo25558k(final C46297oU1 partialSubmissionData, Function0<Unit> onSubscribe) {
        Intrinsics.checkNotNullParameter(partialSubmissionData, "partialSubmissionData");
        Intrinsics.checkNotNullParameter(onSubscribe, "onSubscribe");
        AbstractC23442F m33152N = AbstractC23442F.m33161E(new Callable() { // from class: nT1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Pair m115767I;
                m115767I = AT1.m115767I(AT1.this, partialSubmissionData);
                return m115767I;
            }
        }).m33152N(C24542a.m31932c());
        final C0103j c0103j = new C0103j(partialSubmissionData);
        AbstractC23442F m33140a0 = m33152N.m33165A(new InterfaceC23492o() { // from class: rT1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m115766J;
                m115766J = AT1.m115766J(Function1.this, obj);
                return m115766J;
            }
        }).m33140a0(120L, TimeUnit.SECONDS);
        final C0104k c0104k = new C0104k();
        AbstractC23442F m33152N2 = m33140a0.m33102v(new InterfaceC23484g() { // from class: sT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AT1.m115765K(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        final C0105l c0105l = new C0105l(onSubscribe);
        AbstractC23442F m33152N3 = m33152N2.m33102v(new InterfaceC23484g() { // from class: tT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AT1.m115764L(Function1.this, obj);
            }
        }).m33152N(C24542a.m31932c());
        final C0106m c0106m = new C0106m();
        AbstractC23442F m33101w = m33152N3.m33101w(new InterfaceC23484g() { // from class: uT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AT1.m115763M(Function1.this, obj);
            }
        });
        final C0107n c0107n = new C0107n();
        m33101w.m33106t(new InterfaceC23484g() { // from class: vT1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                AT1.m115762N(Function1.this, obj);
            }
        }).m33159G().m33069Q().subscribe();
    }

    /* renamed from: z */
    public final void m115744z() {
        this.f585g.accept(Optional.f63040c.m59034a());
        FilesKt__UtilsKt.deleteRecursively(new File(mo25568a()));
    }
}
