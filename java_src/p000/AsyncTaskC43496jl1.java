package p000;

import android.os.AsyncTask;
import com.facebook.share.internal.C17296a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0005\"\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0014R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Ljl1;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "", "args", C17296a.f69688o, "([Ljava/lang/String;)Ljava/lang/Boolean;", "isSuccess", "", "b", "Ljava/lang/String;", "uriStr", "Ljava/io/File;", "Ljava/io/File;", "destFile", "Ljl1$a;", "c", "Ljl1$a;", "onSuccess", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljl1$a;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: jl1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class AsyncTaskC43496jl1 extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    public final String f93266a;

    /* renamed from: b */
    public final File f93267b;

    /* renamed from: c */
    public final InterfaceC25004a f93268c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Ljl1$a;", "", "Ljava/io/File;", "file", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: jl1$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC25004a {
        /* renamed from: a */
        void mo29999a(File file);
    }

    public AsyncTaskC43496jl1(String uriStr, File destFile, InterfaceC25004a onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.f93266a = uriStr;
        this.f93267b = destFile;
        this.f93268c = onSuccess;
    }

    /* renamed from: a */
    public Boolean m30001a(String... args) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            if (TD0.m84203d(this)) {
                return null;
            }
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                URL url = new URL(this.f93266a);
                URLConnection conn = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                Intrinsics.checkNotNullExpressionValue(conn, "conn");
                int contentLength = conn.getContentLength();
                DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f93267b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: b */
    public void m30000b(boolean z) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (!TD0.m84203d(this) && z) {
                this.f93268c.mo29999a(this.f93267b);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            if (TD0.m84203d(this)) {
                return null;
            }
            return m30001a(strArr);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            if (TD0.m84203d(this)) {
                return;
            }
            m30000b(bool.booleanValue());
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }
}
