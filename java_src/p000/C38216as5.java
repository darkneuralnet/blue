package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b@\u0010AR5\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR)\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR)\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bRS\u0010\u001c\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00070\u00140\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR/\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000bR>\u0010#\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\"\u0010\u000bR;\u0010&\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070$0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b%\u0010\u000bR/\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00070\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b(\u0010\u000bR)\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b\b\u0010\u000bR)\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b\u0011\u0010\u000bR)\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b/\u0010\u000bR)\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b\u001e\u0010\u000bR)\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\t\u001a\u0004\b3\u0010\u000bR)\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b5\u0010\t\u001a\u0004\b\u001a\u0010\u000bR)\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b5\u0010\u000bR#\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\t\u001a\u0004\b\u000e\u0010\u000bR)\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b1\u0010\u000bR)\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b,\u0010\u000bR)\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b*\u0010\u000bR)\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00030\u00028\u0006¢\u0006\f\n\u0004\b>\u0010\t\u001a\u0004\b.\u0010\u000b¨\u0006B"}, m28432d2 = {"Las5;", "", "Lrs5;", "LK1;", "Lkotlin/Function1;", "", "Li26;", "", "b", "Lrs5;", "g", "()Lrs5;", "GetTextLayoutResult", "Lkotlin/Function0;", "c", "h", "OnClick", DateTokenConverter.CONVERTER_KEY, "i", "OnLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "x", "y", "e", "p", "ScrollBy", "", "f", "q", "ScrollToIndex", "progress", "r", "SetProgress", "Lkotlin/Function3;", "s", "SetSelection", "LDf;", "t", "SetText", "j", "CopyText", "k", "CutText", "l", "n", "PasteText", "m", "Expand", C17296a.f69688o, "Collapse", "o", "Dismiss", "RequestFocus", "", "LlF0;", "CustomActions", "PageUp", "PageLeft", "PageDown", "u", "PageRight", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1195:1\n432#2,3:1196\n432#2,3:1199\n432#2,3:1202\n432#2,3:1205\n432#2,3:1208\n432#2,3:1211\n432#2,3:1214\n432#2,3:1217\n432#2,3:1220\n432#2,3:1223\n432#2,3:1226\n432#2,3:1229\n432#2,3:1232\n432#2,3:1235\n432#2,3:1238\n432#2,3:1241\n432#2,3:1244\n432#2,3:1247\n432#2,3:1250\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n238#1:1196,3\n243#1:1199,3\n248#1:1202,3\n253#1:1205,3\n258#1:1208,3\n263#1:1211,3\n268#1:1214,3\n273#1:1217,3\n278#1:1220,3\n283#1:1223,3\n288#1:1226,3\n293#1:1229,3\n298#1:1232,3\n303#1:1235,3\n308#1:1238,3\n319#1:1241,3\n324#1:1244,3\n329#1:1247,3\n334#1:1250,3\n*E\n"})
/* renamed from: as5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38216as5 {

    /* renamed from: a */
    public static final C38216as5 f56452a = new C38216as5();

    /* renamed from: b */
    public static final C48314rs5<C4297K1<Function1<List<C42484i26>, Boolean>>> f56453b;

    /* renamed from: c */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56454c;

    /* renamed from: d */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56455d;

    /* renamed from: e */
    public static final C48314rs5<C4297K1<Function2<Float, Float, Boolean>>> f56456e;

    /* renamed from: f */
    public static final C48314rs5<C4297K1<Function1<Integer, Boolean>>> f56457f;

    /* renamed from: g */
    public static final C48314rs5<C4297K1<Function1<Float, Boolean>>> f56458g;

    /* renamed from: h */
    public static final C48314rs5<C4297K1<Function3<Integer, Integer, Boolean, Boolean>>> f56459h;

    /* renamed from: i */
    public static final C48314rs5<C4297K1<Function1<C1577Df, Boolean>>> f56460i;

    /* renamed from: j */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56461j;

    /* renamed from: k */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56462k;

    /* renamed from: l */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56463l;

    /* renamed from: m */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56464m;

    /* renamed from: n */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56465n;

    /* renamed from: o */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56466o;

    /* renamed from: p */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56467p;

    /* renamed from: q */
    public static final C48314rs5<List<C44382lF0>> f56468q;

    /* renamed from: r */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56469r;

    /* renamed from: s */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56470s;

    /* renamed from: t */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56471t;

    /* renamed from: u */
    public static final C48314rs5<C4297K1<Function0<Boolean>>> f56472u;

    static {
        C46535os5 c46535os5 = C46535os5.f102688g;
        f56453b = new C48314rs5<>("GetTextLayoutResult", c46535os5);
        f56454c = new C48314rs5<>("OnClick", c46535os5);
        f56455d = new C48314rs5<>("OnLongClick", c46535os5);
        f56456e = new C48314rs5<>("ScrollBy", c46535os5);
        f56457f = new C48314rs5<>("ScrollToIndex", c46535os5);
        f56458g = new C48314rs5<>("SetProgress", c46535os5);
        f56459h = new C48314rs5<>("SetSelection", c46535os5);
        f56460i = new C48314rs5<>("SetText", c46535os5);
        f56461j = new C48314rs5<>("CopyText", c46535os5);
        f56462k = new C48314rs5<>("CutText", c46535os5);
        f56463l = new C48314rs5<>("PasteText", c46535os5);
        f56464m = new C48314rs5<>("Expand", c46535os5);
        f56465n = new C48314rs5<>("Collapse", c46535os5);
        f56466o = new C48314rs5<>("Dismiss", c46535os5);
        f56467p = new C48314rs5<>("RequestFocus", c46535os5);
        f56468q = new C48314rs5<>("CustomActions", null, 2, null);
        f56469r = new C48314rs5<>("PageUp", c46535os5);
        f56470s = new C48314rs5<>("PageLeft", c46535os5);
        f56471t = new C48314rs5<>("PageDown", c46535os5);
        f56472u = new C48314rs5<>("PageRight", c46535os5);
    }

    private C38216as5() {
    }

    /* renamed from: a */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65370a() {
        return f56465n;
    }

    /* renamed from: b */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65369b() {
        return f56461j;
    }

    /* renamed from: c */
    public final C48314rs5<List<C44382lF0>> m65368c() {
        return f56468q;
    }

    /* renamed from: d */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65367d() {
        return f56462k;
    }

    /* renamed from: e */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65366e() {
        return f56466o;
    }

    /* renamed from: f */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65365f() {
        return f56464m;
    }

    /* renamed from: g */
    public final C48314rs5<C4297K1<Function1<List<C42484i26>, Boolean>>> m65364g() {
        return f56453b;
    }

    /* renamed from: h */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65363h() {
        return f56454c;
    }

    /* renamed from: i */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65362i() {
        return f56455d;
    }

    /* renamed from: j */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65361j() {
        return f56471t;
    }

    /* renamed from: k */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65360k() {
        return f56470s;
    }

    /* renamed from: l */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65359l() {
        return f56472u;
    }

    /* renamed from: m */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65358m() {
        return f56469r;
    }

    /* renamed from: n */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65357n() {
        return f56463l;
    }

    /* renamed from: o */
    public final C48314rs5<C4297K1<Function0<Boolean>>> m65356o() {
        return f56467p;
    }

    /* renamed from: p */
    public final C48314rs5<C4297K1<Function2<Float, Float, Boolean>>> m65355p() {
        return f56456e;
    }

    /* renamed from: q */
    public final C48314rs5<C4297K1<Function1<Integer, Boolean>>> m65354q() {
        return f56457f;
    }

    /* renamed from: r */
    public final C48314rs5<C4297K1<Function1<Float, Boolean>>> m65353r() {
        return f56458g;
    }

    /* renamed from: s */
    public final C48314rs5<C4297K1<Function3<Integer, Integer, Boolean, Boolean>>> m65352s() {
        return f56459h;
    }

    /* renamed from: t */
    public final C48314rs5<C4297K1<Function1<C1577Df, Boolean>>> m65351t() {
        return f56460i;
    }
}
