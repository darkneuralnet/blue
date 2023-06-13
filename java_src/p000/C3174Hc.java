package p000;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C50128uw1;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m28432d2 = {"LHc;", "LxV3;", "Lew1;", PaymentSheetEvent.FIELD_FONT, "Landroid/graphics/Typeface;", DateTokenConverter.CONVERTER_KEY, "c", "(Lew1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "cacheKey", "<init>", "(Landroid/content/Context;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* renamed from: Hc */
/* loaded from: classes.dex */
public final class C3174Hc implements InterfaceC51643xV3 {

    /* renamed from: a */
    public final Context f13627a;

    /* renamed from: b */
    public final Object f13628b;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @DebugMetadata(m28419c = "androidx.compose.ui.text.font.AndroidFontLoader", m28418f = "AndroidFontLoader.android.kt", m28417i = {1, 1}, m28416l = {61, 62}, m28415m = "awaitLoad", m28414n = {"this", PaymentSheetEvent.FIELD_FONT}, m28413s = {"L$0", "L$1"})
    /* renamed from: Hc$a */
    /* loaded from: classes.dex */
    public static final class C3175a extends ContinuationImpl {

        /* renamed from: h */
        public Object f13629h;

        /* renamed from: i */
        public Object f13630i;

        /* renamed from: j */
        public /* synthetic */ Object f13631j;

        /* renamed from: l */
        public int f13633l;

        public C3175a(Continuation<? super C3175a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13631j = obj;
            this.f13633l |= Integer.MIN_VALUE;
            return C3174Hc.this.mo5113c(null, this);
        }
    }

    public C3174Hc(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13627a = context.getApplicationContext();
    }

    @Override // p000.InterfaceC51643xV3
    /* renamed from: a */
    public Object mo5115a() {
        return this.f13628b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // p000.InterfaceC51643xV3
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo5113c(InterfaceC40641ew1 interfaceC40641ew1, Continuation<? super Typeface> continuation) {
        C3175a c3175a;
        Object coroutine_suspended;
        int i;
        C3174Hc c3174Hc;
        if (continuation instanceof C3175a) {
            c3175a = (C3175a) continuation;
            int i2 = c3175a.f13633l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3175a.f13633l = i2 - Integer.MIN_VALUE;
                Object obj = c3175a.f13631j;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3175a.f13633l;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            interfaceC40641ew1 = (InterfaceC40641ew1) c3175a.f13630i;
                            c3174Hc = (C3174Hc) c3175a.f13629h;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    if (!(interfaceC40641ew1 instanceof AbstractC2896Gc)) {
                        if (interfaceC40641ew1 instanceof C41484gM4) {
                            Context context = this.f13627a;
                            Intrinsics.checkNotNullExpressionValue(context, "context");
                            c3175a.f13629h = this;
                            c3175a.f13630i = interfaceC40641ew1;
                            c3175a.f13633l = 2;
                            obj = C3715Ic.m101891d((C41484gM4) interfaceC40641ew1, context, c3175a);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c3174Hc = this;
                        } else {
                            throw new IllegalArgumentException("Unknown font type: " + interfaceC40641ew1);
                        }
                    } else {
                        ((AbstractC2896Gc) interfaceC40641ew1).m104973d();
                        Intrinsics.checkNotNullExpressionValue(this.f13627a, "context");
                        c3175a.f13633l = 1;
                        throw null;
                    }
                }
                C33684Iw1 m39571e = ((C41484gM4) interfaceC40641ew1).m39571e();
                Context context2 = c3174Hc.f13627a;
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                return C46910pW3.m19151c((Typeface) obj, m39571e, context2);
            }
        }
        c3175a = new C3175a(continuation);
        Object obj2 = c3175a.f13631j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3175a.f13633l;
        if (i == 0) {
        }
        C33684Iw1 m39571e2 = ((C41484gM4) interfaceC40641ew1).m39571e();
        Context context22 = c3174Hc.f13627a;
        Intrinsics.checkNotNullExpressionValue(context22, "context");
        return C46910pW3.m19151c((Typeface) obj2, m39571e2, context22);
    }

    @Override // p000.InterfaceC51643xV3
    /* renamed from: d */
    public Typeface mo5114b(InterfaceC40641ew1 font) {
        Object m116783constructorimpl;
        Typeface typeface;
        Intrinsics.checkNotNullParameter(font, "font");
        Typeface typeface2 = null;
        if (!(font instanceof AbstractC2896Gc)) {
            if (!(font instanceof C41484gM4)) {
                return null;
            }
            int mo39575a = font.mo39575a();
            C50128uw1.C29344a c29344a = C50128uw1.f113218a;
            if (C50128uw1.m9479e(mo39575a, c29344a.m9475b())) {
                Context context = this.f13627a;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                typeface = C3715Ic.m101892c((C41484gM4) font, context);
            } else if (C50128uw1.m9479e(mo39575a, c29344a.m9474c())) {
                try {
                    Result.Companion companion = Result.Companion;
                    Context context2 = this.f13627a;
                    Intrinsics.checkNotNullExpressionValue(context2, "context");
                    m116783constructorimpl = Result.m116783constructorimpl(C3715Ic.m101892c((C41484gM4) font, context2));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                }
                if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
                    typeface2 = m116783constructorimpl;
                }
                typeface = typeface2;
            } else if (C50128uw1.m9479e(mo39575a, c29344a.m9476a())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            } else {
                throw new IllegalArgumentException("Unknown loading type " + ((Object) C50128uw1.m9477g(font.mo39575a())));
            }
            C33684Iw1 m39571e = ((C41484gM4) font).m39571e();
            Context context3 = this.f13627a;
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            return C46910pW3.m19151c(typeface, m39571e, context3);
        }
        ((AbstractC2896Gc) font).m104973d();
        Intrinsics.checkNotNullExpressionValue(this.f13627a, "context");
        throw null;
    }
}
