package co.bird.android.vehiclescanner.servicecenter.scan;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.RepairType;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.constant.ScannerMode;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00122\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "Lnj5;", "B", "Lnj5;", "j0", "()Lnj5;", "setPresenter", "(Lnj5;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "b", "c", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScanCodeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScanCodeActivity.kt\nco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,132:1\n1549#2:133\n1620#2,3:134\n6#3:137\n1#4:138\n13#5,2:139\n15#5,2:143\n1109#6,2:141\n44#7:145\n*S KotlinDebug\n*F\n+ 1 ScanCodeActivity.kt\nco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity\n*L\n41#1:133\n41#1:134,3\n42#1:137\n42#1:138\n42#1:139,2\n42#1:143,2\n42#1:141,2\n55#1:145\n*E\n"})
/* loaded from: classes4.dex */
public final class ScanCodeActivity extends BaseActivity {

    /* renamed from: C */
    public static final C16441a f67100C = new C16441a(null);

    /* renamed from: B */
    public InterfaceC45852nj5 f67101B;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$a;", "", "", "REQUEST_CODE_BIRD", "I", "REQUEST_CODE_PART", "<init>", "()V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity$a */
    /* loaded from: classes4.dex */
    public static final class C16441a {
        public /* synthetic */ C16441a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16441a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$b;", "", "Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity;", "activity", "", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {C16444c.class})
    /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC16442b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c;", "module", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LU5;", "binding", "Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$b;", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity$b$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC16443a {
            /* renamed from: a */
            InterfaceC16442b mo54796a(InterfaceC44393lG2 interfaceC44393lG2, C16444c c16444c, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C8191U5 c8191u5);
        }

        /* renamed from: a */
        void mo54795a(ScanCodeActivity scanCodeActivity);
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c;", "", "LKj5;", "impl", "LiH1;", "hardCount", "Lnj5;", C17296a.f69688o, "Lco/bird/android/model/constant/ScannerMode;", "Lco/bird/android/model/constant/ScannerMode;", "scanMode", "<init>", "(Lco/bird/android/model/constant/ScannerMode;)V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {InterfaceC16445a.class})
    /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity$c */
    /* loaded from: classes4.dex */
    public static final class C16444c {

        /* renamed from: a */
        public final ScannerMode f67102a;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c$a;", "", "LSj5;", "impl", "LQj5;", C17296a.f69688o, "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @Module
        /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity$c$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC16445a {
            @Binds
            /* renamed from: a */
            InterfaceC35443Qj5 m54798a(C35911Sj5 c35911Sj5);
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity$c$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C16446b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ScannerMode.values().length];
                try {
                    iArr[ScannerMode.HARD_COUNT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C16444c(ScannerMode scannerMode) {
            this.f67102a = scannerMode;
        }

        @Provides
        /* renamed from: a */
        public final InterfaceC45852nj5 m54799a(C34039Kj5 impl, C42622iH1 hardCount) {
            int i;
            Intrinsics.checkNotNullParameter(impl, "impl");
            Intrinsics.checkNotNullParameter(hardCount, "hardCount");
            ScannerMode scannerMode = this.f67102a;
            if (scannerMode == null) {
                i = -1;
            } else {
                i = C16446b.$EnumSwitchMapping$0[scannerMode.ordinal()];
            }
            if (i == 1) {
                return hardCount;
            }
            return impl;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.vehiclescanner.servicecenter.scan.ScanCodeActivity$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16447d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PartKind.values().length];
            try {
                iArr[PartKind.PLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PartKind.GERMAN_PLATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PartKind.IL_PLATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PartKind.STICKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PartKind.BRAIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScanCodeActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC45852nj5 m54800j0() {
        InterfaceC45852nj5 interfaceC45852nj5 = this.f67101B;
        if (interfaceC45852nj5 != null) {
            return interfaceC45852nj5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Enum] */
    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        boolean equals;
        int i;
        String string;
        int collectionSizeOrDefault;
        super.onCreate(bundle);
        C8191U5 m81999c = C8191U5.m81999c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m81999c, "inflate(layoutInflater)");
        setContentView(m81999c.f36822m);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("bird_model");
        PartKind partKind = null;
        if (stringArrayListExtra != null) {
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(stringArrayListExtra, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (String model : stringArrayListExtra) {
                Intrinsics.checkNotNullExpressionValue(model, "model");
                arrayList2.add(BirdModel.valueOf(model));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String stringExtra = intent.getStringExtra("part_kind");
        if (stringExtra != null) {
            try {
                Object[] enumConstants = PartKind.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        partKind = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = PartKind.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    ?? r6 = (Enum) obj2;
                    if (Intrinsics.areEqual(r6.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                        partKind = r6;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        PartKind partKind2 = partKind;
        RepairType repairType = (RepairType) getIntent().getParcelableExtra("repairs");
        boolean booleanExtra = getIntent().getBooleanExtra("raw_scan_result", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("enable_peripheral_scanner", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("manual_input", false);
        ScannerMode scannerMode = (ScannerMode) getIntent().getParcelableExtra("scanner_mode");
        String stringExtra2 = getIntent().getStringExtra("previous_scan_identifier");
        InterfaceC16442b.InterfaceC16443a m54797a = C16448a.m54797a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        C16444c c16444c = new C16444c(scannerMode);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m54797a.mo54796a(m21419a, c16444c, this, m45197b, m81999c).mo54795a(this);
        if (!booleanExtra && scannerMode != ScannerMode.HARD_COUNT) {
            if (partKind2 == null) {
                m54800j0().mo23253b(arrayList);
            } else {
                m54800j0().mo23254a(partKind2, repairType);
            }
        } else {
            m54800j0().mo23252c(booleanExtra2, booleanExtra3, stringExtra2);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            if (partKind2 == null) {
                i = -1;
            } else {
                i = C16447d.$EnumSwitchMapping$0[partKind2.ordinal()];
            }
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        string = getString(C45871nl4.id_tools_identify_scan_title);
                    } else {
                        string = getString(C45871nl4.id_tools_identify_scan_title_brain);
                    }
                } else {
                    string = getString(C45871nl4.id_tools_identify_scan_title_qr_code);
                }
            } else {
                string = getString(C45871nl4.id_tools_identify_scan_title_license);
            }
            supportActionBar.mo70242E(string);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m54800j0().onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m54800j0().onResume();
    }
}
