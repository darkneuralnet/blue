package p000;

import co.bird.android.model.FileUploadReceipt;
import co.bird.android.model.persistence.ComplaintResolution;
import co.bird.android.model.persistence.ComplaintResolutionForm;
import co.bird.android.model.wire.WireComplaintResolutionFormResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C39415cs0;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0016J \u0010\u000e\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J \u0010\u000f\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\u0011\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J$\u0010\u0013\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\u0014\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0016\u0010\u0015\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u001e\u0010\u0017\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u001e\u0010\u0019\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, m28432d2 = {"Lcs0;", "LYr0;", "Lio/reactivex/c;", "A", "", "", "complaintIds", "Lio/reactivex/p;", "Lco/bird/android/model/persistence/ComplaintResolution;", "E", "request", "x", "Lco/bird/android/model/FileUploadReceipt;", "receipt", "M0", "V0", "issues", "e", "vehicleInvolvedIds", "y", "A0", "f1", "action", "o", "notes", "e0", "Lio/reactivex/F;", "Lco/bird/android/model/persistence/ComplaintResolutionForm;", "h1", "clear", "LXp0;", C17296a.f69688o, "LXp0;", "complaintClient", "LOq0;", "b", "LOq0;", "complaintResolutionFormDao", "LMq0;", "c", "LMq0;", "complaintResolutionDao", "<init>", "(LXp0;LOq0;LMq0;)V", "co.bird.android.repository.complaint-resolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cs0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39415cs0 implements InterfaceC37382Yr0 {

    /* renamed from: a */
    public final InterfaceC37130Xp0 f75739a;

    /* renamed from: b */
    public final AbstractC35033Oq0 f75740b;

    /* renamed from: c */
    public final AbstractC34565Mq0 f75741c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cs0$a */
    /* loaded from: classes4.dex */
    public static final class C19625a extends Lambda implements Function1<WireComplaintResolutionFormResponse, InterfaceC23496h> {
        public C19625a() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m44944c(C39415cs0 this$0, WireComplaintResolutionFormResponse it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "$it");
            return this$0.f75740b.mo89716c(C31757Aq0.m115123c(it));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final WireComplaintResolutionFormResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo89718a = C39415cs0.this.f75740b.mo89718a();
            final C39415cs0 c39415cs0 = C39415cs0.this;
            return mo89718a.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: bs0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m44944c;
                    m44944c = C39415cs0.C19625a.m44944c(C39415cs0.this, it);
                    return m44944c;
                }
            }));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/ComplaintResolution;", "resolution", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/ComplaintResolution;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cs0$b */
    /* loaded from: classes4.dex */
    public static final class C19626b extends Lambda implements Function1<ComplaintResolution, InterfaceC23496h> {
        public C19626b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(ComplaintResolution resolution) {
            Intrinsics.checkNotNullParameter(resolution, "resolution");
            if (!resolution.getSubmitted()) {
                return C39415cs0.this.f75739a.m76312c(C31757Aq0.m115122d(resolution)).m33159G();
            }
            return C39415cs0.this.f75739a.m76313b(C31757Aq0.m115121e(resolution)).m33159G();
        }
    }

    public C39415cs0(InterfaceC37130Xp0 complaintClient, AbstractC35033Oq0 complaintResolutionFormDao, AbstractC34565Mq0 complaintResolutionDao) {
        Intrinsics.checkNotNullParameter(complaintClient, "complaintClient");
        Intrinsics.checkNotNullParameter(complaintResolutionFormDao, "complaintResolutionFormDao");
        Intrinsics.checkNotNullParameter(complaintResolutionDao, "complaintResolutionDao");
        this.f75739a = complaintClient;
        this.f75740b = complaintResolutionFormDao;
        this.f75741c = complaintResolutionDao;
    }

    /* renamed from: L1 */
    public static final InterfaceC23496h m44957L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: M1 */
    public static final InterfaceC23496h m44955M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: A */
    public AbstractC23461c mo44962A() {
        AbstractC23442F<WireComplaintResolutionFormResponse> m76314a = this.f75739a.m76314a();
        final C19625a c19625a = new C19625a();
        AbstractC23461c m33164B = m76314a.m33164B(new InterfaceC23492o() { // from class: Zr0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m44957L1;
                m44957L1 = C39415cs0.m44957L1(Function1.this, obj);
                return m44957L1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchCompla…\n          })\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: A0 */
    public AbstractC23461c mo44961A0(List<String> complaintIds) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        AbstractC24507p<ComplaintResolution> mo93338b = this.f75741c.mo93338b(ComplaintResolution.Companion.getComplaintHash(complaintIds));
        final C19626b c19626b = new C19626b();
        AbstractC23461c m32074A = mo93338b.m32074A(new InterfaceC23492o() { // from class: as0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m44955M1;
                m44955M1 = C39415cs0.m44955M1(Function1.this, obj);
                return m44955M1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "override fun submitForm(…t()\n        }\n      }\n  }");
        return m32074A;
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: E */
    public AbstractC24507p<ComplaintResolution> mo44960E(List<String> complaintIds) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        return this.f75741c.mo93338b(ComplaintResolution.Companion.getComplaintHash(complaintIds));
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: M0 */
    public AbstractC23461c mo44956M0(List<String> complaintIds, FileUploadReceipt fileUploadReceipt) {
        String str;
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        AbstractC34565Mq0 abstractC34565Mq0 = this.f75741c;
        int complaintHash = ComplaintResolution.Companion.getComplaintHash(complaintIds);
        String str2 = null;
        if (fileUploadReceipt != null) {
            str = fileUploadReceipt.getFileUrl();
        } else {
            str = null;
        }
        if (fileUploadReceipt != null) {
            str2 = fileUploadReceipt.getAssetId();
        }
        return abstractC34565Mq0.mo93333g(complaintHash, str, str2);
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: V0 */
    public AbstractC23461c mo44954V0(List<String> complaintIds, FileUploadReceipt fileUploadReceipt) {
        String str;
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        AbstractC34565Mq0 abstractC34565Mq0 = this.f75741c;
        int complaintHash = ComplaintResolution.Companion.getComplaintHash(complaintIds);
        String str2 = null;
        if (fileUploadReceipt != null) {
            str = fileUploadReceipt.getFileUrl();
        } else {
            str = null;
        }
        if (fileUploadReceipt != null) {
            str2 = fileUploadReceipt.getAssetId();
        }
        return abstractC34565Mq0.mo93334f(complaintHash, str, str2);
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        AbstractC23461c m33049i = this.f75740b.mo89718a().m33049i(this.f75741c.mo93339a());
        Intrinsics.checkNotNullExpressionValue(m33049i, "complaintResolutionFormD…tResolutionSubmissions())");
        return m33049i;
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: e */
    public AbstractC23461c mo44953e(List<String> complaintIds, List<String> issues) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(issues, "issues");
        return this.f75741c.mo93332h(ComplaintResolution.Companion.getComplaintHash(complaintIds), issues);
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: e0 */
    public AbstractC23461c mo44952e0(List<String> complaintIds, String notes) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(notes, "notes");
        return this.f75741c.mo93331i(ComplaintResolution.Companion.getComplaintHash(complaintIds), notes);
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: f1 */
    public AbstractC23461c mo44951f1(List<String> complaintIds) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        return this.f75741c.mo93336d(ComplaintResolution.Companion.getComplaintHash(complaintIds));
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: h1 */
    public AbstractC23442F<ComplaintResolutionForm> mo44950h1() {
        return this.f75740b.mo89717b();
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: o */
    public AbstractC23461c mo44949o(List<String> complaintIds, String action) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f75741c.mo93335e(ComplaintResolution.Companion.getComplaintHash(complaintIds), action);
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: x */
    public AbstractC23461c mo44948x(ComplaintResolution request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return this.f75741c.mo93337c(request);
    }

    @Override // p000.InterfaceC37382Yr0
    /* renamed from: y */
    public AbstractC23461c mo44947y(List<String> complaintIds, List<String> vehicleInvolvedIds) {
        Intrinsics.checkNotNullParameter(complaintIds, "complaintIds");
        Intrinsics.checkNotNullParameter(vehicleInvolvedIds, "vehicleInvolvedIds");
        return this.f75741c.mo93330j(ComplaintResolution.Companion.getComplaintHash(complaintIds), vehicleInvolvedIds);
    }
}
