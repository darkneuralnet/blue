.class public final LGa6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LFa6;",
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

    iput-object p1, p0, LGa6;->a:LY94;

    return-void
.end method

.method public static a(LY94;)LGa6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LGa6;"
        }
    .end annotation

    new-instance v0, LGa6;

    invoke-direct {v0, p0}, LGa6;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)LFa6;
    .locals 1

    new-instance v0, LFa6;

    invoke-direct {v0, p0}, LFa6;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()LFa6;
    .locals 1

    iget-object v0, p0, LGa6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LGa6;->c(Landroid/content/Context;)LFa6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LGa6;->b()LFa6;

    move-result-object v0

    return-object v0
.end method
