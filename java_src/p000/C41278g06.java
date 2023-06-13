package p000;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.TaxInformation;
import co.bird.android.widget.CallToActionLayout;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0001ZB\u000f\u0012\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J,\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\bH\u0016J\b\u0010\"\u001a\u00020\bH\u0016R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00106\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010-R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R\u0014\u0010>\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00109R\u0014\u0010@\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00109R\u0014\u0010B\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00109R\u0014\u0010D\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00109R\u0014\u0010F\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00109R\u0014\u0010H\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00109R\u0014\u0010J\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00109R\u0014\u0010L\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00109R\u0014\u0010N\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010)R8\u0010R\u001a&\u0012\f\u0012\n O*\u0004\u0018\u00010\u00040\u0004 O*\u0012\u0012\f\u0012\n O*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR8\u0010T\u001a&\u0012\f\u0012\n O*\u0004\u0018\u00010\u00040\u0004 O*\u0012\u0012\f\u0012\n O*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010Q¨\u0006["}, m28432d2 = {"Lg06;", "LxE;", "Lf06;", "Lio/reactivex/Observable;", "", "vb", "H2", "Bg", "", "Y3", "", "Di", "hasTaxCode", "x2", "show", "bj", "Q1", "na", "Lco/bird/android/model/TaxInformation;", "taxInformation", "overrideTaxCodeResponse", "alternativeTaxCodePrompt", "countryName", "v6", "Lc", "enabled", "V9", "", "localizedStringId", "Y6", "Lj", "u1", "O4", "j3", "Gi", "Lco/bird/android/widget/CallToActionLayout;", "b", "Lco/bird/android/widget/CallToActionLayout;", "root", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "hasTaxCodePrompt", "Landroid/widget/LinearLayout;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/LinearLayout;", "taxCodeContainer", "Landroid/widget/RadioButton;", "e", "Landroid/widget/RadioButton;", "taxCodeYes", "f", "taxCodeNo", "g", "taxInformationForm", "Landroid/widget/EditText;", "h", "Landroid/widget/EditText;", "taxInformationFirstName", "i", "taxInformationLastName", "j", "taxInformationFiscalCode", "k", "taxInformationAddress", "l", "taxInformationPostalCode", "m", "taxInformationCity", "n", "taxInformationProvince", "o", "taxInformationCountry", "p", "taxInformationVat", "q", "taxInformationCompanyName", "r", "taxFooter", "kotlin.jvm.PlatformType", "s", "Lio/reactivex/Observable;", "sharedTaxCodeYes", "t", "sharedTaxCodeNo", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "u", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTaxInformationUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxInformationUi.kt\nco/bird/android/app/feature/taxinformation/TaxInformationUiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1#2:219\n*E\n"})
/* renamed from: g06  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41278g06 extends AbstractC30071xE implements InterfaceC40685f06 {

    /* renamed from: u */
    public static final C20683a f81287u = new C20683a(null);

    /* renamed from: v */
    public static final int f81288v = 8;

    /* renamed from: b */
    public final CallToActionLayout f81289b;

    /* renamed from: c */
    public final TextView f81290c;

    /* renamed from: d */
    public final LinearLayout f81291d;

    /* renamed from: e */
    public final RadioButton f81292e;

    /* renamed from: f */
    public final RadioButton f81293f;

    /* renamed from: g */
    public final LinearLayout f81294g;

    /* renamed from: h */
    public final EditText f81295h;

    /* renamed from: i */
    public final EditText f81296i;

    /* renamed from: j */
    public final EditText f81297j;

    /* renamed from: k */
    public final EditText f81298k;

    /* renamed from: l */
    public final EditText f81299l;

    /* renamed from: m */
    public final EditText f81300m;

    /* renamed from: n */
    public final EditText f81301n;

    /* renamed from: o */
    public final EditText f81302o;

    /* renamed from: p */
    public final EditText f81303p;

    /* renamed from: q */
    public final EditText f81304q;

    /* renamed from: r */
    public final TextView f81305r;

    /* renamed from: s */
    public final Observable<Boolean> f81306s;

    /* renamed from: t */
    public final Observable<Boolean> f81307t;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lg06$a;", "", "", "TEXT_CHANGES_DELAY", "I", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: g06$a */
    /* loaded from: classes2.dex */
    public static final class C20683a {
        public /* synthetic */ C20683a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20683a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41278g06(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f81289b = (CallToActionLayout) C40788fB0.m41779c(activity, C36585Vg4.root);
        this.f81290c = (TextView) C40788fB0.m41779c(activity, C36585Vg4.hasTaxCodePrompt);
        this.f81291d = (LinearLayout) C40788fB0.m41779c(activity, C36585Vg4.taxCodeContainer);
        RadioButton radioButton = (RadioButton) C40788fB0.m41779c(activity, C36585Vg4.taxCodeYes);
        this.f81292e = radioButton;
        RadioButton radioButton2 = (RadioButton) C40788fB0.m41779c(activity, C36585Vg4.taxCodeNo);
        this.f81293f = radioButton2;
        this.f81294g = (LinearLayout) C40788fB0.m41779c(activity, C36585Vg4.taxInformationForm);
        this.f81295h = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationFirstName);
        this.f81296i = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationLastName);
        this.f81297j = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationFiscalCode);
        this.f81298k = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationAddress);
        this.f81299l = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationPostalCode);
        this.f81300m = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationCity);
        this.f81301n = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationProvince);
        this.f81302o = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationCountry);
        this.f81303p = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationVat);
        this.f81304q = (EditText) C40788fB0.m41779c(activity, C36585Vg4.taxInformationCompanyName);
        this.f81305r = (TextView) C40788fB0.m41779c(activity, C36585Vg4.taxFooter);
        this.f81306s = C34228Le5.m96513a(radioButton).share();
        this.f81307t = C34228Le5.m96513a(radioButton2).share();
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: Bg */
    public Observable<Boolean> mo40355Bg() {
        return C45219mf5.m25213b(this.f81297j);
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: Di */
    public String mo40354Di() {
        return this.f81290c.getText().toString();
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: Gi */
    public void mo40353Gi() {
        error(getActivity().getString(C45871nl4.tax_information_load_error_message));
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: H2 */
    public Observable<Boolean> mo40352H2() {
        Observable<Boolean> sharedTaxCodeNo = this.f81307t;
        Intrinsics.checkNotNullExpressionValue(sharedTaxCodeNo, "sharedTaxCodeNo");
        return sharedTaxCodeNo;
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: Lc */
    public TaxInformation mo40351Lc() {
        return new TaxInformation(this.f81295h.getText().toString(), this.f81296i.getText().toString(), this.f81297j.getText().toString(), this.f81298k.getText().toString(), this.f81299l.getText().toString(), this.f81300m.getText().toString(), this.f81301n.getText().toString(), this.f81302o.getText().toString(), this.f81303p.getText().toString(), this.f81304q.getText().toString());
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: Lj */
    public Observable<Unit> mo40350Lj() {
        return this.f81289b.m54693b();
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: O4 */
    public void mo40349O4(boolean z) {
        this.f81289b.setSecondaryButtonVisibility(z);
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: Q1 */
    public void mo40348Q1(boolean z) {
        C49520tu6.show$default(this.f81297j, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: V9 */
    public void mo40347V9(boolean z) {
        this.f81289b.setButtonEnabled(z);
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: Y3 */
    public void mo40346Y3() {
        this.f81297j.setText("");
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: Y6 */
    public void mo40345Y6(int i) {
        CallToActionLayout callToActionLayout = this.f81289b;
        String string = getActivity().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(localizedStringId)");
        callToActionLayout.setButtonText(string);
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: bj */
    public void mo40344bj(boolean z) {
        C49520tu6.show$default(this.f81291d, z, 0, 2, null);
        C49520tu6.show$default(this.f81305r, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: j3 */
    public void mo40343j3() {
        success(getActivity().getString(C45871nl4.tax_information_update_success_message));
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: na */
    public void mo40342na(boolean z) {
        C49520tu6.show$default(this.f81303p, z, 0, 2, null);
        C49520tu6.show$default(this.f81304q, z, 0, 2, null);
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: u1 */
    public Observable<Unit> mo40341u1() {
        return this.f81289b.m54687h();
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: v6 */
    public void mo40340v6(TaxInformation taxInformation, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(taxInformation, "taxInformation");
        if (z) {
            this.f81294g.setVisibility(8);
            this.f81292e.setChecked(false);
            this.f81293f.setChecked(false);
            this.f81289b.setButtonEnabled(false);
        }
        TextView textView = this.f81290c;
        if (str == null) {
            String string = getActivity().getString(C45871nl4.tax_information_has_tax_code);
            Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…information_has_tax_code)");
            str = String.format(string, Arrays.copyOf(new Object[]{str2}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        }
        textView.setText(str);
        if (str2 != null) {
            this.f81302o.setText(str2);
        }
        EditText editText = this.f81295h;
        String firstName = taxInformation.getFirstName();
        String str3 = "";
        if (firstName == null) {
            firstName = "";
        }
        editText.setText(firstName);
        EditText editText2 = this.f81296i;
        String lastName = taxInformation.getLastName();
        if (lastName == null) {
            lastName = "";
        }
        editText2.setText(lastName);
        EditText editText3 = this.f81297j;
        String fiscalCode = taxInformation.getFiscalCode();
        if (fiscalCode == null) {
            fiscalCode = "";
        }
        editText3.setText(fiscalCode);
        EditText editText4 = this.f81298k;
        String address = taxInformation.getAddress();
        if (address == null) {
            address = "";
        }
        editText4.setText(address);
        EditText editText5 = this.f81299l;
        String postalCode = taxInformation.getPostalCode();
        if (postalCode == null) {
            postalCode = "";
        }
        editText5.setText(postalCode);
        EditText editText6 = this.f81300m;
        String city = taxInformation.getCity();
        if (city == null) {
            city = "";
        }
        editText6.setText(city);
        EditText editText7 = this.f81301n;
        String province = taxInformation.getProvince();
        if (province == null) {
            province = "";
        }
        editText7.setText(province);
        EditText editText8 = this.f81303p;
        String vatId = taxInformation.getVatId();
        if (vatId == null) {
            vatId = "";
        }
        editText8.setText(vatId);
        EditText editText9 = this.f81304q;
        String companyName = taxInformation.getCompanyName();
        if (companyName != null) {
            str3 = companyName;
        }
        editText9.setText(str3);
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: vb */
    public Observable<Boolean> mo40339vb() {
        Observable<Boolean> sharedTaxCodeYes = this.f81306s;
        Intrinsics.checkNotNullExpressionValue(sharedTaxCodeYes, "sharedTaxCodeYes");
        return sharedTaxCodeYes;
    }

    @Override // p000.InterfaceC40685f06
    /* renamed from: x2 */
    public void mo40338x2(boolean z) {
        int i;
        LinearLayout linearLayout = this.f81294g;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        this.f81292e.setChecked(z);
        this.f81293f.setChecked(!z);
    }
}
