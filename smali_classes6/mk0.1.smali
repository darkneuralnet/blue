.class public final Lmk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmk0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lio/reactivex/E;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lmk0;
    .locals 1

    invoke-static {}, Lmk0$a;->a()Lmk0;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lio/reactivex/E;
    .locals 1

    invoke-static {}, Lgk0$c;->f()Lio/reactivex/E;

    move-result-object v0

    invoke-static {v0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/E;

    return-object v0
.end method


# virtual methods
.method public b()Lio/reactivex/E;
    .locals 1

    invoke-static {}, Lmk0;->c()Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmk0;->b()Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method
