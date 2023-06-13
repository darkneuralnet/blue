package p000;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R'\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m28432d2 = {"LMx5;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "LLx5;", "b", "LLx5;", "getShaderBrush", "()LLx5;", "shaderBrush", "", "c", "F", "getAlpha", "()F", "alpha", "LxB5;", DateTokenConverter.CONVERTER_KEY, "J", "getSize-NH-jbRc", "()J", C17296a.f69688o, "(J)V", "size", "Lkotlin/Pair;", "Landroid/graphics/Shader;", "e", "Lkotlin/Pair;", "cachedShader", "<init>", "(LLx5;F)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShaderBrushSpan.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,57:1\n159#2:58\n*S KotlinDebug\n*F\n+ 1 ShaderBrushSpan.android.kt\nandroidx/compose/ui/text/platform/style/ShaderBrushSpan\n*L\n41#1:58\n*E\n"})
/* renamed from: Mx5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34633Mx5 extends CharacterStyle implements UpdateAppearance {

    /* renamed from: b */
    public final AbstractC34399Lx5 f23872b;

    /* renamed from: c */
    public final float f23873c;

    /* renamed from: d */
    public long f23874d;

    /* renamed from: e */
    public Pair<C51465xB5, ? extends Shader> f23875e;

    public C34633Mx5(AbstractC34399Lx5 shaderBrush, float f) {
        Intrinsics.checkNotNullParameter(shaderBrush, "shaderBrush");
        this.f23872b = shaderBrush;
        this.f23873c = f;
        this.f23874d = C51465xB5.f117175b.m5724a();
    }

    /* renamed from: a */
    public final void m94546a(long j) {
        this.f23874d = j;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        boolean z;
        Shader mo65060b;
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        C7218Rd.m86539a(textPaint, this.f23873c);
        if (this.f23874d == C51465xB5.f117175b.m5724a()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        Pair<C51465xB5, ? extends Shader> pair = this.f23875e;
        if (pair != null && C51465xB5.m5733f(pair.getFirst().m5725n(), this.f23874d)) {
            mo65060b = pair.getSecond();
        } else {
            mo65060b = this.f23872b.mo65060b(this.f23874d);
        }
        textPaint.setShader(mo65060b);
        this.f23875e = TuplesKt.m28425to(C51465xB5.m5736c(this.f23874d), mo65060b);
    }
}
