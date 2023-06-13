package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.imageupload.ImageUploadBar;
import co.bird.android.model.CannotAccessOption;
import co.bird.android.model.InaccessibleReason;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b7\u00108J,\u0010\u0006\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u000b0\u0003H\u0016J\b\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u0007H\u0002J\b\u0010\"\u001a\u00020\u0007H\u0002R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\"\u00100\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00101\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\t0\t0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\"\u00103\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00130\u00130-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R.\u00104\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001e \u0005*\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000b0\u000b0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010/¨\u00069"}, m28432d2 = {"LYd0;", "LxE;", "LXd0;", "Lio/reactivex/Observable;", "Lco/bird/android/model/CannotAccessOption;", "kotlin.jvm.PlatformType", "x1", "", "e", "", "s6", "", "issues", "S0", "", "resId", "Q6", "", "U", "", "enabled", "p", "visible", "Rb", "Zf", "Wg", "a6", "g", "url", "j", "Landroid/net/Uri;", "v", "Pl", "Ql", "Rl", "Lg3;", "b", "Lg3;", "binding", "Lld0;", "c", "Lld0;", "getAdapter", "()Lld0;", "adapter", "Lio/reactivex/subjects/d;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/subjects/d;", "optionClicks", "numBirdClicks", "f", "numBirdVisible", "photosChangeSubject", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lg3;)V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCannotAccessUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessUi.kt\nco/bird/android/feature/cannotaccess/report/CannotAccessUiImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n288#2,2:183\n*S KotlinDebug\n*F\n+ 1 CannotAccessUi.kt\nco/bird/android/feature/cannotaccess/report/CannotAccessUiImpl\n*L\n114#1:183,2\n*E\n"})
/* renamed from: Yd0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37256Yd0 extends AbstractC30071xE implements InterfaceC37022Xd0 {

    /* renamed from: b */
    public final C20696g3 f46082b;

    /* renamed from: c */
    public final C44601ld0 f46083c;

    /* renamed from: d */
    public final C24558d<CannotAccessOption> f46084d;

    /* renamed from: e */
    public final C24558d<CharSequence> f46085e;

    /* renamed from: f */
    public final C24558d<Boolean> f46086f;

    /* renamed from: g */
    public final C24558d<List<Uri>> f46087g;

    @Metadata(m28433d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"Yd0$a", "Lco/bird/android/imageupload/ImageUploadBar$a;", "", "Landroid/net/Uri;", "photos", "", C17296a.f69688o, "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Yd0$a */
    /* loaded from: classes3.dex */
    public static final class C9823a implements ImageUploadBar.InterfaceC15989a {
        public C9823a() {
        }

        @Override // co.bird.android.imageupload.ImageUploadBar.InterfaceC15989a
        /* renamed from: a */
        public void mo8628a(List<? extends Uri> photos) {
            Intrinsics.checkNotNullParameter(photos, "photos");
            C37256Yd0.this.f46087g.onNext(photos);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LGJ6;", "", C17296a.f69688o, "(LGJ6;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd0$b */
    /* loaded from: classes3.dex */
    public static final class C9824b extends Lambda implements Function1<GJ6, Unit> {

        /* renamed from: h */
        public final /* synthetic */ ArrayAdapter<CharSequence> f46090h;

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Landroid/widget/AdapterView;", "adapterView", "Landroid/view/View;", "view", "", "position", "", "rowId", "", C17296a.f69688o, "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yd0$b$a */
        /* loaded from: classes3.dex */
        public static final class C9825a extends Lambda implements Function4<AdapterView<?>, View, Integer, Long, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37256Yd0 f46091g;

            /* renamed from: h */
            public final /* synthetic */ ArrayAdapter<CharSequence> f46092h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9825a(C37256Yd0 c37256Yd0, ArrayAdapter<CharSequence> arrayAdapter) {
                super(4);
                this.f46091g = c37256Yd0;
                this.f46092h = arrayAdapter;
            }

            /* renamed from: a */
            public final void m74785a(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 0) {
                    this.f46091g.f46085e.onNext("");
                    return;
                }
                CharSequence item = this.f46092h.getItem(i);
                if (item != null) {
                    this.f46091g.f46085e.onNext(item);
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AdapterView<?> adapterView, View view, Integer num, Long l) {
                m74785a(adapterView, view, num.intValue(), l.longValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroid/widget/AdapterView;", "it", "", C17296a.f69688o, "(Landroid/widget/AdapterView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Yd0$b$b */
        /* loaded from: classes3.dex */
        public static final class C9826b extends Lambda implements Function1<AdapterView<?>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C37256Yd0 f46093g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9826b(C37256Yd0 c37256Yd0) {
                super(1);
                this.f46093g = c37256Yd0;
            }

            /* renamed from: a */
            public final void m74784a(AdapterView<?> adapterView) {
                this.f46093g.f46085e.onNext("");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AdapterView<?> adapterView) {
                m74784a(adapterView);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9824b(ArrayAdapter<CharSequence> arrayAdapter) {
            super(1);
            this.f46090h = arrayAdapter;
        }

        /* renamed from: a */
        public final void m74786a(GJ6 onItemSelectedListener) {
            Intrinsics.checkNotNullParameter(onItemSelectedListener, "$this$onItemSelectedListener");
            onItemSelectedListener.m105404a(new C9825a(C37256Yd0.this, this.f46090h));
            onItemSelectedListener.m105403b(new C9826b(C37256Yd0.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GJ6 gj6) {
            m74786a(gj6);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Landroid/view/View;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lco/bird/android/model/CannotAccessOption;", "item", "", C17296a.f69688o, "(Landroid/view/View;ILco/bird/android/model/CannotAccessOption;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yd0$c */
    /* loaded from: classes3.dex */
    public static final class C9827c extends Lambda implements Function3<View, Integer, CannotAccessOption, Unit> {
        public C9827c() {
            super(3);
        }

        /* renamed from: a */
        public final void m74783a(View view, int i, CannotAccessOption item) {
            Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(item, "item");
            C37256Yd0.this.f46084d.onNext(item);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, CannotAccessOption cannotAccessOption) {
            m74783a(view, num.intValue(), cannotAccessOption);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37256Yd0(BaseActivity activity, C20696g3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f46082b = binding;
        this.f46083c = new C44601ld0(activity);
        C24558d<CannotAccessOption> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<CannotAccessOption>()");
        this.f46084d = m31902e;
        C24558d<CharSequence> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<CharSequence>()");
        this.f46085e = m31902e2;
        C24558d<Boolean> m31902e3 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e3, "create<Boolean>()");
        this.f46086f = m31902e3;
        C24558d<List<Uri>> m31902e4 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e4, "create<List<Uri>>()");
        this.f46087g = m31902e4;
        binding.f81449k.setButtonEnabled(false);
        m74803Pl();
        m74801Ql();
        m74799Rl();
        m31902e3.onNext(Boolean.valueOf(binding.f81444f.getVisibility() == 0));
        binding.f81440b.setPhotoChangedListener(new C9823a());
    }

    /* renamed from: Pl */
    public final void m74803Pl() {
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(getActivity(), C42846if4.cannot_access_number_of_birds_options, C36135Ti4.cannot_access_spinner_item);
        createFromResource.setDropDownViewResource(17367049);
        this.f46082b.f81446h.setAdapter((SpinnerAdapter) createFromResource);
        AppCompatSpinner appCompatSpinner = this.f46082b.f81446h;
        Intrinsics.checkNotNullExpressionValue(appCompatSpinner, "binding.numberOfBirdsSelector");
        C34585Ms2.m94654q(appCompatSpinner, new C9824b(createFromResource));
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: Q6 */
    public void mo74802Q6(int i) {
        this.f46082b.f81443e.setHint(i);
    }

    /* renamed from: Ql */
    public final void m74801Ql() {
        this.f46082b.f81447i.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f46082b.f81447i.setAdapter(this.f46083c);
        this.f46083c.m44888y(new C9827c());
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: Rb */
    public void mo74800Rb(boolean z) {
        int i;
        LinearLayout linearLayout = this.f46082b.f81444f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        this.f46086f.onNext(Boolean.valueOf(z));
        m74799Rl();
    }

    /* renamed from: Rl */
    public final void m74799Rl() {
        this.f46082b.f81450l.setText(getString(C45871nl4.cannot_access_select_a_reason, 1));
        int i = 2;
        if (this.f46082b.f81444f.getVisibility() == 0) {
            this.f46082b.f81445g.setText(getString(C45871nl4.cannot_access_number_of_birds_involved, 2));
            i = 3;
        }
        this.f46082b.f81442d.setText(getString(C45871nl4.cannot_access_include_photos, Integer.valueOf(i)));
        this.f46082b.f81441c.setText(getString(C45871nl4.cannot_access_include_details, Integer.valueOf(i + 1)));
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: S0 */
    public void mo74798S0(List<CannotAccessOption> issues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        Resources resources = getActivity().getResources();
        int i = C37044Xf4.cannot_access_option_button_horizontal_margin;
        layoutParams.setMarginStart(resources.getDimensionPixelSize(i));
        layoutParams.setMarginEnd(getActivity().getResources().getDimensionPixelSize(i));
        layoutParams.bottomMargin = getActivity().getResources().getDimensionPixelSize(C37044Xf4.complaint_button_top_margin);
        this.f46083c.m44899C(issues);
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: U */
    public String mo74797U() {
        return this.f46082b.f81443e.getText().toString();
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: Wg */
    public Observable<CharSequence> mo74796Wg() {
        EditText editText = this.f46082b.f81443e;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.issueTextBox");
        return C40475ef5.m42643d(editText);
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: Zf */
    public Observable<Boolean> mo74795Zf() {
        Observable<Boolean> hide = this.f46086f.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "numBirdVisible.hide()");
        return hide;
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: a6 */
    public void mo74794a6(boolean z) {
        Object obj;
        boolean z2;
        Iterator<T> it = this.f46083c.getItems().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((CannotAccessOption) obj).getIssue() == InaccessibleReason.MISSING) {
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
                obj = null;
                break;
            }
        }
        CannotAccessOption cannotAccessOption = (CannotAccessOption) obj;
        if (z) {
            if (cannotAccessOption == null) {
                C44601ld0 c44601ld0 = this.f46083c;
                c44601ld0.m44890w(c44601ld0.getItemCount() - 1, new CannotAccessOption(InaccessibleReason.MISSING));
            }
        } else if (cannotAccessOption != null) {
            this.f46083c.m44901A(cannotAccessOption);
        }
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: e */
    public Observable<Unit> mo74793e() {
        return this.f46082b.f81449k.m54693b();
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: g */
    public Observable<Unit> mo74792g() {
        ImageUploadBar imageUploadBar = this.f46082b.f81440b;
        Intrinsics.checkNotNullExpressionValue(imageUploadBar, "binding.imageUploadBar");
        return C44626lf5.clicksThrottle$default(imageUploadBar, 0L, 1, null);
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: j */
    public void mo74791j(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f46082b.f81440b.m56145s(url);
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: p */
    public void mo74790p(boolean z) {
        this.f46082b.f81449k.setButtonEnabled(z);
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: s6 */
    public Observable<CharSequence> mo74789s6() {
        Observable<CharSequence> hide = this.f46085e.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "numBirdClicks.hide()");
        return hide;
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: v */
    public Observable<List<Uri>> mo74788v() {
        Observable<List<Uri>> hide = this.f46087g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "photosChangeSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC37022Xd0
    /* renamed from: x1 */
    public Observable<CannotAccessOption> mo74787x1() {
        return this.f46084d.hide();
    }
}
