package androidx.compose.p003ui.graphics;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÅ\u0001\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010 \u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0002\b\u001eH\u0007\u001a\f\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, m28432d2 = {"LgV2;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lhy5;", "shape", "", "clip", "Low4;", "renderEffect", "Lpm0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "b", "(LgV2;FFFFFFFFFFJLhy5;ZLow4;JJI)LgV2;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "", "Lkotlin/ExtensionFunctionType;", "block", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.b */
/* loaded from: classes.dex */
public final class C11327b {
    /* renamed from: a */
    public static final InterfaceC41563gV2 m68714a(InterfaceC41563gV2 interfaceC41563gV2, Function1<? super InterfaceC11328c, Unit> block) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return interfaceC41563gV2.mo39266t0(new BlockGraphicsLayerElement(block));
    }

    /* renamed from: b */
    public static final InterfaceC41563gV2 m68713b(InterfaceC41563gV2 graphicsLayer, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC42444hy5 shape, boolean z, AbstractC46574ow4 abstractC46574ow4, long j2, long j3, int i) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return graphicsLayer.mo39266t0(new GraphicsLayerModifierNodeElement(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, j, shape, z, abstractC46574ow4, j2, j3, i, null));
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC41563gV2 m68712c(InterfaceC41563gV2 interfaceC41563gV2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC42444hy5 interfaceC42444hy5, boolean z, AbstractC46574ow4 abstractC46574ow4, long j2, long j3, int i, int i2, Object obj) {
        return m68713b(interfaceC41563gV2, (i2 & 1) != 0 ? 1.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) == 0 ? f3 : 1.0f, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0.0f : f5, (i2 & 32) != 0 ? 0.0f : f6, (i2 & 64) != 0 ? 0.0f : f7, (i2 & 128) != 0 ? 0.0f : f8, (i2 & 256) == 0 ? f9 : 0.0f, (i2 & 512) != 0 ? 8.0f : f10, (i2 & 1024) != 0 ? C11333f.f53066b.m68626a() : j, (i2 & 2048) != 0 ? C37629Zs4.m72365a() : interfaceC42444hy5, (i2 & 4096) != 0 ? false : z, (i2 & 8192) != 0 ? null : abstractC46574ow4, (i2 & 16384) != 0 ? XD1.m77177a() : j2, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? XD1.m77177a() : j3, (i2 & 65536) != 0 ? C11325a.f53022a.m68717a() : i);
    }

    /* renamed from: d */
    public static final InterfaceC41563gV2 m68711d(InterfaceC41563gV2 interfaceC41563gV2) {
        Intrinsics.checkNotNullParameter(interfaceC41563gV2, "<this>");
        if (!K32.m99301c()) {
            return interfaceC41563gV2;
        }
        return interfaceC41563gV2.mo39266t0(m68712c(InterfaceC41563gV2.f82354b0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null));
    }
}
