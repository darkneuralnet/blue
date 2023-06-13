.class public final Lcb6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcb6$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lbb6;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcb6;
    .locals 1

    invoke-static {}, Lcb6$a;->a()Lcb6;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lbb6;
    .locals 1

    new-instance v0, Lbb6;

    invoke-direct {v0}, Lbb6;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()Lbb6;
    .locals 1

    invoke-static {}, Lcb6;->c()Lbb6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcb6;->b()Lbb6;

    move-result-object v0

    return-object v0
.end method
