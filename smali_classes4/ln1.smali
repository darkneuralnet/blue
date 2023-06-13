.class public final Lln1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LKm1;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljn1;


# direct methods
.method public constructor <init>(Ljn1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lln1;->a:Ljn1;

    return-void
.end method

.method public static a(Ljn1;)Lln1;
    .locals 1

    new-instance v0, Lln1;

    invoke-direct {v0, p0}, Lln1;-><init>(Ljn1;)V

    return-object v0
.end method

.method public static b(Ljn1;)LKm1;
    .locals 0

    invoke-virtual {p0}, Ljn1;->b()LKm1;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LKm1;

    return-object p0
.end method


# virtual methods
.method public c()LKm1;
    .locals 1

    iget-object v0, p0, Lln1;->a:Ljn1;

    invoke-static {v0}, Lln1;->b(Ljn1;)LKm1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lln1;->c()LKm1;

    move-result-object v0

    return-object v0
.end method
