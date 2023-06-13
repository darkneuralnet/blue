.class public Lb80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LhY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhY3<",
            "Lxo;",
            ">;"
        }
    .end annotation
.end field

.field public b:LhY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhY3<",
            "Lxo;",
            ">;"
        }
    .end annotation
.end field

.field public c:LhY3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LhY3<",
            "LrN5;",
            ">;"
        }
    .end annotation
.end field

.field public d:[LrN5;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LjY3;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, LjY3;-><init>(I)V

    iput-object v0, p0, Lb80;->a:LhY3;

    new-instance v0, LjY3;

    invoke-direct {v0, v1}, LjY3;-><init>(I)V

    iput-object v0, p0, Lb80;->b:LhY3;

    new-instance v0, LjY3;

    invoke-direct {v0, v1}, LjY3;-><init>(I)V

    iput-object v0, p0, Lb80;->c:LhY3;

    const/16 v0, 0x20

    new-array v0, v0, [LrN5;

    iput-object v0, p0, Lb80;->d:[LrN5;

    return-void
.end method
