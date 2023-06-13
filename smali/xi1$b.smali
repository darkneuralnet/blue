.class public Lxi1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYv1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxi1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYv1$b<",
        "LLN5<",
        "Lp2;",
        ">;",
        "Lp2;",
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
.method public bridge synthetic a(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLN5;

    invoke-virtual {p0, p1, p2}, Lxi1$b;->c(LLN5;I)Lp2;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LLN5;

    invoke-virtual {p0, p1}, Lxi1$b;->d(LLN5;)I

    move-result p1

    return p1
.end method

.method public c(LLN5;I)Lp2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLN5<",
            "Lp2;",
            ">;I)",
            "Lp2;"
        }
    .end annotation

    invoke-virtual {p1, p2}, LLN5;->t(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp2;

    return-object p1
.end method

.method public d(LLN5;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLN5<",
            "Lp2;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, LLN5;->size()I

    move-result p1

    return p1
.end method
