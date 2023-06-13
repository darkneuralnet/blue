.class public interface abstract Landroidx/compose/ui/graphics/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg01;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008f\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0003\u0010\u0004\"\u0004\u0008\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0008\u0010\u0004\"\u0004\u0008\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u0004\"\u0004\u0008\u000c\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000e\u0010\u0004\"\u0004\u0008\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0011\u0010\u0004\"\u0004\u0008\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0014\u0010\u0004\"\u0004\u0008\u0015\u0010\u0006R-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0096\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR-\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178V@VX\u0096\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u001e\u0010\u001a\"\u0004\u0008\u001f\u0010\u001cR\u001c\u0010\"\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010\u0004\"\u0004\u0008!\u0010\u0006R\u001c\u0010%\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008#\u0010\u0004\"\u0004\u0008$\u0010\u0006R\u001c\u0010(\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008&\u0010\u0004\"\u0004\u0008\'\u0010\u0006R\u001c\u0010+\u001a\u00020\u00028&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u0008)\u0010\u0004\"\u0004\u0008*\u0010\u0006R%\u0010/\u001a\u00020,8&@&X\u00a6\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\u001a\u0004\u0008-\u0010\u001a\"\u0004\u0008.\u0010\u001cR\u001c\u00105\u001a\u0002008&@&X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R\"\u0010=\u001a\u0002068f@&X\u00a6\u000e\u00a2\u0006\u0012\u0012\u0004\u0008;\u0010<\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R(\u0010D\u001a\u0004\u0018\u00010>2\u0008\u0010?\u001a\u0004\u0018\u00010>8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR-\u0010F\u001a\u00020E2\u0006\u0010F\u001a\u00020E8V@VX\u0096\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u000c\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010J\u00f8\u0001\u0003\u0082\u0002\u0015\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\n\u0004\u0008!0\u0001\u00a8\u0006K\u00c0\u0006\u0003"
    }
    d2 = {
        "Landroidx/compose/ui/graphics/c;",
        "Lg01;",
        "",
        "L0",
        "()F",
        "D",
        "(F)V",
        "scaleX",
        "Z0",
        "E",
        "scaleY",
        "getAlpha",
        "g",
        "alpha",
        "h0",
        "G",
        "translationX",
        "c0",
        "k",
        "translationY",
        "getShadowElevation",
        "T",
        "shadowElevation",
        "Lpm0;",
        "ambientShadowColor",
        "getAmbientShadowColor-0d7_KjU",
        "()J",
        "A0",
        "(J)V",
        "spotShadowColor",
        "getSpotShadowColor-0d7_KjU",
        "G0",
        "X0",
        "q",
        "rotationX",
        "w0",
        "r",
        "rotationY",
        "y0",
        "u",
        "rotationZ",
        "N",
        "p",
        "cameraDistance",
        "Landroidx/compose/ui/graphics/f;",
        "D0",
        "P",
        "transformOrigin",
        "Lhy5;",
        "getShape",
        "()Lhy5;",
        "S0",
        "(Lhy5;)V",
        "shape",
        "",
        "getClip",
        "()Z",
        "O",
        "(Z)V",
        "getClip$annotations",
        "()V",
        "clip",
        "Low4;",
        "<anonymous parameter 0>",
        "getRenderEffect",
        "()Low4;",
        "l",
        "(Low4;)V",
        "renderEffect",
        "Landroidx/compose/ui/graphics/a;",
        "compositingStrategy",
        "getCompositingStrategy--NrFUSI",
        "()I",
        "m",
        "(I)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public A0(J)V
    .locals 0

    return-void
.end method

.method public abstract D(F)V
.end method

.method public abstract D0()J
.end method

.method public abstract E(F)V
.end method

.method public abstract G(F)V
.end method

.method public G0(J)V
    .locals 0

    return-void
.end method

.method public abstract L0()F
.end method

.method public abstract N()F
.end method

.method public abstract O(Z)V
.end method

.method public abstract P(J)V
.end method

.method public abstract S0(Lhy5;)V
.end method

.method public abstract T(F)V
.end method

.method public abstract X0()F
.end method

.method public abstract Z0()F
.end method

.method public abstract c0()F
.end method

.method public abstract g(F)V
.end method

.method public abstract h0()F
.end method

.method public abstract k(F)V
.end method

.method public l(Low4;)V
    .locals 0

    return-void
.end method

.method public m(I)V
    .locals 0

    return-void
.end method

.method public abstract p(F)V
.end method

.method public abstract q(F)V
.end method

.method public abstract r(F)V
.end method

.method public abstract u(F)V
.end method

.method public abstract w0()F
.end method

.method public abstract y0()F
.end method
