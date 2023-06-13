.class public final Liu9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvp9<",
            "Ljava/lang/Integer;",
            "Lnh9;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    sget-object v0, LRs9;->h:LRs9;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, LRs9;->o:LRs9;

    sget-object v3, Lnh9;->c:Lnh9;

    invoke-static {v0, v1, v2, v3}, Lvp9;->d(LRs9;Ljava/lang/Object;LRs9;Ljava/lang/Object;)Lvp9;

    move-result-object v0

    sput-object v0, Liu9;->a:Lvp9;

    return-void
.end method
