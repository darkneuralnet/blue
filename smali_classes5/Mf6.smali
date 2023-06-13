.class public LMf6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMf6$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LWU2<",
        "Ljava/net/URL;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LWU2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWU2<",
            "LOC1;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LWU2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWU2<",
            "LOC1;",
            "Ljava/io/InputStream;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMf6;->a:LWU2;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1}, LMf6;->d(Ljava/net/URL;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILsy3;)LWU2$a;
    .locals 0

    check-cast p1, Ljava/net/URL;

    invoke-virtual {p0, p1, p2, p3, p4}, LMf6;->c(Ljava/net/URL;IILsy3;)LWU2$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/net/URL;IILsy3;)LWU2$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "II",
            "Lsy3;",
            ")",
            "LWU2$a<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LMf6;->a:LWU2;

    new-instance v1, LOC1;

    invoke-direct {v1, p1}, LOC1;-><init>(Ljava/net/URL;)V

    invoke-interface {v0, v1, p2, p3, p4}, LWU2;->b(Ljava/lang/Object;IILsy3;)LWU2$a;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/net/URL;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
