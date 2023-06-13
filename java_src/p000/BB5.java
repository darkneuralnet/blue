package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0004\u001a)\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\n\u001a-\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\n\u001aA\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0004\u001a!\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0004\u001a!\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0004\u001aA\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u0016\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007\u001a\u0016\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007\u001a\u0016\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007\u001a \u0010\"\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007\u001a-\u0010#\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0001H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\n\u001a\u0010\u0010%\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a\u0010\u0010&\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a\u0010\u0010'\u001a\u00020$2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u001a\u0018\u0010*\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020(2\u0006\u0010!\u001a\u00020 H\u0002\u001a\u0018\u0010,\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020+2\u0006\u0010!\u001a\u00020 H\u0002\u001a\u0018\u0010-\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002\"\u0014\u0010/\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010.\"\u0014\u00100\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010.\"\u0014\u00101\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010.\"\u0014\u00103\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00102\"\u0014\u00104\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00102\"\u0014\u00105\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00102\"\u0014\u00106\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00102\"\u0014\u00108\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00102\"\u0014\u00109\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006:"}, m28432d2 = {"LgV2;", "Lk61;", "width", "A", "(LgV2;F)LgV2;", "height", "o", "size", "w", "x", "(LgV2;FF)LgV2;", "min", "max", "B", "p", "minWidth", "minHeight", "maxWidth", "maxHeight", "y", "(LgV2;FFFF)LgV2;", "v", "r", "s", "t", "", "fraction", "m", "i", "k", "LK9;", "align", "", "unbounded", "D", "g", "LCl1;", "c", C17296a.f69688o, "b", "LK9$b;", "LXG6;", "f", "LK9$c;", DateTokenConverter.CONVERTER_KEY, "e", "LCl1;", "FillWholeMaxWidth", "FillWholeMaxHeight", "FillWholeMaxSize", "LXG6;", "WrapContentWidthCenter", "WrapContentWidthStart", "WrapContentHeightCenter", "WrapContentHeightTop", "h", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1024:1\n135#2:1025\n135#2:1026\n135#2:1027\n135#2:1028\n135#2:1029\n135#2:1030\n135#2:1031\n135#2:1032\n135#2:1033\n135#2:1034\n135#2:1035\n135#2:1036\n135#2:1037\n135#2:1038\n135#2:1039\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n61#1:1025\n85#1:1026\n111#1:1027\n138#1:1028\n176#1:1029\n199#1:1030\n226#1:1031\n257#1:1032\n285#1:1033\n315#1:1034\n342#1:1035\n381#1:1036\n405#1:1037\n434#1:1038\n619#1:1039\n*E\n"})
/* renamed from: BB5 */
/* loaded from: classes.dex */
public final class BB5 {

    /* renamed from: a */
    public static final C32181Cl1 f1981a = m114266c(1.0f);

    /* renamed from: b */
    public static final C32181Cl1 f1982b = m114268a(1.0f);

    /* renamed from: c */
    public static final C32181Cl1 f1983c = m114267b(1.0f);

    /* renamed from: d */
    public static final XG6 f1984d;

    /* renamed from: e */
    public static final XG6 f1985e;

    /* renamed from: f */
    public static final XG6 f1986f;

    /* renamed from: g */
    public static final XG6 f1987g;

    /* renamed from: h */
    public static final XG6 f1988h;

    /* renamed from: i */
    public static final XG6 f1989i;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB5$a */
    /* loaded from: classes.dex */
    public static final class C0551a extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f1990g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0551a(float f) {
            super(1);
            this.f1990g = f;
        }

        /* renamed from: a */
        public final void m114242a(S42 $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            $receiver.m86037b("fillMaxHeight");
            $receiver.m86038a().m104824a("fraction", Float.valueOf(this.f1990g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114242a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB5$b */
    /* loaded from: classes.dex */
    public static final class C0552b extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f1991g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0552b(float f) {
            super(1);
            this.f1991g = f;
        }

        /* renamed from: a */
        public final void m114241a(S42 $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            $receiver.m86037b("fillMaxSize");
            $receiver.m86038a().m104824a("fraction", Float.valueOf(this.f1991g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114241a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB5$c */
    /* loaded from: classes.dex */
    public static final class C0553c extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f1992g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0553c(float f) {
            super(1);
            this.f1992g = f;
        }

        /* renamed from: a */
        public final void m114240a(S42 $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            $receiver.m86037b("fillMaxWidth");
            $receiver.m86038a().m104824a("fraction", Float.valueOf(this.f1992g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114240a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LG52;", "size", "Lpm2;", "<anonymous parameter 1>", "LA52;", C17296a.f69688o, "(JLpm2;)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB5$d */
    /* loaded from: classes.dex */
    public static final class C0554d extends Lambda implements Function2<G52, EnumC47065pm2, A52> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4363c f1993g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0554d(InterfaceC4360K9.InterfaceC4363c interfaceC4363c) {
            super(2);
            this.f1993g = interfaceC4363c;
        }

        /* renamed from: a */
        public final long m114239a(long j, EnumC47065pm2 enumC47065pm2) {
            Intrinsics.checkNotNullParameter(enumC47065pm2, "<anonymous parameter 1>");
            return B52.m114704a(0, this.f1993g.mo99130a(0, G52.m105830f(j)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ A52 invoke(G52 g52, EnumC47065pm2 enumC47065pm2) {
            return A52.m116119b(m114239a(g52.m105826j(), enumC47065pm2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB5$e */
    /* loaded from: classes.dex */
    public static final class C0555e extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4363c f1994g;

        /* renamed from: h */
        public final /* synthetic */ boolean f1995h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0555e(InterfaceC4360K9.InterfaceC4363c interfaceC4363c, boolean z) {
            super(1);
            this.f1994g = interfaceC4363c;
            this.f1995h = z;
        }

        /* renamed from: a */
        public final void m114238a(S42 $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            $receiver.m86037b("wrapContentHeight");
            $receiver.m86038a().m104824a("align", this.f1994g);
            $receiver.m86038a().m104824a("unbounded", Boolean.valueOf(this.f1995h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114238a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LG52;", "size", "Lpm2;", "layoutDirection", "LA52;", C17296a.f69688o, "(JLpm2;)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB5$f */
    /* loaded from: classes.dex */
    public static final class C0556f extends Lambda implements Function2<G52, EnumC47065pm2, A52> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC4360K9 f1996g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0556f(InterfaceC4360K9 interfaceC4360K9) {
            super(2);
            this.f1996g = interfaceC4360K9;
        }

        /* renamed from: a */
        public final long m114237a(long j, EnumC47065pm2 layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return this.f1996g.mo99146a(G52.f10893b.m105825a(), j, layoutDirection);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ A52 invoke(G52 g52, EnumC47065pm2 enumC47065pm2) {
            return A52.m116119b(m114237a(g52.m105826j(), enumC47065pm2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB5$g */
    /* loaded from: classes.dex */
    public static final class C0557g extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC4360K9 f1997g;

        /* renamed from: h */
        public final /* synthetic */ boolean f1998h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0557g(InterfaceC4360K9 interfaceC4360K9, boolean z) {
            super(1);
            this.f1997g = interfaceC4360K9;
            this.f1998h = z;
        }

        /* renamed from: a */
        public final void m114236a(S42 $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            $receiver.m86037b("wrapContentSize");
            $receiver.m86038a().m104824a("align", this.f1997g);
            $receiver.m86038a().m104824a("unbounded", Boolean.valueOf(this.f1998h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114236a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LG52;", "size", "Lpm2;", "layoutDirection", "LA52;", C17296a.f69688o, "(JLpm2;)J"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB5$h */
    /* loaded from: classes.dex */
    public static final class C0558h extends Lambda implements Function2<G52, EnumC47065pm2, A52> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4362b f1999g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0558h(InterfaceC4360K9.InterfaceC4362b interfaceC4362b) {
            super(2);
            this.f1999g = interfaceC4362b;
        }

        /* renamed from: a */
        public final long m114235a(long j, EnumC47065pm2 layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return B52.m114704a(this.f1999g.mo99131a(0, G52.m105829g(j), layoutDirection), 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ A52 invoke(G52 g52, EnumC47065pm2 enumC47065pm2) {
            return A52.m116119b(m114235a(g52.m105826j(), enumC47065pm2));
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: BB5$i */
    /* loaded from: classes.dex */
    public static final class C0559i extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC4360K9.InterfaceC4362b f2000g;

        /* renamed from: h */
        public final /* synthetic */ boolean f2001h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0559i(InterfaceC4360K9.InterfaceC4362b interfaceC4362b, boolean z) {
            super(1);
            this.f2000g = interfaceC4362b;
            this.f2001h = z;
        }

        /* renamed from: a */
        public final void m114234a(S42 $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            $receiver.m86037b("wrapContentWidth");
            $receiver.m86038a().m104824a("align", this.f2000g);
            $receiver.m86038a().m104824a("unbounded", Boolean.valueOf(this.f2001h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114234a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n620#2,4:171\n*E\n"})
    /* renamed from: BB5$j */
    /* loaded from: classes.dex */
    public static final class C0560j extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2002g;

        /* renamed from: h */
        public final /* synthetic */ float f2003h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0560j(float f, float f2) {
            super(1);
            this.f2002g = f;
            this.f2003h = f2;
        }

        /* renamed from: a */
        public final void m114233a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("defaultMinSize");
            s42.m86038a().m104824a("minWidth", C43705k61.m29306d(this.f2002g));
            s42.m86038a().m104824a("minHeight", C43705k61.m29306d(this.f2003h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114233a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n86#2,3:171\n*E\n"})
    /* renamed from: BB5$k */
    /* loaded from: classes.dex */
    public static final class C0561k extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2004g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0561k(float f) {
            super(1);
            this.f2004g = f;
        }

        /* renamed from: a */
        public final void m114232a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("height");
            s42.m86036c(C43705k61.m29306d(this.f2004g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114232a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n200#2,4:171\n*E\n"})
    /* renamed from: BB5$l */
    /* loaded from: classes.dex */
    public static final class C0562l extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2005g;

        /* renamed from: h */
        public final /* synthetic */ float f2006h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0562l(float f, float f2) {
            super(1);
            this.f2005g = f;
            this.f2006h = f2;
        }

        /* renamed from: a */
        public final void m114231a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("heightIn");
            s42.m86038a().m104824a("min", C43705k61.m29306d(this.f2005g));
            s42.m86038a().m104824a("max", C43705k61.m29306d(this.f2006h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114231a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n286#2,3:171\n*E\n"})
    /* renamed from: BB5$m */
    /* loaded from: classes.dex */
    public static final class C0563m extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2007g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0563m(float f) {
            super(1);
            this.f2007g = f;
        }

        /* renamed from: a */
        public final void m114230a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("requiredHeight");
            s42.m86036c(C43705k61.m29306d(this.f2007g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114230a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n316#2,3:171\n*E\n"})
    /* renamed from: BB5$n */
    /* loaded from: classes.dex */
    public static final class C0564n extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2008g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0564n(float f) {
            super(1);
            this.f2008g = f;
        }

        /* renamed from: a */
        public final void m114229a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("requiredSize");
            s42.m86036c(C43705k61.m29306d(this.f2008g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114229a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n435#2,6:171\n*E\n"})
    /* renamed from: BB5$o */
    /* loaded from: classes.dex */
    public static final class C0565o extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2009g;

        /* renamed from: h */
        public final /* synthetic */ float f2010h;

        /* renamed from: i */
        public final /* synthetic */ float f2011i;

        /* renamed from: j */
        public final /* synthetic */ float f2012j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0565o(float f, float f2, float f3, float f4) {
            super(1);
            this.f2009g = f;
            this.f2010h = f2;
            this.f2011i = f3;
            this.f2012j = f4;
        }

        /* renamed from: a */
        public final void m114228a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("requiredSizeIn");
            s42.m86038a().m104824a("minWidth", C43705k61.m29306d(this.f2009g));
            s42.m86038a().m104824a("minHeight", C43705k61.m29306d(this.f2010h));
            s42.m86038a().m104824a("maxWidth", C43705k61.m29306d(this.f2011i));
            s42.m86038a().m104824a("maxHeight", C43705k61.m29306d(this.f2012j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114228a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n258#2,3:171\n*E\n"})
    /* renamed from: BB5$p */
    /* loaded from: classes.dex */
    public static final class C0566p extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2013g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0566p(float f) {
            super(1);
            this.f2013g = f;
        }

        /* renamed from: a */
        public final void m114227a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("requiredWidth");
            s42.m86036c(C43705k61.m29306d(this.f2013g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114227a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n112#2,3:171\n*E\n"})
    /* renamed from: BB5$q */
    /* loaded from: classes.dex */
    public static final class C0567q extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2014g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0567q(float f) {
            super(1);
            this.f2014g = f;
        }

        /* renamed from: a */
        public final void m114226a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("size");
            s42.m86036c(C43705k61.m29306d(this.f2014g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114226a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n139#2,4:171\n*E\n"})
    /* renamed from: BB5$r */
    /* loaded from: classes.dex */
    public static final class C0568r extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2015g;

        /* renamed from: h */
        public final /* synthetic */ float f2016h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0568r(float f, float f2) {
            super(1);
            this.f2015g = f;
            this.f2016h = f2;
        }

        /* renamed from: a */
        public final void m114225a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("size");
            s42.m86038a().m104824a("width", C43705k61.m29306d(this.f2015g));
            s42.m86038a().m104824a("height", C43705k61.m29306d(this.f2016h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114225a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n227#2,6:171\n*E\n"})
    /* renamed from: BB5$s */
    /* loaded from: classes.dex */
    public static final class C0569s extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2017g;

        /* renamed from: h */
        public final /* synthetic */ float f2018h;

        /* renamed from: i */
        public final /* synthetic */ float f2019i;

        /* renamed from: j */
        public final /* synthetic */ float f2020j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0569s(float f, float f2, float f3, float f4) {
            super(1);
            this.f2017g = f;
            this.f2018h = f2;
            this.f2019i = f3;
            this.f2020j = f4;
        }

        /* renamed from: a */
        public final void m114224a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("sizeIn");
            s42.m86038a().m104824a("minWidth", C43705k61.m29306d(this.f2017g));
            s42.m86038a().m104824a("minHeight", C43705k61.m29306d(this.f2018h));
            s42.m86038a().m104824a("maxWidth", C43705k61.m29306d(this.f2019i));
            s42.m86038a().m104824a("maxHeight", C43705k61.m29306d(this.f2020j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114224a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n62#2,3:171\n*E\n"})
    /* renamed from: BB5$t */
    /* loaded from: classes.dex */
    public static final class C0570t extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2021g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0570t(float f) {
            super(1);
            this.f2021g = f;
        }

        /* renamed from: a */
        public final void m114223a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("width");
            s42.m86036c(C43705k61.m29306d(this.f2021g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114223a(s42);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LS42;", "", C17296a.f69688o, "(LS42;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Size.kt\nandroidx/compose/foundation/layout/SizeKt\n*L\n1#1,170:1\n177#2,4:171\n*E\n"})
    /* renamed from: BB5$u */
    /* loaded from: classes.dex */
    public static final class C0571u extends Lambda implements Function1<S42, Unit> {

        /* renamed from: g */
        public final /* synthetic */ float f2022g;

        /* renamed from: h */
        public final /* synthetic */ float f2023h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0571u(float f, float f2) {
            super(1);
            this.f2022g = f;
            this.f2023h = f2;
        }

        /* renamed from: a */
        public final void m114222a(S42 s42) {
            Intrinsics.checkNotNullParameter(s42, "$this$null");
            s42.m86037b("widthIn");
            s42.m86038a().m104824a("min", C43705k61.m29306d(this.f2022g));
            s42.m86038a().m104824a("max", C43705k61.m29306d(this.f2023h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(S42 s42) {
            m114222a(s42);
            return Unit.INSTANCE;
        }
    }

    static {
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        f1984d = m114263f(c4361a.m99139g(), false);
        f1985e = m114263f(c4361a.m99136j(), false);
        f1986f = m114265d(c4361a.m99138h(), false);
        f1987g = m114265d(c4361a.m99135k(), false);
        f1988h = m114264e(c4361a.m99141e(), false);
        f1989i = m114264e(c4361a.m99132n(), false);
    }

    /* renamed from: A */
    public static final InterfaceC41563gV2 m114273A(InterfaceC41563gV2 width, float f) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(width, "$this$width");
        if (K32.m99301c()) {
            m99303a = new C0570t(f);
        } else {
            m99303a = K32.m99303a();
        }
        return width.mo39266t0(new EB5(f, 0.0f, f, 0.0f, true, m99303a, 10, null));
    }

    /* renamed from: B */
    public static final InterfaceC41563gV2 m114272B(InterfaceC41563gV2 widthIn, float f, float f2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(widthIn, "$this$widthIn");
        if (K32.m99301c()) {
            m99303a = new C0571u(f, f2);
        } else {
            m99303a = K32.m99303a();
        }
        return widthIn.mo39266t0(new EB5(f, 0.0f, f2, 0.0f, true, m99303a, 10, null));
    }

    /* renamed from: C */
    public static /* synthetic */ InterfaceC41563gV2 m114271C(InterfaceC41563gV2 interfaceC41563gV2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C43705k61.f93903c.m29295c();
        }
        if ((i & 2) != 0) {
            f2 = C43705k61.f93903c.m29295c();
        }
        return m114272B(interfaceC41563gV2, f, f2);
    }

    /* renamed from: D */
    public static final InterfaceC41563gV2 m114270D(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 align, boolean z) {
        XG6 m114264e;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(align, "align");
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        if (Intrinsics.areEqual(align, c4361a.m99141e()) && !z) {
            m114264e = f1988h;
        } else if (Intrinsics.areEqual(align, c4361a.m99132n()) && !z) {
            m114264e = f1989i;
        } else {
            m114264e = m114264e(align, z);
        }
        return interfaceC41563gV2.mo39266t0(m114264e);
    }

    /* renamed from: E */
    public static /* synthetic */ InterfaceC41563gV2 m114269E(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC4360K9 interfaceC4360K9, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4360K9 = InterfaceC4360K9.f19170a.m99141e();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m114270D(interfaceC41563gV2, interfaceC4360K9, z);
    }

    /* renamed from: a */
    public static final C32181Cl1 m114268a(float f) {
        return new C32181Cl1(EnumC44871m41.Vertical, f, new C0551a(f));
    }

    /* renamed from: b */
    public static final C32181Cl1 m114267b(float f) {
        return new C32181Cl1(EnumC44871m41.Both, f, new C0552b(f));
    }

    /* renamed from: c */
    public static final C32181Cl1 m114266c(float f) {
        return new C32181Cl1(EnumC44871m41.Horizontal, f, new C0553c(f));
    }

    /* renamed from: d */
    public static final XG6 m114265d(InterfaceC4360K9.InterfaceC4363c interfaceC4363c, boolean z) {
        return new XG6(EnumC44871m41.Vertical, z, new C0554d(interfaceC4363c), interfaceC4363c, new C0555e(interfaceC4363c, z));
    }

    /* renamed from: e */
    public static final XG6 m114264e(InterfaceC4360K9 interfaceC4360K9, boolean z) {
        return new XG6(EnumC44871m41.Both, z, new C0556f(interfaceC4360K9), interfaceC4360K9, new C0557g(interfaceC4360K9, z));
    }

    /* renamed from: f */
    public static final XG6 m114263f(InterfaceC4360K9.InterfaceC4362b interfaceC4362b, boolean z) {
        return new XG6(EnumC44871m41.Horizontal, z, new C0558h(interfaceC4362b), interfaceC4362b, new C0559i(interfaceC4362b, z));
    }

    /* renamed from: g */
    public static final InterfaceC41563gV2 m114262g(InterfaceC41563gV2 defaultMinSize, float f, float f2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(defaultMinSize, "$this$defaultMinSize");
        if (K32.m99301c()) {
            m99303a = new C0560j(f, f2);
        } else {
            m99303a = K32.m99303a();
        }
        return defaultMinSize.mo39266t0(new C32123Ce6(f, f2, m99303a, null));
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC41563gV2 m114261h(InterfaceC41563gV2 interfaceC41563gV2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C43705k61.f93903c.m29295c();
        }
        if ((i & 2) != 0) {
            f2 = C43705k61.f93903c.m29295c();
        }
        return m114262g(interfaceC41563gV2, f, f2);
    }

    /* renamed from: i */
    public static final InterfaceC41563gV2 m114260i(InterfaceC41563gV2 interfaceC41563gV2, float f) {
        boolean z;
        C32181Cl1 m114268a;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m114268a = f1982b;
        } else {
            m114268a = m114268a(f);
        }
        return interfaceC41563gV2.mo39266t0(m114268a);
    }

    /* renamed from: j */
    public static /* synthetic */ InterfaceC41563gV2 m114259j(InterfaceC41563gV2 interfaceC41563gV2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m114260i(interfaceC41563gV2, f);
    }

    /* renamed from: k */
    public static final InterfaceC41563gV2 m114258k(InterfaceC41563gV2 interfaceC41563gV2, float f) {
        boolean z;
        C32181Cl1 m114267b;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m114267b = f1983c;
        } else {
            m114267b = m114267b(f);
        }
        return interfaceC41563gV2.mo39266t0(m114267b);
    }

    /* renamed from: l */
    public static /* synthetic */ InterfaceC41563gV2 m114257l(InterfaceC41563gV2 interfaceC41563gV2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m114258k(interfaceC41563gV2, f);
    }

    /* renamed from: m */
    public static final InterfaceC41563gV2 m114256m(InterfaceC41563gV2 interfaceC41563gV2, float f) {
        boolean z;
        C32181Cl1 m114266c;
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m114266c = f1981a;
        } else {
            m114266c = m114266c(f);
        }
        return interfaceC41563gV2.mo39266t0(m114266c);
    }

    /* renamed from: n */
    public static /* synthetic */ InterfaceC41563gV2 m114255n(InterfaceC41563gV2 interfaceC41563gV2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m114256m(interfaceC41563gV2, f);
    }

    /* renamed from: o */
    public static final InterfaceC41563gV2 m114254o(InterfaceC41563gV2 height, float f) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(height, "$this$height");
        if (K32.m99301c()) {
            m99303a = new C0561k(f);
        } else {
            m99303a = K32.m99303a();
        }
        return height.mo39266t0(new EB5(0.0f, f, 0.0f, f, true, m99303a, 5, null));
    }

    /* renamed from: p */
    public static final InterfaceC41563gV2 m114253p(InterfaceC41563gV2 heightIn, float f, float f2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(heightIn, "$this$heightIn");
        if (K32.m99301c()) {
            m99303a = new C0562l(f, f2);
        } else {
            m99303a = K32.m99303a();
        }
        return heightIn.mo39266t0(new EB5(0.0f, f, 0.0f, f2, true, m99303a, 5, null));
    }

    /* renamed from: q */
    public static /* synthetic */ InterfaceC41563gV2 m114252q(InterfaceC41563gV2 interfaceC41563gV2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C43705k61.f93903c.m29295c();
        }
        if ((i & 2) != 0) {
            f2 = C43705k61.f93903c.m29295c();
        }
        return m114253p(interfaceC41563gV2, f, f2);
    }

    /* renamed from: r */
    public static final InterfaceC41563gV2 m114251r(InterfaceC41563gV2 requiredHeight, float f) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(requiredHeight, "$this$requiredHeight");
        if (K32.m99301c()) {
            m99303a = new C0563m(f);
        } else {
            m99303a = K32.m99303a();
        }
        return requiredHeight.mo39266t0(new EB5(0.0f, f, 0.0f, f, false, m99303a, 5, null));
    }

    /* renamed from: s */
    public static final InterfaceC41563gV2 m114250s(InterfaceC41563gV2 requiredSize, float f) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(requiredSize, "$this$requiredSize");
        if (K32.m99301c()) {
            m99303a = new C0564n(f);
        } else {
            m99303a = K32.m99303a();
        }
        return requiredSize.mo39266t0(new EB5(f, f, f, f, false, m99303a, null));
    }

    /* renamed from: t */
    public static final InterfaceC41563gV2 m114249t(InterfaceC41563gV2 requiredSizeIn, float f, float f2, float f3, float f4) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(requiredSizeIn, "$this$requiredSizeIn");
        if (K32.m99301c()) {
            m99303a = new C0565o(f, f2, f3, f4);
        } else {
            m99303a = K32.m99303a();
        }
        return requiredSizeIn.mo39266t0(new EB5(f, f2, f3, f4, false, m99303a, null));
    }

    /* renamed from: u */
    public static /* synthetic */ InterfaceC41563gV2 m114248u(InterfaceC41563gV2 interfaceC41563gV2, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C43705k61.f93903c.m29295c();
        }
        if ((i & 2) != 0) {
            f2 = C43705k61.f93903c.m29295c();
        }
        if ((i & 4) != 0) {
            f3 = C43705k61.f93903c.m29295c();
        }
        if ((i & 8) != 0) {
            f4 = C43705k61.f93903c.m29295c();
        }
        return m114249t(interfaceC41563gV2, f, f2, f3, f4);
    }

    /* renamed from: v */
    public static final InterfaceC41563gV2 m114247v(InterfaceC41563gV2 requiredWidth, float f) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(requiredWidth, "$this$requiredWidth");
        if (K32.m99301c()) {
            m99303a = new C0566p(f);
        } else {
            m99303a = K32.m99303a();
        }
        return requiredWidth.mo39266t0(new EB5(f, 0.0f, f, 0.0f, false, m99303a, 10, null));
    }

    /* renamed from: w */
    public static final InterfaceC41563gV2 m114246w(InterfaceC41563gV2 size, float f) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(size, "$this$size");
        if (K32.m99301c()) {
            m99303a = new C0567q(f);
        } else {
            m99303a = K32.m99303a();
        }
        return size.mo39266t0(new EB5(f, f, f, f, true, m99303a, null));
    }

    /* renamed from: x */
    public static final InterfaceC41563gV2 m114245x(InterfaceC41563gV2 size, float f, float f2) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(size, "$this$size");
        if (K32.m99301c()) {
            m99303a = new C0568r(f, f2);
        } else {
            m99303a = K32.m99303a();
        }
        return size.mo39266t0(new EB5(f, f2, f, f2, true, m99303a, null));
    }

    /* renamed from: y */
    public static final InterfaceC41563gV2 m114244y(InterfaceC41563gV2 sizeIn, float f, float f2, float f3, float f4) {
        Function1 m99303a;
        Intrinsics.checkNotNullParameter(sizeIn, "$this$sizeIn");
        if (K32.m99301c()) {
            m99303a = new C0569s(f, f2, f3, f4);
        } else {
            m99303a = K32.m99303a();
        }
        return sizeIn.mo39266t0(new EB5(f, f2, f3, f4, true, m99303a, null));
    }

    /* renamed from: z */
    public static /* synthetic */ InterfaceC41563gV2 m114243z(InterfaceC41563gV2 interfaceC41563gV2, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C43705k61.f93903c.m29295c();
        }
        if ((i & 2) != 0) {
            f2 = C43705k61.f93903c.m29295c();
        }
        if ((i & 4) != 0) {
            f3 = C43705k61.f93903c.m29295c();
        }
        if ((i & 8) != 0) {
            f4 = C43705k61.f93903c.m29295c();
        }
        return m114244y(interfaceC41563gV2, f, f2, f3, f4);
    }
}
