.class public final LXu3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LXu3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LWu3;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LXu3;
    .locals 1

    invoke-static {}, LXu3$a;->a()LXu3;

    move-result-object v0

    return-object v0
.end method

.method public static c()LWu3;
    .locals 1

    new-instance v0, LWu3;

    invoke-direct {v0}, LWu3;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b()LWu3;
    .locals 1

    invoke-static {}, LXu3;->c()LWu3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LXu3;->b()LWu3;

    move-result-object v0

    return-object v0
.end method
