package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BugReportAttachment;
import co.bird.android.model.LegacyRepairType;
import co.bird.api.exception.HttpException;
import co.bird.api.response.BugReportNewResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24567g;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.FilesKt__UtilsKt;
import okhttp3.MediaType;
import org.joda.time.DateTime;
import p000.InterfaceC47825r30;
import p000.M30;
import zendesk.core.Constants;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u0001:\u0002\u0016\u001aB9\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b1\u00102J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00100\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00020\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00064"}, m28432d2 = {"LM30;", "", "Ljava/io/File;", "networkLogFile", "screenshotFile", "", "logFiles", "", "t", "", "e", "I", "file", "", "deleteAfterUpload", "Lio/reactivex/c;", "p", "", "linesToRead", "", "r", "Lr30;", C17296a.f69688o, "Lr30;", "bugReportManager", "Le13;", "b", "Le13;", "navigator", "LR30;", "c", "LR30;", "ui", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lmj0;", "Lmj0;", "chuckerCollector", "Landroid/content/Context;", "f", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/subjects/g;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/g;", "harFileSubject", "<init>", "(Lr30;Le13;LR30;Lcom/uber/autodispose/ScopeProvider;Lmj0;Landroid/content/Context;)V", "h", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBugReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,196:1\n1#2:197\n199#3:198\n237#3:199\n*S KotlinDebug\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter\n*L\n69#1:198\n127#1:199\n*E\n"})
/* renamed from: M30 */
/* loaded from: classes3.dex */
public final class M30 {

    /* renamed from: h */
    public static final C5161b f22507h = new C5161b(null);

    /* renamed from: a */
    public final InterfaceC47825r30 f22508a;

    /* renamed from: b */
    public final InterfaceC40099e13 f22509b;

    /* renamed from: c */
    public final R30 f22510c;

    /* renamed from: d */
    public final ScopeProvider f22511d;

    /* renamed from: e */
    public final C45254mj0 f22512e;

    /* renamed from: f */
    public final Context f22513f;

    /* renamed from: g */
    public final C24567g<File> f22514g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LM30$b;", "", "", "MIME_TYPE_JSON", "Ljava/lang/String;", "<init>", "()V", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: M30$b */
    /* loaded from: classes3.dex */
    public static final class C5161b {
        public /* synthetic */ C5161b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5161b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0002*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u000620\u0010\u0005\u001a,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Ljava/io/File;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LM30$a;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBugReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$10\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1549#2:197\n1620#2,3:198\n*S KotlinDebug\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$10\n*L\n92#1:197\n92#1:198,3\n*E\n"})
    /* renamed from: M30$c */
    /* loaded from: classes3.dex */
    public static final class C5162c extends Lambda implements Function1<Triple<? extends Unit, ? extends File, ? extends CharSequence>, InterfaceC23447K<? extends List<? extends C5160a>>> {

        /* renamed from: h */
        public final /* synthetic */ String f22520h;

        /* renamed from: i */
        public final /* synthetic */ File f22521i;

        /* renamed from: j */
        public final /* synthetic */ List<File> f22522j;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/BugReportNewResponse;", "response", "", "LM30$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/BugReportNewResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBugReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$10$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1549#2:197\n1620#2,3:198\n*S KotlinDebug\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$10$2\n*L\n101#1:197\n101#1:198,3\n*E\n"})
        /* renamed from: M30$c$a */
        /* loaded from: classes3.dex */
        public static final class C5163a extends Lambda implements Function1<BugReportNewResponse, List<? extends C5160a>> {

            /* renamed from: g */
            public final /* synthetic */ File f22523g;

            /* renamed from: h */
            public final /* synthetic */ File f22524h;

