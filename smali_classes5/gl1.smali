.class public Lgl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LbM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LbM4<",
        "Ljava/io/File;",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lsy3;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2}, Lgl1;->d(Ljava/io/File;Lsy3;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILsy3;)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1, p2, p3, p4}, Lgl1;->c(Ljava/io/File;IILsy3;)LVL4;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/io/File;IILsy3;)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "II",
            "Lsy3;",
            ")",
            "LVL4<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    new-instance p2, Lrl1;

    invoke-direct {p2, p1}, Lrl1;-><init>(Ljava/io/File;)V

    return-object p2
.end method

.method public d(Ljava/io/File;Lsy3;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
