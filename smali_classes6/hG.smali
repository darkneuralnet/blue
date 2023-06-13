.class public abstract LhG;
.super Lfj2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lfj2<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static c:Lfj2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj2<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LhG$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LhG$a;-><init>(Lej2;)V

    sput-object v0, LhG;->c:Lfj2;

    return-void
.end method
