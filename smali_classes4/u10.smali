.class public final Lu10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lt10;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lj10;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ll10;",
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
            "Lj10;",
            ">;",
            "LY94<",
            "Ll10;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu10;->a:LY94;

    iput-object p2, p0, Lu10;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)Lu10;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lj10;",
            ">;",
            "LY94<",
            "Ll10;",
            ">;)",
            "Lu10;"
        }
    .end annotation

    new-instance v0, Lu10;

    invoke-direct {v0, p0, p1}, Lu10;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lj10;Ll10;)Lt10;
    .locals 1

    new-instance v0, Lt10;

    invoke-direct {v0, p0, p1}, Lt10;-><init>(Lj10;Ll10;)V

    return-object v0
.end method


# virtual methods
.method public b()Lt10;
    .locals 2

    iget-object v0, p0, Lu10;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj10;

    iget-object v1, p0, Lu10;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll10;

    invoke-static {v0, v1}, Lu10;->c(Lj10;Ll10;)Lt10;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lu10;->b()Lt10;

    move-result-object v0

    return-object v0
.end method
