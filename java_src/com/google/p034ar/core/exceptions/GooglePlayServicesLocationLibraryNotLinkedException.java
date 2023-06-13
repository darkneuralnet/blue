package com.google.p034ar.core.exceptions;
/* renamed from: com.google.ar.core.exceptions.GooglePlayServicesLocationLibraryNotLinkedException */
/* loaded from: classes6.dex */
public class GooglePlayServicesLocationLibraryNotLinkedException extends UnsupportedConfigurationException {
    public GooglePlayServicesLocationLibraryNotLinkedException() {
        this("");
    }

    public GooglePlayServicesLocationLibraryNotLinkedException(String str) {
        super("The Google Fused Location Provider for Android classes must be linked into the app's binary when calling Session.configure() with Geospatial mode enabled (Config.GeospatialMode.ENABLED). ".concat(String.valueOf(str)));
    }
}
