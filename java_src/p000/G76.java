package p000;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m28432d2 = {"LG76;", "", "<init>", "()V", C17296a.f69688o, "b", "c", "LG76$a;", "LG76$b;", "LG76$c;", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: G76 */
/* loaded from: classes5.dex */
public abstract class G76 {

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0007R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"LG76$a;", "LG76;", "Landroid/text/SpannableStringBuilder;", C17296a.f69688o, "Landroid/text/SpannableStringBuilder;", "()Landroid/text/SpannableStringBuilder;", "b", "(Landroid/text/SpannableStringBuilder;)V", "line", "<init>", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: G76$a */
    /* loaded from: classes5.dex */
    public static final class C2667a extends G76 {

        /* renamed from: a */
        public SpannableStringBuilder f11025a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2667a(SpannableStringBuilder line) {
            super(null);
            Intrinsics.checkNotNullParameter(line, "line");
            this.f11025a = line;
        }

        /* renamed from: a */
        public final SpannableStringBuilder m105724a() {
            return this.f11025a;
        }

        /* renamed from: b */
        public final void m105723b(SpannableStringBuilder spannableStringBuilder) {
            Intrinsics.checkNotNullParameter(spannableStringBuilder, "<set-?>");
            this.f11025a = spannableStringBuilder;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, m28432d2 = {"LG76$b;", "LG76;", "Landroid/text/Spanned;", C17296a.f69688o, "Landroid/text/Spanned;", "()Landroid/text/Spanned;", "headers", "<init>", "(Landroid/text/Spanned;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: G76$b */
    /* loaded from: classes5.dex */
    public static final class C2668b extends G76 {

        /* renamed from: a */
        public final Spanned f11026a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2668b(Spanned headers) {
            super(null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f11026a = headers;
        }

        /* renamed from: a */
        public final Spanned m105722a() {
            return this.f11026a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, m28432d2 = {"LG76$c;", "LG76;", "Landroid/graphics/Bitmap;", C17296a.f69688o, "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", Entry.TYPE_IMAGE, "", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "luminance", "<init>", "(Landroid/graphics/Bitmap;Ljava/lang/Double;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: G76$c */
    /* loaded from: classes5.dex */
    public static final class C2669c extends G76 {

        /* renamed from: a */
        public final Bitmap f11027a;

        /* renamed from: b */
        public final Double f11028b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2669c(Bitmap image, Double d) {
            super(null);
            Intrinsics.checkNotNullParameter(image, "image");
            this.f11027a = image;
            this.f11028b = d;
        }

        /* renamed from: a */
        public final Bitmap m105721a() {
            return this.f11027a;
        }

        /* renamed from: b */
        public final Double m105720b() {
            return this.f11028b;
        }
    }

    public /* synthetic */ G76(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private G76() {
    }
}