            /* renamed from: i */
            public final /* synthetic */ List<File> f22525i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C5163a(File file, File file2, List<? extends File> list) {
                super(1);
                this.f22523g = file;
                this.f22524h = file2;
                this.f22525i = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final List<C5160a> invoke(BugReportNewResponse response) {
                BugReportAttachment m89022a;
                C5160a c5160a;
                List listOfNotNull;
                int collectionSizeOrDefault;
                List<C5160a> plus;
                MediaType m89021b;
                BugReportAttachment m89022a2;
                MediaType m89021b2;
                BugReportAttachment m89022a3;
                Intrinsics.checkNotNullParameter(response, "response");
                C41318g46.m40163a("submit report response: " + response, new Object[0]);
                C5160a[] c5160aArr = new C5160a[2];
                File harFile = this.f22523g;
                Intrinsics.checkNotNullExpressionValue(harFile, "harFile");
                MediaType mediaType = MediaType.Companion.get(Constants.APPLICATION_JSON);
                File harFile2 = this.f22523g;
                Intrinsics.checkNotNullExpressionValue(harFile2, "harFile");
                m89022a = Q30.m89022a(response, harFile2);
                c5160aArr[0] = new C5160a(harFile, mediaType, m89022a, true);
                File file = this.f22524h;
                if (file != null) {
                    m89021b2 = Q30.m89021b(file);
                    m89022a3 = Q30.m89022a(response, this.f22524h);
                    c5160a = new C5160a(file, m89021b2, m89022a3, false, 8, null);
                } else {
                    c5160a = null;
                }
                c5160aArr[1] = c5160a;
                listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c5160aArr);
                List list = listOfNotNull;
                List<File> list2 = this.f22525i;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (File file2 : list2) {
                    m89021b = Q30.m89021b(file2);
                    m89022a2 = Q30.m89022a(response, file2);
                    arrayList.add(new C5160a(file2, m89021b, m89022a2, false));
                }
                plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList);
                return plus;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5162c(String str, File file, List<? extends File> list) {
            super(1);
            this.f22520h = str;
            this.f22521i = file;
            this.f22522j = list;
        }

        /* renamed from: c */
        public static final List m95906c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (List) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends List<C5160a>> invoke(Triple<Unit, ? extends File, ? extends CharSequence> triple) {
            String str;
            List listOfNotNull;
            int collectionSizeOrDefault;
            List plus;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            File component2 = triple.component2();
            InterfaceC47825r30 interfaceC47825r30 = M30.this.f22508a;
            String obj = triple.component3().toString();
            String str2 = this.f22520h;
            String[] strArr = new String[2];
            strArr[0] = component2.getName();
            File file = this.f22521i;
            if (file != null) {
                str = file.getName();
            } else {
                str = null;
            }
            strArr[1] = str;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
            List list = listOfNotNull;
            List<File> list2 = this.f22522j;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (File file2 : list2) {
                arrayList.add(file2.getName());
            }
            plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) arrayList);
            AbstractC23442F submitReport$default = InterfaceC47825r30.C27826a.submitReport$default(interfaceC47825r30, obj, str2, plus, null, 8, null);
            final C5163a c5163a = new C5163a(component2, this.f22521i, this.f22522j);
            return submitReport$default.m33157I(new InterfaceC23492o() { // from class: N30
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj2) {
                    List m95906c;
                    m95906c = M30.C5162c.m95906c(Function1.this, obj2);
                    return m95906c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LM30$a;", "attachmentData", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBugReportPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$11\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,196:1\n1549#2:197\n1620#2,3:198\n*S KotlinDebug\n*F\n+ 1 BugReportPresenter.kt\nco/bird/android/lib/shaketoreport/BugReportPresenter$onCreate$11\n*L\n109#1:197\n109#1:198,3\n*E\n"})
    /* renamed from: M30$d */
    /* loaded from: classes3.dex */
    public static final class C5164d extends Lambda implements Function1<List<? extends C5160a>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: M30$d$a */
        /* loaded from: classes3.dex */
        public static final class C5165a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ BugReportAttachment f22527g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5165a(BugReportAttachment bugReportAttachment) {
                super(1);
                this.f22527g = bugReportAttachment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                String fileId = this.f22527g.getFileId();
                C41318g46.m40158f(th, "Failed to upload file " + fileId + ", ignoring.", new Object[0]);
            }
        }

        public C5164d() {
            super(1);
        }

