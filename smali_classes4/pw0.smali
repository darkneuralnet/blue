.class public final Lpw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Low0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LGw0;",
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
            "LGw0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpw0;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Lpw0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LGw0;",
            ">;)",
            "Lpw0;"
        }
    .end annotation

    new-instance v0, Lpw0;

    invoke-direct {v0, p0}, Lpw0;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LGw0;)Low0;
    .locals 1

    new-instance v0, Low0;

    invoke-direct {v0, p0}, Low0;-><init>(LGw0;)V

    return-object v0
.end method


# virtual methods
.method public b()Low0;
    .locals 1

    iget-object v0, p0, Lpw0;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGw0;

    invoke-static {v0}, Lpw0;->c(LGw0;)Low0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpw0;->b()Low0;

    move-result-object v0

    return-object v0
.end method
