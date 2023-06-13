package co.bird.android.feature.operator.tasklistv2;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.operator.tasklistv2.InterfaceC15041b;
import co.bird.android.feature.operator.tasklistv2.OperatorTaskListV2Activity;
import co.bird.android.model.persistence.OperatorTaskBanner;
import co.bird.android.model.persistence.OperatorTaskGroup;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.tabs.C17914b;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.S74;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\t\b\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"Lco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "Lrx4;", "Luw3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", TransferTable.COLUMN_STATE, "S", "", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "taskGroups", "U", "Lsw3;", "j", "Lsw3;", "R", "()Lsw3;", "setPresenter", "(Lsw3;)V", "presenter", "LWv3;", "k", "LWv3;", "Q", "()LWv3;", "setAdapter", "(LWv3;)V", "adapter", "LD4;", "l", "LD4;", "binding", "Lcom/google/android/material/tabs/b;", "m", "Lcom/google/android/material/tabs/b;", "tabLayoutMediator", "<init>", "()V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorTaskListV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorTaskListV2Activity.kt\nco/bird/android/feature/operator/tasklistv2/OperatorTaskListV2Activity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
/* loaded from: classes3.dex */
public final class OperatorTaskListV2Activity extends BaseActivityLite implements InterfaceC48362rx4<AbstractC50130uw3> {

    /* renamed from: j */
    public C48944sw3 f64313j;

    /* renamed from: k */
    public C36953Wv3 f64314k;

    /* renamed from: l */
    public C1361D4 f64315l;

    /* renamed from: m */
    public C17914b f64316m;

    /* renamed from: X */
    public static final void m57849X(List taskGroups, TabLayout.C17910g tab, int i) {
        Intrinsics.checkNotNullParameter(taskGroups, "$taskGroups");
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (i < taskGroups.size()) {
            tab.m48705r(((OperatorTaskGroup) taskGroups.get(i)).getTitle());
        }
    }

    /* renamed from: Q */
    public final C36953Wv3 m57853Q() {
        C36953Wv3 c36953Wv3 = this.f64314k;
        if (c36953Wv3 != null) {
            return c36953Wv3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    /* renamed from: R */
    public final C48944sw3 m57852R() {
        C48944sw3 c48944sw3 = this.f64313j;
        if (c48944sw3 != null) {
            return c48944sw3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: S */
    public void render(AbstractC50130uw3 state) {
        boolean z;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C52559z22) {
            C52559z22 c52559z22 = (C52559z22) state;
            OperatorTaskBanner m1934b = c52559z22.m1934b();
            if (m1934b != null) {
                C1361D4 c1361d4 = this.f64315l;
                if (c1361d4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c1361d4 = null;
                }
                c1361d4.f5176b.setText(m1934b.getTitle());
                C1361D4 c1361d42 = this.f64315l;
                if (c1361d42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c1361d42 = null;
                }
                c1361d42.f5176b.setTextColor(m1934b.getTitleColor().getLightMode());
                C1361D4 c1361d43 = this.f64315l;
                if (c1361d43 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c1361d43 = null;
                }
                c1361d43.f5176b.setBackgroundTintList(ColorStateList.valueOf(m1934b.getBackgroundColor().getLightMode()));
            }
            C1361D4 c1361d44 = this.f64315l;
            if (c1361d44 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c1361d44 = null;
            }
            TextView textView = c1361d44.f5176b;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.banner");
            if (c52559z22.m1934b() != null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(textView, z, 0, 2, null);
            m57850U(c52559z22.m1933c());
        } else if (state instanceof C34980Ok1) {
            m58990F().errorGeneric();
        } else if (state instanceof C32956Ft2) {
            S74.C7343a.showProgress$default(m58990F(), ((C32956Ft2) state).m106321b(), 0, 2, null);
        }
    }

    /* renamed from: U */
    public final void m57850U(final List<OperatorTaskGroup> list) {
        C17914b c17914b = this.f64316m;
        if (c17914b != null) {
            c17914b.m48698b();
        }
        m57853Q().m77707P(list);
        C1361D4 c1361d4 = this.f64315l;
        C1361D4 c1361d42 = null;
        if (c1361d4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1361d4 = null;
        }
        TabLayout tabLayout = c1361d4.f5178d;
        C1361D4 c1361d43 = this.f64315l;
        if (c1361d43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c1361d42 = c1361d43;
        }
        C17914b c17914b2 = new C17914b(tabLayout, c1361d42.f5179e, new C17914b.InterfaceC17916b() { // from class: Kv3
            @Override // com.google.android.material.tabs.C17914b.InterfaceC17916b
            /* renamed from: a */
            public final void mo4558a(TabLayout.C17910g c17910g, int i) {
                OperatorTaskListV2Activity.m57849X(list, c17910g, i);
            }
        });
        c17914b2.m48699a();
        this.f64316m = c17914b2;
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC15041b.InterfaceC15042a m57848a = C15038a.m57848a();
        InterfaceC44393lG2 m58989H = m58989H();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        AbstractC11719f lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
        m57848a.mo57843a(m58989H, this, supportFragmentManager, lifecycle).mo57844a(this);
        C1361D4 m110970c = C1361D4.m110970c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m110970c, "inflate(layoutInflater)");
        this.f64315l = m110970c;
        C1361D4 c1361d4 = null;
        if (m110970c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m110970c = null;
        }
        m110970c.getRoot().getLayoutTransition().enableTransitionType(4);
        C1361D4 c1361d42 = this.f64315l;
        if (c1361d42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c1361d42 = null;
        }
        setContentView(c1361d42.getRoot());
        C1361D4 c1361d43 = this.f64315l;
        if (c1361d43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c1361d4 = c1361d43;
        }
        c1361d4.f5179e.setAdapter(m57853Q());
        m57852R().consume(this);
    }
}
