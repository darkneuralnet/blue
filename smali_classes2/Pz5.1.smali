.class public final LPz5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOz5;


# instance fields
.field public final a:LQz5;


# direct methods
.method public constructor <init>(LQz5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPz5;->a:LQz5;

    return-void
.end method

.method public static b(LQz5;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQz5;",
            ")",
            "LY94<",
            "LOz5;",
            ">;"
        }
    .end annotation

    new-instance v0, LPz5;

    invoke-direct {v0, p0}, LPz5;-><init>(LQz5;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/core/mvp/BaseActivity;)LNz5;
    .locals 1

    iget-object v0, p0, LPz5;->a:LQz5;

    invoke-virtual {v0, p1}, LQz5;->b(Lco/bird/android/core/mvp/BaseActivity;)LNz5;

    move-result-object p1

    return-object p1
.end method
