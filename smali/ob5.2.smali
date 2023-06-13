.class public abstract Lob5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly12;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008!\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006JI\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000bH\'\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u00072\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\u0008\u0010\u0017\u001a\u00020\u0016H\u0016R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018R\u001d\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0019R\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u001e"
    }
    d2 = {
        "Lob5;",
        "Ly12;",
        "Le62;",
        "interactionSource",
        "Lz12;",
        "a",
        "(Le62;LEt0;I)Lz12;",
        "",
        "bounded",
        "Lk61;",
        "radius",
        "LsP5;",
        "Lpm0;",
        "color",
        "Lpb5;",
        "rippleAlpha",
        "Lvb5;",
        "b",
        "(Le62;ZFLsP5;LsP5;LEt0;I)Lvb5;",
        "",
        "other",
        "equals",
        "",
        "hashCode",
        "Z",
        "F",
        "c",
        "LsP5;",
        "<init>",
        "(ZFLsP5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "material-ripple_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,355:1\n76#2:356\n654#3:357\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/Ripple\n*L\n117#1:356\n119#1:357\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:F

.field public final c:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZFLsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZF",
            "LsP5<",
            "Lpm0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lob5;->a:Z

    iput p2, p0, Lob5;->b:F

    iput-object p3, p0, Lob5;->c:LsP5;

    return-void
.end method

.method public synthetic constructor <init>(ZFLsP5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lob5;-><init>(ZFLsP5;)V

    return-void
.end method


# virtual methods
.method public final a(Le62;LEt0;I)Lz12;
    .locals 11

    const-string v0, "interactionSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3aef0613

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:113)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Lyb5;->d()LU94;

    move-result-object v0

    invoke-interface {p2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxb5;

    const v1, -0x5adb992e

    invoke-interface {p2, v1}, LEt0;->F(I)V

    iget-object v1, p0, Lob5;->c:LsP5;

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpm0;

    invoke-virtual {v1}, Lpm0;->w()J

    move-result-wide v1

    sget-object v3, Lpm0;->b:Lpm0$a;

    invoke-virtual {v3}, Lpm0$a;->g()J

    move-result-wide v3

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, p0, Lob5;->c:LsP5;

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpm0;

    invoke-virtual {v1}, Lpm0;->w()J

    move-result-wide v3

    goto :goto_1

    :cond_2
    invoke-interface {v0, p2, v2}, Lxb5;->defaultColor-WaAFU9c(LEt0;I)J

    move-result-wide v3

    :goto_1
    invoke-interface {p2}, LEt0;->Q()V

    invoke-static {v3, v4}, Lpm0;->i(J)Lpm0;

    move-result-object v1

    invoke-static {v1, p2, v2}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v7

    invoke-interface {v0, p2, v2}, Lxb5;->rippleAlpha(LEt0;I)Lpb5;

    move-result-object v0

    invoke-static {v0, p2, v2}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object v8

    iget-boolean v5, p0, Lob5;->a:Z

    iget v6, p0, Lob5;->b:F

    and-int/lit8 v0, p3, 0xe

    shl-int/lit8 v1, p3, 0xc

    const/high16 v2, 0x70000

    and-int/2addr v1, v2

    or-int v10, v0, v1

    move-object v3, p0

    move-object v4, p1

    move-object v9, p2

    invoke-virtual/range {v3 .. v10}, Lob5;->b(Le62;ZFLsP5;LsP5;LEt0;I)Lvb5;

    move-result-object v0

    new-instance v1, Lob5$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lob5$a;-><init>(Le62;Lvb5;Lkotlin/coroutines/Continuation;)V

    shl-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0x70

    or-int/lit16 p3, p3, 0x208

    invoke-static {v0, p1, v1, p2, p3}, LY91;->e(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    invoke-interface {p2}, LEt0;->Q()V

    return-object v0
.end method

.method public abstract b(Le62;ZFLsP5;LsP5;LEt0;I)Lvb5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le62;",
            "ZF",
            "LsP5<",
            "Lpm0;",
            ">;",
            "LsP5<",
            "Lpb5;",
            ">;",
            "LEt0;",
            "I)",
            "Lvb5;"
        }
    .end annotation
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lob5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-boolean v1, p0, Lob5;->a:Z

    check-cast p1, Lob5;

    iget-boolean v3, p1, Lob5;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lob5;->b:F

    iget v3, p1, Lob5;->b:F

    invoke-static {v1, v3}, Lk61;->i(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lob5;->c:LsP5;

    iget-object p1, p1, Lob5;->c:LsP5;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lob5;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lob5;->b:F

    invoke-static {v1}, Lk61;->j(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lob5;->c:LsP5;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
