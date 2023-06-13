package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Xml;
import androidx.appcompat.app.AbstractC10999c;
import androidx.appcompat.app.C11002d;
import com.amazonaws.services.p026s3.internal.Constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public class C11002d {

    /* renamed from: androidx.appcompat.app.d$a */
    /* loaded from: classes.dex */
    public static class ExecutorC11003a implements Executor {

        /* renamed from: b */
        public final Object f51715b = new Object();

        /* renamed from: c */
        public final Queue<Runnable> f51716c = new ArrayDeque();

        /* renamed from: d */
        public final Executor f51717d;

        /* renamed from: e */
        public Runnable f51718e;

        public ExecutorC11003a(Executor executor) {
            this.f51717d = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m70257b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                m70256c();
            }
        }

        /* renamed from: c */
        public void m70256c() {
            synchronized (this.f51715b) {
                Runnable poll = this.f51716c.poll();
                this.f51718e = poll;
                if (poll != null) {
                    this.f51717d.execute(poll);
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f51715b) {
                this.f51716c.add(new Runnable() { // from class: fj
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11002d.ExecutorC11003a.this.m70257b(runnable);
                    }
                });
                if (this.f51718e == null) {
                    m70256c();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.d$b */
    /* loaded from: classes.dex */
    public static class ExecutorC11004b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    private C11002d() {
    }

    /* renamed from: a */
    public static void m70261a(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument(Constants.DEFAULT_ENCODING, Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: " + str, e);
                if (openFileOutput == null) {
                    return;
                }
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r3 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (r2.isEmpty() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
        android.util.Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
        return r2;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m70260b(Context context) {
        FileInputStream fileInputStream;
        String str = "";
        try {
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, Constants.DEFAULT_ENCODING);
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1 || (next == 3 && newPullParser.getDepth() <= depth)) {
                            break;
                        } else if (next != 3 && next != 4 && newPullParser.getName().equals("locales")) {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
            } catch (FileNotFoundException unused2) {
                Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return "";
            }
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static void m70259c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (AbstractC10999c.m70271n().m7767g()) {
                    String m70260b = m70260b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        AbstractC10999c.C11001b.m70262b(systemService, AbstractC10999c.C11000a.m70264a(m70260b));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
