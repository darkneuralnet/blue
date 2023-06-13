package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;
/* loaded from: classes5.dex */
public class VersionUtil {
    private static final Pattern V_SEP = Pattern.compile("[-_./;:]");

    private static final void _close(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    @Deprecated
    public static Version mavenVersionFor(ClassLoader classLoader, String str, String str2) {
        InputStream resourceAsStream = classLoader.getResourceAsStream("META-INF/maven/" + str.replaceAll("\\.", "/") + "/" + str2 + "/pom.properties");
        if (resourceAsStream != null) {
            try {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                return parseVersion(properties.getProperty("version"), properties.getProperty("groupId"), properties.getProperty("artifactId"));
            } catch (IOException unused) {
            } finally {
                _close(resourceAsStream);
            }
        }
        return Version.unknownVersion();
    }

    @Deprecated
    public static Version packageVersionFor(Class<?> cls) {
        return versionFor(cls);
    }

    public static Version parseVersion(String str, String str2, String str3) {
        int i;
        String str4;
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > 0) {
                String[] split = V_SEP.split(trim);
                int i2 = 0;
                int parseVersionPart = parseVersionPart(split[0]);
                if (split.length > 1) {
                    i = parseVersionPart(split[1]);
                } else {
                    i = 0;
                }
                if (split.length > 2) {
                    i2 = parseVersionPart(split[2]);
                }
                int i3 = i2;
                if (split.length > 3) {
                    str4 = split[3];
                } else {
                    str4 = null;
                }
                return new Version(parseVersionPart, i, i3, str4, str2, str3);
            }
        }
        return Version.unknownVersion();
    }

    public static int parseVersionPart(String str) {
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i = (i * 10) + (charAt - '0');
        }
        return i;
    }

    public static final void throwInternal() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static Version versionFor(Class<?> cls) {
        Version version;
        Object obj;
        try {
            try {
                version = ((Versioned) Class.forName(cls.getPackage().getName() + ".PackageVersion", true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).version();
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to get Versioned out of " + obj);
            }
        } catch (Exception unused2) {
            version = null;
        }
        if (version == null) {
            return Version.unknownVersion();
        }
        return version;
    }

    @Deprecated
    public Version version() {
        return Version.unknownVersion();
    }
}
