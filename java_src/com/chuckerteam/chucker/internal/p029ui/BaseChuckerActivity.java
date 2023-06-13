package com.chuckerteam.chucker.internal.p029ui;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b \u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¨\u0006\u0011"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "", "message", "", "toastDuration", "w", "<init>", "()V", "b", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.chuckerteam.chucker.internal.ui.BaseChuckerActivity */
/* loaded from: classes5.dex */
public abstract class BaseChuckerActivity extends AppCompatActivity {

    /* renamed from: b */
    public static final C17159a f69252b = new C17159a(null);

    /* renamed from: c */
    public static boolean f69253c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lcom/chuckerteam/chucker/internal/ui/BaseChuckerActivity$a;", "", "", "<set-?>", "isInForeground", "Z", C17296a.f69688o, "()Z", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.chuckerteam.chucker.internal.ui.BaseChuckerActivity$a */
    /* loaded from: classes5.dex */
    public static final class C17159a {
        public /* synthetic */ C17159a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m52957a() {
            return BaseChuckerActivity.f69253c;
        }

        private C17159a() {
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m52958x(BaseChuckerActivity baseChuckerActivity, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showToast");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        baseChuckerActivity.m52959w(str, i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42041hI4 c42041hI4 = C42041hI4.f84975a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        c42041hI4.m36552a(applicationContext);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        f69253c = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        f69253c = true;
    }

    /* renamed from: w */
    public final void m52959w(String message, int i) {
        Intrinsics.checkNotNullParameter(message, "message");
        Toast.makeText(getApplicationContext(), message, i).show();
    }
}
