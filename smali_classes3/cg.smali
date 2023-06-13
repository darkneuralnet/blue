.class public final Lcg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lbg;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
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
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcg;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lcg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "Lcg;"
        }
    .end annotation

    new-instance v0, Lcg;

    invoke-direct {v0, p0}, Lcg;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lbg;
    .locals 1

    new-instance v0, Lbg;

    invoke-direct {v0, p0}, Lbg;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()Lbg;
    .locals 1

    iget-object v0, p0, Lcg;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcg;->c(Landroid/content/Context;)Lbg;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcg;->b()Lbg;

    move-result-object v0

    return-object v0
.end method
