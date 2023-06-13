.class public final LF96$e$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF96$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lkotlin/Unit;",
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
.field public final synthetic g:LF96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF96<",
            "TS;>;"
        }
    .end annotation
.end field

.field public final synthetic h:F


# direct methods
.method public constructor <init>(LF96;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF96<",
            "TS;>;F)V"
        }
    .end annotation

    iput-object p1, p0, LF96$e$a;->g:LF96;

    iput p2, p0, LF96$e$a;->h:F

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-object v0, p0, LF96$e$a;->g:LF96;

    invoke-virtual {v0}, LF96;->q()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LF96$e$a;->g:LF96;

    const-wide/16 v1, 0x1

    div-long/2addr p1, v1

    iget v1, p0, LF96$e$a;->h:F

    invoke-virtual {v0, p1, p2, v1}, LF96;->s(JF)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LF96$e$a;->a(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
