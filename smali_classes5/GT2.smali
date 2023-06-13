.class public final LGT2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "LFT2;",
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

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LDE0;",
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
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LDE0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGT2;->a:LY94;

    iput-object p2, p0, LGT2;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LGT2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LDE0;",
            ">;)",
            "LGT2;"
        }
    .end annotation

    new-instance v0, LGT2;

    invoke-direct {v0, p0, p1}, LGT2;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)LFT2;
    .locals 1

    new-instance v0, LFT2;

    check-cast p1, LDE0;

    invoke-direct {v0, p0, p1}, LFT2;-><init>(Landroid/content/Context;LDE0;)V

    return-object v0
.end method


# virtual methods
.method public b()LFT2;
    .locals 2

    iget-object v0, p0, LGT2;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LGT2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LGT2;->c(Landroid/content/Context;Ljava/lang/Object;)LFT2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGT2;->b()LFT2;

    move-result-object v0

    return-object v0
.end method
