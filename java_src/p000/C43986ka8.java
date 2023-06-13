package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* renamed from: ka8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43986ka8 {

    /* renamed from: a */
    public static final Pattern f94546a = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* renamed from: b */
    public static final Account f94547b = C40767f88.f79536a;

    /* renamed from: c */
    public static final Set<String> f94548c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* renamed from: d */
    public static final Set<String> f94549d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));

    /* renamed from: a */
    public static U98 m28815a(Context context) {
        return new U98(context, null);
    }

    /* renamed from: b */
    public static void m28814b(String str) {
        C32368Df8.m110018a(f94546a.matcher("recaptcha").matches(), "Module must match [a-z]+(_[a-z]+)*: %s", "recaptcha");
        C32368Df8.m110018a(!f94548c.contains("recaptcha"), "Module name is reserved and cannot be used: %s", "recaptcha");
    }
}
