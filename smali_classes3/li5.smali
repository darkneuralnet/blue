.class public final Lli5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lki5;",
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


# direct methods
.method public constructor <init>(LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Le13;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli5;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lli5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Le13;",
            ">;)",
            "Lli5;"
        }
    .end annotation

    new-instance v0, Lli5;

    invoke-direct {v0, p0}, Lli5;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Le13;)Lki5;
    .locals 1

    new-instance v0, Lki5;

    invoke-direct {v0, p0}, Lki5;-><init>(Le13;)V

    return-object v0
.end method


# virtual methods
.method public b()Lki5;
    .locals 1

    iget-object v0, p0, Lli5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le13;

    invoke-static {v0}, Lli5;->c(Le13;)Lki5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lli5;->b()Lki5;

    move-result-object v0

    return-object v0
.end method
