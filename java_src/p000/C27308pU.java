package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C50897wE3;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0016\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002\u001a\u001f\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"Landroid/graphics/Bitmap;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "color", "g", "alphaSubstitute", "e", "(Landroid/graphics/Bitmap;I)Ljava/lang/Double;", "Landroid/graphics/Paint;", C17296a.f69688o, "Landroid/graphics/Paint;", "BITMAP_PAINT", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBitmapUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtils.kt\ncom/chuckerteam/chucker/internal/support/BitmapUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* renamed from: pU */
/* loaded from: classes5.dex */
public final class C27308pU {

    /* renamed from: a */
    public static final Paint f103741a = new Paint(2);

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.chuckerteam.chucker.internal.support.BitmapUtilsKt$calculateLuminance$2", m28418f = "BitmapUtils.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: pU$a */
    /* loaded from: classes5.dex */
    public static final class C27309a extends SuspendLambda implements Function2<ZC0, Continuation<? super Double>, Object> {

        /* renamed from: h */
        public int f103742h;

        /* renamed from: i */
        public final /* synthetic */ Bitmap f103743i;

        /* renamed from: j */
        public final /* synthetic */ int f103744j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27309a(Bitmap bitmap, int i, Continuation<? super C27309a> continuation) {
            super(2, continuation);
            this.f103743i = bitmap;
            this.f103744j = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C27309a(this.f103743i, this.f103744j, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Double> continuation) {
            return ((C27309a) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f103742h == 0) {
                ResultKt.throwOnFailure(obj);
                return C27308pU.m19218e(C27308pU.m19216g(this.f103743i, this.f103744j), this.f103744j);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: d */
    public static final Object m19219d(Bitmap bitmap, Continuation<? super Double> continuation) {
        return X30.m77504g(T41.m84378a(), new C27309a(bitmap, -65281, null), continuation);
    }

    /* renamed from: e */
    public static final Double m19218e(Bitmap bitmap, final int i) {
        C50897wE3 m7177c = C50897wE3.m7189b(bitmap).m7178b().m7179a(new C50897wE3.InterfaceC29815c() { // from class: oU
            @Override // p000.C50897wE3.InterfaceC29815c
            /* renamed from: a */
            public final boolean mo7174a(int i2, float[] fArr) {
                boolean m19217f;
                m19217f = C27308pU.m19217f(i, i2, fArr);
                return m19217f;
            }
        }).m7177c();
        Intrinsics.checkNotNullExpressionValue(m7177c, "from(this)\n        .clea…te) }\n        .generate()");
        C50897wE3.C29816d m7185f = m7177c.m7185f();
        if (m7185f != null) {
            return Double.valueOf(C33827Jm0.m99855f(m7185f.m7169e()));
        }
        return null;
    }

    /* renamed from: f */
    public static final boolean m19217f(int i, int i2, float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<anonymous parameter 1>");
        return i2 != i;
    }

    /* renamed from: g */
    public static final Bitmap m19216g(Bitmap bitmap, int i) {
        Bitmap result = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        result.eraseColor(i);
        new Canvas(result).drawBitmap(bitmap, new Matrix(), f103741a);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
