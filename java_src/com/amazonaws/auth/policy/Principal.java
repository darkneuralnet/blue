package com.amazonaws.auth.policy;

import co.bird.android.model.Detail;
/* loaded from: classes2.dex */
public class Principal {

    /* renamed from: id */
    private final String f68557id;
    private final String provider;
    public static final Principal AllUsers = new Principal("AWS", "*");
    public static final Principal AllServices = new Principal("Service", "*");
    public static final Principal AllWebProviders = new Principal("Federated", "*");
    public static final Principal All = new Principal("*", "*");

    /* loaded from: classes2.dex */
    public enum Services {
        AWSDataPipeline("datapipeline.amazonaws.com"),
        AmazonElasticTranscoder("elastictranscoder.amazonaws.com"),
        AmazonEC2("ec2.amazonaws.com"),
        AWSOpsWorks("opsworks.amazonaws.com"),
        AWSCloudHSM("cloudhsm.amazonaws.com"),
        AllServices("*");
        
        private String serviceId;

        Services(String str) {
            this.serviceId = str;
        }

        public static Services fromString(String str) {
            Services[] values;
            if (str != null) {
                for (Services services : values()) {
                    if (services.getServiceId().equalsIgnoreCase(str)) {
                        return services;
                    }
                }
                return null;
            }
            return null;
        }

        public String getServiceId() {
            return this.serviceId;
        }
    }

    /* loaded from: classes2.dex */
    public enum WebIdentityProviders {
        Facebook("graph.facebook.com"),
        Google("accounts.google.com"),
        Amazon("www.amazon.com"),
        AllProviders("*");
        
        private String webIdentityProvider;

        WebIdentityProviders(String str) {
            this.webIdentityProvider = str;
        }

        public static WebIdentityProviders fromString(String str) {
            WebIdentityProviders[] values;
            if (str != null) {
                for (WebIdentityProviders webIdentityProviders : values()) {
                    if (webIdentityProviders.getWebIdentityProvider().equalsIgnoreCase(str)) {
                        return webIdentityProviders;
                    }
                }
                return null;
            }
            return null;
        }

        public String getWebIdentityProvider() {
            return this.webIdentityProvider;
        }
    }

    public Principal(Services services) {
        if (services != null) {
            this.f68557id = services.getServiceId();
            this.provider = "Service";
            return;
        }
        throw new IllegalArgumentException("Null AWS service name specified");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Principal)) {
            return false;
        }
        Principal principal = (Principal) obj;
        if (getProvider().equals(principal.getProvider()) && getId().equals(principal.getId())) {
            return true;
        }
        return false;
    }

    public String getId() {
        return this.f68557id;
    }

    public String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return ((this.provider.hashCode() + 31) * 31) + this.f68557id.hashCode();
    }

    public Principal(String str, String str2) {
        this.provider = str;
        this.f68557id = "AWS".equals(str) ? str2.replaceAll(Detail.EMPTY_CHAR, "") : str2;
    }

    public Principal(String str) {
        if (str != null) {
            this.f68557id = str.replaceAll(Detail.EMPTY_CHAR, "");
            this.provider = "AWS";
            return;
        }
        throw new IllegalArgumentException("Null AWS account ID specified");
    }

    public Principal(WebIdentityProviders webIdentityProviders) {
        if (webIdentityProviders != null) {
            this.f68557id = webIdentityProviders.getWebIdentityProvider();
            this.provider = "Federated";
            return;
        }
        throw new IllegalArgumentException("Null web identity provider specified");
    }
}
