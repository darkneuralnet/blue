package p000;

import android.net.Uri;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.reportcomplaint.ReportView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.imageupload.ImageUploadBar;
import co.bird.android.model.ComplaintOption;
import co.bird.android.model.ComplaintSection;
import co.bird.android.model.ComplaintSectionType;
import co.bird.android.model.ComplaintType;
import co.bird.android.widget.SelectableButton;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u00016B\u0017\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u00108\u001a\u000205¢\u0006\u0004\b@\u0010AJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J \u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\t0\bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH\u0016J\u001e\u0010\u0012\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0014\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001aH\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u001e\u0010)\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u001a\u0010,\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010\n2\u0006\u0010+\u001a\u00020\nH\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\nH\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H\u0016J\u0014\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\b0\u0003H\u0016J\f\u00104\u001a\u00020\u0013*\u00020\u0010H\u0002R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R.\u0010=\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000200 :*\n\u0012\u0004\u0012\u000200\u0018\u00010\b0\b098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006C"}, m28432d2 = {"LIH4;", "LxE;", "LHH4;", "Lio/reactivex/Observable;", "", "Lg", "e", "Gc", "", "Lkotlin/Pair;", "", "l2", "birdCode", "m", "Lco/bird/android/model/ComplaintSection;", "sections", "Lco/bird/android/model/ComplaintType;", "type", "Mb", "", "title", "E", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "value", "F0", "", "show", "dh", "enabled", "L0", "", JsonDocumentFields.POLICY_ID, "completed", "u2", "E3", "g9", "Sc", "ej", "Lco/bird/android/model/ComplaintOption;", "options", "Pl", "placeholder", "property", "Ql", "g", "url", "j", "Landroid/net/Uri;", "imageUri", "B3", "v", "Rl", "Lo5;", "b", "Lo5;", "binding", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "photosChangeSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lo5;)V", DateTokenConverter.CONVERTER_KEY, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReportUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportUi.kt\nco/bird/android/app/feature/reportcomplaint/ReportUiImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,186:1\n125#2:187\n152#2,3:188\n125#2:191\n152#2,3:192\n*S KotlinDebug\n*F\n+ 1 ReportUi.kt\nco/bird/android/app/feature/reportcomplaint/ReportUiImpl\n*L\n71#1:187\n71#1:188,3\n111#1:191\n111#1:192,3\n*E\n"})
/* renamed from: IH4 */
/* loaded from: classes2.dex */
public final class IH4 extends AbstractC30071xE implements HH4 {

    /* renamed from: d */
    public static final C3485b f15081d = new C3485b(null);

    /* renamed from: e */
    public static final int f15082e = 8;

    /* renamed from: b */
    public final C26812o5 f15083b;

    /* renamed from: c */
    public final C24558d<List<Uri>> f15084c;

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"IH4$a", "Lco/bird/android/imageupload/ImageUploadBar$a;", "", "Landroid/net/Uri;", "photos", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: IH4$a */
    /* loaded from: classes2.dex */
    public static final class C3484a implements ImageUploadBar.InterfaceC15989a {
        public C3484a() {
        }

