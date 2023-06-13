.class public final LCt9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvp9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvp9<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, LRs9;->l:LRs9;

    const-string v1, ""

    invoke-static {v0, v1, v0, v1}, Lvp9;->d(LRs9;Ljava/lang/Object;LRs9;Ljava/lang/Object;)Lvp9;

    move-result-object v0

    sput-object v0, LCt9;->a:Lvp9;

    return-void
.end method
