.class public final LWg1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LWg1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lrj1<",
        "LRg1;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LWg1;
    .locals 1

    invoke-static {}, LWg1$a;->a()LWg1;

    move-result-object v0

    return-object v0
.end method

.method public static c()LRg1;
    .locals 2

    invoke-static {}, LSg1;->d()LRg1;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, LCZ3;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRg1;

    return-object v0
.end method


# virtual methods
.method public b()LRg1;
    .locals 1

    invoke-static {}, LWg1;->c()LRg1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWg1;->b()LRg1;

    move-result-object v0

    return-object v0
.end method