        @Override // co.bird.android.imageupload.ImageUploadBar.InterfaceC15989a
        /* renamed from: a */
        public void mo8628a(List<? extends Uri> photos) {
            Intrinsics.checkNotNullParameter(photos, "photos");
            IH4.this.f15084c.onNext(photos);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LIH4$b;", "", "", "ANIMATION_DURATION", "J", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: IH4$b */
    /* loaded from: classes2.dex */
    public static final class C3485b {
        public /* synthetic */ C3485b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3485b() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IH4$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C3486c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ComplaintSectionType.values().length];
            try {
                iArr[ComplaintSectionType.MULTISELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComplaintSectionType.SINGLESELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComplaintSectionType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ComplaintType.values().length];
            try {
                iArr2[ComplaintType.DAMAGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IH4(BaseActivity activity, C26812o5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f15083b = binding;
        C24558d<List<Uri>> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<List<Uri>>()");
        this.f15084c = m31902e;
        binding.f101326d.m59615b().setPhotoChangedListener(new C3484a());
    }

    @Override // p000.HH4
    /* renamed from: B3 */
    public void mo102582B3(Uri imageUri) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        this.f15083b.f101326d.m59615b().m56146r(imageUri);
    }

    @Override // p000.HH4
    /* renamed from: E */
    public void mo102581E(int i) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.mo70242E(getActivity().getString(i));
    }

    @Override // p000.HH4
    /* renamed from: E3 */
    public void mo102580E3(boolean z) {
        if (z) {
            this.f15083b.f101324b.m60709k();
        } else {
            this.f15083b.f101324b.m60710j();
        }
    }

    @Override // p000.HH4
    /* renamed from: F0 */
    public void mo102579F0(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SelectableButton selectableButton = this.f15083b.f101324b.m60715e().get(value);
        if (selectableButton != null) {
            selectableButton.m54392d();
        }
    }

    @Override // p000.HH4
    /* renamed from: Gc */
    public Observable<Unit> mo102578Gc() {
        return C44626lf5.clicksThrottle$default(this.f15083b.f101326d.m59616a(), 0L, 1, null);
    }

    @Override // p000.HH4
    /* renamed from: Id */
    public Map<String, String> mo102577Id() {
        HashMap hashMap = new HashMap(this.f15083b.f101324b.m60714f().size());
        Map<String, EditText> m60714f = this.f15083b.f101324b.m60714f();
        ArrayList arrayList = new ArrayList(m60714f.size());
        for (Map.Entry<String, EditText> entry : m60714f.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().getText().toString());
            arrayList.add(Unit.INSTANCE);
        }
        return hashMap;
    }

    @Override // p000.HH4
    /* renamed from: L0 */
    public void mo102576L0(boolean z) {
        this.f15083b.f101327e.setEnabled(z);
    }

    @Override // p000.HH4
    /* renamed from: Lg */
    public Observable<Unit> mo102575Lg() {
        return C44626lf5.clicksThrottle$default(this.f15083b.f101326d.m59614c(), 0L, 1, null);
    }

    @Override // p000.HH4
    /* renamed from: Mb */
    public void mo102574Mb(List<ComplaintSection> sections, ComplaintType type) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(type, "type");
        for (ComplaintSection complaintSection : sections) {
            int i = C3486c.$EnumSwitchMapping$0[complaintSection.getType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        m102572Ql(complaintSection.getPlaceholder(), complaintSection.getProperty());
                    }
                } else {
                    List<ComplaintOption> options = complaintSection.getOptions();
                    Intrinsics.checkNotNull(options);
                    m102573Pl(options, type);
                }
            } else {
                List<ComplaintOption> options2 = complaintSection.getOptions();
                Intrinsics.checkNotNull(options2);
                m102573Pl(options2, type);
            }
        }
    }

    /* renamed from: Pl */
    public void m102573Pl(List<ComplaintOption> options, ComplaintType type) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(type, "type");
        for (ComplaintOption complaintOption : options) {
            this.f15083b.f101324b.m60719a(complaintOption, m102571Rl(type));
        }
    }

    /* renamed from: Ql */
    public void m102572Ql(String str, String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (str != null) {
            this.f15083b.f101324b.m60717c(str, property);
        }
    }

    /* renamed from: Rl */
    public final int m102571Rl(ComplaintType complaintType) {
        if (C3486c.$EnumSwitchMapping$1[complaintType.ordinal()] == 1) {
            return C37044Xf4.damaged_option_button_width;
        }
        return C37044Xf4.bad_parking_option_button_width;
    }

    @Override // p000.HH4
    /* renamed from: Sc */
    public void mo102570Sc(boolean z) {
        this.f15083b.f101324b.m60711i(z);
    }

    @Override // p000.HH4
    /* renamed from: dh */
    public void mo102569dh(boolean z) {
        ReportView reportView = this.f15083b.f101326d;
        Intrinsics.checkNotNullExpressionValue(reportView, "binding.reportView");
        C49520tu6.show$default(reportView, z, 0, 2, null);
    }

    @Override // p000.HH4
    /* renamed from: e */
    public Observable<Unit> mo102568e() {
        Button button = this.f15083b.f101327e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submitButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.HH4
    /* renamed from: ej */
    public void mo102567ej() {
        this.f15083b.f101324b.m60716d();
    }

    @Override // p000.HH4
    /* renamed from: g */
    public Observable<Unit> mo102566g() {
        return C44626lf5.clicksThrottle$default(this.f15083b.f101326d.m59615b(), 0L, 1, null);
    }

    @Override // p000.HH4
    /* renamed from: g9 */
    public void mo102565g9() {
        C49520tu6.m11233r(this.f15083b.f101326d.m59613d());
    }

    @Override // p000.HH4
    /* renamed from: j */
    public void mo102564j(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f15083b.f101326d.m59615b().m56145s(url);
    }

    @Override // p000.HH4
    /* renamed from: l2 */
    public List<Pair<String, Observable<Unit>>> mo102563l2() {
        Map<String, SelectableButton> m60715e = this.f15083b.f101324b.m60715e();
        ArrayList arrayList = new ArrayList(m60715e.size());
        for (Map.Entry<String, SelectableButton> entry : m60715e.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), C44626lf5.clicksThrottle$default(entry.getValue(), 0L, 1, null)));
        }
        return arrayList;
    }

    @Override // p000.HH4
    /* renamed from: m */
    public void mo102562m(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        this.f15083b.f101326d.setBirdCode(birdCode);
    }

    @Override // p000.HH4
    public void setAddress(String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f15083b.f101326d.setAddress(address);
    }

    @Override // p000.HH4
    /* renamed from: u2 */
    public void mo102561u2(boolean z) {
        if (z) {
            this.f15083b.f101326d.m59611f();
        } else {
            this.f15083b.f101326d.m59612e();
        }
    }

    @Override // p000.HH4
    /* renamed from: v */
    public Observable<List<Uri>> mo102560v() {
        Observable<List<Uri>> hide = this.f15084c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "photosChangeSubject.hide()");
        return hide;
    }
}
