.class public final Ljd4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lid4;",
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

    iput-object p1, p0, Ljd4;->a:LY94;

    return-void
.end method

.method public static a(LY94;)Ljd4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LEa;",
            ">;)",
            "Ljd4;"
        }
    .end annotation

    new-instance v0, Ljd4;

    invoke-direct {v0, p0}, Ljd4;-><init>(LY94;)V

    return-object v0
.end method

.method public static c(LEa;)Lid4;
    .locals 1

    new-instance v0, Lid4;

    invoke-direct {v0, p0}, Lid4;-><init>(LEa;)V

    return-object v0
.end method


# virtual methods
.method public b()Lid4;
    .locals 1

    iget-object v0, p0, Ljd4;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LEa;

    invoke-static {v0}, Ljd4;->c(LEa;)Lid4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ljd4;->b()Lid4;

    move-result-object v0

    return-object v0
.end method
