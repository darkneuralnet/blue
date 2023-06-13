package p000;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
@Metadata(m28433d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B-\u0012\u0006\u0010'\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020(\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u00100\u001a\u00020.¢\u0006\u0004\bP\u0010QB\u001d\b\u0016\u0012\u0006\u0010'\u001a\u00020#\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010+¢\u0006\u0004\bP\u0010SJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002JI\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\nH\u0016ø\u0001\u0000J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0017J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0002R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/R(\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00101R%\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u00101R$\u00107\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00068\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001b0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, m28432d2 = {"LW16;", "LkW3;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "l", "LF16;", "value", "LGY1;", "imeOptions", "Lkotlin/Function1;", "", "LN91;", "", "onEditCommand", "LFY1;", "onImeActionPerformed", "f", C17296a.f69688o, "e", "c", "oldValue", "newValue", "b", "LOs4;", "rect", DateTokenConverter.CONVERTER_KEY, "LW16$a;", "command", "r", "o", "q", "", "visible", "t", "Landroid/view/View;", "Landroid/view/View;", "n", "()Landroid/view/View;", "view", "Lj32;", "Lj32;", "inputMethodManager", "LfW3;", "LfW3;", "platformTextInput", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "Lkotlin/jvm/functions/Function1;", "<set-?>", "g", "LF16;", "getState$ui_release", "()LF16;", TransferTable.COLUMN_STATE, "h", "LGY1;", "", "Ljava/lang/ref/WeakReference;", "LMs4;", "i", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "j", "Lkotlin/Lazy;", "m", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "k", "Landroid/graphics/Rect;", "focusedRect", "LLX2;", "LLX2;", "textInputCommandQueue", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "frameCallback", "<init>", "(Landroid/view/View;Lj32;LfW3;Ljava/util/concurrent/Executor;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/view/View;LfW3;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextInputServiceAndroid.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n1182#2:508\n1161#2,2:509\n728#3,2:511\n460#3,11:514\n1#4:513\n*S KotlinDebug\n*F\n+ 1 TextInputServiceAndroid.android.kt\nandroidx/compose/ui/text/input/TextInputServiceAndroid\n*L\n101#1:508\n101#1:509,2\n205#1:511,2\n282#1:514,11\n*E\n"})
/* renamed from: W16 */
/* loaded from: classes.dex */
public final class W16 implements InterfaceC43945kW3 {

    /* renamed from: a */
    public final View f40265a;

    /* renamed from: b */
    public final InterfaceC43083j32 f40266b;

    /* renamed from: c */
    public final InterfaceC40980fW3 f40267c;

    /* renamed from: d */
    public final Executor f40268d;

    /* renamed from: e */
    public Function1<? super List<? extends N91>, Unit> f40269e;

    /* renamed from: f */
    public Function1<? super FY1, Unit> f40270f;

    /* renamed from: g */
    public F16 f40271g;

    /* renamed from: h */
    public GY1 f40272h;

    /* renamed from: i */
    public List<WeakReference<inputmethod.InputConnectionC34587Ms4>> f40273i;

    /* renamed from: j */
    public final Lazy f40274j;

    /* renamed from: k */
    public Rect f40275k;

    /* renamed from: l */
    public final LX2<EnumC8911a> f40276l;

    /* renamed from: m */
    public Runnable f40277m;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"LW16$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: W16$a */
    /* loaded from: classes.dex */
    public enum EnumC8911a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: W16$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class C8912b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC8911a.values().length];
            try {
                iArr[EnumC8911a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8911a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8911a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8911a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "b", "()Landroid/view/inputmethod/BaseInputConnection;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: W16$c */
    /* loaded from: classes.dex */
    public static final class C8913c extends Lambda implements Function0<BaseInputConnection> {
        public C8913c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(W16.this.m78918n(), false);
        }
    }

    @Metadata(m28433d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, m28432d2 = {"W16$d", "Ld32;", "", "LN91;", "editCommands", "", DateTokenConverter.CONVERTER_KEY, "LFY1;", "imeAction", "b", "(I)V", "Landroid/view/KeyEvent;", "event", C17296a.f69688o, "LMs4;", "ic", "c", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: W16$d */
    /* loaded from: classes.dex */
    public static final class C8914d implements InterfaceC39526d32 {
        public C8914d() {
        }

        @Override // p000.InterfaceC39526d32
        /* renamed from: a */
        public void mo44658a(KeyEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            W16.this.m78919m().sendKeyEvent(event);
        }

        @Override // p000.InterfaceC39526d32
        /* renamed from: b */
        public void mo44657b(int i) {
            W16.this.f40270f.invoke(FY1.m107010i(i));
        }

        @Override // p000.InterfaceC39526d32
        /* renamed from: c */
        public void mo44656c(inputmethod.InputConnectionC34587Ms4 ic) {
            Intrinsics.checkNotNullParameter(ic, "ic");
            int size = W16.this.f40273i.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(((WeakReference) W16.this.f40273i.get(i)).get(), ic)) {
                    W16.this.f40273i.remove(i);
                    return;
                }
            }
        }

        @Override // p000.InterfaceC39526d32
        /* renamed from: d */
        public void mo44655d(List<? extends N91> editCommands) {
            Intrinsics.checkNotNullParameter(editCommands, "editCommands");
            W16.this.f40269e.invoke(editCommands);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "LN91;", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: W16$e */
    /* loaded from: classes.dex */
    public static final class C8915e extends Lambda implements Function1<List<? extends N91>, Unit> {

        /* renamed from: g */
        public static final C8915e f40285g = new C8915e();

        public C8915e() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends N91> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends N91> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFY1;", "it", "", "b", "(I)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: W16$f */
    /* loaded from: classes.dex */
    public static final class C8916f extends Lambda implements Function1<FY1, Unit> {

        /* renamed from: g */
        public static final C8916f f40286g = new C8916f();

        public C8916f() {
            super(1);
        }

        /* renamed from: b */
        public final void m78909b(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FY1 fy1) {
            m78909b(fy1.m107004o());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "LN91;", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: W16$g */
    /* loaded from: classes.dex */
    public static final class C8917g extends Lambda implements Function1<List<? extends N91>, Unit> {

        /* renamed from: g */
        public static final C8917g f40287g = new C8917g();

        public C8917g() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends N91> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends N91> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFY1;", "it", "", "b", "(I)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: W16$h */
    /* loaded from: classes.dex */
    public static final class C8918h extends Lambda implements Function1<FY1, Unit> {

        /* renamed from: g */
        public static final C8918h f40288g = new C8918h();

        public C8918h() {
            super(1);
        }

        /* renamed from: b */
        public final void m78908b(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FY1 fy1) {
            m78908b(fy1.m107004o());
            return Unit.INSTANCE;
        }
    }

    public W16(View view, InterfaceC43083j32 inputMethodManager, InterfaceC40980fW3 interfaceC40980fW3, Executor inputCommandProcessorExecutor) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputMethodManager, "inputMethodManager");
        Intrinsics.checkNotNullParameter(inputCommandProcessorExecutor, "inputCommandProcessorExecutor");
        this.f40265a = view;
        this.f40266b = inputMethodManager;
        this.f40267c = interfaceC40980fW3;
        this.f40268d = inputCommandProcessorExecutor;
        this.f40269e = C8915e.f40285g;
        this.f40270f = C8916f.f40286g;
        this.f40271g = new F16("", C48413s26.f108170b.m14827a(), (C48413s26) null, 4, (DefaultConstructorMarker) null);
        this.f40272h = GY1.f12055f.m105015a();
        this.f40273i = new ArrayList();
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C8913c());
        this.f40274j = lazy;
        this.f40276l = new LX2<>(new EnumC8911a[16], 0);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    /* renamed from: p */
    public static final void m78916p(EnumC8911a enumC8911a, Ref.ObjectRef<Boolean> objectRef, Ref.ObjectRef<Boolean> objectRef2) {
        int i = C8912b.$EnumSwitchMapping$0[enumC8911a.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if ((i == 3 || i == 4) && !Intrinsics.areEqual(objectRef.element, Boolean.FALSE)) {
                    if (enumC8911a != EnumC8911a.ShowKeyboard) {
                        z = false;
                    }
                    objectRef2.element = Boolean.valueOf(z);
                    return;
                }
                return;
            }
            ?? r3 = Boolean.FALSE;
            objectRef.element = r3;
            objectRef2.element = r3;
            return;
        }
        ?? r32 = Boolean.TRUE;
        objectRef.element = r32;
        objectRef2.element = r32;
    }

    /* renamed from: s */
    public static final void m78913s(W16 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f40277m = null;
        this$0.m78917o();
    }

    @Override // p000.InterfaceC43945kW3
    /* renamed from: a */
    public void mo28881a() {
        InterfaceC40980fW3 interfaceC40980fW3 = this.f40267c;
        if (interfaceC40980fW3 != null) {
            interfaceC40980fW3.mo30383a();
        }
        this.f40269e = C8917g.f40287g;
        this.f40270f = C8918h.f40288g;
        this.f40275k = null;
        m78914r(EnumC8911a.StopInput);
    }

    @Override // p000.InterfaceC43945kW3
    /* renamed from: b */
    public void mo28880b(F16 f16, F16 newValue) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        boolean z2 = true;
        if (C48413s26.m14839g(this.f40271g.m108103g(), newValue.m108103g()) && Intrinsics.areEqual(this.f40271g.m108104f(), newValue.m108104f())) {
            z = false;
        } else {
            z = true;
        }
        this.f40271g = newValue;
        int size = this.f40273i.size();
        for (int i2 = 0; i2 < size; i2++) {
            inputmethod.InputConnectionC34587Ms4 inputmethod_inputconnectionc34587ms4 = this.f40273i.get(i2).get();
            if (inputmethod_inputconnectionc34587ms4 != null) {
                inputmethod_inputconnectionc34587ms4.m94642e(newValue);
            }
        }
        if (Intrinsics.areEqual(f16, newValue)) {
            if (z) {
                InterfaceC43083j32 interfaceC43083j32 = this.f40266b;
                int m14834l = C48413s26.m14834l(newValue.m108103g());
                int m14835k = C48413s26.m14835k(newValue.m108103g());
                C48413s26 m108104f = this.f40271g.m108104f();
                int i3 = -1;
                if (m108104f != null) {
                    i = C48413s26.m14834l(m108104f.m14828r());
                } else {
                    i = -1;
                }
                C48413s26 m108104f2 = this.f40271g.m108104f();
                if (m108104f2 != null) {
                    i3 = C48413s26.m14835k(m108104f2.m14828r());
                }
                interfaceC43083j32.mo29396a(m14834l, m14835k, i, i3);
                return;
            }
            return;
        }
        if (f16 == null || (Intrinsics.areEqual(f16.m108102h(), newValue.m108102h()) && (!C48413s26.m14839g(f16.m108103g(), newValue.m108103g()) || Intrinsics.areEqual(f16.m108104f(), newValue.m108104f())))) {
            z2 = false;
        }
        if (z2) {
            m78915q();
            return;
        }
        int size2 = this.f40273i.size();
        for (int i4 = 0; i4 < size2; i4++) {
            inputmethod.InputConnectionC34587Ms4 inputmethod_inputconnectionc34587ms42 = this.f40273i.get(i4).get();
            if (inputmethod_inputconnectionc34587ms42 != null) {
                inputmethod_inputconnectionc34587ms42.m94641f(this.f40271g, this.f40266b);
            }
        }
    }

    @Override // p000.InterfaceC43945kW3
    /* renamed from: c */
    public void mo28879c() {
        m78914r(EnumC8911a.HideKeyboard);
    }

    @Override // p000.InterfaceC43945kW3
    @Deprecated(message = "This method should not be called, used BringIntoViewRequester instead.")
    /* renamed from: d */
    public void mo28878d(C35055Os4 rect) {
        int roundToInt;
        int roundToInt2;
        int roundToInt3;
        int roundToInt4;
        Rect rect2;
        Intrinsics.checkNotNullParameter(rect, "rect");
        roundToInt = MathKt__MathJVMKt.roundToInt(rect.m91258i());
        roundToInt2 = MathKt__MathJVMKt.roundToInt(rect.m91255l());
        roundToInt3 = MathKt__MathJVMKt.roundToInt(rect.m91257j());
        roundToInt4 = MathKt__MathJVMKt.roundToInt(rect.m91262e());
        this.f40275k = new Rect(roundToInt, roundToInt2, roundToInt3, roundToInt4);
        if (this.f40273i.isEmpty() && (rect2 = this.f40275k) != null) {
            this.f40265a.requestRectangleOnScreen(new Rect(rect2));
        }
    }

    @Override // p000.InterfaceC43945kW3
    /* renamed from: e */
    public void mo28877e() {
        m78914r(EnumC8911a.ShowKeyboard);
    }

    @Override // p000.InterfaceC43945kW3
    /* renamed from: f */
    public void mo28876f(F16 value, GY1 imeOptions, Function1<? super List<? extends N91>, Unit> onEditCommand, Function1<? super FY1, Unit> onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        InterfaceC40980fW3 interfaceC40980fW3 = this.f40267c;
        if (interfaceC40980fW3 != null) {
            interfaceC40980fW3.mo30382b();
        }
        this.f40271g = value;
        this.f40272h = imeOptions;
        this.f40269e = onEditCommand;
        this.f40270f = onImeActionPerformed;
        m78914r(EnumC8911a.StartInput);
    }

    /* renamed from: l */
    public final InputConnection m78920l(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        Z16.m73823h(outAttrs, this.f40272h, this.f40271g);
        Z16.m73822i(outAttrs);
        inputmethod.InputConnectionC34587Ms4 inputmethod_inputconnectionc34587ms4 = new inputmethod.InputConnectionC34587Ms4(this.f40271g, new C8914d(), this.f40272h.m105020b());
        this.f40273i.add(new WeakReference<>(inputmethod_inputconnectionc34587ms4));
        return inputmethod_inputconnectionc34587ms4;
    }

    /* renamed from: m */
    public final BaseInputConnection m78919m() {
        return (BaseInputConnection) this.f40274j.getValue();
    }

    /* renamed from: n */
    public final View m78918n() {
        return this.f40265a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m78917o() {
        Boolean bool;
        if (!this.f40265a.isFocused()) {
            this.f40276l.m96696h();
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        LX2<EnumC8911a> lx2 = this.f40276l;
        int m96690u = lx2.m96690u();
        if (m96690u > 0) {
            EnumC8911a[] m96691s = lx2.m96691s();
            int i = 0;
            do {
                m78916p(m96691s[i], objectRef, objectRef2);
                i++;
            } while (i < m96690u);
            if (Intrinsics.areEqual(objectRef.element, Boolean.TRUE)) {
                m78915q();
            }
            bool = (Boolean) objectRef2.element;
            if (bool != null) {
                m78912t(bool.booleanValue());
            }
            if (!Intrinsics.areEqual(objectRef.element, Boolean.FALSE)) {
                m78915q();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(objectRef.element, Boolean.TRUE)) {
        }
        bool = (Boolean) objectRef2.element;
        if (bool != null) {
        }
        if (!Intrinsics.areEqual(objectRef.element, Boolean.FALSE)) {
        }
    }

    /* renamed from: q */
    public final void m78915q() {
        this.f40266b.mo29395b();
    }

    /* renamed from: r */
    public final void m78914r(EnumC8911a enumC8911a) {
        this.f40276l.m96701b(enumC8911a);
        if (this.f40277m == null) {
            Runnable runnable = new Runnable() { // from class: V16
                @Override // java.lang.Runnable
                public final void run() {
                    W16.m78913s(W16.this);
                }
            };
            this.f40268d.execute(runnable);
            this.f40277m = runnable;
        }
    }

    /* renamed from: t */
    public final void m78912t(boolean z) {
        if (z) {
            this.f40266b.mo29392e();
        } else {
            this.f40266b.mo29394c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ W16(View view, InterfaceC43083j32 interfaceC43083j32, InterfaceC40980fW3 interfaceC40980fW3, Executor executor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, interfaceC43083j32, interfaceC40980fW3, executor);
        interfaceC40980fW3 = (i & 4) != 0 ? null : interfaceC40980fW3;
        if ((i & 8) != 0) {
            Choreographer choreographer = Choreographer.getInstance();
            Intrinsics.checkNotNullExpressionValue(choreographer, "getInstance()");
            executor = Z16.m73827d(choreographer);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public W16(View view, InterfaceC40980fW3 interfaceC40980fW3) {
        this(view, new C43676k32(view), interfaceC40980fW3, null, 8, null);
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
