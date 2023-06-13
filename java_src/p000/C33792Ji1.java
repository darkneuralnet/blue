package p000;

import android.content.Context;
import android.graphics.Rect;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RequirementsResult;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.identification.IdentificationDocumentDescriptor;
import co.bird.android.model.identification.IdentificationDocumentDetectionParameters;
import co.bird.android.model.identification.IdentificationDocumentScannerStrategy;
import co.bird.android.model.identification.IdentificationDocumentStringsRequirements;
import co.bird.android.model.identification.IdentificationDocumentType;
import co.bird.android.model.wire.configs.IdentificationConfig;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C46615p06;
import p000.US1;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0003*\u00020\u0000\u001a\u001a\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f\u001a\u001e\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a\u001e\u0010\u0017\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0018\u001a\n\u0010\u001b\u001a\u00020\u0005*\u00020\u0015¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentType;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "", "e", "(Lco/bird/android/model/identification/IdentificationDocumentType;)Ljava/lang/Integer;", "b", "Lco/bird/android/model/User;", "Lgl;", "appPreference", "LOh;", "appBuildConfig", "", "c", "LUS1$c;", "Lco/bird/android/model/identification/IdentificationDocumentDescriptor;", "descriptor", "Lco/bird/android/model/wire/configs/IdentificationConfig;", "identificationConfig", "Lco/bird/android/model/RequirementsResult;", "f", "g", "Landroid/graphics/Rect;", "", C17296a.f69688o, "i", "inverseDetectedRatio", "co.bird.android.feature.identification"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nco/bird/android/feature/identification/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,179:1\n1#2:180\n1789#3,2:181\n1789#3,3:183\n1791#3:186\n1477#3:187\n1502#3,3:188\n1505#3,3:198\n1855#3,2:201\n1747#3,3:203\n361#4,7:191\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nco/bird/android/feature/identification/ExtensionsKt\n*L\n140#1:181,2\n142#1:183,3\n140#1:186\n149#1:187\n149#1:188,3\n149#1:198,3\n153#1:201,2\n159#1:203,3\n149#1:191,7\n*E\n"})
/* renamed from: Ji1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33792Ji1 {

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Double;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ji1$a */
    /* loaded from: classes3.dex */
    public static final class C4210a extends Lambda implements Function0<Double> {

        /* renamed from: g */
        public final /* synthetic */ double f18059g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4210a(double d) {
            super(0);
            this.f18059g = d;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Double invoke() {
            return Double.valueOf(1.0d / this.f18059g);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ji1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C4211b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdentificationDocumentType.values().length];
            try {
                iArr[IdentificationDocumentType.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdentificationDocumentType.DRIVER_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdentificationDocumentType.PROVISIONAL_DRIVER_LICENSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdentificationDocumentType.PASSPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdentificationDocumentType.VISA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdentificationDocumentType.RESIDENCE_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdentificationDocumentType.LEGACY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdentificationDocumentType.EMIRATES_ID.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdentificationDocumentType.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final double m99935a(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return rect.width() / rect.height();
    }

    /* renamed from: b */
    public static final String m99934b(IdentificationDocumentType identificationDocumentType) {
        String replace$default;
        String capitalize;
        Intrinsics.checkNotNullParameter(identificationDocumentType, "<this>");
        replace$default = StringsKt__StringsJVMKt.replace$default(identificationDocumentType.name(), "_", " ", false, 4, (Object) null);
        String lowerCase = replace$default.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        capitalize = StringsKt__StringsJVMKt.capitalize(lowerCase);
        return capitalize;
    }

    /* renamed from: c */
    public static final boolean m99933c(User user, C22454gl appPreference, InterfaceC6097Oh appBuildConfig) {
        boolean z;
        Intrinsics.checkNotNullParameter(user, "<this>");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        EnumC49958uf1 m37699O = appPreference.m37699O();
        if (user.getAdmin() && UserKt.isAdminDomain(user)) {
            z = true;
        } else {
            z = false;
        }
        if (z || user.getTester() || appBuildConfig.mo89921k() || m37699O != EnumC49958uf1.f112718k) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final String m99932d(IdentificationDocumentType identificationDocumentType, Context context) {
        String str;
        Intrinsics.checkNotNullParameter(identificationDocumentType, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Integer m99931e = m99931e(identificationDocumentType);
        if (m99931e != null) {
            str = context.getString(m99931e.intValue());
        } else {
            str = null;
        }
        if (str == null) {
            return m99934b(identificationDocumentType);
        }
        return str;
    }

    /* renamed from: e */
    public static final Integer m99931e(IdentificationDocumentType identificationDocumentType) {
        Intrinsics.checkNotNullParameter(identificationDocumentType, "<this>");
        switch (C4211b.$EnumSwitchMapping$0[identificationDocumentType.ordinal()]) {
            case 1:
                return Integer.valueOf(C45871nl4.identification_document_type_id_card);
            case 2:
                return Integer.valueOf(C45871nl4.identification_document_type_driver_license);
            case 3:
                return Integer.valueOf(C45871nl4.identification_document_type_provisional_driver_license);
            case 4:
                return Integer.valueOf(C45871nl4.identification_document_type_passport);
            case 5:
                return Integer.valueOf(C45871nl4.identification_document_type_visa);
            case 6:
                return Integer.valueOf(C45871nl4.identification_document_type_residence_card);
            case 7:
                return Integer.valueOf(C45871nl4.identification_document_type_legacy);
            case 8:
                return Integer.valueOf(C45871nl4.identification_document_type_emirates_id);
            case 9:
                return Integer.valueOf(C45871nl4.identification_document_type_unknown);
            default:
                return null;
        }
    }

    /* renamed from: f */
    public static final RequirementsResult m99930f(US1.C8284c c8284c, IdentificationDocumentDescriptor descriptor, IdentificationConfig identificationConfig) {
        boolean z;
        Boolean bool;
        Boolean bool2;
        Object firstOrNull;
        boolean z2;
        Float m81511d;
        boolean z3;
        Intrinsics.checkNotNullParameter(c8284c, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        IdentificationDocumentScannerStrategy strategy = IdentificationDocumentScannerStrategy.Companion.toStrategy(descriptor, identificationConfig);
        if (strategy != null) {
            boolean z4 = true;
            if (strategy.getDetectionParameters().getEnableManualImageHeuristics() && (descriptor.getEntryMethodType() == IdentificationAcceptableMethod.EntryMethodType.FRONT_SCAN || descriptor.getEntryMethodType() == IdentificationAcceptableMethod.EntryMethodType.SELFIE_PHOTO)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                strategy = null;
            }
            if (strategy != null) {
                IdentificationDocumentDetectionParameters detectionParameters = strategy.getDetectionParameters();
                Double minLandmarkWidthRatio = detectionParameters.getMinLandmarkWidthRatio();
                if (minLandmarkWidthRatio != null) {
                    minLandmarkWidthRatio.doubleValue();
                    if (descriptor.getEntryMethodType() == IdentificationAcceptableMethod.EntryMethodType.FRONT_SCAN) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        minLandmarkWidthRatio = null;
                    }
                    if (minLandmarkWidthRatio != null) {
                        double doubleValue = minLandmarkWidthRatio.doubleValue();
                        if (c8284c.m81511d() != null && m81511d.floatValue() >= doubleValue) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bool = Boolean.valueOf(z3);
                        if (!detectionParameters.getFaceRequired() && descriptor.getEntryMethodType() == IdentificationAcceptableMethod.EntryMethodType.SELFIE_PHOTO) {
                            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) c8284c.m81513b());
                            if (firstOrNull == null) {
                                z4 = false;
                            }
                            bool2 = Boolean.valueOf(z4);
                        } else {
                            bool2 = null;
                        }
                        return new RequirementsResult(null, bool, bool2, null);
                    }
                }
                bool = null;
                if (!detectionParameters.getFaceRequired()) {
                }
                bool2 = null;
                return new RequirementsResult(null, bool, bool2, null);
            }
        }
        return new RequirementsResult(null, null, null, null, 15, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0204, code lost:
        if (r11 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
        if (r3.contains(java.lang.Double.valueOf(m99928h(r13))) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016a, code lost:
        if (r11 == null) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final RequirementsResult m99929g(US1.C8284c c8284c, IdentificationDocumentDescriptor descriptor, IdentificationConfig identificationConfig) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        boolean z;
        Set<String> emptySet;
        boolean z2;
        boolean z3;
        boolean z4;
        List<C46615p06.C27123e> m20166b;
        String text;
        boolean isBlank;
        Float m81511d;
        boolean z5;
        double d;
        Object firstOrNull;
        boolean z6;
        Rect boundingBox;
        Lazy lazy;
        ClosedFloatingPointRange rangeTo;
        ClosedFloatingPointRange rangeTo2;
        Intrinsics.checkNotNullParameter(c8284c, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        IdentificationDocumentScannerStrategy strategy = IdentificationDocumentScannerStrategy.Companion.toStrategy(descriptor, identificationConfig);
        if (strategy == null) {
            return new RequirementsResult(null, null, null, null, 15, null);
        }
        if (!strategy.getEnableAutoDetect()) {
            return new RequirementsResult(null, null, null, null, 15, null);
        }
        IdentificationDocumentDetectionParameters detectionParameters = strategy.getDetectionParameters();
        Double aspectRatio = detectionParameters.getAspectRatio();
        Boolean bool4 = null;
        boolean z7 = true;
        if (aspectRatio != null) {
            double doubleValue = aspectRatio.doubleValue();
            Double aspectRatioTolerancePercent = detectionParameters.getAspectRatioTolerancePercent();
            if (aspectRatioTolerancePercent != null) {
                d = aspectRatioTolerancePercent.doubleValue();
            } else {
                d = 0.0d;
            }
            double d2 = 1;
            double d3 = (d2 - d) * doubleValue;
            double d4 = doubleValue * (d2 + d);
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) c8284c.m81510e());
            U11 u11 = (U11) firstOrNull;
            if (u11 != null && (boundingBox = u11.m82117a()) != null) {
                Intrinsics.checkNotNullExpressionValue(boundingBox, "boundingBox");
                double m99935a = m99935a(boundingBox);
                lazy = LazyKt__LazyJVMKt.lazy(new C4210a(m99935a));
                rangeTo = RangesKt__RangesKt.rangeTo(d3, d4);
                if (!rangeTo.contains(Double.valueOf(m99935a))) {
                    rangeTo2 = RangesKt__RangesKt.rangeTo(d3, d4);
                }
                z6 = true;
                bool = Boolean.valueOf(z6);
            }
            z6 = false;
            bool = Boolean.valueOf(z6);
        } else {
            bool = null;
        }
        Double minLandmarkWidthRatio = detectionParameters.getMinLandmarkWidthRatio();
        if (minLandmarkWidthRatio != null) {
            double doubleValue2 = minLandmarkWidthRatio.doubleValue();
            if (c8284c.m81511d() != null && m81511d.floatValue() >= doubleValue2) {
                z5 = true;
            } else {
                z5 = false;
            }
            bool2 = Boolean.valueOf(z5);
        } else {
            bool2 = null;
        }
        if (detectionParameters.getFaceRequired()) {
            bool3 = Boolean.valueOf(!c8284c.m81513b().isEmpty());
        } else {
            bool3 = null;
        }
        List<IdentificationDocumentStringsRequirements> stringRequirements = detectionParameters.getStringRequirements();
        if (stringRequirements != null) {
            if (!(!stringRequirements.isEmpty())) {
                stringRequirements = null;
            }
            if (stringRequirements != null) {
                C46615p06 m81509f = c8284c.m81509f();
                if (m81509f != null && (text = m81509f.m20167a()) != null) {
                    Intrinsics.checkNotNullExpressionValue(text, "text");
                    isBlank = StringsKt__StringsJVMKt.isBlank(text);
                    if (!isBlank) {
                        z = true;
                        if (z) {
                            C46615p06 m81509f2 = c8284c.m81509f();
                            if (m81509f2 != null && (m20166b = m81509f2.m20166b()) != null) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                for (C46615p06.C27123e c27123e : m20166b) {
                                    List<C46615p06.C27120b> m20161d = c27123e.m20161d();
                                    Intrinsics.checkNotNullExpressionValue(m20161d, "item.lines");
                                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                    for (C46615p06.C27120b c27120b : m20161d) {
                                        String m20165d = c27120b.m20165d();
                                        Intrinsics.checkNotNullExpressionValue(m20165d, "line.text");
                                        linkedHashSet2.add(m20165d);
                                    }
                                    linkedHashSet.addAll(linkedHashSet2);
                                }
                                emptySet = CollectionsKt___CollectionsKt.toSet(linkedHashSet);
                            }
                            emptySet = SetsKt__SetsKt.emptySet();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Object obj : stringRequirements) {
                                Boolean valueOf = Boolean.valueOf(((IdentificationDocumentStringsRequirements) obj).getMustBeSatisfied());
                                Object obj2 = linkedHashMap.get(valueOf);
                                if (obj2 == null) {
                                    obj2 = new ArrayList();
                                    linkedHashMap.put(valueOf, obj2);
                                }
                                ((List) obj2).add(obj);
                            }
                            List<IdentificationDocumentStringsRequirements> list = (List) linkedHashMap.get(Boolean.TRUE);
                            List list2 = (List) linkedHashMap.get(Boolean.FALSE);
                            if (list != null) {
                                for (IdentificationDocumentStringsRequirements identificationDocumentStringsRequirements : list) {
                                    if (identificationDocumentStringsRequirements.isSatisfiedBy(emptySet) == null) {
                                        break;
                                    }
                                }
                            }
                            if (list2 != null) {
                                List<IdentificationDocumentStringsRequirements> list3 = list2;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    for (IdentificationDocumentStringsRequirements identificationDocumentStringsRequirements2 : list3) {
                                        if (identificationDocumentStringsRequirements2.isSatisfiedBy(emptySet) != null) {
                                            z3 = true;
                                            continue;
                                        } else {
                                            z3 = false;
                                            continue;
                                        }
                                        if (z3) {
                                            z4 = true;
                                            break;
                                        }
                                    }
                                }
                                z4 = false;
                                if (z4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        z7 = false;
                        bool4 = Boolean.valueOf(z7);
                    }
                }
                z = false;
                if (z) {
                }
                z7 = false;
                bool4 = Boolean.valueOf(z7);
            }
        }
        return new RequirementsResult(bool, bool2, bool3, bool4);
    }

    /* renamed from: h */
    public static final double m99928h(Lazy<Double> lazy) {
        return lazy.getValue().doubleValue();
    }

    /* renamed from: i */
    public static final int m99927i(RequirementsResult requirementsResult) {
        Intrinsics.checkNotNullParameter(requirementsResult, "<this>");
        Boolean rectDetected = requirementsResult.getRectDetected();
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.areEqual(rectDetected, bool)) {
            return C45871nl4.identification_scanning_not_found_rect;
        }
        if (Intrinsics.areEqual(requirementsResult.getFaceDetected(), bool)) {
            return C45871nl4.identification_scanning_not_found_face;
        }
        if (Intrinsics.areEqual(requirementsResult.getTextDetected(), bool)) {
            return C45871nl4.identification_scanning_not_found_text;
        }
        return C45871nl4.identification_scanning_found_image_detected;
    }

    public static /* synthetic */ RequirementsResult satisfiesManualRequirements$default(US1.C8284c c8284c, IdentificationDocumentDescriptor identificationDocumentDescriptor, IdentificationConfig identificationConfig, int i, Object obj) {
        if ((i & 2) != 0) {
            identificationConfig = null;
        }
        return m99930f(c8284c, identificationDocumentDescriptor, identificationConfig);
    }

    public static /* synthetic */ RequirementsResult satisfiesRequirements$default(US1.C8284c c8284c, IdentificationDocumentDescriptor identificationDocumentDescriptor, IdentificationConfig identificationConfig, int i, Object obj) {
        if ((i & 2) != 0) {
            identificationConfig = null;
        }
        return m99929g(c8284c, identificationDocumentDescriptor, identificationConfig);
    }
}
