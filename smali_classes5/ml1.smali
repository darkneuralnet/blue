.class public Lml1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LWU2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lml1$b;,
        Lml1$e;,
        Lml1$a;,
        Lml1$c;,
        Lml1$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Data:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LWU2<",
        "Ljava/io/File;",
        "TData;>;"
    }
.end annotation


# instance fields
.field public final a:Lml1$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lml1$d<",
            "TData;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lml1$d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lml1$d<",
            "TData;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lml1;->a:Lml1$d;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lml1;->d(Ljava/io/File;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILsy3;)LWU2$a;
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3, p4}, Lml1;->c(Ljava/io/File;IILsy3;)LWU2$a;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/io/File;IILsy3;)LWU2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "II",
            "Lsy3;",
            ")",
            "LWU2$a<",
            "TData;>;"
        }
    .end annotation

    new-instance p2, LWU2$a;

    new-instance p3, LQd3;

    invoke-direct {p3, p1}, LQd3;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lml1$c;

    iget-object v0, p0, Lml1;->a:Lml1$d;

    invoke-direct {p4, p1, v0}, Lml1$c;-><init>(Ljava/io/File;Lml1$d;)V

    invoke-direct {p2, p3, p4}, LWU2$a;-><init>(Lak2;LIS0;)V

    return-object p2
.end method

.method public d(Ljava/io/File;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
