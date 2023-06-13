package com.facebook;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.amazonaws.services.p026s3.Headers;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C32992Fx2;
import p000.VD1;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 _2\u00020\u0001:\u0007\u0017\u001e&-1e5BQ\b\u0017\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010T\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bc\u0010dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0015\u001a\u00020\u0004H\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R$\u00104\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010!\"\u0004\b3\u0010#R\"\u0010;\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010I\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010L\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010#R.\u0010N\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010M8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR.\u0010[\u001a\u0004\u0018\u00010T2\b\u0010U\u001a\u0004\u0018\u00010T8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00106R\u0018\u0010\\\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010\u001fR\u0016\u0010^\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010!R\u0011\u0010`\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b_\u0010!R\u0011\u0010b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\ba\u0010!¨\u0006f"}, m28432d2 = {"Lcom/facebook/GraphRequest;", "", "", "h", "", "baseUrl", "", "isBatch", "i", "Lorg/json/JSONArray;", "batch", "", "Lcom/facebook/GraphRequest$a;", "attachments", "y", "skipClientToken", "D", "LWD1;", "j", "LUD1;", "k", "toString", "Lcom/facebook/AccessToken;", C17296a.f69688o, "Lcom/facebook/AccessToken;", "l", "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "accessToken", "b", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "setGraphPath", "(Ljava/lang/String;)V", "graphPath", "Lorg/json/JSONObject;", "c", "Lorg/json/JSONObject;", "n", "()Lorg/json/JSONObject;", "A", "(Lorg/json/JSONObject;)V", "graphObject", DateTokenConverter.CONVERTER_KEY, "getBatchEntryName", "setBatchEntryName", "batchEntryName", "e", "getBatchEntryDependsOn", "setBatchEntryDependsOn", "batchEntryDependsOn", "f", "Z", "getBatchEntryOmitResultOnSuccess", "()Z", "setBatchEntryOmitResultOnSuccess", "(Z)V", "batchEntryOmitResultOnSuccess", "Landroid/os/Bundle;", "g", "Landroid/os/Bundle;", "r", "()Landroid/os/Bundle;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(Landroid/os/Bundle;)V", "parameters", "Ljava/lang/Object;", "t", "()Ljava/lang/Object;", "E", "(Ljava/lang/Object;)V", "tag", "v", "F", "version", "Lcom/facebook/GraphRequest$b;", "callback", "Lcom/facebook/GraphRequest$b;", "m", "()Lcom/facebook/GraphRequest$b;", "z", "(Lcom/facebook/GraphRequest$b;)V", "LFN1;", "value", "LFN1;", "q", "()LFN1;", "B", "(LFN1;)V", "httpMethod", "overriddenURL", "p", "graphPathWithVersion", "s", "relativeUrlForBatchedRequest", "u", "urlForSingleRequest", "<init>", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;LFN1;Lcom/facebook/GraphRequest$b;Ljava/lang/String;)V", "ParcelableResourceWithMimeType", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class GraphRequest {

    /* renamed from: n */
    public static final String f69385n;

    /* renamed from: o */
    public static final String f69386o;

    /* renamed from: p */
    public static String f69387p;

    /* renamed from: q */
    public static final Pattern f69388q;

    /* renamed from: r */
    public static volatile String f69389r;

    /* renamed from: s */
    public static final C17206c f69390s = new C17206c(null);

    /* renamed from: a */
    public AccessToken f69391a;

    /* renamed from: b */
    public String f69392b;

    /* renamed from: c */
    public JSONObject f69393c;

    /* renamed from: d */
    public String f69394d;

    /* renamed from: e */
    public String f69395e;

    /* renamed from: f */
    public boolean f69396f;

    /* renamed from: g */
    public Bundle f69397g;

    /* renamed from: h */
    public Object f69398h;

    /* renamed from: i */
    public String f69399i;

    /* renamed from: j */
    public InterfaceC17205b f69400j;

    /* renamed from: k */
    public FN1 f69401k;

    /* renamed from: l */
    public boolean f69402l;

    /* renamed from: m */
    public String f69403m;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u0000 \u0018*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015B\u0011\b\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0019"}, m28432d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "", "describeContents", "Landroid/os/Parcel;", "out", "flags", "", "writeToParcel", "", "b", "Ljava/lang/String;", C17296a.f69688o, "()Ljava/lang/String;", "mimeType", "c", "Landroid/os/Parcelable;", "()Landroid/os/Parcelable;", "resource", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;)V", Stripe3ds2AuthParams.FIELD_SOURCE, "(Landroid/os/Parcel;)V", DateTokenConverter.CONVERTER_KEY, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* renamed from: b */
        public final String f69405b;

        /* renamed from: c */
        public final RESOURCE f69406c;

        /* renamed from: d */
        public static final C17203b f69404d = new C17203b(null);
        private static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new C17202a();

        @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"com/facebook/GraphRequest$ParcelableResourceWithMimeType$a", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcel;", Stripe3ds2AuthParams.FIELD_SOURCE, C17296a.f69688o, "", "size", "", "b", "(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        /* loaded from: classes5.dex */
        public static final class C17202a implements Parcelable.Creator<ParcelableResourceWithMimeType<?>> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public ParcelableResourceWithMimeType<?> createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new ParcelableResourceWithMimeType<>(source, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public ParcelableResourceWithMimeType<?>[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$b;", "", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$b */
        /* loaded from: classes5.dex */
        public static final class C17203b {
            private C17203b() {
            }

            public /* synthetic */ C17203b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* renamed from: a */
        public final String m52820a() {
            return this.f69405b;
        }

        /* renamed from: b */
        public final RESOURCE m52819b() {
            return this.f69406c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.f69405b);
            out.writeParcelable(this.f69406c, i);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f69405b = str;
            this.f69406c = resource;
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.f69405b = parcel.readString();
            Context m52741e = C17216a.m52741e();
            Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
            this.f69406c = (RESOURCE) parcel.readParcelable(m52741e.getClassLoader());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"Lcom/facebook/GraphRequest$a;", "", "Lcom/facebook/GraphRequest;", C17296a.f69688o, "Lcom/facebook/GraphRequest;", "()Lcom/facebook/GraphRequest;", "request", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "value", "<init>", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.GraphRequest$a */
    /* loaded from: classes5.dex */
    public static final class C17204a {

        /* renamed from: a */
        public final GraphRequest f69407a;

        /* renamed from: b */
        public final Object f69408b;

        public C17204a(GraphRequest request, Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f69407a = request;
            this.f69408b = obj;
        }

        /* renamed from: a */
        public final GraphRequest m52816a() {
            return this.f69407a;
        }

        /* renamed from: b */
        public final Object m52815b() {
            return this.f69408b;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lcom/facebook/GraphRequest$b;", "", "LWD1;", "response", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.GraphRequest$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC17205b {
        /* renamed from: a */
        void mo2794a(WD1 wd1);
    }

    @Metadata(m28433d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J:\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J \u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J(\u0010!\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\bH\u0002J \u0010'\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020$2\u0006\u0010&\u001a\u00020%H\u0002J$\u0010+\u001a\u00020\f2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020)0(2\u0006\u0010\u001c\u001a\u00020$H\u0002J2\u0010.\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020$2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%0,2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020)0-H\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u0006H\u0002J\u0012\u00101\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u00102\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u00103\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0002J0\u00109\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u00108\u001a\u0004\u0018\u000107H\u0007J&\u0010:\u001a\u00020%2\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u00010\u00162\b\u00108\u001a\u0004\u0018\u000107H\u0007J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010=\u001a\u00020<2\u0006\u0010&\u001a\u00020%H\u0007J)\u0010@\u001a\b\u0012\u0004\u0012\u00020<0?2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0>\"\u00020%H\u0007¢\u0006\u0004\b@\u0010AJ\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020<0?2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%0,H\u0007J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020<0?2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J#\u0010E\u001a\u00020D2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020%0>\"\u00020%H\u0007¢\u0006\u0004\bE\u0010FJ\u0016\u0010G\u001a\u00020D2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020%0,H\u0007J\u0010\u0010H\u001a\u00020D2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u001e\u0010I\u001a\b\u0012\u0004\u0012\u00020<0?2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J%\u0010K\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020<0?H\u0001¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00010\u00168B@\u0002X\u0082\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010T\"\u0004\bY\u0010ZR\u0017\u0010[\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b[\u0010W\u001a\u0004\b\\\u0010TR\u0014\u0010]\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b]\u0010WR\u0014\u0010^\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b^\u0010WR\u0014\u0010_\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b_\u0010WR\u0014\u0010`\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b`\u0010WR\u0014\u0010a\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\ba\u0010WR\u0014\u0010b\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bb\u0010WR\u0014\u0010c\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bc\u0010WR\u0014\u0010d\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bd\u0010WR\u0014\u0010e\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\be\u0010WR\u0014\u0010f\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bf\u0010WR\u0014\u0010g\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bg\u0010WR\u0014\u0010h\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bh\u0010WR\u0014\u0010i\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bi\u0010WR\u0014\u0010j\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bj\u0010WR\u0014\u0010k\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bk\u0010WR\u0014\u0010l\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bl\u0010WR\u0014\u0010m\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010WR\u0014\u0010n\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bn\u0010WR\u0014\u0010o\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bo\u0010WR\u0014\u0010p\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bp\u0010WR\u0014\u0010q\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bq\u0010WR\u0014\u0010r\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\br\u0010WR\u0014\u0010s\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bs\u0010WR\u0014\u0010t\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bt\u0010WR\u0014\u0010u\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bu\u0010WR\u0014\u0010v\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010WR\u0014\u0010w\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\bw\u0010WR\u0014\u0010x\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\bx\u0010MR\u0014\u0010y\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\by\u0010WR\u0014\u0010z\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010WR\u0014\u0010{\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b{\u0010WR\u0014\u0010|\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010WR\u0014\u0010}\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010WR\u0014\u0010~\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010WR\u0014\u0010\u007f\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u007f\u0010WR\u0016\u0010\u0080\u0001\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010WR\u0016\u0010\u0081\u0001\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010WR\u0016\u0010\u0082\u0001\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010WR\u0016\u0010\u0083\u0001\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010WR\u001a\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010WR\"\u0010\u0087\u0001\u001a\r \u0086\u0001*\u0005\u0018\u00010\u0085\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008b\u0001"}, m28432d2 = {"Lcom/facebook/GraphRequest$c;", "", "Ljava/net/URL;", "url", "Ljava/net/HttpURLConnection;", "e", "LVD1;", "requests", "", "r", "connection", "shouldUseGzip", "", "H", "s", "LFx2;", "logger", "", "numRequests", "Ljava/io/OutputStream;", "outputStream", "B", "", "path", "t", "Lorg/json/JSONObject;", "graphObject", "Lcom/facebook/GraphRequest$d;", "serializer", "z", "key", "value", "passByValue", "A", "Landroid/os/Bundle;", "bundle", "Lcom/facebook/GraphRequest$f;", "Lcom/facebook/GraphRequest;", "request", "E", "", "Lcom/facebook/GraphRequest$a;", "attachments", "D", "", "", "F", "batch", "n", "u", "v", "y", "Lcom/facebook/AccessToken;", "accessToken", "graphPath", "Lcom/facebook/GraphRequest$b;", "callback", "x", "w", "J", "LWD1;", "f", "", "", "i", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "h", "g", "LUD1;", "l", "([Lcom/facebook/GraphRequest;)LUD1;", "k", "j", "m", "responses", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(LVD1;Ljava/util/List;)V", "I", "(Lcom/facebook/GraphRequest;)Z", "K", "(LVD1;)V", "G", "(LVD1;Ljava/net/HttpURLConnection;)V", "o", "()Ljava/lang/String;", "mimeContentType", "userAgent", "Ljava/lang/String;", "q", "setUserAgent", "(Ljava/lang/String;)V", "TAG", "p", "ACCEPT_LANGUAGE_HEADER", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", "SEARCH", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "versionPattern", "Ljava/util/regex/Pattern;", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.GraphRequest$c */
    /* loaded from: classes5.dex */
    public static final class C17206c {

        @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
        /* renamed from: com.facebook.GraphRequest$c$a */
        /* loaded from: classes5.dex */
        public static final class RunnableC17207a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ ArrayList f69409b;

            /* renamed from: c */
            public final /* synthetic */ VD1 f69410c;

            public RunnableC17207a(ArrayList arrayList, VD1 vd1) {
                this.f69409b = arrayList;
                this.f69410c = vd1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (TD0.m84203d(this)) {
                    return;
                }
                try {
                    if (TD0.m84203d(this)) {
                        return;
                    }
                    Iterator it = this.f69409b.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        Object obj = pair.second;
                        Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                        ((InterfaceC17205b) pair.first).mo2794a((WD1) obj);
                    }
                    for (VD1.InterfaceC8575a interfaceC8575a : this.f69410c.m80213w()) {
                        interfaceC8575a.mo52308a(this.f69410c);
                    }
                } catch (Throwable th) {
                    TD0.m84205b(th, this);
                }
            }
        }

        private C17206c() {
        }

        /* renamed from: A */
        public final void m52814A(String str, Object obj, InterfaceC17208d interfaceC17208d, boolean z) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                JSONObject jSONObject = (JSONObject) obj;
                if (z) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        Object opt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                        m52814A(format, opt, interfaceC17208d, z);
                    }
                } else if (jSONObject.has("id")) {
                    String optString = jSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                    m52814A(str, optString, interfaceC17208d, z);
                } else if (jSONObject.has("url")) {
                    String optString2 = jSONObject.optString("url");
                    Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                    m52814A(str, optString2, interfaceC17208d, z);
                } else if (jSONObject.has("fbsdk:create_object")) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                    m52814A(str, jSONObject2, interfaceC17208d, z);
                }
            } else if (JSONArray.class.isAssignableFrom(cls)) {
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String format2 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    Object opt2 = jSONArray.opt(i);
                    Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                    m52814A(format2, opt2, interfaceC17208d, z);
                }
            } else if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.TYPE.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    String format3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(format3, "iso8601DateFormat.format(date)");
                    interfaceC17208d.mo52765a(str, format3);
                }
            } else {
                interfaceC17208d.mo52765a(str, obj.toString());
            }
        }

        /* renamed from: B */
        public final void m52813B(VD1 vd1, C32992Fx2 c32992Fx2, int i, URL url, OutputStream outputStream, boolean z) {
            C17210f c17210f = new C17210f(outputStream, c32992Fx2, z);
            boolean z2 = false;
            if (i == 1) {
                GraphRequest graphRequest = vd1.get(0);
                Map<String, C17204a> hashMap = new HashMap<>();
                for (String key : graphRequest.m52829r().keySet()) {
                    Object obj = graphRequest.m52829r().get(key);
                    if (m52783u(obj)) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashMap.put(key, new C17204a(graphRequest, obj));
                    }
                }
                if (c32992Fx2 != null) {
                    c32992Fx2.m106225b("  Parameters:\n");
                }
                m52810E(graphRequest.m52829r(), c17210f, graphRequest);
                if (c32992Fx2 != null) {
                    c32992Fx2.m106225b("  Attachments:\n");
                }
                m52811D(hashMap, c17210f);
                JSONObject m52833n = graphRequest.m52833n();
                if (m52833n != null) {
                    String path = url.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "url.path");
                    m52778z(m52833n, path, c17210f);
                    return;
                }
                return;
            }
            String m52790n = m52790n(vd1);
            if (m52790n.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                c17210f.mo52765a("batch_app_id", m52790n);
                Map<String, C17204a> hashMap2 = new HashMap<>();
                m52809F(c17210f, vd1, hashMap2);
                if (c32992Fx2 != null) {
                    c32992Fx2.m106225b("  Attachments:\n");
                }
                m52811D(hashMap2, c17210f);
                return;
            }
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }

        @JvmStatic
        /* renamed from: C */
        public final void m52812C(VD1 requests, List<WD1> responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                GraphRequest graphRequest = requests.get(i);
                if (graphRequest.m52834m() != null) {
                    arrayList.add(new Pair(graphRequest.m52834m(), responses.get(i)));
                }
            }
            if (arrayList.size() > 0) {
                RunnableC17207a runnableC17207a = new RunnableC17207a(arrayList, requests);
                Handler m80214v = requests.m80214v();
                if (m80214v != null) {
                    m80214v.post(runnableC17207a);
                } else {
                    runnableC17207a.run();
                }
            }
        }

        /* renamed from: D */
        public final void m52811D(Map<String, C17204a> map, C17210f c17210f) {
            for (Map.Entry<String, C17204a> entry : map.entrySet()) {
                if (GraphRequest.f69390s.m52783u(entry.getValue())) {
                    c17210f.m52768j(entry.getKey(), entry.getValue().m52815b(), entry.getValue().m52816a());
                }
            }
        }

        /* renamed from: E */
        public final void m52810E(Bundle bundle, C17210f c17210f, GraphRequest graphRequest) {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (m52782v(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    c17210f.m52768j(key, obj, graphRequest);
                }
            }
        }

        /* renamed from: F */
        public final void m52809F(C17210f c17210f, Collection<GraphRequest> collection, Map<String, C17204a> map) {
            JSONArray jSONArray = new JSONArray();
            for (GraphRequest graphRequest : collection) {
                graphRequest.m52822y(jSONArray, map);
            }
            c17210f.m52766l("batch", jSONArray, collection);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
        @JvmStatic
        /* renamed from: G */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m52808G(VD1 requests, HttpURLConnection connection) throws IOException, JSONException {
            FN1 fn1;
            OutputStream gZIPOutputStream;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(connection, "connection");
            C32992Fx2 c32992Fx2 = new C32992Fx2(EnumC36034Sx2.REQUESTS, "Request");
            int size = requests.size();
            boolean m52785s = m52785s(requests);
            boolean z = false;
            OutputStream outputStream = null;
            if (size == 1) {
                fn1 = requests.get(0).m52830q();
            } else {
                fn1 = null;
            }
            if (fn1 == null) {
                fn1 = FN1.POST;
            }
            connection.setRequestMethod(fn1.name());
            m52807H(connection, m52785s);
            URL url = connection.getURL();
            c32992Fx2.m106225b("Request:\n");
            c32992Fx2.m106223d(JsonDocumentFields.POLICY_ID, requests.m80212x());
            Intrinsics.checkNotNullExpressionValue(url, "url");
            c32992Fx2.m106223d("URL", url);
            Object requestMethod = connection.getRequestMethod();
            Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            c32992Fx2.m106223d("Method", requestMethod);
            Object requestProperty = connection.getRequestProperty("User-Agent");
            Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            c32992Fx2.m106223d("User-Agent", requestProperty);
            Object requestProperty2 = connection.getRequestProperty("Content-Type");
            Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            c32992Fx2.m106223d("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.m80231A());
            connection.setReadTimeout(requests.m80231A());
            if (fn1 == FN1.POST) {
                z = true;
            }
            if (!z) {
                c32992Fx2.m106222e();
                return;
            }
            connection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (m52785s) {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        outputStream = bufferedOutputStream;
                        if (outputStream != null) {
                        }
                        throw th;
                    }
                } else {
                    gZIPOutputStream = bufferedOutputStream;
                }
                try {
                    gZIPOutputStream = gZIPOutputStream;
                    if (m52786r(requests)) {
                        M74 m74 = new M74(requests.m80214v());
                        m52813B(requests, null, size, url, m74, m52785s);
                        gZIPOutputStream = new N74(gZIPOutputStream, requests, m74.m95768d(), m74.m95769c());
                    }
                    m52813B(requests, c32992Fx2, size, url, gZIPOutputStream, m52785s);
                    gZIPOutputStream.close();
                    c32992Fx2.m106222e();
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = gZIPOutputStream;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* renamed from: H */
        public final void m52807H(HttpURLConnection httpURLConnection, boolean z) {
            if (z) {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty(Headers.CONTENT_ENCODING, "gzip");
                return;
            }
            httpURLConnection.setRequestProperty("Content-Type", m52789o());
        }

        @JvmStatic
        /* renamed from: I */
        public final boolean m52806I(GraphRequest request) {
            boolean z;
            boolean startsWith$default;
            Intrinsics.checkNotNullParameter(request, "request");
            String m52825v = request.m52825v();
            if (m52825v == null) {
                return true;
            }
            if (m52825v.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                startsWith$default = StringsKt__StringsJVMKt.startsWith$default(m52825v, "v", false, 2, null);
                if (startsWith$default) {
                    m52825v = m52825v.substring(1);
                    Intrinsics.checkNotNullExpressionValue(m52825v, "(this as java.lang.String).substring(startIndex)");
                }
                Object[] array = new Regex("\\.").split(m52825v, 0).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (strArr.length >= 2 && Integer.parseInt(strArr[0]) > 2) {
                        return true;
                    }
                    if (Integer.parseInt(strArr[0]) >= 2 && Integer.parseInt(strArr[1]) >= 4) {
                        return true;
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            return true;
        }

        @JvmStatic
        /* renamed from: J */
        public final HttpURLConnection m52805J(VD1 requests) {
            URL url;
            Intrinsics.checkNotNullParameter(requests, "requests");
            m52804K(requests);
            try {
                if (requests.size() == 1) {
                    url = new URL(requests.get(0).m52826u());
                } else {
                    url = new URL(C53066zt5.m159f());
                }
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = m52799e(url);
                    m52808G(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (IOException e) {
                    C52364yi6.m2825n(httpURLConnection);
                    throw new FacebookException("could not construct request body", e);
                } catch (JSONException e2) {
                    C52364yi6.m2825n(httpURLConnection);
                    throw new FacebookException("could not construct request body", e2);
                }
            } catch (MalformedURLException e3) {
                throw new FacebookException("could not construct URL for request", e3);
            }
        }

        @JvmStatic
        /* renamed from: K */
        public final void m52804K(VD1 requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Iterator<GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                GraphRequest request = it.next();
                if (FN1.GET == request.m52830q()) {
                    Intrinsics.checkNotNullExpressionValue(request, "request");
                    if (m52806I(request) && (!request.m52829r().containsKey("fields") || C52364yi6.m2860R(request.m52829r().getString("fields")))) {
                        C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
                        EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.DEVELOPER_ERRORS;
                        Object[] objArr = new Object[1];
                        String m52832o = request.m52832o();
                        if (m52832o == null) {
                            m52832o = "";
                        }
                        objArr[0] = m52832o;
                        c2516a.m106215b(enumC36034Sx2, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", objArr);
                    }
                }
            }
        }

        /* renamed from: e */
        public final HttpURLConnection m52799e(URL url) throws IOException {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            if (uRLConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestProperty("User-Agent", m52787q());
                httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
                httpURLConnection.setChunkedStreamingMode(0);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }

        @JvmStatic
        /* renamed from: f */
        public final WD1 m52798f(GraphRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List<WD1> m52795i = m52795i(request);
            if (m52795i.size() == 1) {
                return m52795i.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        @JvmStatic
        /* renamed from: g */
        public final List<WD1> m52797g(VD1 requests) {
            Exception exc;
            HttpURLConnection httpURLConnection;
            List<WD1> list;
            Intrinsics.checkNotNullParameter(requests, "requests");
            C48817sj6.m13766l(requests, "requests");
            HttpURLConnection httpURLConnection2 = null;
            try {
                httpURLConnection = m52805J(requests);
                exc = null;
            } catch (Exception e) {
                exc = e;
                httpURLConnection = null;
            } catch (Throwable th) {
                th = th;
                C52364yi6.m2825n(httpURLConnection2);
                throw th;
            }
            try {
                if (httpURLConnection != null) {
                    list = m52791m(httpURLConnection, requests);
                } else {
                    List<WD1> m78701a = WD1.f40578j.m78701a(requests.m80211y(), null, new FacebookException(exc));
                    m52812C(requests, m78701a);
                    list = m78701a;
                }
                C52364yi6.m2825n(httpURLConnection);
                return list;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection2 = httpURLConnection;
                C52364yi6.m2825n(httpURLConnection2);
                throw th;
            }
        }

        @JvmStatic
        /* renamed from: h */
        public final List<WD1> m52796h(Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return m52797g(new VD1(requests));
        }

        @JvmStatic
        /* renamed from: i */
        public final List<WD1> m52795i(GraphRequest... requests) {
            List list;
            Intrinsics.checkNotNullParameter(requests, "requests");
            list = ArraysKt___ArraysKt.toList(requests);
            return m52796h(list);
        }

        @JvmStatic
        /* renamed from: j */
        public final UD1 m52794j(VD1 requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            C48817sj6.m13766l(requests, "requests");
            UD1 ud1 = new UD1(requests);
            ud1.executeOnExecutor(C17216a.m52731o(), new Void[0]);
            return ud1;
        }

        @JvmStatic
        /* renamed from: k */
        public final UD1 m52793k(Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return m52794j(new VD1(requests));
        }

        @JvmStatic
        /* renamed from: l */
        public final UD1 m52792l(GraphRequest... requests) {
            List list;
            Intrinsics.checkNotNullParameter(requests, "requests");
            list = ArraysKt___ArraysKt.toList(requests);
            return m52793k(list);
        }

        @JvmStatic
        /* renamed from: m */
        public final List<WD1> m52791m(HttpURLConnection connection, VD1 requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List<WD1> m78696f = WD1.f40578j.m78696f(connection, requests);
            C52364yi6.m2825n(connection);
            int size = requests.size();
            if (size == m78696f.size()) {
                m52812C(requests, m78696f);
                C2597G1.f10726g.m105991e().m106006f();
                return m78696f;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(m78696f.size()), Integer.valueOf(size)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }

        /* renamed from: n */
        public final String m52790n(VD1 vd1) {
            String m80215u = vd1.m80215u();
            boolean z = true;
            if (m80215u != null && (!vd1.isEmpty())) {
                return m80215u;
            }
            Iterator<GraphRequest> it = vd1.iterator();
            while (it.hasNext()) {
                AccessToken m52835l = it.next().m52835l();
                if (m52835l != null) {
                    return m52835l.m52921b();
                }
            }
            String str = GraphRequest.f69387p;
            if (str != null) {
                if (str.length() <= 0) {
                    z = false;
                }
                if (z) {
                    return str;
                }
            }
            String m52740f = C17216a.m52740f();
            Intrinsics.checkNotNullExpressionValue(m52740f, "FacebookSdk.getApplicationId()");
            return m52740f;
        }

        /* renamed from: o */
        public final String m52789o() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.f69386o}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }

        /* renamed from: p */
        public final String m52788p() {
            return GraphRequest.f69385n;
        }

        /* renamed from: q */
        public final String m52787q() {
            if (GraphRequest.f69389r == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "11.1.0"}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                GraphRequest.f69389r = format;
                String m7410a = C50820w62.m7410a();
                if (!C52364yi6.m2860R(m7410a)) {
                    String format2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f69389r, m7410a}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    GraphRequest.f69389r = format2;
                }
            }
            return GraphRequest.f69389r;
        }

        /* renamed from: r */
        public final boolean m52786r(VD1 vd1) {
            for (VD1.InterfaceC8575a interfaceC8575a : vd1.m80213w()) {
                if (interfaceC8575a instanceof VD1.InterfaceC8577c) {
                    return true;
                }
            }
            Iterator<GraphRequest> it = vd1.iterator();
            while (it.hasNext()) {
                if (it.next().m52834m() instanceof InterfaceC17209e) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: s */
        public final boolean m52785s(VD1 vd1) {
            Iterator<GraphRequest> it = vd1.iterator();
            while (it.hasNext()) {
                GraphRequest next = it.next();
                for (String str : next.m52829r().keySet()) {
                    if (m52783u(next.m52829r().get(str))) {
                        return false;
                    }
                }
            }
            return true;
        }

        /* renamed from: t */
        public final boolean m52784t(String str) {
            boolean startsWith$default;
            boolean startsWith$default2;
            Matcher matcher = GraphRequest.f69388q.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(str, "matcher.group(1)");
            }
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "me/", false, 2, null);
            if (!startsWith$default) {
                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str, "/me/", false, 2, null);
                if (startsWith$default2) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* renamed from: u */
        public final boolean m52783u(Object obj) {
            if (!(obj instanceof Bitmap) && !(obj instanceof byte[]) && !(obj instanceof Uri) && !(obj instanceof ParcelFileDescriptor) && !(obj instanceof ParcelableResourceWithMimeType)) {
                return false;
            }
            return true;
        }

        /* renamed from: v */
        public final boolean m52782v(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        @JvmStatic
        /* renamed from: w */
        public final GraphRequest m52781w(AccessToken accessToken, String str, InterfaceC17205b interfaceC17205b) {
            return new GraphRequest(accessToken, str, null, null, interfaceC17205b, null, 32, null);
        }

        @JvmStatic
        /* renamed from: x */
        public final GraphRequest m52780x(AccessToken accessToken, String str, JSONObject jSONObject, InterfaceC17205b interfaceC17205b) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, FN1.POST, interfaceC17205b, null, 32, null);
            graphRequest.m52852A(jSONObject);
            return graphRequest;
        }

        /* renamed from: y */
        public final String m52779y(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
                if (obj instanceof Date) {
                    String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
                    return format;
                }
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            return obj.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* renamed from: z */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m52778z(JSONObject jSONObject, String str, InterfaceC17208d interfaceC17208d) {
            boolean z;
            Iterator<String> keys;
            boolean z2;
            boolean equals;
            int indexOf$default;
            int indexOf$default2;
            if (m52784t(str)) {
                indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ":", 0, false, 6, (Object) null);
                indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, CallerData.f61059NA, 0, false, 6, (Object) null);
                if (indexOf$default > 3 && (indexOf$default2 == -1 || indexOf$default < indexOf$default2)) {
                    z = true;
                    keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        Object value = jSONObject.opt(key);
                        if (z) {
                            equals = StringsKt__StringsJVMKt.equals(key, Entry.TYPE_IMAGE, true);
                            if (equals) {
                                z2 = true;
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                Intrinsics.checkNotNullExpressionValue(value, "value");
                                m52814A(key, value, interfaceC17208d, z2);
                            }
                        }
                        z2 = false;
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        Intrinsics.checkNotNullExpressionValue(value, "value");
                        m52814A(key, value, interfaceC17208d, z2);
                    }
                }
            }
            z = false;
            keys = jSONObject.keys();
            while (keys.hasNext()) {
            }
        }

        public /* synthetic */ C17206c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, m28432d2 = {"Lcom/facebook/GraphRequest$d;", "", "", "key", "value", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.GraphRequest$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC17208d {
        /* renamed from: a */
        void mo52765a(String str, String str2);
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, m28432d2 = {"Lcom/facebook/GraphRequest$e;", "Lcom/facebook/GraphRequest$b;", "", "current", "max", "", "b", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.GraphRequest$e */
    /* loaded from: classes5.dex */
    public interface InterfaceC17209e extends InterfaceC17205b {
        /* renamed from: b */
        void m52777b(long j, long j2);
    }

    @Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010/\u001a\u00020-\u0012\b\u00102\u001a\u0004\u0018\u000100\u0012\u0006\u0010,\u001a\u00020(¢\u0006\u0004\b7\u00108J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J$\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0016\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J \u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u001d\u001a\u00020\bJ$\u0010!\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0002J-\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0016\u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040#\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J-\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0016\u0010$\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040#\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0014\u0010,\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.R\u0016\u00102\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R\u0018\u00106\u001a\u000603j\u0002`48BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00105¨\u00069"}, m28432d2 = {"Lcom/facebook/GraphRequest$f;", "Lcom/facebook/GraphRequest$d;", "", "key", "", "value", "Lcom/facebook/GraphRequest;", "request", "", "j", "Lorg/json/JSONArray;", "requestJsonArray", "", "requests", "l", C17296a.f69688o, "Landroid/graphics/Bitmap;", "bitmap", DateTokenConverter.CONVERTER_KEY, "", "bytes", "e", "Landroid/net/Uri;", "contentUri", "mimeType", "g", "Landroid/os/ParcelFileDescriptor;", "descriptor", "h", "k", "name", "filename", "contentType", "f", "format", "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", "i", "", "Z", "firstWrite", "b", "useUrlEncode", "Ljava/io/OutputStream;", "Ljava/io/OutputStream;", "outputStream", "LFx2;", "LFx2;", "logger", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()Ljava/lang/RuntimeException;", "invalidTypeError", "<init>", "(Ljava/io/OutputStream;LFx2;Z)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.GraphRequest$f */
    /* loaded from: classes5.dex */
    public static final class C17210f implements InterfaceC17208d {

        /* renamed from: a */
        public boolean f69411a;

        /* renamed from: b */
        public final boolean f69412b;

        /* renamed from: c */
        public final OutputStream f69413c;

        /* renamed from: d */
        public final C32992Fx2 f69414d;

        public C17210f(OutputStream outputStream, C32992Fx2 c32992Fx2, boolean z) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.f69413c = outputStream;
            this.f69414d = c32992Fx2;
            this.f69411a = true;
            this.f69412b = z;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17208d
        /* renamed from: a */
        public void mo52765a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            m52772f(key, null, null);
            m52769i("%s", value);
            m52767k();
            C32992Fx2 c32992Fx2 = this.f69414d;
            if (c32992Fx2 != null) {
                c32992Fx2.m106223d("    " + key, value);
            }
        }

        /* renamed from: b */
        public final RuntimeException m52776b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: c */
        public final void m52775c(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (!this.f69412b) {
                if (this.f69411a) {
                    OutputStream outputStream = this.f69413c;
                    Charset charset = Charsets.UTF_8;
                    byte[] bytes = "--".getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    OutputStream outputStream2 = this.f69413c;
                    String str = GraphRequest.f69386o;
                    if (str != null) {
                        byte[] bytes2 = str.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                        outputStream2.write(bytes2);
                        OutputStream outputStream3 = this.f69413c;
                        byte[] bytes3 = FileUploadRequest.LINE_BREAK.getBytes(charset);
                        Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                        outputStream3.write(bytes3);
                        this.f69411a = false;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                OutputStream outputStream4 = this.f69413c;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                Charset charset2 = Charsets.UTF_8;
                if (format2 != null) {
                    byte[] bytes4 = format2.getBytes(charset2);
                    Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                    outputStream4.write(bytes4);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            OutputStream outputStream5 = this.f69413c;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] copyOf2 = Arrays.copyOf(args, args.length);
            String format3 = String.format(locale, format, Arrays.copyOf(copyOf2, copyOf2.length));
            Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(locale, format, *args)");
            String encode = URLEncoder.encode(format3, Constants.DEFAULT_ENCODING);
            Intrinsics.checkNotNullExpressionValue(encode, "URLEncoder.encode(String… format, *args), \"UTF-8\")");
            Charset charset3 = Charsets.UTF_8;
            if (encode != null) {
                byte[] bytes5 = encode.getBytes(charset3);
                Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
                outputStream5.write(bytes5);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: d */
        public final void m52774d(String key, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            m52772f(key, key, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f69413c);
            m52769i("", new Object[0]);
            m52767k();
            C32992Fx2 c32992Fx2 = this.f69414d;
            if (c32992Fx2 != null) {
                c32992Fx2.m106223d("    " + key, "<Image>");
            }
        }

        /* renamed from: e */
        public final void m52773e(String key, byte[] bytes) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            m52772f(key, key, "content/unknown");
            this.f69413c.write(bytes);
            m52769i("", new Object[0]);
            m52767k();
            C32992Fx2 c32992Fx2 = this.f69414d;
            if (c32992Fx2 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                c32992Fx2.m106223d("    " + key, format);
            }
        }

        /* renamed from: f */
        public final void m52772f(String str, String str2, String str3) {
            if (!this.f69412b) {
                m52775c("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    m52775c("; filename=\"%s\"", str2);
                }
                m52769i("", new Object[0]);
                if (str3 != null) {
                    m52769i("%s: %s", "Content-Type", str3);
                }
                m52769i("", new Object[0]);
                return;
            }
            OutputStream outputStream = this.f69413c;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            Charset charset = Charsets.UTF_8;
            if (format != null) {
                byte[] bytes = format.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: g */
        public final void m52771g(String key, Uri contentUri, String str) {
            int m2829l;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            m52772f(key, key, str);
            if (this.f69413c instanceof M74) {
                ((M74) this.f69413c).m95770b(C52364yi6.m2811u(contentUri));
                m2829l = 0;
            } else {
                Context m52741e = C17216a.m52741e();
                Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
                m2829l = C52364yi6.m2829l(m52741e.getContentResolver().openInputStream(contentUri), this.f69413c) + 0;
            }
            m52769i("", new Object[0]);
            m52767k();
            C32992Fx2 c32992Fx2 = this.f69414d;
            if (c32992Fx2 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(m2829l)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                c32992Fx2.m106223d("    " + key, format);
            }
        }

        /* renamed from: h */
        public final void m52770h(String key, ParcelFileDescriptor descriptor, String str) {
            int m2829l;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            m52772f(key, key, str);
            OutputStream outputStream = this.f69413c;
            if (outputStream instanceof M74) {
                ((M74) outputStream).m95770b(descriptor.getStatSize());
                m2829l = 0;
            } else {
                m2829l = C52364yi6.m2829l(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.f69413c) + 0;
            }
            m52769i("", new Object[0]);
            m52767k();
            C32992Fx2 c32992Fx2 = this.f69414d;
            if (c32992Fx2 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(m2829l)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                c32992Fx2.m106223d("    " + key, format);
            }
        }

        /* renamed from: i */
        public final void m52769i(String format, Object... args) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            m52775c(format, Arrays.copyOf(args, args.length));
            if (!this.f69412b) {
                m52775c(FileUploadRequest.LINE_BREAK, new Object[0]);
            }
        }

        /* renamed from: j */
        public final void m52768j(String key, Object obj, GraphRequest graphRequest) {
            Intrinsics.checkNotNullParameter(key, "key");
            OutputStream outputStream = this.f69413c;
            if (outputStream instanceof ZI4) {
                if (outputStream != null) {
                    ((ZI4) outputStream).mo73316a(graphRequest);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
                }
            }
            C17206c c17206c = GraphRequest.f69390s;
            if (c17206c.m52782v(obj)) {
                mo52765a(key, c17206c.m52779y(obj));
            } else if (obj instanceof Bitmap) {
                m52774d(key, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                m52773e(key, (byte[]) obj);
            } else if (obj instanceof Uri) {
                m52771g(key, (Uri) obj, null);
            } else if (obj instanceof ParcelFileDescriptor) {
                m52770h(key, (ParcelFileDescriptor) obj, null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable m52819b = parcelableResourceWithMimeType.m52819b();
                String m52820a = parcelableResourceWithMimeType.m52820a();
                if (m52819b instanceof ParcelFileDescriptor) {
                    m52770h(key, (ParcelFileDescriptor) m52819b, m52820a);
                } else if (m52819b instanceof Uri) {
                    m52771g(key, (Uri) m52819b, m52820a);
                } else {
                    throw m52776b();
                }
            } else {
                throw m52776b();
            }
        }

        /* renamed from: k */
        public final void m52767k() {
            if (!this.f69412b) {
                m52769i("--%s", GraphRequest.f69386o);
                return;
            }
            OutputStream outputStream = this.f69413c;
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        /* renamed from: l */
        public final void m52766l(String key, JSONArray requestJsonArray, Collection<GraphRequest> requests) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            OutputStream outputStream = this.f69413c;
            if (!(outputStream instanceof ZI4)) {
                String jSONArray = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(jSONArray, "requestJsonArray.toString()");
                mo52765a(key, jSONArray);
            } else if (outputStream != null) {
                ZI4 zi4 = (ZI4) outputStream;
                m52772f(key, null, null);
                m52775c("[", new Object[0]);
                int i = 0;
                for (GraphRequest graphRequest : requests) {
                    JSONObject jSONObject = requestJsonArray.getJSONObject(i);
                    zi4.mo73316a(graphRequest);
                    if (i > 0) {
                        m52775c(",%s", jSONObject.toString());
                    } else {
                        m52775c("%s", jSONObject.toString());
                    }
                    i++;
                }
                m52775c("]", new Object[0]);
                C32992Fx2 c32992Fx2 = this.f69414d;
                if (c32992Fx2 != null) {
                    String jSONArray2 = requestJsonArray.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONArray2, "requestJsonArray.toString()");
                    c32992Fx2.m106223d("    " + key, jSONArray2);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.RequestOutputStream");
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LWD1;", "response", "", C17296a.f69688o, "(LWD1;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.GraphRequest$g */
    /* loaded from: classes5.dex */
    public static final class C17211g implements InterfaceC17205b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC17205b f69415a;

        public C17211g(InterfaceC17205b interfaceC17205b) {
            this.f69415a = interfaceC17205b;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17205b
        /* renamed from: a */
        public final void mo2794a(WD1 response) {
            JSONObject jSONObject;
            JSONArray jSONArray;
            String str;
            String str2;
            String str3;
            Intrinsics.checkNotNullParameter(response, "response");
            JSONObject m78703c = response.m78703c();
            if (m78703c != null) {
                jSONObject = m78703c.optJSONObject("__debug__");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONArray = jSONObject.optJSONArray("messages");
            } else {
                jSONArray = null;
            }
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        str = optJSONObject.optString("message");
                    } else {
                        str = null;
                    }
                    if (optJSONObject != null) {
                        str2 = optJSONObject.optString("type");
                    } else {
                        str2 = null;
                    }
                    if (optJSONObject != null) {
                        str3 = optJSONObject.optString("link");
                    } else {
                        str3 = null;
                    }
                    if (str != null && str2 != null) {
                        EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.GRAPH_API_DEBUG_INFO;
                        if (Intrinsics.areEqual(str2, "warning")) {
                            enumC36034Sx2 = EnumC36034Sx2.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!C52364yi6.m2860R(str3)) {
                            str = str + " Link: " + str3;
                        }
                        C32992Fx2.f10539f.m106214c(enumC36034Sx2, GraphRequest.f69390s.m52788p(), str);
                    }
                }
            }
            InterfaceC17205b interfaceC17205b = this.f69415a;
            if (interfaceC17205b != null) {
                interfaceC17205b.mo2794a(response);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"com/facebook/GraphRequest$h", "Lcom/facebook/GraphRequest$d;", "", "key", "value", "", C17296a.f69688o, "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: com.facebook.GraphRequest$h */
    /* loaded from: classes5.dex */
    public static final class C17212h implements InterfaceC17208d {

        /* renamed from: a */
        public final /* synthetic */ ArrayList f69416a;

        public C17212h(ArrayList arrayList) {
            this.f69416a = arrayList;
        }

        @Override // com.facebook.GraphRequest.InterfaceC17208d
        /* renamed from: a */
        public void mo52765a(String key, String value) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f69416a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, Constants.DEFAULT_ENCODING)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            arrayList.add(format);
        }
    }

    static {
        String simpleName = GraphRequest.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "GraphRequest::class.java.simpleName");
        f69385n = simpleName;
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        f69386o = sb2;
        f69388q = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    @JvmOverloads
    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @JvmStatic
    /* renamed from: w */
    public static final GraphRequest m52824w(AccessToken accessToken, String str, InterfaceC17205b interfaceC17205b) {
        return f69390s.m52781w(accessToken, str, interfaceC17205b);
    }

    @JvmStatic
    /* renamed from: x */
    public static final GraphRequest m52823x(AccessToken accessToken, String str, JSONObject jSONObject, InterfaceC17205b interfaceC17205b) {
        return f69390s.m52780x(accessToken, str, jSONObject, interfaceC17205b);
    }

    /* renamed from: A */
    public final void m52852A(JSONObject jSONObject) {
        this.f69393c = jSONObject;
    }

    /* renamed from: B */
    public final void m52851B(FN1 fn1) {
        if (this.f69403m != null && fn1 != FN1.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (fn1 == null) {
            fn1 = FN1.GET;
        }
        this.f69401k = fn1;
    }

    /* renamed from: C */
    public final void m52850C(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.f69397g = bundle;
    }

    @Deprecated(message = "Starting in v13, the SDK will require a client token to be set before making GraphAPI calls.")
    /* renamed from: D */
    public final void m52849D(boolean z) {
        this.f69402l = z;
    }

    /* renamed from: E */
    public final void m52848E(Object obj) {
        this.f69398h = obj;
    }

    /* renamed from: F */
    public final void m52847F(String str) {
        this.f69399i = str;
    }

    /* renamed from: h */
    public final void m52839h() {
        AccessToken accessToken = this.f69391a;
        Bundle bundle = this.f69397g;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String m52911m = accessToken.m52911m();
                C32992Fx2.f10539f.m106212e(m52911m);
                bundle.putString("access_token", m52911m);
            }
        } else if (!this.f69402l && !bundle.containsKey("access_token")) {
            String m52740f = C17216a.m52740f();
            String m52733m = C17216a.m52733m();
            if (!C52364yi6.m2860R(m52740f) && !C52364yi6.m2860R(m52733m)) {
                bundle.putString("access_token", m52740f + '|' + m52733m);
            } else {
                C52364yi6.m2853Y(f69385n, "Warning: Request without access token missing application ID or client token.");
            }
        }
        if (!bundle.containsKey("access_token") && C52364yi6.m2860R(C17216a.m52733m())) {
            Log.w(f69385n, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString(SdkAction.ACTION_TYPE, "android");
        bundle.putString("format", "json");
        if (C17216a.m52720z(EnumC36034Sx2.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (C17216a.m52720z(EnumC36034Sx2.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    /* renamed from: i */
    public final String m52838i(String str, boolean z) {
        if (!z && this.f69401k == FN1.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f69397g.keySet()) {
            Object obj = this.f69397g.get(str2);
            if (obj == null) {
                obj = "";
            }
            C17206c c17206c = f69390s;
            if (c17206c.m52782v(obj)) {
                buildUpon.appendQueryParameter(str2, c17206c.m52779y(obj).toString());
            } else if (this.f69401k != FN1.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    /* renamed from: j */
    public final WD1 m52837j() {
        return f69390s.m52798f(this);
    }

    /* renamed from: k */
    public final UD1 m52836k() {
        return f69390s.m52792l(this);
    }

    /* renamed from: l */
    public final AccessToken m52835l() {
        return this.f69391a;
    }

    /* renamed from: m */
    public final InterfaceC17205b m52834m() {
        return this.f69400j;
    }

    /* renamed from: n */
    public final JSONObject m52833n() {
        return this.f69393c;
    }

    /* renamed from: o */
    public final String m52832o() {
        return this.f69392b;
    }

    /* renamed from: p */
    public final String m52831p() {
        if (f69388q.matcher(this.f69392b).matches()) {
            return this.f69392b;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f69399i, this.f69392b}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* renamed from: q */
    public final FN1 m52830q() {
        return this.f69401k;
    }

    /* renamed from: r */
    public final Bundle m52829r() {
        return this.f69397g;
    }

    /* renamed from: s */
    public final String m52828s() {
        if (this.f69403m == null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/%s", Arrays.copyOf(new Object[]{C53066zt5.m159f(), m52831p()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            m52839h();
            Uri uri = Uri.parse(m52838i(format, true));
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            String format2 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    /* renamed from: t */
    public final Object m52827t() {
        return this.f69398h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f69391a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f69392b);
        sb.append(", graphObject: ");
        sb.append(this.f69393c);
        sb.append(", httpMethod: ");
        sb.append(this.f69401k);
        sb.append(", parameters: ");
        sb.append(this.f69397g);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return sb2;
    }

    /* renamed from: u */
    public final String m52826u() {
        String m159f;
        boolean endsWith$default;
        String str = this.f69403m;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.f69392b;
        if (this.f69401k == FN1.POST && str2 != null) {
            endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str2, "/videos", false, 2, null);
            if (endsWith$default) {
                m159f = C53066zt5.m158g();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s/%s", Arrays.copyOf(new Object[]{m159f, m52831p()}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                m52839h();
                return m52838i(format, false);
            }
        }
        m159f = C53066zt5.m159f();
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format("%s/%s", Arrays.copyOf(new Object[]{m159f, m52831p()}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
        m52839h();
        return m52838i(format2, false);
    }

    /* renamed from: v */
    public final String m52825v() {
        return this.f69399i;
    }

    /* renamed from: y */
    public final void m52822y(JSONArray jSONArray, Map<String, C17204a> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f69394d;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f69396f);
        }
        String str2 = this.f69395e;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String m52828s = m52828s();
        jSONObject.put("relative_url", m52828s);
        jSONObject.put("method", this.f69401k);
        AccessToken accessToken = this.f69391a;
        if (accessToken != null) {
            C32992Fx2.f10539f.m106212e(accessToken.m52911m());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f69397g.keySet()) {
            Object obj = this.f69397g.get(str3);
            if (f69390s.m52783u(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                map.put(format, new C17204a(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f69393c;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            f69390s.m52778z(jSONObject2, m52828s, new C17212h(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: z */
    public final void m52821z(InterfaceC17205b interfaceC17205b) {
        if (!C17216a.m52720z(EnumC36034Sx2.GRAPH_API_DEBUG_INFO) && !C17216a.m52720z(EnumC36034Sx2.GRAPH_API_DEBUG_WARNING)) {
            this.f69400j = interfaceC17205b;
        } else {
            this.f69400j = new C17211g(interfaceC17205b);
        }
    }

    @JvmOverloads
    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, FN1 fn1) {
        this(accessToken, str, bundle, fn1, null, null, 48, null);
    }

    @JvmOverloads
    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, FN1 fn1, InterfaceC17205b interfaceC17205b) {
        this(accessToken, str, bundle, fn1, interfaceC17205b, null, 32, null);
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, FN1 fn1, InterfaceC17205b interfaceC17205b, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : fn1, (i & 16) != 0 ? null : interfaceC17205b, (i & 32) != 0 ? null : str2);
    }

    @JvmOverloads
    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, FN1 fn1, InterfaceC17205b interfaceC17205b, String str2) {
        this.f69396f = true;
        this.f69391a = accessToken;
        this.f69392b = str;
        this.f69399i = str2;
        m52821z(interfaceC17205b);
        m52851B(fn1);
        if (bundle != null) {
            this.f69397g = new Bundle(bundle);
        } else {
            this.f69397g = new Bundle();
        }
        if (this.f69399i == null) {
            this.f69399i = C17216a.m52729q();
        }
    }
}
