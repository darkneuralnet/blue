.class public final LAN1$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAN1;->j(Ljava/net/HttpURLConnection;LpI4;)V
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
    d1 = {
        "\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "writtenBytes",
        "",
        "a",
        "(J)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAN1;

.field public final synthetic h:LpI4;

.field public final synthetic i:Ljava/lang/Long;

.field public final synthetic j:Ljava/net/HttpURLConnection;


# direct methods
.method public constructor <init>(LAN1;LpI4;Ljava/lang/Long;Ljava/net/HttpURLConnection;)V
    .locals 0

    iput-object p1, p0, LAN1$f;->g:LAN1;

    iput-object p2, p0, LAN1$f;->h:LpI4;

    iput-object p3, p0, LAN1$f;->i:Ljava/lang/Long;

    iput-object p4, p0, LAN1$f;->j:Ljava/net/HttpURLConnection;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    iget-object v0, p0, LAN1$f;->h:LpI4;

    invoke-interface {v0}, LpI4;->c()LII4;

    move-result-object v0

    invoke-virtual {v0}, LII4;->h()LH74;

    move-result-object v0

    iget-object v1, p0, LAN1$f;->i:Ljava/lang/Long;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    invoke-virtual {v0, p1, p2, v1, v2}, LH74;->a(JJ)V

    iget-object p1, p0, LAN1$f;->g:LAN1;

    iget-object p2, p0, LAN1$f;->h:LpI4;

    iget-object v0, p0, LAN1$f;->j:Ljava/net/HttpURLConnection;

    invoke-static {p1, p2, v0}, LAN1;->c(LAN1;LpI4;Ljava/net/HttpURLConnection;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LAN1$f;->a(J)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
