package ch.qos.logback.core.android;

import android.annotation.TargetApi;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
/* loaded from: classes.dex */
public class AndroidContextUtil {
    private ContextWrapper context;

    public AndroidContextUtil() {
        this(getContext());
    }

    private String absPath(File file) {
        return file != null ? file.getAbsolutePath() : "";
    }

    public static ContextWrapper getContext() {
        try {
            Class<?> cls = Class.forName("android.app.AppGlobals");
            return (ContextWrapper) cls.getDeclaredMethod("getInitialApplication", new Class[0]).invoke(cls, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public String getCacheDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        return contextWrapper != null ? absPath(contextWrapper.getCacheDir()) : "";
    }

    public String getDatabaseDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        return (contextWrapper == null || contextWrapper.getDatabasePath("x") == null) ? "" : this.context.getDatabasePath("x").getParent();
    }

    public String getDatabasePath(String str) {
        ContextWrapper contextWrapper = this.context;
        return contextWrapper != null ? absPath(contextWrapper.getDatabasePath(str)) : "";
    }

    public String getExternalCacheDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        return contextWrapper != null ? absPath(contextWrapper.getExternalCacheDir()) : "";
    }

    @TargetApi(8)
    public String getExternalFilesDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        return contextWrapper != null ? absPath(contextWrapper.getExternalFilesDir(null)) : "";
    }

    @TargetApi(8)
    public String getExternalStorageDirectoryPath() {
        return Build.VERSION.SDK_INT >= 29 ? getExternalFilesDirectoryPath() : absPath(Environment.getExternalStorageDirectory());
    }

    public String getFilesDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        return contextWrapper != null ? absPath(contextWrapper.getFilesDir()) : "";
    }

    public String getMountedExternalStorageDirectoryPath() {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) {
            return getExternalStorageDirectoryPath();
        }
        return null;
    }

    @TargetApi(21)
    public String getNoBackupFilesDirectoryPath() {
        ContextWrapper contextWrapper = this.context;
        return contextWrapper != null ? absPath(contextWrapper.getNoBackupFilesDir()) : "";
    }

    public String getPackageName() {
        ContextWrapper contextWrapper = this.context;
        return contextWrapper != null ? contextWrapper.getPackageName() : "";
    }

    public String getVersionCode() {
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null) {
            try {
                PackageInfo packageInfo = contextWrapper.getPackageManager().getPackageInfo(getPackageName(), 0);
                return "" + packageInfo.versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getVersionName() {
        String str;
        ContextWrapper contextWrapper = this.context;
        if (contextWrapper != null) {
            try {
                str = contextWrapper.getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return str == null ? str : "";
        }
        str = "";
        if (str == null) {
        }
    }

    public void setupProperties(LoggerContext loggerContext) {
        Properties properties = new Properties();
        properties.setProperty(CoreConstants.DATA_DIR_KEY, getFilesDirectoryPath());
        String mountedExternalStorageDirectoryPath = getMountedExternalStorageDirectoryPath();
        if (mountedExternalStorageDirectoryPath != null) {
            properties.setProperty(CoreConstants.EXT_DIR_KEY, mountedExternalStorageDirectoryPath);
        }
        properties.setProperty(CoreConstants.PACKAGE_NAME_KEY, getPackageName());
        properties.setProperty(CoreConstants.VERSION_CODE_KEY, getVersionCode());
        properties.setProperty(CoreConstants.VERSION_NAME_KEY, getVersionName());
        loggerContext.putProperties(properties);
    }

    public AndroidContextUtil(ContextWrapper contextWrapper) {
        this.context = contextWrapper;
    }
}
