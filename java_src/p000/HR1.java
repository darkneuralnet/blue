package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.idtools.identify.IdAction;
import co.bird.android.model.Detail;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WirePart;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.joda.time.DateTime;
import p000.C45672nQ5;
import p000.GR1;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0001SB\u0019\b\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010@\u001a\u00020=¢\u0006\u0004\bP\u0010QJ\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0003J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002J\f\u0010\n\u001a\u00020\u0007*\u00020\tH\u0002J\u0014\u0010\u000e\u001a\u00020\r*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u001d\u0010\u0012\u001a\u00020\r*\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016J\u001a\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u001e0\u0014H\u0016J\u0010\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010#\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0016\u0010'\u001a\u00020\r2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J\u0010\u0010)\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0010H\u0016J\u0019\u0010*\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b*\u0010+J3\u00101\u001a\u00020\r2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u00072\b\u00100\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u0003H\u0016J!\u00106\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0010\u00109\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0010H\u0016J\u0010\u0010:\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u0010H\u0016J\b\u0010;\u001a\u00020\rH\u0016J\u0010\u0010<\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010H\u001a\u0004\u0018\u00010A8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR:\u0010M\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007 J*\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e0\u001e0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006T"}, m28432d2 = {"LHR1;", "LxE;", "LGR1;", "Lco/bird/android/model/IdToolOption;", "", "Pl", "Lco/bird/android/model/constant/PartKind;", "", "Ql", "", "Rl", "Landroid/widget/TextView;", "kind", "", "Sl", "Landroid/widget/ImageView;", "", "status", "Tl", "(Landroid/widget/ImageView;Ljava/lang/Boolean;)V", "Lio/reactivex/Observable;", "h", "n", "d0", "Hk", "Q9", "ak", "of", "f", "Xh", "Lkotlin/Pair;", "Bd", "visible", "Ni", "A4", "ac", "", "Lco/bird/android/model/wire/WirePart;", "parts", "W2", "enabled", "M4", "C8", "(Ljava/lang/Boolean;)V", "Lco/bird/android/feature/servicecenter/idtools/identify/IdAction;", "action", "option", "id", "timeoutMin", "Ac", "(Lco/bird/android/feature/servicecenter/idtools/identify/IdAction;Lco/bird/android/model/IdToolOption;Ljava/lang/String;Ljava/lang/Integer;)V", "Db", "Lorg/joda/time/DateTime;", "startedAt", "c3", "(Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V", "se", "Ri", "b2", "Nj", "Qk", "LP3;", "b", "LP3;", "binding", "LnQ5;", "c", "LnQ5;", "oc", "()LnQ5;", "x7", "(LnQ5;)V", "dialog", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "longClickSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LP3;)V", "e", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsIdentifyUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsIdentifyUi.kt\nco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n288#2,2:338\n288#2,2:340\n288#2,2:342\n288#2,2:344\n288#2,2:346\n288#2,2:348\n288#2,2:350\n288#2,2:352\n*S KotlinDebug\n*F\n+ 1 IdToolsIdentifyUi.kt\nco/bird/android/feature/servicecenter/idtools/identify/IdToolsIdentifyUiImpl\n*L\n133#1:338,2\n134#1:340,2\n135#1:342,2\n136#1:344,2\n137#1:346,2\n138#1:348,2\n139#1:350,2\n140#1:352,2\n*E\n"})
/* renamed from: HR1 */
/* loaded from: classes3.dex */
public final class HR1 extends AbstractC30071xE implements GR1 {

    /* renamed from: e */
    public static final C3142a f13382e = new C3142a(null);

    /* renamed from: b */
    public final C6233P3 f13383b;

    /* renamed from: c */
    public C45672nQ5 f13384c;

