.class public LzB5$c;
.super LnB;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LzB5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LnB<",
        "LzB5$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LnB;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()LaY3;
    .locals 1

    invoke-virtual {p0}, LzB5$c;->d()LzB5$b;

    move-result-object v0

    return-object v0
.end method

.method public d()LzB5$b;
    .locals 1

    new-instance v0, LzB5$b;

    invoke-direct {v0, p0}, LzB5$b;-><init>(LzB5$c;)V

    return-object v0
.end method

.method public e(ILandroid/graphics/Bitmap$Config;)LzB5$b;
    .locals 1

    invoke-virtual {p0}, LnB;->b()LaY3;

    move-result-object v0

    check-cast v0, LzB5$b;

    invoke-virtual {v0, p1, p2}, LzB5$b;->b(ILandroid/graphics/Bitmap$Config;)V

    return-object v0
.end method
