.class public final LW08;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvp9<",
            "Ljava/lang/String;",
            "LR28;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    sget-object v0, LRs9;->l:LRs9;

    sget-object v1, LRs9;->n:LRs9;

    invoke-static {}, LR28;->y()LR28;

    move-result-object v2

    const-string v3, ""

    invoke-static {v0, v3, v1, v2}, Lvp9;->d(LRs9;Ljava/lang/Object;LRs9;Ljava/lang/Object;)Lvp9;

    move-result-object v0

    sput-object v0, LW08;->a:Lvp9;

    return-void
.end method
