.class public final Lup1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ltp1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LEa;",
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
            "LEa;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup1;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lup1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;)",
            "Lup1;"
        }
    .end annotation

    new-instance v0, Lup1;

    invoke-direct {v0, p0}, Lup1;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LEa;)Ltp1;
    .locals 1

    new-instance v0, Ltp1;

    invoke-direct {v0, p0}, Ltp1;-><init>(LEa;)V

    return-object v0
.end method


# virtual methods
.method public b()Ltp1;
    .locals 1

    iget-object v0, p0, Lup1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {v0}, Lup1;->c(LEa;)Ltp1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lup1;->b()Ltp1;

    move-result-object v0

    return-object v0
.end method
