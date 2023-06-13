.class public Lp70$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXU2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp70;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LXU2<",
        "[B",
        "Ljava/nio/ByteBuffer;",
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
.method public b(LQW2;)LWU2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQW2;",
            ")",
            "LWU2<",
            "[B",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation

    new-instance p1, Lp70;

    new-instance v0, Lp70$a$a;

    invoke-direct {v0, p0}, Lp70$a$a;-><init>(Lp70$a;)V

    invoke-direct {p1, v0}, Lp70;-><init>(Lp70$b;)V

    return-object p1
.end method
