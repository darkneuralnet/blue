package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0013\u0018B\u0007¢\u0006\u0004\b\"\u0010#J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007J(\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJM\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u001e\u0010\u0010\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0086@ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u001b8\u0002X\u0082\u0004ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 \u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m28432d2 = {"Lmp;", "", "Lew1;", PaymentSheetEvent.FIELD_FONT, "LxV3;", "platformFontLoader", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "forever", "", "e", "Lmp$a;", DateTokenConverter.CONVERTER_KEY, "(Lew1;LxV3;)Lmp$a;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "g", "(Lew1;LxV3;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", C17296a.f69688o, "Ljava/lang/Object;", "PermanentFailure", "LtE2;", "Lmp$b;", "b", "LtE2;", "resultCache", "LMA5;", "c", "LMA5;", "permanentCache", "LRX5;", "LRX5;", "cacheLock", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,427:1\n24#2:428\n24#2:429\n24#2:430\n24#2:431\n24#2:432\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n*L\n365#1:428\n376#1:429\n388#1:430\n395#1:431\n416#1:432\n*E\n"})
/* renamed from: mp */
/* loaded from: classes.dex */
public final class C26259mp {

    /* renamed from: a */
    public final Object f98840a = C26260a.m24891b(null);

    /* renamed from: b */
    public final C49118tE2<C26261b, C26260a> f98841b = new C49118tE2<>(16);

    /* renamed from: c */
    public final MA5<C26261b, C26260a> f98842c = new MA5<>(0, 1, null);

    /* renamed from: d */
    public final RX5 f98843d = CX5.m112154a();

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081@\u0018\u00002\u00020\u0001B\u0014\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0010\u0092\u0001\u0004\u0018\u00010\u0001ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lmp$a;", "", "", "f", "(Ljava/lang/Object;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)I", LegacyRepairType.OTHER_KEY, "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", C17296a.f69688o, "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "e", "(Ljava/lang/Object;)Z", "isPermanentFailure", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @JvmInline
    /* renamed from: mp$a */
    /* loaded from: classes.dex */
    public static final class C26260a {

        /* renamed from: a */
        public final Object f98844a;

        public /* synthetic */ C26260a(Object obj) {
            this.f98844a = obj;
        }

        /* renamed from: a */
        public static final /* synthetic */ C26260a m24892a(Object obj) {
            return new C26260a(obj);
        }

        /* renamed from: b */
        public static Object m24891b(Object obj) {
            return obj;
        }

        /* renamed from: c */
        public static boolean m24890c(Object obj, Object obj2) {
            return (obj2 instanceof C26260a) && Intrinsics.areEqual(obj, ((C26260a) obj2).m24886g());
        }

        /* renamed from: d */
        public static int m24889d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: e */
        public static final boolean m24888e(Object obj) {
            return obj == null;
        }

        /* renamed from: f */
        public static String m24887f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj) {
            return m24890c(this.f98844a, obj);
        }

        /* renamed from: g */
        public final /* synthetic */ Object m24886g() {
            return this.f98844a;
        }

        public int hashCode() {
            return m24889d(this.f98844a);
        }

