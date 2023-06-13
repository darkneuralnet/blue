package com.stripe.android.core.utils;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/core/utils/PluginDetector;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "pluginType", "getPluginType", "()Ljava/lang/String;", "isPlugin", "", "className", "PluginType", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPluginDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginDetector.kt\ncom/stripe/android/core/utils/PluginDetector\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,41:1\n1282#2,2:42\n*S KotlinDebug\n*F\n+ 1 PluginDetector.kt\ncom/stripe/android/core/utils/PluginDetector\n*L\n18#1:42,2\n*E\n"})
/* loaded from: classes6.dex */
public final class PluginDetector {
    public static final PluginDetector INSTANCE = new PluginDetector();
    private static final String TAG = PluginDetector.class.getSimpleName();
    private static final String pluginType;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/core/utils/PluginDetector$PluginType;", "", "className", "", "pluginName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getClassName", "()Ljava/lang/String;", "getPluginName", "ReactNative", "Flutter", "Cordova", "Unity", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public enum PluginType {
        ReactNative("com.facebook.react.bridge.NativeModule", "react-native"),
        Flutter("io.flutter.embedding.engine.FlutterEngine", "flutter"),
        Cordova("org.apache.cordova.CordovaActivity", "cordova"),
        Unity("com.unity3d.player.UnityPlayerActivity", "unity");
        
        private final String className;
        private final String pluginName;

        PluginType(String str, String str2) {
            this.className = str;
            this.pluginName = str2;
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getPluginName() {
            return this.pluginName;
        }
    }

    static {
        String str;
        PluginType pluginType2;
        PluginType[] values = PluginType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            str = null;
            if (i < length) {
                pluginType2 = values[i];
                if (INSTANCE.isPlugin(pluginType2.getClassName())) {
                    break;
                }
                i++;
            } else {
                pluginType2 = null;
                break;
            }
        }
        if (pluginType2 != null) {
            str = pluginType2.getPluginName();
        }
        pluginType = str;
    }

    private PluginDetector() {
    }

    private final boolean isPlugin(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException e) {
            String str2 = TAG;
            Log.d(str2, str + " not found: " + e);
            return false;
        }
    }

    public final String getPluginType() {
        return pluginType;
    }
}
