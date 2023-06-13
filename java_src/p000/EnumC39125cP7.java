package p000;

import com.google.android.gms.common.internal.ShowFirstParty;
@ShowFirstParty
/* renamed from: cP7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC39125cP7 {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    ILLEGAL_ARGUMENT("IllegalArgument"),
    BAD_AUTHENTICATION("BadAuthentication"),
    BAD_TOKEN_REQUEST("BAD_REQUEST"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    CHALLENGE_REQUIRED("ChallengeRequired"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_SCREENLOCK_REQUIRED("DeviceManagementScreenlockRequired"),
    DM_REQUIRED("DeviceManagementRequired"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError"),
    AUTH_SECURITY_ERROR("AuthSecurityError");
    

    /* renamed from: b */
    public final String f60609b;

    EnumC39125cP7(String str) {
        this.f60609b = str;
    }

    /* renamed from: a */
    public static final EnumC39125cP7 m61423a(String str) {
        EnumC39125cP7[] values;
        EnumC39125cP7 enumC39125cP7 = UNKNOWN;
        for (EnumC39125cP7 enumC39125cP72 : values()) {
            if (true == enumC39125cP72.f60609b.equals(str)) {
                enumC39125cP7 = enumC39125cP72;
            }
        }
        return enumC39125cP7;
    }

    @ShowFirstParty
    /* renamed from: b */
    public static boolean m61422b(EnumC39125cP7 enumC39125cP7) {
        if (!BAD_AUTHENTICATION.equals(enumC39125cP7) && !CAPTCHA.equals(enumC39125cP7) && !NEED_PERMISSION.equals(enumC39125cP7) && !NEED_REMOTE_CONSENT.equals(enumC39125cP7) && !NEEDS_BROWSER.equals(enumC39125cP7) && !USER_CANCEL.equals(enumC39125cP7) && !DEVICE_MANAGEMENT_REQUIRED.equals(enumC39125cP7) && !DM_INTERNAL_ERROR.equals(enumC39125cP7) && !DM_SYNC_DISABLED.equals(enumC39125cP7) && !DM_ADMIN_BLOCKED.equals(enumC39125cP7) && !DM_ADMIN_PENDING_APPROVAL.equals(enumC39125cP7) && !DM_STALE_SYNC_REQUIRED.equals(enumC39125cP7) && !DM_DEACTIVATED.equals(enumC39125cP7) && !DM_REQUIRED.equals(enumC39125cP7) && !THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(enumC39125cP7) && !DM_SCREENLOCK_REQUIRED.equals(enumC39125cP7)) {
            return false;
        }
        return true;
    }
}
