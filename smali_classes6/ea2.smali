.class public final Lea2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lea2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lda2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lea2;
    .locals 1

    invoke-static {}, Lea2$a;->a()Lea2;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lda2;
    .locals 1

    new-instance v0, Lda2;

    invoke-direct {v0}, Lda2;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lda2;
    .locals 1

    invoke-static {}, Lea2;->c()Lda2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lea2;->b()Lda2;

    move-result-object v0

    return-object v0
.end method
