.class public final LKm0$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKm0$a;->a(LBm0;)Lwb6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Luf;",
        "Lpm0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Luf;",
        "it",
        "Lpm0;",
        "a",
        "(Luf;)J"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LBm0;


# direct methods
.method public constructor <init>(LBm0;)V
    .locals 0

    iput-object p1, p0, LKm0$a$b;->g:LBm0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Luf;)J
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Luf;->g()F

    move-result v0

    float-to-double v0, v0

    const/high16 v2, 0x40400000    # 3.0f

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float v0, v0

    invoke-virtual {p1}, Luf;->h()F

    move-result v1

    float-to-double v4, v1

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v4

    double-to-float v1, v4

    invoke-virtual {p1}, Luf;->i()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-float v2, v2

    const/4 v3, 0x0

    invoke-static {}, LKm0;->a()[F

    move-result-object v4

    invoke-static {v3, v0, v1, v2, v4}, LKm0;->c(IFFF[F)F

    move-result v3

    const/4 v4, 0x1

    invoke-static {}, LKm0;->a()[F

    move-result-object v5

    invoke-static {v4, v0, v1, v2, v5}, LKm0;->c(IFFF[F)F

    move-result v4

    const/4 v5, 0x2

    invoke-static {}, LKm0;->a()[F

    move-result-object v6

    invoke-static {v5, v0, v1, v2, v6}, LKm0;->c(IFFF[F)F

    move-result v0

    invoke-virtual {p1}, Luf;->f()F

    move-result p1

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {p1, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p1

    const/high16 v1, -0x40000000    # -2.0f

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v3, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v3

    invoke-static {v4, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v4

    invoke-static {v0, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    sget-object v1, LFm0;->a:LFm0;

    invoke-virtual {v1}, LFm0;->k()LBm0;

    move-result-object v1

    invoke-static {v3, v4, v0, p1, v1}, Lvm0;->a(FFFFLBm0;)J

    move-result-wide v0

    iget-object p1, p0, LKm0$a$b;->g:LBm0;

    invoke-static {v0, v1, p1}, Lpm0;->k(JLBm0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Luf;

    invoke-virtual {p0, p1}, LKm0$a$b;->a(Luf;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lpm0;->i(J)Lpm0;

    move-result-object p1

    return-object p1
.end method
