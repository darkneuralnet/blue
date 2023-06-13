.class public final Lf8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Le8;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LO11;",
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
            "LO11;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf8;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lf8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LO11;",
            ">;)",
            "Lf8;"
        }
    .end annotation

    new-instance v0, Lf8;

    invoke-direct {v0, p0}, Lf8;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LO11;)Le8;
    .locals 1

    new-instance v0, Le8;

    invoke-direct {v0, p0}, Le8;-><init>(LO11;)V

    return-object v0
.end method


# virtual methods
.method public b()Le8;
    .locals 1

    iget-object v0, p0, Lf8;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO11;

    invoke-static {v0}, Lf8;->c(LO11;)Le8;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf8;->b()Le8;

    move-result-object v0

    return-object v0
.end method
