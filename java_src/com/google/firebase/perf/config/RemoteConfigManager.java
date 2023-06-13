package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
@Keep
/* loaded from: classes6.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, InterfaceC35475Qn1> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final C42479i21 cache;
    private final Executor executor;
    private C34773Nn1 firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private X94<C36486Uv4> firebaseRemoteConfigProvider;
    private static final C10776ad logger = C10776ad.m71007e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(C42479i21.m35346e(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS) + MIN_APP_START_CONFIG_FETCH_DELAY_MS, getInitialStartupMillis());
    }

    @VisibleForTesting
    public static long getInitialStartupMillis() {
        AbstractC46849pP5 abstractC46849pP5 = (AbstractC46849pP5) C31722Am1.m115292k().m115294i(AbstractC46849pP5.class);
        if (abstractC46849pP5 != null) {
            return abstractC46849pP5.mo19334c();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private InterfaceC35475Qn1 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            InterfaceC35475Qn1 interfaceC35475Qn1 = this.allRcConfigMap.get(str);
            if (interfaceC35475Qn1.getSource() == 2) {
                logger.m71010b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", interfaceC35475Qn1.mo86297c(), str);
                return interfaceC35475Qn1;
            }
            return null;
        }
        return null;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0 */
    public /* synthetic */ void m47113xc904e813(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.m93427h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1 */
    public /* synthetic */ void m47112xc904e814(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.m93428g().addOnSuccessListener(this.executor, new OnSuccessListener() { // from class: Vv4
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RemoteConfigManager.this.m47113xc904e813((Boolean) obj);
            }
        }).addOnFailureListener(this.executor, new OnFailureListener() { // from class: Wv4
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RemoteConfigManager.this.m47112xc904e814(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (!isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if (this.allRcConfigMap.isEmpty()) {
            this.allRcConfigMap.putAll(this.firebaseRemoteConfig.m93427h());
        }
        if (shouldFetchAndActivateRemoteConfigValues()) {
            triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }

    public C43628jy3<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.m71011a("The key to get Remote Config boolean value is null.");
            return C43628jy3.m29585a();
        }
        InterfaceC35475Qn1 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C43628jy3.m29581e(Boolean.valueOf(remoteConfigValue.mo86296d()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo86297c().isEmpty()) {
                    logger.m71010b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo86297c(), str);
                }
            }
        }
        return C43628jy3.m29585a();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public C43628jy3<Double> getDouble(String str) {
        if (str == null) {
            logger.m71011a("The key to get Remote Config double value is null.");
            return C43628jy3.m29585a();
        }
        InterfaceC35475Qn1 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C43628jy3.m29581e(Double.valueOf(remoteConfigValue.mo86298b()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo86297c().isEmpty()) {
                    logger.m71010b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo86297c(), str);
                }
            }
        }
        return C43628jy3.m29585a();
    }

    public C43628jy3<Long> getLong(String str) {
        if (str == null) {
            logger.m71011a("The key to get Remote Config long value is null.");
            return C43628jy3.m29585a();
        }
        InterfaceC35475Qn1 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return C43628jy3.m29581e(Long.valueOf(remoteConfigValue.mo86299a()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.mo86297c().isEmpty()) {
                    logger.m71010b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo86297c(), str);
                }
            }
        }
        return C43628jy3.m29585a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        Object obj;
        InterfaceC35475Qn1 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    obj = Boolean.valueOf(remoteConfigValue.mo86296d());
                } else if (t instanceof Double) {
                    obj = Double.valueOf(remoteConfigValue.mo86298b());
                } else {
                    if (!(t instanceof Long) && !(t instanceof Integer)) {
                        if (t instanceof String) {
                            obj = remoteConfigValue.mo86297c();
                        } else {
                            T t2 = (T) remoteConfigValue.mo86297c();
                            try {
                                logger.m71010b("No matching type found for the defaultValue: '%s', using String.", t);
                                return t2;
                            } catch (IllegalArgumentException unused) {
                                t = t2;
                                if (!remoteConfigValue.mo86297c().isEmpty()) {
                                    logger.m71010b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.mo86297c(), str);
                                    return t;
                                }
                                return t;
                            }
                        }
                    }
                    obj = Long.valueOf(remoteConfigValue.mo86299a());
                }
                return obj;
            } catch (IllegalArgumentException unused2) {
            }
        } else {
            return t;
        }
    }

    public C43628jy3<String> getString(String str) {
        if (str == null) {
            logger.m71011a("The key to get Remote Config String value is null.");
            return C43628jy3.m29585a();
        }
        InterfaceC35475Qn1 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return C43628jy3.m29581e(remoteConfigValue.mo86297c());
        }
        return C43628jy3.m29585a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        X94<C36486Uv4> x94;
        C36486Uv4 c36486Uv4;
        if (this.firebaseRemoteConfig == null && (x94 = this.firebaseRemoteConfigProvider) != null && (c36486Uv4 = x94.get()) != null) {
            this.firebaseRemoteConfig = c36486Uv4.m80630d(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        C34773Nn1 c34773Nn1 = this.firebaseRemoteConfig;
        if (c34773Nn1 == null || c34773Nn1.m93426i().mo46895a() == 1) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(X94<C36486Uv4> x94) {
        this.firebaseRemoteConfigProvider = x94;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, InterfaceC35475Qn1> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        C43022ix0 m31565e = C43022ix0.m31565e();
        InterfaceC35475Qn1 interfaceC35475Qn1 = this.allRcConfigMap.get(m31565e.mo88c());
        if (interfaceC35475Qn1 != null) {
            try {
                this.cache.m35338m(m31565e.mo89a(), interfaceC35475Qn1.mo86296d());
                return;
            } catch (Exception unused) {
                logger.m71011a("ExperimentTTID remote config flag has invalid value, expected boolean.");
                return;
            }
        }
        logger.m71011a("ExperimentTTID remote config flag does not exist.");
    }

    @VisibleForTesting
    public RemoteConfigManager(C42479i21 c42479i21, Executor executor, C34773Nn1 c34773Nn1, long j, long j2) {
        ConcurrentHashMap<String, InterfaceC35475Qn1> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = c42479i21;
        this.executor = executor;
        this.firebaseRemoteConfig = c34773Nn1;
        if (c34773Nn1 == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(c34773Nn1.m93427h());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }
}
