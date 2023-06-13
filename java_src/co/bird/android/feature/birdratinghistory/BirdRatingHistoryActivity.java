package co.bird.android.feature.birdratinghistory;

import android.os.Bundle;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.birdratinghistory.InterfaceC14583a;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.S74;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LKR;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LQR;", TransferTable.COLUMN_STATE, "R", "LJR;", "j", "LJR;", "Q", "()LJR;", "setPresenter", "(LJR;)V", "presenter", "LxR;", "k", "LxR;", "P", "()LxR;", "setAdapter", "(LxR;)V", "adapter", "Ld3;", "l", "Ld3;", "binding", "<init>", "()V", "co.bird.android.feature.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdRatingHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRatingHistoryActivity.kt\nco/bird/android/feature/birdratinghistory/BirdRatingHistoryActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes3.dex */
public final class BirdRatingHistoryActivity extends BaseActivityLite implements InterfaceC4433KR {

    /* renamed from: j */
    public C4078JR f63374j;

    /* renamed from: k */
    public C30169xR f63375k;

    /* renamed from: l */
    public C19671d3 f63376l;

    /* renamed from: P */
    public final C30169xR m58678P() {
        C30169xR c30169xR = this.f63375k;
        if (c30169xR != null) {
            return c30169xR;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    /* renamed from: Q */
    public final C4078JR m58677Q() {
        C4078JR c4078jr = this.f63374j;
        if (c4078jr != null) {
            return c4078jr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: R */
    public void render(InterfaceC6777QR state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof A22) {
            m58678P().mo24871u(((A22) state).m116175b());
            return;
        }
        Unit unit = null;
        if (state instanceof C32254Ct2) {
            S74.C7343a.showProgress$default(m58990F(), ((C32254Ct2) state).m111379a(), 0, 2, null);
        } else if (state instanceof C39278cg1) {
            String m61072a = ((C39278cg1) state).m61072a();
            if (m61072a != null) {
                m58990F().error(m61072a);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                m58990F().errorGeneric();
            }
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC14583a.InterfaceC14584a m58675a = C14585b.m58675a();
        InterfaceC44393lG2 m58989H = m58989H();
        String stringExtra = getIntent().getStringExtra("bird_id");
        if (stringExtra == null) {
            return;
        }
        m58675a.mo58671a(m58989H, this, stringExtra).mo58674a(this);
        C19671d3 m44665c = C19671d3.m44665c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m44665c, "inflate(layoutInflater)");
        this.f63376l = m44665c;
        C19671d3 c19671d3 = null;
        if (m44665c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m44665c = null;
        }
        setContentView(m44665c.getRoot());
        C19671d3 c19671d32 = this.f63376l;
        if (c19671d32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c19671d3 = c19671d32;
        }
        c19671d3.f76056b.setAdapter(m58678P());
        m58677Q().consume(this);
    }
}
