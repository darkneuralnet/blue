package p000;

import android.os.Handler;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.PartKind;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00050\u00050\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"LVe1;", "LxE;", "LSe1;", "Lco/bird/android/model/constant/PartKind;", "kind", "", "d1", "Lio/reactivex/Observable;", "Yg", "", "yl", "Llg1;", "reason", "L9", "Ly3;", "b", "Ly3;", "binding", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "codeSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ly3;)V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ve1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36564Ve1 extends AbstractC30071xE implements InterfaceC35862Se1 {

    /* renamed from: b */
    public final C30410y3 f39369b;

    /* renamed from: c */
    public final C24558d<Unit> f39370c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ve1$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8709a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PartKind.values().length];
            try {
                iArr[PartKind.PLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PartKind.IL_PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PartKind.SIM_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumC44632lg1.values().length];
            try {
                iArr2[EnumC44632lg1.INVALID_INPUT_BIRD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC44632lg1.INVALID_INPUT_PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC44632lg1.INVALID_INPUT_PCM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC44632lg1.INVALID_STICKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC44632lg1.INVALID_SERIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC44632lg1.INVALID_PLATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ve1$b */
    /* loaded from: classes4.dex */
    public static final class C8710b extends Lambda implements Function1<CharSequence, String> {

        /* renamed from: g */
        public static final C8710b f39371g = new C8710b();

        public C8710b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(CharSequence it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.toString();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/widget/TextView;", "<anonymous parameter 0>", "", "actionId", "Landroid/view/KeyEvent;", "<anonymous parameter 2>", "", C17296a.f69688o, "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ve1$c */
    /* loaded from: classes4.dex */
    public static final class C8711c extends Lambda implements Function3<TextView, Integer, KeyEvent, Boolean> {
        public C8711c() {
            super(3);
        }

        /* renamed from: a */
        public final Boolean m79620a(TextView textView, int i, KeyEvent keyEvent) {
            boolean z;
            if (i == 6) {
                C36564Ve1.this.f39370c.onNext(Unit.INSTANCE);
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Boolean invoke(TextView textView, Integer num, KeyEvent keyEvent) {
            return m79620a(textView, num.intValue(), keyEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36564Ve1(BaseActivity activity, C30410y3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f39369b = binding;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f39370c = m31902e;
    }

    /* renamed from: Rl */
    public static final String m79625Rl(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Sl */
    public static final void m79624Sl(C36564Ve1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        EditText editText = this$0.f39369b.f118648b;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.code");
        this$0.showKeyboard(editText);
    }

    @Override // p000.InterfaceC35862Se1
    /* renamed from: L9 */
    public void mo79628L9(EnumC44632lg1 enumC44632lg1) {
        int i;
        String str;
        int i2 = -1;
        if (enumC44632lg1 == null) {
            i = -1;
        } else {
            i = C8709a.$EnumSwitchMapping$1[enumC44632lg1.ordinal()];
        }
        switch (i) {
            case 1:
                i2 = C45871nl4.id_tools_enter_code_instruction;
                break;
            case 2:
                i2 = C45871nl4.id_tools_enter_code_plate_instructions;
                break;
            case 3:
                i2 = C45871nl4.id_tools_enter_code_pcm_instructions;
                break;
            case 4:
                i2 = C45871nl4.id_tools_enter_code_invalid_qr_code;
                break;
            case 5:
                i2 = C45871nl4.id_tools_enter_code_invalid_serial;
                break;
            case 6:
                i2 = C45871nl4.id_tools_enter_code_invalid_plate;
                break;
        }
        TextView textView = this.f39369b.f118649c;
        if (i2 > 0) {
            str = getActivity().getString(i2);
        } else {
            str = null;
        }
        textView.setText(str);
        if (enumC44632lg1 != null) {
            this.f39369b.f118648b.setTextColor(NA0.m94301c(getActivity(), C32364Df4.birdRed));
        } else {
            this.f39369b.f118648b.setTextColor(NA0.m94301c(getActivity(), C32364Df4.birdNewRoad));
        }
    }

    @Override // p000.InterfaceC35862Se1
    /* renamed from: Yg */
    public Observable<Unit> mo79623Yg() {
        Observable<Unit> hide = this.f39370c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "codeSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC35862Se1
    /* renamed from: d1 */
    public void mo79622d1(PartKind partKind) {
        int i;
        if (partKind == null) {
            i = -1;
        } else {
            i = C8709a.$EnumSwitchMapping$0[partKind.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.f39369b.f118650d.setText(getActivity().getString(C45871nl4.id_tools_identify_vehicle));
                    this.f39369b.f118648b.setHint(getActivity().getString(C45871nl4.id_tools_enter_code_hint));
                } else {
                    this.f39369b.f118650d.setText(getActivity().getString(C45871nl4.id_tools_identify_imei));
                    this.f39369b.f118648b.setHint(getActivity().getString(C45871nl4.id_tools_enter_imei_hint));
                }
            } else {
                this.f39369b.f118650d.setText(getActivity().getString(C45871nl4.id_tools_identify_israel_plate));
                this.f39369b.f118648b.setHint(getActivity().getString(C45871nl4.id_tools_enter_israel_plate_hint));
            }
        } else {
            this.f39369b.f118650d.setText(getActivity().getString(C45871nl4.id_tools_enter_plate));
            this.f39369b.f118648b.setHint(getActivity().getString(C45871nl4.id_tools_enter_plate_hint));
        }
        if (partKind == PartKind.GERMAN_PLATE) {
            this.f39369b.f118648b.setInputType(1);
        }
        EditText editText = this.f39369b.f118648b;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.code");
        C34585Ms2.m94658m(editText, new C8711c());
        this.f39369b.f118648b.requestFocus();
        new Handler().postDelayed(new Runnable() { // from class: Ue1
            @Override // java.lang.Runnable
            public final void run() {
                C36564Ve1.m79624Sl(C36564Ve1.this);
            }
        }, 100L);
    }

    @Override // p000.InterfaceC35862Se1
    /* renamed from: yl */
    public Observable<String> mo79621yl() {
        EditText editText = this.f39369b.f118648b;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.code");
        AbstractC49595u22<CharSequence> m42643d = C40475ef5.m42643d(editText);
        final C8710b c8710b = C8710b.f39371g;
        Observable map = m42643d.map(new InterfaceC23492o() { // from class: Te1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m79625Rl;
                m79625Rl = C36564Ve1.m79625Rl(Function1.this, obj);
                return m79625Rl;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "binding.code.textChanges().map { it.toString() }");
        return map;
    }
}
