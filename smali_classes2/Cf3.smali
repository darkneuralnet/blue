.class public final LCf3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBf3;


# instance fields
.field public final a:LDf3;


# direct methods
.method public constructor <init>(LDf3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCf3;->a:LDf3;

    return-void
.end method

.method public static b(LDf3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LDf3;",
            ")",
            "LY94<",
            "LBf3;",
            ">;"
        }
    .end annotation

    new-instance v0, LCf3;

    invoke-direct {v0, p0}, LCf3;-><init>(LDf3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;LZf3;)LAf3;
    .locals 1

    iget-object v0, p0, LCf3;->a:LDf3;

    invoke-virtual {v0, p1, p2}, LDf3;->b(Lco/bird/android/core/mvp/BaseActivity;LZf3;)LAf3;

    move-result-object p1

    return-object p1
.end method
