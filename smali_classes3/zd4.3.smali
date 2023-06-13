.class public final Lzd4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lyd4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lc00;",
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
            "Lc00;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd4;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lzd4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lc00;",
            ">;)",
            "Lzd4;"
        }
    .end annotation

    new-instance v0, Lzd4;

    invoke-direct {v0, p0}, Lzd4;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lc00;)Lyd4;
    .locals 1

    new-instance v0, Lyd4;

    invoke-direct {v0, p0}, Lyd4;-><init>(Lc00;)V

    return-object v0
.end method


# virtual methods
.method public b()Lyd4;
    .locals 1

    iget-object v0, p0, Lzd4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc00;

    invoke-static {v0}, Lzd4;->c(Lc00;)Lyd4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzd4;->b()Lyd4;

    move-result-object v0

    return-object v0
.end method
