package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.identification.IdentificationAcceptableMethod;
import co.bird.android.model.wire.configs.IdentificationConfig;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;", "", "enableAutoDetect", "", "detectionParameters", "Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;", "minLandmarkWidthRatio", "", "enableManualImageHeuristics", "(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Z)V", "getDetectionParameters", "()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;", "getEnableAutoDetect", "()Z", "getEnableManualImageHeuristics", "getMinLandmarkWidthRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Z)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationDocumentScannerStrategy {
    private static final double ISO_7810_ID_2_ASPECT_RATIO = 1.41892d;
    private static final double ISO_7810_ID_3_ASPECT_RATIO = 1.42045d;
    private final IdentificationDocumentDetectionParameters detectionParameters;
    private final boolean enableAutoDetect;
    private final boolean enableManualImageHeuristics;
    private final Double minLandmarkWidthRatio;
    public static final Companion Companion = new Companion(null);
    private static final IdentificationDocumentScannerStrategy UNRESTRICTED_MANUAL_CAPTURE = new IdentificationDocumentScannerStrategy(false, new IdentificationDocumentDetectionParameters(null, null, null, null, null, false, null, null, false), null, false, 12, null);
    private static final double ISO_7810_ID_1_ASPECT_RATIO = 1.58577d;
    private static final double ASPECT_RATIO_TOLERANCE_PERCENTAGE = 0.1d;
    private static final double QUADRATURE_TOLERANCE_DEGREES = 7.0d;
    private static final double STANDARD_MIN_SIZE = 0.5d;
    private static final double BLUR_VARIANCE_TOLERANCE = 2.0d;
    private static final IdentificationDocumentDetectionParameters STANDARD_DETECTION_PARAMETERS = new IdentificationDocumentDetectionParameters(Double.valueOf((double) ISO_7810_ID_1_ASPECT_RATIO), Double.valueOf((double) ASPECT_RATIO_TOLERANCE_PERCENTAGE), Double.valueOf((double) QUADRATURE_TOLERANCE_DEGREES), Double.valueOf((double) STANDARD_MIN_SIZE), Double.valueOf((double) BLUR_VARIANCE_TOLERANCE), true, null, null, false);
    private static final IdentificationDocumentDetectionParameters STANDARD_SELFIE_DETECTION_PARAMETERS = new IdentificationDocumentDetectionParameters(null, null, null, null, null, true, null, null, false);

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u0013J\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;", "", "()V", "ASPECT_RATIO_TOLERANCE_PERCENTAGE", "", "BLUR_VARIANCE_TOLERANCE", "ISO_7810_ID_1_ASPECT_RATIO", "ISO_7810_ID_2_ASPECT_RATIO", "ISO_7810_ID_3_ASPECT_RATIO", "QUADRATURE_TOLERANCE_DEGREES", "STANDARD_DETECTION_PARAMETERS", "Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;", "STANDARD_MIN_SIZE", "STANDARD_SELFIE_DETECTION_PARAMETERS", "UNRESTRICTED_MANUAL_CAPTURE", "Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;", "getUNRESTRICTED_MANUAL_CAPTURE", "()Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;", "toStrategy", "Lco/bird/android/model/identification/IdentificationDocumentDescriptor;", "identificationConfig", "Lco/bird/android/model/wire/configs/IdentificationConfig;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class WhenMappings {
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
                    iArr[IdentificationDocumentType.RESIDENCE_CARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[IdentificationDocumentType.PASSPORT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[IdentificationDocumentType.VISA.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentificationDocumentScannerStrategy getUNRESTRICTED_MANUAL_CAPTURE() {
            return IdentificationDocumentScannerStrategy.UNRESTRICTED_MANUAL_CAPTURE;
        }

        public final IdentificationDocumentScannerStrategy toStrategy(IdentificationDocumentDescriptor identificationDocumentDescriptor, IdentificationConfig identificationConfig) {
            IdentificationDocumentDetectionParameters copy;
            Intrinsics.checkNotNullParameter(identificationDocumentDescriptor, "<this>");
            IdentificationDocumentScannerStrategy strategy = toStrategy(identificationDocumentDescriptor);
            if (strategy != null) {
                if (identificationConfig == null) {
                    return strategy;
                }
                Double minLandmarkWidthRatio = identificationConfig.getMinLandmarkWidthRatio();
                boolean enableManualImageHeuristics = identificationConfig.getEnableManualImageHeuristics();
                copy = r6.copy((r20 & 1) != 0 ? r6.aspectRatio : null, (r20 & 2) != 0 ? r6.aspectRatioTolerancePercent : identificationConfig.getMinRectangleConfidence(), (r20 & 4) != 0 ? r6.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? r6.minimumSize : null, (r20 & 16) != 0 ? r6.blurVarianceThreshold : null, (r20 & 32) != 0 ? r6.faceRequired : false, (r20 & 64) != 0 ? r6.stringRequirements : null, (r20 & 128) != 0 ? r6.minLandmarkWidthRatio : identificationConfig.getMinLandmarkWidthRatio(), (r20 & 256) != 0 ? strategy.getDetectionParameters().enableManualImageHeuristics : identificationConfig.getEnableManualImageHeuristics());
                return IdentificationDocumentScannerStrategy.copy$default(strategy, false, copy, minLandmarkWidthRatio, enableManualImageHeuristics, 1, null);
            }
            return null;
        }

        private Companion() {
        }

        public final IdentificationDocumentScannerStrategy toStrategy(IdentificationDocumentDescriptor identificationDocumentDescriptor) {
            Set of;
            Set of2;
            List listOf;
            IdentificationDocumentDetectionParameters copy;
            Set of3;
            List listOf2;
            IdentificationDocumentDetectionParameters copy2;
            IdentificationDocumentDetectionParameters copy3;
            IdentificationDocumentDetectionParameters copy4;
            Set of4;
            List listOf3;
            IdentificationDocumentDetectionParameters copy5;
            IdentificationDocumentDetectionParameters copy6;
            IdentificationDocumentDetectionParameters copy7;
            IdentificationDocumentDetectionParameters copy8;
            Set of5;
            List listOf4;
            IdentificationDocumentDetectionParameters copy9;
            Set of6;
            List listOf5;
            IdentificationDocumentDetectionParameters copy10;
            IdentificationDocumentDetectionParameters copy11;
            IdentificationDocumentDetectionParameters copy12;
            Intrinsics.checkNotNullParameter(identificationDocumentDescriptor, "<this>");
            if (identificationDocumentDescriptor.getEntryMethodType() != IdentificationAcceptableMethod.EntryMethodType.SELFIE_PHOTO && identificationDocumentDescriptor.getEntryMethodType() != IdentificationAcceptableMethod.EntryMethodType.SELFIE_VIDEO) {
                if (identificationDocumentDescriptor.getEntryMethodType() == IdentificationAcceptableMethod.EntryMethodType.BACK_SCAN) {
                    IdentificationJurisdiction jurisdiction = identificationDocumentDescriptor.getJurisdiction();
                    if (Intrinsics.areEqual(jurisdiction, new IdentificationCountryJurisdiction("CH"))) {
                        if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 1) {
                            copy12 = r9.copy((r20 & 1) != 0 ? r9.aspectRatio : null, (r20 & 2) != 0 ? r9.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? r9.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? r9.minimumSize : null, (r20 & 16) != 0 ? r9.blurVarianceThreshold : null, (r20 & 32) != 0 ? r9.faceRequired : false, (r20 & 64) != 0 ? r9.stringRequirements : null, (r20 & 128) != 0 ? r9.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS.enableManualImageHeuristics : false);
                            return new IdentificationDocumentScannerStrategy(true, copy12, null, false, 12, null);
                        }
                        return null;
                    } else if (Intrinsics.areEqual(jurisdiction, new IdentificationCountryJurisdiction("IT")) && WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 1) {
                        copy11 = r9.copy((r20 & 1) != 0 ? r9.aspectRatio : null, (r20 & 2) != 0 ? r9.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? r9.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? r9.minimumSize : null, (r20 & 16) != 0 ? r9.blurVarianceThreshold : null, (r20 & 32) != 0 ? r9.faceRequired : false, (r20 & 64) != 0 ? r9.stringRequirements : null, (r20 & 128) != 0 ? r9.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS.enableManualImageHeuristics : false);
                        return new IdentificationDocumentScannerStrategy(true, copy11, null, false, 12, null);
                    } else {
                        return null;
                    }
                }
                IdentificationJurisdiction jurisdiction2 = identificationDocumentDescriptor.getJurisdiction();
                if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("AT"))) {
                    int i = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                    }
                    return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("AU"))) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            return null;
                        }
                        return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                    }
                    return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("BE"))) {
                    int i3 = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            return null;
                        }
                        return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                    }
                    return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("CA"))) {
                    int i4 = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            return null;
                        }
                        return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                    }
                    return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("CH"))) {
                    if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 2) {
                        return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                    }
                    return null;
                } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("CH"))) {
                    if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 1) {
                        return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                    }
                    return null;
                } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("DE"))) {
                    int i5 = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                    if (i5 == 1) {
                        IdentificationDocumentDetectionParameters identificationDocumentDetectionParameters = IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS;
                        Double valueOf = Double.valueOf((double) IdentificationDocumentScannerStrategy.ISO_7810_ID_2_ASPECT_RATIO);
                        of5 = SetsKt__SetsJVMKt.setOf("Deutschland");
                        listOf4 = CollectionsKt__CollectionsJVMKt.listOf(new IdentificationDocumentStringsRequirements("de", of5, true, null, true));
                        copy9 = identificationDocumentDetectionParameters.copy((r20 & 1) != 0 ? identificationDocumentDetectionParameters.aspectRatio : valueOf, (r20 & 2) != 0 ? identificationDocumentDetectionParameters.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? identificationDocumentDetectionParameters.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? identificationDocumentDetectionParameters.minimumSize : null, (r20 & 16) != 0 ? identificationDocumentDetectionParameters.blurVarianceThreshold : null, (r20 & 32) != 0 ? identificationDocumentDetectionParameters.faceRequired : false, (r20 & 64) != 0 ? identificationDocumentDetectionParameters.stringRequirements : listOf4, (r20 & 128) != 0 ? identificationDocumentDetectionParameters.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? identificationDocumentDetectionParameters.enableManualImageHeuristics : false);
                        return new IdentificationDocumentScannerStrategy(true, copy9, null, false, 12, null);
                    } else if (i5 != 2) {
                        return null;
                    } else {
                        IdentificationDocumentDetectionParameters identificationDocumentDetectionParameters2 = IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS;
                        of6 = SetsKt__SetsJVMKt.setOf("Deutschland");
                        listOf5 = CollectionsKt__CollectionsJVMKt.listOf(new IdentificationDocumentStringsRequirements("de", of6, true, null, true));
                        copy10 = identificationDocumentDetectionParameters2.copy((r20 & 1) != 0 ? identificationDocumentDetectionParameters2.aspectRatio : null, (r20 & 2) != 0 ? identificationDocumentDetectionParameters2.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? identificationDocumentDetectionParameters2.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? identificationDocumentDetectionParameters2.minimumSize : null, (r20 & 16) != 0 ? identificationDocumentDetectionParameters2.blurVarianceThreshold : null, (r20 & 32) != 0 ? identificationDocumentDetectionParameters2.faceRequired : false, (r20 & 64) != 0 ? identificationDocumentDetectionParameters2.stringRequirements : listOf5, (r20 & 128) != 0 ? identificationDocumentDetectionParameters2.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? identificationDocumentDetectionParameters2.enableManualImageHeuristics : false);
                        return new IdentificationDocumentScannerStrategy(true, copy10, null, false, 12, null);
                    }
                } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("DK"))) {
                    if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 2) {
                        return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                    }
                    return null;
                } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("ES"))) {
                    int i6 = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                    if (i6 != 1) {
                        if (i6 != 2) {
                            return null;
                        }
                        return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                    }
                    return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("FI"))) {
                    if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 2) {
                        return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                    }
                    return null;
                } else {
                    String country = Locale.FRANCE.getCountry();
                    Intrinsics.checkNotNullExpressionValue(country, "FRANCE.country");
                    if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction(country))) {
                        switch (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()]) {
                            case 1:
                                copy6 = r16.copy((r20 & 1) != 0 ? r16.aspectRatio : Double.valueOf((double) IdentificationDocumentScannerStrategy.ISO_7810_ID_2_ASPECT_RATIO), (r20 & 2) != 0 ? r16.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? r16.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? r16.minimumSize : null, (r20 & 16) != 0 ? r16.blurVarianceThreshold : null, (r20 & 32) != 0 ? r16.faceRequired : false, (r20 & 64) != 0 ? r16.stringRequirements : null, (r20 & 128) != 0 ? r16.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS.enableManualImageHeuristics : false);
                                return new IdentificationDocumentScannerStrategy(true, copy6, null, false, 12, null);
                            case 2:
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            case 3:
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            case 4:
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            case 5:
                                copy7 = r21.copy((r20 & 1) != 0 ? r21.aspectRatio : Double.valueOf((double) IdentificationDocumentScannerStrategy.ISO_7810_ID_3_ASPECT_RATIO), (r20 & 2) != 0 ? r21.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? r21.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? r21.minimumSize : null, (r20 & 16) != 0 ? r21.blurVarianceThreshold : null, (r20 & 32) != 0 ? r21.faceRequired : false, (r20 & 64) != 0 ? r21.stringRequirements : null, (r20 & 128) != 0 ? r21.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS.enableManualImageHeuristics : false);
                                return new IdentificationDocumentScannerStrategy(true, copy7, null, false, 12, null);
                            case 6:
                                copy8 = r14.copy((r20 & 1) != 0 ? r14.aspectRatio : Double.valueOf((double) IdentificationDocumentScannerStrategy.ISO_7810_ID_2_ASPECT_RATIO), (r20 & 2) != 0 ? r14.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? r14.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? r14.minimumSize : null, (r20 & 16) != 0 ? r14.blurVarianceThreshold : null, (r20 & 32) != 0 ? r14.faceRequired : false, (r20 & 64) != 0 ? r14.stringRequirements : null, (r20 & 128) != 0 ? r14.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS.enableManualImageHeuristics : false);
                                return new IdentificationDocumentScannerStrategy(true, copy8, null, false, 12, null);
                            default:
                                return null;
                        }
                    } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("IT"))) {
                        if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 1) {
                            return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                        }
                        return null;
                    } else {
                        String country2 = Locale.US.getCountry();
                        Intrinsics.checkNotNullExpressionValue(country2, "US.country");
                        if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction(country2))) {
                            if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 2) {
                                IdentificationDocumentDetectionParameters identificationDocumentDetectionParameters3 = IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS;
                                of4 = SetsKt__SetsJVMKt.setOf("LICENSE");
                                listOf3 = CollectionsKt__CollectionsJVMKt.listOf(new IdentificationDocumentStringsRequirements("en", of4, true, null, true));
                                copy5 = identificationDocumentDetectionParameters3.copy((r20 & 1) != 0 ? identificationDocumentDetectionParameters3.aspectRatio : null, (r20 & 2) != 0 ? identificationDocumentDetectionParameters3.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? identificationDocumentDetectionParameters3.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? identificationDocumentDetectionParameters3.minimumSize : null, (r20 & 16) != 0 ? identificationDocumentDetectionParameters3.blurVarianceThreshold : null, (r20 & 32) != 0 ? identificationDocumentDetectionParameters3.faceRequired : false, (r20 & 64) != 0 ? identificationDocumentDetectionParameters3.stringRequirements : listOf3, (r20 & 128) != 0 ? identificationDocumentDetectionParameters3.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? identificationDocumentDetectionParameters3.enableManualImageHeuristics : false);
                                return new IdentificationDocumentScannerStrategy(true, copy5, null, false, 12, null);
                            }
                            return null;
                        }
                        String country3 = Locale.UK.getCountry();
                        Intrinsics.checkNotNullExpressionValue(country3, "UK.country");
                        if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction(country3))) {
                            int i7 = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        if (i7 == 5) {
                                            copy3 = r21.copy((r20 & 1) != 0 ? r21.aspectRatio : Double.valueOf((double) IdentificationDocumentScannerStrategy.ISO_7810_ID_3_ASPECT_RATIO), (r20 & 2) != 0 ? r21.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? r21.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? r21.minimumSize : null, (r20 & 16) != 0 ? r21.blurVarianceThreshold : null, (r20 & 32) != 0 ? r21.faceRequired : false, (r20 & 64) != 0 ? r21.stringRequirements : null, (r20 & 128) != 0 ? r21.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS.enableManualImageHeuristics : false);
                                            return new IdentificationDocumentScannerStrategy(true, copy3, null, false, 12, null);
                                        } else if (i7 != 6) {
                                            return null;
                                        } else {
                                            copy4 = r14.copy((r20 & 1) != 0 ? r14.aspectRatio : Double.valueOf((double) IdentificationDocumentScannerStrategy.ISO_7810_ID_3_ASPECT_RATIO), (r20 & 2) != 0 ? r14.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? r14.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? r14.minimumSize : null, (r20 & 16) != 0 ? r14.blurVarianceThreshold : null, (r20 & 32) != 0 ? r14.faceRequired : false, (r20 & 64) != 0 ? r14.stringRequirements : null, (r20 & 128) != 0 ? r14.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS.enableManualImageHeuristics : false);
                                            return new IdentificationDocumentScannerStrategy(true, copy4, null, false, 12, null);
                                        }
                                    }
                                    return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                                }
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            }
                            return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                        } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("IL"))) {
                            int i8 = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                            if (i8 == 1) {
                                IdentificationDocumentDetectionParameters identificationDocumentDetectionParameters4 = IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS;
                                of = SetsKt__SetsKt.setOf((Object[]) new String[]{"יִשְׂרָאֵל\u200e", "ישראל"});
                                of2 = SetsKt__SetsJVMKt.setOf("ISRAEL");
                                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new IdentificationDocumentStringsRequirements[]{new IdentificationDocumentStringsRequirements("he", of, false, 1, false), new IdentificationDocumentStringsRequirements("en", of2, true, null, false)});
                                copy = identificationDocumentDetectionParameters4.copy((r20 & 1) != 0 ? identificationDocumentDetectionParameters4.aspectRatio : null, (r20 & 2) != 0 ? identificationDocumentDetectionParameters4.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? identificationDocumentDetectionParameters4.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? identificationDocumentDetectionParameters4.minimumSize : null, (r20 & 16) != 0 ? identificationDocumentDetectionParameters4.blurVarianceThreshold : null, (r20 & 32) != 0 ? identificationDocumentDetectionParameters4.faceRequired : false, (r20 & 64) != 0 ? identificationDocumentDetectionParameters4.stringRequirements : listOf, (r20 & 128) != 0 ? identificationDocumentDetectionParameters4.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? identificationDocumentDetectionParameters4.enableManualImageHeuristics : false);
                                return new IdentificationDocumentScannerStrategy(true, copy, null, false, 12, null);
                            } else if (i8 != 2) {
                                return null;
                            } else {
                                IdentificationDocumentDetectionParameters identificationDocumentDetectionParameters5 = IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS;
                                of3 = SetsKt__SetsKt.setOf((Object[]) new String[]{"LICENCE", "ISRAEL"});
                                listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new IdentificationDocumentStringsRequirements("en", of3, true, null, true));
                                copy2 = identificationDocumentDetectionParameters5.copy((r20 & 1) != 0 ? identificationDocumentDetectionParameters5.aspectRatio : null, (r20 & 2) != 0 ? identificationDocumentDetectionParameters5.aspectRatioTolerancePercent : null, (r20 & 4) != 0 ? identificationDocumentDetectionParameters5.quadratureToleranceDegrees : null, (r20 & 8) != 0 ? identificationDocumentDetectionParameters5.minimumSize : null, (r20 & 16) != 0 ? identificationDocumentDetectionParameters5.blurVarianceThreshold : null, (r20 & 32) != 0 ? identificationDocumentDetectionParameters5.faceRequired : false, (r20 & 64) != 0 ? identificationDocumentDetectionParameters5.stringRequirements : listOf2, (r20 & 128) != 0 ? identificationDocumentDetectionParameters5.minLandmarkWidthRatio : null, (r20 & 256) != 0 ? identificationDocumentDetectionParameters5.enableManualImageHeuristics : false);
                                return new IdentificationDocumentScannerStrategy(true, copy2, null, false, 12, null);
                            }
                        } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("IT"))) {
                            if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 2) {
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            }
                            return null;
                        } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("NL"))) {
                            int i9 = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                            if (i9 != 1) {
                                if (i9 != 2) {
                                    return null;
                                }
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            }
                            return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                        } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("NO"))) {
                            if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 2) {
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            }
                            return null;
                        } else if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("NZ"))) {
                            if (WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 2) {
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            }
                            return null;
                        } else if (!Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("PL"))) {
                            if (Intrinsics.areEqual(jurisdiction2, new IdentificationCountryJurisdiction("SE")) && WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()] == 2) {
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            }
                            return null;
                        } else {
                            int i10 = WhenMappings.$EnumSwitchMapping$0[identificationDocumentDescriptor.getDocumentType().ordinal()];
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    return null;
                                }
                                return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                            }
                            return new IdentificationDocumentScannerStrategy(true, IdentificationDocumentScannerStrategy.STANDARD_DETECTION_PARAMETERS, null, false, 12, null);
                        }
                    }
                }
            }
            return new IdentificationDocumentScannerStrategy(false, IdentificationDocumentScannerStrategy.STANDARD_SELFIE_DETECTION_PARAMETERS, null, false, 12, null);
        }
    }

    public IdentificationDocumentScannerStrategy(boolean z, IdentificationDocumentDetectionParameters detectionParameters, Double d, boolean z2) {
        Intrinsics.checkNotNullParameter(detectionParameters, "detectionParameters");
        this.enableAutoDetect = z;
        this.detectionParameters = detectionParameters;
        this.minLandmarkWidthRatio = d;
        this.enableManualImageHeuristics = z2;
    }

    public static /* synthetic */ IdentificationDocumentScannerStrategy copy$default(IdentificationDocumentScannerStrategy identificationDocumentScannerStrategy, boolean z, IdentificationDocumentDetectionParameters identificationDocumentDetectionParameters, Double d, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = identificationDocumentScannerStrategy.enableAutoDetect;
        }
        if ((i & 2) != 0) {
            identificationDocumentDetectionParameters = identificationDocumentScannerStrategy.detectionParameters;
        }
        if ((i & 4) != 0) {
            d = identificationDocumentScannerStrategy.minLandmarkWidthRatio;
        }
        if ((i & 8) != 0) {
            z2 = identificationDocumentScannerStrategy.enableManualImageHeuristics;
        }
        return identificationDocumentScannerStrategy.copy(z, identificationDocumentDetectionParameters, d, z2);
    }

    public final boolean component1() {
        return this.enableAutoDetect;
    }

    public final IdentificationDocumentDetectionParameters component2() {
        return this.detectionParameters;
    }

    public final Double component3() {
        return this.minLandmarkWidthRatio;
    }

    public final boolean component4() {
        return this.enableManualImageHeuristics;
    }

    public final IdentificationDocumentScannerStrategy copy(boolean z, IdentificationDocumentDetectionParameters detectionParameters, Double d, boolean z2) {
        Intrinsics.checkNotNullParameter(detectionParameters, "detectionParameters");
        return new IdentificationDocumentScannerStrategy(z, detectionParameters, d, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationDocumentScannerStrategy) {
            IdentificationDocumentScannerStrategy identificationDocumentScannerStrategy = (IdentificationDocumentScannerStrategy) obj;
            return this.enableAutoDetect == identificationDocumentScannerStrategy.enableAutoDetect && Intrinsics.areEqual(this.detectionParameters, identificationDocumentScannerStrategy.detectionParameters) && Intrinsics.areEqual((Object) this.minLandmarkWidthRatio, (Object) identificationDocumentScannerStrategy.minLandmarkWidthRatio) && this.enableManualImageHeuristics == identificationDocumentScannerStrategy.enableManualImageHeuristics;
        }
        return false;
    }

    public final IdentificationDocumentDetectionParameters getDetectionParameters() {
        return this.detectionParameters;
    }

    public final boolean getEnableAutoDetect() {
        return this.enableAutoDetect;
    }

    public final boolean getEnableManualImageHeuristics() {
        return this.enableManualImageHeuristics;
    }

    public final Double getMinLandmarkWidthRatio() {
        return this.minLandmarkWidthRatio;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.enableAutoDetect;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.detectionParameters.hashCode()) * 31;
        Double d = this.minLandmarkWidthRatio;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        boolean z2 = this.enableManualImageHeuristics;
        return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enableAutoDetect;
        IdentificationDocumentDetectionParameters identificationDocumentDetectionParameters = this.detectionParameters;
        Double d = this.minLandmarkWidthRatio;
        boolean z2 = this.enableManualImageHeuristics;
        return "IdentificationDocumentScannerStrategy(enableAutoDetect=" + z + ", detectionParameters=" + identificationDocumentDetectionParameters + ", minLandmarkWidthRatio=" + d + ", enableManualImageHeuristics=" + z2 + ")";
    }

    public /* synthetic */ IdentificationDocumentScannerStrategy(boolean z, IdentificationDocumentDetectionParameters identificationDocumentDetectionParameters, Double d, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, identificationDocumentDetectionParameters, (i & 4) != 0 ? null : d, (i & 8) != 0 ? false : z2);
    }
}
