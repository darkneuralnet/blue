package zendesk.core;

import java.util.Map;
/* loaded from: classes8.dex */
class BlipsRequest {
    @InterfaceC41208ft5("appId")
    private String appId;
    private String channel;
    @InterfaceC41208ft5("pageView")
    private ApiPageView pageView;
    @InterfaceC41208ft5("schemaVersion")
    private String schemaVersion = "1";
    private String timestamp;
    private String url;
    @InterfaceC41208ft5("userAction")
    private ApiUserAction userAction;
    @InterfaceC41208ft5("userId")
    private Long userId;
    private String uuid;
    private String version;

    /* loaded from: classes8.dex */
    public static class ApiPageView {
        @InterfaceC41208ft5("navigatorLanguage")
        private String navigatorLanguage;
        @InterfaceC41208ft5("pageId")
        private Long pageId;
        @InterfaceC41208ft5("pageLocale")
        private String pageLocale;
        @InterfaceC41208ft5("pageTitle")
        private String pageTitle;
        private Map<String, Object> value;

        public ApiPageView(String str, String str2, Long l, String str3, Map<String, Object> map) {
            this.navigatorLanguage = str;
            this.pageTitle = str2;
            this.value = map;
            this.pageId = l;
            this.pageLocale = str3;
        }

        public String getNavigatorLanguage() {
            return this.navigatorLanguage;
        }

        public Long getPageId() {
            return this.pageId;
        }

        public String getPageLocale() {
            return this.pageLocale;
        }

        public String getPageTitle() {
            return this.pageTitle;
        }

        public Map<String, Object> getValue() {
            return this.value;
        }
    }

    /* loaded from: classes8.dex */
    public static class ApiUserAction {
        private String action;
        private String category;
        private String label;
        private Map<String, Object> value;

        public ApiUserAction(String str, String str2, String str3, Map<String, Object> map) {
            this.category = str;
            this.action = str2;
            this.label = str3;
            this.value = map;
        }

        public String getAction() {
            return this.action;
        }

        public String getCategory() {
            return this.category;
        }

        public String getLabel() {
            return this.label;
        }

        public Map<String, Object> getValue() {
            return this.value;
        }
    }

    private BlipsRequest() {
    }

    public static BlipsRequest buildPageView(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, Long l2, String str9, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        blipsRequest.uuid = str;
        blipsRequest.timestamp = str2;
        blipsRequest.userId = l;
        blipsRequest.appId = str3;
        blipsRequest.version = str4;
        blipsRequest.channel = str5;
        blipsRequest.url = str6;
        blipsRequest.pageView = new ApiPageView(str7, str8, l2, str9, map);
        return blipsRequest;
    }

    public static BlipsRequest buildUserAction(String str, String str2, Long l, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, Object> map) {
        BlipsRequest blipsRequest = new BlipsRequest();
        blipsRequest.uuid = str;
        blipsRequest.timestamp = str2;
        blipsRequest.userId = l;
        blipsRequest.appId = str3;
        blipsRequest.version = str4;
        blipsRequest.channel = str5;
        blipsRequest.userAction = new ApiUserAction(str6, str7, str8, map);
        return blipsRequest;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getChannel() {
        return this.channel;
    }

    public ApiPageView getPageView() {
        return this.pageView;
    }

    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getUrl() {
        return this.url;
    }

    public ApiUserAction getUserAction() {
        return this.userAction;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getVersion() {
        return this.version;
    }
}
