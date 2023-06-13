.class public final Lzc$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzc$d;->a(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Le80;",
        "LH61;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    iput-wide p1, p0, Lzc$d$a;->g:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Le80;)LH61;
    .locals 8

    const-string v0, "$this$drawWithCache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le80;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LxB5;->i(J)F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {p1, v0}, LLd;->e(Le80;F)LMW1;

    move-result-object v1

    sget-object v2, Lsm0;->b:Lsm0$a;

    iget-wide v3, p0, Lzc$d$a;->g:J

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lsm0$a;->b(Lsm0$a;JIILjava/lang/Object;)Lsm0;

    move-result-object v2

    new-instance v3, Lzc$d$a$a;

    invoke-direct {v3, v0, v1, v2}, Lzc$d$a$a;-><init>(FLMW1;Lsm0;)V

    invoke-virtual {p1, v3}, Le80;->d(Lkotlin/jvm/functions/Function1;)LH61;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le80;

    invoke-virtual {p0, p1}, Lzc$d$a;->a(Le80;)LH61;

    move-result-object p1

    return-object p1
.end method