        /* renamed from: d */
        public static final void m95901d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final InterfaceC23496h m95900e(M30 this$0, File file, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(file, "$file");
            return this$0.m95923p(file, z);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(List<C5160a> attachmentData) {
            int collectionSizeOrDefault;
            AbstractC23461c abstractC23461c;
            Intrinsics.checkNotNullParameter(attachmentData, "attachmentData");
            List<C5160a> list = attachmentData;
            final M30 m30 = M30.this;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (C5160a c5160a : list) {
                final File m95912a = c5160a.m95912a();
                c5160a.m95911b();
                BugReportAttachment m95910c = c5160a.m95910c();
                final boolean m95909d = c5160a.m95909d();
                if (m95910c != null) {
                    AbstractC23461c m33065U = m30.f22508a.mo7536b(m95910c, m95912a).m33159G().m33065U(1L);
                    final C5165a c5165a = new C5165a(m95910c);
                    abstractC23461c = m33065U.m33084B(new InterfaceC23484g() { // from class: O30
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            M30.C5164d.m95901d(Function1.this, obj);
                        }
                    }).m33069Q().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: P30
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            InterfaceC23496h m95900e;
                            m95900e = M30.C5164d.m95900e(M30.this, m95912a, m95909d);
                            return m95900e;
                        }
                    }));
                } else {
                    abstractC23461c = null;
                }
                if (abstractC23461c == null) {
                    abstractC23461c = m30.m95923p(m95912a, m95909d);
                }
                arrayList.add(abstractC23461c);
            }
            return AbstractC23461c.m33074L(arrayList);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: M30$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5166e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C5166e(Object obj) {
            super(1, obj, M30.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((M30) this.receiver).m95939I(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: M30$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5167f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C5167f(Object obj) {
            super(1, obj, M30.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((M30) this.receiver).m95939I(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/net/Uri;", "uri", "Ljava/io/File;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/net/Uri;)Ljava/io/File;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M30$g */
    /* loaded from: classes3.dex */
    public static final class C5168g extends Lambda implements Function1<Uri, File> {

        /* renamed from: h */
        public final /* synthetic */ File f22529h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5168g(File file) {
            super(1);
            this.f22529h = file;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final File invoke(Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return C33536If6.m101824d(uri, M30.this.f22513f, this.f22529h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M30$h */
    /* loaded from: classes3.dex */
    public static final class C5169h extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C5169h() {
            super(1);
        }

        /* renamed from: a */
        public final void m95898a(InterfaceC23465c interfaceC23465c) {
            M30.this.f22510c.m87377Sl(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m95898a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: M30$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C5170i extends FunctionReferenceImpl implements Function1<File, Unit> {
        public C5170i(Object obj) {
            super(1, obj, C24567g.class, "onSuccess", "onSuccess(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m95897a(File p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24567g) this.receiver).onSuccess(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(File file) {
            m95897a(file);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: M30$j */
    /* loaded from: classes3.dex */
    public static final class C5171j extends Lambda implements Function1<Throwable, Unit> {
        public C5171j() {
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
            M30.this.f22510c.m87378Rl();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: M30$k */
    /* loaded from: classes3.dex */
    public static final class C5172k extends Lambda implements Function1<Unit, Unit> {
        public C5172k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            M30.this.f22510c.hideKeyboard();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00012b\u0010\u0005\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Ljava/io/File;", "", "it", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: M30$l */
    /* loaded from: classes3.dex */
    public static final class C5173l extends Lambda implements Function1<Triple<? extends Unit, ? extends File, ? extends CharSequence>, Unit> {
        public C5173l() {
            super(1);
        }

        /* renamed from: a */
        public final void m95896a(Triple<Unit, ? extends File, ? extends CharSequence> triple) {
            M30.this.f22510c.startProgress();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends File, ? extends CharSequence> triple) {
            m95896a(triple);
            return Unit.INSTANCE;
        }
    }

    public M30(InterfaceC47825r30 bugReportManager, InterfaceC40099e13 navigator, R30 ui, ScopeProvider scopeProvider, C45254mj0 chuckerCollector, Context context) {
        Intrinsics.checkNotNullParameter(bugReportManager, "bugReportManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(chuckerCollector, "chuckerCollector");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22508a = bugReportManager;
        this.f22509b = navigator;
        this.f22510c = ui;
        this.f22511d = scopeProvider;
        this.f22512e = chuckerCollector;
        this.f22513f = context;
        C24567g<File> m31882w0 = C24567g.m31882w0();
        Intrinsics.checkNotNullExpressionValue(m31882w0, "create<File>()");
        this.f22514g = m31882w0;
    }

    /* renamed from: A */
    public static final void m95947A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m95946B(M30 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f22510c.m87377Sl(false);
    }

    /* renamed from: C */
    public static final void m95945C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m95944D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m95943E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m95942F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final InterfaceC23447K m95941G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC23496h m95940H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final Object m95922q(File file) {
        boolean deleteRecursively;
        Intrinsics.checkNotNullParameter(file, "$file");
        deleteRecursively = FilesKt__UtilsKt.deleteRecursively(file);
        return Boolean.valueOf(deleteRecursively);
    }

    /* renamed from: s */
    public static /* synthetic */ String m95920s(M30 m30, File file, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 25;
        }
        return m30.m95921r(file, i);
    }

    /* renamed from: u */
    public static final Uri m95918u(M30 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Uri m25139f = this$0.f22512e.m25139f(this$0.f22513f, Long.valueOf(DateTime.now().minusMinutes(60).toInstant().getMillis()), EnumC52359yi1.HAR);
        if (m25139f != null) {
            return m25139f;
        }
        throw new NullPointerException("Unable to get HAR file");
    }

    /* renamed from: v */
    public static final File m95917v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (File) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m95916w(M30 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f22510c.stopProgress(4);
    }

    /* renamed from: x */
    public static final void m95915x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m95914y(M30 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f22509b.close();
        this$0.f22510c.m87376Tl();
    }

    /* renamed from: z */
    public static final void m95913z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public final void m95939I(Throwable th) {
        HttpException httpException;
        C41318g46.m40159e(th);
        Unit unit = null;
        if (th instanceof HttpException) {
            httpException = (HttpException) th;
        } else {
            httpException = null;
        }
        if (httpException != null) {
            this.f22510c.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f22510c.errorGeneric();
        }
    }

    /* renamed from: p */
    public final AbstractC23461c m95923p(final File file, boolean z) {
        if (z) {
            AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: x30
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object m95922q;
                    m95922q = M30.m95922q(file);
                    return m95922q;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33078H, "{\n      Completable.from…cursively()\n      }\n    }");
            return m33078H;
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      Completable.complete()\n    }");
        return m33039p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0061: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:25:0x0061 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m95921r(File file, int i) {
        DO4 do4;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2 = null;
        r2 = null;
        String str = null;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            try {
                StringBuilder sb = new StringBuilder();
                Charset defaultCharset = Charset.defaultCharset();
                Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
                do4 = new DO4(file, defaultCharset);
                try {
                    String m110551a = do4.m110551a();
                    while (m110551a != null) {
                        int i2 = i - 1;
                        if (i <= 0) {
                            break;
                        }
                        sb.append(m110551a);
                        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                        sb.append('\n');
                        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                        m110551a = do4.m110551a();
                        i = i2;
                    }
                    String sb2 = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
                    str = Q30.m89020c(sb2, false);
                } catch (Exception e) {
                    e = e;
                    C41318g46.m40158f(e, "Exception while attempting to read summary from log", new Object[0]);
                }
            } catch (Throwable th) {
                th = th;
                autoCloseable2 = autoCloseable;
                if (autoCloseable2 != null) {
                    autoCloseable2.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            do4 = null;
        } catch (Throwable th2) {
            th = th2;
            if (autoCloseable2 != null) {
            }
            throw th;
        }
        do4.close();
        return str;
    }

    /* renamed from: t */
    public final void m95919t(File networkLogFile, File file, List<? extends File> logFiles) {
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(networkLogFile, "networkLogFile");
        Intrinsics.checkNotNullParameter(logFiles, "logFiles");
        if (file != null) {
            this.f22510c.m87379Ql(file);
        }
        AbstractC23442F m33161E = AbstractC23442F.m33161E(new Callable() { // from class: D30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Uri m95918u;
                m95918u = M30.m95918u(M30.this);
                return m95918u;
            }
        });
        final C5168g c5168g = new C5168g(networkLogFile);
        AbstractC23442F m33152N = m33161E.m33157I(new InterfaceC23492o() { // from class: I30
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                File m95917v;
                m95917v = M30.m95917v(Function1.this, obj);
                return m95917v;
            }
        }).m33142Y(C24542a.m31932c()).m33152N(C23454a.m33087a());
        final C5169h c5169h = new C5169h();
        AbstractC23442F m33110r = m33152N.m33102v(new InterfaceC23484g() { // from class: J30
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M30.m95947A(Function1.this, obj);
            }
        }).m33110r(new InterfaceC23478a() { // from class: K30
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                M30.m95946B(M30.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33110r, "fun onCreate(networkLogF…)\n      }, ::onError)\n  }");
        Object m33135e = m33110r.m33135e(AutoDispose.m45239a(this.f22511d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C5170i c5170i = new C5170i(this.f22514g);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: L30
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M30.m95945C(Function1.this, obj);
            }
        };
        final C5171j c5171j = new C5171j();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: y30
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M30.m95944D(Function1.this, obj);
            }
        });
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) logFiles);
        File file2 = (File) firstOrNull;
        String str = null;
        if (file2 != null) {
            str = m95920s(this, file2, 0, 2, null);
        }
        Observable<Unit> m87375c = this.f22510c.m87375c();
        final C5172k c5172k = new C5172k();
        Observable<Unit> doOnNext = m87375c.doOnNext(new InterfaceC23484g() { // from class: z30
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M30.m95943E(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "fun onCreate(networkLogF…)\n      }, ::onError)\n  }");
        Observable<File> m33123k0 = this.f22514g.m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "harFileSubject.toObservable()");
        Observable m31949b = C24527f.m31949b(doOnNext, m33123k0, this.f22510c.m87380Pl());
        final C5173l c5173l = new C5173l();
        Observable observeOn = m31949b.doOnNext(new InterfaceC23484g() { // from class: A30
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M30.m95942F(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C5162c c5162c = new C5162c(str, file, logFiles);
        AbstractC23442F firstOrError = observeOn.flatMapSingle(new InterfaceC23492o() { // from class: B30
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m95941G;
                m95941G = M30.m95941G(Function1.this, obj);
                return m95941G;
            }
        }).firstOrError();
        final C5164d c5164d = new C5164d();
        AbstractC23461c m33030y = firstOrError.m33164B(new InterfaceC23492o() { // from class: C30
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m95940H;
                m95940H = M30.m95940H(Function1.this, obj);
                return m95940H;
            }
        }).m33070P(C23454a.m33087a()).m33030y(new InterfaceC23478a() { // from class: E30
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                M30.m95916w(M30.this);
            }
        });
        final C5166e c5166e = new C5166e(this);
        AbstractC23461c m33066T = m33030y.m33084B(new InterfaceC23484g() { // from class: F30
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M30.m95915x(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "fun onCreate(networkLogF…)\n      }, ::onError)\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f22511d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: G30
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                M30.m95914y(M30.this);
            }
        };
        final C5167f c5167f = new C5167f(this);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: H30
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                M30.m95913z(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"LM30$a;", "", "Ljava/io/File;", C17296a.f69688o, "Lokhttp3/MediaType;", "b", "Lco/bird/android/model/BugReportAttachment;", "c", "", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "file", "Lokhttp3/MediaType;", "getMediaType", "()Lokhttp3/MediaType;", "mediaType", "Lco/bird/android/model/BugReportAttachment;", "getAttachment", "()Lco/bird/android/model/BugReportAttachment;", "attachment", "Z", "getDeleteAfterUpload", "()Z", "deleteAfterUpload", "<init>", "(Ljava/io/File;Lokhttp3/MediaType;Lco/bird/android/model/BugReportAttachment;Z)V", "shaketoreport_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: M30$a */
    /* loaded from: classes3.dex */
    public static final class C5160a {

        /* renamed from: a */
        public final File f22515a;

        /* renamed from: b */
        public final MediaType f22516b;

        /* renamed from: c */
        public final BugReportAttachment f22517c;

        /* renamed from: d */
        public final boolean f22518d;

        public C5160a(File file, MediaType mediaType, BugReportAttachment bugReportAttachment, boolean z) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            this.f22515a = file;
            this.f22516b = mediaType;
            this.f22517c = bugReportAttachment;
            this.f22518d = z;
        }

        /* renamed from: a */
        public final File m95912a() {
            return this.f22515a;
        }

        /* renamed from: b */
        public final MediaType m95911b() {
            return this.f22516b;
        }

        /* renamed from: c */
        public final BugReportAttachment m95910c() {
            return this.f22517c;
        }

        /* renamed from: d */
        public final boolean m95909d() {
            return this.f22518d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C5160a) {
                C5160a c5160a = (C5160a) obj;
                return Intrinsics.areEqual(this.f22515a, c5160a.f22515a) && Intrinsics.areEqual(this.f22516b, c5160a.f22516b) && Intrinsics.areEqual(this.f22517c, c5160a.f22517c) && this.f22518d == c5160a.f22518d;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f22515a.hashCode() * 31) + this.f22516b.hashCode()) * 31;
            BugReportAttachment bugReportAttachment = this.f22517c;
            int hashCode2 = (hashCode + (bugReportAttachment == null ? 0 : bugReportAttachment.hashCode())) * 31;
            boolean z = this.f22518d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public String toString() {
            File file = this.f22515a;
            MediaType mediaType = this.f22516b;
            BugReportAttachment bugReportAttachment = this.f22517c;
            boolean z = this.f22518d;
            return "AttachmentData(file=" + file + ", mediaType=" + mediaType + ", attachment=" + bugReportAttachment + ", deleteAfterUpload=" + z + ")";
        }

        public /* synthetic */ C5160a(File file, MediaType mediaType, BugReportAttachment bugReportAttachment, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(file, mediaType, bugReportAttachment, (i & 8) != 0 ? false : z);
        }
    }
}
