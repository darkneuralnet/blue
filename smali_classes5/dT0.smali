.class public final LdT0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LdT0$c;,
        LdT0$b;,
        LdT0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        "Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LWU2<",
        "TModel;TData;>;"
    }
.end annotation


# instance fields
.field public final a:LdT0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LdT0$a<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LdT0$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LdT0$a<",
            "TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdT0;->a:LdT0$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "data:image"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;IILsy3;)LWU2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;II",
            "Lsy3;",
            ")",
            "LWU2$a<",
            "TData;>;"
        }
    .end annotation

    new-instance p2, LWU2$a;

    new-instance p3, LQd3;

    invoke-direct {p3, p1}, LQd3;-><init>(Ljava/lang/Object;)V

    new-instance p4, LdT0$b;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LdT0;->a:LdT0$a;

    invoke-direct {p4, p1, v0}, LdT0$b;-><init>(Ljava/lang/String;LdT0$a;)V

    invoke-direct {p2, p3, p4}, LWU2$a;-><init>(Lak2;LIS0;)V

    return-object p2
.end method
