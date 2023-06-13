package com.google.firebase.crashlytics.internal.model;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.networking.FraudDetectionData;
import java.io.IOException;
/* loaded from: classes6.dex */
public final class AutoCrashlyticsReportEncoder implements InterfaceC32990Fx0 {
    public static final int CODEGEN_VERSION = 2;
    public static final InterfaceC32990Fx0 CONFIG = new AutoCrashlyticsReportEncoder();

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements InterfaceC34919Od3<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {
        static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder INSTANCE = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();
        private static final C35916Sk1 ARCH_DESCRIPTOR = C35916Sk1.m84927d("arch");
        private static final C35916Sk1 LIBRARYNAME_DESCRIPTOR = C35916Sk1.m84927d("libraryName");
        private static final C35916Sk1 BUILDID_DESCRIPTOR = C35916Sk1.m84927d("buildId");

        private CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(ARCH_DESCRIPTOR, buildIdMappingForArch.getArch());
            interfaceC35153Pd3.mo23527f(LIBRARYNAME_DESCRIPTOR, buildIdMappingForArch.getLibraryName());
            interfaceC35153Pd3.mo23527f(BUILDID_DESCRIPTOR, buildIdMappingForArch.getBuildId());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportApplicationExitInfoEncoder implements InterfaceC34919Od3<CrashlyticsReport.ApplicationExitInfo> {
        static final CrashlyticsReportApplicationExitInfoEncoder INSTANCE = new CrashlyticsReportApplicationExitInfoEncoder();
        private static final C35916Sk1 PID_DESCRIPTOR = C35916Sk1.m84927d("pid");
        private static final C35916Sk1 PROCESSNAME_DESCRIPTOR = C35916Sk1.m84927d("processName");
        private static final C35916Sk1 REASONCODE_DESCRIPTOR = C35916Sk1.m84927d("reasonCode");
        private static final C35916Sk1 IMPORTANCE_DESCRIPTOR = C35916Sk1.m84927d("importance");
        private static final C35916Sk1 PSS_DESCRIPTOR = C35916Sk1.m84927d("pss");
        private static final C35916Sk1 RSS_DESCRIPTOR = C35916Sk1.m84927d("rss");
        private static final C35916Sk1 TIMESTAMP_DESCRIPTOR = C35916Sk1.m84927d(FraudDetectionData.KEY_TIMESTAMP);
        private static final C35916Sk1 TRACEFILE_DESCRIPTOR = C35916Sk1.m84927d("traceFile");
        private static final C35916Sk1 BUILDIDMAPPINGFORARCH_DESCRIPTOR = C35916Sk1.m84927d("buildIdMappingForArch");

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23529d(PID_DESCRIPTOR, applicationExitInfo.getPid());
            interfaceC35153Pd3.mo23527f(PROCESSNAME_DESCRIPTOR, applicationExitInfo.getProcessName());
            interfaceC35153Pd3.mo23529d(REASONCODE_DESCRIPTOR, applicationExitInfo.getReasonCode());
            interfaceC35153Pd3.mo23529d(IMPORTANCE_DESCRIPTOR, applicationExitInfo.getImportance());
            interfaceC35153Pd3.mo23528e(PSS_DESCRIPTOR, applicationExitInfo.getPss());
            interfaceC35153Pd3.mo23528e(RSS_DESCRIPTOR, applicationExitInfo.getRss());
            interfaceC35153Pd3.mo23528e(TIMESTAMP_DESCRIPTOR, applicationExitInfo.getTimestamp());
            interfaceC35153Pd3.mo23527f(TRACEFILE_DESCRIPTOR, applicationExitInfo.getTraceFile());
            interfaceC35153Pd3.mo23527f(BUILDIDMAPPINGFORARCH_DESCRIPTOR, applicationExitInfo.getBuildIdMappingForArch());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportCustomAttributeEncoder implements InterfaceC34919Od3<CrashlyticsReport.CustomAttribute> {
        static final CrashlyticsReportCustomAttributeEncoder INSTANCE = new CrashlyticsReportCustomAttributeEncoder();
        private static final C35916Sk1 KEY_DESCRIPTOR = C35916Sk1.m84927d("key");
        private static final C35916Sk1 VALUE_DESCRIPTOR = C35916Sk1.m84927d("value");

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.CustomAttribute customAttribute, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(KEY_DESCRIPTOR, customAttribute.getKey());
            interfaceC35153Pd3.mo23527f(VALUE_DESCRIPTOR, customAttribute.getValue());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportEncoder implements InterfaceC34919Od3<CrashlyticsReport> {
        static final CrashlyticsReportEncoder INSTANCE = new CrashlyticsReportEncoder();
        private static final C35916Sk1 SDKVERSION_DESCRIPTOR = C35916Sk1.m84927d("sdkVersion");
        private static final C35916Sk1 GMPAPPID_DESCRIPTOR = C35916Sk1.m84927d("gmpAppId");
        private static final C35916Sk1 PLATFORM_DESCRIPTOR = C35916Sk1.m84927d("platform");
        private static final C35916Sk1 INSTALLATIONUUID_DESCRIPTOR = C35916Sk1.m84927d("installationUuid");
        private static final C35916Sk1 BUILDVERSION_DESCRIPTOR = C35916Sk1.m84927d("buildVersion");
        private static final C35916Sk1 DISPLAYVERSION_DESCRIPTOR = C35916Sk1.m84927d("displayVersion");
        private static final C35916Sk1 SESSION_DESCRIPTOR = C35916Sk1.m84927d("session");
        private static final C35916Sk1 NDKPAYLOAD_DESCRIPTOR = C35916Sk1.m84927d("ndkPayload");
        private static final C35916Sk1 APPEXITINFO_DESCRIPTOR = C35916Sk1.m84927d("appExitInfo");

        private CrashlyticsReportEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport crashlyticsReport, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(SDKVERSION_DESCRIPTOR, crashlyticsReport.getSdkVersion());
            interfaceC35153Pd3.mo23527f(GMPAPPID_DESCRIPTOR, crashlyticsReport.getGmpAppId());
            interfaceC35153Pd3.mo23529d(PLATFORM_DESCRIPTOR, crashlyticsReport.getPlatform());
            interfaceC35153Pd3.mo23527f(INSTALLATIONUUID_DESCRIPTOR, crashlyticsReport.getInstallationUuid());
            interfaceC35153Pd3.mo23527f(BUILDVERSION_DESCRIPTOR, crashlyticsReport.getBuildVersion());
            interfaceC35153Pd3.mo23527f(DISPLAYVERSION_DESCRIPTOR, crashlyticsReport.getDisplayVersion());
            interfaceC35153Pd3.mo23527f(SESSION_DESCRIPTOR, crashlyticsReport.getSession());
            interfaceC35153Pd3.mo23527f(NDKPAYLOAD_DESCRIPTOR, crashlyticsReport.getNdkPayload());
            interfaceC35153Pd3.mo23527f(APPEXITINFO_DESCRIPTOR, crashlyticsReport.getAppExitInfo());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportFilesPayloadEncoder implements InterfaceC34919Od3<CrashlyticsReport.FilesPayload> {
        static final CrashlyticsReportFilesPayloadEncoder INSTANCE = new CrashlyticsReportFilesPayloadEncoder();
        private static final C35916Sk1 FILES_DESCRIPTOR = C35916Sk1.m84927d("files");
        private static final C35916Sk1 ORGID_DESCRIPTOR = C35916Sk1.m84927d("orgId");

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.FilesPayload filesPayload, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(FILES_DESCRIPTOR, filesPayload.getFiles());
            interfaceC35153Pd3.mo23527f(ORGID_DESCRIPTOR, filesPayload.getOrgId());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportFilesPayloadFileEncoder implements InterfaceC34919Od3<CrashlyticsReport.FilesPayload.File> {
        static final CrashlyticsReportFilesPayloadFileEncoder INSTANCE = new CrashlyticsReportFilesPayloadFileEncoder();
        private static final C35916Sk1 FILENAME_DESCRIPTOR = C35916Sk1.m84927d("filename");
        private static final C35916Sk1 CONTENTS_DESCRIPTOR = C35916Sk1.m84927d("contents");

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.FilesPayload.File file, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(FILENAME_DESCRIPTOR, file.getFilename());
            interfaceC35153Pd3.mo23527f(CONTENTS_DESCRIPTOR, file.getContents());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionApplicationEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Application> {
        static final CrashlyticsReportSessionApplicationEncoder INSTANCE = new CrashlyticsReportSessionApplicationEncoder();
        private static final C35916Sk1 IDENTIFIER_DESCRIPTOR = C35916Sk1.m84927d("identifier");
        private static final C35916Sk1 VERSION_DESCRIPTOR = C35916Sk1.m84927d("version");
        private static final C35916Sk1 DISPLAYVERSION_DESCRIPTOR = C35916Sk1.m84927d("displayVersion");
        private static final C35916Sk1 ORGANIZATION_DESCRIPTOR = C35916Sk1.m84927d("organization");
        private static final C35916Sk1 INSTALLATIONUUID_DESCRIPTOR = C35916Sk1.m84927d("installationUuid");
        private static final C35916Sk1 DEVELOPMENTPLATFORM_DESCRIPTOR = C35916Sk1.m84927d("developmentPlatform");
        private static final C35916Sk1 DEVELOPMENTPLATFORMVERSION_DESCRIPTOR = C35916Sk1.m84927d("developmentPlatformVersion");

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Application application, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(IDENTIFIER_DESCRIPTOR, application.getIdentifier());
            interfaceC35153Pd3.mo23527f(VERSION_DESCRIPTOR, application.getVersion());
            interfaceC35153Pd3.mo23527f(DISPLAYVERSION_DESCRIPTOR, application.getDisplayVersion());
            interfaceC35153Pd3.mo23527f(ORGANIZATION_DESCRIPTOR, application.getOrganization());
            interfaceC35153Pd3.mo23527f(INSTALLATIONUUID_DESCRIPTOR, application.getInstallationUuid());
            interfaceC35153Pd3.mo23527f(DEVELOPMENTPLATFORM_DESCRIPTOR, application.getDevelopmentPlatform());
            interfaceC35153Pd3.mo23527f(DEVELOPMENTPLATFORMVERSION_DESCRIPTOR, application.getDevelopmentPlatformVersion());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Application.Organization> {
        static final CrashlyticsReportSessionApplicationOrganizationEncoder INSTANCE = new CrashlyticsReportSessionApplicationOrganizationEncoder();
        private static final C35916Sk1 CLSID_DESCRIPTOR = C35916Sk1.m84927d("clsId");

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Application.Organization organization, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(CLSID_DESCRIPTOR, organization.getClsId());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionDeviceEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Device> {
        static final CrashlyticsReportSessionDeviceEncoder INSTANCE = new CrashlyticsReportSessionDeviceEncoder();
        private static final C35916Sk1 ARCH_DESCRIPTOR = C35916Sk1.m84927d("arch");
        private static final C35916Sk1 MODEL_DESCRIPTOR = C35916Sk1.m84927d(RequestHeadersFactory.MODEL);
        private static final C35916Sk1 CORES_DESCRIPTOR = C35916Sk1.m84927d("cores");
        private static final C35916Sk1 RAM_DESCRIPTOR = C35916Sk1.m84927d("ram");
        private static final C35916Sk1 DISKSPACE_DESCRIPTOR = C35916Sk1.m84927d("diskSpace");
        private static final C35916Sk1 SIMULATOR_DESCRIPTOR = C35916Sk1.m84927d("simulator");
        private static final C35916Sk1 STATE_DESCRIPTOR = C35916Sk1.m84927d(TransferTable.COLUMN_STATE);
        private static final C35916Sk1 MANUFACTURER_DESCRIPTOR = C35916Sk1.m84927d("manufacturer");
        private static final C35916Sk1 MODELCLASS_DESCRIPTOR = C35916Sk1.m84927d("modelClass");

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Device device, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23529d(ARCH_DESCRIPTOR, device.getArch());
            interfaceC35153Pd3.mo23527f(MODEL_DESCRIPTOR, device.getModel());
            interfaceC35153Pd3.mo23529d(CORES_DESCRIPTOR, device.getCores());
            interfaceC35153Pd3.mo23528e(RAM_DESCRIPTOR, device.getRam());
            interfaceC35153Pd3.mo23528e(DISKSPACE_DESCRIPTOR, device.getDiskSpace());
            interfaceC35153Pd3.mo23530c(SIMULATOR_DESCRIPTOR, device.isSimulator());
            interfaceC35153Pd3.mo23529d(STATE_DESCRIPTOR, device.getState());
            interfaceC35153Pd3.mo23527f(MANUFACTURER_DESCRIPTOR, device.getManufacturer());
            interfaceC35153Pd3.mo23527f(MODELCLASS_DESCRIPTOR, device.getModelClass());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session> {
        static final CrashlyticsReportSessionEncoder INSTANCE = new CrashlyticsReportSessionEncoder();
        private static final C35916Sk1 GENERATOR_DESCRIPTOR = C35916Sk1.m84927d("generator");
        private static final C35916Sk1 IDENTIFIER_DESCRIPTOR = C35916Sk1.m84927d("identifier");
        private static final C35916Sk1 STARTEDAT_DESCRIPTOR = C35916Sk1.m84927d("startedAt");
        private static final C35916Sk1 ENDEDAT_DESCRIPTOR = C35916Sk1.m84927d("endedAt");
        private static final C35916Sk1 CRASHED_DESCRIPTOR = C35916Sk1.m84927d("crashed");
        private static final C35916Sk1 APP_DESCRIPTOR = C35916Sk1.m84927d(Stripe3ds2AuthParams.FIELD_APP);
        private static final C35916Sk1 USER_DESCRIPTOR = C35916Sk1.m84927d("user");
        private static final C35916Sk1 OS_DESCRIPTOR = C35916Sk1.m84927d("os");
        private static final C35916Sk1 DEVICE_DESCRIPTOR = C35916Sk1.m84927d("device");
        private static final C35916Sk1 EVENTS_DESCRIPTOR = C35916Sk1.m84927d("events");
        private static final C35916Sk1 GENERATORTYPE_DESCRIPTOR = C35916Sk1.m84927d("generatorType");

        private CrashlyticsReportSessionEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session session, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(GENERATOR_DESCRIPTOR, session.getGenerator());
            interfaceC35153Pd3.mo23527f(IDENTIFIER_DESCRIPTOR, session.getIdentifierUtf8Bytes());
            interfaceC35153Pd3.mo23528e(STARTEDAT_DESCRIPTOR, session.getStartedAt());
            interfaceC35153Pd3.mo23527f(ENDEDAT_DESCRIPTOR, session.getEndedAt());
            interfaceC35153Pd3.mo23530c(CRASHED_DESCRIPTOR, session.isCrashed());
            interfaceC35153Pd3.mo23527f(APP_DESCRIPTOR, session.getApp());
            interfaceC35153Pd3.mo23527f(USER_DESCRIPTOR, session.getUser());
            interfaceC35153Pd3.mo23527f(OS_DESCRIPTOR, session.getOs());
            interfaceC35153Pd3.mo23527f(DEVICE_DESCRIPTOR, session.getDevice());
            interfaceC35153Pd3.mo23527f(EVENTS_DESCRIPTOR, session.getEvents());
            interfaceC35153Pd3.mo23529d(GENERATORTYPE_DESCRIPTOR, session.getGeneratorType());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionEventApplicationEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Event.Application> {
        static final CrashlyticsReportSessionEventApplicationEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationEncoder();
        private static final C35916Sk1 EXECUTION_DESCRIPTOR = C35916Sk1.m84927d("execution");
        private static final C35916Sk1 CUSTOMATTRIBUTES_DESCRIPTOR = C35916Sk1.m84927d("customAttributes");
        private static final C35916Sk1 INTERNALKEYS_DESCRIPTOR = C35916Sk1.m84927d("internalKeys");
        private static final C35916Sk1 BACKGROUND_DESCRIPTOR = C35916Sk1.m84927d("background");
        private static final C35916Sk1 UIORIENTATION_DESCRIPTOR = C35916Sk1.m84927d("uiOrientation");

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event.Application application, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(EXECUTION_DESCRIPTOR, application.getExecution());
            interfaceC35153Pd3.mo23527f(CUSTOMATTRIBUTES_DESCRIPTOR, application.getCustomAttributes());
            interfaceC35153Pd3.mo23527f(INTERNALKEYS_DESCRIPTOR, application.getInternalKeys());
            interfaceC35153Pd3.mo23527f(BACKGROUND_DESCRIPTOR, application.getBackground());
            interfaceC35153Pd3.mo23529d(UIORIENTATION_DESCRIPTOR, application.getUiOrientation());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder */
    /* loaded from: classes6.dex */
    public static final class C18294x99c932db implements InterfaceC34919Od3<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
        static final C18294x99c932db INSTANCE = new C18294x99c932db();
        private static final C35916Sk1 BASEADDRESS_DESCRIPTOR = C35916Sk1.m84927d("baseAddress");
        private static final C35916Sk1 SIZE_DESCRIPTOR = C35916Sk1.m84927d("size");
        private static final C35916Sk1 NAME_DESCRIPTOR = C35916Sk1.m84927d("name");
        private static final C35916Sk1 UUID_DESCRIPTOR = C35916Sk1.m84927d("uuid");

        private C18294x99c932db() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23528e(BASEADDRESS_DESCRIPTOR, binaryImage.getBaseAddress());
            interfaceC35153Pd3.mo23528e(SIZE_DESCRIPTOR, binaryImage.getSize());
            interfaceC35153Pd3.mo23527f(NAME_DESCRIPTOR, binaryImage.getName());
            interfaceC35153Pd3.mo23527f(UUID_DESCRIPTOR, binaryImage.getUuidUtf8Bytes());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Event.Application.Execution> {
        static final CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionEncoder();
        private static final C35916Sk1 THREADS_DESCRIPTOR = C35916Sk1.m84927d("threads");
        private static final C35916Sk1 EXCEPTION_DESCRIPTOR = C35916Sk1.m84927d("exception");
        private static final C35916Sk1 APPEXITINFO_DESCRIPTOR = C35916Sk1.m84927d("appExitInfo");
        private static final C35916Sk1 SIGNAL_DESCRIPTOR = C35916Sk1.m84927d("signal");
        private static final C35916Sk1 BINARIES_DESCRIPTOR = C35916Sk1.m84927d("binaries");

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event.Application.Execution execution, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(THREADS_DESCRIPTOR, execution.getThreads());
            interfaceC35153Pd3.mo23527f(EXCEPTION_DESCRIPTOR, execution.getException());
            interfaceC35153Pd3.mo23527f(APPEXITINFO_DESCRIPTOR, execution.getAppExitInfo());
            interfaceC35153Pd3.mo23527f(SIGNAL_DESCRIPTOR, execution.getSignal());
            interfaceC35153Pd3.mo23527f(BINARIES_DESCRIPTOR, execution.getBinaries());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder */
    /* loaded from: classes6.dex */
    public static final class C18295x55689506 implements InterfaceC34919Od3<CrashlyticsReport.Session.Event.Application.Execution.Exception> {
        static final C18295x55689506 INSTANCE = new C18295x55689506();
        private static final C35916Sk1 TYPE_DESCRIPTOR = C35916Sk1.m84927d("type");
        private static final C35916Sk1 REASON_DESCRIPTOR = C35916Sk1.m84927d("reason");
        private static final C35916Sk1 FRAMES_DESCRIPTOR = C35916Sk1.m84927d("frames");
        private static final C35916Sk1 CAUSEDBY_DESCRIPTOR = C35916Sk1.m84927d("causedBy");
        private static final C35916Sk1 OVERFLOWCOUNT_DESCRIPTOR = C35916Sk1.m84927d("overflowCount");

        private C18295x55689506() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(TYPE_DESCRIPTOR, exception.getType());
            interfaceC35153Pd3.mo23527f(REASON_DESCRIPTOR, exception.getReason());
            interfaceC35153Pd3.mo23527f(FRAMES_DESCRIPTOR, exception.getFrames());
            interfaceC35153Pd3.mo23527f(CAUSEDBY_DESCRIPTOR, exception.getCausedBy());
            interfaceC35153Pd3.mo23529d(OVERFLOWCOUNT_DESCRIPTOR, exception.getOverflowCount());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Event.Application.Execution.Signal> {
        static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();
        private static final C35916Sk1 NAME_DESCRIPTOR = C35916Sk1.m84927d("name");
        private static final C35916Sk1 CODE_DESCRIPTOR = C35916Sk1.m84927d(PaymentMethodOptionsParams.Blik.PARAM_CODE);
        private static final C35916Sk1 ADDRESS_DESCRIPTOR = C35916Sk1.m84927d(PaymentMethod.BillingDetails.PARAM_ADDRESS);

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(NAME_DESCRIPTOR, signal.getName());
            interfaceC35153Pd3.mo23527f(CODE_DESCRIPTOR, signal.getCode());
            interfaceC35153Pd3.mo23528e(ADDRESS_DESCRIPTOR, signal.getAddress());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();
        private static final C35916Sk1 NAME_DESCRIPTOR = C35916Sk1.m84927d("name");
        private static final C35916Sk1 IMPORTANCE_DESCRIPTOR = C35916Sk1.m84927d("importance");
        private static final C35916Sk1 FRAMES_DESCRIPTOR = C35916Sk1.m84927d("frames");

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(NAME_DESCRIPTOR, thread.getName());
            interfaceC35153Pd3.mo23529d(IMPORTANCE_DESCRIPTOR, thread.getImportance());
            interfaceC35153Pd3.mo23527f(FRAMES_DESCRIPTOR, thread.getFrames());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder */
    /* loaded from: classes6.dex */
    public static final class C18296xc3999712 implements InterfaceC34919Od3<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        static final C18296xc3999712 INSTANCE = new C18296xc3999712();
        private static final C35916Sk1 PC_DESCRIPTOR = C35916Sk1.m84927d("pc");
        private static final C35916Sk1 SYMBOL_DESCRIPTOR = C35916Sk1.m84927d("symbol");
        private static final C35916Sk1 FILE_DESCRIPTOR = C35916Sk1.m84927d("file");
        private static final C35916Sk1 OFFSET_DESCRIPTOR = C35916Sk1.m84927d("offset");
        private static final C35916Sk1 IMPORTANCE_DESCRIPTOR = C35916Sk1.m84927d("importance");

        private C18296xc3999712() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23528e(PC_DESCRIPTOR, frame.getPc());
            interfaceC35153Pd3.mo23527f(SYMBOL_DESCRIPTOR, frame.getSymbol());
            interfaceC35153Pd3.mo23527f(FILE_DESCRIPTOR, frame.getFile());
            interfaceC35153Pd3.mo23528e(OFFSET_DESCRIPTOR, frame.getOffset());
            interfaceC35153Pd3.mo23529d(IMPORTANCE_DESCRIPTOR, frame.getImportance());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionEventDeviceEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Event.Device> {
        static final CrashlyticsReportSessionEventDeviceEncoder INSTANCE = new CrashlyticsReportSessionEventDeviceEncoder();
        private static final C35916Sk1 BATTERYLEVEL_DESCRIPTOR = C35916Sk1.m84927d("batteryLevel");
        private static final C35916Sk1 BATTERYVELOCITY_DESCRIPTOR = C35916Sk1.m84927d("batteryVelocity");
        private static final C35916Sk1 PROXIMITYON_DESCRIPTOR = C35916Sk1.m84927d("proximityOn");
        private static final C35916Sk1 ORIENTATION_DESCRIPTOR = C35916Sk1.m84927d("orientation");
        private static final C35916Sk1 RAMUSED_DESCRIPTOR = C35916Sk1.m84927d("ramUsed");
        private static final C35916Sk1 DISKUSED_DESCRIPTOR = C35916Sk1.m84927d("diskUsed");

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event.Device device, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(BATTERYLEVEL_DESCRIPTOR, device.getBatteryLevel());
            interfaceC35153Pd3.mo23529d(BATTERYVELOCITY_DESCRIPTOR, device.getBatteryVelocity());
            interfaceC35153Pd3.mo23530c(PROXIMITYON_DESCRIPTOR, device.isProximityOn());
            interfaceC35153Pd3.mo23529d(ORIENTATION_DESCRIPTOR, device.getOrientation());
            interfaceC35153Pd3.mo23528e(RAMUSED_DESCRIPTOR, device.getRamUsed());
            interfaceC35153Pd3.mo23528e(DISKUSED_DESCRIPTOR, device.getDiskUsed());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionEventEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Event> {
        static final CrashlyticsReportSessionEventEncoder INSTANCE = new CrashlyticsReportSessionEventEncoder();
        private static final C35916Sk1 TIMESTAMP_DESCRIPTOR = C35916Sk1.m84927d(FraudDetectionData.KEY_TIMESTAMP);
        private static final C35916Sk1 TYPE_DESCRIPTOR = C35916Sk1.m84927d("type");
        private static final C35916Sk1 APP_DESCRIPTOR = C35916Sk1.m84927d(Stripe3ds2AuthParams.FIELD_APP);
        private static final C35916Sk1 DEVICE_DESCRIPTOR = C35916Sk1.m84927d("device");
        private static final C35916Sk1 LOG_DESCRIPTOR = C35916Sk1.m84927d("log");

        private CrashlyticsReportSessionEventEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event event, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23528e(TIMESTAMP_DESCRIPTOR, event.getTimestamp());
            interfaceC35153Pd3.mo23527f(TYPE_DESCRIPTOR, event.getType());
            interfaceC35153Pd3.mo23527f(APP_DESCRIPTOR, event.getApp());
            interfaceC35153Pd3.mo23527f(DEVICE_DESCRIPTOR, event.getDevice());
            interfaceC35153Pd3.mo23527f(LOG_DESCRIPTOR, event.getLog());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionEventLogEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.Event.Log> {
        static final CrashlyticsReportSessionEventLogEncoder INSTANCE = new CrashlyticsReportSessionEventLogEncoder();
        private static final C35916Sk1 CONTENT_DESCRIPTOR = C35916Sk1.m84927d("content");

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.Event.Log log, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(CONTENT_DESCRIPTOR, log.getContent());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionOperatingSystemEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.OperatingSystem> {
        static final CrashlyticsReportSessionOperatingSystemEncoder INSTANCE = new CrashlyticsReportSessionOperatingSystemEncoder();
        private static final C35916Sk1 PLATFORM_DESCRIPTOR = C35916Sk1.m84927d("platform");
        private static final C35916Sk1 VERSION_DESCRIPTOR = C35916Sk1.m84927d("version");
        private static final C35916Sk1 BUILDVERSION_DESCRIPTOR = C35916Sk1.m84927d("buildVersion");
        private static final C35916Sk1 JAILBROKEN_DESCRIPTOR = C35916Sk1.m84927d("jailbroken");

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23529d(PLATFORM_DESCRIPTOR, operatingSystem.getPlatform());
            interfaceC35153Pd3.mo23527f(VERSION_DESCRIPTOR, operatingSystem.getVersion());
            interfaceC35153Pd3.mo23527f(BUILDVERSION_DESCRIPTOR, operatingSystem.getBuildVersion());
            interfaceC35153Pd3.mo23530c(JAILBROKEN_DESCRIPTOR, operatingSystem.isJailbroken());
        }
    }

    /* loaded from: classes6.dex */
    public static final class CrashlyticsReportSessionUserEncoder implements InterfaceC34919Od3<CrashlyticsReport.Session.User> {
        static final CrashlyticsReportSessionUserEncoder INSTANCE = new CrashlyticsReportSessionUserEncoder();
        private static final C35916Sk1 IDENTIFIER_DESCRIPTOR = C35916Sk1.m84927d("identifier");

        private CrashlyticsReportSessionUserEncoder() {
        }

        @Override // p000.InterfaceC45768nb1
        public void encode(CrashlyticsReport.Session.User user, InterfaceC35153Pd3 interfaceC35153Pd3) throws IOException {
            interfaceC35153Pd3.mo23527f(IDENTIFIER_DESCRIPTOR, user.getIdentifier());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // p000.InterfaceC32990Fx0
    public void configure(InterfaceC49325tb1<?> interfaceC49325tb1) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.class, crashlyticsReportEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        interfaceC49325tb1.mo12026a(C18317x7e3e3ebd.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        C18296xc3999712 c18296xc3999712 = C18296xc3999712.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, c18296xc3999712);
        interfaceC49325tb1.mo12026a(C18319xce3d994b.class, c18296xc3999712);
        C18295x55689506 c18295x55689506 = C18295x55689506.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, c18295x55689506);
        interfaceC49325tb1.mo12026a(C18313xc2f5febc.class, c18295x55689506);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        interfaceC49325tb1.mo12026a(C18299xb26d2aa8.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        interfaceC49325tb1.mo12026a(C18315x7c929f5b.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        C18294x99c932db c18294x99c932db = C18294x99c932db.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, c18294x99c932db);
        interfaceC49325tb1.mo12026a(C18311xfe724d07.class, c18294x99c932db);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.INSTANCE;
        interfaceC49325tb1.mo12026a(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        interfaceC49325tb1.mo12026a(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
