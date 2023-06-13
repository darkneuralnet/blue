.class public final LoK2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LnK2;",
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
            "LaM;",
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
            "LaM;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoK2;->a:LY94;

    iput-object p2, p0, LoK2;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LoK2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Le13;",
            ">;",
            "LY94<",
            "LaM;",
            ">;)",
            "LoK2;"
        }
    .end annotation

    new-instance v0, LoK2;

    invoke-direct {v0, p0, p1}, LoK2;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Le13;LaM;)LnK2;
    .locals 1

    new-instance v0, LnK2;

    invoke-direct {v0, p0, p1}, LnK2;-><init>(Le13;LaM;)V

    return-object v0
.end method


# virtual methods
.method public b()LnK2;
    .locals 2

    iget-object v0, p0, LoK2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    iget-object v1, p0, LoK2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LaM;

    invoke-static {v0, v1}, LoK2;->c(Le13;LaM;)LnK2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LoK2;->b()LnK2;

    move-result-object v0

    return-object v0
.end method
