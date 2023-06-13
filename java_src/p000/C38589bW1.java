package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.identification.IdentificationCountryJurisdiction;
import co.bird.android.model.identification.IdentificationDocumentDescriptor;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.identification.IdentificationSubmissionData;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001\u000bB1\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0002J\u0014\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, m28432d2 = {"LbW1;", "", "", DateTokenConverter.CONVERTER_KEY, "e", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "c", C17296a.f69688o, "Lco/bird/android/model/identification/IdentificationSubmissionData;", "Lco/bird/android/model/identification/IdentificationDocumentDescriptor;", "descriptor", "", "b", "LmT1;", "LmT1;", "identificationManager", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "Le13;", "navigator", "Lgl;", "Lgl;", "appPreference", "LEa;", "LEa;", "analyticsManager", "f", "Z", "backPressed", "<init>", "(LmT1;Lcom/uber/autodispose/ScopeProvider;Le13;Lgl;LEa;)V", "g", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bW1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38589bW1 {

    /* renamed from: g */
    public static final C12400a f57600g = new C12400a(null);

    /* renamed from: a */
    public final InterfaceC45102mT1 f57601a;

    /* renamed from: b */
    public final ScopeProvider f57602b;

    /* renamed from: c */
    public final InterfaceC40099e13 f57603c;

    /* renamed from: d */
    public final C22454gl f57604d;

    /* renamed from: e */
    public final InterfaceC1880Ea f57605e;

    /* renamed from: f */
    public boolean f57606f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LbW1$a;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: bW1$a */
    /* loaded from: classes3.dex */
    public static final class C12400a {
        public /* synthetic */ C12400a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C12400a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bW1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12401b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentificationAcceptableMethod.EntryMethodType.values().length];
            try {
                iArr[IdentificationAcceptableMethod.EntryMethodType.FRONT_SCAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationAcceptableMethod.EntryMethodType.BACK_SCAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentificationAcceptableMethod.EntryMethodType.SELFIE_PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentificationAcceptableMethod.EntryMethodType.SELFIE_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bW1$c */
    /* loaded from: classes3.dex */
    public static final class C12402c extends Lambda implements Function0<Unit> {
        public C12402c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C38589bW1.this.f57603c.mo37050b1(-1);
        }
    }

    public C38589bW1(InterfaceC45102mT1 identificationManager, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C22454gl appPreference, InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(identificationManager, "identificationManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f57601a = identificationManager;
        this.f57602b = scopeProvider;
        this.f57603c = navigator;
        this.f57604d = appPreference;
        this.f57605e = analyticsManager;
    }

    /* renamed from: a */
    public final void m64498a() {
        this.f57603c.mo37050b1(0);
    }

    /* renamed from: b */
    public final boolean m64497b(IdentificationSubmissionData identificationSubmissionData, IdentificationDocumentDescriptor identificationDocumentDescriptor) {
        int i = C12401b.$EnumSwitchMapping$0[identificationDocumentDescriptor.getEntryMethodType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        List<String> selfieVideo = identificationSubmissionData.getSelfieVideo();
                        if (selfieVideo == null || !(!selfieVideo.isEmpty())) {
                            return false;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    List<String> selfiePhoto = identificationSubmissionData.getSelfiePhoto();
                    if (selfiePhoto == null || !(!selfiePhoto.isEmpty())) {
                        return false;
                    }
                }
            } else {
                List<String> documentBack = identificationSubmissionData.getDocumentBack();
                if (documentBack == null || !(!documentBack.isEmpty())) {
                    return false;
                }
            }
        } else {
            List<String> documentFront = identificationSubmissionData.getDocumentFront();
            if (documentFront == null || !(!documentFront.isEmpty())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final void m64496c(int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.f57606f = true;
            m64498a();
        }
    }

    /* renamed from: d */
    public final void m64495d() {
    }

    /* renamed from: e */
    public final void m64494e() {
        if (this.f57606f) {
            return;
        }
        C46297oU1 mo25561h = this.f57601a.mo25561h();
        if (mo25561h == null) {
            m64498a();
            Unit unit = Unit.INSTANCE;
            C41318g46.m40160d("IdentificationTrampolinePresenter was resumed but no partial submission data exists", new Object[0]);
            return;
        }
        List<IdentificationAcceptableMethod.EntryMethodType> requiredEntryMethodTypes = mo25561h.m21017b().requiredEntryMethodTypes();
        if (requiredEntryMethodTypes == null) {
            m64498a();
            Unit unit2 = Unit.INSTANCE;
            C41318g46.m40160d("IdentificationTrampolinePresenter was resumed but a document entry method was not found or had no sides to scan for", new Object[0]);
            return;
        }
        for (IdentificationAcceptableMethod.EntryMethodType entryMethodType : requiredEntryMethodTypes) {
            IdentificationDocumentType m21015d = mo25561h.m21015d();
            String country = mo25561h.m21014e().getCountry();
            Intrinsics.checkNotNullExpressionValue(country, "partialData.locale.country");
            IdentificationDocumentDescriptor identificationDocumentDescriptor = new IdentificationDocumentDescriptor(m21015d, new IdentificationCountryJurisdiction(country), entryMethodType);
            if (!m64497b(mo25561h.m21013f(), identificationDocumentDescriptor)) {
                this.f57603c.mo37058a(identificationDocumentDescriptor, 10040);
                return;
            }
        }
        C41318g46.m40163a("All submission requirements met, starting submission process", new Object[0]);
        this.f57601a.mo25558k(mo25561h, new C12402c());
    }
}
