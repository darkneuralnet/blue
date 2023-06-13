.class public final Lv83;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lu83;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LsP2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LB95;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LsP2;",
            ">;",
            "LY94<",
            "LB95;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv83;->a:LY94;

    iput-object p2, p0, Lv83;->b:LY94;

    iput-object p3, p0, Lv83;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)Lv83;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LsP2;",
            ">;",
            "LY94<",
            "LB95;",
            ">;",
            "LY94<",
            "LEa;",
            ">;)",
            "Lv83;"
        }
    .end annotation

    new-instance v0, Lv83;

    invoke-direct {v0, p0, p1, p2}, Lv83;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LsP2;LB95;LEa;)Lu83;
    .locals 1

    new-instance v0, Lu83;

    invoke-direct {v0, p0, p1, p2}, Lu83;-><init>(LsP2;LB95;LEa;)V

    return-object v0
.end method


# virtual methods
.method public b()Lu83;
    .locals 3

    iget-object v0, p0, Lv83;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LsP2;

    iget-object v1, p0, Lv83;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB95;

    iget-object v2, p0, Lv83;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEa;

    invoke-static {v0, v1, v2}, Lv83;->c(LsP2;LB95;LEa;)Lu83;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lv83;->b()Lu83;

    move-result-object v0

    return-object v0
.end method