        public String toString() {
            return m24887f(this.f98844a);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lmp$b;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lew1;", C17296a.f69688o, "Lew1;", "getFont", "()Lew1;", PaymentSheetEvent.FIELD_FONT, "b", "Ljava/lang/Object;", "getLoaderKey", "()Ljava/lang/Object;", "loaderKey", "<init>", "(Lew1;Ljava/lang/Object;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mp$b */
    /* loaded from: classes.dex */
    public static final class C26261b {

        /* renamed from: a */
        public final InterfaceC40641ew1 f98845a;

        /* renamed from: b */
        public final Object f98846b;

        public C26261b(InterfaceC40641ew1 font, Object obj) {
            Intrinsics.checkNotNullParameter(font, "font");
            this.f98845a = font;
            this.f98846b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C26261b) {
                C26261b c26261b = (C26261b) obj;
                return Intrinsics.areEqual(this.f98845a, c26261b.f98845a) && Intrinsics.areEqual(this.f98846b, c26261b.f98846b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f98845a.hashCode() * 31;
            Object obj = this.f98846b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.f98845a + ", loaderKey=" + this.f98846b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.text.font.AsyncTypefaceCache", m28418f = "FontListFontFamilyTypefaceAdapter.kt", m28417i = {0, 0, 0}, m28416l = {394}, m28415m = "runCached", m28414n = {"this", "key", "forever"}, m28413s = {"L$0", "L$1", "Z$0"})
    /* renamed from: mp$c */
    /* loaded from: classes.dex */
    public static final class C26262c extends ContinuationImpl {

        /* renamed from: h */
        public Object f98847h;

        /* renamed from: i */
        public Object f98848i;

        /* renamed from: j */
        public boolean f98849j;

        /* renamed from: k */
        public /* synthetic */ Object f98850k;

        /* renamed from: m */
        public int f98852m;

        public C26262c(Continuation<? super C26262c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f98850k = obj;
            this.f98852m |= Integer.MIN_VALUE;
            return C26259mp.this.m24893g(null, null, false, null, this);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m24894f(C26259mp c26259mp, InterfaceC40641ew1 interfaceC40641ew1, InterfaceC51643xV3 interfaceC51643xV3, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        c26259mp.m24895e(interfaceC40641ew1, interfaceC51643xV3, obj, z);
    }

    /* renamed from: d */
    public final C26260a m24896d(InterfaceC40641ew1 font, InterfaceC51643xV3 platformFontLoader) {
        C26260a m12574d;
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        C26261b c26261b = new C26261b(font, platformFontLoader.mo5115a());
        synchronized (this.f98843d) {
            m12574d = this.f98841b.m12574d(c26261b);
            if (m12574d == null) {
                m12574d = this.f98842c.m95622b(c26261b);
            }
        }
        return m12574d;
    }

    /* renamed from: e */
    public final void m24895e(InterfaceC40641ew1 font, InterfaceC51643xV3 platformFontLoader, Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        C26261b c26261b = new C26261b(font, platformFontLoader.mo5115a());
        synchronized (this.f98843d) {
            try {
                if (obj == null) {
                    this.f98842c.m95616h(c26261b, C26260a.m24892a(this.f98840a));
                } else if (z) {
                    this.f98842c.m95616h(c26261b, C26260a.m24892a(C26260a.m24891b(obj)));
                } else {
                    this.f98841b.m12573e(c26261b, C26260a.m24892a(C26260a.m24891b(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m24893g(InterfaceC40641ew1 interfaceC40641ew1, InterfaceC51643xV3 interfaceC51643xV3, boolean z, Function1<? super Continuation<Object>, ? extends Object> function1, Continuation<Object> continuation) {
        C26262c c26262c;
        Object coroutine_suspended;
        int i;
        C26259mp c26259mp;
        C26261b c26261b;
        if (continuation instanceof C26262c) {
            c26262c = (C26262c) continuation;
            int i2 = c26262c.f98852m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c26262c.f98852m = i2 - Integer.MIN_VALUE;
                Object obj = c26262c.f98850k;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c26262c.f98852m;
                if (i == 0) {
                    if (i == 1) {
                        z = c26262c.f98849j;
                        c26261b = (C26261b) c26262c.f98848i;
                        c26259mp = (C26259mp) c26262c.f98847h;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    C26261b c26261b2 = new C26261b(interfaceC40641ew1, interfaceC51643xV3.mo5115a());
                    synchronized (this.f98843d) {
                        C26260a m12574d = this.f98841b.m12574d(c26261b2);
                        if (m12574d == null) {
                            m12574d = this.f98842c.m95622b(c26261b2);
                        }
                        if (m12574d != null) {
                            return m12574d.m24886g();
                        }
                        Unit unit = Unit.INSTANCE;
                        c26262c.f98847h = this;
                        c26262c.f98848i = c26261b2;
                        c26262c.f98849j = z;
                        c26262c.f98852m = 1;
                        Object invoke = function1.invoke(c26262c);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c26259mp = this;
                        obj = invoke;
                        c26261b = c26261b2;
                    }
                }
                synchronized (c26259mp.f98843d) {
                    try {
                        if (obj == null) {
                            c26259mp.f98842c.m95616h(c26261b, C26260a.m24892a(c26259mp.f98840a));
                        } else if (z) {
                            c26259mp.f98842c.m95616h(c26261b, C26260a.m24892a(C26260a.m24891b(obj)));
                        } else {
                            c26259mp.f98841b.m12573e(c26261b, C26260a.m24892a(C26260a.m24891b(obj)));
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return obj;
            }
        }
        c26262c = new C26262c(continuation);
        Object obj2 = c26262c.f98850k;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c26262c.f98852m;
        if (i == 0) {
        }
        synchronized (c26259mp.f98843d) {
        }
    }
}
