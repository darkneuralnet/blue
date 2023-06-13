package zendesk.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import p000.C42732iT3;
import zendesk.core.ActionHandler;
import zendesk.core.ApplicationConfiguration;
import zendesk.core.SessionStorage;
import zendesk.support.requestlist.RequestInfoDataSource;
/* JADX INFO: Access modifiers changed from: package-private */
@Module
/* loaded from: classes8.dex */
public class SupportSdkModule {
    private static final int MAX_DISK_CACHE_SIZE = 20971520;

    @Provides
    public C32054Bx0 configurationHelper() {
        return new C32054Bx0();
    }

    @Provides
    public Executor mainThreadExecutor() {
        return new Executor() { // from class: zendesk.support.SupportSdkModule.1
            Handler handler = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.handler.post(runnable);
            }
        };
    }

    @Provides
    public C33992Ke3 okHttp3Downloader(OkHttpClient okHttpClient) {
        return new C33992Ke3(okHttpClient);
    }

    @Provides
    public C46153oE1 provides() {
        return new C46153oE1();
    }

    @Provides
    public List<ActionHandler> providesActionHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DeepLinkToRequestActionHandler());
        return arrayList;
    }

    @Provides
    public C42732iT3 providesPicasso(Context context, C33992Ke3 c33992Ke3, ExecutorService executorService) {
        return new C42732iT3.C23262b(context).m33870c(c33992Ke3).m33869d(executorService).m33871b(Bitmap.Config.RGB_565).m33872a();
    }

    @Provides
    public F41 providesRequestDiskLruCache(SessionStorage sessionStorage) {
        try {
            return F41.m107844x(new File(sessionStorage.getZendeskDataDir(), "request"), 1, 1, 20971520L);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Provides
    @SuppressLint({"RestrictedApi"})
    public String providesZendeskUrl(ApplicationConfiguration applicationConfiguration) {
        return applicationConfiguration.getZendeskUrl();
    }

    @Provides
    public RequestInfoDataSource.LocalDataSource requestInfoDataSource(SupportUiStorage supportUiStorage, Executor executor, ExecutorService executorService) {
        return new RequestInfoDataSource.LocalDataSource(new RequestInfoDataSource.Disk(executor, executorService, supportUiStorage, RequestInfoDataSource.LOCAL));
    }

    @Provides
    public SupportUiStorage supportUiStorage(F41 f41, C46153oE1 c46153oE1) {
        return new SupportUiStorage(f41, c46153oE1);
    }
}
