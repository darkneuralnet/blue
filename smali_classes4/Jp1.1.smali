.class public final LJp1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LIp1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lhq1;",
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
            "Lhq1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJp1;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LJp1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lhq1;",
            ">;)",
            "LJp1;"
        }
    .end annotation

    new-instance v0, LJp1;

    invoke-direct {v0, p0}, LJp1;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Lhq1;)LIp1;
    .locals 1

    new-instance v0, LIp1;

    invoke-direct {v0, p0}, LIp1;-><init>(Lhq1;)V

    return-object v0
.end method


# virtual methods
.method public b()LIp1;
    .locals 1

    iget-object v0, p0, LJp1;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhq1;

    invoke-static {v0}, LJp1;->c(Lhq1;)LIp1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJp1;->b()LIp1;

    move-result-object v0

    return-object v0
.end method
