package p000;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0014\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u0011"}, m28432d2 = {"LNb6;", "", "Landroid/graphics/Typeface;", "typeface", "LIw1;", "variationSettings", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, C17296a.f69688o, "", "b", "Ljava/lang/ThreadLocal;", "Landroid/graphics/Paint;", "Ljava/lang/ThreadLocal;", "threadLocalPaint", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Nb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34670Nb6 {

    /* renamed from: a */
    public static final C34670Nb6 f24839a = new C34670Nb6();

    /* renamed from: b */
    public static ThreadLocal<Paint> f24840b = new ThreadLocal<>();

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LHw1;", "setting", "", C17296a.f69688o, "(LHw1;)Ljava/lang/CharSequence;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Nb6$a */
    /* loaded from: classes.dex */
    public static final class C5611a extends Lambda implements Function1<InterfaceC33450Hw1, CharSequence> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC41273g01 f24841g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5611a(InterfaceC41273g01 interfaceC41273g01) {
            super(1);
            this.f24841g = interfaceC41273g01;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC33450Hw1 setting) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            return CoreConstants.SINGLE_QUOTE_CHAR + setting.m103218a() + "' " + setting.m103216c(this.f24841g);
        }
    }

    private C34670Nb6() {
    }

    /* renamed from: a */
    public final Typeface m93724a(Typeface typeface, C33684Iw1 variationSettings, Context context) {
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        Intrinsics.checkNotNullParameter(context, "context");
        if (typeface == null) {
            return null;
        }
        if (variationSettings.m101463a().isEmpty()) {
            return typeface;
        }
        Paint paint = f24840b.get();
        if (paint == null) {
            paint = new Paint();
            f24840b.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(m93723b(variationSettings, context));
        return paint.getTypeface();
    }

    /* renamed from: b */
    public final String m93723b(C33684Iw1 c33684Iw1, Context context) {
        return C42464i06.m35393d(c33684Iw1.m101463a(), null, null, null, 0, null, new C5611a(C0163Ac.m115450a(context)), 31, null);
    }
}
