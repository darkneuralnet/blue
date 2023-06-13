.class public final Lng;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lmg;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lpg;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Leg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lpg;",
            ">;",
            "LY94<",
            "Leg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lng;->a:LY94;

    iput-object p2, p0, Lng;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lng;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lpg;",
            ">;",
            "LY94<",
            "Leg;",
            ">;)",
            "Lng;"
        }
    .end annotation

    new-instance v0, Lng;

    invoke-direct {v0, p0, p1}, Lng;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lpg;Leg;)Lmg;
    .locals 1

    new-instance v0, Lmg;

    invoke-direct {v0, p0, p1}, Lmg;-><init>(Lpg;Leg;)V

    return-object v0
.end method


# virtual methods
.method public b()Lmg;
    .locals 2

    iget-object v0, p0, Lng;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg;

    iget-object v1, p0, Lng;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leg;

    invoke-static {v0, v1}, Lng;->c(Lpg;Leg;)Lmg;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lng;->b()Lmg;

    move-result-object v0

    return-object v0
.end method
