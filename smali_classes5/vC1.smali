.class public LvC1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LtM4;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LtM4<",
        "LuC1;",
        "[B>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LVL4;Lsy3;)LVL4;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVL4<",
            "LuC1;",
            ">;",
            "Lsy3;",
            ")",
            "LVL4<",
            "[B>;"
        }
    .end annotation

    invoke-interface {p1}, LVL4;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LuC1;

    invoke-virtual {p1}, LuC1;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance p2, LU70;

    invoke-static {p1}, LE70;->e(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    invoke-direct {p2, p1}, LU70;-><init>([B)V

    return-object p2
.end method
