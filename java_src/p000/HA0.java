package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR+\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00158\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\t\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LHA0;", "", "LZe1;", C17296a.f69688o, "LZe1;", "c", "()LZe1;", "targetContentEnter", "Lgi1;", "b", "Lgi1;", "()Lgi1;", "initialContentExit", "", "<set-?>", "LEX2;", DateTokenConverter.CONVERTER_KEY, "()F", "setTargetContentZIndex", "(F)V", "targetContentZIndex", "LGB5;", "LGB5;", "()LGB5;", "setSizeTransform$animation_release", "(LGB5;)V", "sizeTransform", "<init>", "(LZe1;Lgi1;FLGB5;)V", "animation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,780:1\n76#2:781\n102#2,2:782\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n219#1:781\n219#1:782,2\n*E\n"})
/* renamed from: HA0 */
/* loaded from: classes.dex */
public final class HA0 {

    /* renamed from: a */
    public final AbstractC37500Ze1 f12997a;

    /* renamed from: b */
    public final AbstractC41687gi1 f12998b;

    /* renamed from: c */
    public final EX2 f12999c;

    /* renamed from: d */
    public GB5 f13000d;

    public HA0(AbstractC37500Ze1 targetContentEnter, AbstractC41687gi1 initialContentExit, float f, GB5 gb5) {
        EX2 m97025e;
        Intrinsics.checkNotNullParameter(targetContentEnter, "targetContentEnter");
        Intrinsics.checkNotNullParameter(initialContentExit, "initialContentExit");
        this.f12997a = targetContentEnter;
        this.f12998b = initialContentExit;
        m97025e = LM5.m97025e(Float.valueOf(f), null, 2, null);
        this.f12999c = m97025e;
        this.f13000d = gb5;
    }

    /* renamed from: a */
    public final AbstractC41687gi1 m104229a() {
        return this.f12998b;
    }

    /* renamed from: b */
    public final GB5 m104228b() {
        return this.f13000d;
    }

    /* renamed from: c */
    public final AbstractC37500Ze1 m104227c() {
        return this.f12997a;
    }

    /* renamed from: d */
    public final float m104226d() {
        return ((Number) this.f12999c.getValue()).floatValue();
    }

    public /* synthetic */ HA0(AbstractC37500Ze1 abstractC37500Ze1, AbstractC41687gi1 abstractC41687gi1, float f, GB5 gb5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC37500Ze1, abstractC41687gi1, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? C5326Me.m95098c(false, null, 3, null) : gb5);
    }
}
