package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
import p000.InterfaceC32758Ex2;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a/\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0003H\u0000\u001a6\u0010\u0010\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"LFy5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "c", "Landroid/app/Activity;", "activity", "intentTitle", "intentSubject", "Landroid/content/Intent;", "b", "(LFy5;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileName", "Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "clipDataLabel", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSharable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sharable.kt\ncom/chuckerteam/chucker/internal/support/SharableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/* renamed from: Gy5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C33238Gy5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.support.SharableKt", m28418f = "Sharable.kt", m28417i = {0, 0, 0}, m28416l = {30}, m28415m = "shareAsUtf8Text", m28414n = {"activity", "intentTitle", "intentSubject"}, m28413s = {"L$0", "L$1", "L$2"})
    /* renamed from: Gy5$a */
    /* loaded from: classes5.dex */
    public static final class C2992a extends ContinuationImpl {

        /* renamed from: h */
        public Object f12674h;

        /* renamed from: i */
        public Object f12675i;

        /* renamed from: j */
        public Object f12676j;

        /* renamed from: k */
        public /* synthetic */ Object f12677k;

        /* renamed from: l */
        public int f12678l;

        public C2992a(Continuation<? super C2992a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12677k = obj;
            this.f12678l |= Integer.MIN_VALUE;
            return C33238Gy5.m104540b(null, null, null, null, this);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.support.SharableKt$shareAsUtf8Text$content$1", m28418f = "Sharable.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Gy5$b */
    /* loaded from: classes5.dex */
    public static final class C2993b extends SuspendLambda implements Function2<ZC0, Continuation<? super String>, Object> {

        /* renamed from: h */
        public int f12679h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC33004Fy5 f12680i;

        /* renamed from: j */
        public final /* synthetic */ Activity f12681j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2993b(InterfaceC33004Fy5 interfaceC33004Fy5, Activity activity, Continuation<? super C2993b> continuation) {
            super(2, continuation);
            this.f12680i = interfaceC33004Fy5;
            this.f12681j = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C2993b(this.f12680i, this.f12681j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super String> continuation) {
            return ((C2993b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12679h == 0) {
                ResultKt.throwOnFailure(obj);
                return C33238Gy5.m104539c(this.f12680i, this.f12681j);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static final Intent m104541a(InterfaceC33004Fy5 interfaceC33004Fy5, Activity activity, String fileName, String intentTitle, String intentSubject, String clipDataLabel) {
        Intrinsics.checkNotNullParameter(interfaceC33004Fy5, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(intentTitle, "intentTitle");
        Intrinsics.checkNotNullParameter(intentSubject, "intentSubject");
        Intrinsics.checkNotNullParameter(clipDataLabel, "clipDataLabel");
        Uri m104538d = m104538d(interfaceC33004Fy5, activity, fileName);
        if (m104538d == null) {
            return null;
        }
        Intent m101424d = new C33706Iy5(activity).m101419i(activity.getContentResolver().getType(m104538d)).m101423e(intentTitle).m101421g(intentSubject).m101422f(m104538d).m101424d();
        Intrinsics.checkNotNullExpressionValue(m101424d, "IntentBuilder(activity)\n…ream(uri)\n        .intent");
        m101424d.setClipData(ClipData.newRawUri(clipDataLabel, m104538d));
        m101424d.addFlags(1);
        return Intent.createChooser(m101424d, intentTitle);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m104540b(InterfaceC33004Fy5 interfaceC33004Fy5, Activity activity, String str, String str2, Continuation<? super Intent> continuation) {
        C2992a c2992a;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof C2992a) {
            c2992a = (C2992a) continuation;
            int i2 = c2992a.f12678l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2992a.f12678l = i2 - Integer.MIN_VALUE;
                Object obj = c2992a.f12677k;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2992a.f12678l;
                if (i == 0) {
                    if (i == 1) {
                        str2 = (String) c2992a.f12676j;
                        str = (String) c2992a.f12675i;
                        activity = (Activity) c2992a.f12674h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    SC0 m84378a = T41.m84378a();
                    C2993b c2993b = new C2993b(interfaceC33004Fy5, activity, null);
                    c2992a.f12674h = activity;
                    c2992a.f12675i = str;
                    c2992a.f12676j = str2;
                    c2992a.f12678l = 1;
                    obj = X30.m77504g(m84378a, c2993b, c2992a);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Intent m101425c = new C33706Iy5(activity).m101419i("text/plain").m101423e(str).m101421g(str2).m101420h((String) obj).m101425c();
                Intrinsics.checkNotNullExpressionValue(m101425c, "IntentBuilder(activity)\n…   .createChooserIntent()");
                return m101425c;
            }
        }
        c2992a = new C2992a(continuation);
        Object obj2 = c2992a.f12677k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2992a.f12678l;
        if (i == 0) {
        }
        Intent m101425c2 = new C33706Iy5(activity).m101419i("text/plain").m101423e(str).m101421g(str2).m101420h((String) obj2).m101425c();
        Intrinsics.checkNotNullExpressionValue(m101425c2, "IntentBuilder(activity)\n…   .createChooserIntent()");
        return m101425c2;
    }

    /* renamed from: c */
    public static final String m104539c(InterfaceC33004Fy5 interfaceC33004Fy5, Context context) {
        Intrinsics.checkNotNullParameter(interfaceC33004Fy5, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC46046o30 m91759d = C34928Oe3.m91759d(interfaceC33004Fy5.mo5832a(context));
        try {
            String mo21932r1 = m91759d.mo21932r1();
            CloseableKt.closeFinally(m91759d, null);
            return mo21932r1;
        } finally {
        }
    }

    /* renamed from: d */
    public static final Uri m104538d(InterfaceC33004Fy5 interfaceC33004Fy5, Context context, String fileName) {
        InterfaceC50872wB5 m88279h;
        Intrinsics.checkNotNullParameter(interfaceC33004Fy5, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            InterfaceC32758Ex2.C2028b.m108183c(InterfaceC32758Ex2.f8338a, "Failed to obtain a valid cache directory for file export", null, 2, null);
            return null;
        }
        File m26881b = C44682ll1.f96658a.m26881b(cacheDir, fileName);
        if (m26881b == null) {
            InterfaceC32758Ex2.C2028b.m108183c(InterfaceC32758Ex2.f8338a, "Failed to create an export file", null, 2, null);
            return null;
        }
        AN5 mo5832a = interfaceC33004Fy5.mo5832a(context);
        m88279h = C35396Qe3.m88279h(m26881b, false, 1, null);
        InterfaceC45453n30 m91760c = C34928Oe3.m91760c(m88279h);
        try {
            m91760c.mo24532R2(mo5832a);
            CloseableKt.closeFinally(m91760c, null);
            String packageName = context.getPackageName();
            return FileProvider.m67714f(context, packageName + ".com.chuckerteam.chucker.provider", m26881b);
        } finally {
        }
    }
}
