package p000;

import android.view.KeyEvent;
import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\b\b\u0002\u0010%\u001a\u00020 \u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020,\u0012\b\b\u0002\u00105\u001a\u000201\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000106\u0012\u0006\u0010=\u001a\u00020;\u0012\b\b\u0002\u0010@\u001a\u00020>\u0012\u0014\b\u0002\u0010B\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0004\bC\u0010DJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\f\u0010\u000b\u001a\u00020\t*\u00020\bH\u0002J\u001f\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\t2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\t0\u000f¢\u0006\u0002\b\u0011H\u0002R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b*\u0010(R\u0017\u00100\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u0017\u00105\u001a\u0002018\u0006¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b3\u00104R\u0019\u0010:\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b*\u00107\u001a\u0004\b8\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006E"}, m28432d2 = {"Ln16;", "", "Lik2;", "event", "", "j", "(Landroid/view/KeyEvent;)Z", "", "LN91;", "", "e", DateTokenConverter.CONVERTER_KEY, "Lop0;", "k", "(Landroid/view/KeyEvent;)Lop0;", "Lkotlin/Function1;", "Ls16;", "Lkotlin/ExtensionFunctionType;", "block", "f", "LC16;", C17296a.f69688o, "LC16;", "getState", "()LC16;", TransferTable.COLUMN_STATE, "Lx16;", "b", "Lx16;", "g", "()Lx16;", "selectionManager", "LF16;", "c", "LF16;", "getValue", "()LF16;", "value", "Z", "getEditable", "()Z", "editable", "h", "singleLine", "Lr26;", "Lr26;", "getPreparedSelectionState", "()Lr26;", "preparedSelectionState", "LHe3;", "LHe3;", "getOffsetMapping", "()LHe3;", "offsetMapping", "LId6;", "LId6;", "i", "()LId6;", "undoManager", "LuT0;", "LuT0;", "keyCombiner", "Lvk2;", "Lvk2;", "keyMapping", "Lkotlin/jvm/functions/Function1;", "onValueChange", "<init>", "(LC16;Lx16;LF16;ZZLr26;LHe3;LId6;LuT0;Lvk2;Lkotlin/jvm/functions/Function1;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: n16  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45439n16 {

    /* renamed from: a */
    public final C16 f99227a;

    /* renamed from: b */
    public final C51367x16 f99228b;

    /* renamed from: c */
    public final F16 f99229c;

    /* renamed from: d */
    public final boolean f99230d;

    /* renamed from: e */
    public final boolean f99231e;

    /* renamed from: f */
    public final C47821r26 f99232f;

    /* renamed from: g */
    public final InterfaceC33290He3 f99233g;

    /* renamed from: h */
    public final C33518Id6 f99234h;

    /* renamed from: i */
    public final C49844uT0 f99235i;

    /* renamed from: j */
    public final InterfaceC50601vk2 f99236j;

    /* renamed from: k */
    public final Function1<F16, Unit> f99237k;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LF16;", "it", "", "invoke", "(LF16;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: n16$a */
    /* loaded from: classes.dex */
    public static final class C26341a extends Lambda implements Function1<F16, Unit> {

        /* renamed from: g */
        public static final C26341a f99238g = new C26341a();

        public C26341a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(F16 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(F16 f16) {
            invoke2(f16);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ls16;", "", C17296a.f69688o, "(Ls16;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTextFieldKeyInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldKeyInput.kt\nandroidx/compose/foundation/text/TextFieldKeyInput$process$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1#2:261\n*E\n"})
    /* renamed from: n16$b */
    /* loaded from: classes.dex */
    public static final class C26342b extends Lambda implements Function1<C48403s16, Unit> {

        /* renamed from: g */
        public final /* synthetic */ EnumC40522ek2 f99239g;

        /* renamed from: h */
        public final /* synthetic */ C45439n16 f99240h;

        /* renamed from: i */
        public final /* synthetic */ Ref.BooleanRef f99241i;

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ls16;", "", C17296a.f69688o, "(Ls16;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n16$b$a */
        /* loaded from: classes.dex */
        public static final class C26343a extends Lambda implements Function1<C48403s16, Unit> {

            /* renamed from: g */
            public static final C26343a f99242g = new C26343a();

            public C26343a() {
                super(1);
            }

            /* renamed from: a */
            public final void m24558a(C48403s16 collapseLeftOr) {
                Intrinsics.checkNotNullParameter(collapseLeftOr, "$this$collapseLeftOr");
                collapseLeftOr.m10588C();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C48403s16 c48403s16) {
                m24558a(c48403s16);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ls16;", "", C17296a.f69688o, "(Ls16;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n16$b$b */
        /* loaded from: classes.dex */
        public static final class C26344b extends Lambda implements Function1<C48403s16, Unit> {

            /* renamed from: g */
            public static final C26344b f99243g = new C26344b();

            public C26344b() {
                super(1);
            }

            /* renamed from: a */
            public final void m24557a(C48403s16 collapseRightOr) {
                Intrinsics.checkNotNullParameter(collapseRightOr, "$this$collapseRightOr");
                collapseRightOr.m10580K();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C48403s16 c48403s16) {
                m24557a(c48403s16);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ls16;", "LN91;", C17296a.f69688o, "(Ls16;)LN91;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n16$b$c */
        /* loaded from: classes.dex */
        public static final class C26345c extends Lambda implements Function1<C48403s16, N91> {

            /* renamed from: g */
            public static final C26345c f99244g = new C26345c();

            public C26345c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final N91 invoke(C48403s16 deleteIfSelectedOr) {
                Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                return new YZ0(C48413s26.m14837i(deleteIfSelectedOr.m10542w()) - deleteIfSelectedOr.m10546s(), 0);
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ls16;", "LN91;", C17296a.f69688o, "(Ls16;)LN91;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n16$b$d */
        /* loaded from: classes.dex */
        public static final class C26346d extends Lambda implements Function1<C48403s16, N91> {

            /* renamed from: g */
            public static final C26346d f99245g = new C26346d();

            public C26346d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final N91 invoke(C48403s16 deleteIfSelectedOr) {
                Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                int m10553l = deleteIfSelectedOr.m10553l();
                if (m10553l != -1) {
                    return new YZ0(0, m10553l - C48413s26.m14837i(deleteIfSelectedOr.m10542w()));
                }
                return null;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ls16;", "LN91;", C17296a.f69688o, "(Ls16;)LN91;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n16$b$e */
        /* loaded from: classes.dex */
        public static final class C26347e extends Lambda implements Function1<C48403s16, N91> {

            /* renamed from: g */
            public static final C26347e f99246g = new C26347e();

            public C26347e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final N91 invoke(C48403s16 deleteIfSelectedOr) {
                Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                Integer m10543v = deleteIfSelectedOr.m10543v();
                if (m10543v != null) {
                    return new YZ0(C48413s26.m14837i(deleteIfSelectedOr.m10542w()) - m10543v.intValue(), 0);
                }
                return null;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ls16;", "LN91;", C17296a.f69688o, "(Ls16;)LN91;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n16$b$f */
        /* loaded from: classes.dex */
        public static final class C26348f extends Lambda implements Function1<C48403s16, N91> {

            /* renamed from: g */
            public static final C26348f f99247g = new C26348f();

            public C26348f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final N91 invoke(C48403s16 deleteIfSelectedOr) {
                Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                Integer m10552m = deleteIfSelectedOr.m10552m();
                if (m10552m != null) {
                    return new YZ0(0, m10552m.intValue() - C48413s26.m14837i(deleteIfSelectedOr.m10542w()));
                }
                return null;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ls16;", "LN91;", C17296a.f69688o, "(Ls16;)LN91;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n16$b$g */
        /* loaded from: classes.dex */
        public static final class C26349g extends Lambda implements Function1<C48403s16, N91> {

            /* renamed from: g */
            public static final C26349g f99248g = new C26349g();

            public C26349g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final N91 invoke(C48403s16 deleteIfSelectedOr) {
                Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                Integer m10556i = deleteIfSelectedOr.m10556i();
                if (m10556i != null) {
                    return new YZ0(C48413s26.m14837i(deleteIfSelectedOr.m10542w()) - m10556i.intValue(), 0);
                }
                return null;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Ls16;", "LN91;", C17296a.f69688o, "(Ls16;)LN91;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: n16$b$h */
        /* loaded from: classes.dex */
        public static final class C26350h extends Lambda implements Function1<C48403s16, N91> {

            /* renamed from: g */
            public static final C26350h f99249g = new C26350h();

            public C26350h() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final N91 invoke(C48403s16 deleteIfSelectedOr) {
                Intrinsics.checkNotNullParameter(deleteIfSelectedOr, "$this$deleteIfSelectedOr");
                Integer m10559f = deleteIfSelectedOr.m10559f();
                if (m10559f != null) {
                    return new YZ0(0, m10559f.intValue() - C48413s26.m14837i(deleteIfSelectedOr.m10542w()));
                }
                return null;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: n16$b$i */
        /* loaded from: classes.dex */
        public /* synthetic */ class C26351i {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC40522ek2.values().length];
                try {
                    iArr[EnumC40522ek2.COPY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC40522ek2.PASTE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC40522ek2.CUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC40522ek2.LEFT_CHAR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC40522ek2.RIGHT_CHAR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC40522ek2.LEFT_WORD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumC40522ek2.RIGHT_WORD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumC40522ek2.PREV_PARAGRAPH.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumC40522ek2.NEXT_PARAGRAPH.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumC40522ek2.UP.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumC40522ek2.DOWN.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[EnumC40522ek2.PAGE_UP.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[EnumC40522ek2.PAGE_DOWN.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[EnumC40522ek2.LINE_START.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[EnumC40522ek2.LINE_END.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[EnumC40522ek2.LINE_LEFT.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[EnumC40522ek2.LINE_RIGHT.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[EnumC40522ek2.HOME.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[EnumC40522ek2.END.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[EnumC40522ek2.DELETE_PREV_CHAR.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[EnumC40522ek2.DELETE_NEXT_CHAR.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[EnumC40522ek2.DELETE_PREV_WORD.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[EnumC40522ek2.DELETE_NEXT_WORD.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[EnumC40522ek2.DELETE_FROM_LINE_START.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[EnumC40522ek2.DELETE_TO_LINE_END.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[EnumC40522ek2.NEW_LINE.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[EnumC40522ek2.TAB.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_ALL.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_LEFT_CHAR.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_RIGHT_CHAR.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_LEFT_WORD.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_RIGHT_WORD.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_LINE_START.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_LINE_END.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_LINE_LEFT.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_LINE_RIGHT.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_UP.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_DOWN.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_PAGE_UP.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_PAGE_DOWN.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_HOME.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[EnumC40522ek2.SELECT_END.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[EnumC40522ek2.DESELECT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[EnumC40522ek2.UNDO.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[EnumC40522ek2.REDO.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[EnumC40522ek2.CHARACTER_PALETTE.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26342b(EnumC40522ek2 enumC40522ek2, C45439n16 c45439n16, Ref.BooleanRef booleanRef) {
            super(1);
            this.f99239g = enumC40522ek2;
            this.f99240h = c45439n16;
            this.f99241i = booleanRef;
        }

        /* renamed from: a */
        public final void m24559a(C48403s16 commandExecutionContext) {
            F16 m101868g;
            F16 m101872c;
            Intrinsics.checkNotNullParameter(commandExecutionContext, "$this$commandExecutionContext");
            switch (C26351i.$EnumSwitchMapping$0[this.f99239g.ordinal()]) {
                case 1:
                    this.f99240h.m24564g().m5942k(false);
                    return;
                case 2:
                    this.f99240h.m24564g().m5969L();
                    return;
                case 3:
                    this.f99240h.m24564g().m5938o();
                    return;
                case 4:
                    commandExecutionContext.m10563b(C26343a.f99242g);
                    return;
                case 5:
                    commandExecutionContext.m10562c(C26344b.f99243g);
                    return;
                case 6:
                    commandExecutionContext.m10587D();
                    return;
                case 7:
                    commandExecutionContext.m10579L();
                    return;
                case 8:
                    commandExecutionContext.m10582I();
                    return;
                case 9:
                    commandExecutionContext.m10585F();
                    return;
                case 10:
                    commandExecutionContext.m10572S();
                    return;
                case 11:
                    commandExecutionContext.m10589B();
                    return;
                case 12:
                    commandExecutionContext.m14871e0();
                    return;
                case 13:
                    commandExecutionContext.m14872d0();
                    return;
                case 14:
                    commandExecutionContext.m10573R();
                    return;
                case 15:
                    commandExecutionContext.m10576O();
                    return;
                case 16:
                    commandExecutionContext.m10575P();
                    return;
                case 17:
                    commandExecutionContext.m10574Q();
                    return;
                case 18:
                    commandExecutionContext.m10577N();
                    return;
                case 19:
                    commandExecutionContext.m10578M();
                    return;
                case 20:
                    List<N91> m14875a0 = commandExecutionContext.m14875a0(C26345c.f99244g);
                    if (m14875a0 != null) {
                        this.f99240h.m24566e(m14875a0);
                        return;
                    }
                    return;
                case 21:
                    List<N91> m14875a02 = commandExecutionContext.m14875a0(C26346d.f99245g);
                    if (m14875a02 != null) {
                        this.f99240h.m24566e(m14875a02);
                        return;
                    }
                    return;
                case 22:
                    List<N91> m14875a03 = commandExecutionContext.m14875a0(C26347e.f99246g);
                    if (m14875a03 != null) {
                        this.f99240h.m24566e(m14875a03);
                        return;
                    }
                    return;
                case 23:
                    List<N91> m14875a04 = commandExecutionContext.m14875a0(C26348f.f99247g);
                    if (m14875a04 != null) {
                        this.f99240h.m24566e(m14875a04);
                        return;
                    }
                    return;
                case 24:
                    List<N91> m14875a05 = commandExecutionContext.m14875a0(C26349g.f99248g);
                    if (m14875a05 != null) {
                        this.f99240h.m24566e(m14875a05);
                        return;
                    }
                    return;
                case 25:
                    List<N91> m14875a06 = commandExecutionContext.m14875a0(C26350h.f99249g);
                    if (m14875a06 != null) {
                        this.f99240h.m24566e(m14875a06);
                        return;
                    }
                    return;
                case 26:
                    if (!this.f99240h.m24563h()) {
                        this.f99240h.m24567d(new C46500op0("\n", 1));
                        return;
                    } else {
                        this.f99241i.element = false;
                        return;
                    }
                case 27:
                    if (!this.f99240h.m24563h()) {
                        this.f99240h.m24567d(new C46500op0(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, 1));
                        return;
                    } else {
                        this.f99241i.element = false;
                        return;
                    }
                case 28:
                    commandExecutionContext.m10571T();
                    return;
                case 29:
                    commandExecutionContext.m10588C().m10570U();
                    return;
                case 30:
                    commandExecutionContext.m10580K().m10570U();
                    return;
                case 31:
                    commandExecutionContext.m10587D().m10570U();
                    return;
                case 32:
                    commandExecutionContext.m10579L().m10570U();
                    return;
                case 33:
                    commandExecutionContext.m10582I().m10570U();
                    return;
                case 34:
                    commandExecutionContext.m10585F().m10570U();
                    return;
                case 35:
                    commandExecutionContext.m10573R().m10570U();
                    return;
                case 36:
                    commandExecutionContext.m10576O().m10570U();
                    return;
                case 37:
                    commandExecutionContext.m10575P().m10570U();
                    return;
                case 38:
                    commandExecutionContext.m10574Q().m10570U();
                    return;
                case 39:
                    commandExecutionContext.m10572S().m10570U();
                    return;
                case 40:
                    commandExecutionContext.m10589B().m10570U();
                    return;
                case 41:
                    commandExecutionContext.m14871e0().m10570U();
                    return;
                case 42:
                    commandExecutionContext.m14872d0().m10570U();
                    return;
                case 43:
                    commandExecutionContext.m10577N().m10570U();
                    return;
                case 44:
                    commandExecutionContext.m10578M().m10570U();
                    return;
                case 45:
                    commandExecutionContext.m10561d();
                    return;
                case 46:
                    C33518Id6 m24562i = this.f99240h.m24562i();
                    if (m24562i != null) {
                        m24562i.m101873b(commandExecutionContext.m14874b0());
                    }
                    C33518Id6 m24562i2 = this.f99240h.m24562i();
                    if (m24562i2 != null && (m101868g = m24562i2.m101868g()) != null) {
                        this.f99240h.f99237k.invoke(m101868g);
                        return;
                    }
                    return;
                case 47:
                    C33518Id6 m24562i3 = this.f99240h.m24562i();
                    if (m24562i3 != null && (m101872c = m24562i3.m101872c()) != null) {
                        this.f99240h.f99237k.invoke(m101872c);
                        return;
                    }
                    return;
                case 48:
                    C44080kk2.m28554b();
                    return;
                default:
                    return;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C48403s16 c48403s16) {
            m24559a(c48403s16);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45439n16(C16 state, C51367x16 selectionManager, F16 value, boolean z, boolean z2, C47821r26 preparedSelectionState, InterfaceC33290He3 offsetMapping, C33518Id6 c33518Id6, C49844uT0 keyCombiner, InterfaceC50601vk2 keyMapping, Function1<? super F16, Unit> onValueChange) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(selectionManager, "selectionManager");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(preparedSelectionState, "preparedSelectionState");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(keyCombiner, "keyCombiner");
        Intrinsics.checkNotNullParameter(keyMapping, "keyMapping");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        this.f99227a = state;
        this.f99228b = selectionManager;
        this.f99229c = value;
        this.f99230d = z;
        this.f99231e = z2;
        this.f99232f = preparedSelectionState;
        this.f99233g = offsetMapping;
        this.f99234h = c33518Id6;
        this.f99235i = keyCombiner;
        this.f99236j = keyMapping;
        this.f99237k = onValueChange;
    }

    /* renamed from: d */
    public final void m24567d(N91 n91) {
        List<? extends N91> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(n91);
        m24566e(listOf);
    }

    /* renamed from: e */
    public final void m24566e(List<? extends N91> list) {
        List<? extends N91> mutableList;
        P91 m112985k = this.f99227a.m112985k();
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
        mutableList.add(0, new C47064pm1());
        this.f99237k.invoke(m112985k.m90636b(mutableList));
    }

    /* renamed from: f */
    public final void m24565f(Function1<? super C48403s16, Unit> function1) {
        C48403s16 c48403s16 = new C48403s16(this.f99229c, this.f99233g, this.f99227a.m112989g(), this.f99232f);
        function1.invoke(c48403s16);
        if (!C48413s26.m14839g(c48403s16.m10542w(), this.f99229c.m108103g()) || !Intrinsics.areEqual(c48403s16.m10560e(), this.f99229c.m108105e())) {
            this.f99237k.invoke(c48403s16.m14874b0());
        }
    }

    /* renamed from: g */
    public final C51367x16 m24564g() {
        return this.f99228b;
    }

    /* renamed from: h */
    public final boolean m24563h() {
        return this.f99231e;
    }

    /* renamed from: i */
    public final C33518Id6 m24562i() {
        return this.f99234h;
    }

    /* renamed from: j */
    public final boolean m24561j(KeyEvent event) {
        EnumC40522ek2 mo6418a;
        Intrinsics.checkNotNullParameter(event, "event");
        C46500op0 m24560k = m24560k(event);
        if (m24560k != null) {
            if (!this.f99230d) {
                return false;
            }
            m24567d(m24560k);
            this.f99232f.m16575b();
            return true;
        } else if (!C44673lk2.m26890e(C45266mk2.m25124b(event), C44673lk2.f96650a.m26889a()) || (mo6418a = this.f99236j.mo6418a(event)) == null || (mo6418a.m42594b() && !this.f99230d)) {
            return false;
        } else {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            m24565f(new C26342b(mo6418a, this, booleanRef));
            C33518Id6 c33518Id6 = this.f99234h;
            if (c33518Id6 != null) {
                c33518Id6.m101874a();
            }
            return booleanRef.element;
        }
    }

    /* renamed from: k */
    public final C46500op0 m24560k(KeyEvent keyEvent) {
        Integer m10247a;
        if (!C46625p16.m20142a(keyEvent) || (m10247a = this.f99235i.m10247a(keyEvent)) == null) {
            return null;
        }
        String sb = VR5.m79875a(new StringBuilder(), m10247a.intValue()).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder().appendCo…ntX(codePoint).toString()");
        return new C46500op0(sb, 1);
    }

    public /* synthetic */ C45439n16(C16 c16, C51367x16 c51367x16, F16 f16, boolean z, boolean z2, C47821r26 c47821r26, InterfaceC33290He3 interfaceC33290He3, C33518Id6 c33518Id6, C49844uT0 c49844uT0, InterfaceC50601vk2 interfaceC50601vk2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16, c51367x16, (i & 4) != 0 ? new F16((String) null, 0L, (C48413s26) null, 7, (DefaultConstructorMarker) null) : f16, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, c47821r26, (i & 64) != 0 ? InterfaceC33290He3.f13687a.m103617a() : interfaceC33290He3, (i & 128) != 0 ? null : c33518Id6, c49844uT0, (i & 512) != 0 ? C51787xk2.m4755a() : interfaceC50601vk2, (i & 1024) != 0 ? C26341a.f99238g : function1);
    }
}
