.class public final LmK6;
.super LiK6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LiK6<",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:LuK6;


# direct methods
.method public constructor <init>(LuK6;LaO6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LaO6<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, LmK6;->c:LuK6;

    invoke-direct {p0, p1, p2}, LiK6;-><init>(LuK6;LaO6;)V

    return-void
.end method


# virtual methods
.method public final T4(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/os/Bundle;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, LiK6;->T4(Ljava/util/List;)V

    iget-object v0, p0, LmK6;->c:LuK6;

    invoke-static {v0, p1}, LuK6;->u(LuK6;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LiK6;->a:LaO6;

    invoke-virtual {v0, p1}, LaO6;->e(Ljava/lang/Object;)V

    return-void
.end method
