.class public final LSO4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSO4;-><init>(Ljava/lang/String;[FLNA6;[FLX51;LX51;FFLj96;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Double;",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0006\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "",
        "x",
        "a",
        "(D)Ljava/lang/Double;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LSO4;


# direct methods
.method public constructor <init>(LSO4;)V
    .locals 0

    iput-object p1, p0, LSO4$c;->g:LSO4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(D)Ljava/lang/Double;
    .locals 7

    iget-object v0, p0, LSO4$c;->g:LSO4;

    invoke-virtual {v0}, LSO4;->L()LX51;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LX51;->a(D)D

    move-result-wide v1

    iget-object p1, p0, LSO4$c;->g:LSO4;

    invoke-static {p1}, LSO4;->F(LSO4;)F

    move-result p1

    float-to-double v3, p1

    iget-object p1, p0, LSO4$c;->g:LSO4;

    invoke-static {p1}, LSO4;->E(LSO4;)F

    move-result p1

    float-to-double v5, p1

    invoke-static/range {v1 .. v6}, Lkotlin/ranges/RangesKt;->coerceIn(DDD)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LSO4$c;->a(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
