.class public final Lcu5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcu5$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lfx1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcu5;
    .locals 1

    invoke-static {}, Lcu5$a;->a()Lcu5;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lfx1;
    .locals 1

    invoke-static {}, Lau5;->b()Lfx1;

    move-result-object v0

    invoke-static {v0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfx1;

    return-object v0
.end method


# virtual methods
.method public b()Lfx1;
    .locals 1

    invoke-static {}, Lcu5;->c()Lfx1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcu5;->b()Lfx1;

    move-result-object v0

    return-object v0
.end method
