package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.C17216a;
import com.facebook.GraphRequest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AsyncTaskC43496jl1;
import p000.C32172Ck1;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002%)B\t\b\u0002¢\u0006\u0004\b1\u00102J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J;\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002J'\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J'\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010!R\"\u0010'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u00100\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, m28432d2 = {"LaV2;", "", "", "g", "LaV2$a;", "task", "Ljava/io/File;", "j", "", "", "denses", "", "texts", "o", "(LaV2$a;[[F[Ljava/lang/String;)[Ljava/lang/String;", "", FraudDetectionData.KEY_TIMESTAMP, "", "l", "Lorg/json/JSONObject;", "models", "f", "jsonObject", "n", "i", "h", "Lorg/json/JSONArray;", "jsonArray", "m", "LUE2;", "res", "thresholds", "q", "(LUE2;[F)[Ljava/lang/String;", "p", "", "LaV2$b;", C17296a.f69688o, "Ljava/util/Map;", "taskHandlers", "", "b", "Ljava/util/List;", "MTML_SUGGESTED_EVENTS_PREDICTION", "c", "MTML_INTEGRITY_DETECT_PREDICTION", "k", "()Z", "isLocaleEnglish", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: aV2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37988aV2 {

    /* renamed from: b */
    public static final List<String> f50550b;

    /* renamed from: c */
    public static final List<String> f50551c;

    /* renamed from: d */
    public static final C37988aV2 f50552d = new C37988aV2();

    /* renamed from: a */
    public static final Map<String, C10719b> f50549a = new ConcurrentHashMap();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002j\u0002\b\u0004j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LaV2$a;", "", "", C17296a.f69688o, "b", "<init>", "(Ljava/lang/String;I)V", "c", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: aV2$a */
    /* loaded from: classes5.dex */
    public enum EnumC10718a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: a */
        public final String m71296a() {
            int i = ZU2.$EnumSwitchMapping$0[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "app_event_pred";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "integrity_detect";
        }

        /* renamed from: b */
        public final String m71295b() {
            int i = ZU2.$EnumSwitchMapping$1[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "MTML_APP_EVENT_PRED";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "MTML_INTEGRITY_DETECT";
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\b\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0006B3\u0012\u0006\u0010\u001c\u001a\u00020\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010)\u001a\u00020#\u0012\b\u0010/\u001a\u0004\u0018\u00010*¢\u0006\u0004\b0\u00101J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u000e\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b!\u0010\u001bR\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010/\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010+\u001a\u0004\b \u0010,\"\u0004\b-\u0010.¨\u00062"}, m28432d2 = {"LaV2$b;", "", "Ljava/lang/Runnable;", "onPostExecute", "j", "Ljava/io/File;", C17296a.f69688o, "Ljava/io/File;", DateTokenConverter.CONVERTER_KEY, "()Ljava/io/File;", "k", "(Ljava/io/File;)V", "ruleFile", "LPU2;", "b", "LPU2;", "c", "()LPU2;", "i", "(LPU2;)V", RequestHeadersFactory.MODEL, "Ljava/lang/Runnable;", "", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setUseCase", "(Ljava/lang/String;)V", "useCase", "e", "setAssetUri", "assetUri", "f", "setRuleUri", "ruleUri", "", "I", "h", "()I", "setVersionId", "(I)V", "versionId", "", "[F", "()[F", "setThresholds", "([F)V", "thresholds", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: aV2$b */
    /* loaded from: classes5.dex */
    public static final class C10719b {

        /* renamed from: i */
        public static final C10720a f50556i = new C10720a(null);

        /* renamed from: a */
        public File f50557a;

        /* renamed from: b */
        public PU2 f50558b;

        /* renamed from: c */
        public Runnable f50559c;

        /* renamed from: d */
        public String f50560d;

        /* renamed from: e */
        public String f50561e;

        /* renamed from: f */
        public String f50562f;

        /* renamed from: g */
        public int f50563g;

        /* renamed from: h */
        public float[] f50564h;

        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\"\u0010\u0014\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¨\u0006\u0017"}, m28432d2 = {"LaV2$b$a;", "", "Lorg/json/JSONObject;", "json", "LaV2$b;", "b", "master", "", "slaves", "", "e", "", "useCase", "", "versionId", "c", "uri", "name", "Ljl1$a;", "onComplete", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
        /* renamed from: aV2$b$a */
        /* loaded from: classes5.dex */
        public static final class C10720a {

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Ljava/io/File;", "file", "", C17296a.f69688o, "(Ljava/io/File;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
            /* renamed from: aV2$b$a$a */
            /* loaded from: classes5.dex */
            public static final class C10721a implements AsyncTaskC43496jl1.InterfaceC25004a {

                /* renamed from: a */
                public final /* synthetic */ List f50565a;

                @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Ljava/io/File;", "file", "", C17296a.f69688o, "(Ljava/io/File;)V"}, m28431k = 3, m28430mv = {1, 4, 0})
                /* renamed from: aV2$b$a$a$a */
                /* loaded from: classes5.dex */
                public static final class C10722a implements AsyncTaskC43496jl1.InterfaceC25004a {

                    /* renamed from: a */
                    public final /* synthetic */ C10719b f50566a;

                    /* renamed from: b */
                    public final /* synthetic */ PU2 f50567b;

                    public C10722a(C10719b c10719b, PU2 pu2) {
                        this.f50566a = c10719b;
                        this.f50567b = pu2;
                    }

                    @Override // p000.AsyncTaskC43496jl1.InterfaceC25004a
                    /* renamed from: a */
                    public final void mo29999a(File file) {
                        Intrinsics.checkNotNullParameter(file, "file");
                        this.f50566a.m71286i(this.f50567b);
                        this.f50566a.m71284k(file);
                        Runnable runnable = this.f50566a.f50559c;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }

                public C10721a(List list) {
                    this.f50565a = list;
                }

                @Override // p000.AsyncTaskC43496jl1.InterfaceC25004a
                /* renamed from: a */
                public final void mo29999a(File file) {
                    Intrinsics.checkNotNullParameter(file, "file");
                    PU2 m90200a = PU2.f28562n.m90200a(file);
                    if (m90200a != null) {
                        for (C10719b c10719b : this.f50565a) {
                            C10719b.f50556i.m71280d(c10719b.m71290e(), c10719b.m71288g() + "_" + c10719b.m71287h() + "_rule", new C10722a(c10719b, m90200a));
                        }
                    }
                }
            }

            private C10720a() {
            }

            /* renamed from: b */
            public final C10719b m71282b(JSONObject jSONObject) {
                String useCase;
                String assetUri;
                String optString;
                int i;
                float[] m71309e;
                if (jSONObject != null) {
                    try {
                        useCase = jSONObject.getString("use_case");
                        assetUri = jSONObject.getString("asset_uri");
                        optString = jSONObject.optString("rules_uri", null);
                        i = jSONObject.getInt(TransferTable.COLUMN_VERSION_ID);
                        m71309e = C37988aV2.m71309e(C37988aV2.f50552d, jSONObject.getJSONArray("thresholds"));
                        Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                        Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    } catch (Exception unused) {
                        return null;
                    }
                }
                return new C10719b(useCase, assetUri, optString, i, m71309e);
            }

            /* renamed from: c */
            public final void m71281c(String str, int i) {
                File[] listFiles;
                boolean z;
                boolean startsWith$default;
                boolean startsWith$default2;
                File m95006a = C34499Mi6.m95006a();
                if (m95006a != null && (listFiles = m95006a.listFiles()) != null) {
                    if (listFiles.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        String str2 = str + "_" + i;
                        for (File f : listFiles) {
                            Intrinsics.checkNotNullExpressionValue(f, "f");
                            String name = f.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "name");
                            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, str, false, 2, null);
                            if (startsWith$default) {
                                startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(name, str2, false, 2, null);
                                if (!startsWith$default2) {
                                    f.delete();
                                }
                            }
                        }
                    }
                }
            }

            /* renamed from: d */
            public final void m71280d(String str, String str2, AsyncTaskC43496jl1.InterfaceC25004a interfaceC25004a) {
                File file = new File(C34499Mi6.m95006a(), str2);
                if (str != null && !file.exists()) {
                    new AsyncTaskC43496jl1(str, file, interfaceC25004a).execute(new String[0]);
                } else {
                    interfaceC25004a.mo29999a(file);
                }
            }

            /* renamed from: e */
            public final void m71279e(C10719b master, List<C10719b> slaves) {
                Intrinsics.checkNotNullParameter(master, "master");
                Intrinsics.checkNotNullParameter(slaves, "slaves");
                m71281c(master.m71288g(), master.m71287h());
                m71280d(master.m71293b(), master.m71288g() + "_" + master.m71287h(), new C10721a(slaves));
            }

            public /* synthetic */ C10720a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C10719b(String useCase, String assetUri, String str, int i, float[] fArr) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.f50560d = useCase;
            this.f50561e = assetUri;
            this.f50562f = str;
            this.f50563g = i;
            this.f50564h = fArr;
        }

        /* renamed from: b */
        public final String m71293b() {
            return this.f50561e;
        }

        /* renamed from: c */
        public final PU2 m71292c() {
            return this.f50558b;
        }

        /* renamed from: d */
        public final File m71291d() {
            return this.f50557a;
        }

        /* renamed from: e */
        public final String m71290e() {
            return this.f50562f;
        }

        /* renamed from: f */
        public final float[] m71289f() {
            return this.f50564h;
        }

        /* renamed from: g */
        public final String m71288g() {
            return this.f50560d;
        }

        /* renamed from: h */
        public final int m71287h() {
            return this.f50563g;
        }

        /* renamed from: i */
        public final void m71286i(PU2 pu2) {
            this.f50558b = pu2;
        }

        /* renamed from: j */
        public final C10719b m71285j(Runnable runnable) {
            this.f50559c = runnable;
            return this;
        }

        /* renamed from: k */
        public final void m71284k(File file) {
            this.f50557a = file;
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: aV2$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC10723c implements Runnable {

        /* renamed from: b */
        public static final RunnableC10723c f50568b = new RunnableC10723c();

        /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: all -> 0x007e, Exception -> 0x0082, TryCatch #1 {Exception -> 0x0082, blocks: (B:8:0x0012, B:10:0x0024, B:15:0x002e, B:17:0x0039, B:19:0x0047, B:21:0x004d, B:26:0x0074, B:23:0x0055, B:25:0x005d, B:16:0x0034), top: B:36:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            JSONObject jSONObject;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                try {
                    boolean z = false;
                    SharedPreferences sharedPreferences = C17216a.m52741e().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                    String string = sharedPreferences.getString("models", null);
                    if (string != null) {
                        if (string.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            jSONObject = new JSONObject(string);
                            long j = sharedPreferences.getLong("model_request_timestamp", 0L);
                            if (C32172Ck1.m111754g(C32172Ck1.EnumC1165b.ModelRequest) || jSONObject.length() == 0 || !C37988aV2.m71310d(C37988aV2.f50552d, j)) {
                                jSONObject = C37988aV2.m71311c(C37988aV2.f50552d);
                                if (jSONObject == null) {
                                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                                } else {
                                    return;
                                }
                            }
                            C37988aV2 c37988aV2 = C37988aV2.f50552d;
                            C37988aV2.m71313a(c37988aV2, jSONObject);
                            C37988aV2.m71312b(c37988aV2);
                            return;
                        }
                    }
                    jSONObject = new JSONObject();
                    long j2 = sharedPreferences.getLong("model_request_timestamp", 0L);
                    if (C32172Ck1.m111754g(C32172Ck1.EnumC1165b.ModelRequest)) {
                    }
                    jSONObject = C37988aV2.m71311c(C37988aV2.f50552d);
                    if (jSONObject == null) {
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: aV2$d */
    /* loaded from: classes5.dex */
    public static final class RunnableC10724d implements Runnable {

        /* renamed from: b */
        public static final RunnableC10724d f50569b = new RunnableC10724d();

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                QU5.m88468c();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: aV2$e */
    /* loaded from: classes5.dex */
    public static final class RunnableC10725e implements Runnable {

        /* renamed from: b */
        public static final RunnableC10725e f50570b = new RunnableC10725e();

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                T52.m84361a();
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    static {
        List<String> listOf;
        List<String> listOf2;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{LegacyRepairType.OTHER_KEY, "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});
        f50550b = listOf;
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"none", PaymentMethod.BillingDetails.PARAM_ADDRESS, "health"});
        f50551c = listOf2;
    }

    private C37988aV2() {
    }

    /* renamed from: a */
    public static final /* synthetic */ void m71313a(C37988aV2 c37988aV2, JSONObject jSONObject) {
        if (TD0.m84203d(C37988aV2.class)) {
            return;
        }
        try {
            c37988aV2.m71308f(jSONObject);
        } catch (Throwable th) {
            TD0.m84205b(th, C37988aV2.class);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m71312b(C37988aV2 c37988aV2) {
        if (TD0.m84203d(C37988aV2.class)) {
            return;
        }
        try {
            c37988aV2.m71306h();
        } catch (Throwable th) {
            TD0.m84205b(th, C37988aV2.class);
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ JSONObject m71311c(C37988aV2 c37988aV2) {
        if (TD0.m84203d(C37988aV2.class)) {
            return null;
        }
        try {
            return c37988aV2.m71305i();
        } catch (Throwable th) {
            TD0.m84205b(th, C37988aV2.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ boolean m71310d(C37988aV2 c37988aV2, long j) {
        if (TD0.m84203d(C37988aV2.class)) {
            return false;
        }
        try {
            return c37988aV2.m71302l(j);
        } catch (Throwable th) {
            TD0.m84205b(th, C37988aV2.class);
            return false;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ float[] m71309e(C37988aV2 c37988aV2, JSONArray jSONArray) {
        if (TD0.m84203d(C37988aV2.class)) {
            return null;
        }
        try {
            return c37988aV2.m71301m(jSONArray);
        } catch (Throwable th) {
            TD0.m84205b(th, C37988aV2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final void m71307g() {
        if (TD0.m84203d(C37988aV2.class)) {
            return;
        }
        try {
            C52364yi6.m2818q0(RunnableC10723c.f50568b);
        } catch (Throwable th) {
            TD0.m84205b(th, C37988aV2.class);
        }
    }

    @JvmStatic
    /* renamed from: j */
    public static final File m71304j(EnumC10718a task) {
        if (TD0.m84203d(C37988aV2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            C10719b c10719b = f50549a.get(task.m71295b());
            if (c10719b == null) {
                return null;
            }
            return c10719b.m71291d();
        } catch (Throwable th) {
            TD0.m84205b(th, C37988aV2.class);
            return null;
        }
    }

    @JvmStatic
    /* renamed from: o */
    public static final String[] m71299o(EnumC10718a task, float[][] denses, String[] texts) {
        PU2 m71292c;
        boolean z;
        if (TD0.m84203d(C37988aV2.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            C10719b c10719b = f50549a.get(task.m71295b());
            if (c10719b == null || (m71292c = c10719b.m71292c()) == null) {
                return null;
            }
            float[] m71289f = c10719b.m71289f();
            int length = texts.length;
            boolean z2 = false;
            int length2 = denses[0].length;
            UE2 ue2 = new UE2(new int[]{length, length2});
            for (int i = 0; i < length; i++) {
                System.arraycopy(denses[i], 0, ue2.m81798a(), i * length2, length2);
            }
            UE2 m90201b = m71292c.m90201b(ue2, texts, task.m71296a());
            if (m90201b != null && m71289f != null) {
                if (m90201b.m81798a().length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (m71289f.length == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        int i2 = C38581bV2.$EnumSwitchMapping$0[task.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                return f50552d.m71298p(m90201b, m71289f);
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        return f50552d.m71297q(m90201b, m71289f);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            TD0.m84205b(th, C37988aV2.class);
            return null;
        }
    }

    /* renamed from: f */
    public final void m71308f(JSONObject jSONObject) {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    C10719b m71282b = C10719b.f50556i.m71282b(jSONObject.getJSONObject(keys.next()));
                    if (m71282b != null) {
                        f50549a.put(m71282b.m71288g(), m71282b);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: h */
    public final void m71306h() {
        if (TD0.m84203d(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            String str = null;
            int i = 0;
            for (Map.Entry<String, C10719b> entry : f50549a.entrySet()) {
                String key = entry.getKey();
                C10719b value = entry.getValue();
                if (Intrinsics.areEqual(key, EnumC10718a.MTML_APP_EVENT_PREDICTION.m71295b())) {
                    str = value.m71293b();
                    i = Math.max(i, value.m71287h());
                    if (C32172Ck1.m111754g(C32172Ck1.EnumC1165b.SuggestedEvents) && m71303k()) {
                        arrayList.add(value.m71285j(RunnableC10724d.f50569b));
                    }
                }
                if (Intrinsics.areEqual(key, EnumC10718a.MTML_INTEGRITY_DETECT.m71295b())) {
                    String m71293b = value.m71293b();
                    int max = Math.max(i, value.m71287h());
                    if (C32172Ck1.m111754g(C32172Ck1.EnumC1165b.IntelligentIntegrity)) {
                        arrayList.add(value.m71285j(RunnableC10725e.f50570b));
                    }
                    str = m71293b;
                    i = max;
                }
            }
            if (str != null && i > 0 && !arrayList.isEmpty()) {
                C10719b.f50556i.m71279e(new C10719b("MTML", str, null, i, null), arrayList);
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
        }
    }

    /* renamed from: i */
    public final JSONObject m71305i() {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            String[] strArr = {"use_case", TransferTable.COLUMN_VERSION_ID, "asset_uri", "rules_uri", "thresholds"};
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", strArr));
            GraphRequest.C17206c c17206c = GraphRequest.f69390s;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s/model_asset", Arrays.copyOf(new Object[]{C17216a.m52740f()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            GraphRequest m52781w = c17206c.m52781w(null, format, null);
            m52781w.m52849D(true);
            m52781w.m52850C(bundle);
            JSONObject m78703c = m52781w.m52837j().m78703c();
            if (m78703c == null) {
                return null;
            }
            return m71300n(m78703c);
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: k */
    public final boolean m71303k() {
        boolean contains$default;
        if (TD0.m84203d(this)) {
            return false;
        }
        try {
            Locale m2875C = C52364yi6.m2875C();
            if (m2875C != null) {
                String language = m2875C.getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) language, (CharSequence) "en", false, 2, (Object) null);
                if (!contains$default) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m71302l(long j) {
        if (TD0.m84203d(this) || j == 0) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - j >= 259200000) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return false;
        }
    }

    /* renamed from: m */
    public final float[] m71301m(JSONArray jSONArray) {
        if (TD0.m84203d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    fArr[i] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: n */
    public final JSONObject m71300n(JSONObject jSONObject) {
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(MessageExtension.FIELD_DATA);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(TransferTable.COLUMN_VERSION_ID, jSONObject3.getString(TransferTable.COLUMN_VERSION_ID));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: p */
    public final String[] m71298p(UE2 ue2, float[] fArr) {
        IntRange until;
        int collectionSizeOrDefault;
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            int m81797b = ue2.m81797b(0);
            int m81797b2 = ue2.m81797b(1);
            float[] m81798a = ue2.m81798a();
            if (m81797b2 != fArr.length) {
                return null;
            }
            until = RangesKt___RangesKt.until(0, m81797b);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                String str = "none";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (m81798a[(nextInt * m81797b2) + i2] >= fArr[i]) {
                        str = f50551c.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }

    /* renamed from: q */
    public final String[] m71297q(UE2 ue2, float[] fArr) {
        IntRange until;
        int collectionSizeOrDefault;
        if (TD0.m84203d(this)) {
            return null;
        }
        try {
            int m81797b = ue2.m81797b(0);
            int m81797b2 = ue2.m81797b(1);
            float[] m81798a = ue2.m81798a();
            if (m81797b2 != fArr.length) {
                return null;
            }
            until = RangesKt___RangesKt.until(0, m81797b);
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                String str = LegacyRepairType.OTHER_KEY;
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (m81798a[(nextInt * m81797b2) + i2] >= fArr[i]) {
                        str = f50550b.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            TD0.m84205b(th, this);
            return null;
        }
    }
}
