.class public final LGG$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LGG;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public c:LX06;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, LGG;->e(Ljava/util/Locale;)Z

    move-result v0

    invoke-virtual {p0, v0}, LGG$a;->c(Z)V

    return-void
.end method

.method public static b(Z)LGG;
    .locals 0

    if-eqz p0, :cond_0

    sget-object p0, LGG;->h:LGG;

    goto :goto_0

    :cond_0
    sget-object p0, LGG;->g:LGG;

    :goto_0
    return-object p0
.end method


# virtual methods
.method public a()LGG;
    .locals 4

    iget v0, p0, LGG$a;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LGG$a;->c:LX06;

    sget-object v1, LGG;->d:LX06;

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, LGG$a;->a:Z

    invoke-static {v0}, LGG$a;->b(Z)LGG;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, LGG;

    iget-boolean v1, p0, LGG$a;->a:Z

    iget v2, p0, LGG$a;->b:I

    iget-object v3, p0, LGG$a;->c:LX06;

    invoke-direct {v0, v1, v2, v3}, LGG;-><init>(ZILX06;)V

    return-object v0
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, LGG$a;->a:Z

    sget-object p1, LGG;->d:LX06;

    iput-object p1, p0, LGG$a;->c:LX06;

    const/4 p1, 0x2

    iput p1, p0, LGG$a;->b:I

    return-void
.end method
