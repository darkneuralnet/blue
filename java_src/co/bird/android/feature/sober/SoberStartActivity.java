package co.bird.android.feature.sober;

import android.os.Bundle;
import android.widget.EditText;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.sober.SoberStartActivity;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J0\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m28432d2 = {"Lco/bird/android/feature/sober/SoberStartActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LhN5;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LiN5;", TransferTable.COLUMN_STATE, "U", "Lio/reactivex/Observable;", "", "G0", "word", "", "start", "end", "minWidth", "maxWidth", "R", "LeN5;", "j", "LeN5;", "S", "()LeN5;", "setPresenter", "(LeN5;)V", "presenter", "Lj6;", "k", "Lj6;", "binding", "<init>", "()V", "sober_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SoberStartActivity extends BaseActivityLite implements InterfaceC42087hN5 {

    /* renamed from: j */
    public C40308eN5 f65627j;

    /* renamed from: k */
    public C24710j6 f65628k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "input", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.sober.SoberStartActivity$a */
    /* loaded from: classes3.dex */
    public static final class C15758a extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C15758a f65629g = new C15758a();

        public C15758a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return input.toString();
        }
    }

    /* renamed from: X */
    public static final void m56656X(SoberStartActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C48955sx4 m58990F = this$0.m58990F();
        C24710j6 c24710j6 = this$0.f65628k;
        if (c24710j6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c24710j6 = null;
        }
        EditText editText = c24710j6.f92146e;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.input");
        m58990F.showKeyboard(editText);
    }

    /* renamed from: Y */
    public static final String m56655Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC42087hN5
    /* renamed from: G0 */
    public Observable<String> mo36482G0() {
        C24710j6 c24710j6 = this.f65628k;
        if (c24710j6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c24710j6 = null;
        }
        EditText editText = c24710j6.f92146e;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.input");
        AbstractC49595u22<CharSequence> m42643d = C40475ef5.m42643d(editText);
        final C15758a c15758a = C15758a.f65629g;
        Observable map = m42643d.map(new InterfaceC23492o() { // from class: TM5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m56655Y;
                m56655Y = SoberStartActivity.m56655Y(Function1.this, obj);
                return m56655Y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.input.textChange…put -> input.toString() }");
        return map;
    }

    /* renamed from: R */
    public final void m56659R(String str, float f, float f2, float f3, float f4) {
        C24710j6 c24710j6 = this.f65628k;
        C24710j6 c24710j62 = null;
        if (c24710j6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c24710j6 = null;
        }
        c24710j6.f92146e.setLetterSpacing((f + f2) / 2.0f);
        C24710j6 c24710j63 = this.f65628k;
        if (c24710j63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c24710j63 = null;
        }
        float measureText = c24710j63.f92146e.getPaint().measureText(str);
        boolean z = false;
        if (f3 <= measureText && measureText <= f4) {
            z = true;
        }
        if (z) {
            return;
        }
        C24710j6 c24710j64 = this.f65628k;
        if (c24710j64 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c24710j64 = null;
        }
        if (c24710j64.f92146e.getLetterSpacing() > f) {
            C24710j6 c24710j65 = this.f65628k;
            if (c24710j65 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24710j65 = null;
            }
            if (c24710j65.f92146e.getLetterSpacing() < f2) {
                if (measureText < f3) {
                    C24710j6 c24710j66 = this.f65628k;
                    if (c24710j66 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        c24710j62 = c24710j66;
                    }
                    m56659R(str, c24710j62.f92146e.getLetterSpacing(), f2, f3, f4);
                    return;
                }
                C24710j6 c24710j67 = this.f65628k;
                if (c24710j67 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c24710j62 = c24710j67;
                }
                m56659R(str, f, c24710j62.f92146e.getLetterSpacing(), f3, f4);
            }
        }
    }

    /* renamed from: S */
    public final C40308eN5 m56658S() {
        C40308eN5 c40308eN5 = this.f65627j;
        if (c40308eN5 != null) {
            return c40308eN5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: U */
    public void render(AbstractC42680iN5 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof C45399mx5) {
            C24710j6 c24710j6 = this.f65628k;
            C24710j6 c24710j62 = null;
            if (c24710j6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24710j6 = null;
            }
            C45399mx5 c45399mx5 = (C45399mx5) state;
            c24710j6.f92147f.setText(c45399mx5.m24627c());
            C24710j6 c24710j63 = this.f65628k;
            if (c24710j63 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24710j63 = null;
            }
            c24710j63.f92143b.setText(c45399mx5.m24628b());
            C24710j6 c24710j64 = this.f65628k;
            if (c24710j64 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24710j64 = null;
            }
            c24710j64.f92144c.setHint(c45399mx5.m24626d());
            String m24626d = c45399mx5.m24626d();
            C24710j6 c24710j65 = this.f65628k;
            if (c24710j65 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24710j65 = null;
            }
            float width = c24710j65.f92143b.getWidth() * 0.95f;
            C24710j6 c24710j66 = this.f65628k;
            if (c24710j66 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24710j66 = null;
            }
            m56659R(m24626d, 0.0f, 1.75f, width, c24710j66.f92143b.getWidth());
            C24710j6 c24710j67 = this.f65628k;
            if (c24710j67 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24710j67 = null;
            }
            EditText editText = c24710j67.f92144c;
            C24710j6 c24710j68 = this.f65628k;
            if (c24710j68 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24710j68 = null;
            }
            editText.setLetterSpacing(c24710j68.f92146e.getLetterSpacing());
            C24710j6 c24710j69 = this.f65628k;
            if (c24710j69 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c24710j69 = null;
            }
            c24710j69.f92146e.requestFocus();
            C24710j6 c24710j610 = this.f65628k;
            if (c24710j610 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c24710j62 = c24710j610;
            }
            c24710j62.f92146e.post(new Runnable() { // from class: SM5
                @Override // java.lang.Runnable
                public final void run() {
                    SoberStartActivity.m56656X(SoberStartActivity.this);
                }
            });
        } else if (state instanceof C47657qm1) {
            m58990F().hideKeyboard();
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m56658S().m42280h(C12263b0.f56767a);
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C24710j6 m31123c = C24710j6.m31123c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m31123c, "inflate(layoutInflater)");
        this.f65628k = m31123c;
        if (m31123c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m31123c = null;
        }
        setContentView(m31123c.getRoot());
        C15759a.m56654a().mo56650a(m58989H()).mo56651a(this);
        m56658S().consume(this);
        C40308eN5 m56658S = m56658S();
        String stringExtra = getIntent().getStringExtra("bird_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        m56658S.m42280h(new CO5(stringExtra));
    }
}
