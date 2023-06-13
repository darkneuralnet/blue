package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m28432d2 = {"LgM4;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Typeface;", "c", DateTokenConverter.CONVERTER_KEY, "(LgM4;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ic */
/* loaded from: classes.dex */
public final class C3715Ic {

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Landroid/graphics/Typeface;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", m28418f = "AndroidFontLoader.android.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: Ic$a */
    /* loaded from: classes.dex */
    public static final class C3716a extends SuspendLambda implements Function2<ZC0, Continuation<? super Typeface>, Object> {

        /* renamed from: h */
        public int f15931h;

        /* renamed from: i */
        public final /* synthetic */ C41484gM4 f15932i;

        /* renamed from: j */
        public final /* synthetic */ Context f15933j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3716a(C41484gM4 c41484gM4, Context context, Continuation<? super C3716a> continuation) {
            super(2, continuation);
            this.f15932i = c41484gM4;
            this.f15933j = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C3716a(this.f15932i, this.f15933j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Typeface> continuation) {
            return ((C3716a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15931h == 0) {
                ResultKt.throwOnFailure(obj);
                return C3715Ic.m101892c(this.f15932i, this.f15933j);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: c */
    public static final Typeface m101892c(C41484gM4 c41484gM4, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C42670iM4.f87198a.m34132a(context, c41484gM4);
        }
        Typeface m10395h = C49785uM4.m10395h(context, c41484gM4.m39572d());
        Intrinsics.checkNotNull(m10395h);
        Intrinsics.checkNotNullExpressionValue(m10395h, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return m10395h;
    }

    /* renamed from: d */
    public static final Object m101891d(C41484gM4 c41484gM4, Context context, Continuation<? super Typeface> continuation) {
        return X30.m77504g(T41.m84377b(), new C3716a(c41484gM4, context, null), continuation);
    }
}
