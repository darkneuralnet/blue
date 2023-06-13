.class public abstract LYo2;
.super LxU;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E::",
        "LyU;",
        ">",
        "LxU;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public k:LyU;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, LxU;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public L(LyU;)V
    .locals 0

    invoke-super {p0, p1}, LxU;->L(LyU;)V

    iput-object p1, p0, LYo2;->k:LyU;

    return-void
.end method
