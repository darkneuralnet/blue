package p000;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/* renamed from: Ke3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33992Ke3 implements InterfaceC38351b61 {

    /* renamed from: a */
    public final Call.Factory f19961a;

    /* renamed from: b */
    public final Cache f19962b;

    /* renamed from: c */
    public boolean f19963c;

    public C33992Ke3(Context context) {
        this(C32861Fi6.m106707e(context));
    }

    @Override // p000.InterfaceC38351b61
    /* renamed from: a */
    public Response mo64973a(Request request) throws IOException {
        return FirebasePerfOkHttpClient.execute(this.f19961a.newCall(request));
    }

    public C33992Ke3(File file) {
        this(file, C32861Fi6.m106711a(file));
    }

    public C33992Ke3(File file, long j) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j)).build());
        this.f19963c = false;
    }

    public C33992Ke3(OkHttpClient okHttpClient) {
        this.f19963c = true;
        this.f19961a = okHttpClient;
        this.f19962b = okHttpClient.cache();
    }
}
