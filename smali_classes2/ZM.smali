.class public final LZM;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LWM;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRM;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LWl3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Llh6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LMc2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LRM;",
            ">;",
            "LY94<",
            "LWl3;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LMc2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZM;->a:LY94;

    iput-object p2, p0, LZM;->b:LY94;

    iput-object p3, p0, LZM;->c:LY94;

    iput-object p4, p0, LZM;->d:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;)LZM;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LRM;",
            ">;",
            "LY94<",
            "LWl3;",
            ">;",
            "LY94<",
            "Llh6;",
            ">;",
            "LY94<",
            "LMc2;",
            ">;)",
            "LZM;"
        }
    .end annotation

    new-instance v0, LZM;

    invoke-direct {v0, p0, p1, p2, p3}, LZM;-><init>(LY94;LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LRM;LWl3;Llh6;LMc2;)LWM;
    .locals 1

    new-instance v0, LWM;

    invoke-direct {v0, p0, p1, p2, p3}, LWM;-><init>(LRM;LWl3;Llh6;LMc2;)V

    return-object v0
.end method


# virtual methods
.method public b()LWM;
    .locals 4

    iget-object v0, p0, LZM;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRM;

    iget-object v1, p0, LZM;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWl3;

    iget-object v2, p0, LZM;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llh6;

    iget-object v3, p0, LZM;->d:LY94;

    invoke-interface {v3}, LY94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LMc2;

    invoke-static {v0, v1, v2, v3}, LZM;->c(LRM;LWl3;Llh6;LMc2;)LWM;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZM;->b()LWM;

    move-result-object v0

    return-object v0
.end method
