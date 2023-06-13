package p000;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, m28432d2 = {"LTx5;", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "tp", "", "updateDrawState", "", C17296a.f69688o, "I", "getColor", "()I", "color", "", "b", "F", "getOffsetX", "()F", "offsetX", "c", "getOffsetY", "offsetY", DateTokenConverter.CONVERTER_KEY, "getRadius", "radius", "<init>", "(IFFF)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Tx5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36271Tx5 extends CharacterStyle {

    /* renamed from: a */
    public final int f36497a;

    /* renamed from: b */
    public final float f36498b;

    /* renamed from: c */
    public final float f36499c;

    /* renamed from: d */
    public final float f36500d;

    public C36271Tx5(int i, float f, float f2, float f3) {
        this.f36497a = i;
        this.f36498b = f;
        this.f36499c = f2;
        this.f36500d = f3;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        tp.setShadowLayer(this.f36500d, this.f36498b, this.f36499c, this.f36497a);
    }
}
