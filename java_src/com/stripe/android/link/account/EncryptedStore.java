package com.stripe.android.link.account;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C49783uM2;
import p000.SharedPreferencesC36078Tc1;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/link/account/EncryptedStore;", "", "", "key", "value", "", "write", "read", "delete", "LuM2;", "masterKey", "LuM2;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Companion", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class EncryptedStore {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final String FILE_NAME = "LinkStore";
    private final C49783uM2 masterKey;
    private final SharedPreferences sharedPreferences;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/link/account/EncryptedStore$Companion;", "", "()V", "FILE_NAME", "", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public EncryptedStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C49783uM2 m10409a = new C49783uM2.C29174b(context).m10408b(C49783uM2.EnumC29178c.AES256_GCM).m10409a();
        Intrinsics.checkNotNullExpressionValue(m10409a, "Builder(context)\n       …256_GCM)\n        .build()");
        this.masterKey = m10409a;
        SharedPreferences m83334a = SharedPreferencesC36078Tc1.m83334a(context.getApplicationContext(), FILE_NAME, m10409a, SharedPreferencesC36078Tc1.EnumC7894d.AES256_SIV, SharedPreferencesC36078Tc1.EnumC7895e.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(m83334a, "create(\n        context.…onScheme.AES256_GCM\n    )");
        this.sharedPreferences = m83334a;
    }

    public final void delete(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.remove(key);
        edit.apply();
    }

    public final String read(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.sharedPreferences.getString(key, null);
    }

    public final void write(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString(key, value);
        edit.apply();
    }
}
