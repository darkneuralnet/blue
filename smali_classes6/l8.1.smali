.class public Ll8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LGk5;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LGk5;

    invoke-direct {v0}, LGk5;-><init>()V

    iput-object v0, p0, Ll8;->a:LGk5;

    return-void
.end method


# virtual methods
.method public a([B)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll8;->a:LGk5;

    invoke-virtual {v0, p1}, LGk5;->b([B)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
