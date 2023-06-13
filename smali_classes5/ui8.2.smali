.class public final Lui8;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p0, Lfi8;

    check-cast p1, Lfi8;

    invoke-virtual {p1}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lfi8;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lfi8;->e()Lfi8;

    move-result-object p0

    :cond_0
    invoke-virtual {p0, p1}, Lfi8;->g(Lfi8;)V

    :cond_1
    return-object p0
.end method
