package com.appboy.enums;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m28432d2 = {"Lcom/appboy/enums/SdkFlavor;", "", "LaP1;", "", "forJsonPut", "jsonKey", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UNITY", "REACT", "CORDOVA", "XAMARIN", "FLUTTER", "SEGMENT", "TEALIUM", "MPARTICLE", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum SdkFlavor implements InterfaceC37933aP1<String> {
    UNITY("unity"),
    REACT("react"),
    CORDOVA("cordova"),
    XAMARIN("xamarin"),
    FLUTTER("flutter"),
    SEGMENT("segment"),
    TEALIUM("tealium"),
    MPARTICLE("mparticle");
    
    private final String jsonKey;

    SdkFlavor(String str) {
        this.jsonKey = str;
    }

    @Override // p000.InterfaceC37933aP1
    public String forJsonPut() {
        return this.jsonKey;
    }
}
