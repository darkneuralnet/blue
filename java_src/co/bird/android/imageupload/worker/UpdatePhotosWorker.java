package co.bird.android.imageupload.worker;

import android.content.Context;
import androidx.work.AbstractC12126c;
import androidx.work.C12124b;
import androidx.work.RxWorker;
import androidx.work.WorkerParameters;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.imageupload.worker.UpdatePhotosWorker;
import co.bird.api.response.Complaint;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/imageupload/worker/UpdatePhotosWorker;", "Landroidx/work/RxWorker;", "Lio/reactivex/F;", "Landroidx/work/c$a;", "r", "LKp0;", "h", "LKp0;", "y", "()LKp0;", "setCommunityManager", "(LKp0;)V", "communityManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "i", C17296a.f69688o, "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class UpdatePhotosWorker extends RxWorker {

    /* renamed from: i */
    public static final C16003a f66044i = new C16003a(null);

    /* renamed from: h */
    public InterfaceC34088Kp0 f66045h;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lco/bird/android/imageupload/worker/UpdatePhotosWorker$a;", "", "", "complaintId", "Landroidx/work/b;", C17296a.f69688o, "KEY_COMPLAINT_ID", "Ljava/lang/String;", "<init>", "()V", "image-upload_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.imageupload.worker.UpdatePhotosWorker$a */
    /* loaded from: classes3.dex */
    public static final class C16003a {
        public /* synthetic */ C16003a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12124b m56117a(String complaintId) {
            Intrinsics.checkNotNullParameter(complaintId, "complaintId");
            C12124b m65581a = new C12124b.C12125a().m65577e("COMPLAINT_ID", complaintId).m65581a();
            Intrinsics.checkNotNullExpressionValue(m65581a, "Builder()\n        .putSt…laintId)\n        .build()");
            return m65581a;
        }

        private C16003a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/Complaint;", "response", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Landroidx/work/c$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.imageupload.worker.UpdatePhotosWorker$b */
    /* loaded from: classes3.dex */
    public static final class C16004b extends Lambda implements Function1<HM4<Complaint>, AbstractC12126c.AbstractC12127a> {

        /* renamed from: g */
        public static final C16004b f66046g = new C16004b();

        public C16004b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC12126c.AbstractC12127a invoke(HM4<Complaint> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f()) {
                return AbstractC12126c.AbstractC12127a.m65562c();
            }
            return AbstractC12126c.AbstractC12127a.m65564a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePhotosWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = m65576b();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(applicationContext);
        Intrinsics.checkNotNull(m21419a, "null cannot be cast to non-null type co.bird.android.imageupload.worker.UpdatePhotosWorkerComponent");
        ((InterfaceC34463Me6) m21419a).mo75186Z0(this);
    }

    /* renamed from: w */
    public static final AbstractC12126c.AbstractC12127a m56120w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AbstractC12126c.AbstractC12127a) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final AbstractC12126c.AbstractC12127a m56119x(UpdatePhotosWorker this$0, Throwable it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.m65571h() >= 12) {
            return AbstractC12126c.AbstractC12127a.m65564a();
        }
        return AbstractC12126c.AbstractC12127a.m65563b();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    @Override // androidx.work.RxWorker
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC23442F<AbstractC12126c.AbstractC12127a> mo55853r() {
        boolean z;
        List<String> list;
        boolean z2;
        boolean z3;
        String[] m65584j = m65572g().m65584j("COMPLAINT_ID");
        String[] m65584j2 = m65572g().m65584j("UPLOADED_IMAGE_URL");
        boolean z4 = true;
        if (m65584j != null) {
            if (m65584j.length == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                z = false;
                if (!z) {
                    if (m65584j2 != null) {
                        if (m65584j2.length == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            z4 = false;
                        }
                    }
                    if (!z4) {
                        InterfaceC34088Kp0 m56118y = m56118y();
                        String str = m65584j[0];
                        Intrinsics.checkNotNullExpressionValue(str, "complaintId[0]");
                        list = ArraysKt___ArraysKt.toList(m65584j2);
                        AbstractC23442F<HM4<Complaint>> m33146T = m56118y.mo96319e(str, list).m33146T(1L);
                        final C16004b c16004b = C16004b.f66046g;
                        AbstractC23442F<AbstractC12126c.AbstractC12127a> m33149Q = m33146T.m33157I(new InterfaceC23492o() { // from class: Ke6
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                AbstractC12126c.AbstractC12127a m56120w;
                                m56120w = UpdatePhotosWorker.m56120w(Function1.this, obj);
                                return m56120w;
                            }
                        }).m33149Q(new InterfaceC23492o() { // from class: Le6
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                AbstractC12126c.AbstractC12127a m56119x;
                                m56119x = UpdatePhotosWorker.m56119x(UpdatePhotosWorker.this, (Throwable) obj);
                                return m56119x;
                            }
                        });
                        Intrinsics.checkNotNullExpressionValue(m33149Q, "communityManager.updateP…retry()\n        }\n      }");
                        return m33149Q;
                    }
                }
                AbstractC23442F<AbstractC12126c.AbstractC12127a> m33158H = AbstractC23442F.m33158H(AbstractC12126c.AbstractC12127a.m65564a());
                Intrinsics.checkNotNullExpressionValue(m33158H, "just(Result.failure())");
                return m33158H;
            }
        }
        z = true;
        if (!z) {
        }
        AbstractC23442F<AbstractC12126c.AbstractC12127a> m33158H2 = AbstractC23442F.m33158H(AbstractC12126c.AbstractC12127a.m65564a());
        Intrinsics.checkNotNullExpressionValue(m33158H2, "just(Result.failure())");
        return m33158H2;
    }

    /* renamed from: y */
    public final InterfaceC34088Kp0 m56118y() {
        InterfaceC34088Kp0 interfaceC34088Kp0 = this.f66045h;
        if (interfaceC34088Kp0 != null) {
            return interfaceC34088Kp0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("communityManager");
        return null;
    }
}
