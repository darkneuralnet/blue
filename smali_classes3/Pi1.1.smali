.class public final LPi1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LOi1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Le13;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
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
            "Le13;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPi1;->a:LY94;

    iput-object p2, p0, LPi1;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LPi1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LPi1;"
        }
    .end annotation

    new-instance v0, LPi1;

    invoke-direct {v0, p0, p1}, LPi1;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Le13;Landroid/content/Context;)LOi1;
    .locals 1

    new-instance v0, LOi1;

    invoke-direct {v0, p0, p1}, LOi1;-><init>(Le13;Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()LOi1;
    .locals 2

    iget-object v0, p0, LPi1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    iget-object v1, p0, LPi1;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, LPi1;->c(Le13;Landroid/content/Context;)LOi1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LPi1;->b()LOi1;

    move-result-object v0

    return-object v0
.end method
