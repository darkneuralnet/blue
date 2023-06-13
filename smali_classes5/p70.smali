.class public Lp70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp70$d;,
        Lp70$a;,
        Lp70$c;,
        Lp70$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LWU2<",
        "[BTData;>;"
    }
.end annotation


# instance fields
.field public final a:Lp70$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp70$b<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lp70$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp70$b<",
            "TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp70;->a:Lp70$b;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lp70;->d([B)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILsy3;)LWU2$a;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1, p2, p3, p4}, Lp70;->c([BIILsy3;)LWU2$a;

    move-result-object p1

    return-object p1
.end method

.method public c([BIILsy3;)LWU2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BII",
            "Lsy3;",
            ")",
            "LWU2$a<",
            "TData;>;"
        }
    .end annotation

    new-instance p2, LWU2$a;

    new-instance p3, LQd3;

    invoke-direct {p3, p1}, LQd3;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lp70$c;

    iget-object v0, p0, Lp70;->a:Lp70$b;

    invoke-direct {p4, p1, v0}, Lp70$c;-><init>([BLp70$b;)V

    invoke-direct {p2, p3, p4}, LWU2$a;-><init>(Lak2;LIS0;)V

    return-object p2
.end method

.method public d([B)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
