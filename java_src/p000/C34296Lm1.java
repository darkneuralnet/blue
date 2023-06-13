package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import p000.InterfaceC46836pO1;
/* renamed from: Lm1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34296Lm1 extends AbstractC34062Km1 {

    /* renamed from: a */
    public final GoogleApi<Api.ApiOptions.NoOptions> f22035a;

    /* renamed from: b */
    public final X94<InterfaceC12447ba> f22036b;

    /* renamed from: c */
    public final C31722Am1 f22037c;

    /* renamed from: Lm1$a */
    /* loaded from: classes6.dex */
    public static class BinderC5081a extends InterfaceC46836pO1.AbstractBinderC27282a {
        @Override // p000.InterfaceC46836pO1
        /* renamed from: C3 */
        public void mo19358C3(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
            throw new UnsupportedOperationException();
        }

        @Override // p000.InterfaceC46836pO1
        /* renamed from: U2 */
        public void mo19357U2(Status status, DynamicLinkData dynamicLinkData) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: Lm1$b */
    /* loaded from: classes6.dex */
    public static class BinderC5082b extends BinderC5081a {

        /* renamed from: a */
        public final TaskCompletionSource<InterfaceC36523Uz5> f22038a;

        public BinderC5082b(TaskCompletionSource<InterfaceC36523Uz5> taskCompletionSource) {
            this.f22038a = taskCompletionSource;
        }

        @Override // p000.C34296Lm1.BinderC5081a, p000.InterfaceC46836pO1
        /* renamed from: C3 */
        public void mo19358C3(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
            TaskUtil.setResultOrApiException(status, shortDynamicLinkImpl, this.f22038a);
        }
    }

    /* renamed from: Lm1$c */
    /* loaded from: classes6.dex */
    public static final class C5083c extends TaskApiCall<A81, InterfaceC36523Uz5> {

        /* renamed from: a */
        public final Bundle f22039a;

        public C5083c(Bundle bundle) {
            super(null, false, 13202);
            this.f22039a = bundle;
        }

        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        /* renamed from: a */
        public void doExecute(A81 a81, TaskCompletionSource<InterfaceC36523Uz5> taskCompletionSource) throws RemoteException {
            a81.m116071d(new BinderC5082b(taskCompletionSource), this.f22039a);
        }
    }

    /* renamed from: Lm1$d */
    /* loaded from: classes6.dex */
    public static class BinderC5084d extends BinderC5081a {

        /* renamed from: a */
        public final TaskCompletionSource<C38537bQ3> f22040a;

        /* renamed from: b */
        public final X94<InterfaceC12447ba> f22041b;

        public BinderC5084d(X94<InterfaceC12447ba> x94, TaskCompletionSource<C38537bQ3> taskCompletionSource) {
            this.f22041b = x94;
            this.f22040a = taskCompletionSource;
        }

        @Override // p000.C34296Lm1.BinderC5081a, p000.InterfaceC46836pO1
        /* renamed from: U2 */
        public void mo19357U2(Status status, DynamicLinkData dynamicLinkData) {
            C38537bQ3 c38537bQ3;
            Bundle bundle;
            InterfaceC12447ba interfaceC12447ba;
            if (dynamicLinkData == null) {
                c38537bQ3 = null;
            } else {
                c38537bQ3 = new C38537bQ3(dynamicLinkData);
            }
            TaskUtil.setResultOrApiException(status, c38537bQ3, this.f22040a);
            if (dynamicLinkData == null || (bundle = dynamicLinkData.m47306E().getBundle("scionData")) == null || bundle.keySet() == null || (interfaceC12447ba = this.f22041b.get()) == null) {
                return;
            }
            for (String str : bundle.keySet()) {
                interfaceC12447ba.mo61209a("fdl", str, bundle.getBundle(str));
            }
        }
    }

    /* renamed from: Lm1$e */
    /* loaded from: classes6.dex */
    public static final class C5085e extends TaskApiCall<A81, C38537bQ3> {

        /* renamed from: a */
        public final String f22042a;

        /* renamed from: b */
        public final X94<InterfaceC12447ba> f22043b;

        public C5085e(X94<InterfaceC12447ba> x94, String str) {
            super(null, false, 13201);
            this.f22042a = str;
            this.f22043b = x94;
        }

        @Override // com.google.android.gms.common.api.internal.TaskApiCall
        /* renamed from: a */
        public void doExecute(A81 a81, TaskCompletionSource<C38537bQ3> taskCompletionSource) throws RemoteException {
            a81.m116070e(new BinderC5084d(this.f22043b, taskCompletionSource), this.f22042a);
        }
    }

    public C34296Lm1(C31722Am1 c31722Am1, X94<InterfaceC12447ba> x94) {
        this(new C52618z81(c31722Am1.m115293j()), c31722Am1, x94);
    }

    /* renamed from: h */
    public static void m96365h(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (TextUtils.isEmpty(bundle.getString("domainUriPrefix")) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    @Override // p000.AbstractC34062Km1
    /* renamed from: a */
    public C49654u81 mo96370a() {
        return new C49654u81(this);
    }

    @Override // p000.AbstractC34062Km1
    /* renamed from: b */
    public Task<C38537bQ3> mo96369b(Intent intent) {
        String str;
        C38537bQ3 m96366g;
        if (intent != null) {
            str = intent.getDataString();
        } else {
            str = null;
        }
        Task doWrite = this.f22035a.doWrite(new C5085e(this.f22036b, str));
        if (intent != null && (m96366g = m96366g(intent)) != null) {
            return Tasks.forResult(m96366g);
        }
        return doWrite;
    }

    /* renamed from: e */
    public Task<InterfaceC36523Uz5> m96368e(Bundle bundle) {
        m96365h(bundle);
        return this.f22035a.doWrite(new C5083c(bundle));
    }

    /* renamed from: f */
    public C31722Am1 m96367f() {
        return this.f22037c;
    }

    /* renamed from: g */
    public C38537bQ3 m96366g(Intent intent) {
        DynamicLinkData dynamicLinkData = (DynamicLinkData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", DynamicLinkData.CREATOR);
        if (dynamicLinkData != null) {
            return new C38537bQ3(dynamicLinkData);
        }
        return null;
    }

    @VisibleForTesting
    public C34296Lm1(GoogleApi<Api.ApiOptions.NoOptions> googleApi, C31722Am1 c31722Am1, X94<InterfaceC12447ba> x94) {
        this.f22035a = googleApi;
        this.f22037c = (C31722Am1) Preconditions.checkNotNull(c31722Am1);
        this.f22036b = x94;
        if (x94.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }
}
