package p000;

import android.graphics.Color;
import bo.app.C12519a3;
import bo.app.C12547b3;
import bo.app.C12580d3;
import bo.app.C12749j;
import bo.app.C13109s0;
import bo.app.InterfaceC13160u1;
import bo.app.InterfaceC13231y1;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IteratorsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001MB\t\b\u0014¢\u0006\u0004\bC\u0010DB\u0019\b\u0016\u0012\u0006\u0010E\u001a\u00020\n\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bC\u0010HBI\b\u0012\u0012\u0006\u0010E\u001a\u00020\n\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010\u001f\u001a\u00020\u0018\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010.\u001a\u00020'\u0012\u0006\u0010=\u001a\u000206\u0012\u0006\u0010J\u001a\u000206¢\u0006\u0004\bC\u0010KJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030 8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00105\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010\u001a¨\u0006N"}, m28432d2 = {"LsZ1;", "LFZ1;", "LAO1;", "LmT2;", "messageButton", "", "L", "", "q0", "v", "Lorg/json/JSONObject;", "z", "", "F", "I", "z0", "()I", "E0", "(I)V", "headerTextColor", "G", "w0", "A0", "closeButtonColor", "", "H", "Ljava/lang/String;", "E", "()Ljava/lang/String;", "C0", "(Ljava/lang/String;)V", "header", "", "Ljava/util/List;", "M", "()Ljava/util/List;", "G0", "(Ljava/util/List;)V", "messageButtons", "LZX1;", "J", "LZX1;", "Y", "()LZX1;", "F0", "(LZX1;)V", "imageStyle", "K", "Ljava/lang/Integer;", "x0", "()Ljava/lang/Integer;", "B0", "(Ljava/lang/Integer;)V", "frameColor", "Ls06;", "P", "Ls06;", "y0", "()Ls06;", "D0", "(Ls06;)V", "headerTextAlign", "Q", "Z", "wasButtonClickLogged", "R", "buttonIdClicked", "<init>", "()V", "jsonObject", "Lbo/app/y1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/y1;)V", "appboyManager", "messageTextAlign", "(Lorg/json/JSONObject;Lbo/app/y1;Ljava/lang/String;IILZX1;Ls06;Ls06;)V", "S", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: sZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC48713sZ1 extends FZ1 implements AO1 {

    /* renamed from: S */
    public static final C28344a f108968S = new C28344a(null);

    /* renamed from: F */
    public int f108969F;

    /* renamed from: G */
    public int f108970G;

    /* renamed from: H */
    public String f108971H;

    /* renamed from: I */
    public List<? extends C45103mT2> f108972I;

    /* renamed from: J */
    public ZX1 f108973J;

    /* renamed from: K */
    public Integer f108974K;

    /* renamed from: P */
    public EnumC48393s06 f108975P;

    /* renamed from: Q */
    public boolean f108976Q;

    /* renamed from: R */
    public String f108977R;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, m28432d2 = {"LsZ1$a;", "", "", "BUTTONS", "Ljava/lang/String;", "CLOSE_BUTTON_COLOR", "FRAME_COLOR", "HEADER", "HEADER_TEXT_ALIGN", "HEADER_TEXT_COLOR", "IMAGE_STYLE", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: sZ1$a */
    /* loaded from: classes2.dex */
    public static final class C28344a {
        public /* synthetic */ C28344a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28344a() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: sZ1$b */
    /* loaded from: classes2.dex */
    public static final class C28345b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C28345b f108978g = new C28345b();

        public C28345b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: sZ1$c */
    /* loaded from: classes2.dex */
    public static final class C28346c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C28346c f108979g = new C28346c();

        public C28346c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging button click.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: sZ1$d */
    /* loaded from: classes2.dex */
    public static final class C28347d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C28347d f108980g = new C28347d();

        public C28347d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Button click already logged for this message. Ignoring.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: sZ1$e */
    /* loaded from: classes2.dex */
    public static final class C28348e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C28348e f108981g = new C28348e();

        public C28348e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot log a button click because the AppboyManager is null.";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "it", "", C17296a.f69688o, "(I)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: sZ1$f */
    /* loaded from: classes2.dex */
    public static final class C28349f extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ JSONArray f108982g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28349f(JSONArray jSONArray) {
            super(1);
            this.f108982g = jSONArray;
        }

        /* renamed from: a */
        public final Boolean m14005a(int i) {
            return Boolean.valueOf(this.f108982g.opt(i) instanceof JSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return m14005a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "", "it", C17296a.f69688o, "(I)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: sZ1$g */
    /* loaded from: classes2.dex */
    public static final class C28350g extends Lambda implements Function1<Integer, JSONObject> {

        /* renamed from: g */
        public final /* synthetic */ JSONArray f108983g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28350g(JSONArray jSONArray) {
            super(1);
            this.f108983g = jSONArray;
        }

        /* renamed from: a */
        public final JSONObject m14004a(int i) {
            Object obj = this.f108983g.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [org.json.JSONObject, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ JSONObject invoke(Integer num) {
            return m14004a(num.intValue());
        }
    }

    public AbstractC48713sZ1() {
        List<? extends C45103mT2> emptyList;
        this.f108969F = Color.parseColor("#333333");
        this.f108970G = Color.parseColor("#9B9B9B");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f108972I = emptyList;
        this.f108973J = ZX1.TOP;
        this.f108975P = EnumC48393s06.CENTER;
    }

    /* renamed from: A0 */
    public void m14025A0(int i) {
        this.f108970G = i;
    }

    /* renamed from: B0 */
    public void m14024B0(Integer num) {
        this.f108974K = num;
    }

    /* renamed from: C0 */
    public void m14023C0(String str) {
        this.f108971H = str;
    }

    /* renamed from: D0 */
    public void m14022D0(EnumC48393s06 enumC48393s06) {
        Intrinsics.checkNotNullParameter(enumC48393s06, "<set-?>");
        this.f108975P = enumC48393s06;
    }

    @Override // p000.AO1
    /* renamed from: E */
    public String mo14021E() {
        return this.f108971H;
    }

    /* renamed from: E0 */
    public void m14020E0(int i) {
        this.f108969F = i;
    }

    /* renamed from: F0 */
    public void m14019F0(ZX1 zx1) {
        Intrinsics.checkNotNullParameter(zx1, "<set-?>");
        this.f108973J = zx1;
    }

    /* renamed from: G0 */
    public void m14018G0(List<? extends C45103mT2> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f108972I = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // p000.AO1
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo14017L(C45103mT2 messageButton) {
        boolean z;
        boolean isBlank;
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        InterfaceC13231y1 m36217A = m36217A();
        String m36213G = m36213G();
        if (m36213G != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(m36213G);
            if (!isBlank) {
                z = false;
                if (!z) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C28346c.f108979g, 7, null);
                    return false;
                } else if (this.f108976Q) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, C28347d.f108980g, 6, null);
                    return false;
                } else if (m36217A == null) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C28348e.f108981g, 6, null);
                    return false;
                } else {
                    this.f108977R = messageButton.m25548y();
                    InterfaceC13160u1 m63563a = C12749j.f58647h.m63563a(m36213G, messageButton);
                    if (m63563a != null) {
                        m36217A.mo62756a(m63563a);
                    }
                    this.f108976Q = true;
                    return true;
                }
            }
        }
        z = true;
        if (!z) {
        }
    }

    @Override // p000.AO1
    /* renamed from: M */
    public List<C45103mT2> mo14016M() {
        return this.f108972I;
    }

    @Override // p000.AO1
    /* renamed from: Y */
    public ZX1 mo14015Y() {
        return this.f108973J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r1 != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC42191hZ1, p000.InterfaceC50985wO1
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo6934q0() {
        boolean z;
        boolean isBlank;
        boolean isBlank2;
        super.mo6934q0();
        InterfaceC13231y1 m36217A = m36217A();
        if (this.f108976Q) {
            String m36213G = m36213G();
            boolean z2 = false;
            if (m36213G != null) {
                isBlank2 = StringsKt__StringsJVMKt.isBlank(m36213G);
                if (!isBlank2) {
                    z = false;
                    if (z) {
                        String str = this.f108977R;
                        if (str != null) {
                            isBlank = StringsKt__StringsJVMKt.isBlank(str);
                        }
                        z2 = true;
                        if (!z2 && m36217A != null) {
                            m36217A.mo62757a(new C12519a3(m36213G(), this.f108977R));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            z = true;
            if (z) {
            }
        }
    }

    @Override // p000.AbstractC42191hZ1, p000.DO1
    /* renamed from: v */
    public void mo14014v() {
        super.mo14014v();
        C12580d3 m36216B = m36216B();
        if (m36216B == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C28345b.f108978g, 7, null);
            return;
        }
        if (m36216B.m63849c() != null) {
            m14024B0(m36216B.m63849c());
        }
        if (m36216B.m63850b() != null) {
            m14025A0(m36216B.m63850b().intValue());
        }
        if (m36216B.m63848d() != null) {
            m14020E0(m36216B.m63848d().intValue());
        }
        for (C45103mT2 c45103mT2 : mo14016M()) {
            c45103mT2.mo14014v();
        }
    }

    /* renamed from: w0 */
    public int m14013w0() {
        return this.f108970G;
    }

    /* renamed from: x0 */
    public Integer m14012x0() {
        return this.f108974K;
    }

    /* renamed from: y0 */
    public EnumC48393s06 m14011y0() {
        return this.f108975P;
    }

    @Override // p000.FZ1, p000.AbstractC42191hZ1, p000.InterfaceC37933aP1
    /* renamed from: z */
    public JSONObject forJsonPut() {
        JSONObject m36215C = m36215C();
        if (m36215C == null) {
            m36215C = super.forJsonPut();
            try {
                m36215C.putOpt("header", mo14021E());
                m36215C.put("header_text_color", m14010z0());
                m36215C.put("close_btn_color", m14013w0());
                m36215C.putOpt("image_style", mo14015Y().toString());
                m36215C.putOpt("text_align_header", m14011y0().toString());
                Integer m14012x0 = m14012x0();
                if (m14012x0 != null) {
                    m36215C.put("frame_color", m14012x0.intValue());
                }
                JSONArray jSONArray = new JSONArray();
                for (C45103mT2 c45103mT2 : mo14016M()) {
                    jSONArray.put(c45103mT2.forJsonPut());
                }
                m36215C.put("btns", jSONArray);
            } catch (JSONException unused) {
            }
        }
        return m36215C;
    }

    /* renamed from: z0 */
    public int m14010z0() {
        return this.f108969F;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC48713sZ1(JSONObject jsonObject, InterfaceC13231y1 brazeManager) {
        this(jsonObject, brazeManager, r4, r6, r7, r15, r14, r8);
        ZX1 zx1;
        EnumC48393s06 enumC48393s06;
        IntRange until;
        Sequence asSequence;
        Sequence filter;
        Sequence map;
        Iterator it;
        Iterator withIndex;
        List emptyList;
        String upperCase;
        EnumC48393s06[] values;
        int length;
        int i;
        String upperCase2;
        EnumC48393s06[] values2;
        int length2;
        int i2;
        String upperCase3;
        ZX1[] values3;
        int length3;
        int i3;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        String optString = jsonObject.optString("header");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(HEADER)");
        int optInt = jsonObject.optInt("header_text_color");
        int optInt2 = jsonObject.optInt("close_btn_color");
        ZX1 zx12 = ZX1.TOP;
        try {
            C13109s0 c13109s0 = C13109s0.f59272a;
            String string = jsonObject.getString("image_style");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase3 = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(locale)");
            values3 = ZX1.values();
            length3 = values3.length;
            i3 = 0;
        } catch (Exception unused) {
            zx1 = zx12;
        }
        while (i3 < length3) {
            zx1 = values3[i3];
            i3++;
            if (Intrinsics.areEqual(zx1.name(), upperCase3)) {
                EnumC48393s06 enumC48393s062 = EnumC48393s06.CENTER;
                try {
                    C13109s0 c13109s02 = C13109s0.f59272a;
                    String string2 = jsonObject.getString("text_align_header");
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(key)");
                    Locale US2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US2, "US");
                    upperCase2 = string2.toUpperCase(US2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                    values2 = EnumC48393s06.values();
                    length2 = values2.length;
                    i2 = 0;
                } catch (Exception unused2) {
                    enumC48393s06 = enumC48393s062;
                }
                while (i2 < length2) {
                    enumC48393s06 = values2[i2];
                    i2++;
                    if (Intrinsics.areEqual(enumC48393s06.name(), upperCase2)) {
                        EnumC48393s06 enumC48393s063 = EnumC48393s06.CENTER;
                        try {
                            C13109s0 c13109s03 = C13109s0.f59272a;
                            String string3 = jsonObject.getString("text_align_message");
                            Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(key)");
                            Locale US3 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US3, "US");
                            upperCase = string3.toUpperCase(US3);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                            values = EnumC48393s06.values();
                            length = values.length;
                            i = 0;
                        } catch (Exception unused3) {
                        }
                        while (i < length) {
                            EnumC48393s06 enumC48393s064 = values[i];
                            i++;
                            if (Intrinsics.areEqual(enumC48393s064.name(), upperCase)) {
                                enumC48393s063 = enumC48393s064;
                                JSONArray optJSONArray = jsonObject.optJSONArray("btns");
                                JSONArray m63892b = C12547b3.m63892b(jsonObject);
                                ArrayList arrayList = new ArrayList();
                                if (optJSONArray == null) {
                                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                                    it = emptyList.iterator();
                                } else {
                                    until = RangesKt___RangesKt.until(0, optJSONArray.length());
                                    asSequence = CollectionsKt___CollectionsKt.asSequence(until);
                                    filter = SequencesKt___SequencesKt.filter(asSequence, new C28349f(optJSONArray));
                                    map = SequencesKt___SequencesKt.map(filter, new C28350g(optJSONArray));
                                    it = map.iterator();
                                }
                                withIndex = CollectionsKt__IteratorsKt.withIndex(it);
                                while (withIndex.hasNext()) {
                                    IndexedValue indexedValue = (IndexedValue) withIndex.next();
                                    arrayList.add(new C45103mT2((JSONObject) indexedValue.getValue(), m63892b.optJSONObject(indexedValue.getIndex())));
                                }
                                m14018G0(arrayList);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public AbstractC48713sZ1(JSONObject jSONObject, InterfaceC13231y1 interfaceC13231y1, String str, int i, int i2, ZX1 zx1, EnumC48393s06 enumC48393s06, EnumC48393s06 enumC48393s062) {
        super(jSONObject, interfaceC13231y1);
        List<? extends C45103mT2> emptyList;
        this.f108969F = Color.parseColor("#333333");
        this.f108970G = Color.parseColor("#9B9B9B");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f108972I = emptyList;
        this.f108973J = ZX1.TOP;
        this.f108975P = EnumC48393s06.CENTER;
        m14023C0(str);
        m14020E0(i);
        m14025A0(i2);
        if (jSONObject.has("frame_color")) {
            m14024B0(Integer.valueOf(jSONObject.optInt("frame_color")));
        }
        m14019F0(zx1);
        m14022D0(enumC48393s06);
        m36203n0(enumC48393s062);
    }
}
