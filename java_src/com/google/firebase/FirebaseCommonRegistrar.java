package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.ArrayList;
import java.util.List;
import p000.C50661vq2;
/* loaded from: classes6.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: e */
    public static /* synthetic */ String m47383e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* renamed from: f */
    public static /* synthetic */ String m47382f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    /* renamed from: g */
    public static /* synthetic */ String m47381g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* renamed from: h */
    public static /* synthetic */ String m47380h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m47379i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    public static String m47379i(String str) {
        return str.replace(' ', '_').replace(JsonPointer.SEPARATOR, '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C32711Es0<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VY0.m79787c());
        arrayList.add(C49287tX0.m12157g());
        arrayList.add(C50661vq2.m7933b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C50661vq2.m7933b("fire-core", "20.3.2"));
        arrayList.add(C50661vq2.m7933b("device-name", m47379i(Build.PRODUCT)));
        arrayList.add(C50661vq2.m7933b("device-model", m47379i(Build.DEVICE)));
        arrayList.add(C50661vq2.m7933b("device-brand", m47379i(Build.BRAND)));
        arrayList.add(C50661vq2.m7932c("android-target-sdk", new C50661vq2.InterfaceC29666a() { // from class: Fm1
            @Override // p000.C50661vq2.InterfaceC29666a
            public final String extract(Object obj) {
                String m47383e;
                m47383e = FirebaseCommonRegistrar.m47383e((Context) obj);
                return m47383e;
            }
        }));
        arrayList.add(C50661vq2.m7932c("android-min-sdk", new C50661vq2.InterfaceC29666a() { // from class: Gm1
            @Override // p000.C50661vq2.InterfaceC29666a
            public final String extract(Object obj) {
                String m47382f;
                m47382f = FirebaseCommonRegistrar.m47382f((Context) obj);
                return m47382f;
            }
        }));
        arrayList.add(C50661vq2.m7932c("android-platform", new C50661vq2.InterfaceC29666a() { // from class: Hm1
            @Override // p000.C50661vq2.InterfaceC29666a
            public final String extract(Object obj) {
                String m47381g;
                m47381g = FirebaseCommonRegistrar.m47381g((Context) obj);
                return m47381g;
            }
        }));
        arrayList.add(C50661vq2.m7932c("android-installer", new C50661vq2.InterfaceC29666a() { // from class: Im1
            @Override // p000.C50661vq2.InterfaceC29666a
            public final String extract(Object obj) {
                String m47380h;
                m47380h = FirebaseCommonRegistrar.m47380h((Context) obj);
                return m47380h;
            }
        }));
        String m115311a = C31714Al2.m115311a();
        if (m115311a != null) {
            arrayList.add(C50661vq2.m7933b(RequestHeadersFactory.KOTLIN, m115311a));
        }
        return arrayList;
    }
}