    /* renamed from: d */
    public final C24558d<Pair<PartKind, String>> f13385d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LHR1$a;", "", "", "EMPTY_CHAR", "Ljava/lang/String;", "<init>", "()V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: HR1$a */
    /* loaded from: classes3.dex */
    public static final class C3142a {
        public /* synthetic */ C3142a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3142a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: HR1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3143b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IdToolOption.values().length];
            try {
                iArr[IdToolOption.QR_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdToolOption.LICENSE_PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdToolOption.HANDLEBAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdToolOption.GERMAN_LICENSE_PLATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdToolOption.IL_LICENSE_PLATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdToolOption.BATTERY_SERIAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdToolOption.US_CA_PLATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdToolOption.MOTOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdToolOption.PCM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdToolOption.BEACON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IdToolOption.HELMET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IdToolOption.PHYSICAL_LOCK_STICKER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PartKind.values().length];
            try {
                iArr2[PartKind.STICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[PartKind.PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[PartKind.CHASSIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[PartKind.BRAIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[PartKind.BATTERY_SERIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[PartKind.US_CA_PLATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[PartKind.MOTOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[PartKind.PCM.ordinal()] = 8;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[PartKind.BEACON.ordinal()] = 9;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[PartKind.HELMET.ordinal()] = 10;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[PartKind.PHYSICAL_LOCK_STICKER.ordinal()] = 11;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/view/View;", "it", "", C17296a.f69688o, "(Landroid/view/View;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: HR1$c */
    /* loaded from: classes3.dex */
    public static final class C3144c extends Lambda implements Function1<View, Boolean> {

        /* renamed from: h */
        public final /* synthetic */ PartKind f13387h;

        /* renamed from: i */
        public final /* synthetic */ TextView f13388i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3144c(PartKind partKind, TextView textView) {
            super(1);
            this.f13387h = partKind;
            this.f13388i = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(View view) {
            C24558d c24558d = HR1.this.f13385d;
            PartKind partKind = this.f13387h;
            HR1 hr1 = HR1.this;
            CharSequence text = this.f13388i.getText();
            Intrinsics.checkNotNullExpressionValue(text, "text");
            c24558d.onNext(TuplesKt.m28425to(partKind, hr1.m103884Rl(text)));
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HR1(BaseActivity activity, C6233P3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f13383b = binding;
        C24558d<Pair<PartKind, String>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<PartKind, String>>()");
        this.f13385d = m31902e;
        TextView textView = binding.f27809n;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.qrCode");
        m103883Sl(textView, PartKind.STICKER);
        TextView textView2 = binding.f27811p;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.serial");
        m103883Sl(textView2, PartKind.CHASSIS);
        TextView textView3 = binding.f27804i;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.imei");
        m103883Sl(textView3, PartKind.BRAIN);
        TextView textView4 = binding.f27806k;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.license");
        m103883Sl(textView4, PartKind.PLATE);
    }

    @Override // p000.GR1
    /* renamed from: A4 */
    public void mo103898A4(boolean z) {
        ImageView imageView = this.f13383b.f27814s;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.stepOneStatusIcon");
        m103882Tl(imageView, Boolean.valueOf(z));
    }

    @Override // p000.GR1
    /* renamed from: Ac */
    public void mo103897Ac(IdAction action, IdToolOption option, String str, Integer num) {
        boolean z;
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(option, "option");
        BaseActivity activity = getActivity();
        IdAction idAction = IdAction.DISSOCIATE;
        if (action != idAction && (action != IdAction.ASSOCIATE || str == null)) {
            z = false;
        } else {
            z = true;
        }
        String m71428c = C37942aQ1.m71428c(option, activity, z);
        TextView textView = this.f13383b.f27816u;
        if (action == idAction) {
            charSequence = getActivity().getString(C45871nl4.id_tools_dissociate_description_format, m71428c);
        } else {
            IdAction idAction2 = IdAction.ASSOCIATE;
            if (action == idAction2 && str == null && option == IdToolOption.BRAIN) {
                charSequence = getActivity().getString(C45871nl4.id_tools_brain_swap_description, num, num);
            } else if (action == idAction2 && str == null && option == IdToolOption.BEACON) {
                charSequence = getActivity().getString(C45871nl4.id_tools_replace_beacon_instructions);
            } else if (action == idAction2 && str == null) {
                charSequence = getActivity().getString(C45871nl4.id_tools_replace_without_id_format, m71428c);
            } else if (action == idAction2 && str != null) {
                String string = getActivity().getString(C45871nl4.id_tools_replace_with_id_format, m71428c, str);
                Intrinsics.checkNotNullExpressionValue(string, "activity.getString(\n    …Label,\n        id\n      )");
                charSequence = C45097mS5.span$default(string, str, null, 2, null);
            } else {
                charSequence = null;
            }
        }
        textView.setText(charSequence);
    }

    @Override // p000.GR1
    /* renamed from: Bd */
    public Observable<Pair<PartKind, String>> mo103896Bd() {
        Observable<Pair<PartKind, String>> hide = this.f13385d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "longClickSubject.hide()");
        return hide;
    }

    @Override // p000.GR1
    /* renamed from: C8 */
    public void mo103895C8(Boolean bool) {
        ImageView imageView = this.f13383b.f27819x;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.stepTwoStatusIcon");
        m103882Tl(imageView, bool);
    }

    @Override // p000.GR1
    /* renamed from: Db */
    public void mo103894Db(IdToolOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        ImageView imageView = this.f13383b.f27817v;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.stepTwoIcon");
        C49520tu6.m11233r(imageView);
        this.f13383b.f27817v.setImageDrawable(NA0.m94299e(getActivity(), m103889Pl(option)));
    }

    @Override // p000.GR1
    /* renamed from: Hk */
    public Observable<Unit> mo103893Hk() {
        Button button = this.f13383b.f27798c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.chirp");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.GR1
    /* renamed from: M4 */
    public void mo103892M4(boolean z) {
        int i;
        this.f13383b.f27818w.setEnabled(z);
        this.f13383b.f27815t.setEnabled(z);
        if (z) {
            i = C32364Df4.birdNewRoad;
        } else {
            i = C32364Df4.darkGray;
        }
        ColorStateList valueOf = ColorStateList.valueOf(NA0.m94301c(getActivity(), i));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(ContextCompat.ge…olor(activity, colorRes))");
        this.f13383b.f27820y.setTextColor(valueOf);
        this.f13383b.f27816u.setTextColor(valueOf);
        this.f13383b.f27817v.setImageTintList(valueOf);
    }

    @Override // p000.GR1
    /* renamed from: Ni */
    public void mo103891Ni(boolean z) {
        Button button = this.f13383b.f27810o;
        Intrinsics.checkNotNullExpressionValue(button, "binding.scan");
        C49520tu6.show$default(button, z, 0, 2, null);
        Button button2 = this.f13383b.f27799d;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.code");
        C49520tu6.show$default(button2, z, 0, 2, null);
        Button button3 = this.f13383b.f27797b;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.bluetooth");
        C49520tu6.show$default(button3, z, 0, 2, null);
    }

    @Override // p000.GR1
    /* renamed from: Nj */
    public void mo103890Nj() {
        Toast toast = new Toast(getActivity());
        BaseActivity activity = getActivity();
        int i = C34740Nj4.toast_service_center;
        String string = getActivity().getString(C45871nl4.command_center_bluetooth_chirp_success);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…_bluetooth_chirp_success)");
        C42514i56.m34478a(toast, activity, i, string).show();
    }

    /* renamed from: Pl */
    public final int m103889Pl(IdToolOption idToolOption) {
        switch (C3143b.$EnumSwitchMapping$0[idToolOption.ordinal()]) {
            case 1:
                return C48193rg4.ic_qr_code;
            case 2:
                return C48193rg4.ic_license_plate;
            case 3:
                return C48193rg4.ic_handlebars;
            case 4:
                return C48193rg4.ic_license_plate;
            case 5:
                return C48193rg4.ic_license_plate;
            case 6:
                return C48193rg4.ic_battery;
            case 7:
                return C48193rg4.ic_license_plate;
            case 8:
                return C48193rg4.ic_motor;
            case 9:
                return C48193rg4.ic_plug;
            case 10:
                return C48193rg4.ic_cellular;
            case 11:
                return C48193rg4.ic_helmet;
            case 12:
                return C48193rg4.ic_qr_code;
            default:
                return C48193rg4.ic_qr_code;
        }
    }

    @Override // p000.GR1
    /* renamed from: Q9 */
    public Observable<Unit> mo103888Q9() {
        Button button = this.f13383b.f27802g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.headlights");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.GR1
    /* renamed from: Qk */
    public void mo103887Qk(PartKind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Toast toast = new Toast(getActivity());
        BaseActivity activity = getActivity();
        int i = C34740Nj4.toast_service_center;
        String string = getActivity().getString(C45871nl4.id_tools_identify_copy_toast, m103886Ql(kind));
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…oast, kind.getIdString())");
        C42514i56.m34478a(toast, activity, i, string).show();
    }

    /* renamed from: Ql */
    public final String m103886Ql(PartKind partKind) {
        switch (C3143b.$EnumSwitchMapping$1[partKind.ordinal()]) {
            case 1:
                String string = getActivity().getString(C45871nl4.part_kind_sticker_id_label);
                Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…rt_kind_sticker_id_label)");
                return string;
            case 2:
                String string2 = getActivity().getString(C45871nl4.part_kind_plate_id_label);
                Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(L.str…part_kind_plate_id_label)");
                return string2;
            case 3:
                String string3 = getActivity().getString(C45871nl4.part_kind_chassis_id_label);
                Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(L.str…rt_kind_chassis_id_label)");
                return string3;
            case 4:
                String string4 = getActivity().getString(C45871nl4.part_kind_brain_id_label);
                Intrinsics.checkNotNullExpressionValue(string4, "activity.getString(L.str…part_kind_brain_id_label)");
                return string4;
            case 5:
                String string5 = getActivity().getString(C45871nl4.id_tools_battery_serial_label);
                Intrinsics.checkNotNullExpressionValue(string5, "activity.getString(L.str…ols_battery_serial_label)");
                return string5;
            case 6:
                String string6 = getActivity().getString(C45871nl4.id_tools_us_ca_plate_label);
                Intrinsics.checkNotNullExpressionValue(string6, "activity.getString(L.str…_tools_us_ca_plate_label)");
                return string6;
            case 7:
                String string7 = getActivity().getString(C45871nl4.id_tools_motor_label);
                Intrinsics.checkNotNullExpressionValue(string7, "activity.getString(L.string.id_tools_motor_label)");
                return string7;
            case 8:
                String string8 = getActivity().getString(C45871nl4.id_tools_pcm_label);
                Intrinsics.checkNotNullExpressionValue(string8, "activity.getString(L.string.id_tools_pcm_label)");
                return string8;
            case 9:
                String string9 = getActivity().getString(C45871nl4.id_tools_beacon_label);
                Intrinsics.checkNotNullExpressionValue(string9, "activity.getString(L.string.id_tools_beacon_label)");
                return string9;
            case 10:
                String string10 = getActivity().getString(C45871nl4.part_helmet);
                Intrinsics.checkNotNullExpressionValue(string10, "activity.getString(L.string.part_helmet)");
                return string10;
            case 11:
                String string11 = getActivity().getString(C45871nl4.part_physical_lock_sticker);
                Intrinsics.checkNotNullExpressionValue(string11, "activity.getString(L.str…rt_physical_lock_sticker)");
                return string11;
            default:
                String string12 = getActivity().getString(C45871nl4.part_kind_sticker_id_label);
                Intrinsics.checkNotNullExpressionValue(string12, "activity.getString(L.str…rt_kind_sticker_id_label)");
                return string12;
        }
    }

    @Override // p000.GR1
    /* renamed from: Ri */
    public void mo103885Ri(boolean z) {
        Button button = this.f13383b.f27815t;
        Intrinsics.checkNotNullExpressionValue(button, "binding.stepTwoCode");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    /* renamed from: Rl */
    public final String m103884Rl(CharSequence charSequence) {
        int lastIndexOf$default;
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(charSequence, ": ", 0, false, 6, (Object) null);
        return charSequence.subSequence(lastIndexOf$default + 2, charSequence.length()).toString();
    }

    /* renamed from: Sl */
    public final void m103883Sl(TextView textView, PartKind partKind) {
        C34585Ms2.m94653r(textView, new C3144c(partKind, textView));
    }

    /* renamed from: Tl */
    public final void m103882Tl(ImageView imageView, Boolean bool) {
        Drawable m94299e;
        int m94301c;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            m94299e = NA0.m94299e(getActivity(), C48193rg4.ic_filled_check_circle);
            m94301c = NA0.m94301c(getActivity(), C32364Df4.birdGreen);
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            m94299e = NA0.m94299e(getActivity(), C48193rg4.ic_filled_x_circle);
            m94301c = NA0.m94301c(getActivity(), C32364Df4.birdRed);
        } else {
            m94299e = NA0.m94299e(getActivity(), C48193rg4.ic_filled_dash_circle);
            m94301c = NA0.m94301c(getActivity(), C32364Df4.secondaryBG);
        }
        C49520tu6.show$default(imageView, true, 0, 2, null);
        imageView.setImageDrawable(m94299e);
        imageView.setImageTintList(ColorStateList.valueOf(m94301c));
    }

    @Override // p000.GR1
    /* renamed from: W2 */
    public void mo103881W2(List<WirePart> parts) {
        Object obj;
        String str;
        Object obj2;
        String str2;
        Object obj3;
        Object obj4;
        String str3;
        Object obj5;
        String str4;
        Object obj6;
        String str5;
        Object obj7;
        String str6;
        Object obj8;
        String str7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String key;
        boolean z6;
        boolean z7;
        boolean z8;
        Intrinsics.checkNotNullParameter(parts, "parts");
        mo103891Ni(false);
        TextView textView = this.f13383b.f27809n;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.qrCode");
        C49520tu6.m11233r(textView);
        TextView textView2 = this.f13383b.f27811p;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.serial");
        C49520tu6.m11233r(textView2);
        TextView textView3 = this.f13383b.f27804i;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.imei");
        C49520tu6.m11233r(textView3);
        Button button = this.f13383b.f27798c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.chirp");
        C49520tu6.m11233r(button);
        List<WirePart> list = parts;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((WirePart) obj).getKind() == PartKind.STICKER) {
                    z8 = true;
                    continue;
                } else {
                    z8 = false;
                    continue;
                }
                if (z8) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        WirePart wirePart = (WirePart) obj;
        String str8 = Detail.EMPTY_CHAR;
        if (wirePart == null || (str = wirePart.getKey()) == null) {
            str = Detail.EMPTY_CHAR;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (((WirePart) obj2).getKind() == PartKind.CHASSIS) {
                    z7 = true;
                    continue;
                } else {
                    z7 = false;
                    continue;
                }
                if (z7) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        WirePart wirePart2 = (WirePart) obj2;
        if (wirePart2 == null || (str2 = wirePart2.getKey()) == null) {
            str2 = Detail.EMPTY_CHAR;
        }
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj3 = it3.next();
                if (((WirePart) obj3).getKind() == PartKind.BRAIN) {
                    z6 = true;
                    continue;
                } else {
                    z6 = false;
                    continue;
                }
                if (z6) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        WirePart wirePart3 = (WirePart) obj3;
        if (wirePart3 != null && (key = wirePart3.getKey()) != null) {
            str8 = key;
        }
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                obj4 = it4.next();
                if (((WirePart) obj4).getKind() == PartKind.PLATE) {
                    z5 = true;
                    continue;
                } else {
                    z5 = false;
                    continue;
                }
                if (z5) {
                    break;
                }
            } else {
                obj4 = null;
                break;
            }
        }
        WirePart wirePart4 = (WirePart) obj4;
        if (wirePart4 != null) {
            str3 = wirePart4.getKey();
        } else {
            str3 = null;
        }
        Iterator<T> it5 = list.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj5 = it5.next();
                if (((WirePart) obj5).getKind() == PartKind.GERMAN_PLATE) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    break;
                }
            } else {
                obj5 = null;
                break;
            }
        }
        WirePart wirePart5 = (WirePart) obj5;
        if (wirePart5 != null) {
            str4 = wirePart5.getKey();
        } else {
            str4 = null;
        }
        Iterator<T> it6 = list.iterator();
        while (true) {
            if (it6.hasNext()) {
                obj6 = it6.next();
                if (((WirePart) obj6).getKind() == PartKind.IL_PLATE) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            } else {
                obj6 = null;
                break;
            }
        }
        WirePart wirePart6 = (WirePart) obj6;
        if (wirePart6 != null) {
            str5 = wirePart6.getKey();
        } else {
            str5 = null;
        }
        Iterator<T> it7 = list.iterator();
        while (true) {
            if (it7.hasNext()) {
                obj7 = it7.next();
                if (((WirePart) obj7).getKind() == PartKind.PHYSICAL_LOCK_STICKER) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            } else {
                obj7 = null;
                break;
            }
        }
        WirePart wirePart7 = (WirePart) obj7;
        if (wirePart7 != null) {
            str6 = wirePart7.getKey();
        } else {
            str6 = null;
        }
        Iterator<T> it8 = list.iterator();
        while (true) {
            if (it8.hasNext()) {
                obj8 = it8.next();
                if (((WirePart) obj8).getKind() == PartKind.HELMET) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj8 = null;
                break;
            }
        }
        WirePart wirePart8 = (WirePart) obj8;
        if (wirePart8 != null) {
            str7 = wirePart8.getKey();
        } else {
            str7 = null;
        }
        TextView textView4 = this.f13383b.f27809n;
        String string = getActivity().getString(C45871nl4.id_tools_qr_code_format, str);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…_code_format, stickerKey)");
        textView4.setText(C45097mS5.span$default(string, str, null, 2, null));
        TextView textView5 = this.f13383b.f27811p;
        String string2 = getActivity().getString(C45871nl4.id_tools_serial_format, str2);
        Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(L.str…serial_format, serialKey)");
        textView5.setText(C45097mS5.span$default(string2, str2, null, 2, null));
        TextView textView6 = this.f13383b.f27804i;
        String string3 = getActivity().getString(C45871nl4.id_tools_imei_format, str8);
        Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(L.str…ols_imei_format, imeiKey)");
        textView6.setText(C45097mS5.span$default(string3, str8, null, 2, null));
        if (str3 != null) {
            TextView textView7 = this.f13383b.f27806k;
            Intrinsics.checkNotNullExpressionValue(textView7, "binding.license");
            C49520tu6.m11233r(textView7);
            TextView textView8 = this.f13383b.f27806k;
            String string4 = getActivity().getString(C45871nl4.id_tools_license_plate_format, str3);
            Intrinsics.checkNotNullExpressionValue(string4, "activity.getString(L.str…se_plate_format, license)");
            textView8.setText(C45097mS5.span$default(string4, str3, null, 2, null));
        }
        if (str4 != null) {
            TextView textView9 = this.f13383b.f27801f;
            Intrinsics.checkNotNullExpressionValue(textView9, "binding.germanLicense");
            C49520tu6.m11233r(textView9);
            TextView textView10 = this.f13383b.f27801f;
            String string5 = getActivity().getString(C45871nl4.id_tools_german_license_plate_format, str4);
            Intrinsics.checkNotNullExpressionValue(string5, "activity.getString(L.str…se_plate_format, license)");
            textView10.setText(C45097mS5.span$default(string5, str4, null, 2, null));
        }
        if (str5 != null) {
            TextView textView11 = this.f13383b.f27805j;
            Intrinsics.checkNotNullExpressionValue(textView11, "binding.israelTlvLicense");
            C49520tu6.m11233r(textView11);
            TextView textView12 = this.f13383b.f27805j;
            String string6 = getActivity().getString(C45871nl4.id_tools_il_license_plate_format, str5);
            Intrinsics.checkNotNullExpressionValue(string6, "activity.getString(L.str…se_plate_format, license)");
            textView12.setText(C45097mS5.span$default(string6, str5, null, 2, null));
        }
        if (str6 != null) {
            TextView textView13 = this.f13383b.f27807l;
            Intrinsics.checkNotNullExpressionValue(textView13, "binding.physicalLockSticker");
            C49520tu6.m11233r(textView13);
            TextView textView14 = this.f13383b.f27807l;
            String string7 = getActivity().getString(C45871nl4.id_tools_physical_lock_sticker_format, str6);
            Intrinsics.checkNotNullExpressionValue(string7, "activity.getString(L.str…_sticker_format, license)");
            textView14.setText(C45097mS5.span$default(string7, str6, null, 2, null));
        }
        if (str7 != null) {
            TextView textView15 = this.f13383b.f27803h;
            Intrinsics.checkNotNullExpressionValue(textView15, "binding.helmet");
            C49520tu6.m11233r(textView15);
            TextView textView16 = this.f13383b.f27803h;
            String string8 = getActivity().getString(C45871nl4.id_tools_helmet_format, str7);
            Intrinsics.checkNotNullExpressionValue(string8, "activity.getString(L.str…s_helmet_format, license)");
            textView16.setText(C45097mS5.span$default(string8, str7, null, 2, null));
        }
    }

    @Override // p000.GR1
    /* renamed from: Xh */
    public Observable<Unit> mo103880Xh() {
        Button button = this.f13383b.f27821z;
        Intrinsics.checkNotNullExpressionValue(button, "binding.unlockBattery");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.GR1
    /* renamed from: ac */
    public void mo103879ac(boolean z) {
        Button button = this.f13383b.f27821z;
        Intrinsics.checkNotNullExpressionValue(button, "binding.unlockBattery");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.GR1
    /* renamed from: ak */
    public Observable<Unit> mo103878ak() {
        Button button = this.f13383b.f27818w;
        Intrinsics.checkNotNullExpressionValue(button, "binding.stepTwoScan");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.FQ5
    /* renamed from: b1 */
    public void mo12610b1(List<C3023H6> list) {
        GR1.C2848a.m105123b(this, list);
    }

    @Override // p000.GR1
    /* renamed from: b2 */
    public void mo103877b2(boolean z) {
        this.f13383b.f27800e.setEnabled(z);
    }

    @Override // p000.GR1
    /* renamed from: c3 */
    public void mo103876c3(Boolean bool, DateTime startedAt) {
        String string;
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            string = getActivity().getString(C45871nl4.association_completed);
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            string = getActivity().getString(C45871nl4.brain_swap_association_failed, C46880pT0.getElapsedTime$default(startedAt, getActivity(), false, 2, null));
        } else {
            string = getActivity().getString(C45871nl4.brain_swap_association_in_progress, C46880pT0.getElapsedTime$default(startedAt, getActivity(), false, 2, null));
        }
        Intrinsics.checkNotNullExpressionValue(string, "when (status) {\n      tr…psedTime(activity))\n    }");
        this.f13383b.f27816u.setText(string);
        Button button = this.f13383b.f27818w;
        Intrinsics.checkNotNullExpressionValue(button, "binding.stepTwoScan");
        C49520tu6.show$default(button, false, 0, 2, null);
        Button button2 = this.f13383b.f27815t;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.stepTwoCode");
        C49520tu6.show$default(button2, false, 0, 2, null);
        this.f13383b.f27800e.setEnabled(Intrinsics.areEqual(bool, Boolean.FALSE));
    }

    @Override // p000.GR1
    /* renamed from: d0 */
    public Observable<Unit> mo103875d0() {
        Button button = this.f13383b.f27797b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.bluetooth");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.GR1
    /* renamed from: f */
    public Observable<Unit> mo103874f() {
        Button button = this.f13383b.f27800e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.FQ5
    /* renamed from: g1 */
    public void mo12607g1(List<C3023H6> list) {
        GR1.C2848a.m105124a(this, list);
    }

    @Override // p000.GR1
    /* renamed from: h */
    public Observable<Unit> mo103873h() {
        Button button = this.f13383b.f27810o;
        Intrinsics.checkNotNullExpressionValue(button, "binding.scan");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.FQ5
    /* renamed from: ig */
    public Observable<C45672nQ5.EnumC26504b> mo12606ig(ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
        return GR1.C2848a.m105122c(this, viewHolderSupplier);
    }

    @Override // p000.GR1
    /* renamed from: n */
    public Observable<Unit> mo103872n() {
        Button button = this.f13383b.f27799d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.code");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.FQ5
    /* renamed from: oc */
    public C45672nQ5 mo12605oc() {
        return this.f13384c;
    }

    @Override // p000.GR1
    /* renamed from: of */
    public Observable<Unit> mo103871of() {
        Button button = this.f13383b.f27815t;
        Intrinsics.checkNotNullExpressionValue(button, "binding.stepTwoCode");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.GR1
    /* renamed from: se */
    public void mo103870se(boolean z) {
        Button button = this.f13383b.f27818w;
        Intrinsics.checkNotNullExpressionValue(button, "binding.stepTwoScan");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.FQ5
    /* renamed from: x7 */
    public void mo12602x7(C45672nQ5 c45672nQ5) {
        this.f13384c = c45672nQ5;
    }
}
