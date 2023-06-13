.class public final Lf4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf4$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Le4;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lf4;
    .locals 1

    invoke-static {}, Lf4$a;->a()Lf4;

    move-result-object v0

    return-object v0
.end method

.method public static c()Le4;
    .locals 1

    new-instance v0, Le4;

    invoke-direct {v0}, Le4;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Le4;
    .locals 1

    invoke-static {}, Lf4;->c()Le4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf4;->b()Le4;

    move-result-object v0

    return-object v0
.end method
