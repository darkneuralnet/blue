package kotlin.reflect.jvm.internal.impl.platform;

import ch.qos.logback.core.CoreConstants;
/* loaded from: classes8.dex */
public abstract class SimplePlatform {
    private final String platformName;
    private final TargetPlatformVersion targetPlatformVersion;

    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.targetPlatformVersion;
    }

    public String toString() {
        boolean z;
        String targetName = getTargetName();
        if (targetName.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.platformName + " (" + targetName + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return this.platformName;
    }
}
