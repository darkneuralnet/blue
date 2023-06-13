package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.stripe.android.core.networking.AnalyticsFields;
import java.util.List;
/* renamed from: cO5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC39114cO5 {
    /* renamed from: e */
    public static AbstractC39114cO5 m61451e(Bundle bundle) {
        return new UJ6(bundle.getInt(AnalyticsFields.SESSION_ID), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    @Nullable
    /* renamed from: a */
    public abstract List<String> mo61455a();

    @Nullable
    /* renamed from: b */
    public abstract List<String> mo61454b();

    /* renamed from: c */
    public abstract long mo61453c();

    @Nullable
    /* renamed from: d */
    public abstract List<Intent> mo61452d();

    /* renamed from: f */
    public abstract int mo61450f();

    @Nullable
    @Deprecated
    /* renamed from: g */
    public abstract PendingIntent mo61449g();

    /* renamed from: h */
    public abstract int mo61448h();

    /* renamed from: i */
    public abstract int mo61447i();

    /* renamed from: j */
    public abstract long mo61446j();
}
