package com.stripe.android.link.account;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0018J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u000b*\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/link/account/CookieStore;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "store", "Lcom/stripe/android/link/account/EncryptedStore;", "(Lcom/stripe/android/link/account/EncryptedStore;)V", "clear", "", "getAuthSessionCookie", "", "getAuthSessionCookie$link_release", "getNewUserEmail", "getNewUserEmail$link_release", "isEmailLoggedOut", "", "email", "isEmailLoggedOut$link_release", "logout", "logout$link_release", "storeLoggedOutEmail", "storeLoggedOutEmail$link_release", "storeNewUserEmail", "storeNewUserEmail$link_release", "updateAuthSessionCookie", "cookie", "updateAuthSessionCookie$link_release", "(Ljava/lang/String;)Lkotlin/Unit;", "sha256", "Companion", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCookieStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieStore.kt\ncom/stripe/android/link/account/CookieStore\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,102:1\n13579#2,2:103\n*S KotlinDebug\n*F\n+ 1 CookieStore.kt\ncom/stripe/android/link/account/CookieStore\n*L\n24#1:103,2\n*E\n"})
/* loaded from: classes7.dex */
public final class CookieStore {
    private final EncryptedStore store;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final String AUTH_SESSION_COOKIE = "auth_session_cookie";
    public static final String LOGGED_OUT_EMAIL_HASH = "logged_out_email_hash";
    public static final String SIGNED_UP_EMAIL = "signed_up_email";
    private static final String[] allCookies = {AUTH_SESSION_COOKIE, LOGGED_OUT_EMAIL_HASH, SIGNED_UP_EMAIL};

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/link/account/CookieStore$Companion;", "", "()V", "AUTH_SESSION_COOKIE", "", "LOGGED_OUT_EMAIL_HASH", "SIGNED_UP_EMAIL", "allCookies", "", "getAllCookies", "()[Ljava/lang/String;", "[Ljava/lang/String;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String[] getAllCookies() {
            return CookieStore.allCookies;
        }

        private Companion() {
        }
    }

    public CookieStore(EncryptedStore store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.store = store;
    }

    private final String sha256(String str) {
        String joinToString$default;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "getInstance(\"SHA-256\").d…yteArray(Charsets.UTF_8))");
        joinToString$default = ArraysKt___ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) CookieStore$sha256$1.INSTANCE, 30, (Object) null);
        return joinToString$default;
    }

    public final void clear() {
        for (String str : allCookies) {
            this.store.delete(str);
        }
    }

    public final String getAuthSessionCookie$link_release() {
        return this.store.read(AUTH_SESSION_COOKIE);
    }

    public final String getNewUserEmail$link_release() {
        String read = this.store.read(SIGNED_UP_EMAIL);
        this.store.delete(SIGNED_UP_EMAIL);
        return read;
    }

    public final boolean isEmailLoggedOut$link_release(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return Intrinsics.areEqual(this.store.read(LOGGED_OUT_EMAIL_HASH), sha256(email));
    }

    public final void logout$link_release(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        storeLoggedOutEmail$link_release(email);
        this.store.delete(AUTH_SESSION_COOKIE);
        this.store.delete(SIGNED_UP_EMAIL);
    }

    public final void storeLoggedOutEmail$link_release(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.store.write(LOGGED_OUT_EMAIL_HASH, sha256(email));
    }

    public final void storeNewUserEmail$link_release(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.store.write(SIGNED_UP_EMAIL, email);
    }

    public final Unit updateAuthSessionCookie$link_release(String str) {
        boolean z;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.store.delete(AUTH_SESSION_COOKIE);
            } else {
                this.store.write(AUTH_SESSION_COOKIE, str);
            }
            return Unit.INSTANCE;
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CookieStore(Context context) {
        this(new EncryptedStore(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
