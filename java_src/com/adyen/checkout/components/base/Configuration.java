package com.adyen.checkout.components.base;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.api.Environment;
import com.facebook.share.internal.C17296a;
import java.io.Serializable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m28432d2 = {"Lcom/adyen/checkout/components/base/Configuration;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "describeContents", "Ljava/util/Locale;", "b", "Ljava/util/Locale;", "c", "()Ljava/util/Locale;", "shopperLocale", "Lcom/adyen/checkout/core/api/Environment;", "Lcom/adyen/checkout/core/api/Environment;", "()Lcom/adyen/checkout/core/api/Environment;", "environment", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "clientKey", "<init>", "(Ljava/util/Locale;Lcom/adyen/checkout/core/api/Environment;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "components-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class Configuration implements Parcelable {

    /* renamed from: b */
    public final Locale f68406b;

    /* renamed from: c */
    public final Environment f68407c;

    /* renamed from: d */
    public final String f68408d;

    public Configuration(Locale shopperLocale, Environment environment, String clientKey) {
        Intrinsics.checkNotNullParameter(shopperLocale, "shopperLocale");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(clientKey, "clientKey");
        this.f68406b = shopperLocale;
        this.f68407c = environment;
        this.f68408d = clientKey;
    }

    /* renamed from: a */
    public final String m53596a() {
        return this.f68408d;
    }

    /* renamed from: b */
    public final Environment m53595b() {
        return this.f68407c;
    }

    /* renamed from: c */
    public final Locale m53594c() {
        return this.f68406b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeSerializable(this.f68406b);
        parcel.writeParcelable(this.f68407c, i);
        parcel.writeString(this.f68408d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Configuration(Parcel parcel) {
        this((Locale) r0, (Environment) r1, r4);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Serializable readSerializable = parcel.readSerializable();
        if (readSerializable != null) {
            Parcelable readParcelable = parcel.readParcelable(Environment.class.getClassLoader());
            Intrinsics.checkNotNull(readParcelable);
            Intrinsics.checkNotNullExpressionValue(readParcelable, "parcel.readParcelable(Environment::class.java.classLoader)!!");
            String readString = parcel.readString();
            Intrinsics.checkNotNull(readString);
            Intrinsics.checkNotNullExpressionValue(readString, "parcel.readString()!!");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.util.Locale");
    }
}
