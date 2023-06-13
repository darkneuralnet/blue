package co.bird.android.app.feature.physicallock.smartlock;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.constant.ScanIntention;
import co.bird.android.model.constant.ScanMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BottomSheetOptionLayout;
import co.bird.android.widget.C16597a;
import co.bird.android.widget.C16664e;
import co.bird.android.widget.CallToActionLayout;
import co.bird.android.widget.InterfaceC16662d;
import co.bird.android.widget.PillDropdownButton;
import com.facebook.share.internal.C17296a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0002k2B\u000f\u0012\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bh\u0010iJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J1\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\rH\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u001c\u00104\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00108\u001a\n 1*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010<\u001a\n 1*\u0004\u0018\u000109098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010@\u001a\n 1*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001c\u0010D\u001a\n 1*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010F\u001a\n 1*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010?R\u001c\u0010H\u001a\n 1*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010CR\u001c\u0010J\u001a\n 1*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010?R\u001c\u0010L\u001a\n 1*\u0004\u0018\u000109098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010;R\u001c\u0010N\u001a\n 1*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010CR\u001c\u0010P\u001a\n 1*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010?R\u001c\u0010R\u001a\n 1*\u0004\u0018\u000109098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010;R\u001c\u0010T\u001a\n 1*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010CR\u001c\u0010V\u001a\n 1*\u0004\u0018\u00010=0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010?R\u001c\u0010X\u001a\n 1*\u0004\u0018\u000109098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010;R\u001c\u0010Z\u001a\n 1*\u0004\u0018\u000109098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010;R\u001c\u0010]\u001a\n 1*\u0004\u0018\u00010[0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\\R\u001c\u0010a\u001a\n 1*\u0004\u0018\u00010^0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001c\u0010e\u001a\n 1*\u0004\u0018\u00010b0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006l"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/c;", "Lco/bird/android/app/feature/physicallock/smartlock/b;", "LxE;", "Lio/reactivex/Observable;", "", "V0", "", "labelRes", "e4", "titleRes", "Lio/reactivex/p;", "Lco/bird/android/app/feature/physicallock/smartlock/c$b;", "dg", "", "visible", "P0", "O", "", Entry.TYPE_TEXT, "gf", "O0", "H1", "h4", "jg", "c1", "V", "A1", "g0", "s0", "w", "Lco/bird/android/model/constant/ScanMode;", "mode", "Lco/bird/android/model/constant/ScanIntention;", "intention", "instructionsStringRes", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBird;", "t7", "(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Ljava/lang/Integer;)Lio/reactivex/F;", "H0", "K1", "W", "N", "J0", "r", "enabled", "a0", "e0", "Lco/bird/android/widget/CallToActionLayout;", "kotlin.jvm.PlatformType", "b", "Lco/bird/android/widget/CallToActionLayout;", "root", "Landroid/widget/ProgressBar;", "c", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "step1Button", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "step1Success", "Lcom/google/android/material/progressindicator/CircularProgressIndicator;", "f", "Lcom/google/android/material/progressindicator/CircularProgressIndicator;", "rekeyProgress", "g", "rekeySuccess", "h", "unlockProgress", "i", "unlockSuccess", "j", "retryUnlockButton", "k", "reinsertPinProgress", "l", "reinsertPinSuccess", "m", "scanBirdbutton", "n", "scanBirdProgress", "o", "scanBirdSuccess", "p", "promoteLockTryAgainButton", "q", "retryBirdAssocationButton", "Lco/bird/android/widget/PillDropdownButton;", "Lco/bird/android/widget/PillDropdownButton;", "lockPurposeDropdown", "Landroid/widget/LinearLayout;", "s", "Landroid/widget/LinearLayout;", "step1DetailsContainer", "Landroid/widget/TextView;", "t", "Landroid/widget/TextView;", "lockTokenDetailsTextView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "u", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockAssociationV2Ui.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockAssociationV2Ui.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationUiV2Impl\n+ 2 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$1\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n38#2,9:184\n47#2,4:197\n819#3:193\n847#3:194\n848#3:196\n40#4:195\n1#5:201\n*S KotlinDebug\n*F\n+ 1 SmartlockAssociationV2Ui.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationUiV2Impl\n*L\n137#1:184,9\n137#1:197,4\n137#1:193\n137#1:194\n137#1:196\n137#1:195\n*E\n"})
/* renamed from: co.bird.android.app.feature.physicallock.smartlock.c */
/* loaded from: classes2.dex */
public final class C14176c extends AbstractC30071xE implements InterfaceC14174b {

    /* renamed from: u */
    public static final C14177a f62258u = new C14177a(null);

    /* renamed from: v */
    public static final int f62259v = 8;

    /* renamed from: b */
    public final CallToActionLayout f62260b;

    /* renamed from: c */
    public final ProgressBar f62261c;

    /* renamed from: d */
    public final Button f62262d;

    /* renamed from: e */
    public final ImageView f62263e;

    /* renamed from: f */
    public final CircularProgressIndicator f62264f;

    /* renamed from: g */
    public final ImageView f62265g;

    /* renamed from: h */
    public final CircularProgressIndicator f62266h;

    /* renamed from: i */
    public final ImageView f62267i;

    /* renamed from: j */
    public final Button f62268j;

    /* renamed from: k */
    public final CircularProgressIndicator f62269k;

    /* renamed from: l */
    public final ImageView f62270l;

    /* renamed from: m */
    public final Button f62271m;

    /* renamed from: n */
    public final CircularProgressIndicator f62272n;

    /* renamed from: o */
    public final ImageView f62273o;

    /* renamed from: p */
    public final Button f62274p;

    /* renamed from: q */
    public final Button f62275q;

    /* renamed from: r */
    public final PillDropdownButton f62276r;

    /* renamed from: s */
    public final LinearLayout f62277s;

    /* renamed from: t */
    public final TextView f62278t;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/c$a;", "", "", "SCAN_TAG", "Ljava/lang/String;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.c$a */
    /* loaded from: classes2.dex */
    public static final class C14177a {
        public /* synthetic */ C14177a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14177a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B/\b\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0004\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/smartlock/c$b;", "", "Lco/bird/android/widget/d;", "", "b", "I", C17296a.f69688o, "()Ljava/lang/Integer;", Entry.TYPE_TEXT, "c", "Ljava/lang/Integer;", "getColor", "color", "", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "center", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "e", "Lco/bird/android/model/constant/PhysicalLockPurpose;", "j", "()Lco/bird/android/model/constant/PhysicalLockPurpose;", "purpose", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;ZLco/bird/android/model/constant/PhysicalLockPurpose;)V", "f", "g", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.c$b */
    /* loaded from: classes2.dex */
    public enum EnumC14178b implements InterfaceC16662d {
        HELMET(C45871nl4.smartlock_lock_purpose_helmet, null, true, PhysicalLockPurpose.HELMET),
        LOCK_TO(C45871nl4.smartlock_lock_purpose_lock_to, null, true, PhysicalLockPurpose.LOCK_TO);
        

        /* renamed from: b */
        public final int f62282b;

        /* renamed from: c */
        public final Integer f62283c;

        /* renamed from: d */
        public final boolean f62284d;

        /* renamed from: e */
        public final PhysicalLockPurpose f62285e;

        EnumC14178b(int i, Integer num, boolean z, PhysicalLockPurpose physicalLockPurpose) {
            this.f62282b = i;
            this.f62283c = num;
            this.f62284d = z;
            this.f62285e = physicalLockPurpose;
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: a */
        public Integer mo13236a() {
            return Integer.valueOf(this.f62282b);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: b */
        public boolean mo13235b() {
            return this.f62284d;
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: c */
        public Integer mo13234c() {
            return InterfaceC16662d.C16663a.m54048e(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: d */
        public String mo13233d() {
            return InterfaceC16662d.C16663a.m54047f(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: e */
        public String mo13232e() {
            return InterfaceC16662d.C16663a.m54043j(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: g */
        public String mo13230g() {
            return InterfaceC16662d.C16663a.m54045h(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        public Integer getColor() {
            return this.f62283c;
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        public Integer getIcon() {
            return InterfaceC16662d.C16663a.m54050c(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: h */
        public Integer mo13229h() {
            return InterfaceC16662d.C16663a.m54049d(this);
        }

        @Override // co.bird.android.widget.InterfaceC16662d
        /* renamed from: i */
        public Integer mo13228i() {
            return InterfaceC16662d.C16663a.m54046g(this);
        }

        /* renamed from: j */
        public final PhysicalLockPurpose m59674j() {
            return this.f62285e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00018\u00008\u0000\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"", "Lco/bird/android/widget/d;", "K", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Ljava/lang/Enum;", "co/bird/android/widget/a$l"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$2$1\n*L\n1#1,108:1\n*E\n"})
    /* renamed from: co.bird.android.app.feature.physicallock.smartlock.c$c */
    /* loaded from: classes2.dex */
    public static final class C14179c extends Lambda implements Function1<Integer, EnumC14178b> {

        /* renamed from: g */
        public final /* synthetic */ List f62286g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14179c(List list) {
            super(1);
            this.f62286g = list;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, co.bird.android.app.feature.physicallock.smartlock.c$b] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final EnumC14178b invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (Enum) this.f62286g.get(it.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14176c(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f62260b = (CallToActionLayout) activity.findViewById(C36585Vg4.root);
        ProgressBar progressBar = (ProgressBar) activity.findViewById(C36585Vg4.progressBar);
        this.f62261c = progressBar;
        this.f62262d = (Button) activity.findViewById(C36585Vg4.markMountedToBird);
        this.f62263e = (ImageView) activity.findViewById(C36585Vg4.mountToBirdSuccess);
        this.f62264f = (CircularProgressIndicator) activity.findViewById(C36585Vg4.rekeyProgress);
        this.f62265g = (ImageView) activity.findViewById(C36585Vg4.rekeySuccess);
        this.f62266h = (CircularProgressIndicator) activity.findViewById(C36585Vg4.unlockProgress);
        this.f62267i = (ImageView) activity.findViewById(C36585Vg4.unlockSuccess);
        this.f62268j = (Button) activity.findViewById(C36585Vg4.retryUnlockButton);
        this.f62269k = (CircularProgressIndicator) activity.findViewById(C36585Vg4.reinsertPinProgress);
        this.f62270l = (ImageView) activity.findViewById(C36585Vg4.reinsertPinSuccess);
        this.f62271m = (Button) activity.findViewById(C36585Vg4.scanBirdButton);
        this.f62272n = (CircularProgressIndicator) activity.findViewById(C36585Vg4.scanBirdProgress);
        this.f62273o = (ImageView) activity.findViewById(C36585Vg4.scanBirdSuccess);
        this.f62274p = (Button) activity.findViewById(C36585Vg4.promoteLockTryAgainButton);
        this.f62275q = (Button) activity.findViewById(C36585Vg4.retryAssociationButton);
        this.f62276r = (PillDropdownButton) activity.findViewById(C36585Vg4.lockPurposeDropdown);
        this.f62277s = (LinearLayout) activity.findViewById(C36585Vg4.step1Details);
        this.f62278t = (TextView) activity.findViewById(C36585Vg4.lockTokenDetailsTextView);
        progressBar.setVisibility(8);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: A1 */
    public void mo59700A1(boolean z) {
        Button scanBirdbutton = this.f62271m;
        Intrinsics.checkNotNullExpressionValue(scanBirdbutton, "scanBirdbutton");
        C49520tu6.show$default(scanBirdbutton, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: H0 */
    public void mo59699H0(boolean z) {
        Button retryBirdAssocationButton = this.f62275q;
        Intrinsics.checkNotNullExpressionValue(retryBirdAssocationButton, "retryBirdAssocationButton");
        C49520tu6.show$default(retryBirdAssocationButton, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: H1 */
    public void mo59698H1(boolean z) {
        ImageView unlockSuccess = this.f62267i;
        Intrinsics.checkNotNullExpressionValue(unlockSuccess, "unlockSuccess");
        C49520tu6.show$default(unlockSuccess, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: J0 */
    public Observable<Unit> mo59697J0() {
        Button step1Button = this.f62262d;
        Intrinsics.checkNotNullExpressionValue(step1Button, "step1Button");
        return C44626lf5.clicksThrottle$default(step1Button, 0L, 1, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: K1 */
    public Observable<Unit> mo59696K1() {
        Button retryBirdAssocationButton = this.f62275q;
        Intrinsics.checkNotNullExpressionValue(retryBirdAssocationButton, "retryBirdAssocationButton");
        return C44626lf5.clicksThrottle$default(retryBirdAssocationButton, 0L, 1, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: N */
    public void mo59695N(boolean z) {
        Button step1Button = this.f62262d;
        Intrinsics.checkNotNullExpressionValue(step1Button, "step1Button");
        C49520tu6.show$default(step1Button, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: O */
    public void mo59694O(boolean z) {
        ImageView rekeySuccess = this.f62265g;
        Intrinsics.checkNotNullExpressionValue(rekeySuccess, "rekeySuccess");
        C49520tu6.show$default(rekeySuccess, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: O0 */
    public void mo59693O0(boolean z) {
        CircularProgressIndicator unlockProgress = this.f62266h;
        Intrinsics.checkNotNullExpressionValue(unlockProgress, "unlockProgress");
        C49520tu6.show$default(unlockProgress, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: P0 */
    public void mo59692P0(boolean z) {
        CircularProgressIndicator rekeyProgress = this.f62264f;
        Intrinsics.checkNotNullExpressionValue(rekeyProgress, "rekeyProgress");
        C49520tu6.m11232s(rekeyProgress, z, 4);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: V */
    public Observable<Unit> mo59691V() {
        Button promoteLockTryAgainButton = this.f62274p;
        Intrinsics.checkNotNullExpressionValue(promoteLockTryAgainButton, "promoteLockTryAgainButton");
        return C44626lf5.clicksThrottle$default(promoteLockTryAgainButton, 0L, 1, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: V0 */
    public Observable<Unit> mo59690V0() {
        PillDropdownButton lockPurposeDropdown = this.f62276r;
        Intrinsics.checkNotNullExpressionValue(lockPurposeDropdown, "lockPurposeDropdown");
        return C44626lf5.clicksThrottle$default(lockPurposeDropdown, 0L, 1, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: W */
    public void mo59689W(boolean z) {
        ImageView step1Success = this.f62263e;
        Intrinsics.checkNotNullExpressionValue(step1Success, "step1Success");
        C49520tu6.show$default(step1Success, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: a0 */
    public void mo59688a0(boolean z) {
        this.f62260b.setButtonEnabled(z);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: c1 */
    public void mo59687c1(boolean z) {
        Button promoteLockTryAgainButton = this.f62274p;
        Intrinsics.checkNotNullExpressionValue(promoteLockTryAgainButton, "promoteLockTryAgainButton");
        C49520tu6.show$default(promoteLockTryAgainButton, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: dg */
    public AbstractC24507p<EnumC14178b> mo59686dg(int i) {
        List list;
        BaseActivity activity = getActivity();
        String string = getString(i, new Object[0]);
        list = ArraysKt___ArraysKt.toList(EnumC14178b.values());
        BottomSheetOptionLayout.EnumC16469a enumC16469a = BottomSheetOptionLayout.EnumC16469a.NORMAL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Enum r5 = (Enum) obj;
            arrayList.add(obj);
        }
        C16664e c16664e = new C16664e();
        c16664e.setArguments(C16597a.m54345a(enumC16469a, string, null, 8388611, arrayList));
        c16664e.show(activity.getSupportFragmentManager(), "BottomSheetOptionFragment");
        AbstractC24507p m32067H = c16664e.m54040D9().m32067H(new C16597a.C16606i(new C14179c(arrayList)));
        Intrinsics.checkNotNullExpressionValue(m32067H, "with(BottomSheetOptionFr…).map { options[it] }\n  }");
        return m32067H;
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: e0 */
    public Observable<Unit> mo59685e0() {
        return this.f62260b.m54693b();
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: e4 */
    public void mo59684e4(int i) {
        PillDropdownButton pillDropdownButton = this.f62276r;
        String string = getActivity().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(labelRes)");
        pillDropdownButton.setLabel(string);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: g0 */
    public void mo59683g0(boolean z) {
        CircularProgressIndicator scanBirdProgress = this.f62272n;
        Intrinsics.checkNotNullExpressionValue(scanBirdProgress, "scanBirdProgress");
        C49520tu6.show$default(scanBirdProgress, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: gf */
    public void mo59682gf(String str) {
        boolean z;
        if (str != null) {
            this.f62278t.setText(str);
        }
        LinearLayout step1DetailsContainer = this.f62277s;
        Intrinsics.checkNotNullExpressionValue(step1DetailsContainer, "step1DetailsContainer");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(step1DetailsContainer, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: h4 */
    public void mo59681h4(boolean z) {
        Button retryUnlockButton = this.f62268j;
        Intrinsics.checkNotNullExpressionValue(retryUnlockButton, "retryUnlockButton");
        C49520tu6.show$default(retryUnlockButton, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: jg */
    public Observable<Unit> mo59680jg() {
        Button retryUnlockButton = this.f62268j;
        Intrinsics.checkNotNullExpressionValue(retryUnlockButton, "retryUnlockButton");
        return C44626lf5.clicksThrottle$default(retryUnlockButton, 0L, 1, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: r */
    public void mo59679r() {
        Toast.makeText(getActivity(), C45871nl4.smartlock_associate_done_toast, 0).show();
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: s0 */
    public void mo59678s0(boolean z) {
        ImageView scanBirdSuccess = this.f62273o;
        Intrinsics.checkNotNullExpressionValue(scanBirdSuccess, "scanBirdSuccess");
        C49520tu6.show$default(scanBirdSuccess, z, 0, 2, null);
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: t7 */
    public AbstractC23442F<WireBird> mo59677t7(ScanMode mode, ScanIntention scanIntention, Integer num) {
        String str;
        C52471yt3 m2328a;
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (num != null) {
            str = getActivity().getString(num.intValue());
        } else {
            str = null;
        }
        m2328a = C52471yt3.f120367g.m2328a(mode, scanIntention, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : null, (i & 16) != 0, (i & 32) != 0 ? null : null);
        m2328a.show(getActivity().getSupportFragmentManager(), "BIRD_SCAN_TAG");
        return m2328a.m2331N6();
    }

    @Override // co.bird.android.app.feature.physicallock.smartlock.InterfaceC14174b
    /* renamed from: w */
    public Observable<Unit> mo59676w() {
        Button scanBirdbutton = this.f62271m;
        Intrinsics.checkNotNullExpressionValue(scanBirdbutton, "scanBirdbutton");
        return C44626lf5.clicksThrottle$default(scanBirdbutton, 0L, 1, null);
    }
}
