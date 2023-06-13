.class public final Lwb5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a3\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0016\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u001a\u0018\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\"\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "bounded",
        "Lk61;",
        "radius",
        "Lpm0;",
        "color",
        "Ly12;",
        "e",
        "(ZFJLEt0;II)Ly12;",
        "Ld62;",
        "interaction",
        "Llf;",
        "",
        "c",
        "d",
        "Ltb6;",
        "a",
        "Ltb6;",
        "DefaultTweenSpec",
        "material-ripple_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,355:1\n50#2:356\n49#2:357\n1057#3,6:358\n*S KotlinDebug\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/ripple/RippleKt\n*L\n83#1:356\n83#1:357\n83#1:358,6\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Ltb6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltb6<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v6, Ltb6;

    const/16 v1, 0xf

    const/4 v2, 0x0

    invoke-static {}, Li91;->c()Lh91;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ltb6;-><init>(IILh91;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lwb5;->a:Ltb6;

    return-void
.end method

.method public static final synthetic a(Ld62;)Llf;
    .locals 0

    invoke-static {p0}, Lwb5;->c(Ld62;)Llf;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ld62;)Llf;
    .locals 0

    invoke-static {p0}, Lwb5;->d(Ld62;)Llf;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ld62;)Llf;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld62;",
            ")",
            "Llf<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, LjN1;

    if-eqz v0, :cond_0

    sget-object p0, Lwb5;->a:Ltb6;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lxv1;

    if-eqz v0, :cond_1

    new-instance p0, Ltb6;

    const/16 v2, 0x2d

    const/4 v3, 0x0

    invoke-static {}, Li91;->c()Lh91;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Ltb6;-><init>(IILh91;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    instance-of p0, p0, Ls61;

    if-eqz p0, :cond_2

    new-instance p0, Ltb6;

    const/16 v1, 0x2d

    const/4 v2, 0x0

    invoke-static {}, Li91;->c()Lh91;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ltb6;-><init>(IILh91;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    sget-object p0, Lwb5;->a:Ltb6;

    :goto_0
    return-object p0
.end method

.method public static final d(Ld62;)Llf;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld62;",
            ")",
            "Llf<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, LjN1;

    if-eqz v0, :cond_0

    sget-object p0, Lwb5;->a:Ltb6;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lxv1;

    if-eqz v0, :cond_1

    sget-object p0, Lwb5;->a:Ltb6;

    goto :goto_0

    :cond_1
    instance-of p0, p0, Ls61;

    if-eqz p0, :cond_2

    new-instance p0, Ltb6;

    const/16 v1, 0x96

    const/4 v2, 0x0

    invoke-static {}, Li91;->c()Lh91;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ltb6;-><init>(IILh91;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    sget-object p0, Lwb5;->a:Ltb6;

    :goto_0
    return-object p0
.end method

.method public static final e(ZFJLEt0;II)Ly12;
    .locals 2

    const v0, 0x61769d80

    invoke-interface {p4, v0}, LEt0;->F(I)V

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    :cond_0
    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    sget-object p1, Lk61;->c:Lk61$a;

    invoke-virtual {p1}, Lk61$a;->c()F

    move-result p1

    :cond_1
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_2

    sget-object p2, Lpm0;->b:Lpm0$a;

    invoke-virtual {p2}, Lpm0$a;->g()J

    move-result-wide p2

    :cond_2
    invoke-static {}, LQt0;->O()Z

    move-result p6

    if-eqz p6, :cond_3

    const/4 p6, -0x1

    const-string v1, "androidx.compose.material.ripple.rememberRipple (Ripple.kt:76)"

    invoke-static {v0, p5, p6, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_3
    invoke-static {p2, p3}, Lpm0;->i(J)Lpm0;

    move-result-object p2

    shr-int/lit8 p3, p5, 0x6

    and-int/lit8 p3, p3, 0xe

    invoke-static {p2, p4, p3}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p2

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-static {p1}, Lk61;->d(F)Lk61;

    move-result-object p5

    const p6, 0x1e7b2b64

    invoke-interface {p4, p6}, LEt0;->F(I)V

    invoke-interface {p4, p3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p4, p5}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p3, p5

    invoke-interface {p4}, LEt0;->G()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_4

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p5, p3, :cond_5

    :cond_4
    new-instance p5, LbW3;

    const/4 p3, 0x0

    invoke-direct {p5, p0, p1, p2, p3}, LbW3;-><init>(ZFLsP5;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p4, p5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p4}, LEt0;->Q()V

    check-cast p5, LbW3;

    invoke-static {}, LQt0;->O()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    invoke-interface {p4}, LEt0;->Q()V

    return-object p5
.end method
