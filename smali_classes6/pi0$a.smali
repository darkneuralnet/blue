.class public Lpi0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGM2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpi0;->e(LGM2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGM2$a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lpi0;


# direct methods
.method public constructor <init>(Lpi0;)V
    .locals 0

    iput-object p1, p0, Lpi0$a;->a:Lpi0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, LGM2;

    invoke-virtual {p0, p1, p2}, Lpi0$a;->b(LGM2;Z)V

    return-void
.end method

.method public b(LGM2;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    iget-object p2, p0, Lpi0$a;->a:Lpi0;

    invoke-static {p2, p1}, Lpi0;->a(Lpi0;LGM2;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lpi0$a;->a:Lpi0;

    invoke-static {p2}, Lpi0;->b(Lpi0;)Z

    move-result v0

    invoke-static {p2, p1, v0}, Lpi0;->c(Lpi0;LGM2;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    iget-object p1, p0, Lpi0$a;->a:Lpi0;

    invoke-static {p1}, Lpi0;->d(Lpi0;)V

    :cond_1
    return-void
.end method
